package com.bullhornsdk.data.model.entity.core.paybill.charge;

import com.bullhornsdk.data.model.entity.core.paybill.BillingProfile;
import com.bullhornsdk.data.model.entity.core.paybill.chartofaccounts.*;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceTerm;
import com.bullhornsdk.data.model.entity.core.paybill.master.BillMaster;
import com.bullhornsdk.data.model.entity.core.paybill.master.BillMasterTransaction;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SpecializedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.TransactionStatus;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.TransactionType;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.file.BillableChargeFileAttachment;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * Created by mkesmetzis 21-Apr-20
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "addedByUser", "billMasters", "billableTransactions", "billingClientContact", "billingClientCorporation",
    "billingCorporateUser", "billingFrequency", "billingProfile", "billingSchedule", "candidate", "clientCorporation",
    "currencyUnit", "dateAdded", "dateLastModified", "description", "fileAttachments", "generalLedgerSegment1",
    "generalLedgerSegment2", "generalLedgerSegment3", "generalLedgerSegment4", "generalLedgerSegment5",
    "generalLedgerServiceCode", "invoiceTerm", "isInvoiced", "jobOrder", "periodEndDate", "placement",
    "readyToBillOverride", "status", "subTotal", "transactionStatus", "transactionType"})
public class BillableCharge  implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity, AssociationEntity {

    private Integer id;

    private CorporateUser addedByUser;

    private OneToMany<BillMaster> billMasters;

    private OneToMany<BillMasterTransaction> billableTransactions;

    private ClientContact billingClientContact;

    private ClientCorporation billingClientCorporation;

    private CorporateUser billingCorporateUser;

    private String billingFrequency;

    private BillingProfile billingProfile;

    private Integer billingSchedule;

    private Candidate candidate;

    private ClientCorporation clientCorporation;

    private CurrencyUnit currencyUnit;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    @JsonIgnore
    private String description;

    private OneToMany<BillableChargeFileAttachment> fileAttachments;

    private GeneralLedgerSegment1 generalLedgerSegment1;

    private GeneralLedgerSegment2 generalLedgerSegment2;

    private GeneralLedgerSegment3 generalLedgerSegment3;

    private GeneralLedgerSegment4 generalLedgerSegment4;

    private GeneralLedgerSegment5 generalLedgerSegment5;

    private GeneralLedgerServiceCode generalLedgerServiceCode;

    private InvoiceTerm invoiceTerm;

    private Boolean isInvoiced; //TODO nullable = false, insertable = false, updatable = false

    private JobOrder jobOrder;

    private DateTime periodEndDate;

    private Placement placement;

    private Boolean readyToBillOverride;

    private SpecializedOptionsLookup status; // BillableChargeStatusLookup

    private BigDecimal subTotal;

    private TransactionStatus transactionStatus; //TODO

    private TransactionType transactionType; //TODO


    public BillableCharge() {
    }

