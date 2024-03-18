package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "alternateWorkSchedule", "approvalMethod", "backupExpenseApproverEmail", "backupExpenseApproverFName", "backupExpenseApproverLName", "backupNoBillExpenseApproverEmail", "backupNoBillExpenseApproverFirstName", "backupNoBillExpenseApproverLastName", "branding", "clientDepartmentCode", "clockMapping", "departmentAbbr", "departmentMapping", "departmentName", "dtBillingFactor", "employeeBadge", "employeeCPAFlag", "employeeOtType", "expenseApproverEmail", "expenseApproverFName", "expenseApproverLName", "expenseIndicator", "inOutIndicator", "noBillExpenseApproverEmail", "noBillExpenseApproverFirstName", "noBillExpenseApproverLastName", "payRules", "proxyCPAFlag", "rounding", "timeAndExpenseBranch", "timeAndExpenseSource", "vmsAssignmentNumber", "vmsCostCenter", "vmsEmployeeID", "vmsRequisitionID", "timeAndLaborEnabledDate" })
public class PlacementTimeAndExpense extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {

    private Integer id;

    @Size(max = 50)
    private String alternateWorkSchedule;

    @Size(max = 32)
    private String approvalMethod;

    @Size(max = 132)
    private String backupExpenseApproverEmail;

    @Size(max = 20)
    private String backupExpenseApproverFName;

    @Size(max = 20)
    private String backupExpenseApproverLName;

    @Size(max = 132)
    private String backupNoBillExpenseApproverEmail;

    @Size(max = 20)
    private String backupNoBillExpenseApproverFirstName;

    @Size(max = 20)
    private String backupNoBillExpenseApproverLastName;

    @Size(max = 32)
    private String branding;

    @Size(max = 100)
    private String clientDepartmentCode;

    @Size(max = 32)
    private String clockMapping;

    @Size(max = 8)
    private String departmentAbbr;

    @Size(max = 100)
    private String departmentMapping;

    @Size(max = 30)
    private String departmentName;

    private BigDecimal dtBillingFactor;

    private Integer employeeBadge;

    @Size(max = 1)
    private String employeeCPAFlag;

    private Integer employeeOtType;

    @Size(max = 132)
    private String expenseApproverEmail;

    @Size(max = 20)
    private String expenseApproverFName;

    @Size(max = 20)
    private String expenseApproverLName;

    @Size(max = 1)
    private String expenseIndicator;

    @Size(max = 1)
    private String inOutIndicator;

    @Size(max = 132)
    private String noBillExpenseApproverEmail;

    @Size(max = 20)
    private String noBillExpenseApproverFirstName;

    @Size(max = 20)
    private String noBillExpenseApproverLastName;

    @Size(max = 50)
    private String payRules;

    @Size(max = 1)
    private String proxyCPAFlag;

    @Size(max = 10)
    private String rounding;

    @Size(max = 32)
    private String timeAndExpenseBranch;

    @Size(max = 1)
    private String timeAndExpenseSource;

    @Size(max = 32)
    private String vmsAssignmentNumber;

    @Size(max = 32)
    private String vmsCostCenter;

    @Size(max = 20)
    private String vmsEmployeeID;

    @Size(max = 32)
    private String vmsRequisitionID;

    @Getter
    @Setter
    @JsonProperty("timeAndLaborEnabledDate")
    private DateTime timeAndLaborEnabledDate;

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

    @JsonProperty("alternateWorkSchedule")
    public String getAlternateWorkSchedule() {
        return alternateWorkSchedule;
    }

    @JsonProperty("alternateWorkSchedule")
    public void setAlternateWorkSchedule(String alternateWorkSchedule) {
        this.alternateWorkSchedule = alternateWorkSchedule;
    }

    @JsonProperty("approvalMethod")
    public String getApprovalMethod() {
        return approvalMethod;
    }

    @JsonProperty("approvalMethod")
    public void setApprovalMethod(String approvalMethod) {
        this.approvalMethod = approvalMethod;
    }

    @JsonProperty("backupExpenseApproverEmail")
    public String getBackupExpenseApproverEmail() {
        return backupExpenseApproverEmail;
    }

