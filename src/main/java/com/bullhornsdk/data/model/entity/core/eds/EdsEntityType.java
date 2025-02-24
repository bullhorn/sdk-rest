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
@JsonPropertyOrder({"id", "sourceSystem", "edsData", "edsEntityTypeSchemaVersions", "name", "display", "isPrivate"})
public class EdsEntityType implements QueryEntity, UpdateEntity, CreateEntity {
    private Integer id;
    private EdsSourceSystem sourceSystem;
    private OneToMany<EdsData> edsData;
    private OneToMany<EdsEntityTypeSchemaVersion> edsEntityTypeSchemaVersions;
    private String name;
    private String display;
    private Boolean isPrivate;

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

    @JsonProperty("sourceSystem")
    public EdsSourceSystem getSourceSystem() {
        return sourceSystem;
    }

    @JsonProperty("sourceSystem")
    public void setSourceSystem(EdsSourceSystem sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    @JsonProperty("edsData")
    public OneToMany<EdsData> getEdsData() {
        return edsData;
    }

    @JsonProperty("edsData")
    public void setEdsData(OneToMany<EdsData> edsData) {
        this.edsData = edsData;
    }

    @JsonProperty("edsEntityTypeSchemaVersions")
    public OneToMany<EdsEntityTypeSchemaVersion> getEdsEntityTypeSchemaVersions() {
        return edsEntityTypeSchemaVersions;
    }

    @JsonProperty("edsEntityTypeSchemaVersions")
    public void setEdsEntityTypeSchemaVersions(OneToMany<EdsEntityTypeSchemaVersion> edsEntityTypeSchemaVersions) {
        this.edsEntityTypeSchemaVersions = edsEntityTypeSchemaVersions;
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

    @JsonProperty("isPrivate")
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    @JsonProperty("isPrivate")
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EdsEntityType that = (EdsEntityType) o;
        return Objects.equals(id, that.id) && Objects.equals(sourceSystem, that.sourceSystem) && Objects.equals(edsData, that.edsData) && Objects.equals(edsEntityTypeSchemaVersions, that.edsEntityTypeSchemaVersions) && Objects.equals(name, that.name) && Objects.equals(display, that.display) && Objects.equals(isPrivate, that.isPrivate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sourceSystem, edsData, edsEntityTypeSchemaVersions, name, display, isPrivate);
    }

    @Override
    public String toString() {
        return "EdsEntityType{" +
            "id=" + id +
            ", sourceSystem=" + sourceSystem +
            ", edsData=" + edsData +
            ", edsEntityTypeSchemaVersions=" + edsEntityTypeSchemaVersions +
            ", name='" + name + '\'' +
            ", display='" + display + '\'' +
            ", isPrivate=" + isPrivate +
            '}';
    }
}
