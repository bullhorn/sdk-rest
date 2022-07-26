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
import com.bullhornsdk.data.model.entity.core.onboarding.OnboardingReceivedSent;
import com.bullhornsdk.data.model.entity.core.paybill.BillingProfile;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.*;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
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
import com.bullhornsdk.data.model.entity.core.paybill.Location;
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
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "appointments", "approvingClientContact", "backupApprovingClientContact", "billingClientContact",
		"billingFrequency", "billingProfile", "bonusPackage", "branch", "bteSyncStatus", "candidate", "placementCertifications", "changeRequests", "clientBillRate", "clientOvertimeRate",
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
		"employmentType", "fee", "flatFee", "fileAttachments", "generalLedgerSegment1", "generalLedgerSegment2", "generalLedgerSegment3", "generalLedgerSegment4",
        "generalLedgerSegment5", "hoursOfOperation", "hoursPerDay", "housingManagerID", "housingStatus", "invoiceGroupName",
		"jobOrder", "jobSubmission", "lastBteSyncDate", "markUpPercentage", "migrateGUID", "notes", "overtimeMarkUpPercentage", "optionsPackage",
        "onboardingDocumentReceivedCount", "onboardingDocumentSentCount", "onboardingPercentComplete", "onboardingReceivedSent", "onboardingStatus",
		"otExemption", "otherHourlyFee", "otherHourlyFeeComments", "overtimeRate", "payRate", "projectCodeList",
		"recruitingManagerPercentGrossMargin", "referralFee", "referralFeeType", "reportTo", "reportedMargin", "salary", "salaryUnit",
		"salesManagerPercentGrossMargin", "statementClientContact", "status", "tasks", "taxRate", "taxState", "terminationReason",
		"timeUnits", "vendorClientCorporation", "workWeekStart", "workersCompensationRate", "customObject1s", "customObject2s", "customObject3s", "customObject4s",
        "customObject5s", "customObject6s", "customObject7s", "customObject8s", "customObject9s", "customObject10s", "location", "timeAndExpense" })
