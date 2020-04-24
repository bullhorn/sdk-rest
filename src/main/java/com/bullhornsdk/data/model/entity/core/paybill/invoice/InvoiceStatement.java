package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.paybill.BillingProfile;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SpecializedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.WorkflowOptionsLookup;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.file.InvoiceStatementExport;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by mkesmetzis 23-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "billingAddress", "billingAttention", "billingClientContact", "billingCorporateUser",
    "billingPeriodEndDate", "billingProfile", "billingScheduleID", "clientCorporation", "creditedByInvoiceStatement",
    "creditOfInvoiceStatement", "currencyUnit", "dateAdded", "dateLastModified", "deliveryMethod", "deliveryStatus",
    "discounts", "discountTotal", "discountAmount", "dueDate", "effectiveDate", "emailErrorReason", "finalizedSubtotal", "finalizedTotal",
    "generalLedgerExportStatusLookup", "invoiceStatementDate", "invoiceStatementExports", "invoiceStatementExportsBatches",
    "invoiceStatementNumber", "invoiceStatementFinalizedDate", "invoiceStatementOrigin", "invoiceStatementTemplate", "invoiceStatementType", "invoiceTerm",
    "isDeleted", "isCredited", "isFinalized", "isReinstated", "lineItems", "lineItemTotal", "owner", "paymentTerms",
    "previousBalance", "purchaseOrderNumber", "rawInvoiceStatementNumber", "remitInstructions", "splitBys",
    "status", "subtotal", "surcharges", "surchargeTotal", "taxAmount", "taxes", "taxTotal", "total"
})
public class InvoiceStatement extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity, SoftDeleteEntity {

    private Integer id;
    private Address billingAddress;
    @JsonIgnore
    private String billingAttention;
    private ClientContact billingClientContact;
    private CorporateUser billingCorporateUser;
    private String billingPeriodEndDate;
    private BillingProfile billingProfile;
    private Integer billingScheduleID;
    private ClientCorporation clientCorporation;
    private InvoiceStatement creditedByInvoiceStatement;
    private InvoiceStatement creditOfInvoiceStatement;
    private CurrencyUnit currencyUnit;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    @JsonIgnore
    private String deliveryMethod;
    private SpecializedOptionsLookup deliveryStatus;
    private OneToMany<InvoiceStatementDiscount> discounts;
    private BigDecimal discountTotal;
    private BigDecimal discountAmount;
    private String effectiveDate;
    private Date dueDate;
    @JsonIgnore
    private String emailErrorReason;
    private BigDecimal finalizedSubtotal;
    private BigDecimal finalizedTotal;
    private SpecializedOptionsLookup generalLedgerExportStatusLookup;
    private Date invoiceStatementDate;
    private OneToMany<InvoiceStatementExport> invoiceStatementExports;
    private OneToMany<InvoiceStatementExportBatch> invoiceStatementExportsBatches;
    @JsonIgnore
    private String invoiceStatementNumber;
    private Date invoiceStatementFinalizedDate;
    @JsonIgnore
    private String invoiceStatementOrigin;
    private InvoiceStatementTemplate invoiceStatementTemplate;
    private SpecializedOptionsLookup invoiceStatementType;
    private InvoiceTerm invoiceTerm;
    private Boolean isDeleted;
    private Boolean isCredited;
    private Boolean isFinalized;
    private Boolean isReinstated;
    private OneToMany<InvoiceStatementLineItem> lineItems;
    private BigDecimal lineItemTotal;
    private CorporateUser owner;
    @JsonIgnore
    private String paymentTerms;
    private BigDecimal previousBalance;
    @JsonIgnore
    private String purchaseOrderNumber;
    private Long rawInvoiceStatementNumber;
    private String remitInstructions;
    private OneToMany<InvoiceStatementSplitBy> splitBys;
    private WorkflowOptionsLookup status;
    private BigDecimal subtotal;
    private BigDecimal surchargeTotal;
    private OneToMany<InvoiceStatementSurcharge> surcharges;
    private BigDecimal taxAmount;
    private BigDecimal taxTotal;
    private OneToMany<InvoiceStatementTax> taxes;
    private BigDecimal total;

    public InvoiceStatement() {
    }

