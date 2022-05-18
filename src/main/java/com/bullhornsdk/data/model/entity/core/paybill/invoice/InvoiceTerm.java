package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerAccount;
import com.bullhornsdk.data.model.entity.core.paybill.rate.DiscountRate;
import com.bullhornsdk.data.model.entity.core.paybill.rate.SurchargeRate;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;

import org.joda.time.DateTime;

import javax.validation.constraints.Size;

import java.util.Objects;

/**
 * Created by fayranne.lipton 4/3/2020
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "approvalRequired", "clientCorporation", "currencyUnit",
    "customDate1", "customDate2", "customDate3",
    "customFloat1", "customFloat2", "customFloat3", "customInt1",
    "customInt2", "customInt3", "customText1", "customText10",
    "customText11", "customText12", "customText13", "customText14",
    "customText15", "customText16", "customText17", "customText18",
    "customText19", "customText2", "customText20", "customText3",
    "customText4", "customText5", "customText6", "customText7",
    "customText8", "customText9", "customTextBlock1", "customTextBlock2",
    "customTextBlock3", "customTextBlock4", "customTextBlock5",
    "dateAdded", "dateLastModified", "description", "discountRates", "effectiveDate",
    "effectiveEndDate", "externalID", "fileTypesForInvoicing", "generalLedgerAccountsReceivable", "includeAttachments",
    "invoiceApprovedTimecardsRequired", "invoiceGroupBy", "invoiceOn", "invoiceSplitBy",
    "invoiceStatementTemplate", "invoiceSummarizeBy", "isDeleted", "isFirst", "owner", "payBillCycle", "paymentTerms",
    "purchaseOrderRequired", "remitInstructions", "status", "surchargeRates", "title", "versionID", "versions", "waitForTimecards"})
public class InvoiceTerm extends CustomFieldsB implements QueryEntity, UpdateEntity, CreateEntity, EffectiveDateEntity,
    DateLastModifiedEntity, SoftDeleteEntity, AssociationEntity {

    private Integer id;

    private Boolean approvalRequired;

    private ClientCorporation clientCorporation;

    private CurrencyUnit currencyUnit;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    @JsonIgnore
    private String description;

    private OneToMany<DiscountRate> discountRates;

    private String effectiveDate;

    private String effectiveEndDate;

    @JsonIgnore
    @Size(max = 100)
    private String externalID;

    private OneToMany<InvoiceTermFileTypesForInvoicing> fileTypesForInvoicing;

    private GeneralLedgerAccount generalLedgerAccountsReceivable;

    private Boolean includeAttachments;

    private Boolean invoiceApprovedTimecardsRequired;

    @JsonIgnore
    private String invoiceGroupBy;

    @JsonIgnore
    private String invoiceOn;

    @JsonIgnore
    private String invoiceSplitBy;

    private InvoiceStatementTemplate invoiceStatementTemplate;

    @JsonIgnore
    private String invoiceSummarizeBy;

    private Boolean isDeleted;

    private Boolean isFirst;

    private CorporateUser owner;

    private PayBillCycle payBillCycle;

    @JsonIgnore
    private String paymentTerms;

    private Boolean purchaseOrderRequired;

    @JsonIgnore
    private String remitInstructions;

    @JsonIgnore
    private String status;

    private OneToMany<SurchargeRate> surchargeRates;

    @JsonIgnore
    private String title;

    private Integer versionID;

    private OneToMany<InvoiceTermVersion> versions;

    private Boolean waitForTimecards;

    public InvoiceTerm() {
    }

    public InvoiceTerm(Integer id) {
        this.id = id;
    }

    /**
     * Returns the entity with the required fields for an insert set.
     */
    public InvoiceTerm instantiateForInsert() {
        InvoiceTerm entity = new InvoiceTerm();
        entity.setApprovalRequired(Boolean.FALSE);
        entity.setCurrencyUnit(new CurrencyUnit(166)); // 166 = US Dollars
        entity.setIncludeAttachments(Boolean.FALSE);
        entity.setInvoiceApprovedTimecardsRequired(Boolean.FALSE);
        entity.setPurchaseOrderRequired(Boolean.FALSE);
        entity.setWaitForTimecards(Boolean.FALSE);
        return entity;
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

    @JsonProperty("approvalRequired")
    public Boolean getApprovalRequired() {
        return approvalRequired;
    }

    @JsonProperty("approvalRequired")
    public void setApprovalRequired(Boolean approvalRequired) {
        this.approvalRequired = approvalRequired;
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

    @ReadOnly
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

    @JsonIgnore
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("discountRates")
    public OneToMany<DiscountRate> getDiscountRates() {
        return discountRates;
    }

    @JsonProperty("discountRates")
    public void setDiscountRates(OneToMany<DiscountRate> discountRates) {
        this.discountRates = discountRates;
    }

    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("effectiveEndDate")
    public String getEffectiveEndDate() {
        return effectiveEndDate;
    }

    @JsonProperty("effectiveEndDate")
    public void setEffectiveEndDate(String effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    @JsonProperty("externalID")
    public String getExternalID() {
        return externalID;
    }

    @JsonProperty("externalID")
    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    @JsonProperty("fileTypesForInvoicing")
    public OneToMany<InvoiceTermFileTypesForInvoicing> getFileTypesForInvoicing() {
        return fileTypesForInvoicing;
    }

    @JsonProperty("fileTypesForInvoicing")
    public void setFileTypesForInvoicing(OneToMany<InvoiceTermFileTypesForInvoicing> fileTypesForInvoicing) {
        this.fileTypesForInvoicing = fileTypesForInvoicing;
    }

    @JsonProperty("generalLedgerAccountsReceivable")
    public GeneralLedgerAccount getGeneralLedgerAccountsReceivable() {
        return generalLedgerAccountsReceivable;
    }

    @JsonProperty("generalLedgerAccountsReceivable")
    public void setGeneralLedgerAccountsReceivable(GeneralLedgerAccount generalLedgerAccountsReceivable) {
        this.generalLedgerAccountsReceivable = generalLedgerAccountsReceivable;
    }

    @JsonProperty("includeAttachments")
    public Boolean getIncludeAttachments() {
        return includeAttachments;
    }

    @JsonProperty("includeAttachments")
    public void setIncludeAttachments(Boolean includeAttachments) {
        this.includeAttachments = includeAttachments;
    }

    @JsonProperty("invoiceApprovedTimecardsRequired")
    public Boolean getInvoiceApprovedTimecardsRequired() {
        return invoiceApprovedTimecardsRequired;
    }

    @JsonProperty("invoiceApprovedTimecardsRequired")
    public void setInvoiceApprovedTimecardsRequired(Boolean invoiceApprovedTimecardsRequired) {
        this.invoiceApprovedTimecardsRequired = invoiceApprovedTimecardsRequired;
    }

    @JsonProperty("invoiceGroupBy")
    public String getInvoiceGroupBy() {
        return invoiceGroupBy;
    }

    @JsonIgnore
    public void setInvoiceGroupBy(String invoiceGroupBy) {
        this.invoiceGroupBy = invoiceGroupBy;
    }

    @JsonProperty("invoiceOn")
    public String getInvoiceOn() {
        return invoiceOn;
    }

    @JsonIgnore
    public void setInvoiceOn(String invoiceOn) {
        this.invoiceOn = invoiceOn;
    }

    @JsonProperty("invoiceSplitBy")
    public String getInvoiceSplitBy() {
        return invoiceSplitBy;
    }

    @JsonIgnore
    public void setInvoiceSplitBy(String invoiceSplitBy) {
        this.invoiceSplitBy = invoiceSplitBy;
    }

    @JsonProperty("invoiceStatementTemplate")
    public InvoiceStatementTemplate getInvoiceStatementTemplate() {
        return invoiceStatementTemplate;
    }

    @JsonProperty("invoiceStatementTemplate")
    public void setInvoiceStatementTemplate(InvoiceStatementTemplate invoiceStatementTemplate) {
        this.invoiceStatementTemplate = invoiceStatementTemplate;
    }

    @JsonProperty("invoiceSummarizeBy")
    public String getInvoiceSummarizeBy() {
        return invoiceSummarizeBy;
    }

    @JsonIgnore
    public void setInvoiceSummarizeBy(String invoiceSummarizeBy) {
        this.invoiceSummarizeBy = invoiceSummarizeBy;
    }

    @JsonProperty("isFirst")
    public Boolean isFirst() {
        return isFirst;
    }

    @JsonProperty("isFirst")
    public void setFirst(Boolean first) {
        isFirst = first;
    }

    @JsonProperty("paymentTerms")
    public String getPaymentTerms() {
        return paymentTerms;
    }

    @JsonIgnore
    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    @JsonProperty("purchaseOrderRequired")
    public Boolean getPurchaseOrderRequired() {
        return purchaseOrderRequired;
    }

    @JsonProperty("purchaseOrderRequired")
    public void setPurchaseOrderRequired(Boolean purchaseOrderRequired) {
        this.purchaseOrderRequired = purchaseOrderRequired;
    }

    @JsonProperty("remitInstructions")
    public String getRemitInstructions() {
        return remitInstructions;
    }

    @JsonProperty("remitInstructions")
    public void setRemitInstructions(String remitInstructions) {
        this.remitInstructions = remitInstructions;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonIgnore
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @JsonProperty("isFirst")
    public Boolean getFirst() {
        return isFirst;
    }

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @JsonProperty("payBillCycle")
    public PayBillCycle getPayBillCycle() {
        return payBillCycle;
    }

    @JsonProperty("payBillCycle")
    public void setPayBillCycle(PayBillCycle payBillCycle) {
        this.payBillCycle = payBillCycle;
    }

    @JsonProperty("surchargeRates")
    public OneToMany<SurchargeRate> getSurchargeRates() {
        return surchargeRates;
    }

    @JsonProperty("surchargeRates")
    public void setSurchargeRates(OneToMany<SurchargeRate> surchargeRates) {
        this.surchargeRates = surchargeRates;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonIgnore
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("versionID")
    public Integer getVersionID() {
        return versionID;
    }

    @JsonProperty("versionID")
    public void setVersionID(Integer versionID) {
        this.versionID = versionID;
    }

    @JsonProperty("versions")
    public OneToMany<InvoiceTermVersion> getVersions() {
        return versions;
    }

    @JsonProperty("versions")
    public void setVersions(OneToMany<InvoiceTermVersion> versions) {
        this.versions = versions;
    }

    @JsonProperty("waitForTimecards")
    public Boolean getWaitForTimecards() {
        return waitForTimecards;
    }

    @JsonProperty("waitForTimecards")
    public void setWaitForTimecards(Boolean waitForTimecards) {
        this.waitForTimecards = waitForTimecards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        InvoiceTerm that = (InvoiceTerm) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(approvalRequired, that.approvalRequired) &&
            Objects.equals(clientCorporation, that.clientCorporation) &&
            Objects.equals(currencyUnit, that.currencyUnit) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(description, that.description) &&
            Objects.equals(discountRates, that.discountRates) &&
            Objects.equals(effectiveDate, that.effectiveDate) &&
            Objects.equals(effectiveEndDate, that.effectiveEndDate) &&
            Objects.equals(externalID, that.externalID) &&
            Objects.equals(fileTypesForInvoicing, that.fileTypesForInvoicing) &&
            Objects.equals(generalLedgerAccountsReceivable, that.generalLedgerAccountsReceivable) &&
            Objects.equals(includeAttachments, that.includeAttachments) &&
            Objects.equals(invoiceApprovedTimecardsRequired, that.invoiceApprovedTimecardsRequired) &&
            Objects.equals(invoiceGroupBy, that.invoiceGroupBy) &&
            Objects.equals(invoiceOn, that.invoiceOn) &&
            Objects.equals(invoiceSplitBy, that.invoiceSplitBy) &&
            Objects.equals(invoiceStatementTemplate, that.invoiceStatementTemplate) &&
            Objects.equals(invoiceSummarizeBy, that.invoiceSummarizeBy) &&
            Objects.equals(isDeleted, that.isDeleted) &&
            Objects.equals(isFirst, that.isFirst) &&
            Objects.equals(owner, that.owner) &&
            Objects.equals(payBillCycle, that.payBillCycle) &&
            Objects.equals(paymentTerms, that.paymentTerms) &&
            Objects.equals(purchaseOrderRequired, that.purchaseOrderRequired) &&
            Objects.equals(remitInstructions, that.remitInstructions) &&
            Objects.equals(status, that.status) &&
            Objects.equals(surchargeRates, that.surchargeRates) &&
            Objects.equals(title, that.title) &&
            Objects.equals(versionID, that.versionID) &&
            Objects.equals(versions, that.versions) &&
            Objects.equals(waitForTimecards, that.waitForTimecards);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), id, approvalRequired, clientCorporation, currencyUnit, dateAdded, dateLastModified, description, discountRates, effectiveDate, effectiveEndDate, externalID, fileTypesForInvoicing, generalLedgerAccountsReceivable, includeAttachments, invoiceApprovedTimecardsRequired, invoiceGroupBy, invoiceOn, invoiceSplitBy, invoiceStatementTemplate, invoiceSummarizeBy, isDeleted, isFirst, owner, payBillCycle, paymentTerms, purchaseOrderRequired, remitInstructions, status, surchargeRates, title, versionID, versions, waitForTimecards);
    }

    @Override
    public String toString() {
        return "InvoiceTerm{" +
            "id=" + id +
            ", approvalRequired=" + approvalRequired +
            ", clientCorporation=" + clientCorporation +
            ", currencyUnit=" + currencyUnit +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", description='" + description + '\'' +
            ", discountRates=" + discountRates +
            ", effectiveDate='" + effectiveDate + '\'' +
            ", effectiveEndDate='" + effectiveEndDate + '\'' +
            ", externalID='" + externalID + '\'' +
            ", fileTypesForInvoicing=" + fileTypesForInvoicing +
            ", generalLedgerAccountsReceivable=" + generalLedgerAccountsReceivable +
            ", includeAttachments=" + includeAttachments +
            ", invoiceApprovedTimecardsRequired=" + invoiceApprovedTimecardsRequired +
            ", invoiceGroupBy='" + invoiceGroupBy + '\'' +
            ", invoiceOn='" + invoiceOn + '\'' +
            ", invoiceSplitBy='" + invoiceSplitBy + '\'' +
            ", invoiceStatementTemplate=" + invoiceStatementTemplate +
            ", invoiceSummarizeBy='" + invoiceSummarizeBy + '\'' +
            ", isDeleted=" + isDeleted +
            ", isFirst=" + isFirst +
            ", owner=" + owner +
            ", payBillCycle=" + payBillCycle +
            ", paymentTerms='" + paymentTerms + '\'' +
            ", purchaseOrderRequired=" + purchaseOrderRequired +
            ", remitInstructions='" + remitInstructions + '\'' +
            ", status='" + status + '\'' +
            ", surchargeRates=" + surchargeRates +
            ", title='" + title + '\'' +
            ", versionID=" + versionID +
            ", versions=" + versions +
            ", waitForTimecards=" + waitForTimecards +
            '}';
    }
}
