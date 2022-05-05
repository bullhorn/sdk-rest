package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.api.helper.RestOneToManySerializer;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.*;
import com.bullhornsdk.data.model.entity.core.paybill.BillingProfile;
import com.bullhornsdk.data.model.entity.core.paybill.Location;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsD;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.response.file.standard.StandardFileAttachment;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

public abstract class JobData extends CustomFieldsD implements BullhornEntity {

    private BigDecimal luceneScore;

    private Integer id;

    private Address address;

    private OneToMany<Appointment> appointments;

    private OneToMany<Placement> approvedPlacements;

    private OneToMany<CorporateUser> assignedUsers;

    @JsonIgnore
    private String benefits;

    private Integer billRateCategoryID;

    private BillingProfile billingProfile;

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

    private DateTime dateLastPublished;

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

    private OneToMany<StandardFileAttachment> fileAttachments;

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

    private Boolean isWorkFromHome;

    @JsonIgnore
    private String jobBoardList;

    private Integer jobOrderRateCardID;

    private Location location;

    private Double markUpPercentage;

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

    private Category publishedCategory;

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

    private String usersAssigned;

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
    public OneToMany<Appointment> getAppointments() {
        return appointments;
    }

    @ReadOnly
    @JsonProperty("appointments")
    public void setAppointments(OneToMany<Appointment> appointments) {
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

    @JsonProperty("billingProfile")
    public BillingProfile getBillingProfile() {
        return billingProfile;
    }

    @JsonProperty("billingProfile")
    public void setBillingProfile(BillingProfile billingProfile) {
        this.billingProfile = billingProfile;
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

    @JsonProperty("fileAttachments")
    public OneToMany<StandardFileAttachment> getFileAttachments() {
        return fileAttachments;
    }

    @JsonProperty("fileAttachments")
    public void setFileAttachments(OneToMany<StandardFileAttachment> fileAttachments) {
        this.fileAttachments = fileAttachments;
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

    @JsonProperty("isWorkFromHome")
    public Boolean getIsWorkFromHome() {
        return isWorkFromHome;
    }

    @JsonProperty("isWorkFromHome")
    public void setIsWorkFromHome(Boolean isWorkFromHome) {
        this.isWorkFromHome = isWorkFromHome;
    }

    @JsonProperty("jobBoardList")
    public String getJobBoardList() {
        return jobBoardList;
    }

    @JsonIgnore
    public void setJobBoardList(String jobBoardList) {
        this.jobBoardList = jobBoardList;
    }

    @JsonProperty("jobOrderRateCardID")
    public Integer getJobOrderRateCardID() {
        return jobOrderRateCardID;
    }

    @JsonProperty("jobOrderRateCardID")
    public void setJobOrderRateCardID(Integer jobOrderRateCardID) {
        this.jobOrderRateCardID = jobOrderRateCardID;
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

    @JsonProperty("publishedCategory")
    public Category getPublishedCategory() {
        return publishedCategory;
    }

    @JsonProperty("publishedCategory")
    public void setPublishedCategory(Category publishedCategory) {
        this.publishedCategory = publishedCategory;
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

    @JsonProperty("usersAssigned")
    public String getUsersAssigned() {
        return usersAssigned;
    }

    @JsonProperty("usersAssigned")
    public void setUsersAssigned(String usersAssigned) {
        this.usersAssigned = usersAssigned;
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

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("dateLastPublished")
    public DateTime getDateLastPublished() {
        return dateLastPublished;
    }

    @JsonProperty("dateLastPublished")
    public void setDateLastPublished(DateTime dateLastPublished) {
        this.dateLastPublished = dateLastPublished;
    }

    @JsonProperty("markUpPercentage")
    public Double getMarkUpPercentage() {
        return markUpPercentage;
    }

    @JsonProperty("markUpPercentage")
    public void setMarkUpPercentage(Double markUpPercentage) {
        this.markUpPercentage = markUpPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JobData jobData = (JobData) o;
        return Objects.equals(luceneScore, jobData.luceneScore) && Objects.equals(id, jobData.id) && Objects.equals(address, jobData.address) && Objects.equals(appointments, jobData.appointments) && Objects.equals(approvedPlacements, jobData.approvedPlacements) && Objects.equals(assignedUsers, jobData.assignedUsers) && Objects.equals(benefits, jobData.benefits) && Objects.equals(billRateCategoryID, jobData.billRateCategoryID) && Objects.equals(billingProfile, jobData.billingProfile) && Objects.equals(bonusPackage, jobData.bonusPackage) && Objects.equals(branch, jobData.branch) && Objects.equals(branchCode, jobData.branchCode) && Objects.equals(businessSectors, jobData.businessSectors) && Objects.equals(categories, jobData.categories) && Objects.equals(certificationList, jobData.certificationList) && Objects.equals(certifications, jobData.certifications) && Objects.equals(certificationGroups, jobData.certificationGroups) && Objects.equals(clientBillRate, jobData.clientBillRate) && Objects.equals(clientContact, jobData.clientContact) && Objects.equals(clientCorporation, jobData.clientCorporation) && Objects.equals(costCenter, jobData.costCenter) && Objects.equals(dateAdded, jobData.dateAdded) && Objects.equals(dateClosed, jobData.dateClosed) && Objects.equals(dateEnd, jobData.dateEnd) && Objects.equals(dateLastExported, jobData.dateLastExported) && Objects.equals(dateLastModified, jobData.dateLastModified) && Objects.equals(dateLastPublished, jobData.dateLastPublished) && Objects.equals(degreeList, jobData.degreeList) && Objects.equals(description, jobData.description) && Objects.equals(durationWeeks, jobData.durationWeeks) && Objects.equals(educationDegree, jobData.educationDegree) && Objects.equals(employmentType, jobData.employmentType) && Objects.equals(externalCategoryID, jobData.externalCategoryID) && Objects.equals(externalID, jobData.externalID) && Objects.equals(feeArrangement, jobData.feeArrangement) && Objects.equals(fileAttachments, jobData.fileAttachments) && Objects.equals(hoursOfOperation, jobData.hoursOfOperation) && Objects.equals(hoursPerWeek, jobData.hoursPerWeek) && Objects.equals(interviews, jobData.interviews) && Objects.equals(isClientEditable, jobData.isClientEditable) && Objects.equals(isDeleted, jobData.isDeleted) && Objects.equals(isInterviewRequired, jobData.isInterviewRequired) && Objects.equals(isJobcastPublished, jobData.isJobcastPublished) && Objects.equals(isOpen, jobData.isOpen) && Objects.equals(isPublic, jobData.isPublic) && Objects.equals(isWorkFromHome, jobData.isWorkFromHome) && Objects.equals(jobBoardList, jobData.jobBoardList) && Objects.equals(jobOrderRateCardID, jobData.jobOrderRateCardID) && Objects.equals(location, jobData.location) && Objects.equals(markUpPercentage, jobData.markUpPercentage) && Objects.equals(notes, jobData.notes) && Objects.equals(numOpenings, jobData.numOpenings) && Objects.equals(onSite, jobData.onSite) && Objects.equals(optionsPackage, jobData.optionsPackage) && Objects.equals(opportunity, jobData.opportunity) && Objects.equals(owner, jobData.owner) && Objects.equals(payRate, jobData.payRate) && Objects.equals(placements, jobData.placements) && Objects.equals(publicDescription, jobData.publicDescription) && Objects.equals(publishedCategory, jobData.publishedCategory) && Objects.equals(publishedZip, jobData.publishedZip) && Objects.equals(reasonClosed, jobData.reasonClosed) && Objects.equals(reportTo, jobData.reportTo) && Objects.equals(reportToClientContact, jobData.reportToClientContact) && Objects.equals(responseUser, jobData.responseUser) && Objects.equals(salary, jobData.salary) && Objects.equals(salaryUnit, jobData.salaryUnit) && Objects.equals(sendouts, jobData.sendouts) && Objects.equals(skillList, jobData.skillList) && Objects.equals(skills, jobData.skills) && Objects.equals(source, jobData.source) && Objects.equals(specialties, jobData.specialties) && Objects.equals(startDate, jobData.startDate) && Objects.equals(status, jobData.status) && Objects.equals(submissions, jobData.submissions) && Objects.equals(tasks, jobData.tasks) && Objects.equals(taxRate, jobData.taxRate) && Objects.equals(taxStatus, jobData.taxStatus) && Objects.equals(tearsheets, jobData.tearsheets) && Objects.equals(timeUnits, jobData.timeUnits) && Objects.equals(title, jobData.title) && Objects.equals(travelRequirements, jobData.travelRequirements) && Objects.equals(type, jobData.type) && Objects.equals(usersAssigned, jobData.usersAssigned) && Objects.equals(webResponses, jobData.webResponses) && Objects.equals(willRelocate, jobData.willRelocate) && Objects.equals(willRelocateInt, jobData.willRelocateInt) && Objects.equals(willSponsor, jobData.willSponsor) && Objects.equals(workersCompRate, jobData.workersCompRate) && Objects.equals(yearsRequired, jobData.yearsRequired) && Objects.equals(customObject1s, jobData.customObject1s) && Objects.equals(customObject2s, jobData.customObject2s) && Objects.equals(customObject3s, jobData.customObject3s) && Objects.equals(customObject4s, jobData.customObject4s) && Objects.equals(customObject5s, jobData.customObject5s) && Objects.equals(customObject6s, jobData.customObject6s) && Objects.equals(customObject7s, jobData.customObject7s) && Objects.equals(customObject8s, jobData.customObject8s) && Objects.equals(customObject9s, jobData.customObject9s) && Objects.equals(customObject10s, jobData.customObject10s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), luceneScore, id, address, appointments, approvedPlacements, assignedUsers, benefits, billRateCategoryID, billingProfile, bonusPackage, branch, branchCode, businessSectors, categories, certificationList, certifications, certificationGroups, clientBillRate, clientContact, clientCorporation, costCenter, dateAdded, dateClosed, dateEnd, dateLastExported, dateLastModified, dateLastPublished, degreeList, description, durationWeeks, educationDegree, employmentType, externalCategoryID, externalID, feeArrangement, fileAttachments, hoursOfOperation, hoursPerWeek, interviews, isClientEditable, isDeleted, isInterviewRequired, isJobcastPublished, isOpen, isPublic, isWorkFromHome, jobBoardList, jobOrderRateCardID, location, markUpPercentage, notes, numOpenings, onSite, optionsPackage, opportunity, owner, payRate, placements, publicDescription, publishedCategory, publishedZip, reasonClosed, reportTo, reportToClientContact, responseUser, salary, salaryUnit, sendouts, skillList, skills, source, specialties, startDate, status, submissions, tasks, taxRate, taxStatus, tearsheets, timeUnits, title, travelRequirements, type, usersAssigned, webResponses, willRelocate, willRelocateInt, willSponsor, workersCompRate, yearsRequired, customObject1s, customObject2s, customObject3s, customObject4s, customObject5s, customObject6s, customObject7s, customObject8s, customObject9s, customObject10s);
    }

    @Override
    public String toString() {
        return "JobData{" +
            "luceneScore=" + luceneScore +
            ", id=" + id +
            ", address=" + address +
            ", appointments=" + appointments +
            ", approvedPlacements=" + approvedPlacements +
            ", assignedUsers=" + assignedUsers +
            ", benefits='" + benefits + '\'' +
            ", billRateCategoryID=" + billRateCategoryID +
            ", billingProfile=" + billingProfile +
            ", bonusPackage='" + bonusPackage + '\'' +
            ", branch=" + branch +
            ", branchCode='" + branchCode + '\'' +
            ", businessSectors=" + businessSectors +
            ", categories=" + categories +
            ", certificationList='" + certificationList + '\'' +
            ", certifications=" + certifications +
            ", certificationGroups=" + certificationGroups +
            ", clientBillRate=" + clientBillRate +
            ", clientContact=" + clientContact +
            ", clientCorporation=" + clientCorporation +
            ", costCenter='" + costCenter + '\'' +
            ", dateAdded=" + dateAdded +
            ", dateClosed=" + dateClosed +
            ", dateEnd=" + dateEnd +
            ", dateLastExported=" + dateLastExported +
            ", dateLastModified=" + dateLastModified +
            ", dateLastPublished=" + dateLastPublished +
            ", degreeList='" + degreeList + '\'' +
            ", description='" + description + '\'' +
            ", durationWeeks=" + durationWeeks +
            ", educationDegree='" + educationDegree + '\'' +
            ", employmentType='" + employmentType + '\'' +
            ", externalCategoryID=" + externalCategoryID +
            ", externalID='" + externalID + '\'' +
            ", feeArrangement=" + feeArrangement +
            ", fileAttachments=" + fileAttachments +
            ", hoursOfOperation='" + hoursOfOperation + '\'' +
            ", hoursPerWeek=" + hoursPerWeek +
            ", interviews=" + interviews +
            ", isClientEditable=" + isClientEditable +
            ", isDeleted=" + isDeleted +
            ", isInterviewRequired=" + isInterviewRequired +
            ", isJobcastPublished=" + isJobcastPublished +
            ", isOpen=" + isOpen +
            ", isPublic=" + isPublic +
            ", isWorkFromHome=" + isWorkFromHome +
            ", jobBoardList='" + jobBoardList + '\'' +
            ", jobOrderRateCardID=" + jobOrderRateCardID +
            ", location=" + location +
            ", markUpPercentage=" + markUpPercentage +
            ", notes=" + notes +
            ", numOpenings=" + numOpenings +
            ", onSite='" + onSite + '\'' +
            ", optionsPackage='" + optionsPackage + '\'' +
            ", opportunity=" + opportunity +
            ", owner=" + owner +
            ", payRate=" + payRate +
            ", placements=" + placements +
            ", publicDescription='" + publicDescription + '\'' +
            ", publishedCategory=" + publishedCategory +
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
            ", usersAssigned='" + usersAssigned + '\'' +
            ", webResponses=" + webResponses +
            ", willRelocate=" + willRelocate +
            ", willRelocateInt=" + willRelocateInt +
            ", willSponsor=" + willSponsor +
            ", workersCompRate=" + workersCompRate +
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
}
