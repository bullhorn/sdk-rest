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
import com.bullhornsdk.data.model.entity.embedded.OneToManyLinkedId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "address", "appointments", "approvedPlacements", "assignedUsers", "benefits", "billRateCategoryID",
		"bonusPackage", "branchCode", "businessSectors", "categories", "certificationList", "certifications", "clientBillRate",
		"clientContact", "clientCorporation", "correlatedCustomDate1", "correlatedCustomDate2", "correlatedCustomDate3",
		"correlatedCustomFloat1", "correlatedCustomFloat2", "correlatedCustomFloat3", "correlatedCustomInt1", "correlatedCustomInt2",
		"correlatedCustomInt3", "correlatedCustomText1", "correlatedCustomText10", "correlatedCustomText2", "correlatedCustomText3",
		"correlatedCustomText4", "correlatedCustomText5", "correlatedCustomText6", "correlatedCustomText7", "correlatedCustomText8",
		"correlatedCustomText9", "correlatedCustomTextBlock1", "correlatedCustomTextBlock2", "correlatedCustomTextBlock3", "costCenter",
		"customDate1", "customDate2", "customDate3", "customFloat1", "customFloat2", "customFloat3", "customInt1", "customInt2",
		"customInt3", "customText1", "customText10", "customText11", "customText12", "customText13", "customText14", "customText15",
		"customText16", "customText17", "customText18", "customText19", "customText2", "customText20", "customText3", "customText4",
		"customText5", "customText6", "customText7", "customText8", "customText9", "customTextBlock1", "customTextBlock2",
		"customTextBlock3", "customTextBlock4", "customTextBlock5", "dateAdded", "dateClosed", "dateEnd", "dateLastExported", "degreeList",
		"description", "durationWeeks", "educationDegree", "employmentType", "externalCategoryID", "externalID", "feeArrangement",
		"hoursOfOperation", "hoursPerWeek", "interviews", "isClientEditable", "isDeleted", "isInterviewRequired", "isJobcastPublished",
		"isOpen", "isPublic", "jobBoardList", "notes", "numOpenings", "onSite", "optionsPackage", "owner", "payRate", "placements",
		"publicDescription", "publishedZip", "reasonClosed", "reportTo", "reportToClientContact", "responseUser", "salary", "salaryUnit",
		"sendouts", "skillList", "skills", "source", "specialties", "startDate", "status", "submissions", "tasks", "taxRate", "taxStatus",
		"tearsheets", "timeUnits", "title", "travelRequirements", "type", "webResponses", "willRelocate", "willSponsor", "yearsRequired" })
