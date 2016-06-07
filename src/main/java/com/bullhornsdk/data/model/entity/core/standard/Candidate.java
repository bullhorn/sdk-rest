package com.bullhornsdk.data.model.entity.core.standard;

import java.math.BigDecimal;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.joda.time.DateTime;

import com.bullhornsdk.data.api.helper.RestOneToManySerializer;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance9;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.EditHistoryEntity;
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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "address", "businessSectors", "categories", "category", "certificationList", "certifications",
		"clientCorporationBlackList", "clientCorporationWhiteList", "comments", "companyName", "companyURL", "customDate1", "customDate2",
		"customDate3", "customFloat1", "customFloat2", "customFloat3", "customInt1", "customInt2", "customInt3", "customText1",
		"customText10", "customText11", "customText12", "customText13", "customText14", "customText15", "customText16", "customText17",
		"customText18", "customText19", "customText2", "customText20", "customText3", "customText4", "customText5", "customText6",
		"customText7", "customText8", "customText9", "customTextBlock1", "customTextBlock2", "customTextBlock3", "customTextBlock4",
		"customTextBlock5", "dateAdded", "dateAvailable", "dateAvailableEnd", "dateI9Expiration", "dateLastComment", "dateLastModified", "dateNextCall",
		"dateOfBirth", "dayRate", "dayRateLow", "degreeList", "description", "desiredLocations", "disability", "educationDegree",
		"educations", "email", "email2", "email3", "employeeType", "employmentPreference", "ethnicity", "experience", "externalID", "fax",
		"fax2", "fax3", "federalAddtionalWitholdingsAmount", "federalExemptions", "federalFilingStatus", "fileAttachments", "firstName",
		"gender", "hourlyRate", "hourlyRateLow", "i9OnFile", "isDayLightSavings", "isDeleted", "isEditable", "isLockedOut", "interviews",
		"lastName", "linkedPerson", "leads", "localAddtionalWitholdingsAmount", "localExemptions", "localFilingStatus", "localTaxCode",
		"massMailOptOut", "middleName", "migrateGUID", "mobile", "name", "namePrefix", "nameSuffix", "nickName", "notes", "numCategories",
		"numOwners", "occupation", "owner", "pager", "paperWorkOnFile", "password", "phone", "phone2", "phone3", "placements",
		"preferredContact", "primarySkills", "recentClientList", "referredBy", "referredByPerson", "references", "salary", "salaryLow",
		"secondaryAddress", "secondaryOwners", "secondarySkills", "sendouts", "skillSet", "smsOptIn", "source", "specialties",
		"submissions", "ssn", "stateAddtionalWitholdingsAmount", "stateExemptions", "stateFilingStatus", "status", "tasks", "taxID",
		"taxState", "tearsheets", "timeZoneOffsetEST", "travelLimit", "type", "username", "veteran", "webResponses", "willRelocate", "workAuthorized",
		"workHistories", "workPhone", "customObject1s", "customObject2s", "customObject3s", "customObject4s", "customObject5s", "customObject6s",
        "customObject7s", "customObject8s", "customObject9s", "customObject10s" })
