package com.bullhornsdk.data.model.entity.core.standard;

import java.math.BigDecimal;

import javax.validation.constraints.Size;

import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.HardDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsD;
import com.bullhornsdk.data.model.entity.embedded.LinkedId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "approvingUser", "billingClientContact", "billingFrequency", "bonusPackage", "clientBillRate",
        "clientOvertimeRate", "comments", "correlatedCustomDate1", "correlatedCustomDate2", "correlatedCustomDate3",
        "correlatedCustomFloat1", "correlatedCustomFloat2", "correlatedCustomFloat3", "correlatedCustomInt1",
        "correlatedCustomInt2", "correlatedCustomInt3", "correlatedCustomText1", "correlatedCustomText10",
        "correlatedCustomText2", "correlatedCustomText3", "correlatedCustomText4", "correlatedCustomText5",
        "correlatedCustomText6", "correlatedCustomText7", "correlatedCustomText8", "correlatedCustomText9",
        "correlatedCustomTextBlock1", "correlatedCustomTextBlock2", "correlatedCustomTextBlock3", "costCenter",
        "customBillRate1", "customBillRate10", "customBillRate2", "customBillRate3", "customBillRate4", "customBillRate5",
        "customBillRate6", "customBillRate7", "customBillRate8", "customBillRate9", "customDate1", "customDate2", "customDate3",
        "customFloat1", "customFloat2", "customFloat3", "customInt1", "customInt2", "customInt3", "customPayRate1",
        "customPayRate10", "customPayRate2", "customPayRate3", "customPayRate4", "customPayRate5", "customPayRate6",
        "customPayRate7", "customPayRate8", "customPayRate9", "customText1", "customText10", "customText11", "customText12",
        "customText13", "customText14", "customText15", "customText16", "customText17", "customText18", "customText19",
        "customText2", "customText20", "customText21", "customText22", "customText23", "customText24", "customText25",
        "customText26", "customText27", "customText28", "customText29", "customText3", "customText30", "customText31",
        "customText32", "customText33", "customText34", "customText35", "customText36", "customText37", "customText38",
        "customText39", "customText4", "customText40", "customText5", "customText6", "customText7", "customText8", "customText9",
        "customTextBlock1", "customTextBlock2", "customTextBlock3", "customTextBlock4", "customTextBlock5", "dateAdded",
        "dateApproved", "dateBegin", "dateClientEffective", "dateEffective", "dateEnd", "dateLastModified", "daysGuaranteed", "daysProRated",
        "durationWeeks", "employeeType", "employmentType", "fee", "hoursOfOperation", "hoursPerDay", "housingManagerID",
        "housingStatus", "migrateGUID", "optionsPackage", "otExemption", "otherHourlyFee", "otherHourlyFeeComments",
        "overtimeRate", "payRate", "placement", "recruitingManagerPercentGrossMargin", "referralFee", "referralFeeType",
        "reportTo", "requestCustomDate1", "requestCustomDate2", "requestCustomDate3", "requestCustomFloat1",
        "requestCustomFloat2", "requestCustomFloat3", "requestCustomInt1", "requestCustomInt2", "requestCustomInt3",
        "requestCustomText1", "requestCustomText10", "requestCustomText11", "requestCustomText12", "requestCustomText13",
        "requestCustomText14", "requestCustomText15", "requestCustomText16", "requestCustomText17", "requestCustomText18",
        "requestCustomText19", "requestCustomText2", "requestCustomText20", "requestCustomText3", "requestCustomText4",
        "requestCustomText5", "requestCustomText6", "requestCustomText7", "requestCustomText8", "requestCustomText9",
        "requestCustomTextBlock1", "requestCustomTextBlock2", "requestCustomTextBlock3", "requestCustomTextBlock4",
        "requestCustomTextBlock5", "requestStatus", "requestType", "requestingUser", "salary", "salaryUnit",
        "salesManagerPercentGrossMargin", "statementClientContact", "status", "terminationReason", "vendorClientCorporation",
        "workWeekStart" })
public class PlacementChangeRequest extends CustomFieldsD implements QueryEntity, CreateEntity, UpdateEntity, HardDeleteEntity {

    private Integer id;

    private CorporateUser approvingUser;

    private ClientContact billingClientContact;

    @JsonIgnore
    @Size(max = 20)
    private String billingFrequency;

    @JsonIgnore
    private String bonusPackage;

    private BigDecimal clientBillRate;

    private BigDecimal clientOvertimeRate;

    @JsonIgnore
    private String comments;

    @JsonIgnore
    private String costCenter;

    private DateTime dateAdded;

    private DateTime dateApproved;

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
    @Size(max = 30)
    private String employmentType;

    private BigDecimal fee;

    @JsonIgnore
    @Size(max = 100)
    private String hoursOfOperation;

    private BigDecimal hoursPerDay;

    private Integer housingManagerID;

    @JsonIgnore
    @Size(max = 30)
    private String housingStatus;

    @JsonIgnore
    private String migrateGUID;

    @JsonIgnore
    private String optionsPackage;

    private Integer otExemption;

    private BigDecimal otherHourlyFee;

    @JsonIgnore
    private String otherHourlyFeeComments;

    private BigDecimal overtimeRate;

