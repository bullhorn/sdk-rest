package com.bullhornsdk.data.model.response.single;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({ "data" })
public class StandardWrapper<T extends BullhornEntity> implements Wrapper<T> {

    @JsonProperty("data")
    private T data;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Override
    @JsonProperty("data")
    public T getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(T data) {
        this.data = data;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Wrapper {\ndata=");
        builder.append(data);
        builder.append(", \nadditionalProperties=");
        builder.append(additionalProperties);
        builder.append("\n}");
        return builder.toString();
    }

}