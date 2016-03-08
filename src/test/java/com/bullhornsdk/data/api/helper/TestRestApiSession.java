package com.bullhornsdk.data.api.helper;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.bullhornsdk.data.BaseTest;
import com.bullhornsdk.data.api.BullhornRestCredentials;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;

@Ignore
public class TestRestApiSession extends BaseTest {

	private RestApiSession restApiSession;

	private BullhornRestCredentials bullhornRestCredentials;

	/**
	 * Add your own rest credentials here to test the connection.
	 */
	@Before
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

	@Test
	public void testRestApiSession() {

		RestApiSession restApiSessionManual = new RestApiSession(bullhornRestCredentials);
		assertNotNull("RestApiSession is null", restApiSessionManual);
	}

	@Test
	public void testGetBhRestToken() {

		String restToken = restApiSession.getBhRestToken();
		assertNotNull("BhRestToken is null", restToken);
	}

	@Test
	public void testGetRestUrl() {

		String restUrl = restApiSession.getRestUrl();
		assertNotNull("restUrl is null", restUrl);
	}

	@Test
	public void testSessionExpired_1() throws InterruptedException {

		bullhornRestCredentials.setRestSessionMinutesToLive("1");

		RestApiSession restApiSessionManual = new RestApiSession(bullhornRestCredentials);
		Thread.sleep(5000);
		assertTrue("session should have expired is null", restApiSessionManual.isSessionExpired());

		String restToken = restApiSessionManual.getBhRestToken();
		assertNotNull("BhRestToken is null", restToken);

		String restUrl = restApiSessionManual.getRestUrl();
		assertNotNull("restUrl is null", restUrl);

	}

	@Test
	public void testSessionExpired_2() {

		bullhornRestCredentials.setRestSessionMinutesToLive("5000");

		RestApiSession restApiSessionManual = new RestApiSession(bullhornRestCredentials);

		assertFalse("session should not be expired", restApiSessionManual.isSessionExpired());

		String restToken = restApiSessionManual.getBhRestToken();
		assertNotNull("BhRestToken is null", restToken);

		String restUrl = restApiSessionManual.getRestUrl();
		assertNotNull("restUrl is null", restUrl);

		DateTime expirationDate = restApiSessionManual.getDateTimeBhRestTokenWillExpire();
		DateTime expirationDateManual = getNow().plusMinutes(RestApiSession.MAX_TTL - 1);
		assertTrue(expirationDate.getDayOfYear() == expirationDateManual.getDayOfYear());
		assertTrue(expirationDate.getHourOfDay() == expirationDateManual.getHourOfDay());
		assertTrue(expirationDate.getMinuteOfDay() == expirationDateManual.getMinuteOfDay());
		assertTrue(expirationDate.getSecondOfDay() == expirationDateManual.getSecondOfDay());

	}

	@Test
	public void testRefreshBhRestToken() throws InterruptedException {

		bullhornRestCredentials.setRestSessionMinutesToLive("1");

		RestApiSession restApiSessionManual = new RestApiSession(bullhornRestCredentials);
		String restToken = restApiSessionManual.getBhRestToken();
		assertNotNull("restToken is null", restToken);
		Thread.sleep(5000);
		assertTrue("session should have expired is null", restApiSessionManual.isSessionExpired());

		String newRestToken = restApiSessionManual.refreshBhRestToken();
		assertNotNull("newRestToken is null", newRestToken);

		assertFalse("new BhRestToken is the same as old BhRestToken", restToken.equals(newRestToken));

		String restUrl = restApiSessionManual.getRestUrl();
		assertNotNull("restUrl is null", restUrl);

	}

	@Test
	public void testSessionSerialization() throws IOException {

		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JodaModule());

		String json = mapper.writeValueAsString(restApiSession);

		System.out.println(json);

		final RestApiSession newSession = mapper.readValue(json, RestApiSession.class);
		assertNotNull(newSession);

	}

	private DateTime getNow() {
		return new DateTime(DateTimeZone.forID("EST5EDT"));
	}

}