    @JsonProperty("backupExpenseApproverEmail")
    public void setBackupExpenseApproverEmail(String backupExpenseApproverEmail) {
        this.backupExpenseApproverEmail = backupExpenseApproverEmail;
    }

    @JsonProperty("backupExpenseApproverFName")
    public String getBackupExpenseApproverFName() {
        return backupExpenseApproverFName;
    }

    @JsonProperty("backupExpenseApproverFName")
    public void setBackupExpenseApproverFName(String backupExpenseApproverFName) {
        this.backupExpenseApproverFName = backupExpenseApproverFName;
    }

    @JsonProperty("backupExpenseApproverLName")
    public String getBackupExpenseApproverLName() {
        return backupExpenseApproverLName;
    }

    @JsonProperty("backupExpenseApproverLName")
    public void setBackupExpenseApproverLName(String backupExpenseApproverLName) {
        this.backupExpenseApproverLName = backupExpenseApproverLName;
    }

    @JsonProperty("backupNoBillExpenseApproverEmail")
    public String getBackupNoBillExpenseApproverEmail() {
        return backupNoBillExpenseApproverEmail;
    }

    @JsonProperty("backupNoBillExpenseApproverEmail")
    public void setBackupNoBillExpenseApproverEmail(String backupNoBillExpenseApproverEmail) {
        this.backupNoBillExpenseApproverEmail = backupNoBillExpenseApproverEmail;
    }

    @JsonProperty("backupNoBillExpenseApproverFirstName")
    public String getBackupNoBillExpenseApproverFirstName() {
        return backupNoBillExpenseApproverFirstName;
    }

    @JsonProperty("backupNoBillExpenseApproverFirstName")
    public void setBackupNoBillExpenseApproverFirstName(String backupNoBillExpenseApproverFirstName) {
        this.backupNoBillExpenseApproverFirstName = backupNoBillExpenseApproverFirstName;
    }

    @JsonProperty("backupNoBillExpenseApproverLastName")
    public String getBackupNoBillExpenseApproverLastName() {
        return backupNoBillExpenseApproverLastName;
    }

    @JsonProperty("backupNoBillExpenseApproverLastName")
    public void setBackupNoBillExpenseApproverLastName(String backupNoBillExpenseApproverLastName) {
        this.backupNoBillExpenseApproverLastName = backupNoBillExpenseApproverLastName;
    }

    @JsonProperty("branding")
    public String getBranding() {
        return branding;
    }

    @JsonProperty("branding")
    public void setBranding(String branding) {
        this.branding = branding;
    }

    @JsonProperty("clientDepartmentCode")
    public String getClientDepartmentCode() {
        return clientDepartmentCode;
    }

    @JsonProperty("clientDepartmentCode")
    public void setClientDepartmentCode(String clientDepartmentCode) {
        this.clientDepartmentCode = clientDepartmentCode;
    }

    @JsonProperty("clockMapping")
    public String getClockMapping() {
        return clockMapping;
    }

    @JsonProperty("clockMapping")
    public void setClockMapping(String clockMapping) {
        this.clockMapping = clockMapping;
    }

    @JsonProperty("departmentAbbr")
    public String getDepartmentAbbr() {
        return departmentAbbr;
    }

    @JsonProperty("departmentAbbr")
    public void setDepartmentAbbr(String departmentAbbr) {
        this.departmentAbbr = departmentAbbr;
    }

    @JsonProperty("departmentMapping")
    public String getDepartmentMapping() {
        return departmentMapping;
    }

    @JsonProperty("departmentMapping")
    public void setDepartmentMapping(String departmentMapping) {
        this.departmentMapping = departmentMapping;
    }

    @JsonProperty("departmentName")
    public String getDepartmentName() {
        return departmentName;
    }

    @JsonProperty("departmentName")
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @JsonProperty("dtBillingFactor")
    public BigDecimal getDtBillingFactor() {
        return dtBillingFactor;
    }

    @JsonProperty("dtBillingFactor")
    public void setDtBillingFactor(BigDecimal dtBillingFactor) {
        this.dtBillingFactor = dtBillingFactor;
    }

    @JsonProperty("employeeBadge")
    public Integer getEmployeeBadge() {
        return employeeBadge;
    }

    @JsonProperty("employeeBadge")
    public void setEmployeeBadge(Integer employeeBadge) {
        this.employeeBadge = employeeBadge;
    }

