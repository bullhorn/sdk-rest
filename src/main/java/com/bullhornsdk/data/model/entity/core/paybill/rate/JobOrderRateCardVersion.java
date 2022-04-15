package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "dateAdded", "dateLastModified", "effectiveDate", "effectiveEndDate", "isFirst", "jobOrderRateCardLineGroups"})
public class JobOrderRateCardVersion extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {

    private Integer id;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    private DateTime effectiveDate;

    private DateTime effectiveEndDate;

    private Boolean isFirst;

    private OneToMany<JobOrderRateCardLineGroup> jobOrderRateCardLineGroups;

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

    @JsonProperty("effectiveDate")
    public DateTime getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(DateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("effectiveEndDate")
    public DateTime getEffectiveEndDate() {
        return effectiveEndDate;
    }

    @JsonProperty("effectiveEndDate")
    public void setEffectiveEndDate(DateTime effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    @JsonProperty("isFirst")
    public Boolean getIsFirst() {
        return isFirst;
    }

    @JsonProperty("isFirst")
    public void setIsFirst(Boolean first) {
        isFirst = first;
    }

    @JsonProperty("jobOrderRateCardLineGroups")
    public OneToMany<JobOrderRateCardLineGroup> getJobOrderRateCardLineGroups() {
        return jobOrderRateCardLineGroups;
    }

    @JsonProperty("jobOrderRateCardLineGroups")
    public void setJobOrderRateCardLineGroups(OneToMany<JobOrderRateCardLineGroup> jobOrderRateCardLineGroups) {
        this.jobOrderRateCardLineGroups = jobOrderRateCardLineGroups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobOrderRateCardVersion that = (JobOrderRateCardVersion) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(effectiveDate, that.effectiveDate) &&
            Objects.equals(effectiveEndDate, that.effectiveEndDate) &&
            Objects.equals(isFirst, that.isFirst) &&
            Objects.equals(jobOrderRateCardLineGroups, that.jobOrderRateCardLineGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateAdded, dateLastModified, effectiveDate, effectiveEndDate, isFirst, jobOrderRateCardLineGroups);
    }

    @Override
    public String toString() {
        return "JobOrderRateCardVersion{" +
            "id=" + id +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", effectiveDate=" + effectiveDate +
            ", effectiveEndDate=" + effectiveEndDate +
            ", isFirst=" + isFirst +
            ", jobOrderRateCardLineGroups=" + jobOrderRateCardLineGroups +
            '}';
    }
}
