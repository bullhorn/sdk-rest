package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsE;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.file.CertificationFileAttachment;
import com.bullhornsdk.data.model.response.file.standard.StandardFileAttachment;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "boardCertification", "candidate", "certification", "certificationFileAttachments", "comments",
    "compact", "copyOnFile", "customDate1", "customDate10", "customDate2", "customDate3", "customDate4", "customDate5",
    "customDate6", "customDate7", "customDate8", "customDate9", "customText1", "customText10", "customText2", "customText3",
    "customText4", "customText5", "customText6", "customText7", "customText8", "customText9", "customTextBlock1",
    "customTextBlock10", "customTextBlock2", "customTextBlock3", "customTextBlock4", "customTextBlock5", "customTextBlock6",
    "customTextBlock7", "customTextBlock8", "customTextBlock9", "dateCertified", "dateExpiration", "dateLastModified",
    "displayStatus", "fileAttachments", "isComplete", "isDeleted", "issuedBy", "licenseNumber", "licenseType",
    "location", "modifyingUser", "name", "results", "status"})
public class CandidateCertification extends CustomFieldsE implements UpdateEntity, CreateEntity, QueryEntity, SoftDeleteEntity,
    AssociationEntity, EditHistoryEntity {

    private Integer id;

    @Size(max = 100)
    private String boardCertification;

    private Candidate candidate;

    private Certification certification;

    private OneToMany<CertificationFileAttachment> certificationFileAttachments;

    @JsonIgnore
    private String comments;

    private Integer compact;

    private Integer copyOnFile;

    private DateTime dateCertified;

    private DateTime dateExpiration;

    private DateTime dateLastModified;

    @Size(max = 30)
    private String displayStatus;

    private Boolean isComplete;

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

    @JsonProperty("certificationFileAttachments")
    public OneToMany<CertificationFileAttachment> getCertificationFileAttachments() {
        return certificationFileAttachments;
    }

    @JsonProperty("certificationFileAttachments")
    public void setCertificationFileAttachments(OneToMany<CertificationFileAttachment> certificationFileAttachments) {
        this.certificationFileAttachments = certificationFileAttachments;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonIgnore
    public void setComments(String comments) {
        this.comments = comments;
    }

    @JsonProperty("copyOnFile")
    public Integer getCopyOnFile() {
        return copyOnFile;
    }

    @JsonProperty("copyOnFile")
    public void setCopyOnFile(Integer copyOnFile) {
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

    @JsonProperty("displayStatus")
    public String getDisplayStatus() {
        return displayStatus;
    }

    @JsonProperty("displayStatus")
    public void setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    @JsonProperty("isComplete")
    public Boolean getIsComplete() {
        return isComplete;
    }

    @JsonProperty("isComplete")
    public void setIsComplete(Boolean complete) {
        isComplete = complete;
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
    public Integer getCompact() {
        return compact;
    }

    @JsonProperty("compact")
    public void setCompact(Integer compact) {
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
    public String toString() {
        return "CandidateCertification{" +
            "id=" + id +
            ", boardCertification='" + boardCertification + '\'' +
            ", candidate=" + candidate +
            ", certification=" + certification +
            ", certificationFileAttachments=" + certificationFileAttachments +
            ", comments='" + comments + '\'' +
            ", compact=" + compact +
            ", copyOnFile=" + copyOnFile +
            ", dateCertified=" + dateCertified +
            ", dateExpiration=" + dateExpiration +
            ", dateLastModified=" + dateLastModified +
            ", displayStatus='" + displayStatus + '\'' +
            ", isComplete=" + isComplete +
            ", fileAttachments=" + fileAttachments +
            ", issuedBy='" + issuedBy + '\'' +
            ", licenseNumber='" + licenseNumber + '\'' +
            ", licenseType='" + licenseType + '\'' +
            ", location='" + location + '\'' +
            ", modifyingUser=" + modifyingUser +
            ", name='" + name + '\'' +
            ", results='" + results + '\'' +
            ", status='" + status + '\'' +
            ", isDeleted=" + isDeleted +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CandidateCertification that = (CandidateCertification) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(boardCertification, that.boardCertification) &&
            Objects.equals(candidate, that.candidate) &&
            Objects.equals(certification, that.certification) &&
            Objects.equals(certificationFileAttachments, that.certificationFileAttachments) &&
            Objects.equals(comments, that.comments) &&
            Objects.equals(compact, that.compact) &&
            Objects.equals(copyOnFile, that.copyOnFile) &&
            Objects.equals(dateCertified, that.dateCertified) &&
            Objects.equals(dateExpiration, that.dateExpiration) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(displayStatus, that.displayStatus) &&
            Objects.equals(isComplete, that.isComplete) &&
            Objects.equals(fileAttachments, that.fileAttachments) &&
            Objects.equals(issuedBy, that.issuedBy) &&
            Objects.equals(licenseNumber, that.licenseNumber) &&
            Objects.equals(licenseType, that.licenseType) &&
            Objects.equals(location, that.location) &&
            Objects.equals(modifyingUser, that.modifyingUser) &&
            Objects.equals(name, that.name) &&
            Objects.equals(results, that.results) &&
            Objects.equals(status, that.status) &&
            Objects.equals(isDeleted, that.isDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, boardCertification, candidate, certification, certificationFileAttachments, comments, compact, copyOnFile, dateCertified, dateExpiration, dateLastModified, displayStatus, isComplete, fileAttachments, issuedBy, licenseNumber, licenseType, location, modifyingUser, name, results, status, isDeleted);
    }


}
