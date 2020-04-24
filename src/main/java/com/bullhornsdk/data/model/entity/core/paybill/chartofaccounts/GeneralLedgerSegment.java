package com.bullhornsdk.data.model.entity.core.paybill.chartofaccounts;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;

/**
 * Created by mkesmetzis 21-Apr-20
 */

public class GeneralLedgerSegment implements QueryEntity, UpdateEntity, SoftDeleteEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity {

    private Integer id;

    @Size(max = 100)
    private String externalSegmentName;

    @Size(max = 100)
    private String externalSegmentNumber;

    private GeneralLedgerSegmentType generalLedgerSegmentType; //TODO

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

}
