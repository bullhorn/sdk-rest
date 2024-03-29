package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.paybill.charge.BillableCharge;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.BillMasterTransaction;
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

/**
 * Created by mkesmetzis 23-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "batchStatus", "billMasterTransactions", "billableCharges", "dateAdded",
    "dateLastModified", "owner"})
public class InvoiceStatementBatch extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity, AssociationEntity {

    private Integer id;
    private SimplifiedOptionsLookup batchStatus;
    private OneToMany<BillMasterTransaction> billMasterTransactions;
    private OneToMany<BillableCharge> billableCharges;
    private DateTime dateAdded;
    private DateTime dateLastModified;
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

    @JsonProperty("billMasterTransactions")
    public OneToMany<BillMasterTransaction> getBillMasterTransactions() {
        return billMasterTransactions;
    }

    @JsonProperty("billMasterTransactions")
    public void setBillMasterTransactions(OneToMany<BillMasterTransaction> billMasterTransactions) {
        this.billMasterTransactions = billMasterTransactions;
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

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
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

    @Override
    public String toString() {
        return "InvoiceStatementBatch{" +
            "id=" + id +
            ", batchStatus=" + batchStatus +
            ", billMasterTransactions=" + billMasterTransactions +
            ", billableCharges=" + billableCharges +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", owner=" + owner +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceStatementBatch that = (InvoiceStatementBatch) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(batchStatus, that.batchStatus) &&
            Objects.equals(billMasterTransactions, that.billMasterTransactions) &&
            Objects.equals(billableCharges, that.billableCharges) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, batchStatus, billMasterTransactions, billableCharges, dateAdded, dateLastModified, owner);
    }
}
