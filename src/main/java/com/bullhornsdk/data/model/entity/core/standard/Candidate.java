package com.bullhornsdk.data.model.entity.core.standard;

import java.math.BigDecimal;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.FileEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.LinkedPerson;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.response.file.standard.StandardFileAttachment;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "address", "businessSectors", "categories", "category", "certificationList", "certifications",
		"clientCorporationBlackList", "clientCorporationWhiteList", "comments", "companyName", "companyURL", "customDate1", "customDate2",
		"customDate3", "customFloat1", "customFloat2", "customFloat3", "customInt1", "customInt2", "customInt3", "customText1",
		"customText10", "customText11", "customText12", "customText13", "customText14", "customText15", "customText16", "customText17",
		"customText18", "customText19", "customText2", "customText20", "customText3", "customText4", "customText5", "customText6",
		"customText7", "customText8", "customText9", "customTextBlock1", "customTextBlock2", "customTextBlock3", "customTextBlock4",
		"customTextBlock5", "dateAdded", "dateAvailable", "dateAvailableEnd", "dateI9Expiration", "dateLastComment", "dateNextCall",
		"dateOfBirth", "dayRate", "dayRateLow", "degreeList", "description", "desiredLocations", "disability", "educationDegree",
		"educations", "email", "email2", "email3", "employeeType", "employmentPreference", "ethnicity", "experience", "externalID", "fax",
		"fax2", "fax3", "federalAddtionalWitholdingsAmount", "federalExemptions", "federalFilingStatus", "fileAttachments", "firstName",
		"gender", "hourlyRate", "hourlyRateLow", "i9OnFile", "isDayLightSavings", "isDeleted", "isEditable", "isLockedOut", "interviews",
		"lastName", "linkedPerson", "localAddtionalWitholdingsAmount", "localExemptions", "localFilingStatus", "localTaxCode",
		"massMailOptOut", "middleName", "migrateGUID", "mobile", "name", "namePrefix", "nameSuffix", "nickName", "notes", "numCategories",
		"numOwners", "occupation", "owner", "pager", "paperWorkOnFile", "password", "phone", "phone2", "phone3", "placements",
		"preferredContact", "primarySkills", "recentClientList", "referredBy", "referredByPerson", "references", "salary", "salaryLow",
		"secondaryAddress", "secondaryOwners", "secondarySkills", "sendouts", "skillSet", "smsOptIn", "source", "specialties",
		"submissions", "ssn", "stateAddtionalWitholdingsAmount", "stateExemptions", "stateFilingStatus", "status", "tasks", "taxID",
		"taxState", "timeZoneOffsetEST", "travelLimit", "type", "username", "veteran", "webResponses", "willRelocate", "workAuthorized",
		"workHistories", "workPhone" })
