package com.bullhornsdk.data;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

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

        Assert.assertTrue("events is null", events != null);
        Assert.assertTrue("no last request id", events.getRequestId() != null && events.getRequestId() > 0);
        Assert.assertTrue("no events", !events.getEvents().isEmpty());
        Assert.assertTrue("more than max events returned", events.getEvents().size() <= MAX_EVENTS);

        events.getEvents().stream().forEach( event -> assertEvent(event));
    }

    @Test
    public <T extends Event> void testRegetEvents() {
        GetEventsResponse<T> events = bullhornData.regetEvents(testEntities.getSubscriptionId(), testEntities.getRequestId());

        Assert.assertTrue("events is null", events != null);
        Assert.assertTrue("no last request id", events.getRequestId() != null && events.getRequestId() > 0);
        Assert.assertTrue("no events", !events.getEvents().isEmpty());
        Assert.assertTrue("more than max events returned", events.getEvents().size() <= MAX_EVENTS);
        Assert.assertTrue("request id didnt match value requested", testEntities.getRequestId().equals(events.getRequestId()));

        events.getEvents().stream().forEach( event -> assertEvent(event));
    }

    @Test
    public <T extends Event> void testGetLastRequestId() {
        Integer lastRequestId = bullhornData.getLastRequestId(testEntities.getSubscriptionId());

        Assert.assertTrue("last requst id is null", lastRequestId != null && lastRequestId > 0);
    }

    private <T extends Event> void assertEvent(T event) {
        Assert.assertTrue("entity name is null", event.getEntityName() != null && !event.getEntityName().isEmpty());
        Assert.assertTrue("event id is null", event.getEventId() != null && !event.getEventId().isEmpty());
        Assert.assertTrue("timestamp is null", event.getEventTimestamp() != null);
        Assert.assertTrue("event type is null", event.getEventType() != null && !event.getEventType().isEmpty());
        Assert.assertTrue("entity event type is null", event.getEntityEventType() != null && !event.getEntityEventType().isEmpty());
        Assert.assertTrue("entity id is null", event.getEntityId() != null && event.getEntityId() > 0);

        Assert.assertTrue("meta data is null", event.getEventMetadata() != null && !event.getEventMetadata().isEmpty());

        Assert.assertTrue("invalid event type"+event.getEventType(), EVENT_TYPES.contains(event.getEventType()));
        Assert.assertTrue("invalid entity event type", ENTITY_EVENT_TYPES.contains(event.getEntityEventType()));

        Assert.assertTrue("no person id", event.getEventMetadata().containsKey(EventMetadata.PERSON_ID.value()));

        if(EntityEventType.UPDATED.value().equals(event.getEntityEventType())) {
            Assert.assertTrue("no transaction id", event.getEventMetadata().containsKey(EventMetadata.TRANSACTION_ID.value()));
        }
    }

}
