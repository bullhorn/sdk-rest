package com.bullhornsdk.data.api.helper;

import java.io.IOException;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bullhornsdk.data.BaseTest;
import com.bullhornsdk.data.api.BullhornRestCredentials;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.emptyString;

@Ignore
public class TestRestApiSession extends BaseTest {

    private RestApiSession restApiSession;

    private BullhornRestCredentials bullhornRestCredentials;

    /**
     * Add your own rest credentials here to test the connection.
     */
    @BeforeEach
    public void setupTheCredentials() {
        BullhornRestCredentials creds = new BullhornRestCredentials();

        creds.setRestAuthorizeUrl("https://auth9.bullhornstaffing.com/oauth/authorize");
        creds.setRestClientId("MY-CLIENT-ID");
        creds.setRestClientSecret("MY-CLIENT-SECRET");
        creds.setRestLoginUrl("https://rest9.bullhornstaffing.com/rest-services/login");
        creds.setRestSessionMinutesToLive("1400");
        creds.setRestTokenUrl("https://auth9.bullhornstaffing.com/oauth/token");
        creds.setUsername("MY-USERNAME");
        creds.setPassword("MY-PASSWORD");
        this.bullhornRestCredentials = creds;
        this.restApiSession = new RestApiSession(bullhornRestCredentials);
    }
    /**
     * Add your own rest credentials here to test the connection.
     */
    @Test
    public void testDynamicRestUrls() {
        BullhornRestCredentials bullhornRestCredentials = new BullhornRestCredentials();

        bullhornRestCredentials.setRestClientId("MY-CLIENT-ID");
        bullhornRestCredentials.setRestClientSecret("MY-CLIENT-SECRET");
        bullhornRestCredentials.setRestSessionMinutesToLive("1400");
        bullhornRestCredentials.setUsername("MY-USERNAME");
        bullhornRestCredentials.setPassword("MY-PASSWORD");

        RestApiSession restApiSession = new RestApiSession(bullhornRestCredentials);

        Assertions.assertNotNull(restApiSession, "Session is null");
        Assertions.assertNotNull(restApiSession.getBhRestToken(), "BhRestToken was empty");
    }

    @Test
    public void testRestApiSession() {

        RestApiSession restApiSessionManual = new RestApiSession(bullhornRestCredentials);
        Assertions.assertNotNull(restApiSessionManual, "RestApiSession is null");
    }

    @Test
    public void testGetBhRestToken() {

        String restToken = restApiSession.getBhRestToken();
        Assertions.assertNotNull(restToken, "BhRestToken is null");
    }

    @Test
    public void testGetRestUrl() {

        String restUrl = restApiSession.getRestUrl();
        Assertions.assertNotNull(restUrl, "restUrl is null");
    }

    @Test
    public void testSessionExpired_1() throws InterruptedException {

        bullhornRestCredentials.setRestSessionMinutesToLive("1");

        RestApiSession restApiSessionManual = new RestApiSession(bullhornRestCredentials);
        Thread.sleep(5000);
        Assertions.assertTrue(restApiSessionManual.isSessionExpired(), "session should have expired is null");

        String restToken = restApiSessionManual.getBhRestToken();
        Assertions.assertNotNull(restToken, "BhRestToken is null");

        String restUrl = restApiSessionManual.getRestUrl();
        Assertions.assertNotNull(restUrl, "restUrl is null");

    }

    @Test
    public void testSessionExpired_2() {

        bullhornRestCredentials.setRestSessionMinutesToLive("5000");

        RestApiSession restApiSessionManual = new RestApiSession(bullhornRestCredentials);

        Assertions.assertFalse(restApiSessionManual.isSessionExpired(), "session should not be expired");

        String restToken = restApiSessionManual.getBhRestToken();
        Assertions.assertNotNull(restToken, "BhRestToken is null");

        String restUrl = restApiSessionManual.getRestUrl();
        Assertions.assertNotNull(restUrl, "restUrl is null");

        DateTime expirationDate = restApiSessionManual.getDateTimeBhRestTokenWillExpire();
        DateTime expirationDateManual = getNow().plusMinutes(RestApiSession.MAX_TTL - 1);
        Assertions.assertTrue(expirationDate.getDayOfYear() == expirationDateManual.getDayOfYear());
        Assertions.assertTrue(expirationDate.getHourOfDay() == expirationDateManual.getHourOfDay());
        Assertions.assertTrue(expirationDate.getMinuteOfDay() == expirationDateManual.getMinuteOfDay());
        Assertions.assertTrue(expirationDate.getSecondOfDay() == expirationDateManual.getSecondOfDay());

    }

    @Test
    public void testRefreshBhRestToken() throws InterruptedException {

        bullhornRestCredentials.setRestSessionMinutesToLive("1");

        RestApiSession restApiSessionManual = new RestApiSession(bullhornRestCredentials);
        String restToken = restApiSessionManual.getBhRestToken();
        Assertions.assertNotNull(restToken, "restToken is null");
        Thread.sleep(5000);
        Assertions.assertTrue(restApiSessionManual.isSessionExpired(), "session should have expired is null");

        String newRestToken = restApiSessionManual.refreshBhRestToken();
        Assertions.assertNotNull(newRestToken, "newRestToken is null");

        Assertions.assertFalse(restToken.equals(newRestToken), "new BhRestToken is the same as old BhRestToken");

        String restUrl = restApiSessionManual.getRestUrl();
        Assertions.assertNotNull(restUrl, "restUrl is null");

    }

    @Test
    public void testSessionSerialization() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JodaModule());

        String json = mapper.writeValueAsString(restApiSession);

        System.out.println(json);

        final RestApiSession newSession = mapper.readValue(json, RestApiSession.class);
        Assertions.assertNotNull(newSession);

    }

    private DateTime getNow() {
        return new DateTime(DateTimeZone.forID("EST5EDT"));
    }

}
