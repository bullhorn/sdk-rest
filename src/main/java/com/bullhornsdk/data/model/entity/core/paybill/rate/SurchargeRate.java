package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.model.entity.core.paybill.earncode.EarnCode;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.*;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "amount", "dateAdded", "dateLastModified", "earnCodes", "effectiveDate", "effectiveEndDate", "generalLedgerAccount",
    "generalLedgerSegment1", "generalLedgerSegment2", "generalLedgerSegment3", "generalLedgerSegment4", "generalLedgerSegment5", "generalLedgerServiceCode",
    "isDeleted", "isFirst", "owner", "rate", "status", "title", "type", "versionID"
})
public class SurchargeRate extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity, SoftDeleteEntity {

    private Integer id;
    private BigDecimal amount;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private OneToMany<EarnCode> earnCodes;
    private DateTime effectiveDate;
    private DateTime effectiveEndDate;
    private GeneralLedgerAccount generalLedgerAccount;
    private GeneralLedgerSegment1 generalLedgerSegment1;
    private GeneralLedgerSegment2 generalLedgerSegment2;
    private GeneralLedgerSegment3 generalLedgerSegment3;
    private GeneralLedgerSegment4 generalLedgerSegment4;
    private GeneralLedgerSegment5 generalLedgerSegment5;
    private GeneralLedgerServiceCode generalLedgerServiceCode;
    private Boolean isDeleted;
    private Boolean isFirst;
    private CorporateUser owner;
    private BigDecimal rate;
    private SimplifiedOptionsLookup status;
    private String title;
    private SimplifiedOptionsLookup type;
    private Integer versionID;

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

    @JsonProperty("amount")
    public BigDecimal getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    @JsonProperty("earnCodes")
    public OneToMany<EarnCode> getEarnCodes() {
        return earnCodes;
    }

