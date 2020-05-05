package com.bullhornsdk.data.model.entity.core.paybill.transaction;

import com.bullhornsdk.data.model.entity.core.paybill.earncode.EarnCode;
import com.bullhornsdk.data.model.entity.core.paybill.charge.PayableCharge;
import com.bullhornsdk.data.model.entity.core.paybill.master.BillingSyncBatch;
import com.bullhornsdk.data.model.entity.core.paybill.master.PayMaster;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.paybill.unit.UnitOfMeasure;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by mkesmetzis 22-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "amount", "billingSyncBatch", "currencyUnit", "earnCode", "payMaster", "payableCharge",
    "quantity", "rate", "transactionDate", "unitOfMeasure"})
public class PayableTransaction implements QueryEntity {

    private Integer id;

    private BigDecimal amount;

    private BillingSyncBatch billingSyncBatch;

    private CurrencyUnit currencyUnit;

    private EarnCode earnCode;

    private PayMaster payMaster;

    private PayableCharge payableCharge;

    private BigDecimal quantity;

    private BigDecimal rate;

    private String transactionDate;

    private UnitOfMeasure unitOfMeasure;

    public PayableTransaction() {
    }

    public PayableTransaction(Integer id) {
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

    @JsonProperty("amount")
    public BigDecimal getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @JsonProperty("currencyUnit")
    public CurrencyUnit getCurrencyUnit() {
        return currencyUnit;
    }

    @JsonProperty("currencyUnit")
    public void setCurrencyUnit(CurrencyUnit currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    @JsonProperty("quantity")
    public BigDecimal getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("rate")
    public BigDecimal getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @JsonProperty("transactionDate")
    public String getTransactionDate() {
        return transactionDate;
    }

    @JsonProperty("recordingDate")
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    @JsonProperty("billingSyncBatch")
    public BillingSyncBatch getBillingSyncBatch() {
        return billingSyncBatch;
    }

    @JsonProperty("billingSyncBatch")
    public void setBillingSyncBatch(BillingSyncBatch billingSyncBatch) {
        this.billingSyncBatch = billingSyncBatch;
    }

    @JsonProperty("earnCode")
    public EarnCode getEarnCode() {
        return earnCode;
    }

    @JsonProperty("earnCode")
    public void setEarnCode(EarnCode earnCode) {
        this.earnCode = earnCode;
    }

    @JsonProperty("payMaster")
    public PayMaster getPayMaster() {
        return payMaster;
    }

    @JsonProperty("payMaster")
    public void setPayMaster(PayMaster payMaster) {
        this.payMaster = payMaster;
    }

    @JsonProperty("payableCharge")
    public PayableCharge getPayableCharge() {
        return payableCharge;
    }

    @JsonProperty("payableCharge")
    public void setPayableCharge(PayableCharge payableCharge) {
        this.payableCharge = payableCharge;
    }

    @JsonProperty("unitOfMeasure")
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    @JsonProperty("unitOfMeasure")
    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    @Override
    public String toString() {
        return "PayableTransaction{" +
            "id=" + id +
            ", amount=" + amount +
            ", billingSyncBatch=" + billingSyncBatch +
            ", currencyUnit=" + currencyUnit +
            ", earnCode=" + earnCode +
            ", payMaster=" + payMaster +
            ", payableCharge=" + payableCharge +
            ", quantity=" + quantity +
            ", rate=" + rate +
            ", transactionDate=" + transactionDate +
            ", unitOfMeasure=" + unitOfMeasure +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayableTransaction that = (PayableTransaction) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(amount, that.amount) &&
            Objects.equals(billingSyncBatch, that.billingSyncBatch) &&
            Objects.equals(currencyUnit, that.currencyUnit) &&
            Objects.equals(earnCode, that.earnCode) &&
            Objects.equals(payMaster, that.payMaster) &&
            Objects.equals(payableCharge, that.payableCharge) &&
            Objects.equals(quantity, that.quantity) &&
            Objects.equals(rate, that.rate) &&
            Objects.equals(transactionDate, that.transactionDate) &&
            Objects.equals(unitOfMeasure, that.unitOfMeasure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, billingSyncBatch, currencyUnit, earnCode, payMaster, payableCharge, quantity, rate, transactionDate, unitOfMeasure);
    }
}
