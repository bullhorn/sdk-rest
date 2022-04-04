package com.bullhornsdk.data.model.entity.core.customentities;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import java.util.Objects;

public class CustomEntityType extends AbstractEntity implements QueryEntity , DateLastModifiedEntity, UpdateEntity, CreateEntity, HardDeleteEntity, EditHistoryEntity {

    private Integer id;

    private String name;

    private DateTime dateAdded;

    private DateTime dateLastModified;


    @JsonProperty("id")
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    @JsonProperty("id")
    public void setId(Integer customEntityTypeID) {
        this.id = customEntityTypeID;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }


    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomEntityType)) return false;
        CustomEntityType that = (CustomEntityType) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(dateAdded, that.dateAdded) && Objects.equals(dateLastModified, that.dateLastModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateAdded, dateLastModified);
    }

    @Override
    public String toString() {
        return "CustomEntityType{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            '}';
    }
}
