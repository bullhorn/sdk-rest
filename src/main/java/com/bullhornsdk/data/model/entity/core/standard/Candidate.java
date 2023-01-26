package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.api.helper.RestOneToManySerializer;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.*;
import com.bullhornsdk.data.model.entity.core.onboarding.OnboardingReceivedSent;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsF;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.response.file.standard.StandardFileAttachment;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.hibernate.validator.constraints.Email;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "address", "branch", "businessSectors", "canEnterTime", "categories", "category", "certificationList", "certifications",
		"clientCorporationBlackList", "clientCorporationWhiteList", "comments", "companyName", "companyURL", "customDate1", "customDate10",
        "customDate11", "customDate12", "customDate13","customDate2", "customDate3", "customDate4", "customDate5", "customDate6", "customDate7",
        "customDate8", "customDate9", "customFloat1", "customFloat10", "customFloat11","customFloat12", "customFloat13", "customFloat14", "customFloat15",
        "customFloat16", "customFloat17", "customFloat18", "customFloat19", "customFloat2", "customFloat20", "customFloat21", "customFloat22",
        "customFloat23", "customFloat3", "customFloat4", "customFloat5", "customFloat6", "customFloat7", "customFloat8", "customFloat9",
        "customInt1", "customInt10", "customInt11", "customInt12", "customInt13", "customInt14", "customInt15", "customInt16",
        "customInt17", "customInt18", "customInt19", "customInt2", "customInt20", "customInt21", "customInt22", "customInt23",
        "customInt3", "customInt4", "customInt5", "customInt6", "customInt7", "customInt8", "customInt9", "customText1",
		"customText10", "customText11", "customText12", "customText13", "customText14", "customText15", "customText16", "customText17",
		"customText18", "customText19", "customText2", "customText20", "customText21", "customText22", "customText23",
        "customText24", "customText25", "customText26", "customText27", "customText28", "customText29", "customText3", "customText30",
        "customText31", "customText32", "customText33", "customText34", "customText35", "customText36", "customText37", "customText38",
        "customText39", "customText4", "customText40", "customText5", "customText6", "twoJobs", "isExempt", "totalDependentClaimAmount",
        "otherIncomeAmount", "otherDeductionsAmount",
		"customText7", "customText8", "customText9", "customTextBlock1", "customTextBlock10", "customTextBlock2", "customTextBlock3",
        "customTextBlock4", "customTextBlock5", "customTextBlock6", "customTextBlock7", "customTextBlock8", "customTextBlock9",
        "dateAdded", "dateAvailable", "dateAvailableEnd", "dateI9Expiration", "dateLastComment", "dateLastModified", "dateLastPayrollProviderSync", "dateNextCall",
		"dateOfBirth", "dayRate", "dayRateLow", "degreeList", "description", "desiredLocations", "disability", "educationDegree",
		"educations", "email", "email2", "email3", "employeeType", "employmentPreference", "customEncryptedText1", "customEncryptedText2",
        "customEncryptedText3", "customEncryptedText4", "customEncryptedText5", "customEncryptedText6", "customEncryptedText7", "customEncryptedText8",
        "customEncryptedText9",  "customEncryptedText10", "ethnicity", "experience", "externalID", "fax",
		"fax2", "fax3", "federalAddtionalWitholdingsAmount", "federalExtraWithholdingAmount", "federalExemptions", "federalFilingStatus", "fileAttachments", "firstName",
		"gender", "hourlyRate", "hourlyRateLow", "i9OnFile", "isAnonymized", "isDayLightSavings", "isDeleted", "isEditable", "isLockedOut", "interviews",
		"lastName", "linkedPerson", "leads", "localAddtionalWitholdingsAmount", "localExemptions", "localFilingStatus", "localTaxCode",
		"massMailOptOut", "middleName", "migrateGUID", "mobile", "name", "namePrefix", "nameSuffix", "nickName", "notes", "numCategories",
		"numOwners", "occupation", "owner", "pager", "paperWorkOnFile", "password", "phone", "phone2", "phone3", "placements",
        "onboardingDocumentReceivedCount", "onboardingDocumentSentCount", "onboardingPercentComplete", "onboardingReceivedSent", "onboardingStatus",
		"preferredContact", "primarySkills", "recentClientList", "referredBy", "referredByPerson", "references", "salary", "salaryLow",
		"secondaryAddress", "secondaryOwners", "secondarySkills", "sendouts", "skillSet", "smsOptIn", "source", "specialties",
		"submissions", "ssn", "stateAddtionalWitholdingsAmount", "stateExemptions", "stateFilingStatus", "status", "tasks", "taxID",
		"taxState", "tearsheets", "timeZoneOffsetEST", "travelLimit", "type", "username", "veteran", "webResponses", "willRelocate", "workAuthorized",
		"workHistories", "workPhone", "customObject1s", "customObject2s", "customObject3s", "customObject4s", "customObject5s", "customObject6s",
        "customObject7s", "customObject8s", "customObject9s", "customObject10s", "customObject29s" })
