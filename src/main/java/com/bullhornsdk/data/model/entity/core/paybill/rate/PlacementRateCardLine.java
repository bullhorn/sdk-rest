package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.model.entity.core.paybill.earncode.EarnCode;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsI;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "alias", "billCurrencyUnit", "billRate", "earnCode",
    "customFloat1", "customFloat2", "customFloat3", "customFloat4", "customFloat5",
    "customInt1", "customInt2", "customInt3", "customInt4", "customInt5",
    "customRate1", "customRate2", "customRate3", "customRate4", "customRate5",
    "customText1", "customText2", "customText3", "customText4", "customText5",
    "customText6", "customText7", "customText8", "customText9", "customText10",
    "externalID", "migrateGUID", "payCurrencyUnit", "payRate", "placementRateCardLineGroup",
    "payMultiplier", "billMultiplier", "markupPercent", "markupValue", "dateLastModified"})
public class PlacementRateCardLine extends CustomFieldsI implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity {

    private Integer id;

    @Size(max = 100)
    private String alias;

    private CurrencyUnit billCurrencyUnit;

    private BigDecimal billRate;

    private EarnCode earnCode;

    @Size(max = 100)
    private String externalID;

    @Size(max = 36)
    private String migrateGUID;

    private CurrencyUnit payCurrencyUnit;

    private BigDecimal payRate;

    private PlacementRateCardLineGroup placementRateCardLineGroup;

    private BigDecimal payMultiplier;

    private BigDecimal billMultiplier;

    private BigDecimal markupPercent;

    private BigDecimal markupValue;

    private DateTime dateLastModified;

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

    @JsonProperty("earnCode")
    public EarnCode getEarnCode() {
        return earnCode;
    }

    @JsonProperty("earnCode")
    public void setEarnCode(EarnCode earnCode) {
        this.earnCode = earnCode;
    }

    @JsonProperty("billRate")
    public BigDecimal getBillRate() {
        return billRate;
    }

    @JsonProperty("billRate")
    public void setBillRate(BigDecimal billRate) {
        this.billRate = billRate;
    }

    @JsonProperty("externalID")
    public String getExternalID() {
        return externalID;
    }

    @JsonProperty("externalID")
    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    @JsonProperty("migrateGUID")
    public String getMigrateGUID() {
        return migrateGUID;
    }

    @JsonProperty("migrateGUID")
    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    @JsonProperty("payCurrencyUnit")
    public CurrencyUnit getPayCurrencyUnit() {
        return payCurrencyUnit;
    }

    @JsonProperty("payCurrencyUnit")
    public void setPayCurrencyUnit(CurrencyUnit payCurrencyUnit) {
        this.payCurrencyUnit = payCurrencyUnit;
    }

    @JsonProperty("payRate")
    public BigDecimal getPayRate() {
        return payRate;
    }

    @JsonProperty("payRate")
    public void setPayRate(BigDecimal payRate) {
        this.payRate = payRate;
    }

    @JsonProperty("placementRateCardLineGroup")
    public PlacementRateCardLineGroup getPlacementRateCardLineGroup() {
        return placementRateCardLineGroup;
    }

    @JsonProperty("placementRateCardLineGroup")
    public void setPlacementRateCardLineGroup(PlacementRateCardLineGroup placementRateCardLineGroup) {
        this.placementRateCardLineGroup = placementRateCardLineGroup;
    }

    public BigDecimal getPayMultiplier() {
        return payMultiplier;
    }

    public void setPayMultiplier(BigDecimal payMultiplier) {
        this.payMultiplier = payMultiplier;
    }

    public BigDecimal getBillMultiplier() {
        return billMultiplier;
    }

    public void setBillMultiplier(BigDecimal billMultiplier) {
        this.billMultiplier = billMultiplier;
    }

    public BigDecimal getMarkupPercent() {
        return markupPercent;
    }

    public void setMarkupPercent(BigDecimal markupPercent) {
        this.markupPercent = markupPercent;
    }

    public BigDecimal getMarkupValue() {
        return markupValue;
    }

    public void setMarkupValue(BigDecimal markupValue) {
        this.markupValue = markupValue;
    }

    @Override
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PlacementRateCardLine that = (PlacementRateCardLine) o;
        return Objects.equals(id, that.id) && Objects.equals(alias, that.alias) && Objects.equals(billCurrencyUnit, that.billCurrencyUnit) && Objects.equals(billRate, that.billRate) && Objects.equals(earnCode, that.earnCode) && Objects.equals(externalID, that.externalID) && Objects.equals(migrateGUID, that.migrateGUID) && Objects.equals(payCurrencyUnit, that.payCurrencyUnit) && Objects.equals(payRate, that.payRate) && Objects.equals(placementRateCardLineGroup, that.placementRateCardLineGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, alias, billCurrencyUnit, billRate, earnCode, externalID, migrateGUID, payCurrencyUnit, payRate, placementRateCardLineGroup);
    }

    @Override
    public String toString() {
        return "PlacementRateCardLine{" +
            "id=" + id +
            ", alias='" + alias + '\'' +
            ", billCurrencyUnit=" + billCurrencyUnit +
            ", billRate=" + billRate +
            ", earnCode=" + earnCode +
            ", externalID='" + externalID + '\'' +
            ", migrateGUID='" + migrateGUID + '\'' +
            ", payCurrencyUnit=" + payCurrencyUnit +
            ", payRate=" + payRate +
            ", placementRateCardLineGroup=" + placementRateCardLineGroup +
            '}';
    }

}
