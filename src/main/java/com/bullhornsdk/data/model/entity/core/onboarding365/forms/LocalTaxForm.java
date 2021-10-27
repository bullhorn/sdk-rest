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
    "customText1", "customText2", "customText3","customText4", "customText5","customText6", "customText7", "customText8", "customText9", "customText10",
    "dateAdded", "dateLastModified", "isDeleted", "isExempt", "localAdditionalWithholdingsAmount", "localExemptions", "localFilingStatus", "localTaxCode", "localTaxStateID"})
public class LocalTaxForm extends CustomFieldsE implements QueryEntity {

    private Integer id;

    private Candidate candidate;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    private Boolean isDeleted;

    private Boolean isExempt;

    private BigDecimal localAdditionalWithholdingsAmount;

    private Integer localExemptions;

    @JsonIgnore
    @Size(max = 10)
    private String localFilingStatus;

    @JsonIgnore
    @Size(max = 1000)
    private String localTaxCode;

    private Integer localTaxStateID;

    public LocalTaxForm() {
    }

    public LocalTaxForm(Integer id) {
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

    @JsonProperty("localAdditionalWithholdingsAmount")
    public BigDecimal getLocalAdditionalWithholdingsAmount() {
        return localAdditionalWithholdingsAmount;
    }

    @JsonProperty("localAdditionalWithholdingsAmount")
    public void setLocalAdditionalWithholdingsAmount(BigDecimal localAdditionalWithholdingsAmount) {
        this.localAdditionalWithholdingsAmount = localAdditionalWithholdingsAmount;
    }

    @JsonProperty("localExemptions")
    public Integer getLocalExemptions() {
        return localExemptions;
    }

    @JsonProperty("localExemptions")
    public void setLocalExemptions(Integer localExemptions) {
        this.localExemptions = localExemptions;
    }

    @JsonProperty("localFilingStatus")
    public String getLocalFilingStatus() {
        return localFilingStatus;
    }

    @JsonProperty("localFilingStatus")
    public void setLocalFilingStatus(String localFilingStatus) {
        this.localFilingStatus = localFilingStatus;
    }

    @JsonProperty("localTaxCode")
    public String getLocalTaxCode() {
        return localTaxCode;
    }

    @JsonProperty("localTaxCode")
    public void setLocalTaxCode(String localTaxCode) {
        this.localTaxCode = localTaxCode;
    }

    @JsonProperty("localTaxStateID")
    public Integer getLocalTaxStateID() {
        return localTaxStateID;
    }

    @JsonProperty("localTaxStateID")
    public void setLocalTaxStateID(Integer localTaxStateID) {
        this.localTaxStateID = localTaxStateID;
    }

    @Override
    public String toString() {
        return "LocalTaxForm{" +
            "id=" + id +
            ", candidate=" + candidate +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", isDeleted=" + isDeleted +
            ", isExempt=" + isExempt +
            ", localAdditionalWithholdingsAmount=" + localAdditionalWithholdingsAmount +
            ", localExemptions=" + localExemptions +
            ", localFilingStatus='" + localFilingStatus + '\'' +
            ", localTaxCode='" + localTaxCode + '\'' +
            ", localTaxStateID=" + localTaxStateID +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LocalTaxForm that = (LocalTaxForm) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(candidate, that.candidate) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(isDeleted, that.isDeleted) &&
            Objects.equals(isExempt, that.isExempt) &&
            Objects.equals(localAdditionalWithholdingsAmount, that.localAdditionalWithholdingsAmount) &&
            Objects.equals(localExemptions, that.localExemptions) &&
            Objects.equals(localFilingStatus, that.localFilingStatus) &&
            Objects.equals(localTaxCode, that.localTaxCode) &&
            Objects.equals(localTaxStateID, that.localTaxStateID);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), id, candidate, dateAdded, dateLastModified, isDeleted, isExempt, localAdditionalWithholdingsAmount, localExemptions, localFilingStatus, localTaxCode, localTaxStateID);
    }
}
