package com.bullhornsdk.data.api.helper;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URI;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

import com.google.common.collect.Maps;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.bullhornsdk.data.api.BullhornRestCredentials;
import com.bullhornsdk.data.exception.RestApiException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Splitter;

/**
 * Wraps rest api session management.
 * 
 * @author Yaniv Or-Shahar
 * @author Magnus Fiore Palm
 * 
 */

@JsonIgnoreProperties({"sessionExpired"})
public class RestApiSession {

    private static final String LOGIN_INFO_URL = "https://rest.bullhornstaffing.com/rest-services/loginInfo?username={username}";

	private static final String AUTH_CODE_ACTION = "Login";

	private static final String AUTH_CODE_RESPONSE_TYPE = "code";

	private static final String ACCESS_TOKEN_GRANT_TYPE = "authorization_code";

	private static final String REFRESH_TOKEN_GRANT_TYPE = "refresh_token";

	private static Logger log = LogManager.getLogger(RestApiSession.class);

	private RestTemplate restTemplate;

	private final BullhornRestCredentials restCredentials;

	private AccessTokenInfo accessTokenInfo;

	private String bhRestToken;

	private String restUrl;

	private String version = "*";

	private DateTime dateTimeBhRestTokenWillExpire;

	private static int SESSION_RETRY = 3;

	public final static int MAX_TTL = 2880;

	/**
	 * It is expected that the final members below are not used
	 * (unlike another constructor that takes RestCredentials)
	 */
	public RestApiSession() {
		this.restCredentials = null;
	}

	/**
	 * This factory method is used when deserializing from JSON.
	 * It guarantees that "bullhornRestCredentials" property gets assigned first,
	 * ensuring no NullPointerException when other setters are trying to access it,
	 * e.g. setBhRestToken->updateDateTimeBhRestTokenWillExpire
	 */
	@JsonCreator
	public static RestApiSession create(@JsonProperty("bullhornRestCredentials") BullhornRestCredentials bullhornRestCredentials) {
		return new RestApiSession(bullhornRestCredentials);
	}

	public RestApiSession(BullhornRestCredentials bullhornRestCredentials) {
		this.restCredentials = bullhornRestCredentials;
		this.restTemplate = RestTemplateFactory.getInstance();
		this.dateTimeBhRestTokenWillExpire = getNow();
		createSession();
	}

	/**
	 * Returns the BhRestToken to be used when making rest api calls.
	 * 
	 * Wraps all session management, such as renewal etc.
	 * 
	 * @return
	 * @throws RestApiException
	 */
	public String getBhRestToken() throws RestApiException {
		if (isSessionExpired()) {
			createSession();
		}

		return bhRestToken;
	}

	/**
	 * Refreshes the BhRestToken, expired or not expired, and returns the brand new BhRestToken to be used when making rest api calls.
	 * 
	 * Wraps all session management, such as renewal etc.
	 * 
	 * @return
	 * @throws RestApiException
	 */
	public String refreshBhRestToken() throws RestApiException {
		createSession();

		return bhRestToken;
	}

	private void createSession() {
		for (int tryNumber = 1; tryNumber <= SESSION_RETRY; tryNumber++) {
			try {
				String authCode = getAuthorizationCode();
				getAccessToken(authCode);
				login();
				break;
			} catch (Exception e) {
				if (tryNumber < SESSION_RETRY) {
					log.error("Error creating REST session. Try number: " + tryNumber + " out of " + SESSION_RETRY + " trying again.", e);
				} else {
					log.error("Final error creating REST session. Shutting down.", e);

					throw new RestApiException("Failed to create rest session", e);
				}
			}
		}
	}

	private String getAuthorizationCode() throws RestApiException {
		String authorizeUrl = getRestAuthorizeUrl();
		String clientId = restCredentials.getRestClientId();
		String username = getUserName();
		String password = getPassword();
		String authCode = null;

		String url = authorizeUrl
				+ "?client_id={clientId}&response_type={responseType}&action={action}&username={username}&password={password}";

		Map<String, String> vars = new LinkedHashMap<String, String>();
		vars.put("clientId", clientId);
		vars.put("responseType", AUTH_CODE_RESPONSE_TYPE);
		vars.put("action", AUTH_CODE_ACTION);
		vars.put("username", username);
		vars.put("password", password);

		try {
			URI uri = restTemplate.postForLocation(url, null, vars);

			authCode = getAuthCode(uri);
		} catch (Exception e) {
			log.error("Failed to get authorization code.", e);
			throw new RestApiException("Failed to get authorization code.", e);
		}

		return authCode;
	}

