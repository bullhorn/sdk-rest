package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsA;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "candidate", "dateI9Expiration", "dateOfBirth", "i9OnFile", "militaryDomicileExpiration", "militaryDomicileState", "ssn", "taxID", "taxIDIndicator",
                    "customDate1","customDate2","customDate3", "customText1", "customText2", "customText3", "customText4", "customText5",
                    "customInt1", "customInt2", "customInt3"})
public class CandidateTaxInfo extends CustomFieldsA implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity{

    private Integer id;

    private Candidate candidate;

    private DateTime dateI9Expiration;

    private DateTime dateOfBirth;

    private Boolean i9OnFile;

    private DateTime militaryDomicileExpiration;

    @Size(max = 100)
    private String militaryDomicileState;

    @Size(max = 18)
    private String ssn;

    @Size(max = 18)
    private String taxID;

    @Size(max = 100)
    private String taxIDIndicator;

    public CandidateTaxInfo() {}

    public CandidateTaxInfo(Integer id) {
        this.id = id;
    }

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

    @JsonProperty("candidate")
    public Candidate getCandidate() {
        return candidate;
    }

    @JsonProperty("candidate")
    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @JsonProperty("dateI9Expiration")
    public DateTime getDateI9Expiration() {
        return dateI9Expiration;
    }

    @JsonProperty("dateI9Expiration")
    public void setDateI9Expiration(DateTime dateI9Expiration) {
        this.dateI9Expiration = dateI9Expiration;
    }

    @JsonProperty("dateOfBirth")
    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty("i9OnFile")
    public Boolean getI9OnFile() {
        return i9OnFile;
    }

    @JsonProperty("i9OnFile")
    public void setI9OnFile(Boolean i9OnFile) {
        this.i9OnFile = i9OnFile;
    }


    @JsonProperty("militaryDomicileExpiration")
    public DateTime getMilitaryDomicileExpiration() {
        return militaryDomicileExpiration;
    }

    @JsonProperty("militaryDomicileExpiration")
    public void setMilitaryDomicileExpiration(DateTime militaryDomicileExpiration) {
        this.militaryDomicileExpiration = militaryDomicileExpiration;
    }

    @JsonProperty("militaryDomicileState")
    public String getMilitaryDomicileState() {
        return militaryDomicileState;
    }

    @JsonProperty("militaryDomicileState")
    public void setMilitaryDomicileState(String militaryDomicileState) {
        this.militaryDomicileState = militaryDomicileState;
    }

    @JsonProperty("ssn")
    public String getSsn() {
        return ssn;
    }

    @JsonProperty("ssn")
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @JsonProperty("taxID")
    public String getTaxID() {
        return taxID;
    }

    @JsonProperty("taxID")
    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    @JsonProperty("taxIDIndicator")
    public String getTaxIDIndicator() {
        return taxIDIndicator;
    }

    @JsonProperty("taxIDIndicator")
    public void setTaxIDIndicator(String taxIDIndicator) {
        this.taxIDIndicator = taxIDIndicator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandidateTaxInfo that = (CandidateTaxInfo) o;
        return Objects.equals(id, that.id) && Objects.equals(candidate, that.candidate) && Objects.equals(dateI9Expiration, that.dateI9Expiration) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(i9OnFile, that.i9OnFile) && Objects.equals(militaryDomicileExpiration, that.militaryDomicileExpiration) && Objects.equals(militaryDomicileState, that.militaryDomicileState) && Objects.equals(ssn, that.ssn) && Objects.equals(taxID, that.taxID) && Objects.equals(taxIDIndicator, that.taxIDIndicator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, candidate, dateI9Expiration, dateOfBirth, i9OnFile, militaryDomicileExpiration, militaryDomicileState, ssn, taxID, taxIDIndicator);
    }

}
