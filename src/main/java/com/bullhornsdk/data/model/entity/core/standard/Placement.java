package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.api.helper.RestOneToManySerializer;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance9;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.EditHistoryEntity;
import com.bullhornsdk.data.model.entity.core.type.FileEntity;
import com.bullhornsdk.data.model.entity.core.type.HardDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsD;
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
@JsonPropertyOrder({ "id", "appointments", "approvingClientContact", "backupApprovingClientContact", "billingClientContact",
		"billingFrequency", "bonusPackage", "candidate", "placementCertifications", "changeRequests", "clientBillRate", "clientOvertimeRate",
        "comments", "commissions", "correlatedCustomDate1", "correlatedCustomDate2", "correlatedCustomDate3", "correlatedCustomFloat1",
		"correlatedCustomFloat2", "correlatedCustomFloat3", "correlatedCustomInt1", "correlatedCustomInt2", "correlatedCustomInt3",
		"correlatedCustomText1", "correlatedCustomText10", "correlatedCustomText2", "correlatedCustomText3", "correlatedCustomText4",
		"correlatedCustomText5", "correlatedCustomText6", "correlatedCustomText7", "correlatedCustomText8", "correlatedCustomText9",
		"correlatedCustomTextBlock1", "correlatedCustomTextBlock2", "correlatedCustomTextBlock3", "costCenter", "customBillRate1",
		"customBillRate10", "customBillRate2", "customBillRate3", "customBillRate4", "customBillRate5", "customBillRate6",
		"customBillRate7", "customBillRate8", "customBillRate9", "customDate1", "customDate2", "customDate3", "customFloat1",
		"customFloat2", "customFloat3", "customInt1", "customInt2", "customInt3", "customPayRate1", "customPayRate10", "customPayRate2",
		"customPayRate3", "customPayRate4", "customPayRate5", "customPayRate6", "customPayRate7", "customPayRate8", "customPayRate9",
		"customText1", "customText10", "customText11", "customText12", "customText13", "customText14", "customText15", "customText16",
		"customText17", "customText18", "customText19", "customText2", "customText20", "customText21", "customText22", "customText23",
		"customText24", "customText25", "customText26", "customText27", "customText28", "customText29", "customText3", "customText30",
		"customText31", "customText32", "customText33", "customText34", "customText35", "customText36", "customText37", "customText38",
		"customText39", "customText4", "customText40", "customText5", "customText6", "customText7", "customText8", "customText9",
		"customTextBlock1", "customTextBlock2", "customTextBlock3", "customTextBlock4", "customTextBlock5", "dateAdded", "dateBegin",
		"dateClientEffective", "dateEffective", "dateEnd", "dateLastModified", "daysGuaranteed", "daysProRated", "durationWeeks", "employeeType",
		"employmentType", "fee", "flatFee", "hoursOfOperation", "hoursPerDay", "housingManagerID", "housingStatus", "invoiceGroupName",
		"jobOrder", "jobSubmission", "markUpPercentage", "migrateGUID", "notes", "overtimeMarkUpPercentage", "optionsPackage",
		"otExemption", "otherHourlyFee", "otherHourlyFeeComments", "overtimeRate", "payRate", "projectCodeList",
		"recruitingManagerPercentGrossMargin", "referralFee", "referralFeeType", "reportTo", "reportedMargin", "salary", "salaryUnit",
		"salesManagerPercentGrossMargin", "statementClientContact", "status", "tasks", "taxRate", "taxState", "terminationReason",
		"timeUnits", "vendorClientCorporation", "workWeekStart", "customObject1s", "customObject2s", "customObject3s", "customObject4s",
        "customObject5s", "customObject6s", "customObject7s", "customObject8s", "customObject9s", "customObject10s" })