	/**
	 * restCredentials will only be used in case of multi-tenant app. If not default to username in appSettings.
	 * 
	 * @return
	 */
	private String getUserName() {
		return restCredentials.getUsername();
	}

	/**
	 * restCredentials will only be used in case of multi-tenant app. If not default to password in appSettings.
	 * 
	 * @return
	 */
	private String getPassword() {
		return restCredentials.getPassword();
	}

	// query: code=###&client_id=
	private String getAuthCode(URI uri) {
		String query = uri.getQuery();
		Map<String, String> map = Splitter.on("&").trimResults().withKeyValueSeparator('=').split(query);
		return map.get("code");
	}

	private void getAccessToken(String authCode) throws RestApiException {
		String tokenUrl = getRestTokenUrl();
		String clientId = restCredentials.getRestClientId();
		String clientSecret = restCredentials.getRestClientSecret();

		String url = tokenUrl + "?grant_type={grantType}&code={authCode}&client_id={clientId}&client_secret={clientSecret}";

		Map<String, String> vars = new LinkedHashMap<String, String>();
		vars.put("grantType", ACCESS_TOKEN_GRANT_TYPE);
		vars.put("authCode", authCode);
		vars.put("clientId", clientId);
		vars.put("clientSecret", clientSecret);

		try {
			accessTokenInfo = restTemplate.postForObject(url, null, AccessTokenInfo.class, vars);
		} catch (Exception e) {
			log.error("Failed to get access token.", e);

			throw new RestApiException("Failed to get access token.", e);
		}
	}

	private void login() {
		JSONObject responseJson = null;

		try {
			String accessTokenString = URLEncoder.encode(accessTokenInfo.getAccessToken(), "UTF-8");
			String loginUrl = getRestLoginUrl();
			String sessionMinutesToLive = restCredentials.getRestSessionMinutesToLive();
			String url = loginUrl + "?version=" + version + "&access_token=" + accessTokenString + "&ttl=" + sessionMinutesToLive;
			GetMethod get = new GetMethod(url);

			HttpClient client = new HttpClient();
			client.executeMethod(get);

			String responseStr = streamToString(get.getResponseBodyAsStream());
			responseJson = new JSONObject(responseStr);

			String localBhRestToken = responseJson.getString("BhRestToken");
			this.setBhRestToken(localBhRestToken);

			restUrl = (String) responseJson.get("restUrl");
		} catch (RestClientException | IOException e) {
			log.error("Failed to login. " + responseJson, e);

			throw new RestApiException("Failed to login and get BhRestToken: " + responseJson, e);
		}
	}

	private String streamToString(InputStream inputStream) throws IOException {
		StringWriter writer = new StringWriter();
		IOUtils.copy(inputStream, writer, "UTF-8");
		return writer.toString();

	}

	/**
	 * Check if the DateTime dateTimeBhRestTokenWillExpire in this class is expired.
	 * 
	 * Pinging every time will decrease performance.
	 * 
	 * @return
	 * @throws RestApiException
	 */
	public boolean isSessionExpired() throws RestApiException {
		boolean sessionExpired = false;

		if (bhRestTokenExpired()) {
			// sessionExpired = ping();
			sessionExpired = true;
		}

		return sessionExpired;
	}

	/**
	 * Uses the DateTime in this class to calculate if the session is expired
	 * 
	 * @return
	 */

	private boolean bhRestTokenExpired() {
		if (dateTimeBhRestTokenWillExpire.isBeforeNow()) {
			return true;
		}
		return false;

	}

	public String getRestUrl() {
		return restUrl;
	}

	private synchronized void setBhRestToken(String bhRestToken) {
		this.bhRestToken = bhRestToken;

		updateDateTimeBhRestTokenWillExpire();

	}

	private void updateDateTimeBhRestTokenWillExpire() {
		// set the DateTime the session will expire, subtracting one minute to be on the safe side.
		DateTime timeToExpire = getNow();
		int sessionMinutesToLive = Integer.valueOf(restCredentials.getRestSessionMinutesToLive());
		if (sessionMinutesToLive > MAX_TTL) {
			sessionMinutesToLive = MAX_TTL;
		}
		timeToExpire = timeToExpire.plusMinutes(sessionMinutesToLive - 1);
		this.dateTimeBhRestTokenWillExpire = timeToExpire;
	}

