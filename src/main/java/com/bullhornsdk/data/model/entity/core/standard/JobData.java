package com.bullhornsdk.data.model.entity.core.standard;

import java.math.BigDecimal;

import javax.validation.constraints.Size;

import org.joda.time.DateTime;

import com.bullhornsdk.data.api.helper.RestOneToManySerializer;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance9;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsC;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public abstract class JobData extends CustomFieldsC implements BullhornEntity {

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

	private Branch branch;

	@JsonIgnore
	@Size(max = 100)
	private String branchCode;

	private OneToMany<BusinessSector> businessSectors;

	private OneToMany<Category> categories;

	@JsonIgnore
	private String certificationList;

	private OneToMany<Certification> certifications;

    private OneToMany<CertificationGroup> certificationGroups;

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

    private OneToMany<Tearsheet> tearsheets;

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

	private Integer willRelocateInt;

	private Boolean willSponsor;

	private WorkersCompensationRate workersCompRate;

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

	public JobData() {
		super();
	}

	public JobData(Integer id) {
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

    @JsonIgnore
    public OneToMany<CertificationGroup> getCertificationGroups() {
        return certificationGroups;
    }

    @JsonProperty("certificationGroups")
    public void setCertificationGroups(OneToMany<CertificationGroup> certificationGroups) {
        this.certificationGroups = certificationGroups;
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

    @JsonProperty("dateAdded")
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

    @JsonProperty("reportToClientContact")
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
	public OneToMany<Tearsheet> getTearsheets() {
		return tearsheets;
	}

	@ReadOnly
	@JsonProperty("tearsheets")
	public void setTearsheets(OneToMany<Tearsheet> tearsheets) {
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

	@JsonProperty("willRelocateInt")
	public Integer getWillRelocateInt() {
		return willRelocateInt;
	}

	@JsonProperty("willRelocateInt")
	public void setWillRelocateInt(Integer willRelocateInt) {
		this.willRelocateInt = willRelocateInt;
	}

	@JsonProperty("willSponsor")
	public Boolean getWillSponsor() {
		return willSponsor;
	}

	@JsonProperty("willSponsor")
	public void setWillSponsor(Boolean willSponsor) {
		this.willSponsor = willSponsor;
	}

	@JsonProperty("workersCompRate")
    public WorkersCompensationRate getWorkersCompRate() {
	    return workersCompRate;
	}

	@JsonProperty("workersCompRate")
    public void setWorkersCompRate(WorkersCompensationRate workersCompRate) {
	    this.workersCompRate = workersCompRate;
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

        JobData jobData = (JobData) o;

        if (luceneScore != null ? !luceneScore.equals(jobData.luceneScore) : jobData.luceneScore != null) return false;
        if (id != null ? !id.equals(jobData.id) : jobData.id != null) return false;
        if (address != null ? !address.equals(jobData.address) : jobData.address != null) return false;
        if (appointments != null ? !appointments.equals(jobData.appointments) : jobData.appointments != null)
            return false;
        if (approvedPlacements != null ? !approvedPlacements.equals(jobData.approvedPlacements) : jobData.approvedPlacements != null)
            return false;
        if (assignedUsers != null ? !assignedUsers.equals(jobData.assignedUsers) : jobData.assignedUsers != null)
            return false;
        if (benefits != null ? !benefits.equals(jobData.benefits) : jobData.benefits != null) return false;
        if (billRateCategoryID != null ? !billRateCategoryID.equals(jobData.billRateCategoryID) : jobData.billRateCategoryID != null)
            return false;
        if (bonusPackage != null ? !bonusPackage.equals(jobData.bonusPackage) : jobData.bonusPackage != null)
            return false;
        if (branch != null ? !branch.equals(jobData.branch) : jobData.branch != null) return false;
        if (branchCode != null ? !branchCode.equals(jobData.branchCode) : jobData.branchCode != null) return false;
        if (businessSectors != null ? !businessSectors.equals(jobData.businessSectors) : jobData.businessSectors != null)
            return false;
        if (categories != null ? !categories.equals(jobData.categories) : jobData.categories != null) return false;
        if (certificationList != null ? !certificationList.equals(jobData.certificationList) : jobData.certificationList != null)
            return false;
        if (certifications != null ? !certifications.equals(jobData.certifications) : jobData.certifications != null)
            return false;
        if (certificationGroups != null ? !certificationGroups.equals(jobData.certificationGroups) : jobData.certificationGroups != null)
            return false;
        if (clientBillRate != null ? !clientBillRate.equals(jobData.clientBillRate) : jobData.clientBillRate != null)
            return false;
        if (clientContact != null ? !clientContact.equals(jobData.clientContact) : jobData.clientContact != null)
            return false;
        if (clientCorporation != null ? !clientCorporation.equals(jobData.clientCorporation) : jobData.clientCorporation != null)
            return false;
        if (costCenter != null ? !costCenter.equals(jobData.costCenter) : jobData.costCenter != null) return false;
        if (dateAdded != null ? !dateAdded.equals(jobData.dateAdded) : jobData.dateAdded != null) return false;
        if (dateClosed != null ? !dateClosed.equals(jobData.dateClosed) : jobData.dateClosed != null) return false;
        if (dateEnd != null ? !dateEnd.equals(jobData.dateEnd) : jobData.dateEnd != null) return false;
        if (dateLastExported != null ? !dateLastExported.equals(jobData.dateLastExported) : jobData.dateLastExported != null)
            return false;
        if (dateLastModified != null ? !dateLastModified.equals(jobData.dateLastModified) : jobData.dateLastModified != null)
            return false;
        if (degreeList != null ? !degreeList.equals(jobData.degreeList) : jobData.degreeList != null) return false;
        if (description != null ? !description.equals(jobData.description) : jobData.description != null) return false;
        if (durationWeeks != null ? !durationWeeks.equals(jobData.durationWeeks) : jobData.durationWeeks != null)
            return false;
        if (educationDegree != null ? !educationDegree.equals(jobData.educationDegree) : jobData.educationDegree != null)
            return false;
        if (employmentType != null ? !employmentType.equals(jobData.employmentType) : jobData.employmentType != null)
            return false;
        if (externalCategoryID != null ? !externalCategoryID.equals(jobData.externalCategoryID) : jobData.externalCategoryID != null)
            return false;
        if (externalID != null ? !externalID.equals(jobData.externalID) : jobData.externalID != null) return false;
        if (feeArrangement != null ? !feeArrangement.equals(jobData.feeArrangement) : jobData.feeArrangement != null)
            return false;
        if (hoursOfOperation != null ? !hoursOfOperation.equals(jobData.hoursOfOperation) : jobData.hoursOfOperation != null)
            return false;
        if (hoursPerWeek != null ? !hoursPerWeek.equals(jobData.hoursPerWeek) : jobData.hoursPerWeek != null)
            return false;
        if (interviews != null ? !interviews.equals(jobData.interviews) : jobData.interviews != null) return false;
        if (isClientEditable != null ? !isClientEditable.equals(jobData.isClientEditable) : jobData.isClientEditable != null)
            return false;
        if (isDeleted != null ? !isDeleted.equals(jobData.isDeleted) : jobData.isDeleted != null) return false;
        if (isInterviewRequired != null ? !isInterviewRequired.equals(jobData.isInterviewRequired) : jobData.isInterviewRequired != null)
            return false;
        if (isJobcastPublished != null ? !isJobcastPublished.equals(jobData.isJobcastPublished) : jobData.isJobcastPublished != null)
            return false;
        if (isOpen != null ? !isOpen.equals(jobData.isOpen) : jobData.isOpen != null) return false;
        if (isPublic != null ? !isPublic.equals(jobData.isPublic) : jobData.isPublic != null) return false;
        if (jobBoardList != null ? !jobBoardList.equals(jobData.jobBoardList) : jobData.jobBoardList != null)
            return false;
        if (notes != null ? !notes.equals(jobData.notes) : jobData.notes != null) return false;
        if (numOpenings != null ? !numOpenings.equals(jobData.numOpenings) : jobData.numOpenings != null) return false;
        if (onSite != null ? !onSite.equals(jobData.onSite) : jobData.onSite != null) return false;
        if (optionsPackage != null ? !optionsPackage.equals(jobData.optionsPackage) : jobData.optionsPackage != null)
            return false;
        if (opportunity != null ? !opportunity.equals(jobData.opportunity) : jobData.opportunity != null) return false;
        if (owner != null ? !owner.equals(jobData.owner) : jobData.owner != null) return false;
        if (payRate != null ? !payRate.equals(jobData.payRate) : jobData.payRate != null) return false;
        if (placements != null ? !placements.equals(jobData.placements) : jobData.placements != null) return false;
        if (publicDescription != null ? !publicDescription.equals(jobData.publicDescription) : jobData.publicDescription != null)
            return false;
        if (publishedZip != null ? !publishedZip.equals(jobData.publishedZip) : jobData.publishedZip != null)
            return false;
        if (reasonClosed != null ? !reasonClosed.equals(jobData.reasonClosed) : jobData.reasonClosed != null)
            return false;
        if (reportTo != null ? !reportTo.equals(jobData.reportTo) : jobData.reportTo != null) return false;
        if (reportToClientContact != null ? !reportToClientContact.equals(jobData.reportToClientContact) : jobData.reportToClientContact != null)
            return false;
        if (responseUser != null ? !responseUser.equals(jobData.responseUser) : jobData.responseUser != null)
            return false;
        if (salary != null ? !salary.equals(jobData.salary) : jobData.salary != null) return false;
        if (salaryUnit != null ? !salaryUnit.equals(jobData.salaryUnit) : jobData.salaryUnit != null) return false;
        if (sendouts != null ? !sendouts.equals(jobData.sendouts) : jobData.sendouts != null) return false;
        if (skillList != null ? !skillList.equals(jobData.skillList) : jobData.skillList != null) return false;
        if (skills != null ? !skills.equals(jobData.skills) : jobData.skills != null) return false;
        if (source != null ? !source.equals(jobData.source) : jobData.source != null) return false;
        if (specialties != null ? !specialties.equals(jobData.specialties) : jobData.specialties != null) return false;
        if (startDate != null ? !startDate.equals(jobData.startDate) : jobData.startDate != null) return false;
        if (status != null ? !status.equals(jobData.status) : jobData.status != null) return false;
        if (submissions != null ? !submissions.equals(jobData.submissions) : jobData.submissions != null) return false;
        if (tasks != null ? !tasks.equals(jobData.tasks) : jobData.tasks != null) return false;
        if (taxRate != null ? !taxRate.equals(jobData.taxRate) : jobData.taxRate != null) return false;
        if (taxStatus != null ? !taxStatus.equals(jobData.taxStatus) : jobData.taxStatus != null) return false;
        if (tearsheets != null ? !tearsheets.equals(jobData.tearsheets) : jobData.tearsheets != null) return false;
        if (timeUnits != null ? !timeUnits.equals(jobData.timeUnits) : jobData.timeUnits != null) return false;
        if (title != null ? !title.equals(jobData.title) : jobData.title != null) return false;
        if (travelRequirements != null ? !travelRequirements.equals(jobData.travelRequirements) : jobData.travelRequirements != null)
            return false;
        if (type != null ? !type.equals(jobData.type) : jobData.type != null) return false;
        if (webResponses != null ? !webResponses.equals(jobData.webResponses) : jobData.webResponses != null)
            return false;
        if (willRelocate != null ? !willRelocate.equals(jobData.willRelocate) : jobData.willRelocate != null)
            return false;
        if (willRelocateInt != null ? !willRelocateInt.equals(jobData.willRelocateInt) : jobData.willRelocateInt != null)
            return false;
        if (willSponsor != null ? !willSponsor.equals(jobData.willSponsor) : jobData.willSponsor != null) return false;
        if (workersCompRate != null ? !workersCompRate.equals(jobData.workersCompRate) : jobData.workersCompRate != null) return false;
        if (yearsRequired != null ? !yearsRequired.equals(jobData.yearsRequired) : jobData.yearsRequired != null)
            return false;
        if (customObject1s != null ? !customObject1s.equals(jobData.customObject1s) : jobData.customObject1s != null)
            return false;
        if (customObject2s != null ? !customObject2s.equals(jobData.customObject2s) : jobData.customObject2s != null)
            return false;
        if (customObject3s != null ? !customObject3s.equals(jobData.customObject3s) : jobData.customObject3s != null)
            return false;
        if (customObject4s != null ? !customObject4s.equals(jobData.customObject4s) : jobData.customObject4s != null)
            return false;
        if (customObject5s != null ? !customObject5s.equals(jobData.customObject5s) : jobData.customObject5s != null)
            return false;
        if (customObject6s != null ? !customObject6s.equals(jobData.customObject6s) : jobData.customObject6s != null)
            return false;
        if (customObject7s != null ? !customObject7s.equals(jobData.customObject7s) : jobData.customObject7s != null)
            return false;
        if (customObject8s != null ? !customObject8s.equals(jobData.customObject8s) : jobData.customObject8s != null)
            return false;
        if (customObject9s != null ? !customObject9s.equals(jobData.customObject9s) : jobData.customObject9s != null)
            return false;
        return customObject10s != null ? customObject10s.equals(jobData.customObject10s) : jobData.customObject10s == null;
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
        result = 31 * result + (branch != null ? branch.hashCode() : 0);
        result = 31 * result + (branchCode != null ? branchCode.hashCode() : 0);
        result = 31 * result + (businessSectors != null ? businessSectors.hashCode() : 0);
        result = 31 * result + (categories != null ? categories.hashCode() : 0);
        result = 31 * result + (certificationList != null ? certificationList.hashCode() : 0);
        result = 31 * result + (certifications != null ? certifications.hashCode() : 0);
        result = 31 * result + (certificationGroups != null ? certificationGroups.hashCode() : 0);
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
        result = 31 * result + (willRelocateInt != null ? willRelocateInt.hashCode() : 0);
        result = 31 * result + (willSponsor != null ? willSponsor.hashCode() : 0);
        result = 31 * result + (workersCompRate != null ? workersCompRate.hashCode() : 0);
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
    public String toStringNonNull() {
        String lbc = ", ";
        final StringBuilder sb = new StringBuilder(getClass() + " { ");
        if(id != null){
            sb.append("id=").append(id);
        }
        if(address != null){
            sb.append(lbc + "address=").append(address);
        }
        if(appointments != null){
            sb.append(lbc + "appointments=").append(appointments.toStringNonNull());
        }
        if(approvedPlacements != null){
            sb.append(lbc + "approvedPlacements=").append(approvedPlacements.toStringNonNull());
        }
        if(assignedUsers != null){
            sb.append(lbc + "assignedUsers=").append(assignedUsers.toStringNonNull());
        }
        if(benefits != null){
            sb.append(lbc + "benefits=").append(benefits);
        }
        if(billRateCategoryID != null){
            sb.append(lbc + "billRateCategoryID=").append(billRateCategoryID);
        }
        if(bonusPackage != null){
            sb.append(lbc + "bonusPackage=").append(bonusPackage);
        }
        if(branch != null){
            sb.append(lbc + "branch=").append(branch.toStringNonNull());
        }
        if(branchCode != null){
            sb.append(lbc + "branchCode=").append(branchCode);
        }
        if(businessSectors != null){
            sb.append(lbc + "businessSectors=").append(businessSectors.toStringNonNull());
        }
        if(categories != null){
            sb.append(lbc + "categories=").append(categories.toStringNonNull());
        }
        if(certificationList != null){
            sb.append(lbc + "certificationList=").append(certificationList);
        }
        if(certifications != null){
            sb.append(lbc + "certifications=").append(certifications.toStringNonNull());
        }
        if(certificationGroups != null){
            sb.append(lbc + "certificationGroups=").append(certificationGroups.toStringNonNull());
        }
        if(clientBillRate != null){
            sb.append(lbc + "clientBillRate=").append(clientBillRate);
        }
        if(clientContact != null){
            sb.append(lbc + "clientContact=").append(clientContact.toStringNonNull());
        }
        if(clientCorporation != null){
            sb.append(lbc + "clientCorporation=").append(clientCorporation.toStringNonNull());
        }
        if(costCenter != null){
            sb.append(lbc + "costCenter=").append(costCenter);
        }
        if(dateAdded != null){
            sb.append(lbc + "dateAdded=").append(dateAdded);
        }
        if(dateClosed != null){
            sb.append(lbc + "dateClosed=").append(dateClosed);
        }
        if(dateEnd != null){
            sb.append(lbc + "dateEnd=").append(dateEnd);
        }
        if(dateLastExported != null){
            sb.append(lbc + "dateLastExported=").append(dateLastExported);
        }
        if(dateLastModified != null){
            sb.append(lbc + "dateLastModified=").append(dateLastModified);
        }
        if(degreeList != null){
            sb.append(lbc + "degreeList=").append(degreeList);
        }
        if(description != null){
            sb.append(lbc + "description=").append(description);
        }
        if(durationWeeks != null){
            sb.append(lbc + "durationWeeks=").append(durationWeeks);
        }
        if(educationDegree != null){
            sb.append(lbc + "educationDegree=").append(educationDegree);
        }
        if(employmentType != null){
            sb.append(lbc + "employmentType=").append(employmentType);
        }
        if(externalCategoryID != null){
            sb.append(lbc + "externalCategoryID=").append(externalCategoryID);
        }
        if(externalID != null){
            sb.append(lbc + "externalID=").append(externalID);
        }
        if(feeArrangement != null){
            sb.append(lbc + "feeArrangement=").append(feeArrangement);
        }
        if(hoursOfOperation != null){
            sb.append(lbc + "hoursOfOperation=").append(hoursOfOperation);
        }
        if(hoursPerWeek != null){
            sb.append(lbc + "hoursPerWeek=").append(hoursPerWeek);
        }
        if(interviews != null){
            sb.append(lbc + "interviews=").append(interviews.toStringNonNull());
        }
        if(isClientEditable != null){
            sb.append(lbc + "isClientEditable=").append(isClientEditable);
        }
        if(isDeleted != null){
            sb.append(lbc + "isDeleted=").append(isDeleted);
        }
        if(isInterviewRequired != null){
            sb.append(lbc + "isInterviewRequired=").append(isInterviewRequired);
        }
        if(isJobcastPublished != null){
            sb.append(lbc + "isJobcastPublished=").append(isJobcastPublished);
        }
        if(isOpen != null){
            sb.append(lbc + "isOpen=").append(isOpen);
        }
        if(isPublic != null){
            sb.append(lbc + "isPublic=").append(isPublic);
        }
        if(jobBoardList != null){
            sb.append(lbc + "jobBoardList=").append(jobBoardList);
        }
        if(luceneScore != null){
            sb.append(lbc + "luceneScore=").append(luceneScore);
        }
        if(notes != null){
            sb.append(lbc + "notes=").append(notes);
        }
        if(numOpenings != null){
            sb.append(lbc + "numOpenings=").append(numOpenings);
        }
        if(onSite != null){
            sb.append(lbc + "onSite=").append(onSite);
        }
        if(optionsPackage != null){
            sb.append(lbc + "optionsPackage=").append(optionsPackage);
        }
        if(opportunity != null){
            sb.append(lbc + "opportunity=").append(opportunity.toStringNonNull());
        }
        if(owner != null){
            sb.append(lbc + "owner=").append(owner.toStringNonNull());
        }
        if(payRate != null){
            sb.append(lbc + "payRate=").append(payRate);
        }
        if(placements != null){
            sb.append(lbc + "placements=").append(placements.toStringNonNull());
        }
        if(publicDescription != null){
            sb.append(lbc + "publicDescription=").append(publicDescription);
        }
        if(publishedZip != null){
            sb.append(lbc + "publishedZip=").append(publishedZip);
        }
        if(reasonClosed != null){
            sb.append(lbc + "reasonClosed=").append(reasonClosed);
        }
        if(reportTo != null){
            sb.append(lbc + "reportTo=").append(reportTo);
        }
        if(reportToClientContact != null){
            sb.append(lbc + "reportToClientContact=").append(reportToClientContact.toStringNonNull());
        }
        if(responseUser != null){
            sb.append(lbc + "responseUser=").append(responseUser.toStringNonNull());
        }
        if(salary != null){
            sb.append(lbc + "salary=").append(salary);
        }
        if(salaryUnit != null){
            sb.append(lbc + "salaryUnit=").append(salaryUnit);
        }
        if(sendouts != null){
            sb.append(lbc + "sendouts=").append(sendouts.toStringNonNull());
        }
        if(skillList != null){
            sb.append(lbc + "skillList=").append(skillList);
        }
        if(skills != null){
            sb.append(lbc + "skills=").append(skills.toStringNonNull());
        }
        if(source != null){
            sb.append(lbc + "source=").append(source);
        }
        if(specialties != null){
            sb.append(lbc + "specialties=").append(specialties.toStringNonNull());
        }
        if(startDate != null){
            sb.append(lbc + "startDate=").append(startDate);
        }
        if(status != null){
            sb.append(lbc + "status=").append(status);
        }
        if(submissions != null){
            sb.append(lbc + "submissions=").append(submissions.toStringNonNull());
        }
        if(tasks != null){
            sb.append(lbc + "tasks=").append(tasks.toStringNonNull());
        }
        if(taxRate != null){
            sb.append(lbc + "taxRate=").append(taxRate);
        }
        if(taxStatus != null){
            sb.append(lbc + "taxStatus=").append(taxStatus);
        }
        if(tearsheets != null){
            sb.append(lbc + "tearsheets=").append(tearsheets.toStringNonNull());
        }
        if(timeUnits != null){
            sb.append(lbc + "timeUnits=").append(timeUnits);
        }
        if(title != null){
            sb.append(lbc + "title=").append(title);
        }
        if(travelRequirements != null){
            sb.append(lbc + "travelRequirements=").append(travelRequirements);
        }
        if(type != null){
            sb.append(lbc + "type=").append(type);
        }
        if(webResponses != null){
            sb.append(lbc + "webResponses=").append(webResponses);
        }
        if(willRelocate != null){
            sb.append(lbc + "willRelocate=").append(willRelocate);
        }
        if(willRelocateInt != null){
            sb.append(lbc + "willRelocateInt=").append(willRelocateInt);
        }
        if(willSponsor != null){
            sb.append(lbc + "willSponsor=").append(willSponsor);
        }
        if(workersCompRate != null){
            sb.append(lbc + "workersCompRate=").append(workersCompRate.toStringNonNull());
        }
        if(yearsRequired != null){
            sb.append(lbc + "yearsRequired=").append(yearsRequired);
        }
        if(customObject1s != null){
            sb.append(lbc + "customObject1s=").append(customObject1s.toStringNonNull());
        }
        if(customObject2s != null){
            sb.append(lbc + "customObject2s=").append(customObject2s.toStringNonNull());
        }
        if(customObject3s != null){
            sb.append(lbc + "customObject3s=").append(customObject3s.toStringNonNull());
        }
        if(customObject4s != null){
            sb.append(lbc + "customObject4s=").append(customObject4s.toStringNonNull());
        }
        if(customObject5s != null){
            sb.append(lbc + "customObject5s=").append(customObject5s.toStringNonNull());
        }
        if(customObject6s != null){
            sb.append(lbc + "customObject6s=").append(customObject6s.toStringNonNull());
        }
        if(customObject7s != null){
            sb.append(lbc + "customObject7s=").append(customObject7s.toStringNonNull());
        }
        if(customObject8s != null){
            sb.append(lbc + "customObject8s=").append(customObject8s.toStringNonNull());
        }
        if(customObject9s != null){
            sb.append(lbc + "customObject9s=").append(customObject9s.toStringNonNull());
        }
        if(customObject10s != null){
            sb.append(lbc + "customObject10s=").append(customObject10s.toStringNonNull());
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toStringNonNull(boolean includeLineBreaks) {
        String lbc = ", ";
        if(includeLineBreaks)
            lbc = ",\n ";
        final StringBuilder sb = new StringBuilder(getClass() + " { ");
        if(id != null){
            sb.append("id=").append(id);
        }
        if(address != null){
            sb.append(lbc + "address=").append(address);
        }
        if(appointments != null){
            sb.append(lbc + "appointments=").append(appointments.toStringNonNull(includeLineBreaks));
        }
        if(approvedPlacements != null){
            sb.append(lbc + "approvedPlacements=").append(approvedPlacements.toStringNonNull(includeLineBreaks));
        }
        if(assignedUsers != null){
            sb.append(lbc + "assignedUsers=").append(assignedUsers);
        }
        if(benefits != null){
            sb.append(lbc + "benefits=").append(benefits);
        }
        if(billRateCategoryID != null){
            sb.append(lbc + "billRateCategoryID=").append(billRateCategoryID);
        }
        if(bonusPackage != null){
            sb.append(lbc + "bonusPackage=").append(bonusPackage);
        }
        if(branch != null){
            sb.append(lbc + "branch=").append(branch.toStringNonNull(includeLineBreaks));
        }
        if(branchCode != null){
            sb.append(lbc + "branchCode=").append(branchCode);
        }
        if(businessSectors != null){
            sb.append(lbc + "businessSectors=").append(businessSectors.toStringNonNull(includeLineBreaks));
        }
        if(categories != null){
            sb.append(lbc + "categories=").append(categories.toStringNonNull(includeLineBreaks));
        }
        if(certificationList != null){
            sb.append(lbc + "certificationList=").append(certificationList);
        }
        if(certifications != null){
            sb.append(lbc + "certifications=").append(certifications.toStringNonNull(includeLineBreaks));
        }
        if(certificationGroups != null){
            sb.append(lbc + "certificationGroups=").append(certificationGroups.toStringNonNull(includeLineBreaks));
        }
        if(clientBillRate != null){
            sb.append(lbc + "clientBillRate=").append(clientBillRate);
        }
        if(clientContact != null){
            sb.append(lbc + "clientContact=").append(clientContact.toStringNonNull(includeLineBreaks));
        }
        if(clientCorporation != null){
            sb.append(lbc + "clientCorporation=").append(clientCorporation.toStringNonNull(includeLineBreaks));
        }
        if(costCenter != null){
            sb.append(lbc + "costCenter=").append(costCenter);
        }
        if(dateAdded != null){
            sb.append(lbc + "dateAdded=").append(dateAdded);
        }
        if(dateClosed != null){
            sb.append(lbc + "dateClosed=").append(dateClosed);
        }
        if(dateEnd != null){
            sb.append(lbc + "dateEnd=").append(dateEnd);
        }
        if(dateLastExported != null){
            sb.append(lbc + "dateLastExported=").append(dateLastExported);
        }
        if(dateLastModified != null){
            sb.append(lbc + "dateLastModified=").append(dateLastModified);
        }
        if(degreeList != null){
            sb.append(lbc + "degreeList=").append(degreeList);
        }
        if(description != null){
            sb.append(lbc + "description=").append(description);
        }
        if(durationWeeks != null){
            sb.append(lbc + "durationWeeks=").append(durationWeeks);
        }
        if(educationDegree != null){
            sb.append(lbc + "educationDegree=").append(educationDegree);
        }
        if(employmentType != null){
            sb.append(lbc + "employmentType=").append(employmentType);
        }
        if(externalCategoryID != null){
            sb.append(lbc + "externalCategoryID=").append(externalCategoryID);
        }
        if(externalID != null){
            sb.append(lbc + "externalID=").append(externalID);
        }
        if(feeArrangement != null){
            sb.append(lbc + "feeArrangement=").append(feeArrangement);
        }
        if(hoursOfOperation != null){
            sb.append(lbc + "hoursOfOperation=").append(hoursOfOperation);
        }
        if(hoursPerWeek != null){
            sb.append(lbc + "hoursPerWeek=").append(hoursPerWeek);
        }
        if(interviews != null){
            sb.append(lbc + "interviews=").append(interviews.toStringNonNull(includeLineBreaks));
        }
        if(isClientEditable != null){
            sb.append(lbc + "isClientEditable=").append(isClientEditable);
        }
        if(isDeleted != null){
            sb.append(lbc + "isDeleted=").append(isDeleted);
        }
        if(isInterviewRequired != null){
            sb.append(lbc + "isInterviewRequired=").append(isInterviewRequired);
        }
        if(isJobcastPublished != null){
            sb.append(lbc + "isJobcastPublished=").append(isJobcastPublished);
        }
        if(isOpen != null){
            sb.append(lbc + "isOpen=").append(isOpen);
        }
        if(isPublic != null){
            sb.append(lbc + "isPublic=").append(isPublic);
        }
        if(jobBoardList != null){
            sb.append(lbc + "jobBoardList=").append(jobBoardList);
        }
        if(luceneScore != null){
            sb.append(lbc + "luceneScore=").append(luceneScore);
        }
        if(notes != null){
            sb.append(lbc + "notes=").append(notes);
        }
        if(numOpenings != null){
            sb.append(lbc + "numOpenings=").append(numOpenings);
        }
        if(onSite != null){
            sb.append(lbc + "onSite=").append(onSite);
        }
        if(optionsPackage != null){
            sb.append(lbc + "optionsPackage=").append(optionsPackage);
        }
        if(opportunity != null){
            sb.append(lbc + "opportunity=").append(opportunity.toStringNonNull(includeLineBreaks));
        }
        if(owner != null){
            sb.append(lbc + "owner=").append(owner.toStringNonNull(includeLineBreaks));
        }
        if(payRate != null){
            sb.append(lbc + "payRate=").append(payRate);
        }
        if(placements != null){
            sb.append(lbc + "placements=").append(placements.toStringNonNull(includeLineBreaks));
        }
        if(publicDescription != null){
            sb.append(lbc + "publicDescription=").append(publicDescription);
        }
        if(publishedZip != null){
            sb.append(lbc + "publishedZip=").append(publishedZip);
        }
        if(reasonClosed != null){
            sb.append(lbc + "reasonClosed=").append(reasonClosed);
        }
        if(reportTo != null){
            sb.append(lbc + "reportTo=").append(reportTo);
        }
        if(reportToClientContact != null){
            sb.append(lbc + "reportToClientContact=").append(reportToClientContact);
        }
        if(responseUser != null){
            sb.append(lbc + "responseUser=").append(responseUser);
        }
        if(salary != null){
            sb.append(lbc + "salary=").append(salary);
        }
        if(salaryUnit != null){
            sb.append(lbc + "salaryUnit=").append(salaryUnit);
        }
        if(sendouts != null){
            sb.append(lbc + "sendouts=").append(sendouts.toStringNonNull(includeLineBreaks));
        }
        if(skillList != null){
            sb.append(lbc + "skillList=").append(skillList);
        }
        if(skills != null){
            sb.append(lbc + "skills=").append(skills.toStringNonNull(includeLineBreaks));
        }
        if(source != null){
            sb.append(lbc + "source=").append(source);
        }
        if(specialties != null){
            sb.append(lbc + "specialties=").append(specialties.toStringNonNull(includeLineBreaks));
        }
        if(startDate != null){
            sb.append(lbc + "startDate=").append(startDate);
        }
        if(status != null){
            sb.append(lbc + "status=").append(status);
        }
        if(submissions != null){
            sb.append(lbc + "submissions=").append(submissions.toStringNonNull(includeLineBreaks));
        }
        if(tasks != null){
            sb.append(lbc + "tasks=").append(tasks.toStringNonNull(includeLineBreaks));
        }
        if(taxRate != null){
            sb.append(lbc + "taxRate=").append(taxRate);
        }
        if(taxStatus != null){
            sb.append(lbc + "taxStatus=").append(taxStatus);
        }
        if(tearsheets != null){
            sb.append(lbc + "tearsheets=").append(tearsheets.toStringNonNull(includeLineBreaks));
        }
        if(timeUnits != null){
            sb.append(lbc + "timeUnits=").append(timeUnits);
        }
        if(title != null){
            sb.append(lbc + "title=").append(title);
        }
        if(travelRequirements != null){
            sb.append(lbc + "travelRequirements=").append(travelRequirements);
        }
        if(type != null){
            sb.append(lbc + "type=").append(type);
        }
        if(webResponses != null){
            sb.append(lbc + "webResponses=").append(webResponses);
        }
        if(willRelocate != null){
            sb.append(lbc + "willRelocate=").append(willRelocate);
        }
        if(willRelocateInt != null){
            sb.append(lbc + "willRelocateInt=").append(willRelocateInt);
        }
        if(willSponsor != null){
            sb.append(lbc + "willSponsor=").append(willSponsor);
        }
        if(workersCompRate != null){
            sb.append(lbc + "workersCompRate=").append(workersCompRate);
        }
        if(yearsRequired != null){
            sb.append(lbc + "yearsRequired=").append(yearsRequired);
        }
        if(customObject1s != null){
            sb.append(lbc + "customObject1s=").append(customObject1s.toStringNonNull(includeLineBreaks));
        }
        if(customObject2s != null){
            sb.append(lbc + "customObject2s=").append(customObject2s.toStringNonNull(includeLineBreaks));
        }
        if(customObject3s != null){
            sb.append(lbc + "customObject3s=").append(customObject3s.toStringNonNull(includeLineBreaks));
        }
        if(customObject4s != null){
            sb.append(lbc + "customObject4s=").append(customObject4s.toStringNonNull(includeLineBreaks));
        }
        if(customObject5s != null){
            sb.append(lbc + "customObject5s=").append(customObject5s.toStringNonNull(includeLineBreaks));
        }
        if(customObject6s != null){
            sb.append(lbc + "customObject6s=").append(customObject6s.toStringNonNull(includeLineBreaks));
        }
        if(customObject7s != null){
            sb.append(lbc + "customObject7s=").append(customObject7s.toStringNonNull(includeLineBreaks));
        }
        if(customObject8s != null){
            sb.append(lbc + "customObject8s=").append(customObject8s.toStringNonNull(includeLineBreaks));
        }
        if(customObject9s != null){
            sb.append(lbc + "customObject9s=").append(customObject9s.toStringNonNull(includeLineBreaks));
        }
        if(customObject10s != null){
            sb.append(lbc + "customObject10s=").append(customObject10s.toStringNonNull(includeLineBreaks));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JobData{");
        sb.append("luceneScore=").append(luceneScore);
        sb.append(", id=").append(id);
        sb.append(", address=").append(address);
        sb.append(", appointments=").append(appointments);
        sb.append(", approvedPlacements=").append(approvedPlacements);
        sb.append(", assignedUsers=").append(assignedUsers);
        sb.append(", benefits=").append(benefits);
        sb.append(", billRateCategoryID=").append(billRateCategoryID);
        sb.append(", bonusPackage=").append(bonusPackage);
        sb.append(", branch=").append(branch);
        sb.append(", branchCode=").append(branchCode);
        sb.append(", businessSectors=").append(businessSectors);
        sb.append(", categories=").append(categories);
        sb.append(", certificationList=").append(certificationList);
        sb.append(", certifications=").append(certifications);
        sb.append(", certificationGroups=").append(certificationGroups);
        sb.append(", clientBillRate=").append(clientBillRate);
        sb.append(", clientContact=").append(clientContact);
        sb.append(", clientCorporation=").append(clientCorporation);
        sb.append(", costCenter=").append(costCenter);
        sb.append(", dateAdded=").append(dateAdded);
        sb.append(", dateClosed=").append(dateClosed);
        sb.append(", dateEnd=").append(dateEnd);
        sb.append(", dateLastExported=").append(dateLastExported);
        sb.append(", dateLastModified=").append(dateLastModified);
        sb.append(", degreeList=").append(degreeList);
        sb.append(", description=").append(description);
        sb.append(", durationWeeks=").append(durationWeeks);
        sb.append(", educationDegree=").append(educationDegree);
        sb.append(", employmentType=").append(employmentType);
        sb.append(", externalCategoryID=").append(externalCategoryID);
        sb.append(", externalID=").append(externalID);
        sb.append(", feeArrangement=").append(feeArrangement);
        sb.append(", hoursOfOperation=").append(hoursOfOperation);
        sb.append(", hoursPerWeek=").append(hoursPerWeek);
        sb.append(", interviews=").append(interviews);
        sb.append(", isClientEditable=").append(isClientEditable);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", isInterviewRequired=").append(isInterviewRequired);
        sb.append(", isJobcastPublished=").append(isJobcastPublished);
        sb.append(", isOpen=").append(isOpen);
        sb.append(", isPublic=").append(isPublic);
        sb.append(", jobBoardList=").append(jobBoardList);
        sb.append(", notes=").append(notes);
        sb.append(", numOpenings=").append(numOpenings);
        sb.append(", onSite=").append(onSite);
        sb.append(", optionsPackage=").append(optionsPackage);
        sb.append(", opportunity=").append(opportunity);
        sb.append(", owner=").append(owner);
        sb.append(", payRate=").append(payRate);
        sb.append(", placements=").append(placements);
        sb.append(", publicDescription=").append(publicDescription);
        sb.append(", publishedZip=").append(publishedZip);
        sb.append(", reasonClosed=").append(reasonClosed);
        sb.append(", reportTo=").append(reportTo);
        sb.append(", reportToClientContact=").append(reportToClientContact);
        sb.append(", responseUser=").append(responseUser);
        sb.append(", salary=").append(salary);
        sb.append(", salaryUnit=").append(salaryUnit);
        sb.append(", sendouts=").append(sendouts);
        sb.append(", skillList=").append(skillList);
        sb.append(", skills=").append(skills);
        sb.append(", source=").append(source);
        sb.append(", specialties=").append(specialties);
        sb.append(", startDate=").append(startDate);
        sb.append(", status=").append(status);
        sb.append(", submissions=").append(submissions);
        sb.append(", tasks=").append(tasks);
        sb.append(", taxRate=").append(taxRate);
        sb.append(", taxStatus=").append(taxStatus);
        sb.append(", tearsheets=").append(tearsheets);
        sb.append(", timeUnits=").append(timeUnits);
        sb.append(", title=").append(title);
        sb.append(", travelRequirements=").append(travelRequirements);
        sb.append(", type=").append(type);
        sb.append(", webResponses=").append(webResponses);
        sb.append(", willRelocate=").append(willRelocate);
        sb.append(", willRelocateInt=").append(willRelocateInt);
        sb.append(", willSponsor=").append(willSponsor);
        sb.append(", workersCompRate=").append(workersCompRate);
        sb.append(", yearsRequired=").append(yearsRequired);
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
        sb.append("}");
        return sb.toString();
    }
}