    private BigDecimal payRate;

    private Placement placement;

    private BigDecimal recruitingManagerPercentGrossMargin;

    private BigDecimal referralFee;

    @JsonIgnore
    private String referralFeeType;

    @JsonIgnore
    private String reportTo;

    private DateTime requestCustomDate1;

    private DateTime requestCustomDate2;

    private DateTime requestCustomDate3;

    private BigDecimal requestCustomFloat1;

    private BigDecimal requestCustomFloat2;

    private BigDecimal requestCustomFloat3;

    private Integer requestCustomInt1;

    private Integer requestCustomInt2;

    private Integer requestCustomInt3;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText1;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText10;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText11;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText12;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText13;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText14;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText15;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText16;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText17;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText18;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText19;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText2;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText20;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText3;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText4;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText5;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText6;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText7;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText8;

    @JsonIgnore
    @Size(max = 30)
    private String requestCustomText9;

    @JsonIgnore
    private String requestCustomTextBlock1;

    @JsonIgnore
    private String requestCustomTextBlock2;

    @JsonIgnore
    private String requestCustomTextBlock3;

    @JsonIgnore
    private String requestCustomTextBlock4;

    @JsonIgnore
    private String requestCustomTextBlock5;

    @JsonIgnore
    @Size(max = 40)
    private String requestStatus;

    @JsonIgnore
    @Size(max = 50)
    private String requestType;

    private CorporateUser requestingUser;

    private BigDecimal salary;

    @JsonIgnore
    private String salaryUnit;

    private BigDecimal salesManagerPercentGrossMargin;

    private ClientContact statementClientContact;
    @JsonIgnore
    @Size(max = 100)
    private String status;
    @JsonIgnore
    @Size(max = 100)
    private String terminationReason;

    private ClientCorporation vendorClientCorporation;

    private Integer workWeekStart;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("approvingUser")
    public CorporateUser getApprovingUser() {
        return approvingUser;
    }

