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
@JsonPropertyOrder({"value", "label"})
public class PropertyOptionsResult extends AbstractEntity {

    protected Integer value;

    protected String label;

    @JsonProperty
    public Integer getValue() {
        return value;
    }

    @JsonProperty
    public void setValue(Integer value) {
        this.value = value;
    }

    @JsonProperty
    public String getLabel() {
        return label;
    }

    @JsonProperty
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("value", value)
            .add("label", label)
            .toString();
    }
}
