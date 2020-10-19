package com.bullhornsdk.data.model.entity.core.paybill.transaction;

import com.bullhornsdk.data.model.entity.core.paybill.charge.PayExportBatch;
import com.bullhornsdk.data.model.entity.core.paybill.master.PayMaster;
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
@JsonPropertyOrder({"id", "adjustmentSequenceNumber", "amount", "comment", "currencyUnit", "dateAdded",
    "dateLastModified", "payExportBatch", "payMaster", "quantity", "rate", "recordingDate", "reversalOfTransaction",
    "transactionOrigin", "transactionStatus", "transactionType", "unitOfMeasure"
})
public class PayMasterTransaction extends AbstractMasterTransaction implements QueryEntity {

    private PayMaster payMaster;

    private PayExportBatch payExportBatch;

    private PayMasterTransaction reversalOfTransaction;

    public PayMasterTransaction() {

    }

    public PayMasterTransaction(Integer id) {
        super(id);
    }

    @JsonProperty("payExportBatch")
    public PayExportBatch getPayExportBatch() {
        return payExportBatch;
    }

    @JsonProperty("payExportBatch")
    public void setPayExportBatch(PayExportBatch payExportBatch) {
        this.payExportBatch = payExportBatch;
    }

    @JsonProperty("payMaster")
    public PayMaster getPayMaster() {
        return payMaster;
    }

    @JsonProperty("payMaster")
    public void setPayMaster(PayMaster payMaster) {
        this.payMaster = payMaster;
    }

    @JsonProperty("reversalOfTransaction")
    public PayMasterTransaction getReversalOfTransaction() {
        return reversalOfTransaction;
    }

    @JsonProperty("reversalOfTransaction")
    public void setReversalOfTransaction(PayMasterTransaction reversalOfTransaction) {
        this.reversalOfTransaction = reversalOfTransaction;
    }

    @Override
    public String toString() {
        return "PayMasterTransaction{" +
            "payMaster=" + payMaster +
            ", payExportBatch=" + payExportBatch +
            ", reversalOfTransaction=" + reversalOfTransaction +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PayMasterTransaction that = (PayMasterTransaction) o;
        return Objects.equals(payMaster, that.payMaster) &&
            Objects.equals(payExportBatch, that.payExportBatch) &&
            Objects.equals(reversalOfTransaction, that.reversalOfTransaction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), payMaster, payExportBatch, reversalOfTransaction);
    }

}
