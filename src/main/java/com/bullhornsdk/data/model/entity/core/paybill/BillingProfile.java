package com.bullhornsdk.data.model.entity.core.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementMessageTemplate;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceTerm;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SpecializedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Person;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;

import org.joda.time.DateTime;

import java.util.Objects;

/**
 * Created by fayranne.lipton 4/3/2020
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "bccRecipients", "billingAttention", "billingClientCorporation",
    "billingContact", "billingCorporateUser", "billingLocation", "ccRecipients", "clientCorporation",
    "customDate1", "customDate2", "customDate3",
    "customFloat1", "customFloat2", "customFloat3", "customInt1",
    "customInt2", "customInt3", "customText1", "customText10",
    "customText11", "customText12", "customText13", "customText14",
    "customText15", "customText16", "customText17", "customText18",
    "customText19", "customText2", "customText20", "customText3",
    "customText4", "customText5", "customText6", "customText7",
    "customText8", "customText9", "customTextBlock1", "customTextBlock2",
    "customTextBlock3", "customTextBlock4", "customTextBlock5",
    "dateAdded", "dateLastModified", "deliveryMethod", "description", "effectiveDate",
    "effectiveEndDate", "externalID", "invoiceStatementMessageTemplate", "invoiceTerm",
    "isDeleted", "owner", "toRecipients", "status", "title", "versionID", "versions"})
public class BillingProfile extends CustomFieldsB implements QueryEntity,
    UpdateEntity, CreateEntity, SoftDeleteEntity, DateLastModifiedEntity, EffectiveDateEntity, AssociationEntity {

    private Integer id;

    private OneToMany<Person> bccRecipients;

    @JsonIgnore
    private String billingAttention;

    private ClientCorporation billingClientCorporation;

    private ClientContact billingContact;

    private CorporateUser billingCorporateUser;

    private Location billingLocation;

    private OneToMany<Person> ccRecipients;

    private ClientCorporation clientCorporation;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    @JsonIgnore
    private SpecializedOptionsLookup deliveryMethodLookup;

    @JsonIgnore
    private String description;

    private String effectiveDate;

    private String effectiveEndDate;

    @JsonIgnore
    private String externalID;

    private InvoiceStatementMessageTemplate invoiceStatementMessageTemplate;

    private InvoiceTerm invoiceTerm;

    private Boolean isDeleted;

    private CorporateUser owner;

    private OneToMany<Person> toRecipients;

    @JsonIgnore
    private String status;

    @JsonIgnore
    private String title;

    private Integer versionID;

    private OneToMany<BillingProfileVersion> versions;

    public BillingProfile() {
    }

    public BillingProfile(Integer id) {
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

    @JsonIgnore
    public OneToMany<Person> getBccRecipients() {
        return bccRecipients;
    }

    @JsonProperty("bccRecipients")
    public void setBccRecipients(OneToMany<Person> bccRecipients) {
        this.bccRecipients = bccRecipients;
    }

    @JsonProperty("billingAttention")
    public String getBillingAttention() {
        return billingAttention;
    }

    @JsonIgnore
    public void setBillingAttention(String billingAttention) {
        this.billingAttention = billingAttention;
    }

    @JsonProperty("billingClientCorporation")
    public ClientCorporation getBillingClientCorporation() {
        return billingClientCorporation;
    }

    @JsonProperty("billingClientCorporation")
    public void setBillingClientCorporation(ClientCorporation billingClientCorporation) {
        this.billingClientCorporation = billingClientCorporation;
    }

    @JsonProperty("billingContact")
    public ClientContact getBillingContact() {
        return billingContact;
    }

    @JsonProperty("billingContact")
    public void setBillingContact(ClientContact billingContact) {
        this.billingContact = billingContact;
    }

    @JsonProperty("billingCorporateUser")
    public CorporateUser getBillingCorporateUser() {
        return billingCorporateUser;
    }

    @JsonProperty("billingCorporateUser")
    public void setBillingCorporateUser(CorporateUser billingCorporateUser) {
        this.billingCorporateUser = billingCorporateUser;
    }

    @JsonProperty("billingLocation")
    public Location getBillingLocation() {
        return billingLocation;
    }

    @JsonProperty("billingLocation")
    public void setBillingLocation(Location billingLocation) {
        this.billingLocation = billingLocation;
    }

    @JsonIgnore
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

    @JsonProperty("deliveryMethodLookup")
    public SpecializedOptionsLookup getDeliveryMethodLookup() {
        return deliveryMethodLookup;
    }

    @JsonIgnore
    public void setDeliveryMethodLookup(SpecializedOptionsLookup deliveryMethod) {
        this.deliveryMethodLookup = deliveryMethod;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonIgnore
    public void setDescription(String description) {
        this.description = description;
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

    @JsonIgnore
    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    @JsonProperty("invoiceStatementMessageTemplate")
    public InvoiceStatementMessageTemplate getInvoiceStatementMessageTemplate() {
        return invoiceStatementMessageTemplate;
    }

    @JsonProperty("invoiceStatementMessageTemplate")
    public void setInvoiceStatementMessageTemplate(InvoiceStatementMessageTemplate invoiceStatementMessageTemplate) {
        this.invoiceStatementMessageTemplate = invoiceStatementMessageTemplate;
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

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @JsonIgnore
    public OneToMany<Person> getToRecipients() {
        return toRecipients;
    }

    @JsonProperty("toRecipients")
    public void setToRecipients(OneToMany<Person> toRecipients) {
        this.toRecipients = toRecipients;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonIgnore
    public void setStatus(String status) {
        this.status = status;
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

    @JsonIgnore
    public void setVersionID(Integer versionID) {
        this.versionID = versionID;
    }

    @JsonIgnore
    public OneToMany<BillingProfileVersion> getVersions() {
        return versions;
    }

    @JsonProperty("versions")
    public void setVersions(OneToMany<BillingProfileVersion> versions) {
        this.versions = versions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BillingProfile that = (BillingProfile) o;
        return isDeleted == that.isDeleted &&
            Objects.equals(id, that.id) &&
            Objects.equals(bccRecipients, that.bccRecipients) &&
            Objects.equals(billingAttention, that.billingAttention) &&
            Objects.equals(billingClientCorporation, that.billingClientCorporation) &&
            Objects.equals(billingContact, that.billingContact) &&
            Objects.equals(billingCorporateUser, that.billingCorporateUser) &&
            Objects.equals(billingLocation, that.billingLocation) &&
            Objects.equals(ccRecipients, that.ccRecipients) &&
            Objects.equals(clientCorporation, that.clientCorporation) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(deliveryMethodLookup, that.deliveryMethodLookup) &&
            Objects.equals(description, that.description) &&
            Objects.equals(effectiveDate, that.effectiveDate) &&
            Objects.equals(effectiveEndDate, that.effectiveEndDate) &&
            Objects.equals(externalID, that.externalID) &&
            Objects.equals(invoiceStatementMessageTemplate, that.invoiceStatementMessageTemplate) &&
            Objects.equals(invoiceTerm, that.invoiceTerm) &&
            Objects.equals(owner, that.owner) &&
            Objects.equals(toRecipients, that.toRecipients) &&
            Objects.equals(status, that.status) &&
            Objects.equals(title, that.title) &&
            Objects.equals(versionID, that.versionID) &&
            Objects.equals(versions, that.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, bccRecipients, billingAttention, billingClientCorporation, billingContact, billingCorporateUser, billingLocation, ccRecipients, clientCorporation, dateAdded, dateLastModified, deliveryMethodLookup, description, effectiveDate, effectiveEndDate, externalID, invoiceStatementMessageTemplate, invoiceTerm, isDeleted, owner, toRecipients, status, title, versionID, versions);
    }

    @Override
    public String toString() {
        return "BillingProfile{" +
            "id=" + id +
            ", bccRecipients=" + bccRecipients +
            ", billingAttention='" + billingAttention + '\'' +
            ", billingClientCorporation=" + billingClientCorporation +
            ", billingContact=" + billingContact +
            ", billingCorporateUser=" + billingCorporateUser +
            ", billingLocation=" + billingLocation +
            ", ccRecipients=" + ccRecipients +
            ", clientCorporation=" + clientCorporation +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", deliveryMethod='" + deliveryMethodLookup + '\'' +
            ", description='" + description + '\'' +
            ", effectiveDate=" + effectiveDate +
            ", effectiveEndDate=" + effectiveEndDate +
            ", externalID='" + externalID + '\'' +
            ", invoiceStatementMessageTemplate=" + invoiceStatementMessageTemplate +
            ", invoiceTerm=" + invoiceTerm +
            ", isDeleted=" + isDeleted +
            ", owner=" + owner +
            ", toRecipients=" + toRecipients +
            ", status='" + status + '\'' +
            ", title='" + title + '\'' +
            ", versionID=" + versionID +
            ", versions=" + versions +
            '}';
    }
}
