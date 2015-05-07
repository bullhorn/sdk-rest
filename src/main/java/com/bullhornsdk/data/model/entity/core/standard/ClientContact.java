package com.bullhornsdk.data.model.entity.core.standard;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.FileEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.LinkedPerson;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.embedded.OneToManyLinkedId;
import com.bullhornsdk.data.util.RestUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "address", "businessSectors", "categories",
		"category", "certifications", "clientContactID", "clientCorporation",
		"comments", "customDate1", "customDate2", "customDate3",
		"customFloat1", "customFloat2", "customFloat3", "customInt1",
		"customInt2", "customInt3", "customText1", "customText10",
		"customText11", "customText12", "customText13", "customText14",
		"customText15", "customText16", "customText17", "customText18",
		"customText19", "customText2", "customText20", "customText3",
		"customText4", "customText5", "customText6", "customText7",
		"customText8", "customText9", "customTextBlock1", "customTextBlock2",
		"customTextBlock3", "customTextBlock4", "customTextBlock5",
		"dateAdded", "dateLastComment", "dateLastVisit", "deleteMe",
		"description", "desiredCategories", "desiredSkills",
		"desiredSpecialties", "division", "email", "email2", "email3",
		"externalID", "fax", "fax2", "fax3", "firstName", "isDayLightSavings",
		"isDeleted", "isLockedOut", "lastName", "linkedPerson",
		"massMailOptOut", "middleName", "migrateGUID", "mobile", "name",
		"namePrefix", "nameSuffix", "nickName", "numEmployees", "occupation",
		"office", "owner", "pager", "password", "phone", "phone2", "phone3",
		"preferredContact", "referredByPerson", "reportToPerson",
		"secondaryAddress", "secondaryOwners", "skills", "smsOptIn", "source",
		"specialties", "status", "tearsheets", "timeZoneOffsetEST", "type",
		"username" })
