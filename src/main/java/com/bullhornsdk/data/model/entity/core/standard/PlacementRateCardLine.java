package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.paybill.earncode.EarnCode;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "alias", "billCurrencyUnit", "billRate", "earnCode", "externalID", "migrateGUID", "payCurrencyUnit", "payRate", "placementRateCardLineGroup" })
public class PlacementRateCardLine extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlacementRateCardLine that = (PlacementRateCardLine) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(alias, that.alias) &&
            Objects.equals(billCurrencyUnit, that.billCurrencyUnit) &&
            Objects.equals(earnCode, that.earnCode) &&
            Objects.equals(externalID, that.externalID) &&
            Objects.equals(migrateGUID, that.migrateGUID) &&
            Objects.equals(payCurrencyUnit, that.payCurrencyUnit) &&
            Objects.equals(payRate, that.payRate) &&
            Objects.equals(placementRateCardLineGroup, that.placementRateCardLineGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, alias, billCurrencyUnit, earnCode, externalID, migrateGUID, payCurrencyUnit, payRate, placementRateCardLineGroup);
    }

    @Override
    public String toString() {
        return "PlacementRateCardLine{" +
            "id=" + id +
            ", alias='" + alias + '\'' +
            ", billCurrencyUnit=" + billCurrencyUnit +
            ", earnCode=" + earnCode +
            ", externalID='" + externalID + '\'' +
            ", migrateGUID='" + migrateGUID + '\'' +
            ", payCurrencyUnit=" + payCurrencyUnit +
            ", payRate=" + payRate +
            ", placementRateCardLineGroup=" + placementRateCardLineGroup +
            '}';
    }
}
