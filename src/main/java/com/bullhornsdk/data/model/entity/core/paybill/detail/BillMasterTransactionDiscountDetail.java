package com.bullhornsdk.data.model.entity.core.paybill.detail;

import com.bullhornsdk.data.model.entity.core.paybill.rate.BillMasterTransactionDiscountRate;
import com.bullhornsdk.data.model.entity.core.paybill.rate.DiscountRate;
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
@JsonPropertyOrder({"id", "baseAmount", "billMasterTransactionDiscountRates", "calculateAndDisplayOnInvoice", "calculatePriority", "dateAdded",
    "discountRate", "ignoreForSalesTaxCalculations", "rate", "sentToAccountsReceivable", "title"
})
public class BillMasterTransactionDiscountDetail extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {

    private Integer id;
    private BigDecimal baseAmount;
    private OneToMany<BillMasterTransactionDiscountRate> billMasterTransactionDiscountRates;
    private Boolean calculateAndDisplayOnInvoice;
    private Integer calculatePriority;
    private DateTime dateAdded;
    private DiscountRate discountRate;
    private Boolean ignoreForSalesTaxCalculations;
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

    @JsonProperty("billMasterTransactionDiscountRates")
    public OneToMany<BillMasterTransactionDiscountRate> getBillMasterTransactionDiscountRates() {
        return billMasterTransactionDiscountRates;
    }

    @JsonProperty("billMasterTransactionDiscountRates")
    public void setBillMasterTransactionDiscountRates(OneToMany<BillMasterTransactionDiscountRate> billMasterTransactionDiscountRate) {
        this.billMasterTransactionDiscountRates = billMasterTransactionDiscountRate;
    }

    @JsonProperty("calculateAndDisplayOnInvoice")
    public Boolean getCalculateAndDisplayOnInvoice() {
        return calculateAndDisplayOnInvoice;
    }

    @JsonProperty("calculateAndDisplayOnInvoice")
    public void setCalculateAndDisplayOnInvoice(Boolean calculateAndDisplayOnInvoice) {
        this.calculateAndDisplayOnInvoice = calculateAndDisplayOnInvoice;
    }

    @JsonProperty("calculatePriority")
    public Integer getCalculatePriority() {
        return calculatePriority;
    }

    @JsonProperty("calculatePriority")
    public void setCalculatePriority(Integer calculatePriority) {
        this.calculatePriority = calculatePriority;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
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
        BillMasterTransactionDiscountDetail that = (BillMasterTransactionDiscountDetail) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(baseAmount, that.baseAmount) &&
            Objects.equals(billMasterTransactionDiscountRates, that.billMasterTransactionDiscountRates) &&
            Objects.equals(calculateAndDisplayOnInvoice, that.calculateAndDisplayOnInvoice) &&
            Objects.equals(calculatePriority, that.calculatePriority) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(discountRate, that.discountRate) &&
            Objects.equals(ignoreForSalesTaxCalculations, that.ignoreForSalesTaxCalculations) &&
            Objects.equals(rate, that.rate) &&
            Objects.equals(sentToAccountsReceivable, that.sentToAccountsReceivable) &&
            Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, baseAmount, billMasterTransactionDiscountRates, calculateAndDisplayOnInvoice, calculatePriority, dateAdded, discountRate, ignoreForSalesTaxCalculations, rate, sentToAccountsReceivable, title);
    }

    @Override
    public String toString() {
        return "BillMasterTransactionDiscountDetail{" +
            "id=" + id +
            ", baseAmount=" + baseAmount +
            ", billMasterTransactionDiscountRates=" + billMasterTransactionDiscountRates +
            ", calculateAndDisplayOnInvoice=" + calculateAndDisplayOnInvoice +
            ", calculatePriority=" + calculatePriority +
            ", dateAdded=" + dateAdded +
            ", discountRate=" + discountRate +
            ", ignoreForSalesTaxCalculations=" + ignoreForSalesTaxCalculations +
            ", rate=" + rate +
            ", sentToAccountsReceivable=" + sentToAccountsReceivable +
            ", title='" + title + '\'' +
            '}';
    }
}