public class ClientContact extends CustomFieldsB implements QueryEntity,
		UpdateEntity, CreateEntity, SoftDeleteEntity, FileEntity,
		AssociationEntity, SearchEntity {

	private Integer id;

	private Address address;

	private OneToMany<BusinessSector> businessSectors;

	private OneToMany<Category> categories;

	private Category category;

	@JsonIgnore
	private String certifications;

	private Integer clientContactID;

	private ClientCorporation clientCorporation;

	@JsonIgnore
	private String comments;

	private DateTime dateAdded;

	private DateTime dateLastComment;

	private DateTime dateLastVisit;

	private Boolean deleteMe;

	@JsonIgnore
	private String description;

	@JsonIgnore
	private String desiredCategories;

	@JsonIgnore
	private String desiredSkills;

	@JsonIgnore
	private String desiredSpecialties;

	@JsonIgnore
	@Size(max = 40)
	private String division;

	@JsonIgnore
	@Email
	@Size(max = 60)
	private String email;

	@JsonIgnore
	@Email
	@Size(max = 100)
	private String email2;

	@JsonIgnore
	@Email
	@Size(max = 100)
	private String email3;

	@JsonIgnore
	@Size(max = 30)
	private String externalID;

	@JsonIgnore
	@Size(max = 20)
	private String fax;

	@JsonIgnore
	@Size(max = 20)
	private String fax2;

	@JsonIgnore
	@Size(max = 20)
	private String fax3;

	@JsonIgnore
	@Size(max = 50)
	private String firstName;

	private Boolean isDayLightSavings;

	private Boolean isDeleted;

	private Boolean isLockedOut;

	@JsonIgnore
	@Size(max = 50)
	private String lastName;

	private LinkedPerson linkedPerson;

	private Boolean massMailOptOut;

	@JsonIgnore
	@Size(max = 50)
	private String middleName;

	private Object migrateGUID;

	@JsonIgnore
	@Size(max = 20)
	private String mobile;

	@JsonIgnore
	private String name;

	@JsonIgnore
	@Size(max = 5)
	private String namePrefix;

	@JsonIgnore
	@Size(max = 5)
	private String nameSuffix;

	@JsonIgnore
	private String nickName;

	private Integer numEmployees;

	@JsonIgnore
	@Size(max = 50)
	private String occupation;

	@JsonIgnore
	@Size(max = 40)
	private String office;

	private CorporateUser owner;

	@JsonIgnore
	@Size(max = 20)
	private String pager;

	@JsonIgnore
	private String password;

	@JsonIgnore
	@Size(max = 20)
	private String phone;

	@JsonIgnore
	@Size(max = 20)
	private String phone2;

	@JsonIgnore
	@Size(max = 20)
	private String phone3;

	@JsonIgnore
	@Size(max = 15)
	private String preferredContact;

	private LinkedPerson referredByPerson;

	private LinkedPerson reportToPerson;

	private Address secondaryAddress;

	private OneToMany<CorporateUser> secondaryOwners;

	private OneToMany<Skill> skills;

	private Boolean smsOptIn;

	@JsonIgnore
	@Size(max = 200)
	private String source;

	private OneToMany<Specialty> specialties;

	@JsonIgnore
	@Size(max = 30)
	private String status;

	private OneToManyLinkedId tearsheets;

	private Integer timeZoneOffsetEST;

	@JsonIgnore
	@Size(max = 30)
	private String type;

	@JsonIgnore
	private String username;

	public ClientContact() {
		super();
	}

	public ClientContact(Integer id) {
		super();
		this.id = id;
	}

	/**
	 * Returns the entity with the required fields for an insert set.
	 * 
	 * @return
	 */
	public ClientContact instantiateForInsert() {
		ClientContact entity = new ClientContact();
		entity.setIsDeleted(Boolean.FALSE);
		entity.setCategory(new Category(512973));
		entity.setClientCorporation(new ClientCorporation(1));
		entity.setDateAdded(RestUtil.nowInESTWithUTCTimeZone());
		entity.setEmail("unknown");
		entity.setNumEmployees(1);
		entity.setIsDeleted(Boolean.FALSE);
		entity.setPreferredContact("Email");
		entity.setStatus("Client");
		entity.setOwner(new CorporateUser(1));
		entity.setUsername(new DateTime().toString());
		entity.setPassword("secret");
		entity.setType("Unknown");
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

	@JsonProperty("businessSectors")
	public OneToMany<BusinessSector> getBusinessSectors() {
		return businessSectors;
	}

	@JsonProperty("businessSectors")
	public void setBusinessSectors(OneToMany<BusinessSector> businessSectors) {
		this.businessSectors = businessSectors;
	}

	@JsonProperty("categories")
	public OneToMany<Category> getCategories() {
		return categories;
	}

	@JsonProperty("categories")
	public void setCategories(OneToMany<Category> categories) {
		this.categories = categories;
	}

	@JsonProperty("category")
	public Category getCategory() {
		return category;
	}

	@JsonProperty("category")
	public void setCategory(Category category) {
		this.category = category;
	}

	@JsonProperty("certifications")
	public String getCertifications() {
		return certifications;
	}

	@JsonIgnore
	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}

	@JsonProperty("clientContactID")
	public Integer getClientContactID() {
		return clientContactID;
	}

	@JsonProperty("clientContactID")
	public void setClientContactID(Integer clientContactID) {
		this.clientContactID = clientContactID;
	}

	@JsonProperty("clientCorporation")
	public ClientCorporation getClientCorporation() {
		return clientCorporation;
	}

	@JsonProperty("clientCorporation")
	public void setClientCorporation(ClientCorporation clientCorporation) {
		this.clientCorporation = clientCorporation;
	}

	@JsonProperty("comments")
	public String getComments() {
		return comments;
	}

	@JsonIgnore
	public void setComments(String comments) {
		this.comments = comments;
	}

	@JsonProperty("dateAdded")
	public DateTime getDateAdded() {
		return dateAdded;
	}

	@JsonProperty("dateAdded")
	public void setDateAdded(DateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	@JsonProperty("dateLastComment")
	public DateTime getDateLastComment() {
		return dateLastComment;
	}

	@JsonProperty("dateLastComment")
	public void setDateLastComment(DateTime dateLastComment) {
		this.dateLastComment = dateLastComment;
	}

	@JsonProperty("dateLastVisit")
	public DateTime getDateLastVisit() {
		return dateLastVisit;
	}

	@JsonProperty("dateLastVisit")
	public void setDateLastVisit(DateTime dateLastVisit) {
		this.dateLastVisit = dateLastVisit;
	}

	@JsonProperty("deleteMe")
	public Boolean getDeleteMe() {
		return deleteMe;
	}

	@JsonProperty("deleteMe")
	public void setDeleteMe(Boolean deleteMe) {
		this.deleteMe = deleteMe;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonIgnore
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("desiredCategories")
	public String getDesiredCategories() {
		return desiredCategories;
	}

	@JsonIgnore
	public void setDesiredCategories(String desiredCategories) {
		this.desiredCategories = desiredCategories;
	}

	@JsonProperty("desiredSkills")
	public String getDesiredSkills() {
		return desiredSkills;
	}

	@JsonIgnore
	public void setDesiredSkills(String desiredSkills) {
		this.desiredSkills = desiredSkills;
	}

	@JsonProperty("desiredSpecialties")
	public String getDesiredSpecialties() {
		return desiredSpecialties;
	}

	@JsonIgnore
	public void setDesiredSpecialties(String desiredSpecialties) {
		this.desiredSpecialties = desiredSpecialties;
	}

	@JsonProperty("division")
	public String getDivision() {
		return division;
	}

	@JsonIgnore
	public void setDivision(String division) {
		this.division = division;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonIgnore
	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("email2")
	public String getEmail2() {
		return email2;
	}

	@JsonIgnore
	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	@JsonProperty("email3")
	public String getEmail3() {
		return email3;
	}

	@JsonIgnore
	public void setEmail3(String email3) {
		this.email3 = email3;
	}

	@JsonProperty("externalID")
	public String getExternalID() {
		return externalID;
	}

	@JsonIgnore
	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	@JsonProperty("fax")
	public String getFax() {
		return fax;
	}

	@JsonIgnore
	public void setFax(String fax) {
		this.fax = fax;
	}

	@JsonProperty("fax2")
	public String getFax2() {
		return fax2;
	}

	@JsonIgnore
	public void setFax2(String fax2) {
		this.fax2 = fax2;
	}

	@JsonProperty("fax3")
	public String getFax3() {
		return fax3;
	}

	@JsonIgnore
	public void setFax3(String fax3) {
		this.fax3 = fax3;
	}

	@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}

	@JsonIgnore
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty("isDayLightSavings")
	public Boolean getIsDayLightSavings() {
		return isDayLightSavings;
	}

	@JsonProperty("isDayLightSavings")
	public void setIsDayLightSavings(Boolean isDayLightSavings) {
		this.isDayLightSavings = isDayLightSavings;
	}

	@JsonProperty("isDeleted")
	public Boolean getIsDeleted() {
		return isDeleted;
	}

	@JsonProperty("isDeleted")
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@JsonProperty("isLockedOut")
	public Boolean getIsLockedOut() {
		return isLockedOut;
	}

	@JsonProperty("isLockedOut")
	public void setIsLockedOut(Boolean isLockedOut) {
		this.isLockedOut = isLockedOut;
	}

	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}

	@JsonIgnore
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonProperty("linkedPerson")
	public LinkedPerson getLinkedPerson() {
		return linkedPerson;
	}

	@JsonProperty("linkedPerson")
	public void setLinkedPerson(LinkedPerson linkedPerson) {
		this.linkedPerson = linkedPerson;
	}

	@JsonProperty("massMailOptOut")
	public Boolean getMassMailOptOut() {
		return massMailOptOut;
	}

	@JsonProperty("massMailOptOut")
	public void setMassMailOptOut(Boolean massMailOptOut) {
		this.massMailOptOut = massMailOptOut;
	}

	@JsonProperty("middleName")
	public String getMiddleName() {
		return middleName;
	}

	@JsonIgnore
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@JsonProperty("migrateGUID")
	public Object getMigrateGUID() {
		return migrateGUID;
	}

	@JsonIgnore
	public void setMigrateGUID(String migrateGUID) {
		this.migrateGUID = migrateGUID;
	}

	@JsonProperty("mobile")
	public String getMobile() {
		return mobile;
	}

	@JsonIgnore
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonIgnore
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("namePrefix")
	public String getNamePrefix() {
		return namePrefix;
	}

	@JsonIgnore
	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}

	@JsonProperty("nameSuffix")
	public String getNameSuffix() {
		return nameSuffix;
	}

	@JsonIgnore
	public void setNameSuffix(String nameSuffix) {
		this.nameSuffix = nameSuffix;
	}

	@JsonProperty("nickName")
	public String getNickName() {
		return nickName;
	}

	@JsonIgnore
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@JsonProperty("numEmployees")
	public Integer getNumEmployees() {
		return numEmployees;
	}

	@JsonProperty("numEmployees")
	public void setNumEmployees(Integer numEmployees) {
		this.numEmployees = numEmployees;
	}

	@JsonProperty("occupation")
	public String getOccupation() {
		return occupation;
	}

	@JsonIgnore
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@JsonProperty("office")
	public String getOffice() {
		return office;
	}

	@JsonIgnore
	public void setOffice(String office) {
		this.office = office;
	}

	@JsonProperty("owner")
	public CorporateUser getOwner() {
		return owner;
	}

	@JsonProperty("owner")
	public void setOwner(CorporateUser owner) {
		this.owner = owner;
	}

	@JsonProperty("pager")
	public String getPager() {
		return pager;
	}

	@JsonIgnore
	public void setPager(String pager) {
		this.pager = pager;
	}

	@JsonProperty("password")
	public String getPassword() {
		return password;
	}

	@JsonIgnore
	public void setPassword(String password) {
		this.password = password;
	}

	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	@JsonIgnore
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@JsonProperty("phone2")
	public String getPhone2() {
		return phone2;
	}

	@JsonIgnore
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	@JsonProperty("phone3")
	public String getPhone3() {
		return phone3;
	}

	@JsonIgnore
	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	@JsonProperty("preferredContact")
	public String getPreferredContact() {
		return preferredContact;
	}

	@JsonIgnore
	public void setPreferredContact(String preferredContact) {
		this.preferredContact = preferredContact;
	}

	@JsonProperty("referredByPerson")
	public LinkedPerson getReferredByPerson() {
		return referredByPerson;
	}

	@JsonProperty("referredByPerson")
	public void setReferredByPerson(LinkedPerson referredByPerson) {
		this.referredByPerson = referredByPerson;
	}

	@JsonProperty("reportToPerson")
	public LinkedPerson getReportToPerson() {
		return reportToPerson;
	}

	@JsonProperty("reportToPerson")
	public void setReportToPerson(LinkedPerson reportToPerson) {
		this.reportToPerson = reportToPerson;
	}

	@JsonProperty("secondaryAddress")
	public Address getSecondaryAddress() {
		return secondaryAddress;
	}

	@JsonProperty("secondaryAddress")
	public void setSecondaryAddress(Address secondaryAddress) {
		this.secondaryAddress = secondaryAddress;
	}

	@JsonProperty("secondaryOwners")
	public OneToMany<CorporateUser> getSecondaryOwners() {
		return secondaryOwners;
	}

	@JsonProperty("secondaryOwners")
	public void setSecondaryOwners(OneToMany<CorporateUser> secondaryOwners) {
		this.secondaryOwners = secondaryOwners;
	}

	@JsonProperty("skills")
	public OneToMany<Skill> getSkills() {
		return skills;
	}

	@JsonProperty("skills")
	public void setSkills(OneToMany<Skill> skills) {
		this.skills = skills;
	}

	@JsonProperty("smsOptIn")
	public Boolean getSmsOptIn() {
		return smsOptIn;
	}

	@JsonProperty("smsOptIn")
	public void setSmsOptIn(Boolean smsOptIn) {
		this.smsOptIn = smsOptIn;
	}

	@JsonProperty("source")
	public String getSource() {
		return source;
	}

	@JsonIgnore
	public void setSource(String source) {
		this.source = source;
	}

	@JsonProperty("specialties")
	public OneToMany<Specialty> getSpecialties() {
		return specialties;
	}

	@JsonProperty("specialties")
	public void setSpecialties(OneToMany<Specialty> specialties) {
		this.specialties = specialties;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonIgnore
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("tearsheets")
	public OneToManyLinkedId getTearsheets() {
		return tearsheets;
	}

	@JsonProperty("tearsheets")
	public void setTearsheets(OneToManyLinkedId tearsheets) {
		this.tearsheets = tearsheets;
	}

	@JsonProperty("timeZoneOffsetEST")
	public Integer getTimeZoneOffsetEST() {
		return timeZoneOffsetEST;
	}

	@JsonProperty("timeZoneOffsetEST")
	public void setTimeZoneOffsetEST(Integer timeZoneOffsetEST) {
		this.timeZoneOffsetEST = timeZoneOffsetEST;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonIgnore
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("username")
	public String getUsername() {
		return username;
	}

	@JsonIgnore
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
				+ ((businessSectors == null) ? 0 : businessSectors.hashCode());
		result = prime * result
				+ ((categories == null) ? 0 : categories.hashCode());
		result = prime * result
				+ ((category == null) ? 0 : category.hashCode());
		result = prime * result
				+ ((certifications == null) ? 0 : certifications.hashCode());
		result = prime * result
				+ ((clientContactID == null) ? 0 : clientContactID.hashCode());
		result = prime
				* result
				+ ((clientCorporation == null) ? 0 : clientCorporation
						.hashCode());
		result = prime * result
				+ ((comments == null) ? 0 : comments.hashCode());
		result = prime * result
				+ ((dateAdded == null) ? 0 : dateAdded.hashCode());
		result = prime * result
				+ ((dateLastComment == null) ? 0 : dateLastComment.hashCode());
		result = prime * result
				+ ((dateLastVisit == null) ? 0 : dateLastVisit.hashCode());
		result = prime * result
				+ ((deleteMe == null) ? 0 : deleteMe.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime
				* result
				+ ((desiredCategories == null) ? 0 : desiredCategories
						.hashCode());
		result = prime * result
				+ ((desiredSkills == null) ? 0 : desiredSkills.hashCode());
		result = prime
				* result
				+ ((desiredSpecialties == null) ? 0 : desiredSpecialties
						.hashCode());
		result = prime * result
				+ ((division == null) ? 0 : division.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((email2 == null) ? 0 : email2.hashCode());
		result = prime * result + ((email3 == null) ? 0 : email3.hashCode());
		result = prime * result
				+ ((externalID == null) ? 0 : externalID.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((fax2 == null) ? 0 : fax2.hashCode());
		result = prime * result + ((fax3 == null) ? 0 : fax3.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime
				* result
				+ ((isDayLightSavings == null) ? 0 : isDayLightSavings
						.hashCode());
		result = prime * result
				+ ((isDeleted == null) ? 0 : isDeleted.hashCode());
		result = prime * result
				+ ((isLockedOut == null) ? 0 : isLockedOut.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((linkedPerson == null) ? 0 : linkedPerson.hashCode());
		result = prime * result
				+ ((massMailOptOut == null) ? 0 : massMailOptOut.hashCode());
		result = prime * result
				+ ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result
				+ ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((namePrefix == null) ? 0 : namePrefix.hashCode());
		result = prime * result
				+ ((nameSuffix == null) ? 0 : nameSuffix.hashCode());
		result = prime * result
				+ ((nickName == null) ? 0 : nickName.hashCode());
		result = prime * result
				+ ((numEmployees == null) ? 0 : numEmployees.hashCode());
		result = prime * result
				+ ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result + ((office == null) ? 0 : office.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((pager == null) ? 0 : pager.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((phone2 == null) ? 0 : phone2.hashCode());
		result = prime * result + ((phone3 == null) ? 0 : phone3.hashCode());
		result = prime
				* result
				+ ((preferredContact == null) ? 0 : preferredContact.hashCode());
		result = prime
				* result
				+ ((referredByPerson == null) ? 0 : referredByPerson.hashCode());
		result = prime * result
				+ ((reportToPerson == null) ? 0 : reportToPerson.hashCode());
		result = prime
				* result
				+ ((secondaryAddress == null) ? 0 : secondaryAddress.hashCode());
		result = prime * result
				+ ((secondaryOwners == null) ? 0 : secondaryOwners.hashCode());
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
		result = prime * result
				+ ((smsOptIn == null) ? 0 : smsOptIn.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result
				+ ((specialties == null) ? 0 : specialties.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime
				* result
				+ ((timeZoneOffsetEST == null) ? 0 : timeZoneOffsetEST
						.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
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
		ClientContact other = (ClientContact) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (businessSectors == null) {
			if (other.businessSectors != null)
				return false;
		} else if (!businessSectors.equals(other.businessSectors))
			return false;
		if (categories == null) {
			if (other.categories != null)
				return false;
		} else if (!categories.equals(other.categories))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (certifications == null) {
			if (other.certifications != null)
				return false;
		} else if (!certifications.equals(other.certifications))
			return false;
		if (clientContactID == null) {
			if (other.clientContactID != null)
				return false;
		} else if (!clientContactID.equals(other.clientContactID))
			return false;
		if (clientCorporation == null) {
			if (other.clientCorporation != null)
				return false;
		} else if (!clientCorporation.equals(other.clientCorporation))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (dateAdded == null) {
			if (other.dateAdded != null)
				return false;
		} else if (!dateAdded.isEqual(other.dateAdded))
			return false;
		if (dateLastComment == null) {
			if (other.dateLastComment != null)
				return false;
		} else if (!dateLastComment.isEqual(other.dateLastComment))
			return false;
		if (dateLastVisit == null) {
			if (other.dateLastVisit != null)
				return false;
		} else if (!dateLastVisit.isEqual(other.dateLastVisit))
			return false;
		if (deleteMe == null) {
			if (other.deleteMe != null)
				return false;
		} else if (!deleteMe.equals(other.deleteMe))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (desiredCategories == null) {
			if (other.desiredCategories != null)
				return false;
		} else if (!desiredCategories.equals(other.desiredCategories))
			return false;
		if (desiredSkills == null) {
			if (other.desiredSkills != null)
				return false;
		} else if (!desiredSkills.equals(other.desiredSkills))
			return false;
		if (desiredSpecialties == null) {
			if (other.desiredSpecialties != null)
				return false;
		} else if (!desiredSpecialties.equals(other.desiredSpecialties))
			return false;
		if (division == null) {
			if (other.division != null)
				return false;
		} else if (!division.equals(other.division))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (email2 == null) {
			if (other.email2 != null)
				return false;
		} else if (!email2.equals(other.email2))
			return false;
		if (email3 == null) {
			if (other.email3 != null)
				return false;
		} else if (!email3.equals(other.email3))
			return false;
		if (externalID == null) {
			if (other.externalID != null)
				return false;
		} else if (!externalID.equals(other.externalID))
			return false;
		if (fax == null) {
			if (other.fax != null)
				return false;
		} else if (!fax.equals(other.fax))
			return false;
		if (fax2 == null) {
			if (other.fax2 != null)
				return false;
		} else if (!fax2.equals(other.fax2))
			return false;
		if (fax3 == null) {
			if (other.fax3 != null)
				return false;
		} else if (!fax3.equals(other.fax3))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isDayLightSavings == null) {
			if (other.isDayLightSavings != null)
				return false;
		} else if (!isDayLightSavings.equals(other.isDayLightSavings))
			return false;
		if (isDeleted == null) {
			if (other.isDeleted != null)
				return false;
		} else if (!isDeleted.equals(other.isDeleted))
			return false;
		if (isLockedOut == null) {
			if (other.isLockedOut != null)
				return false;
		} else if (!isLockedOut.equals(other.isLockedOut))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (linkedPerson == null) {
			if (other.linkedPerson != null)
				return false;
		} else if (!linkedPerson.equals(other.linkedPerson))
			return false;
		if (massMailOptOut == null) {
			if (other.massMailOptOut != null)
				return false;
		} else if (!massMailOptOut.equals(other.massMailOptOut))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (migrateGUID == null) {
			if (other.migrateGUID != null)
				return false;
		} else if (!migrateGUID.equals(other.migrateGUID))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (namePrefix == null) {
			if (other.namePrefix != null)
				return false;
		} else if (!namePrefix.equals(other.namePrefix))
			return false;
		if (nameSuffix == null) {
			if (other.nameSuffix != null)
				return false;
		} else if (!nameSuffix.equals(other.nameSuffix))
			return false;
		if (nickName == null) {
			if (other.nickName != null)
				return false;
		} else if (!nickName.equals(other.nickName))
			return false;
		if (numEmployees == null) {
			if (other.numEmployees != null)
				return false;
		} else if (!numEmployees.equals(other.numEmployees))
			return false;
		if (occupation == null) {
			if (other.occupation != null)
				return false;
		} else if (!occupation.equals(other.occupation))
			return false;
		if (office == null) {
			if (other.office != null)
				return false;
		} else if (!office.equals(other.office))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (pager == null) {
			if (other.pager != null)
				return false;
		} else if (!pager.equals(other.pager))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (phone2 == null) {
			if (other.phone2 != null)
				return false;
		} else if (!phone2.equals(other.phone2))
			return false;
		if (phone3 == null) {
			if (other.phone3 != null)
				return false;
		} else if (!phone3.equals(other.phone3))
			return false;
		if (preferredContact == null) {
			if (other.preferredContact != null)
				return false;
		} else if (!preferredContact.equals(other.preferredContact))
			return false;
		if (referredByPerson == null) {
			if (other.referredByPerson != null)
				return false;
		} else if (!referredByPerson.equals(other.referredByPerson))
			return false;
		if (reportToPerson == null) {
			if (other.reportToPerson != null)
				return false;
		} else if (!reportToPerson.equals(other.reportToPerson))
			return false;
		if (secondaryAddress == null) {
			if (other.secondaryAddress != null)
				return false;
		} else if (!secondaryAddress.equals(other.secondaryAddress))
			return false;
		if (secondaryOwners == null) {
			if (other.secondaryOwners != null)
				return false;
		} else if (!secondaryOwners.equals(other.secondaryOwners))
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		if (smsOptIn == null) {
			if (other.smsOptIn != null)
				return false;
		} else if (!smsOptIn.equals(other.smsOptIn))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (specialties == null) {
			if (other.specialties != null)
				return false;
		} else if (!specialties.equals(other.specialties))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (timeZoneOffsetEST == null) {
			if (other.timeZoneOffsetEST != null)
				return false;
		} else if (!timeZoneOffsetEST.equals(other.timeZoneOffsetEST))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClientContact {\nid=");
		builder.append(id);
		builder.append(", \naddress=");
		builder.append(address);
		builder.append(", \nbusinessSectors=");
		builder.append(businessSectors);
		builder.append(", \ncategories=");
		builder.append(categories);
		builder.append(", \ncategory=");
		builder.append(category);
		builder.append(", \ncertifications=");
		builder.append(certifications);
		builder.append(", \nclientContactID=");
		builder.append(clientContactID);
		builder.append(", \nclientCorporation=");
		builder.append(clientCorporation);
		builder.append(", \ncomments=");
		builder.append(comments);
		builder.append(", \ndateAdded=");
		builder.append(dateAdded);
		builder.append(", \ndateLastComment=");
		builder.append(dateLastComment);
		builder.append(", \ndateLastVisit=");
		builder.append(dateLastVisit);
		builder.append(", \ndeleteMe=");
		builder.append(deleteMe);
		builder.append(", \ndescription=");
		builder.append(description);
		builder.append(", \ndesiredCategories=");
		builder.append(desiredCategories);
		builder.append(", \ndesiredSkills=");
		builder.append(desiredSkills);
		builder.append(", \ndesiredSpecialties=");
		builder.append(desiredSpecialties);
		builder.append(", \ndivision=");
		builder.append(division);
		builder.append(", \nemail=");
		builder.append(email);
		builder.append(", \nemail2=");
		builder.append(email2);
		builder.append(", \nemail3=");
		builder.append(email3);
		builder.append(", \nexternalID=");
		builder.append(externalID);
		builder.append(", \nfax=");
		builder.append(fax);
		builder.append(", \nfax2=");
		builder.append(fax2);
		builder.append(", \nfax3=");
		builder.append(fax3);
		builder.append(", \nfirstName=");
		builder.append(firstName);
		builder.append(", \nisDayLightSavings=");
		builder.append(isDayLightSavings);
		builder.append(", \nisDeleted=");
		builder.append(isDeleted);
		builder.append(", \nisLockedOut=");
		builder.append(isLockedOut);
		builder.append(", \nlastName=");
		builder.append(lastName);
		builder.append(", \nlinkedPerson=");
		builder.append(linkedPerson);
		builder.append(", \nmassMailOptOut=");
		builder.append(massMailOptOut);
		builder.append(", \nmiddleName=");
		builder.append(middleName);
		builder.append(", \nmigrateGUID=");
		builder.append(migrateGUID);
		builder.append(", \nmobile=");
		builder.append(mobile);
		builder.append(", \nname=");
		builder.append(name);
		builder.append(", \nnamePrefix=");
		builder.append(namePrefix);
		builder.append(", \nnameSuffix=");
		builder.append(nameSuffix);
		builder.append(", \nnickName=");
		builder.append(nickName);
		builder.append(", \nnumEmployees=");
		builder.append(numEmployees);
		builder.append(", \noccupation=");
		builder.append(occupation);
		builder.append(", \noffice=");
		builder.append(office);
		builder.append(", \nowner=");
		builder.append(owner);
		builder.append(", \npager=");
		builder.append(pager);
		builder.append(", \npassword=");
		builder.append(password);
		builder.append(", \nphone=");
		builder.append(phone);
		builder.append(", \nphone2=");
		builder.append(phone2);
		builder.append(", \nphone3=");
		builder.append(phone3);
		builder.append(", \npreferredContact=");
		builder.append(preferredContact);
		builder.append(", \nreferredByPerson=");
		builder.append(referredByPerson);
		builder.append(", \nreportToPerson=");
		builder.append(reportToPerson);
		builder.append(", \nsecondaryAddress=");
		builder.append(secondaryAddress);
		builder.append(", \nsecondaryOwners=");
		builder.append(secondaryOwners);
		builder.append(", \nskills=");
		builder.append(skills);
		builder.append(", \nsmsOptIn=");
		builder.append(smsOptIn);
		builder.append(", \nsource=");
		builder.append(source);
		builder.append(", \nspecialties=");
		builder.append(specialties);
		builder.append(", \nstatus=");
		builder.append(status);
		builder.append(", \ntimeZoneOffsetEST=");
		builder.append(timeZoneOffsetEST);
		builder.append(", \ntype=");
		builder.append(type);
		builder.append(", \nusername=");
		builder.append(username);
		builder.append("\n}");
		return builder.toString();
	}

}
