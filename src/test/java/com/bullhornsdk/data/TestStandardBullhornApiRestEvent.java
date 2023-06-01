package com.bullhornsdk.data;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.bullhornsdk.data.model.enums.EntityEventType;
import com.bullhornsdk.data.model.enums.EventMetadata;
import com.bullhornsdk.data.model.enums.EventType;
import com.bullhornsdk.data.model.response.event.Event;
import com.bullhornsdk.data.model.response.event.GetEventsResponse;
import com.google.common.collect.Lists;

public class TestStandardBullhornApiRestEvent extends BaseTest {

    private static final int MAX_EVENTS = 100;

    private static final List<String> EVENT_TYPES = Lists.newArrayList(EventType.values()).stream().map(EventType::value).collect(Collectors.toList());
    private static final List<String> ENTITY_EVENT_TYPES = Lists.newArrayList(EntityEventType.values()).stream().map(EntityEventType::value).collect(Collectors.toList());

    public TestStandardBullhornApiRestEvent() {
        super();
    }

    @Test
    public <T extends Event> void testGetEvents() {
        GetEventsResponse<T> events = bullhornData.getEvents(testEntities.getSubscriptionId(), MAX_EVENTS);

        Assertions.assertTrue(events != null, "events is null");
        Assertions.assertTrue(events.getRequestId() != null && events.getRequestId() > 0, "no last request id");
        Assertions.assertTrue(!events.getEvents().isEmpty(), "no events");
        Assertions.assertTrue(events.getEvents().size() <= MAX_EVENTS, "more than max events returned");

        events.getEvents().stream().forEach( event -> assertEvent(event));
    }

    @Test
    public <T extends Event> void testRegetEvents() {
        GetEventsResponse<T> events = bullhornData.regetEvents(testEntities.getSubscriptionId(), testEntities.getRequestId());

        Assertions.assertTrue(events != null, "events is null");
        Assertions.assertTrue(events.getRequestId() != null && events.getRequestId() > 0, "no last request id");
        Assertions.assertTrue(!events.getEvents().isEmpty(), "no events");
        Assertions.assertTrue(events.getEvents().size() <= MAX_EVENTS, "more than max events returned");
        Assertions.assertTrue(testEntities.getRequestId().equals(events.getRequestId()), "request id didnt match value requested");

        events.getEvents().stream().forEach( event -> assertEvent(event));
    }

    @Test
    public <T extends Event> void testGetLastRequestId() {
        Integer lastRequestId = bullhornData.getLastRequestId(testEntities.getSubscriptionId());

        Assertions.assertTrue(lastRequestId != null && lastRequestId > 0, "last requst id is null");
    }

    private <T extends Event> void assertEvent(T event) {
        Assertions.assertTrue(event.getEntityName() != null && !event.getEntityName().isEmpty(), "entity name is null");
        Assertions.assertTrue(event.getEventId() != null && !event.getEventId().isEmpty(), "event id is null");
        Assertions.assertTrue(event.getEventTimestamp() != null, "timestamp is null");
        Assertions.assertTrue(event.getEventType() != null && !event.getEventType().isEmpty(), "event type is null");
        Assertions.assertTrue(event.getEntityEventType() != null && !event.getEntityEventType().isEmpty(), "entity event type is null");
        Assertions.assertTrue(event.getEntityId() != null && event.getEntityId() > 0, "entity id is null");

        Assertions.assertTrue(event.getEventMetadata() != null && !event.getEventMetadata().isEmpty(), "meta data is null");

        Assertions.assertTrue(EVENT_TYPES.contains(event.getEventType()), "invalid event type"+event.getEventType());
        Assertions.assertTrue(ENTITY_EVENT_TYPES.contains(event.getEntityEventType()), "invalid entity event type");

        Assertions.assertTrue(event.getEventMetadata().containsKey(EventMetadata.PERSON_ID.value()), "no person id");

        if(EntityEventType.UPDATED.value().equals(event.getEntityEventType())) {
            Assertions.assertTrue(event.getEventMetadata().containsKey(EventMetadata.TRANSACTION_ID.value()), "no transaction id");
        }
    }

}
