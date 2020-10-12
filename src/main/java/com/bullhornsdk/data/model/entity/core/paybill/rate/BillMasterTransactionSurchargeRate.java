package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.model.entity.core.paybill.detail.BillMasterTransactionSurchargeDetail;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.BillMasterTransaction;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
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
@JsonPropertyOrder({"id", "adjustmentSequenceNumber", "baseAmount", "billMasterTransaction", "billMasterTransactionSurchargeDetail", "currencyUnit",
    "dateAdded", "reversalOfTransactionSurchargeRate", "surchargeAmount", "surchargeRate", "surchargeRateVersionID"
})
public class BillMasterTransactionSurchargeRate extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {

    private Integer id;
    private Integer adjustmentSequenceNumber;
    private BigDecimal baseAmount;
    private OneToMany<BillMasterTransaction> billMasterTransaction;
    private BillMasterTransactionSurchargeDetail billMasterTransactionSurchargeDetail;
    private CurrencyUnit currencyUnit;
    private DateTime dateAdded;
    private BillMasterTransactionSurchargeRate reversalOfTransactionSurchargeRate;
    private BigDecimal surchargeAmount;
    private SurchargeRate surchargeRate;
    private Integer surchargeRateVersionID;

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

    @JsonProperty("adjustmentSequenceNumber")
    public Integer getAdjustmentSequenceNumber() {
        return adjustmentSequenceNumber;
    }

    @JsonProperty("adjustmentSequenceNumber")
    public void setAdjustmentSequenceNumber(Integer adjustmentSequenceNumber) {
        this.adjustmentSequenceNumber = adjustmentSequenceNumber;
    }

    @JsonProperty("baseAmount")
    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    @JsonProperty("baseAmount")
    public void setBaseAmount(BigDecimal baseAmount) {
        this.baseAmount = baseAmount;
    }

    @JsonProperty("billMasterTransaction")
    public OneToMany<BillMasterTransaction> getBillMasterTransaction() {
        return billMasterTransaction;
    }

    @JsonProperty("billMasterTransaction")
    public void setBillMasterTransaction(OneToMany<BillMasterTransaction> billMasterTransaction) {
        this.billMasterTransaction = billMasterTransaction;
    }

    @JsonProperty("billMasterTransactionSurchargeDetail")
    public BillMasterTransactionSurchargeDetail getBillMasterTransactionSurchargeDetail() {
        return billMasterTransactionSurchargeDetail;
    }

    @JsonProperty("billMasterTransactionSurchargeDetail")
    public void setBillMasterTransactionSurchargeDetail(BillMasterTransactionSurchargeDetail billMasterTransactionSurchargeDetail) {
        this.billMasterTransactionSurchargeDetail = billMasterTransactionSurchargeDetail;
    }

    @JsonProperty("currencyUnit")
    public CurrencyUnit getCurrencyUnit() {
        return currencyUnit;
    }

    @JsonProperty("currencyUnit")
    public void setCurrencyUnit(CurrencyUnit currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("reversalOfTransactionSurchargeRate")
    public BillMasterTransactionSurchargeRate getReversalOfTransactionSurchargeRate() {
        return reversalOfTransactionSurchargeRate;
    }

    @JsonProperty("reversalOfTransactionSurchargeRate")
    public void setReversalOfTransactionSurchargeRate(BillMasterTransactionSurchargeRate reversalOfTransactionSurchargeRate) {
        this.reversalOfTransactionSurchargeRate = reversalOfTransactionSurchargeRate;
    }

    @JsonProperty("surchargeAmount")
    public BigDecimal getSurchargeAmount() {
        return surchargeAmount;
    }

    @JsonProperty("surchargeAmount")
    public void setSurchargeAmount(BigDecimal surchargeAmount) {
        this.surchargeAmount = surchargeAmount;
    }

    @JsonProperty("surchargeRate")
    public SurchargeRate getSurchargeRate() {
        return surchargeRate;
    }

    @JsonProperty("surchargeRate")
    public void setSurchargeRate(SurchargeRate surchargeRate) {
        this.surchargeRate = surchargeRate;
    }

    @JsonProperty("surchargeRateVersionID")
    public Integer getSurchargeRateVersionID() {
        return surchargeRateVersionID;
    }

    @JsonProperty("surchargeRateVersionID")
    public void setSurchargeRateVersionID(Integer surchargeRateVersionID) {
        this.surchargeRateVersionID = surchargeRateVersionID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillMasterTransactionSurchargeRate that = (BillMasterTransactionSurchargeRate) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(adjustmentSequenceNumber, that.adjustmentSequenceNumber) &&
            Objects.equals(baseAmount, that.baseAmount) &&
            Objects.equals(billMasterTransaction, that.billMasterTransaction) &&
            Objects.equals(billMasterTransactionSurchargeDetail, that.billMasterTransactionSurchargeDetail) &&
            Objects.equals(currencyUnit, that.currencyUnit) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(reversalOfTransactionSurchargeRate, that.reversalOfTransactionSurchargeRate) &&
            Objects.equals(surchargeAmount, that.surchargeAmount) &&
            Objects.equals(surchargeRate, that.surchargeRate) &&
            Objects.equals(surchargeRateVersionID, that.surchargeRateVersionID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adjustmentSequenceNumber, baseAmount, billMasterTransaction, billMasterTransactionSurchargeDetail, currencyUnit, dateAdded, reversalOfTransactionSurchargeRate, surchargeAmount, surchargeRate, surchargeRateVersionID);
    }

    @Override
    public String toString() {
        return "BillMasterTransactionSurchargeRate{" +
            "id=" + id +
            ", adjustmentSequenceNumber=" + adjustmentSequenceNumber +
            ", baseAmount=" + baseAmount +
            ", billMasterTransaction=" + billMasterTransaction +
            ", billMasterTransactionSurchargeDetail=" + billMasterTransactionSurchargeDetail +
            ", currencyUnit=" + currencyUnit +
            ", dateAdded=" + dateAdded +
            ", reversalOfTransactionSurchargeRate=" + reversalOfTransactionSurchargeRate +
            ", surchargeAmount=" + surchargeAmount +
            ", surchargeRate=" + surchargeRate +
            ", surchargeRateVersionID=" + surchargeRateVersionID +
            '}';
    }
}
