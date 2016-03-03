package com.bullhornsdk.data.model.response.event.standard;

import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.response.event.Event;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by john.sullivan on 17/2/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "eventId", "eventType", "entityId", "entityName", "entityEventType", "eventTimestamp", "updatedProperties", "String> eventMetadata" })
public class StandardEvent extends AbstractEntity implements Event {

    private String eventId;
    private String eventType;
    private Integer entityId;
    private String entityName;
    private String entityEventType;
    private DateTime eventTimestamp;

    private List<String> updatedProperties;
    private Map<String, String> eventMetadata;

    @Override
    @JsonProperty("eventId")
    public String getEventId() {
        return eventId;
    }

    @JsonProperty("eventId")
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @Override
    @JsonProperty("eventType")
    public String getEventType() {
        return eventType;
    }

    @JsonProperty("eventType")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Override
    @JsonProperty("entityId")
    public Integer getEntityId() {
        return entityId;
    }

    @JsonProperty("entityId")
    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    @Override
    @JsonProperty("entityName")
    public String getEntityName() {
        return entityName;
    }

    @JsonProperty("entityName")
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    @Override
    @JsonProperty("entityEventType")
    public String getEntityEventType() {
        return entityEventType;
    }

    @JsonProperty("entityEventType")
    public void setEntityEventType(String entityEventType) {
        this.entityEventType = entityEventType;
    }

    @Override
    @JsonProperty("eventTimestamp")
    public DateTime getEventTimestamp() {
        return eventTimestamp;
    }

    @JsonProperty("eventTimestamp")
    public void setEventTimestamp(DateTime eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    @Override
    @JsonProperty("updatedProperties")
    public List<String> getUpdatedProperties() {
        return updatedProperties;
    }

    @JsonProperty("updatedProperties")
    public void setUpdatedProperties(List<String> updatedProperties) {
        this.updatedProperties = updatedProperties;
    }

    @Override
    @JsonProperty("eventMetadata")
    public Map<String, String> getEventMetadata() {
        return eventMetadata;
    }

    @JsonProperty("eventMetadata")
    public void setEventMetadata(Map<String, String> eventMetadata) {
        this.eventMetadata = eventMetadata;
    }

    @Override
    public String toString() {
        return new StringBuilder("StandardEvent {")
                .append("\n\t\"eventId\": ")
                .append("'")
                .append(eventId).append('\'')
                .append(",\n\t\"eventType\": ")
                .append("'")
                .append(eventType).append('\'')
                .append(",\n\t\"entityId\": ")
                .append(entityId)
                .append(",\n\t\"entityName\": ")
                .append("'")
                .append(entityName).append('\'')
                .append(",\n\t\"entityEventType\": ")
                .append("'")
                .append(entityEventType).append('\'')
                .append(",\n\t\"eventTimestamp\": ")
                .append(eventTimestamp)
                .append(",\n\t\"updatedProperties\": ")
                .append(updatedProperties)
                .append(",\n\t\"eventMetadata\": ")
                .append(eventMetadata)
                .append('}')
                .toString();
    }
}