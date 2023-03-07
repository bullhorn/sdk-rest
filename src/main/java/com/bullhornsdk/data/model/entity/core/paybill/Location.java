package com.bullhornsdk.data.model.entity.core.paybill;

import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;

import org.joda.time.DateTime;

import javax.validation.constraints.Size;

import java.util.Objects;

/**
 * Created by fayranne.lipton 4/3/2020
 */
@JsonFilter(DynamicNullValueFilter.FILTER_NAME)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "address", "candidate", "clientCorporation",
    "customDate1", "customDate2", "customDate3",
    "customFloat1", "customFloat2", "customFloat3", "customInt1",
    "customInt2", "customInt3", "customText1", "customText10",
    "customText11", "customText12", "customText13", "customText14",
    "customText15", "customText16", "customText17", "customText18",
    "customText19", "customText2", "customText20", "customText3",
    "customText4", "customText5", "customText6", "customText7",
    "customText8", "customText9", "customTextBlock1", "customTextBlock2",
    "customTextBlock3", "customTextBlock4", "customTextBlock5",
    "dateAdded", "dateLastModified", "description", "effectiveDate",
    "effectiveEndDate", "externalID", "isBillTo", "isDeleted", "isSoldTo",
    "isWorkSite", "declineToApplyTaxes", "owner", "status", "title", "versionID", "versions"})
public class Location extends CustomFieldsB implements QueryEntity,
    UpdateEntity, CreateEntity, SoftDeleteEntity, DateLastModifiedEntity, EffectiveDateEntity, AssociationEntity, EditHistoryEntity {

    private Integer id;

    private Address address;

    private Candidate candidate;

    private ClientCorporation clientCorporation;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    @JsonIgnore
    private String description;

    private String effectiveDate;

    private String effectiveEndDate;

    @JsonIgnore
    @Size(max = 100)
    private String externalID;

    private Boolean isBillTo;

    private Boolean isSoldTo;

    private Boolean isWorkSite;

    private Boolean declineToApplyTaxes;

    private CorporateUser owner;

    @JsonIgnore
    @Size(max = 100)
    private String status;

    @JsonIgnore
    @Size(max = 100)
    private String title;

    private Integer versionID;

    private OneToMany<LocationVersion> versions;

    private Boolean isDeleted;

    /**
     * Returns the entity with the required fields for an insert set.
     *
     * @return
     */
    public Location instantiateForInsert() {
        Location entity = new Location();
        entity.setIsDeleted(Boolean.FALSE);
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

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
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

    @JsonProperty("isBillTo")
    public Boolean getIsBillTo() {
        return isBillTo;
    }

    @JsonProperty("isBillTo")
    public void setIsBillTo(Boolean billTo) {
        isBillTo = billTo;
    }

    @JsonProperty("isSoldTo")
    public Boolean getIsSoldTo() {
        return isSoldTo;
    }

    @JsonProperty("isSoldTo")
    public void setIsSoldTo(Boolean soldTo) {
        isSoldTo = soldTo;
    }

    @JsonProperty("isWorkSite")
    public Boolean getIsWorkSite() {
        return isWorkSite;
    }

    @JsonProperty("isWorkSite")
    public void setIsWorkSite(Boolean workSite) {
        isWorkSite = workSite;
    }

    @JsonProperty("declineToApplyTaxes")
    public Boolean getDeclineToApplyTaxes() {
        return declineToApplyTaxes;
    }

    @JsonProperty("declineToApplyTaxes")
    public void setDeclineToApplyTaxes(Boolean declineToApplyTaxes) {
        this.declineToApplyTaxes = declineToApplyTaxes;
    }

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
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

    @JsonProperty("versionID")
    public void setVersionID(Integer versionID) {
        this.versionID = versionID;
    }

    @JsonProperty("versions")
    public OneToMany<LocationVersion> getVersions() {
        return versions;
    }

    @JsonProperty("versions")
    public void setVersions(OneToMany<LocationVersion> versions) {
        this.versions = versions;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Location location = (Location) o;
        return isBillTo == location.isBillTo &&
            isSoldTo == location.isSoldTo &&
            isWorkSite == location.isWorkSite &&
            declineToApplyTaxes == location.declineToApplyTaxes &&
            Objects.equals(id, location.id) &&
            Objects.equals(address, location.address) &&
            Objects.equals(candidate, location.candidate) &&
            Objects.equals(clientCorporation, location.clientCorporation) &&
            Objects.equals(dateAdded, location.dateAdded) &&
            Objects.equals(dateLastModified, location.dateLastModified) &&
            Objects.equals(description, location.description) &&
            Objects.equals(effectiveDate, location.effectiveDate) &&
            Objects.equals(effectiveEndDate, location.effectiveEndDate) &&
            Objects.equals(externalID, location.externalID) &&
            Objects.equals(owner, location.owner) &&
            Objects.equals(status, location.status) &&
            Objects.equals(title, location.title) &&
            Objects.equals(versionID, location.versionID) &&
            Objects.equals(versions, location.versions) &&
            Objects.equals(isDeleted, location.isDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, address, candidate, clientCorporation, dateAdded, dateLastModified, description, effectiveDate, effectiveEndDate, externalID, isBillTo, isSoldTo, isWorkSite, declineToApplyTaxes, owner, status, title, versionID, versions, isDeleted);
    }

    @Override
    public String toString() {
        return "Location{" +
            "id=" + id +
            ", address=" + address +
            ", candidate=" + candidate +
            ", clientCorporation=" + clientCorporation +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", description='" + description + '\'' +
            ", effectiveDate=" + effectiveDate +
            ", effectiveEndDate=" + effectiveEndDate +
            ", externalID='" + externalID + '\'' +
            ", isBillTo=" + isBillTo +
            ", isSoldTo=" + isSoldTo +
            ", isWorkSite=" + isWorkSite +
            ", declineToApplyTaxes=" + declineToApplyTaxes +
            ", owner=" + owner +
            ", status='" + status + '\'' +
            ", title='" + title + '\'' +
            ", versionID=" + versionID +
            ", versions=" + versions +
            ", isDeleted=" + isDeleted +
            '}';
    }
}
