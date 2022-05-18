package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "accountingCode", "creditAmount", "currencyUnit", "dateAdded", "dateLastModified", "customText1", "customText2", "debitAmount", "description",
    "invoiceStatement", "invoiceStatementDistributionBatch", "invoiceStatementLineDistributionTypeLookup", "invoiceStatementLineItem"
})
public class InvoiceStatementLineDistribution extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity {

    private Integer id;
    private String accountingCode;
    private BigDecimal creditAmount;
    private CurrencyUnit currencyUnit;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    @JsonIgnore
    private String customText1;
    @JsonIgnore
    private String customText2;
    private BigDecimal debitAmount;
    private String description;
    private InvoiceStatement invoiceStatement;
    private InvoiceStatementDistributionBatch invoiceStatementDistributionBatch;
    private SimplifiedOptionsLookup invoiceStatementLineDistributionTypeLookup;
    private InvoiceStatementLineItem invoiceStatementLineItem;

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

    @JsonProperty("accountingCode")
    public String getAccountingCode() {
        return accountingCode;
    }

    @JsonProperty("accountingCode")
    public void setAccountingCode(String accountingCode) {
        this.accountingCode = accountingCode;
    }

    @JsonProperty("creditAmount")
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    @JsonProperty("creditAmount")
    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
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

    @Override
    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("debitAmount")
    public BigDecimal getDebitAmount() {
        return debitAmount;
    }

    @JsonProperty("debitAmount")
    public void setDebitAmount(BigDecimal debitAmount) {
        this.debitAmount = debitAmount;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("customText1")
    public String getCustomText1() {
        return customText1;
    }

    @JsonProperty("customText1")
    public void setCustomText1(String customText1) {
        this.customText1 = customText1;
    }

    @JsonProperty("customText2")
    public String getCustomText2() {
        return customText2;
    }

    @JsonProperty("customText2")
    public void setCustomText2(String customText2) {
        this.customText2 = customText2;
    }

    @JsonProperty("invoiceStatement")
    public InvoiceStatement getInvoiceStatement() {
        return invoiceStatement;
    }

    @JsonProperty("invoiceStatement")
    public void setInvoiceStatement(InvoiceStatement invoiceStatement) {
        this.invoiceStatement = invoiceStatement;
    }

    @JsonProperty("invoiceStatementDistributionBatch")
    public InvoiceStatementDistributionBatch getInvoiceStatementDistributionBatch() {
        return invoiceStatementDistributionBatch;
    }

    @JsonProperty("invoiceStatementDistributionBatch")
    public void setInvoiceStatementDistributionBatch(InvoiceStatementDistributionBatch invoiceStatementDistributionBatch) {
        this.invoiceStatementDistributionBatch = invoiceStatementDistributionBatch;
    }

    @JsonProperty("invoiceStatementLineDistributionTypeLookup")
    public SimplifiedOptionsLookup getInvoiceStatementLineDistributionTypeLookup() {
        return invoiceStatementLineDistributionTypeLookup;
    }

    @JsonProperty("invoiceStatementLineDistributionTypeLookup")
    public void setInvoiceStatementLineDistributionTypeLookup(SimplifiedOptionsLookup invoiceStatementLineDistributionTypeLookup) {
        this.invoiceStatementLineDistributionTypeLookup = invoiceStatementLineDistributionTypeLookup;
    }

    @JsonProperty("invoiceStatementLineItem")
    public InvoiceStatementLineItem getInvoiceStatementLineItem() {
        return invoiceStatementLineItem;
    }

    @JsonProperty("invoiceStatementLineItem")
    public void setInvoiceStatementLineItem(InvoiceStatementLineItem invoiceStatementLineItem) {
        this.invoiceStatementLineItem = invoiceStatementLineItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceStatementLineDistribution that = (InvoiceStatementLineDistribution) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(accountingCode, that.accountingCode) &&
            Objects.equals(creditAmount, that.creditAmount) &&
            Objects.equals(currencyUnit, that.currencyUnit) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(customText1, that.customText1) &&
            Objects.equals(customText2, that.customText2) &&
            Objects.equals(debitAmount, that.debitAmount) &&
            Objects.equals(description, that.description) &&
            Objects.equals(invoiceStatement, that.invoiceStatement) &&
            Objects.equals(invoiceStatementDistributionBatch, that.invoiceStatementDistributionBatch) &&
            Objects.equals(invoiceStatementLineDistributionTypeLookup, that.invoiceStatementLineDistributionTypeLookup) &&
            Objects.equals(invoiceStatementLineItem, that.invoiceStatementLineItem);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, accountingCode, creditAmount, currencyUnit, dateAdded, dateLastModified, customText1, customText2, debitAmount, description, invoiceStatement, invoiceStatementDistributionBatch, invoiceStatementLineDistributionTypeLookup, invoiceStatementLineItem);
    }

    @Override
    public String toString() {
        return "InvoiceStatementLineDistribution{" +
            "id=" + id +
            ", accountingCode='" + accountingCode + '\'' +
            ", creditAmount=" + creditAmount +
            ", currencyUnit=" + currencyUnit +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", customText1='" + customText1 + '\'' +
            ", customText2='" + customText2 + '\'' +
            ", debitAmount=" + debitAmount +
            ", description='" + description + '\'' +
            ", invoiceStatement=" + invoiceStatement +
            ", invoiceStatementDistributionBatch=" + invoiceStatementDistributionBatch +
            ", invoiceStatementLineDistributionTypeLookup=" + invoiceStatementLineDistributionTypeLookup +
            ", invoiceStatementLineItem=" + invoiceStatementLineItem +
            '}';
    }
}
