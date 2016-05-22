package com.bullhornsdk.data.api

import com.bullhornsdk.data.model.entity.core.standard.Candidate
import com.bullhornsdk.data.model.enums.EntityEventType
import com.bullhornsdk.data.model.enums.EventType
import com.bullhornsdk.data.model.response.subscribe.SubscribeToEventsResponse

/**
 * Test runner for testing BullhornDat against real life Bullhorn data
 *
 */
class BullhornDataTestRunner {

    public static void main(String... args){
        BullhornRestCredentials creds = new BullhornRestCredentials(
                username: "",
                password: "",
                restClientId: "",
                restClientSecret: "",
                restAuthorizeUrl: "",
                restTokenUrl: "",
                restLoginUrl: "",
                restSessionMinutesToLive: "10"
        )
        BullhornData bullhornData =  new StandardBullhornData(creds)
    }

    static void subscribe(BullhornData bullhornData){
        SubscribeToEventsResponse response = bullhornData.subscribeToEvents("sdk-rest-test", EventType.ENTITY, [Candidate.class],
                Arrays.asList(EntityEventType.values()))
        println response
    }

    static void unsubscribe(BullhornData bullhornData){
        println bullhornData.unsubscribeToEvents("sdk-rest-test")
    }
}
