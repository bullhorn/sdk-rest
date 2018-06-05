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
@JsonPropertyOrder({ "id", "accountNumber", "address", "billingContactID", "comments", "customContactID1", "customContactID2",
    "customDate1", "customDate2", "customDate3", "customFloat1", "customFloat2", "customFloat3", "customInt1", "customInt2", "customInt3",
    "customText1", "customText2", "customText3", "customText4", "customText5", "customTextBlock1", "customTextBlock2", "customTextBlock3",
    "customTextBlock4", "customTextBlock5", "dateAdded", "dateConnected", "dateDisconnected", "deposit", "fax", "isDeleted",
    "migrateGUID", "name", "phone", "type", "unit" })
public class HousingComplexUtilityAccount extends CustomFieldsB implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity {

    private Integer id;

    @Size(max = 100)
    private String accountNumber;

    private Address address;

    private Integer billingContactID;

    private String comments;

    private Integer customContactID1;

    private Integer customContactID2;

    private DateTime dateAdded;

    private DateTime dateConnected;

    private DateTime dateDisconnected;

    private BigDecimal deposit;

    private String fax;

    private Boolean isDeleted;

    private String migrateGUID;

    @Size(max = 100)
    private String name;

    private String phone;

    @Size(max = 100)
    private String type;

    private HousingComplexUnit unit;


    public HousingComplexUtilityAccount() {
	super();
    }

    /**
     * Returns the entity with the required fields for an insert set.
     * 
     * @return
     */
	public HousingComplexUtilityAccount instantiateForInsert() {
		HousingComplexUtilityAccount entity = new HousingComplexUtilityAccount();
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

    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @ReadOnly
    @JsonProperty("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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

    @JsonProperty("dateConnected")
    public DateTime getDateConnected() {
        return dateConnected;
    }

    @ReadOnly
    @JsonProperty("dateConnected")
    public void setDateConnected(DateTime dateConnected) {
        this.dateConnected = dateConnected;
    }

    @JsonProperty("dateDisconnected")
    public DateTime getDateDisconnected() {
        return dateDisconnected;
    }

    @ReadOnly
    @JsonProperty("dateDisconnected")
    public void setDateDisconnected(DateTime dateDisconnected) {
        this.dateDisconnected = dateDisconnected;
    }

    @JsonProperty("deposit")
    public BigDecimal getDeposit() {
        return deposit;
    }

    @ReadOnly
    @JsonProperty("deposit")
    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
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

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @ReadOnly
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

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
        result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((billingContactID == null) ? 0 : billingContactID.hashCode());
        result = prime * result + ((comments == null) ? 0 : comments.hashCode());
        result = prime * result + ((customContactID1 == null) ? 0 : customContactID1.hashCode());
        result = prime * result + ((customContactID2 == null) ? 0 : customContactID2.hashCode());
        result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
        result = prime * result + ((dateConnected == null) ? 0 : dateConnected.hashCode());
        result = prime * result + ((dateDisconnected == null) ? 0 : dateDisconnected.hashCode());
        result = prime * result + ((deposit == null) ? 0 : deposit.hashCode());
        result = prime * result + ((fax == null) ? 0 : fax.hashCode());
        result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
        result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
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
        HousingComplexUtilityAccount other = (HousingComplexUtilityAccount) obj;

        if (accountNumber != null ? !accountNumber.equals(other.accountNumber) : other.accountNumber != null)
            return false;
        if (address != null ? !address.equals(other.address) : other.address != null)
            return false;
        if (billingContactID != null ? !billingContactID.equals(other.billingContactID) : other.billingContactID != null)
            return false;
        if (comments != null ? !comments.equals(other.comments) : other.comments != null)
            return false;
        if (customContactID1 != null ? !customContactID1.equals(other.customContactID1) : other.customContactID1 != null)
            return false;
        if (customContactID2 != null ? !customContactID2.equals(other.customContactID2) : other.customContactID2 != null)
            return false;
        if (dateAdded != null ? !dateAdded.equals(other.dateAdded) : other.dateAdded != null)
            return false;
        if (dateConnected != null ? !dateConnected.equals(other.dateConnected) : other.dateConnected != null)
            return false;
        if (dateDisconnected != null ? !dateDisconnected.equals(other.dateDisconnected) : other.dateDisconnected != null)
            return false;
        if (deposit != null ? !deposit.equals(other.deposit) : other.deposit != null)
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
        if (type != null ? !type.equals(other.type) : other.type != null)
            return false;
        if (unit != null ? !unit.equals(other.unit) : other.unit != null)
            return false;
	    return true;
    }

    @Override
    public String toString() {
	return "id=" + id +
        ", accountNumber=" + accountNumber +
        ", address=" + address +
        ", billingContactID=" + billingContactID +
        ", comments=" + comments +
        ", customContactID1=" + customContactID1 +
        ", customContactID2=" + customContactID2 +
        ", dateAdded=" + dateAdded +
        ", dateConnected=" + dateConnected +
        ", dateDisconnected=" + dateDisconnected +
        ", deposit=" + deposit +
        ", fax=" + fax +
        ", isDeleted=" + isDeleted +
        ", migrateGUID=" + migrateGUID +
        ", name=" + name +
        ", phone=" + phone +
        ", type=" + type +
        ", unit=" + unit +
        super.toString();
    }
}
