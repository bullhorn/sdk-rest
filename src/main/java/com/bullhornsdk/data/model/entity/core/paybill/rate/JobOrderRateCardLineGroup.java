package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.model.entity.core.paybill.earncode.EarnCodeGroup;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.validation.constraints.Size;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "earnCodeGroup", "externalID", "isBase", "jobOrderRateCard", "jobOrderRateCardLines", "jobOrderRateCardVersion", "migrateGUID"})
public class JobOrderRateCardLineGroup extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {

    private Integer id;

    private OneToMany<EarnCodeGroup> earnCodeGroup;

    @Size(max = 100)
    private String externalID;

    private Boolean isBase;

    private JobOrderRateCard jobOrderRateCard;

    private OneToMany<JobOrderRateCardLine> jobOrderRateCardLines;

    private JobOrderRateCardVersion jobOrderRateCardVersion;

    @Size(max = 36)
    private String migrateGUID;

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

    @JsonProperty("earnCodeGroup")
    public OneToMany<EarnCodeGroup> getEarnCodeGroup() {
        return earnCodeGroup;
    }

    @JsonProperty("earnCodeGroup")
    public void setEarnCodeGroup(OneToMany<EarnCodeGroup> earnCodeGroup) {
        this.earnCodeGroup = earnCodeGroup;
    }

    @JsonProperty("externalID")
    public String getExternalID() {
        return externalID;
    }

    @JsonProperty("externalID")
    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    @JsonProperty("isBase")
    public Boolean getIsBase() {
        return isBase;
    }

    @JsonProperty("isBase")
    public void setIsBase(Boolean base) {
        isBase = base;
    }

    @JsonProperty("jobOrderRateCard")
    public JobOrderRateCard getJobOrderRateCard() {
        return jobOrderRateCard;
    }

    @JsonProperty("jobOrderRateCard")
    public void setJobOrderRateCard(JobOrderRateCard jobOrderRateCard) {
        this.jobOrderRateCard = jobOrderRateCard;
    }

    @JsonProperty("jobOrderRateCardLines")
    public OneToMany<JobOrderRateCardLine> getJobOrderRateCardLines() {
        return jobOrderRateCardLines;
    }

    @JsonProperty("jobOrderRateCardLines")
    public void setJobOrderRateCardLines(OneToMany<JobOrderRateCardLine> jobOrderRateCardLines) {
        this.jobOrderRateCardLines = jobOrderRateCardLines;
    }

    @JsonProperty("jobOrderRateCardVersion")
    public JobOrderRateCardVersion getJobOrderRateCardVersion() {
        return jobOrderRateCardVersion;
    }

    @JsonProperty("jobOrderRateCardVersion")
    public void setJobOrderRateCardVersion(JobOrderRateCardVersion jobOrderRateCardVersion) {
        this.jobOrderRateCardVersion = jobOrderRateCardVersion;
    }

    @JsonProperty("migrateGUID")
    public String getMigrateGUID() {
        return migrateGUID;
    }

    @JsonProperty("migrateGUID")
    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobOrderRateCardLineGroup that = (JobOrderRateCardLineGroup) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(earnCodeGroup, that.earnCodeGroup) &&
            Objects.equals(externalID, that.externalID) &&
            Objects.equals(isBase, that.isBase) &&
            Objects.equals(jobOrderRateCard, that.jobOrderRateCard) &&
            Objects.equals(jobOrderRateCardLines, that.jobOrderRateCardLines) &&
            Objects.equals(jobOrderRateCardVersion, that.jobOrderRateCardVersion) &&
            Objects.equals(migrateGUID, that.migrateGUID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, earnCodeGroup, externalID, isBase, migrateGUID, jobOrderRateCard, jobOrderRateCardLines, jobOrderRateCardVersion);
    }

    @Override
    public String toString() {
        return "JobOrderRateCardLineGroup{" +
            "id=" + id +
            ", earnCodeGroup=" + earnCodeGroup +
            ", externalID='" + externalID + '\'' +
            ", isBase=" + isBase +
            ", jobOrderRateCard=" + jobOrderRateCard +
            ", jobOrderRateCardLines=" + jobOrderRateCardLines +
            ", jobOrderRateCardVersion=" + jobOrderRateCardVersion +
            ", migrateGUID='" + migrateGUID + '\'' +
            '}';
    }
}
