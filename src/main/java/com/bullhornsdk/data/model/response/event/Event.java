package com.bullhornsdk.data.model.response.event;

import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;

/**
 * Created by john.sullivan on 17/2/2016.
 */
public interface Event {

    String getEventId();

    String getEventType();

    Integer getEntityId();

    String getEntityName();

    String getEntityEventType();

    DateTime getEventTimestamp();

    List<String> getUpdatedProperties();

    Map<String, String> getEventMetadata();

}