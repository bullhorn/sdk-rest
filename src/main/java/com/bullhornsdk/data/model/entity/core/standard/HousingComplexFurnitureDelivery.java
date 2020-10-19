package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "address", "billingContactID", "comments", "contactName", "customContactID1", "customContactID2",
    "customDate1", "customDate2", "customDate3", "customFloat1", "customFloat2", "customFloat3", "customInt1", "customInt2", "customInt3",
    "customText1", "customText2", "customText3", "customText4", "customText5", "customTextBlock1", "customTextBlock2", "customTextBlock3",
    "customTextBlock4", "customTextBlock5", "dateAdded", "dateOfDelivery", "dateOfOrder", "dateOfPickup", "fax", "isDeleted",
    "migrateGUID", "name", "phone", "unit" })
public class HousingComplexFurnitureDelivery extends CustomFieldsB implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity {

    private Integer id;

    private Address address;

    private Integer billingContactID;

    private String comments;

    @Size(max = 100)
    private String contactName;

    private Integer customContactID1;

    private Integer customContactID2;

    private DateTime dateAdded;

    private DateTime dateOfDelivery;

    private DateTime dateOfOrder;

    private DateTime dateOfPickup;

    private String fax;

    private Boolean isDeleted;

    private String migrateGUID;

    @Size(max = 100)
    private String name;

    private String phone;

    private HousingComplexUnit unit;


    public HousingComplexFurnitureDelivery() {
	super();
    }