public class JobOrder extends CustomFieldsC implements QueryEntity, SearchEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, FileEntity,
		AssociationEntity {

	private BigDecimal luceneScore;

	private Integer id;

	private Address address;

	private OneToMany<Specialty> appointments;

	private OneToMany<Placement> approvedPlacements;

	private OneToMany<CorporateUser> assignedUsers;

	@JsonIgnore
	private String benefits;

	private Integer billRateCategoryID;

	@JsonIgnore
	private String bonusPackage;

	@JsonIgnore
	@Size(max = 100)
	private String branchCode;

	private OneToMany<BusinessSector> businessSectors;

	private OneToMany<Category> categories;

	@JsonIgnore
	private String certificationList;

	private OneToMany<Certification> certifications;

	private BigDecimal clientBillRate;

	private ClientContact clientContact;

	private ClientCorporation clientCorporation;

	@JsonIgnore
	@Size(max = 30)
	private String costCenter;

	private DateTime dateAdded;

	private DateTime dateClosed;

	private DateTime dateEnd;

	private DateTime dateLastExported;

	@JsonIgnore
	private String degreeList;

	@Size(max = 200000)
	private String description;

	private BigDecimal durationWeeks;

	@JsonIgnore
	@Size(max = 50)
	private String educationDegree;

	@JsonIgnore
	@Size(max = 200)
	private String employmentType;

	private Integer externalCategoryID;

	@JsonIgnore
	@Size(max = 30)
	private String externalID;

	private BigDecimal feeArrangement;

	@JsonIgnore
	@Size(max = 30)
	private String hoursOfOperation;

	private BigDecimal hoursPerWeek;

	private OneToMany<Appointment> interviews;

	private Boolean isClientEditable;

	private Boolean isDeleted;

	private Boolean isInterviewRequired;

	private Object isJobcastPublished;

	private Boolean isOpen;

	private Integer isPublic;

	@JsonIgnore
	private String jobBoardList;

	private OneToMany<Note> notes;

	private Integer numOpenings;

	@JsonIgnore
	private String onSite;

	@JsonIgnore
	private String optionsPackage;

	private CorporateUser owner;

	private BigDecimal payRate;

	private OneToMany<Placement> placements;

	@JsonIgnore
	@Size(max = 200000)
	private String publicDescription;

	@JsonIgnore
	@Size(max = 18)
	private String publishedZip;

	@JsonIgnore
	private String reasonClosed;

	@JsonIgnore
	@Size(max = 100)
	private String reportTo;

	private ClientContact reportToClientContact;

	private CorporateUser responseUser;

	private BigDecimal salary;

	@JsonIgnore
	@Size(max = 12)
	private String salaryUnit;

	private OneToMany<Sendout> sendouts;

	@JsonIgnore
	private String skillList;

	private OneToMany<Skill> skills;

	@JsonIgnore
	@Size(max = 100)
	private String source;

	private OneToMany<Specialty> specialties;

	private DateTime startDate;

	@JsonIgnore
	@Size(max = 200)
	private String status;

	private OneToMany<JobSubmission> submissions;

	private OneToMany<Task> tasks;

	private BigDecimal taxRate;

	@JsonIgnore
	@Size(max = 20)
	private String taxStatus;

	private OneToManyLinkedId tearsheets;

	private OneToMany<TimeUnit> timeUnits;

	@JsonIgnore
	@Size(max = 100)
	private String title;

	@JsonIgnore
	@Size(max = 50)
	private String travelRequirements;

	private Integer type;

	private OneToMany<JobSubmission> webResponses;

	private Boolean willRelocate;

	private Boolean willSponsor;

	private Integer yearsRequired;

	public JobOrder() {
		super();
	}

	public JobOrder(Integer id) {
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

	@JsonProperty("address")
	public Address getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(Address address) {
		this.address = address;
	}

	@JsonIgnore
	public OneToMany<Specialty> getAppointments() {
		return appointments;
	}

	@JsonProperty("appointments")
	public void setAppointments(OneToMany<Specialty> appointments) {
		this.appointments = appointments;
	}

	@JsonIgnore
	public OneToMany<Placement> getApprovedPlacements() {
		return approvedPlacements;
	}

	@JsonProperty("approvedPlacements")
	public void setApprovedPlacements(OneToMany<Placement> approvedPlacements) {
		this.approvedPlacements = approvedPlacements;
	}

	@JsonIgnore
	public OneToMany<CorporateUser> getAssignedUsers() {
		return assignedUsers;
	}

	@JsonProperty("assignedUsers")
	public void setAssignedUsers(OneToMany<CorporateUser> assignedUsers) {
		this.assignedUsers = assignedUsers;
	}

	@JsonProperty("benefits")
	public String getBenefits() {
		return benefits;
	}

	@JsonIgnore
	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	@JsonProperty("billRateCategoryID")
	public Integer getBillRateCategoryID() {
		return billRateCategoryID;
	}

	@JsonProperty("billRateCategoryID")
	public void setBillRateCategoryID(Integer billRateCategoryID) {
		this.billRateCategoryID = billRateCategoryID;
	}

	@JsonProperty("bonusPackage")
	public String getBonusPackage() {
		return bonusPackage;
	}

	@JsonIgnore
	public void setBonusPackage(String bonusPackage) {
		this.bonusPackage = bonusPackage;
	}

	@JsonProperty("branchCode")
	public String getBranchCode() {
		return branchCode;
	}

	@JsonIgnore
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
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

	@JsonProperty("certificationList")
	public String getCertificationList() {
		return certificationList;
	}

	@JsonIgnore
	public void setCertificationList(String certificationList) {
		this.certificationList = certificationList;
	}

	@JsonIgnore
	public OneToMany<Certification> getCertifications() {
		return certifications;
	}

	@JsonProperty("certifications")
	public void setCertifications(OneToMany<Certification> certifications) {
		this.certifications = certifications;
	}

	@JsonProperty("clientBillRate")
	public BigDecimal getClientBillRate() {
		return clientBillRate;
	}

	@JsonProperty("clientBillRate")
	public void setClientBillRate(BigDecimal clientBillRate) {
		this.clientBillRate = clientBillRate;
	}

	@JsonProperty("clientContact")
	public ClientContact getClientContact() {
		return clientContact;
	}

	@JsonProperty("clientContact")
	public void setClientContact(ClientContact clientContact) {
		this.clientContact = clientContact;
	}

	@JsonProperty("clientCorporation")
	public ClientCorporation getClientCorporation() {
		return clientCorporation;
	}

	@JsonProperty("clientCorporation")
	public void setClientCorporation(ClientCorporation clientCorporation) {
		this.clientCorporation = clientCorporation;
	}

	@JsonProperty("costCenter")
	public String getCostCenter() {
		return costCenter;
	}

	@JsonIgnore
	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	@JsonIgnore
	public DateTime getDateAdded() {
		return dateAdded;
	}

	@JsonProperty("dateAdded")
	public void setDateAdded(DateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	@JsonProperty("dateClosed")
	public DateTime getDateClosed() {
		return dateClosed;
	}

	@JsonProperty("dateClosed")
	public void setDateClosed(DateTime dateClosed) {
		this.dateClosed = dateClosed;
	}

	@JsonProperty("dateEnd")
	public DateTime getDateEnd() {
		return dateEnd;
	}

	@JsonProperty("dateEnd")
	public void setDateEnd(DateTime dateEnd) {
		this.dateEnd = dateEnd;
	}

	@JsonProperty("dateLastExported")
	public DateTime getDateLastExported() {
		return dateLastExported;
	}

	@JsonProperty("dateLastExported")
	public void setDateLastExported(DateTime dateLastExported) {
		this.dateLastExported = dateLastExported;
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

	@JsonProperty("durationWeeks")
	public BigDecimal getDurationWeeks() {
		return durationWeeks;
	}

	@JsonProperty("durationWeeks")
	public void setDurationWeeks(BigDecimal durationWeeks) {
		this.durationWeeks = durationWeeks;
	}

	@JsonProperty("educationDegree")
	public String getEducationDegree() {
		return educationDegree;
	}

	@JsonIgnore
	public void setEducationDegree(String educationDegree) {
		this.educationDegree = educationDegree;
	}

	@JsonProperty("employmentType")
	public String getEmploymentType() {
		return employmentType;
	}

	@JsonIgnore
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	@JsonProperty("externalCategoryID")
	public Integer getExternalCategoryID() {
		return externalCategoryID;
	}

	@JsonProperty("externalCategoryID")
	public void setExternalCategoryID(Integer externalCategoryID) {
		this.externalCategoryID = externalCategoryID;
	}

	@JsonProperty("externalID")
	public String getExternalID() {
		return externalID;
	}

	@JsonIgnore
	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	@JsonProperty("feeArrangement")
	public BigDecimal getFeeArrangement() {
		return feeArrangement;
	}

	@JsonProperty("feeArrangement")
	public void setFeeArrangement(BigDecimal feeArrangement) {
		this.feeArrangement = feeArrangement;
	}

	@JsonProperty("hoursOfOperation")
	public String getHoursOfOperation() {
		return hoursOfOperation;
	}

	@JsonIgnore
	public void setHoursOfOperation(String hoursOfOperation) {
		this.hoursOfOperation = hoursOfOperation;
	}

	@JsonProperty("hoursPerWeek")
	public BigDecimal getHoursPerWeek() {
		return hoursPerWeek;
	}

	@JsonProperty("hoursPerWeek")
	public void setHoursPerWeek(BigDecimal hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	@JsonIgnore
	public OneToMany<Appointment> getInterviews() {
		return interviews;
	}

	@JsonProperty("interviews")
	public void setInterviews(OneToMany<Appointment> interviews) {
		this.interviews = interviews;
	}

	@JsonProperty("isClientEditable")
	public Boolean getIsClientEditable() {
		return isClientEditable;
	}

	@JsonProperty("isClientEditable")
	public void setIsClientEditable(Boolean isClientEditable) {
		this.isClientEditable = isClientEditable;
	}

	@JsonProperty("isDeleted")
	public Boolean getIsDeleted() {
		return isDeleted;
	}

	@JsonProperty("isDeleted")
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@JsonProperty("isInterviewRequired")
	public Boolean getIsInterviewRequired() {
		return isInterviewRequired;
	}

	@JsonProperty("isInterviewRequired")
	public void setIsInterviewRequired(Boolean isInterviewRequired) {
		this.isInterviewRequired = isInterviewRequired;
	}

	@JsonProperty("isJobcastPublished")
	public Object getIsJobcastPublished() {
		return isJobcastPublished;
	}

	@JsonProperty("isJobcastPublished")
	public void setIsJobcastPublished(String isJobcastPublished) {
		this.isJobcastPublished = isJobcastPublished;
	}

	@JsonProperty("isOpen")
	public Boolean getIsOpen() {
		return isOpen;
	}

	@JsonProperty("isOpen")
	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}

	@JsonProperty("isPublic")
	public Integer getIsPublic() {
		return isPublic;
	}

	@JsonProperty("isPublic")
	public void setIsPublic(Integer isPublic) {
		this.isPublic = isPublic;
	}

	@JsonProperty("jobBoardList")
	public String getJobBoardList() {
		return jobBoardList;
	}

	@JsonIgnore
	public void setJobBoardList(String jobBoardList) {
		this.jobBoardList = jobBoardList;
	}

	@JsonIgnore
	public OneToMany<Note> getNotes() {
		return notes;
	}

	@JsonProperty("notes")
	public void setNotes(OneToMany<Note> notes) {
		this.notes = notes;
	}

	@JsonProperty("numOpenings")
	public Integer getNumOpenings() {
		return numOpenings;
	}

	@JsonProperty("numOpenings")
	public void setNumOpenings(Integer numOpenings) {
		this.numOpenings = numOpenings;
	}

	@JsonProperty("onSite")
	public String getOnSite() {
		return onSite;
	}

	@JsonIgnore
	public void setOnSite(String onSite) {
		this.onSite = onSite;
	}

	@JsonProperty("optionsPackage")
	public String getOptionsPackage() {
		return optionsPackage;
	}

	@JsonIgnore
	public void setOptionsPackage(String optionsPackage) {
		this.optionsPackage = optionsPackage;
	}

	@JsonProperty("owner")
	public CorporateUser getOwner() {
		return owner;
	}

	@JsonProperty("owner")
	public void setOwner(CorporateUser owner) {
		this.owner = owner;
	}

	@JsonProperty("payRate")
	public BigDecimal getPayRate() {
		return payRate;
	}

	@JsonProperty("payRate")
	public void setPayRate(BigDecimal payRate) {
		this.payRate = payRate;
	}

	@JsonIgnore
	public OneToMany<Placement> getPlacements() {
		return placements;
	}

	@JsonProperty("placements")
	public void setPlacements(OneToMany<Placement> placements) {
		this.placements = placements;
	}

	@JsonProperty("publicDescription")
	public String getPublicDescription() {
		return publicDescription;
	}

	@JsonIgnore
	public void setPublicDescription(String publicDescription) {
		this.publicDescription = publicDescription;
	}

	@JsonProperty("publishedZip")
	public String getPublishedZip() {
		return publishedZip;
	}

	@JsonIgnore
	public void setPublishedZip(String publishedZip) {
		this.publishedZip = publishedZip;
	}

	@JsonProperty("reasonClosed")
	public String getReasonClosed() {
		return reasonClosed;
	}

	@JsonIgnore
	public void setReasonClosed(String reasonClosed) {
		this.reasonClosed = reasonClosed;
	}

	@JsonProperty("reportTo")
	public String getReportTo() {
		return reportTo;
	}

	@JsonIgnore
	public void setReportTo(String reportTo) {
		this.reportTo = reportTo;
	}

	@JsonIgnore
	public ClientContact getReportToClientContact() {
		return reportToClientContact;
	}

	@JsonProperty("reportToClientContact")
	public void setReportToClientContact(ClientContact reportToClientContact) {
		this.reportToClientContact = reportToClientContact;
	}

	@JsonProperty("responseUser")
	public CorporateUser getResponseUser() {
		return responseUser;
	}

	@JsonProperty("responseUser")
	public void setResponseUser(CorporateUser responseUser) {
		this.responseUser = responseUser;
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

	@JsonIgnore
	public void setSalaryUnit(String salaryUnit) {
		this.salaryUnit = salaryUnit;
	}

	@JsonIgnore
	public OneToMany<Sendout> getSendouts() {
		return sendouts;
	}

	@JsonProperty("sendouts")
	public void setSendouts(OneToMany<Sendout> sendouts) {
		this.sendouts = sendouts;
	}

	@JsonProperty("skillList")
	public String getSkillList() {
		return skillList;
	}

	@JsonIgnore
	public void setSkillList(String skillList) {
		this.skillList = skillList;
	}

	@JsonIgnore
	public OneToMany<Skill> getSkills() {
		return skills;
	}

	@JsonProperty("skills")
	public void setSkills(OneToMany<Skill> skills) {
		this.skills = skills;
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

	@JsonProperty("startDate")
	public DateTime getStartDate() {
		return startDate;
	}

	@JsonProperty("startDate")
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonIgnore
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonIgnore
	public OneToMany<JobSubmission> getSubmissions() {
		return submissions;
	}

	@JsonProperty("submissions")
	public void setSubmissions(OneToMany<JobSubmission> submissions) {
		this.submissions = submissions;
	}

	@JsonIgnore
	public OneToMany<Task> getTasks() {
		return tasks;
	}

	@JsonProperty("tasks")
	public void setTasks(OneToMany<Task> tasks) {
		this.tasks = tasks;
	}

	@JsonProperty("taxRate")
	public BigDecimal getTaxRate() {
		return taxRate;
	}

	@JsonProperty("taxRate")
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	@JsonProperty("taxStatus")
	public String getTaxStatus() {
		return taxStatus;
	}

	@JsonIgnore
	public void setTaxStatus(String taxStatus) {
		this.taxStatus = taxStatus;
	}

	@JsonIgnore
	public OneToManyLinkedId getTearsheets() {
		return tearsheets;
	}

	@JsonProperty("tearsheets")
	public void setTearsheets(OneToManyLinkedId tearsheets) {
		this.tearsheets = tearsheets;
	}

	@JsonIgnore
	public OneToMany<TimeUnit> getTimeUnits() {
		return timeUnits;
	}

	@JsonProperty("timeUnits")
	public void setTimeUnits(OneToMany<TimeUnit> timeUnits) {
		this.timeUnits = timeUnits;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonIgnore
	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("travelRequirements")
	public String getTravelRequirements() {
		return travelRequirements;
	}

	@JsonIgnore
	public void setTravelRequirements(String travelRequirements) {
		this.travelRequirements = travelRequirements;
	}

	@JsonProperty("type")
	public Integer getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(Integer type) {
		this.type = type;
	}

	@JsonIgnore
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

	@JsonProperty("willSponsor")
	public Boolean getWillSponsor() {
		return willSponsor;
	}

	@JsonProperty("willSponsor")
	public void setWillSponsor(Boolean willSponsor) {
		this.willSponsor = willSponsor;
	}

	@JsonProperty("yearsRequired")
	public Integer getYearsRequired() {
		return yearsRequired;
	}

	@JsonProperty("yearsRequired")
	public void setYearsRequired(Integer yearsRequired) {
		this.yearsRequired = yearsRequired;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((appointments == null) ? 0 : appointments.hashCode());
		result = prime * result + ((approvedPlacements == null) ? 0 : approvedPlacements.hashCode());
		result = prime * result + ((assignedUsers == null) ? 0 : assignedUsers.hashCode());
		result = prime * result + ((benefits == null) ? 0 : benefits.hashCode());
		result = prime * result + ((billRateCategoryID == null) ? 0 : billRateCategoryID.hashCode());
		result = prime * result + ((bonusPackage == null) ? 0 : bonusPackage.hashCode());
		result = prime * result + ((branchCode == null) ? 0 : branchCode.hashCode());
		result = prime * result + ((businessSectors == null) ? 0 : businessSectors.hashCode());
		result = prime * result + ((categories == null) ? 0 : categories.hashCode());
		result = prime * result + ((certificationList == null) ? 0 : certificationList.hashCode());
		result = prime * result + ((certifications == null) ? 0 : certifications.hashCode());
		result = prime * result + ((clientBillRate == null) ? 0 : clientBillRate.hashCode());
		result = prime * result + ((clientContact == null) ? 0 : clientContact.hashCode());
		result = prime * result + ((clientCorporation == null) ? 0 : clientCorporation.hashCode());
		result = prime * result + ((costCenter == null) ? 0 : costCenter.hashCode());
		result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
		result = prime * result + ((dateClosed == null) ? 0 : dateClosed.hashCode());
		result = prime * result + ((dateEnd == null) ? 0 : dateEnd.hashCode());
		result = prime * result + ((dateLastExported == null) ? 0 : dateLastExported.hashCode());
		result = prime * result + ((degreeList == null) ? 0 : degreeList.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((durationWeeks == null) ? 0 : durationWeeks.hashCode());
		result = prime * result + ((educationDegree == null) ? 0 : educationDegree.hashCode());
		result = prime * result + ((employmentType == null) ? 0 : employmentType.hashCode());
		result = prime * result + ((externalCategoryID == null) ? 0 : externalCategoryID.hashCode());
		result = prime * result + ((externalID == null) ? 0 : externalID.hashCode());
		result = prime * result + ((feeArrangement == null) ? 0 : feeArrangement.hashCode());
		result = prime * result + ((hoursOfOperation == null) ? 0 : hoursOfOperation.hashCode());
		result = prime * result + ((hoursPerWeek == null) ? 0 : hoursPerWeek.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((interviews == null) ? 0 : interviews.hashCode());
		result = prime * result + ((isClientEditable == null) ? 0 : isClientEditable.hashCode());
		result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
		result = prime * result + ((isInterviewRequired == null) ? 0 : isInterviewRequired.hashCode());
		result = prime * result + ((isJobcastPublished == null) ? 0 : isJobcastPublished.hashCode());
		result = prime * result + ((isOpen == null) ? 0 : isOpen.hashCode());
		result = prime * result + ((isPublic == null) ? 0 : isPublic.hashCode());
		result = prime * result + ((jobBoardList == null) ? 0 : jobBoardList.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		result = prime * result + ((numOpenings == null) ? 0 : numOpenings.hashCode());
		result = prime * result + ((onSite == null) ? 0 : onSite.hashCode());
		result = prime * result + ((optionsPackage == null) ? 0 : optionsPackage.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((payRate == null) ? 0 : payRate.hashCode());
		result = prime * result + ((placements == null) ? 0 : placements.hashCode());
		result = prime * result + ((publicDescription == null) ? 0 : publicDescription.hashCode());
		result = prime * result + ((publishedZip == null) ? 0 : publishedZip.hashCode());
		result = prime * result + ((reasonClosed == null) ? 0 : reasonClosed.hashCode());
		result = prime * result + ((reportTo == null) ? 0 : reportTo.hashCode());
		result = prime * result + ((reportToClientContact == null) ? 0 : reportToClientContact.hashCode());
		result = prime * result + ((responseUser == null) ? 0 : responseUser.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result + ((salaryUnit == null) ? 0 : salaryUnit.hashCode());
		result = prime * result + ((sendouts == null) ? 0 : sendouts.hashCode());
		result = prime * result + ((skillList == null) ? 0 : skillList.hashCode());
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((specialties == null) ? 0 : specialties.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((submissions == null) ? 0 : submissions.hashCode());
		result = prime * result + ((tasks == null) ? 0 : tasks.hashCode());
		result = prime * result + ((taxRate == null) ? 0 : taxRate.hashCode());
		result = prime * result + ((taxStatus == null) ? 0 : taxStatus.hashCode());
		result = prime * result + ((tearsheets == null) ? 0 : tearsheets.hashCode());
		result = prime * result + ((timeUnits == null) ? 0 : timeUnits.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((travelRequirements == null) ? 0 : travelRequirements.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((webResponses == null) ? 0 : webResponses.hashCode());
		result = prime * result + ((willRelocate == null) ? 0 : willRelocate.hashCode());
		result = prime * result + ((willSponsor == null) ? 0 : willSponsor.hashCode());
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
		JobOrder other = (JobOrder) obj;
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
		if (approvedPlacements == null) {
			if (other.approvedPlacements != null)
				return false;
		} else if (!approvedPlacements.equals(other.approvedPlacements))
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
		if (clientBillRate == null) {
			if (other.clientBillRate != null)
				return false;
		} else if (!clientBillRate.equals(other.clientBillRate))
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
		if (costCenter == null) {
			if (other.costCenter != null)
				return false;
		} else if (!costCenter.equals(other.costCenter))
			return false;
		if (dateAdded == null) {
			if (other.dateAdded != null)
				return false;
		} else if (!dateAdded.isEqual(other.dateAdded))
			return false;
		if (dateClosed == null) {
			if (other.dateClosed != null)
				return false;
		} else if (!dateClosed.isEqual(other.dateClosed))
			return false;
		if (dateEnd == null) {
			if (other.dateEnd != null)
				return false;
		} else if (!dateEnd.isEqual(other.dateEnd))
			return false;
		if (dateLastExported == null) {
			if (other.dateLastExported != null)
				return false;
		} else if (!dateLastExported.isEqual(other.dateLastExported))
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
		if (durationWeeks == null) {
			if (other.durationWeeks != null)
				return false;
		} else if (!durationWeeks.equals(other.durationWeeks))
			return false;
		if (educationDegree == null) {
			if (other.educationDegree != null)
				return false;
		} else if (!educationDegree.equals(other.educationDegree))
			return false;
		if (employmentType == null) {
			if (other.employmentType != null)
				return false;
		} else if (!employmentType.equals(other.employmentType))
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
		if (feeArrangement == null) {
			if (other.feeArrangement != null)
				return false;
		} else if (!feeArrangement.equals(other.feeArrangement))
			return false;
		if (hoursOfOperation == null) {
			if (other.hoursOfOperation != null)
				return false;
		} else if (!hoursOfOperation.equals(other.hoursOfOperation))
			return false;
		if (hoursPerWeek == null) {
			if (other.hoursPerWeek != null)
				return false;
		} else if (!hoursPerWeek.equals(other.hoursPerWeek))
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
		if (isInterviewRequired == null) {
			if (other.isInterviewRequired != null)
				return false;
		} else if (!isInterviewRequired.equals(other.isInterviewRequired))
			return false;
		if (isJobcastPublished == null) {
			if (other.isJobcastPublished != null)
				return false;
		} else if (!isJobcastPublished.equals(other.isJobcastPublished))
			return false;
		if (isOpen == null) {
			if (other.isOpen != null)
				return false;
		} else if (!isOpen.equals(other.isOpen))
			return false;
		if (isPublic == null) {
			if (other.isPublic != null)
				return false;
		} else if (!isPublic.equals(other.isPublic))
			return false;
		if (jobBoardList == null) {
			if (other.jobBoardList != null)
				return false;
		} else if (!jobBoardList.equals(other.jobBoardList))
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
		if (payRate == null) {
			if (other.payRate != null)
				return false;
		} else if (!payRate.equals(other.payRate))
			return false;
		if (placements == null) {
			if (other.placements != null)
				return false;
		} else if (!placements.equals(other.placements))
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
		if (salaryUnit == null) {
			if (other.salaryUnit != null)
				return false;
		} else if (!salaryUnit.equals(other.salaryUnit))
			return false;
		if (sendouts == null) {
			if (other.sendouts != null)
				return false;
		} else if (!sendouts.equals(other.sendouts))
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
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.isEqual(other.startDate))
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
		if (tearsheets == null) {
			if (other.tearsheets != null)
				return false;
		} else if (!tearsheets.equals(other.tearsheets))
			return false;
		if (timeUnits == null) {
			if (other.timeUnits != null)
				return false;
		} else if (!timeUnits.equals(other.timeUnits))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (travelRequirements == null) {
			if (other.travelRequirements != null)
				return false;
		} else if (!travelRequirements.equals(other.travelRequirements))
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
		if (willRelocate == null) {
			if (other.willRelocate != null)
				return false;
		} else if (!willRelocate.equals(other.willRelocate))
			return false;
		if (willSponsor == null) {
			if (other.willSponsor != null)
				return false;
		} else if (!willSponsor.equals(other.willSponsor))
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
		builder.append("JobOrder {\nid=");
		builder.append(id);
		builder.append(", \naddress=");
		builder.append(address);
		builder.append(", \nappointments=");
		builder.append(appointments);
		builder.append(", \napprovedPlacements=");
		builder.append(approvedPlacements);
		builder.append(", \nassignedUsers=");
		builder.append(assignedUsers);
		builder.append(", \nbenefits=");
		builder.append(benefits);
		builder.append(", \nbillRateCategoryID=");
		builder.append(billRateCategoryID);
		builder.append(", \nbonusPackage=");
		builder.append(bonusPackage);
		builder.append(", \nbranchCode=");
		builder.append(branchCode);
		builder.append(", \nbusinessSectors=");
		builder.append(businessSectors);
		builder.append(", \ncategories=");
		builder.append(categories);
		builder.append(", \ncertificationList=");
		builder.append(certificationList);
		builder.append(", \ncertifications=");
		builder.append(certifications);
		builder.append(", \nclientBillRate=");
		builder.append(clientBillRate);
		builder.append(", \nclientContact=");
		builder.append(clientContact);
		builder.append(", \nclientCorporation=");
		builder.append(clientCorporation);
		builder.append(", \ncostCenter=");
		builder.append(costCenter);
		builder.append(super.toString());
		builder.append(", \ndateAdded=");
		builder.append(dateAdded);
		builder.append(", \ndateClosed=");
		builder.append(dateClosed);
		builder.append(", \ndateEnd=");
		builder.append(dateEnd);
		builder.append(", \ndateLastExported=");
		builder.append(dateLastExported);
		builder.append(", \ndegreeList=");
		builder.append(degreeList);
		builder.append(", \ndescription=");
		builder.append(description);
		builder.append(", \ndurationWeeks=");
		builder.append(durationWeeks);
		builder.append(", \neducationDegree=");
		builder.append(educationDegree);
		builder.append(", \nemploymentType=");
		builder.append(employmentType);
		builder.append(", \nexternalCategoryID=");
		builder.append(externalCategoryID);
		builder.append(", \nexternalID=");
		builder.append(externalID);
		builder.append(", \nfeeArrangement=");
		builder.append(feeArrangement);
		builder.append(", \nhoursOfOperation=");
		builder.append(hoursOfOperation);
		builder.append(", \nhoursPerWeek=");
		builder.append(hoursPerWeek);
		builder.append(", \ninterviews=");
		builder.append(interviews);
		builder.append(", \nisClientEditable=");
		builder.append(isClientEditable);
		builder.append(", \nisDeleted=");
		builder.append(isDeleted);
		builder.append(", \nisInterviewRequired=");
		builder.append(isInterviewRequired);
		builder.append(", \nisJobcastPublished=");
		builder.append(isJobcastPublished);
		builder.append(", \nisOpen=");
		builder.append(isOpen);
		builder.append(", \nisPublic=");
		builder.append(isPublic);
		builder.append(", \njobBoardList=");
		builder.append(jobBoardList);
		builder.append(", \nnotes=");
		builder.append(notes);
		builder.append(", \nnumOpenings=");
		builder.append(numOpenings);
		builder.append(", \nonSite=");
		builder.append(onSite);
		builder.append(", \noptionsPackage=");
		builder.append(optionsPackage);
		builder.append(", \nowner=");
		builder.append(owner);
		builder.append(", \npayRate=");
		builder.append(payRate);
		builder.append(", \nplacements=");
		builder.append(placements);
		builder.append(", \npublicDescription=");
		builder.append(publicDescription);
		builder.append(", \npublishedZip=");
		builder.append(publishedZip);
		builder.append(", \nreasonClosed=");
		builder.append(reasonClosed);
		builder.append(", \nreportTo=");
		builder.append(reportTo);
		builder.append(", \nreportToClientContact=");
		builder.append(reportToClientContact);
		builder.append(", \nresponseUser=");
		builder.append(responseUser);
		builder.append(", \nsalary=");
		builder.append(salary);
		builder.append(", \nsalaryUnit=");
		builder.append(salaryUnit);
		builder.append(", \nsendouts=");
		builder.append(sendouts);
		builder.append(", \nskillList=");
		builder.append(skillList);
		builder.append(", \nskills=");
		builder.append(skills);
		builder.append(", \nsource=");
		builder.append(source);
		builder.append(", \nspecialties=");
		builder.append(specialties);
		builder.append(", \nstartDate=");
		builder.append(startDate);
		builder.append(", \nstatus=");
		builder.append(status);
		builder.append(", \nsubmissions=");
		builder.append(submissions);
		builder.append(", \ntasks=");
		builder.append(tasks);
		builder.append(", \ntaxRate=");
		builder.append(taxRate);
		builder.append(", \ntaxStatus=");
		builder.append(taxStatus);
		builder.append(", \ntearsheets=");
		builder.append(tearsheets);
		builder.append(", \ntimeUnits=");
		builder.append(timeUnits);
		builder.append(", \ntitle=");
		builder.append(title);
		builder.append(", \ntravelRequirements=");
		builder.append(travelRequirements);
		builder.append(", \ntype=");
		builder.append(type);
		builder.append(", \nwebResponses=");
		builder.append(webResponses);
		builder.append(", \nwillRelocate=");
		builder.append(willRelocate);
		builder.append(", \nwillSponsor=");
		builder.append(willSponsor);
		builder.append(", \nyearsRequired=");
		builder.append(yearsRequired);
		builder.append("\n}");
		return builder.toString();
	}

}
