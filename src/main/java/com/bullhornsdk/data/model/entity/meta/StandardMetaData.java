package com.bullhornsdk.data.model.entity.meta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Contains meta data about an entity, such as field maps.
 * 
 * @author magnus.palm
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "entity", "entityMetaUrl", "label", "fields" })
public class StandardMetaData<T extends BullhornEntity> implements MetaData<T> {

    private String entity;

    private String entityMetaUrl;

    private String label;

    private List<Field> fields = new ArrayList<Field>();

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Override
    @JsonProperty("entity")
    public String getEntity() {
        return entity;
    }

    @JsonProperty("entity")
    public void setEntity(String entity) {
        this.entity = entity;
    }

    @Override
    @JsonProperty("entityMetaUrl")
    public String getEntityMetaUrl() {
        return entityMetaUrl;
    }

    @JsonProperty("entityMetaUrl")
    public void setEntityMetaUrl(String entityMetaUrl) {
        this.entityMetaUrl = entityMetaUrl;
    }

    @Override
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    @JsonProperty("fields")
    public List<Field> getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    @JsonIgnore
    @Override
    public Field getField(String fieldName) {
        if (fields == null || fields.isEmpty()) {
            return null;
        }

        if (fieldName == null) {
            fieldName = "";
        }

        for (Field field : fields) {
            if (fieldName.equalsIgnoreCase(field.getName())) {
                return field;
            }
        }

        throw new IllegalArgumentException("No Field exists with name: " + fieldName);
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
        builder.append("StandardMetaData {\nentity=");
        builder.append(entity);
        builder.append(", \nentityMetaUrl=");
        builder.append(entityMetaUrl);
        builder.append(", \nlabel=");
        builder.append(label);
        builder.append(", \nfields=");
        builder.append(fields);
        builder.append(", \nadditionalProperties=");
        builder.append(additionalProperties);
        builder.append("\n}");
        return builder.toString();
    }

}