public class Candidate extends CustomFieldsB implements SearchEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, FileEntity,
		AssociationEntity {

	private BigDecimal luceneScore;

	private Integer id;

	private Address address;

	private OneToMany<BusinessSector> businessSectors;

	private OneToMany<Category> categories;

	private Category category;

	private OneToMany<Certification> certificationList;

	@JsonIgnore
	private String certifications;

	private OneToMany<ClientCorporation> clientCorporationBlackList;

	private OneToMany<ClientCorporation> clientCorporationWhiteList;

	@JsonIgnore
	private String comments;

	@JsonIgnore
	@Size(max = 100)
	private String companyName;

	@JsonIgnore
	@Size(max = 100)
	private String companyURL;

	private DateTime dateAdded;

	private DateTime dateAvailable;

	private DateTime dateAvailableEnd;

	private DateTime dateI9Expiration;

	private DateTime dateLastComment;

	private DateTime dateNextCall;

	private DateTime dateOfBirth;

	private BigDecimal dayRate;

	private BigDecimal dayRateLow;

	@JsonIgnore
	private String degreeList;

	@JsonIgnore
	private String description;

	@JsonIgnore
	private String desiredLocations;

	@JsonIgnore
	@Size(max = 1)
	private String disability;

	@JsonIgnore
	private String educationDegree;

	private OneToMany<CandidateEducation> educations;

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
	@Size(max = 30)
	private String employeeType;

	@JsonIgnore
	@Size(max = 200)
	private String employmentPreference;

	@JsonIgnore
	@Size(max = 50)
	private String ethnicity;

	private Integer experience;

	@JsonIgnore
	@Size(max = 50)
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

	private BigDecimal federalAddtionalWitholdingsAmount;

	private Integer federalExemptions;

	@JsonIgnore
	private String federalFilingStatus;

	private OneToMany<StandardFileAttachment> fileAttachments;

	@JsonIgnore
	@Size(max = 50)
	private String firstName;

	@JsonIgnore
	@Size(max = 6)
	private String gender;

	private BigDecimal hourlyRate;

	private BigDecimal hourlyRateLow;

	private OneToMany<Appointment> interviews;

	private Integer i9OnFile;

	private Boolean isDayLightSavings;

	private Boolean isDeleted;

	private Boolean isEditable;

	private Boolean isLockedOut;

	@JsonIgnore
	@Size(max = 50)
	private String lastName;

	private LinkedPerson linkedPerson;

	private BigDecimal localAddtionalWitholdingsAmount;

	private Integer localExemptions;

	@JsonIgnore
	private String localFilingStatus;

	@JsonIgnore
	private String localTaxCode;

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

	private Integer numCategories;

	private Integer numOwners;

	@JsonIgnore
	@Size(max = 50)
	private String occupation;

	private CorporateUser owner;

	@JsonIgnore
	@Size(max = 20)
	private String pager;

	@JsonIgnore
	private String paperWorkOnFile;

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

	private OneToMany<Placement> placements;

	@JsonIgnore
	@Size(max = 15)
	private String preferredContact;

	private OneToMany<Skill> primarySkills;

	@JsonIgnore
	private String recentClientList;

	@JsonIgnore
	@Size(max = 50)
	private String referredBy;

	private LinkedPerson referredByPerson;

	private OneToMany<CandidateReference> references;

	private BigDecimal salary;

	private BigDecimal salaryLow;

	private Address secondaryAddress;

	private OneToMany<CorporateUser> secondaryOwners;

	private OneToMany<Skill> secondarySkills;

	private OneToMany<Sendout> sendouts;

	@JsonIgnore
	private String skillSet;

	private Boolean smsOptIn;

	@JsonIgnore
	private String source;

	private OneToMany<Specialty> specialties;

	@JsonIgnore
	@Size(max = 18)
	private String ssn;

	private BigDecimal stateAddtionalWitholdingsAmount;

	private Integer stateExemptions;

	@JsonIgnore
	private String stateFilingStatus;

	@JsonIgnore
	@Size(max = 100)
	private String status;

	private OneToMany<JobSubmission> submissions;

	private OneToMany<Task> tasks;

	@JsonIgnore
	@Size(max = 18)
	private String taxID;

	@JsonIgnore
	private String taxState;

	private Integer timeZoneOffsetEST;

	private Integer travelLimit;

	@JsonIgnore
	@Size(max = 100)
	private String type;

	@JsonIgnore
	private String username;

	@JsonIgnore
	@Size(max = 1)
	private String veteran;

	private OneToMany<JobSubmission> webResponses;

	private Boolean willRelocate;

	private Boolean workAuthorized;

	private OneToMany<CandidateWorkHistory> workHistories;

	@JsonIgnore
	@Size(max = 20)
	private String workPhone;

	public Candidate() {
		super();
	}

	public Candidate(Integer id) {
		super();
		this.id = id;
	}

	/**
	 * Returns the entity with the required fields for an insert set.
	 * 
	 * @return
	 */
	public static Candidate instantiateForInsert() {
		Candidate entity = new Candidate();
		entity.setCategory(new Category(512973));
		entity.setComments("New lead candidate");
		entity.setEmployeeType("W2");
		entity.setIsDeleted(Boolean.FALSE);
		entity.setIsEditable(Boolean.FALSE);
		entity.setPreferredContact("Email");
		entity.setStatus("New Lead");
		entity.setOwner(new CorporateUser(1));
		entity.setName("");
		entity.setFirstName("");
		entity.setLastName("");
		entity.setUsername(new DateTime().toString());
		entity.setPassword("secret");
		return entity;
	}

	public static void setRequiredFieldsForInsert(Candidate candidate) {
		if (candidate.getCategory() == null) {
			candidate.setCategory(new Category(512973));
		}
		if (candidate.getComments() == null) {
			candidate.setComments("New lead candidate");
		}
		if (candidate.getEmployeeType() == null) {
			candidate.setEmployeeType("W2");
		}
		if (candidate.getIsDeleted() == null) {
			candidate.setIsDeleted(Boolean.FALSE);
		}
		if (candidate.getIsEditable() == null) {
			candidate.setIsEditable(Boolean.FALSE);
		}
		if (candidate.getPreferredContact() == null) {
			candidate.setPreferredContact("Email");
		}
		if (candidate.getStatus() == null) {
			candidate.setStatus("New Lead");
		}
		if (candidate.getOwner() == null) {
			candidate.setOwner(new CorporateUser(1));
		}
		if (candidate.getUsername() == null) {
			candidate.setUsername(new DateTime().toString());
		}
		if (candidate.getPassword() == null) {
			candidate.setPassword("secret");
		}

		if (candidate.getName() == null) {
			if (candidate.getFirstName() != null && candidate.getLastName() != null) {
				candidate.setName(candidate.getFirstName() + " " + candidate.getLastName());
			} else {
				candidate.setName("");
			}
		}

	}

	@JsonIgnore
	public BigDecimal getLuceneScore() {
		return luceneScore;
	}

	@JsonProperty("_score")
	public void setLuceneScore(BigDecimal luceneScore) {
		this.luceneScore = luceneScore;
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

	@JsonIgnore
	public OneToMany<Certification> getCertificationList() {
		return certificationList;
	}

	@JsonProperty("certificationList")
	public void setCertificationList(OneToMany<Certification> certificationList) {
		this.certificationList = certificationList;
	}

	@JsonProperty("certifications")
	public String getCertifications() {
		return certifications;
	}

	@JsonProperty("certifications")
	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}

	@JsonProperty("clientCorporationBlackList")
	public OneToMany<ClientCorporation> getClientCorporationBlackList() {
		return clientCorporationBlackList;
	}

	@JsonProperty("clientCorporationBlackList")
	public void setClientCorporationBlackList(OneToMany<ClientCorporation> clientCorporationBlackList) {
		this.clientCorporationBlackList = clientCorporationBlackList;
	}

	@JsonProperty("clientCorporationWhiteList")
	public OneToMany<ClientCorporation> getClientCorporationWhiteList() {
		return clientCorporationWhiteList;
	}

	@JsonProperty("clientCorporationWhiteList")
	public void setClientCorporationWhiteList(OneToMany<ClientCorporation> clientCorporationWhiteList) {
		this.clientCorporationWhiteList = clientCorporationWhiteList;
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

	@JsonProperty("dateAvailable")
	public DateTime getDateAvailable() {
		return dateAvailable;
	}

	@JsonProperty("dateAvailable")
	public void setDateAvailable(DateTime dateAvailable) {
		this.dateAvailable = dateAvailable;
	}

	@JsonProperty("dateAvailableEnd")
	public DateTime getDateAvailableEnd() {
		return dateAvailableEnd;
	}

	@JsonProperty("dateAvailableEnd")
	public void setDateAvailableEnd(DateTime dateAvailableEnd) {
		this.dateAvailableEnd = dateAvailableEnd;
	}

	@JsonProperty("dateI9Expiration")
	public DateTime getDateI9Expiration() {
		return dateI9Expiration;
	}

	@JsonProperty("dateI9Expiration")
	public void setDateI9Expiration(DateTime dateI9Expiration) {
		this.dateI9Expiration = dateI9Expiration;
	}

	@JsonProperty("dateLastComment")
	public DateTime getDateLastComment() {
		return dateLastComment;
	}

	@JsonProperty("dateLastComment")
	public void setDateLastComment(DateTime dateLastComment) {
		this.dateLastComment = dateLastComment;
	}

	@JsonProperty("dateNextCall")
	public DateTime getDateNextCall() {
		return dateNextCall;
	}

	@JsonProperty("dateNextCall")
	public void setDateNextCall(DateTime dateNextCall) {
		this.dateNextCall = dateNextCall;
	}

	@JsonProperty("dateOfBirth")
	public DateTime getDateOfBirth() {
		return dateOfBirth;
	}

	@JsonProperty("dateOfBirth")
	public void setDateOfBirth(DateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@JsonProperty("dayRate")
	public BigDecimal getDayRate() {
		return dayRate;
	}

	@JsonProperty("dayRate")
	public void setDayRate(BigDecimal dayRate) {
		this.dayRate = dayRate;
	}

	@JsonProperty("dayRateLow")
	public BigDecimal getDayRateLow() {
		return dayRateLow;
	}

	@JsonProperty("dayRateLow")
	public void setDayRateLow(BigDecimal dayRateLow) {
		this.dayRateLow = dayRateLow;
	}

	@JsonProperty("degreeList")
	public String getDegreeList() {
		return degreeList;
	}

	@JsonIgnore
	public void setDegreeList(String degreeList) {
		this.degreeList = degreeList;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("desiredLocations")
	public String getDesiredLocations() {
		return desiredLocations;
	}

	@JsonIgnore
	public void setDesiredLocations(String desiredLocations) {
		this.desiredLocations = desiredLocations;
	}

	@JsonProperty("disability")
	public String getDisability() {
		return disability;
	}

	@JsonIgnore
	public void setDisability(String disability) {
		this.disability = disability;
	}

	@JsonProperty("educationDegree")
	public String getEducationDegree() {
		return educationDegree;
	}

	@JsonIgnore
	public void setEducationDegree(String educationDegree) {
		this.educationDegree = educationDegree;
	}

	@JsonProperty("educations")
	public OneToMany<CandidateEducation> getEducations() {
		return educations;
	}

	@JsonProperty("educations")
	public void setEducations(OneToMany<CandidateEducation> educations) {
		this.educations = educations;
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

	@JsonProperty("employeeType")
	public String getEmployeeType() {
		return employeeType;
	}

	@JsonIgnore
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	@JsonProperty("employmentPreference")
	public String getEmploymentPreference() {
		return employmentPreference;
	}

	@JsonIgnore
	public void setEmploymentPreference(String employmentPreference) {
		this.employmentPreference = employmentPreference;
	}

	@JsonProperty("ethnicity")
	public String getEthnicity() {
		return ethnicity;
	}

	@JsonIgnore
	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	@JsonProperty("experience")
	public Integer getExperience() {
		return experience;
	}

	@JsonProperty("experience")
	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	@JsonProperty("externalID")
	public String getExternalID() {
		return externalID;
	}

	@JsonProperty("externalID")
	public void setExternalID(String externalID) {
		this.externalID = externalID;
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

	@JsonProperty("federalAddtionalWitholdingsAmount")
	public BigDecimal getFederalAddtionalWitholdingsAmount() {
		return federalAddtionalWitholdingsAmount;
	}

	@JsonProperty("federalAddtionalWitholdingsAmount")
	public void setFederalAddtionalWitholdingsAmount(BigDecimal federalAddtionalWitholdingsAmount) {
		this.federalAddtionalWitholdingsAmount = federalAddtionalWitholdingsAmount;
	}

	@JsonProperty("federalExemptions")
	public Integer getFederalExemptions() {
		return federalExemptions;
	}

	@JsonProperty("federalExemptions")
	public void setFederalExemptions(Integer federalExemptions) {
		this.federalExemptions = federalExemptions;
	}

	@JsonProperty("federalFilingStatus")
	public String getFederalFilingStatus() {
		return federalFilingStatus;
	}

	@JsonIgnore
	public void setFederalFilingStatus(String federalFilingStatus) {
		this.federalFilingStatus = federalFilingStatus;
	}

	@JsonProperty("fileAttachments")
	public OneToMany<StandardFileAttachment> getFileAttachments() {
		return fileAttachments;
	}

	@JsonProperty("fileAttachments")
	public void setFileAttachments(OneToMany<StandardFileAttachment> fileAttachments) {
		this.fileAttachments = fileAttachments;
	}

	@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}

	@JsonProperty("firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty("gender")
	public String getGender() {
		return gender;
	}

	@JsonProperty("gender")
	public void setGender(String gender) {
		this.gender = gender;
	}

	@JsonProperty("hourlyRate")
	public BigDecimal getHourlyRate() {
		return hourlyRate;
	}

	@JsonProperty("hourlyRate")
	public void setHourlyRate(BigDecimal hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@JsonProperty("hourlyRateLow")
	public BigDecimal getHourlyRateLow() {
		return hourlyRateLow;
	}

	@JsonProperty("hourlyRateLow")
	public void setHourlyRateLow(BigDecimal hourlyRateLow) {
		this.hourlyRateLow = hourlyRateLow;
	}

	@JsonProperty("interviews")
	public OneToMany<Appointment> getInterviews() {
		return interviews;
	}

	@JsonProperty("interviews")
	public void setInterviews(OneToMany<Appointment> interviews) {
		this.interviews = interviews;
	}

	@JsonProperty("i9OnFile")
	public Integer getI9OnFile() {
		return i9OnFile;
	}

	@JsonProperty("i9OnFile")
	public void setI9OnFile(Integer i9OnFile) {
		this.i9OnFile = i9OnFile;
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

	@JsonProperty("isEditable")
	public Boolean getIsEditable() {
		return isEditable;
	}

	@JsonProperty("isEditable")
	public void setIsEditable(Boolean isEditable) {
		this.isEditable = isEditable;
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

	@JsonProperty("lastName")
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

	@JsonProperty("localAddtionalWitholdingsAmount")
	public BigDecimal getLocalAddtionalWitholdingsAmount() {
		return localAddtionalWitholdingsAmount;
	}

	@JsonProperty("localAddtionalWitholdingsAmount")
	public void setLocalAddtionalWitholdingsAmount(BigDecimal localAddtionalWitholdingsAmount) {
		this.localAddtionalWitholdingsAmount = localAddtionalWitholdingsAmount;
	}

	@JsonProperty("localExemptions")
	public Integer getLocalExemptions() {
		return localExemptions;
	}

	@JsonProperty("localExemptions")
	public void setLocalExemptions(Integer localExemptions) {
		this.localExemptions = localExemptions;
	}

	@JsonProperty("localFilingStatus")
	public String getLocalFilingStatus() {
		return localFilingStatus;
	}

	@JsonIgnore
	public void setLocalFilingStatus(String localFilingStatus) {
		this.localFilingStatus = localFilingStatus;
	}

	@JsonProperty("localTaxCode")
	public String getLocalTaxCode() {
		return localTaxCode;
	}

	@JsonIgnore
	public void setLocalTaxCode(String localTaxCode) {
		this.localTaxCode = localTaxCode;
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

	@JsonProperty("nickName")
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@JsonProperty("notes")
	public OneToMany<Note> getNotes() {
		return notes;
	}

	@JsonProperty("notes")
	public void setNotes(OneToMany<Note> notes) {
		this.notes = notes;
	}

	@JsonProperty("numCategories")
	public Integer getNumCategories() {
		return numCategories;
	}

	@JsonProperty("numCategories")
	public void setNumCategories(Integer numCategories) {
		this.numCategories = numCategories;
	}

	@JsonProperty("numOwners")
	public Integer getNumOwners() {
		return numOwners;
	}

	@JsonProperty("numOwners")
	public void setNumOwners(Integer numOwners) {
		this.numOwners = numOwners;
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

	@JsonProperty("paperWorkOnFile")
	public String getPaperWorkOnFile() {
		return paperWorkOnFile;
	}

	@JsonIgnore
	public void setPaperWorkOnFile(String paperWorkOnFile) {
		this.paperWorkOnFile = paperWorkOnFile;
	}

	@JsonProperty("password")
	public String getPassword() {
		return password;
	}

	@JsonProperty("password")
	public void setPassword(String password) {
		this.password = password;
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

	@JsonProperty("placements")
	public OneToMany<Placement> getPlacements() {
		return placements;
	}

	@JsonProperty("placements")
	public void setPlacements(OneToMany<Placement> placements) {
		this.placements = placements;
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

	@JsonProperty("recentClientList")
	public String getRecentClientList() {
		return recentClientList;
	}

	@JsonIgnore
	public void setRecentClientList(String recentClientList) {
		this.recentClientList = recentClientList;
	}

	@JsonProperty("referredBy")
	public String getReferredBy() {
		return referredBy;
	}

	@JsonIgnore
	public void setReferredBy(String referredBy) {
		this.referredBy = referredBy;
	}

	@JsonProperty("referredByPerson")
	public LinkedPerson getReferredByPerson() {
		return referredByPerson;
	}

	@JsonProperty("referredByPerson")
	public void setReferredByPerson(LinkedPerson referredByPerson) {
		this.referredByPerson = referredByPerson;
	}

	@JsonProperty("references")
	public OneToMany<CandidateReference> getReferences() {
		return references;
	}

	@JsonProperty("references")
	public void setReferences(OneToMany<CandidateReference> references) {
		this.references = references;
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
	public OneToMany<CorporateUser> getSecondaryOwners() {
		return secondaryOwners;
	}

	@JsonProperty("secondaryOwners")
	public void setSecondaryOwners(OneToMany<CorporateUser> secondaryOwners) {
		this.secondaryOwners = secondaryOwners;
	}

	@JsonIgnore
	public OneToMany<Skill> getSecondarySkills() {
		return secondarySkills;
	}

	@JsonProperty("secondarySkills")
	public void setSecondarySkills(OneToMany<Skill> secondarySkills) {
		this.secondarySkills = secondarySkills;
	}

	@JsonProperty("sendouts")
	public OneToMany<Sendout> getSendouts() {
		return sendouts;
	}

	@JsonProperty("sendouts")
	public void setSendouts(OneToMany<Sendout> sendouts) {
		this.sendouts = sendouts;
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

	@JsonProperty("ssn")
	public String getSsn() {
		return ssn;
	}

	@JsonProperty("ssn")
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@JsonProperty("stateAddtionalWitholdingsAmount")
	public BigDecimal getStateAddtionalWitholdingsAmount() {
		return stateAddtionalWitholdingsAmount;
	}

	@JsonProperty("stateAddtionalWitholdingsAmount")
	public void setStateAddtionalWitholdingsAmount(BigDecimal stateAddtionalWitholdingsAmount) {
		this.stateAddtionalWitholdingsAmount = stateAddtionalWitholdingsAmount;
	}

	@JsonProperty("stateExemptions")
	public Integer getStateExemptions() {
		return stateExemptions;
	}

	@JsonProperty("stateExemptions")
	public void setStateExemptions(Integer stateExemptions) {
		this.stateExemptions = stateExemptions;
	}

	@JsonProperty("stateFilingStatus")
	public String getStateFilingStatus() {
		return stateFilingStatus;
	}

	@JsonIgnore
	public void setStateFilingStatus(String stateFilingStatus) {
		this.stateFilingStatus = stateFilingStatus;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonIgnore
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("submissions")
	public OneToMany<JobSubmission> getSubmissions() {
		return submissions;
	}

	@JsonProperty("submissions")
	public void setSubmissions(OneToMany<JobSubmission> submissions) {
		this.submissions = submissions;
	}

	@JsonProperty("tasks")
	public OneToMany<Task> getTasks() {
		return tasks;
	}

	@JsonProperty("tasks")
	public void setTasks(OneToMany<Task> tasks) {
		this.tasks = tasks;
	}

	@JsonProperty("taxID")
	public String getTaxID() {
		return taxID;
	}

	@JsonIgnore
	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	@JsonProperty("taxState")
	public String getTaxState() {
		return taxState;
	}

	@JsonProperty("taxState")
	public void setTaxState(String taxState) {
		this.taxState = taxState;
	}

	@JsonProperty("timeZoneOffsetEST")
	public Integer getTimeZoneOffsetEST() {
		return timeZoneOffsetEST;
	}

	@JsonProperty("timeZoneOffsetEST")
	public void setTimeZoneOffsetEST(Integer timeZoneOffsetEST) {
		this.timeZoneOffsetEST = timeZoneOffsetEST;
	}

	@JsonProperty("travelLimit")
	public Integer getTravelLimit() {
		return travelLimit;
	}

	@JsonProperty("travelLimit")
	public void setTravelLimit(Integer travelLimit) {
		this.travelLimit = travelLimit;
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

	@JsonProperty("username")
	public void setUsername(String username) {
		this.username = username;
	}

	@JsonProperty("veteran")
	public String getVeteran() {
		return veteran;
	}

	@JsonProperty("veteran")
	public void setVeteran(String veteran) {
		this.veteran = veteran;
	}

	@JsonProperty("webResponses")
	public OneToMany<JobSubmission> getWebResponses() {
		return webResponses;
	}

	@JsonProperty("webResponses")
	public void setWebResponses(OneToMany<JobSubmission> webResponses) {
		this.webResponses = webResponses;
	}

	@JsonProperty("willRelocate")
	public Boolean getWillRelocate() {
		return willRelocate;
	}

	@JsonProperty("willRelocate")
	public void setWillRelocate(Boolean willRelocate) {
		this.willRelocate = willRelocate;
	}

	@JsonProperty("workAuthorized")
	public Boolean getWorkAuthorized() {
		return workAuthorized;
	}

	@JsonProperty("workAuthorized")
	public void setWorkAuthorized(Boolean workAuthorized) {
		this.workAuthorized = workAuthorized;
	}

	@JsonProperty("workHistories")
	public OneToMany<CandidateWorkHistory> getWorkHistories() {
		return workHistories;
	}

	@JsonProperty("workHistories")
	public void setWorkHistories(OneToMany<CandidateWorkHistory> workHistories) {
		this.workHistories = workHistories;
	}

	@JsonProperty("workPhone")
	public String getWorkPhone() {
		return workPhone;
	}

	@JsonProperty("workPhone")
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((businessSectors == null) ? 0 : businessSectors.hashCode());
		result = prime * result + ((categories == null) ? 0 : categories.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((certificationList == null) ? 0 : certificationList.hashCode());
		result = prime * result + ((certifications == null) ? 0 : certifications.hashCode());
		result = prime * result + ((clientCorporationBlackList == null) ? 0 : clientCorporationBlackList.hashCode());
		result = prime * result + ((clientCorporationWhiteList == null) ? 0 : clientCorporationWhiteList.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((companyURL == null) ? 0 : companyURL.hashCode());
		result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
		result = prime * result + ((dateAvailable == null) ? 0 : dateAvailable.hashCode());
		result = prime * result + ((dateAvailableEnd == null) ? 0 : dateAvailableEnd.hashCode());
		result = prime * result + ((dateI9Expiration == null) ? 0 : dateI9Expiration.hashCode());
		result = prime * result + ((dateLastComment == null) ? 0 : dateLastComment.hashCode());
		result = prime * result + ((dateNextCall == null) ? 0 : dateNextCall.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((dayRate == null) ? 0 : dayRate.hashCode());
		result = prime * result + ((dayRateLow == null) ? 0 : dayRateLow.hashCode());
		result = prime * result + ((degreeList == null) ? 0 : degreeList.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((desiredLocations == null) ? 0 : desiredLocations.hashCode());
		result = prime * result + ((disability == null) ? 0 : disability.hashCode());
		result = prime * result + ((educationDegree == null) ? 0 : educationDegree.hashCode());
		result = prime * result + ((educations == null) ? 0 : educations.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((email2 == null) ? 0 : email2.hashCode());
		result = prime * result + ((email3 == null) ? 0 : email3.hashCode());
		result = prime * result + ((employeeType == null) ? 0 : employeeType.hashCode());
		result = prime * result + ((employmentPreference == null) ? 0 : employmentPreference.hashCode());
		result = prime * result + ((ethnicity == null) ? 0 : ethnicity.hashCode());
		result = prime * result + ((experience == null) ? 0 : experience.hashCode());
		result = prime * result + ((externalID == null) ? 0 : externalID.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((fax2 == null) ? 0 : fax2.hashCode());
		result = prime * result + ((fax3 == null) ? 0 : fax3.hashCode());
		result = prime * result + ((federalAddtionalWitholdingsAmount == null) ? 0 : federalAddtionalWitholdingsAmount.hashCode());
		result = prime * result + ((federalExemptions == null) ? 0 : federalExemptions.hashCode());
		result = prime * result + ((federalFilingStatus == null) ? 0 : federalFilingStatus.hashCode());
		result = prime * result + ((fileAttachments == null) ? 0 : fileAttachments.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((hourlyRate == null) ? 0 : hourlyRate.hashCode());
		result = prime * result + ((hourlyRateLow == null) ? 0 : hourlyRateLow.hashCode());
		result = prime * result + ((i9OnFile == null) ? 0 : i9OnFile.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((interviews == null) ? 0 : interviews.hashCode());
		result = prime * result + ((isDayLightSavings == null) ? 0 : isDayLightSavings.hashCode());
		result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
		result = prime * result + ((isEditable == null) ? 0 : isEditable.hashCode());
		result = prime * result + ((isLockedOut == null) ? 0 : isLockedOut.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((linkedPerson == null) ? 0 : linkedPerson.hashCode());
		result = prime * result + ((localAddtionalWitholdingsAmount == null) ? 0 : localAddtionalWitholdingsAmount.hashCode());
		result = prime * result + ((localExemptions == null) ? 0 : localExemptions.hashCode());
		result = prime * result + ((localFilingStatus == null) ? 0 : localFilingStatus.hashCode());
		result = prime * result + ((localTaxCode == null) ? 0 : localTaxCode.hashCode());
		result = prime * result + ((luceneScore == null) ? 0 : luceneScore.hashCode());
		result = prime * result + ((massMailOptOut == null) ? 0 : massMailOptOut.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((namePrefix == null) ? 0 : namePrefix.hashCode());
		result = prime * result + ((nameSuffix == null) ? 0 : nameSuffix.hashCode());
		result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		result = prime * result + ((numCategories == null) ? 0 : numCategories.hashCode());
		result = prime * result + ((numOwners == null) ? 0 : numOwners.hashCode());
		result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((pager == null) ? 0 : pager.hashCode());
		result = prime * result + ((paperWorkOnFile == null) ? 0 : paperWorkOnFile.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((phone2 == null) ? 0 : phone2.hashCode());
		result = prime * result + ((phone3 == null) ? 0 : phone3.hashCode());
		result = prime * result + ((placements == null) ? 0 : placements.hashCode());
		result = prime * result + ((preferredContact == null) ? 0 : preferredContact.hashCode());
		result = prime * result + ((primarySkills == null) ? 0 : primarySkills.hashCode());
		result = prime * result + ((recentClientList == null) ? 0 : recentClientList.hashCode());
		result = prime * result + ((references == null) ? 0 : references.hashCode());
		result = prime * result + ((referredBy == null) ? 0 : referredBy.hashCode());
		result = prime * result + ((referredByPerson == null) ? 0 : referredByPerson.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result + ((salaryLow == null) ? 0 : salaryLow.hashCode());
		result = prime * result + ((secondaryAddress == null) ? 0 : secondaryAddress.hashCode());
		result = prime * result + ((secondaryOwners == null) ? 0 : secondaryOwners.hashCode());
		result = prime * result + ((secondarySkills == null) ? 0 : secondarySkills.hashCode());
		result = prime * result + ((sendouts == null) ? 0 : sendouts.hashCode());
		result = prime * result + ((skillSet == null) ? 0 : skillSet.hashCode());
		result = prime * result + ((smsOptIn == null) ? 0 : smsOptIn.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((specialties == null) ? 0 : specialties.hashCode());
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		result = prime * result + ((stateAddtionalWitholdingsAmount == null) ? 0 : stateAddtionalWitholdingsAmount.hashCode());
		result = prime * result + ((stateExemptions == null) ? 0 : stateExemptions.hashCode());
		result = prime * result + ((stateFilingStatus == null) ? 0 : stateFilingStatus.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((submissions == null) ? 0 : submissions.hashCode());
		result = prime * result + ((tasks == null) ? 0 : tasks.hashCode());
		result = prime * result + ((taxID == null) ? 0 : taxID.hashCode());
		result = prime * result + ((taxState == null) ? 0 : taxState.hashCode());
		result = prime * result + ((timeZoneOffsetEST == null) ? 0 : timeZoneOffsetEST.hashCode());
		result = prime * result + ((travelLimit == null) ? 0 : travelLimit.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((veteran == null) ? 0 : veteran.hashCode());
		result = prime * result + ((webResponses == null) ? 0 : webResponses.hashCode());
		result = prime * result + ((willRelocate == null) ? 0 : willRelocate.hashCode());
		result = prime * result + ((workAuthorized == null) ? 0 : workAuthorized.hashCode());
		result = prime * result + ((workHistories == null) ? 0 : workHistories.hashCode());
		result = prime * result + ((workPhone == null) ? 0 : workPhone.hashCode());
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
		Candidate other = (Candidate) obj;
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
		if (certificationList == null) {
			if (other.certificationList != null)
				return false;
		} else if (!certificationList.equals(other.certificationList))
			return false;
		if (certifications == null) {
			if (other.certifications != null)
				return false;
		} else if (!certifications.equals(other.certifications))
			return false;
		if (clientCorporationBlackList == null) {
			if (other.clientCorporationBlackList != null)
				return false;
		} else if (!clientCorporationBlackList.equals(other.clientCorporationBlackList))
			return false;
		if (clientCorporationWhiteList == null) {
			if (other.clientCorporationWhiteList != null)
				return false;
		} else if (!clientCorporationWhiteList.equals(other.clientCorporationWhiteList))
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
		if (dateAdded == null) {
			if (other.dateAdded != null)
				return false;
		} else if (!dateAdded.equals(other.dateAdded))
			return false;
		if (dateAvailable == null) {
			if (other.dateAvailable != null)
				return false;
		} else if (!dateAvailable.equals(other.dateAvailable))
			return false;
		if (dateAvailableEnd == null) {
			if (other.dateAvailableEnd != null)
				return false;
		} else if (!dateAvailableEnd.equals(other.dateAvailableEnd))
			return false;
		if (dateI9Expiration == null) {
			if (other.dateI9Expiration != null)
				return false;
		} else if (!dateI9Expiration.equals(other.dateI9Expiration))
			return false;
		if (dateLastComment == null) {
			if (other.dateLastComment != null)
				return false;
		} else if (!dateLastComment.equals(other.dateLastComment))
			return false;
		if (dateNextCall == null) {
			if (other.dateNextCall != null)
				return false;
		} else if (!dateNextCall.equals(other.dateNextCall))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (dayRate == null) {
			if (other.dayRate != null)
				return false;
		} else if (!dayRate.equals(other.dayRate))
			return false;
		if (dayRateLow == null) {
			if (other.dayRateLow != null)
				return false;
		} else if (!dayRateLow.equals(other.dayRateLow))
			return false;
		if (degreeList == null) {
			if (other.degreeList != null)
				return false;
		} else if (!degreeList.equals(other.degreeList))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (desiredLocations == null) {
			if (other.desiredLocations != null)
				return false;
		} else if (!desiredLocations.equals(other.desiredLocations))
			return false;
		if (disability == null) {
			if (other.disability != null)
				return false;
		} else if (!disability.equals(other.disability))
			return false;
		if (educationDegree == null) {
			if (other.educationDegree != null)
				return false;
		} else if (!educationDegree.equals(other.educationDegree))
			return false;
		if (educations == null) {
			if (other.educations != null)
				return false;
		} else if (!educations.equals(other.educations))
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
		if (employeeType == null) {
			if (other.employeeType != null)
				return false;
		} else if (!employeeType.equals(other.employeeType))
			return false;
		if (employmentPreference == null) {
			if (other.employmentPreference != null)
				return false;
		} else if (!employmentPreference.equals(other.employmentPreference))
			return false;
		if (ethnicity == null) {
			if (other.ethnicity != null)
				return false;
		} else if (!ethnicity.equals(other.ethnicity))
			return false;
		if (experience == null) {
			if (other.experience != null)
				return false;
		} else if (!experience.equals(other.experience))
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
		if (federalAddtionalWitholdingsAmount == null) {
			if (other.federalAddtionalWitholdingsAmount != null)
				return false;
		} else if (!federalAddtionalWitholdingsAmount.equals(other.federalAddtionalWitholdingsAmount))
			return false;
		if (federalExemptions == null) {
			if (other.federalExemptions != null)
				return false;
		} else if (!federalExemptions.equals(other.federalExemptions))
			return false;
		if (federalFilingStatus == null) {
			if (other.federalFilingStatus != null)
				return false;
		} else if (!federalFilingStatus.equals(other.federalFilingStatus))
			return false;
		if (fileAttachments == null) {
			if (other.fileAttachments != null)
				return false;
		} else if (!fileAttachments.equals(other.fileAttachments))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (hourlyRate == null) {
			if (other.hourlyRate != null)
				return false;
		} else if (!hourlyRate.equals(other.hourlyRate))
			return false;
		if (hourlyRateLow == null) {
			if (other.hourlyRateLow != null)
				return false;
		} else if (!hourlyRateLow.equals(other.hourlyRateLow))
			return false;
		if (i9OnFile == null) {
			if (other.i9OnFile != null)
				return false;
		} else if (!i9OnFile.equals(other.i9OnFile))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (interviews == null) {
			if (other.interviews != null)
				return false;
		} else if (!interviews.equals(other.interviews))
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
		if (isEditable == null) {
			if (other.isEditable != null)
				return false;
		} else if (!isEditable.equals(other.isEditable))
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
		if (localAddtionalWitholdingsAmount == null) {
			if (other.localAddtionalWitholdingsAmount != null)
				return false;
		} else if (!localAddtionalWitholdingsAmount.equals(other.localAddtionalWitholdingsAmount))
			return false;
		if (localExemptions == null) {
			if (other.localExemptions != null)
				return false;
		} else if (!localExemptions.equals(other.localExemptions))
			return false;
		if (localFilingStatus == null) {
			if (other.localFilingStatus != null)
				return false;
		} else if (!localFilingStatus.equals(other.localFilingStatus))
			return false;
		if (localTaxCode == null) {
			if (other.localTaxCode != null)
				return false;
		} else if (!localTaxCode.equals(other.localTaxCode))
			return false;
		if (luceneScore == null) {
			if (other.luceneScore != null)
				return false;
		} else if (!luceneScore.equals(other.luceneScore))
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
		if (numCategories == null) {
			if (other.numCategories != null)
				return false;
		} else if (!numCategories.equals(other.numCategories))
			return false;
		if (numOwners == null) {
			if (other.numOwners != null)
				return false;
		} else if (!numOwners.equals(other.numOwners))
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
		if (pager == null) {
			if (other.pager != null)
				return false;
		} else if (!pager.equals(other.pager))
			return false;
		if (paperWorkOnFile == null) {
			if (other.paperWorkOnFile != null)
				return false;
		} else if (!paperWorkOnFile.equals(other.paperWorkOnFile))
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
		if (placements == null) {
			if (other.placements != null)
				return false;
		} else if (!placements.equals(other.placements))
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
		if (recentClientList == null) {
			if (other.recentClientList != null)
				return false;
		} else if (!recentClientList.equals(other.recentClientList))
			return false;
		if (references == null) {
			if (other.references != null)
				return false;
		} else if (!references.equals(other.references))
			return false;
		if (referredBy == null) {
			if (other.referredBy != null)
				return false;
		} else if (!referredBy.equals(other.referredBy))
			return false;
		if (referredByPerson == null) {
			if (other.referredByPerson != null)
				return false;
		} else if (!referredByPerson.equals(other.referredByPerson))
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
		if (secondaryOwners == null) {
			if (other.secondaryOwners != null)
				return false;
		} else if (!secondaryOwners.equals(other.secondaryOwners))
			return false;
		if (secondarySkills == null) {
			if (other.secondarySkills != null)
				return false;
		} else if (!secondarySkills.equals(other.secondarySkills))
			return false;
		if (sendouts == null) {
			if (other.sendouts != null)
				return false;
		} else if (!sendouts.equals(other.sendouts))
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
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		if (stateAddtionalWitholdingsAmount == null) {
			if (other.stateAddtionalWitholdingsAmount != null)
				return false;
		} else if (!stateAddtionalWitholdingsAmount.equals(other.stateAddtionalWitholdingsAmount))
			return false;
		if (stateExemptions == null) {
			if (other.stateExemptions != null)
				return false;
		} else if (!stateExemptions.equals(other.stateExemptions))
			return false;
		if (stateFilingStatus == null) {
			if (other.stateFilingStatus != null)
				return false;
		} else if (!stateFilingStatus.equals(other.stateFilingStatus))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (submissions == null) {
			if (other.submissions != null)
				return false;
		} else if (!submissions.equals(other.submissions))
			return false;
		if (tasks == null) {
			if (other.tasks != null)
				return false;
		} else if (!tasks.equals(other.tasks))
			return false;
		if (taxID == null) {
			if (other.taxID != null)
				return false;
		} else if (!taxID.equals(other.taxID))
			return false;
		if (taxState == null) {
			if (other.taxState != null)
				return false;
		} else if (!taxState.equals(other.taxState))
			return false;
		if (timeZoneOffsetEST == null) {
			if (other.timeZoneOffsetEST != null)
				return false;
		} else if (!timeZoneOffsetEST.equals(other.timeZoneOffsetEST))
			return false;
		if (travelLimit == null) {
			if (other.travelLimit != null)
				return false;
		} else if (!travelLimit.equals(other.travelLimit))
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
		if (veteran == null) {
			if (other.veteran != null)
				return false;
		} else if (!veteran.equals(other.veteran))
			return false;
		if (webResponses == null) {
			if (other.webResponses != null)
				return false;
		} else if (!webResponses.equals(other.webResponses))
			return false;
		if (willRelocate == null) {
			if (other.willRelocate != null)
				return false;
		} else if (!willRelocate.equals(other.willRelocate))
			return false;
		if (workAuthorized == null) {
			if (other.workAuthorized != null)
				return false;
		} else if (!workAuthorized.equals(other.workAuthorized))
			return false;
		if (workHistories == null) {
			if (other.workHistories != null)
				return false;
		} else if (!workHistories.equals(other.workHistories))
			return false;
		if (workPhone == null) {
			if (other.workPhone != null)
				return false;
		} else if (!workPhone.equals(other.workPhone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getName());
		builder.append(" {\n\tluceneScore: ");
		builder.append(luceneScore);
		builder.append("\n\tid: ");
		builder.append(id);
		builder.append("\n\taddress: ");
		builder.append(address);
		builder.append("\n\tbusinessSectors: ");
		builder.append(businessSectors);
		builder.append("\n\tcategories: ");
		builder.append(categories);
		builder.append("\n\tcategory: ");
		builder.append(category);
		builder.append("\n\tcertificationList: ");
		builder.append(certificationList);
		builder.append("\n\tcertifications: ");
		builder.append(certifications);
		builder.append("\n\tclientCorporationBlackList: ");
		builder.append(clientCorporationBlackList);
		builder.append("\n\tclientCorporationWhiteList: ");
		builder.append(clientCorporationWhiteList);
		builder.append("\n\tcomments: ");
		builder.append(comments);
		builder.append("\n\tcompanyName: ");
		builder.append(companyName);
		builder.append("\n\tcompanyURL: ");
		builder.append(companyURL);
		builder.append("\n\tdateAdded: ");
		builder.append(dateAdded);
		builder.append("\n\tdateAvailable: ");
		builder.append(dateAvailable);
		builder.append("\n\tdateAvailableEnd: ");
		builder.append(dateAvailableEnd);
		builder.append("\n\tdateI9Expiration: ");
		builder.append(dateI9Expiration);
		builder.append("\n\tdateLastComment: ");
		builder.append(dateLastComment);
		builder.append("\n\tdateNextCall: ");
		builder.append(dateNextCall);
		builder.append("\n\tdateOfBirth: ");
		builder.append(dateOfBirth);
		builder.append("\n\tdayRate: ");
		builder.append(dayRate);
		builder.append("\n\tdayRateLow: ");
		builder.append(dayRateLow);
		builder.append("\n\tdegreeList: ");
		builder.append(degreeList);
		builder.append("\n\tdescription: ");
		builder.append(description);
		builder.append("\n\tdesiredLocations: ");
		builder.append(desiredLocations);
		builder.append("\n\tdisability: ");
		builder.append(disability);
		builder.append("\n\teducationDegree: ");
		builder.append(educationDegree);
		builder.append("\n\teducations: ");
		builder.append(educations);
		builder.append("\n\temail: ");
		builder.append(email);
		builder.append("\n\temail2: ");
		builder.append(email2);
		builder.append("\n\temail3: ");
		builder.append(email3);
		builder.append("\n\temployeeType: ");
		builder.append(employeeType);
		builder.append("\n\temploymentPreference: ");
		builder.append(employmentPreference);
		builder.append("\n\tethnicity: ");
		builder.append(ethnicity);
		builder.append("\n\texperience: ");
		builder.append(experience);
		builder.append("\n\texternalID: ");
		builder.append(externalID);
		builder.append("\n\tfax: ");
		builder.append(fax);
		builder.append("\n\tfax2: ");
		builder.append(fax2);
		builder.append("\n\tfax3: ");
		builder.append(fax3);
		builder.append("\n\tfederalAddtionalWitholdingsAmount: ");
		builder.append(federalAddtionalWitholdingsAmount);
		builder.append("\n\tfederalExemptions: ");
		builder.append(federalExemptions);
		builder.append("\n\tfederalFilingStatus: ");
		builder.append(federalFilingStatus);
		builder.append("\n\tfileAttachments: ");
		builder.append(fileAttachments);
		builder.append("\n\tfirstName: ");
		builder.append(firstName);
		builder.append("\n\tgender: ");
		builder.append(gender);
		builder.append("\n\thourlyRate: ");
		builder.append(hourlyRate);
		builder.append("\n\thourlyRateLow: ");
		builder.append(hourlyRateLow);
		builder.append("\n\tinterviews: ");
		builder.append(interviews);
		builder.append("\n\ti9OnFile: ");
		builder.append(i9OnFile);
		builder.append("\n\tisDayLightSavings: ");
		builder.append(isDayLightSavings);
		builder.append("\n\tisDeleted: ");
		builder.append(isDeleted);
		builder.append("\n\tisEditable: ");
		builder.append(isEditable);
		builder.append("\n\tisLockedOut: ");
		builder.append(isLockedOut);
		builder.append("\n\tlastName: ");
		builder.append(lastName);
		builder.append("\n\tlinkedPerson: ");
		builder.append(linkedPerson);
		builder.append("\n\tlocalAddtionalWitholdingsAmount: ");
		builder.append(localAddtionalWitholdingsAmount);
		builder.append("\n\tlocalExemptions: ");
		builder.append(localExemptions);
		builder.append("\n\tlocalFilingStatus: ");
		builder.append(localFilingStatus);
		builder.append("\n\tlocalTaxCode: ");
		builder.append(localTaxCode);
		builder.append("\n\tmassMailOptOut: ");
		builder.append(massMailOptOut);
		builder.append("\n\tmiddleName: ");
		builder.append(middleName);
		builder.append("\n\tmigrateGUID: ");
		builder.append(migrateGUID);
		builder.append("\n\tmobile: ");
		builder.append(mobile);
		builder.append("\n\tname: ");
		builder.append(name);
		builder.append("\n\tnamePrefix: ");
		builder.append(namePrefix);
		builder.append("\n\tnameSuffix: ");
		builder.append(nameSuffix);
		builder.append("\n\tnickName: ");
		builder.append(nickName);
		builder.append("\n\tnotes: ");
		builder.append(notes);
		builder.append("\n\tnumCategories: ");
		builder.append(numCategories);
		builder.append("\n\tnumOwners: ");
		builder.append(numOwners);
		builder.append("\n\toccupation: ");
		builder.append(occupation);
		builder.append("\n\towner: ");
		builder.append(owner);
		builder.append("\n\tpager: ");
		builder.append(pager);
		builder.append("\n\tpaperWorkOnFile: ");
		builder.append(paperWorkOnFile);
		builder.append("\n\tpassword: ");
		builder.append(password);
		builder.append("\n\tphone: ");
		builder.append(phone);
		builder.append("\n\tphone2: ");
		builder.append(phone2);
		builder.append("\n\tphone3: ");
		builder.append(phone3);
		builder.append("\n\tplacements: ");
		builder.append(placements);
		builder.append("\n\tpreferredContact: ");
		builder.append(preferredContact);
		builder.append("\n\tprimarySkills: ");
		builder.append(primarySkills);
		builder.append("\n\trecentClientList: ");
		builder.append(recentClientList);
		builder.append("\n\treferredBy: ");
		builder.append(referredBy);
		builder.append("\n\treferredByPerson: ");
		builder.append(referredByPerson);
		builder.append("\n\treferences: ");
		builder.append(references);
		builder.append("\n\tsalary: ");
		builder.append(salary);
		builder.append("\n\tsalaryLow: ");
		builder.append(salaryLow);
		builder.append("\n\tsecondaryAddress: ");
		builder.append(secondaryAddress);
		builder.append("\n\tsecondaryOwners: ");
		builder.append(secondaryOwners);
		builder.append("\n\tsecondarySkills: ");
		builder.append(secondarySkills);
		builder.append("\n\tsendouts: ");
		builder.append(sendouts);
		builder.append("\n\tskillSet: ");
		builder.append(skillSet);
		builder.append("\n\tsmsOptIn: ");
		builder.append(smsOptIn);
		builder.append("\n\tsource: ");
		builder.append(source);
		builder.append("\n\tspecialties: ");
		builder.append(specialties);
		builder.append("\n\tssn: ");
		builder.append(ssn);
		builder.append("\n\tstateAddtionalWitholdingsAmount: ");
		builder.append(stateAddtionalWitholdingsAmount);
		builder.append("\n\tstateExemptions: ");
		builder.append(stateExemptions);
		builder.append("\n\tstateFilingStatus: ");
		builder.append(stateFilingStatus);
		builder.append("\n\tstatus: ");
		builder.append(status);
		builder.append("\n\tsubmissions: ");
		builder.append(submissions);
		builder.append("\n\ttasks: ");
		builder.append(tasks);
		builder.append("\n\ttaxID: ");
		builder.append(taxID);
		builder.append("\n\ttaxState: ");
		builder.append(taxState);
		builder.append("\n\ttimeZoneOffsetEST: ");
		builder.append(timeZoneOffsetEST);
		builder.append("\n\ttravelLimit: ");
		builder.append(travelLimit);
		builder.append("\n\ttype: ");
		builder.append(type);
		builder.append("\n\tusername: ");
		builder.append(username);
		builder.append("\n\tveteran: ");
		builder.append(veteran);
		builder.append("\n\twebResponses: ");
		builder.append(webResponses);
		builder.append("\n\twillRelocate: ");
		builder.append(willRelocate);
		builder.append("\n\tworkAuthorized: ");
		builder.append(workAuthorized);
		builder.append("\n\tworkHistories: ");
		builder.append(workHistories);
		builder.append("\n\tworkPhone: ");
		builder.append(workPhone);
		builder.append("\n}");
		return builder.toString();
	}

}
