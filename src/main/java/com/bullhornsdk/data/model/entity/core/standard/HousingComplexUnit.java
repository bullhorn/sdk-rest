package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
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
@JsonPropertyOrder({ "id", "billingContactID", "comments", "customContactID1", "customContactID2",  "customDate1", "customDate2",
    "customDate3", "customFloat1", "customFloat2", "customFloat3", "customInt1", "customInt2", "customInt3", "customText1",
	"customText2", "customText3", "customText4", "customText5", "customTextBlock1", "customTextBlock2", "customTextBlock3",
    "customTextBlock4", "customTextBlock5", "dateAdded", "dateLeaseBegin", "dateLeaseEnd", "dateOfDeposit", "dateOfRefund",
    "firstMonthProRate", "furnitureDeliveries", "housingComplex", "isDeleted", "isDepositRefundable", "isLeaseOnFile", "maxOccupants",
    "migrateGUID", "monthlyRent", "name", "occupants", "penalties", "securityDeposit", "unitManagerID", "userHousingComplexUnits",
    "utilityAccounts" })
public class HousingComplexUnit extends CustomFieldsB implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity {

    private Integer id;

    private Integer billingContactID;

    private String comments;

    private Integer customContactID1;

    private Integer customContactID2;

    private Integer customContactID3;

    private DateTime dateAdded;

    private DateTime dateLeaseBegin;

    private DateTime dateLeaseEnd;

    private DateTime dateOfDeposit;

    private DateTime dateOfRefund;

    private BigDecimal firstMonthProRate;

    private OneToMany<HousingComplexFurnitureDelivery> furnitureDeliveries;

    private HousingComplex housingComplex;

    private Boolean isDeleted;

    private Boolean isDepositRefundable;

    private Boolean isLeaseOnFile;

    private Integer maxOccupants;

    private String migrateGUID;

    private BigDecimal monthlyRent;

    @Size(max = 100)
    private String name;

    private Integer occupants;

    private String penalties;

    private BigDecimal securityDeposit;

    private Integer unitManagerID;

    private OneToMany<UserHousingComplexUnit> userHousingComplexUnits;

    private OneToMany<HousingComplexUtilityAccount>  utilityAccounts;


    public HousingComplexUnit() {
	super();
    }

