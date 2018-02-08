package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsE;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.response.file.standard.StandardFileAttachment;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "placement", "candidateCertification", "certification", "dateAdded", "modifyingUser", "dateLastModified" })
public class PlacementCertification implements UpdateEntity, CreateEntity, QueryEntity, DeleteEntity, AssociationEntity, EditHistoryEntity {

    private Integer id;

    private Placement placement;

    private CandidateCertification candidateCertification;

    private Certification certification;

    private DateTime dateAdded;

    private CorporateUser modifyingUser;

    private DateTime dateLastModified;

    @JsonIgnore
    private String candidateCertificationName;

    @JsonIgnore
    private String candidateCertificationStatus;

    @JsonIgnore
    private int matchingCredentialCount;

    @JsonIgnore
    private OneToMany<EditHistoryEntity> editHistories;

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

    @JsonProperty("placement")
    public Placement getPlacement() {
        return placement;
    }

    @JsonProperty("placement")
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    @JsonProperty("candidateCertification")
    public CandidateCertification getCandidateCertification() {
        return candidateCertification;
    }

    @JsonProperty("candidateCertification")
    public void setCandidateCertification(CandidateCertification candidateCertification) { this.candidateCertification = candidateCertification; }

    @JsonProperty("certification")
    public Certification getCertification() {
        return certification;
    }

    @JsonProperty("certification")
    public void setCertification(Certification certification) {
        this.certification = certification;
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

    @JsonProperty("modifyingUser")
    public CorporateUser getModifyingUser() {
        return modifyingUser;
    }

    @JsonProperty("modifyingUser")
    public void setModifyingUser(CorporateUser modifyingUser) {
        this.modifyingUser = modifyingUser;
    }

    @JsonProperty("candidateCertificationName")
    public String getCandidateCertificationName() {
        return candidateCertificationName;
    }

    @JsonIgnore
    public void setCandidateCertificationName(String candidateCertificationName) {
        this.candidateCertificationName = candidateCertificationName;
    }

    @JsonProperty("candidateCertificationStatus")
    public String getCandidateCertificationStatus() {
        return candidateCertificationStatus;
    }

    @JsonIgnore
    public void setCandidateCertificationStatus(String candidateCertificationStatus) {
        this.candidateCertificationStatus = candidateCertificationStatus;
    }

    @JsonProperty("matchingCredentialCount")
    public int getMatchingCredentialCount() {
        return matchingCredentialCount;
    }

    @JsonIgnore
    public void setMatchingCredentialCount(int matchingCredentialCount) {
        this.matchingCredentialCount = matchingCredentialCount;
    }

    @JsonProperty("editHistories")
    public OneToMany<EditHistoryEntity> getEditHistories() {
        return editHistories;
    }

    @JsonIgnore
    public void setEditHistories(OneToMany<EditHistoryEntity> editHistories) {
        this.editHistories = editHistories;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlacementCertification)) return false;

        PlacementCertification that = (PlacementCertification) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (placement != null ? !placement.equals(that.placement) : that.placement != null) return false;
        if (candidateCertification != null ? !candidateCertification.equals(that.candidateCertification) : that.candidateCertification != null) return false;
        if (certification != null ? !certification.equals(that.certification) : that.certification != null)
            return false;
        if (dateAdded != null ? !dateAdded.equals(that.dateAdded) : that.dateAdded != null)
            return false;
        if (modifyingUser != null ? !modifyingUser.equals(that.modifyingUser) : that.modifyingUser != null)
            return false;
        if (dateLastModified != null ? !dateLastModified.equals(that.dateLastModified) : that.dateLastModified != null)
            return false;

        return true;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (placement != null ? placement.hashCode() : 0);
        result = 31 * result + (candidateCertification != null ? candidateCertification.hashCode() : 0);
        result = 31 * result + (certification != null ? certification.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (modifyingUser != null ? modifyingUser.hashCode() : 0);
        result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PlacementCertification{" +
            "id=" + id +
            ", placement='" + placement + '\'' +
            ", candidateCertification=" + candidateCertification +
            ", certification=" + certification +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", modifyingUser=" + modifyingUser +
            '}';
    }
}
