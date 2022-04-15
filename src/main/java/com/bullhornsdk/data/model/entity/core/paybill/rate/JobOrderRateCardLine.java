package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.model.entity.core.paybill.earncode.EarnCode;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.EditHistoryEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsI;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "alias", "billCurrencyUnit", "billMultiplier", "billRate", "earnCode",
    "customFloat1", "customFloat2", "customFloat3", "customFloat4", "customFloat5",
    "customInt1", "customInt2", "customInt3", "customInt4", "customInt5",
    "customRate1", "customRate2", "customRate3", "customRate4", "customRate5",
    "customText1", "customText2", "customText3", "customText4", "customText5",
    "customText6", "customText7", "customText8", "customText9", "customText10",
    "externalID", "jobOrderRateCardLineGroup", "markupPercent", "markupValue", "migrateGUID",
    "payCurrencyUnit", "payMultiplier", "payRate"})
public class JobOrderRateCardLine extends CustomFieldsI implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {

    private Integer id;

    @Size(max = 100)
    private String alias;

    private CurrencyUnit billCurrencyUnit;

    private BigDecimal billMultiplier;

    private BigDecimal billRate;

    private EarnCode earnCode;

    @Size(max = 100)
    private String externalID;

    private JobOrderRateCardLineGroup jobOrderRateCardLineGroup;

    private BigDecimal markupPercent;

    private BigDecimal markupValue;

    @Size(max = 36)
    private String migrateGUID;

    private CurrencyUnit payCurrencyUnit;

    private BigDecimal payMultiplier;

    private BigDecimal payRate;


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

    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    @JsonProperty("billCurrencyUnit")
    public CurrencyUnit getBillCurrencyUnit() {
        return billCurrencyUnit;
    }

    @JsonProperty("billCurrencyUnit")
    public void setBillCurrencyUnit(CurrencyUnit billCurrencyUnit) {
        this.billCurrencyUnit = billCurrencyUnit;
    }

    @JsonProperty("billMultiplier")
    public BigDecimal getBillMultiplier() {
        return billMultiplier;
    }

    @JsonProperty("billRate")
    public void setBillMultiplier(BigDecimal billMultiplier) {
        this.billMultiplier = billMultiplier;
    }

    @JsonProperty("billRate")
    public BigDecimal getBillRate() {
        return billRate;
    }

    @JsonProperty("billRate")
    public void setBillRate(BigDecimal billRate) {
        this.billRate = billRate;
    }

    @JsonProperty("earnCode")
    public EarnCode getEarnCode() {
        return earnCode;
    }

    @JsonProperty("earnCode")
    public void setEarnCode(EarnCode earnCode) {
        this.earnCode = earnCode;
    }

    @JsonProperty("externalID")
    public String getExternalID() {
        return externalID;
    }

    @JsonProperty("externalID")
    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    @JsonProperty("jobOrderRateCardLineGroup")
    public JobOrderRateCardLineGroup getJobOrderRateCardLineGroup() {
        return jobOrderRateCardLineGroup;
    }

    @JsonProperty("jobOrderRateCardLineGroup")
    public void setJobOrderRateCardLineGroup(JobOrderRateCardLineGroup jobOrderRateCardLineGroup) {
        this.jobOrderRateCardLineGroup = jobOrderRateCardLineGroup;
    }

    @JsonProperty("migrateGUID")
    public String getMigrateGUID() {
        return migrateGUID;
    }

    @JsonProperty("migrateGUID")
    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    @JsonProperty("markupPercent")
    public BigDecimal getMarkupPercent() {
        return markupPercent;
    }

    @JsonProperty("markupPercent")
    public void setMarkupPercent(BigDecimal markupPercent) {
        this.markupPercent = markupPercent;
    }

    @JsonProperty("markupValue")
    public BigDecimal getMarkupValue() {
        return markupValue;
    }

    @JsonProperty("markupValue")
    public void setMarkupValue(BigDecimal markupValue) {
        this.markupValue = markupValue;
    }

    @JsonProperty("payCurrencyUnit")
    public CurrencyUnit getPayCurrencyUnit() {
        return payCurrencyUnit;
    }

    @JsonProperty("payCurrencyUnit")
    public void setPayCurrencyUnit(CurrencyUnit payCurrencyUnit) {
        this.payCurrencyUnit = payCurrencyUnit;
    }

    @JsonProperty("payMultiplier")
    public BigDecimal getPayMultiplier() {
        return payMultiplier;
    }

    @JsonProperty("payMultiplier")
    public void setPayMultiplier(BigDecimal payMultiplier) {
        this.payMultiplier = payMultiplier;
    }

    @JsonProperty("payRate")
    public BigDecimal getPayRate() {
        return payRate;
    }

    @JsonProperty("payRate")
    public void setPayRate(BigDecimal payRate) {
        this.payRate = payRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JobOrderRateCardLine that = (JobOrderRateCardLine) o;
        return Objects.equals(id, that.id) && Objects.equals(alias, that.alias) && Objects.equals(billCurrencyUnit, that.billCurrencyUnit) && Objects.equals(billMultiplier, that.billMultiplier) && Objects.equals(billRate, that.billRate) && Objects.equals(earnCode, that.earnCode) && Objects.equals(externalID, that.externalID) && Objects.equals(jobOrderRateCardLineGroup, that.jobOrderRateCardLineGroup) && Objects.equals(markupPercent, that.markupPercent) && Objects.equals(markupValue, that.markupValue) && Objects.equals(migrateGUID, that.migrateGUID) && Objects.equals(payCurrencyUnit, that.payCurrencyUnit) && Objects.equals(payMultiplier, that.payMultiplier) && Objects.equals(payRate, that.payRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, alias, billCurrencyUnit, billMultiplier, billRate, earnCode, externalID, jobOrderRateCardLineGroup, markupPercent, markupValue, migrateGUID, payCurrencyUnit, payMultiplier, payRate);
    }

    @Override
    public String toString() {
        return "JobOrderRateCardLine{" +
            "id=" + id +
            ", alias='" + alias + '\'' +
            ", billCurrencyUnit=" + billCurrencyUnit +
            ", billMultiplier=" + billMultiplier +
            ", billRate=" + billRate +
            ", earnCode=" + earnCode +
            ", externalID='" + externalID + '\'' +
            ", jobOrderRateCardLineGroup=" + jobOrderRateCardLineGroup +
            ", markupPercent=" + markupPercent +
            ", markupValue=" + markupValue +
            ", migrateGUID='" + migrateGUID + '\'' +
            ", payCurrencyUnit=" + payCurrencyUnit +
            ", payMultiplier=" + payMultiplier +
            ", payRate=" + payRate +
            '}';
    }
}
