package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.model.entity.core.paybill.earncode.EarnCodeGroup;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.validation.constraints.Size;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "earnCodeGroup", "externalID", "isBase", "migrateGUID", "placementRateCard", "placementRateCardLines", "placementRateCardVersion"})
public class PlacementRateCardLineGroup extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {

    private Integer id;

    private OneToMany<EarnCodeGroup> earnCodeGroup;

    @Size(max = 100)
    private String externalID;

    private Boolean isBase;

    @Size(max = 36)
    private String migrateGUID;

    private PlacementRateCard placementRateCard;

    private OneToMany<PlacementRateCardLine> placementRateCardLines;

    private PlacementRateCardVersion placementRateCardVersion;


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

    @JsonProperty("earnCodeGroup")
    public OneToMany<EarnCodeGroup> getEarnCodeGroup() {
        return earnCodeGroup;
    }

    @JsonProperty("earnCodeGroup")
    public void setEarnCodeGroup(OneToMany<EarnCodeGroup> earnCodeGroup) {
        this.earnCodeGroup = earnCodeGroup;
    }

    @JsonProperty("externalID")
    public String getExternalID() {
        return externalID;
    }

    @JsonProperty("externalID")
    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    @JsonProperty("isBase")
    public Boolean getIsBase() {
        return isBase;
    }

    @JsonProperty("isBase")
    public void setIsBase(Boolean base) {
        isBase = base;
    }

    @JsonProperty("migrateGUID")
    public String getMigrateGUID() {
        return migrateGUID;
    }

    @JsonProperty("migrateGUID")
    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    @JsonProperty("placementRateCard")
    public PlacementRateCard getPlacementRateCard() {
        return placementRateCard;
    }

    @JsonProperty("placementRateCard")
    public void setPlacementRateCard(PlacementRateCard placementRateCard) {
        this.placementRateCard = placementRateCard;
    }

    @JsonProperty("placementRateCardLines")
    public OneToMany<PlacementRateCardLine> getPlacementRateCardLines() {
        return placementRateCardLines;
    }

    @JsonProperty("placementRateCardLines")
    public void setPlacementRateCardLines(OneToMany<PlacementRateCardLine> placementRateCardLines) {
        this.placementRateCardLines = placementRateCardLines;
    }

    @JsonProperty("placementRateCardVersion")
    public PlacementRateCardVersion getPlacementRateCardVersion() {
        return placementRateCardVersion;
    }

    @JsonProperty("placementRateCardVersion")
    public void setPlacementRateCardVersion(PlacementRateCardVersion placementRateCardVersion) {
        this.placementRateCardVersion = placementRateCardVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlacementRateCardLineGroup that = (PlacementRateCardLineGroup) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(earnCodeGroup, that.earnCodeGroup) &&
            Objects.equals(externalID, that.externalID) &&
            Objects.equals(isBase, that.isBase) &&
            Objects.equals(migrateGUID, that.migrateGUID) &&
            Objects.equals(placementRateCard, that.placementRateCard) &&
            Objects.equals(placementRateCardLines, that.placementRateCardLines) &&
            Objects.equals(placementRateCardVersion, that.placementRateCardVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, earnCodeGroup, externalID, isBase, migrateGUID, placementRateCard, placementRateCardLines, placementRateCardVersion);
    }

    @Override
    public String toString() {
        return "PlacementRateCardLineGroup{" +
            "id=" + id +
            ", earnCodeGroup=" + earnCodeGroup +
            ", externalID='" + externalID + '\'' +
            ", isBase=" + isBase +
            ", migrateGUID='" + migrateGUID + '\'' +
            ", placementRateCard=" + placementRateCard +
            ", placementRateCardLines=" + placementRateCardLines +
            ", placementRateCardVersion=" + placementRateCardVersion +
            '}';
    }
}
