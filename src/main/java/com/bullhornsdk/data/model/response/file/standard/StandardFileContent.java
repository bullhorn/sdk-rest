package com.bullhornsdk.data.model.response.file.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.response.file.FileContent;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "File")
@JsonPropertyOrder({ "contentType", "fileContent", "name" })
public class StandardFileContent extends AbstractEntity implements FileContent {

    @JsonIgnore
    private Integer id;

    private String contentType;

    private String fileContent;

    private String name;

    @JsonIgnore
    @Override
    public Integer getId() {
        return id;
    }

    @JsonIgnore
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    @JsonProperty("fileContent")
    public String getFileContent() {
        return fileContent;
    }

    @JsonProperty("fileContent")
    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    @Override
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" {\n\"contentType\":\"");
        builder.append(contentType);
        builder.append("\", \nfileContent\":\"");
        builder.append(fileContent);
        builder.append("\", \nname\":\"");
        builder.append(name);
        builder.append("\", \ngetAdditionalProperties()\":\"");
        builder.append(getAdditionalProperties());
        builder.append("\n}");
        return builder.toString();
    }

}
