package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.api.helper.RestOneToManySerializer;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance9;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.FileEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.core.type.EditHistoryEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsC;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "actualCloseDate", "address", "appointments", "assignedDate", "assignedUsers", "benefits", "billRateCategoryID", "bonusPackage", "branch", "branchCode", "businessSector",
		"businessSectors", "campaignSource", "category", "categories", "certifications", "clientContact", "clientCorporation", "committed", "customDate1", "customDate2", "customDate3",
		"customFloat1", "customFloat2", "customFloat3", "customInt1", "customInt2", "customInt3", "customText1", "customText10", "customText11", "customText12", "customText13", "customText14",
		"customText15", "customText16", "customText17", "customText18", "customText19", "customText2", "customText20", "customText3", "customText4", "customText5", "customText6", "customText7",
		"customText8", "customText9", "customTextBlock1", "customTextBlock2", "customTextBlock3", "customTextBlock4", "customTextBlock5", "dateAdded", "dateLastModified", "dealValue", "degreeList",
		"description", "educationDegree", "effectiveDate", "estimatedDuration", "estimatedEndDate", "estimatedHoursPerWeek", "estimatedStartDate", "estimatedBillRate", "expectedCloseDate",
		"expectedFee", "expectedParRate", "externalCategoryID", "externalID", "history", "isDeleted", "ignoreUntilDate", "isOpen", "jobOrders", "lead", "markUpPercentage", "notes", "numOpenings",
		"onSite", "optionsPackage", "owner", "priority", "publicDescription", "publishedZip", "reasonClosed", "salary", "salaryUnit", "skillList", "skills", "source", "specialties", "status",
		"tasks", "tearsheets", "title", "type", "weightedDealValue", "willRelocate", "winProbabilityPercent", "yearsRequired", "customObject1s", "customObject2s", "customObject3s",
        "customObject4s", "customObject5s", "customObject6s", "customObject7s", "customObject8s", "customObject9s", "customObject10s" })
public class Opportunity extends CustomFieldsC implements QueryEntity, SearchEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, FileEntity, AssociationEntity, DateLastModifiedEntity, EditHistoryEntity {

	private BigDecimal luceneScore;
	
	private Integer id;
	
	private CorporateUser owner;

	@JsonIgnore
	@Size(max = 100)
	private String title;

    @JsonIgnore
	private String type;

	@Size(max = 200000)
	private String description;
	
	private DateTime estimatedStartDate;
	
	private BigDecimal estimatedHoursPerWeek;
	
	private BigDecimal estimatedDuration;
	
	private BigDecimal salary;

	@JsonIgnore
	@Size(max = 12)
	private String salaryUnit;

	@JsonIgnore
	private String onSite;

	@JsonIgnore
	private String taxStatus;

	private Branch branch;

	@JsonIgnore
	@Size(max = 100)
	private String branchCode;
	
	private Boolean isOpen;
	
	private Address address;
	
	private DateTime dateAdded;
	
	private Boolean isDeleted;
	
	private Integer externalCategoryID;

	@JsonIgnore
	@Size(max = 200)
	private String status;
	
	private ClientContact clientContact;
	
	private Integer priority;
	
	private Boolean isClientContact;
	
	private DateTime dateClientInterview;
	
	private Integer isPublic;
	
	private Integer numOpenings;
	
	private Boolean isExtendable;
	
	private Integer yearsRequired;

	@JsonIgnore
	@Size(max = 30)
	private String externalID;
	
	private DateTime actualCloseDate;

	@JsonIgnore
	private String reasonClosed;

	@JsonIgnore
	private String salaryRange;
	
	private Boolean committed;
	
	private Boolean willRelocate;

	@JsonIgnore
	@Size(max = 50)
	private String educationDegree;
	
	private ClientContact reportToClientContact;
	
	private DateTime estimatedEndDate;
	
	private Boolean isInterviewRequired;
	
	@JsonIgnore
	private String benefits;

	private String costCenter;
	
	private String reportTo;

	@JsonIgnore
	private String skillList;

	@JsonIgnore
	private String degreeList;

	private BigDecimal expectedBillRate;

	@JsonIgnore
	@Size(max = 200000)
	private String publicDescription;
	
	private String hoursOfOperation;

	@JsonIgnore
	@Size(max = 100)
	private String source;

	@JsonIgnore
	private String optionsPackage;
	
	@JsonIgnore
	private String bonusPackage;
	
	private OneToMany<JobOrder> jobOrders;
	
	private ClientCorporation clientCorporation;
	
	private BigDecimal expectedPayRate;
	
	private BigDecimal expectedFee;
	
	private Boolean isClientEditable;
	
	private CorporateUser responseUser;
	
	private Integer billRateCategoryID;
	
	private DateTime expectedCloseDate;
	
	private DateTime assignedDate;
	
	private String jobOrderUUID;

	@JsonIgnore
	@Size(max = 18)
	private String publishedZip;
	
	private String migrateGUID;
	
	private BigDecimal taxRate;
	
	private Boolean isOpportunity;
	
	private DateTime dateLastExported;
	
	private DateTime ignoreUntilDate;
	
	private OneToMany<Appointment> appointments;
	
	private OneToMany<Task> tasks;
	
	private OneToMany<Certification> certifications;
	
	private OneToMany<CorporateUser> assignedUsers;
	
	private OneToMany<Category> categories;
	
	private Category category;
	
	private BusinessSector businessSector;
	
	private OneToMany<Specialty> specialties;
	
	private OneToMany<Skill> skills;
	
	private OneToMany<Note> notes;
	
	private OneToMany<BusinessSector> businessSectors;
	
	private OneToMany<JobSubmission> webResponses;
	
	private DateTime effectiveDate;
	
	private Lead lead;

	@JsonIgnore
	@Size(max = 100)
	private String campaignSource;
	
	private BigDecimal markUpPercentage;
	
	private BigDecimal winProbabilityPercent;
	
	private BigDecimal dealValue;
	
	private BigDecimal weightedDealValue;
	
	private DateTime dateLastModified;

	private OneToMany<Tearsheet> tearsheets;

    private OneToMany<JobOrderCustomObjectInstance1> customObject1s;

    private OneToMany<JobOrderCustomObjectInstance2> customObject2s;

    private OneToMany<JobOrderCustomObjectInstance3> customObject3s;

