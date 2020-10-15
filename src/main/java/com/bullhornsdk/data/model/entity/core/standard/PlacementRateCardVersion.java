package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "dateAdded", "dateLastModified", "effectiveDate", "effectiveEndDate", "isFirst", "placementRateCardLineGroups" })
public class PlacementRateCardVersion extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {

    private Integer id;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    private DateTime effectiveDate;

    private DateTime effectiveEndDate;

    private Boolean isFirst;

    private OneToMany<PlacementRateCardLineGroup> placementRateCardLineGroups;

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
    public DateTime getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(DateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("effectiveEndDate")
    public DateTime getEffectiveEndDate() {
        return effectiveEndDate;
    }

    @JsonProperty("effectiveEndDate")
    public void setEffectiveEndDate(DateTime effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    @JsonProperty("isFirst")
    public Boolean getIsFirst() {
        return isFirst;
    }

    @JsonProperty("isFirst")
    public void setIsFirst(Boolean first) {
        isFirst = first;
    }

    @JsonProperty("placementRateCardLineGroups")
    public OneToMany<PlacementRateCardLineGroup> getPlacementRateCardLineGroups() {
        return placementRateCardLineGroups;
    }

    @JsonProperty("placementRateCardLineGroups")
    public void setPlacementRateCardLineGroups(OneToMany<PlacementRateCardLineGroup> placementRateCardLineGroups) {
        this.placementRateCardLineGroups = placementRateCardLineGroups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlacementRateCardVersion that = (PlacementRateCardVersion) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(effectiveDate, that.effectiveDate) &&
            Objects.equals(effectiveEndDate, that.effectiveEndDate) &&
            Objects.equals(isFirst, that.isFirst) &&
            Objects.equals(placementRateCardLineGroups, that.placementRateCardLineGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateAdded, dateLastModified, effectiveDate, effectiveEndDate, isFirst, placementRateCardLineGroups);
    }

    @Override
    public String toString() {
        return "PlacementRateCardVersion{" +
            "id=" + id +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", effectiveDate=" + effectiveDate +
            ", effectiveEndDate=" + effectiveEndDate +
            ", isFirst=" + isFirst +
            ", placementRateCardLineGroups=" + placementRateCardLineGroups +
            '}';
    }
}
