package com.bullhornsdk.data.model.entity.core.standard;

import java.math.BigDecimal;

import javax.validation.constraints.Size;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.FileEntity;
import com.bullhornsdk.data.model.entity.core.type.HardDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsD;
import com.bullhornsdk.data.model.entity.embedded.LinkedId;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "appointments", "approvingClientContact", "backupApprovingClientContact", "billingClientContact",
		"billingFrequency", "bonusPackage", "candidate", "changeRequests", "clientBillRate", "clientOvertimeRate", "comments",
		"commissions", "correlatedCustomDate1", "correlatedCustomDate2", "correlatedCustomDate3", "correlatedCustomFloat1",
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
		"dateClientEffective", "dateEffective", "dateEnd", "daysGuaranteed", "daysProRated", "durationWeeks", "employeeType",
		"employmentType", "fee", "flatFee", "hoursOfOperation", "hoursPerDay", "housingManagerID", "housingStatus", "invoiceGroupName",
		"jobOrder", "jobSubmission", "markupPercentage", "migrateGUID", "notes", "overtimeMarkupPercentage", "optionsPackage",
		"otExemption", "otherHourlyFee", "otherHourlyFeeComments", "overtimeRate", "payRate", "projectCodeList",
		"recruitingManagerPercentGrossMargin", "referralFee", "referralFeeType", "reportTo", "reportedMargin", "salary", "salaryUnit",
		"salesManagerPercentGrossMargin", "statementClientContact", "status", "tasks", "taxRate", "taxState", "terminationReason",
		"timeUnits", "vendorClientCorporation", "workWeekStart" })
