package com.bullhornsdk.data.model.response.event.standard;

import java.util.List;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.response.event.GetEventsResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by john.sullivan on 17/2/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "requestId", "events" })
public class StandardGetEventsResponse extends AbstractEntity implements GetEventsResponse<StandardEvent> {

    private Integer requestId;
    private List<StandardEvent> events;

    @Override
    @JsonProperty("requestId")
    public Integer getRequestId() {
        return requestId;
    }

    @JsonProperty("requestId")
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    @Override
    @JsonProperty("events")
    public List<StandardEvent> getEvents() {
        return events;
    }

    @JsonProperty("events")
    public void setEvents(List<StandardEvent> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return new StringBuilder("StandardGetEventsResponse {")
                .append("\n\t\"requestId\": ")
                .append(requestId)
                .append(",\n\t\"events\": ")
                .append(events)
                .append('}')
                .toString();
    }
}
