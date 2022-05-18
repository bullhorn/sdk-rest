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
@JsonPropertyOrder({"id", "amountPaid", "bccRecipients", "billableCharges", "billingAddress", "billingAttention", "billingClientContact", "billingCorporateUser",
    "billingPeriodEndDate", "billingProfile", "billingProfileCorrelatedCustomText1", "billingProfileCorrelatedCustomText2", "billingProfileCorrelatedCustomText3",
    "billingProfileCorrelatedCustomText4", "billingProfileCorrelatedCustomText5", "billingProfileCorrelatedCustomText6", "billingProfileCorrelatedCustomText7",
    "billingProfileCorrelatedCustomText8", "billingProfileCorrelatedCustomText9", "billingProfileCorrelatedCustomText10", "billingProfileCorrelatedCustomTextBlock1",
    "billingProfileCorrelatedCustomTextBlock2", "billingProfileCorrelatedCustomTextBlock3", "billingScheduleID", "candidates", "ccRecipients", "clientCorporation",
    "creditedByInvoiceStatement", "creditOfInvoiceStatement", "currencyUnit", "dateAdded", "dateLastModified", "deliveryMethod", "deliveryMethodLookup", "deliveryStatus",
    "discounts", "discountTotal", "discountAmount", "dueDate", "effectiveDate", "emailErrorReason", "fileTypesForInvoicing", "finalizedSubtotal", "finalizedTotal",
    "generalLedgerExportStatusLookup", "invoiceStatementDate", "invoiceStatementDistributionBatch", "invoiceStatementExports", "invoiceStatementExportsBatches",
    "invoiceStatementNumber", "invoiceStatementFinalizedDate", "invoiceStatementLineDistributions", "invoiceStatementMessageTemplate", "invoiceStatementOrigin",
    "invoiceStatementPaidStatus", "invoiceStatementTemplate", "invoiceStatementType", "invoiceTerm",
    "isDeleted", "isCredited", "isFinalized", "isReinstated", "lineItems", "lineItemTotal", "outstandingBalance", "owner", "paymentCount", "paymentTerms",
    "previousBalance", "purchaseOrderNumber", "rebillFromInvoices", "rebillNumberFromInvoiceStatement", "rebillSuffix", "rebillToInvoices", "rawInvoiceStatementNumber",
    "remitInstructions", "splitBys", "status", "subtotal", "surchargeAmount", "surcharges", "surchargeTotal", "taxAmount", "taxes", "taxTotal", "toRecipients", "total"
})
public class InvoiceStatement extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity, AssociationEntity {

    private Integer id;
    private BigDecimal amountPaid;
    private OneToMany<Person> bccRecipients;
    private OneToMany<BillableCharge> billableCharges;
    private Address billingAddress;
    @JsonIgnore
    private String billingAttention;
    private ClientContact billingClientContact;
    private CorporateUser billingCorporateUser;
    private String billingPeriodEndDate;
    private BillingProfile billingProfile;
    @JsonIgnore
    private String billingProfileCorrelatedCustomText1;
    @JsonIgnore
    private String billingProfileCorrelatedCustomText2;
    @JsonIgnore
    private String billingProfileCorrelatedCustomText3;
    @JsonIgnore
    private String billingProfileCorrelatedCustomText4;
    @JsonIgnore
    private String billingProfileCorrelatedCustomText5;
    @JsonIgnore
    private String billingProfileCorrelatedCustomText6;
    @JsonIgnore
    private String billingProfileCorrelatedCustomText7;
    @JsonIgnore
    private String billingProfileCorrelatedCustomText8;
    @JsonIgnore
    private String billingProfileCorrelatedCustomText9;
    @JsonIgnore
    private String billingProfileCorrelatedCustomText10;
    @JsonIgnore
    private String billingProfileCorrelatedCustomTextBlock1;
    @JsonIgnore
    private String billingProfileCorrelatedCustomTextBlock2;
    @JsonIgnore
    private String billingProfileCorrelatedCustomTextBlock3;
    private Integer billingScheduleID;
    private OneToMany<Candidate> candidates;
    private OneToMany<Person> ccRecipients;
    private ClientCorporation clientCorporation;
    private InvoiceStatement creditedByInvoiceStatement;
    private InvoiceStatement creditOfInvoiceStatement;
    private CurrencyUnit currencyUnit;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    @JsonIgnore
    private String deliveryMethod;
    private SpecializedOptionsLookup deliveryMethodLookup;
    private SpecializedOptionsLookup deliveryStatus;
    private OneToMany<InvoiceStatementDiscount> discounts;
    private BigDecimal discountTotal;
    private BigDecimal discountAmount;
    private Date effectiveDate;
    private Date dueDate;
    @JsonIgnore
    private String emailErrorReason;
    private OneToMany<SpecializedOptionsLookup> fileTypesForInvoicing;
    private BigDecimal finalizedSubtotal;
    private BigDecimal finalizedTotal;
    private SpecializedOptionsLookup generalLedgerExportStatusLookup;
    private Date invoiceStatementDate;
    private InvoiceStatementDistributionBatch invoiceStatementDistributionBatch;
    private OneToMany<InvoiceStatementExport> invoiceStatementExports;
    private OneToMany<InvoiceStatementExportBatch> invoiceStatementExportsBatches;
    @JsonIgnore
    private String invoiceStatementNumber;
    private Date invoiceStatementFinalizedDate;
    private OneToMany<InvoiceStatementLineDistribution> invoiceStatementLineDistributions;
    private InvoiceStatementMessageTemplate invoiceStatementMessageTemplate;
    @JsonIgnore
    private String invoiceStatementOrigin;
    private InvoiceStatementPaidStatusLookup invoiceStatementPaidStatus;
    private InvoiceStatementTemplate invoiceStatementTemplate;
    private SpecializedOptionsLookup invoiceStatementType;
    private InvoiceTerm invoiceTerm;
    private Boolean isDeleted;
    private Boolean isCredited;
    private Boolean isFinalized;
    private Boolean isReinstated;
    private OneToMany<InvoiceStatementLineItem> lineItems;
    private BigDecimal lineItemTotal;
    private BigDecimal outstandingBalance;
    private CorporateUser owner;
    private Integer paymentCount;
    @JsonIgnore
    private String paymentTerms;
    private BigDecimal previousBalance;
    @JsonIgnore
    private String purchaseOrderNumber;
    private Long rawInvoiceStatementNumber;
    private InvoiceStatement rebillFromInvoices;
    private InvoiceStatement rebillNumberFromInvoiceStatement;
    @JsonIgnore
    private String rebillSuffix;
    private InvoiceStatement rebillToInvoices;
    private String remitInstructions;
    private OneToMany<InvoiceStatementSplitBy> splitBys;
    private WorkflowOptionsLookup status;
    private BigDecimal subtotal;
    private BigDecimal surchargeAmount;
    private BigDecimal surchargeTotal;
    private OneToMany<InvoiceStatementSurcharge> surcharges;
    private BigDecimal taxAmount;
    private BigDecimal taxTotal;
    private Person toRecipients;
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

