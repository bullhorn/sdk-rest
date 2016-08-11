package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.EditHistoryEntity;
import com.bullhornsdk.data.model.entity.core.type.FileEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
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
import org.hibernate.validator.constraints.Email;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "address", "assignedTo", "businessSectors", "campaignSource", "candidates", "category", "categories", "clientContacts", "clientCorporation", "comments", "companyName",
		"companyURL", "conversionSource", "customDate1", "customDate2", "customDate3", "customFloat1", "customFloat2", "customFloat3", "customInt1", "customInt2", "customInt3", "customText1",
		"customText2", "customText3", "customText4", "customText5", "customText6", "customText7", "customText8", "customText9", "customText10", "customText11", "customText12", "customText13",
		"customText14", "customText15", "customText16", "customText17", "customText18", "customText19", "customText20", "customTextBlock1", "customTextBlock2", "customTextBlock3", "customTextBlock4",
		"customTextBlock5", "dateAdded", "dateLastComment", "dateLastModified", "dateLastVisited", "description", "distributionLists", "division", "email", "email2", "email3", "fax", "fax2", "fax3",
		"firstName", "history", "isDayLightSavingsTime", "isDeleted", "lastName", "leadSource", "massMailOptOut", "middleName", "mobile", "name", "namePrefix", "nameSuffix", "nickName", "notes",
		"numEmployees", "occupation", "owner", "ownerCorporation", "pager", "phone", "phone2", "phone3", "preferredContact", "primarySkills", "priority", "referredByPerson", "reportToPerson", "role",
		"salary", "salaryLow", "secondaryAddress", "secondarySkills", "skillSet", "smsOptIn", "specialties", "status", "tearsheets", "timeZoneOffsetEST", "type", "willRelocate" })
public class Lead extends CustomFieldsB implements SearchEntity, QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, FileEntity, AssociationEntity, DateLastModifiedEntity, EditHistoryEntity {

	private Integer id;

	private Address address;

	private OneToMany<CorporateUser> assignedTo;

	private OneToMany<BusinessSector> businessSectors;

	@JsonIgnore
	private String campaignSource;

	private OneToMany<Candidate> candidates;

	private Category category;

	private OneToMany<Category> categories;

	private OneToMany<ClientContact> clientContacts;

	private ClientCorporation clientCorporation;

	@JsonIgnore
	private String comments;

	@JsonIgnore
	@Size(max = 100)
	private String companyName;

	@JsonIgnore
	@Size(max = 100)
	private String companyURL;

	@JsonIgnore
	@Size(max = 200)
	private String conversionSource;

	private DateTime dateAdded;

	private DateTime dateLastComment;

	private DateTime dateLastModified;

	private DateTime dateLastVisited;

	@JsonIgnore
	private String description;

	@JsonIgnore
	private OneToMany<Integer> distributionLists;

	@JsonIgnore
	@Size(max = 40)
	private String division;

	@JsonIgnore
	private String educationDegree;

	@JsonIgnore
	@Email
	@Size(max = 100)
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

	private OneToMany<Integer> history;

	private Boolean isDayLightSavingsTime;

	private Boolean isDeleted;

	@JsonIgnore
	@Size(max = 50)
	private String lastName;

	@JsonIgnore
	@Size(max = 15)
	private String leadSource;

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

	private OneToMany<Note> notes;

	private Integer numEmployees;

	@JsonIgnore
	@Size(max = 50)
	private String occupation;

	private CorporateUser owner;

	private ClientCorporation ownerCorporation;

	@JsonIgnore
	@Size(max = 20)
	private String pager;

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

	private OneToMany<Skill> primarySkills;

	@JsonIgnore
	@Size(max = 15)
	private String priority;

	private Person referredByPerson;

	private Person reportToPerson;

	@JsonIgnore
	private String role;

	private BigDecimal salary;

	private BigDecimal salaryLow;

	private Address secondaryAddress;

	private OneToMany<Skill> secondarySkills;

	@JsonIgnore
	private String skillSet;

	private Boolean smsOptIn;

	@JsonIgnore
	private String source;

	private OneToMany<Specialty> specialties;

	@JsonIgnore
	@Size(max = 100)
	private String status;

	private OneToMany<Integer> tearsheets;

	private Integer timeZoneOffsetEST;

	@JsonIgnore
	@Size(max = 30)
	private String type;

	// TODO:: ADD userIntegrations MAYBE?

	private Boolean willRelocate;

	public Lead() {
		super();
	}

