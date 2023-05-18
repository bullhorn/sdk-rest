package com.bullhornsdk.data.model.response.single;

import com.bullhornsdk.data.model.response.file.standard.StandardFileContent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({ "File" })
public class StandardFileContentWrapper {

    @JsonProperty("File")
    private StandardFileContent file;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("File")
    public StandardFileContent getFile() {
        return this.file;
    }

    @JsonProperty("File")
    public void setFile(StandardFileContent file) {
        this.file = file;
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
        builder.append(file);
        builder.append(", \nadditionalProperties=");
        builder.append(additionalProperties);
        builder.append("\n}");
        return builder.toString();
    }
}