    @JsonProperty("amountPaid")
    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    @JsonProperty("amountPaid")
    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    @JsonProperty("bccRecipients")
    public OneToMany<Person> getBccRecipients() {
        return bccRecipients;
    }

    @JsonProperty("bccRecipients")
    public void setBccRecipients(OneToMany<Person> bccRecipients) {
        this.bccRecipients = bccRecipients;
    }

    @JsonProperty("billableCharges")
    public OneToMany<BillableCharge> getBillableCharges() {
        return billableCharges;
    }

    @JsonProperty("billableCharges")
    public void setBillableCharges(OneToMany<BillableCharge> billableCharges) {
        this.billableCharges = billableCharges;
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

    @JsonProperty("billingProfileCorrelatedCustomText1")
    public String getBillingProfileCorrelatedCustomText1() {
        return billingProfileCorrelatedCustomText1;
    }

    @JsonProperty("billingProfileCorrelatedCustomText1")
    public void setBillingProfileCorrelatedCustomText1(String billingProfileCorrelatedCustomText1) {
        this.billingProfileCorrelatedCustomText1 = billingProfileCorrelatedCustomText1;
    }

    @JsonProperty("billingProfileCorrelatedCustomText2")
    public String getBillingProfileCorrelatedCustomText2() {
        return billingProfileCorrelatedCustomText2;
    }

    @JsonProperty("billingProfileCorrelatedCustomText2")
    public void setBillingProfileCorrelatedCustomText2(String billingProfileCorrelatedCustomText2) {
        this.billingProfileCorrelatedCustomText2 = billingProfileCorrelatedCustomText2;
    }

    @JsonProperty("billingProfileCorrelatedCustomText3")
    public String getBillingProfileCorrelatedCustomText3() {
        return billingProfileCorrelatedCustomText3;
    }

    @JsonProperty("billingProfileCorrelatedCustomText3")
    public void setBillingProfileCorrelatedCustomText3(String billingProfileCorrelatedCustomText3) {
        this.billingProfileCorrelatedCustomText3 = billingProfileCorrelatedCustomText3;
    }

    @JsonProperty("billingProfileCorrelatedCustomText4")
    public String getBillingProfileCorrelatedCustomText4() {
        return billingProfileCorrelatedCustomText4;
    }

    @JsonProperty("billingProfileCorrelatedCustomText4")
    public void setBillingProfileCorrelatedCustomText4(String billingProfileCorrelatedCustomText4) {
        this.billingProfileCorrelatedCustomText4 = billingProfileCorrelatedCustomText4;
    }

    @JsonProperty("billingProfileCorrelatedCustomText5")
    public String getBillingProfileCorrelatedCustomText5() {
        return billingProfileCorrelatedCustomText5;
    }

    @JsonProperty("billingProfileCorrelatedCustomText5")
    public void setBillingProfileCorrelatedCustomText5(String billingProfileCorrelatedCustomText5) {
        this.billingProfileCorrelatedCustomText5 = billingProfileCorrelatedCustomText5;
    }

    @JsonProperty("billingProfileCorrelatedCustomText6")
    public String getBillingProfileCorrelatedCustomText6() {
        return billingProfileCorrelatedCustomText6;
    }

    @JsonProperty("billingProfileCorrelatedCustomText6")
    public void setBillingProfileCorrelatedCustomText6(String billingProfileCorrelatedCustomText6) {
        this.billingProfileCorrelatedCustomText6 = billingProfileCorrelatedCustomText6;
    }

    @JsonProperty("billingProfileCorrelatedCustomText7")
    public String getBillingProfileCorrelatedCustomText7() {
        return billingProfileCorrelatedCustomText7;
    }

    @JsonProperty("billingProfileCorrelatedCustomText7")
    public void setBillingProfileCorrelatedCustomText7(String billingProfileCorrelatedCustomText7) {
        this.billingProfileCorrelatedCustomText7 = billingProfileCorrelatedCustomText7;
    }

    @JsonProperty("billingProfileCorrelatedCustomText8")
    public String getBillingProfileCorrelatedCustomText8() {
        return billingProfileCorrelatedCustomText8;
    }

    @JsonProperty("billingProfileCorrelatedCustomText8")
    public void setBillingProfileCorrelatedCustomText8(String billingProfileCorrelatedCustomText8) {
        this.billingProfileCorrelatedCustomText8 = billingProfileCorrelatedCustomText8;
    }

    @JsonProperty("billingProfileCorrelatedCustomText9")
    public String getBillingProfileCorrelatedCustomText9() {
        return billingProfileCorrelatedCustomText9;
    }

    @JsonProperty("billingProfileCorrelatedCustomText9")
    public void setBillingProfileCorrelatedCustomText9(String billingProfileCorrelatedCustomText9) {
        this.billingProfileCorrelatedCustomText9 = billingProfileCorrelatedCustomText9;
    }

    @JsonProperty("billingProfileCorrelatedCustomText10")
    public String getBillingProfileCorrelatedCustomText10() {
        return billingProfileCorrelatedCustomText10;
    }

    @JsonProperty("billingProfileCorrelatedCustomText10")
    public void setBillingProfileCorrelatedCustomText10(String billingProfileCorrelatedCustomText10) {
        this.billingProfileCorrelatedCustomText10 = billingProfileCorrelatedCustomText10;
    }

    @JsonProperty("billingProfileCorrelatedCustomTextBlock1")
    public String getBillingProfileCorrelatedCustomTextBlock1() {
        return billingProfileCorrelatedCustomTextBlock1;
    }

    @JsonProperty("billingProfileCorrelatedCustomTextBlock1")
    public void setBillingProfileCorrelatedCustomTextBlock1(String billingProfileCorrelatedCustomTextBlock1) {
        this.billingProfileCorrelatedCustomTextBlock1 = billingProfileCorrelatedCustomTextBlock1;
    }

    @JsonProperty("billingProfileCorrelatedCustomTextBlock2")
    public String getBillingProfileCorrelatedCustomTextBlock2() {
        return billingProfileCorrelatedCustomTextBlock2;
    }

    @JsonProperty("billingProfileCorrelatedCustomTextBlock2")
    public void setBillingProfileCorrelatedCustomTextBlock2(String billingProfileCorrelatedCustomTextBlock2) {
        this.billingProfileCorrelatedCustomTextBlock2 = billingProfileCorrelatedCustomTextBlock2;
    }

    @JsonProperty("billingProfileCorrelatedCustomTextBlock3")
    public String getBillingProfileCorrelatedCustomTextBlock3() {
        return billingProfileCorrelatedCustomTextBlock3;
    }

    @JsonProperty("billingProfileCorrelatedCustomTextBlock3")
    public void setBillingProfileCorrelatedCustomTextBlock3(String billingProfileCorrelatedCustomTextBlock3) {
        this.billingProfileCorrelatedCustomTextBlock3 = billingProfileCorrelatedCustomTextBlock3;
    }

    @JsonProperty("billingScheduleID")
    public Integer getBillingScheduleID() {
        return billingScheduleID;
    }

    @JsonProperty("candidates")
    public OneToMany<Candidate> getCandidates() {
        return candidates;
    }

    @JsonProperty("candidates")
    public void setCandidates(OneToMany<Candidate> candidates) {
        this.candidates = candidates;
    }

    @JsonProperty("billingScheduleID")
    public void setBillingScheduleID(Integer billingScheduleID) {
        this.billingScheduleID = billingScheduleID;
    }

    @JsonProperty("ccRecipients")
    public OneToMany<Person> getCcRecipients() {
        return ccRecipients;
    }

    @JsonProperty("ccRecipients")
    public void setCcRecipients(OneToMany<Person> ccRecipients) {
        this.ccRecipients = ccRecipients;
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

    @Override
    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

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

    @JsonProperty("deliveryMethodLookup")
    public SpecializedOptionsLookup getDeliveryMethodLookup() {
        return deliveryMethodLookup;
    }

    @JsonProperty("deliveryMethodLookup")
    public void setDeliveryMethodLookup(SpecializedOptionsLookup deliveryMethodLookup) {
        this.deliveryMethodLookup = deliveryMethodLookup;
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

    @JsonProperty("discountAmount")
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    @JsonProperty("discountAmount")
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    @JsonProperty("effectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    @JsonProperty("fileTypesForInvoicing")
    public OneToMany<SpecializedOptionsLookup> getFileTypesForInvoicing() {
        return fileTypesForInvoicing;
    }

    @JsonProperty("fileTypesForInvoicing")
    public void setFileTypesForInvoicing(OneToMany<SpecializedOptionsLookup> fileTypesForInvoicing) {
        this.fileTypesForInvoicing = fileTypesForInvoicing;
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

    @JsonProperty("invoiceStatementDistributionBatch")
    public InvoiceStatementDistributionBatch getInvoiceStatementDistributionBatch() {
        return invoiceStatementDistributionBatch;
    }

    @JsonProperty("invoiceStatementDistributionBatch")
    public void setInvoiceStatementDistributionBatch(InvoiceStatementDistributionBatch invoiceStatementDistributionBatch) {
        this.invoiceStatementDistributionBatch = invoiceStatementDistributionBatch;
    }

    @JsonProperty("invoiceStatementExports")
    public OneToMany<InvoiceStatementExport> getInvoiceStatementExports() {
        return invoiceStatementExports;
    }

    @JsonProperty("invoiceStatementExports")
    public void setInvoiceStatementExports(OneToMany<InvoiceStatementExport> invoiceStatementExports) {
        this.invoiceStatementExports = invoiceStatementExports;
    }

    @JsonProperty("invoiceStatementExportsBatches")
    public OneToMany<InvoiceStatementExportBatch> getInvoiceStatementExportsBatches() {
        return invoiceStatementExportsBatches;
    }

    @JsonProperty("invoiceStatementExportsBatches")
    public void setInvoiceStatementExportsBatches(OneToMany<InvoiceStatementExportBatch> invoiceStatementExportsBatches) {
        this.invoiceStatementExportsBatches = invoiceStatementExportsBatches;
    }

    @JsonProperty("invoiceStatementNumber")
    public String getInvoiceStatementNumber() {
        return invoiceStatementNumber;
    }

    @JsonProperty("invoiceStatementNumber")
    public void setInvoiceStatementNumber(String invoiceStatementNumber) {
        this.invoiceStatementNumber = invoiceStatementNumber;
    }

    @JsonProperty("invoiceStatementFinalizedDate")
    public Date getInvoiceStatementFinalizedDate() {
        return invoiceStatementFinalizedDate;
    }

    @JsonProperty("invoiceStatementFinalizedDate")
    public void setInvoiceStatementFinalizedDate(Date invoiceStatementFinalizedDate) {
        this.invoiceStatementFinalizedDate = invoiceStatementFinalizedDate;
    }

    @JsonProperty("invoiceStatementLineDistributions")
    public OneToMany<InvoiceStatementLineDistribution> getInvoiceStatementLineDistributions() {
        return invoiceStatementLineDistributions;
    }

    @JsonProperty("invoiceStatementLineDistributions")
    public void setInvoiceStatementLineDistributions(OneToMany<InvoiceStatementLineDistribution> invoiceStatementLineDistributions) {
        this.invoiceStatementLineDistributions = invoiceStatementLineDistributions;
    }

    @JsonProperty("invoiceStatementMessageTemplate")
    public InvoiceStatementMessageTemplate getInvoiceStatementMessageTemplate() {
        return invoiceStatementMessageTemplate;
    }

    @JsonProperty("invoiceStatementMessageTemplate")
    public void setInvoiceStatementMessageTemplate(InvoiceStatementMessageTemplate invoiceStatementMessageTemplate) {
        this.invoiceStatementMessageTemplate = invoiceStatementMessageTemplate;
    }

    @JsonProperty("invoiceStatementOrigin")
    public String getInvoiceStatementOrigin() {
        return invoiceStatementOrigin;
    }

    @JsonProperty("invoiceStatementOrigin")
    public void setInvoiceStatementOrigin(String invoiceStatementOrigin) {
        this.invoiceStatementOrigin = invoiceStatementOrigin;
    }

    @JsonProperty("invoiceStatementPaidStatus")
    public InvoiceStatementPaidStatusLookup getInvoiceStatementPaidStatus() {
        return invoiceStatementPaidStatus;
    }

    @JsonProperty("invoiceStatementPaidStatus")
    public void setInvoiceStatementPaidStatus(InvoiceStatementPaidStatusLookup invoiceStatementPaidStatus) {
        this.invoiceStatementPaidStatus = invoiceStatementPaidStatus;
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
    public Boolean getDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @JsonProperty("isCredited")
    public Boolean getCredited() {
        return isCredited;
    }

    @JsonProperty("isCredited")
    public void setCredited(Boolean credited) {
        isCredited = credited;
    }

    @JsonProperty("isFinalized")
    public Boolean getFinalized() {
        return isFinalized;
    }

    @JsonProperty("isFinalized")
    public void setFinalized(Boolean finalized) {
        isFinalized = finalized;
    }

    @JsonProperty("isReinstated")
    public Boolean getReinstated() {
        return isReinstated;
    }

    @JsonProperty("isReinstated")
    public void setReinstated(Boolean reinstated) {
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

    @JsonProperty("outstandingBalance")
    public BigDecimal getOutstandingBalance() {
        return outstandingBalance;
    }

    @JsonProperty("outstandingBalance")
    public void setOutstandingBalance(BigDecimal outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @JsonProperty("paymentCount")
    public Integer getPaymentCount() {
        return paymentCount;
    }

    @JsonProperty("paymentCount")
    public void setPaymentCount(Integer paymentCount) {
        this.paymentCount = paymentCount;
    }

    @JsonProperty("paymentTerms")
    public String getPaymentTerms() {
        return paymentTerms;
    }

    @JsonProperty("paymentTerms")
    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
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

    @JsonProperty("rebillFromInvoices")
    public InvoiceStatement getRebillFromInvoices() {
        return rebillFromInvoices;
    }

    @JsonProperty("rebillFromInvoices")
    public void setRebillFromInvoices(InvoiceStatement rebillFromInvoices) {
        this.rebillFromInvoices = rebillFromInvoices;
    }

    @JsonProperty("rebillNumberFromInvoiceStatement")
    public InvoiceStatement getRebillNumberFromInvoiceStatement() {
        return rebillNumberFromInvoiceStatement;
    }

    @JsonProperty("rebillNumberFromInvoiceStatement")
    public void setRebillNumberFromInvoiceStatement(InvoiceStatement rebillNumberFromInvoiceStatement) {
        this.rebillNumberFromInvoiceStatement = rebillNumberFromInvoiceStatement;
    }

    @JsonProperty("rebillSuffix")
    public String getRebillSuffix() {
        return rebillSuffix;
    }

    @JsonProperty("rebillSuffix")
    public void setRebillSuffix(String rebillSuffix) {
        this.rebillSuffix = rebillSuffix;
    }

    @JsonProperty("rebillToInvoices")
    public InvoiceStatement getRebillToInvoices() {
        return rebillToInvoices;
    }

    @JsonProperty("rebillToInvoices")
    public void setRebillToInvoices(InvoiceStatement rebillToInvoices) {
        this.rebillToInvoices = rebillToInvoices;
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

    @JsonProperty("surchargeAmount")
    public BigDecimal getSurchargeAmount() {
        return surchargeAmount;
    }

    @JsonProperty("surchargeAmount")
    public void setSurchargeAmount(BigDecimal surchargeAmount) {
        this.surchargeAmount = surchargeAmount;
    }

    @JsonProperty("surchargeTotal")
    public BigDecimal getSurchargeTotal() {
        return surchargeTotal;
    }

    @JsonProperty("surchargeTotal")
    public void setSurchargeTotal(BigDecimal surchargeTotal) {
        this.surchargeTotal = surchargeTotal;
    }

    @JsonProperty("surcharges")
    public OneToMany<InvoiceStatementSurcharge> getSurcharges() {
        return surcharges;
    }

    @JsonProperty("surcharges")
    public void setSurcharges(OneToMany<InvoiceStatementSurcharge> surcharges) {
        this.surcharges = surcharges;
    }

    @JsonProperty("taxAmount")
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    @JsonProperty("taxAmount")
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    @JsonProperty("taxTotal")
    public BigDecimal getTaxTotal() {
        return taxTotal;
    }

    @JsonProperty("taxTotal")
    public void setTaxTotal(BigDecimal taxTotal) {
        this.taxTotal = taxTotal;
    }

    @JsonProperty("toRecipients")
    public Person getToRecipients() {
        return toRecipients;
    }

    @JsonProperty("toRecipients")
    public void setToRecipients(Person toRecipients) {
        this.toRecipients = toRecipients;
    }

    @JsonProperty("taxes")
    public OneToMany<InvoiceStatementTax> getTaxes() {
        return taxes;
    }

    @JsonProperty("taxes")
    public void setTaxes(OneToMany<InvoiceStatementTax> taxes) {
        this.taxes = taxes;
    }

    @JsonProperty("total")
    public BigDecimal getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceStatement that = (InvoiceStatement) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(amountPaid, that.amountPaid) &&
            Objects.equals(bccRecipients, that.bccRecipients) &&
            Objects.equals(billableCharges, that.billableCharges) &&
            Objects.equals(billingAddress, that.billingAddress) &&
            Objects.equals(billingAttention, that.billingAttention) &&
            Objects.equals(billingClientContact, that.billingClientContact) &&
            Objects.equals(billingCorporateUser, that.billingCorporateUser) &&
            Objects.equals(billingPeriodEndDate, that.billingPeriodEndDate) &&
            Objects.equals(billingProfile, that.billingProfile) &&
            Objects.equals(billingProfileCorrelatedCustomText1, that.billingProfileCorrelatedCustomText1) &&
            Objects.equals(billingProfileCorrelatedCustomText2, that.billingProfileCorrelatedCustomText2) &&
            Objects.equals(billingProfileCorrelatedCustomText3, that.billingProfileCorrelatedCustomText3) &&
            Objects.equals(billingProfileCorrelatedCustomText4, that.billingProfileCorrelatedCustomText4) &&
            Objects.equals(billingProfileCorrelatedCustomText5, that.billingProfileCorrelatedCustomText5) &&
            Objects.equals(billingProfileCorrelatedCustomText6, that.billingProfileCorrelatedCustomText6) &&
            Objects.equals(billingProfileCorrelatedCustomText7, that.billingProfileCorrelatedCustomText7) &&
            Objects.equals(billingProfileCorrelatedCustomText8, that.billingProfileCorrelatedCustomText8) &&
            Objects.equals(billingProfileCorrelatedCustomText9, that.billingProfileCorrelatedCustomText9) &&
            Objects.equals(billingProfileCorrelatedCustomText10, that.billingProfileCorrelatedCustomText10) &&
            Objects.equals(billingProfileCorrelatedCustomTextBlock1, that.billingProfileCorrelatedCustomTextBlock1) &&
            Objects.equals(billingProfileCorrelatedCustomTextBlock2, that.billingProfileCorrelatedCustomTextBlock2) &&
            Objects.equals(billingProfileCorrelatedCustomTextBlock3, that.billingProfileCorrelatedCustomTextBlock3) &&
            Objects.equals(billingScheduleID, that.billingScheduleID) &&
            Objects.equals(candidates, that.candidates) &&
            Objects.equals(ccRecipients, that.ccRecipients) &&
            Objects.equals(clientCorporation, that.clientCorporation) &&
            Objects.equals(creditedByInvoiceStatement, that.creditedByInvoiceStatement) &&
            Objects.equals(creditOfInvoiceStatement, that.creditOfInvoiceStatement) &&
            Objects.equals(currencyUnit, that.currencyUnit) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(deliveryMethod, that.deliveryMethod) &&
            Objects.equals(deliveryMethodLookup, that.deliveryMethodLookup) &&
            Objects.equals(deliveryStatus, that.deliveryStatus) &&
            Objects.equals(discounts, that.discounts) &&
            Objects.equals(discountTotal, that.discountTotal) &&
            Objects.equals(discountAmount, that.discountAmount) &&
            Objects.equals(effectiveDate, that.effectiveDate) &&
            Objects.equals(dueDate, that.dueDate) &&
            Objects.equals(emailErrorReason, that.emailErrorReason) &&
            Objects.equals(fileTypesForInvoicing, that.fileTypesForInvoicing) &&
            Objects.equals(finalizedSubtotal, that.finalizedSubtotal) &&
            Objects.equals(finalizedTotal, that.finalizedTotal) &&
            Objects.equals(generalLedgerExportStatusLookup, that.generalLedgerExportStatusLookup) &&
            Objects.equals(invoiceStatementDate, that.invoiceStatementDate) &&
            Objects.equals(invoiceStatementDistributionBatch, that.invoiceStatementDistributionBatch) &&
            Objects.equals(invoiceStatementExports, that.invoiceStatementExports) &&
            Objects.equals(invoiceStatementExportsBatches, that.invoiceStatementExportsBatches) &&
            Objects.equals(invoiceStatementNumber, that.invoiceStatementNumber) &&
            Objects.equals(invoiceStatementFinalizedDate, that.invoiceStatementFinalizedDate) &&
            Objects.equals(invoiceStatementLineDistributions, that.invoiceStatementLineDistributions) &&
            Objects.equals(invoiceStatementMessageTemplate, that.invoiceStatementMessageTemplate) &&
            Objects.equals(invoiceStatementOrigin, that.invoiceStatementOrigin) &&
            Objects.equals(invoiceStatementPaidStatus, that.invoiceStatementPaidStatus) &&
            Objects.equals(invoiceStatementTemplate, that.invoiceStatementTemplate) &&
            Objects.equals(invoiceStatementType, that.invoiceStatementType) &&
            Objects.equals(invoiceTerm, that.invoiceTerm) &&
            Objects.equals(isDeleted, that.isDeleted) &&
            Objects.equals(isCredited, that.isCredited) &&
            Objects.equals(isFinalized, that.isFinalized) &&
            Objects.equals(isReinstated, that.isReinstated) &&
            Objects.equals(lineItems, that.lineItems) &&
            Objects.equals(lineItemTotal, that.lineItemTotal) &&
            Objects.equals(outstandingBalance, that.outstandingBalance) &&
            Objects.equals(owner, that.owner) &&
            Objects.equals(paymentCount, that.paymentCount) &&
            Objects.equals(paymentTerms, that.paymentTerms) &&
            Objects.equals(previousBalance, that.previousBalance) &&
            Objects.equals(purchaseOrderNumber, that.purchaseOrderNumber) &&
            Objects.equals(rawInvoiceStatementNumber, that.rawInvoiceStatementNumber) &&
            Objects.equals(rebillFromInvoices, that.rebillFromInvoices) &&
            Objects.equals(rebillNumberFromInvoiceStatement, that.rebillNumberFromInvoiceStatement) &&
            Objects.equals(rebillSuffix, that.rebillSuffix) &&
            Objects.equals(rebillToInvoices, that.rebillToInvoices) &&
            Objects.equals(remitInstructions, that.remitInstructions) &&
            Objects.equals(splitBys, that.splitBys) &&
            Objects.equals(status, that.status) &&
            Objects.equals(subtotal, that.subtotal) &&
            Objects.equals(surchargeAmount, that.surchargeAmount) &&
            Objects.equals(surchargeTotal, that.surchargeTotal) &&
            Objects.equals(surcharges, that.surcharges) &&
            Objects.equals(taxAmount, that.taxAmount) &&
            Objects.equals(taxTotal, that.taxTotal) &&
            Objects.equals(toRecipients, that.toRecipients) &&
            Objects.equals(taxes, that.taxes) &&
            Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, amountPaid, bccRecipients, billableCharges, billingAddress, billingAttention, billingClientContact, billingCorporateUser, billingPeriodEndDate, billingProfile, billingProfileCorrelatedCustomText1, billingProfileCorrelatedCustomText2, billingProfileCorrelatedCustomText3, billingProfileCorrelatedCustomText4, billingProfileCorrelatedCustomText5, billingProfileCorrelatedCustomText6, billingProfileCorrelatedCustomText7, billingProfileCorrelatedCustomText8, billingProfileCorrelatedCustomText9, billingProfileCorrelatedCustomText10, billingProfileCorrelatedCustomTextBlock1, billingProfileCorrelatedCustomTextBlock2, billingProfileCorrelatedCustomTextBlock3, billingScheduleID, candidates, ccRecipients, clientCorporation, creditedByInvoiceStatement, creditOfInvoiceStatement, currencyUnit, dateAdded, dateLastModified, deliveryMethod, deliveryMethodLookup, deliveryStatus, discounts, discountTotal, discountAmount, effectiveDate, dueDate, emailErrorReason, fileTypesForInvoicing, finalizedSubtotal, finalizedTotal, generalLedgerExportStatusLookup, invoiceStatementDate, invoiceStatementDistributionBatch, invoiceStatementExports, invoiceStatementExportsBatches, invoiceStatementNumber, invoiceStatementFinalizedDate, invoiceStatementLineDistributions, invoiceStatementMessageTemplate, invoiceStatementOrigin, invoiceStatementPaidStatus, invoiceStatementTemplate, invoiceStatementType, invoiceTerm, isDeleted, isCredited, isFinalized, isReinstated, lineItems, lineItemTotal, outstandingBalance, owner, paymentCount, paymentTerms, previousBalance, purchaseOrderNumber, rawInvoiceStatementNumber, rebillFromInvoices, rebillNumberFromInvoiceStatement, rebillSuffix, rebillToInvoices, remitInstructions, splitBys, status, subtotal, surchargeAmount, surchargeTotal, surcharges, taxAmount, taxTotal, toRecipients, taxes, total);
    }

    @Override
    public String toString() {
        return "InvoiceStatement{" +
            "id=" + id +
            ", amountPaid=" + amountPaid +
            ", bccRecipients=" + bccRecipients +
            ", billableCharges=" + billableCharges +
            ", billingAddress=" + billingAddress +
            ", billingAttention='" + billingAttention + '\'' +
            ", billingClientContact=" + billingClientContact +
            ", billingCorporateUser=" + billingCorporateUser +
            ", billingPeriodEndDate='" + billingPeriodEndDate + '\'' +
            ", billingProfile=" + billingProfile +
            ", billingProfileCorrelatedCustomText1='" + billingProfileCorrelatedCustomText1 + '\'' +
            ", billingProfileCorrelatedCustomText2='" + billingProfileCorrelatedCustomText2 + '\'' +
            ", billingProfileCorrelatedCustomText3='" + billingProfileCorrelatedCustomText3 + '\'' +
            ", billingProfileCorrelatedCustomText4='" + billingProfileCorrelatedCustomText4 + '\'' +
            ", billingProfileCorrelatedCustomText5='" + billingProfileCorrelatedCustomText5 + '\'' +
            ", billingProfileCorrelatedCustomText6='" + billingProfileCorrelatedCustomText6 + '\'' +
            ", billingProfileCorrelatedCustomText7='" + billingProfileCorrelatedCustomText7 + '\'' +
            ", billingProfileCorrelatedCustomText8='" + billingProfileCorrelatedCustomText8 + '\'' +
            ", billingProfileCorrelatedCustomText9='" + billingProfileCorrelatedCustomText9 + '\'' +
            ", billingProfileCorrelatedCustomText10='" + billingProfileCorrelatedCustomText10 + '\'' +
            ", billingProfileCorrelatedCustomTextBlock1='" + billingProfileCorrelatedCustomTextBlock1 + '\'' +
            ", billingProfileCorrelatedCustomTextBlock2='" + billingProfileCorrelatedCustomTextBlock2 + '\'' +
            ", billingProfileCorrelatedCustomTextBlock3='" + billingProfileCorrelatedCustomTextBlock3 + '\'' +
            ", billingScheduleID=" + billingScheduleID +
            ", candidates=" + candidates +
            ", ccRecipients=" + ccRecipients +
            ", clientCorporation=" + clientCorporation +
            ", creditedByInvoiceStatement=" + creditedByInvoiceStatement +
            ", creditOfInvoiceStatement=" + creditOfInvoiceStatement +
            ", currencyUnit=" + currencyUnit +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", deliveryMethod='" + deliveryMethod + '\'' +
            ", deliveryMethodLookup=" + deliveryMethodLookup +
            ", deliveryStatus=" + deliveryStatus +
            ", discounts=" + discounts +
            ", discountTotal=" + discountTotal +
            ", discountAmount=" + discountAmount +
            ", effectiveDate=" + effectiveDate +
            ", dueDate=" + dueDate +
            ", emailErrorReason='" + emailErrorReason + '\'' +
            ", fileTypesForInvoicing=" + fileTypesForInvoicing +
            ", finalizedSubtotal=" + finalizedSubtotal +
            ", finalizedTotal=" + finalizedTotal +
            ", generalLedgerExportStatusLookup=" + generalLedgerExportStatusLookup +
            ", invoiceStatementDate=" + invoiceStatementDate +
            ", invoiceStatementDistributionBatch=" + invoiceStatementDistributionBatch +
            ", invoiceStatementExports=" + invoiceStatementExports +
            ", invoiceStatementExportsBatches=" + invoiceStatementExportsBatches +
            ", invoiceStatementNumber='" + invoiceStatementNumber + '\'' +
            ", invoiceStatementFinalizedDate=" + invoiceStatementFinalizedDate +
            ", invoiceStatementLineDistributions=" + invoiceStatementLineDistributions +
            ", invoiceStatementMessageTemplate=" + invoiceStatementMessageTemplate +
            ", invoiceStatementOrigin='" + invoiceStatementOrigin + '\'' +
            ", invoiceStatementPaidStatus=" + invoiceStatementPaidStatus +
            ", invoiceStatementTemplate=" + invoiceStatementTemplate +
            ", invoiceStatementType=" + invoiceStatementType +
            ", invoiceTerm=" + invoiceTerm +
            ", isDeleted=" + isDeleted +
            ", isCredited=" + isCredited +
            ", isFinalized=" + isFinalized +
            ", isReinstated=" + isReinstated +
            ", lineItems=" + lineItems +
            ", lineItemTotal=" + lineItemTotal +
            ", outstandingBalance=" + outstandingBalance +
            ", owner=" + owner +
            ", paymentCount=" + paymentCount +
            ", paymentTerms='" + paymentTerms + '\'' +
            ", previousBalance=" + previousBalance +
            ", purchaseOrderNumber='" + purchaseOrderNumber + '\'' +
            ", rawInvoiceStatementNumber=" + rawInvoiceStatementNumber +
            ", rebillFromInvoices=" + rebillFromInvoices +
            ", rebillNumberFromInvoiceStatement=" + rebillNumberFromInvoiceStatement +
            ", rebillSuffix='" + rebillSuffix + '\'' +
            ", rebillToInvoices=" + rebillToInvoices +
            ", remitInstructions='" + remitInstructions + '\'' +
            ", splitBys=" + splitBys +
            ", status=" + status +
            ", subtotal=" + subtotal +
            ", surchargeAmount=" + surchargeAmount +
            ", surchargeTotal=" + surchargeTotal +
            ", surcharges=" + surcharges +
            ", taxAmount=" + taxAmount +
            ", taxTotal=" + taxTotal +
            ", toRecipients=" + toRecipients +
            ", taxes=" + taxes +
            ", total=" + total +
            '}';
    }
}
