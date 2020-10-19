package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.model.entity.core.paybill.detail.BillMasterTransactionSurchargeDetail;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatement;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.math.BigDecimal;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "amount", "baseAmount", "billMasterTransactionSurchargeDetail", "invoiceStatement",
    "rate", "surchargeAmount", "surchargeRate", "title"
})
public class InvoiceStatementSurchargeRate extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {

    private Integer id;
    private BigDecimal amount;
    private BigDecimal baseAmount;
    private BillMasterTransactionSurchargeDetail billMasterTransactionSurchargeDetail;
    private InvoiceStatement invoiceStatement;
    private BigDecimal rate;
    private BigDecimal surchargeAmount;
    private SurchargeRate surchargeRate;
    private String title;

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

    @JsonProperty("baseAmount")
    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    @JsonProperty("baseAmount")
    public void setBaseAmount(BigDecimal baseAmount) {
        this.baseAmount = baseAmount;
    }

    @JsonProperty("billMasterTransactionSurchargeDetail")
    public BillMasterTransactionSurchargeDetail getBillMasterTransactionSurchargeDetail() {
        return billMasterTransactionSurchargeDetail;
    }

    @JsonProperty("billMasterTransactionSurchargeDetail")
    public void setBillMasterTransactionSurchargeDetail(BillMasterTransactionSurchargeDetail billMasterTransactionSurchargeDetail) {
        this.billMasterTransactionSurchargeDetail = billMasterTransactionSurchargeDetail;
    }

    @JsonProperty("invoiceStatement")
    public InvoiceStatement getInvoiceStatement() {
        return invoiceStatement;
    }

    @JsonProperty("invoiceStatement")
    public void setInvoiceStatement(InvoiceStatement invoiceStatement) {
        this.invoiceStatement = invoiceStatement;
    }

    @JsonProperty("rate")
    public BigDecimal getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(BigDecimal rate) {
        this.rate = rate;
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

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceStatementSurchargeRate that = (InvoiceStatementSurchargeRate) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(amount, that.amount) &&
            Objects.equals(baseAmount, that.baseAmount) &&
            Objects.equals(billMasterTransactionSurchargeDetail, that.billMasterTransactionSurchargeDetail) &&
            Objects.equals(invoiceStatement, that.invoiceStatement) &&
            Objects.equals(rate, that.rate) &&
            Objects.equals(surchargeAmount, that.surchargeAmount) &&
            Objects.equals(surchargeRate, that.surchargeRate) &&
            Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, baseAmount, billMasterTransactionSurchargeDetail, invoiceStatement, rate, surchargeAmount, surchargeRate, title);
    }

    @Override
    public String toString() {
        return "InvoiceStatementSurchargeRate{" +
            "id=" + id +
            ", amount=" + amount +
            ", baseAmount=" + baseAmount +
            ", billMasterTransactionSurchargeDetail=" + billMasterTransactionSurchargeDetail +
            ", invoiceStatement=" + invoiceStatement +
            ", rate=" + rate +
            ", surchargeAmount=" + surchargeAmount +
            ", surchargeRate=" + surchargeRate +
            ", title='" + title + '\'' +
            '}';
    }
}