    @JsonProperty("earnCodes")
    public void setEarnCodes(OneToMany<EarnCode> earnCodes) {
        this.earnCodes = earnCodes;
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

    @JsonProperty("generalLedgerAccount")
    public GeneralLedgerAccount getGeneralLedgerAccount() {
        return generalLedgerAccount;
    }

    @JsonProperty("generalLedgerAccount")
    public void setGeneralLedgerAccount(GeneralLedgerAccount generalLedgerAccount) {
        this.generalLedgerAccount = generalLedgerAccount;
    }

    @JsonProperty("generalLedgerSegment1")
    public GeneralLedgerSegment1 getGeneralLedgerSegment1() {
        return generalLedgerSegment1;
    }

    @JsonProperty("generalLedgerSegment1")
    public void setGeneralLedgerSegment1(GeneralLedgerSegment1 generalLedgerSegment1) {
        this.generalLedgerSegment1 = generalLedgerSegment1;
    }

    @JsonProperty("generalLedgerSegment2")
    public GeneralLedgerSegment2 getGeneralLedgerSegment2() {
        return generalLedgerSegment2;
    }

    @JsonProperty("generalLedgerSegment2")
    public void setGeneralLedgerSegment2(GeneralLedgerSegment2 generalLedgerSegment2) {
        this.generalLedgerSegment2 = generalLedgerSegment2;
    }

    @JsonProperty("generalLedgerSegment3")
    public GeneralLedgerSegment3 getGeneralLedgerSegment3() {
        return generalLedgerSegment3;
    }

    @JsonProperty("generalLedgerSegment3")
    public void setGeneralLedgerSegment3(GeneralLedgerSegment3 generalLedgerSegment3) {
        this.generalLedgerSegment3 = generalLedgerSegment3;
    }

    @JsonProperty("generalLedgerSegment4")
    public GeneralLedgerSegment4 getGeneralLedgerSegment4() {
        return generalLedgerSegment4;
    }

    @JsonProperty("generalLedgerSegment4")
    public void setGeneralLedgerSegment4(GeneralLedgerSegment4 generalLedgerSegment4) {
        this.generalLedgerSegment4 = generalLedgerSegment4;
    }

    @JsonProperty("generalLedgerSegment5")
    public GeneralLedgerSegment5 getGeneralLedgerSegment5() {
        return generalLedgerSegment5;
    }

    @JsonProperty("generalLedgerSegment5")
    public void setGeneralLedgerSegment5(GeneralLedgerSegment5 generalLedgerSegment5) {
        this.generalLedgerSegment5 = generalLedgerSegment5;
    }

    @JsonProperty("generalLedgerServiceCode")
    public GeneralLedgerServiceCode getGeneralLedgerServiceCode() {
        return generalLedgerServiceCode;
    }

    @JsonProperty("generalLedgerServiceCode")
    public void setGeneralLedgerServiceCode(GeneralLedgerServiceCode generalLedgerServiceCode) {
        this.generalLedgerServiceCode = generalLedgerServiceCode;
    }

    @Override
    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @JsonProperty("isFirst")
    public Boolean getIsFirst() {
        return isFirst;
    }

    @JsonProperty("isFirst")
    public void setIsFirst(Boolean first) {
        isFirst = first;
    }

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @JsonProperty("rate")
    public BigDecimal getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @JsonProperty("status")
    public SimplifiedOptionsLookup getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(SimplifiedOptionsLookup status) {
        this.status = status;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("type")
    public SimplifiedOptionsLookup getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(SimplifiedOptionsLookup type) {
        this.type = type;
    }

    @JsonProperty("versionID")
    public Integer getVersionID() {
        return versionID;
    }

    @JsonProperty("versionID")
    public void setVersionID(Integer versionID) {
        this.versionID = versionID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SurchargeRate that = (SurchargeRate) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(amount, that.amount) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(earnCodes, that.earnCodes) &&
            Objects.equals(effectiveDate, that.effectiveDate) &&
            Objects.equals(effectiveEndDate, that.effectiveEndDate) &&
            Objects.equals(generalLedgerAccount, that.generalLedgerAccount) &&
            Objects.equals(generalLedgerSegment1, that.generalLedgerSegment1) &&
            Objects.equals(generalLedgerSegment2, that.generalLedgerSegment2) &&
            Objects.equals(generalLedgerSegment3, that.generalLedgerSegment3) &&
            Objects.equals(generalLedgerSegment4, that.generalLedgerSegment4) &&
            Objects.equals(generalLedgerSegment5, that.generalLedgerSegment5) &&
            Objects.equals(generalLedgerServiceCode, that.generalLedgerServiceCode) &&
            Objects.equals(isDeleted, that.isDeleted) &&
            Objects.equals(isFirst, that.isFirst) &&
            Objects.equals(owner, that.owner) &&
            Objects.equals(rate, that.rate) &&
            Objects.equals(status, that.status) &&
            Objects.equals(title, that.title) &&
            Objects.equals(type, that.type) &&
            Objects.equals(versionID, that.versionID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, dateAdded, dateLastModified, earnCodes, effectiveDate, effectiveEndDate, generalLedgerAccount, generalLedgerSegment1, generalLedgerSegment2, generalLedgerSegment3, generalLedgerSegment4, generalLedgerSegment5, generalLedgerServiceCode, isDeleted, isFirst, owner, rate, status, title, type, versionID);
    }

    @Override
    public String toString() {
        return "SurchargeRate{" +
            "id=" + id +
            ", amount=" + amount +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", earnCodes=" + earnCodes +
            ", effectiveDate=" + effectiveDate +
            ", effectiveEndDate=" + effectiveEndDate +
            ", generalLedgerAccount=" + generalLedgerAccount +
            ", generalLedgerSegment1=" + generalLedgerSegment1 +
            ", generalLedgerSegment2=" + generalLedgerSegment2 +
            ", generalLedgerSegment3=" + generalLedgerSegment3 +
            ", generalLedgerSegment4=" + generalLedgerSegment4 +
            ", generalLedgerSegment5=" + generalLedgerSegment5 +
            ", generalLedgerServiceCode=" + generalLedgerServiceCode +
            ", isDeleted=" + isDeleted +
            ", isFirst=" + isFirst +
            ", owner=" + owner +
            ", rate=" + rate +
            ", status=" + status +
            ", title='" + title + '\'' +
            ", type=" + type +
            ", versionID=" + versionID +
            '}';
    }
}
