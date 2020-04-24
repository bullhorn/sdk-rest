package com.bullhornsdk.data.model.entity.core.paybill;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created by fayranne.lipton 4/8/2020
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "externalAccountNumber", "externalAccountName", "externalAccountType",
    "externalAccountDetailType", "isPay", "isBill",
    "isAccountsReceivable", "isActive", "isDeleted", "dateAdded",
    "dateLastModified" })
public class GeneralLedgerAccount implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, DateLastModifiedEntity  {

    private Integer id;

    private String externalAccountNumber;

    @Size(max = 100)
    private String externalAccountName;

    @Size(max = 100)
    private String externalAccountType;

    @Size(max = 100)
    private String externalAccountDetailType;

    private Boolean isPay;

    private Boolean isBill;

    private Boolean isAccountsReceivable;

    private Boolean isActive;

    private Boolean isDeleted;

    private DateTime dateAdded;

    private DateTime dateLastModified;

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

    @JsonProperty("externalAccountNumber")
    public String getExternalAccountNumber() {
        return externalAccountNumber;
    }

    @JsonIgnore
    public void setExternalAccountNumber(String externalAccountNumber) {
        this.externalAccountNumber = externalAccountNumber;
    }

    @JsonProperty("externalAccountName")
    public String getExternalAccountName() {
        return externalAccountName;
    }

    @JsonIgnore
    public void setExternalAccountName(String externalAccountName) {
        this.externalAccountName = externalAccountName;
    }

    @JsonProperty("externalAccountType")
    public String getExternalAccountType() {
        return externalAccountType;
    }

    @JsonIgnore
    public void setExternalAccountType(String externalAccountType) {
        this.externalAccountType = externalAccountType;
    }

    @JsonProperty("externalAccountDetailType")
    public String getExternalAccountDetailType() {
        return externalAccountDetailType;
    }

    @JsonIgnore
    public void setExternalAccountDetailType(String externalAccountDetailType) {
        this.externalAccountDetailType = externalAccountDetailType;
    }

    @JsonProperty("isPay")
    public Boolean getIsPay() {
        return isPay;
    }

    @JsonProperty("isPay")
    public void setIsPay(Boolean pay) {
        isPay = pay;
    }

    @JsonProperty("isBill")
    public Boolean getIsBill() {
        return isBill;
    }

    @JsonProperty("isBill")
    public void setIsBill(Boolean bill) {
        isBill = bill;
    }

    @JsonProperty("isAccountsReceivable")
    public Boolean getIsAccountsReceivable() {
        return isAccountsReceivable;
    }

    @JsonProperty("isAccountsReceivable")
    public void setIsAccountsReceivable(Boolean accountsReceivable) {
        isAccountsReceivable = accountsReceivable;
    }

    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setIsActive(Boolean active) {
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

    @ReadOnly
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
        GeneralLedgerAccount that = (GeneralLedgerAccount) o;
        return isDeleted == that.isDeleted &&
            Objects.equals(id, that.id) &&
            Objects.equals(externalAccountNumber, that.externalAccountNumber) &&
            Objects.equals(externalAccountName, that.externalAccountName) &&
            Objects.equals(externalAccountType, that.externalAccountType) &&
            Objects.equals(externalAccountDetailType, that.externalAccountDetailType) &&
            Objects.equals(isPay, that.isPay) &&
            Objects.equals(isBill, that.isBill) &&
            Objects.equals(isAccountsReceivable, that.isAccountsReceivable) &&
            Objects.equals(isActive, that.isActive) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, externalAccountNumber, externalAccountName, externalAccountType, externalAccountDetailType, isPay, isBill, isAccountsReceivable, isActive, isDeleted, dateAdded, dateLastModified);
    }

    @Override
    public String toString() {
        return "GeneralLedgerAccount{" +
            "id=" + id +
            ", externalAccountNumber='" + externalAccountNumber + '\'' +
            ", externalAccountName='" + externalAccountName + '\'' +
            ", externalAccountType='" + externalAccountType + '\'' +
            ", externalAccountDetailType='" + externalAccountDetailType + '\'' +
            ", isPay=" + isPay +
            ", isBill=" + isBill +
            ", isAccountsReceivable=" + isAccountsReceivable +
            ", isActive=" + isActive +
            ", isDeleted=" + isDeleted +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            '}';
    }
}
