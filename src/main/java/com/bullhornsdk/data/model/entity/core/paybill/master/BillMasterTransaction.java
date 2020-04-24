package com.bullhornsdk.data.model.entity.core.paybill.master;

import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatement;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementBatch;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementLineItem;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by mkesmetzis 22-Apr-20 //TODO check if needed
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "adjustmentSequenceNumber", "amount", "billMaster", "comment",
    "currencyUnit", "dateAdded", "dateLastModified", "invoiceStatement", "invoiceStatementBatch",
    "invoiceStatementLineItem", "needsReview", "quantity", "rate", "recordingDate", "reversalOfTransaction",
    "transactionOrigin", "transactionStatus", "transactionType", "unitOfMeasure"
})
public class BillMasterTransaction extends AbstractMasterTransaction implements QueryEntity {

    private BillMaster billMasters;

    private InvoiceStatement invoiceStatement;

    private InvoiceStatementBatch invoiceStatementBatch;

    private InvoiceStatementLineItem invoiceStatementLineItem;

    private Boolean needsReview;

    private BillMasterTransaction reversalOfTransaction;

    public BillMasterTransaction() {
        super();
    }

    public BillMasterTransaction(Integer id) {
        super(id);
    }

    @JsonProperty("billMasters")
    public BillMaster getBillMasters() {
        return billMasters;
    }

    @JsonProperty("billMasters")
    public void setBillMasters(BillMaster billMasters) {
        this.billMasters = billMasters;
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
}