    @JsonProperty("approvingUser")
    public void setApprovingUser(CorporateUser approvingUser) {
        this.approvingUser = approvingUser;
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

    @JsonProperty("dateApproved")
    public DateTime getDateApproved() {
        return dateApproved;
    }

    @JsonProperty("dateApproved")
    public void setDateApproved(DateTime dateApproved) {
        this.dateApproved = dateApproved;
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

    @JsonProperty("migrateGUID")
    public String getMigrateGUID() {
        return migrateGUID;
    }

    @JsonIgnore
    public void setMigrateGUID(String migrateGUID) {
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

    @JsonProperty("placement")
    public Placement getPlacement() {
        return placement;
    }

    @JsonProperty("placement")
    public void setPlacement(Placement placement) {
        this.placement = placement;
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

    @JsonProperty("requestCustomDate1")
    public DateTime getRequestCustomDate1() {
        return requestCustomDate1;
    }

    @JsonProperty("requestCustomDate1")
    public void setRequestCustomDate1(DateTime requestCustomDate1) {
        this.requestCustomDate1 = requestCustomDate1;
    }

    @JsonProperty("requestCustomDate2")
    public DateTime getRequestCustomDate2() {
        return requestCustomDate2;
    }

    @JsonProperty("requestCustomDate2")
    public void setRequestCustomDate2(DateTime requestCustomDate2) {
        this.requestCustomDate2 = requestCustomDate2;
    }

    @JsonProperty("requestCustomDate3")
    public DateTime getRequestCustomDate3() {
        return requestCustomDate3;
    }

    @JsonProperty("requestCustomDate3")
    public void setRequestCustomDate3(DateTime requestCustomDate3) {
        this.requestCustomDate3 = requestCustomDate3;
    }

    @JsonProperty("requestCustomFloat1")
    public BigDecimal getRequestCustomFloat1() {
        return requestCustomFloat1;
    }

    @JsonProperty("requestCustomFloat1")
    public void setRequestCustomFloat1(BigDecimal requestCustomFloat1) {
        this.requestCustomFloat1 = requestCustomFloat1;
    }

    @JsonProperty("requestCustomFloat2")
    public BigDecimal getRequestCustomFloat2() {
        return requestCustomFloat2;
    }

    @JsonProperty("requestCustomFloat2")
    public void setRequestCustomFloat2(BigDecimal requestCustomFloat2) {
        this.requestCustomFloat2 = requestCustomFloat2;
    }

    @JsonProperty("requestCustomFloat3")
    public BigDecimal getRequestCustomFloat3() {
        return requestCustomFloat3;
    }

    @JsonProperty("requestCustomFloat3")
    public void setRequestCustomFloat3(BigDecimal requestCustomFloat3) {
        this.requestCustomFloat3 = requestCustomFloat3;
    }

    @JsonProperty("requestCustomInt1")
    public Integer getRequestCustomInt1() {
        return requestCustomInt1;
    }

    @JsonProperty("requestCustomInt1")
    public void setRequestCustomInt1(Integer requestCustomInt1) {
        this.requestCustomInt1 = requestCustomInt1;
    }

    @JsonProperty("requestCustomInt2")
    public Integer getRequestCustomInt2() {
        return requestCustomInt2;
    }

    @JsonProperty("requestCustomInt2")
    public void setRequestCustomInt2(Integer requestCustomInt2) {
        this.requestCustomInt2 = requestCustomInt2;
    }

    @JsonProperty("requestCustomInt3")
    public Integer getRequestCustomInt3() {
        return requestCustomInt3;
    }

    @JsonProperty("requestCustomInt3")
    public void setRequestCustomInt3(Integer requestCustomInt3) {
        this.requestCustomInt3 = requestCustomInt3;
    }

    @JsonProperty("requestCustomText1")
    public String getRequestCustomText1() {
        return requestCustomText1;
    }

    @JsonIgnore
    public void setRequestCustomText1(String requestCustomText1) {
        this.requestCustomText1 = requestCustomText1;
    }

    @JsonProperty("requestCustomText10")
    public String getRequestCustomText10() {
        return requestCustomText10;
    }

    @JsonIgnore
    public void setRequestCustomText10(String requestCustomText10) {
        this.requestCustomText10 = requestCustomText10;
    }

    @JsonProperty("requestCustomText11")
    public String getRequestCustomText11() {
        return requestCustomText11;
    }

    @JsonIgnore
    public void setRequestCustomText11(String requestCustomText11) {
        this.requestCustomText11 = requestCustomText11;
    }

    @JsonProperty("requestCustomText12")
    public String getRequestCustomText12() {
        return requestCustomText12;
    }

    @JsonIgnore
    public void setRequestCustomText12(String requestCustomText12) {
        this.requestCustomText12 = requestCustomText12;
    }

    @JsonProperty("requestCustomText13")
    public String getRequestCustomText13() {
        return requestCustomText13;
    }

    @JsonIgnore
    public void setRequestCustomText13(String requestCustomText13) {
        this.requestCustomText13 = requestCustomText13;
    }

    @JsonProperty("requestCustomText14")
    public String getRequestCustomText14() {
        return requestCustomText14;
    }

    @JsonIgnore
    public void setRequestCustomText14(String requestCustomText14) {
        this.requestCustomText14 = requestCustomText14;
    }

    @JsonProperty("requestCustomText15")
    public String getRequestCustomText15() {
        return requestCustomText15;
    }

    @JsonIgnore
    public void setRequestCustomText15(String requestCustomText15) {
        this.requestCustomText15 = requestCustomText15;
    }

    @JsonProperty("requestCustomText16")
    public String getRequestCustomText16() {
        return requestCustomText16;
    }

    @JsonIgnore
    public void setRequestCustomText16(String requestCustomText16) {
        this.requestCustomText16 = requestCustomText16;
    }

    @JsonProperty("requestCustomText17")
    public String getRequestCustomText17() {
        return requestCustomText17;
    }

    @JsonIgnore
    public void setRequestCustomText17(String requestCustomText17) {
        this.requestCustomText17 = requestCustomText17;
    }

    @JsonProperty("requestCustomText18")
    public String getRequestCustomText18() {
        return requestCustomText18;
    }

    @JsonIgnore
    public void setRequestCustomText18(String requestCustomText18) {
        this.requestCustomText18 = requestCustomText18;
    }

    @JsonProperty("requestCustomText19")
    public String getRequestCustomText19() {
        return requestCustomText19;
    }

    @JsonIgnore
    public void setRequestCustomText19(String requestCustomText19) {
        this.requestCustomText19 = requestCustomText19;
    }

    @JsonProperty("requestCustomText2")
    public String getRequestCustomText2() {
        return requestCustomText2;
    }

    @JsonIgnore
    public void setRequestCustomText2(String requestCustomText2) {
        this.requestCustomText2 = requestCustomText2;
    }

    @JsonProperty("requestCustomText20")
    public String getRequestCustomText20() {
        return requestCustomText20;
    }

    @JsonIgnore
    public void setRequestCustomText20(String requestCustomText20) {
        this.requestCustomText20 = requestCustomText20;
    }

    @JsonProperty("requestCustomText3")
    public String getRequestCustomText3() {
        return requestCustomText3;
    }

    @JsonIgnore
    public void setRequestCustomText3(String requestCustomText3) {
        this.requestCustomText3 = requestCustomText3;
    }

    @JsonProperty("requestCustomText4")
    public String getRequestCustomText4() {
        return requestCustomText4;
    }

    @JsonIgnore
    public void setRequestCustomText4(String requestCustomText4) {
        this.requestCustomText4 = requestCustomText4;
    }

    @JsonProperty("requestCustomText5")
    public String getRequestCustomText5() {
        return requestCustomText5;
    }

    @JsonIgnore
    public void setRequestCustomText5(String requestCustomText5) {
        this.requestCustomText5 = requestCustomText5;
    }

    @JsonProperty("requestCustomText6")
    public String getRequestCustomText6() {
        return requestCustomText6;
    }

    @JsonIgnore
    public void setRequestCustomText6(String requestCustomText6) {
        this.requestCustomText6 = requestCustomText6;
    }

    @JsonProperty("requestCustomText7")
    public String getRequestCustomText7() {
        return requestCustomText7;
    }

    @JsonIgnore
    public void setRequestCustomText7(String requestCustomText7) {
        this.requestCustomText7 = requestCustomText7;
    }

    @JsonProperty("requestCustomText8")
    public String getRequestCustomText8() {
        return requestCustomText8;
    }

    @JsonIgnore
    public void setRequestCustomText8(String requestCustomText8) {
        this.requestCustomText8 = requestCustomText8;
    }

    @JsonProperty("requestCustomText9")
    public String getRequestCustomText9() {
        return requestCustomText9;
    }

    @JsonIgnore
    public void setRequestCustomText9(String requestCustomText9) {
        this.requestCustomText9 = requestCustomText9;
    }

    @JsonProperty("requestCustomTextBlock1")
    public String getRequestCustomTextBlock1() {
        return requestCustomTextBlock1;
    }

    @JsonIgnore
    public void setRequestCustomTextBlock1(String requestCustomTextBlock1) {
        this.requestCustomTextBlock1 = requestCustomTextBlock1;
    }

    @JsonProperty("requestCustomTextBlock2")
    public String getRequestCustomTextBlock2() {
        return requestCustomTextBlock2;
    }

    @JsonIgnore
    public void setRequestCustomTextBlock2(String requestCustomTextBlock2) {
        this.requestCustomTextBlock2 = requestCustomTextBlock2;
    }

    @JsonProperty("requestCustomTextBlock3")
    public String getRequestCustomTextBlock3() {
        return requestCustomTextBlock3;
    }

    @JsonIgnore
    public void setRequestCustomTextBlock3(String requestCustomTextBlock3) {
        this.requestCustomTextBlock3 = requestCustomTextBlock3;
    }

    @JsonProperty("requestCustomTextBlock4")
    public String getRequestCustomTextBlock4() {
        return requestCustomTextBlock4;
    }

    @JsonIgnore
    public void setRequestCustomTextBlock4(String requestCustomTextBlock4) {
        this.requestCustomTextBlock4 = requestCustomTextBlock4;
    }

    @JsonProperty("requestCustomTextBlock5")
    public String getRequestCustomTextBlock5() {
        return requestCustomTextBlock5;
    }

    @JsonIgnore
    public void setRequestCustomTextBlock5(String requestCustomTextBlock5) {
        this.requestCustomTextBlock5 = requestCustomTextBlock5;
    }

    @JsonProperty("requestStatus")
    public String getRequestStatus() {
        return requestStatus;
    }

    @JsonIgnore
    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    @JsonProperty("requestType")
    public String getRequestType() {
        return requestType;
    }

    @JsonIgnore
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    @JsonProperty("requestingUser")
    public CorporateUser getRequestingUser() {
        return requestingUser;
    }

    @JsonProperty("requestingUser")
    public void setRequestingUser(CorporateUser requestingUser) {
        this.requestingUser = requestingUser;
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

    @JsonProperty("terminationReason")
    public String getTerminationReason() {
        return terminationReason;
    }

    @JsonIgnore
    public void setTerminationReason(String terminationReason) {
        this.terminationReason = terminationReason;
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
        result = prime * result + ((approvingUser == null) ? 0 : approvingUser.hashCode());
        result = prime * result + ((billingClientContact == null) ? 0 : billingClientContact.hashCode());
        result = prime * result + ((billingFrequency == null) ? 0 : billingFrequency.hashCode());
        result = prime * result + ((bonusPackage == null) ? 0 : bonusPackage.hashCode());
        result = prime * result + ((clientBillRate == null) ? 0 : clientBillRate.hashCode());
        result = prime * result + ((clientOvertimeRate == null) ? 0 : clientOvertimeRate.hashCode());
        result = prime * result + ((comments == null) ? 0 : comments.hashCode());
        result = prime * result + ((costCenter == null) ? 0 : costCenter.hashCode());
        result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
        result = prime * result + ((dateApproved == null) ? 0 : dateApproved.hashCode());
        result = prime * result + ((dateBegin == null) ? 0 : dateBegin.hashCode());
        result = prime * result + ((dateClientEffective == null) ? 0 : dateClientEffective.hashCode());
        result = prime * result + ((dateEffective == null) ? 0 : dateEffective.hashCode());
        result = prime * result + ((dateEnd == null) ? 0 : dateEnd.hashCode());
        result = prime * result + ((dateLastModified == null) ? 0 : dateLastModified.hashCode());
        result = prime * result + ((daysGuaranteed == null) ? 0 : daysGuaranteed.hashCode());
        result = prime * result + ((daysProRated == null) ? 0 : daysProRated.hashCode());
        result = prime * result + ((durationWeeks == null) ? 0 : durationWeeks.hashCode());
        result = prime * result + ((employeeType == null) ? 0 : employeeType.hashCode());
        result = prime * result + ((employmentType == null) ? 0 : employmentType.hashCode());
        result = prime * result + ((fee == null) ? 0 : fee.hashCode());
        result = prime * result + ((hoursOfOperation == null) ? 0 : hoursOfOperation.hashCode());
        result = prime * result + ((hoursPerDay == null) ? 0 : hoursPerDay.hashCode());
        result = prime * result + ((housingManagerID == null) ? 0 : housingManagerID.hashCode());
        result = prime * result + ((housingStatus == null) ? 0 : housingStatus.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
        result = prime * result + ((optionsPackage == null) ? 0 : optionsPackage.hashCode());
        result = prime * result + ((otExemption == null) ? 0 : otExemption.hashCode());
        result = prime * result + ((otherHourlyFee == null) ? 0 : otherHourlyFee.hashCode());
        result = prime * result + ((otherHourlyFeeComments == null) ? 0 : otherHourlyFeeComments.hashCode());
        result = prime * result + ((overtimeRate == null) ? 0 : overtimeRate.hashCode());
        result = prime * result + ((payRate == null) ? 0 : payRate.hashCode());
        result = prime * result + ((placement == null) ? 0 : placement.hashCode());
        result = prime * result
                + ((recruitingManagerPercentGrossMargin == null) ? 0 : recruitingManagerPercentGrossMargin.hashCode());
        result = prime * result + ((referralFee == null) ? 0 : referralFee.hashCode());
        result = prime * result + ((referralFeeType == null) ? 0 : referralFeeType.hashCode());
        result = prime * result + ((reportTo == null) ? 0 : reportTo.hashCode());
        result = prime * result + ((requestCustomDate1 == null) ? 0 : requestCustomDate1.hashCode());
        result = prime * result + ((requestCustomDate2 == null) ? 0 : requestCustomDate2.hashCode());
        result = prime * result + ((requestCustomDate3 == null) ? 0 : requestCustomDate3.hashCode());
        result = prime * result + ((requestCustomFloat1 == null) ? 0 : requestCustomFloat1.hashCode());
        result = prime * result + ((requestCustomFloat2 == null) ? 0 : requestCustomFloat2.hashCode());
        result = prime * result + ((requestCustomFloat3 == null) ? 0 : requestCustomFloat3.hashCode());
        result = prime * result + ((requestCustomInt1 == null) ? 0 : requestCustomInt1.hashCode());
        result = prime * result + ((requestCustomInt2 == null) ? 0 : requestCustomInt2.hashCode());
        result = prime * result + ((requestCustomInt3 == null) ? 0 : requestCustomInt3.hashCode());
        result = prime * result + ((requestCustomText1 == null) ? 0 : requestCustomText1.hashCode());
        result = prime * result + ((requestCustomText10 == null) ? 0 : requestCustomText10.hashCode());
        result = prime * result + ((requestCustomText11 == null) ? 0 : requestCustomText11.hashCode());
        result = prime * result + ((requestCustomText12 == null) ? 0 : requestCustomText12.hashCode());
        result = prime * result + ((requestCustomText13 == null) ? 0 : requestCustomText13.hashCode());
        result = prime * result + ((requestCustomText14 == null) ? 0 : requestCustomText14.hashCode());
        result = prime * result + ((requestCustomText15 == null) ? 0 : requestCustomText15.hashCode());
        result = prime * result + ((requestCustomText16 == null) ? 0 : requestCustomText16.hashCode());
        result = prime * result + ((requestCustomText17 == null) ? 0 : requestCustomText17.hashCode());
        result = prime * result + ((requestCustomText18 == null) ? 0 : requestCustomText18.hashCode());
        result = prime * result + ((requestCustomText19 == null) ? 0 : requestCustomText19.hashCode());
        result = prime * result + ((requestCustomText2 == null) ? 0 : requestCustomText2.hashCode());
        result = prime * result + ((requestCustomText20 == null) ? 0 : requestCustomText20.hashCode());
        result = prime * result + ((requestCustomText3 == null) ? 0 : requestCustomText3.hashCode());
        result = prime * result + ((requestCustomText4 == null) ? 0 : requestCustomText4.hashCode());
        result = prime * result + ((requestCustomText5 == null) ? 0 : requestCustomText5.hashCode());
        result = prime * result + ((requestCustomText6 == null) ? 0 : requestCustomText6.hashCode());
        result = prime * result + ((requestCustomText7 == null) ? 0 : requestCustomText7.hashCode());
        result = prime * result + ((requestCustomText8 == null) ? 0 : requestCustomText8.hashCode());
        result = prime * result + ((requestCustomText9 == null) ? 0 : requestCustomText9.hashCode());
        result = prime * result + ((requestCustomTextBlock1 == null) ? 0 : requestCustomTextBlock1.hashCode());
        result = prime * result + ((requestCustomTextBlock2 == null) ? 0 : requestCustomTextBlock2.hashCode());
        result = prime * result + ((requestCustomTextBlock3 == null) ? 0 : requestCustomTextBlock3.hashCode());
        result = prime * result + ((requestCustomTextBlock4 == null) ? 0 : requestCustomTextBlock4.hashCode());
        result = prime * result + ((requestCustomTextBlock5 == null) ? 0 : requestCustomTextBlock5.hashCode());
        result = prime * result + ((requestStatus == null) ? 0 : requestStatus.hashCode());
        result = prime * result + ((requestType == null) ? 0 : requestType.hashCode());
        result = prime * result + ((requestingUser == null) ? 0 : requestingUser.hashCode());
        result = prime * result + ((salary == null) ? 0 : salary.hashCode());
        result = prime * result + ((salaryUnit == null) ? 0 : salaryUnit.hashCode());
        result = prime * result + ((salesManagerPercentGrossMargin == null) ? 0 : salesManagerPercentGrossMargin.hashCode());
        result = prime * result + ((statementClientContact == null) ? 0 : statementClientContact.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((terminationReason == null) ? 0 : terminationReason.hashCode());
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
        PlacementChangeRequest other = (PlacementChangeRequest) obj;
        if (approvingUser == null) {
            if (other.approvingUser != null)
                return false;
        } else if (!approvingUser.equals(other.approvingUser))
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
        if (dateApproved == null) {
            if (other.dateApproved != null)
                return false;
        } else if (!dateApproved.isEqual(other.dateApproved))
            return false;
        if (dateBegin == null) {
            if (other.dateBegin != null)
                return false;
        } else if (!dateBegin.isEqual(other.dateBegin))
            return false;
        if (dateClientEffective == null) {
            if (other.dateClientEffective != null)
                return false;
        } else if (!dateClientEffective.isEqual(other.dateClientEffective))
            return false;
        if (dateEffective == null) {
            if (other.dateEffective != null)
                return false;
        } else if (!dateEffective.isEqual(other.dateEffective))
            return false;
        if (dateEnd == null) {
            if (other.dateEnd != null)
                return false;
        } else if (!dateEnd.isEqual(other.dateEnd))
            return false;
        if (dateLastModified == null) {
            if (other.dateLastModified != null)
                return false;
        } else if (!dateLastModified.isEqual(other.dateLastModified))
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
        if (migrateGUID == null) {
            if (other.migrateGUID != null)
                return false;
        } else if (!migrateGUID.equals(other.migrateGUID))
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
        if (placement == null) {
            if (other.placement != null)
                return false;
        } else if (!placement.equals(other.placement))
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
        if (requestCustomDate1 == null) {
            if (other.requestCustomDate1 != null)
                return false;
        } else if (!requestCustomDate1.isEqual(other.requestCustomDate1))
            return false;
        if (requestCustomDate2 == null) {
            if (other.requestCustomDate2 != null)
                return false;
        } else if (!requestCustomDate2.isEqual(other.requestCustomDate2))
            return false;
        if (requestCustomDate3 == null) {
            if (other.requestCustomDate3 != null)
                return false;
        } else if (!requestCustomDate3.isEqual(other.requestCustomDate3))
            return false;
        if (requestCustomFloat1 == null) {
            if (other.requestCustomFloat1 != null)
                return false;
        } else if (!requestCustomFloat1.equals(other.requestCustomFloat1))
            return false;
        if (requestCustomFloat2 == null) {
            if (other.requestCustomFloat2 != null)
                return false;
        } else if (!requestCustomFloat2.equals(other.requestCustomFloat2))
            return false;
        if (requestCustomFloat3 == null) {
            if (other.requestCustomFloat3 != null)
                return false;
        } else if (!requestCustomFloat3.equals(other.requestCustomFloat3))
            return false;
        if (requestCustomInt1 == null) {
            if (other.requestCustomInt1 != null)
                return false;
        } else if (!requestCustomInt1.equals(other.requestCustomInt1))
            return false;
        if (requestCustomInt2 == null) {
            if (other.requestCustomInt2 != null)
                return false;
        } else if (!requestCustomInt2.equals(other.requestCustomInt2))
            return false;
        if (requestCustomInt3 == null) {
            if (other.requestCustomInt3 != null)
                return false;
        } else if (!requestCustomInt3.equals(other.requestCustomInt3))
            return false;
        if (requestCustomText1 == null) {
            if (other.requestCustomText1 != null)
                return false;
        } else if (!requestCustomText1.equals(other.requestCustomText1))
            return false;
        if (requestCustomText10 == null) {
            if (other.requestCustomText10 != null)
                return false;
        } else if (!requestCustomText10.equals(other.requestCustomText10))
            return false;
        if (requestCustomText11 == null) {
            if (other.requestCustomText11 != null)
                return false;
        } else if (!requestCustomText11.equals(other.requestCustomText11))
            return false;
        if (requestCustomText12 == null) {
            if (other.requestCustomText12 != null)
                return false;
        } else if (!requestCustomText12.equals(other.requestCustomText12))
            return false;
        if (requestCustomText13 == null) {
            if (other.requestCustomText13 != null)
                return false;
        } else if (!requestCustomText13.equals(other.requestCustomText13))
            return false;
        if (requestCustomText14 == null) {
            if (other.requestCustomText14 != null)
                return false;
        } else if (!requestCustomText14.equals(other.requestCustomText14))
            return false;
        if (requestCustomText15 == null) {
            if (other.requestCustomText15 != null)
                return false;
        } else if (!requestCustomText15.equals(other.requestCustomText15))
            return false;
        if (requestCustomText16 == null) {
            if (other.requestCustomText16 != null)
                return false;
        } else if (!requestCustomText16.equals(other.requestCustomText16))
            return false;
        if (requestCustomText17 == null) {
            if (other.requestCustomText17 != null)
                return false;
        } else if (!requestCustomText17.equals(other.requestCustomText17))
            return false;
        if (requestCustomText18 == null) {
            if (other.requestCustomText18 != null)
                return false;
        } else if (!requestCustomText18.equals(other.requestCustomText18))
            return false;
        if (requestCustomText19 == null) {
            if (other.requestCustomText19 != null)
                return false;
        } else if (!requestCustomText19.equals(other.requestCustomText19))
            return false;
        if (requestCustomText2 == null) {
            if (other.requestCustomText2 != null)
                return false;
        } else if (!requestCustomText2.equals(other.requestCustomText2))
            return false;
        if (requestCustomText20 == null) {
            if (other.requestCustomText20 != null)
                return false;
        } else if (!requestCustomText20.equals(other.requestCustomText20))
            return false;
        if (requestCustomText3 == null) {
            if (other.requestCustomText3 != null)
                return false;
        } else if (!requestCustomText3.equals(other.requestCustomText3))
            return false;
        if (requestCustomText4 == null) {
            if (other.requestCustomText4 != null)
                return false;
        } else if (!requestCustomText4.equals(other.requestCustomText4))
            return false;
        if (requestCustomText5 == null) {
            if (other.requestCustomText5 != null)
                return false;
        } else if (!requestCustomText5.equals(other.requestCustomText5))
            return false;
        if (requestCustomText6 == null) {
            if (other.requestCustomText6 != null)
                return false;
        } else if (!requestCustomText6.equals(other.requestCustomText6))
            return false;
        if (requestCustomText7 == null) {
            if (other.requestCustomText7 != null)
                return false;
        } else if (!requestCustomText7.equals(other.requestCustomText7))
            return false;
        if (requestCustomText8 == null) {
            if (other.requestCustomText8 != null)
                return false;
        } else if (!requestCustomText8.equals(other.requestCustomText8))
            return false;
        if (requestCustomText9 == null) {
            if (other.requestCustomText9 != null)
                return false;
        } else if (!requestCustomText9.equals(other.requestCustomText9))
            return false;
        if (requestCustomTextBlock1 == null) {
            if (other.requestCustomTextBlock1 != null)
                return false;
        } else if (!requestCustomTextBlock1.equals(other.requestCustomTextBlock1))
            return false;
        if (requestCustomTextBlock2 == null) {
            if (other.requestCustomTextBlock2 != null)
                return false;
        } else if (!requestCustomTextBlock2.equals(other.requestCustomTextBlock2))
            return false;
        if (requestCustomTextBlock3 == null) {
            if (other.requestCustomTextBlock3 != null)
                return false;
        } else if (!requestCustomTextBlock3.equals(other.requestCustomTextBlock3))
            return false;
        if (requestCustomTextBlock4 == null) {
            if (other.requestCustomTextBlock4 != null)
                return false;
        } else if (!requestCustomTextBlock4.equals(other.requestCustomTextBlock4))
            return false;
        if (requestCustomTextBlock5 == null) {
            if (other.requestCustomTextBlock5 != null)
                return false;
        } else if (!requestCustomTextBlock5.equals(other.requestCustomTextBlock5))
            return false;
        if (requestStatus == null) {
            if (other.requestStatus != null)
                return false;
        } else if (!requestStatus.equals(other.requestStatus))
            return false;
        if (requestType == null) {
            if (other.requestType != null)
                return false;
        } else if (!requestType.equals(other.requestType))
            return false;
        if (requestingUser == null) {
            if (other.requestingUser != null)
                return false;
        } else if (!requestingUser.equals(other.requestingUser))
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
        if (terminationReason == null) {
            if (other.terminationReason != null)
                return false;
        } else if (!terminationReason.equals(other.terminationReason))
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
        builder.append("PlacementChangeRequest {\nid=");
        builder.append(id);
        builder.append(", \napprovingUser=");
        builder.append(approvingUser);
        builder.append(", \nbillingClientContact=");
        builder.append(billingClientContact);
        builder.append(", \nbillingFrequency=");
        builder.append(billingFrequency);
        builder.append(", \nbonusPackage=");
        builder.append(bonusPackage);
        builder.append(", \nclientBillRate=");
        builder.append(clientBillRate);
        builder.append(", \nclientOvertimeRate=");
        builder.append(clientOvertimeRate);
        builder.append(", \ncomments=");
        builder.append(comments);
        builder.append(", \ncostCenter=");
        builder.append(costCenter);
        builder.append(", \ndateAdded=");
        builder.append(dateAdded);
        builder.append(", \ndateApproved=");
        builder.append(dateApproved);
        builder.append(", \ndateBegin=");
        builder.append(dateBegin);
        builder.append(", \ndateClientEffective=");
        builder.append(dateClientEffective);
        builder.append(", \ndateEffective=");
        builder.append(dateEffective);
        builder.append(", \ndateEnd=");
        builder.append(dateEnd);
        builder.append(", \ndateLastModified=");
        builder.append(dateLastModified);
        builder.append(", \ndaysGuaranteed=");
        builder.append(daysGuaranteed);
        builder.append(", \ndaysProRated=");
        builder.append(daysProRated);
        builder.append(", \ndurationWeeks=");
        builder.append(durationWeeks);
        builder.append(", \nemployeeType=");
        builder.append(employeeType);
        builder.append(", \nemploymentType=");
        builder.append(employmentType);
        builder.append(", \nfee=");
        builder.append(fee);
        builder.append(", \nhoursOfOperation=");
        builder.append(hoursOfOperation);
        builder.append(", \nhoursPerDay=");
        builder.append(hoursPerDay);
        builder.append(", \nhousingManagerID=");
        builder.append(housingManagerID);
        builder.append(", \nhousingStatus=");
        builder.append(housingStatus);
        builder.append(", \nmigrateGUID=");
        builder.append(migrateGUID);
        builder.append(", \noptionsPackage=");
        builder.append(optionsPackage);
        builder.append(", \notExemption=");
        builder.append(otExemption);
        builder.append(", \notherHourlyFee=");
        builder.append(otherHourlyFee);
        builder.append(", \notherHourlyFeeComments=");
        builder.append(otherHourlyFeeComments);
        builder.append(", \novertimeRate=");
        builder.append(overtimeRate);
        builder.append(", \npayRate=");
        builder.append(payRate);
        builder.append(", \nplacement=");
        builder.append(placement);
        builder.append(", \nrecruitingManagerPercentGrossMargin=");
        builder.append(recruitingManagerPercentGrossMargin);
        builder.append(", \nreferralFee=");
        builder.append(referralFee);
        builder.append(", \nreferralFeeType=");
        builder.append(referralFeeType);
        builder.append(", \nreportTo=");
        builder.append(reportTo);
        builder.append(", \nrequestCustomDate1=");
        builder.append(requestCustomDate1);
        builder.append(", \nrequestCustomDate2=");
        builder.append(requestCustomDate2);
        builder.append(", \nrequestCustomDate3=");
        builder.append(requestCustomDate3);
        builder.append(", \nrequestCustomFloat1=");
        builder.append(requestCustomFloat1);
        builder.append(", \nrequestCustomFloat2=");
        builder.append(requestCustomFloat2);
        builder.append(", \nrequestCustomFloat3=");
        builder.append(requestCustomFloat3);
        builder.append(", \nrequestCustomInt1=");
        builder.append(requestCustomInt1);
        builder.append(", \nrequestCustomInt2=");
        builder.append(requestCustomInt2);
        builder.append(", \nrequestCustomInt3=");
        builder.append(requestCustomInt3);
        builder.append(", \nrequestCustomText1=");
        builder.append(requestCustomText1);
        builder.append(", \nrequestCustomText10=");
        builder.append(requestCustomText10);
        builder.append(", \nrequestCustomText11=");
        builder.append(requestCustomText11);
        builder.append(", \nrequestCustomText12=");
        builder.append(requestCustomText12);
        builder.append(", \nrequestCustomText13=");
        builder.append(requestCustomText13);
        builder.append(", \nrequestCustomText14=");
        builder.append(requestCustomText14);
        builder.append(", \nrequestCustomText15=");
        builder.append(requestCustomText15);
        builder.append(", \nrequestCustomText16=");
        builder.append(requestCustomText16);
        builder.append(", \nrequestCustomText17=");
        builder.append(requestCustomText17);
        builder.append(", \nrequestCustomText18=");
        builder.append(requestCustomText18);
        builder.append(", \nrequestCustomText19=");
        builder.append(requestCustomText19);
        builder.append(", \nrequestCustomText2=");
        builder.append(requestCustomText2);
        builder.append(", \nrequestCustomText20=");
        builder.append(requestCustomText20);
        builder.append(", \nrequestCustomText3=");
        builder.append(requestCustomText3);
        builder.append(", \nrequestCustomText4=");
        builder.append(requestCustomText4);
        builder.append(", \nrequestCustomText5=");
        builder.append(requestCustomText5);
        builder.append(", \nrequestCustomText6=");
        builder.append(requestCustomText6);
        builder.append(", \nrequestCustomText7=");
        builder.append(requestCustomText7);
        builder.append(", \nrequestCustomText8=");
        builder.append(requestCustomText8);
        builder.append(", \nrequestCustomText9=");
        builder.append(requestCustomText9);
        builder.append(", \nrequestCustomTextBlock1=");
        builder.append(requestCustomTextBlock1);
        builder.append(", \nrequestCustomTextBlock2=");
        builder.append(requestCustomTextBlock2);
        builder.append(", \nrequestCustomTextBlock3=");
        builder.append(requestCustomTextBlock3);
        builder.append(", \nrequestCustomTextBlock4=");
        builder.append(requestCustomTextBlock4);
        builder.append(", \nrequestCustomTextBlock5=");
        builder.append(requestCustomTextBlock5);
        builder.append(", \nrequestStatus=");
        builder.append(requestStatus);
        builder.append(", \nrequestType=");
        builder.append(requestType);
        builder.append(", \nrequestingUser=");
        builder.append(requestingUser);
        builder.append(", \nsalary=");
        builder.append(salary);
        builder.append(", \nsalaryUnit=");
        builder.append(salaryUnit);
        builder.append(", \nsalesManagerPercentGrossMargin=");
        builder.append(salesManagerPercentGrossMargin);
        builder.append(", \nstatementClientContact=");
        builder.append(statementClientContact);
        builder.append(", \nstatus=");
        builder.append(status);
        builder.append(", \nterminationReason=");
        builder.append(terminationReason);
        builder.append(", \nvendorClientCorporation=");
        builder.append(vendorClientCorporation);
        builder.append(", \nworkWeekStart=");
        builder.append(workWeekStart);
        builder.append("\n}");
        return builder.toString();
    }

}
