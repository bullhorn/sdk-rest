package com.bullhornsdk.data.model.response.list;

import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.core.standard.PropertyOptionsResult;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"data"})
public class PropertyOptionsListWrapper {

    public PropertyOptionsListWrapper() {
        super();
    }

    public PropertyOptionsListWrapper(List<PropertyOptionsResult> data) {
        super();
        this.data = data;
    }

    @JsonProperty("data")
    private List<PropertyOptionsResult> data = new ArrayList<PropertyOptionsResult>();

    @JsonProperty("data")
    public List<PropertyOptionsResult> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<PropertyOptionsResult> data) {
        this.data = data;
    }
}
