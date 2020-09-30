package com.bullhornsdk.data.model.entity.core.paybill.charge;

import com.bullhornsdk.data.model.entity.core.paybill.CanvasReport;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.PayMasterTransaction;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.util.Objects;

/**
 * Created by mkesmetzis 23-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "batchStatusLookup", "canvasReport", "dateAdded", "accountingDate", "payExportTypeLookup", "payMasterTransactions",
    "payableCharges", "payrollExportTargetLookup", "user"})
public class PayExportBatch extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity {

    private Integer id;
    private SimplifiedOptionsLookup batchStatusLookup;
    private OneToMany<CanvasReport> canvasReport;
    private DateTime dateAdded;
    private DateTime accountingDate;
    private SimplifiedOptionsLookup payExportTypeLookup;
    private OneToMany<PayMasterTransaction> payMasterTransactions;
    private OneToMany<PayableCharge> payableCharges;
    private SimplifiedOptionsLookup payrollExportTargetLookup;
    private CorporateUser user;

    public PayExportBatch() {
    }

    public PayExportBatch(Integer id) {
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

    @JsonProperty("batchStatusLookup")
    public SimplifiedOptionsLookup getBatchStatusLookup() {
        return batchStatusLookup;
    }

    @JsonProperty("batchStatusLookup")
    public void setBatchStatusLookup(SimplifiedOptionsLookup batchStatusLookup) {
        this.batchStatusLookup = batchStatusLookup;
    }

    @JsonProperty("canvasReport")
    public OneToMany<CanvasReport> getCanvasReport() {
        return canvasReport;
    }

    @JsonProperty("canvasReport")
    public void setCanvasReport(OneToMany<CanvasReport> canvasReport) {
        this.canvasReport = canvasReport;
    }

    @JsonProperty("payExportTypeLookup")
    public SimplifiedOptionsLookup getPayExportTypeLookup() {
        return payExportTypeLookup;
    }

    @JsonProperty("payExportTypeLookup")
    public void setPayExportTypeLookup(SimplifiedOptionsLookup payExportTypeLookup) {
        this.payExportTypeLookup = payExportTypeLookup;
    }

    @JsonProperty("payMasterTransactions")
    public OneToMany<PayMasterTransaction> getPayMasterTransactions() {
        return payMasterTransactions;
    }

    @JsonProperty("payMasterTransactions")
    public void setPayMasterTransactions(OneToMany<PayMasterTransaction> payMasterTransactions) {
        this.payMasterTransactions = payMasterTransactions;
    }

    @JsonProperty("payableCharges")
    public OneToMany<PayableCharge> getPayableCharges() {
        return payableCharges;
    }

    @JsonProperty("payableCharges")
    public void setPayableCharges(OneToMany<PayableCharge> payableCharges) {
        this.payableCharges = payableCharges;
    }

    @JsonProperty("payrollExportTargetLookup")
    public SimplifiedOptionsLookup getPayrollExportTargetLookup() {
        return payrollExportTargetLookup;
    }

    @JsonProperty("payrollExportTargetLookup")
    public void setPayrollExportTargetLookup(SimplifiedOptionsLookup payrollExportTargetLookup) {
        this.payrollExportTargetLookup = payrollExportTargetLookup;
    }

    @JsonProperty("user")
    public CorporateUser getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "PayExportBatch{" +
            "id=" + id +
            ", batchStatusLookup=" + batchStatusLookup +
            ", canvasReport=" + canvasReport +
            ", dateAdded=" + dateAdded +
            ", accountingDate=" + accountingDate +
            ", payExportTypeLookup=" + payExportTypeLookup +
            ", payMasterTransactions=" + payMasterTransactions +
            ", payableCharges=" + payableCharges +
            ", payrollExportTargetLookup=" + payrollExportTargetLookup +
            ", user=" + user +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayExportBatch that = (PayExportBatch) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(batchStatusLookup, that.batchStatusLookup) &&
            Objects.equals(canvasReport, that.canvasReport) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(accountingDate, that.accountingDate) &&
            Objects.equals(payExportTypeLookup, that.payExportTypeLookup) &&
            Objects.equals(payMasterTransactions, that.payMasterTransactions) &&
            Objects.equals(payableCharges, that.payableCharges) &&
            Objects.equals(payrollExportTargetLookup, that.payrollExportTargetLookup) &&
            Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, batchStatusLookup, canvasReport, dateAdded, accountingDate, payExportTypeLookup, payMasterTransactions, payableCharges, payrollExportTargetLookup, user);
    }

    @JsonProperty("user")
    public void setUser(CorporateUser user) {
        this.user = user;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("accountingDate")
    public DateTime getAccountingDate() {
        return accountingDate;
    }

    @JsonProperty("accountingDate")
    public void setAccountingDate(DateTime accountingDate) {
        this.accountingDate = accountingDate;
    }


}
