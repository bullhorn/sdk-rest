package com.bullhornsdk.data.model.entity.core.paybill.distribution;

import com.bullhornsdk.data.model.entity.core.paybill.BillingProfile;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.BillMasterTransaction;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsJ;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;

import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 * Created by Kin.To 25 Nov 2020
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "accountingCode", "billMasterTransactions", "creditAmount", "currencyUnit",
    "dateAdded", "dateLastModified", "debitAmount", "description",
    "invoiceStatementLineDistributionTypeLookup", "unbilledRevenueDistributionBatch",
    "customDate1", "customDate2", "customDate3",
    "customInt1", "customInt2", "customInt3", "customInt4", "customInt5",
    "customText1", "customText2", "customText3", "customText4", "customText5"
})
public class UnbilledRevenueDistribution extends CustomFieldsJ implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity, AssociationEntity {

    private Integer id;
    private String accountingCode;
    private OneToMany<BillMasterTransaction> billMasterTransactions;
    private BigDecimal creditAmount;
    private CurrencyUnit currencyUnit;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private BigDecimal debitAmount;
    @JsonIgnore
    private String description;
    private SimplifiedOptionsLookup invoiceStatementLineDistributionTypeLookup;
    private UnbilledRevenueDistributionBatch unbilledRevenueDistributionBatch;


    public UnbilledRevenueDistribution() {
    }

    public UnbilledRevenueDistribution(Integer id) {
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

    @JsonProperty("accountingCode")
    public String getAccountingCode() {
        return accountingCode;
    }

    @JsonProperty("accountingCode")
    public void setAccountingCode(String accountingCode) {
        this.accountingCode = accountingCode;
    }

    @JsonProperty("billMasterTransactions")
    public OneToMany<BillMasterTransaction> getBillMasterTransactions() {
        return billMasterTransactions;
    }

    @JsonProperty("billMasterTransactions")
    public void setBillMasterTransactions(OneToMany<BillMasterTransaction> billMasterTransactions) {
        this.billMasterTransactions = billMasterTransactions;
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

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @ReadOnly
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

    @JsonProperty("invoiceStatementLineDistributionTypeLookup")
    public SimplifiedOptionsLookup getInvoiceStatementLineDistributionTypeLookup() {
        return invoiceStatementLineDistributionTypeLookup;
    }

    @JsonProperty("invoiceStatementLineDistributionTypeLookup")
    public void setInvoiceStatementLineDistributionTypeLookup(SimplifiedOptionsLookup invoiceStatementLineDistributionTypeLookup) {
        this.invoiceStatementLineDistributionTypeLookup = invoiceStatementLineDistributionTypeLookup;
    }

    @JsonProperty("unbilledRevenueDistributionBatch")
    public UnbilledRevenueDistributionBatch getUnbilledRevenueDistributionBatch() {
        return unbilledRevenueDistributionBatch;
    }

    @JsonProperty("unbilledRevenueDistributionBatch")
    public void setUnbilledRevenueDistributionBatch(UnbilledRevenueDistributionBatch unbilledRevenueDistributionBatch) {
        this.unbilledRevenueDistributionBatch = unbilledRevenueDistributionBatch;
    }


    @Override
    public String toString() {
        return "UnbilledRevenueDistribution{" +
            "id=" + id +
            ", accountingCode=" + accountingCode +
            ", billMasterTransactions=" + billMasterTransactions +
            ", creditAmount=" + creditAmount +
            ", currencyUnit=" + currencyUnit +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", debitAmount=" + debitAmount +
            ", description=" + dateAdded +
            ", invoiceStatementLineDistributionTypeLookup=" + invoiceStatementLineDistributionTypeLookup +
            ", unbilledRevenueDistributionBatch=" + unbilledRevenueDistributionBatch +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnbilledRevenueDistribution that = (UnbilledRevenueDistribution) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(accountingCode, that.accountingCode) &&
            Objects.equals(billMasterTransactions, that.billMasterTransactions) &&
            Objects.equals(creditAmount, that.creditAmount) &&
            Objects.equals(currencyUnit, that.currencyUnit) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(debitAmount, that.debitAmount) &&
            Objects.equals(description, that.description) &&
            Objects.equals(invoiceStatementLineDistributionTypeLookup, that.invoiceStatementLineDistributionTypeLookup) &&
            Objects.equals(unbilledRevenueDistributionBatch, that.unbilledRevenueDistributionBatch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountingCode, billMasterTransactions, creditAmount, currencyUnit, dateAdded, dateLastModified, debitAmount, description, invoiceStatementLineDistributionTypeLookup, unbilledRevenueDistributionBatch);
    }

}