    public BillableCharge(Integer id) {
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


    @JsonProperty("addedByUser")
    public CorporateUser getAddedByUser() {
        return addedByUser;
    }

    @JsonProperty("addedByUser")
    public void setAddedByUser(CorporateUser addedByUser) {
        this.addedByUser = addedByUser;
    }

    @JsonProperty("billMasters")
    public OneToMany<BillMaster> getBillMasters() {
        return billMasters;
    }

    @JsonProperty("billMasters")
    public void setBillMasters(OneToMany<BillMaster> billMasters) {
        this.billMasters = billMasters;
    }


    @JsonProperty("billableTransactions")
    public OneToMany<BillMasterTransaction> getBillableTransactions() {
        return billableTransactions;
    }

    public void setBillableTransactions(OneToMany<BillMasterTransaction> billableTransactions) {
        this.billableTransactions = billableTransactions;
    }

    @JsonProperty("billingClientContact")
    public ClientContact getBillingClientContact() {
        return billingClientContact;
    }

    @JsonProperty("billingClientContact")
    public void setBillingClientContact(ClientContact billingClientContact) {
        this.billingClientContact = billingClientContact;
    }

    @JsonProperty("billingClientCorporation")
    public ClientCorporation getBillingClientCorporation() {
        return billingClientCorporation;
    }

    @JsonProperty("billingClientCorporation")
    public void setBillingClientCorporation(ClientCorporation billingClientCorporation) {
        this.billingClientCorporation = billingClientCorporation;
    }

    @JsonProperty("billingCorporateUser")
    public CorporateUser getBillingCorporateUser() {
        return billingCorporateUser;
    }

    @JsonProperty("billingCorporateUser")
    public void setBillingCorporateUser(CorporateUser billingCorporateUser) {
        this.billingCorporateUser = billingCorporateUser;
    }

    @JsonProperty("billingFrequency")
    public String getBillingFrequency() {
        return billingFrequency;
    }

    @JsonProperty("billingFrequency")
    public void setBillingFrequency(String billingFrequency) {
        this.billingFrequency = billingFrequency;
    }

    @JsonProperty("billingProfile")
    public BillingProfile getBillingProfile() {
        return billingProfile;
    }

    @JsonProperty("billingProfile")
    public void setBillingProfile(BillingProfile billingProfile) {
        this.billingProfile = billingProfile;
    }

    @JsonProperty("billingSchedule")
    public Integer getBillingSchedule() {
        return billingSchedule;
    }

    @JsonProperty("billingSchedule")
    public void setBillingSchedule(Integer billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    @JsonProperty("candidate")
    public Candidate getCandidate() {
        return candidate;
    }

    @JsonProperty("candidate")
    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @JsonProperty("clientCorporation")
    public ClientCorporation getClientCorporation() {
        return clientCorporation;
    }

    @JsonProperty("clientCorporation")
    public void setClientCorporation(ClientCorporation clientCorporation) {
        this.clientCorporation = clientCorporation;
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

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("fileAttachments")
    public OneToMany<BillableChargeFileAttachment> getFileAttachments() {
        return fileAttachments;
    }

    @JsonProperty("fileAttachments")
    public void setFileAttachments(OneToMany<BillableChargeFileAttachment> fileAttachments) {
        this.fileAttachments = fileAttachments;
    }

    @JsonProperty("generalLedgerSegment1")
    public GeneralLedgerSegment1 getGeneralLedgerSegment1() {
        return generalLedgerSegment1;
    }

    @JsonProperty("generalLedgerSegment1")
    public void setGeneralLedgerSegment1(GeneralLedgerSegment1 generalLedgerSegment1) {
        this.generalLedgerSegment1 = generalLedgerSegment1;
    }

    @JsonProperty("generalLedgerSegment2")
    public GeneralLedgerSegment2 getGeneralLedgerSegment2() {
        return generalLedgerSegment2;
    }

    @JsonProperty("generalLedgerSegment2")
    public void setGeneralLedgerSegment2(GeneralLedgerSegment2 generalLedgerSegment2) {
        this.generalLedgerSegment2 = generalLedgerSegment2;
    }

    @JsonProperty("generalLedgerSegment3")
    public GeneralLedgerSegment3 getGeneralLedgerSegment3() {
        return generalLedgerSegment3;
    }

    @JsonProperty("generalLedgerSegment3")
    public void setGeneralLedgerSegment3(GeneralLedgerSegment3 generalLedgerSegment3) {
        this.generalLedgerSegment3 = generalLedgerSegment3;
    }

    @JsonProperty("generalLedgerSegment4")
    public GeneralLedgerSegment4 getGeneralLedgerSegment4() {
        return generalLedgerSegment4;
    }

    @JsonProperty("generalLedgerSegment4")
    public void setGeneralLedgerSegment4(GeneralLedgerSegment4 generalLedgerSegment4) {
        this.generalLedgerSegment4 = generalLedgerSegment4;
    }

    @JsonProperty("generalLedgerSegment5")
    public GeneralLedgerSegment5 getGeneralLedgerSegment5() {
        return generalLedgerSegment5;
    }

    @JsonProperty("generalLedgerSegment5")
    public void setGeneralLedgerSegment5(GeneralLedgerSegment5 generalLedgerSegment5) {
        this.generalLedgerSegment5 = generalLedgerSegment5;
    }

    @JsonProperty("generalLedgerServiceCode")
    public GeneralLedgerServiceCode getGeneralLedgerServiceCode() {
        return generalLedgerServiceCode;
    }

    @JsonProperty("generalLedgerServiceCode")
    public void setGeneralLedgerServiceCode(GeneralLedgerServiceCode generalLedgerServiceCode) {
        this.generalLedgerServiceCode = generalLedgerServiceCode;
    }

    @JsonProperty("invoiceTerm")
    public InvoiceTerm getInvoiceTerm() {
        return invoiceTerm;
    }

    @JsonProperty("invoiceTerm")
    public void setInvoiceTerm(InvoiceTerm invoiceTerm) {
        this.invoiceTerm = invoiceTerm;
    }

    @JsonProperty("isInvoiced")
    public Boolean getInvoiced() {
        return isInvoiced;
    }

    @JsonProperty("isInvoiced")
    public void setInvoiced(Boolean invoiced) {
        isInvoiced = invoiced;
    }

    @JsonProperty("jobOrder")
    public JobOrder getJobOrder() {
        return jobOrder;
    }

    @JsonProperty("jobOrder")
    public void setJobOrder(JobOrder jobOrder) {
        this.jobOrder = jobOrder;
    }

    @JsonProperty("periodEndDate")
    public DateTime getPeriodEndDate() {
        return periodEndDate;
    }

    @JsonProperty("periodEndDate")
    public void setPeriodEndDate(DateTime periodEndDate) {
        this.periodEndDate = periodEndDate;
    }

    @JsonProperty("placement")
    public Placement getPlacement() {
        return placement;
    }

    @JsonProperty("placement")
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    @JsonProperty("readyToBillOverride")
    public Boolean getReadyToBillOverride() {
        return readyToBillOverride;
    }

    @JsonProperty("readyToBillOverride")
    public void setReadyToBillOverride(Boolean readyToBillOverride) {
        this.readyToBillOverride = readyToBillOverride;
    }

    @JsonProperty("status")
    public SpecializedOptionsLookup getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(SpecializedOptionsLookup status) {
        this.status = status;
    }

    @JsonProperty("subTotal")
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    @JsonProperty("subTotal")
    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    @JsonProperty("transactionStatus")
    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    @JsonProperty("transactionStatus")
    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    @JsonProperty("transactionType")
    public TransactionType getTransactionType() {
        return transactionType;
    }

    @JsonProperty("transactionType")
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

}
