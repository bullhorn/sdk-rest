package com.bullhornsdk.data.model.entity.core.standard;

import javax.validation.constraints.Size;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "address", "billingContactID", "comments", "complexManagerID", "complexOwnerID", "contactName", "customDate1",
	"customDate2", "customDate3", "customFloat1", "customFloat2", "customFloat3", "customInt1", "customInt2", "customInt3", "customText1",
	"customText2", "customText3", "customText4", "customText5", "customTextBlock1", "customTextBlock2", "customTextBlock3", "customTextBlock4",
	"customTextBlock5", "dateAdded", "fax", "isDeleted", "name", "owner", "phone", "whiteListClientCorporations"})
public class HousingComplex extends CustomFieldsB implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity {

    private Integer id;

    private Address address;

    private Integer billingContactID;

    private String comments;

    private Integer complexManagerID;

    private Integer complexOwnerID;

    @Size(max = 40)
    private String contactName;
    
    private Integer customContactID1;

    private Integer customContactID2;
    
    private Integer customContactID3;
    
    private DateTime dateAdded;

    @Size(max = 20)
    private String fax;

    private Boolean isDeleted;

    @Size(max = 100)
    private String name;

    private CorporateUser owner;

    @Size(max = 20)
    private String phone;

    private OneToMany<ClientCorporation> whitelistClientCorporations;

    public HousingComplex() {
	super();
    }

    /**
     * Returns the entity with the required fields for an insert set.
     * 
     * @return
     */
    public HousingComplex instantiateForInsert() {
	HousingComplex entity = new HousingComplex();
	entity.setIsDeleted(Boolean.FALSE);
	return entity;
    }

    @Override
    @JsonProperty("id")
    public Integer getId() {
	return id;
    }

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

    @JsonProperty("billingContactID")
    public Integer getBillingContactID() {
	return billingContactID;
    }

    @JsonProperty("billingContactID")
    public void setBillingContactID(Integer billingContactID) {
	this.billingContactID = billingContactID;
    }

    @JsonProperty("comments")
    public String getComments() {
	return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
	this.comments = comments;
    }

    @JsonProperty("complexManagerID")
    public Integer getComplexManagerID() {
	return complexManagerID;
    }

    @JsonProperty("complexManagerID")
    public void setComplexManagerID(Integer billingContactID) {
	this.complexManagerID = billingContactID;
    }

    @JsonProperty("complexOwnerID")
    public Integer getComplexOwnerID() {
	return complexOwnerID;
    }

    @JsonProperty("complexOwnerID")
    public void setComplexOwnerID(Integer billingContactID) {
	this.complexOwnerID = billingContactID;
    }

    @JsonProperty("contactName")
    public String getContactName() {
	return contactName;
    }

    @JsonProperty("contactName")
    public void setContactName(String contactName) {
	this.contactName = contactName;
    }
    
    @JsonProperty("customContactID1")
    public Integer getCustomContactID1() {
	return customContactID1;
    }

    @JsonProperty("customContactID1")
    public void setCustomContactID1(Integer customContactID1) {
	this.customContactID1 = customContactID1;
    }
    
    @JsonProperty("customContactID2")
    public Integer getCustomContactID2() {
	return customContactID2;
    }

    @JsonProperty("customContactID2")
    public void setCustomContactID2(Integer customContactID2) {
	this.customContactID2 = customContactID2;
    }
    
    @JsonProperty("customContactID3")
    public Integer getCustomContactID3() {
	return customContactID3;
    }

    @JsonProperty("customContactID3")
    public void setCustomContactID3(Integer customContactID3) {
	this.customContactID3 = customContactID3;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
	return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
	this.dateAdded = dateAdded;
    }

    @JsonProperty("fax")
    public String getFax() {
	return fax;
    }

    @JsonIgnore
    public void setFax(String fax) {
	this.fax = fax;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
	return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
	this.isDeleted = isDeleted;
    }

    @JsonProperty("name")
    public String getName() {
	return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
	this.name = name;
    }

    @JsonProperty("owner")
    public CorporateUser getOwner() {
	return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
	this.owner = owner;
    }

    @JsonProperty("phone")
    public String getPhone() {
	return phone;
    }

    @JsonIgnore
    public void setPhone(String phone) {
	this.phone = phone;
    }

    @JsonProperty("whitelistClientCorporations")
    public OneToMany<ClientCorporation> getWhitelistClientCorporations() {
	return whitelistClientCorporations;
    }

