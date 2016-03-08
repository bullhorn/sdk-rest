package com.bullhornsdk.data.model.response.event.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.response.event.GetLastRequestIdResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by john.sullivan on 17/2/2016.
 */
@JsonPropertyOrder({ "result" })
public class StandardGetLastRequestIdResponse extends AbstractEntity implements GetLastRequestIdResponse {

    private Integer result;

    @Override
    @JsonProperty("result")
    public Integer getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Integer result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return new StringBuilder("StandardGetLastRequestIdResponse {")
                .append("\n\t\"result\": ")
                .append(result)
                .append('}')
                .toString();
    }
}
