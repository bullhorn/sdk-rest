package com.bullhornsdk.data.model.entity.core.standard;


import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.EditHistoryEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsA;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "candidate", "dateAdded", "endTime", "isAvailable", "startTime", "type"})

public class CandidateAvailability implements QueryEntity, UpdateEntity, CreateEntity {

    private Integer id;
    private Candidate candidate;
    private DateTime dateAdded;
    private DateTime endTime;
    private Boolean isAvailable;
    private DateTime startTime;
    private String type;

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

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }
    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }
    @JsonProperty("endTime")
    public DateTime getEndTime() {
        return endTime;
    }
    @JsonProperty("endTime")
    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }
    @JsonProperty("isAvailable")
    public Boolean getIsAvailable() {
        return isAvailable;
    }
    @JsonProperty("isAvailable")
    public void setIsAvailable(Boolean available) {
        isAvailable = available;
    }
    @JsonProperty("startTime")
    public DateTime getStartTime() {
        return startTime;
    }
    @JsonProperty("startTime")
    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }
    @JsonProperty("type")
    public String getType() {
        return type;
    }
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CandidateAvailability{" +
            "id=" + id +
            ", candidate=" + candidate +
            ", dateAdded=" + dateAdded +
            ", endTime=" + endTime +
            ", isAvailable=" + isAvailable +
            ", startTime=" + startTime +
            ", type='" + type + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandidateAvailability that = (CandidateAvailability) o;
        return Objects.equals(id, that.id) && Objects.equals(candidate, that.candidate) && Objects.equals(dateAdded, that.dateAdded) && Objects.equals(endTime, that.endTime) && Objects.equals(isAvailable, that.isAvailable) && Objects.equals(startTime, that.startTime) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, candidate, dateAdded, endTime, isAvailable, startTime, type);
    }
}
