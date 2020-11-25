package com.bullhornsdk.data.model.entity.core.paybill.transaction;

import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatement;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementBatch;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementLineItem;
import com.bullhornsdk.data.model.entity.core.paybill.master.BillMaster;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SpecializedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Objects;

/**
 * Created by mkesmetzis 22-Apr-20 //TODO check if needed
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "adjustmentSequenceNumber", "amount", "billMaster", "comment",
    "currencyUnit", "dateAdded", "dateLastModified", "invoiceStatement", "invoiceStatementBatch",
    "invoiceStatementLineItem", "needsReview", "quantity", "rate", "recordingDate", "reversalOfTransaction",
    "transactionOrigin", "transactionStatus", "transactionType", "unitOfMeasure", "unbilledRevenueGeneralLedgerExportStatusLookup"
})
public class BillMasterTransaction extends AbstractMasterTransaction implements QueryEntity {

    private BillMaster billMaster;
    private InvoiceStatement invoiceStatement;
    private InvoiceStatementBatch invoiceStatementBatch;
    private InvoiceStatementLineItem invoiceStatementLineItem;
    private Boolean needsReview;
    private BillMasterTransaction reversalOfTransaction;
    private SpecializedOptionsLookup unbilledRevenueGeneralLedgerExportStatusLookup;

    public BillMasterTransaction() {
        super();
    }

    public BillMasterTransaction(Integer id) {
        super(id);
    }

    @JsonProperty("billMaster")
    public BillMaster getBillMaster() {
        return billMaster;
    }

    @JsonProperty("billMaster")
    public void setBillMaster(BillMaster billMaster) {
        this.billMaster = billMaster;
    }

    @JsonProperty("invoiceStatement")
    public InvoiceStatement getInvoiceStatement() {
        return invoiceStatement;
    }

    @JsonProperty("invoiceStatement")
    public void setInvoiceStatement(InvoiceStatement invoiceStatement) {
        this.invoiceStatement = invoiceStatement;
    }

    @JsonProperty("invoiceStatementBatch")
    public InvoiceStatementBatch getInvoiceStatementBatch() {
        return invoiceStatementBatch;
    }

    @JsonProperty("invoiceStatementBatch")
    public void setInvoiceStatementBatch(InvoiceStatementBatch invoiceStatementBatch) {
        this.invoiceStatementBatch = invoiceStatementBatch;
    }

    @JsonProperty("invoiceStatementLineItem")
    public InvoiceStatementLineItem getInvoiceStatementLineItem() {
        return invoiceStatementLineItem;
    }

    @JsonProperty("invoiceStatementLineItem")
    public void setInvoiceStatementLineItem(InvoiceStatementLineItem invoiceStatementLineItem) {
        this.invoiceStatementLineItem = invoiceStatementLineItem;
    }

    @JsonProperty("needsReview")
    public Boolean getNeedsReview() {
        return needsReview;
    }

    @JsonProperty("needsReview")
    public void setNeedsReview(Boolean needsReview) {
        this.needsReview = needsReview;
    }

    @JsonProperty("reversalOfTransaction")
    public BillMasterTransaction getReversalOfTransaction() {
        return reversalOfTransaction;
    }

    @JsonProperty("reversalOfTransaction")
    public void setReversalOfTransaction(BillMasterTransaction reversalOfTransaction) {
        this.reversalOfTransaction = reversalOfTransaction;
    }

    @JsonProperty("unbilledRevenueGeneralLedgerExportStatusLookup")
    public SpecializedOptionsLookup getUnbilledRevenueGeneralLedgerExportStatusLookup() {
        return unbilledRevenueGeneralLedgerExportStatusLookup;
    }

    @JsonProperty("unbilledRevenueGeneralLedgerExportStatusLookup")
    public void setUnbilledRevenueGeneralLedgerExportStatusLookup(SpecializedOptionsLookup unbilledRevenueGeneralLedgerExportStatusLookup) {
        this.unbilledRevenueGeneralLedgerExportStatusLookup = unbilledRevenueGeneralLedgerExportStatusLookup;
    }



    @Override
    public String toString() {
        return "BillMasterTransaction{" +
            "billMaster=" + billMaster +
            ", invoiceStatement=" + invoiceStatement +
            ", invoiceStatementBatch=" + invoiceStatementBatch +
            ", invoiceStatementLineItem=" + invoiceStatementLineItem +
            ", needsReview=" + needsReview +
            ", reversalOfTransaction=" + reversalOfTransaction +
            ", unbilledRevenueGeneralLedgerExportStatusLookup=" + unbilledRevenueGeneralLedgerExportStatusLookup +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BillMasterTransaction that = (BillMasterTransaction) o;
        return Objects.equals(billMaster, that.billMaster) &&
            Objects.equals(invoiceStatement, that.invoiceStatement) &&
            Objects.equals(invoiceStatementBatch, that.invoiceStatementBatch) &&
            Objects.equals(invoiceStatementLineItem, that.invoiceStatementLineItem) &&
            Objects.equals(needsReview, that.needsReview) &&
            Objects.equals(reversalOfTransaction, that.reversalOfTransaction) &&
            Objects.equals(unbilledRevenueGeneralLedgerExportStatusLookup, that.unbilledRevenueGeneralLedgerExportStatusLookup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), billMaster, invoiceStatement, invoiceStatementBatch, invoiceStatementLineItem, needsReview, reversalOfTransaction, unbilledRevenueGeneralLedgerExportStatusLookup);
    }
}
