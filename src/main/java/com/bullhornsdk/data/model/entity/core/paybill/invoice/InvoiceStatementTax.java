package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.paybill.tax.Tax;
import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.math.BigDecimal;

/**
 * Created by mkesmetzis 24-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "finalizedValue", "invoiceStatement", "isDeleted", "tax"})
public class InvoiceStatementTax extends AbstractEntity implements QueryEntity, SoftDeleteEntity {

    private Integer id;
    private BigDecimal finalizedValue;
    private InvoiceStatement invoiceStatement;
    private Tax tax;

    public InvoiceStatementTax() {
    }

    public InvoiceStatementTax(Integer id) {
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


    @JsonProperty("finalizedValue")
    public BigDecimal getFinalizedValue() {
        return finalizedValue;
    }

    @JsonProperty("finalizedValue")
    public void setFinalizedValue(BigDecimal finalizedValue) {
        this.finalizedValue = finalizedValue;
    }

    @JsonProperty("invoiceStatement")
    public InvoiceStatement getInvoiceStatement() {
        return invoiceStatement;
    }

    @JsonProperty("invoiceStatement")
    public void setInvoiceStatement(InvoiceStatement invoiceStatement) {
        this.invoiceStatement = invoiceStatement;
    }

    @Override
    public Boolean getIsDeleted() {
        return null;
    }

    @JsonProperty("tax")
    public Tax getTax() {
        return tax;
    }

    @JsonProperty("tax")
    public void setTax(Tax tax) {
        this.tax = tax;
    }
}
