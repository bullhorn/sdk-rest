package com.bullhornsdk.data.model.response.subscribe.standard;

import com.bullhornsdk.data.model.response.subscribe.UnsubscribeToEventsResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Standard implementation of {@link UnsubscribeToEventsResponse}
 *
 * @author Maarten Oortwijn
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StandardUnsubscribeToEventsResponse implements UnsubscribeToEventsResponse {

    private Boolean result;

    @Override
    @JsonProperty("result")
    public Boolean getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Boolean result) {
        this.result = result;
    }
}
