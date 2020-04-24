package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

/**
 * Created by mkesmetzis 23-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "batchStatus", "invoiceStatement", "dateAdded", "dateLastModified", "owner"})
public class InvoiceStatementExportBatch extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity {

    private Integer id;
    private SimplifiedOptionsLookup batchStatus;
    private OneToMany<InvoiceStatement> invoiceStatement;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private CorporateUser owner;

    public InvoiceStatementExportBatch() {
    }

    public InvoiceStatementExportBatch(Integer id) {
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


    @JsonProperty("batchStatus")
    public SimplifiedOptionsLookup getBatchStatus() {
        return batchStatus;
    }

    @JsonProperty("batchStatus")
    public void setBatchStatus(SimplifiedOptionsLookup batchStatus) {
        this.batchStatus = batchStatus;
    }

    @JsonProperty("invoiceStatement")
    public OneToMany<InvoiceStatement> getInvoiceStatement() {
        return invoiceStatement;
    }

    @JsonProperty("invoiceStatement")
    public void setInvoiceStatements(OneToMany<InvoiceStatement> invoiceStatement) {
        this.invoiceStatement = invoiceStatement;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @ReadOnly
    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }
}
