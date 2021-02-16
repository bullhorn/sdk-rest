package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.model.entity.core.paybill.generalledger.*;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
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
@JsonPropertyOrder({"id", "amount", "dateAdded", "dateLastModified", "effectiveDate", "effectiveEndDate", "generalLedgerAccount",
    "generalLedgerSegment1", "generalLedgerSegment2", "generalLedgerSegment3", "generalLedgerSegment4", "generalLedgerSegment5", "generalLedgerServiceCode",
    "isDeleted", "isFirst", "jurisdictionName", "jurisdictionType", "label", "owner", "rate", "reportingCodeName", "salesTaxRate",
    "source", "stateID", "status", "taxType", "type"
})
public class AllSalesTaxRate extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity,
    SoftDeleteEntity, EffectiveDateEntity, AssociationEntity {

    private Integer id;
    private BigDecimal amount;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private String effectiveDate;
    private String effectiveEndDate;
    private GeneralLedgerAccount generalLedgerAccount;
    private GeneralLedgerSegment1 generalLedgerSegment1;
    private GeneralLedgerSegment2 generalLedgerSegment2;
    private GeneralLedgerSegment3 generalLedgerSegment3;
    private GeneralLedgerSegment4 generalLedgerSegment4;
    private GeneralLedgerSegment5 generalLedgerSegment5;
    private GeneralLedgerServiceCode generalLedgerServiceCode;
    private Boolean isDeleted;
    private Boolean isFirst;
    private String jurisdictionName;
    private SimplifiedOptionsLookup jurisdictionType;
    private String label;
    private CorporateUser owner;
    private BigDecimal rate;
    private String reportingCodeName;
    private SalesTaxRate salesTaxRate;
    private SimplifiedOptionsLookup source;
    private Integer stateID;
    private SimplifiedOptionsLookup status;
    private SimplifiedOptionsLookup taxType;
    private SimplifiedOptionsLookup type;

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

    @ReadOnly
    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
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
    public void setIsFirst(Boolean isFirst) {
        this.isFirst = isFirst;
    }

    @JsonProperty("jurisdictionName")
    public String getJurisdictionName() {
        return jurisdictionName;
    }

    @JsonProperty("jurisdictionName")
    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
    }

    @JsonProperty("jurisdictionType")
    public SimplifiedOptionsLookup getJurisdictionType() {
        return jurisdictionType;
    }

    @JsonProperty("jurisdictionType")
    public void setJurisdictionType(SimplifiedOptionsLookup jurisdictionType) {
        this.jurisdictionType = jurisdictionType;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
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

    @JsonProperty("reportingCodeName")
    public String getReportingCodeName() {
        return reportingCodeName;
    }

    @JsonProperty("reportingCodeName")
    public void setReportingCodeName(String reportingCodeName) {
        this.reportingCodeName = reportingCodeName;
    }

    @JsonProperty("salesTaxRate")
    public SalesTaxRate getSalesTaxRate() {
        return salesTaxRate;
    }

    @JsonProperty("salesTaxRate")
    public void setSalesTaxRate(SalesTaxRate salesTaxRate) {
        this.salesTaxRate = salesTaxRate;
    }

    @JsonProperty("source")
    public SimplifiedOptionsLookup getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(SimplifiedOptionsLookup source) {
        this.source = source;
    }

    @JsonProperty("stateID")
    public Integer getStateID() {
        return stateID;
    }

    @JsonProperty("stateID")
    public void setStateID(Integer stateID) {
        this.stateID = stateID;
    }

    @JsonProperty("status")
    public SimplifiedOptionsLookup getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(SimplifiedOptionsLookup status) {
        this.status = status;
    }

    @JsonProperty("taxType")
    public SimplifiedOptionsLookup getTaxType() {
        return taxType;
    }

    @JsonProperty("taxType")
    public void setTaxType(SimplifiedOptionsLookup taxType) {
        this.taxType = taxType;
    }

    @JsonProperty("type")
    public SimplifiedOptionsLookup getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(SimplifiedOptionsLookup type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllSalesTaxRate that = (AllSalesTaxRate) o;
        return Objects.equals(id, that.id) && Objects.equals(amount, that.amount) && Objects.equals(dateAdded, that.dateAdded) && Objects.equals(dateLastModified, that.dateLastModified) && Objects.equals(effectiveDate, that.effectiveDate) && Objects.equals(effectiveEndDate, that.effectiveEndDate) && Objects.equals(generalLedgerAccount, that.generalLedgerAccount) && Objects.equals(generalLedgerSegment1, that.generalLedgerSegment1) && Objects.equals(generalLedgerSegment2, that.generalLedgerSegment2) && Objects.equals(generalLedgerSegment3, that.generalLedgerSegment3) && Objects.equals(generalLedgerSegment4, that.generalLedgerSegment4) && Objects.equals(generalLedgerSegment5, that.generalLedgerSegment5) && Objects.equals(generalLedgerServiceCode, that.generalLedgerServiceCode) && Objects.equals(isDeleted, that.isDeleted) && Objects.equals(isFirst, that.isFirst) && Objects.equals(jurisdictionName, that.jurisdictionName) && Objects.equals(jurisdictionType, that.jurisdictionType) && Objects.equals(label, that.label) && Objects.equals(owner, that.owner) && Objects.equals(rate, that.rate) && Objects.equals(reportingCodeName, that.reportingCodeName) && Objects.equals(salesTaxRate, that.salesTaxRate) && Objects.equals(source, that.source) && Objects.equals(stateID, that.stateID) && Objects.equals(status, that.status) && Objects.equals(taxType, that.taxType) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, dateAdded, dateLastModified, effectiveDate, effectiveEndDate, generalLedgerAccount, generalLedgerSegment1, generalLedgerSegment2, generalLedgerSegment3, generalLedgerSegment4, generalLedgerSegment5, generalLedgerServiceCode, isDeleted, isFirst, jurisdictionName, jurisdictionType, label, owner, rate, reportingCodeName, salesTaxRate, source, stateID, status, taxType, type);
    }

    @Override
    public String toString() {
        return "AllSalesTaxRate{" +
            "id=" + id +
            ", amount=" + amount +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
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
            ", jurisdictionName='" + jurisdictionName + '\'' +
            ", jurisdictionType=" + jurisdictionType +
            ", label='" + label + '\'' +
            ", owner=" + owner +
            ", rate=" + rate +
            ", reportingCodeName='" + reportingCodeName + '\'' +
            ", salesTaxRate=" + salesTaxRate +
            ", source=" + source +
            ", stateID=" + stateID +
            ", status=" + status +
            ", taxType=" + taxType +
            ", type=" + type +
            '}';
    }
}
