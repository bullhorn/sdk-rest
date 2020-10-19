package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.model.entity.core.paybill.detail.BillMasterTransactionSalesTaxDetail;
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
@JsonPropertyOrder({"id", "adjustmentSequenceNumber", "baseAmount", "billMasterTransaction", "billMasterTransactionSalesTaxDetail", "currencyUnit",
    "dateAdded", "reversalOfTransactionSalesTaxRate", "salesTaxRateVersionID", "taxAmount"
})
public class BillMasterTransactionSalesTaxRate extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {

    private Integer id;
    private Integer adjustmentSequenceNumber;
    private BigDecimal baseAmount;
    private BillMasterTransaction billMasterTransaction;
    private BillMasterTransactionSalesTaxDetail billMasterTransactionSalesTaxDetail;
    private CurrencyUnit currencyUnit;
    private DateTime dateAdded;
    private BillMasterTransactionSalesTaxRate reversalOfTransactionSalesTaxRate;
    private Integer salesTaxRateVersionID;
    private BigDecimal taxAmount;

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

    @JsonProperty("billMasterTransactionSalesTaxDetail")
    public BillMasterTransactionSalesTaxDetail getBillMasterTransactionSalesTaxDetail() {
        return billMasterTransactionSalesTaxDetail;
    }

    @JsonProperty("billMasterTransactionSalesTaxDetail")
    public void setBillMasterTransactionSalesTaxDetail(BillMasterTransactionSalesTaxDetail billMasterTransactionSalesTaxDetail) {
        this.billMasterTransactionSalesTaxDetail = billMasterTransactionSalesTaxDetail;
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

    @JsonProperty("reversalOfTransactionSalesTaxRate")
    public BillMasterTransactionSalesTaxRate getReversalOfTransactionSalesTaxRate() {
        return reversalOfTransactionSalesTaxRate;
    }

    @JsonProperty("reversalOfTransactionSalesTaxRate")
    public void setReversalOfTransactionSalesTaxRate(BillMasterTransactionSalesTaxRate reversalOfTransactionSalesTaxRate) {
        this.reversalOfTransactionSalesTaxRate = reversalOfTransactionSalesTaxRate;
    }

    @JsonProperty("salesTaxRateVersionID")
    public Integer getSalesTaxRateVersionID() {
        return salesTaxRateVersionID;
    }

    @JsonProperty("salesTaxRateVersionID")
    public void setSalesTaxRateVersionID(Integer salesTaxRateVersionID) {
        this.salesTaxRateVersionID = salesTaxRateVersionID;
    }

    @JsonProperty("taxAmount")
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    @JsonProperty("taxAmount")
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillMasterTransactionSalesTaxRate that = (BillMasterTransactionSalesTaxRate) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(adjustmentSequenceNumber, that.adjustmentSequenceNumber) &&
            Objects.equals(baseAmount, that.baseAmount) &&
            Objects.equals(billMasterTransaction, that.billMasterTransaction) &&
            Objects.equals(billMasterTransactionSalesTaxDetail, that.billMasterTransactionSalesTaxDetail) &&
            Objects.equals(currencyUnit, that.currencyUnit) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(reversalOfTransactionSalesTaxRate, that.reversalOfTransactionSalesTaxRate) &&
            Objects.equals(salesTaxRateVersionID, that.salesTaxRateVersionID) &&
            Objects.equals(taxAmount, that.taxAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adjustmentSequenceNumber, baseAmount, billMasterTransaction, billMasterTransactionSalesTaxDetail, currencyUnit, dateAdded, reversalOfTransactionSalesTaxRate, salesTaxRateVersionID, taxAmount);
    }

    @Override
    public String toString() {
        return "BillMasterTransactionSalesTaxRate{" +
            "id=" + id +
            ", adjustmentSequenceNumber=" + adjustmentSequenceNumber +
            ", baseAmount=" + baseAmount +
            ", billMasterTransaction=" + billMasterTransaction +
            ", billMasterTransactionSalesTaxDetail=" + billMasterTransactionSalesTaxDetail +
            ", currencyUnit=" + currencyUnit +
            ", dateAdded=" + dateAdded +
            ", reversalOfTransactionSalesTaxRate=" + reversalOfTransactionSalesTaxRate +
            ", salesTaxRateVersionID=" + salesTaxRateVersionID +
            ", taxAmount=" + taxAmount +
            '}';
    }
}