	private DateTime getNow() {
		return new DateTime(DateTimeZone.forID("EST5EDT"));
	}

	public DateTime getDateTimeBhRestTokenWillExpire() {
		return dateTimeBhRestTokenWillExpire;
	}

	public void setDateTimeBhRestTokenWillExpire(DateTime dateTimeBhRestTokenWillExpire) {
		this.dateTimeBhRestTokenWillExpire = dateTimeBhRestTokenWillExpire;
	}

	/**
	 * Will return the un-encrypted RestCredentials for this RestApiSession. Note that this is only needed for a multi-tenant solution
	 * 
	 * @return a valid {@link RestCredentials} object if multi-tenant otherwise null
	 */
	public BullhornRestCredentials getRestCredentials() {
		return restCredentials;
	}

	private String getRestAuthorizeUrl() {
	    if (StringUtils.isNotBlank(restCredentials.getRestAuthorizeUrl())) {
	        return restCredentials.getRestAuthorizeUrl();
        }

	    String restAuthorizeUrl = getBaseOauthUrlFromApi() + "/authorize";

	    restCredentials.setRestAuthorizeUrl(restAuthorizeUrl);

	    return restCredentials.getRestAuthorizeUrl();
    }

    private String getRestTokenUrl() {
        if (StringUtils.isNotBlank(restCredentials.getRestTokenUrl())) {
            return restCredentials.getRestTokenUrl();
        }

        String restTokenUrl = getBaseOauthUrlFromApi() + "/token";

        restCredentials.setRestTokenUrl(restTokenUrl);

        return restCredentials.getRestTokenUrl();
    }

    private String getRestLoginUrl() {
        if (StringUtils.isNotBlank(restCredentials.getRestLoginUrl())) {
            return restCredentials.getRestLoginUrl();
        }

        String restLoginUrl = getBaseRestUrlFromApi() + "/login";

        restCredentials.setRestLoginUrl(restLoginUrl);

        return restCredentials.getRestLoginUrl();
    }

    private String baseRestUrl;

    private synchronized String getBaseRestUrlFromApi() {
	    if (StringUtils.isBlank(this.baseRestUrl)) {
	        JSONObject loginInfo = getLoginInfoFromApi();

            String baseRestUrl = loginInfo.getString("restUrl");

            if (StringUtils.isBlank(baseRestUrl)) {
                throw new RestApiException("Failed to dynamically determine REST url with username " + restCredentials.getUsername());
            }

            this.baseRestUrl = baseRestUrl;
        }

	    return this.baseRestUrl;
    }

    private String baseOauthUrl;

    private synchronized String getBaseOauthUrlFromApi() {
        if (StringUtils.isBlank(this.baseOauthUrl)) {
            JSONObject loginInfo = getLoginInfoFromApi();

            String baseOauthUrl = loginInfo.getString("oauthUrl");

            if (StringUtils.isBlank(baseOauthUrl)) {
                throw new RestApiException("Failed to dynamically determine oAuth url with username " + restCredentials.getUsername());
            }

            this.baseOauthUrl = baseOauthUrl;
        }

        return this.baseOauthUrl;
    }

    private JSONObject loginInfo;

    private synchronized JSONObject getLoginInfoFromApi() {
        if (loginInfo != null) {
            return loginInfo;
        }

        Map<String, Object> parameters = Maps.newLinkedHashMap();
        parameters.put("username", restCredentials.getUsername());

        try {
            ResponseEntity<String> response = restTemplate.exchange(LOGIN_INFO_URL, HttpMethod.GET, HttpEntity.EMPTY, String.class, parameters);

            if (StringUtils.isBlank(response.getBody())) {
                throw new RestApiException("Failed to dynamically determine REST urls with username " + restCredentials.getUsername());
            }

            this.loginInfo = new JSONObject(response.getBody());

            return this.loginInfo;
        } catch(RestClientException | JSONException e) {
            log.error("Error occurred dynamically determining REST urls with username " + restCredentials.getUsername(), e);

            throw new RestApiException("Failed to dynamically determine REST urls with username " + restCredentials.getUsername());
        }
    }

}
