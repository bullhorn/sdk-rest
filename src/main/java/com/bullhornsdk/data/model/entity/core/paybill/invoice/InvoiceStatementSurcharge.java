package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.paybill.surcharge.Surcharge;
import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by mkesmetzis 24-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "finalizedValue", "invoiceStatement", "surcharge"})
public class InvoiceStatementSurcharge extends AbstractEntity implements QueryEntity {

    private Integer id;
    private BigDecimal finalizedValue;
    private InvoiceStatement invoiceStatement;
    private Surcharge surcharge;

    public InvoiceStatementSurcharge() {
    }

    public InvoiceStatementSurcharge(Integer id) {
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

    @JsonProperty("surcharge")
    public Surcharge getSurcharge() {
        return surcharge;
    }

    @JsonProperty("surcharge")
    public void setSurcharge(Surcharge surcharge) {
        this.surcharge = surcharge;
    }

    @Override
    public String toString() {
        return "InvoiceStatementSurcharge{" +
            "id=" + id +
            ", finalizedValue=" + finalizedValue +
            ", invoiceStatement=" + invoiceStatement +
            ", surcharge=" + surcharge +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceStatementSurcharge that = (InvoiceStatementSurcharge) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(finalizedValue, that.finalizedValue) &&
            Objects.equals(invoiceStatement, that.invoiceStatement) &&
            Objects.equals(surcharge, that.surcharge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, finalizedValue, invoiceStatement, surcharge);
    }
}