public class Placement extends CustomFieldsD implements SearchEntity, QueryEntity, UpdateEntity, CreateEntity, HardDeleteEntity,
		FileEntity, AssociationEntity {

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

	private LinkedId jobSubmission;

	private Object migrateGUID;

	@JsonIgnore
	private String optionsPackage;

	private Integer otExemption;

	private BigDecimal otherHourlyFee;

	private BigDecimal markupPercentage;

	private OneToMany<Note> notes;

	@JsonIgnore
	private String otherHourlyFeeComments;

	private BigDecimal overtimeMarkupPercentage;

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

	public Placement() {
		super();
	}

	public Placement(Integer id) {
		super();
		this.id = id;
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

	@JsonIgnore
	public OneToMany<Appointment> getAppointments() {
		return appointments;
	}

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
	public OneToMany<PlacementChangeRequest> getChangeRequests() {
		return changeRequests;
	}

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
	public LinkedId getJobSubmission() {
		return jobSubmission;
	}

	@JsonProperty("jobSubmission")
	public void setJobSubmission(LinkedId jobSubmission) {
		this.jobSubmission = jobSubmission;
	}

	@JsonProperty("markupPercentage")
	public BigDecimal getMarkupPercentage() {
		return markupPercentage;
	}

	@JsonProperty("markupPercentage")
	public void setMarkupPercentage(BigDecimal markupPercentage) {
		this.markupPercentage = markupPercentage;
	}

	@JsonProperty("notes")
	public OneToMany<Note> getNotes() {
		return notes;
	}

	@JsonProperty("notes")
	public void setNotes(OneToMany<Note> notes) {
		this.notes = notes;
	}

	@JsonProperty("overtimeMarkupPercentage")
	public BigDecimal getOvertimeMarkupPercentage() {
		return overtimeMarkupPercentage;
	}

	@JsonProperty("overtimeMarkupPercentage")
	public void setOvertimeMarkupPercentage(BigDecimal overtimeMarkupPercentage) {
		this.overtimeMarkupPercentage = overtimeMarkupPercentage;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((appointments == null) ? 0 : appointments.hashCode());
		result = prime * result + ((approvingClientContact == null) ? 0 : approvingClientContact.hashCode());
		result = prime * result + ((backupApprovingClientContact == null) ? 0 : backupApprovingClientContact.hashCode());
		result = prime * result + ((billingClientContact == null) ? 0 : billingClientContact.hashCode());
		result = prime * result + ((billingFrequency == null) ? 0 : billingFrequency.hashCode());
		result = prime * result + ((bonusPackage == null) ? 0 : bonusPackage.hashCode());
		result = prime * result + ((candidate == null) ? 0 : candidate.hashCode());
		result = prime * result + ((changeRequests == null) ? 0 : changeRequests.hashCode());
		result = prime * result + ((clientBillRate == null) ? 0 : clientBillRate.hashCode());
		result = prime * result + ((clientOvertimeRate == null) ? 0 : clientOvertimeRate.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((commissions == null) ? 0 : commissions.hashCode());
		result = prime * result + ((costCenter == null) ? 0 : costCenter.hashCode());
		result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
		result = prime * result + ((dateBegin == null) ? 0 : dateBegin.hashCode());
		result = prime * result + ((dateClientEffective == null) ? 0 : dateClientEffective.hashCode());
		result = prime * result + ((dateEffective == null) ? 0 : dateEffective.hashCode());
		result = prime * result + ((dateEnd == null) ? 0 : dateEnd.hashCode());
		result = prime * result + ((daysGuaranteed == null) ? 0 : daysGuaranteed.hashCode());
		result = prime * result + ((daysProRated == null) ? 0 : daysProRated.hashCode());
		result = prime * result + ((durationWeeks == null) ? 0 : durationWeeks.hashCode());
		result = prime * result + ((employeeType == null) ? 0 : employeeType.hashCode());
		result = prime * result + ((employmentType == null) ? 0 : employmentType.hashCode());
		result = prime * result + ((fee == null) ? 0 : fee.hashCode());
		result = prime * result + ((flatFee == null) ? 0 : flatFee.hashCode());
		result = prime * result + ((hoursOfOperation == null) ? 0 : hoursOfOperation.hashCode());
		result = prime * result + ((hoursPerDay == null) ? 0 : hoursPerDay.hashCode());
		result = prime * result + ((housingManagerID == null) ? 0 : housingManagerID.hashCode());
		result = prime * result + ((housingStatus == null) ? 0 : housingStatus.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((invoiceGroupName == null) ? 0 : invoiceGroupName.hashCode());
		result = prime * result + ((jobOrder == null) ? 0 : jobOrder.hashCode());
		result = prime * result + ((jobSubmission == null) ? 0 : jobSubmission.hashCode());
		result = prime * result + ((markupPercentage == null) ? 0 : markupPercentage.hashCode());
		result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		result = prime * result + ((optionsPackage == null) ? 0 : optionsPackage.hashCode());
		result = prime * result + ((otExemption == null) ? 0 : otExemption.hashCode());
		result = prime * result + ((otherHourlyFee == null) ? 0 : otherHourlyFee.hashCode());
		result = prime * result + ((otherHourlyFeeComments == null) ? 0 : otherHourlyFeeComments.hashCode());
		result = prime * result + ((overtimeMarkupPercentage == null) ? 0 : overtimeMarkupPercentage.hashCode());
		result = prime * result + ((overtimeRate == null) ? 0 : overtimeRate.hashCode());
		result = prime * result + ((payRate == null) ? 0 : payRate.hashCode());
		result = prime * result + ((projectCodeList == null) ? 0 : projectCodeList.hashCode());
		result = prime * result + ((recruitingManagerPercentGrossMargin == null) ? 0 : recruitingManagerPercentGrossMargin.hashCode());
		result = prime * result + ((referralFee == null) ? 0 : referralFee.hashCode());
		result = prime * result + ((referralFeeType == null) ? 0 : referralFeeType.hashCode());
		result = prime * result + ((reportTo == null) ? 0 : reportTo.hashCode());
		result = prime * result + ((reportedMargin == null) ? 0 : reportedMargin.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result + ((salaryUnit == null) ? 0 : salaryUnit.hashCode());
		result = prime * result + ((salesManagerPercentGrossMargin == null) ? 0 : salesManagerPercentGrossMargin.hashCode());
		result = prime * result + ((statementClientContact == null) ? 0 : statementClientContact.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((tasks == null) ? 0 : tasks.hashCode());
		result = prime * result + ((taxRate == null) ? 0 : taxRate.hashCode());
		result = prime * result + ((taxState == null) ? 0 : taxState.hashCode());
		result = prime * result + ((terminationReason == null) ? 0 : terminationReason.hashCode());
		result = prime * result + ((timeUnits == null) ? 0 : timeUnits.hashCode());
		result = prime * result + ((vendorClientCorporation == null) ? 0 : vendorClientCorporation.hashCode());
		result = prime * result + ((workWeekStart == null) ? 0 : workWeekStart.hashCode());
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
		Placement other = (Placement) obj;
		if (appointments == null) {
			if (other.appointments != null)
				return false;
		} else if (!appointments.equals(other.appointments))
			return false;
		if (approvingClientContact == null) {
			if (other.approvingClientContact != null)
				return false;
		} else if (!approvingClientContact.equals(other.approvingClientContact))
			return false;
		if (backupApprovingClientContact == null) {
			if (other.backupApprovingClientContact != null)
				return false;
		} else if (!backupApprovingClientContact.equals(other.backupApprovingClientContact))
			return false;
		if (billingClientContact == null) {
			if (other.billingClientContact != null)
				return false;
		} else if (!billingClientContact.equals(other.billingClientContact))
			return false;
		if (billingFrequency == null) {
			if (other.billingFrequency != null)
				return false;
		} else if (!billingFrequency.equals(other.billingFrequency))
			return false;
		if (bonusPackage == null) {
			if (other.bonusPackage != null)
				return false;
		} else if (!bonusPackage.equals(other.bonusPackage))
			return false;
		if (candidate == null) {
			if (other.candidate != null)
				return false;
		} else if (!candidate.equals(other.candidate))
			return false;
		if (changeRequests == null) {
			if (other.changeRequests != null)
				return false;
		} else if (!changeRequests.equals(other.changeRequests))
			return false;
		if (clientBillRate == null) {
			if (other.clientBillRate != null)
				return false;
		} else if (!clientBillRate.equals(other.clientBillRate))
			return false;
		if (clientOvertimeRate == null) {
			if (other.clientOvertimeRate != null)
				return false;
		} else if (!clientOvertimeRate.equals(other.clientOvertimeRate))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (commissions == null) {
			if (other.commissions != null)
				return false;
		} else if (!commissions.equals(other.commissions))
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
		if (dateBegin == null) {
			if (other.dateBegin != null)
				return false;
		} else if (!dateBegin.equals(other.dateBegin))
			return false;
		if (dateClientEffective == null) {
			if (other.dateClientEffective != null)
				return false;
		} else if (!dateClientEffective.equals(other.dateClientEffective))
			return false;
		if (dateEffective == null) {
			if (other.dateEffective != null)
				return false;
		} else if (!dateEffective.equals(other.dateEffective))
			return false;
		if (dateEnd == null) {
			if (other.dateEnd != null)
				return false;
		} else if (!dateEnd.equals(other.dateEnd))
			return false;
		if (daysGuaranteed == null) {
			if (other.daysGuaranteed != null)
				return false;
		} else if (!daysGuaranteed.equals(other.daysGuaranteed))
			return false;
		if (daysProRated == null) {
			if (other.daysProRated != null)
				return false;
		} else if (!daysProRated.equals(other.daysProRated))
			return false;
		if (durationWeeks == null) {
			if (other.durationWeeks != null)
				return false;
		} else if (!durationWeeks.equals(other.durationWeeks))
			return false;
		if (employeeType == null) {
			if (other.employeeType != null)
				return false;
		} else if (!employeeType.equals(other.employeeType))
			return false;
		if (employmentType == null) {
			if (other.employmentType != null)
				return false;
		} else if (!employmentType.equals(other.employmentType))
			return false;
		if (fee == null) {
			if (other.fee != null)
				return false;
		} else if (!fee.equals(other.fee))
			return false;
		if (flatFee == null) {
			if (other.flatFee != null)
				return false;
		} else if (!flatFee.equals(other.flatFee))
			return false;
		if (hoursOfOperation == null) {
			if (other.hoursOfOperation != null)
				return false;
		} else if (!hoursOfOperation.equals(other.hoursOfOperation))
			return false;
		if (hoursPerDay == null) {
			if (other.hoursPerDay != null)
				return false;
		} else if (!hoursPerDay.equals(other.hoursPerDay))
			return false;
		if (housingManagerID == null) {
			if (other.housingManagerID != null)
				return false;
		} else if (!housingManagerID.equals(other.housingManagerID))
			return false;
		if (housingStatus == null) {
			if (other.housingStatus != null)
				return false;
		} else if (!housingStatus.equals(other.housingStatus))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (invoiceGroupName == null) {
			if (other.invoiceGroupName != null)
				return false;
		} else if (!invoiceGroupName.equals(other.invoiceGroupName))
			return false;
		if (jobOrder == null) {
			if (other.jobOrder != null)
				return false;
		} else if (!jobOrder.equals(other.jobOrder))
			return false;
		if (jobSubmission == null) {
			if (other.jobSubmission != null)
				return false;
		} else if (!jobSubmission.equals(other.jobSubmission))
			return false;
		if (markupPercentage == null) {
			if (other.markupPercentage != null)
				return false;
		} else if (!markupPercentage.equals(other.markupPercentage))
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
		if (optionsPackage == null) {
			if (other.optionsPackage != null)
				return false;
		} else if (!optionsPackage.equals(other.optionsPackage))
			return false;
		if (otExemption == null) {
			if (other.otExemption != null)
				return false;
		} else if (!otExemption.equals(other.otExemption))
			return false;
		if (otherHourlyFee == null) {
			if (other.otherHourlyFee != null)
				return false;
		} else if (!otherHourlyFee.equals(other.otherHourlyFee))
			return false;
		if (otherHourlyFeeComments == null) {
			if (other.otherHourlyFeeComments != null)
				return false;
		} else if (!otherHourlyFeeComments.equals(other.otherHourlyFeeComments))
			return false;
		if (overtimeMarkupPercentage == null) {
			if (other.overtimeMarkupPercentage != null)
				return false;
		} else if (!overtimeMarkupPercentage.equals(other.overtimeMarkupPercentage))
			return false;
		if (overtimeRate == null) {
			if (other.overtimeRate != null)
				return false;
		} else if (!overtimeRate.equals(other.overtimeRate))
			return false;
		if (payRate == null) {
			if (other.payRate != null)
				return false;
		} else if (!payRate.equals(other.payRate))
			return false;
		if (projectCodeList == null) {
			if (other.projectCodeList != null)
				return false;
		} else if (!projectCodeList.equals(other.projectCodeList))
			return false;
		if (recruitingManagerPercentGrossMargin == null) {
			if (other.recruitingManagerPercentGrossMargin != null)
				return false;
		} else if (!recruitingManagerPercentGrossMargin.equals(other.recruitingManagerPercentGrossMargin))
			return false;
		if (referralFee == null) {
			if (other.referralFee != null)
				return false;
		} else if (!referralFee.equals(other.referralFee))
			return false;
		if (referralFeeType == null) {
			if (other.referralFeeType != null)
				return false;
		} else if (!referralFeeType.equals(other.referralFeeType))
			return false;
		if (reportTo == null) {
			if (other.reportTo != null)
				return false;
		} else if (!reportTo.equals(other.reportTo))
			return false;
		if (reportedMargin == null) {
			if (other.reportedMargin != null)
				return false;
		} else if (!reportedMargin.equals(other.reportedMargin))
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
		if (salesManagerPercentGrossMargin == null) {
			if (other.salesManagerPercentGrossMargin != null)
				return false;
		} else if (!salesManagerPercentGrossMargin.equals(other.salesManagerPercentGrossMargin))
			return false;
		if (statementClientContact == null) {
			if (other.statementClientContact != null)
				return false;
		} else if (!statementClientContact.equals(other.statementClientContact))
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
		if (taxState == null) {
			if (other.taxState != null)
				return false;
		} else if (!taxState.equals(other.taxState))
			return false;
		if (terminationReason == null) {
			if (other.terminationReason != null)
				return false;
		} else if (!terminationReason.equals(other.terminationReason))
			return false;
		if (timeUnits == null) {
			if (other.timeUnits != null)
				return false;
		} else if (!timeUnits.equals(other.timeUnits))
			return false;
		if (vendorClientCorporation == null) {
			if (other.vendorClientCorporation != null)
				return false;
		} else if (!vendorClientCorporation.equals(other.vendorClientCorporation))
			return false;
		if (workWeekStart == null) {
			if (other.workWeekStart != null)
				return false;
		} else if (!workWeekStart.equals(other.workWeekStart))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getName());
		builder.append(" {\n\tid: ");
		builder.append(id);
		builder.append("\n\tappointments: ");
		builder.append(appointments);
		builder.append("\n\tapprovingClientContact: ");
		builder.append(approvingClientContact);
		builder.append("\n\tbackupApprovingClientContact: ");
		builder.append(backupApprovingClientContact);
		builder.append("\n\tbillingClientContact: ");
		builder.append(billingClientContact);
		builder.append("\n\tbillingFrequency: ");
		builder.append(billingFrequency);
		builder.append("\n\tbonusPackage: ");
		builder.append(bonusPackage);
		builder.append("\n\tcandidate: ");
		builder.append(candidate);
		builder.append("\n\tchangeRequests: ");
		builder.append(changeRequests);
		builder.append("\n\tclientBillRate: ");
		builder.append(clientBillRate);
		builder.append("\n\tclientOvertimeRate: ");
		builder.append(clientOvertimeRate);
		builder.append("\n\tcomments: ");
		builder.append(comments);
		builder.append("\n\tcommissions: ");
		builder.append(commissions);
		builder.append("\n\tcostCenter: ");
		builder.append(costCenter);
		builder.append("\n\tdateAdded: ");
		builder.append(dateAdded);
		builder.append("\n\tdateBegin: ");
		builder.append(dateBegin);
		builder.append("\n\tdateClientEffective: ");
		builder.append(dateClientEffective);
		builder.append("\n\tdateEffective: ");
		builder.append(dateEffective);
		builder.append("\n\tdateEnd: ");
		builder.append(dateEnd);
		builder.append("\n\tdaysGuaranteed: ");
		builder.append(daysGuaranteed);
		builder.append("\n\tdaysProRated: ");
		builder.append(daysProRated);
		builder.append("\n\tdurationWeeks: ");
		builder.append(durationWeeks);
		builder.append("\n\temployeeType: ");
		builder.append(employeeType);
		builder.append("\n\temploymentType: ");
		builder.append(employmentType);
		builder.append("\n\tfee: ");
		builder.append(fee);
		builder.append("\n\tflatFee: ");
		builder.append(flatFee);
		builder.append("\n\thoursOfOperation: ");
		builder.append(hoursOfOperation);
		builder.append("\n\thoursPerDay: ");
		builder.append(hoursPerDay);
		builder.append("\n\thousingManagerID: ");
		builder.append(housingManagerID);
		builder.append("\n\thousingStatus: ");
		builder.append(housingStatus);
		builder.append("\n\tinvoiceGroupName: ");
		builder.append(invoiceGroupName);
		builder.append("\n\tjobOrder: ");
		builder.append(jobOrder);
		builder.append("\n\tjobSubmission: ");
		builder.append(jobSubmission);
		builder.append("\n\tmigrateGUID: ");
		builder.append(migrateGUID);
		builder.append("\n\toptionsPackage: ");
		builder.append(optionsPackage);
		builder.append("\n\totExemption: ");
		builder.append(otExemption);
		builder.append("\n\totherHourlyFee: ");
		builder.append(otherHourlyFee);
		builder.append("\n\tmarkupPercentage: ");
		builder.append(markupPercentage);
		builder.append("\n\tnotes: ");
		builder.append(notes);
		builder.append("\n\totherHourlyFeeComments: ");
		builder.append(otherHourlyFeeComments);
		builder.append("\n\tovertimeMarkupPercentage: ");
		builder.append(overtimeMarkupPercentage);
		builder.append("\n\tovertimeRate: ");
		builder.append(overtimeRate);
		builder.append("\n\tpayRate: ");
		builder.append(payRate);
		builder.append("\n\tprojectCodeList: ");
		builder.append(projectCodeList);
		builder.append("\n\trecruitingManagerPercentGrossMargin: ");
		builder.append(recruitingManagerPercentGrossMargin);
		builder.append("\n\treferralFee: ");
		builder.append(referralFee);
		builder.append("\n\treferralFeeType: ");
		builder.append(referralFeeType);
		builder.append("\n\treportTo: ");
		builder.append(reportTo);
		builder.append("\n\treportedMargin: ");
		builder.append(reportedMargin);
		builder.append("\n\tsalary: ");
		builder.append(salary);
		builder.append("\n\tsalaryUnit: ");
		builder.append(salaryUnit);
		builder.append("\n\tsalesManagerPercentGrossMargin: ");
		builder.append(salesManagerPercentGrossMargin);
		builder.append("\n\tstatementClientContact: ");
		builder.append(statementClientContact);
		builder.append("\n\tstatus: ");
		builder.append(status);
		builder.append("\n\ttasks: ");
		builder.append(tasks);
		builder.append("\n\ttaxRate: ");
		builder.append(taxRate);
		builder.append("\n\ttaxState: ");
		builder.append(taxState);
		builder.append("\n\tterminationReason: ");
		builder.append(terminationReason);
		builder.append("\n\ttimeUnits: ");
		builder.append(timeUnits);
		builder.append("\n\tvendorClientCorporation: ");
		builder.append(vendorClientCorporation);
		builder.append("\n\tworkWeekStart: ");
		builder.append(workWeekStart);
		builder.append("\n}");
		return builder.toString();
	}

}
