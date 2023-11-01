package com.bullhornsdk.data.api.helper;

import com.bullhornsdk.data.api.BullhornRestCredentials;
import com.bullhornsdk.data.exception.RestApiException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Splitter;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;

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

    private static final String VERSION = "*";

    private static final Logger LOG = LogManager.getLogger(RestApiSession.class);

    private static final int SESSION_RETRY = 3;

    public static final int MAX_TTL = 2880;

    private final BullhornRestCredentials restCredentials;

    private final RestTemplate restTemplate;

    private String bhRestToken;

    private String restUrl;

    private DateTime dateTimeBhRestTokenWillExpire;

    /**
     * It is expected that the final members below are not used
     * (unlike another constructor that takes RestCredentials)
     */
    public RestApiSession() {
        this.restCredentials = null;
        this.restTemplate = RestTemplateFactory.getInstance();
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

    public RestApiSession(BullhornRestCredentials bullhornRestCredentials, String bhRestToken, DateTime dateTimeBhRestTokenWillExpire, String restUrl) {
        this.restCredentials = bullhornRestCredentials;
        this.restTemplate = RestTemplateFactory.getInstance();
        this.dateTimeBhRestTokenWillExpire = dateTimeBhRestTokenWillExpire;
        this.setBhRestToken(bhRestToken);
        this.restUrl = restUrl;
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
                AccessTokenInfo accessTokenInfo = getAccessToken(authCode);
                login(accessTokenInfo);
                break;
            } catch (Exception e) {
                if (tryNumber < SESSION_RETRY) {
                    String message = "Error creating REST session. Try number: " + tryNumber + " out of " + SESSION_RETRY + " trying again.";
                    LOG.error(message, e);
                } else {
                    LOG.error("Final error creating REST session. Shutting down.", e);

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

        String url = authorizeUrl
            + "?client_id={clientId}&response_type={responseType}&action={action}&username={username}&password={password}";

        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("clientId", clientId);
        parameters.put("responseType", AUTH_CODE_RESPONSE_TYPE);
        parameters.put("action", AUTH_CODE_ACTION);
        parameters.put("username", username);
        parameters.put("password", password);

        return getAuthorizationCode(url, parameters, true);
    }

    private String getAuthorizationCode(String url, Map<String, String> parameters, Boolean followRedirect) {
        try {
            ResponseEntity<Void> response = restTemplate.exchange(url, HttpMethod.POST, HttpEntity.EMPTY, Void.class, parameters);

            URI location = response.getHeaders().getLocation();

            if(location != null) {
                if (followRedirect && response.getStatusCode() == HttpStatus.TEMPORARY_REDIRECT || response.getStatusCode() == HttpStatus.PERMANENT_REDIRECT) {
                    return getAuthorizationCode(location.toString(), Maps.newLinkedHashMap(), false);
                }

                return getAuthCode(location);
            }

            throw new RestApiException("Failed to get authorization code.  Response had no Location header and code was: " + response.getStatusCodeValue());
        } catch (Exception e) {
            LOG.error("Failed to get authorization code.", e);

            throw new RestApiException("Failed to get authorization code.", e);
        }
    }

    // query: code=###&client_id=
    private String getAuthCode(URI uri) {
        String query = uri.getQuery();
        Map<String, String> map = Splitter.on("&").trimResults().withKeyValueSeparator('=').split(query);
        return map.get("code");
    }

    private AccessTokenInfo getAccessToken(String authCode) throws RestApiException {
        String tokenUrl = getRestTokenUrl();
        String clientId = restCredentials.getRestClientId();
        String clientSecret = restCredentials.getRestClientSecret();

        String url = tokenUrl + "?grant_type={grantType}&code={authCode}&client_id={clientId}&client_secret={clientSecret}";

        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("grantType", ACCESS_TOKEN_GRANT_TYPE);
        parameters.put("authCode", authCode);
        parameters.put("clientId", clientId);
        parameters.put("clientSecret", clientSecret);

        return getAccessToken(url, parameters, true);
    }

    private AccessTokenInfo getAccessToken(String url, Map<String, String> parameters, Boolean followRedirect) {
        try {
            ResponseEntity<AccessTokenInfo> response = restTemplate.exchange(url, HttpMethod.POST, HttpEntity.EMPTY, AccessTokenInfo.class, parameters);

            if (followRedirect && response.getStatusCode() == HttpStatus.TEMPORARY_REDIRECT || response.getStatusCode() == HttpStatus.PERMANENT_REDIRECT) {
                URI location = response.getHeaders().getLocation();

                if(location != null) {
                    return getAccessToken(location.toString(), Maps.newLinkedHashMap(), false);
                }
            }

            if (response.getBody() != null) {
                return response.getBody();
            }

            throw new RestApiException("Failed to get access token.  Response was: " + response.getStatusCodeValue());
        } catch (Exception e) {
            LOG.error("Failed to get access token.", e);

            throw new RestApiException("Failed to get access token.", e);
        }
    }

    private void login(AccessTokenInfo accessTokenInfo) {
        String url = getRestLoginUrl() + "?version={version}&access_token={accessToken}&ttl={ttl}";

        Map<String, String> parameters = Maps.newLinkedHashMap();
        parameters.put("version", RestApiSession.VERSION);
        parameters.put("accessToken", accessTokenInfo.getAccessToken());
        parameters.put("ttl", this.restCredentials.getRestSessionMinutesToLive());

        this.login(url, parameters, true);
    }

    private void login(String url, Map<String, String> parameters, Boolean followRedirect) {
        try {
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, HttpEntity.EMPTY, String.class, parameters);

            if (followRedirect && response.getStatusCode() == HttpStatus.TEMPORARY_REDIRECT || response.getStatusCode() == HttpStatus.PERMANENT_REDIRECT) {
                URI location = response.getHeaders().getLocation();

                if(location != null) {
                    login(location.toString(), Maps.newLinkedHashMap(), false);
                } else {
                    throw new RestApiException("Failed to get login and get BhRestToken.  Response was: " + response.getStatusCodeValue());
                }
            } else if (response.getBody() != null) {
                JSONObject responseJson = new JSONObject(response.getBody());

                this.setBhRestToken(responseJson.getString("BhRestToken"));
                this.restUrl = (String) responseJson.get("restUrl");
            } else {
                throw new RestApiException("Failed to get login and get BhRestToken.  Response had no body and code was was: " + response.getStatusCodeValue());
            }
        } catch (Exception e) {
            LOG.error("Failed to login and get BhRestToken", e);

            throw new RestApiException("Failed to login and get BhRestToken", e);
        }
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

    private synchronized void setBhRestToken(String bhRestToken) {
        this.bhRestToken = bhRestToken;

        updateDateTimeBhRestTokenWillExpire();
    }

    private void updateDateTimeBhRestTokenWillExpire() {
        // set the DateTime the session will expire, subtracting one minute to be on the safe side.
        int sessionMinutesToLive = Integer.valueOf(restCredentials.getRestSessionMinutesToLive());

        if (sessionMinutesToLive > MAX_TTL) {
            sessionMinutesToLive = MAX_TTL;
        }

        DateTime timeToExpire = getNow().plusMinutes(sessionMinutesToLive - 1);

        this.dateTimeBhRestTokenWillExpire = timeToExpire;
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
            String message = "Error occurred dynamically determining REST urls with username " + restCredentials.getUsername();
            LOG.error(message, e);

            throw new RestApiException(message);
        }
    }

    public String getRestUrl() {
        return restUrl;
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

}