public class Placement extends CustomFieldsD implements SearchEntity, QueryEntity, UpdateEntity, CreateEntity, HardDeleteEntity,
		FileEntity, AssociationEntity, DateLastModifiedEntity, EditHistoryEntity {

	private Integer id;

	private OneToMany<Appointment> appointments;

	private ClientContact approvingClientContact;

	private ClientContact backupApprovingClientContact;

	private ClientContact billingClientContact;

	private BillingProfile billingProfile;

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

    private Location location;

    private PlacementTimeAndExpense timeAndExpense;

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

    private GeneralLedgerSegment1 generalLedgerSegment1;

    private GeneralLedgerSegment2 generalLedgerSegment2;

    private GeneralLedgerSegment3 generalLedgerSegment3;

    private GeneralLedgerSegment4 generalLedgerSegment4;

    private GeneralLedgerSegment5 generalLedgerSegment5;

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

	private Integer onboardingDocumentReceivedCount;

	private Integer onboardingDocumentSentCount;

	private Integer onboardingPercentComplete;

	private OnboardingReceivedSent onboardingReceivedSent;

	private String onboardingStatus;

	private Integer otExemption;

	private BigDecimal otherHourlyFee;

	private BigDecimal markUpPercentage;

	private OneToMany<Note> notes;

	@JsonIgnore
	private String otherHourlyFeeComments;

	private BigDecimal overtimeMarkUpPercentage;

	private BigDecimal overtimeRate;

    @JsonIgnore
    private String payGroup;

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

    private SimplifiedOptionsLookup bteSyncStatus;

    private DateTime lastBteSyncDate;

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

    @JsonProperty("generalLedgerSegment1")
    public GeneralLedgerSegment1 getGeneralLedgerSegment1() {
        return generalLedgerSegment1;
    }

    @JsonProperty("generalLedgerSegment1")
    public void setGeneralLedgerSegment1(GeneralLedgerSegment1 generalLedgerSegment1) {
        this.generalLedgerSegment1 = generalLedgerSegment1;
    }

    @JsonProperty("generalLedgerSegment2")
    public GeneralLedgerSegment2 getGeneralLedgerSegment2() {
        return generalLedgerSegment2;
    }

    @JsonProperty("generalLedgerSegment2")
    public void setGeneralLedgerSegment2(GeneralLedgerSegment2 generalLedgerSegment2) {
        this.generalLedgerSegment2 = generalLedgerSegment2;
    }

    @JsonProperty("generalLedgerSegment3")
    public GeneralLedgerSegment3 getGeneralLedgerSegment3() {
        return generalLedgerSegment3;
    }

    @JsonProperty("generalLedgerSegment3")
    public void setGeneralLedgerSegment3(GeneralLedgerSegment3 generalLedgerSegment3) {
        this.generalLedgerSegment3 = generalLedgerSegment3;
    }

    @JsonProperty("generalLedgerSegment4")
    public GeneralLedgerSegment4 getGeneralLedgerSegment4() {
        return generalLedgerSegment4;
    }

    @JsonProperty("generalLedgerSegment4")
    public void setGeneralLedgerSegment4(GeneralLedgerSegment4 generalLedgerSegment4) {
        this.generalLedgerSegment4 = generalLedgerSegment4;
    }

    @JsonProperty("generalLedgerSegment5")
    public GeneralLedgerSegment5 getGeneralLedgerSegment5() {
        return generalLedgerSegment5;
    }

    @JsonProperty("generalLedgerSegment5")
    public void setGeneralLedgerSegment5(GeneralLedgerSegment5 generalLedgerSegment5) {
        this.generalLedgerSegment5 = generalLedgerSegment5;
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

    @JsonProperty("payGroup")
    public String getPayGroup() {
        return payGroup;
    }

    @JsonIgnore
    public void setPayGroup(String payGroup) {
        this.payGroup = payGroup;
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

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("timeAndExpense")
    public PlacementTimeAndExpense getTimeAndExpense() {
        return timeAndExpense;
    }

    @JsonProperty("timeAndExpense")
    public void setTimeAndExpense(PlacementTimeAndExpense timeAndExpense) {
        this.timeAndExpense = timeAndExpense;
    }

    @JsonProperty("bteSyncStatus")
    public SimplifiedOptionsLookup getBteSyncStatus() {
        return bteSyncStatus;
    }

    @JsonProperty("bteSyncStatus")
    public void setBteSyncStatus(SimplifiedOptionsLookup bteSyncStatus) {
        this.bteSyncStatus = bteSyncStatus;
    }

    @JsonProperty("lastBteSyncDate")
    public DateTime getLastBteSyncDate() {
        return lastBteSyncDate;
    }

    @JsonProperty("lastBteSyncDate")
    public void setLastBteSyncDate(DateTime lastBteSyncDate) {
        this.lastBteSyncDate = lastBteSyncDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Placement placement = (Placement) o;
        return Objects.equals(id, placement.id) &&
            Objects.equals(appointments, placement.appointments) &&
            Objects.equals(approvingClientContact, placement.approvingClientContact) &&
            Objects.equals(backupApprovingClientContact, placement.backupApprovingClientContact) &&
            Objects.equals(billingClientContact, placement.billingClientContact) &&
            Objects.equals(billingProfile, placement.billingProfile) &&
            Objects.equals(billingFrequency, placement.billingFrequency) &&
            Objects.equals(bonusPackage, placement.bonusPackage) &&
            Objects.equals(branch, placement.branch) &&
            Objects.equals(candidate, placement.candidate) &&
            Objects.equals(placementCertifications, placement.placementCertifications) &&
            Objects.equals(changeRequests, placement.changeRequests) &&
            Objects.equals(clientBillRate, placement.clientBillRate) &&
            Objects.equals(clientOvertimeRate, placement.clientOvertimeRate) &&
            Objects.equals(comments, placement.comments) &&
            Objects.equals(commissions, placement.commissions) &&
            Objects.equals(location, placement.location) &&
            Objects.equals(timeAndExpense, placement.timeAndExpense) &&
            Objects.equals(costCenter, placement.costCenter) &&
            Objects.equals(dateAdded, placement.dateAdded) &&
            Objects.equals(dateBegin, placement.dateBegin) &&
            Objects.equals(dateClientEffective, placement.dateClientEffective) &&
            Objects.equals(dateEffective, placement.dateEffective) &&
            Objects.equals(dateEnd, placement.dateEnd) &&
            Objects.equals(dateLastModified, placement.dateLastModified) &&
            Objects.equals(daysGuaranteed, placement.daysGuaranteed) &&
            Objects.equals(daysProRated, placement.daysProRated) &&
            Objects.equals(durationWeeks, placement.durationWeeks) &&
            Objects.equals(employeeType, placement.employeeType) &&
            Objects.equals(employmentType, placement.employmentType) &&
            Objects.equals(fee, placement.fee) &&
            Objects.equals(flatFee, placement.flatFee) &&
            Objects.equals(fileAttachments, placement.fileAttachments) &&
            Objects.equals(generalLedgerSegment1, placement.generalLedgerSegment1) &&
            Objects.equals(generalLedgerSegment2, placement.generalLedgerSegment2) &&
            Objects.equals(generalLedgerSegment3, placement.generalLedgerSegment3) &&
            Objects.equals(generalLedgerSegment4, placement.generalLedgerSegment4) &&
            Objects.equals(generalLedgerSegment5, placement.generalLedgerSegment5) &&
            Objects.equals(hoursOfOperation, placement.hoursOfOperation) &&
            Objects.equals(hoursPerDay, placement.hoursPerDay) &&
            Objects.equals(housingManagerID, placement.housingManagerID) &&
            Objects.equals(housingStatus, placement.housingStatus) &&
            Objects.equals(invoiceGroupName, placement.invoiceGroupName) &&
            Objects.equals(jobOrder, placement.jobOrder) &&
            Objects.equals(jobSubmission, placement.jobSubmission) &&
            Objects.equals(migrateGUID, placement.migrateGUID) &&
            Objects.equals(optionsPackage, placement.optionsPackage) &&
            Objects.equals(onboardingDocumentReceivedCount, placement.onboardingDocumentReceivedCount) &&
            Objects.equals(onboardingDocumentSentCount, placement.onboardingDocumentSentCount) &&
            Objects.equals(onboardingPercentComplete, placement.onboardingPercentComplete) &&
            Objects.equals(onboardingReceivedSent, placement.onboardingReceivedSent) &&
            Objects.equals(onboardingStatus, placement.onboardingStatus) &&
            Objects.equals(otExemption, placement.otExemption) &&
            Objects.equals(otherHourlyFee, placement.otherHourlyFee) &&
            Objects.equals(markUpPercentage, placement.markUpPercentage) &&
            Objects.equals(notes, placement.notes) &&
            Objects.equals(otherHourlyFeeComments, placement.otherHourlyFeeComments) &&
            Objects.equals(overtimeMarkUpPercentage, placement.overtimeMarkUpPercentage) &&
            Objects.equals(overtimeRate, placement.overtimeRate) &&
            Objects.equals(payGroup, placement.payGroup) &&
            Objects.equals(payRate, placement.payRate) &&
            Objects.equals(projectCodeList, placement.projectCodeList) &&
            Objects.equals(recruitingManagerPercentGrossMargin, placement.recruitingManagerPercentGrossMargin) &&
            Objects.equals(referralFee, placement.referralFee) &&
            Objects.equals(referralFeeType, placement.referralFeeType) &&
            Objects.equals(reportTo, placement.reportTo) &&
            Objects.equals(reportedMargin, placement.reportedMargin) &&
            Objects.equals(salary, placement.salary) &&
            Objects.equals(salaryUnit, placement.salaryUnit) &&
            Objects.equals(salesManagerPercentGrossMargin, placement.salesManagerPercentGrossMargin) &&
            Objects.equals(statementClientContact, placement.statementClientContact) &&
            Objects.equals(status, placement.status) &&
            Objects.equals(tasks, placement.tasks) &&
            Objects.equals(taxRate, placement.taxRate) &&
            Objects.equals(taxState, placement.taxState) &&
            Objects.equals(terminationReason, placement.terminationReason) &&
            Objects.equals(timeUnits, placement.timeUnits) &&
            Objects.equals(vendorClientCorporation, placement.vendorClientCorporation) &&
            Objects.equals(workWeekStart, placement.workWeekStart) &&
            Objects.equals(workersCompensationRate, placement.workersCompensationRate) &&
            Objects.equals(customObject1s, placement.customObject1s) &&
            Objects.equals(customObject2s, placement.customObject2s) &&
            Objects.equals(customObject3s, placement.customObject3s) &&
            Objects.equals(customObject4s, placement.customObject4s) &&
            Objects.equals(customObject5s, placement.customObject5s) &&
            Objects.equals(customObject6s, placement.customObject6s) &&
            Objects.equals(customObject7s, placement.customObject7s) &&
            Objects.equals(customObject8s, placement.customObject8s) &&
            Objects.equals(customObject9s, placement.customObject9s) &&
            Objects.equals(customObject10s, placement.customObject10s) &&
            Objects.equals(bteSyncStatus, placement.bteSyncStatus) &&
            Objects.equals(lastBteSyncDate, placement.lastBteSyncDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), id, appointments, approvingClientContact, backupApprovingClientContact, billingClientContact, billingProfile, billingFrequency, bonusPackage, branch, candidate, placementCertifications, changeRequests, clientBillRate, clientOvertimeRate, comments, commissions, location, timeAndExpense, costCenter, dateAdded, dateBegin, dateClientEffective, dateEffective, dateEnd, dateLastModified, daysGuaranteed, daysProRated, durationWeeks, employeeType, employmentType, fee, flatFee, fileAttachments, generalLedgerSegment1, generalLedgerSegment2, generalLedgerSegment3, generalLedgerSegment4, generalLedgerSegment5, hoursOfOperation, hoursPerDay, housingManagerID, housingStatus, invoiceGroupName, jobOrder, jobSubmission, migrateGUID, optionsPackage, onboardingDocumentReceivedCount, onboardingDocumentSentCount, onboardingPercentComplete, onboardingReceivedSent, onboardingStatus, otExemption, otherHourlyFee, markUpPercentage, notes, otherHourlyFeeComments, overtimeMarkUpPercentage, overtimeRate, payGroup, payRate, projectCodeList, recruitingManagerPercentGrossMargin, referralFee, referralFeeType, reportTo, reportedMargin, salary, salaryUnit, salesManagerPercentGrossMargin, statementClientContact, status, tasks, taxRate, taxState, terminationReason, timeUnits, vendorClientCorporation, workWeekStart, workersCompensationRate, customObject1s, customObject2s, customObject3s, customObject4s, customObject5s, customObject6s, customObject7s, customObject8s, customObject9s, customObject10s, bteSyncStatus, lastBteSyncDate);
    }

    @Override
    public String toString() {
        return "Placement{" +
            "id=" + id +
            ", appointments=" + appointments +
            ", approvingClientContact=" + approvingClientContact +
            ", backupApprovingClientContact=" + backupApprovingClientContact +
            ", billingClientContact=" + billingClientContact +
            ", billingProfile=" + billingProfile +
            ", billingFrequency='" + billingFrequency + '\'' +
            ", bonusPackage='" + bonusPackage + '\'' +
            ", branch=" + branch +
            ", candidate=" + candidate +
            ", placementCertifications=" + placementCertifications +
            ", changeRequests=" + changeRequests +
            ", clientBillRate=" + clientBillRate +
            ", clientOvertimeRate=" + clientOvertimeRate +
            ", comments='" + comments + '\'' +
            ", commissions=" + commissions +
            ", location=" + location +
            ", timeAndExpense=" + timeAndExpense +
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
            ", fileAttachments=" + fileAttachments +
            ", generalLedgerSegment1=" + generalLedgerSegment1 +
            ", generalLedgerSegment2=" + generalLedgerSegment2 +
            ", generalLedgerSegment3=" + generalLedgerSegment3 +
            ", generalLedgerSegment4=" + generalLedgerSegment4 +
            ", generalLedgerSegment5=" + generalLedgerSegment5 +
            ", hoursOfOperation='" + hoursOfOperation + '\'' +
            ", hoursPerDay=" + hoursPerDay +
            ", housingManagerID=" + housingManagerID +
            ", housingStatus='" + housingStatus + '\'' +
            ", invoiceGroupName='" + invoiceGroupName + '\'' +
            ", jobOrder=" + jobOrder +
            ", jobSubmission=" + jobSubmission +
            ", migrateGUID=" + migrateGUID +
            ", optionsPackage='" + optionsPackage + '\'' +
            ", onboardingDocumentReceivedCount=" + onboardingDocumentReceivedCount +
            ", onboardingDocumentSentCount=" + onboardingDocumentSentCount +
            ", onboardingPercentComplete=" + onboardingPercentComplete +
            ", onboardingReceivedSent=" + onboardingReceivedSent +
            ", onboardingStatus='" + onboardingStatus + '\'' +
            ", otExemption=" + otExemption +
            ", otherHourlyFee=" + otherHourlyFee +
            ", markUpPercentage=" + markUpPercentage +
            ", notes=" + notes +
            ", otherHourlyFeeComments='" + otherHourlyFeeComments + '\'' +
            ", overtimeMarkUpPercentage=" + overtimeMarkUpPercentage +
            ", overtimeRate=" + overtimeRate +
            ", payGroup=" + payGroup +
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
            ", workersCompensationRate=" + workersCompensationRate +
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
            ", bteSyncStatus=" + bteSyncStatus +
            ", lastBteSyncDate=" + lastBteSyncDate +
            '}';
    }
}
