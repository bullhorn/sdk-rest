package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.model.entity.core.paybill.detail.BillMasterTransactionDiscountDetail;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementLineItem;
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
@JsonPropertyOrder({"id", "baseAmount", "billMasterTransactionDiscountDetail", "calculateAndDisplayOnInvoice", "discountAmount", "discountRate",
    "ignoreForSalesTaxCalculations", "invoiceStatementLineItem", "rate", "sentToAccountsReceivable", "title"
})
public class InvoiceStatementLineItemDiscountRate extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {

    private Integer id;
    private BigDecimal baseAmount;
    private BillMasterTransactionDiscountDetail billMasterTransactionDiscountDetail;
    private Boolean calculateAndDisplayOnInvoice;
    private BigDecimal discountAmount;
    private DiscountRate discountRate;
    private Boolean ignoreForSalesTaxCalculations;
    private InvoiceStatementLineItem invoiceStatementLineItem;
    private BigDecimal rate;
    private Boolean sentToAccountsReceivable;
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

    @JsonProperty("baseAmount")
    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    @JsonProperty("baseAmount")
    public void setBaseAmount(BigDecimal baseAmount) {
        this.baseAmount = baseAmount;
    }

    @JsonProperty("billMasterTransactionDiscountDetail")
    public BillMasterTransactionDiscountDetail getBillMasterTransactionDiscountDetail() {
        return billMasterTransactionDiscountDetail;
    }

    @JsonProperty("billMasterTransactionDiscountDetail")
    public void setBillMasterTransactionDiscountDetail(BillMasterTransactionDiscountDetail billMasterTransactionDiscountDetail) {
        this.billMasterTransactionDiscountDetail = billMasterTransactionDiscountDetail;
    }

    @JsonProperty("calculateAndDisplayOnInvoice")
    public Boolean getCalculateAndDisplayOnInvoice() {
        return calculateAndDisplayOnInvoice;
    }

    @JsonProperty("calculateAndDisplayOnInvoice")
    public void setCalculateAndDisplayOnInvoice(Boolean calculateAndDisplayOnInvoice) {
        this.calculateAndDisplayOnInvoice = calculateAndDisplayOnInvoice;
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

    @JsonProperty("ignoreForSalesTaxCalculations")
    public Boolean getIgnoreForSalesTaxCalculations() {
        return ignoreForSalesTaxCalculations;
    }

    @JsonProperty("ignoreForSalesTaxCalculations")
    public void setIgnoreForSalesTaxCalculations(Boolean ignoreForSalesTaxCalculations) {
        this.ignoreForSalesTaxCalculations = ignoreForSalesTaxCalculations;
    }

    @JsonProperty("invoiceStatementLineItem")
    public InvoiceStatementLineItem getInvoiceStatementLineItem() {
        return invoiceStatementLineItem;
    }

    @JsonProperty("invoiceStatementLineItem")
    public void setInvoiceStatementLineItem(InvoiceStatementLineItem invoiceStatementLineItem) {
        this.invoiceStatementLineItem = invoiceStatementLineItem;
    }

    @JsonProperty("rate")
    public BigDecimal getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @JsonProperty("sentToAccountsReceivable")
    public Boolean getSentToAccountsReceivable() {
        return sentToAccountsReceivable;
    }

    @JsonProperty("sentToAccountsReceivable")
    public void setSentToAccountsReceivable(Boolean sentToAccountsReceivable) {
        this.sentToAccountsReceivable = sentToAccountsReceivable;
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
        InvoiceStatementLineItemDiscountRate that = (InvoiceStatementLineItemDiscountRate) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(baseAmount, that.baseAmount) &&
            Objects.equals(billMasterTransactionDiscountDetail, that.billMasterTransactionDiscountDetail) &&
            Objects.equals(calculateAndDisplayOnInvoice, that.calculateAndDisplayOnInvoice) &&
            Objects.equals(discountAmount, that.discountAmount) &&
            Objects.equals(discountRate, that.discountRate) &&
            Objects.equals(ignoreForSalesTaxCalculations, that.ignoreForSalesTaxCalculations) &&
            Objects.equals(invoiceStatementLineItem, that.invoiceStatementLineItem) &&
            Objects.equals(rate, that.rate) &&
            Objects.equals(sentToAccountsReceivable, that.sentToAccountsReceivable) &&
            Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, baseAmount, billMasterTransactionDiscountDetail, calculateAndDisplayOnInvoice, discountAmount, discountRate, ignoreForSalesTaxCalculations, invoiceStatementLineItem, rate, sentToAccountsReceivable, title);
    }

    @Override
    public String toString() {
        return "InvoiceStatementLineItemDiscountRate{" +
            "id=" + id +
            ", baseAmount=" + baseAmount +
            ", billMasterTransactionDiscountDetail=" + billMasterTransactionDiscountDetail +
            ", calculateAndDisplayOnInvoice=" + calculateAndDisplayOnInvoice +
            ", discountAmount=" + discountAmount +
            ", discountRate=" + discountRate +
            ", ignoreForSalesTaxCalculations=" + ignoreForSalesTaxCalculations +
            ", invoiceStatementLineItem=" + invoiceStatementLineItem +
            ", rate=" + rate +
            ", sentToAccountsReceivable=" + sentToAccountsReceivable +
            ", title='" + title + '\'' +
            '}';
    }
}