    public InvoiceStatement(Integer id) {
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


    @JsonProperty("billingAddress")
    public Address getBillingAddress() {
        return billingAddress;
    }

    @JsonProperty("billingAddress")
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    @JsonProperty("billingAttention")
    public String getBillingAttention() {
        return billingAttention;
    }

    @JsonProperty("billingAttention")
    public void setBillingAttention(String billingAttention) {
        this.billingAttention = billingAttention;
    }

    @JsonProperty("billingClientContact")
    public ClientContact getBillingClientContact() {
        return billingClientContact;
    }

    @JsonProperty("billingClientContact")
    public void setBillingClientContact(ClientContact billingClientContact) {
        this.billingClientContact = billingClientContact;
    }

    @JsonProperty("billingCorporateUser")
    public CorporateUser getBillingCorporateUser() {
        return billingCorporateUser;
    }

    @JsonProperty("billingCorporateUser")
    public void setBillingCorporateUser(CorporateUser billingCorporateUser) {
        this.billingCorporateUser = billingCorporateUser;
    }

    @JsonProperty("billingPeriodEndDate")
    public String getBillingPeriodEndDate() {
        return billingPeriodEndDate;
    }

    @JsonProperty("billingPeriodEndDate")
    public void setBillingPeriodEndDate(String billingPeriodEndDate) {
        this.billingPeriodEndDate = billingPeriodEndDate;
    }

    @JsonProperty("billingProfile")
    public BillingProfile getBillingProfile() {
        return billingProfile;
    }

    @JsonProperty("billingProfile")
    public void setBillingProfile(BillingProfile billingProfile) {
        this.billingProfile = billingProfile;
    }

    @JsonProperty("billingScheduleID")
    public Integer getBillingScheduleID() {
        return billingScheduleID;
    }

    @JsonProperty("billingScheduleID")
    public void setBillingScheduleID(Integer billingScheduleID) {
        this.billingScheduleID = billingScheduleID;
    }

    @JsonProperty("clientCorporation")
    public ClientCorporation getClientCorporation() {
        return clientCorporation;
    }

    @JsonProperty("clientCorporation")
    public void setClientCorporation(ClientCorporation clientCorporation) {
        this.clientCorporation = clientCorporation;
    }

    @JsonProperty("creditedByInvoiceStatement")
    public InvoiceStatement getCreditedByInvoiceStatement() {
        return creditedByInvoiceStatement;
    }

    @JsonProperty("creditedByInvoiceStatement")
    public void setCreditedByInvoiceStatement(InvoiceStatement creditedByInvoiceStatement) {
        this.creditedByInvoiceStatement = creditedByInvoiceStatement;
    }

    @JsonProperty("creditOfInvoiceStatement")
    public InvoiceStatement getCreditOfInvoiceStatement() {
        return creditOfInvoiceStatement;
    }

    @JsonProperty("creditOfInvoiceStatement")
    public void setCreditOfInvoiceStatement(InvoiceStatement creditOfInvoiceStatement) {
        this.creditOfInvoiceStatement = creditOfInvoiceStatement;
    }

    @JsonProperty("currencyUnit")
    public CurrencyUnit getCurrencyUnit() {
        return currencyUnit;
    }

    @JsonProperty("currencyUnit")
    public void setCurrencyUnit(CurrencyUnit currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
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

    @JsonProperty("deliveryMethod")
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    @JsonProperty("deliveryMethod")
    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    @JsonProperty("deliveryStatus")
    public SpecializedOptionsLookup getDeliveryStatus() {
        return deliveryStatus;
    }

    @JsonProperty("deliveryStatus")
    public void setDeliveryStatus(SpecializedOptionsLookup deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    @JsonProperty("discounts")
    public OneToMany<InvoiceStatementDiscount> getDiscounts() {
        return discounts;
    }

    @JsonProperty("discounts")
    public void setDiscounts(OneToMany<InvoiceStatementDiscount> discounts) {
        this.discounts = discounts;
    }

    @JsonProperty("discountTotal")
    public BigDecimal getDiscountTotal() {
        return discountTotal;
    }

    @JsonProperty("discountTotal")
    public void setDiscountTotal(BigDecimal discountTotal) {
        this.discountTotal = discountTotal;
    }

    @JsonProperty("dueDate")
    public Date getDueDate() {
        return dueDate;
    }

    @JsonProperty("dueDate")
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @JsonProperty("emailErrorReason")
    public String getEmailErrorReason() {
        return emailErrorReason;
    }

    @JsonProperty("emailErrorReason")
    public void setEmailErrorReason(String emailErrorReason) {
        this.emailErrorReason = emailErrorReason;
    }

    @JsonProperty("finalizedSubtotal")
    public BigDecimal getFinalizedSubtotal() {
        return finalizedSubtotal;
    }

    @JsonProperty("finalizedSubtotal")
    public void setFinalizedSubtotal(BigDecimal finalizedSubtotal) {
        this.finalizedSubtotal = finalizedSubtotal;
    }

    @JsonProperty("finalizedTotal")
    public BigDecimal getFinalizedTotal() {
        return finalizedTotal;
    }

    @JsonProperty("finalizedTotal")
    public void setFinalizedTotal(BigDecimal finalizedTotal) {
        this.finalizedTotal = finalizedTotal;
    }

    @JsonProperty("generalLedgerExportStatusLookup")
    public SpecializedOptionsLookup getGeneralLedgerExportStatusLookup() {
        return generalLedgerExportStatusLookup;
    }

    @JsonProperty("generalLedgerExportStatusLookup")
    public void setGeneralLedgerExportStatusLookup(SpecializedOptionsLookup generalLedgerExportStatusLookup) {
        this.generalLedgerExportStatusLookup = generalLedgerExportStatusLookup;
    }

    @JsonProperty("invoiceStatementDate")
    public Date getInvoiceStatementDate() {
        return invoiceStatementDate;
    }

    @JsonProperty("invoiceStatementDate")
    public void setInvoiceStatementDate(Date invoiceStatementDate) {
        this.invoiceStatementDate = invoiceStatementDate;
    }

    @JsonProperty("invoiceStatementExports")
    public OneToMany<InvoiceStatementExport> getInvoiceStatementExports() {
        return invoiceStatementExports;
    }

    @JsonProperty("invoiceStatementExports")
    public void setInvoiceStatementExports(OneToMany<InvoiceStatementExport> invoiceStatementExports) {
        this.invoiceStatementExports = invoiceStatementExports;
    }

    @JsonProperty("invoiceStatementNumber")
    public String getInvoiceStatementNumber() {
        return invoiceStatementNumber;
    }

    @JsonProperty("invoiceStatementNumber")
    public void setInvoiceStatementNumber(String invoiceStatementNumber) {
        this.invoiceStatementNumber = invoiceStatementNumber;
    }

    @JsonProperty("invoiceStatementOrigin")
    public String getInvoiceStatementOrigin() {
        return invoiceStatementOrigin;
    }

    @JsonProperty("invoiceStatementOrigin")
    public void setInvoiceStatementOrigin(String invoiceStatementOrigin) {
        this.invoiceStatementOrigin = invoiceStatementOrigin;
    }

    @JsonProperty("invoiceStatementTemplate")
    public InvoiceStatementTemplate getInvoiceStatementTemplate() {
        return invoiceStatementTemplate;
    }

    @JsonProperty("invoiceStatementTemplate")
    public void setInvoiceStatementTemplate(InvoiceStatementTemplate invoiceStatementTemplate) {
        this.invoiceStatementTemplate = invoiceStatementTemplate;
    }

    @JsonProperty("invoiceStatementType")
    public SpecializedOptionsLookup getInvoiceStatementType() {
        return invoiceStatementType;
    }

    @JsonProperty("invoiceStatementType")
    public void setInvoiceStatementType(SpecializedOptionsLookup invoiceStatementType) {
        this.invoiceStatementType = invoiceStatementType;
    }

    @JsonProperty("invoiceTerm")
    public InvoiceTerm getInvoiceTerm() {
        return invoiceTerm;
    }

    @JsonProperty("invoiceTerm")
    public void setInvoiceTerm(InvoiceTerm invoiceTerm) {
        this.invoiceTerm = invoiceTerm;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("isCredited")
    public Boolean getIsCredited() {
        return isCredited;
    }

    @JsonProperty("isCredited")
    public void setIsCredited(Boolean credited) {
        isCredited = credited;
    }

    @JsonProperty("isFinalized")
    public Boolean getIsFinalized() {
        return isFinalized;
    }

    @JsonProperty("isFinalized")
    public void setIsFinalized(Boolean finalized) {
        isFinalized = finalized;
    }

    @JsonProperty("isReinstated")
    public Boolean getIsReinstated() {
        return isReinstated;
    }

    @JsonProperty("isReinstated")
    public void setIsReinstated(Boolean reinstated) {
        isReinstated = reinstated;
    }

    @JsonProperty("lineItems")
    public OneToMany<InvoiceStatementLineItem> getLineItems() {
        return lineItems;
    }

    @JsonProperty("lineItems")
    public void setLineItems(OneToMany<InvoiceStatementLineItem> lineItems) {
        this.lineItems = lineItems;
    }

    @JsonProperty("lineItemTotal")
    public BigDecimal getLineItemTotal() {
        return lineItemTotal;
    }

    @JsonProperty("lineItemTotal")
    public void setLineItemTotal(BigDecimal lineItemTotal) {
        this.lineItemTotal = lineItemTotal;
    }

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @JsonProperty("previousBalance")
    public BigDecimal getPreviousBalance() {
        return previousBalance;
    }

    @JsonProperty("previousBalance")
    public void setPreviousBalance(BigDecimal previousBalance) {
        this.previousBalance = previousBalance;
    }

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    @JsonProperty("purchaseOrderNumber")
    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    @JsonProperty("rawInvoiceStatementNumber")
    public Long getRawInvoiceStatementNumber() {
        return rawInvoiceStatementNumber;
    }

    @JsonProperty("rawInvoiceStatementNumber")
    public void setRawInvoiceStatementNumber(Long rawInvoiceStatementNumber) {
        this.rawInvoiceStatementNumber = rawInvoiceStatementNumber;
    }

    @JsonProperty("remitInstructions")
    public String getRemitInstructions() {
        return remitInstructions;
    }

    @JsonProperty("remitInstructions")
    public void setRemitInstructions(String remitInstructions) {
        this.remitInstructions = remitInstructions;
    }

    @JsonProperty("splitBys")
    public OneToMany<InvoiceStatementSplitBy> getSplitBys() {
        return splitBys;
    }

    @JsonProperty("splitBys")
    public void setSplitBys(OneToMany<InvoiceStatementSplitBy> splitBys) {
        this.splitBys = splitBys;
    }

    @JsonProperty("status")
    public WorkflowOptionsLookup getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(WorkflowOptionsLookup status) {
        this.status = status;
    }

    @JsonProperty("subtotal")
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    @JsonProperty("subtotal")
    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    @JsonProperty("surcharges")
    public OneToMany<InvoiceStatementSurcharge> getSurcharges() {
        return surcharges;
    }

    @JsonProperty("surcharges")
    public void setSurcharges(OneToMany<InvoiceStatementSurcharge> surcharges) {
        this.surcharges = surcharges;
    }

    @JsonProperty("surchargeTotal")
    public BigDecimal getSurchargeTotal() {
        return surchargeTotal;
    }

    @JsonProperty("surchargeTotal")
    public void setSurchargeTotal(BigDecimal surchargeTotal) {
        this.surchargeTotal = surchargeTotal;
    }

    @JsonProperty("taxes")
    public OneToMany<InvoiceStatementTax> getTaxes() {
        return taxes;
    }

    @JsonProperty("taxes")
    public void setTaxes(OneToMany<InvoiceStatementTax> taxes) {
        this.taxes = taxes;
    }

    @JsonProperty("taxTotal")
    public BigDecimal getTaxTotal() {
        return taxTotal;
    }

    @JsonProperty("taxTotal")
    public void setTaxTotal(BigDecimal taxTotal) {
        this.taxTotal = taxTotal;
    }

    @JsonProperty("total")
    public BigDecimal getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(BigDecimal total) {
        this.total = total;
    }


    @JsonProperty("discountAmount")
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    @JsonProperty("discountAmount")
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("invoiceStatementExportsBatches")
    public OneToMany<InvoiceStatementExportBatch> getInvoiceStatementExportsBatches() {
        return invoiceStatementExportsBatches;
    }

    @JsonProperty("invoiceStatementExportsBatches")
    public void setInvoiceStatementExportsBatches(OneToMany<InvoiceStatementExportBatch> invoiceStatementExportsBatches) {
        this.invoiceStatementExportsBatches = invoiceStatementExportsBatches;
    }

    @JsonProperty("invoiceStatementFinalizedDate")
    public Date getInvoiceStatementFinalizedDate() {
        return invoiceStatementFinalizedDate;
    }

    @JsonProperty("invoiceStatementFinalizedDate")
    public void setInvoiceStatementFinalizedDate(Date invoiceStatementFinalizedDate) {
        this.invoiceStatementFinalizedDate = invoiceStatementFinalizedDate;
    }

    @JsonProperty("paymentTerms")
    public String getPaymentTerms() {
        return paymentTerms;
    }

    @JsonProperty("paymentTerms")
    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    @JsonProperty("taxAmount")
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    @JsonProperty("taxAmount")
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }
}
