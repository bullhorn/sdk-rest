package com.bullhornsdk.data.api.helper;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URI;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import com.bullhornsdk.data.api.RestApiSettings;
import com.bullhornsdk.data.exception.RestApiException;
import com.google.common.base.Splitter;

/**
 * Wraps rest api session management.
 * 
 * @author Yaniv Or-Shahar
 * @author Magnus Fiore Palm
 * 
 */

public class RestApiSession {
	private static final String AUTH_CODE_ACTION = "Login";

	private static final String AUTH_CODE_RESPONSE_TYPE = "code";

	private static final String ACCESS_TOKEN_GRANT_TYPE = "authorization_code";

	private static final String REFRESH_TOKEN_GRANT_TYPE = "refresh_token";

	private static Logger log = Logger.getLogger(RestApiSession.class);

	private RestApiSettings restApiSettings;

	private RestTemplate restTemplate;

	private final RestCredentials restCredentials;

	private AccessTokenInfo accessTokenInfo;

	private String bhRestToken;

	private String restUrl;

	private String version = "*";

	private DateTime dateTimeBhRestTokenWillExpire;

	private static int SESSION_RETRY = 3;

	private final Integer corporationID;

	private final String apiKey;

	public final static int MAX_TTL = 2880;

	public RestApiSession(RestApiSettings restApiSettings) {
		this.restApiSettings = restApiSettings;
		this.restTemplate = RestTemplateFactory.getInstance();
		this.dateTimeBhRestTokenWillExpire = getNow();
		this.restCredentials = null;
		this.corporationID = 0;
		this.apiKey = "No api key needed for single tenant solution";
		createSession();
	}

	public RestApiSession(RestApiSettings restApiSettings, RestCredentials restCredentials) {
		this.restApiSettings = restApiSettings;
		this.restTemplate = RestTemplateFactory.getInstance();
		this.restCredentials = restCredentials;
		this.dateTimeBhRestTokenWillExpire = getNow();
		this.corporationID = restCredentials.getCorporationId();
		this.apiKey = restCredentials.getApiKey();
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
		String authorizeUrl = restApiSettings.getRestAuthorizeUrl();
		String clientId = restApiSettings.getRestClientId();
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
		if (restCredentials != null) {
			return restCredentials.getBhUserName();
		}
		return restApiSettings.getUsername();
	}

	/**
	 * restCredentials will only be used in case of multi-tenant app. If not default to password in appSettings.
	 * 
	 * @return
	 */
	private String getPassword() {
		if (restCredentials != null) {
			return restCredentials.getBhPassword();
		}
		return restApiSettings.getPassword();
	}

	// query: code=###&client_id=
	private String getAuthCode(URI uri) {
		String query = uri.getQuery();
		Map<String, String> map = Splitter.on("&").trimResults().withKeyValueSeparator('=').split(query);
		return map.get("code");
	}

	private void getAccessToken(String authCode) throws RestApiException {
		String tokenUrl = restApiSettings.getRestTokenUrl();
		String clientId = restApiSettings.getRestClientId();
		String clientSecret = restApiSettings.getRestClientSecret();

		String url = tokenUrl + "?grant_type={grantType}&code={authCode}&client_id={clientId}&client_secret={clientSecret}";

		Map<String, String> vars = new LinkedHashMap<String, String>();
		vars.put("grantType", ACCESS_TOKEN_GRANT_TYPE);
		vars.put("authCode", authCode);
		vars.put("clientId", clientId);
		vars.put("clientSecret", clientSecret);

		try {
			// String test = restTemplate.postForObject(url, null, String.class, vars);
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
			String loginUrl = restApiSettings.getRestLoginUrl();
			String sessionMinutesToLive = restApiSettings.getRestSessionMinutesToLive();
			String url = loginUrl + "?version=" + version + "&access_token=" + accessTokenString + "&ttl=" + sessionMinutesToLive;
			GetMethod get = new GetMethod(url);

			HttpClient client = new HttpClient();
			client.executeMethod(get);

			String responseStr = streamToString(get.getResponseBodyAsStream());
			responseJson = new JSONObject(responseStr);

			String localBhRestToken = responseJson.getString("BhRestToken");
			this.setBhRestToken(localBhRestToken);

			restUrl = (String) responseJson.get("restUrl");
		} catch (Exception e) {
			log.error("Failed to login. " + responseJson, e);
			throw new RestApiException("Failed to login and get BhRestToken: " + responseJson);

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
		int sessionMinutesToLive = Integer.valueOf(restApiSettings.getRestSessionMinutesToLive());
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
	public RestCredentials getRestCredentials() {
		return restCredentials;
	}

}
