package com.bullhornsdk.data.model.entity.core.paybill.master;

import com.bullhornsdk.data.model.entity.core.contractmanagement.earncode.EarnCode;
import com.bullhornsdk.data.model.entity.core.paybill.charge.BillableCharge;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.paybill.unit.UnitOfMeasure;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by mkesmetzis 22-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "amount", "billMaster", "billableCharge", "billingSyncBatch",
    "currencyUnit", "earnCode", "quantity", "rate", "transactionDate", "unitOfMeasure"})
public class BillableTransaction implements QueryEntity {

    private Integer id;

    private BillMaster billMasters;

    private BillableCharge billableCharge;

    private BillingSyncBatch billingSyncBatch;

    private CurrencyUnit currencyUnit;

    private EarnCode earnCode;

    private BigDecimal quantity;

    private BigDecimal rate;

    private Date transactionDate;

    private UnitOfMeasure unitOfMeasure;

    public BillableTransaction() {
    }

    public BillableTransaction(Integer id) {
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

    @JsonProperty("billMasters")
    public BillMaster getBillMasters() {
        return billMasters;
    }

    @JsonProperty("billMasters")
    public void setBillMasters(BillMaster billMasters) {
        this.billMasters = billMasters;
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
    public Date getTransactionDate() {
        return transactionDate;
    }

    @JsonProperty("recordingDate")
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    @JsonProperty("billableCharge")
    public BillableCharge getBillableCharge() {
        return billableCharge;
    }

    @JsonProperty("billableCharge")
    public void setBillableCharge(BillableCharge billableCharge) {
        this.billableCharge = billableCharge;
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

    @JsonProperty("unitOfMeasure")
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    @JsonProperty("unitOfMeasure")
    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }
}
