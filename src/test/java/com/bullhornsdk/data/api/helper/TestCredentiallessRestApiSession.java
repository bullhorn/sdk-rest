package com.bullhornsdk.data.api.helper;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.bullhornsdk.data.BaseTest;
import com.bullhornsdk.data.api.BullhornRestCredentials;

import static org.junit.Assert.*;

@Ignore
public class TestCredentiallessRestApiSession extends BaseTest {

    private RestApiSession restApiSession;

    private BullhornRestCredentials bullhornRestCredentials;

    /**
     * Add your own rest credentials here to test the connection.
     */
    @Before
    public void setupTheCredentials() {
        BullhornRestCredentials creds = new BullhornRestCredentials();

        creds.setRestUrl("MY-RESTURL");
        creds.setBhRestToken("MY-BHRESTTOKEN");
        this.bullhornRestCredentials = creds;
        this.restApiSession = new RestApiSession(bullhornRestCredentials);
    }

    @Test
    public void testRestApiSession() {

        RestApiSession restApiSessionManual = new RestApiSession(bullhornRestCredentials);
        assertNotNull("RestApiSession is null", restApiSessionManual);
        assertNull("Username is not null", bullhornRestCredentials.getUsername());
        assertNull("RestTokenUrl is not null", bullhornRestCredentials.getRestTokenUrl());
        assertNull("RestSessionMinutesToLive is not null", bullhornRestCredentials.getRestSessionMinutesToLive());
        assertNull("RestLoginUrl is not null", bullhornRestCredentials.getRestLoginUrl());
        assertNull("RestClientSecret is not null", bullhornRestCredentials.getRestClientSecret());
        assertNull("RestClientId is not null", bullhornRestCredentials.getRestClientId());
        assertNull("RestAuthorizeUrl is not null", bullhornRestCredentials.getRestAuthorizeUrl());
    }

    @Test
    public void testGetBhRestToken() {

        String restToken = restApiSession.getBhRestToken();
        assertNotNull("BhRestToken is null", restToken);
        assertNull("Username is not null", bullhornRestCredentials.getUsername());
        assertNull("RestTokenUrl is not null", bullhornRestCredentials.getRestTokenUrl());
        assertNull("RestSessionMinutesToLive is not null", bullhornRestCredentials.getRestSessionMinutesToLive());
        assertNull("RestLoginUrl is not null", bullhornRestCredentials.getRestLoginUrl());
        assertNull("RestClientSecret is not null", bullhornRestCredentials.getRestClientSecret());
        assertNull("RestClientId is not null", bullhornRestCredentials.getRestClientId());
        assertNull("RestAuthorizeUrl is not null", bullhornRestCredentials.getRestAuthorizeUrl());
    }

    @Test
    public void testGetRestUrl() {

        String restUrl = restApiSession.getRestUrl();
        assertNotNull("restUrl is null", restUrl);
        assertNull("Username is not null", bullhornRestCredentials.getUsername());
        assertNull("RestTokenUrl is not null", bullhornRestCredentials.getRestTokenUrl());
        assertNull("RestSessionMinutesToLive is not null", bullhornRestCredentials.getRestSessionMinutesToLive());
        assertNull("RestLoginUrl is not null", bullhornRestCredentials.getRestLoginUrl());
        assertNull("RestClientSecret is not null", bullhornRestCredentials.getRestClientSecret());
        assertNull("RestClientId is not null", bullhornRestCredentials.getRestClientId());
        assertNull("RestAuthorizeUrl is not null", bullhornRestCredentials.getRestAuthorizeUrl());
    }

    @Test
    public void testHasNoSessionProvided() {

        boolean hasNoSession = restApiSession.hasNoSessionProvided(bullhornRestCredentials);
        assertFalse(hasNoSession);

    }

}
