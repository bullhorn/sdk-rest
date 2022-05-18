package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.util.Objects;

/**
 * Created by mkesmetzis 23-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "dateAdded", "invoiceStatementLineItem", "field", "value", "displayValue", "sortOrder"})
public class InvoiceStatementLineItemGroupBy extends AbstractEntity implements QueryEntity {

    private Integer id;
    private DateTime dateAdded;
    private InvoiceStatementLineItem invoiceStatementLineItem;
    private String field;
    private String value;
    private String displayValue;
    private Integer sortOrder;

    public InvoiceStatementLineItemGroupBy() {
    }

    public InvoiceStatementLineItemGroupBy(Integer id) {
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

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("invoiceStatementLineItem")
    public InvoiceStatementLineItem getInvoiceStatementLineItem() {
        return invoiceStatementLineItem;
    }

    @JsonProperty("invoiceStatementLineItem")
    public void setInvoiceStatementLineItem(InvoiceStatementLineItem invoiceStatementLineItem) {
        this.invoiceStatementLineItem = invoiceStatementLineItem;
    }

    @JsonProperty("field")
    public String getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("displayValue")
    public String getDisplayValue() {
        return displayValue;
    }

    @JsonProperty("displayValue")
    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    @JsonProperty("sortOrder")
    public Integer getSortOrder() {
        return sortOrder;
    }

    @JsonProperty("sortOrder")
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceStatementLineItemGroupBy that = (InvoiceStatementLineItemGroupBy) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(invoiceStatementLineItem, that.invoiceStatementLineItem) &&
            Objects.equals(field, that.field) &&
            Objects.equals(value, that.value) &&
            Objects.equals(displayValue, that.displayValue) &&
            Objects.equals(sortOrder, that.sortOrder);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, dateAdded, invoiceStatementLineItem, field, value, displayValue, sortOrder);
    }

    @Override
    public String toString() {
        return "InvoiceStatementLineItemGroupBy{" +
            "id=" + id +
            ", dateAdded=" + dateAdded +
            ", invoiceStatementLineItem=" + invoiceStatementLineItem +
            ", field='" + field + '\'' +
            ", value='" + value + '\'' +
            ", displayValue='" + displayValue + '\'' +
            ", sortOrder=" + sortOrder +
            '}';
    }
}
