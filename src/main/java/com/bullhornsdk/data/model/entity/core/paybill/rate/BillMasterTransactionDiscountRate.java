package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.model.entity.core.paybill.detail.BillMasterTransactionDiscountDetail;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.BillMasterTransaction;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
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
@JsonPropertyOrder({"id", "adjustmentSequenceNumber", "baseAmount", "billMasterTransaction", "billMasterTransactionDiscountDetail", "currencyUnit",
    "dateAdded", "discountAmount", "discountRate", "discountRateVersionID", "reversalOfTransactionDiscountRate"
})
public class BillMasterTransactionDiscountRate extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {

    private Integer id;
    private Integer adjustmentSequenceNumber;
    private BigDecimal baseAmount;
    private BillMasterTransaction billMasterTransaction;
    private BillMasterTransactionDiscountDetail billMasterTransactionDiscountDetail;
    private CurrencyUnit currencyUnit;
    private DateTime dateAdded;
    private BigDecimal discountAmount;
    private DiscountRate discountRate;
    private Integer discountRateVersionID;
    private BillMasterTransactionDiscountRate reversalOfTransactionDiscountRate;

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
    public BillMasterTransaction getBillMasterTransaction() {
        return billMasterTransaction;
    }

    @JsonProperty("billMasterTransaction")
    public void setBillMasterTransaction(BillMasterTransaction billMasterTransaction) {
        this.billMasterTransaction = billMasterTransaction;
    }

    @JsonProperty("billMasterTransactionDiscountDetail")
    public BillMasterTransactionDiscountDetail getBillMasterTransactionDiscountDetail() {
        return billMasterTransactionDiscountDetail;
    }

    @JsonProperty("billMasterTransactionDiscountDetail")
    public void setBillMasterTransactionDiscountDetail(BillMasterTransactionDiscountDetail billMasterTransactionDiscountDetail) {
        this.billMasterTransactionDiscountDetail = billMasterTransactionDiscountDetail;
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

    @JsonProperty("discountAmount")
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    @JsonProperty("discountAmount")
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    @JsonProperty("discountRate")
    public DiscountRate getDiscountRate() {
        return discountRate;
    }

    @JsonProperty("discountRate")
    public void setDiscountRate(DiscountRate discountRate) {
        this.discountRate = discountRate;
    }

    @JsonProperty("discountRateVersionID")
    public Integer getDiscountRateVersionID() {
        return discountRateVersionID;
    }

    @JsonProperty("discountRateVersionID")
    public void setDiscountRateVersionID(Integer discountRateVersionID) {
        this.discountRateVersionID = discountRateVersionID;
    }

    @JsonProperty("reversalOfTransactionDiscountRate")
    public BillMasterTransactionDiscountRate getReversalOfTransactionDiscountRate() {
        return reversalOfTransactionDiscountRate;
    }

    @JsonProperty("reversalOfTransactionDiscountRate")
    public void setReversalOfTransactionDiscountRate(BillMasterTransactionDiscountRate reversalOfTransactionDiscountRate) {
        this.reversalOfTransactionDiscountRate = reversalOfTransactionDiscountRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillMasterTransactionDiscountRate that = (BillMasterTransactionDiscountRate) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(adjustmentSequenceNumber, that.adjustmentSequenceNumber) &&
            Objects.equals(baseAmount, that.baseAmount) &&
            Objects.equals(billMasterTransaction, that.billMasterTransaction) &&
            Objects.equals(billMasterTransactionDiscountDetail, that.billMasterTransactionDiscountDetail) &&
            Objects.equals(currencyUnit, that.currencyUnit) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(discountAmount, that.discountAmount) &&
            Objects.equals(discountRate, that.discountRate) &&
            Objects.equals(discountRateVersionID, that.discountRateVersionID) &&
            Objects.equals(reversalOfTransactionDiscountRate, that.reversalOfTransactionDiscountRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adjustmentSequenceNumber, baseAmount, billMasterTransaction, billMasterTransactionDiscountDetail, currencyUnit, dateAdded, discountAmount, discountRate, discountRateVersionID, reversalOfTransactionDiscountRate);
    }

    @Override
    public String toString() {
        return "BillMasterTransactionDiscountRate{" +
            "id=" + id +
            ", adjustmentSequenceNumber=" + adjustmentSequenceNumber +
            ", baseAmount=" + baseAmount +
            ", billMasterTransaction=" + billMasterTransaction +
            ", billMasterTransactionDiscountDetail=" + billMasterTransactionDiscountDetail +
            ", currencyUnit=" + currencyUnit +
            ", dateAdded=" + dateAdded +
            ", discountAmount=" + discountAmount +
            ", discountRate=" + discountRate +
            ", discountRateVersionID=" + discountRateVersionID +
            ", reversalOfTransactionDiscountRate=" + reversalOfTransactionDiscountRate +
            '}';
    }
}
