package com.bullhornsdk.data.model.entity.core.standard;

import java.util.Objects;

import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.EffectiveDateEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "dateAdded", "dateLastModified", "placementShiftSetID", "effectiveDate", "effectiveEndDate", "isFirst",
    "shifts"})
public class PlacementShiftSetVersion extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity, EffectiveDateEntity {

    private Integer id;
    private Integer placementShiftSetID;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private String effectiveDate;
    private String effectiveEndDate;
    private Boolean isFirst;
    private OneToMany<Shift> shifts;


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

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("effectiveEndDate")
    public String getEffectiveEndDate() {
        return effectiveEndDate;
    }

    @JsonProperty("effectiveEndDate")
    public void setEffectiveEndDate(String effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    @JsonProperty("isFirst")
    public Boolean getIsFirst() {
        return isFirst;
    }

    @JsonProperty("isFirst")
    public void setIsFirst(Boolean isFirst) {
        this.isFirst = isFirst;
    }

    @JsonProperty("placementShiftSetID")
    public Integer getPlacementShiftSetID() {
        return placementShiftSetID;
    }

    @JsonProperty("placementShiftSetID")
    public void setPlacementShiftSetID(Integer placementShiftSetID) {
        this.placementShiftSetID = placementShiftSetID;
    }

    public OneToMany<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(OneToMany<Shift> shifts) {
        this.shifts = shifts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlacementShiftSetVersion that = (PlacementShiftSetVersion) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(effectiveDate, that.effectiveDate) &&
            Objects.equals(effectiveEndDate, that.effectiveEndDate) &&
            Objects.equals(isFirst, that.isFirst);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateAdded, dateLastModified, effectiveDate, effectiveEndDate, isFirst);
    }

    @Override
    public String toString() {
        return "DiscountRateVersion{" +
            "id=" + id +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", effectiveDate=" + effectiveDate +
            ", effectiveEndDate=" + effectiveEndDate +
            ", isFirst=" + isFirst +
            '}';
    }
}