    private OneToMany<JobOrderCustomObjectInstance4> customObject4s;

    private OneToMany<JobOrderCustomObjectInstance5> customObject5s;

    private OneToMany<JobOrderCustomObjectInstance6> customObject6s;

    private OneToMany<JobOrderCustomObjectInstance7> customObject7s;

    private OneToMany<JobOrderCustomObjectInstance8> customObject8s;

    private OneToMany<JobOrderCustomObjectInstance9> customObject9s;

    private OneToMany<JobOrderCustomObjectInstance10> customObject10s;
	
	public Opportunity() {
		super();
	}

	public Opportunity(Integer id) {
		super();
		this.id = id;
	}

	/**
	 * Returns the entity with the required fields for an insert set.
	 *
	 * @return
	 */
	public Opportunity instantiateForInsert() {
		Opportunity entity = new Opportunity();
		entity.setType("Test");
		return entity;
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

	public CorporateUser getOwner() {
		return owner;
	}

	@JsonProperty("owner")
	public void setOwner(CorporateUser owner) {
		this.owner = owner;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonIgnore
	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

    @JsonIgnore
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonIgnore
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("estimatedStartDate")
	public DateTime getEstimatedStartDate() {
		return estimatedStartDate;
	}

	@JsonProperty("estimatedStartDate")
	public void setEstimatedStartDate(DateTime estimatedStartDate) {
		this.estimatedStartDate = estimatedStartDate;
	}

	@JsonProperty("estimatedHoursPerWeek")
	public BigDecimal getEstimatedHoursPerWeek() {
		return estimatedHoursPerWeek;
	}

	@JsonProperty("estimatedHoursPerWeek")
	public void setEstimatedHoursPerWeek(BigDecimal estimatedHoursPerWeek) {
		this.estimatedHoursPerWeek = estimatedHoursPerWeek;
	}

	@JsonProperty("estimatedDuration")
	public BigDecimal getEstimatedDuration() {
		return estimatedDuration;
	}

	@JsonProperty("estimatedDuration")
	public void setEstimatedDuration(BigDecimal estimatedDuration) {
		this.estimatedDuration = estimatedDuration;
	}

	@JsonProperty("salary")
	public BigDecimal getSalary() {
		return salary;
	}

	@JsonProperty("salary")
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@JsonProperty("salaryUnit")
	public String getSalaryUnit() {
		return salaryUnit;
	}

	@JsonProperty("salaryUnit")
	public void setSalaryUnit(String salaryUnit) {
		this.salaryUnit = salaryUnit;
	}

	@JsonProperty("onSite")
	public String getOnSite() {
		return onSite;
	}

	@JsonIgnore
	public void setOnSite(String onSite) {
		this.onSite = onSite;
	}

	@JsonProperty("taxStatus")
	public String getTaxStatus() {
		return taxStatus;
	}

	@JsonProperty("taxStatus")
	public void setTaxStatus(String taxStatus) {
		this.taxStatus = taxStatus;
	}

    @JsonProperty("branch")
    public Branch getBranch() {
        return branch;
    }

    @JsonProperty("branch")
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @JsonProperty("branchCode")
	public String getBranchCode() {
		return branchCode;
	}

	@JsonIgnore
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	@JsonProperty("isOpen")
	public Boolean getIsOpen() {
		return isOpen;
	}

	@JsonProperty("isOpen")
	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}

	@JsonProperty("address")
	public Address getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(Address address) {
		this.address = address;
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

	@JsonProperty("isDeleted")
	public Boolean getIsDeleted() {
		return isDeleted;
	}

	@JsonProperty("isDeleted")
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@JsonProperty("externalCategoryID")
	public Integer getExternalCategoryID() {
		return externalCategoryID;
	}

	@JsonProperty("externalCategoryID")
	public void setExternalCategoryID(Integer externalCategoryID) {
		this.externalCategoryID = externalCategoryID;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonIgnore
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("clientContact")
	public ClientContact getClientContact() {
		return clientContact;
	}

	@JsonProperty("clientContact")
	public void setClientContact(ClientContact clientContact) {
		this.clientContact = clientContact;
	}

	@JsonProperty("priority")
	public Integer getPriority() {
		return priority;
	}

	@JsonProperty("priority")
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@JsonProperty("isClientContact")
	public Boolean getIsClientContact() {
		return isClientContact;
	}

	@JsonProperty("isClientContact")
	public void setIsClientContact(Boolean isClientContact) {
		this.isClientContact = isClientContact;
	}

	@JsonProperty("dateClientInterview")
	public DateTime getDateClientInterview() {
		return dateClientInterview;
	}

	@JsonProperty("dateClientInterview")
	public void setDateClientInterview(DateTime dateClientInterview) {
		this.dateClientInterview = dateClientInterview;
	}

	@JsonProperty("isPublic")
	public Integer getIsPublic() {
		return isPublic;
	}

	@JsonProperty("isPublic")
	public void setIsPublic(Integer isPublic) {
		this.isPublic = isPublic;
	}

	@JsonProperty("numOpenings")
	public Integer getNumOpenings() {
		return numOpenings;
	}

	@JsonProperty("numOpenings")
	public void setNumOpenings(Integer numOpenings) {
		this.numOpenings = numOpenings;
	}

	@JsonProperty("isExtendable")
	public Boolean getIsExtendable() {
		return isExtendable;
	}

	@JsonProperty("isExtendable")
	public void setIsExtendable(Boolean isExtendable) {
		this.isExtendable = isExtendable;
	}

	@JsonProperty("yearsRequired")
	public Integer getYearsRequired() {
		return yearsRequired;
	}

	@JsonProperty("yearsRequired")
	public void setYearsRequired(Integer yearsRequired) {
		this.yearsRequired = yearsRequired;
	}

	@JsonProperty("externalID")
	public String getExternalID() {
		return externalID;
	}

	@JsonIgnore
	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	@JsonProperty("actualCloseDate")
	public DateTime getActualCloseDate() {
		return actualCloseDate;
	}

	@JsonProperty("actualCloseDate")
	public void setActualCloseDate(DateTime actualCloseDate) {
		this.actualCloseDate = actualCloseDate;
	}

	@JsonProperty("reasonClosed")
	public String getReasonClosed() {
		return reasonClosed;
	}

	@JsonIgnore
	public void setReasonClosed(String reasonClosed) {
		this.reasonClosed = reasonClosed;
	}

	@JsonProperty("salaryRange")
	public String getSalaryRange() {
		return salaryRange;
	}

	@JsonIgnore
	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}

	@JsonProperty("committed")
	public Boolean getCommitted() {
		return committed;
	}

	@JsonProperty("committed")
	public void setCommitted(Boolean committed) {
		this.committed = committed;
	}

	@JsonProperty("willRelocate")
	public Boolean getWillRelocate() {
		return willRelocate;
	}

	@JsonProperty("willRelocate")
	public void setWillRelocate(Boolean willRelocate) {
		this.willRelocate = willRelocate;
	}

	@JsonProperty("educationDegree")
	public String getEducationDegree() {
		return educationDegree;
	}

	@JsonIgnore
	public void setEducationDegree(String educationDegree) {
		this.educationDegree = educationDegree;
	}

	@JsonProperty("reportToClientContact")
	public ClientContact getReportToClientContact() {
		return reportToClientContact;
	}

	@JsonProperty("reportToClientContact")
	public void setReportToClientContact(ClientContact reportToClientContact) {
		this.reportToClientContact = reportToClientContact;
	}

	@JsonProperty("estimatedEndDate")
	public DateTime getEstimatedEndDate() {
		return estimatedEndDate;
	}

	@JsonProperty("estimatedEndDate")
	public void setEstimatedEndDate(DateTime estimatedEndDate) {
		this.estimatedEndDate = estimatedEndDate;
	}

	@JsonProperty("isInterviewRequired")
	public Boolean getIsInterviewRequired() {
		return isInterviewRequired;
	}

	@JsonProperty("isInterviewRequired")
	public void setIsInterviewRequired(Boolean isInterviewRequired) {
		this.isInterviewRequired = isInterviewRequired;
	}

	@JsonProperty("benefits")
	public String getBenefits() {
		return benefits;
	}

	@JsonIgnore
	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	@JsonProperty("costCenter")
	public String getCostCenter() {
		return costCenter;
	}

	@JsonProperty("costCenter")
	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	@JsonProperty("reportTo")
	public String getReportTo() {
		return reportTo;
	}

	@JsonProperty("reportTo")
	public void setReportTo(String reportTo) {
		this.reportTo = reportTo;
	}

	@JsonProperty("skillList")
	public String getSkillList() {
		return skillList;
	}

	@JsonIgnore
	public void setSkillList(String skillList) {
		this.skillList = skillList;
	}

	@JsonProperty("degreeList")
	public String getDegreeList() {
		return degreeList;
	}

	@JsonIgnore
	public void setDegreeList(String degreeList) {
		this.degreeList = degreeList;
	}

	@JsonProperty("expectedBillRate")
	public BigDecimal getExpectedBillRate() {
		return expectedBillRate;
	}

	@JsonProperty("expectedBillRate")
	public void setExpectedBillRate(BigDecimal expectedBillRate) {
		this.expectedBillRate = expectedBillRate;
	}

	@JsonProperty("publicDescription")
	public String getPublicDescription() {
		return publicDescription;
	}

	@JsonIgnore
	public void setPublicDescription(String publicDescription) {
		this.publicDescription = publicDescription;
	}

	@JsonProperty("hoursOfOperation")
	public String getHoursOfOperation() {
		return hoursOfOperation;
	}

	@JsonProperty("hoursOfOperation")
	public void setHoursOfOperation(String hoursOfOperation) {
		this.hoursOfOperation = hoursOfOperation;
	}

	@JsonProperty("source")
	public String getSource() {
		return source;
	}

	@JsonIgnore
	public void setSource(String source) {
		this.source = source;
	}

	@JsonProperty("optionsPackage")
	public String getOptionsPackage() {
		return optionsPackage;
	}

	@JsonIgnore
	public void setOptionsPackage(String optionsPackage) {
		this.optionsPackage = optionsPackage;
	}

	@JsonProperty("bonusPackage")
	public String getBonusPackage() {
		return bonusPackage;
	}

	@JsonIgnore
	public void setBonusPackage(String bonusPackage) {
		this.bonusPackage = bonusPackage;
	}

	@JsonIgnore
	public OneToMany<JobOrder> getJobOrders() {
		return jobOrders;
	}

    @ReadOnly
	@JsonProperty("jobOrders")
	public void setJobOrders(OneToMany<JobOrder> jobOrders) {
		this.jobOrders = jobOrders;
	}

	@JsonProperty("clientCorporation")
	public ClientCorporation getClientCorporation() {
		return clientCorporation;
	}

	@JsonProperty("clientCorporation")
	public void setClientCorporation(ClientCorporation clientCorporation) {
		this.clientCorporation = clientCorporation;
	}

	@JsonProperty("expectedPayRate")
	public BigDecimal getExpectedPayRate() {
		return expectedPayRate;
	}

	@JsonProperty("expectedPayRate")
	public void setExpectedPayRate(BigDecimal expectedPayRate) {
		this.expectedPayRate = expectedPayRate;
	}

	@JsonProperty("expectedFee")
	public BigDecimal getExpectedFee() {
		return expectedFee;
	}

	@JsonProperty("expectedFee")
	public void setExpectedFee(BigDecimal expectedFee) {
		this.expectedFee = expectedFee;
	}

	@JsonProperty("isClientEditable")
	public Boolean getIsClientEditable() {
		return isClientEditable;
	}

	@JsonProperty("isClientEditable")
	public void setIsClientEditable(Boolean isClientEditable) {
		this.isClientEditable = isClientEditable;
	}

	@JsonProperty("responseUser")
	public CorporateUser getResponseUser() {
		return responseUser;
	}

	@JsonProperty("responseUser")
	public void setResponseUser(CorporateUser responseUser) {
		this.responseUser = responseUser;
	}

	@JsonProperty("billRateCategoryID")
	public Integer getBillRateCategoryID() {
		return billRateCategoryID;
	}

	@JsonProperty("billRateCategoryID")
	public void setBillRateCategoryID(Integer billRateCategoryID) {
		this.billRateCategoryID = billRateCategoryID;
	}

	@JsonProperty("expectedCloseDate")
	public DateTime getExpectedCloseDate() {
		return expectedCloseDate;
	}

	@JsonProperty("expectedCloseDate")
	public void setExpectedCloseDate(DateTime expectedCloseDate) {
		this.expectedCloseDate = expectedCloseDate;
	}

	@JsonProperty("assignedDate")
	public DateTime getAssignedDate() {
		return assignedDate;
	}

	@JsonProperty("assignedDate")
	public void setAssignedDate(DateTime assignedDate) {
		this.assignedDate = assignedDate;
	}

	@JsonProperty("jobOrderUUID")
	public String getJobOrderUUID() {
		return jobOrderUUID;
	}

	@JsonProperty("jobOrderUUID")
	public void setJobOrderUUID(String jobOrderUUID) {
		this.jobOrderUUID = jobOrderUUID;
	}

	@JsonProperty("publishedZip")
	public String getPublishedZip() {
		return publishedZip;
	}

	@JsonIgnore
	public void setPublishedZip(String publishedZip) {
		this.publishedZip = publishedZip;
	}

	@JsonProperty("migrateGUID")
	public String getMigrateGUID() {
		return migrateGUID;
	}

	@JsonProperty("migrateGUID")
	public void setMigrateGUID(String migrateGUID) {
		this.migrateGUID = migrateGUID;
	}

	@JsonProperty("taxRate")
	public BigDecimal getTaxRate() {
		return taxRate;
	}

	@JsonProperty("taxRate")
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	@JsonProperty("isOpportunity")
	public Boolean getIsOpportunity() {
		return isOpportunity;
	}

	@JsonProperty("isOpportunity")
	public void setIsOpportunity(Boolean isOpportunity) {
		this.isOpportunity = isOpportunity;
	}

	@JsonProperty("dateLastExported")
	public DateTime getDateLastExported() {
		return dateLastExported;
	}

    @ReadOnly
	@JsonProperty("dateLastExported")
	public void setDateLastExported(DateTime dateLastExported) {
		this.dateLastExported = dateLastExported;
	}

	@JsonProperty("ignoreUntilDate")
	public DateTime getIgnoreUntilDate() {
		return ignoreUntilDate;
	}

	@JsonProperty("ignoreUntilDate")
	public void setIgnoreUntilDate(DateTime ignoreUntilDate) {
		this.ignoreUntilDate = ignoreUntilDate;
	}

	@JsonIgnore
	public OneToMany<Appointment> getAppointments() {
		return appointments;
	}

    @ReadOnly
	@JsonProperty("appointments")
	public void setAppointments(OneToMany<Appointment> appointments) {
		this.appointments = appointments;
	}

	@JsonIgnore
	public OneToMany<Task> getTasks() {
		return tasks;
	}

    @ReadOnly
	@JsonProperty("tasks")
	public void setTasks(OneToMany<Task> tasks) {
		this.tasks = tasks;
	}

	@JsonIgnore
	public OneToMany<Certification> getCertifications() {
		return certifications;
	}

	@JsonProperty("certifications")
	public void setCertifications(OneToMany<Certification> certifications) {
		this.certifications = certifications;
	}

	@JsonIgnore
	public OneToMany<CorporateUser> getAssignedUsers() {
		return assignedUsers;
	}

	@JsonProperty("assignedUsers")
	public void setAssignedUsers(OneToMany<CorporateUser> assignedUsers) {
		this.assignedUsers = assignedUsers;
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

	@JsonProperty("businessSector")
	public BusinessSector getBusinessSector() {
		return businessSector;
	}

	@JsonProperty("businessSector")
	public void setBusinessSector(BusinessSector businessSector) {
		this.businessSector = businessSector;
	}

	@JsonIgnore
	public OneToMany<Specialty> getSpecialties() {
		return specialties;
	}

	@JsonProperty("specialties")
	public void setSpecialties(OneToMany<Specialty> specialties) {
		this.specialties = specialties;
	}

	@JsonIgnore
	public OneToMany<Skill> getSkills() {
		return skills;
	}

	@JsonProperty("skills")
	public void setSkills(OneToMany<Skill> skills) {
		this.skills = skills;
	}

	@JsonIgnore
	public OneToMany<Note> getNotes() {
		return notes;
	}

    @ReadOnly
	@JsonProperty("notes")
	public void setNotes(OneToMany<Note> notes) {
		this.notes = notes;
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
	public OneToMany<JobSubmission> getWebResponses() {
		return webResponses;
	}

	@JsonProperty("webResponses")
	public void setWebResponses(OneToMany<JobSubmission> webResponses) {
		this.webResponses = webResponses;
	}

	@JsonProperty("effectiveDate")
	public DateTime getEffectiveDate() {
		return effectiveDate;
	}

	@JsonProperty("effectiveDate")
	public void setEffectiveDate(DateTime effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	@JsonProperty("lead")
	public Lead getLead() {
		return lead;
	}

	@JsonProperty("lead")
	public void setLead(Lead lead) {
		this.lead = lead;
	}

	@JsonProperty("campaignSource")
	public String getCampaignSource() {
		return campaignSource;
	}

	@JsonIgnore
	public void setCampaignSource(String campaignSource) {
		this.campaignSource = campaignSource;
	}

	@JsonProperty("markUpPercentage")
	public BigDecimal getMarkUpPercentage() {
		return markUpPercentage;
	}

	@JsonProperty("markUpPercentage")
	public void setMarkUpPercentage(BigDecimal markUpPercentage) {
		this.markUpPercentage = markUpPercentage;
	}

	@JsonProperty("winProbabilityPercent")
	public BigDecimal getWinProbabilityPercent() {
		return winProbabilityPercent;
	}

	@JsonProperty("winProbabilityPercent")
	public void setWinProbabilityPercent(BigDecimal winProbabilityPercent) {
		this.winProbabilityPercent = winProbabilityPercent;
	}

	@JsonProperty("dealValue")
	public BigDecimal getDealValue() {
		return dealValue;
	}

	@JsonProperty("dealValue")
	public void setDealValue(BigDecimal dealValue) {
		this.dealValue = dealValue;
	}

	@JsonProperty("weightedDealValue")
	public BigDecimal getWeightedDealValue() {
		return weightedDealValue;
	}

	@JsonProperty("weightedDealValue")
	public void setWeightedDealValue(BigDecimal weightedDealValue) {
		this.weightedDealValue = weightedDealValue;
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

	@JsonProperty("tearsheets")
	public OneToMany<Tearsheet> getTearsheets() {
		return tearsheets;
	}

    @ReadOnly
	@JsonProperty("tearsheets")
	public void setTearsheets(OneToMany<Tearsheet> tearsheets) {
		this.tearsheets = tearsheets;
	}

	@JsonProperty("customObject1s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<JobOrderCustomObjectInstance1> getCustomObject1s() {
        return customObject1s;
    }

    @JsonProperty("customObject1s")
    public void setCustomObject1s(OneToMany<JobOrderCustomObjectInstance1> customObject1s) {
        this.customObject1s = customObject1s;
    }

    @JsonProperty("customObject2s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<JobOrderCustomObjectInstance2> getCustomObject2s() {
        return customObject2s;
    }

    @JsonProperty("customObject2s")
    public void setCustomObject2s(OneToMany<JobOrderCustomObjectInstance2> customObject2s) {
        this.customObject2s = customObject2s;
    }

    @JsonProperty("customObject3s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<JobOrderCustomObjectInstance3> getCustomObject3s() {
        return customObject3s;
    }

    @JsonProperty("customObject3s")
    public void setCustomObject3s(OneToMany<JobOrderCustomObjectInstance3> customObject3s) {
        this.customObject3s = customObject3s;
    }

    @JsonProperty("customObject4s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<JobOrderCustomObjectInstance4> getCustomObject4s() {
        return customObject4s;
    }

    @JsonProperty("customObject4s")
    public void setCustomObject4s(OneToMany<JobOrderCustomObjectInstance4> customObject4s) {
        this.customObject4s = customObject4s;
    }

    @JsonProperty("customObject5s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<JobOrderCustomObjectInstance5> getCustomObject5s() {
        return customObject5s;
    }

    @JsonProperty("customObject5s")
    public void setCustomObject5s(OneToMany<JobOrderCustomObjectInstance5> customObject5s) {
        this.customObject5s = customObject5s;
    }

    @JsonProperty("customObject6s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<JobOrderCustomObjectInstance6> getCustomObject6s() {
        return customObject6s;
    }

    @JsonProperty("customObject6s")
    public void setCustomObject6s(OneToMany<JobOrderCustomObjectInstance6> customObject6s) {
        this.customObject6s = customObject6s;
    }

    @JsonProperty("customObject7s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<JobOrderCustomObjectInstance7> getCustomObject7s() {
        return customObject7s;
    }

    @JsonProperty("customObject7s")
    public void setCustomObject7s(OneToMany<JobOrderCustomObjectInstance7> customObject7s) {
        this.customObject7s = customObject7s;
    }

    @JsonProperty("customObject8s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<JobOrderCustomObjectInstance8> getCustomObject8s() {
        return customObject8s;
    }

    @JsonProperty("customObject8s")
    public void setCustomObject8s(OneToMany<JobOrderCustomObjectInstance8> customObject8s) {
        this.customObject8s = customObject8s;
    }

    @JsonProperty("customObject9s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<JobOrderCustomObjectInstance9> getCustomObject9s() {
        return customObject9s;
    }

    @JsonProperty("customObject9s")
    public void setCustomObject9s(OneToMany<JobOrderCustomObjectInstance9> customObject9s) {
        this.customObject9s = customObject9s;
    }

    @JsonProperty("customObject10s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<JobOrderCustomObjectInstance10> getCustomObject10s() {
        return customObject10s;
    }

    @JsonProperty("customObject10s")
    public void setCustomObject10s(OneToMany<JobOrderCustomObjectInstance10> customObject10s) {
        this.customObject10s = customObject10s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Opportunity that = (Opportunity) o;

        if (luceneScore != null ? !luceneScore.equals(that.luceneScore) : that.luceneScore != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (owner != null ? !owner.equals(that.owner) : that.owner != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (estimatedStartDate != null ? !estimatedStartDate.equals(that.estimatedStartDate) : that.estimatedStartDate != null)
            return false;
        if (estimatedHoursPerWeek != null ? !estimatedHoursPerWeek.equals(that.estimatedHoursPerWeek) : that.estimatedHoursPerWeek != null)
            return false;
        if (estimatedDuration != null ? !estimatedDuration.equals(that.estimatedDuration) : that.estimatedDuration != null)
            return false;
        if (salary != null ? !salary.equals(that.salary) : that.salary != null) return false;
        if (salaryUnit != null ? !salaryUnit.equals(that.salaryUnit) : that.salaryUnit != null) return false;
        if (onSite != null ? !onSite.equals(that.onSite) : that.onSite != null) return false;
        if (taxStatus != null ? !taxStatus.equals(that.taxStatus) : that.taxStatus != null) return false;
        if (branch != null ? !branch.equals(that.branch) : that.branch != null) return false;
        if (branchCode != null ? !branchCode.equals(that.branchCode) : that.branchCode != null) return false;
        if (isOpen != null ? !isOpen.equals(that.isOpen) : that.isOpen != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (dateAdded != null ? !dateAdded.equals(that.dateAdded) : that.dateAdded != null) return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;
        if (externalCategoryID != null ? !externalCategoryID.equals(that.externalCategoryID) : that.externalCategoryID != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (clientContact != null ? !clientContact.equals(that.clientContact) : that.clientContact != null)
            return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
        if (isClientContact != null ? !isClientContact.equals(that.isClientContact) : that.isClientContact != null)
            return false;
        if (dateClientInterview != null ? !dateClientInterview.equals(that.dateClientInterview) : that.dateClientInterview != null)
            return false;
        if (isPublic != null ? !isPublic.equals(that.isPublic) : that.isPublic != null) return false;
        if (numOpenings != null ? !numOpenings.equals(that.numOpenings) : that.numOpenings != null) return false;
        if (isExtendable != null ? !isExtendable.equals(that.isExtendable) : that.isExtendable != null) return false;
        if (yearsRequired != null ? !yearsRequired.equals(that.yearsRequired) : that.yearsRequired != null)
            return false;
        if (externalID != null ? !externalID.equals(that.externalID) : that.externalID != null) return false;
        if (actualCloseDate != null ? !actualCloseDate.equals(that.actualCloseDate) : that.actualCloseDate != null)
            return false;
        if (reasonClosed != null ? !reasonClosed.equals(that.reasonClosed) : that.reasonClosed != null) return false;
        if (salaryRange != null ? !salaryRange.equals(that.salaryRange) : that.salaryRange != null) return false;
        if (committed != null ? !committed.equals(that.committed) : that.committed != null) return false;
        if (willRelocate != null ? !willRelocate.equals(that.willRelocate) : that.willRelocate != null) return false;
        if (educationDegree != null ? !educationDegree.equals(that.educationDegree) : that.educationDegree != null)
            return false;
        if (reportToClientContact != null ? !reportToClientContact.equals(that.reportToClientContact) : that.reportToClientContact != null)
            return false;
        if (estimatedEndDate != null ? !estimatedEndDate.equals(that.estimatedEndDate) : that.estimatedEndDate != null)
            return false;
        if (isInterviewRequired != null ? !isInterviewRequired.equals(that.isInterviewRequired) : that.isInterviewRequired != null)
            return false;
        if (benefits != null ? !benefits.equals(that.benefits) : that.benefits != null) return false;
        if (costCenter != null ? !costCenter.equals(that.costCenter) : that.costCenter != null) return false;
        if (reportTo != null ? !reportTo.equals(that.reportTo) : that.reportTo != null) return false;
        if (skillList != null ? !skillList.equals(that.skillList) : that.skillList != null) return false;
        if (degreeList != null ? !degreeList.equals(that.degreeList) : that.degreeList != null) return false;
        if (expectedBillRate != null ? !expectedBillRate.equals(that.expectedBillRate) : that.expectedBillRate != null)
            return false;
        if (publicDescription != null ? !publicDescription.equals(that.publicDescription) : that.publicDescription != null)
            return false;
        if (hoursOfOperation != null ? !hoursOfOperation.equals(that.hoursOfOperation) : that.hoursOfOperation != null)
            return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (optionsPackage != null ? !optionsPackage.equals(that.optionsPackage) : that.optionsPackage != null)
            return false;
        if (bonusPackage != null ? !bonusPackage.equals(that.bonusPackage) : that.bonusPackage != null) return false;
        if (jobOrders != null ? !jobOrders.equals(that.jobOrders) : that.jobOrders != null) return false;
        if (clientCorporation != null ? !clientCorporation.equals(that.clientCorporation) : that.clientCorporation != null)
            return false;
        if (expectedPayRate != null ? !expectedPayRate.equals(that.expectedPayRate) : that.expectedPayRate != null)
            return false;
        if (expectedFee != null ? !expectedFee.equals(that.expectedFee) : that.expectedFee != null) return false;
        if (isClientEditable != null ? !isClientEditable.equals(that.isClientEditable) : that.isClientEditable != null)
            return false;
        if (responseUser != null ? !responseUser.equals(that.responseUser) : that.responseUser != null) return false;
        if (billRateCategoryID != null ? !billRateCategoryID.equals(that.billRateCategoryID) : that.billRateCategoryID != null)
            return false;
        if (expectedCloseDate != null ? !expectedCloseDate.equals(that.expectedCloseDate) : that.expectedCloseDate != null)
            return false;
        if (assignedDate != null ? !assignedDate.equals(that.assignedDate) : that.assignedDate != null) return false;
        if (jobOrderUUID != null ? !jobOrderUUID.equals(that.jobOrderUUID) : that.jobOrderUUID != null) return false;
        if (publishedZip != null ? !publishedZip.equals(that.publishedZip) : that.publishedZip != null) return false;
        if (migrateGUID != null ? !migrateGUID.equals(that.migrateGUID) : that.migrateGUID != null) return false;
        if (taxRate != null ? !taxRate.equals(that.taxRate) : that.taxRate != null) return false;
        if (isOpportunity != null ? !isOpportunity.equals(that.isOpportunity) : that.isOpportunity != null)
            return false;
        if (dateLastExported != null ? !dateLastExported.equals(that.dateLastExported) : that.dateLastExported != null)
            return false;
        if (ignoreUntilDate != null ? !ignoreUntilDate.equals(that.ignoreUntilDate) : that.ignoreUntilDate != null)
            return false;
        if (appointments != null ? !appointments.equals(that.appointments) : that.appointments != null) return false;
        if (tasks != null ? !tasks.equals(that.tasks) : that.tasks != null) return false;
        if (certifications != null ? !certifications.equals(that.certifications) : that.certifications != null)
            return false;
        if (assignedUsers != null ? !assignedUsers.equals(that.assignedUsers) : that.assignedUsers != null)
            return false;
        if (categories != null ? !categories.equals(that.categories) : that.categories != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (businessSector != null ? !businessSector.equals(that.businessSector) : that.businessSector != null)
            return false;
        if (specialties != null ? !specialties.equals(that.specialties) : that.specialties != null) return false;
        if (skills != null ? !skills.equals(that.skills) : that.skills != null) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (businessSectors != null ? !businessSectors.equals(that.businessSectors) : that.businessSectors != null)
            return false;
        if (webResponses != null ? !webResponses.equals(that.webResponses) : that.webResponses != null) return false;
        if (effectiveDate != null ? !effectiveDate.equals(that.effectiveDate) : that.effectiveDate != null)
            return false;
        if (lead != null ? !lead.equals(that.lead) : that.lead != null) return false;
        if (campaignSource != null ? !campaignSource.equals(that.campaignSource) : that.campaignSource != null)
            return false;
        if (markUpPercentage != null ? !markUpPercentage.equals(that.markUpPercentage) : that.markUpPercentage != null)
            return false;
        if (winProbabilityPercent != null ? !winProbabilityPercent.equals(that.winProbabilityPercent) : that.winProbabilityPercent != null)
            return false;
        if (dealValue != null ? !dealValue.equals(that.dealValue) : that.dealValue != null) return false;
        if (weightedDealValue != null ? !weightedDealValue.equals(that.weightedDealValue) : that.weightedDealValue != null)
            return false;
        if (dateLastModified != null ? !dateLastModified.equals(that.dateLastModified) : that.dateLastModified != null)
            return false;
        if (tearsheets != null ? !tearsheets.equals(that.tearsheets) : that.tearsheets != null) return false;
        if (customObject1s != null ? !customObject1s.equals(that.customObject1s) : that.customObject1s != null)
            return false;
        if (customObject2s != null ? !customObject2s.equals(that.customObject2s) : that.customObject2s != null)
            return false;
        if (customObject3s != null ? !customObject3s.equals(that.customObject3s) : that.customObject3s != null)
            return false;
        if (customObject4s != null ? !customObject4s.equals(that.customObject4s) : that.customObject4s != null)
            return false;
        if (customObject5s != null ? !customObject5s.equals(that.customObject5s) : that.customObject5s != null)
            return false;
        if (customObject6s != null ? !customObject6s.equals(that.customObject6s) : that.customObject6s != null)
            return false;
        if (customObject7s != null ? !customObject7s.equals(that.customObject7s) : that.customObject7s != null)
            return false;
        if (customObject8s != null ? !customObject8s.equals(that.customObject8s) : that.customObject8s != null)
            return false;
        if (customObject9s != null ? !customObject9s.equals(that.customObject9s) : that.customObject9s != null)
            return false;
        return customObject10s != null ? customObject10s.equals(that.customObject10s) : that.customObject10s == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (luceneScore != null ? luceneScore.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (estimatedStartDate != null ? estimatedStartDate.hashCode() : 0);
        result = 31 * result + (estimatedHoursPerWeek != null ? estimatedHoursPerWeek.hashCode() : 0);
        result = 31 * result + (estimatedDuration != null ? estimatedDuration.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (salaryUnit != null ? salaryUnit.hashCode() : 0);
        result = 31 * result + (onSite != null ? onSite.hashCode() : 0);
        result = 31 * result + (taxStatus != null ? taxStatus.hashCode() : 0);
        result = 31 * result + (branch != null ? branch.hashCode() : 0);
        result = 31 * result + (branchCode != null ? branchCode.hashCode() : 0);
        result = 31 * result + (isOpen != null ? isOpen.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (externalCategoryID != null ? externalCategoryID.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (clientContact != null ? clientContact.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (isClientContact != null ? isClientContact.hashCode() : 0);
        result = 31 * result + (dateClientInterview != null ? dateClientInterview.hashCode() : 0);
        result = 31 * result + (isPublic != null ? isPublic.hashCode() : 0);
        result = 31 * result + (numOpenings != null ? numOpenings.hashCode() : 0);
        result = 31 * result + (isExtendable != null ? isExtendable.hashCode() : 0);
        result = 31 * result + (yearsRequired != null ? yearsRequired.hashCode() : 0);
        result = 31 * result + (externalID != null ? externalID.hashCode() : 0);
        result = 31 * result + (actualCloseDate != null ? actualCloseDate.hashCode() : 0);
        result = 31 * result + (reasonClosed != null ? reasonClosed.hashCode() : 0);
        result = 31 * result + (salaryRange != null ? salaryRange.hashCode() : 0);
        result = 31 * result + (committed != null ? committed.hashCode() : 0);
        result = 31 * result + (willRelocate != null ? willRelocate.hashCode() : 0);
        result = 31 * result + (educationDegree != null ? educationDegree.hashCode() : 0);
        result = 31 * result + (reportToClientContact != null ? reportToClientContact.hashCode() : 0);
        result = 31 * result + (estimatedEndDate != null ? estimatedEndDate.hashCode() : 0);
        result = 31 * result + (isInterviewRequired != null ? isInterviewRequired.hashCode() : 0);
        result = 31 * result + (benefits != null ? benefits.hashCode() : 0);
        result = 31 * result + (costCenter != null ? costCenter.hashCode() : 0);
        result = 31 * result + (reportTo != null ? reportTo.hashCode() : 0);
        result = 31 * result + (skillList != null ? skillList.hashCode() : 0);
        result = 31 * result + (degreeList != null ? degreeList.hashCode() : 0);
        result = 31 * result + (expectedBillRate != null ? expectedBillRate.hashCode() : 0);
        result = 31 * result + (publicDescription != null ? publicDescription.hashCode() : 0);
        result = 31 * result + (hoursOfOperation != null ? hoursOfOperation.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (optionsPackage != null ? optionsPackage.hashCode() : 0);
        result = 31 * result + (bonusPackage != null ? bonusPackage.hashCode() : 0);
        result = 31 * result + (jobOrders != null ? jobOrders.hashCode() : 0);
        result = 31 * result + (clientCorporation != null ? clientCorporation.hashCode() : 0);
        result = 31 * result + (expectedPayRate != null ? expectedPayRate.hashCode() : 0);
        result = 31 * result + (expectedFee != null ? expectedFee.hashCode() : 0);
        result = 31 * result + (isClientEditable != null ? isClientEditable.hashCode() : 0);
        result = 31 * result + (responseUser != null ? responseUser.hashCode() : 0);
        result = 31 * result + (billRateCategoryID != null ? billRateCategoryID.hashCode() : 0);
        result = 31 * result + (expectedCloseDate != null ? expectedCloseDate.hashCode() : 0);
        result = 31 * result + (assignedDate != null ? assignedDate.hashCode() : 0);
        result = 31 * result + (jobOrderUUID != null ? jobOrderUUID.hashCode() : 0);
        result = 31 * result + (publishedZip != null ? publishedZip.hashCode() : 0);
        result = 31 * result + (migrateGUID != null ? migrateGUID.hashCode() : 0);
        result = 31 * result + (taxRate != null ? taxRate.hashCode() : 0);
        result = 31 * result + (isOpportunity != null ? isOpportunity.hashCode() : 0);
        result = 31 * result + (dateLastExported != null ? dateLastExported.hashCode() : 0);
        result = 31 * result + (ignoreUntilDate != null ? ignoreUntilDate.hashCode() : 0);
        result = 31 * result + (appointments != null ? appointments.hashCode() : 0);
        result = 31 * result + (tasks != null ? tasks.hashCode() : 0);
        result = 31 * result + (certifications != null ? certifications.hashCode() : 0);
        result = 31 * result + (assignedUsers != null ? assignedUsers.hashCode() : 0);
        result = 31 * result + (categories != null ? categories.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (businessSector != null ? businessSector.hashCode() : 0);
        result = 31 * result + (specialties != null ? specialties.hashCode() : 0);
        result = 31 * result + (skills != null ? skills.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (businessSectors != null ? businessSectors.hashCode() : 0);
        result = 31 * result + (webResponses != null ? webResponses.hashCode() : 0);
        result = 31 * result + (effectiveDate != null ? effectiveDate.hashCode() : 0);
        result = 31 * result + (lead != null ? lead.hashCode() : 0);
        result = 31 * result + (campaignSource != null ? campaignSource.hashCode() : 0);
        result = 31 * result + (markUpPercentage != null ? markUpPercentage.hashCode() : 0);
        result = 31 * result + (winProbabilityPercent != null ? winProbabilityPercent.hashCode() : 0);
        result = 31 * result + (dealValue != null ? dealValue.hashCode() : 0);
        result = 31 * result + (weightedDealValue != null ? weightedDealValue.hashCode() : 0);
        result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
        result = 31 * result + (tearsheets != null ? tearsheets.hashCode() : 0);
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
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Opportunity{");
        sb.append("luceneScore=").append(luceneScore);
        sb.append(", id=").append(id);
        sb.append(", owner=").append(owner);
        sb.append(", title='").append(title).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", estimatedStartDate=").append(estimatedStartDate);
        sb.append(", estimatedHoursPerWeek=").append(estimatedHoursPerWeek);
        sb.append(", estimatedDuration=").append(estimatedDuration);
        sb.append(", salary=").append(salary);
        sb.append(", salaryUnit='").append(salaryUnit).append('\'');
        sb.append(", onSite='").append(onSite).append('\'');
        sb.append(", taxStatus='").append(taxStatus).append('\'');
        sb.append(", branch=").append(branch);
        sb.append(", branchCode='").append(branchCode).append('\'');
        sb.append(", isOpen=").append(isOpen);
        sb.append(", address=").append(address);
        sb.append(", dateAdded=").append(dateAdded);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", externalCategoryID=").append(externalCategoryID);
        sb.append(", status='").append(status).append('\'');
        sb.append(", clientContact=").append(clientContact);
        sb.append(", priority=").append(priority);
        sb.append(", isClientContact=").append(isClientContact);
        sb.append(", dateClientInterview=").append(dateClientInterview);
        sb.append(", isPublic=").append(isPublic);
        sb.append(", numOpenings=").append(numOpenings);
        sb.append(", isExtendable=").append(isExtendable);
        sb.append(", yearsRequired=").append(yearsRequired);
        sb.append(", externalID='").append(externalID).append('\'');
        sb.append(", actualCloseDate=").append(actualCloseDate);
        sb.append(", reasonClosed='").append(reasonClosed).append('\'');
        sb.append(", salaryRange='").append(salaryRange).append('\'');
        sb.append(", committed=").append(committed);
        sb.append(", willRelocate=").append(willRelocate);
        sb.append(", educationDegree='").append(educationDegree).append('\'');
        sb.append(", reportToClientContact=").append(reportToClientContact);
        sb.append(", estimatedEndDate=").append(estimatedEndDate);
        sb.append(", isInterviewRequired=").append(isInterviewRequired);
        sb.append(", benefits='").append(benefits).append('\'');
        sb.append(", costCenter='").append(costCenter).append('\'');
        sb.append(", reportTo='").append(reportTo).append('\'');
        sb.append(", skillList='").append(skillList).append('\'');
        sb.append(", degreeList='").append(degreeList).append('\'');
        sb.append(", expectedBillRate=").append(expectedBillRate);
        sb.append(", publicDescription='").append(publicDescription).append('\'');
        sb.append(", hoursOfOperation='").append(hoursOfOperation).append('\'');
        sb.append(", source='").append(source).append('\'');
        sb.append(", optionsPackage='").append(optionsPackage).append('\'');
        sb.append(", bonusPackage='").append(bonusPackage).append('\'');
        sb.append(", jobOrders=").append(jobOrders);
        sb.append(", clientCorporation=").append(clientCorporation);
        sb.append(", expectedPayRate=").append(expectedPayRate);
        sb.append(", expectedFee=").append(expectedFee);
        sb.append(", isClientEditable=").append(isClientEditable);
        sb.append(", responseUser=").append(responseUser);
        sb.append(", billRateCategoryID=").append(billRateCategoryID);
        sb.append(", expectedCloseDate=").append(expectedCloseDate);
        sb.append(", assignedDate=").append(assignedDate);
        sb.append(", jobOrderUUID='").append(jobOrderUUID).append('\'');
        sb.append(", publishedZip='").append(publishedZip).append('\'');
        sb.append(", migrateGUID='").append(migrateGUID).append('\'');
        sb.append(", taxRate=").append(taxRate);
        sb.append(", isOpportunity=").append(isOpportunity);
        sb.append(", dateLastExported=").append(dateLastExported);
        sb.append(", ignoreUntilDate=").append(ignoreUntilDate);
        sb.append(", appointments=").append(appointments);
        sb.append(", tasks=").append(tasks);
        sb.append(", certifications=").append(certifications);
        sb.append(", assignedUsers=").append(assignedUsers);
        sb.append(", categories=").append(categories);
        sb.append(", category=").append(category);
        sb.append(", businessSector=").append(businessSector);
        sb.append(", specialties=").append(specialties);
        sb.append(", skills=").append(skills);
        sb.append(", notes=").append(notes);
        sb.append(", businessSectors=").append(businessSectors);
        sb.append(", webResponses=").append(webResponses);
        sb.append(", effectiveDate=").append(effectiveDate);
        sb.append(", lead=").append(lead);
        sb.append(", campaignSource='").append(campaignSource).append('\'');
        sb.append(", markUpPercentage=").append(markUpPercentage);
        sb.append(", winProbabilityPercent=").append(winProbabilityPercent);
        sb.append(", dealValue=").append(dealValue);
        sb.append(", weightedDealValue=").append(weightedDealValue);
        sb.append(", dateLastModified=").append(dateLastModified);
        sb.append(", tearsheets=").append(tearsheets);
        sb.append(", customObject1s=").append(customObject1s);
        sb.append(", customObject2s=").append(customObject2s);
        sb.append(", customObject3s=").append(customObject3s);
        sb.append(", customObject4s=").append(customObject4s);
        sb.append(", customObject5s=").append(customObject5s);
        sb.append(", customObject6s=").append(customObject6s);
        sb.append(", customObject7s=").append(customObject7s);
        sb.append(", customObject8s=").append(customObject8s);
        sb.append(", customObject9s=").append(customObject9s);
        sb.append(", customObject10s=").append(customObject10s);
        sb.append('}');
        return sb.toString();
    }
}
