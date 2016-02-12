package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;

/**
 *
 * @author vzeltser
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"entityId", "entityType", "title", "byLine", "location"})
public class FastFindResult extends AbstractEntity {

    protected Integer entityId;

    protected String entityType;

    protected String title;

    protected String byLine;

    protected String location;

    @JsonProperty
    public Integer getEntityId() {
        return entityId;
    }

    @JsonProperty
    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    @JsonProperty
    public String getEntityType() {
        return entityType;
    }

    @JsonProperty
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @JsonProperty
    public String getTitle() {
        return title;
    }

    @JsonProperty
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty
    public String getByLine() {
        return byLine;
    }

    @JsonProperty
    public void setByLine(String byLine) {
        this.byLine = byLine;
    }

    @JsonProperty
    public String getLocation() {
        return location;
    }

    @JsonProperty
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("entityId", entityId)
                .add("entityType", entityType)
                .add("title", title)
                .add("byLine", byLine)
                .add("location", location)
                .toString();
    }
}
