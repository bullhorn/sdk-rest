package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.BillMasterTransaction;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.paybill.unit.UnitOfMeasure;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by mkesmetzis 23-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "dateAdded", "displayValue", "field", "invoiceStatementLineItem", "sortOrder", "sortOrder", "value"
})
public class InvoiceStatementLineItemSummarizeBy extends AbstractEntity implements QueryEntity {

    private Integer id;
    private DateTime dateAdded;
    @JsonIgnore
    private String displayValue;
    @JsonIgnore
    private String field;
    private InvoiceStatementLineItem invoiceStatementLineItem;
    private Integer sortOrder;
    @JsonIgnore
    private String value;

    public InvoiceStatementLineItemSummarizeBy() {
    }

    public InvoiceStatementLineItemSummarizeBy(Integer id) {
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

    @JsonProperty("displayValue")
    public String getDisplayValue() {
        return displayValue;
    }

    @JsonProperty("displayValue")
    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    @JsonProperty("field")
    public String getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    @JsonProperty("invoiceStatementLineItem")
    public InvoiceStatementLineItem getInvoiceStatementLineItem() {
        return invoiceStatementLineItem;
    }

    @JsonProperty("invoiceStatementLineItem")
    public void setInvoiceStatementLineItem(InvoiceStatementLineItem invoiceStatementLineItem) {
        this.invoiceStatementLineItem = invoiceStatementLineItem;
    }

    @JsonProperty("sortOrder")
    public Integer getSortOrder() {
        return sortOrder;
    }

    @JsonProperty("sortOrder")
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceStatementLineItemSummarizeBy that = (InvoiceStatementLineItemSummarizeBy) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(displayValue, that.displayValue) &&
            Objects.equals(field, that.field) &&
            Objects.equals(invoiceStatementLineItem, that.invoiceStatementLineItem) &&
            Objects.equals(sortOrder, that.sortOrder) &&
            Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, dateAdded, displayValue, field, invoiceStatementLineItem, sortOrder, value);
    }

    @Override
    public String toString() {
        return "InvoiceStatementLineItemSummarizeBy{" +
            "id=" + id +
            ", dateAdded=" + dateAdded +
            ", displayValue='" + displayValue + '\'' +
            ", field='" + field + '\'' +
            ", invoiceStatementLineItem=" + invoiceStatementLineItem +
            ", sortOrder=" + sortOrder +
            ", value='" + value + '\'' +
            '}';
    }
}
