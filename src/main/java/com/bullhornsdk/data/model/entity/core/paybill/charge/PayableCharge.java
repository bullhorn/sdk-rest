package com.bullhornsdk.data.model.entity.core.paybill.charge;

import com.bullhornsdk.data.model.entity.core.paybill.chartofaccounts.*;
import com.bullhornsdk.data.model.entity.core.paybill.master.PayMaster;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SpecializedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.PayableTransaction;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.TransactionStatus;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.TransactionType;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by mkesmetzis 21-Apr-20
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "addedByUser", "canExport", "candidate", "clientCorporation",
    "currencyUnit", "dateAdded", "dateLastModified", "description", "employeeType", "generalLedgerSegment1",
    "generalLedgerSegment2", "generalLedgerSegment3", "generalLedgerSegment4", "generalLedgerSegment5",
    "generalLedgerServiceCode", "jobOrder", "payMasters", "payableTransactions", "periodEndDate", "placement",
    "readyToBillOverride", "status", "subTotal", "transactionStatus", "transactionType"
})
public class PayableCharge extends AbstractEntity implements QueryEntity, UpdateEntity, DateLastModifiedEntity, AssociationEntity, CreateEntity {

    private Integer id;
    private CorporateUser addedByUser;
    private Boolean canExport;
    private Candidate candidate;
    private ClientCorporation clientCorporation;
    private CurrencyUnit currencyUnit;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private String description;
    @Size(max = 30)
    private String employeeType;
    private GeneralLedgerSegment1 generalLedgerSegment1;
    private GeneralLedgerSegment2 generalLedgerSegment2;
    private GeneralLedgerSegment3 generalLedgerSegment3;
    private GeneralLedgerSegment4 generalLedgerSegment4;
    private GeneralLedgerSegment5 generalLedgerSegment5;
    private GeneralLedgerServiceCode generalLedgerServiceCode;
    private JobOrder jobOrder;
    private OneToMany<PayMaster> payMasters;
    private OneToMany<PayableTransaction> payableTransactions;
    private String periodEndDate;
    private Placement placement;
    private Boolean readyToBillOverride;
    private SpecializedOptionsLookup status;
    private BigDecimal subTotal;
    private TransactionStatus transactionStatus;
    private TransactionType transactionType;

    public PayableCharge() {
    }

