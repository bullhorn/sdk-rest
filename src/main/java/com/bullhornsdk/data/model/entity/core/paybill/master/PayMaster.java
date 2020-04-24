package com.bullhornsdk.data.model.entity.core.paybill.master;

import com.bullhornsdk.data.model.entity.core.contractmanagement.earncode.EarnCode;
import com.bullhornsdk.data.model.entity.core.paybill.charge.PayableCharge;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

/**
 * Created by mkesmetzis 23-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "payableCharge", "billingSyncBatch", "canExport",
    "dateAdded", "dateLastModified", "earnCode", "transactionDate"})
public class PayMaster implements QueryEntity, DateLastModifiedEntity {

    private Integer id;
    private PayableCharge payableCharge;
    private BillingSyncBatch billingSyncBatch;
    private Boolean canExport;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private EarnCode earnCode;
    private DateTime transactionDate;

    public PayMaster() {
    }

    public PayMaster(Integer id) {
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

    @JsonProperty("payableCharge")
    public PayableCharge getPayableCharge() {
        return payableCharge;
    }

    @JsonProperty("billableCharge")
    public void setPayableCharge(PayableCharge payableCharge) {
        this.payableCharge = payableCharge;
    }

    @JsonProperty("billingSyncBatch")
    public BillingSyncBatch getBillingSyncBatch() {
        return billingSyncBatch;
    }

    @JsonProperty("billingSyncBatch")
    public void setBillingSyncBatch(BillingSyncBatch billingSyncBatch) {
        this.billingSyncBatch = billingSyncBatch;
    }

    @JsonProperty("canExport")
    public Boolean getCanExport() {
        return canExport;
    }

    @JsonProperty("canInvoice")
    public void setCanExport(Boolean canExport) {
        this.canExport = canExport;
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
