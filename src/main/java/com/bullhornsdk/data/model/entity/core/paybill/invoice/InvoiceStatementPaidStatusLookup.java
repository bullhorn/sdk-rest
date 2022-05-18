package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.paybill.BillingProfile;
import com.bullhornsdk.data.model.entity.core.paybill.charge.BillableCharge;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SpecializedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.WorkflowOptionsLookup;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.file.InvoiceStatementExport;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 * Created by mkesmetzis 23-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "isDeleted", "label"
})
public class InvoiceStatementPaidStatusLookup extends AbstractEntity implements QueryEntity, SoftDeleteEntity {

    private Integer id;
    private Boolean isDeleted;
    @JsonIgnore
    private String label;

    public InvoiceStatementPaidStatusLookup() {
    }

    public InvoiceStatementPaidStatusLookup(Integer id) {
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

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceStatementPaidStatusLookup that = (InvoiceStatementPaidStatusLookup) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(isDeleted, that.isDeleted) &&
            Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, isDeleted, label);
    }

    @Override
    public String toString() {
        return "InvoiceStatementPaidStatusLookup{" +
            "id=" + id +
            ", isDeleted=" + isDeleted +
            ", label='" + label + '\'' +
            '}';
    }
}
