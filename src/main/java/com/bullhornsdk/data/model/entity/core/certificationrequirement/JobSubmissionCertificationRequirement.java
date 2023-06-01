package com.bullhornsdk.data.model.entity.core.certificationrequirement;

import java.util.Objects;

import javax.validation.constraints.Size;

import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

/**
 * Created by mkesmetzis 27-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "candidateCertification", "certification", "certificationFileAttachments",
    "customDate1", "customDate10", "customDate2", "customDate3", "customDate4", "customDate5", "customDate6",
    "customDate7", "customDate8", "customDate9", "customFloat1", "customFloat2", "customFloat3", "customInt1",
    "customInt2", "customInt3", "customText1", "customText10", "customText2", "customText3",
    "customText4", "customText5", "customText6", "customText7", "customText8", "customText9", "customTextBlock1",
    "customTextBlock10", "customTextBlock2", "customTextBlock3", "customTextBlock4", "customTextBlock5", "customTextBlock6",
    "customTextBlock7", "customTextBlock8", "customTextBlock9", "dateAdded", "dateExpiration", "documentDeadline",
    "fileAttachments", "jobSubmission", "matchingCredentialCount", "modifyingUser", "owner", "status", "userCertificationName",
    "userCertificationStatus", "dateLastModified", "isDeleted", "isRequired", "migrateGUID"})
public class JobSubmissionCertificationRequirement extends AbstractRequirement implements UpdateEntity, CreateEntity, QueryEntity,
    AssociationEntity, EditHistoryEntity, DateLastModifiedEntity {

    private JobSubmission jobSubmission;
    @Size(max = 100)
    private String userCertificationName;
    @Size(max = 30)
    private String userCertificationStatus;

    private DateTime dateLastModified;

    private Boolean isRequired;

    private String migrateGUID;

    public JobSubmissionCertificationRequirement() {
    }

    public JobSubmissionCertificationRequirement(Integer id) {
        super(id);
    }



    @JsonProperty("jobSubmission")
    public JobSubmission getJobSubmission() {
        return jobSubmission;
    }

    @JsonProperty("jobSubmission")
    public void setJobSubmission(JobSubmission jobSubmission) {
        this.jobSubmission = jobSubmission;
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
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public Boolean getRequired() {
        return isRequired;
    }

    public void setRequired(Boolean required) {
        isRequired = required;
    }

    public String getMigrateGUID() {
        return migrateGUID;
    }

    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    @Override
    public String toString() {
        return "JobSubmissionCertificationRequirement{" +
            "jobSubmission=" + jobSubmission +
            ", userCertificationName='" + userCertificationName + '\'' +
            ", userCertificationStatus='" + userCertificationStatus + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JobSubmissionCertificationRequirement that = (JobSubmissionCertificationRequirement) o;
        return Objects.equals(jobSubmission, that.jobSubmission) &&
            Objects.equals(userCertificationName, that.userCertificationName) &&
            Objects.equals(userCertificationStatus, that.userCertificationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jobSubmission, userCertificationName, userCertificationStatus);
    }
}
