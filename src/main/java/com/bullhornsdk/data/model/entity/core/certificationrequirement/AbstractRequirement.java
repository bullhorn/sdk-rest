package com.bullhornsdk.data.model.entity.core.certificationrequirement;

import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SpecializedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.standard.CandidateCertification;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsG;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.file.CandidateFileAttachment;
import com.bullhornsdk.data.model.entity.file.CertificationFileAttachment;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created by mkesmetzis 27-Apr-20
 */
public class AbstractRequirement extends CustomFieldsG implements UpdateEntity, CreateEntity, QueryEntity,
    AssociationEntity, EditHistoryEntity {

    private Integer id;
    private CandidateCertification candidateCertification;
    private Certification certification;
    private OneToMany<CertificationFileAttachment> certificationFileAttachments;
    private DateTime dateAdded;
    private DateTime dateExpiration;
    private DateTime documentDeadline;
    private OneToMany<CandidateFileAttachment> fileAttachments;
    private Integer matchingCredentialCount;
    private CorporateUser modifyingUser;
    private CorporateUser owner;
    private SpecializedOptionsLookup status;
    @Size(max = 100)
    private String userCertificationName;
    @Size(max = 30)
    private String userCertificationStatus;

    public AbstractRequirement() {
    }

    public AbstractRequirement(Integer id) {
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

    @JsonProperty("candidateCertification")
    public CandidateCertification getCandidateCertification() {
        return candidateCertification;
    }

    @JsonProperty("candidateCertification")
    public void setCandidateCertification(CandidateCertification candidateCertification) {
        this.candidateCertification = candidateCertification;
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

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("dateExpiration")
    public DateTime getDateExpiration() {
        return dateExpiration;
    }

    @JsonProperty("dateExpiration")
    public void setDateExpiration(DateTime dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    @JsonProperty("documentDeadline")
    public DateTime getDocumentDeadline() {
        return documentDeadline;
    }

    @JsonProperty("documentDeadline")
    public void setDocumentDeadline(DateTime documentDeadline) {
        this.documentDeadline = documentDeadline;
    }

    @JsonProperty("fileAttachments")
    public OneToMany<CandidateFileAttachment> getFileAttachments() {
        return fileAttachments;
    }

    @JsonProperty("fileAttachments")
    public void setFileAttachments(OneToMany<CandidateFileAttachment> fileAttachments) {
        this.fileAttachments = fileAttachments;
    }

    @JsonProperty("matchingCredentialCount")
    public Integer getMatchingCredentialCount() {
        return matchingCredentialCount;
    }

    @JsonProperty("matchingCredentialCount")
    public void setMatchingCredentialCount(Integer matchingCredentialCount) {
        this.matchingCredentialCount = matchingCredentialCount;
    }

    @JsonProperty("modifyingUser")
    public CorporateUser getModifyingUser() {
        return modifyingUser;
    }

    @JsonProperty("modifyingUser")
    public void setModifyingUser(CorporateUser modifyingUser) {
        this.modifyingUser = modifyingUser;
    }

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @JsonProperty("status")
    public SpecializedOptionsLookup getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(SpecializedOptionsLookup status) {
        this.status = status;
    }

    @JsonProperty("userCertificationName")
    public String getUserCertificationName() {
        return userCertificationName;
    }

    @JsonProperty("userCertificationName")
    public void setUserCertificationName(String userCertificationName) {
        this.userCertificationName = userCertificationName;
    }

    @JsonProperty("userCertificationStatus")
    public String getUserCertificationStatus() {
        return userCertificationStatus;
    }

    @JsonProperty("userCertificationStatus")
    public void setUserCertificationStatus(String userCertificationStatus) {
        this.userCertificationStatus = userCertificationStatus;
    }

    @Override
    public String toString() {
        return "CandidateCertificationRequirement{" +
            "id=" + id +
            ", candidateCertification=" + candidateCertification +
            ", certification=" + certification +
            ", certificationFileAttachments=" + certificationFileAttachments +
            ", dateAdded=" + dateAdded +
            ", dateExpiration=" + dateExpiration +
            ", documentDeadline=" + documentDeadline +
            ", fileAttachments=" + fileAttachments +
            ", matchingCredentialCount=" + matchingCredentialCount +
            ", modifyingUser=" + modifyingUser +
            ", owner=" + owner +
            ", status=" + status +
            ", userCertificationName='" + userCertificationName + '\'' +
            ", userCertificationStatus='" + userCertificationStatus + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AbstractRequirement that = (AbstractRequirement) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(candidateCertification, that.candidateCertification) &&
            Objects.equals(certification, that.certification) &&
            Objects.equals(certificationFileAttachments, that.certificationFileAttachments) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateExpiration, that.dateExpiration) &&
            Objects.equals(documentDeadline, that.documentDeadline) &&
            Objects.equals(fileAttachments, that.fileAttachments) &&
            Objects.equals(matchingCredentialCount, that.matchingCredentialCount) &&
            Objects.equals(modifyingUser, that.modifyingUser) &&
            Objects.equals(owner, that.owner) &&
            Objects.equals(status, that.status) &&
            Objects.equals(userCertificationName, that.userCertificationName) &&
            Objects.equals(userCertificationStatus, that.userCertificationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, candidateCertification, certification, certificationFileAttachments, dateAdded, dateExpiration, documentDeadline, fileAttachments, matchingCredentialCount, modifyingUser, owner, status, userCertificationName, userCertificationStatus);
    }
}
