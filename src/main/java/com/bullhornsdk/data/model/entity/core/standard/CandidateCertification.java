package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsE;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.response.file.standard.StandardFileAttachment;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "boardCertification", "candidate", "certification", "comments", "compact", "copyOnFile",
    "customDate1", "customDate10", "customDate2", "customDate3", "customDate4", "customDate5", "customDate6",
    "customDate7", "customDate8", "customDate9",  "customText1", "customText10", "customText2", "customText3",
    "customText4", "customText5", "customText6", "customText7", "customText8", "customText9", "customTextBlock1",
    "customTextBlock10","customTextBlock2", "customTextBlock3", "customTextBlock4", "customTextBlock5", "customTextBlock6",
    "customTextBlock7", "customTextBlock8", "customTextBlock9", "dateCertified", "dateExpiration", "dateLastModified",
    "issuedBy", "licenseNumber", "licenseType", "location", "modifyingUser", "name",  "results", "status"})
public class CandidateCertification extends CustomFieldsE implements UpdateEntity, CreateEntity, QueryEntity, SoftDeleteEntity, AssociationEntity {

    private Integer id;

    @Size(max = 100)
    private String boardCertification;

    private Candidate candidate;

    private Certification certification;

    @JsonIgnore
    private String comments;

    private Boolean compact;

    private Boolean copyOnFile;

    private DateTime dateCertified;

    private DateTime dateExpiration;

    private DateTime dateLastModified;

    private OneToMany<StandardFileAttachment> fileAttachments;

    @Size(max = 100)
    private String issuedBy;

    @Size(max = 100)
    private String licenseNumber;

    @Size(max = 30)
    private String licenseType;

    @JsonIgnore
    @Size(max = 100)
    private String location;

    private CorporateUser modifyingUser;

    @Size(max = 100)
    private String name;

    @Size(max = 255)
    private String results;

    @Size(max = 30)
    private String status;

    private Boolean isDeleted;

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

    @JsonIgnore
    public void setComments(String comments) { this.comments = comments; }

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

    @JsonProperty("fileAttachments")
    public OneToMany<StandardFileAttachment> getFileAttachments() {
        return fileAttachments;
    }

    @ReadOnly
    @JsonProperty("fileAttachments")
    public void setFileAttachments(OneToMany<StandardFileAttachment> fileAttachments) {
        this.fileAttachments = fileAttachments;
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

    @JsonIgnore
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
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
        if (fileAttachments != null ? !fileAttachments.equals(that.fileAttachments) : that.fileAttachments != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (!super.equals(o)) return false;
        return true;
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
        result = 31 * result + (fileAttachments != null ? fileAttachments.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result += super.hashCode();
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
            ", fileAttachments=" + fileAttachments +
            ", name='" + name + '\'' +
            ", isDeleted'" + isDeleted + '\'' +
            super.toString() +
            '}';
    }
}