    @JsonProperty("whitelistClientCorporations")
    public void setWhitelistClientCorporations(OneToMany<ClientCorporation> whitelistClientCorporations) {
	this.whitelistClientCorporations = whitelistClientCorporations;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + ((billingContactID == null) ? 0 : billingContactID.hashCode());
	result = prime * result + ((comments == null) ? 0 : comments.hashCode());
	result = prime * result + ((complexManagerID == null) ? 0 : complexManagerID.hashCode());
	result = prime * result + ((complexOwnerID == null) ? 0 : complexOwnerID.hashCode());
	result = prime * result + ((contactName == null) ? 0 : contactName.hashCode());
	result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
	result = prime * result + ((fax == null) ? 0 : fax.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((owner == null) ? 0 : owner.hashCode());
	result = prime * result + ((phone == null) ? 0 : phone.hashCode());
	result = prime * result + ((whitelistClientCorporations == null) ? 0 : whitelistClientCorporations.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!super.equals(obj))
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	HousingComplex other = (HousingComplex) obj;
	if (address == null) {
	    if (other.address != null)
		return false;
	} else if (!address.equals(other.address))
	    return false;
	if (billingContactID == null) {
	    if (other.billingContactID != null)
		return false;
	} else if (!billingContactID.equals(other.billingContactID))
	    return false;
	if (comments == null) {
	    if (other.comments != null)
		return false;
	} else if (!comments.equals(other.comments))
	    return false;
	if (complexManagerID == null) {
	    if (other.complexManagerID != null)
		return false;
	} else if (!complexManagerID.equals(other.complexManagerID))
	    return false;
	if (complexOwnerID == null) {
	    if (other.complexOwnerID != null)
		return false;
	} else if (!complexOwnerID.equals(other.complexOwnerID))
	    return false;
	if (contactName == null) {
	    if (other.contactName != null)
		return false;
	} else if (!contactName.equals(other.contactName))
	    return false;
	if (dateAdded == null) {
	    if (other.dateAdded != null)
		return false;
	} else if (!dateAdded.equals(other.dateAdded))
	    return false;
	if (fax == null) {
	    if (other.fax != null)
		return false;
	} else if (!fax.equals(other.fax))
	    return false;
	if (id == null) {
	    if (other.id != null)
		return false;
	} else if (!id.equals(other.id))
	    return false;
	if (isDeleted == null) {
	    if (other.isDeleted != null)
		return false;
	} else if (!isDeleted.equals(other.isDeleted))
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	if (owner == null) {
	    if (other.owner != null)
		return false;
	} else if (!owner.equals(other.owner))
	    return false;
	if (phone == null) {
	    if (other.phone != null)
		return false;
	} else if (!phone.equals(other.phone))
	    return false;
	if (whitelistClientCorporations == null) {
	    if (other.whitelistClientCorporations != null)
		return false;
	} else if (!whitelistClientCorporations.equals(other.whitelistClientCorporations))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "HousingComplex [id=" + id + ", address=" + address + ", billingContactID=" + billingContactID + ", comments=" + comments
		+ ", complexManagerID=" + complexManagerID + ", complexOwnerID=" + complexOwnerID + ", contactName=" + contactName + ", dateAdded="
		+ dateAdded + ", fax=" + fax + ", isDeleted=" + isDeleted + ", name=" + name + ", owner=" + owner + ", phone=" + phone
		+ ", whitelistClientCorporations=" + whitelistClientCorporations + ", getCustomTextBlock1()=" + getCustomTextBlock1()
		+ ", getCustomTextBlock2()=" + getCustomTextBlock2() + ", getCustomTextBlock3()=" + getCustomTextBlock3()
		+ ", getCustomTextBlock4()=" + getCustomTextBlock4() + ", getCustomTextBlock5()=" + getCustomTextBlock5() + ", toString()="
		+ super.toString() + ", getCustomDate1()=" + getCustomDate1() + ", getCustomDate2()=" + getCustomDate2() + ", getCustomDate3()="
		+ getCustomDate3() + ", getCustomFloat1()=" + getCustomFloat1() + ", getCustomFloat2()=" + getCustomFloat2() + ", getCustomFloat3()="
		+ getCustomFloat3() + ", getCustomInt1()=" + getCustomInt1() + ", getCustomInt2()=" + getCustomInt2() + ", getCustomInt3()="
		+ getCustomInt3() + ", getCustomText1()=" + getCustomText1() + ", getCustomText2()=" + getCustomText2() + ", getCustomText3()="
		+ getCustomText3() + ", getCustomText4()=" + getCustomText4() + ", getCustomText5()=" + getCustomText5() + ", getCustomText6()="
		+ getCustomText6() + ", getCustomText7()=" + getCustomText7() + ", getCustomText8()=" + getCustomText8() + ", getCustomText9()="
		+ getCustomText9() + ", getCustomText10()=" + getCustomText10() + ", getCustomText11()=" + getCustomText11() + ", getCustomText12()="
		+ getCustomText12() + ", getCustomText13()=" + getCustomText13() + ", getCustomText14()=" + getCustomText14()
		+ ", getCustomText15()=" + getCustomText15() + ", getCustomText16()=" + getCustomText16() + ", getCustomText17()="
		+ getCustomText17() + ", getCustomText18()=" + getCustomText18() + ", getCustomText19()=" + getCustomText19()
		+ ", getCustomText20()=" + getCustomText20() + ", getAdditionalProperties()=" + getAdditionalProperties() + ", getClass()="
		+ getClass() + "]";
    }
}
