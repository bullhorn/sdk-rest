package com.bullhornsdk.data.model.response.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bullhornsdk.data.model.entity.meta.Option;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class OptionListWrapper {

    @JsonProperty("data")
    private List<Option> data = new ArrayList<Option>();

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public OptionListWrapper() {
        super();
    }

    public OptionListWrapper(Option[] data) {
        super();
        this.data = Arrays.asList(data);
    }


    @JsonProperty("data")
    public List<Option> getData() {
        return data;
    }


    @JsonProperty("data")
    public void setData(Option[] data) {
        this.data = Arrays.asList(data);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Options {\ndata=");
        builder.append(data);
        builder.append(", \nadditionalProperties=");
        builder.append(additionalProperties);
        builder.append("\n}");
        return builder.toString();
    }

}