public class Candidate extends CustomFieldsB implements SearchEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, FileEntity,
		AssociationEntity, DateLastModifiedEntity, EditHistoryEntity {

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

	private DateTime dateLastModified;

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

	private OneToMany<Lead> leads;

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

	private OneToMany<Tearsheet> tearsheets;

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

    private OneToMany<PersonCustomObjectInstance1> customObject1s;

    private OneToMany<PersonCustomObjectInstance2> customObject2s;

    private OneToMany<PersonCustomObjectInstance3> customObject3s;

    private OneToMany<PersonCustomObjectInstance4> customObject4s;

    private OneToMany<PersonCustomObjectInstance5> customObject5s;

    private OneToMany<PersonCustomObjectInstance6> customObject6s;

    private OneToMany<PersonCustomObjectInstance7> customObject7s;

    private OneToMany<PersonCustomObjectInstance8> customObject8s;

    private OneToMany<PersonCustomObjectInstance9> customObject9s;

    private OneToMany<PersonCustomObjectInstance10> customObject10s;

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

	@Override
	public Candidate instantiateForInsert() {
		Candidate entity = new Candidate();
		entity.setCategory(new Category(512973));
		entity.setComments("New lead candidate");
		entity.setEmployeeType("W2");
		entity.setIsDeleted(Boolean.FALSE);
		entity.setIsEditable(Boolean.TRUE);
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

	@JsonIgnore
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

	@JsonProperty("dateLastModified")
	public DateTime getDateLastModified() {
		return dateLastModified;
	}

	@JsonProperty("dateLastModified")
	public void setDateLastModified(DateTime dateLastModified) {
		this.dateLastModified = dateLastModified;
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

	@JsonProperty("leads")
	public OneToMany<Lead> getLeads() {
		return leads;
	}

	@JsonProperty("leads")
	public void setLeads(OneToMany<Lead> leads) {
		this.leads = leads;
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

	@JsonProperty("tearsheets")
	public OneToMany<Tearsheet> getTearsheets() {
		return tearsheets;
	}

	@JsonProperty("tearsheets")
	public void setTearsheets(OneToMany<Tearsheet> tearsheets) {
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

    @JsonProperty("customObject1s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance1> getCustomObject1s() {
        return customObject1s;
    }

    @JsonProperty("customObject1s")
    public void setCustomObject1s(OneToMany<PersonCustomObjectInstance1> customObject1s) {
        this.customObject1s = customObject1s;
    }

    @JsonProperty("customObject2s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance2> getCustomObject2s() {
        return customObject2s;
    }

    @JsonProperty("customObject2s")
    public void setCustomObject2s(OneToMany<PersonCustomObjectInstance2> customObject2s) {
        this.customObject2s = customObject2s;
    }

    @JsonProperty("customObject3s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance3> getCustomObject3s() {
        return customObject3s;
    }

    @JsonProperty("customObject3s")
    public void setCustomObject3s(OneToMany<PersonCustomObjectInstance3> customObject3s) {
        this.customObject3s = customObject3s;
    }

    @JsonProperty("customObject4s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance4> getCustomObject4s() {
        return customObject4s;
    }

    @JsonProperty("customObject4s")
    public void setCustomObject4s(OneToMany<PersonCustomObjectInstance4> customObject4s) {
        this.customObject4s = customObject4s;
    }

    @JsonProperty("customObject5s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance5> getCustomObject5s() {
        return customObject5s;
    }

    @JsonProperty("customObject5s")
    public void setCustomObject5s(OneToMany<PersonCustomObjectInstance5> customObject5s) {
        this.customObject5s = customObject5s;
    }

    @JsonProperty("customObject6s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance6> getCustomObject6s() {
        return customObject6s;
    }

    @JsonProperty("customObject6s")
    public void setCustomObject6s(OneToMany<PersonCustomObjectInstance6> customObject6s) {
        this.customObject6s = customObject6s;
    }

    @JsonProperty("customObject7s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance7> getCustomObject7s() {
        return customObject7s;
    }

    @JsonProperty("customObject7s")
    public void setCustomObject7s(OneToMany<PersonCustomObjectInstance7> customObject7s) {
        this.customObject7s = customObject7s;
    }

    @JsonProperty("customObject8s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance8> getCustomObject8s() {
        return customObject8s;
    }

    @JsonProperty("customObject8s")
    public void setCustomObject8s(OneToMany<PersonCustomObjectInstance8> customObject8s) {
        this.customObject8s = customObject8s;
    }

    @JsonProperty("customObject9s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance9> getCustomObject9s() {
        return customObject9s;
    }

    @JsonProperty("customObject9s")
    public void setCustomObject9s(OneToMany<PersonCustomObjectInstance9> customObject9s) {
        this.customObject9s = customObject9s;
    }

    @JsonProperty("customObject10s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance10> getCustomObject10s() {
        return customObject10s;
    }

    @JsonProperty("customObject10s")
    public void setCustomObject10s(OneToMany<PersonCustomObjectInstance10> customObject10s) {
        this.customObject10s = customObject10s;
    }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		Candidate candidate = (Candidate) o;

		if (luceneScore != null ? !luceneScore.equals(candidate.luceneScore) : candidate.luceneScore != null)
			return false;
		if (id != null ? !id.equals(candidate.id) : candidate.id != null) return false;
		if (address != null ? !address.equals(candidate.address) : candidate.address != null) return false;
		if (businessSectors != null ? !businessSectors.equals(candidate.businessSectors) : candidate.businessSectors != null)
			return false;
		if (categories != null ? !categories.equals(candidate.categories) : candidate.categories != null) return false;
		if (category != null ? !category.equals(candidate.category) : candidate.category != null) return false;
		if (certificationList != null ? !certificationList.equals(candidate.certificationList) : candidate.certificationList != null)
			return false;
		if (certifications != null ? !certifications.equals(candidate.certifications) : candidate.certifications != null)
			return false;
		if (clientCorporationBlackList != null ? !clientCorporationBlackList.equals(candidate.clientCorporationBlackList) : candidate.clientCorporationBlackList != null)
			return false;
		if (clientCorporationWhiteList != null ? !clientCorporationWhiteList.equals(candidate.clientCorporationWhiteList) : candidate.clientCorporationWhiteList != null)
			return false;
		if (comments != null ? !comments.equals(candidate.comments) : candidate.comments != null) return false;
		if (companyName != null ? !companyName.equals(candidate.companyName) : candidate.companyName != null)
			return false;
		if (companyURL != null ? !companyURL.equals(candidate.companyURL) : candidate.companyURL != null) return false;
		if (dateAdded != null ? !dateAdded.equals(candidate.dateAdded) : candidate.dateAdded != null) return false;
		if (dateAvailable != null ? !dateAvailable.equals(candidate.dateAvailable) : candidate.dateAvailable != null)
			return false;
		if (dateAvailableEnd != null ? !dateAvailableEnd.equals(candidate.dateAvailableEnd) : candidate.dateAvailableEnd != null)
			return false;
		if (dateI9Expiration != null ? !dateI9Expiration.equals(candidate.dateI9Expiration) : candidate.dateI9Expiration != null)
			return false;
		if (dateLastComment != null ? !dateLastComment.equals(candidate.dateLastComment) : candidate.dateLastComment != null)
			return false;
		if (dateLastModified != null ? !dateLastModified.equals(candidate.dateLastModified) : candidate.dateLastModified != null)
			return false;
		if (dateNextCall != null ? !dateNextCall.equals(candidate.dateNextCall) : candidate.dateNextCall != null)
			return false;
		if (dateOfBirth != null ? !dateOfBirth.equals(candidate.dateOfBirth) : candidate.dateOfBirth != null)
			return false;
		if (dayRate != null ? !dayRate.equals(candidate.dayRate) : candidate.dayRate != null) return false;
		if (dayRateLow != null ? !dayRateLow.equals(candidate.dayRateLow) : candidate.dayRateLow != null) return false;
		if (degreeList != null ? !degreeList.equals(candidate.degreeList) : candidate.degreeList != null) return false;
		if (description != null ? !description.equals(candidate.description) : candidate.description != null)
			return false;
		if (desiredLocations != null ? !desiredLocations.equals(candidate.desiredLocations) : candidate.desiredLocations != null)
			return false;
		if (disability != null ? !disability.equals(candidate.disability) : candidate.disability != null) return false;
		if (educationDegree != null ? !educationDegree.equals(candidate.educationDegree) : candidate.educationDegree != null)
			return false;
		if (educations != null ? !educations.equals(candidate.educations) : candidate.educations != null) return false;
		if (email != null ? !email.equals(candidate.email) : candidate.email != null) return false;
		if (email2 != null ? !email2.equals(candidate.email2) : candidate.email2 != null) return false;
		if (email3 != null ? !email3.equals(candidate.email3) : candidate.email3 != null) return false;
		if (employeeType != null ? !employeeType.equals(candidate.employeeType) : candidate.employeeType != null)
			return false;
		if (employmentPreference != null ? !employmentPreference.equals(candidate.employmentPreference) : candidate.employmentPreference != null)
			return false;
		if (ethnicity != null ? !ethnicity.equals(candidate.ethnicity) : candidate.ethnicity != null) return false;
		if (experience != null ? !experience.equals(candidate.experience) : candidate.experience != null) return false;
		if (externalID != null ? !externalID.equals(candidate.externalID) : candidate.externalID != null) return false;
		if (fax != null ? !fax.equals(candidate.fax) : candidate.fax != null) return false;
		if (fax2 != null ? !fax2.equals(candidate.fax2) : candidate.fax2 != null) return false;
		if (fax3 != null ? !fax3.equals(candidate.fax3) : candidate.fax3 != null) return false;
		if (federalAddtionalWitholdingsAmount != null ? !federalAddtionalWitholdingsAmount.equals(candidate.federalAddtionalWitholdingsAmount) : candidate.federalAddtionalWitholdingsAmount != null)
			return false;
		if (federalExemptions != null ? !federalExemptions.equals(candidate.federalExemptions) : candidate.federalExemptions != null)
			return false;
		if (federalFilingStatus != null ? !federalFilingStatus.equals(candidate.federalFilingStatus) : candidate.federalFilingStatus != null)
			return false;
		if (fileAttachments != null ? !fileAttachments.equals(candidate.fileAttachments) : candidate.fileAttachments != null)
			return false;
		if (firstName != null ? !firstName.equals(candidate.firstName) : candidate.firstName != null) return false;
		if (gender != null ? !gender.equals(candidate.gender) : candidate.gender != null) return false;
		if (hourlyRate != null ? !hourlyRate.equals(candidate.hourlyRate) : candidate.hourlyRate != null) return false;
		if (hourlyRateLow != null ? !hourlyRateLow.equals(candidate.hourlyRateLow) : candidate.hourlyRateLow != null)
			return false;
		if (interviews != null ? !interviews.equals(candidate.interviews) : candidate.interviews != null) return false;
		if (i9OnFile != null ? !i9OnFile.equals(candidate.i9OnFile) : candidate.i9OnFile != null) return false;
		if (isDayLightSavings != null ? !isDayLightSavings.equals(candidate.isDayLightSavings) : candidate.isDayLightSavings != null)
			return false;
		if (isDeleted != null ? !isDeleted.equals(candidate.isDeleted) : candidate.isDeleted != null) return false;
		if (isEditable != null ? !isEditable.equals(candidate.isEditable) : candidate.isEditable != null) return false;
		if (isLockedOut != null ? !isLockedOut.equals(candidate.isLockedOut) : candidate.isLockedOut != null)
			return false;
		if (lastName != null ? !lastName.equals(candidate.lastName) : candidate.lastName != null) return false;
		if (linkedPerson != null ? !linkedPerson.equals(candidate.linkedPerson) : candidate.linkedPerson != null)
			return false;
		if (leads != null ? !leads.equals(candidate.leads) : candidate.leads != null) return false;
		if (localAddtionalWitholdingsAmount != null ? !localAddtionalWitholdingsAmount.equals(candidate.localAddtionalWitholdingsAmount) : candidate.localAddtionalWitholdingsAmount != null)
			return false;
		if (localExemptions != null ? !localExemptions.equals(candidate.localExemptions) : candidate.localExemptions != null)
			return false;
		if (localFilingStatus != null ? !localFilingStatus.equals(candidate.localFilingStatus) : candidate.localFilingStatus != null)
			return false;
		if (localTaxCode != null ? !localTaxCode.equals(candidate.localTaxCode) : candidate.localTaxCode != null)
			return false;
		if (massMailOptOut != null ? !massMailOptOut.equals(candidate.massMailOptOut) : candidate.massMailOptOut != null)
			return false;
		if (middleName != null ? !middleName.equals(candidate.middleName) : candidate.middleName != null) return false;
		if (migrateGUID != null ? !migrateGUID.equals(candidate.migrateGUID) : candidate.migrateGUID != null)
			return false;
		if (mobile != null ? !mobile.equals(candidate.mobile) : candidate.mobile != null) return false;
		if (name != null ? !name.equals(candidate.name) : candidate.name != null) return false;
		if (namePrefix != null ? !namePrefix.equals(candidate.namePrefix) : candidate.namePrefix != null) return false;
		if (nameSuffix != null ? !nameSuffix.equals(candidate.nameSuffix) : candidate.nameSuffix != null) return false;
		if (nickName != null ? !nickName.equals(candidate.nickName) : candidate.nickName != null) return false;
		if (notes != null ? !notes.equals(candidate.notes) : candidate.notes != null) return false;
		if (numCategories != null ? !numCategories.equals(candidate.numCategories) : candidate.numCategories != null)
			return false;
		if (numOwners != null ? !numOwners.equals(candidate.numOwners) : candidate.numOwners != null) return false;
		if (occupation != null ? !occupation.equals(candidate.occupation) : candidate.occupation != null) return false;
		if (owner != null ? !owner.equals(candidate.owner) : candidate.owner != null) return false;
		if (pager != null ? !pager.equals(candidate.pager) : candidate.pager != null) return false;
		if (paperWorkOnFile != null ? !paperWorkOnFile.equals(candidate.paperWorkOnFile) : candidate.paperWorkOnFile != null)
			return false;
		if (password != null ? !password.equals(candidate.password) : candidate.password != null) return false;
		if (phone != null ? !phone.equals(candidate.phone) : candidate.phone != null) return false;
		if (phone2 != null ? !phone2.equals(candidate.phone2) : candidate.phone2 != null) return false;
		if (phone3 != null ? !phone3.equals(candidate.phone3) : candidate.phone3 != null) return false;
		if (placements != null ? !placements.equals(candidate.placements) : candidate.placements != null) return false;
		if (preferredContact != null ? !preferredContact.equals(candidate.preferredContact) : candidate.preferredContact != null)
			return false;
		if (primarySkills != null ? !primarySkills.equals(candidate.primarySkills) : candidate.primarySkills != null)
			return false;
		if (recentClientList != null ? !recentClientList.equals(candidate.recentClientList) : candidate.recentClientList != null)
			return false;
		if (referredBy != null ? !referredBy.equals(candidate.referredBy) : candidate.referredBy != null) return false;
		if (referredByPerson != null ? !referredByPerson.equals(candidate.referredByPerson) : candidate.referredByPerson != null)
			return false;
		if (references != null ? !references.equals(candidate.references) : candidate.references != null) return false;
		if (salary != null ? !salary.equals(candidate.salary) : candidate.salary != null) return false;
		if (salaryLow != null ? !salaryLow.equals(candidate.salaryLow) : candidate.salaryLow != null) return false;
		if (secondaryAddress != null ? !secondaryAddress.equals(candidate.secondaryAddress) : candidate.secondaryAddress != null)
			return false;
		if (secondaryOwners != null ? !secondaryOwners.equals(candidate.secondaryOwners) : candidate.secondaryOwners != null)
			return false;
		if (secondarySkills != null ? !secondarySkills.equals(candidate.secondarySkills) : candidate.secondarySkills != null)
			return false;
		if (sendouts != null ? !sendouts.equals(candidate.sendouts) : candidate.sendouts != null) return false;
		if (skillSet != null ? !skillSet.equals(candidate.skillSet) : candidate.skillSet != null) return false;
		if (smsOptIn != null ? !smsOptIn.equals(candidate.smsOptIn) : candidate.smsOptIn != null) return false;
		if (source != null ? !source.equals(candidate.source) : candidate.source != null) return false;
		if (specialties != null ? !specialties.equals(candidate.specialties) : candidate.specialties != null)
			return false;
		if (ssn != null ? !ssn.equals(candidate.ssn) : candidate.ssn != null) return false;
		if (stateAddtionalWitholdingsAmount != null ? !stateAddtionalWitholdingsAmount.equals(candidate.stateAddtionalWitholdingsAmount) : candidate.stateAddtionalWitholdingsAmount != null)
			return false;
		if (stateExemptions != null ? !stateExemptions.equals(candidate.stateExemptions) : candidate.stateExemptions != null)
			return false;
		if (stateFilingStatus != null ? !stateFilingStatus.equals(candidate.stateFilingStatus) : candidate.stateFilingStatus != null)
			return false;
		if (status != null ? !status.equals(candidate.status) : candidate.status != null) return false;
		if (submissions != null ? !submissions.equals(candidate.submissions) : candidate.submissions != null)
			return false;
		if (tasks != null ? !tasks.equals(candidate.tasks) : candidate.tasks != null) return false;
		if (taxID != null ? !taxID.equals(candidate.taxID) : candidate.taxID != null) return false;
		if (taxState != null ? !taxState.equals(candidate.taxState) : candidate.taxState != null) return false;
		if (tearsheets != null ? !tearsheets.equals(candidate.tearsheets) : candidate.tearsheets != null) return false;
		if (timeZoneOffsetEST != null ? !timeZoneOffsetEST.equals(candidate.timeZoneOffsetEST) : candidate.timeZoneOffsetEST != null)
			return false;
		if (travelLimit != null ? !travelLimit.equals(candidate.travelLimit) : candidate.travelLimit != null)
			return false;
		if (type != null ? !type.equals(candidate.type) : candidate.type != null) return false;
		if (username != null ? !username.equals(candidate.username) : candidate.username != null) return false;
		if (veteran != null ? !veteran.equals(candidate.veteran) : candidate.veteran != null) return false;
		if (webResponses != null ? !webResponses.equals(candidate.webResponses) : candidate.webResponses != null)
			return false;
		if (willRelocate != null ? !willRelocate.equals(candidate.willRelocate) : candidate.willRelocate != null)
			return false;
		if (workAuthorized != null ? !workAuthorized.equals(candidate.workAuthorized) : candidate.workAuthorized != null)
			return false;
		if (workHistories != null ? !workHistories.equals(candidate.workHistories) : candidate.workHistories != null)
			return false;
		if (customObject1s != null ? !customObject1s.equals(candidate.customObject1s) : candidate.customObject1s != null)
			return false;
		if (customObject2s != null ? !customObject2s.equals(candidate.customObject2s) : candidate.customObject2s != null)
			return false;
		if (customObject3s != null ? !customObject3s.equals(candidate.customObject3s) : candidate.customObject3s != null)
			return false;
		if (customObject4s != null ? !customObject4s.equals(candidate.customObject4s) : candidate.customObject4s != null)
			return false;
		if (customObject5s != null ? !customObject5s.equals(candidate.customObject5s) : candidate.customObject5s != null)
			return false;
		if (customObject6s != null ? !customObject6s.equals(candidate.customObject6s) : candidate.customObject6s != null)
			return false;
		if (customObject7s != null ? !customObject7s.equals(candidate.customObject7s) : candidate.customObject7s != null)
			return false;
		if (customObject8s != null ? !customObject8s.equals(candidate.customObject8s) : candidate.customObject8s != null)
			return false;
		if (customObject9s != null ? !customObject9s.equals(candidate.customObject9s) : candidate.customObject9s != null)
			return false;
		if (customObject10s != null ? !customObject10s.equals(candidate.customObject10s) : candidate.customObject10s != null)
			return false;
		return !(workPhone != null ? !workPhone.equals(candidate.workPhone) : candidate.workPhone != null);

	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (luceneScore != null ? luceneScore.hashCode() : 0);
		result = 31 * result + (id != null ? id.hashCode() : 0);
		result = 31 * result + (address != null ? address.hashCode() : 0);
		result = 31 * result + (businessSectors != null ? businessSectors.hashCode() : 0);
		result = 31 * result + (categories != null ? categories.hashCode() : 0);
		result = 31 * result + (category != null ? category.hashCode() : 0);
		result = 31 * result + (certificationList != null ? certificationList.hashCode() : 0);
		result = 31 * result + (certifications != null ? certifications.hashCode() : 0);
		result = 31 * result + (clientCorporationBlackList != null ? clientCorporationBlackList.hashCode() : 0);
		result = 31 * result + (clientCorporationWhiteList != null ? clientCorporationWhiteList.hashCode() : 0);
		result = 31 * result + (comments != null ? comments.hashCode() : 0);
		result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
		result = 31 * result + (companyURL != null ? companyURL.hashCode() : 0);
		result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
		result = 31 * result + (dateAvailable != null ? dateAvailable.hashCode() : 0);
		result = 31 * result + (dateAvailableEnd != null ? dateAvailableEnd.hashCode() : 0);
		result = 31 * result + (dateI9Expiration != null ? dateI9Expiration.hashCode() : 0);
		result = 31 * result + (dateLastComment != null ? dateLastComment.hashCode() : 0);
		result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
		result = 31 * result + (dateNextCall != null ? dateNextCall.hashCode() : 0);
		result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
		result = 31 * result + (dayRate != null ? dayRate.hashCode() : 0);
		result = 31 * result + (dayRateLow != null ? dayRateLow.hashCode() : 0);
		result = 31 * result + (degreeList != null ? degreeList.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (desiredLocations != null ? desiredLocations.hashCode() : 0);
		result = 31 * result + (disability != null ? disability.hashCode() : 0);
		result = 31 * result + (educationDegree != null ? educationDegree.hashCode() : 0);
		result = 31 * result + (educations != null ? educations.hashCode() : 0);
		result = 31 * result + (email != null ? email.hashCode() : 0);
		result = 31 * result + (email2 != null ? email2.hashCode() : 0);
		result = 31 * result + (email3 != null ? email3.hashCode() : 0);
		result = 31 * result + (employeeType != null ? employeeType.hashCode() : 0);
		result = 31 * result + (employmentPreference != null ? employmentPreference.hashCode() : 0);
		result = 31 * result + (ethnicity != null ? ethnicity.hashCode() : 0);
		result = 31 * result + (experience != null ? experience.hashCode() : 0);
		result = 31 * result + (externalID != null ? externalID.hashCode() : 0);
		result = 31 * result + (fax != null ? fax.hashCode() : 0);
		result = 31 * result + (fax2 != null ? fax2.hashCode() : 0);
		result = 31 * result + (fax3 != null ? fax3.hashCode() : 0);
		result = 31 * result + (federalAddtionalWitholdingsAmount != null ? federalAddtionalWitholdingsAmount.hashCode() : 0);
		result = 31 * result + (federalExemptions != null ? federalExemptions.hashCode() : 0);
		result = 31 * result + (federalFilingStatus != null ? federalFilingStatus.hashCode() : 0);
		result = 31 * result + (fileAttachments != null ? fileAttachments.hashCode() : 0);
		result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
		result = 31 * result + (gender != null ? gender.hashCode() : 0);
		result = 31 * result + (hourlyRate != null ? hourlyRate.hashCode() : 0);
		result = 31 * result + (hourlyRateLow != null ? hourlyRateLow.hashCode() : 0);
		result = 31 * result + (interviews != null ? interviews.hashCode() : 0);
		result = 31 * result + (i9OnFile != null ? i9OnFile.hashCode() : 0);
		result = 31 * result + (isDayLightSavings != null ? isDayLightSavings.hashCode() : 0);
		result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
		result = 31 * result + (isEditable != null ? isEditable.hashCode() : 0);
		result = 31 * result + (isLockedOut != null ? isLockedOut.hashCode() : 0);
		result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
		result = 31 * result + (linkedPerson != null ? linkedPerson.hashCode() : 0);
		result = 31 * result + (leads != null ? leads.hashCode() : 0);
		result = 31 * result + (localAddtionalWitholdingsAmount != null ? localAddtionalWitholdingsAmount.hashCode() : 0);
		result = 31 * result + (localExemptions != null ? localExemptions.hashCode() : 0);
		result = 31 * result + (localFilingStatus != null ? localFilingStatus.hashCode() : 0);
		result = 31 * result + (localTaxCode != null ? localTaxCode.hashCode() : 0);
		result = 31 * result + (massMailOptOut != null ? massMailOptOut.hashCode() : 0);
		result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
		result = 31 * result + (migrateGUID != null ? migrateGUID.hashCode() : 0);
		result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (namePrefix != null ? namePrefix.hashCode() : 0);
		result = 31 * result + (nameSuffix != null ? nameSuffix.hashCode() : 0);
		result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
		result = 31 * result + (notes != null ? notes.hashCode() : 0);
		result = 31 * result + (numCategories != null ? numCategories.hashCode() : 0);
		result = 31 * result + (numOwners != null ? numOwners.hashCode() : 0);
		result = 31 * result + (occupation != null ? occupation.hashCode() : 0);
		result = 31 * result + (owner != null ? owner.hashCode() : 0);
		result = 31 * result + (pager != null ? pager.hashCode() : 0);
		result = 31 * result + (paperWorkOnFile != null ? paperWorkOnFile.hashCode() : 0);
		result = 31 * result + (password != null ? password.hashCode() : 0);
		result = 31 * result + (phone != null ? phone.hashCode() : 0);
		result = 31 * result + (phone2 != null ? phone2.hashCode() : 0);
		result = 31 * result + (phone3 != null ? phone3.hashCode() : 0);
		result = 31 * result + (placements != null ? placements.hashCode() : 0);
		result = 31 * result + (preferredContact != null ? preferredContact.hashCode() : 0);
		result = 31 * result + (primarySkills != null ? primarySkills.hashCode() : 0);
		result = 31 * result + (recentClientList != null ? recentClientList.hashCode() : 0);
		result = 31 * result + (referredBy != null ? referredBy.hashCode() : 0);
		result = 31 * result + (referredByPerson != null ? referredByPerson.hashCode() : 0);
		result = 31 * result + (references != null ? references.hashCode() : 0);
		result = 31 * result + (salary != null ? salary.hashCode() : 0);
		result = 31 * result + (salaryLow != null ? salaryLow.hashCode() : 0);
		result = 31 * result + (secondaryAddress != null ? secondaryAddress.hashCode() : 0);
		result = 31 * result + (secondaryOwners != null ? secondaryOwners.hashCode() : 0);
		result = 31 * result + (secondarySkills != null ? secondarySkills.hashCode() : 0);
		result = 31 * result + (sendouts != null ? sendouts.hashCode() : 0);
		result = 31 * result + (skillSet != null ? skillSet.hashCode() : 0);
		result = 31 * result + (smsOptIn != null ? smsOptIn.hashCode() : 0);
		result = 31 * result + (source != null ? source.hashCode() : 0);
		result = 31 * result + (specialties != null ? specialties.hashCode() : 0);
		result = 31 * result + (ssn != null ? ssn.hashCode() : 0);
		result = 31 * result + (stateAddtionalWitholdingsAmount != null ? stateAddtionalWitholdingsAmount.hashCode() : 0);
		result = 31 * result + (stateExemptions != null ? stateExemptions.hashCode() : 0);
		result = 31 * result + (stateFilingStatus != null ? stateFilingStatus.hashCode() : 0);
		result = 31 * result + (status != null ? status.hashCode() : 0);
		result = 31 * result + (submissions != null ? submissions.hashCode() : 0);
		result = 31 * result + (tasks != null ? tasks.hashCode() : 0);
		result = 31 * result + (taxID != null ? taxID.hashCode() : 0);
		result = 31 * result + (taxState != null ? taxState.hashCode() : 0);
		result = 31 * result + (tearsheets != null ? tearsheets.hashCode() : 0);
		result = 31 * result + (timeZoneOffsetEST != null ? timeZoneOffsetEST.hashCode() : 0);
		result = 31 * result + (travelLimit != null ? travelLimit.hashCode() : 0);
		result = 31 * result + (type != null ? type.hashCode() : 0);
		result = 31 * result + (username != null ? username.hashCode() : 0);
		result = 31 * result + (veteran != null ? veteran.hashCode() : 0);
		result = 31 * result + (webResponses != null ? webResponses.hashCode() : 0);
		result = 31 * result + (willRelocate != null ? willRelocate.hashCode() : 0);
		result = 31 * result + (workAuthorized != null ? workAuthorized.hashCode() : 0);
		result = 31 * result + (workHistories != null ? workHistories.hashCode() : 0);
		result = 31 * result + (customObject1s != null ? customObject1s.hashCode() : 0);
		result = 31 * result + (customObject2s != null ? customObject2s.hashCode() : 0);
		result = 31 * result + (customObject3s != null ? customObject3s.hashCode() : 0);
		result = 31 * result + (customObject4s != null ? customObject4s.hashCode() : 0);
		result = 31 * result + (customObject5s != null ? customObject5s.hashCode() : 0);
		result = 31 * result + (customObject6s != null ? customObject6s.hashCode() : 0);
		result = 31 * result + (customObject7s != null ? customObject7s.hashCode() : 0);
		result = 31 * result + (customObject8s != null ? customObject8s.hashCode() : 0);
		result = 31 * result + (customObject9s != null ? customObject9s.hashCode() : 0);
		result = 31 * result + (customObject10s != null ? customObject10s.hashCode() : 0);
		result = 31 * result + (workPhone != null ? workPhone.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Candidate{" +
				"luceneScore=" + luceneScore +
				", id=" + id +
				", address=" + address +
				", businessSectors=" + businessSectors +
				", categories=" + categories +
				", category=" + category +
				", certificationList=" + certificationList +
				", certifications='" + certifications + '\'' +
				", clientCorporationBlackList=" + clientCorporationBlackList +
				", clientCorporationWhiteList=" + clientCorporationWhiteList +
				", comments='" + comments + '\'' +
				", companyName='" + companyName + '\'' +
				", companyURL='" + companyURL + '\'' +
				", dateAdded=" + dateAdded +
				", dateAvailable=" + dateAvailable +
				", dateAvailableEnd=" + dateAvailableEnd +
				", dateI9Expiration=" + dateI9Expiration +
				", dateLastComment=" + dateLastComment +
				", dateLastModified=" + dateLastModified +
				", dateNextCall=" + dateNextCall +
				", dateOfBirth=" + dateOfBirth +
				", dayRate=" + dayRate +
				", dayRateLow=" + dayRateLow +
				", degreeList='" + degreeList + '\'' +
				", description='" + description + '\'' +
				", desiredLocations='" + desiredLocations + '\'' +
				", disability='" + disability + '\'' +
				", educationDegree='" + educationDegree + '\'' +
				", educations=" + educations +
				", email='" + email + '\'' +
				", email2='" + email2 + '\'' +
				", email3='" + email3 + '\'' +
				", employeeType='" + employeeType + '\'' +
				", employmentPreference='" + employmentPreference + '\'' +
				", ethnicity='" + ethnicity + '\'' +
				", experience=" + experience +
				", externalID='" + externalID + '\'' +
				", fax='" + fax + '\'' +
				", fax2='" + fax2 + '\'' +
				", fax3='" + fax3 + '\'' +
				", federalAddtionalWitholdingsAmount=" + federalAddtionalWitholdingsAmount +
				", federalExemptions=" + federalExemptions +
				", federalFilingStatus='" + federalFilingStatus + '\'' +
				", fileAttachments=" + fileAttachments +
				", firstName='" + firstName + '\'' +
				", gender='" + gender + '\'' +
				", hourlyRate=" + hourlyRate +
				", hourlyRateLow=" + hourlyRateLow +
				", interviews=" + interviews +
				", i9OnFile=" + i9OnFile +
				", isDayLightSavings=" + isDayLightSavings +
				", isDeleted=" + isDeleted +
				", isEditable=" + isEditable +
				", isLockedOut=" + isLockedOut +
				", lastName='" + lastName + '\'' +
				", linkedPerson=" + linkedPerson +
				", leads=" + leads +
				", localAddtionalWitholdingsAmount=" + localAddtionalWitholdingsAmount +
				", localExemptions=" + localExemptions +
				", localFilingStatus='" + localFilingStatus + '\'' +
				", localTaxCode='" + localTaxCode + '\'' +
				", massMailOptOut=" + massMailOptOut +
				", middleName='" + middleName + '\'' +
				", migrateGUID=" + migrateGUID +
				", mobile='" + mobile + '\'' +
				", name='" + name + '\'' +
				", namePrefix='" + namePrefix + '\'' +
				", nameSuffix='" + nameSuffix + '\'' +
				", nickName='" + nickName + '\'' +
				", notes=" + notes +
				", numCategories=" + numCategories +
				", numOwners=" + numOwners +
				", occupation='" + occupation + '\'' +
				", owner=" + owner +
				", pager='" + pager + '\'' +
				", paperWorkOnFile='" + paperWorkOnFile + '\'' +
				", password='" + password + '\'' +
				", phone='" + phone + '\'' +
				", phone2='" + phone2 + '\'' +
				", phone3='" + phone3 + '\'' +
				", placements=" + placements +
				", preferredContact='" + preferredContact + '\'' +
				", primarySkills=" + primarySkills +
				", recentClientList='" + recentClientList + '\'' +
				", referredBy='" + referredBy + '\'' +
				", referredByPerson=" + referredByPerson +
				", references=" + references +
				", salary=" + salary +
				", salaryLow=" + salaryLow +
				", secondaryAddress=" + secondaryAddress +
				", secondaryOwners=" + secondaryOwners +
				", secondarySkills=" + secondarySkills +
				", sendouts=" + sendouts +
				", skillSet='" + skillSet + '\'' +
				", smsOptIn=" + smsOptIn +
				", source='" + source + '\'' +
				", specialties=" + specialties +
				", ssn='" + ssn + '\'' +
				", stateAddtionalWitholdingsAmount=" + stateAddtionalWitholdingsAmount +
				", stateExemptions=" + stateExemptions +
				", stateFilingStatus='" + stateFilingStatus + '\'' +
				", status='" + status + '\'' +
				", submissions=" + submissions +
				", tasks=" + tasks +
				", taxID='" + taxID + '\'' +
				", taxState='" + taxState + '\'' +
				", tearsheets=" + tearsheets +
				", timeZoneOffsetEST=" + timeZoneOffsetEST +
				", travelLimit=" + travelLimit +
				", type='" + type + '\'' +
				", username='" + username + '\'' +
				", veteran='" + veteran + '\'' +
				", webResponses=" + webResponses +
				", willRelocate=" + willRelocate +
				", workAuthorized=" + workAuthorized +
				", workHistories=" + workHistories +
				", customObject1s=" + customObject1s +
				", customObject2s=" + customObject2s +
				", customObject3s=" + customObject3s +
				", customObject4s=" + customObject4s +
				", customObject5s=" + customObject5s +
				", customObject6s=" + customObject6s +
				", customObject7s=" + customObject7s +
				", customObject8s=" + customObject8s +
				", customObject9s=" + customObject9s +
				", customObject10s=" + customObject10s +
				", workPhone='" + workPhone + '\'' +
				'}';
	}
}