	public Lead(Integer id) {
		super();
		this.id = id;
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

	@JsonProperty("dateLastModified")
	public DateTime getDateLastModified() {
		return dateLastModified;
	}

	@JsonProperty("dateLastModified")
	public void setDateLastModified(DateTime dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

	@JsonProperty("address")
	public Address getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(Address address) {
		this.address = address;
	}

	@JsonIgnore
	public OneToMany<BusinessSector> getBusinessSectors() {
		return businessSectors;
	}

	@JsonProperty("businessSectors")
	public void setBusinessSectors(OneToMany<BusinessSector> businessSectors) {
		this.businessSectors = businessSectors;
	}

	@JsonIgnore
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

	@JsonProperty("comments")
	public String getComments() {
		return comments;
	}

	@JsonProperty("comments")
	public void setComments(String comments) {
		this.comments = comments;
	}

	@JsonProperty("companyName")
	public String getCompanyName() {
		return companyName;
	}

	@JsonProperty("companyName")
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@JsonProperty("companyURL")
	public String getCompanyURL() {
		return companyURL;
	}

	@JsonProperty("companyURL")
	public void setCompanyURL(String companyURL) {
		this.companyURL = companyURL;
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

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("educationDegree")
	public String getEducationDegree() {
		return educationDegree;
	}

	@JsonIgnore
	public void setEducationDegree(String educationDegree) {
		this.educationDegree = educationDegree;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("email2")
	public String getEmail2() {
		return email2;
	}

	@JsonProperty("email2")
	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	@JsonProperty("email3")
	public String getEmail3() {
		return email3;
	}

	@JsonProperty("email3")
	public void setEmail3(String email3) {
		this.email3 = email3;
	}

	@JsonProperty("fax")
	public String getFax() {
		return fax;
	}

	@JsonProperty("fax")
	public void setFax(String fax) {
		this.fax = fax;
	}

	@JsonProperty("fax2")
	public String getFax2() {
		return fax2;
	}

	@JsonProperty("fax2")
	public void setFax2(String fax2) {
		this.fax2 = fax2;
	}

	@JsonProperty("fax3")
	public String getFax3() {
		return fax3;
	}

	@JsonProperty("fax3")
	public void setFax3(String fax3) {
		this.fax3 = fax3;
	}

	@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}

	@JsonProperty("firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty("isDeleted")
	public Boolean getIsDeleted() {
		return isDeleted;
	}

	@JsonProperty("isDeleted")
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}

	@JsonProperty("lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	@JsonProperty("middleName")
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@JsonProperty("migrateGUID")
	public Object getMigrateGUID() {
		return migrateGUID;
	}

	@JsonProperty("migrateGUID")
	public void setMigrateGUID(Object migrateGUID) {
		this.migrateGUID = migrateGUID;
	}

	@JsonProperty("mobile")
	public String getMobile() {
		return mobile;
	}

	@JsonProperty("mobile")
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
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

	@JsonProperty("occupation")
	public String getOccupation() {
		return occupation;
	}

	@JsonIgnore
	public void setOccupation(String occupation) {
		this.occupation = occupation;
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

	@JsonProperty("pager")
	public void setPager(String pager) {
		this.pager = pager;
	}

	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	@JsonProperty("phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@JsonProperty("phone2")
	public String getPhone2() {
		return phone2;
	}

	@JsonProperty("phone2")
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	@JsonProperty("phone3")
	public String getPhone3() {
		return phone3;
	}

	@JsonProperty("phone3")
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

	@JsonIgnore
	public OneToMany<Skill> getPrimarySkills() {
		return primarySkills;
	}

	@JsonProperty("primarySkills")
	public void setPrimarySkills(OneToMany<Skill> primarySkills) {
		this.primarySkills = primarySkills;
	}

	@JsonProperty("referredByPerson")
	public Person getReferredByPerson() {
		return referredByPerson;
	}

	@JsonProperty("referredByPerson")
	public void setReferredByPerson(Person referredByPerson) {
		this.referredByPerson = referredByPerson;
	}

	@JsonProperty("salary")
	public BigDecimal getSalary() {
		return salary;
	}

	@JsonProperty("salary")
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@JsonProperty("salaryLow")
	public BigDecimal getSalaryLow() {
		return salaryLow;
	}

	@JsonProperty("salaryLow")
	public void setSalaryLow(BigDecimal salaryLow) {
		this.salaryLow = salaryLow;
	}

	@JsonProperty("secondaryAddress")
	public Address getSecondaryAddress() {
		return secondaryAddress;
	}

	@JsonProperty("secondaryAddress")
	public void setSecondaryAddress(Address secondaryAddress) {
		this.secondaryAddress = secondaryAddress;
	}

	@JsonIgnore
	public OneToMany<Skill> getSecondarySkills() {
		return secondarySkills;
	}

	@JsonProperty("secondarySkills")
	public void setSecondarySkills(OneToMany<Skill> secondarySkills) {
		this.secondarySkills = secondarySkills;
	}

	@JsonProperty("skillSet")
	public String getSkillSet() {
		return skillSet;
	}

	@JsonIgnore
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
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

	@JsonIgnore
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

	@JsonProperty("willRelocate")
	public Boolean getWillRelocate() {
		return willRelocate;
	}

	@JsonProperty("willRelocate")
	public void setWillRelocate(Boolean willRelocate) {
		this.willRelocate = willRelocate;
	}

	@JsonProperty("assignedTo")
	public OneToMany<CorporateUser> getAssignedTo() {
		return assignedTo;
	}

	@JsonProperty("assignedTo")
	public void setAssignedTo(OneToMany<CorporateUser> assignedTo) {
		this.assignedTo = assignedTo;
	}

	@JsonProperty("campaignSource")
	public String getCampaignSource() {
		return campaignSource;
	}

	@JsonIgnore
	public void setCampaignSource(String campaignSource) {
		this.campaignSource = campaignSource;
	}

	@JsonProperty("candidates")
	public OneToMany<Candidate> getCandidates() {
		return candidates;
	}

	@JsonProperty("candidates")
	public void setCandidates(OneToMany<Candidate> candidates) {
		this.candidates = candidates;
	}

	@JsonProperty("clientContacts")
	public OneToMany<ClientContact> getClientContacts() {
		return clientContacts;
	}

	@JsonProperty("clientContacts")
	public void setClientContacts(OneToMany<ClientContact> clientContacts) {
		this.clientContacts = clientContacts;
	}

	@JsonProperty("clientCorporation")
	public ClientCorporation getClientCorporation() {
		return clientCorporation;
	}

	@JsonProperty("clientCorporation")
	public void setClientCorporation(ClientCorporation clientCorporation) {
		this.clientCorporation = clientCorporation;
	}

	@JsonProperty("conversionSource")
	public String getConversionSource() {
		return conversionSource;
	}

	@JsonProperty("conversionSource")
	public void setConversionSource(String conversionSource) {
		this.conversionSource = conversionSource;
	}

	@JsonProperty("dateLastVisited")
	public DateTime getDateLastVisited() {
		return dateLastVisited;
	}

	@JsonProperty("dateLastVisited")
	public void setDateLastVisited(DateTime dateLastVisited) {
		this.dateLastVisited = dateLastVisited;
	}

	@JsonProperty("distributionLists")
	public OneToMany<Integer> getDistributionLists() {
		return distributionLists;
	}

	@JsonProperty("distributionLists")
	public void setDistributionLists(OneToMany<Integer> distributionLists) {
		this.distributionLists = distributionLists;
	}

	@JsonProperty("division")
	public String getDivision() {
		return division;
	}

	@JsonProperty("division")
	public void setDivision(String division) {
		this.division = division;
	}

	@JsonProperty("history")
	public OneToMany<Integer> getHistory() {
		return history;
	}

	@JsonProperty("history")
	public void setHistory(OneToMany<Integer> history) {
		this.history = history;
	}

	@JsonProperty("isDayLightSavingsTime")
	public Boolean getIsDayLightSavingsTime() {
		return isDayLightSavingsTime;
	}

	@JsonProperty("isDayLightSavingsTime")
	public void setIsDayLightSavingsTime(Boolean isDayLightSavingsTime) {
		this.isDayLightSavingsTime = isDayLightSavingsTime;
	}

	@JsonProperty("leadSource")
	public String getLeadSource() {
		return leadSource;
	}

	@JsonIgnore
	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}

	@JsonProperty("notes")
	public OneToMany<Note> getNotes() {
		return notes;
	}

	@JsonProperty("notes")
	public void setNotes(OneToMany<Note> notes) {
		this.notes = notes;
	}

	@JsonProperty("numEmployees")
	public Integer getNumEmployees() {
		return numEmployees;
	}

	@JsonProperty("numEmployees")
	public void setNumEmployees(Integer numEmployees) {
		this.numEmployees = numEmployees;
	}

	@JsonProperty("ownerCorporation")
	public ClientCorporation getOwnerCorporation() {
		return ownerCorporation;
	}

	@JsonProperty("ownerCorporation")
	public void setOwnerCorporation(ClientCorporation ownerCorporation) {
		this.ownerCorporation = ownerCorporation;
	}

	@JsonProperty("priority")
	public String getPriority() {
		return priority;
	}

	@JsonProperty("priority")
	public void setPriority(String priority) {
		this.priority = priority;
	}

	@JsonProperty("reportToPerson")
	public Person getReportToPerson() {
		return reportToPerson;
	}

	@JsonProperty("reportToPerson")
	public void setReportToPerson(Person reportToPerson) {
		this.reportToPerson = reportToPerson;
	}

	@JsonProperty("role")
	public String getRole() {
		return role;
	}

	@JsonIgnore
	public void setRole(String role) {
		this.role = role;
	}

	@JsonProperty("tearsheets")
	public OneToMany<Integer> getTearsheets() {
		return tearsheets;
	}

	@JsonProperty("tearsheets")
	public void setTearsheets(OneToMany<Integer> tearsheets) {
		this.tearsheets = tearsheets;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((assignedTo == null) ? 0 : assignedTo.hashCode());
		result = prime * result + ((businessSectors == null) ? 0 : businessSectors.hashCode());
		result = prime * result + ((campaignSource == null) ? 0 : campaignSource.hashCode());
		result = prime * result + ((candidates == null) ? 0 : candidates.hashCode());
		result = prime * result + ((categories == null) ? 0 : categories.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((clientContacts == null) ? 0 : clientContacts.hashCode());
		result = prime * result + ((clientCorporation == null) ? 0 : clientCorporation.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((companyURL == null) ? 0 : companyURL.hashCode());
		result = prime * result + ((conversionSource == null) ? 0 : conversionSource.hashCode());
		result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
		result = prime * result + ((dateLastComment == null) ? 0 : dateLastComment.hashCode());
		result = prime * result + ((dateLastModified == null) ? 0 : dateLastModified.hashCode());
		result = prime * result + ((dateLastVisited == null) ? 0 : dateLastVisited.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((distributionLists == null) ? 0 : distributionLists.hashCode());
		result = prime * result + ((division == null) ? 0 : division.hashCode());
		result = prime * result + ((educationDegree == null) ? 0 : educationDegree.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((email2 == null) ? 0 : email2.hashCode());
		result = prime * result + ((email3 == null) ? 0 : email3.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((fax2 == null) ? 0 : fax2.hashCode());
		result = prime * result + ((fax3 == null) ? 0 : fax3.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((history == null) ? 0 : history.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isDayLightSavingsTime == null) ? 0 : isDayLightSavingsTime.hashCode());
		result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((leadSource == null) ? 0 : leadSource.hashCode());
		result = prime * result + ((massMailOptOut == null) ? 0 : massMailOptOut.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((namePrefix == null) ? 0 : namePrefix.hashCode());
		result = prime * result + ((nameSuffix == null) ? 0 : nameSuffix.hashCode());
		result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		result = prime * result + ((numEmployees == null) ? 0 : numEmployees.hashCode());
		result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((ownerCorporation == null) ? 0 : ownerCorporation.hashCode());
		result = prime * result + ((pager == null) ? 0 : pager.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((phone2 == null) ? 0 : phone2.hashCode());
		result = prime * result + ((phone3 == null) ? 0 : phone3.hashCode());
		result = prime * result + ((preferredContact == null) ? 0 : preferredContact.hashCode());
		result = prime * result + ((primarySkills == null) ? 0 : primarySkills.hashCode());
		result = prime * result + ((priority == null) ? 0 : priority.hashCode());
		result = prime * result + ((referredByPerson == null) ? 0 : referredByPerson.hashCode());
		result = prime * result + ((reportToPerson == null) ? 0 : reportToPerson.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result + ((salaryLow == null) ? 0 : salaryLow.hashCode());
		result = prime * result + ((secondaryAddress == null) ? 0 : secondaryAddress.hashCode());
		result = prime * result + ((secondarySkills == null) ? 0 : secondarySkills.hashCode());
		result = prime * result + ((skillSet == null) ? 0 : skillSet.hashCode());
		result = prime * result + ((smsOptIn == null) ? 0 : smsOptIn.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((specialties == null) ? 0 : specialties.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((tearsheets == null) ? 0 : tearsheets.hashCode());
		result = prime * result + ((timeZoneOffsetEST == null) ? 0 : timeZoneOffsetEST.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((willRelocate == null) ? 0 : willRelocate.hashCode());
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
		Lead other = (Lead) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (assignedTo == null) {
			if (other.assignedTo != null)
				return false;
		} else if (!assignedTo.equals(other.assignedTo))
			return false;
		if (businessSectors == null) {
			if (other.businessSectors != null)
				return false;
		} else if (!businessSectors.equals(other.businessSectors))
			return false;
		if (campaignSource == null) {
			if (other.campaignSource != null)
				return false;
		} else if (!campaignSource.equals(other.campaignSource))
			return false;
		if (candidates == null) {
			if (other.candidates != null)
				return false;
		} else if (!candidates.equals(other.candidates))
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
		if (clientContacts == null) {
			if (other.clientContacts != null)
				return false;
		} else if (!clientContacts.equals(other.clientContacts))
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
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (companyURL == null) {
			if (other.companyURL != null)
				return false;
		} else if (!companyURL.equals(other.companyURL))
			return false;
		if (conversionSource == null) {
			if (other.conversionSource != null)
				return false;
		} else if (!conversionSource.equals(other.conversionSource))
			return false;
		if (dateAdded == null) {
			if (other.dateAdded != null)
				return false;
		} else if (!dateAdded.equals(other.dateAdded))
			return false;
		if (dateLastComment == null) {
			if (other.dateLastComment != null)
				return false;
		} else if (!dateLastComment.equals(other.dateLastComment))
			return false;
		if (dateLastModified == null) {
			if (other.dateLastModified != null)
				return false;
		} else if (!dateLastModified.equals(other.dateLastModified))
			return false;
		if (dateLastVisited == null) {
			if (other.dateLastVisited != null)
				return false;
		} else if (!dateLastVisited.equals(other.dateLastVisited))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (distributionLists == null) {
			if (other.distributionLists != null)
				return false;
		} else if (!distributionLists.equals(other.distributionLists))
			return false;
		if (division == null) {
			if (other.division != null)
				return false;
		} else if (!division.equals(other.division))
			return false;
		if (educationDegree == null) {
			if (other.educationDegree != null)
				return false;
		} else if (!educationDegree.equals(other.educationDegree))
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
		if (history == null) {
			if (other.history != null)
				return false;
		} else if (!history.equals(other.history))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isDayLightSavingsTime == null) {
			if (other.isDayLightSavingsTime != null)
				return false;
		} else if (!isDayLightSavingsTime.equals(other.isDayLightSavingsTime))
			return false;
		if (isDeleted == null) {
			if (other.isDeleted != null)
				return false;
		} else if (!isDeleted.equals(other.isDeleted))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (leadSource == null) {
			if (other.leadSource != null)
				return false;
		} else if (!leadSource.equals(other.leadSource))
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
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
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
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (ownerCorporation == null) {
			if (other.ownerCorporation != null)
				return false;
		} else if (!ownerCorporation.equals(other.ownerCorporation))
			return false;
		if (pager == null) {
			if (other.pager != null)
				return false;
		} else if (!pager.equals(other.pager))
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
		if (primarySkills == null) {
			if (other.primarySkills != null)
				return false;
		} else if (!primarySkills.equals(other.primarySkills))
			return false;
		if (priority == null) {
			if (other.priority != null)
				return false;
		} else if (!priority.equals(other.priority))
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
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		if (salaryLow == null) {
			if (other.salaryLow != null)
				return false;
		} else if (!salaryLow.equals(other.salaryLow))
			return false;
		if (secondaryAddress == null) {
			if (other.secondaryAddress != null)
				return false;
		} else if (!secondaryAddress.equals(other.secondaryAddress))
			return false;
		if (secondarySkills == null) {
			if (other.secondarySkills != null)
				return false;
		} else if (!secondarySkills.equals(other.secondarySkills))
			return false;
		if (skillSet == null) {
			if (other.skillSet != null)
				return false;
		} else if (!skillSet.equals(other.skillSet))
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
		if (tearsheets == null) {
			if (other.tearsheets != null)
				return false;
		} else if (!tearsheets.equals(other.tearsheets))
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
		if (willRelocate == null) {
			if (other.willRelocate != null)
				return false;
		} else if (!willRelocate.equals(other.willRelocate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lead [id=");
		builder.append(id);
		builder.append(", address=");
		builder.append(address);
		builder.append(", assignedTo=");
		builder.append(assignedTo);
		builder.append(", businessSectors=");
		builder.append(businessSectors);
		builder.append(", campaignSource=");
		builder.append(campaignSource);
		builder.append(", candidates=");
		builder.append(candidates);
		builder.append(", category=");
		builder.append(category);
		builder.append(", categories=");
		builder.append(categories);
		builder.append(", clientContacts=");
		builder.append(clientContacts);
		builder.append(", clientCorporation=");
		builder.append(clientCorporation);
		builder.append(", comments=");
		builder.append(comments);
		builder.append(", companyName=");
		builder.append(companyName);
		builder.append(", companyURL=");
		builder.append(companyURL);
		builder.append(", conversionSource=");
		builder.append(conversionSource);
		builder.append(", dateAdded=");
		builder.append(dateAdded);
		builder.append(", dateLastComment=");
		builder.append(dateLastComment);
		builder.append(", dateLastModified=");
		builder.append(dateLastModified);
		builder.append(", dateLastVisited=");
		builder.append(dateLastVisited);
		builder.append(", description=");
		builder.append(description);
		builder.append(", distributionLists=");
		builder.append(distributionLists);
		builder.append(", division=");
		builder.append(division);
		builder.append(", educationDegree=");
		builder.append(educationDegree);
		builder.append(", email=");
		builder.append(email);
		builder.append(", email2=");
		builder.append(email2);
		builder.append(", email3=");
		builder.append(email3);
		builder.append(", fax=");
		builder.append(fax);
		builder.append(", fax2=");
		builder.append(fax2);
		builder.append(", fax3=");
		builder.append(fax3);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", history=");
		builder.append(history);
		builder.append(", isDayLightSavingsTime=");
		builder.append(isDayLightSavingsTime);
		builder.append(", isDeleted=");
		builder.append(isDeleted);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", leadSource=");
		builder.append(leadSource);
		builder.append(", massMailOptOut=");
		builder.append(massMailOptOut);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", migrateGUID=");
		builder.append(migrateGUID);
		builder.append(", mobile=");
		builder.append(mobile);
		builder.append(", name=");
		builder.append(name);
		builder.append(", namePrefix=");
		builder.append(namePrefix);
		builder.append(", nameSuffix=");
		builder.append(nameSuffix);
		builder.append(", nickName=");
		builder.append(nickName);
		builder.append(", notes=");
		builder.append(notes);
		builder.append(", numEmployees=");
		builder.append(numEmployees);
		builder.append(", occupation=");
		builder.append(occupation);
		builder.append(", owner=");
		builder.append(owner);
		builder.append(", ownerCorporation=");
		builder.append(ownerCorporation);
		builder.append(", pager=");
		builder.append(pager);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", phone2=");
		builder.append(phone2);
		builder.append(", phone3=");
		builder.append(phone3);
		builder.append(", preferredContact=");
		builder.append(preferredContact);
		builder.append(", primarySkills=");
		builder.append(primarySkills);
		builder.append(", priority=");
		builder.append(priority);
		builder.append(", referredByPerson=");
		builder.append(referredByPerson);
		builder.append(", reportToPerson=");
		builder.append(reportToPerson);
		builder.append(", role=");
		builder.append(role);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", salaryLow=");
		builder.append(salaryLow);
		builder.append(", secondaryAddress=");
		builder.append(secondaryAddress);
		builder.append(", secondarySkills=");
		builder.append(secondarySkills);
		builder.append(", skillSet=");
		builder.append(skillSet);
		builder.append(", smsOptIn=");
		builder.append(smsOptIn);
		builder.append(", source=");
		builder.append(source);
		builder.append(", specialties=");
		builder.append(specialties);
		builder.append(", status=");
		builder.append(status);
		builder.append(", tearsheets=");
		builder.append(tearsheets);
		builder.append(", timeZoneOffsetEST=");
		builder.append(timeZoneOffsetEST);
		builder.append(", type=");
		builder.append(type);
		builder.append(", willRelocate=");
		builder.append(willRelocate);
		builder.append("]");
		return builder.toString();
	}

	public Lead instantiateForInsert() {
		Lead entity = new Lead();
		entity.setEmail("leadTest@email.com");
		entity.setIsDeleted(Boolean.FALSE);
		entity.setStatus("New Lead");
		entity.setType("Unknown");
		entity.setClientCorporation(new ClientCorporation(1));
		return entity;
	}

}
