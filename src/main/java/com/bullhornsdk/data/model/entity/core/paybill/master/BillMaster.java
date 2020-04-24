package com.bullhornsdk.data.model.entity.core.paybill.master;

import com.bullhornsdk.data.model.entity.core.contractmanagement.earncode.EarnCode;
import com.bullhornsdk.data.model.entity.core.paybill.Location;
import com.bullhornsdk.data.model.entity.core.paybill.charge.BillableCharge;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

/**
 * Created by mkesmetzis 21-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "billMasterTransactions", "billableCharge", "billingSyncBatch", "canInvoice",
    "dateAdded", "dateLastModified", "earnCode", "location", "owner", "transactionDate"})
public class BillMaster implements QueryEntity, DateLastModifiedEntity, AssociationEntity {

    private Integer id;
    private OneToMany<BillMasterTransaction> billMasterTransactions;
    private BillableCharge billableCharge;
    private BillingSyncBatch billingSyncBatch;
    private Boolean canInvoice;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private EarnCode earnCode;
    private Location location;
    private CorporateUser owner;
    private DateTime transactionDate;

    public BillMaster() {
    }

    public BillMaster(Integer id) {
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

    @JsonProperty("billableCharge")
    public BillableCharge getBillableCharge() {
        return billableCharge;
    }

    @JsonProperty("billableCharge")
    public void setBillableCharge(BillableCharge billableCharge) {
        this.billableCharge = billableCharge;
    }

    @JsonProperty("billingSyncBatch")
    public BillingSyncBatch getBillingSyncBatch() {
        return billingSyncBatch;
    }

    @JsonProperty("billingSyncBatch")
    public void setBillingSyncBatch(BillingSyncBatch billingSyncBatch) {
        this.billingSyncBatch = billingSyncBatch;
    }

    @JsonProperty("canInvoice")
    public Boolean getCanInvoice() {
        return canInvoice;
    }

    @JsonProperty("canInvoice")
    public void setCanInvoice(Boolean canInvoice) {
        this.canInvoice = canInvoice;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("earnCode")
    public EarnCode getEarnCode() {
        return earnCode;
    }

    @JsonProperty("earnCode")
    public void setEarnCode(EarnCode earnCode) {
        this.earnCode = earnCode;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @JsonProperty("transactionDate")
    public DateTime getTransactionDate() {
        return transactionDate;
    }

    @JsonProperty("transactionDate")
    public void setTransactionDate(DateTime transactionDate) {
        this.transactionDate = transactionDate;
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

}
