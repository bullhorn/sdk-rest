package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import java.util.Objects;

/**
 * Created by fayranne.lipton 4/3/2020
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "dateAdded", "dateLastModified", "isDeleted", "label"
})
public class CalendarFrequencyLookup extends CustomFieldsB implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity {

    private Integer id;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private Boolean isDeleted;
    @JsonIgnore
    private String label;

    public CalendarFrequencyLookup() {
    }

    public CalendarFrequencyLookup(Integer id) {
        this.id = id;
    }

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @ReadOnly
    @Override
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("isDeleted")
    public Boolean getDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CalendarFrequencyLookup that = (CalendarFrequencyLookup) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(isDeleted, that.isDeleted) &&
            Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), id, dateAdded, dateLastModified, isDeleted, label);
    }

    @Override
    public String toString() {
        return "CalendarFrequencyLookup{" +
            "id=" + id +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", isDeleted=" + isDeleted +
            ", label='" + label + '\'' +
            '}';
    }
}