    @JsonProperty("employeeCPAFlag")
    public String getEmployeeCPAFlag() {
        return employeeCPAFlag;
    }

    @JsonProperty("employeeCPAFlag")
    public void setEmployeeCPAFlag(String employeeCPAFlag) {
        this.employeeCPAFlag = employeeCPAFlag;
    }

    @JsonProperty("employeeOtType")
    public Integer getEmployeeOtType() {
        return employeeOtType;
    }

    @JsonProperty("employeeOtType")
    public void setEmployeeOtType(Integer employeeOtType) {
        this.employeeOtType = employeeOtType;
    }

    @JsonProperty("expenseApproverEmail")
    public String getExpenseApproverEmail() {
        return expenseApproverEmail;
    }

    @JsonProperty("expenseApproverEmail")
    public void setExpenseApproverEmail(String expenseApproverEmail) {
        this.expenseApproverEmail = expenseApproverEmail;
    }

    @JsonProperty("expenseApproverFName")
    public String getExpenseApproverFName() {
        return expenseApproverFName;
    }

    @JsonProperty("expenseApproverFName")
    public void setExpenseApproverFName(String expenseApproverFName) {
        this.expenseApproverFName = expenseApproverFName;
    }

    @JsonProperty("expenseApproverLName")
    public String getExpenseApproverLName() {
        return expenseApproverLName;
    }

    @JsonProperty("expenseApproverLName")
    public void setExpenseApproverLName(String expenseApproverLName) {
        this.expenseApproverLName = expenseApproverLName;
    }

    @JsonProperty("expenseIndicator")
    public String getExpenseIndicator() {
        return expenseIndicator;
    }

    @JsonProperty("expenseIndicator")
    public void setExpenseIndicator(String expenseIndicator) {
        this.expenseIndicator = expenseIndicator;
    }

    @JsonProperty("inOutIndicator")
    public String getInOutIndicator() {
        return inOutIndicator;
    }

    @JsonProperty("inOutIndicator")
    public void setInOutIndicator(String inOutIndicator) {
        this.inOutIndicator = inOutIndicator;
    }

    @JsonProperty("noBillExpenseApproverEmail")
    public String getNoBillExpenseApproverEmail() {
        return noBillExpenseApproverEmail;
    }

    @JsonProperty("noBillExpenseApproverEmail")
    public void setNoBillExpenseApproverEmail(String noBillExpenseApproverEmail) {
        this.noBillExpenseApproverEmail = noBillExpenseApproverEmail;
    }

    @JsonProperty("noBillExpenseApproverFirstName")
    public String getNoBillExpenseApproverFirstName() {
        return noBillExpenseApproverFirstName;
    }

    @JsonProperty("noBillExpenseApproverFirstName")
    public void setNoBillExpenseApproverFirstName(String noBillExpenseApproverFirstName) {
        this.noBillExpenseApproverFirstName = noBillExpenseApproverFirstName;
    }

    @JsonProperty("noBillExpenseApproverLastName")
    public String getNoBillExpenseApproverLastName() {
        return noBillExpenseApproverLastName;
    }

    @JsonProperty("noBillExpenseApproverLastName")
    public void setNoBillExpenseApproverLastName(String noBillExpenseApproverLastName) {
        this.noBillExpenseApproverLastName = noBillExpenseApproverLastName;
    }

    @JsonProperty("payRules")
    public String getPayRules() {
        return payRules;
    }

    @JsonProperty("payRules")
    public void setPayRules(String payRules) {
        this.payRules = payRules;
    }

    @JsonProperty("proxyCPAFlag")
    public String getProxyCPAFlag() {
        return proxyCPAFlag;
    }

    @JsonProperty("proxyCPAFlag")
    public void setProxyCPAFlag(String proxyCPAFlag) {
        this.proxyCPAFlag = proxyCPAFlag;
    }

    @JsonProperty("rounding")
    public String getRounding() {
        return rounding;
    }

    @JsonProperty("rounding")
    public void setRounding(String rounding) {
        this.rounding = rounding;
    }

    @JsonProperty("timeAndExpenseBranch")
    public String getTimeAndExpenseBranch() {
        return timeAndExpenseBranch;
    }

