package com.bullhornsdk.data.model.entity.core.paybill.distribution;

import com.bullhornsdk.data.model.entity.core.paybill.CanvasReport;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.BillMasterTransaction;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.paybill.charge.BillableCharge;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;

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
@JsonPropertyOrder({"id", "accountingDate", "batchStatus", "billableCharges", "canvasReport",
    "dateAdded", "dateLastModified", "owner", "unbilledRevenueDistributions"
})
public class UnbilledRevenueDistributionBatch extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity {

    private Integer id;
    private Date accountingDate;
    private SimplifiedOptionsLookup batchStatus;
    private OneToMany<BillableCharge> billableCharges;
    private CanvasReport canvasReport;

    private DateTime dateAdded;
    private DateTime dateLastModified;
    private CorporateUser owner;
    private OneToMany<UnbilledRevenueDistribution> unbilledRevenueDistributions;



    public UnbilledRevenueDistributionBatch() {
    }

    public UnbilledRevenueDistributionBatch(Integer id) {
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

    @JsonProperty("accountingDate")
    public Date getAccountingDate() {
        return accountingDate;
    }

    @JsonProperty("accountingDate")
    public void setAccountingDate(Date accountingDate) {
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

    @JsonProperty("billableCharges")
    public OneToMany<BillableCharge> getBillableCharges() {
        return billableCharges;
    }

    @JsonProperty("billableCharges")
    public void setBillableCharges(OneToMany<BillableCharge> billableCharges) {
        this.billableCharges = billableCharges;
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

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @ReadOnly
    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @JsonProperty("unbilledRevenueDistributions")
    public OneToMany<UnbilledRevenueDistribution> getUnbilledRevenueDistributions() {
        return unbilledRevenueDistributions;
    }

    @JsonProperty("unbilledRevenueDistributions")
    public void setUnbilledRevenueDistributions(OneToMany<UnbilledRevenueDistribution> unbilledRevenueDistributions) {
        this.unbilledRevenueDistributions = unbilledRevenueDistributions;
    }


    @Override
    public String toString() {
        return "UnbilledRevenueDistributionBatch{" +
            "id=" + id +
            ", accountingDate=" + accountingDate +
            ", batchStatus=" + batchStatus +
            ", billableCharges=" + billableCharges +
            ", canvasReport=" + canvasReport +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", owner=" + owner +
            ", unbilledRevenueDistributions=" + unbilledRevenueDistributions +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnbilledRevenueDistributionBatch that = (UnbilledRevenueDistributionBatch) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(accountingDate, that.accountingDate) &&
            Objects.equals(batchStatus, that.batchStatus) &&
            Objects.equals(billableCharges, that.billableCharges) &&
            Objects.equals(canvasReport, that.canvasReport) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(owner, that.owner) &&
            Objects.equals(unbilledRevenueDistributions, that.unbilledRevenueDistributions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountingDate, batchStatus, billableCharges, canvasReport, dateAdded, dateLastModified, owner, unbilledRevenueDistributions);
    }

}
