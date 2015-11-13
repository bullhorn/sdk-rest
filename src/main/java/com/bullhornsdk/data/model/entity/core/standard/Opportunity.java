package com.bullhornsdk.data.model.entity.core.standard;

import java.math.BigDecimal;

import javax.validation.constraints.Size;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.FileEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsC;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "actualCloseDate", "address", "appointments", "assignedDate", "assignedUsers", "benefits", "billRateCategoryID", "bonusPackage", "branchCode", "businessSector",
		"businessSectors", "campaignSource", "category", "categories", "certifications", "clientContact", "clientCorporation", "committed", "customDate1", "customDate2", "customDate3",
		"customFloat1", "customFloat2", "customFloat3", "customInt1", "customInt2", "customInt3", "customText1", "customText10", "customText11", "customText12", "customText13", "customText14",
		"customText15", "customText16", "customText17", "customText18", "customText19", "customText2", "customText20", "customText3", "customText4", "customText5", "customText6", "customText7",
		"customText8", "customText9", "customTextBlock1", "customTextBlock2", "customTextBlock3", "customTextBlock4", "customTextBlock5", "dateAdded", "dateLastModified", "dealValue", "degreeList",
		"description", "educationDegree", "effectiveDate", "estimatedDuration", "estimatedEndDate", "estimatedHoursPerWeek", "estimatedStartDate", "estimatedBillRate", "expectedCloseDate",
		"expectedFee", "expectedParRate", "externalCategoryID", "externalID", "history", "isDeleted", "ignoreUntilDate", "isOpen", "jobOrders", "lead", "markUpPercentage", "notes", "numOpenings",
		"onSite", "optionsPackage", "owner", "priority", "publicDescription", "publishedZip", "reasonClosed", "salary", "salaryUnit", "skillList", "skills", "source", "specialties", "status",
		"tasks", "tearsheets", "title", "type", "weightedDealValue", "willRelocate", "winProbabilityPercent", "yearsRequired" })
public class Opportunity extends CustomFieldsC implements QueryEntity, SearchEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, FileEntity, AssociationEntity {

	private BigDecimal luceneScore;
	
	private Integer id;
	
	private CorporateUser owner;

	@JsonIgnore
	@Size(max = 100)
	private String title;
	
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
	
	public Opportunity() {
		super();
	}

