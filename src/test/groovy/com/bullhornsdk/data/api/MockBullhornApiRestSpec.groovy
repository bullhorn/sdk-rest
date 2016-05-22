package com.bullhornsdk.data.api

import com.bullhornsdk.data.BaseSpecification
import com.bullhornsdk.data.model.entity.core.standard.Candidate
import com.bullhornsdk.data.model.entity.core.standard.JobOrder
import com.bullhornsdk.data.model.enums.EntityEventType
import com.bullhornsdk.data.model.enums.EventType
import com.bullhornsdk.data.model.response.subscribe.SubscribeToEventsResponse
import spock.lang.Unroll

class MockBullhornApiRestSpec extends BaseSpecification {

    static List<EntityEventType> ALLTYPES = Arrays.asList(EntityEventType.values())

    @Unroll
    def subscribeToEvents() {
        expect:
        SubscribeToEventsResponse response = bullhornData.subscribeToEvents("subscriptionId", eventType, entityClasses, entityEventTypes)
        response.subscriptionId == "subscriptionId"
        response.lastRequestId == 0
        response.createdOn != null
        response.jmsSelector == jmsSelector
        where:
        eventType                | entityClasses                     | entityEventTypes           | jmsSelector
        EventType.ENTITY         | [Candidate.class, JobOrder.class] | ALLTYPES                   | "JMSType='ENTITY' AND BhCorpId=1 AND BhEntityName IN ('Candidate','JobOrder') AND BhEntityEventType IN ('INSERTED','UPDATED','DELETED')"
        EventType.ENTITY         | [Candidate.class]                 | ALLTYPES                   | "JMSType='ENTITY' AND BhCorpId=1 AND BhEntityName='Candidate' AND BhEntityEventType IN ('INSERTED','UPDATED','DELETED')"
        EventType.FIELDMAPCHANGE | []                                | ALLTYPES                   | "JMSType='FIELDMAPCHANGE' AND BhCorpId=1 AND BhEntityEventType IN ('INSERTED','UPDATED','DELETED')"
        EventType.FIELDMAPCHANGE | [Candidate.class]                 | ALLTYPES                   | "JMSType='FIELDMAPCHANGE' AND BhCorpId=1 AND BhEntityEventType IN ('INSERTED','UPDATED','DELETED')"
        EventType.FIELDMAPCHANGE | null                              | ALLTYPES                   | "JMSType='FIELDMAPCHANGE' AND BhCorpId=1 AND BhEntityEventType IN ('INSERTED','UPDATED','DELETED')"
        EventType.JOBMATCHSEARCH | []                                | ALLTYPES                   | "JMSType='JOBMATCHSEARCH' AND BhCorpId=1 AND BhEntityEventType IN ('INSERTED','UPDATED','DELETED')"
    }

    def unsubscribeToEvents() {
        expect:
        bullhornData.unsubscribeToEvents("subscriptionId")
    }
}
