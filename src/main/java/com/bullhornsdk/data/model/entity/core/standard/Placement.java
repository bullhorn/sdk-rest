package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.api.helper.RestOneToManySerializer;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance9;
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
import com.bullhornsdk.data.model.response.file.standard.StandardFileAttachment;
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
		"billingFrequency", "bonusPackage", "branch", "candidate", "placementCertifications", "changeRequests", "clientBillRate", "clientOvertimeRate",
        "comments", "commissions", "correlatedCustomDate1", "correlatedCustomDate2", "correlatedCustomDate3", "correlatedCustomFloat1",
		"correlatedCustomFloat2", "correlatedCustomFloat3", "correlatedCustomInt1", "correlatedCustomInt2", "correlatedCustomInt3",
		"correlatedCustomText1", "correlatedCustomText10", "correlatedCustomText2", "correlatedCustomText3", "correlatedCustomText4",
		"correlatedCustomText5", "correlatedCustomText6", "correlatedCustomText7", "correlatedCustomText8", "correlatedCustomText9",
		"correlatedCustomTextBlock1", "correlatedCustomTextBlock2", "correlatedCustomTextBlock3", "costCenter", "customBillRate1",
		"customBillRate10", "customBillRate2", "customBillRate3", "customBillRate4", "customBillRate5", "customBillRate6",
		"customBillRate7", "customBillRate8", "customBillRate9", "customDate1", "customDate10","customDate11", "customDate12", "customDate13",
        "customDate2", "customDate3", "customDate4", "customDate5", "customDate6", "customDate7", "customDate8", "customDate9", "customEncryptedText1",
        "customEncryptedText2", "customEncryptedText3", "customEncryptedText4", "customEncryptedText5", "customEncryptedText6", "customEncryptedText7",
        "customEncryptedText8", "customEncryptedText9",  "customEncryptedText10", "customFloat1", "customFloat10", "customFloat11","customFloat12",
        "customFloat13", "customFloat14", "customFloat15", "customFloat16", "customFloat17", "customFloat18", "customFloat19", "customFloat2",
        "customFloat20", "customFloat21", "customFloat22", "customFloat23", "customFloat3", "customFloat4", "customFloat5", "customFloat6",
        "customFloat7", "customFloat8", "customFloat9","customInt1", "customInt10", "customInt11", "customInt12", "customInt13", "customInt14",
        "customInt15", "customInt16", "customInt17", "customInt18", "customInt19", "customInt2", "customInt20", "customInt21", "customInt22", "customInt23",
        "customInt3", "customInt4", "customInt5", "customInt6", "customInt7", "customInt8", "customInt9", "customPayRate1", "customPayRate10", "customPayRate2",
		"customPayRate3", "customPayRate4", "customPayRate5", "customPayRate6", "customPayRate7", "customPayRate8", "customPayRate9",
		"customText1", "customText10", "customText11", "customText12", "customText13", "customText14", "customText15", "customText16",
		"customText17", "customText18", "customText19", "customText2", "customText20", "customText21", "customText22", "customText23",
		"customText24", "customText25", "customText26", "customText27", "customText28", "customText29", "customText3", "customText30",
		"customText31", "customText32", "customText33", "customText34", "customText35", "customText36", "customText37", "customText38",
		"customText39", "customText4", "customText40", "customText41", "customText42", "customText43", "customText44", "customText45", "customText46",
        "customText47", "customText48", "customText49", "customText5", "customText51", "customText52", "customText53", "customText54", "customText55",
        "customText56", "customText57", "customText58", "customText59", "customText6", "customText60", "customText7", "customText8", "customText9",
        "customTextBlock1", "customTextBlock10", "customTextBlock2", "customTextBlock3", "customTextBlock4", "customTextBlock5",
        "customTextBlock6", "customTextBlock7", "customTextBlock8", "customTextBlock9", "dateAdded", "dateBegin",
		"dateClientEffective", "dateEffective", "dateEnd", "dateLastModified", "daysGuaranteed", "daysProRated", "durationWeeks", "employeeType",
		"employmentType", "fee", "flatFee", "fileAttachments", "hoursOfOperation", "hoursPerDay", "housingManagerID", "housingStatus", "invoiceGroupName",
		"jobOrder", "jobSubmission", "markUpPercentage", "migrateGUID", "notes", "overtimeMarkUpPercentage", "optionsPackage",
		"otExemption", "otherHourlyFee", "otherHourlyFeeComments", "overtimeRate", "payRate", "projectCodeList",
		"recruitingManagerPercentGrossMargin", "referralFee", "referralFeeType", "reportTo", "reportedMargin", "salary", "salaryUnit",
		"salesManagerPercentGrossMargin", "statementClientContact", "status", "tasks", "taxRate", "taxState", "terminationReason",
		"timeUnits", "vendorClientCorporation", "workWeekStart", "workersCompensationRate", "customObject1s", "customObject2s", "customObject3s", "customObject4s",
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

	private Branch branch;

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

    private OneToMany<StandardFileAttachment> fileAttachments;

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

	private BigDecimal reportedMargin;

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

	private WorkersCompensationRate workersCompensationRate;

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

	@JsonProperty("branch")
    public Branch getBranch() {
        return branch;
    }

    @JsonProperty("branch")
    public void setBranch(Branch branch) {
        this.branch = branch;
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
	public BigDecimal getReportedMargin() {
		return reportedMargin;
	}

	@JsonProperty("reportedMargin")
	public void setReportedMargin(BigDecimal reportedMargin) {
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

	@JsonProperty("workersCompensationRate")
    public WorkersCompensationRate getWorkersCompensationRate() {
	    return workersCompensationRate;
	}

	@JsonProperty("workersCompensationRate")
    public void setWorkersCompensationRate(WorkersCompensationRate workersCompensationRate) {
	    this.workersCompensationRate = workersCompensationRate;
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
        if (branch != null ? !branch.equals(placement.branch) : placement.branch != null) return false;
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
        if (fileAttachments != null ? !fileAttachments.equals(placement.fileAttachments) : placement.fileAttachments != null)
            return false;
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
        if (workersCompensationRate != null ? !workersCompensationRate.equals(placement.workersCompensationRate) : placement.workersCompensationRate != null)
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
        return customObject10s != null ? customObject10s.equals(placement.customObject10s) : placement.customObject10s == null;
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
        result = 31 * result + (branch != null ? branch.hashCode() : 0);
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
        result = 31 * result + (fileAttachments != null ? fileAttachments.hashCode() : 0);
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
        result = 31 * result + (workersCompensationRate != null ? workersCompensationRate.hashCode() : 0);
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
    public String toStringNonNull(boolean includeLineBreaks) {
        String lbc = ", ";
        if(includeLineBreaks)
            lbc = ",\n ";
        final StringBuilder sb = new StringBuilder("Placement { ");
        if(id != null){
            sb.append("id=").append(id);
        }
        if(appointments != null){
            sb.append(lbc + "appointments=").append(appointments.toStringNonNull(includeLineBreaks));
        }
        if(approvingClientContact != null){
            sb.append(lbc + "approvingClientContact=").append(approvingClientContact.toStringNonNull(includeLineBreaks));
        }
        if(backupApprovingClientContact != null){
            sb.append(lbc + "backupApprovingClientContact=").append(backupApprovingClientContact.toStringNonNull(includeLineBreaks));
        }
        if(billingClientContact != null){
            sb.append(lbc + "billingClientContact=").append(billingClientContact.toStringNonNull(includeLineBreaks));
        }
        if(billingFrequency != null){
            sb.append(lbc + "billingFrequency=").append(billingFrequency);
        }
        if(bonusPackage != null){
            sb.append(lbc + "bonusPackage=").append(bonusPackage);
        }
        if(branch != null){
            sb.append(lbc + "branch=").append(branch.toStringNonNull(includeLineBreaks));
        }
        if(candidate != null){
            sb.append(lbc + "candidate=").append(candidate.toStringNonNull(includeLineBreaks));
        }
        if(placementCertifications != null){
            sb.append(lbc + "placementCertifications=").append(placementCertifications);
        }
        if(changeRequests != null){
            sb.append(lbc + "changeRequests=").append(changeRequests.toStringNonNull(includeLineBreaks));
        }
        if(clientBillRate != null){
            sb.append(lbc + "clientBillRate=").append(clientBillRate);
        }
        if(clientOvertimeRate != null){
            sb.append(lbc + "clientOvertimeRate=").append(clientOvertimeRate);
        }
        if(comments != null){
            sb.append(lbc + "comments=").append(comments);
        }
        if(commissions != null){
            sb.append(lbc + "commissions=").append(commissions.toStringNonNull(includeLineBreaks));
        }
        if(costCenter != null){
            sb.append(lbc + "costCenter=").append(costCenter);
        }
        if(dateAdded != null){
            sb.append(lbc + "dateAdded=").append(dateAdded);
        }
        if(dateBegin != null){
            sb.append(lbc + "dateBegin=").append(dateBegin);
        }
        if(dateClientEffective != null){
            sb.append(lbc + "dateClientEffective=").append(dateClientEffective);
        }
        if(dateEffective != null){
            sb.append(lbc + "dateEffective=").append(dateEffective);
        }
        if(dateEnd != null){
            sb.append(lbc + "dateEnd=").append(dateEnd);
        }
        if(dateLastModified != null){
            sb.append(lbc + "dateLastModified=").append(dateLastModified);
        }
        if(daysGuaranteed != null){
            sb.append(lbc + "daysGuaranteed=").append(daysGuaranteed);
        }
        if(daysProRated != null){
            sb.append(lbc + "daysProRated=").append(daysProRated);
        }
        if(durationWeeks != null){
            sb.append(lbc + "durationWeeks=").append(durationWeeks);
        }
        if(employeeType != null){
            sb.append(lbc + "employeeType=").append(employeeType);
        }
        if(employmentType != null){
            sb.append(lbc + "employmentType=").append(employmentType);
        }
        if(fee != null){
            sb.append(lbc + "fee=").append(fee);
        }
        if(flatFee != null){
            sb.append(lbc + "flatFee=").append(flatFee);
        }
        if(fileAttachments != null){
            sb.append(lbc + "fileAttachments=").append(fileAttachments.toStringNonNull(includeLineBreaks));
        }
        if(hoursOfOperation != null){
            sb.append(lbc + "hoursOfOperation=").append(hoursOfOperation);
        }
        if(hoursPerDay != null){
            sb.append(lbc + "hoursPerDay=").append(hoursPerDay);
        }
        if(housingManagerID != null){
            sb.append(lbc + "housingManagerID=").append(housingManagerID);
        }
        if(housingStatus != null){
            sb.append(lbc + "housingStatus=").append(housingStatus);
        }
        if(invoiceGroupName != null){
            sb.append(lbc + "invoiceGroupName=").append(invoiceGroupName);
        }
        if(jobOrder != null){
            sb.append(lbc + "jobOrder=").append(jobOrder.toStringNonNull(includeLineBreaks));
        }
        if(jobSubmission != null){
            sb.append(lbc + "jobSubmission=").append(jobSubmission.toStringNonNull(includeLineBreaks));
        }
        if(migrateGUID != null){
            sb.append(lbc + "migrateGUID=").append(migrateGUID);
        }
        if(optionsPackage != null){
            sb.append(lbc + "optionsPackage=").append(optionsPackage);
        }
        if(otExemption != null){
            sb.append(lbc + "otExemption=").append(otExemption);
        }
        if(otherHourlyFee != null){
            sb.append(lbc + "otherHourlyFee=").append(otherHourlyFee);
        }
        if(markUpPercentage != null){
            sb.append(lbc + "markUpPercentage=").append(markUpPercentage);
        }
        if(notes != null){
            sb.append(lbc + "notes=").append(notes.toStringNonNull(includeLineBreaks));
        }
        if(otherHourlyFeeComments != null){
            sb.append(lbc + "otherHourlyFeeComments=").append(otherHourlyFeeComments);
        }
        if(overtimeMarkUpPercentage != null){
            sb.append(lbc + "overtimeMarkUpPercentage=").append(overtimeMarkUpPercentage);
        }
        if(overtimeRate != null){
            sb.append(lbc + "overtimeRate=").append(overtimeRate);
        }
        if(payRate != null){
            sb.append(lbc + "payRate=").append(payRate);
        }
        if(projectCodeList != null){
            sb.append(lbc + "projectCodeList=").append(projectCodeList);
        }
        if(recruitingManagerPercentGrossMargin != null){
            sb.append(lbc + "recruitingManagerPercentGrossMargin=").append(recruitingManagerPercentGrossMargin);
        }
        if(referralFee != null){
            sb.append(lbc + "referralFee=").append(referralFee);
        }
        if(referralFeeType != null){
            sb.append(lbc + "referralFeeType=").append(referralFeeType);
        }
        if(reportTo != null){
            sb.append(lbc + "reportTo=").append(reportTo);
        }
        if(reportedMargin != null){
            sb.append(lbc + "reportedMargin=").append(reportedMargin);
        }
        if(salary != null){
            sb.append(lbc + "salary=").append(salary);
        }
        if(salaryUnit != null){
            sb.append(lbc + "salaryUnit=").append(salaryUnit);
        }
        if(salesManagerPercentGrossMargin != null){
            sb.append(lbc + "salesManagerPercentGrossMargin=").append(salesManagerPercentGrossMargin);
        }
        if(statementClientContact != null){
            sb.append(lbc + "statementClientContact=").append(statementClientContact.toStringNonNull(includeLineBreaks));
        }
        if(status != null){
            sb.append(lbc + "status=").append(status);
        }
        if(tasks != null){
            sb.append(lbc + "tasks=").append(tasks.toStringNonNull(includeLineBreaks));
        }
        if(taxRate != null){
            sb.append(lbc + "taxRate=").append(taxRate);
        }
        if(taxState != null){
            sb.append(lbc + "taxState=").append(taxState);
        }
        if(terminationReason != null){
            sb.append(lbc + "terminationReason=").append(terminationReason);
        }
        if(timeUnits != null){
            sb.append(lbc + "timeUnits=").append(timeUnits);
        }
        if(vendorClientCorporation != null){
            sb.append(lbc + "vendorClientCorporation=").append(vendorClientCorporation.toStringNonNull(includeLineBreaks));
        }
        if(workWeekStart != null){
            sb.append(lbc + "workWeekStart=").append(workWeekStart);
        }
        if(workersCompensationRate != null){
            sb.append(lbc + "workersCompensationRate=").append(workersCompensationRate.toStringNonNull(includeLineBreaks));
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
        if(includeLineBreaks)
            sb.append("\n");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toStringNonNull() {
        String lbc = ", ";
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() + " { ");
        if(id != null){
            sb.append("id=").append(id);
        }
        if(appointments != null){
            sb.append(lbc + "appointments=").append(appointments.toStringNonNull());
        }
        if(approvingClientContact != null){
            sb.append(lbc + "approvingClientContact=").append(approvingClientContact.toStringNonNull());
        }
        if(backupApprovingClientContact != null){
            sb.append(lbc + "backupApprovingClientContact=").append(backupApprovingClientContact.toStringNonNull());
        }
        if(billingClientContact != null){
            sb.append(lbc + "billingClientContact=").append(billingClientContact.toStringNonNull());
        }
        if(billingFrequency != null){
            sb.append(lbc + "billingFrequency=").append(billingFrequency);
        }
        if(bonusPackage != null){
            sb.append(lbc + "bonusPackage=").append(bonusPackage);
        }
        if(branch != null){
            sb.append(lbc + "branch=").append(branch.toStringNonNull());
        }
        if(candidate != null){
            sb.append(lbc + "candidate=").append(candidate.toStringNonNull());
        }
        if(placementCertifications != null){
            sb.append(lbc + "placementCertifications=").append(placementCertifications);
        }
        if(changeRequests != null){
            sb.append(lbc + "changeRequests=").append(changeRequests.toStringNonNull());
        }
        if(clientBillRate != null){
            sb.append(lbc + "clientBillRate=").append(clientBillRate);
        }
        if(clientOvertimeRate != null){
            sb.append(lbc + "clientOvertimeRate=").append(clientOvertimeRate);
        }
        if(comments != null){
            sb.append(lbc + "comments=").append(comments);
        }
        if(commissions != null){
            sb.append(lbc + "commissions=").append(commissions.toStringNonNull());
        }
        if(costCenter != null){
            sb.append(lbc + "costCenter=").append(costCenter);
        }
        if(dateAdded != null){
            sb.append(lbc + "dateAdded=").append(dateAdded);
        }
        if(dateBegin != null){
            sb.append(lbc + "dateBegin=").append(dateBegin);
        }
        if(dateClientEffective != null){
            sb.append(lbc + "dateClientEffective=").append(dateClientEffective);
        }
        if(dateEffective != null){
            sb.append(lbc + "dateEffective=").append(dateEffective);
        }
        if(dateEnd != null){
            sb.append(lbc + "dateEnd=").append(dateEnd);
        }
        if(dateLastModified != null){
            sb.append(lbc + "dateLastModified=").append(dateLastModified);
        }
        if(daysGuaranteed != null){
            sb.append(lbc + "daysGuaranteed=").append(daysGuaranteed);
        }
        if(daysProRated != null){
            sb.append(lbc + "daysProRated=").append(daysProRated);
        }
        if(durationWeeks != null){
            sb.append(lbc + "durationWeeks=").append(durationWeeks);
        }
        if(employeeType != null){
            sb.append(lbc + "employeeType=").append(employeeType);
        }
        if(employmentType != null){
            sb.append(lbc + "employmentType=").append(employmentType);
        }
        if(fee != null){
            sb.append(lbc + "fee=").append(fee);
        }
        if(flatFee != null){
            sb.append(lbc + "flatFee=").append(flatFee);
        }
        if(fileAttachments != null){
            sb.append(lbc + "fileAttachments=").append(fileAttachments.toStringNonNull());
        }
        if(hoursOfOperation != null){
            sb.append(lbc + "hoursOfOperation=").append(hoursOfOperation);
        }
        if(hoursPerDay != null){
            sb.append(lbc + "hoursPerDay=").append(hoursPerDay);
        }
        if(housingManagerID != null){
            sb.append(lbc + "housingManagerID=").append(housingManagerID);
        }
        if(housingStatus != null){
            sb.append(lbc + "housingStatus=").append(housingStatus);
        }
        if(invoiceGroupName != null){
            sb.append(lbc + "invoiceGroupName=").append(invoiceGroupName);
        }
        if(jobOrder != null){
            sb.append(lbc + "jobOrder=").append(jobOrder.toStringNonNull());
        }
        if(jobSubmission != null){
            sb.append(lbc + "jobSubmission=").append(jobSubmission.toStringNonNull());
        }
        if(migrateGUID != null){
            sb.append(lbc + "migrateGUID=").append(migrateGUID);
        }
        if(optionsPackage != null){
            sb.append(lbc + "optionsPackage=").append(optionsPackage);
        }
        if(otExemption != null){
            sb.append(lbc + "otExemption=").append(otExemption);
        }
        if(otherHourlyFee != null){
            sb.append(lbc + "otherHourlyFee=").append(otherHourlyFee);
        }
        if(markUpPercentage != null){
            sb.append(lbc + "markUpPercentage=").append(markUpPercentage);
        }
        if(notes != null){
            sb.append(lbc + "notes=").append(notes.toStringNonNull());
        }
        if(otherHourlyFeeComments != null){
            sb.append(lbc + "otherHourlyFeeComments=").append(otherHourlyFeeComments);
        }
        if(overtimeMarkUpPercentage != null){
            sb.append(lbc + "overtimeMarkUpPercentage=").append(overtimeMarkUpPercentage);
        }
        if(overtimeRate != null){
            sb.append(lbc + "overtimeRate=").append(overtimeRate);
        }
        if(payRate != null){
            sb.append(lbc + "payRate=").append(payRate);
        }
        if(projectCodeList != null){
            sb.append(lbc + "projectCodeList=").append(projectCodeList);
        }
        if(recruitingManagerPercentGrossMargin != null){
            sb.append(lbc + "recruitingManagerPercentGrossMargin=").append(recruitingManagerPercentGrossMargin);
        }
        if(referralFee != null){
            sb.append(lbc + "referralFee=").append(referralFee);
        }
        if(referralFeeType != null){
            sb.append(lbc + "referralFeeType=").append(referralFeeType);
        }
        if(reportTo != null){
            sb.append(lbc + "reportTo=").append(reportTo);
        }
        if(reportedMargin != null){
            sb.append(lbc + "reportedMargin=").append(reportedMargin);
        }
        if(salary != null){
            sb.append(lbc + "salary=").append(salary);
        }
        if(salaryUnit != null){
            sb.append(lbc + "salaryUnit=").append(salaryUnit);
        }
        if(salesManagerPercentGrossMargin != null){
            sb.append(lbc + "salesManagerPercentGrossMargin=").append(salesManagerPercentGrossMargin);
        }
        if(statementClientContact != null){
            sb.append(lbc + "statementClientContact=").append(statementClientContact.toStringNonNull());
        }
        if(status != null){
            sb.append(lbc + "status=").append(status);
        }
        if(tasks != null){
            sb.append(lbc + "tasks=").append(tasks.toStringNonNull());
        }
        if(taxRate != null){
            sb.append(lbc + "taxRate=").append(taxRate);
        }
        if(taxState != null){
            sb.append(lbc + "taxState=").append(taxState);
        }
        if(terminationReason != null){
            sb.append(lbc + "terminationReason=").append(terminationReason);
        }
        if(timeUnits != null){
            sb.append(lbc + "timeUnits=").append(timeUnits);
        }
        if(vendorClientCorporation != null){
            sb.append(lbc + "vendorClientCorporation=").append(vendorClientCorporation.toStringNonNull());
        }
        if(workWeekStart != null){
            sb.append(lbc + "workWeekStart=").append(workWeekStart);
        }
        if(workersCompensationRate != null){
            sb.append(lbc + "workersCompensationRate=").append(workersCompensationRate.toStringNonNull());
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
    public String toString() {
        final StringBuilder sb = new StringBuilder("Placement{");
        sb.append("id=").append(id);
        sb.append(", appointments=").append(appointments);
        sb.append(", approvingClientContact=").append(approvingClientContact);
        sb.append(", backupApprovingClientContact=").append(backupApprovingClientContact);
        sb.append(", billingClientContact=").append(billingClientContact);
        sb.append(", billingFrequency=").append(billingFrequency);
        sb.append(", bonusPackage=").append(bonusPackage);
        sb.append(", branch=").append(branch);
        sb.append(", candidate=").append(candidate);
        sb.append(", placementCertifications=").append(placementCertifications);
        sb.append(", changeRequests=").append(changeRequests);
        sb.append(", clientBillRate=").append(clientBillRate);
        sb.append(", clientOvertimeRate=").append(clientOvertimeRate);
        sb.append(", comments=").append(comments);
        sb.append(", commissions=").append(commissions);
        sb.append(", costCenter=").append(costCenter);
        sb.append(", dateAdded=").append(dateAdded);
        sb.append(", dateBegin=").append(dateBegin);
        sb.append(", dateClientEffective=").append(dateClientEffective);
        sb.append(", dateEffective=").append(dateEffective);
        sb.append(", dateEnd=").append(dateEnd);
        sb.append(", dateLastModified=").append(dateLastModified);
        sb.append(", daysGuaranteed=").append(daysGuaranteed);
        sb.append(", daysProRated=").append(daysProRated);
        sb.append(", durationWeeks=").append(durationWeeks);
        sb.append(", employeeType=").append(employeeType);
        sb.append(", employmentType=").append(employmentType);
        sb.append(", fee=").append(fee);
        sb.append(", flatFee=").append(flatFee);
        sb.append(", fileAttachments=").append(fileAttachments);
        sb.append(", hoursOfOperation=").append(hoursOfOperation);
        sb.append(", hoursPerDay=").append(hoursPerDay);
        sb.append(", housingManagerID=").append(housingManagerID);
        sb.append(", housingStatus=").append(housingStatus);
        sb.append(", invoiceGroupName=").append(invoiceGroupName);
        sb.append(", jobOrder=").append(jobOrder);
        sb.append(", jobSubmission=").append(jobSubmission);
        sb.append(", migrateGUID=").append(migrateGUID);
        sb.append(", optionsPackage=").append(optionsPackage);
        sb.append(", otExemption=").append(otExemption);
        sb.append(", otherHourlyFee=").append(otherHourlyFee);
        sb.append(", markUpPercentage=").append(markUpPercentage);
        sb.append(", notes=").append(notes);
        sb.append(", otherHourlyFeeComments=").append(otherHourlyFeeComments);
        sb.append(", overtimeMarkUpPercentage=").append(overtimeMarkUpPercentage);
        sb.append(", overtimeRate=").append(overtimeRate);
        sb.append(", payRate=").append(payRate);
        sb.append(", projectCodeList=").append(projectCodeList);
        sb.append(", recruitingManagerPercentGrossMargin=").append(recruitingManagerPercentGrossMargin);
        sb.append(", referralFee=").append(referralFee);
        sb.append(", referralFeeType=").append(referralFeeType);
        sb.append(", reportTo=").append(reportTo);
        sb.append(", reportedMargin=").append(reportedMargin);
        sb.append(", salary=").append(salary);
        sb.append(", salaryUnit=").append(salaryUnit);
        sb.append(", salesManagerPercentGrossMargin=").append(salesManagerPercentGrossMargin);
        sb.append(", statementClientContact=").append(statementClientContact);
        sb.append(", status=").append(status);
        sb.append(", tasks=").append(tasks);
        sb.append(", taxRate=").append(taxRate);
        sb.append(", taxState=").append(taxState);
        sb.append(", terminationReason=").append(terminationReason);
        sb.append(", timeUnits=").append(timeUnits);
        sb.append(", vendorClientCorporation=").append(vendorClientCorporation);
        sb.append(", workWeekStart=").append(workWeekStart);
        sb.append(", workersCompensationRate=").append(workersCompensationRate);
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
