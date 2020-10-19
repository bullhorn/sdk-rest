package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.model.entity.core.paybill.detail.BillMasterTransactionSalesTaxDetail;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatement;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "baseAmount", "billMasterTransactionSalesTaxDetail", "dateAdded", "invoiceStatement", "jurisdictionName", "jurisdictionType",
    "rate", "taxAmount"
})
public class InvoiceStatementSalesTaxRate extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {

    private Integer id;
    private BigDecimal baseAmount;
    private BillMasterTransactionSalesTaxDetail billMasterTransactionSalesTaxDetail;
    private DateTime dateAdded;
    private InvoiceStatement invoiceStatement;
    private String jurisdictionName;
    private SimplifiedOptionsLookup jurisdictionType;
    private BigDecimal rate;
    private BigDecimal taxAmount;

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

    @JsonProperty("baseAmount")
    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    @JsonProperty("baseAmount")
    public void setBaseAmount(BigDecimal baseAmount) {
        this.baseAmount = baseAmount;
    }

    @JsonProperty("billMasterTransactionSalesTaxDetail")
    public BillMasterTransactionSalesTaxDetail getBillMasterTransactionSalesTaxDetail() {
        return billMasterTransactionSalesTaxDetail;
    }

    @JsonProperty("billMasterTransactionSalesTaxDetail")
    public void setBillMasterTransactionSalesTaxDetail(BillMasterTransactionSalesTaxDetail billMasterTransactionSalesTaxDetail) {
        this.billMasterTransactionSalesTaxDetail = billMasterTransactionSalesTaxDetail;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("invoiceStatement")
    public InvoiceStatement getInvoiceStatement() {
        return invoiceStatement;
    }

    @JsonProperty("invoiceStatement")
    public void setInvoiceStatement(InvoiceStatement invoiceStatement) {
        this.invoiceStatement = invoiceStatement;
    }

    @JsonProperty("jurisdictionName")
    public String getJurisdictionName() {
        return jurisdictionName;
    }

    @JsonProperty("jurisdictionName")
    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
    }

    @JsonProperty("jurisdictionType")
    public SimplifiedOptionsLookup getJurisdictionType() {
        return jurisdictionType;
    }

    @JsonProperty("jurisdictionType")
    public void setJurisdictionType(SimplifiedOptionsLookup jurisdictionType) {
        this.jurisdictionType = jurisdictionType;
    }

    @JsonProperty("rate")
    public BigDecimal getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @JsonProperty("taxAmount")
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    @JsonProperty("taxAmount")
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceStatementSalesTaxRate that = (InvoiceStatementSalesTaxRate) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(baseAmount, that.baseAmount) &&
            Objects.equals(billMasterTransactionSalesTaxDetail, that.billMasterTransactionSalesTaxDetail) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(invoiceStatement, that.invoiceStatement) &&
            Objects.equals(jurisdictionName, that.jurisdictionName) &&
            Objects.equals(jurisdictionType, that.jurisdictionType) &&
            Objects.equals(rate, that.rate) &&
            Objects.equals(taxAmount, that.taxAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, baseAmount, billMasterTransactionSalesTaxDetail, dateAdded, invoiceStatement, jurisdictionName, jurisdictionType, rate, taxAmount);
    }

    @Override
    public String toString() {
        return "InvoiceStatementSalesTaxRate{" +
            "id=" + id +
            ", baseAmount=" + baseAmount +
            ", billMasterTransactionSalesTaxDetail=" + billMasterTransactionSalesTaxDetail +
            ", dateAdded=" + dateAdded +
            ", invoiceStatement=" + invoiceStatement +
            ", jurisdictionName='" + jurisdictionName + '\'' +
            ", jurisdictionType=" + jurisdictionType +
            ", rate=" + rate +
            ", taxAmount=" + taxAmount +
            '}';
    }
}
