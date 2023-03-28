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
@JsonPropertyOrder({"id", "name", "display", "edsEntityTypes"})
public class EdsSourceSystem implements QueryEntity, UpdateEntity, CreateEntity {
    private Integer id;
    private String name;
    private String display;
    private OneToMany<EdsEntityType> entityTypes;

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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("display")
    public String getDisplay() {
        return display;
    }

    @JsonProperty("display")
    public void setDisplay(String display) {
        this.display = display;
    }

    @JsonProperty("edsEntityTypes")
    public OneToMany<EdsEntityType> getEntityTypes() {
        return entityTypes;
    }

    @JsonProperty("edsEntityTypes")
    public void setEntityTypes(OneToMany<EdsEntityType> entityTypes) {
        this.entityTypes = entityTypes;
    }

    @Override
    public String toString() {
        return "EntityTypeSchemaVersion{" +
            "id=" + id +
            ", name =" + name +
            ", display =" + display +
            ", edsEntityTypes =" + entityTypes +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EdsSourceSystem that = (EdsSourceSystem) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(name, that.name) &&
            Objects.equals(display, that.display) &&
            Objects.equals(entityTypes, that.entityTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            display,
            entityTypes);
    }
}