    /**
     * Returns the entity with the required fields for an insert set.
     * 
     * @return
     */
	public HousingComplexFurnitureDelivery instantiateForInsert() {
		HousingComplexFurnitureDelivery entity = new HousingComplexFurnitureDelivery();
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

    @ReadOnly
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("billingContactID")
    public Integer getBillingContactID() {
	return billingContactID;
    }

    @ReadOnly
    @JsonProperty("billingContactID")
    public void setBillingContactID(Integer billingContactID) {
	this.billingContactID = billingContactID;
    }

    @JsonProperty("comments")
    public String getComments() {
	return comments;
    }

    @ReadOnly
    @JsonProperty("comments")
    public void setComments(String comments) {
	this.comments = comments;
    }

    @JsonProperty("contactName")
    public String getContactName() {
        return contactName;
    }

    @ReadOnly
    @JsonProperty("contactName")
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    @JsonProperty("customContactID1")
    public Integer getCustomContactID1() {
	return customContactID1;
    }

    @ReadOnly
    @JsonProperty("customContactID1")
    public void setCustomContactID1(Integer customContactID1) {
	this.customContactID1 = customContactID1;
    }
    
    @JsonProperty("customContactID2")
    public Integer getCustomContactID2() {
	return customContactID2;
    }

    @ReadOnly
    @JsonProperty("customContactID2")
    public void setCustomContactID2(Integer customContactID2) {
	this.customContactID2 = customContactID2;
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

    @JsonProperty("dateOfDelivery")
    public DateTime getDateOfDelivery() {
        return dateOfDelivery;
    }

    @ReadOnly
    @JsonProperty("dateOfDelivery")
    public void setDateOfDelivery(DateTime dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    @JsonProperty("dateOfOrder")
    public DateTime getDateOfOrder() {
        return dateOfOrder;
    }

    @ReadOnly
    @JsonProperty("dateOfOrder")
    public void setDateOfOrder(DateTime dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    @JsonProperty("dateOfPickup")
    public DateTime getDateOfPickup() {
        return dateOfPickup;
    }

    @ReadOnly
    @JsonProperty("dateOfPickup")
    public void setDateOfPickup(DateTime dateOfPickup) {
        this.dateOfPickup = dateOfPickup;
    }

    @JsonProperty("fax")
    public String getFax() {
        return fax;
    }

    @ReadOnly
    @JsonProperty("fax")
    public void setFax(String fax) {
        this.fax = fax;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() { return isDeleted; }

    @ReadOnly
    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
	this.isDeleted = isDeleted;
    }

    @JsonProperty("migrateGUID")
    public String getMigrateGUID() {
        return migrateGUID;
    }

    @ReadOnly
    @JsonProperty("migrateGUID")
    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    @JsonProperty("name")
    public String getName() {
	return name;
    }

    @ReadOnly
    @JsonProperty("name")
    public void setName(String name) {
	this.name = name;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @ReadOnly
    @JsonProperty("phone")
    public void setPhone(String phone) { this.phone = phone; }

    @JsonProperty("unit")
    public HousingComplexUnit getUnit() {
        return unit;
    }

    @ReadOnly
    @JsonProperty("unit")
    public void setUnit(HousingComplexUnit unit) {
        this.unit = unit;
    }


    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((billingContactID == null) ? 0 : billingContactID.hashCode());
        result = prime * result + ((comments == null) ? 0 : comments.hashCode());
        result = prime * result + ((contactName == null) ? 0 : contactName.hashCode());
        result = prime * result + ((customContactID1 == null) ? 0 : customContactID1.hashCode());
        result = prime * result + ((customContactID2 == null) ? 0 : customContactID2.hashCode());
        result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
        result = prime * result + ((dateOfDelivery == null) ? 0 : dateOfDelivery.hashCode());
        result = prime * result + ((dateOfOrder == null) ? 0 : dateOfOrder.hashCode());
        result = prime * result + ((dateOfPickup == null) ? 0 : dateOfPickup.hashCode());
        result = prime * result + ((fax == null) ? 0 : fax.hashCode());
        result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
        result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        result = prime * result + ((unit == null) ? 0 : unit.hashCode());
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
        HousingComplexFurnitureDelivery other = (HousingComplexFurnitureDelivery) obj;

        if (address != null ? !address.equals(other.address) : other.address != null)
            return false;
        if (billingContactID != null ? !billingContactID.equals(other.billingContactID) : other.billingContactID != null)
            return false;
        if (comments != null ? !comments.equals(other.comments) : other.comments != null)
            return false;
        if (contactName != null ? !contactName.equals(other.contactName) : other.contactName != null)
            return false;
        if (customContactID1 != null ? !customContactID1.equals(other.customContactID1) : other.customContactID1 != null)
            return false;
        if (customContactID2 != null ? !customContactID2.equals(other.customContactID2) : other.customContactID2 != null)
            return false;
        if (dateAdded != null ? !dateAdded.equals(other.dateAdded) : other.dateAdded != null)
            return false;
        if (dateOfDelivery != null ? !dateOfDelivery.equals(other.dateOfDelivery) : other.dateOfDelivery != null)
            return false;
        if (dateOfOrder != null ? !dateOfOrder.equals(other.dateOfOrder) : other.dateOfOrder != null)
            return false;
        if (dateOfPickup != null ? !dateOfPickup.equals(other.dateOfPickup) : other.dateOfPickup != null)
            return false;
        if (fax != null ? !fax.equals(other.fax) : other.fax != null)
            return false;
        if (isDeleted != null ? !isDeleted.equals(other.isDeleted) : other.isDeleted != null)
        if (migrateGUID != null ? !migrateGUID.equals(other.migrateGUID) : other.migrateGUID != null)
            return false;
        if (name != null ? !name.equals(other.name) : other.name != null)
            return false;
        if (phone != null ? !phone.equals(other.phone) : other.phone != null)
            return false;
        if (unit != null ? !unit.equals(other.unit) : other.unit != null)
            return false;
	    return true;
    }

    @Override
    public String toString() {
	return "id=" + id +
        ", address=" + address +
        ", billingContactID=" + billingContactID +
        ", comments=" + comments +
        ", contactName=" + contactName +
        ", customContactID1=" + customContactID1 +
        ", customContactID2=" + customContactID2 +
        ", dateAdded=" + dateAdded +
        ", dateOfDelivery=" + dateOfDelivery +
        ", dateOfOrder=" + dateOfOrder +
        ", dateOfPickup=" + dateOfPickup +
        ", fax=" + fax +
        ", isDeleted=" + isDeleted +
        ", migrateGUID=" + migrateGUID +
        ", name=" + name +
        ", phone=" + phone +
        ", unit=" + unit +
        super.toString();
    }
}
