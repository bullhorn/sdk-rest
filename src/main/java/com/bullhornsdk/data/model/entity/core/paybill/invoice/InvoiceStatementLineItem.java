package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.paybill.master.BillMasterTransaction;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * Created by mkesmetzis 23-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "billMasterTransactions", "comment", "currencyUnit", "dateAdded", "dateLastModified",
    "description", "groupByDisplay", "groupBys", "invoiceStatement", "quantity", "rate", "subtotal", "summarizeBys",
    "taxAmount", "total"
})
public class InvoiceStatementLineItem extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity {

    private Integer id;
    private OneToMany<BillMasterTransaction> billMasterTransactions;
    @JsonIgnore
    private String comment;
    private CurrencyUnit currencyUnit;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    @JsonIgnore
    private String description;
    @JsonIgnore
    private String groupByDisplay;
    private OneToMany<InvoiceStatementLineItemGroupBy> groupBys;
    private InvoiceStatement invoiceStatement;
    private BigDecimal quantity;
    private BigDecimal rate;
    private BigDecimal subtotal;
    private OneToMany<InvoiceStatementLineItemGroupBy> summarizeBys;
    private BigDecimal taxAmount;
    private BigDecimal total;

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
    public OneToMany<InvoiceStatementLineItemGroupBy> getSummarizeBys() {
        return summarizeBys;
    }

    @JsonProperty("summarizeBys")
    public void setSummarizeBys(OneToMany<InvoiceStatementLineItemGroupBy> summarizeBys) {
        this.summarizeBys = summarizeBys;
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
}
