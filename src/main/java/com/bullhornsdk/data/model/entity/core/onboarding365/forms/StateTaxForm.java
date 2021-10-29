package com.bullhornsdk.data.model.entity.core.onboarding365.forms;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsH;
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
    "customText1", "customText2", "customText3","customText4", "customText5","customText6", "customText7", "customText8", "customText9", "customText10",
    "dateAdded", "dateLastModified", "isDeleted", "isExempt", "stateAdditionalWithholdingsAmount", "stateExemptions", "stateFilingStatus", "taxStateID"})
public class StateTaxForm extends CustomFieldsH implements QueryEntity, CreateEntity, UpdateEntity, DateLastModifiedEntity, SoftDeleteEntity {

    private Integer id;

    private Candidate candidate;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    private Boolean isDeleted;

    private Boolean isExempt;

    private BigDecimal stateAdditionalWithholdingsAmount;

    private Integer stateExemptions;

    @JsonIgnore
    @Size(max = 10)
    private String stateFilingStatus;

    private Integer taxStateID;

    public StateTaxForm() {
    }

    public StateTaxForm(Integer id) {
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
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean deleted) {
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

    @JsonProperty("stateAdditionalWithholdingsAmount")
    public BigDecimal getStateAdditionalWithholdingsAmount() {
        return stateAdditionalWithholdingsAmount;
    }

    @JsonProperty("stateAdditionalWithholdingsAmount")
    public void setStateAdditionalWithholdingsAmount(BigDecimal stateAdditionalWithholdingsAmount) {
        this.stateAdditionalWithholdingsAmount = stateAdditionalWithholdingsAmount;
    }

    @JsonProperty("stateExemptions")
    public Integer getStateExemptions() {
        return stateExemptions;
    }

    @JsonProperty("stateExemptions")
    public void setStateExemptions(Integer stateExemptions) {
        this.stateExemptions = stateExemptions;
    }

    @JsonProperty("stateFilingStatus")
    public String getStateFilingStatus() {
        return stateFilingStatus;
    }

    @JsonIgnore
    public void setStateFilingStatus(String stateFilingStatus) {
        this.stateFilingStatus = stateFilingStatus;
    }

    @JsonProperty("taxStateID")
    public Integer getTaxStateID() {
        return taxStateID;
    }

    @JsonProperty("taxStateID")
    public void setTaxStateID(Integer taxStateID) {
        this.taxStateID = taxStateID;
    }

    @Override
    public String toString() {
        return "StateTaxForm{" +
            "id=" + id +
            ", candidate=" + candidate +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", isDeleted=" + isDeleted +
            ", isExempt=" + isExempt +
            ", stateAdditionalWithholdingsAmount=" + stateAdditionalWithholdingsAmount +
            ", stateExemptions=" + stateExemptions +
            ", stateFilingStatus='" + stateFilingStatus + '\'' +
            ", taxStateID=" + taxStateID +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StateTaxForm that = (StateTaxForm) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(candidate, that.candidate) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(isDeleted, that.isDeleted) &&
            Objects.equals(isExempt, that.isExempt) &&
            Objects.equals(stateAdditionalWithholdingsAmount, that.stateAdditionalWithholdingsAmount) &&
            Objects.equals(stateExemptions, that.stateExemptions) &&
            Objects.equals(stateFilingStatus, that.stateFilingStatus) &&
            Objects.equals(taxStateID, that.taxStateID);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), id, candidate, dateAdded, dateLastModified, isDeleted, isExempt, stateAdditionalWithholdingsAmount, stateExemptions, stateFilingStatus, taxStateID);
    }
}