    @JsonProperty("timeAndExpenseBranch")
    public void setTimeAndExpenseBranch(String timeAndExpenseBranch) {
        this.timeAndExpenseBranch = timeAndExpenseBranch;
    }

    @JsonProperty("timeAndExpenseSource")
    public String getTimeAndExpenseSource() {
        return timeAndExpenseSource;
    }

    @JsonProperty("timeAndExpenseSource")
    public void setTimeAndExpenseSource(String timeAndExpenseSource) {
        this.timeAndExpenseSource = timeAndExpenseSource;
    }

    @JsonProperty("vmsAssignmentNumber")
    public String getVmsAssignmentNumber() {
        return vmsAssignmentNumber;
    }

    @JsonProperty("vmsAssignmentNumber")
    public void setVmsAssignmentNumber(String vmsAssignmentNumber) {
        this.vmsAssignmentNumber = vmsAssignmentNumber;
    }

    @JsonProperty("vmsCostCenter")
    public String getVmsCostCenter() {
        return vmsCostCenter;
    }

    @JsonProperty("vmsCostCenter")
    public void setVmsCostCenter(String vmsCostCenter) {
        this.vmsCostCenter = vmsCostCenter;
    }

    @JsonProperty("vmsEmployeeID")
    public String getVmsEmployeeID() {
        return vmsEmployeeID;
    }

    @JsonProperty("vmsEmployeeID")
    public void setVmsEmployeeID(String vmsEmployeeID) {
        this.vmsEmployeeID = vmsEmployeeID;
    }

    @JsonProperty("vmsRequisitionID")
    public String getVmsRequisitionID() {
        return vmsRequisitionID;
    }

    @JsonProperty("vmsRequisitionID")
    public void setVmsRequisitionID(String vmsRequisitionID) {
        this.vmsRequisitionID = vmsRequisitionID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlacementTimeAndExpense that = (PlacementTimeAndExpense) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(alternateWorkSchedule, that.alternateWorkSchedule) &&
            Objects.equals(approvalMethod, that.approvalMethod) &&
            Objects.equals(backupExpenseApproverEmail, that.backupExpenseApproverEmail) &&
            Objects.equals(backupExpenseApproverFName, that.backupExpenseApproverFName) &&
            Objects.equals(backupExpenseApproverLName, that.backupExpenseApproverLName) &&
            Objects.equals(backupNoBillExpenseApproverEmail, that.backupNoBillExpenseApproverEmail) &&
            Objects.equals(backupNoBillExpenseApproverFirstName, that.backupNoBillExpenseApproverFirstName) &&
            Objects.equals(backupNoBillExpenseApproverLastName, that.backupNoBillExpenseApproverLastName) &&
            Objects.equals(branding, that.branding) &&
            Objects.equals(clientDepartmentCode, that.clientDepartmentCode) &&
            Objects.equals(clockMapping, that.clockMapping) &&
            Objects.equals(departmentAbbr, that.departmentAbbr) &&
            Objects.equals(departmentMapping, that.departmentMapping) &&
            Objects.equals(departmentName, that.departmentName) &&
            Objects.equals(dtBillingFactor, that.dtBillingFactor) &&
            Objects.equals(employeeBadge, that.employeeBadge) &&
            Objects.equals(employeeCPAFlag, that.employeeCPAFlag) &&
            Objects.equals(employeeOtType, that.employeeOtType) &&
            Objects.equals(expenseApproverEmail, that.expenseApproverEmail) &&
            Objects.equals(expenseApproverFName, that.expenseApproverFName) &&
            Objects.equals(expenseApproverLName, that.expenseApproverLName) &&
            Objects.equals(expenseIndicator, that.expenseIndicator) &&
            Objects.equals(inOutIndicator, that.inOutIndicator) &&
            Objects.equals(noBillExpenseApproverEmail, that.noBillExpenseApproverEmail) &&
            Objects.equals(noBillExpenseApproverFirstName, that.noBillExpenseApproverFirstName) &&
            Objects.equals(noBillExpenseApproverLastName, that.noBillExpenseApproverLastName) &&
            Objects.equals(payRules, that.payRules) &&
            Objects.equals(proxyCPAFlag, that.proxyCPAFlag) &&
            Objects.equals(rounding, that.rounding) &&
            Objects.equals(timeAndExpenseBranch, that.timeAndExpenseBranch) &&
            Objects.equals(timeAndExpenseSource, that.timeAndExpenseSource) &&
            Objects.equals(vmsAssignmentNumber, that.vmsAssignmentNumber) &&
            Objects.equals(vmsCostCenter, that.vmsCostCenter) &&
            Objects.equals(vmsEmployeeID, that.vmsEmployeeID) &&
            Objects.equals(vmsRequisitionID, that.vmsRequisitionID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, alternateWorkSchedule, approvalMethod, backupExpenseApproverEmail, backupExpenseApproverFName, backupExpenseApproverLName, backupNoBillExpenseApproverEmail, backupNoBillExpenseApproverFirstName, backupNoBillExpenseApproverLastName, branding, clientDepartmentCode, clockMapping, departmentAbbr, departmentMapping, departmentName, dtBillingFactor, employeeBadge, employeeCPAFlag, employeeOtType, expenseApproverEmail, expenseApproverFName, expenseApproverLName, expenseIndicator, inOutIndicator, noBillExpenseApproverEmail, noBillExpenseApproverFirstName, noBillExpenseApproverLastName, payRules, proxyCPAFlag, rounding, timeAndExpenseBranch, timeAndExpenseSource, vmsAssignmentNumber, vmsCostCenter, vmsEmployeeID, vmsRequisitionID);
    }

