package com.bullhornsdk.data.model.entity.core.eds;

import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "description", "edsData", "entityType", "schema"})
public class EdsEntityTypeSchemaVersion implements QueryEntity, UpdateEntity, CreateEntity {
    private Integer id;
    private String description;
    private OneToMany<EdsData> edsData;
    private EdsEntityType entityType;
    private String schema;

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @Override
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("edsData")
    public OneToMany<EdsData> getEdsData() {
        return edsData;
    }

    @JsonProperty("edsData")
    public void setEdsData(OneToMany<EdsData> edsData) {
        this.edsData = edsData;
    }

    @JsonProperty("entityType")
    public EdsEntityType getEntityType() {
        return entityType;
    }

    @JsonProperty("entityType")
    public void setEntityType(EdsEntityType entityType) {
        this.entityType = entityType;
    }

    @JsonProperty("schema")
    public String getSchema() {
        return schema;
    }

    @JsonProperty("schema")
    public void setSchema(String schema) {
        this.schema = schema;
    }

    @Override
    public String toString() {
        return "EntityTypeSchemaVersion{" +
            "id=" + id +
            ", description =" + description +
            ", edsData =" + edsData +
            ", entityType =" + entityType +
            ", schema =" + schema +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EdsEntityTypeSchemaVersion that = (EdsEntityTypeSchemaVersion) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(description, that.description) &&
            Objects.equals(edsData, that.edsData) &&
            Objects.equals(entityType, that.entityType) &&
            Objects.equals(schema, that.schema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            description,
            edsData,
            entityType,
            schema);
    }
}
