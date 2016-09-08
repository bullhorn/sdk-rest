package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.api.helper.RestOneToManySerializer;
import com.bullhornsdk.data.model.entity.core.customobject.*;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsC;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.embedded.OneToManyLinkedId;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;

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
		"customTextBlock3", "customTextBlock4", "customTextBlock5", "dateAdded", "dateClosed", "dateEnd", "dateLastExported", "dateLastModified", "degreeList",
		"description", "durationWeeks", "educationDegree", "employmentType", "externalCategoryID", "externalID", "feeArrangement",
		"hoursOfOperation", "hoursPerWeek", "interviews", "isClientEditable", "isDeleted", "isInterviewRequired", "isJobcastPublished",
		"isOpen", "isPublic", "jobBoardList", "notes", "numOpenings", "onSite", "opportunity", "optionsPackage", "owner", "payRate", "placements",
		"publicDescription", "publishedZip", "reasonClosed", "reportTo", "reportToClientContact", "responseUser", "salary", "salaryUnit",
		"sendouts", "skillList", "skills", "source", "specialties", "startDate", "status", "submissions", "tasks", "taxRate", "taxStatus",
		"tearsheets", "timeUnits", "title", "travelRequirements", "type", "webResponses", "willRelocate", "willSponsor", "yearsRequired",
        "customObject1s", "customObject2s", "customObject3s", "customObject4s", "customObject5s", "customObject6s", "customObject7s",
        "customObject8s", "customObject9s", "customObject10s"})
