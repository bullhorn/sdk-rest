package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "dateAdded", "dateLastModified", "effectiveDate", "effectiveEndDate", "owner", "placement", "placementRateCardLineGroups", "rootExternalID", "rootMigrateGUID", "versionID", "versions" })
public class PlacementRateCard extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity, EditHistoryEntity {

    private Integer id;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    private DateTime effectiveDate;

    private DateTime effectiveEndDate;

    private CorporateUser owner;

    private Placement placement;

    private OneToMany<PlacementRateCardLineGroup> placementRateCardLineGroups;

    @Size(max = 100)
    private String rootExternalID;

    @Size(max = 36)
    private String rootMigrateGUID;

    private Integer versionID;

    private OneToMany<PlacementRateCardVersion> versions;


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

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @JsonProperty("placement")
    public Placement getPlacement() {
        return placement;
    }

    @JsonProperty("placement")
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    @JsonProperty("placementRateCardLineGroups")
    public OneToMany<PlacementRateCardLineGroup> getPlacementRateCardLineGroups() {
        return placementRateCardLineGroups;
    }

    @JsonProperty("placementRateCardLineGroups")
    public void setPlacementRateCardLineGroups(OneToMany<PlacementRateCardLineGroup> placementRateCardLineGroups) {
        this.placementRateCardLineGroups = placementRateCardLineGroups;
    }

    @JsonProperty("rootExternalID")
    public String getRootExternalID() {
        return rootExternalID;
    }

    @JsonProperty("rootExternalID")
    public void setRootExternalID(String rootExternalID) {
        this.rootExternalID = rootExternalID;
    }

    @JsonProperty("rootMigrateGUID")
    public String getRootMigrateGUID() {
        return rootMigrateGUID;
    }

    @JsonProperty("rootMigrateGUID")
    public void setRootMigrateGUID(String rootMigrateGUID) {
        this.rootMigrateGUID = rootMigrateGUID;
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
    public OneToMany<PlacementRateCardVersion> getVersions() {
        return versions;
    }

    @JsonProperty("versions")
    public void setVersions(OneToMany<PlacementRateCardVersion> versions) {
        this.versions = versions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlacementRateCard that = (PlacementRateCard) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(effectiveDate, that.effectiveDate) &&
            Objects.equals(effectiveEndDate, that.effectiveEndDate) &&
            Objects.equals(owner, that.owner) &&
            Objects.equals(placement, that.placement) &&
            Objects.equals(placementRateCardLineGroups, that.placementRateCardLineGroups) &&
            Objects.equals(rootExternalID, that.rootExternalID) &&
            Objects.equals(rootMigrateGUID, that.rootMigrateGUID) &&
            Objects.equals(versionID, that.versionID) &&
            Objects.equals(versions, that.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateAdded, dateLastModified, effectiveDate, effectiveEndDate, owner, placement, placementRateCardLineGroups, rootExternalID, rootMigrateGUID, versionID, versions);
    }


}