	public Opportunity(Integer id) {
		super();
		this.id = id;
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

	@JsonProperty("type")
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

	@JsonIgnore
	public DateTime getDateAdded() {
		return dateAdded;
	}

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

	@JsonProperty("appointments")
	public void setAppointments(OneToMany<Appointment> appointments) {
		this.appointments = appointments;
	}

	@JsonIgnore
	public OneToMany<Task> getTasks() {
		return tasks;
	}

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

	@JsonProperty("campaignSource")
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

	@JsonProperty("dateLastModified")
	public void setDateLastModified(DateTime dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((actualCloseDate == null) ? 0 : actualCloseDate.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((appointments == null) ? 0 : appointments.hashCode());
		result = prime * result + ((assignedDate == null) ? 0 : assignedDate.hashCode());
		result = prime * result + ((assignedUsers == null) ? 0 : assignedUsers.hashCode());
		result = prime * result + ((benefits == null) ? 0 : benefits.hashCode());
		result = prime * result + ((billRateCategoryID == null) ? 0 : billRateCategoryID.hashCode());
		result = prime * result + ((bonusPackage == null) ? 0 : bonusPackage.hashCode());
		result = prime * result + ((branchCode == null) ? 0 : branchCode.hashCode());
		result = prime * result + ((businessSector == null) ? 0 : businessSector.hashCode());
		result = prime * result + ((businessSectors == null) ? 0 : businessSectors.hashCode());
		result = prime * result + ((campaignSource == null) ? 0 : campaignSource.hashCode());
		result = prime * result + ((categories == null) ? 0 : categories.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((certifications == null) ? 0 : certifications.hashCode());
		result = prime * result + ((clientContact == null) ? 0 : clientContact.hashCode());
		result = prime * result + ((clientCorporation == null) ? 0 : clientCorporation.hashCode());
		result = prime * result + ((committed == null) ? 0 : committed.hashCode());
		result = prime * result + ((costCenter == null) ? 0 : costCenter.hashCode());
		result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
		result = prime * result + ((dateClientInterview == null) ? 0 : dateClientInterview.hashCode());
		result = prime * result + ((dateLastExported == null) ? 0 : dateLastExported.hashCode());
		result = prime * result + ((dateLastModified == null) ? 0 : dateLastModified.hashCode());
		result = prime * result + ((dealValue == null) ? 0 : dealValue.hashCode());
		result = prime * result + ((degreeList == null) ? 0 : degreeList.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((educationDegree == null) ? 0 : educationDegree.hashCode());
		result = prime * result + ((effectiveDate == null) ? 0 : effectiveDate.hashCode());
		result = prime * result + ((estimatedDuration == null) ? 0 : estimatedDuration.hashCode());
		result = prime * result + ((estimatedEndDate == null) ? 0 : estimatedEndDate.hashCode());
		result = prime * result + ((estimatedHoursPerWeek == null) ? 0 : estimatedHoursPerWeek.hashCode());
		result = prime * result + ((estimatedStartDate == null) ? 0 : estimatedStartDate.hashCode());
		result = prime * result + ((expectedBillRate == null) ? 0 : expectedBillRate.hashCode());
		result = prime * result + ((expectedCloseDate == null) ? 0 : expectedCloseDate.hashCode());
		result = prime * result + ((expectedFee == null) ? 0 : expectedFee.hashCode());
		result = prime * result + ((expectedPayRate == null) ? 0 : expectedPayRate.hashCode());
		result = prime * result + ((externalCategoryID == null) ? 0 : externalCategoryID.hashCode());
		result = prime * result + ((externalID == null) ? 0 : externalID.hashCode());
		result = prime * result + ((hoursOfOperation == null) ? 0 : hoursOfOperation.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ignoreUntilDate == null) ? 0 : ignoreUntilDate.hashCode());
		result = prime * result + ((isClientContact == null) ? 0 : isClientContact.hashCode());
		result = prime * result + ((isClientEditable == null) ? 0 : isClientEditable.hashCode());
		result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
		result = prime * result + ((isExtendable == null) ? 0 : isExtendable.hashCode());
		result = prime * result + ((isInterviewRequired == null) ? 0 : isInterviewRequired.hashCode());
		result = prime * result + ((isOpen == null) ? 0 : isOpen.hashCode());
		result = prime * result + ((isOpportunity == null) ? 0 : isOpportunity.hashCode());
		result = prime * result + ((isPublic == null) ? 0 : isPublic.hashCode());
		result = prime * result + ((jobOrderUUID == null) ? 0 : jobOrderUUID.hashCode());
		result = prime * result + ((jobOrders == null) ? 0 : jobOrders.hashCode());
		result = prime * result + ((lead == null) ? 0 : lead.hashCode());
		result = prime * result + ((luceneScore == null) ? 0 : luceneScore.hashCode());
		result = prime * result + ((markUpPercentage == null) ? 0 : markUpPercentage.hashCode());
		result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		result = prime * result + ((numOpenings == null) ? 0 : numOpenings.hashCode());
		result = prime * result + ((onSite == null) ? 0 : onSite.hashCode());
		result = prime * result + ((optionsPackage == null) ? 0 : optionsPackage.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((priority == null) ? 0 : priority.hashCode());
		result = prime * result + ((publicDescription == null) ? 0 : publicDescription.hashCode());
		result = prime * result + ((publishedZip == null) ? 0 : publishedZip.hashCode());
		result = prime * result + ((reasonClosed == null) ? 0 : reasonClosed.hashCode());
		result = prime * result + ((reportTo == null) ? 0 : reportTo.hashCode());
		result = prime * result + ((reportToClientContact == null) ? 0 : reportToClientContact.hashCode());
		result = prime * result + ((responseUser == null) ? 0 : responseUser.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result + ((salaryRange == null) ? 0 : salaryRange.hashCode());
		result = prime * result + ((salaryUnit == null) ? 0 : salaryUnit.hashCode());
		result = prime * result + ((skillList == null) ? 0 : skillList.hashCode());
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((specialties == null) ? 0 : specialties.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((tasks == null) ? 0 : tasks.hashCode());
		result = prime * result + ((taxRate == null) ? 0 : taxRate.hashCode());
		result = prime * result + ((taxStatus == null) ? 0 : taxStatus.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((webResponses == null) ? 0 : webResponses.hashCode());
		result = prime * result + ((weightedDealValue == null) ? 0 : weightedDealValue.hashCode());
		result = prime * result + ((willRelocate == null) ? 0 : willRelocate.hashCode());
		result = prime * result + ((winProbabilityPercent == null) ? 0 : winProbabilityPercent.hashCode());
		result = prime * result + ((yearsRequired == null) ? 0 : yearsRequired.hashCode());
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
		Opportunity other = (Opportunity) obj;
		if (actualCloseDate == null) {
			if (other.actualCloseDate != null)
				return false;
		} else if (!actualCloseDate.equals(other.actualCloseDate))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (appointments == null) {
			if (other.appointments != null)
				return false;
		} else if (!appointments.equals(other.appointments))
			return false;
		if (assignedDate == null) {
			if (other.assignedDate != null)
				return false;
		} else if (!assignedDate.equals(other.assignedDate))
			return false;
		if (assignedUsers == null) {
			if (other.assignedUsers != null)
				return false;
		} else if (!assignedUsers.equals(other.assignedUsers))
			return false;
		if (benefits == null) {
			if (other.benefits != null)
				return false;
		} else if (!benefits.equals(other.benefits))
			return false;
		if (billRateCategoryID == null) {
			if (other.billRateCategoryID != null)
				return false;
		} else if (!billRateCategoryID.equals(other.billRateCategoryID))
			return false;
		if (bonusPackage == null) {
			if (other.bonusPackage != null)
				return false;
		} else if (!bonusPackage.equals(other.bonusPackage))
			return false;
		if (branchCode == null) {
			if (other.branchCode != null)
				return false;
		} else if (!branchCode.equals(other.branchCode))
			return false;
		if (businessSector == null) {
			if (other.businessSector != null)
				return false;
		} else if (!businessSector.equals(other.businessSector))
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
		if (clientContact == null) {
			if (other.clientContact != null)
				return false;
		} else if (!clientContact.equals(other.clientContact))
			return false;
		if (clientCorporation == null) {
			if (other.clientCorporation != null)
				return false;
		} else if (!clientCorporation.equals(other.clientCorporation))
			return false;
		if (committed == null) {
			if (other.committed != null)
				return false;
		} else if (!committed.equals(other.committed))
			return false;
		if (costCenter == null) {
			if (other.costCenter != null)
				return false;
		} else if (!costCenter.equals(other.costCenter))
			return false;
		if (dateAdded == null) {
			if (other.dateAdded != null)
				return false;
		} else if (!dateAdded.equals(other.dateAdded))
			return false;
		if (dateClientInterview == null) {
			if (other.dateClientInterview != null)
				return false;
		} else if (!dateClientInterview.equals(other.dateClientInterview))
			return false;
		if (dateLastExported == null) {
			if (other.dateLastExported != null)
				return false;
		} else if (!dateLastExported.equals(other.dateLastExported))
			return false;
		if (dateLastModified == null) {
			if (other.dateLastModified != null)
				return false;
		} else if (!dateLastModified.equals(other.dateLastModified))
			return false;
		if (dealValue == null) {
			if (other.dealValue != null)
				return false;
		} else if (!dealValue.equals(other.dealValue))
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
		if (educationDegree == null) {
			if (other.educationDegree != null)
				return false;
		} else if (!educationDegree.equals(other.educationDegree))
			return false;
		if (effectiveDate == null) {
			if (other.effectiveDate != null)
				return false;
		} else if (!effectiveDate.equals(other.effectiveDate))
			return false;
		if (estimatedDuration == null) {
			if (other.estimatedDuration != null)
				return false;
		} else if (!estimatedDuration.equals(other.estimatedDuration))
			return false;
		if (estimatedEndDate == null) {
			if (other.estimatedEndDate != null)
				return false;
		} else if (!estimatedEndDate.equals(other.estimatedEndDate))
			return false;
		if (estimatedHoursPerWeek == null) {
			if (other.estimatedHoursPerWeek != null)
				return false;
		} else if (!estimatedHoursPerWeek.equals(other.estimatedHoursPerWeek))
			return false;
		if (estimatedStartDate == null) {
			if (other.estimatedStartDate != null)
				return false;
		} else if (!estimatedStartDate.equals(other.estimatedStartDate))
			return false;
		if (expectedBillRate == null) {
			if (other.expectedBillRate != null)
				return false;
		} else if (!expectedBillRate.equals(other.expectedBillRate))
			return false;
		if (expectedCloseDate == null) {
			if (other.expectedCloseDate != null)
				return false;
		} else if (!expectedCloseDate.equals(other.expectedCloseDate))
			return false;
		if (expectedFee == null) {
			if (other.expectedFee != null)
				return false;
		} else if (!expectedFee.equals(other.expectedFee))
			return false;
		if (expectedPayRate == null) {
			if (other.expectedPayRate != null)
				return false;
		} else if (!expectedPayRate.equals(other.expectedPayRate))
			return false;
		if (externalCategoryID == null) {
			if (other.externalCategoryID != null)
				return false;
		} else if (!externalCategoryID.equals(other.externalCategoryID))
			return false;
		if (externalID == null) {
			if (other.externalID != null)
				return false;
		} else if (!externalID.equals(other.externalID))
			return false;
		if (hoursOfOperation == null) {
			if (other.hoursOfOperation != null)
				return false;
		} else if (!hoursOfOperation.equals(other.hoursOfOperation))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ignoreUntilDate == null) {
			if (other.ignoreUntilDate != null)
				return false;
		} else if (!ignoreUntilDate.equals(other.ignoreUntilDate))
			return false;
		if (isClientContact == null) {
			if (other.isClientContact != null)
				return false;
		} else if (!isClientContact.equals(other.isClientContact))
			return false;
		if (isClientEditable == null) {
			if (other.isClientEditable != null)
				return false;
		} else if (!isClientEditable.equals(other.isClientEditable))
			return false;
		if (isDeleted == null) {
			if (other.isDeleted != null)
				return false;
		} else if (!isDeleted.equals(other.isDeleted))
			return false;
		if (isExtendable == null) {
			if (other.isExtendable != null)
				return false;
		} else if (!isExtendable.equals(other.isExtendable))
			return false;
		if (isInterviewRequired == null) {
			if (other.isInterviewRequired != null)
				return false;
		} else if (!isInterviewRequired.equals(other.isInterviewRequired))
			return false;
		if (isOpen == null) {
			if (other.isOpen != null)
				return false;
		} else if (!isOpen.equals(other.isOpen))
			return false;
		if (isOpportunity == null) {
			if (other.isOpportunity != null)
				return false;
		} else if (!isOpportunity.equals(other.isOpportunity))
			return false;
		if (isPublic == null) {
			if (other.isPublic != null)
				return false;
		} else if (!isPublic.equals(other.isPublic))
			return false;
		if (jobOrderUUID == null) {
			if (other.jobOrderUUID != null)
				return false;
		} else if (!jobOrderUUID.equals(other.jobOrderUUID))
			return false;
		if (jobOrders == null) {
			if (other.jobOrders != null)
				return false;
		} else if (!jobOrders.equals(other.jobOrders))
			return false;
		if (lead == null) {
			if (other.lead != null)
				return false;
		} else if (!lead.equals(other.lead))
			return false;
		if (luceneScore == null) {
			if (other.luceneScore != null)
				return false;
		} else if (!luceneScore.equals(other.luceneScore))
			return false;
		if (markUpPercentage == null) {
			if (other.markUpPercentage != null)
				return false;
		} else if (!markUpPercentage.equals(other.markUpPercentage))
			return false;
		if (migrateGUID == null) {
			if (other.migrateGUID != null)
				return false;
		} else if (!migrateGUID.equals(other.migrateGUID))
			return false;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		if (numOpenings == null) {
			if (other.numOpenings != null)
				return false;
		} else if (!numOpenings.equals(other.numOpenings))
			return false;
		if (onSite == null) {
			if (other.onSite != null)
				return false;
		} else if (!onSite.equals(other.onSite))
			return false;
		if (optionsPackage == null) {
			if (other.optionsPackage != null)
				return false;
		} else if (!optionsPackage.equals(other.optionsPackage))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (priority == null) {
			if (other.priority != null)
				return false;
		} else if (!priority.equals(other.priority))
			return false;
		if (publicDescription == null) {
			if (other.publicDescription != null)
				return false;
		} else if (!publicDescription.equals(other.publicDescription))
			return false;
		if (publishedZip == null) {
			if (other.publishedZip != null)
				return false;
		} else if (!publishedZip.equals(other.publishedZip))
			return false;
		if (reasonClosed == null) {
			if (other.reasonClosed != null)
				return false;
		} else if (!reasonClosed.equals(other.reasonClosed))
			return false;
		if (reportTo == null) {
			if (other.reportTo != null)
				return false;
		} else if (!reportTo.equals(other.reportTo))
			return false;
		if (reportToClientContact == null) {
			if (other.reportToClientContact != null)
				return false;
		} else if (!reportToClientContact.equals(other.reportToClientContact))
			return false;
		if (responseUser == null) {
			if (other.responseUser != null)
				return false;
		} else if (!responseUser.equals(other.responseUser))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		if (salaryRange == null) {
			if (other.salaryRange != null)
				return false;
		} else if (!salaryRange.equals(other.salaryRange))
			return false;
		if (salaryUnit == null) {
			if (other.salaryUnit != null)
				return false;
		} else if (!salaryUnit.equals(other.salaryUnit))
			return false;
		if (skillList == null) {
			if (other.skillList != null)
				return false;
		} else if (!skillList.equals(other.skillList))
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
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
		if (tasks == null) {
			if (other.tasks != null)
				return false;
		} else if (!tasks.equals(other.tasks))
			return false;
		if (taxRate == null) {
			if (other.taxRate != null)
				return false;
		} else if (!taxRate.equals(other.taxRate))
			return false;
		if (taxStatus == null) {
			if (other.taxStatus != null)
				return false;
		} else if (!taxStatus.equals(other.taxStatus))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (webResponses == null) {
			if (other.webResponses != null)
				return false;
		} else if (!webResponses.equals(other.webResponses))
			return false;
		if (weightedDealValue == null) {
			if (other.weightedDealValue != null)
				return false;
		} else if (!weightedDealValue.equals(other.weightedDealValue))
			return false;
		if (willRelocate == null) {
			if (other.willRelocate != null)
				return false;
		} else if (!willRelocate.equals(other.willRelocate))
			return false;
		if (winProbabilityPercent == null) {
			if (other.winProbabilityPercent != null)
				return false;
		} else if (!winProbabilityPercent.equals(other.winProbabilityPercent))
			return false;
		if (yearsRequired == null) {
			if (other.yearsRequired != null)
				return false;
		} else if (!yearsRequired.equals(other.yearsRequired))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Opportunity {\n\tluceneScore: ").append(luceneScore).append(",\n\tid: ").append(id)
				.append(",\n\towner: ").append(owner).append(",\n\ttitle: ").append(title).append(",\n\ttype: ")
				.append(type).append(",\n\tdescription: ").append(description).append(",\n\testimatedStartDate: ")
				.append(estimatedStartDate).append(",\n\testimatedHoursPerWeek: ").append(estimatedHoursPerWeek)
				.append(",\n\testimatedDuration: ").append(estimatedDuration).append(",\n\tsalary: ").append(salary)
				.append(",\n\tsalaryUnit: ").append(salaryUnit).append(",\n\tonSite: ").append(onSite)
				.append(",\n\ttaxStatus: ").append(taxStatus).append(",\n\tbranchCode: ").append(branchCode)
				.append(",\n\tisOpen: ").append(isOpen).append(",\n\taddress: ").append(address)
				.append(",\n\tdateAdded: ").append(dateAdded).append(",\n\tisDeleted: ").append(isDeleted)
				.append(",\n\texternalCategoryID: ").append(externalCategoryID).append(",\n\tstatus: ").append(status)
				.append(",\n\tclientContact: ").append(clientContact).append(",\n\tpriority: ").append(priority)
				.append(",\n\tisClientContact: ").append(isClientContact).append(",\n\tdateClientInterview: ")
				.append(dateClientInterview).append(",\n\tisPublic: ").append(isPublic).append(",\n\tnumOpenings: ")
				.append(numOpenings).append(",\n\tisExtendable: ").append(isExtendable).append(",\n\tyearsRequired: ")
				.append(yearsRequired).append(",\n\texternalID: ").append(externalID).append(",\n\tactualCloseDate: ")
				.append(actualCloseDate).append(",\n\treasonClosed: ").append(reasonClosed).append(",\n\tsalaryRange: ")
				.append(salaryRange).append(",\n\tcommitted: ").append(committed).append(",\n\twillRelocate: ")
				.append(willRelocate).append(",\n\teducationDegree: ").append(educationDegree)
				.append(",\n\treportToClientContact: ").append(reportToClientContact).append(",\n\testimatedEndDate: ")
				.append(estimatedEndDate).append(",\n\tisInterviewRequired: ").append(isInterviewRequired)
				.append(",\n\tbenefits: ").append(benefits).append(",\n\tcostCenter: ").append(costCenter)
				.append(",\n\treportTo: ").append(reportTo).append(",\n\tskillList: ").append(skillList)
				.append(",\n\tdegreeList: ").append(degreeList).append(",\n\texpectedBillRate: ")
				.append(expectedBillRate).append(",\n\tpublicDescription: ").append(publicDescription)
				.append(",\n\thoursOfOperation: ").append(hoursOfOperation).append(",\n\tsource: ").append(source)
				.append(",\n\toptionsPackage: ").append(optionsPackage).append(",\n\tbonusPackage: ")
				.append(bonusPackage).append(",\n\tjobOrders: ").append(jobOrders).append(",\n\tclientCorporation: ")
				.append(clientCorporation).append(",\n\texpectedPayRate: ").append(expectedPayRate)
				.append(",\n\texpectedFee: ").append(expectedFee).append(",\n\tisClientEditable: ")
				.append(isClientEditable).append(",\n\tresponseUser: ").append(responseUser)
				.append(",\n\tbillRateCategoryID: ").append(billRateCategoryID).append(",\n\texpectedCloseDate: ")
				.append(expectedCloseDate).append(",\n\tassignedDate: ").append(assignedDate)
				.append(",\n\tjobOrderUUID: ").append(jobOrderUUID).append(",\n\tpublishedZip: ").append(publishedZip)
				.append(",\n\tmigrateGUID: ").append(migrateGUID).append(",\n\ttaxRate: ").append(taxRate)
				.append(",\n\tisOpportunity: ").append(isOpportunity).append(",\n\tdateLastExported: ")
				.append(dateLastExported).append(",\n\tignoreUntilDate: ").append(ignoreUntilDate)
				.append(",\n\tappointments: ").append(appointments).append(",\n\ttasks: ").append(tasks)
				.append(",\n\tcertifications: ").append(certifications).append(",\n\tassignedUsers: ")
				.append(assignedUsers).append(",\n\tcategories: ").append(categories).append(",\n\tcategory: ")
				.append(category).append(",\n\tbusinessSector: ").append(businessSector).append(",\n\tspecialties: ")
				.append(specialties).append(",\n\tskills: ").append(skills).append(",\n\tnotes: ").append(notes)
				.append(",\n\tbusinessSectors: ").append(businessSectors).append(",\n\twebResponses: ")
				.append(webResponses).append(",\n\teffectiveDate: ").append(effectiveDate).append(",\n\tlead: ")
				.append(lead).append(",\n\tcampaignSource: ").append(campaignSource).append(",\n\tmarkUpPercentage: ")
				.append(markUpPercentage).append(",\n\twinProbabilityPercent: ").append(winProbabilityPercent)
				.append(",\n\tdealValue: ").append(dealValue).append(",\n\tweightedDealValue: ")
				.append(weightedDealValue).append(",\n\tdateLastModified: ").append(dateLastModified).append("\n}");
		return builder.toString();
	}

}