public class Candidate extends CustomFieldsF implements SearchEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, FileEntity,
		AssociationEntity, DateLastModifiedEntity, EditHistoryEntity {

	private BigDecimal luceneScore;

	private Integer id;

	private Address address;

	private Branch branch;

	private OneToMany<BusinessSector> businessSectors;

	private Boolean canEnterTime;

	private OneToMany<Category> categories;

	private Category category;

	private OneToMany<CandidateCertification> certificationList;

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

    private DateTime dateLastPayrollProviderSync;

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

    private BigDecimal federalExtraWithholdingAmount;

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

    private Boolean isAnonymized;

	@JsonIgnore
	@Size(max = 50)
	private String lastName;

	private Person linkedPerson;

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

    private Integer onboardingDocumentReceivedCount;

    private Integer onboardingDocumentSentCount;

    private Integer onboardingPercentComplete;

    private OnboardingReceivedSent onboardingReceivedSent;

    private String onboardingStatus;

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

	private Person referredByPerson;

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

    private Boolean twoJobs;

    private BigDecimal totalDependentClaimAmount;

    private BigDecimal otherIncomeAmount;

    private BigDecimal otherDeductionsAmount;

    private Boolean isExempt;

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

    @JsonIgnore
    private String customEncryptedText1;

    @JsonIgnore
    private String customEncryptedText2;

    @JsonIgnore
    private String customEncryptedText3;

    @JsonIgnore
    private String customEncryptedText4;

    @JsonIgnore
    private String customEncryptedText5;

    @JsonIgnore
    private String customEncryptedText6;

    @JsonIgnore
    private String customEncryptedText7;

    @JsonIgnore
    private String customEncryptedText8;

    @JsonIgnore
    private String customEncryptedText9;

    @JsonIgnore
    private String customEncryptedText10;

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

    private OneToMany<PersonCustomObjectInstance29> customObject29s;

    private OneToMany<PersonCustomObjectInstance30> customObject30s;

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

	@JsonProperty("businessSectors")
	public void setBusinessSectors(OneToMany<BusinessSector> businessSectors) {
		this.businessSectors = businessSectors;
	}

    @JsonProperty("canEnterTime")
    public Boolean getCanEnterTime() {
        return canEnterTime;
    }

    @JsonProperty("canEnterTime")
    public void setCanEnterTime(Boolean canEnterTime) {
        this.canEnterTime = canEnterTime;
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
	public OneToMany<CandidateCertification> getCertificationList() {
		return certificationList;
	}

    @ReadOnly
	@JsonProperty("certificationList")
	public void setCertificationList(OneToMany<CandidateCertification> certificationList) {
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

    @ReadOnly
	@JsonProperty("clientCorporationBlackList")
	public void setClientCorporationBlackList(OneToMany<ClientCorporation> clientCorporationBlackList) {
		this.clientCorporationBlackList = clientCorporationBlackList;
	}

	@JsonProperty("clientCorporationWhiteList")
	public OneToMany<ClientCorporation> getClientCorporationWhiteList() {
		return clientCorporationWhiteList;
	}

    @ReadOnly
	@JsonProperty("clientCorporationWhiteList")
	public void setClientCorporationWhiteList(OneToMany<ClientCorporation> clientCorporationWhiteList) {
		this.clientCorporationWhiteList = clientCorporationWhiteList;
	}

	@JsonProperty("comments")
	public String getComments() {
		return comments;
	}

    @JsonIgnore
	public void setComments(String comments) {
		this.comments = comments;
	}

	@JsonProperty("companyName")
	public String getCompanyName() {
		return companyName;
	}

    @JsonIgnore
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@JsonProperty("companyURL")
	public String getCompanyURL() {
		return companyURL;
	}

	@JsonIgnore
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

    @ReadOnly
	@JsonProperty("dateLastComment")
	public void setDateLastComment(DateTime dateLastComment) {
		this.dateLastComment = dateLastComment;
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

    @JsonProperty("dateLastPayrollProviderSync")
    public DateTime getDateLastPayrollProviderSync() {
        return dateLastPayrollProviderSync;
    }

    @JsonProperty("dateLastPayrollProviderSync")
    public void setDateLastPayrollProviderSync(DateTime dateLastPayrollProviderSync) {
        this.dateLastPayrollProviderSync = dateLastPayrollProviderSync;
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

    @JsonIgnore
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

    @ReadOnly
	@JsonProperty("educations")
	public void setEducations(OneToMany<CandidateEducation> educations) {
		this.educations = educations;
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

	@JsonProperty("federalAddtionalWitholdingsAmount")
	public BigDecimal getFederalAddtionalWitholdingsAmount() {
		return federalAddtionalWitholdingsAmount;
	}

	@JsonProperty("federalAddtionalWitholdingsAmount")
	public void setFederalAddtionalWitholdingsAmount(BigDecimal federalAddtionalWitholdingsAmount) {
		this.federalAddtionalWitholdingsAmount = federalAddtionalWitholdingsAmount;
	}

    @JsonProperty("federalExtraWithholdingAmount")
    public BigDecimal getFederalExtraWithholdingAmount() {
        return federalExtraWithholdingAmount;
    }

    @JsonProperty("federalExtraWithholdingAmount")
    public void setFederalExtraWithholdingAmount(BigDecimal federalExtraWithholdingAmount) {
        this.federalExtraWithholdingAmount = federalExtraWithholdingAmount;
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

    @ReadOnly
	@JsonProperty("fileAttachments")
	public void setFileAttachments(OneToMany<StandardFileAttachment> fileAttachments) {
		this.fileAttachments = fileAttachments;
	}

	@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}

    @JsonIgnore
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty("gender")
	public String getGender() {
		return gender;
	}

    @JsonIgnore
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

    @ReadOnly
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

    @JsonProperty("isAnonymized")
    public Boolean getIsAnonymized() {
        return isAnonymized;
    }

    @JsonProperty("isAnonymized")
    public void setIsAnonymized(Boolean isAnonymized) {
        this.isAnonymized = isAnonymized;
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
	public Person getLinkedPerson() {
		return linkedPerson;
	}

	@JsonProperty("linkedPerson")
	public void setLinkedPerson(Person linkedPerson) {
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

    @JsonIgnore
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

	@JsonProperty("notes")
	public OneToMany<Note> getNotes() {
		return notes;
	}

    @ReadOnly
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

    @JsonProperty("onboardingDocumentReceivedCount")
    public Integer getOnboardingDocumentReceivedCount() {
        return onboardingDocumentReceivedCount;
    }

    @JsonProperty("onboardingDocumentReceivedCount")
    public void setOnboardingDocumentReceivedCount(Integer onboardingDocumentReceivedCount) {
        this.onboardingDocumentReceivedCount = onboardingDocumentReceivedCount;
    }

    @JsonProperty("onboardingDocumentSentCount")
    public Integer getOnboardingDocumentSentCount() {
        return onboardingDocumentSentCount;
    }

    @JsonProperty("onboardingDocumentSentCount")
    public void setOnboardingDocumentSentCount(Integer onboardingDocumentSentCount) {
        this.onboardingDocumentSentCount = onboardingDocumentSentCount;
    }

    @JsonProperty("onboardingPercentComplete")
    public Integer getOnboardingPercentComplete() {
        return onboardingPercentComplete;
    }

    @JsonProperty("onboardingPercentComplete")
    public void setOnboardingPercentComplete(Integer onboardingPercentComplete) {
        this.onboardingPercentComplete = onboardingPercentComplete;
    }

    @JsonProperty("onboardingReceivedSent")
    public OnboardingReceivedSent getOnboardingReceivedSent() {
        return onboardingReceivedSent;
    }

    @JsonProperty("onboardingReceivedSent")
    public void setOnboardingReceivedSent(OnboardingReceivedSent onboardingReceivedSent) {
        this.onboardingReceivedSent = onboardingReceivedSent;
    }

    @JsonProperty("onboardingStatus")
    public String getOnboardingStatus() {
        return onboardingStatus;
    }

    @JsonProperty("onboardingStatus")
    public void setOnboardingStatus(String onboardingStatus) {
        this.onboardingStatus = onboardingStatus;
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

	@JsonProperty("placements")
	public OneToMany<Placement> getPlacements() {
		return placements;
	}

    @ReadOnly
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
	public Person getReferredByPerson() {
		return referredByPerson;
	}

	@JsonProperty("referredByPerson")
	public void setReferredByPerson(Person referredByPerson) {
		this.referredByPerson = referredByPerson;
	}

	@JsonProperty("references")
	public OneToMany<CandidateReference> getReferences() {
		return references;
	}

    @ReadOnly
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

    @ReadOnly
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

    @ReadOnly
	@JsonProperty("submissions")
	public void setSubmissions(OneToMany<JobSubmission> submissions) {
		this.submissions = submissions;
	}

	@JsonProperty("tasks")
	public OneToMany<Task> getTasks() {
		return tasks;
	}

    @ReadOnly
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

    @JsonIgnore
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

    @JsonIgnore
	public void setUsername(String username) {
		this.username = username;
	}

	@JsonProperty("veteran")
	public String getVeteran() {
		return veteran;
	}

    @JsonIgnore
	public void setVeteran(String veteran) {
		this.veteran = veteran;
	}

	@JsonProperty("webResponses")
	public OneToMany<JobSubmission> getWebResponses() {
		return webResponses;
	}

    @ReadOnly
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

    @ReadOnly
	@JsonProperty("workHistories")
	public void setWorkHistories(OneToMany<CandidateWorkHistory> workHistories) {
		this.workHistories = workHistories;
	}

	@JsonProperty("workPhone")
	public String getWorkPhone() {
		return workPhone;
	}

    @JsonIgnore
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

    @JsonProperty("twoJobs")
    public Boolean getTwoJobs() {
        return twoJobs;
    }

    @JsonProperty("twoJobs")
    public void setTwoJobs(Boolean twoJobs) {
        this.twoJobs = twoJobs;
    }

    @JsonProperty("totalDependentClaimAmount")
    public BigDecimal getTotalDependentClaimAmount() {
        return totalDependentClaimAmount;
    }

    @JsonProperty("totalDependentClaimAmount")
    public void setTotalDependentClaimAmount(BigDecimal totalDependentClaimAmount) {
        this.totalDependentClaimAmount = totalDependentClaimAmount;
    }

    @JsonProperty("otherIncomeAmount")
    public BigDecimal getOtherIncomeAmount() {
        return otherIncomeAmount;
    }

    @JsonProperty("otherIncomeAmount")
    public void setOtherIncomeAmount(BigDecimal otherIncomeAmount) {
        this.otherIncomeAmount = otherIncomeAmount;
    }

    @JsonProperty("otherDeductionsAmount")
    public BigDecimal getOtherDeductionsAmount() {
        return otherDeductionsAmount;
    }

    @JsonProperty("otherDeductionsAmount")
    public void setOtherDeductionsAmount(BigDecimal otherDeductionsAmount) {
        this.otherDeductionsAmount = otherDeductionsAmount;
    }

    @JsonProperty("isExempt")
    public Boolean getIsExempt() {
        return isExempt;
    }

    @JsonProperty("isExempt")
    public void setIsExempt(Boolean isExempt) {
        this.isExempt = isExempt;
    }

    @JsonProperty("customEncryptedText1")
    public String getCustomEncryptedText1() {
        return customEncryptedText1;
    }

    @JsonProperty("customEncryptedText1")
    @JsonIgnore
    public void setCustomEncryptedText1(String customEncryptedText1) {
        this.customEncryptedText1 = customEncryptedText1;
    }

    @JsonProperty("customEncryptedText2")
    public String getCustomEncryptedText2() {
        return customEncryptedText2;
    }

    @JsonProperty("customEncryptedText2")
    @JsonIgnore
    public void setCustomEncryptedText2(String customEncryptedText2) {
        this.customEncryptedText2 = customEncryptedText2;
    }

    @JsonProperty("customEncryptedText3")
    public String getCustomEncryptedText3() {
        return customEncryptedText3;
    }

    @JsonProperty("customEncryptedText3")
    @JsonIgnore
    public void setCustomEncryptedText3(String customEncryptedText3) {
        this.customEncryptedText3 = customEncryptedText3;
    }

    @JsonProperty("customEncryptedText4")
    public String getCustomEncryptedText4() {
        return customEncryptedText4;
    }

    @JsonProperty("customEncryptedText4")
    @JsonIgnore
    public void setCustomEncryptedText4(String customEncryptedText4) {
        this.customEncryptedText4 = customEncryptedText4;
    }

    @JsonProperty("customEncryptedText5")
    public String getCustomEncryptedText5() {
        return customEncryptedText5;
    }

    @JsonProperty("customEncryptedText5")
    @JsonIgnore
    public void setCustomEncryptedText5(String customEncryptedText5) {
        this.customEncryptedText5 = customEncryptedText5;
    }

    @JsonProperty("customEncryptedText6")
    public String getCustomEncryptedText6() {
        return customEncryptedText6;
    }

    @JsonProperty("customEncryptedText6")
    @JsonIgnore
    public void setCustomEncryptedText6(String customEncryptedText6) {
        this.customEncryptedText6 = customEncryptedText6;
    }

    @JsonProperty("customEncryptedText7")
    public String getCustomEncryptedText7() {
        return customEncryptedText7;
    }

    @JsonProperty("customEncryptedText7")
    @JsonIgnore
    public void setCustomEncryptedText7(String customEncryptedText7) {
        this.customEncryptedText7 = customEncryptedText7;
    }

    @JsonProperty("customEncryptedText8")
    public String getCustomEncryptedText8() {
        return customEncryptedText8;
    }

    @JsonProperty("customEncryptedText8")
    @JsonIgnore
    public void setCustomEncryptedText8(String customEncryptedText8) {
        this.customEncryptedText8 = customEncryptedText8;
    }

    @JsonProperty("customEncryptedText9")
    public String getCustomEncryptedText9() {
        return customEncryptedText9;
    }

    @JsonProperty("customEncryptedText9")
    @JsonIgnore
    public void setCustomEncryptedText9(String customEncryptedText9) {
        this.customEncryptedText9 = customEncryptedText9;
    }

    @JsonProperty("customEncryptedText10")
    public String getCustomEncryptedText10() {
        return customEncryptedText10;
    }

    @JsonProperty("customEncryptedText10")
    @JsonIgnore
    public void setCustomEncryptedText10(String customEncryptedText10) {
        this.customEncryptedText10 = customEncryptedText10;
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

    @JsonProperty("customObject29s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance29> getCustomObject29s() {
        return customObject29s;
    }

    @JsonProperty("customObject29s")
    public void setCustomObject29s(OneToMany<PersonCustomObjectInstance29> customObject29s) {
        this.customObject29s = customObject29s;
    }

    @JsonProperty("customObject30s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance30> getCustomObject30s() {
        return customObject30s;
    }

    @JsonProperty("customObject30s")
    public void setCustomObject30s(OneToMany<PersonCustomObjectInstance30> customObject30s) {
        this.customObject30s = customObject30s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(luceneScore, candidate.luceneScore) &&
            Objects.equals(id, candidate.id) &&
            Objects.equals(address, candidate.address) &&
            Objects.equals(branch, candidate.branch) &&
            Objects.equals(businessSectors, candidate.businessSectors) &&
            Objects.equals(canEnterTime, candidate.canEnterTime) &&
            Objects.equals(categories, candidate.categories) &&
            Objects.equals(category, candidate.category) &&
            Objects.equals(certificationList, candidate.certificationList) &&
            Objects.equals(certifications, candidate.certifications) &&
            Objects.equals(clientCorporationBlackList, candidate.clientCorporationBlackList) &&
            Objects.equals(clientCorporationWhiteList, candidate.clientCorporationWhiteList) &&
            Objects.equals(comments, candidate.comments) &&
            Objects.equals(companyName, candidate.companyName) &&
            Objects.equals(companyURL, candidate.companyURL) &&
            Objects.equals(dateAdded, candidate.dateAdded) &&
            Objects.equals(dateAvailable, candidate.dateAvailable) &&
            Objects.equals(dateAvailableEnd, candidate.dateAvailableEnd) &&
            Objects.equals(dateI9Expiration, candidate.dateI9Expiration) &&
            Objects.equals(dateLastComment, candidate.dateLastComment) &&
            Objects.equals(dateLastModified, candidate.dateLastModified) &&
            Objects.equals(dateLastPayrollProviderSync, candidate.dateLastPayrollProviderSync) &&
            Objects.equals(dateNextCall, candidate.dateNextCall) &&
            Objects.equals(dateOfBirth, candidate.dateOfBirth) &&
            Objects.equals(dayRate, candidate.dayRate) &&
            Objects.equals(dayRateLow, candidate.dayRateLow) &&
            Objects.equals(degreeList, candidate.degreeList) &&
            Objects.equals(description, candidate.description) &&
            Objects.equals(desiredLocations, candidate.desiredLocations) &&
            Objects.equals(disability, candidate.disability) &&
            Objects.equals(educationDegree, candidate.educationDegree) &&
            Objects.equals(educations, candidate.educations) &&
            Objects.equals(email, candidate.email) &&
            Objects.equals(email2, candidate.email2) &&
            Objects.equals(email3, candidate.email3) &&
            Objects.equals(employeeType, candidate.employeeType) &&
            Objects.equals(employmentPreference, candidate.employmentPreference) &&
            Objects.equals(ethnicity, candidate.ethnicity) &&
            Objects.equals(experience, candidate.experience) &&
            Objects.equals(externalID, candidate.externalID) &&
            Objects.equals(fax, candidate.fax) &&
            Objects.equals(fax2, candidate.fax2) &&
            Objects.equals(fax3, candidate.fax3) &&
            Objects.equals(federalAddtionalWitholdingsAmount, candidate.federalAddtionalWitholdingsAmount) &&
            Objects.equals(federalExtraWithholdingAmount, candidate.federalExtraWithholdingAmount) &&
            Objects.equals(federalExemptions, candidate.federalExemptions) &&
            Objects.equals(federalFilingStatus, candidate.federalFilingStatus) &&
            Objects.equals(fileAttachments, candidate.fileAttachments) &&
            Objects.equals(firstName, candidate.firstName) &&
            Objects.equals(gender, candidate.gender) &&
            Objects.equals(hourlyRate, candidate.hourlyRate) &&
            Objects.equals(hourlyRateLow, candidate.hourlyRateLow) &&
            Objects.equals(interviews, candidate.interviews) &&
            Objects.equals(i9OnFile, candidate.i9OnFile) &&
            Objects.equals(isDayLightSavings, candidate.isDayLightSavings) &&
            Objects.equals(isDeleted, candidate.isDeleted) &&
            Objects.equals(isEditable, candidate.isEditable) &&
            Objects.equals(isLockedOut, candidate.isLockedOut) &&
            Objects.equals(isAnonymized, candidate.isAnonymized) &&
            Objects.equals(lastName, candidate.lastName) &&
            Objects.equals(linkedPerson, candidate.linkedPerson) &&
            Objects.equals(leads, candidate.leads) &&
            Objects.equals(localAddtionalWitholdingsAmount, candidate.localAddtionalWitholdingsAmount) &&
            Objects.equals(localExemptions, candidate.localExemptions) &&
            Objects.equals(localFilingStatus, candidate.localFilingStatus) &&
            Objects.equals(localTaxCode, candidate.localTaxCode) &&
            Objects.equals(massMailOptOut, candidate.massMailOptOut) &&
            Objects.equals(middleName, candidate.middleName) &&
            Objects.equals(migrateGUID, candidate.migrateGUID) &&
            Objects.equals(mobile, candidate.mobile) &&
            Objects.equals(name, candidate.name) &&
            Objects.equals(namePrefix, candidate.namePrefix) &&
            Objects.equals(nameSuffix, candidate.nameSuffix) &&
            Objects.equals(nickName, candidate.nickName) &&
            Objects.equals(notes, candidate.notes) &&
            Objects.equals(numCategories, candidate.numCategories) &&
            Objects.equals(numOwners, candidate.numOwners) &&
            Objects.equals(occupation, candidate.occupation) &&
            Objects.equals(onboardingDocumentReceivedCount, candidate.onboardingDocumentReceivedCount) &&
            Objects.equals(onboardingDocumentSentCount, candidate.onboardingDocumentSentCount) &&
            Objects.equals(onboardingPercentComplete, candidate.onboardingPercentComplete) &&
            Objects.equals(onboardingReceivedSent, candidate.onboardingReceivedSent) &&
            Objects.equals(onboardingStatus, candidate.onboardingStatus) &&
            Objects.equals(owner, candidate.owner) &&
            Objects.equals(pager, candidate.pager) &&
            Objects.equals(paperWorkOnFile, candidate.paperWorkOnFile) &&
            Objects.equals(password, candidate.password) &&
            Objects.equals(phone, candidate.phone) &&
            Objects.equals(phone2, candidate.phone2) &&
            Objects.equals(phone3, candidate.phone3) &&
            Objects.equals(placements, candidate.placements) &&
            Objects.equals(preferredContact, candidate.preferredContact) &&
            Objects.equals(primarySkills, candidate.primarySkills) &&
            Objects.equals(recentClientList, candidate.recentClientList) &&
            Objects.equals(referredBy, candidate.referredBy) &&
            Objects.equals(referredByPerson, candidate.referredByPerson) &&
            Objects.equals(references, candidate.references) &&
            Objects.equals(salary, candidate.salary) &&
            Objects.equals(salaryLow, candidate.salaryLow) &&
            Objects.equals(secondaryAddress, candidate.secondaryAddress) &&
            Objects.equals(secondaryOwners, candidate.secondaryOwners) &&
            Objects.equals(secondarySkills, candidate.secondarySkills) &&
            Objects.equals(sendouts, candidate.sendouts) &&
            Objects.equals(skillSet, candidate.skillSet) &&
            Objects.equals(smsOptIn, candidate.smsOptIn) &&
            Objects.equals(source, candidate.source) &&
            Objects.equals(specialties, candidate.specialties) &&
            Objects.equals(ssn, candidate.ssn) &&
            Objects.equals(stateAddtionalWitholdingsAmount, candidate.stateAddtionalWitholdingsAmount) &&
            Objects.equals(stateExemptions, candidate.stateExemptions) &&
            Objects.equals(stateFilingStatus, candidate.stateFilingStatus) &&
            Objects.equals(status, candidate.status) &&
            Objects.equals(submissions, candidate.submissions) &&
            Objects.equals(tasks, candidate.tasks) &&
            Objects.equals(taxID, candidate.taxID) &&
            Objects.equals(taxState, candidate.taxState) &&
            Objects.equals(tearsheets, candidate.tearsheets) &&
            Objects.equals(timeZoneOffsetEST, candidate.timeZoneOffsetEST) &&
            Objects.equals(travelLimit, candidate.travelLimit) &&
            Objects.equals(type, candidate.type) &&
            Objects.equals(username, candidate.username) &&
            Objects.equals(veteran, candidate.veteran) &&
            Objects.equals(webResponses, candidate.webResponses) &&
            Objects.equals(willRelocate, candidate.willRelocate) &&
            Objects.equals(workAuthorized, candidate.workAuthorized) &&
            Objects.equals(workHistories, candidate.workHistories) &&
            Objects.equals(workPhone, candidate.workPhone) &&
            Objects.equals(customEncryptedText1, candidate.customEncryptedText1) &&
            Objects.equals(customEncryptedText2, candidate.customEncryptedText2) &&
            Objects.equals(customEncryptedText3, candidate.customEncryptedText3) &&
            Objects.equals(customEncryptedText4, candidate.customEncryptedText4) &&
            Objects.equals(customEncryptedText5, candidate.customEncryptedText5) &&
            Objects.equals(customEncryptedText6, candidate.customEncryptedText6) &&
            Objects.equals(customEncryptedText7, candidate.customEncryptedText7) &&
            Objects.equals(customEncryptedText8, candidate.customEncryptedText8) &&
            Objects.equals(customEncryptedText9, candidate.customEncryptedText9) &&
            Objects.equals(customEncryptedText10, candidate.customEncryptedText10) &&
            Objects.equals(customObject1s, candidate.customObject1s) &&
            Objects.equals(customObject2s, candidate.customObject2s) &&
            Objects.equals(customObject3s, candidate.customObject3s) &&
            Objects.equals(customObject4s, candidate.customObject4s) &&
            Objects.equals(customObject5s, candidate.customObject5s) &&
            Objects.equals(customObject6s, candidate.customObject6s) &&
            Objects.equals(customObject7s, candidate.customObject7s) &&
            Objects.equals(customObject8s, candidate.customObject8s) &&
            Objects.equals(customObject9s, candidate.customObject9s) &&
            Objects.equals(customObject10s, candidate.customObject10s) &&
            Objects.equals(customObject29s, candidate.customObject29s);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), luceneScore, id, address, branch, businessSectors, canEnterTime, categories, category, certificationList, certifications, clientCorporationBlackList, clientCorporationWhiteList, comments, companyName, companyURL, dateAdded, dateAvailable, dateAvailableEnd, dateI9Expiration, dateLastComment, dateLastModified, dateLastPayrollProviderSync, dateNextCall, dateOfBirth, dayRate, dayRateLow, degreeList, description, desiredLocations, disability, educationDegree, educations, email, email2, email3, employeeType, employmentPreference, ethnicity, experience, externalID, fax, fax2, fax3, federalAddtionalWitholdingsAmount, federalExtraWithholdingAmount, federalExemptions, federalFilingStatus, fileAttachments, firstName, gender, hourlyRate, hourlyRateLow, interviews, i9OnFile, isDayLightSavings, isDeleted, isEditable, isLockedOut, isAnonymized, lastName, linkedPerson, leads, localAddtionalWitholdingsAmount, localExemptions, localFilingStatus, localTaxCode, massMailOptOut, middleName, migrateGUID, mobile, name, namePrefix, nameSuffix, nickName, notes, numCategories, numOwners, occupation, onboardingDocumentReceivedCount, onboardingDocumentSentCount, onboardingPercentComplete, onboardingReceivedSent, onboardingStatus, owner, pager, paperWorkOnFile, password, phone, phone2, phone3, placements, preferredContact, primarySkills, recentClientList, referredBy, referredByPerson, references, salary, salaryLow, secondaryAddress, secondaryOwners, secondarySkills, sendouts, skillSet, smsOptIn, source, specialties, ssn, stateAddtionalWitholdingsAmount, stateExemptions, stateFilingStatus, status, submissions, tasks, taxID, taxState, tearsheets, timeZoneOffsetEST, travelLimit, type, username, veteran, webResponses, willRelocate, workAuthorized, workHistories, workPhone, customEncryptedText1, customEncryptedText2, customEncryptedText3, customEncryptedText4, customEncryptedText5, customEncryptedText6, customEncryptedText7, customEncryptedText8, customEncryptedText9, customEncryptedText10, customObject1s, customObject2s, customObject3s, customObject4s, customObject5s, customObject6s, customObject7s, customObject8s, customObject9s, customObject10s, customObject29s);
    }

    @Override
    public String toString() {
        return "Candidate{" +
            "luceneScore=" + luceneScore +
            ", id=" + id +
            ", address=" + address +
            ", branch=" + branch +
            ", businessSectors=" + businessSectors +
            ", canEnterTime=" + canEnterTime +
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
            ", dateLastPayrollProviderSync=" + dateLastPayrollProviderSync +
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
            ", federalExtraWithholdingAmount=" + federalExtraWithholdingAmount +
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
            ", isAnonymized=" + isAnonymized +
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
            ", onboardingDocumentReceivedCount=" + onboardingDocumentReceivedCount +
            ", onboardingDocumentSentCount=" + onboardingDocumentSentCount +
            ", onboardingPercentComplete=" + onboardingPercentComplete +
            ", onboardingReceivedSent=" + onboardingReceivedSent +
            ", onboardingStatus='" + onboardingStatus + '\'' +
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
            ", workPhone='" + workPhone + '\'' +
            ", customEncryptedText1='" + customEncryptedText1 + '\'' +
            ", customEncryptedText2='" + customEncryptedText2 + '\'' +
            ", customEncryptedText3='" + customEncryptedText3 + '\'' +
            ", customEncryptedText4='" + customEncryptedText4 + '\'' +
            ", customEncryptedText5='" + customEncryptedText5 + '\'' +
            ", customEncryptedText6='" + customEncryptedText6 + '\'' +
            ", customEncryptedText7='" + customEncryptedText7 + '\'' +
            ", customEncryptedText8='" + customEncryptedText8 + '\'' +
            ", customEncryptedText9='" + customEncryptedText9 + '\'' +
            ", customEncryptedText10='" + customEncryptedText10 + '\'' +
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
            ", customObject29s=" + customObject29s +
            '}';
    }
}
