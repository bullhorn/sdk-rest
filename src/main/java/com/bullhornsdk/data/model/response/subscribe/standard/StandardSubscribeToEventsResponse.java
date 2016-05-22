package com.bullhornsdk.data.model.response.subscribe.standard;

import com.bullhornsdk.data.model.response.subscribe.SubscribeToEventsResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.joda.time.DateTime;

/**
 * Standard implementation of {@link SubscribeToEventsResponse}
 *
 * @author Maarten Oortwijn
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"lastRequestId", "subscriptionId", "createdOn", "jmsSelector"})
public class StandardSubscribeToEventsResponse implements SubscribeToEventsResponse {

    private Integer lastRequestId;

    private String subscriptionId;

    private DateTime createdOn;

    private String jmsSelector;

    @Override
    @JsonProperty("jmsSelector")
    public String getJmsSelector() {
        return jmsSelector;
    }

    @JsonProperty("jmsSelector")
    public void setJmsSelector(String jmsSelector) {
        this.jmsSelector = jmsSelector;
    }

    @Override
    @JsonProperty("createdOn")
    public DateTime getCreatedOn() {
        return createdOn;
    }

    @JsonProperty("createdOn")
    public void setCreatedOn(DateTime createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    @JsonProperty("subscriptionId")
    public String getSubscriptionId() {
        return subscriptionId;
    }

    @JsonProperty("subscriptionId")
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    @Override
    @JsonProperty("lastRequestId")
    public Integer getLastRequestId() {
        return lastRequestId;
    }

    @JsonProperty("lastRequestId")
    public void setLastRequestId(Integer lastRequestId) {
        this.lastRequestId = lastRequestId;
    }

}
