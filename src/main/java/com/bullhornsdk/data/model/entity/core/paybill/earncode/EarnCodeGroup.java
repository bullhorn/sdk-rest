package com.bullhornsdk.data.model.entity.core.paybill.earncode;

import com.bullhornsdk.data.model.entity.core.paybill.generalledger.*;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsA;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created by onaumov 06-Oct-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "accruesOT", "allowForSelfService", "chargeTypeLookup", "dateAdded", "dateLastModified", "defaultEarnCode",
    "earnCodeGroupStatusLookup", "isTaxable", "overtimeEarnCode", "payBillOptionsLookup", "unitOfMeasure"})
public class EarnCodeGroup extends CustomFieldsA implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity, EditHistoryEntity {

    private Integer id;
    private Boolean accruesOT;
    private Boolean allowForSelfService;
    private SimplifiedOptionsLookup chargeTypeLookup;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private EarnCode defaultEarnCode;
    private EarnCode doubleTimeEarnCode;
    private SimplifiedOptionsLookup earnCodeGroupStatusLookup;
    private Boolean isTaxable;
    private EarnCode overtimeEarnCode;
    private SimplifiedOptionsLookup payBillOptionsLookup;
    private SimplifiedOptionsLookup unitOfMeasure;

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

    @JsonProperty("accruesOT")
    public Boolean getAccruesOT() {
        return accruesOT;
    }

    @JsonProperty("accruesOT")
    public void setAccruesOT(Boolean accruesOT) {
        this.accruesOT = accruesOT;
    }

    @JsonProperty("allowForSelfService")
    public Boolean getAllowForSelfService() {
        return allowForSelfService;
    }

    @JsonProperty("allowForSelfService")
    public void setAllowForSelfService(Boolean allowForSelfService) {
        this.allowForSelfService = allowForSelfService;
    }

    @JsonProperty("chargeTypeLookup")
    public SimplifiedOptionsLookup getChargeTypeLookup() {
        return chargeTypeLookup;
    }

    @JsonProperty("chargeTypeLookup")
    public void setChargeTypeLookup(SimplifiedOptionsLookup chargeTypeLookup) {
        this.chargeTypeLookup = chargeTypeLookup;
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

    @JsonProperty("defaultEarnCode")
    public EarnCode getDefaultEarnCode() {
        return defaultEarnCode;
    }

    @JsonProperty("defaultEarnCode")
    public void setDefaultEarnCode(EarnCode defaultEarnCode) {
        this.defaultEarnCode = defaultEarnCode;
    }

    @JsonProperty("doubleTimeEarnCode")
    public EarnCode getDoubleTimeEarnCode() {
        return doubleTimeEarnCode;
    }

    @JsonProperty("doubleTimeEarnCode")
    public void setDoubleTimeEarnCode(EarnCode doubleTimeEarnCode) {
        this.doubleTimeEarnCode = doubleTimeEarnCode;
    }

    @JsonProperty("earnCodeGroupStatusLookup")
    public SimplifiedOptionsLookup getEarnCodeGroupStatusLookup() {
        return earnCodeGroupStatusLookup;
    }

    @JsonProperty("earnCodeGroupStatusLookup")
    public void setEarnCodeGroupStatusLookup(SimplifiedOptionsLookup earnCodeGroupStatusLookup) {
        this.earnCodeGroupStatusLookup = earnCodeGroupStatusLookup;
    }

    @JsonProperty("isTaxable")
    public Boolean getTaxable() {
        return isTaxable;
    }

    @JsonProperty("isTaxable")
    public void setTaxable(Boolean taxable) {
        isTaxable = taxable;
    }

    @JsonProperty("overtimeEarnCode")
    public EarnCode getOvertimeEarnCode() {
        return overtimeEarnCode;
    }

    @JsonProperty("overtimeEarnCode")
    public void setOvertimeEarnCode(EarnCode overtimeEarnCode) {
        this.overtimeEarnCode = overtimeEarnCode;
    }

    @JsonProperty("payBillOptionsLookup")
    public SimplifiedOptionsLookup getPayBillOptionsLookup() {
        return payBillOptionsLookup;
    }

    @JsonProperty("payBillOptionsLookup")
    public void setPayBillOptionsLookup(SimplifiedOptionsLookup payBillOptionsLookup) {
        this.payBillOptionsLookup = payBillOptionsLookup;
    }

    @JsonProperty("unitOfMeasure")
    public SimplifiedOptionsLookup getUnitOfMeasure() {
        return unitOfMeasure;
    }

    @JsonProperty("unitOfMeasure")
    public void setUnitOfMeasure(SimplifiedOptionsLookup unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EarnCodeGroup earnCodeGroup = (EarnCodeGroup) o;
        return Objects.equals(id, earnCodeGroup.id) &&
            Objects.equals(accruesOT, earnCodeGroup.accruesOT) &&
            Objects.equals(allowForSelfService, earnCodeGroup.allowForSelfService) &&
            Objects.equals(chargeTypeLookup, earnCodeGroup.chargeTypeLookup) &&
            Objects.equals(dateAdded, earnCodeGroup.dateAdded) &&
            Objects.equals(dateLastModified, earnCodeGroup.dateLastModified) &&
            Objects.equals(defaultEarnCode, earnCodeGroup.defaultEarnCode) &&
            Objects.equals(doubleTimeEarnCode, earnCodeGroup.doubleTimeEarnCode) &&
            Objects.equals(earnCodeGroupStatusLookup, earnCodeGroup.earnCodeGroupStatusLookup) &&
            Objects.equals(isTaxable, earnCodeGroup.isTaxable) &&
            Objects.equals(overtimeEarnCode, earnCodeGroup.overtimeEarnCode) &&
            Objects.equals(payBillOptionsLookup, earnCodeGroup.payBillOptionsLookup) &&
            Objects.equals(unitOfMeasure, earnCodeGroup.unitOfMeasure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, accruesOT, allowForSelfService, chargeTypeLookup, dateAdded, dateLastModified, defaultEarnCode, doubleTimeEarnCode, earnCodeGroupStatusLookup, isTaxable, overtimeEarnCode, payBillOptionsLookup, unitOfMeasure);
    }

    @Override
    public String toString() {
        return "EarnCodeGroup{" +
            "id=" + id +
            ", accruesOT=" + accruesOT +
            ", allowForSelfService=" + allowForSelfService +
            ", chargeTypeLookup=" + chargeTypeLookup +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", defaultEarnCode=" + defaultEarnCode +
            ", doubleTimeEarnCode=" + doubleTimeEarnCode +
            ", earnCodeGroupStatusLookup=" + earnCodeGroupStatusLookup +
            ", isTaxable=" + isTaxable +
            ", overtimeEarnCode=" + overtimeEarnCode +
            ", payBillOptionsLookup=" + payBillOptionsLookup +
            ", unitOfMeasure=" + unitOfMeasure +
            '}';
    }
}
