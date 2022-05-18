package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.paybill.CanvasReport;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "accountingDate", "batchStatus", "canvasReport", "dateAdded", "dateLastModified", "invoiceStatementLineDistributions",
    "invoiceStatements", "owner"
})
public class InvoiceStatementDistributionBatch extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity, AssociationEntity {

    private Integer id;
    private DateTime accountingDate;
    private SimplifiedOptionsLookup batchStatus;
    private CanvasReport canvasReport;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private OneToMany<InvoiceStatementLineDistribution> invoiceStatementLineDistributions;
    private OneToMany<InvoiceStatement> invoiceStatements;
    private CorporateUser owner;

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

    @JsonProperty("accountingDate")
    public DateTime getAccountingDate() {
        return accountingDate;
    }

    @JsonProperty("accountingDate")
    public void setAccountingDate(DateTime accountingDate) {
        this.accountingDate = accountingDate;
    }

    @JsonProperty("batchStatus")
    public SimplifiedOptionsLookup getBatchStatus() {
        return batchStatus;
    }

    @JsonProperty("batchStatus")
    public void setBatchStatus(SimplifiedOptionsLookup batchStatus) {
        this.batchStatus = batchStatus;
    }

    @JsonProperty("canvasReport")
    public CanvasReport getCanvasReport() {
        return canvasReport;
    }

    @JsonProperty("canvasReport")
    public void setCanvasReport(CanvasReport canvasReport) {
        this.canvasReport = canvasReport;
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

    @JsonProperty("invoiceStatementLineDistributions")
    public OneToMany<InvoiceStatementLineDistribution> getInvoiceStatementLineDistributions() {
        return invoiceStatementLineDistributions;
    }

    @JsonProperty("invoiceStatementLineDistributions")
    public void setInvoiceStatementLineDistributions(OneToMany<InvoiceStatementLineDistribution> invoiceStatementLineDistributions) {
        this.invoiceStatementLineDistributions = invoiceStatementLineDistributions;
    }

    @JsonProperty("invoiceStatements")
    public OneToMany<InvoiceStatement> getInvoiceStatements() {
        return invoiceStatements;
    }

    @JsonProperty("invoiceStatements")
    public void setInvoiceStatements(OneToMany<InvoiceStatement> invoiceStatements) {
        this.invoiceStatements = invoiceStatements;
    }

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceStatementDistributionBatch that = (InvoiceStatementDistributionBatch) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(accountingDate, that.accountingDate) &&
            Objects.equals(batchStatus, that.batchStatus) &&
            Objects.equals(canvasReport, that.canvasReport) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(invoiceStatementLineDistributions, that.invoiceStatementLineDistributions) &&
            Objects.equals(invoiceStatements, that.invoiceStatements) &&
            Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountingDate, batchStatus, canvasReport, dateAdded, dateLastModified, invoiceStatementLineDistributions, invoiceStatements, owner);
    }

    @Override
    public String toString() {
        return "InvoiceStatementDistributionBatch{" +
            "id=" + id +
            ", accountingDate=" + accountingDate +
            ", batchStatus=" + batchStatus +
            ", canvasReport=" + canvasReport +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", invoiceStatementLineDistributions=" + invoiceStatementLineDistributions +
            ", invoiceStatements=" + invoiceStatements +
            ", owner=" + owner +
            '}';
    }
}