    @Override
    public String toString() {
        return "PlacementTimeAndExpense{" +
            "id=" + id +
            ", alternateWorkSchedule='" + alternateWorkSchedule + '\'' +
            ", approvalMethod='" + approvalMethod + '\'' +
            ", backupExpenseApproverEmail='" + backupExpenseApproverEmail + '\'' +
            ", backupExpenseApproverFName='" + backupExpenseApproverFName + '\'' +
            ", backupExpenseApproverLName='" + backupExpenseApproverLName + '\'' +
            ", backupNoBillExpenseApproverEmail='" + backupNoBillExpenseApproverEmail + '\'' +
            ", backupNoBillExpenseApproverFirstName='" + backupNoBillExpenseApproverFirstName + '\'' +
            ", backupNoBillExpenseApproverLastName='" + backupNoBillExpenseApproverLastName + '\'' +
            ", branding='" + branding + '\'' +
            ", clientDepartmentCode='" + clientDepartmentCode + '\'' +
            ", clockMapping='" + clockMapping + '\'' +
            ", departmentAbbr='" + departmentAbbr + '\'' +
            ", departmentMapping='" + departmentMapping + '\'' +
            ", departmentName='" + departmentName + '\'' +
            ", dtBillingFactor=" + dtBillingFactor +
            ", employeeBadge=" + employeeBadge +
            ", employeeCPAFlag='" + employeeCPAFlag + '\'' +
            ", employeeOtType=" + employeeOtType +
            ", expenseApproverEmail='" + expenseApproverEmail + '\'' +
            ", expenseApproverFName='" + expenseApproverFName + '\'' +
            ", expenseApproverLName='" + expenseApproverLName + '\'' +
            ", expenseIndicator='" + expenseIndicator + '\'' +
            ", inOutIndicator='" + inOutIndicator + '\'' +
            ", noBillExpenseApproverEmail='" + noBillExpenseApproverEmail + '\'' +
            ", noBillExpenseApproverFirstName='" + noBillExpenseApproverFirstName + '\'' +
            ", noBillExpenseApproverLastName='" + noBillExpenseApproverLastName + '\'' +
            ", payRules='" + payRules + '\'' +
            ", proxyCPAFlag='" + proxyCPAFlag + '\'' +
            ", rounding='" + rounding + '\'' +
            ", timeAndExpenseBranch='" + timeAndExpenseBranch + '\'' +
            ", timeAndExpenseSource='" + timeAndExpenseSource + '\'' +
            ", vmsAssignmentNumber='" + vmsAssignmentNumber + '\'' +
            ", vmsCostCenter='" + vmsCostCenter + '\'' +
            ", vmsEmployeeID='" + vmsEmployeeID + '\'' +
            ", vmsRequisitionID='" + vmsRequisitionID + '\'' +
            '}';
    }
}
