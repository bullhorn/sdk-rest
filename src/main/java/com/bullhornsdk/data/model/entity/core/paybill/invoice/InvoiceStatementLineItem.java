package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.BillMasterTransaction;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.paybill.unit.UnitOfMeasure;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by mkesmetzis 23-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "billMasterTransactions", "chargeTypeLookup", "comment", "currencyUnit", "dateAdded", "dateLastModified",
    "description", "discountAmount", "groupByDisplay", "groupBys", "invoiceStatement", "invoiceStatementLineDistributions", "quantity",
    "rate", "subtotal", "summarizeBys", "surchargeAmount", "taxAmount", "total", "unitOfMeasure"
})
public class InvoiceStatementLineItem extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity, AssociationEntity {

    private Integer id;
    private OneToMany<BillMasterTransaction> billMasterTransactions;
    private SimplifiedOptionsLookup chargeTypeLookup;
    @JsonIgnore
    private String comment;
    private CurrencyUnit currencyUnit;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    @JsonIgnore
    private String description;
    private BigDecimal discountAmount;
    @JsonIgnore
    private String groupByDisplay;
    private OneToMany<InvoiceStatementLineItemGroupBy> groupBys;
    private InvoiceStatement invoiceStatement;
    private OneToMany<InvoiceStatementLineDistribution> invoiceStatementLineDistributions;
    private BigDecimal quantity;
    private BigDecimal rate;
    private BigDecimal subtotal;
    private OneToMany<InvoiceStatementLineItemSummarizeBy> summarizeBys;
    private BigDecimal surchargeAmount;
    private BigDecimal taxAmount;
    private BigDecimal total;
    private UnitOfMeasure unitOfMeasure;

    public InvoiceStatementLineItem() {
    }

    public InvoiceStatementLineItem(Integer id) {
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

    @JsonProperty("billMasterTransactions")
    public OneToMany<BillMasterTransaction> getBillMasterTransactions() {
        return billMasterTransactions;
    }

    @JsonProperty("billMasterTransactions")
    public void setBillMasterTransactions(OneToMany<BillMasterTransaction> billMasterTransactions) {
        this.billMasterTransactions = billMasterTransactions;
    }

    @JsonProperty("chargeTypeLookup")
    public SimplifiedOptionsLookup getChargeTypeLookup() {
        return chargeTypeLookup;
    }

    @JsonProperty("chargeTypeLookup")
    public void setChargeTypeLookup(SimplifiedOptionsLookup chargeTypeLookup) {
        this.chargeTypeLookup = chargeTypeLookup;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
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

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @ReadOnly
    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("discountAmount")
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    @JsonProperty("discountAmount")
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    @JsonProperty("groupByDisplay")
    public String getGroupByDisplay() {
        return groupByDisplay;
    }

    @JsonProperty("groupByDisplay")
    public void setGroupByDisplay(String groupByDisplay) {
        this.groupByDisplay = groupByDisplay;
    }

    @JsonProperty("groupBys")
    public OneToMany<InvoiceStatementLineItemGroupBy> getGroupBys() {
        return groupBys;
    }

    @JsonProperty("groupBys")
    public void setGroupBys(OneToMany<InvoiceStatementLineItemGroupBy> groupBys) {
        this.groupBys = groupBys;
    }

    @JsonProperty("invoiceStatement")
    public InvoiceStatement getInvoiceStatement() {
        return invoiceStatement;
    }

    @JsonProperty("invoiceStatement")
    public void setInvoiceStatement(InvoiceStatement invoiceStatement) {
        this.invoiceStatement = invoiceStatement;
    }

    @JsonProperty("invoiceStatementLineDistributions")
    public OneToMany<InvoiceStatementLineDistribution> getInvoiceStatementLineDistributions() {
        return invoiceStatementLineDistributions;
    }

    @JsonProperty("invoiceStatementLineDistributions")
    public void setInvoiceStatementLineDistributions(OneToMany<InvoiceStatementLineDistribution> invoiceStatementLineDistributions) {
        this.invoiceStatementLineDistributions = invoiceStatementLineDistributions;
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

    @JsonProperty("subtotal")
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    @JsonProperty("subtotal")
    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    @JsonProperty("summarizeBys")
    public OneToMany<InvoiceStatementLineItemSummarizeBy> getSummarizeBys() {
        return summarizeBys;
    }

    @JsonProperty("summarizeBys")
    public void setSummarizeBys(OneToMany<InvoiceStatementLineItemSummarizeBy> summarizeBys) {
        this.summarizeBys = summarizeBys;
    }

    @JsonProperty("surchargeAmount")
    public BigDecimal getSurchargeAmount() {
        return surchargeAmount;
    }

    @JsonProperty("surchargeAmount")
    public void setSurchargeAmount(BigDecimal surchargeAmount) {
        this.surchargeAmount = surchargeAmount;
    }

    @JsonProperty("taxAmount")
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    @JsonProperty("taxAmount")
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    @JsonProperty("total")
    public BigDecimal getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(BigDecimal total) {
        this.total = total;
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
        return "InvoiceStatementLineItem{" +
            "id=" + id +
            ", billMasterTransactions=" + billMasterTransactions +
            ", chargeTypeLookup=" + chargeTypeLookup +
            ", comment='" + comment + '\'' +
            ", currencyUnit=" + currencyUnit +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", description='" + description + '\'' +
            ", discountAmount=" + discountAmount +
            ", groupByDisplay='" + groupByDisplay + '\'' +
            ", groupBys=" + groupBys +
            ", invoiceStatement=" + invoiceStatement +
            ", invoiceStatementLineDistributions=" + invoiceStatementLineDistributions +
            ", quantity=" + quantity +
            ", rate=" + rate +
            ", subtotal=" + subtotal +
            ", summarizeBys=" + summarizeBys +
            ", surchargeAmount=" + surchargeAmount +
            ", taxAmount=" + taxAmount +
            ", total=" + total +
            ", unitOfMeasure=" + unitOfMeasure +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceStatementLineItem that = (InvoiceStatementLineItem) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(billMasterTransactions, that.billMasterTransactions) &&
            Objects.equals(chargeTypeLookup, that.chargeTypeLookup) &&
            Objects.equals(comment, that.comment) &&
            Objects.equals(currencyUnit, that.currencyUnit) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(description, that.description) &&
            Objects.equals(discountAmount, that.discountAmount) &&
            Objects.equals(groupByDisplay, that.groupByDisplay) &&
            Objects.equals(groupBys, that.groupBys) &&
            Objects.equals(invoiceStatement, that.invoiceStatement) &&
            Objects.equals(invoiceStatementLineDistributions, that.invoiceStatementLineDistributions) &&
            Objects.equals(quantity, that.quantity) &&
            Objects.equals(rate, that.rate) &&
            Objects.equals(subtotal, that.subtotal) &&
            Objects.equals(summarizeBys, that.summarizeBys) &&
            Objects.equals(surchargeAmount, that.surchargeAmount) &&
            Objects.equals(taxAmount, that.taxAmount) &&
            Objects.equals(total, that.total) &&
            Objects.equals(unitOfMeasure, that.unitOfMeasure);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, billMasterTransactions, chargeTypeLookup, comment, currencyUnit, dateAdded, dateLastModified, description, discountAmount, groupByDisplay, groupBys, invoiceStatement, invoiceStatementLineDistributions, quantity, rate, subtotal, summarizeBys, surchargeAmount, taxAmount, total, unitOfMeasure);
    }
}
