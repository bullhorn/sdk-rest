package com.bullhornsdk.data.model.entity.core.paybill.master;

import com.bullhornsdk.data.model.entity.core.paybill.charge.BillableCharge;
import com.bullhornsdk.data.model.entity.core.paybill.charge.PayableCharge;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.TransactionOrigin;
import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
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

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created by mkesmetzis 21-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "batchGroup", "billMasters", "dateAdded", "dateLastModified", "defaultBillableCharge",
    "defaultPayableCharge", "externalID", "payMasters", "periodEndDate", "timeOfExternalEvent", "transactionOrigin"
})
public class BillingSyncBatch extends AbstractEntity implements QueryEntity, DateLastModifiedEntity, AssociationEntity {

    private Integer id;
    private BatchGroup batchGroup;
    private OneToMany<BillMaster> billMasters;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private BillableCharge defaultBillableCharge;
    private PayableCharge defaultPayableCharge;
    @Size(max = 50)
    private String externalID;
    private OneToMany<PayMaster> payMasters;
    private String periodEndDate;
    private DateTime timeOfExternalEvent;
    private TransactionOrigin transactionOrigin;


    public BillingSyncBatch() {
    }

    public BillingSyncBatch(Integer id) {
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

    @JsonProperty("batchGroup")
    public BatchGroup getBatchGroup() {
        return batchGroup;
    }

    @JsonProperty("batchGroup")
    public void setBatchGroup(BatchGroup batchGroup) {
        this.batchGroup = batchGroup;
    }

    @JsonProperty("billMasters")
    public OneToMany<BillMaster> getBillMasters() {
        return billMasters;
    }

    @JsonProperty("billMasters")
    public void setBillMasters(OneToMany<BillMaster> billMasters) {
        this.billMasters = billMasters;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("defaultBillableCharge")
    public BillableCharge getDefaultBillableCharge() {
        return defaultBillableCharge;
    }

    @JsonProperty("defaultBillableCharge")
    public void setDefaultBillableCharge(BillableCharge defaultBillableCharge) {
        this.defaultBillableCharge = defaultBillableCharge;
    }

    @JsonProperty("defaultPayableCharge")
    public PayableCharge getDefaultPayableCharge() {
        return defaultPayableCharge;
    }

    @JsonProperty("defaultPayableCharge")
    public void setDefaultPayableCharge(PayableCharge defaultPayableCharge) {
        this.defaultPayableCharge = defaultPayableCharge;
    }

    @JsonProperty("externalID")
    public String getExternalID() {
        return externalID;
    }

    @JsonProperty("externalID")
    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    @JsonProperty("payMasters")
    public OneToMany<PayMaster> getPayMasters() {
        return payMasters;
    }

    @JsonProperty("payMasters")
    public void setPayMasters(OneToMany<PayMaster> payMasters) {
        this.payMasters = payMasters;
    }

    @JsonProperty("periodEndDate")
    public String getPeriodEndDate() {
        return periodEndDate;
    }

    @JsonProperty("periodEndDate")
    public void setPeriodEndDate(String periodEndDate) {
        this.periodEndDate = periodEndDate;
    }

    @JsonProperty("timeOfExternalEvent")
    public DateTime getTimeOfExternalEvent() {
        return timeOfExternalEvent;
    }

    @JsonProperty("timeOfExternalEvent")
    public void setTimeOfExternalEvent(DateTime timeOfExternalEvent) {
        this.timeOfExternalEvent = timeOfExternalEvent;
    }

    @JsonProperty("transactionOrigin")
    public TransactionOrigin getTransactionOrigin() {
        return transactionOrigin;
    }

    @JsonProperty("transactionOrigin")
    public void setTransactionOrigin(TransactionOrigin transactionOrigin) {
        this.transactionOrigin = transactionOrigin;
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
        return "BillingSyncBatch{" +
            "id=" + id +
            ", batchGroup=" + batchGroup +
            ", billMasters=" + billMasters +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", defaultBillableCharge=" + defaultBillableCharge +
            ", defaultPayableCharge=" + defaultPayableCharge +
            ", externalID='" + externalID + '\'' +
            ", payMasters=" + payMasters +
            ", periodEndDate='" + periodEndDate + '\'' +
            ", timeOfExternalEvent=" + timeOfExternalEvent +
            ", transactionOrigin=" + transactionOrigin +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillingSyncBatch that = (BillingSyncBatch) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(batchGroup, that.batchGroup) &&
            Objects.equals(billMasters, that.billMasters) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(defaultBillableCharge, that.defaultBillableCharge) &&
            Objects.equals(defaultPayableCharge, that.defaultPayableCharge) &&
            Objects.equals(externalID, that.externalID) &&
            Objects.equals(payMasters, that.payMasters) &&
            Objects.equals(periodEndDate, that.periodEndDate) &&
            Objects.equals(timeOfExternalEvent, that.timeOfExternalEvent) &&
            Objects.equals(transactionOrigin, that.transactionOrigin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, batchGroup, billMasters, dateAdded, dateLastModified, defaultBillableCharge, defaultPayableCharge, externalID, payMasters, periodEndDate, timeOfExternalEvent, transactionOrigin);
    }
}
