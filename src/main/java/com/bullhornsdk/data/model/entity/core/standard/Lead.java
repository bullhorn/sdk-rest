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
import com.bullhornsdk.data.util.ReadOnly;
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
@JsonPropertyOrder({ "id", "address", "assignedTo", "branch", "businessSectors", "campaignSource", "candidates", "category", "categories", "clientContacts", "clientCorporation", "comments", "companyName",
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

	private Branch branch;

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
	@Size(max = 100)
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

    @ReadOnly
	@Override
	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
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

	@JsonProperty("address")
	public Address getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(Address address) {
		this.address = address;
	}

    @JsonProperty("branch")
    public Branch getBranch() {
        return branch;
    }

    @JsonProperty("branch")
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @JsonIgnore
	public OneToMany<BusinessSector> getBusinessSectors() {
		return businessSectors;
	}

    @ReadOnly
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

    @ReadOnly
	@JsonProperty("dateAdded")
	public void setDateAdded(DateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	@JsonProperty("dateLastComment")
	public DateTime getDateLastComment() {
		return dateLastComment;
	}

    @ReadOnly
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

    @ReadOnly
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

    @ReadOnly
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

    @ReadOnly
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

    @ReadOnly
	@JsonProperty("tearsheets")
	public void setTearsheets(OneToMany<Integer> tearsheets) {
		this.tearsheets = tearsheets;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Lead lead = (Lead) o;

        if (id != null ? !id.equals(lead.id) : lead.id != null) return false;
        if (address != null ? !address.equals(lead.address) : lead.address != null) return false;
        if (assignedTo != null ? !assignedTo.equals(lead.assignedTo) : lead.assignedTo != null) return false;
        if (branch != null ? !branch.equals(lead.branch) : lead.branch != null) return false;
        if (businessSectors != null ? !businessSectors.equals(lead.businessSectors) : lead.businessSectors != null)
            return false;
        if (campaignSource != null ? !campaignSource.equals(lead.campaignSource) : lead.campaignSource != null)
            return false;
        if (candidates != null ? !candidates.equals(lead.candidates) : lead.candidates != null) return false;
        if (category != null ? !category.equals(lead.category) : lead.category != null) return false;
        if (categories != null ? !categories.equals(lead.categories) : lead.categories != null) return false;
        if (clientContacts != null ? !clientContacts.equals(lead.clientContacts) : lead.clientContacts != null)
            return false;
        if (clientCorporation != null ? !clientCorporation.equals(lead.clientCorporation) : lead.clientCorporation != null)
            return false;
        if (comments != null ? !comments.equals(lead.comments) : lead.comments != null) return false;
        if (companyName != null ? !companyName.equals(lead.companyName) : lead.companyName != null) return false;
        if (companyURL != null ? !companyURL.equals(lead.companyURL) : lead.companyURL != null) return false;
        if (conversionSource != null ? !conversionSource.equals(lead.conversionSource) : lead.conversionSource != null)
            return false;
        if (dateAdded != null ? !dateAdded.equals(lead.dateAdded) : lead.dateAdded != null) return false;
        if (dateLastComment != null ? !dateLastComment.equals(lead.dateLastComment) : lead.dateLastComment != null)
            return false;
        if (dateLastModified != null ? !dateLastModified.equals(lead.dateLastModified) : lead.dateLastModified != null)
            return false;
        if (dateLastVisited != null ? !dateLastVisited.equals(lead.dateLastVisited) : lead.dateLastVisited != null)
            return false;
        if (description != null ? !description.equals(lead.description) : lead.description != null) return false;
        if (distributionLists != null ? !distributionLists.equals(lead.distributionLists) : lead.distributionLists != null)
            return false;
        if (division != null ? !division.equals(lead.division) : lead.division != null) return false;
        if (educationDegree != null ? !educationDegree.equals(lead.educationDegree) : lead.educationDegree != null)
            return false;
        if (email != null ? !email.equals(lead.email) : lead.email != null) return false;
        if (email2 != null ? !email2.equals(lead.email2) : lead.email2 != null) return false;
        if (email3 != null ? !email3.equals(lead.email3) : lead.email3 != null) return false;
        if (fax != null ? !fax.equals(lead.fax) : lead.fax != null) return false;
        if (fax2 != null ? !fax2.equals(lead.fax2) : lead.fax2 != null) return false;
        if (fax3 != null ? !fax3.equals(lead.fax3) : lead.fax3 != null) return false;
        if (firstName != null ? !firstName.equals(lead.firstName) : lead.firstName != null) return false;
        if (history != null ? !history.equals(lead.history) : lead.history != null) return false;
        if (isDayLightSavingsTime != null ? !isDayLightSavingsTime.equals(lead.isDayLightSavingsTime) : lead.isDayLightSavingsTime != null)
            return false;
        if (isDeleted != null ? !isDeleted.equals(lead.isDeleted) : lead.isDeleted != null) return false;
        if (lastName != null ? !lastName.equals(lead.lastName) : lead.lastName != null) return false;
        if (leadSource != null ? !leadSource.equals(lead.leadSource) : lead.leadSource != null) return false;
        if (massMailOptOut != null ? !massMailOptOut.equals(lead.massMailOptOut) : lead.massMailOptOut != null)
            return false;
        if (middleName != null ? !middleName.equals(lead.middleName) : lead.middleName != null) return false;
        if (migrateGUID != null ? !migrateGUID.equals(lead.migrateGUID) : lead.migrateGUID != null) return false;
        if (mobile != null ? !mobile.equals(lead.mobile) : lead.mobile != null) return false;
        if (name != null ? !name.equals(lead.name) : lead.name != null) return false;
        if (namePrefix != null ? !namePrefix.equals(lead.namePrefix) : lead.namePrefix != null) return false;
        if (nameSuffix != null ? !nameSuffix.equals(lead.nameSuffix) : lead.nameSuffix != null) return false;
        if (nickName != null ? !nickName.equals(lead.nickName) : lead.nickName != null) return false;
        if (notes != null ? !notes.equals(lead.notes) : lead.notes != null) return false;
        if (numEmployees != null ? !numEmployees.equals(lead.numEmployees) : lead.numEmployees != null) return false;
        if (occupation != null ? !occupation.equals(lead.occupation) : lead.occupation != null) return false;
        if (owner != null ? !owner.equals(lead.owner) : lead.owner != null) return false;
        if (ownerCorporation != null ? !ownerCorporation.equals(lead.ownerCorporation) : lead.ownerCorporation != null)
            return false;
        if (pager != null ? !pager.equals(lead.pager) : lead.pager != null) return false;
        if (phone != null ? !phone.equals(lead.phone) : lead.phone != null) return false;
        if (phone2 != null ? !phone2.equals(lead.phone2) : lead.phone2 != null) return false;
        if (phone3 != null ? !phone3.equals(lead.phone3) : lead.phone3 != null) return false;
        if (preferredContact != null ? !preferredContact.equals(lead.preferredContact) : lead.preferredContact != null)
            return false;
        if (primarySkills != null ? !primarySkills.equals(lead.primarySkills) : lead.primarySkills != null)
            return false;
        if (priority != null ? !priority.equals(lead.priority) : lead.priority != null) return false;
        if (referredByPerson != null ? !referredByPerson.equals(lead.referredByPerson) : lead.referredByPerson != null)
            return false;
        if (reportToPerson != null ? !reportToPerson.equals(lead.reportToPerson) : lead.reportToPerson != null)
            return false;
        if (role != null ? !role.equals(lead.role) : lead.role != null) return false;
        if (salary != null ? !salary.equals(lead.salary) : lead.salary != null) return false;
        if (salaryLow != null ? !salaryLow.equals(lead.salaryLow) : lead.salaryLow != null) return false;
        if (secondaryAddress != null ? !secondaryAddress.equals(lead.secondaryAddress) : lead.secondaryAddress != null)
            return false;
        if (secondarySkills != null ? !secondarySkills.equals(lead.secondarySkills) : lead.secondarySkills != null)
            return false;
        if (skillSet != null ? !skillSet.equals(lead.skillSet) : lead.skillSet != null) return false;
        if (smsOptIn != null ? !smsOptIn.equals(lead.smsOptIn) : lead.smsOptIn != null) return false;
        if (source != null ? !source.equals(lead.source) : lead.source != null) return false;
        if (specialties != null ? !specialties.equals(lead.specialties) : lead.specialties != null) return false;
        if (status != null ? !status.equals(lead.status) : lead.status != null) return false;
        if (tearsheets != null ? !tearsheets.equals(lead.tearsheets) : lead.tearsheets != null) return false;
        if (timeZoneOffsetEST != null ? !timeZoneOffsetEST.equals(lead.timeZoneOffsetEST) : lead.timeZoneOffsetEST != null)
            return false;
        if (type != null ? !type.equals(lead.type) : lead.type != null) return false;
        return willRelocate != null ? willRelocate.equals(lead.willRelocate) : lead.willRelocate == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (assignedTo != null ? assignedTo.hashCode() : 0);
        result = 31 * result + (branch != null ? branch.hashCode() : 0);
        result = 31 * result + (businessSectors != null ? businessSectors.hashCode() : 0);
        result = 31 * result + (campaignSource != null ? campaignSource.hashCode() : 0);
        result = 31 * result + (candidates != null ? candidates.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (categories != null ? categories.hashCode() : 0);
        result = 31 * result + (clientContacts != null ? clientContacts.hashCode() : 0);
        result = 31 * result + (clientCorporation != null ? clientCorporation.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (companyURL != null ? companyURL.hashCode() : 0);
        result = 31 * result + (conversionSource != null ? conversionSource.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (dateLastComment != null ? dateLastComment.hashCode() : 0);
        result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
        result = 31 * result + (dateLastVisited != null ? dateLastVisited.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (distributionLists != null ? distributionLists.hashCode() : 0);
        result = 31 * result + (division != null ? division.hashCode() : 0);
        result = 31 * result + (educationDegree != null ? educationDegree.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (email2 != null ? email2.hashCode() : 0);
        result = 31 * result + (email3 != null ? email3.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (fax2 != null ? fax2.hashCode() : 0);
        result = 31 * result + (fax3 != null ? fax3.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (history != null ? history.hashCode() : 0);
        result = 31 * result + (isDayLightSavingsTime != null ? isDayLightSavingsTime.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (leadSource != null ? leadSource.hashCode() : 0);
        result = 31 * result + (massMailOptOut != null ? massMailOptOut.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (migrateGUID != null ? migrateGUID.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (namePrefix != null ? namePrefix.hashCode() : 0);
        result = 31 * result + (nameSuffix != null ? nameSuffix.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (numEmployees != null ? numEmployees.hashCode() : 0);
        result = 31 * result + (occupation != null ? occupation.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (ownerCorporation != null ? ownerCorporation.hashCode() : 0);
        result = 31 * result + (pager != null ? pager.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (phone2 != null ? phone2.hashCode() : 0);
        result = 31 * result + (phone3 != null ? phone3.hashCode() : 0);
        result = 31 * result + (preferredContact != null ? preferredContact.hashCode() : 0);
        result = 31 * result + (primarySkills != null ? primarySkills.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (referredByPerson != null ? referredByPerson.hashCode() : 0);
        result = 31 * result + (reportToPerson != null ? reportToPerson.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (salaryLow != null ? salaryLow.hashCode() : 0);
        result = 31 * result + (secondaryAddress != null ? secondaryAddress.hashCode() : 0);
        result = 31 * result + (secondarySkills != null ? secondarySkills.hashCode() : 0);
        result = 31 * result + (skillSet != null ? skillSet.hashCode() : 0);
        result = 31 * result + (smsOptIn != null ? smsOptIn.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (specialties != null ? specialties.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (tearsheets != null ? tearsheets.hashCode() : 0);
        result = 31 * result + (timeZoneOffsetEST != null ? timeZoneOffsetEST.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (willRelocate != null ? willRelocate.hashCode() : 0);
        return result;
    }

    @Override
    public String toStringNonNull(boolean includeLineBreaks) {
        String lbc = ", ";
        if(includeLineBreaks)
            lbc = ",\n ";
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() + " { ");
        if(includeLineBreaks)
            sb.append("\n");
        if(id != null){
            sb.append("id=").append(id);
        }
        if(address != null){
            sb.append(lbc + "address=").append(address.toStringNonNull(includeLineBreaks));
        }
        if(assignedTo != null){
            sb.append(lbc + "assignedTo=").append(assignedTo);
        }
        if(branch != null){
            sb.append(lbc + "branch=").append(branch.toStringNonNull(includeLineBreaks));
        }
        if(businessSectors != null){
            sb.append(lbc + "businessSectors=").append(businessSectors.toStringNonNull(includeLineBreaks));
        }
        if(campaignSource != null){
            sb.append(lbc + "campaignSource=").append(campaignSource);
        }
        if(candidates != null){
            sb.append(lbc + "candidates=").append(candidates.toStringNonNull(includeLineBreaks));
        }
        if(category != null){
            sb.append(lbc + "category=").append(category.toStringNonNull(includeLineBreaks));
        }
        if(categories != null){
            sb.append(lbc + "categories=").append(categories.toStringNonNull(includeLineBreaks));
        }
        if(clientContacts != null){
            sb.append(lbc + "clientContacts=").append(clientContacts.toStringNonNull(includeLineBreaks));
        }
        if(clientCorporation != null){
            sb.append(lbc + "clientCorporation=").append(clientCorporation.toStringNonNull(includeLineBreaks));
        }
        if(comments != null){
            sb.append(lbc + "comments=").append(comments);
        }
        if(companyName != null){
            sb.append(lbc + "companyName=").append(companyName);
        }
        if(companyURL != null){
            sb.append(lbc + "companyURL=").append(companyURL);
        }
        if(conversionSource != null){
            sb.append(lbc + "conversionSource=").append(conversionSource);
        }
        if(dateAdded != null){
            sb.append(lbc + "dateAdded=").append(dateAdded);
        }
        if(dateLastComment != null){
            sb.append(lbc + "dateLastComment=").append(dateLastComment);
        }
        if(dateLastModified != null){
            sb.append(lbc + "dateLastModified=").append(dateLastModified);
        }
        if(dateLastVisited != null){
            sb.append(lbc + "dateLastVisited=").append(dateLastVisited);
        }
        if(description != null){
            sb.append(lbc + "description=").append(description);
        }
        if(distributionLists != null){
            sb.append(lbc + "distributionLists=").append(distributionLists.toStringNonNull(includeLineBreaks));
        }
        if(division != null){
            sb.append(lbc + "division=").append(division);
        }
        if(educationDegree != null){
            sb.append(lbc + "educationDegree=").append(educationDegree);
        }
        if(email != null){
            sb.append(lbc + "email=").append(email);
        }
        if(email2 != null){
            sb.append(lbc + "email2=").append(email2);
        }
        if(email3 != null){
            sb.append(lbc + "email3=").append(email3);
        }
        if(fax != null){
            sb.append(lbc + "fax=").append(fax);
        }
        if(fax2 != null){
            sb.append(lbc + "fax2=").append(fax2);
        }
        if(fax3 != null){
            sb.append(lbc + "fax3=").append(fax3);
        }
        if(firstName != null){
            sb.append(lbc + "firstName=").append(firstName);
        }
        if(history != null){
            sb.append(lbc + "history=").append(history.toStringNonNull());
        }
        if(isDayLightSavingsTime != null){
            sb.append(lbc + "isDayLightSavingsTime=").append(isDayLightSavingsTime);
        }
        if(isDeleted != null){
            sb.append(lbc + "isDeleted=").append(isDeleted);
        }
        if(lastName != null){
            sb.append(lbc + "lastName=").append(lastName);
        }
        if(leadSource != null){
            sb.append(lbc + "leadSource=").append(leadSource);
        }
        if(massMailOptOut != null){
            sb.append(lbc + "massMailOptOut=").append(massMailOptOut);
        }
        if(middleName != null){
            sb.append(lbc + "middleName=").append(middleName);
        }
        if(migrateGUID != null){
            sb.append(lbc + "migrateGUID=").append(migrateGUID);
        }
        if(mobile != null){
            sb.append(lbc + "mobile=").append(mobile);
        }
        if(name != null){
            sb.append(lbc + "name=").append(name);
        }
        if(namePrefix != null){
            sb.append(lbc + "namePrefix=").append(namePrefix);
        }
        if(nameSuffix != null){
            sb.append(lbc + "nameSuffix=").append(nameSuffix);
        }
        if(nickName != null){
            sb.append(lbc + "nickName=").append(nickName);
        }
        if(notes != null){
            sb.append(lbc + "notes=").append(notes.toStringNonNull(includeLineBreaks));
        }
        if(numEmployees != null){
            sb.append(lbc + "numEmployees=").append(numEmployees);
        }
        if(occupation != null){
            sb.append(lbc + "occupation=").append(occupation);
        }
        if(owner != null){
            sb.append(lbc + "owner=").append(owner.toStringNonNull(includeLineBreaks));
        }
        if(ownerCorporation != null){
            sb.append(lbc + "ownerCorporation=").append(ownerCorporation.toStringNonNull(includeLineBreaks));
        }
        if(pager != null){
            sb.append(lbc + "pager=").append(pager);
        }
        if(phone != null){
            sb.append(lbc + "phone=").append(phone);
        }
        if(phone2 != null){
            sb.append(lbc + "phone2=").append(phone2);
        }
        if(phone3 != null){
            sb.append(lbc + "phone3=").append(phone3);
        }
        if(preferredContact != null){
            sb.append(lbc + "preferredContact=").append(preferredContact);
        }
        if(primarySkills != null){
            sb.append(lbc + "primarySkills=").append(primarySkills.toStringNonNull(includeLineBreaks));
        }
        if(priority != null){
            sb.append(lbc + "priority=").append(priority);
        }
        if(referredByPerson != null){
            sb.append(lbc + "referredByPerson=").append(referredByPerson.toStringNonNull(includeLineBreaks));
        }
        if(reportToPerson != null){
            sb.append(lbc + "reportToPerson=").append(reportToPerson.toStringNonNull(includeLineBreaks));
        }
        if(role != null){
            sb.append(lbc + "role=").append(role);
        }
        if(salary != null){
            sb.append(lbc + "salary=").append(salary);
        }
        if(salaryLow != null){
            sb.append(lbc + "salaryLow=").append(salaryLow);
        }
        if(secondaryAddress != null){
            sb.append(lbc + "secondaryAddress=").append(secondaryAddress.toStringNonNull(includeLineBreaks));
        }
        if(secondarySkills != null){
            sb.append(lbc + "secondarySkills=").append(secondarySkills.toStringNonNull(includeLineBreaks));
        }
        if(skillSet != null){
            sb.append(lbc + "skillSet=").append(skillSet);
        }
        if(smsOptIn != null){
            sb.append(lbc + "smsOptIn=").append(smsOptIn);
        }
        if(source != null){
            sb.append(lbc + "source=").append(source);
        }
        if(specialties != null){
            sb.append(lbc + "specialties=").append(specialties.toStringNonNull(includeLineBreaks));
        }
        if(status != null){
            sb.append(lbc + "status=").append(status);
        }
        if(tearsheets != null){
            sb.append(lbc + "tearsheets=").append(tearsheets.toStringNonNull(includeLineBreaks));
        }
        if(timeZoneOffsetEST != null){
            sb.append(lbc + "timeZoneOffsetEST=").append(timeZoneOffsetEST);
        }
        if(type != null){
            sb.append(lbc + "type=").append(type);
        }
        if(willRelocate != null){
            sb.append(lbc + "willRelocate=").append(willRelocate);
        }
        if(includeLineBreaks)
            sb.append("\n");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toStringNonNull() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() + " { ");
        if(id != null){
            sb.append("id=").append(id);
        }
        if(address != null){
            sb.append(", address=").append(address.toStringNonNull());
        }
        if(assignedTo != null){
            sb.append(", assignedTo=").append(assignedTo.toStringNonNull());
        }
        if(branch != null){
            sb.append(", branch=").append(branch.toStringNonNull());
        }
        if(businessSectors != null){
            sb.append(", businessSectors=").append(businessSectors.toStringNonNull());
        }
        if(campaignSource != null){
            sb.append(", campaignSource=").append(campaignSource);
        }
        if(candidates != null){
            sb.append(", candidates=").append(candidates.toStringNonNull());
        }
        if(category != null){
            sb.append(", category=").append(category.toStringNonNull());
        }
        if(categories != null){
            sb.append(", categories=").append(categories.toStringNonNull());
        }
        if(clientContacts != null){
            sb.append(", clientContacts=").append(clientContacts.toStringNonNull());
        }
        if(clientCorporation != null){
            sb.append(", clientCorporation=").append(clientCorporation.toStringNonNull());
        }
        if(comments != null){
            sb.append(", comments=").append(comments);
        }
        if(companyName != null){
            sb.append(", companyName=").append(companyName);
        }
        if(companyURL != null){
            sb.append(", companyURL=").append(companyURL);
        }
        if(conversionSource != null){
            sb.append(", conversionSource=").append(conversionSource);
        }
        if(dateAdded != null){
            sb.append(", dateAdded=").append(dateAdded);
        }
        if(dateLastComment != null){
            sb.append(", dateLastComment=").append(dateLastComment);
        }
        if(dateLastModified != null){
            sb.append(", dateLastModified=").append(dateLastModified);
        }
        if(dateLastVisited != null){
            sb.append(", dateLastVisited=").append(dateLastVisited);
        }
        if(description != null){
            sb.append(", description=").append(description);
        }
        if(distributionLists != null){
            sb.append(", distributionLists=").append(distributionLists.toStringNonNull());
        }
        if(division != null){
            sb.append(", division=").append(division);
        }
        if(educationDegree != null){
            sb.append(", educationDegree=").append(educationDegree);
        }
        if(email != null){
            sb.append(", email=").append(email);
        }
        if(email2 != null){
            sb.append(", email2=").append(email2);
        }
        if(email3 != null){
            sb.append(", email3=").append(email3);
        }
        if(fax != null){
            sb.append(", fax=").append(fax);
        }
        if(fax2 != null){
            sb.append(", fax2=").append(fax2);
        }
        if(fax3 != null){
            sb.append(", fax3=").append(fax3);
        }
        if(firstName != null){
            sb.append(", firstName=").append(firstName);
        }
        if(history != null){
            sb.append(", history=").append(history.toStringNonNull());
        }
        if(isDayLightSavingsTime != null){
            sb.append(", isDayLightSavingsTime=").append(isDayLightSavingsTime);
        }
        if(isDeleted != null){
            sb.append(", isDeleted=").append(isDeleted);
        }
        if(lastName != null){
            sb.append(", lastName=").append(lastName);
        }
        if(leadSource != null){
            sb.append(", leadSource=").append(leadSource);
        }
        if(massMailOptOut != null){
            sb.append(", massMailOptOut=").append(massMailOptOut);
        }
        if(middleName != null){
            sb.append(", middleName=").append(middleName);
        }
        if(migrateGUID != null){
            sb.append(", migrateGUID=").append(migrateGUID);
        }
        if(mobile != null){
            sb.append(", mobile=").append(mobile);
        }
        if(name != null){
            sb.append(", name=").append(name);
        }
        if(namePrefix != null){
            sb.append(", namePrefix=").append(namePrefix);
        }
        if(nameSuffix != null){
            sb.append(", nameSuffix=").append(nameSuffix);
        }
        if(nickName != null){
            sb.append(", nickName=").append(nickName);
        }
        if(notes != null){
            sb.append(", notes=").append(notes.toStringNonNull());
        }
        if(numEmployees != null){
            sb.append(", numEmployees=").append(numEmployees);
        }
        if(occupation != null){
            sb.append(", occupation=").append(occupation);
        }
        if(owner != null){
            sb.append(", owner=").append(owner.toStringNonNull());
        }
        if(ownerCorporation != null){
            sb.append(", ownerCorporation=").append(ownerCorporation.toStringNonNull());
        }
        if(pager != null){
            sb.append(", pager=").append(pager);
        }
        if(phone != null){
            sb.append(", phone=").append(phone);
        }
        if(phone2 != null){
            sb.append(", phone2=").append(phone2);
        }
        if(phone3 != null){
            sb.append(", phone3=").append(phone3);
        }
        if(preferredContact != null){
            sb.append(", preferredContact=").append(preferredContact);
        }
        if(primarySkills != null){
            sb.append(", primarySkills=").append(primarySkills.toStringNonNull());
        }
        if(priority != null){
            sb.append(", priority=").append(priority);
        }
        if(referredByPerson != null){
            sb.append(", referredByPerson=").append(referredByPerson.toStringNonNull());
        }
        if(reportToPerson != null){
            sb.append(", reportToPerson=").append(reportToPerson.toStringNonNull());
        }
        if(role != null){
            sb.append(", role=").append(role);
        }
        if(salary != null){
            sb.append(", salary=").append(salary);
        }
        if(salaryLow != null){
            sb.append(", salaryLow=").append(salaryLow);
        }
        if(secondaryAddress != null){
            sb.append(", secondaryAddress=").append(secondaryAddress.toStringNonNull());
        }
        if(secondarySkills != null){
            sb.append(", secondarySkills=").append(secondarySkills.toStringNonNull());
        }
        if(skillSet != null){
            sb.append(", skillSet=").append(skillSet);
        }
        if(smsOptIn != null){
            sb.append(", smsOptIn=").append(smsOptIn);
        }
        if(source != null){
            sb.append(", source=").append(source);
        }
        if(specialties != null){
            sb.append(", specialties=").append(specialties.toStringNonNull());
        }
        if(status != null){
            sb.append(", status=").append(status);
        }
        if(tearsheets != null){
            sb.append(", tearsheets=").append(tearsheets.toStringNonNull());
        }
        if(timeZoneOffsetEST != null){
            sb.append(", timeZoneOffsetEST=").append(timeZoneOffsetEST);
        }
        if(type != null){
            sb.append(", type=").append(type);
        }
        if(willRelocate != null){
            sb.append(", willRelocate=").append(willRelocate);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() + " { ");
        sb.append("id=").append(id);
        sb.append(", address=").append(address);
        sb.append(", assignedTo=").append(assignedTo);
        sb.append(", branch=").append(branch);
        sb.append(", businessSectors=").append(businessSectors);
        sb.append(", campaignSource=").append(campaignSource);
        sb.append(", candidates=").append(candidates);
        sb.append(", category=").append(category);
        sb.append(", categories=").append(categories);
        sb.append(", clientContacts=").append(clientContacts);
        sb.append(", clientCorporation=").append(clientCorporation);
        sb.append(", comments=").append(comments);
        sb.append(", companyName=").append(companyName);
        sb.append(", companyURL=").append(companyURL);
        sb.append(", conversionSource=").append(conversionSource);
        sb.append(", dateAdded=").append(dateAdded);
        sb.append(", dateLastComment=").append(dateLastComment);
        sb.append(", dateLastModified=").append(dateLastModified);
        sb.append(", dateLastVisited=").append(dateLastVisited);
        sb.append(", description=").append(description);
        sb.append(", distributionLists=").append(distributionLists);
        sb.append(", division=").append(division);
        sb.append(", educationDegree=").append(educationDegree);
        sb.append(", email=").append(email);
        sb.append(", email2=").append(email2);
        sb.append(", email3=").append(email3);
        sb.append(", fax=").append(fax);
        sb.append(", fax2=").append(fax2);
        sb.append(", fax3=").append(fax3);
        sb.append(", firstName=").append(firstName);
        sb.append(", history=").append(history);
        sb.append(", isDayLightSavingsTime=").append(isDayLightSavingsTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", lastName=").append(lastName);
        sb.append(", leadSource=").append(leadSource);
        sb.append(", massMailOptOut=").append(massMailOptOut);
        sb.append(", middleName=").append(middleName);
        sb.append(", migrateGUID=").append(migrateGUID);
        sb.append(", mobile=").append(mobile);
        sb.append(", name=").append(name);
        sb.append(", namePrefix=").append(namePrefix);
        sb.append(", nameSuffix=").append(nameSuffix);
        sb.append(", nickName=").append(nickName);
        sb.append(", notes=").append(notes);
        sb.append(", numEmployees=").append(numEmployees);
        sb.append(", occupation=").append(occupation);
        sb.append(", owner=").append(owner);
        sb.append(", ownerCorporation=").append(ownerCorporation);
        sb.append(", pager=").append(pager);
        sb.append(", phone=").append(phone);
        sb.append(", phone2=").append(phone2);
        sb.append(", phone3=").append(phone3);
        sb.append(", preferredContact=").append(preferredContact);
        sb.append(", primarySkills=").append(primarySkills);
        sb.append(", priority=").append(priority);
        sb.append(", referredByPerson=").append(referredByPerson);
        sb.append(", reportToPerson=").append(reportToPerson);
        sb.append(", role=").append(role);
        sb.append(", salary=").append(salary);
        sb.append(", salaryLow=").append(salaryLow);
        sb.append(", secondaryAddress=").append(secondaryAddress);
        sb.append(", secondarySkills=").append(secondarySkills);
        sb.append(", skillSet=").append(skillSet);
        sb.append(", smsOptIn=").append(smsOptIn);
        sb.append(", source=").append(source);
        sb.append(", specialties=").append(specialties);
        sb.append(", status=").append(status);
        sb.append(", tearsheets=").append(tearsheets);
        sb.append(", timeZoneOffsetEST=").append(timeZoneOffsetEST);
        sb.append(", type=").append(type);
        sb.append(", willRelocate=").append(willRelocate);
        sb.append("}");
        return sb.toString();
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