    /**
     * Returns the entity with the required fields for an insert set.
     * 
     * @return
     */
	public HousingComplexUnit instantiateForInsert() {
		HousingComplexUnit entity = new HousingComplexUnit();
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
    
    @JsonProperty("customContactID3")
    public Integer getCustomContactID3() {
	return customContactID3;
    }

    @ReadOnly
    @JsonProperty("customContactID3")
    public void setCustomContactID3(Integer customContactID3) {
	this.customContactID3 = customContactID3;
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

    @JsonProperty("dateLeaseBegin")
    public DateTime getDateLeaseBegin() {
        return dateLeaseBegin;
    }

    @ReadOnly
    @JsonProperty("dateLeaseBegin")
    public void setDateLeaseBegin(DateTime dateLeaseBegin) {
        this.dateLeaseBegin = dateLeaseBegin;
    }

    @JsonProperty("dateLeaseEnd")
    public DateTime getDateLeaseEnd() {
        return dateLeaseEnd;
    }

    @ReadOnly
    @JsonProperty("dateLeaseEnd")
    public void setDateLeaseEnd(DateTime dateLeaseEnd) {
        this.dateLeaseEnd = dateLeaseEnd;
    }

    @JsonProperty("dateOfDeposit")
    public DateTime getDateOfDeposit() {
        return dateOfDeposit;
    }

    @ReadOnly
    @JsonProperty("dateOfDeposit")
    public void setDateOfDeposit(DateTime dateOfDeposit) {
        this.dateOfDeposit = dateOfDeposit;
    }

    @JsonProperty("dateOfRefund")
    public DateTime getDateOfRefund() {
        return dateOfRefund;
    }

    @ReadOnly
    @JsonProperty("dateOfRefund")
    public void setDateOfRefund(DateTime dateOfRefund) {
        this.dateOfRefund = dateOfRefund;
    }

    @JsonProperty("firstMonthProRate")
    public BigDecimal getFirstMonthProRate() {
        return firstMonthProRate;
    }

    @ReadOnly
    @JsonProperty("firstMonthProRate")
    public void setFirstMonthProRate(BigDecimal firstMonthProRate) {
        this.firstMonthProRate = firstMonthProRate;
    }

    @JsonProperty("furnitureDeliveries")
    public OneToMany<HousingComplexFurnitureDelivery> getHousingComplexFurnitureDeliveries() {
        return furnitureDeliveries;
    }

    @ReadOnly
    @JsonProperty("furnitureDeliveries")
    public void setHousingComplexFurnitureDeliveries(OneToMany<HousingComplexFurnitureDelivery> furnitureDeliveries) {
        this.furnitureDeliveries = furnitureDeliveries;
    }

    @JsonProperty("housingComplex")
    public HousingComplex getHousingComplex() {
        return housingComplex;
    }

    @ReadOnly
    @JsonProperty("housingComplex")
    public void setHousingComplex(HousingComplex housingComplex) {
        this.housingComplex = housingComplex;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() { return isDeleted; }

    @ReadOnly
    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
	this.isDeleted = isDeleted;
    }

    @JsonProperty("isDepositRefundable")
    public Boolean getIsDepositRefundable() {
        return isDepositRefundable;
    }

    @ReadOnly
    @JsonProperty("isDepositRefundable")
    public void setIsDepositRefundable(Boolean isDepositRefundable) {
        this.isDepositRefundable = isDepositRefundable;
    }

    @JsonProperty("isLeaseOnFile")
    public Boolean getIsLeaseOnFile() {
        return isLeaseOnFile;
    }

    @ReadOnly
    @JsonProperty("isLeaseOnFile")
    public void setIsLeaseOnFile(Boolean isLeaseOnFile) {
        this.isLeaseOnFile = isLeaseOnFile;
    }

    @JsonProperty("maxOccupants")
    public Integer getMaxOccupants() {
        return maxOccupants;
    }

    @ReadOnly
    @JsonProperty("maxOccupants")
    public void setMaxOccupants(Integer maxOccupants) {
        this.maxOccupants = maxOccupants;
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

    @JsonProperty("monthlyRent")
    public BigDecimal getMonthlyRent() {
        return monthlyRent;
    }

    @ReadOnly
    @JsonProperty("monthlyRent")
    public void setMonthlyRent(BigDecimal monthlyRent) {
        this.monthlyRent = monthlyRent;
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

    @JsonProperty("occupants")
    public Integer getOccupants() {
        return occupants;
    }

    @ReadOnly
    @JsonProperty("occupants")
    public void setOccupants(Integer occupants) {
        this.occupants = occupants;
    }

    @JsonProperty("penalties")
    public String getPenalties() {
        return penalties;
    }

    @ReadOnly
    @JsonProperty("penalties")
    public void setPenalties(String penalties) { this.penalties = penalties; }

    @JsonProperty("securityDeposit")
    public BigDecimal getSecurityDeposit() {
        return securityDeposit;
    }

    @ReadOnly
    @JsonProperty("securityDeposit")
    public void setSecurityDeposit(BigDecimal securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    @JsonProperty("unitManagerID")
    public Integer getUnitManagerID() {
        return unitManagerID;
    }

    @ReadOnly
    @JsonProperty("unitManagerID")
    public void setUnitManagerID(Integer unitManagerID) {
        this.unitManagerID = unitManagerID;
    }

    @JsonProperty("userHousingComplexUnits")
    public OneToMany<UserHousingComplexUnit> getUserHousingComplexUnits() {
        return userHousingComplexUnits;
    }

    @ReadOnly
    @JsonProperty("userHousingComplexUnits")
    public void setUserHousingComplexUnits(OneToMany<UserHousingComplexUnit> userHousingComplexUnits) {
        this.userHousingComplexUnits = userHousingComplexUnits;
    }

    @JsonProperty("utilityAccounts")
    public OneToMany<HousingComplexUtilityAccount> getHousingComplexUtilityAccounts() {
        return utilityAccounts;
    }

    @ReadOnly
    @JsonProperty("utilityAccounts")
    public void setHousingComplexUtilityAccounts(OneToMany<HousingComplexUtilityAccount> utilityAccounts) {
        this.utilityAccounts = utilityAccounts;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((billingContactID == null) ? 0 : billingContactID.hashCode());
        result = prime * result + ((comments == null) ? 0 : comments.hashCode());
        result = prime * result + ((customContactID1 == null) ? 0 : customContactID1.hashCode());
        result = prime * result + ((customContactID2 == null) ? 0 : customContactID2.hashCode());
        result = prime * result + ((customContactID3 == null) ? 0 : customContactID3.hashCode());
        result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
        result = prime * result + ((dateLeaseBegin == null) ? 0 : dateLeaseBegin.hashCode());
        result = prime * result + ((dateLeaseEnd == null) ? 0 : dateLeaseEnd.hashCode());
        result = prime * result + ((dateOfDeposit == null) ? 0 : dateOfDeposit.hashCode());
        result = prime * result + ((dateOfRefund == null) ? 0 : dateOfRefund.hashCode());
        result = prime * result + ((firstMonthProRate == null) ? 0 : firstMonthProRate.hashCode());
        result = prime * result + ((furnitureDeliveries == null) ? 0 : furnitureDeliveries.hashCode());
        result = prime * result + ((housingComplex == null) ? 0 : housingComplex.hashCode());
        result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
        result = prime * result + ((isDepositRefundable == null) ? 0 : isDepositRefundable.hashCode());
        result = prime * result + ((isLeaseOnFile == null) ? 0 : isLeaseOnFile.hashCode());
        result = prime * result + ((maxOccupants == null) ? 0 : maxOccupants.hashCode());
        result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
        result = prime * result + ((monthlyRent == null) ? 0 : monthlyRent.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((occupants == null) ? 0 : occupants.hashCode());
        result = prime * result + ((penalties == null) ? 0 : penalties.hashCode());
        result = prime * result + ((securityDeposit == null) ? 0 : securityDeposit.hashCode());
        result = prime * result + ((unitManagerID == null) ? 0 : unitManagerID.hashCode());
        result = prime * result + ((userHousingComplexUnits == null) ? 0 : userHousingComplexUnits.hashCode());
        result = prime * result + ((utilityAccounts == null) ? 0 : utilityAccounts.hashCode());
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
        HousingComplexUnit other = (HousingComplexUnit) obj;

        if (billingContactID != null ? !billingContactID.equals(other.billingContactID) : other.billingContactID != null)
            return false;
        if (comments != null ? !comments.equals(other.comments) : other.comments != null)
            return false;
        if (customContactID1 != null ? !customContactID1.equals(other.customContactID1) : other.customContactID1 != null)
            return false;
        if (customContactID2 != null ? !customContactID2.equals(other.customContactID2) : other.customContactID2 != null)
            return false;
        if (customContactID3 != null ? !customContactID3.equals(other.customContactID3) : other.customContactID3 != null)
            return false;
        if (dateAdded != null ? !dateAdded.equals(other.dateAdded) : other.dateAdded != null)
            return false;
        if (dateLeaseBegin != null ? !dateLeaseBegin.equals(other.dateLeaseBegin) : other.dateLeaseBegin != null)
            return false;
        if (dateLeaseEnd != null ? !dateLeaseEnd.equals(other.dateLeaseEnd) : other.dateLeaseEnd != null)
            return false;
        if (dateOfDeposit != null ? !dateOfDeposit.equals(other.dateOfDeposit) : other.dateOfDeposit != null)
            return false;
        if (dateOfRefund != null ? !dateOfRefund.equals(other.dateOfRefund) : other.dateOfRefund != null)
            return false;
        if (firstMonthProRate != null ? !firstMonthProRate.equals(other.firstMonthProRate) : other.firstMonthProRate != null)
            return false;
        if (furnitureDeliveries != null ? !furnitureDeliveries.equals(other.furnitureDeliveries) : other.furnitureDeliveries != null)
            return false;
        if (housingComplex != null ? !housingComplex.equals(other.housingComplex) : other.housingComplex != null)
            return false;
        if (isDeleted != null ? !isDeleted.equals(other.isDeleted) : other.isDeleted != null)
            return false;
        if (isDepositRefundable != null ? !isDepositRefundable.equals(other.isDepositRefundable) : other.isDepositRefundable != null)
            return false;
        if (isDepositRefundable != null ? !isDepositRefundable.equals(other.isDepositRefundable) : other.isDepositRefundable != null)
            return false;
        if (isLeaseOnFile != null ? !isLeaseOnFile.equals(other.isLeaseOnFile) : other.isLeaseOnFile != null)
            return false;
        if (maxOccupants != null ? !maxOccupants.equals(other.maxOccupants) : other.maxOccupants != null)
            return false;
        if (migrateGUID != null ? !migrateGUID.equals(other.migrateGUID) : other.migrateGUID != null)
            return false;
        if (monthlyRent != null ? !monthlyRent.equals(other.monthlyRent) : other.monthlyRent != null)
            return false;
        if (name != null ? !name.equals(other.name) : other.name != null)
            return false;
        if (occupants != null ? !occupants.equals(other.occupants) : other.occupants != null)
            return false;
        if (penalties != null ? !penalties.equals(other.penalties) : other.penalties != null)
            return false;
        if (securityDeposit != null ? !securityDeposit.equals(other.securityDeposit) : other.securityDeposit != null)
            return false;
        if (unitManagerID != null ? !unitManagerID.equals(other.unitManagerID) : other.unitManagerID != null)
            return false;
        if (userHousingComplexUnits != null ? !userHousingComplexUnits.equals(other.userHousingComplexUnits) : other.userHousingComplexUnits != null)
            return false;
        if (utilityAccounts != null ? !utilityAccounts.equals(other.utilityAccounts) : other.utilityAccounts != null)
            return false;
	    return true;
    }

    @Override
    public String toString() {
	return "id=" + id +
        ", billingContactID=" + billingContactID +
        ", comments=" + comments +
        ", customContactID1=" + customContactID1 +
        ", customContactID2=" + customContactID2 +
        ", customContactID3=" + customContactID3 +
        ", dateAdded=" + dateAdded +
        ", dateLeaseBegin=" + dateLeaseBegin +
        ", dateLeaseEnd=" + dateLeaseEnd +
        ", dateOfDeposit=" + dateOfDeposit +
        ", dateOfRefund=" + dateOfRefund +
        ", firstMonthProRate=" + firstMonthProRate +
        ", furnitureDeliveries=" + furnitureDeliveries +
        ", housingComplex=" + housingComplex +
        ", isDeleted=" + isDeleted +
        ", isDepositRefundable=" + isDepositRefundable +
        ", isLeaseOnFile=" + isLeaseOnFile +
        ", maxOccupants=" + maxOccupants +
        ", migrateGUID=" + migrateGUID +
        ", monthlyRent=" + monthlyRent +
        ", name=" + name +
        ", occupants=" + occupants +
        ", penalties=" + penalties +
        ", securityDeposit=" + securityDeposit +
        ", unitManagerID=" + unitManagerID +
        ", userHousingComplexUnits=" + userHousingComplexUnits +
        ", utilityAccounts=" + utilityAccounts +
        super.toString();
    }
}