public class JobOrder extends CustomFieldsC implements QueryEntity, SearchEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, FileEntity,
		AssociationEntity, DateLastModifiedEntity, EditHistoryEntity {

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

	private DateTime dateLastModified;

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

	private Opportunity opportunity;

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

	@JsonIgnore
	public OneToMany<Specialty> getAppointments() {
		return appointments;
	}

    @ReadOnly
	@JsonProperty("appointments")
	public void setAppointments(OneToMany<Specialty> appointments) {
		this.appointments = appointments;
	}

	@JsonIgnore
	public OneToMany<Placement> getApprovedPlacements() {
		return approvedPlacements;
	}

    @ReadOnly
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

    @ReadOnly
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

    @ReadOnly
	@JsonProperty("dateLastExported")
	public void setDateLastExported(DateTime dateLastExported) {
		this.dateLastExported = dateLastExported;
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

    @ReadOnly
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

    @ReadOnly
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

	@JsonProperty("opportunity")
	public Opportunity getOpportunity() {
		return opportunity;
	}

	@JsonProperty("opportunity")
	public void setOpportunity(Opportunity opportunity) {
		this.opportunity = opportunity;
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

    @ReadOnly
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

    @ReadOnly
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

    @ReadOnly
	@JsonProperty("submissions")
	public void setSubmissions(OneToMany<JobSubmission> submissions) {
		this.submissions = submissions;
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

	@ReadOnly
	@JsonProperty("tearsheets")
	public void setTearsheets(OneToManyLinkedId tearsheets) {
		this.tearsheets = tearsheets;
	}

	@JsonIgnore
	public OneToMany<TimeUnit> getTimeUnits() {
		return timeUnits;
	}

    @ReadOnly
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

		JobOrder jobOrder = (JobOrder) o;

		if (luceneScore != null ? !luceneScore.equals(jobOrder.luceneScore) : jobOrder.luceneScore != null)
			return false;
		if (id != null ? !id.equals(jobOrder.id) : jobOrder.id != null) return false;
		if (address != null ? !address.equals(jobOrder.address) : jobOrder.address != null) return false;
		if (appointments != null ? !appointments.equals(jobOrder.appointments) : jobOrder.appointments != null)
			return false;
		if (approvedPlacements != null ? !approvedPlacements.equals(jobOrder.approvedPlacements) : jobOrder.approvedPlacements != null)
			return false;
		if (assignedUsers != null ? !assignedUsers.equals(jobOrder.assignedUsers) : jobOrder.assignedUsers != null)
			return false;
		if (benefits != null ? !benefits.equals(jobOrder.benefits) : jobOrder.benefits != null) return false;
		if (billRateCategoryID != null ? !billRateCategoryID.equals(jobOrder.billRateCategoryID) : jobOrder.billRateCategoryID != null)
			return false;
		if (bonusPackage != null ? !bonusPackage.equals(jobOrder.bonusPackage) : jobOrder.bonusPackage != null)
			return false;
		if (branchCode != null ? !branchCode.equals(jobOrder.branchCode) : jobOrder.branchCode != null) return false;
		if (businessSectors != null ? !businessSectors.equals(jobOrder.businessSectors) : jobOrder.businessSectors != null)
			return false;
		if (categories != null ? !categories.equals(jobOrder.categories) : jobOrder.categories != null) return false;
		if (certificationList != null ? !certificationList.equals(jobOrder.certificationList) : jobOrder.certificationList != null)
			return false;
		if (certifications != null ? !certifications.equals(jobOrder.certifications) : jobOrder.certifications != null)
			return false;
		if (clientBillRate != null ? !clientBillRate.equals(jobOrder.clientBillRate) : jobOrder.clientBillRate != null)
			return false;
		if (clientContact != null ? !clientContact.equals(jobOrder.clientContact) : jobOrder.clientContact != null)
			return false;
		if (clientCorporation != null ? !clientCorporation.equals(jobOrder.clientCorporation) : jobOrder.clientCorporation != null)
			return false;
		if (costCenter != null ? !costCenter.equals(jobOrder.costCenter) : jobOrder.costCenter != null) return false;
		if (dateAdded != null ? !dateAdded.equals(jobOrder.dateAdded) : jobOrder.dateAdded != null) return false;
		if (dateClosed != null ? !dateClosed.equals(jobOrder.dateClosed) : jobOrder.dateClosed != null) return false;
		if (dateEnd != null ? !dateEnd.equals(jobOrder.dateEnd) : jobOrder.dateEnd != null) return false;
		if (dateLastExported != null ? !dateLastExported.equals(jobOrder.dateLastExported) : jobOrder.dateLastExported != null)
			return false;
		if (dateLastModified != null ? !dateLastModified.equals(jobOrder.dateLastModified) : jobOrder.dateLastModified != null)
			return false;
		if (degreeList != null ? !degreeList.equals(jobOrder.degreeList) : jobOrder.degreeList != null) return false;
		if (description != null ? !description.equals(jobOrder.description) : jobOrder.description != null)
			return false;
		if (durationWeeks != null ? !durationWeeks.equals(jobOrder.durationWeeks) : jobOrder.durationWeeks != null)
			return false;
		if (educationDegree != null ? !educationDegree.equals(jobOrder.educationDegree) : jobOrder.educationDegree != null)
			return false;
		if (employmentType != null ? !employmentType.equals(jobOrder.employmentType) : jobOrder.employmentType != null)
			return false;
		if (externalCategoryID != null ? !externalCategoryID.equals(jobOrder.externalCategoryID) : jobOrder.externalCategoryID != null)
			return false;
		if (externalID != null ? !externalID.equals(jobOrder.externalID) : jobOrder.externalID != null) return false;
		if (feeArrangement != null ? !feeArrangement.equals(jobOrder.feeArrangement) : jobOrder.feeArrangement != null)
			return false;
		if (hoursOfOperation != null ? !hoursOfOperation.equals(jobOrder.hoursOfOperation) : jobOrder.hoursOfOperation != null)
			return false;
		if (hoursPerWeek != null ? !hoursPerWeek.equals(jobOrder.hoursPerWeek) : jobOrder.hoursPerWeek != null)
			return false;
		if (interviews != null ? !interviews.equals(jobOrder.interviews) : jobOrder.interviews != null) return false;
		if (isClientEditable != null ? !isClientEditable.equals(jobOrder.isClientEditable) : jobOrder.isClientEditable != null)
			return false;
		if (isDeleted != null ? !isDeleted.equals(jobOrder.isDeleted) : jobOrder.isDeleted != null) return false;
		if (isInterviewRequired != null ? !isInterviewRequired.equals(jobOrder.isInterviewRequired) : jobOrder.isInterviewRequired != null)
			return false;
		if (isJobcastPublished != null ? !isJobcastPublished.equals(jobOrder.isJobcastPublished) : jobOrder.isJobcastPublished != null)
			return false;
		if (isOpen != null ? !isOpen.equals(jobOrder.isOpen) : jobOrder.isOpen != null) return false;
		if (isPublic != null ? !isPublic.equals(jobOrder.isPublic) : jobOrder.isPublic != null) return false;
		if (jobBoardList != null ? !jobBoardList.equals(jobOrder.jobBoardList) : jobOrder.jobBoardList != null)
			return false;
		if (notes != null ? !notes.equals(jobOrder.notes) : jobOrder.notes != null) return false;
		if (numOpenings != null ? !numOpenings.equals(jobOrder.numOpenings) : jobOrder.numOpenings != null)
			return false;
		if (onSite != null ? !onSite.equals(jobOrder.onSite) : jobOrder.onSite != null) return false;
		if (optionsPackage != null ? !optionsPackage.equals(jobOrder.optionsPackage) : jobOrder.optionsPackage != null)
			return false;
		if (opportunity != null ? !opportunity.equals(jobOrder.opportunity) : jobOrder.opportunity != null)
			return false;
		if (owner != null ? !owner.equals(jobOrder.owner) : jobOrder.owner != null) return false;
		if (payRate != null ? !payRate.equals(jobOrder.payRate) : jobOrder.payRate != null) return false;
		if (placements != null ? !placements.equals(jobOrder.placements) : jobOrder.placements != null) return false;
		if (publicDescription != null ? !publicDescription.equals(jobOrder.publicDescription) : jobOrder.publicDescription != null)
			return false;
		if (publishedZip != null ? !publishedZip.equals(jobOrder.publishedZip) : jobOrder.publishedZip != null)
			return false;
		if (reasonClosed != null ? !reasonClosed.equals(jobOrder.reasonClosed) : jobOrder.reasonClosed != null)
			return false;
		if (reportTo != null ? !reportTo.equals(jobOrder.reportTo) : jobOrder.reportTo != null) return false;
		if (reportToClientContact != null ? !reportToClientContact.equals(jobOrder.reportToClientContact) : jobOrder.reportToClientContact != null)
			return false;
		if (responseUser != null ? !responseUser.equals(jobOrder.responseUser) : jobOrder.responseUser != null)
			return false;
		if (salary != null ? !salary.equals(jobOrder.salary) : jobOrder.salary != null) return false;
		if (salaryUnit != null ? !salaryUnit.equals(jobOrder.salaryUnit) : jobOrder.salaryUnit != null) return false;
		if (sendouts != null ? !sendouts.equals(jobOrder.sendouts) : jobOrder.sendouts != null) return false;
		if (skillList != null ? !skillList.equals(jobOrder.skillList) : jobOrder.skillList != null) return false;
		if (skills != null ? !skills.equals(jobOrder.skills) : jobOrder.skills != null) return false;
		if (source != null ? !source.equals(jobOrder.source) : jobOrder.source != null) return false;
		if (specialties != null ? !specialties.equals(jobOrder.specialties) : jobOrder.specialties != null)
			return false;
		if (startDate != null ? !startDate.equals(jobOrder.startDate) : jobOrder.startDate != null) return false;
		if (status != null ? !status.equals(jobOrder.status) : jobOrder.status != null) return false;
		if (submissions != null ? !submissions.equals(jobOrder.submissions) : jobOrder.submissions != null)
			return false;
		if (tasks != null ? !tasks.equals(jobOrder.tasks) : jobOrder.tasks != null) return false;
		if (taxRate != null ? !taxRate.equals(jobOrder.taxRate) : jobOrder.taxRate != null) return false;
		if (taxStatus != null ? !taxStatus.equals(jobOrder.taxStatus) : jobOrder.taxStatus != null) return false;
		if (tearsheets != null ? !tearsheets.equals(jobOrder.tearsheets) : jobOrder.tearsheets != null) return false;
		if (timeUnits != null ? !timeUnits.equals(jobOrder.timeUnits) : jobOrder.timeUnits != null) return false;
		if (title != null ? !title.equals(jobOrder.title) : jobOrder.title != null) return false;
		if (travelRequirements != null ? !travelRequirements.equals(jobOrder.travelRequirements) : jobOrder.travelRequirements != null)
			return false;
		if (type != null ? !type.equals(jobOrder.type) : jobOrder.type != null) return false;
		if (webResponses != null ? !webResponses.equals(jobOrder.webResponses) : jobOrder.webResponses != null)
			return false;
		if (willRelocate != null ? !willRelocate.equals(jobOrder.willRelocate) : jobOrder.willRelocate != null)
			return false;
		if (willSponsor != null ? !willSponsor.equals(jobOrder.willSponsor) : jobOrder.willSponsor != null)
			return false;
		if (yearsRequired != null ? !yearsRequired.equals(jobOrder.yearsRequired) : jobOrder.yearsRequired != null)
			return false;
		if (customObject1s != null ? !customObject1s.equals(jobOrder.customObject1s) : jobOrder.customObject1s != null)
			return false;
		if (customObject2s != null ? !customObject2s.equals(jobOrder.customObject2s) : jobOrder.customObject2s != null)
			return false;
		if (customObject3s != null ? !customObject3s.equals(jobOrder.customObject3s) : jobOrder.customObject3s != null)
			return false;
		if (customObject4s != null ? !customObject4s.equals(jobOrder.customObject4s) : jobOrder.customObject4s != null)
			return false;
		if (customObject5s != null ? !customObject5s.equals(jobOrder.customObject5s) : jobOrder.customObject5s != null)
			return false;
		if (customObject6s != null ? !customObject6s.equals(jobOrder.customObject6s) : jobOrder.customObject6s != null)
			return false;
		if (customObject7s != null ? !customObject7s.equals(jobOrder.customObject7s) : jobOrder.customObject7s != null)
			return false;
		if (customObject8s != null ? !customObject8s.equals(jobOrder.customObject8s) : jobOrder.customObject8s != null)
			return false;
		if (customObject9s != null ? !customObject9s.equals(jobOrder.customObject9s) : jobOrder.customObject9s != null)
			return false;
		return !(customObject10s != null ? !customObject10s.equals(jobOrder.customObject10s) : jobOrder.customObject10s != null);

	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (luceneScore != null ? luceneScore.hashCode() : 0);
		result = 31 * result + (id != null ? id.hashCode() : 0);
		result = 31 * result + (address != null ? address.hashCode() : 0);
		result = 31 * result + (appointments != null ? appointments.hashCode() : 0);
		result = 31 * result + (approvedPlacements != null ? approvedPlacements.hashCode() : 0);
		result = 31 * result + (assignedUsers != null ? assignedUsers.hashCode() : 0);
		result = 31 * result + (benefits != null ? benefits.hashCode() : 0);
		result = 31 * result + (billRateCategoryID != null ? billRateCategoryID.hashCode() : 0);
		result = 31 * result + (bonusPackage != null ? bonusPackage.hashCode() : 0);
		result = 31 * result + (branchCode != null ? branchCode.hashCode() : 0);
		result = 31 * result + (businessSectors != null ? businessSectors.hashCode() : 0);
		result = 31 * result + (categories != null ? categories.hashCode() : 0);
		result = 31 * result + (certificationList != null ? certificationList.hashCode() : 0);
		result = 31 * result + (certifications != null ? certifications.hashCode() : 0);
		result = 31 * result + (clientBillRate != null ? clientBillRate.hashCode() : 0);
		result = 31 * result + (clientContact != null ? clientContact.hashCode() : 0);
		result = 31 * result + (clientCorporation != null ? clientCorporation.hashCode() : 0);
		result = 31 * result + (costCenter != null ? costCenter.hashCode() : 0);
		result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
		result = 31 * result + (dateClosed != null ? dateClosed.hashCode() : 0);
		result = 31 * result + (dateEnd != null ? dateEnd.hashCode() : 0);
		result = 31 * result + (dateLastExported != null ? dateLastExported.hashCode() : 0);
		result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
		result = 31 * result + (degreeList != null ? degreeList.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (durationWeeks != null ? durationWeeks.hashCode() : 0);
		result = 31 * result + (educationDegree != null ? educationDegree.hashCode() : 0);
		result = 31 * result + (employmentType != null ? employmentType.hashCode() : 0);
		result = 31 * result + (externalCategoryID != null ? externalCategoryID.hashCode() : 0);
		result = 31 * result + (externalID != null ? externalID.hashCode() : 0);
		result = 31 * result + (feeArrangement != null ? feeArrangement.hashCode() : 0);
		result = 31 * result + (hoursOfOperation != null ? hoursOfOperation.hashCode() : 0);
		result = 31 * result + (hoursPerWeek != null ? hoursPerWeek.hashCode() : 0);
		result = 31 * result + (interviews != null ? interviews.hashCode() : 0);
		result = 31 * result + (isClientEditable != null ? isClientEditable.hashCode() : 0);
		result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
		result = 31 * result + (isInterviewRequired != null ? isInterviewRequired.hashCode() : 0);
		result = 31 * result + (isJobcastPublished != null ? isJobcastPublished.hashCode() : 0);
		result = 31 * result + (isOpen != null ? isOpen.hashCode() : 0);
		result = 31 * result + (isPublic != null ? isPublic.hashCode() : 0);
		result = 31 * result + (jobBoardList != null ? jobBoardList.hashCode() : 0);
		result = 31 * result + (notes != null ? notes.hashCode() : 0);
		result = 31 * result + (numOpenings != null ? numOpenings.hashCode() : 0);
		result = 31 * result + (onSite != null ? onSite.hashCode() : 0);
		result = 31 * result + (optionsPackage != null ? optionsPackage.hashCode() : 0);
		result = 31 * result + (opportunity != null ? opportunity.hashCode() : 0);
		result = 31 * result + (owner != null ? owner.hashCode() : 0);
		result = 31 * result + (payRate != null ? payRate.hashCode() : 0);
		result = 31 * result + (placements != null ? placements.hashCode() : 0);
		result = 31 * result + (publicDescription != null ? publicDescription.hashCode() : 0);
		result = 31 * result + (publishedZip != null ? publishedZip.hashCode() : 0);
		result = 31 * result + (reasonClosed != null ? reasonClosed.hashCode() : 0);
		result = 31 * result + (reportTo != null ? reportTo.hashCode() : 0);
		result = 31 * result + (reportToClientContact != null ? reportToClientContact.hashCode() : 0);
		result = 31 * result + (responseUser != null ? responseUser.hashCode() : 0);
		result = 31 * result + (salary != null ? salary.hashCode() : 0);
		result = 31 * result + (salaryUnit != null ? salaryUnit.hashCode() : 0);
		result = 31 * result + (sendouts != null ? sendouts.hashCode() : 0);
		result = 31 * result + (skillList != null ? skillList.hashCode() : 0);
		result = 31 * result + (skills != null ? skills.hashCode() : 0);
		result = 31 * result + (source != null ? source.hashCode() : 0);
		result = 31 * result + (specialties != null ? specialties.hashCode() : 0);
		result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
		result = 31 * result + (status != null ? status.hashCode() : 0);
		result = 31 * result + (submissions != null ? submissions.hashCode() : 0);
		result = 31 * result + (tasks != null ? tasks.hashCode() : 0);
		result = 31 * result + (taxRate != null ? taxRate.hashCode() : 0);
		result = 31 * result + (taxStatus != null ? taxStatus.hashCode() : 0);
		result = 31 * result + (tearsheets != null ? tearsheets.hashCode() : 0);
		result = 31 * result + (timeUnits != null ? timeUnits.hashCode() : 0);
		result = 31 * result + (title != null ? title.hashCode() : 0);
		result = 31 * result + (travelRequirements != null ? travelRequirements.hashCode() : 0);
		result = 31 * result + (type != null ? type.hashCode() : 0);
		result = 31 * result + (webResponses != null ? webResponses.hashCode() : 0);
		result = 31 * result + (willRelocate != null ? willRelocate.hashCode() : 0);
		result = 31 * result + (willSponsor != null ? willSponsor.hashCode() : 0);
		result = 31 * result + (yearsRequired != null ? yearsRequired.hashCode() : 0);
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
		return "JobOrder{" +
				"luceneScore=" + luceneScore +
				", id=" + id +
				", address=" + address +
				", appointments=" + appointments +
				", approvedPlacements=" + approvedPlacements +
				", assignedUsers=" + assignedUsers +
				", benefits='" + benefits + '\'' +
				", billRateCategoryID=" + billRateCategoryID +
				", bonusPackage='" + bonusPackage + '\'' +
				", branchCode='" + branchCode + '\'' +
				", businessSectors=" + businessSectors +
				", categories=" + categories +
				", certificationList='" + certificationList + '\'' +
				", certifications=" + certifications +
				", clientBillRate=" + clientBillRate +
				", clientContact=" + clientContact +
				", clientCorporation=" + clientCorporation +
				", costCenter='" + costCenter + '\'' +
				", dateAdded=" + dateAdded +
				", dateClosed=" + dateClosed +
				", dateEnd=" + dateEnd +
				", dateLastExported=" + dateLastExported +
				", dateLastModified=" + dateLastModified +
				", degreeList='" + degreeList + '\'' +
				", description='" + description + '\'' +
				", durationWeeks=" + durationWeeks +
				", educationDegree='" + educationDegree + '\'' +
				", employmentType='" + employmentType + '\'' +
				", externalCategoryID=" + externalCategoryID +
				", externalID='" + externalID + '\'' +
				", feeArrangement=" + feeArrangement +
				", hoursOfOperation='" + hoursOfOperation + '\'' +
				", hoursPerWeek=" + hoursPerWeek +
				", interviews=" + interviews +
				", isClientEditable=" + isClientEditable +
				", isDeleted=" + isDeleted +
				", isInterviewRequired=" + isInterviewRequired +
				", isJobcastPublished=" + isJobcastPublished +
				", isOpen=" + isOpen +
				", isPublic=" + isPublic +
				", jobBoardList='" + jobBoardList + '\'' +
				", notes=" + notes +
				", numOpenings=" + numOpenings +
				", onSite='" + onSite + '\'' +
				", optionsPackage='" + optionsPackage + '\'' +
				", opportunity=" + opportunity +
				", owner=" + owner +
				", payRate=" + payRate +
				", placements=" + placements +
				", publicDescription='" + publicDescription + '\'' +
				", publishedZip='" + publishedZip + '\'' +
				", reasonClosed='" + reasonClosed + '\'' +
				", reportTo='" + reportTo + '\'' +
				", reportToClientContact=" + reportToClientContact +
				", responseUser=" + responseUser +
				", salary=" + salary +
				", salaryUnit='" + salaryUnit + '\'' +
				", sendouts=" + sendouts +
				", skillList='" + skillList + '\'' +
				", skills=" + skills +
				", source='" + source + '\'' +
				", specialties=" + specialties +
				", startDate=" + startDate +
				", status='" + status + '\'' +
				", submissions=" + submissions +
				", tasks=" + tasks +
				", taxRate=" + taxRate +
				", taxStatus='" + taxStatus + '\'' +
				", tearsheets=" + tearsheets +
				", timeUnits=" + timeUnits +
				", title='" + title + '\'' +
				", travelRequirements='" + travelRequirements + '\'' +
				", type=" + type +
				", webResponses=" + webResponses +
				", willRelocate=" + willRelocate +
				", willSponsor=" + willSponsor +
				", yearsRequired=" + yearsRequired +
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
				'}';
	}

	public JobOrder instantiateForInsert() {
		JobOrder entity = new JobOrder();
		entity.setEmploymentType("Contract");
		entity.setStartDate(new DateTime());
		entity.setClientCorporation(new ClientCorporation(1));
		entity.setClientContact(new ClientContact(1));
		return entity;
	}
}
