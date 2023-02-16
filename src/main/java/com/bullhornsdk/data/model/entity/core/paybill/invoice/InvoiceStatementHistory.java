package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "invoiceStatement", "modifyingUser", "dateAdded", "status", "comments"})
public class InvoiceStatementHistory extends AbstractEntity implements QueryEntity {
    private Integer id;
    private InvoiceStatement invoiceStatement;
    private CorporateUser modifyingUser;
    private DateTime dateAdded;
    private String status;
    private String comments;

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

    @JsonProperty("invoiceStatement")
    public InvoiceStatement getInvoiceStatement() {
        return invoiceStatement;
    }

    @JsonProperty("invoiceStatement")
    public void setInvoiceStatement(InvoiceStatement invoiceStatement) {
        this.invoiceStatement = invoiceStatement;
    }

    @JsonProperty("modifyingUser")
    public CorporateUser getModifyingUser() {
        return modifyingUser;
    }

    @JsonProperty("modifyingUser")
    public void setModifyingUser(CorporateUser modifyingUser) {
        this.modifyingUser = modifyingUser;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceStatementHistory that = (InvoiceStatementHistory) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(invoiceStatement, that.invoiceStatement) &&
            Objects.equals(modifyingUser, that.modifyingUser) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(status, that.status) &&
            Objects.equals(comments, that.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, invoiceStatement, modifyingUser, dateAdded, status, comments);
    }

    @Override
    public String toString() {
        return "InvoiceStatementHistory{" +
            "id=" + id +
            ", invoiceStatement=" + invoiceStatement +
            ", modifyingUser=" + modifyingUser +
            ", dateAdded=" + dateAdded +
            ", status='" + status + '\'' +
            ", comments='" + comments + '\'' +
            '}';
    }
}
