package com.bullhornsdk.data.model.entity.core.standard;

import java.util.Objects;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.EditHistoryEntity;
import com.bullhornsdk.data.model.entity.core.type.EffectiveDateEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "placement", "dateAdded", "dateLastModified", "effectiveDate", "effectiveEndDate", "isDeleted", "isFirst", "versionID", "versions",
    "owner", "shifts"})
public class PlacementShiftSet extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity,
    SoftDeleteEntity, EffectiveDateEntity, AssociationEntity {

    private Integer id;
    private Placement placement;
    private Boolean isDeleted;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private String effectiveDate;
    private String effectiveEndDate;
    private Boolean isFirst;
    private Integer versionID;
    private OneToMany<PlacementShiftSetVersion> versions;
    private CorporateUser owner;
    private OneToMany<Shift> shifts;

    public PlacementShiftSet() {
    }

    public PlacementShiftSet(Integer id) {
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

    @JsonProperty("placement")
    public Placement getPlacement() {
        return placement;
    }

    @JsonProperty("placement")
    public void setPlacement(Placement placement) {
        this.placement = placement;
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

    @Override
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("isFirst")
    public Boolean getIsFirst() {
        return isFirst;
    }

    @JsonProperty("isFirst")
    public void setIsFirst(Boolean isFirst) {
        this.isFirst = isFirst;
    }

    @JsonProperty("versionID")
    public Integer getVersionID() {
        return versionID;
    }

    @JsonProperty("versionID")
    public void setVersionID(Integer versionID) {
        this.versionID = versionID;
    }

    @JsonProperty("versions")
    public OneToMany<PlacementShiftSetVersion> getVersions() {
        return versions;
    }

    @JsonProperty("versions")
    public void setVersions(OneToMany<PlacementShiftSetVersion> versions) {
        this.versions = versions;
    }

    public CorporateUser getOwner() {
        return owner;
    }

    public void setOwner(CorporateUser owner) {
        this.owner = owner;
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
        PlacementShiftSet that = (PlacementShiftSet) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(placement, that.placement) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(effectiveDate, that.effectiveDate) &&
            Objects.equals(effectiveEndDate, that.effectiveEndDate) &&
            Objects.equals(isDeleted, that.isDeleted) &&
            Objects.equals(isFirst, that.isFirst) &&
            Objects.equals(versionID, that.versionID) &&
            Objects.equals(versions, that.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, placement, dateAdded, dateLastModified, effectiveDate, effectiveEndDate, isDeleted, isFirst, versionID, versions);
    }

    @Override
    public String toString() {
        return "PlacementShiftSet{" +
            "id=" + id +
            ", placement=" + placement +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", effectiveDate=" + effectiveDate +
            ", effectiveEndDate=" + effectiveEndDate +
            ", isDeleted=" + isDeleted +
            ", isFirst=" + isFirst +
            ", versionID=" + versionID +
            ", versions=" + versions +
            '}';
    }
}
