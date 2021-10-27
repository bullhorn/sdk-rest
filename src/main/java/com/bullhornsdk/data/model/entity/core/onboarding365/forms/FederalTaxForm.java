package com.bullhornsdk.data.model.entity.core.onboarding365.forms;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsE;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by dhuber 27-Oct-21
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "candidate", "customDate1", "customDate2", "customDate3", "customDate4", "customDate5",
    "customInt1", "customInt2", "customInt3", "customInt4", "customInt5", "customMoney1", "customMoney2", "customMoney3", "customMoney4", "customMoney5",
    "customText1", "customText2", "customText3", "customText4", "customText5", "customText6", "customText7", "customText8", "customText9", "customText10",
    "dateAdded", "dateLastModified", "federalAdditionalWithholdingsAmount", "federalExemptions", "federalExtraWithholdingAmount", "federalFilingStatus",
    "isDeleted", "isExempt", "otherDeductionsAmount", "otherIncomeAmount", "totalDependentClaimAmount", "twoJobs"})
public class FederalTaxForm extends CustomFieldsE implements QueryEntity {

    private Integer id;

    private Candidate candidate;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    private Boolean isDeleted;

    private Boolean isExempt;

    private BigDecimal federalAdditionalWithholdingsAmount;

    private Integer federalExemptions;

    private BigDecimal federalExtraWithholdingAmount;

    @JsonIgnore
    @Size(max = 10)
    private String federalFilingStatus;

    private BigDecimal otherDeductionsAmount;

    private BigDecimal otherIncomeAmount;

    private BigDecimal totalDependentClaimAmount;

    private Boolean twoJobs;

    public FederalTaxForm() {
    }

    public FederalTaxForm(Integer id) {
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

    @JsonProperty("candidate")
    public Candidate getCandidate() {
        return candidate;
    }

    @JsonProperty("candidate")
    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
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

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("isDeleted")
    public Boolean getDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @JsonProperty("isExempt")
    public Boolean getExempt() {
        return isExempt;
    }

    @JsonProperty("isExempt")
    public void setExempt(Boolean exempt) {
        isExempt = exempt;
    }

    @JsonProperty("federalAdditionalWithholdingsAmount")
    public BigDecimal getFederalAdditionalWithholdingsAmount() {
        return federalAdditionalWithholdingsAmount;
    }

    @JsonProperty("federalAdditionalWithholdingsAmount")
    public void setFederalAdditionalWithholdingsAmount(BigDecimal federalAdditionalWithholdingsAmount) {
        this.federalAdditionalWithholdingsAmount = federalAdditionalWithholdingsAmount;
    }

    @JsonProperty("federalExemptions")
    public Integer getFederalExemptions() {
        return federalExemptions;
    }

    @JsonProperty("federalExemptions")
    public void setFederalExemptions(Integer federalExemptions) {
        this.federalExemptions = federalExemptions;
    }

    @JsonProperty("federalExtraWithholdingAmount")
    public BigDecimal getFederalExtraWithholdingAmount() {
        return federalExtraWithholdingAmount;
    }

    @JsonProperty("federalExtraWithholdingAmount")
    public void setFederalExtraWithholdingAmount(BigDecimal federalExtraWithholdingAmount) {
        this.federalExtraWithholdingAmount = federalExtraWithholdingAmount;
    }

    @JsonProperty("federalFilingStatus")
    public String getFederalFilingStatus() {
        return federalFilingStatus;
    }

    @JsonProperty("federalFilingStatus")
    public void setFederalFilingStatus(String federalFilingStatus) {
        this.federalFilingStatus = federalFilingStatus;
    }

    @JsonProperty("otherDeductionsAmount")
    public BigDecimal getOtherDeductionsAmount() {
        return otherDeductionsAmount;
    }

    @JsonProperty("otherDeductionsAmount")
    public void setOtherDeductionsAmount(BigDecimal otherDeductionsAmount) {
        this.otherDeductionsAmount = otherDeductionsAmount;
    }

    @JsonProperty("otherIncomeAmount")
    public BigDecimal getOtherIncomeAmount() {
        return otherIncomeAmount;
    }

    @JsonProperty("otherIncomeAmount")
    public void setOtherIncomeAmount(BigDecimal otherIncomeAmount) {
        this.otherIncomeAmount = otherIncomeAmount;
    }

    @JsonProperty("totalDependentClaimAmount")
    public BigDecimal getTotalDependentClaimAmount() {
        return totalDependentClaimAmount;
    }

    @JsonProperty("totalDependentClaimAmount")
    public void setTotalDependentClaimAmount(BigDecimal totalDependentClaimAmount) {
        this.totalDependentClaimAmount = totalDependentClaimAmount;
    }

    @JsonProperty("twoJobs")
    public Boolean getTwoJobs() {
        return twoJobs;
    }

    @JsonProperty("twoJobs")
    public void setTwoJobs(Boolean twoJobs) {
        this.twoJobs = twoJobs;
    }

    @Override
    public String toString() {
        return "FederalTaxForm{" +
            "id=" + id +
            ", candidate=" + candidate +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", isDeleted=" + isDeleted +
            ", isExempt=" + isExempt +
            ", federalAdditionalWithholdingsAmount=" + federalAdditionalWithholdingsAmount +
            ", federalExemptions=" + federalExemptions +
            ", federalExtraWithholdingAmount=" + federalExtraWithholdingAmount +
            ", federalFilingStatus='" + federalFilingStatus + '\'' +
            ", otherDeductionsAmount=" + otherDeductionsAmount +
            ", otherIncomeAmount=" + otherIncomeAmount +
            ", totalDependentClaimAmount=" + totalDependentClaimAmount +
            ", twoJobs=" + twoJobs +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FederalTaxForm that = (FederalTaxForm) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(candidate, that.candidate) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(isDeleted, that.isDeleted) &&
            Objects.equals(isExempt, that.isExempt) &&
            Objects.equals(federalAdditionalWithholdingsAmount, that.federalAdditionalWithholdingsAmount) &&
            Objects.equals(federalExemptions, that.federalExemptions) &&
            Objects.equals(federalExtraWithholdingAmount, that.federalExtraWithholdingAmount) &&
            Objects.equals(federalFilingStatus, that.federalFilingStatus) &&
            Objects.equals(otherDeductionsAmount, that.otherDeductionsAmount) &&
            Objects.equals(otherIncomeAmount, that.otherIncomeAmount) &&
            Objects.equals(totalDependentClaimAmount, that.totalDependentClaimAmount) &&
            Objects.equals(twoJobs, that.twoJobs);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), id, candidate, dateAdded, dateLastModified, isDeleted, isExempt, federalAdditionalWithholdingsAmount, federalExemptions, federalExtraWithholdingAmount, federalFilingStatus, otherDeductionsAmount, otherIncomeAmount, totalDependentClaimAmount, twoJobs);
    }
}
