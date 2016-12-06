package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "boardCertification", "candidate", "certification", "comments", "compact", "copyOnFile",
    "dateCertified", "dateExpiration", "dateLastModified", "issuedBy", "licenseNumber", "licenseType", "location",
    "modifyingUser", "results", "status"})
public class CandidateCertification extends AbstractEntity implements UpdateEntity, CreateEntity, QueryEntity, DeleteEntity{

    private Integer id;

    @Size(max = 100)
    private String boardCertification;

    private Candidate candidate;

    private Certification certification;

    private String comments;

    private Boolean compact;

    private Boolean copyOnFile;

    private DateTime dateCertified;

    private DateTime dateExpiration;

    private DateTime dateLastModified;

    @Size(max = 100)
    private String issuedBy;

    @Size(max = 100)
    private String licenseNumber;

    @Size(max = 30)
    private String licenseType;

    @Size(max = 100)
    private String location;

    private CorporateUser modifyingUser;

    @Size(max = 255)
    private String results;

    @Size(max = 30)
    private String status;


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

    @JsonProperty("boardCertification")
    public String getBoardCertification() {
        return boardCertification;
    }

    @JsonProperty("boardCertification")
    public void setBoardCertification(String boardCertification) {
        this.boardCertification = boardCertification;
    }

    @JsonProperty("candidate")
    public Candidate getCandidate() {
        return candidate;
    }

    @JsonProperty("candidate")
    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @JsonProperty("certification")
    public Certification getCertification() {
        return certification;
    }

    @JsonProperty("certification")
    public void setCertification(Certification certification) {
        this.certification = certification;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    @JsonProperty("copyOnFile")
    public Boolean getCopyOnFile() {
        return copyOnFile;
    }

    @JsonProperty("copyOnFile")
    public void setCopyOnFile(Boolean copyOnFile) {
        this.copyOnFile = copyOnFile;
    }

    @JsonProperty("dateCertified")
    public DateTime getDateCertified() {
        return dateCertified;
    }

    @JsonProperty("dateCertified")
    public void setDateCertified(DateTime dateCertified) {
        this.dateCertified = dateCertified;
    }

    @JsonProperty("dateExpiration")
    public DateTime getDateExpiration() {
        return dateExpiration;
    }

    @JsonProperty("dateExpiration")
    public void setDateExpiration(DateTime dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("issuedBy")
    public String getIssuedBy() {
        return issuedBy;
    }

    @JsonProperty("issuedBy")
    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    @JsonProperty("licenseNumber")
    public String getLicenseNumber() {
        return licenseNumber;
    }

    @JsonProperty("licenseNumber")
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @JsonProperty("licenseType")
    public String getLicenseType() {
        return licenseType;
    }

    @JsonProperty("licenseType")
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("modifyingUser")
    public CorporateUser getModifyingUser() {
        return modifyingUser;
    }

    @JsonProperty("modifyingUser")
    public void setModifyingUser(CorporateUser modifyingUser) {
        this.modifyingUser = modifyingUser;
    }

    @JsonProperty("results")
    public String getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(String results) {
        this.results = results;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("compact")
    public Boolean getCompact() {
        return compact;
    }

    @JsonProperty("compact")
    public void setCompact(Boolean compact) {
        this.compact = compact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CandidateCertification)) return false;

        CandidateCertification that = (CandidateCertification) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (boardCertification != null ? !boardCertification.equals(that.boardCertification) : that.boardCertification != null)
            return false;
        if (candidate != null ? !candidate.equals(that.candidate) : that.candidate != null) return false;
        if (certification != null ? !certification.equals(that.certification) : that.certification != null)
            return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (compact != null ? !compact.equals(that.compact) : that.compact != null) return false;
        if (copyOnFile != null ? !copyOnFile.equals(that.copyOnFile) : that.copyOnFile != null) return false;
        if (dateCertified != null ? !dateCertified.equals(that.dateCertified) : that.dateCertified != null)
            return false;
        if (dateExpiration != null ? !dateExpiration.equals(that.dateExpiration) : that.dateExpiration != null)
            return false;
        if (dateLastModified != null ? !dateLastModified.equals(that.dateLastModified) : that.dateLastModified != null)
            return false;
        if (issuedBy != null ? !issuedBy.equals(that.issuedBy) : that.issuedBy != null) return false;
        if (licenseNumber != null ? !licenseNumber.equals(that.licenseNumber) : that.licenseNumber != null)
            return false;
        if (licenseType != null ? !licenseType.equals(that.licenseType) : that.licenseType != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (modifyingUser != null ? !modifyingUser.equals(that.modifyingUser) : that.modifyingUser != null)
            return false;
        if (results != null ? !results.equals(that.results) : that.results != null) return false;
        return !(status != null ? !status.equals(that.status) : that.status != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (boardCertification != null ? boardCertification.hashCode() : 0);
        result = 31 * result + (candidate != null ? candidate.hashCode() : 0);
        result = 31 * result + (certification != null ? certification.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (compact != null ? compact.hashCode() : 0);
        result = 31 * result + (copyOnFile != null ? copyOnFile.hashCode() : 0);
        result = 31 * result + (dateCertified != null ? dateCertified.hashCode() : 0);
        result = 31 * result + (dateExpiration != null ? dateExpiration.hashCode() : 0);
        result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
        result = 31 * result + (issuedBy != null ? issuedBy.hashCode() : 0);
        result = 31 * result + (licenseNumber != null ? licenseNumber.hashCode() : 0);
        result = 31 * result + (licenseType != null ? licenseType.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (modifyingUser != null ? modifyingUser.hashCode() : 0);
        result = 31 * result + (results != null ? results.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CandidateCertification{" +
            "id=" + id +
            ", boardCertification='" + boardCertification + '\'' +
            ", candidate=" + candidate +
            ", certification=" + certification +
            ", comments='" + comments + '\'' +
            ", compact=" + compact +
            ", copyOnFile=" + copyOnFile +
            ", dateCertified=" + dateCertified +
            ", dateExpiration=" + dateExpiration +
            ", dateLastModified=" + dateLastModified +
            ", issuedBy='" + issuedBy + '\'' +
            ", licenseNumber='" + licenseNumber + '\'' +
            ", licenseType='" + licenseType + '\'' +
            ", location='" + location + '\'' +
            ", modifyingUser=" + modifyingUser +
            ", results='" + results + '\'' +
            ", status='" + status + '\'' +
            '}';
    }
}
