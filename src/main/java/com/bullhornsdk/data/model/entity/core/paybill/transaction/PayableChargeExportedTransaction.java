//package com.bullhornsdk.data.model.entity.core.paybill.transaction;
//
//import com.bullhornsdk.data.model.entity.core.paybill.charge.BillableCharge;
//import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatement;
//import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementBatch;
//import com.bullhornsdk.data.model.entity.core.paybill.master.BillMaster;
//import com.bullhornsdk.data.model.entity.core.paybill.master.PayMaster;
//import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//import com.fasterxml.jackson.annotation.JsonRootName;
//import org.joda.time.DateTime;
//
//import java.util.Objects;
//
///**
// * Created by mkesmetzis 22-Apr-20
// */
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonRootName(value = "data")
//@JsonPropertyOrder({"id", "amount", "billingSyncBatch", "canvasReportID", "currencyUnit", "dateAdded", "earnCode",
//    "payExportBatchID", "payMaster", "payableCharge", "quantity", "rate", "transactionDate", "unitOfMeasure"})
//public class PayableChargeExportedTransaction extends AbstractTransaction implements QueryEntity {
//
//    private CanvasReport canvasReportID;
//    private DateTime dateTime;
//    private PayExportBatch payExportBatchID;
//    private PayMaster payMaster;
//
//
//    public PayableChargeExportedTransaction() {
//
//    }
//
//    public PayableChargeExportedTransaction(Integer id) {
//        super(id);
//    }
//
//    @JsonProperty("billMasters")
//    public BillMaster getBillMasters() {
//        return billMasters;
//    }
//
//    @Override
//    public String toString() {
//        return "BillableChargeInvoicedTransaction{" +
//            "billMasters=" + billMasters +
//            ", billableCharge=" + billableCharge +
//            ", invoiceStatement=" + invoiceStatement +
//            ", invoiceStatementBatch=" + invoiceStatementBatch +
//            '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        PayableChargeExportedTransaction that = (PayableChargeExportedTransaction) o;
//        return Objects.equals(billMasters, that.billMasters) &&
//            Objects.equals(billableCharge, that.billableCharge) &&
//            Objects.equals(invoiceStatement, that.invoiceStatement) &&
//            Objects.equals(invoiceStatementBatch, that.invoiceStatementBatch);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), billMasters, billableCharge, invoiceStatement, invoiceStatementBatch);
//    }
//
//    @JsonProperty("billMasters")
//    public void setBillMasters(BillMaster billMasters) {
//        this.billMasters = billMasters;
//    }
//
//    @JsonProperty("billableCharge")
//    public BillableCharge getBillableCharge() {
//        return billableCharge;
//    }
//
//    @JsonProperty("billableCharge")
//    public void setBillableCharge(BillableCharge billableCharge) {
//        this.billableCharge = billableCharge;
//    }
//
//    @JsonProperty("invoiceStatement")
//    public InvoiceStatement getInvoiceStatement() {
//        return invoiceStatement;
//    }
//
//    @JsonProperty("invoiceStatement")
//    public void setInvoiceStatement(InvoiceStatement invoiceStatement) {
//        this.invoiceStatement = invoiceStatement;
//    }
//
//    @JsonProperty("invoiceStatementBatch")
//    public InvoiceStatementBatch getInvoiceStatementBatch() {
//        return invoiceStatementBatch;
//    }
//
//    @JsonProperty("invoiceStatementBatch")
//    public void setInvoiceStatementBatch(InvoiceStatementBatch invoiceStatementBatch) {
//        this.invoiceStatementBatch = invoiceStatementBatch;
//    }
//
//}
