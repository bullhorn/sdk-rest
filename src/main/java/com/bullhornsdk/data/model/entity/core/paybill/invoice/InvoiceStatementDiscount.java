package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.paybill.discount.Discount;
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
 * Created by mkesmetzis 23-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "discount", "invoiceStatement", "finalizedValue"})
public class InvoiceStatementDiscount extends AbstractEntity implements QueryEntity {

    private Integer id;
    private Discount discount;
    private InvoiceStatement invoiceStatement;
    private BigDecimal finalizedValue;


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

    @JsonProperty("discount")
    public Discount getDiscount() {
        return discount;
    }

    @JsonProperty("discount")
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @JsonProperty("invoiceStatement")
    public InvoiceStatement getInvoiceStatement() {
        return invoiceStatement;
    }

    @JsonProperty("invoiceStatement")
    public void setInvoiceStatement(InvoiceStatement invoiceStatement) {
        this.invoiceStatement = invoiceStatement;
    }

    @JsonProperty("finalizedValue")
    public BigDecimal getFinalizedValue() {
        return finalizedValue;
    }

    @JsonProperty("finalizedValue")
    public void setFinalizedValue(BigDecimal finalizedValue) {
        this.finalizedValue = finalizedValue;
    }

    @Override
    public String toString() {
        return "InvoiceStatementDiscount{" +
            "id=" + id +
            ", discount=" + discount +
            ", invoiceStatement=" + invoiceStatement +
            ", finalizedValue=" + finalizedValue +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceStatementDiscount that = (InvoiceStatementDiscount) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(discount, that.discount) &&
            Objects.equals(invoiceStatement, that.invoiceStatement) &&
            Objects.equals(finalizedValue, that.finalizedValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, discount, invoiceStatement, finalizedValue);
    }
}

