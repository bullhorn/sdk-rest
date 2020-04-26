package com.bullhornsdk.data.model.entity.core.paybill.chartofaccounts;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created by mkesmetzis 21-Apr-20
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "dateAdded", "dateLastModified", "externalSegmentName", "externalSegmentNumber", "generalLedgerSegmentType", "isActive", "isDeleted"})
public class GeneralLedgerSegment implements QueryEntity, UpdateEntity, SoftDeleteEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity {

    private Integer id;

    @Size(max = 100)
    private String externalSegmentName;

    @Size(max = 100)
    private String externalSegmentNumber;

    private GeneralLedgerSegmentType generalLedgerSegmentType;

    private Boolean isActive;

    private Boolean isDeleted;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    public GeneralLedgerSegment() {
    }

    public GeneralLedgerSegment(Integer id) {
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

    @JsonProperty("externalSegmentName")
    public String getExternalSegmentName() {
        return externalSegmentName;
    }

    @JsonProperty("externalSegmentName")
    public void setExternalSegmentName(String externalSegmentName) {
        this.externalSegmentName = externalSegmentName;
    }

    @JsonProperty("externalSegmentNumber")
    public String getExternalSegmentNumber() {
        return externalSegmentNumber;
    }

    @JsonProperty("externalSegmentNumber")
    public void setExternalSegmentNumber(String externalSegmentNumber) {
        this.externalSegmentNumber = externalSegmentNumber;
    }

    @JsonProperty("generalLedgerSegmentType")
    public GeneralLedgerSegmentType getGeneralLedgerSegmentType() {
        return generalLedgerSegmentType;
    }

    @JsonIgnore
    public void setGeneralLedgerSegmentType(GeneralLedgerSegmentType generalLedgerSegmentType) {
        this.generalLedgerSegmentType = generalLedgerSegmentType;
    }

    @JsonProperty("isActive")
    public Boolean getActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setActive(Boolean active) {
        isActive = active;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
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

    @ReadOnly
    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneralLedgerSegment that = (GeneralLedgerSegment) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(externalSegmentName, that.externalSegmentName) &&
            Objects.equals(externalSegmentNumber, that.externalSegmentNumber) &&
            Objects.equals(generalLedgerSegmentType, that.generalLedgerSegmentType) &&
            Objects.equals(isActive, that.isActive) &&
            Objects.equals(isDeleted, that.isDeleted) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, externalSegmentName, externalSegmentNumber, generalLedgerSegmentType, isActive, isDeleted, dateAdded, dateLastModified);
    }

    @Override
    public String toString() {
        return "GeneralLedgerSegment{" +
            "id=" + id +
            ", externalSegmentName='" + externalSegmentName + '\'' +
            ", externalSegmentNumber='" + externalSegmentNumber + '\'' +
            ", generalLedgerSegmentType=" + generalLedgerSegmentType +
            ", isActive=" + isActive +
            ", isDeleted=" + isDeleted +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            '}';
    }
}
