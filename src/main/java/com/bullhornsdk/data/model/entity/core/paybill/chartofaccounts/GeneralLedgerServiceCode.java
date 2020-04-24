package com.bullhornsdk.data.model.entity.core.paybill.chartofaccounts;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;

/**
 * Created by mkesmetzis 22-Apr-20
 */
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "externalServiceCodeNumber", "externalServiceCodeName", "isActive", "isDeleted", "dateAdded", "dateLastModified"})
public class GeneralLedgerServiceCode implements QueryEntity, UpdateEntity, SoftDeleteEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity {

    private Integer id;

    private Integer externalServiceCodeNumber;

    @Size(max = 100)
    private String externalServiceCodeName;

    private Boolean isActive;

    private Boolean isDeleted;

    private DateTime dateAdded;

    private DateTime dateLastModified;


    public GeneralLedgerServiceCode() {
    }

    public GeneralLedgerServiceCode(Integer id) {
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

    @JsonProperty("externalServiceCodeNumber")
    public Integer getExternalServiceCodeNumber() {
        return externalServiceCodeNumber;
    }

    @JsonProperty("externalServiceCodeNumber")
    public void setExternalServiceCodeNumber(Integer externalServiceCodeNumber) {
        this.externalServiceCodeNumber = externalServiceCodeNumber;
    }

    @JsonProperty("externalServiceCodeName")
    public String getExternalServiceCodeName() {
        return externalServiceCodeName;
    }

    @JsonProperty("externalServiceCodeName")
    public void setExternalServiceCodeName(String externalServiceCodeName) {
        this.externalServiceCodeName = externalServiceCodeName;
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