    public PayableCharge(Integer id) {
        this.id = id;
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


    @JsonProperty("addedByUser")
    public CorporateUser getAddedByUser() {
        return addedByUser;
    }

    @JsonProperty("addedByUser")
    public void setAddedByUser(CorporateUser addedByUser) {
        this.addedByUser = addedByUser;
    }


    @JsonProperty("candidate")
    public Candidate getCandidate() {
        return candidate;
    }

    @JsonProperty("candidate")
    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @JsonProperty("clientCorporation")
    public ClientCorporation getClientCorporation() {
        return clientCorporation;
    }

    @JsonProperty("clientCorporation")
    public void setClientCorporation(ClientCorporation clientCorporation) {
        this.clientCorporation = clientCorporation;
    }

    @JsonProperty("currencyUnit")
    public CurrencyUnit getCurrencyUnit() {
        return currencyUnit;
    }

    @JsonProperty("currencyUnit")
    public void setCurrencyUnit(CurrencyUnit currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    @JsonProperty("canExport")
    public Boolean getCanExport() {
        return canExport;
    }

    @JsonProperty("canExport")
    public void setCanExport(Boolean canExport) {
        this.canExport = canExport;
    }

    @JsonProperty("employeeType")
    public String getEmployeeType() {
        return employeeType;
    }

    @JsonProperty("employeeType")
    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    @JsonProperty("payableTransactions")
    public OneToMany<PayableTransaction> getPayableTransactions() {
        return payableTransactions;
    }

    @JsonProperty("payableTransactions")
    public void setPayableTransactions(OneToMany<PayableTransaction> payableTransactions) {
        this.payableTransactions = payableTransactions;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
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

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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

    @JsonProperty("generalLedgerServiceCode")
    public GeneralLedgerServiceCode getGeneralLedgerServiceCode() {
        return generalLedgerServiceCode;
    }

    @JsonProperty("generalLedgerServiceCode")
    public void setGeneralLedgerServiceCode(GeneralLedgerServiceCode generalLedgerServiceCode) {
        this.generalLedgerServiceCode = generalLedgerServiceCode;
    }

    @JsonProperty("jobOrder")
    public JobOrder getJobOrder() {
        return jobOrder;
    }

    @JsonProperty("jobOrder")
    public void setJobOrder(JobOrder jobOrder) {
        this.jobOrder = jobOrder;
    }

    @JsonProperty("payMasters")
    public OneToMany<PayMaster> getPayMasters() {
        return payMasters;
    }

    @JsonProperty("payMasters")
    public void setPayMasters(OneToMany<PayMaster> payMasters) {
        this.payMasters = payMasters;
    }

    @JsonProperty("periodEndDate")
    public String getPeriodEndDate() {
        return periodEndDate;
    }

    @JsonProperty("periodEndDate")
    public void setPeriodEndDate(String periodEndDate) {
        this.periodEndDate = periodEndDate;
    }

    @JsonProperty("placement")
    public Placement getPlacement() {
        return placement;
    }

    @JsonProperty("placement")
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    @JsonProperty("readyToBillOverride")
    public Boolean getReadyToBillOverride() {
        return readyToBillOverride;
    }

    @JsonProperty("readyToBillOverride")
    public void setReadyToBillOverride(Boolean readyToBillOverride) {
        this.readyToBillOverride = readyToBillOverride;
    }

    @JsonProperty("status")
    public SpecializedOptionsLookup getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(SpecializedOptionsLookup status) {
        this.status = status;
    }

    @JsonProperty("subTotal")
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    @JsonProperty("subTotal")
    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    @JsonProperty("transactionStatus")
    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    @JsonProperty("transactionStatus")
    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    @JsonProperty("transactionType")
    public TransactionType getTransactionType() {
        return transactionType;
    }

    @JsonProperty("transactionType")
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }


    @Override
    public String toString() {
        return "PayableCharge{" +
            "id=" + id +
            ", addedByUser=" + addedByUser +
            ", canExport=" + canExport +
            ", candidate=" + candidate +
            ", clientCorporation=" + clientCorporation +
            ", currencyUnit=" + currencyUnit +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", description='" + description + '\'' +
            ", employeeType='" + employeeType + '\'' +
            ", generalLedgerSegment1=" + generalLedgerSegment1 +
            ", generalLedgerSegment2=" + generalLedgerSegment2 +
            ", generalLedgerSegment3=" + generalLedgerSegment3 +
            ", generalLedgerSegment4=" + generalLedgerSegment4 +
            ", generalLedgerSegment5=" + generalLedgerSegment5 +
            ", generalLedgerServiceCode=" + generalLedgerServiceCode +
            ", jobOrder=" + jobOrder +
            ", payMasters=" + payMasters +
            ", payableTransactions=" + payableTransactions +
            ", periodEndDate='" + periodEndDate + '\'' +
            ", placement=" + placement +
            ", readyToBillOverride=" + readyToBillOverride +
            ", status=" + status +
            ", subTotal=" + subTotal +
            ", transactionStatus=" + transactionStatus +
            ", transactionType=" + transactionType +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayableCharge that = (PayableCharge) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(addedByUser, that.addedByUser) &&
            Objects.equals(canExport, that.canExport) &&
            Objects.equals(candidate, that.candidate) &&
            Objects.equals(clientCorporation, that.clientCorporation) &&
            Objects.equals(currencyUnit, that.currencyUnit) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(description, that.description) &&
            Objects.equals(employeeType, that.employeeType) &&
            Objects.equals(generalLedgerSegment1, that.generalLedgerSegment1) &&
            Objects.equals(generalLedgerSegment2, that.generalLedgerSegment2) &&
            Objects.equals(generalLedgerSegment3, that.generalLedgerSegment3) &&
            Objects.equals(generalLedgerSegment4, that.generalLedgerSegment4) &&
            Objects.equals(generalLedgerSegment5, that.generalLedgerSegment5) &&
            Objects.equals(generalLedgerServiceCode, that.generalLedgerServiceCode) &&
            Objects.equals(jobOrder, that.jobOrder) &&
            Objects.equals(payMasters, that.payMasters) &&
            Objects.equals(payableTransactions, that.payableTransactions) &&
            Objects.equals(periodEndDate, that.periodEndDate) &&
            Objects.equals(placement, that.placement) &&
            Objects.equals(readyToBillOverride, that.readyToBillOverride) &&
            Objects.equals(status, that.status) &&
            Objects.equals(subTotal, that.subTotal) &&
            Objects.equals(transactionStatus, that.transactionStatus) &&
            Objects.equals(transactionType, that.transactionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addedByUser, canExport, candidate, clientCorporation, currencyUnit, dateAdded, dateLastModified, description, employeeType, generalLedgerSegment1, generalLedgerSegment2, generalLedgerSegment3, generalLedgerSegment4, generalLedgerSegment5, generalLedgerServiceCode, jobOrder, payMasters, payableTransactions, periodEndDate, placement, readyToBillOverride, status, subTotal, transactionStatus, transactionType);
    }

}
