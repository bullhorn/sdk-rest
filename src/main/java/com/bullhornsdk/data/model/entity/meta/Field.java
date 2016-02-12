package com.bullhornsdk.data.model.entity.meta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "type", "dataType", "label", "associatedEntity", "maxLength", "options" })
public class Field {

    private String name;

    private String type;

    private String dataType;

    private String label;

    private StandardMetaData<?> associatedEntity;

    private Integer maxLength;

    private List<Option> options = new ArrayList<Option>();

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("dataType")
    public String getDataType() {
        return dataType;
    }

    @JsonProperty("dataType")
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("associatedEntity")
    public StandardMetaData<?> getAssociatedEntity() {
        return associatedEntity;
    }

    @JsonProperty("associatedEntity")
    public void setAssociatedEntity(StandardMetaData<?> associatedEntity) {
        this.associatedEntity = associatedEntity;
    }

    @JsonProperty("maxLength")
    public Integer getMaxLength() {
        return maxLength;
    }

    @JsonProperty("maxLength")
    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    @JsonProperty("options")
    public List<Option> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<Option> options) {
        this.options = options;
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
        builder.append("Field {\nname=");
        builder.append(name);
        builder.append(", \ntype=");
        builder.append(type);
        builder.append(", \ndataType=");
        builder.append(dataType);
        builder.append(", \nlabel=");
        builder.append(label);
        builder.append(", \nassociatedEntity=");
        builder.append(associatedEntity);
        builder.append(", \nmaxLength=");
        builder.append(maxLength);
        builder.append(", \noptions=");
        builder.append(options);
        builder.append(", \nadditionalProperties=");
        builder.append(additionalProperties);
        builder.append("\n}");
        return builder.toString();
    }

}