public class Placement extends CustomFieldsD implements SearchEntity, QueryEntity, UpdateEntity, CreateEntity, HardDeleteEntity,
		FileEntity, AssociationEntity, DateLastModifiedEntity, EditHistoryEntity {

	private Integer id;

	private OneToMany<Appointment> appointments;

	private ClientContact approvingClientContact;

	private ClientContact backupApprovingClientContact;

	private ClientContact billingClientContact;

	@JsonIgnore
	@Size(max = 30)
	private String billingFrequency;

	@JsonIgnore
	private String bonusPackage;

	private Candidate candidate;

    private OneToMany<PlacementCertification> placementCertifications;

	private OneToMany<PlacementChangeRequest> changeRequests;

	private BigDecimal clientBillRate;

	private BigDecimal clientOvertimeRate;

	@JsonIgnore
	private String comments;

	private OneToMany<PlacementCommission> commissions;

	@JsonIgnore
	@Size(max = 100)
	private String costCenter;

	private DateTime dateAdded;

	private DateTime dateBegin;

	private DateTime dateClientEffective;

	private DateTime dateEffective;

	private DateTime dateEnd;

	private DateTime dateLastModified;

	private Integer daysGuaranteed;

	private Integer daysProRated;

	private BigDecimal durationWeeks;

	@JsonIgnore
	@Size(max = 30)
	private String employeeType;

	@JsonIgnore
	private String employmentType;

	private BigDecimal fee;

	private BigDecimal flatFee;

	@JsonIgnore
	@Size(max = 100)
	private String hoursOfOperation;

	private BigDecimal hoursPerDay;

	private Integer housingManagerID;

	@JsonIgnore
	private String housingStatus;

	@JsonIgnore
	@Size(max = 100)
	private String invoiceGroupName;

	private JobOrder jobOrder;

	private JobSubmission jobSubmission;

	private Object migrateGUID;

	@JsonIgnore
	private String optionsPackage;

	private Integer otExemption;

	private BigDecimal otherHourlyFee;

	private BigDecimal markUpPercentage;

	private OneToMany<Note> notes;

	@JsonIgnore
	private String otherHourlyFeeComments;

	private BigDecimal overtimeMarkUpPercentage;

	private BigDecimal overtimeRate;

	private BigDecimal payRate;

	@JsonIgnore
	private String projectCodeList;

	private BigDecimal recruitingManagerPercentGrossMargin;

	private BigDecimal referralFee;

	@JsonIgnore
	private String referralFeeType;

	@JsonIgnore
	@Size(max = 100)
	private String reportTo;

	private Integer reportedMargin;

	private BigDecimal salary;

	@JsonIgnore
	@Size(max = 20)
	private String salaryUnit;

	private BigDecimal salesManagerPercentGrossMargin;

	private ClientContact statementClientContact;

	@JsonIgnore
	@Size(max = 30)
	private String status;

	private OneToMany<Task> tasks;

	private BigDecimal taxRate;

	@JsonIgnore
	private String taxState;

	@JsonIgnore
	private String terminationReason;

	private OneToMany<TimeUnit> timeUnits;

	private ClientCorporation vendorClientCorporation;

	private Integer workWeekStart;

    private OneToMany<PlacementCustomObjectInstance1> customObject1s;

    private OneToMany<PlacementCustomObjectInstance2> customObject2s;

    private OneToMany<PlacementCustomObjectInstance3> customObject3s;

    private OneToMany<PlacementCustomObjectInstance4> customObject4s;

    private OneToMany<PlacementCustomObjectInstance5> customObject5s;

    private OneToMany<PlacementCustomObjectInstance6> customObject6s;

    private OneToMany<PlacementCustomObjectInstance7> customObject7s;

    private OneToMany<PlacementCustomObjectInstance8> customObject8s;

    private OneToMany<PlacementCustomObjectInstance9> customObject9s;

    private OneToMany<PlacementCustomObjectInstance10> customObject10s;

	public Placement() {
		super();
	}

	public Placement(Integer id) {
		super();
		this.id = id;
	}

	public Placement instantiateForInsert(){
		Placement placement = new Placement();
		placement.setDateBegin(new DateTime());
		placement.setDaysProRated(0);
		placement.setDurationWeeks(new BigDecimal(1.0));
		placement.setEmployeeType("W2");
		placement.setFee(new BigDecimal(1.0));
		placement.setHoursPerDay(new BigDecimal(1.0));
		placement.setPayRate(new BigDecimal(1.0));
		placement.setRecruitingManagerPercentGrossMargin(new BigDecimal(1.0));
		placement.setReferralFee(new BigDecimal(1.0));
		placement.setSalary(new BigDecimal(1.0));
		placement.setSalaryUnit("Dollars");
		placement.setSalesManagerPercentGrossMargin(new BigDecimal(1.0));
		placement.setStatus("Submitted");
		placement.setCandidate(new Candidate(1));
		placement.setJobOrder(new JobOrder(1));
		placement.setDaysGuaranteed(1);
		placement.setEmploymentType("Contract");
		return placement;
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

	@JsonIgnore
	public OneToMany<Appointment> getAppointments() {
		return appointments;
	}

    @ReadOnly
	@JsonProperty("appointments")
	public void setAppointments(OneToMany<Appointment> appointments) {
		this.appointments = appointments;
	}

	@JsonProperty("approvingClientContact")
	public ClientContact getApprovingClientContact() {
		return approvingClientContact;
	}

	@JsonProperty("approvingClientContact")
	public void setApprovingClientContact(ClientContact approvingClientContact) {
		this.approvingClientContact = approvingClientContact;
	}

	@JsonProperty("backupApprovingClientContact")
	public ClientContact getBackupApprovingClientContact() {
		return backupApprovingClientContact;
	}

	@JsonProperty("backupApprovingClientContact")
	public void setBackupApprovingClientContact(ClientContact backupApprovingClientContact) {
		this.backupApprovingClientContact = backupApprovingClientContact;
	}

	@JsonProperty("billingClientContact")
	public ClientContact getBillingClientContact() {
		return billingClientContact;
	}

	@JsonProperty("billingClientContact")
	public void setBillingClientContact(ClientContact billingClientContact) {
		this.billingClientContact = billingClientContact;
	}

	@JsonProperty("billingFrequency")
	public String getBillingFrequency() {
		return billingFrequency;
	}

	@JsonIgnore
	public void setBillingFrequency(String billingFrequency) {
		this.billingFrequency = billingFrequency;
	}

	@JsonProperty("bonusPackage")
	public String getBonusPackage() {
		return bonusPackage;
	}

	@JsonIgnore
	public void setBonusPackage(String bonusPackage) {
		this.bonusPackage = bonusPackage;
	}

	@JsonProperty("candidate")
	public Candidate getCandidate() {
		return candidate;
	}

	@JsonProperty("candidate")
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

    @JsonIgnore
    public OneToMany<PlacementCertification> getPlacementCertifications() {
        return placementCertifications;
    }

    @ReadOnly
    @JsonProperty("placementCertifications")
    public void setPlacementCertifications(OneToMany<PlacementCertification> placementCertifications) {
        this.placementCertifications = placementCertifications;
    }

	@JsonIgnore
	public OneToMany<PlacementChangeRequest> getChangeRequests() {
		return changeRequests;
	}

    @ReadOnly
	@JsonProperty("changeRequests")
	public void setChangeRequests(OneToMany<PlacementChangeRequest> changeRequests) {
		this.changeRequests = changeRequests;
	}

	@JsonProperty("clientBillRate")
	public BigDecimal getClientBillRate() {
		return clientBillRate;
	}

	@JsonProperty("clientBillRate")
	public void setClientBillRate(BigDecimal clientBillRate) {
		this.clientBillRate = clientBillRate;
	}

	@JsonProperty("clientOvertimeRate")
	public BigDecimal getClientOvertimeRate() {
		return clientOvertimeRate;
	}

	@JsonProperty("clientOvertimeRate")
	public void setClientOvertimeRate(BigDecimal clientOvertimeRate) {
		this.clientOvertimeRate = clientOvertimeRate;
	}

	@JsonProperty("comments")
	public String getComments() {
		return comments;
	}

	@JsonIgnore
	public void setComments(String comments) {
		this.comments = comments;
	}

	@JsonIgnore
	public OneToMany<PlacementCommission> getCommissions() {
		return commissions;
	}

    @ReadOnly
	@JsonProperty("commissions")
	public void setCommissions(OneToMany<PlacementCommission> commissions) {
		this.commissions = commissions;
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

	@JsonProperty("dateBegin")
	public DateTime getDateBegin() {
		return dateBegin;
	}

	@JsonProperty("dateBegin")
	public void setDateBegin(DateTime dateBegin) {
		this.dateBegin = dateBegin;
	}

	@JsonProperty("dateClientEffective")
	public DateTime getDateClientEffective() {
		return dateClientEffective;
	}

	@JsonProperty("dateClientEffective")
	public void setDateClientEffective(DateTime dateClientEffective) {
		this.dateClientEffective = dateClientEffective;
	}

	@JsonProperty("dateEffective")
	public DateTime getDateEffective() {
		return dateEffective;
	}

	@JsonProperty("dateEffective")
	public void setDateEffective(DateTime dateEffective) {
		this.dateEffective = dateEffective;
	}

	@JsonProperty("dateEnd")
	public DateTime getDateEnd() {
		return dateEnd;
	}

	@JsonProperty("dateEnd")
	public void setDateEnd(DateTime dateEnd) {
		this.dateEnd = dateEnd;
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

	@JsonProperty("daysGuaranteed")
	public Integer getDaysGuaranteed() {
		return daysGuaranteed;
	}

	@JsonProperty("daysGuaranteed")
	public void setDaysGuaranteed(Integer daysGuaranteed) {
		this.daysGuaranteed = daysGuaranteed;
	}

	@JsonProperty("daysProRated")
	public Integer getDaysProRated() {
		return daysProRated;
	}

	@JsonProperty("daysProRated")
	public void setDaysProRated(Integer daysProRated) {
		this.daysProRated = daysProRated;
	}

	@JsonProperty("durationWeeks")
	public BigDecimal getDurationWeeks() {
		return durationWeeks;
	}

	@JsonProperty("durationWeeks")
	public void setDurationWeeks(BigDecimal durationWeeks) {
		this.durationWeeks = durationWeeks;
	}

	@JsonProperty("employeeType")
	public String getEmployeeType() {
		return employeeType;
	}

	@JsonIgnore
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	@JsonProperty("employmentType")
	public String getEmploymentType() {
		return employmentType;
	}

	@JsonIgnore
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	@JsonProperty("fee")
	public BigDecimal getFee() {
		return fee;
	}

	@JsonProperty("fee")
	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	@JsonProperty("flatFee")
	public BigDecimal getFlatFee() {
		return flatFee;
	}

	@JsonProperty("flatFee")
	public void setFlatFee(BigDecimal flatFee) {
		this.flatFee = flatFee;
	}

	@JsonProperty("hoursOfOperation")
	public String getHoursOfOperation() {
		return hoursOfOperation;
	}

	@JsonIgnore
	public void setHoursOfOperation(String hoursOfOperation) {
		this.hoursOfOperation = hoursOfOperation;
	}

	@JsonProperty("hoursPerDay")
	public BigDecimal getHoursPerDay() {
		return hoursPerDay;
	}

	@JsonProperty("hoursPerDay")
	public void setHoursPerDay(BigDecimal hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
	}

	@JsonProperty("housingManagerID")
	public Integer getHousingManagerID() {
		return housingManagerID;
	}

	@JsonProperty("housingManagerID")
	public void setHousingManagerID(Integer housingManagerID) {
		this.housingManagerID = housingManagerID;
	}

	@JsonProperty("housingStatus")
	public String getHousingStatus() {
		return housingStatus;
	}

	@JsonIgnore
	public void setHousingStatus(String housingStatus) {
		this.housingStatus = housingStatus;
	}

	@JsonProperty("invoiceGroupName")
	public String getInvoiceGroupName() {
		return invoiceGroupName;
	}

	@JsonIgnore
	public void setInvoiceGroupName(String invoiceGroupName) {
		this.invoiceGroupName = invoiceGroupName;
	}

	@JsonProperty("jobOrder")
	public JobOrder getJobOrder() {
		return jobOrder;
	}

	@JsonProperty("jobOrder")
	public void setJobOrder(JobOrder jobOrder) {
		this.jobOrder = jobOrder;
	}

	@JsonIgnore
	public JobSubmission getJobSubmission() {
		return jobSubmission;
	}

	@JsonProperty("jobSubmission")
	public void setJobSubmission(JobSubmission jobSubmission) {
		this.jobSubmission = jobSubmission;
	}

	@JsonProperty("markUpPercentage")
	public BigDecimal getMarkUpPercentage() {
		return markUpPercentage;
	}

	@JsonProperty("markUpPercentage")
	public void setMarkUpPercentage(BigDecimal markUpPercentage) {
		this.markUpPercentage = markUpPercentage;
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

	@JsonProperty("overtimeMarkUpPercentage")
	public BigDecimal getOvertimeMarkUpPercentage() {
		return overtimeMarkUpPercentage;
	}

	@JsonProperty("overtimeMarkUpPercentage")
	public void setOvertimeMarkUpPercentage(BigDecimal overtimeMarkUpPercentage) {
		this.overtimeMarkUpPercentage = overtimeMarkUpPercentage;
	}

	@JsonProperty("migrateGUID")
	public Object getMigrateGUID() {
		return migrateGUID;
	}

	@JsonProperty("migrateGUID")
	public void setMigrateGUID(Object migrateGUID) {
		this.migrateGUID = migrateGUID;
	}

	@JsonProperty("optionsPackage")
	public String getOptionsPackage() {
		return optionsPackage;
	}

	@JsonIgnore
	public void setOptionsPackage(String optionsPackage) {
		this.optionsPackage = optionsPackage;
	}

	@JsonProperty("otExemption")
	public Integer getOtExemption() {
		return otExemption;
	}

	@JsonProperty("otExemption")
	public void setOtExemption(Integer otExemption) {
		this.otExemption = otExemption;
	}

	@JsonProperty("otherHourlyFee")
	public BigDecimal getOtherHourlyFee() {
		return otherHourlyFee;
	}

	@JsonProperty("otherHourlyFee")
	public void setOtherHourlyFee(BigDecimal otherHourlyFee) {
		this.otherHourlyFee = otherHourlyFee;
	}

	@JsonProperty("otherHourlyFeeComments")
	public String getOtherHourlyFeeComments() {
		return otherHourlyFeeComments;
	}

	@JsonIgnore
	public void setOtherHourlyFeeComments(String otherHourlyFeeComments) {
		this.otherHourlyFeeComments = otherHourlyFeeComments;
	}

	@JsonProperty("overtimeRate")
	public BigDecimal getOvertimeRate() {
		return overtimeRate;
	}

	@JsonProperty("overtimeRate")
	public void setOvertimeRate(BigDecimal overtimeRate) {
		this.overtimeRate = overtimeRate;
	}

	@JsonProperty("payRate")
	public BigDecimal getPayRate() {
		return payRate;
	}

	@JsonProperty("payRate")
	public void setPayRate(BigDecimal payRate) {
		this.payRate = payRate;
	}

	@JsonProperty("projectCodeList")
	public String getProjectCodeList() {
		return projectCodeList;
	}

	@JsonIgnore
	public void setProjectCodeList(String projectCodeList) {
		this.projectCodeList = projectCodeList;
	}

	@JsonProperty("recruitingManagerPercentGrossMargin")
	public BigDecimal getRecruitingManagerPercentGrossMargin() {
		return recruitingManagerPercentGrossMargin;
	}

	@JsonProperty("recruitingManagerPercentGrossMargin")
	public void setRecruitingManagerPercentGrossMargin(BigDecimal recruitingManagerPercentGrossMargin) {
		this.recruitingManagerPercentGrossMargin = recruitingManagerPercentGrossMargin;
	}

	@JsonProperty("referralFee")
	public BigDecimal getReferralFee() {
		return referralFee;
	}

	@JsonProperty("referralFee")
	public void setReferralFee(BigDecimal referralFee) {
		this.referralFee = referralFee;
	}

	@JsonProperty("referralFeeType")
	public String getReferralFeeType() {
		return referralFeeType;
	}

	@JsonIgnore
	public void setReferralFeeType(String referralFeeType) {
		this.referralFeeType = referralFeeType;
	}

	@JsonProperty("reportTo")
	public String getReportTo() {
		return reportTo;
	}

	@JsonIgnore
	public void setReportTo(String reportTo) {
		this.reportTo = reportTo;
	}

	@JsonProperty("reportedMargin")
	public Integer getReportedMargin() {
		return reportedMargin;
	}

	@JsonProperty("reportedMargin")
	public void setReportedMargin(Integer reportedMargin) {
		this.reportedMargin = reportedMargin;
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

	@JsonProperty("salesManagerPercentGrossMargin")
	public BigDecimal getSalesManagerPercentGrossMargin() {
		return salesManagerPercentGrossMargin;
	}

	@JsonProperty("salesManagerPercentGrossMargin")
	public void setSalesManagerPercentGrossMargin(BigDecimal salesManagerPercentGrossMargin) {
		this.salesManagerPercentGrossMargin = salesManagerPercentGrossMargin;
	}

	@JsonProperty("statementClientContact")
	public ClientContact getStatementClientContact() {
		return statementClientContact;
	}

	@JsonProperty("statementClientContact")
	public void setStatementClientContact(ClientContact statementClientContact) {
		this.statementClientContact = statementClientContact;
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

	@JsonProperty("taxState")
	public String getTaxState() {
		return taxState;
	}

	@JsonIgnore
	public void setTaxState(String taxState) {
		this.taxState = taxState;
	}

	@JsonProperty("terminationReason")
	public String getTerminationReason() {
		return terminationReason;
	}

	@JsonIgnore
	public void setTerminationReason(String terminationReason) {
		this.terminationReason = terminationReason;
	}

	@JsonIgnore
	public OneToMany<TimeUnit> getTimeUnits() {
		return timeUnits;
	}

	@JsonProperty("timeUnits")
	public void setTimeUnits(OneToMany<TimeUnit> timeUnits) {
		this.timeUnits = timeUnits;
	}

	@JsonProperty("vendorClientCorporation")
	public ClientCorporation getVendorClientCorporation() {
		return vendorClientCorporation;
	}

	@JsonProperty("vendorClientCorporation")
	public void setVendorClientCorporation(ClientCorporation vendorClientCorporation) {
		this.vendorClientCorporation = vendorClientCorporation;
	}

	@JsonProperty("workWeekStart")
	public Integer getWorkWeekStart() {
		return workWeekStart;
	}

	@JsonProperty("workWeekStart")
	public void setWorkWeekStart(Integer workWeekStart) {
		this.workWeekStart = workWeekStart;
	}

    @JsonProperty("customObject1s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PlacementCustomObjectInstance1> getCustomObject1s() {
        return customObject1s;
    }

    @JsonProperty("customObject1s")
    public void setCustomObject1s(OneToMany<PlacementCustomObjectInstance1> customObject1s) {
        this.customObject1s = customObject1s;
    }

    @JsonProperty("customObject2s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PlacementCustomObjectInstance2> getCustomObject2s() {
        return customObject2s;
    }

    @JsonProperty("customObject2s")
    public void setCustomObject2s(OneToMany<PlacementCustomObjectInstance2> customObject2s) {
        this.customObject2s = customObject2s;
    }

    @JsonProperty("customObject3s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PlacementCustomObjectInstance3> getCustomObject3s() {
        return customObject3s;
    }

    @JsonProperty("customObject3s")
    public void setCustomObject3s(OneToMany<PlacementCustomObjectInstance3> customObject3s) {
        this.customObject3s = customObject3s;
    }

    @JsonProperty("customObject4s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PlacementCustomObjectInstance4> getCustomObject4s() {
        return customObject4s;
    }

    @JsonProperty("customObject4s")
    public void setCustomObject4s(OneToMany<PlacementCustomObjectInstance4> customObject4s) {
        this.customObject4s = customObject4s;
    }

    @JsonProperty("customObject5s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PlacementCustomObjectInstance5> getCustomObject5s() {
        return customObject5s;
    }

    @JsonProperty("customObject5s")
    public void setCustomObject5s(OneToMany<PlacementCustomObjectInstance5> customObject5s) {
        this.customObject5s = customObject5s;
    }

    @JsonProperty("customObject6s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PlacementCustomObjectInstance6> getCustomObject6s() {
        return customObject6s;
    }

    @JsonProperty("customObject6s")
    public void setCustomObject6s(OneToMany<PlacementCustomObjectInstance6> customObject6s) {
        this.customObject6s = customObject6s;
    }

    @JsonProperty("customObject7s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PlacementCustomObjectInstance7> getCustomObject7s() {
        return customObject7s;
    }

    @JsonProperty("customObject7s")
    public void setCustomObject7s(OneToMany<PlacementCustomObjectInstance7> customObject7s) {
        this.customObject7s = customObject7s;
    }

    @JsonProperty("customObject8s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PlacementCustomObjectInstance8> getCustomObject8s() {
        return customObject8s;
    }

    @JsonProperty("customObject8s")
    public void setCustomObject8s(OneToMany<PlacementCustomObjectInstance8> customObject8s) {
        this.customObject8s = customObject8s;
    }

    @JsonProperty("customObject9s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PlacementCustomObjectInstance9> getCustomObject9s() {
        return customObject9s;
    }

    @JsonProperty("customObject9s")
    public void setCustomObject9s(OneToMany<PlacementCustomObjectInstance9> customObject9s) {
        this.customObject9s = customObject9s;
    }

    @JsonProperty("customObject10s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PlacementCustomObjectInstance10> getCustomObject10s() {
        return customObject10s;
    }

    @JsonProperty("customObject10s")
    public void setCustomObject10s(OneToMany<PlacementCustomObjectInstance10> customObject10s) {
        this.customObject10s = customObject10s;
    }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		Placement placement = (Placement) o;

		if (id != null ? !id.equals(placement.id) : placement.id != null) return false;
		if (appointments != null ? !appointments.equals(placement.appointments) : placement.appointments != null)
			return false;
		if (approvingClientContact != null ? !approvingClientContact.equals(placement.approvingClientContact) : placement.approvingClientContact != null)
			return false;
		if (backupApprovingClientContact != null ? !backupApprovingClientContact.equals(placement.backupApprovingClientContact) : placement.backupApprovingClientContact != null)
			return false;
		if (billingClientContact != null ? !billingClientContact.equals(placement.billingClientContact) : placement.billingClientContact != null)
			return false;
		if (billingFrequency != null ? !billingFrequency.equals(placement.billingFrequency) : placement.billingFrequency != null)
			return false;
		if (bonusPackage != null ? !bonusPackage.equals(placement.bonusPackage) : placement.bonusPackage != null)
			return false;
		if (candidate != null ? !candidate.equals(placement.candidate) : placement.candidate != null) return false;
        if (placementCertifications != null ? !placementCertifications.equals(placement.placementCertifications) : placement.placementCertifications != null)
            return false;
		if (changeRequests != null ? !changeRequests.equals(placement.changeRequests) : placement.changeRequests != null)
			return false;
		if (clientBillRate != null ? !clientBillRate.equals(placement.clientBillRate) : placement.clientBillRate != null)
			return false;
		if (clientOvertimeRate != null ? !clientOvertimeRate.equals(placement.clientOvertimeRate) : placement.clientOvertimeRate != null)
			return false;
		if (comments != null ? !comments.equals(placement.comments) : placement.comments != null) return false;
		if (commissions != null ? !commissions.equals(placement.commissions) : placement.commissions != null)
			return false;
		if (costCenter != null ? !costCenter.equals(placement.costCenter) : placement.costCenter != null) return false;
		if (dateAdded != null ? !dateAdded.equals(placement.dateAdded) : placement.dateAdded != null) return false;
		if (dateBegin != null ? !dateBegin.equals(placement.dateBegin) : placement.dateBegin != null) return false;
		if (dateClientEffective != null ? !dateClientEffective.equals(placement.dateClientEffective) : placement.dateClientEffective != null)
			return false;
		if (dateEffective != null ? !dateEffective.equals(placement.dateEffective) : placement.dateEffective != null)
			return false;
		if (dateEnd != null ? !dateEnd.equals(placement.dateEnd) : placement.dateEnd != null) return false;
		if (dateLastModified != null ? !dateLastModified.equals(placement.dateLastModified) : placement.dateLastModified != null)
			return false;
		if (daysGuaranteed != null ? !daysGuaranteed.equals(placement.daysGuaranteed) : placement.daysGuaranteed != null)
			return false;
		if (daysProRated != null ? !daysProRated.equals(placement.daysProRated) : placement.daysProRated != null)
			return false;
		if (durationWeeks != null ? !durationWeeks.equals(placement.durationWeeks) : placement.durationWeeks != null)
			return false;
		if (employeeType != null ? !employeeType.equals(placement.employeeType) : placement.employeeType != null)
			return false;
		if (employmentType != null ? !employmentType.equals(placement.employmentType) : placement.employmentType != null)
			return false;
		if (fee != null ? !fee.equals(placement.fee) : placement.fee != null) return false;
		if (flatFee != null ? !flatFee.equals(placement.flatFee) : placement.flatFee != null) return false;
		if (hoursOfOperation != null ? !hoursOfOperation.equals(placement.hoursOfOperation) : placement.hoursOfOperation != null)
			return false;
		if (hoursPerDay != null ? !hoursPerDay.equals(placement.hoursPerDay) : placement.hoursPerDay != null)
			return false;
		if (housingManagerID != null ? !housingManagerID.equals(placement.housingManagerID) : placement.housingManagerID != null)
			return false;
		if (housingStatus != null ? !housingStatus.equals(placement.housingStatus) : placement.housingStatus != null)
			return false;
		if (invoiceGroupName != null ? !invoiceGroupName.equals(placement.invoiceGroupName) : placement.invoiceGroupName != null)
			return false;
		if (jobOrder != null ? !jobOrder.equals(placement.jobOrder) : placement.jobOrder != null) return false;
		if (jobSubmission != null ? !jobSubmission.equals(placement.jobSubmission) : placement.jobSubmission != null)
			return false;
		if (migrateGUID != null ? !migrateGUID.equals(placement.migrateGUID) : placement.migrateGUID != null)
			return false;
		if (optionsPackage != null ? !optionsPackage.equals(placement.optionsPackage) : placement.optionsPackage != null)
			return false;
		if (otExemption != null ? !otExemption.equals(placement.otExemption) : placement.otExemption != null)
			return false;
		if (otherHourlyFee != null ? !otherHourlyFee.equals(placement.otherHourlyFee) : placement.otherHourlyFee != null)
			return false;
		if (markUpPercentage != null ? !markUpPercentage.equals(placement.markUpPercentage) : placement.markUpPercentage != null)
			return false;
		if (notes != null ? !notes.equals(placement.notes) : placement.notes != null) return false;
		if (otherHourlyFeeComments != null ? !otherHourlyFeeComments.equals(placement.otherHourlyFeeComments) : placement.otherHourlyFeeComments != null)
			return false;
		if (overtimeMarkUpPercentage != null ? !overtimeMarkUpPercentage.equals(placement.overtimeMarkUpPercentage) : placement.overtimeMarkUpPercentage != null)
			return false;
		if (overtimeRate != null ? !overtimeRate.equals(placement.overtimeRate) : placement.overtimeRate != null)
			return false;
		if (payRate != null ? !payRate.equals(placement.payRate) : placement.payRate != null) return false;
		if (projectCodeList != null ? !projectCodeList.equals(placement.projectCodeList) : placement.projectCodeList != null)
			return false;
		if (recruitingManagerPercentGrossMargin != null ? !recruitingManagerPercentGrossMargin.equals(placement.recruitingManagerPercentGrossMargin) : placement.recruitingManagerPercentGrossMargin != null)
			return false;
		if (referralFee != null ? !referralFee.equals(placement.referralFee) : placement.referralFee != null)
			return false;
		if (referralFeeType != null ? !referralFeeType.equals(placement.referralFeeType) : placement.referralFeeType != null)
			return false;
		if (reportTo != null ? !reportTo.equals(placement.reportTo) : placement.reportTo != null) return false;
		if (reportedMargin != null ? !reportedMargin.equals(placement.reportedMargin) : placement.reportedMargin != null)
			return false;
		if (salary != null ? !salary.equals(placement.salary) : placement.salary != null) return false;
		if (salaryUnit != null ? !salaryUnit.equals(placement.salaryUnit) : placement.salaryUnit != null) return false;
		if (salesManagerPercentGrossMargin != null ? !salesManagerPercentGrossMargin.equals(placement.salesManagerPercentGrossMargin) : placement.salesManagerPercentGrossMargin != null)
			return false;
		if (statementClientContact != null ? !statementClientContact.equals(placement.statementClientContact) : placement.statementClientContact != null)
			return false;
		if (status != null ? !status.equals(placement.status) : placement.status != null) return false;
		if (tasks != null ? !tasks.equals(placement.tasks) : placement.tasks != null) return false;
		if (taxRate != null ? !taxRate.equals(placement.taxRate) : placement.taxRate != null) return false;
		if (taxState != null ? !taxState.equals(placement.taxState) : placement.taxState != null) return false;
		if (terminationReason != null ? !terminationReason.equals(placement.terminationReason) : placement.terminationReason != null)
			return false;
		if (timeUnits != null ? !timeUnits.equals(placement.timeUnits) : placement.timeUnits != null) return false;
		if (vendorClientCorporation != null ? !vendorClientCorporation.equals(placement.vendorClientCorporation) : placement.vendorClientCorporation != null)
			return false;
		if (workWeekStart != null ? !workWeekStart.equals(placement.workWeekStart) : placement.workWeekStart != null)
			return false;
		if (customObject1s != null ? !customObject1s.equals(placement.customObject1s) : placement.customObject1s != null)
			return false;
		if (customObject2s != null ? !customObject2s.equals(placement.customObject2s) : placement.customObject2s != null)
			return false;
		if (customObject3s != null ? !customObject3s.equals(placement.customObject3s) : placement.customObject3s != null)
			return false;
		if (customObject4s != null ? !customObject4s.equals(placement.customObject4s) : placement.customObject4s != null)
			return false;
		if (customObject5s != null ? !customObject5s.equals(placement.customObject5s) : placement.customObject5s != null)
			return false;
		if (customObject6s != null ? !customObject6s.equals(placement.customObject6s) : placement.customObject6s != null)
			return false;
		if (customObject7s != null ? !customObject7s.equals(placement.customObject7s) : placement.customObject7s != null)
			return false;
		if (customObject8s != null ? !customObject8s.equals(placement.customObject8s) : placement.customObject8s != null)
			return false;
		if (customObject9s != null ? !customObject9s.equals(placement.customObject9s) : placement.customObject9s != null)
			return false;
		return !(customObject10s != null ? !customObject10s.equals(placement.customObject10s) : placement.customObject10s != null);

	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (id != null ? id.hashCode() : 0);
		result = 31 * result + (appointments != null ? appointments.hashCode() : 0);
		result = 31 * result + (approvingClientContact != null ? approvingClientContact.hashCode() : 0);
		result = 31 * result + (backupApprovingClientContact != null ? backupApprovingClientContact.hashCode() : 0);
		result = 31 * result + (billingClientContact != null ? billingClientContact.hashCode() : 0);
		result = 31 * result + (billingFrequency != null ? billingFrequency.hashCode() : 0);
		result = 31 * result + (bonusPackage != null ? bonusPackage.hashCode() : 0);
		result = 31 * result + (candidate != null ? candidate.hashCode() : 0);
        result = 31 * result + (placementCertifications != null ? placementCertifications.hashCode() : 0);
		result = 31 * result + (changeRequests != null ? changeRequests.hashCode() : 0);
		result = 31 * result + (clientBillRate != null ? clientBillRate.hashCode() : 0);
		result = 31 * result + (clientOvertimeRate != null ? clientOvertimeRate.hashCode() : 0);
		result = 31 * result + (comments != null ? comments.hashCode() : 0);
		result = 31 * result + (commissions != null ? commissions.hashCode() : 0);
		result = 31 * result + (costCenter != null ? costCenter.hashCode() : 0);
		result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
		result = 31 * result + (dateBegin != null ? dateBegin.hashCode() : 0);
		result = 31 * result + (dateClientEffective != null ? dateClientEffective.hashCode() : 0);
		result = 31 * result + (dateEffective != null ? dateEffective.hashCode() : 0);
		result = 31 * result + (dateEnd != null ? dateEnd.hashCode() : 0);
		result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
		result = 31 * result + (daysGuaranteed != null ? daysGuaranteed.hashCode() : 0);
		result = 31 * result + (daysProRated != null ? daysProRated.hashCode() : 0);
		result = 31 * result + (durationWeeks != null ? durationWeeks.hashCode() : 0);
		result = 31 * result + (employeeType != null ? employeeType.hashCode() : 0);
		result = 31 * result + (employmentType != null ? employmentType.hashCode() : 0);
		result = 31 * result + (fee != null ? fee.hashCode() : 0);
		result = 31 * result + (flatFee != null ? flatFee.hashCode() : 0);
		result = 31 * result + (hoursOfOperation != null ? hoursOfOperation.hashCode() : 0);
		result = 31 * result + (hoursPerDay != null ? hoursPerDay.hashCode() : 0);
		result = 31 * result + (housingManagerID != null ? housingManagerID.hashCode() : 0);
		result = 31 * result + (housingStatus != null ? housingStatus.hashCode() : 0);
		result = 31 * result + (invoiceGroupName != null ? invoiceGroupName.hashCode() : 0);
		result = 31 * result + (jobOrder != null ? jobOrder.hashCode() : 0);
		result = 31 * result + (jobSubmission != null ? jobSubmission.hashCode() : 0);
		result = 31 * result + (migrateGUID != null ? migrateGUID.hashCode() : 0);
		result = 31 * result + (optionsPackage != null ? optionsPackage.hashCode() : 0);
		result = 31 * result + (otExemption != null ? otExemption.hashCode() : 0);
		result = 31 * result + (otherHourlyFee != null ? otherHourlyFee.hashCode() : 0);
		result = 31 * result + (markUpPercentage != null ? markUpPercentage.hashCode() : 0);
		result = 31 * result + (notes != null ? notes.hashCode() : 0);
		result = 31 * result + (otherHourlyFeeComments != null ? otherHourlyFeeComments.hashCode() : 0);
		result = 31 * result + (overtimeMarkUpPercentage != null ? overtimeMarkUpPercentage.hashCode() : 0);
		result = 31 * result + (overtimeRate != null ? overtimeRate.hashCode() : 0);
		result = 31 * result + (payRate != null ? payRate.hashCode() : 0);
		result = 31 * result + (projectCodeList != null ? projectCodeList.hashCode() : 0);
		result = 31 * result + (recruitingManagerPercentGrossMargin != null ? recruitingManagerPercentGrossMargin.hashCode() : 0);
		result = 31 * result + (referralFee != null ? referralFee.hashCode() : 0);
		result = 31 * result + (referralFeeType != null ? referralFeeType.hashCode() : 0);
		result = 31 * result + (reportTo != null ? reportTo.hashCode() : 0);
		result = 31 * result + (reportedMargin != null ? reportedMargin.hashCode() : 0);
		result = 31 * result + (salary != null ? salary.hashCode() : 0);
		result = 31 * result + (salaryUnit != null ? salaryUnit.hashCode() : 0);
		result = 31 * result + (salesManagerPercentGrossMargin != null ? salesManagerPercentGrossMargin.hashCode() : 0);
		result = 31 * result + (statementClientContact != null ? statementClientContact.hashCode() : 0);
		result = 31 * result + (status != null ? status.hashCode() : 0);
		result = 31 * result + (tasks != null ? tasks.hashCode() : 0);
		result = 31 * result + (taxRate != null ? taxRate.hashCode() : 0);
		result = 31 * result + (taxState != null ? taxState.hashCode() : 0);
		result = 31 * result + (terminationReason != null ? terminationReason.hashCode() : 0);
		result = 31 * result + (timeUnits != null ? timeUnits.hashCode() : 0);
		result = 31 * result + (vendorClientCorporation != null ? vendorClientCorporation.hashCode() : 0);
		result = 31 * result + (workWeekStart != null ? workWeekStart.hashCode() : 0);
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
		return "Placement{" +
				"id=" + id +
				", appointments=" + appointments +
				", approvingClientContact=" + approvingClientContact +
				", backupApprovingClientContact=" + backupApprovingClientContact +
				", billingClientContact=" + billingClientContact +
				", billingFrequency='" + billingFrequency + '\'' +
				", bonusPackage='" + bonusPackage + '\'' +
				", candidate=" + candidate +
                ", placementCertifications=" + placementCertifications +
				", changeRequests=" + changeRequests +
				", clientBillRate=" + clientBillRate +
				", clientOvertimeRate=" + clientOvertimeRate +
				", comments='" + comments + '\'' +
				", commissions=" + commissions +
				", costCenter='" + costCenter + '\'' +
				", dateAdded=" + dateAdded +
				", dateBegin=" + dateBegin +
				", dateClientEffective=" + dateClientEffective +
				", dateEffective=" + dateEffective +
				", dateEnd=" + dateEnd +
				", dateLastModified=" + dateLastModified +
				", daysGuaranteed=" + daysGuaranteed +
				", daysProRated=" + daysProRated +
				", durationWeeks=" + durationWeeks +
				", employeeType='" + employeeType + '\'' +
				", employmentType='" + employmentType + '\'' +
				", fee=" + fee +
				", flatFee=" + flatFee +
				", hoursOfOperation='" + hoursOfOperation + '\'' +
				", hoursPerDay=" + hoursPerDay +
				", housingManagerID=" + housingManagerID +
				", housingStatus='" + housingStatus + '\'' +
				", invoiceGroupName='" + invoiceGroupName + '\'' +
				", jobOrder=" + jobOrder +
				", jobSubmission=" + jobSubmission +
				", migrateGUID=" + migrateGUID +
				", optionsPackage='" + optionsPackage + '\'' +
				", otExemption=" + otExemption +
				", otherHourlyFee=" + otherHourlyFee +
				", markUpPercentage=" + markUpPercentage +
				", notes=" + notes +
				", otherHourlyFeeComments='" + otherHourlyFeeComments + '\'' +
				", overtimeMarkUpPercentage=" + overtimeMarkUpPercentage +
				", overtimeRate=" + overtimeRate +
				", payRate=" + payRate +
				", projectCodeList='" + projectCodeList + '\'' +
				", recruitingManagerPercentGrossMargin=" + recruitingManagerPercentGrossMargin +
				", referralFee=" + referralFee +
				", referralFeeType='" + referralFeeType + '\'' +
				", reportTo='" + reportTo + '\'' +
				", reportedMargin=" + reportedMargin +
				", salary=" + salary +
				", salaryUnit='" + salaryUnit + '\'' +
				", salesManagerPercentGrossMargin=" + salesManagerPercentGrossMargin +
				", statementClientContact=" + statementClientContact +
				", status='" + status + '\'' +
				", tasks=" + tasks +
				", taxRate=" + taxRate +
				", taxState='" + taxState + '\'' +
				", terminationReason='" + terminationReason + '\'' +
				", timeUnits=" + timeUnits +
				", vendorClientCorporation=" + vendorClientCorporation +
				", workWeekStart=" + workWeekStart +
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
