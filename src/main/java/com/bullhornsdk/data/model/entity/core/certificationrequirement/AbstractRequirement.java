package com.bullhornsdk.data.model.entity.core.certificationrequirement;

import java.util.Objects;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.certificationrequirement.optionslookup.CertificationRequirementStatusLookup;
import com.bullhornsdk.data.model.entity.core.standard.CandidateCertification;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.EditHistoryEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsG;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.file.CandidateFileAttachment;
import com.bullhornsdk.data.model.entity.file.CertificationFileAttachment;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by mkesmetzis 27-Apr-20
 */
public class AbstractRequirement extends CustomFieldsG implements UpdateEntity, CreateEntity, QueryEntity,
    SoftDeleteEntity, AssociationEntity, EditHistoryEntity {

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
    private CertificationRequirementStatusLookup status;

    private Boolean isDeleted;

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
    public CertificationRequirementStatusLookup getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(CertificationRequirementStatusLookup status) {
        this.status = status;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean deleted) {
        isDeleted = deleted;
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
            Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, candidateCertification, certification, certificationFileAttachments, dateAdded, dateExpiration, documentDeadline, fileAttachments, matchingCredentialCount, modifyingUser, owner, status);
    }
}
