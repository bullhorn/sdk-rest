package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "dateAdded", "dateLastModified", "jobShift", "placement", "clientCorporation", "owner", "candidate", "status",
    "scheduledStartTime",  "scheduledEndTime", "actualStartTime", "actualEndTime", "utcStartDate", "startingDayNumber", "startingDayMatchMask",
    "utcEndDate", "endingDayNumber", "endingDayMatchMask", "reasonCancelled", "isCancelled"})
public class JobShiftAssignment extends AbstractEntity implements QueryEntity, UpdateEntity, HardDeleteEntity, CreateEntity {

    private Integer id;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    private Placement placement;

    private JobShift jobShift;

    private ClientCorporation clientCorporation;

    private CorporateUser owner;

    private Candidate candidate;

    private String status;

    private String scheduledStartTime;

    private String scheduledEndTime;

    private Long actualStartTime;

    private Long actualEndTime;

    private Long utcStartDate;

    private Integer startingDayNumber;

    private Integer startingDayMatchMask;

    private Long utcEndDate;

    private Integer endingDayNumber;

    private Integer endingDayMatchMask;

    private String reasonCancelled;

    private Boolean isCancelled;

    public JobShiftAssignment() { super(); }

    public JobShiftAssignment(Integer id) {
        super();
        setId(id);
    }

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @ReadOnly
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
    public void setDateAdded(DateTime dateAdded) { this.dateAdded = dateAdded; }

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) { this.dateLastModified = dateLastModified; }

    @JsonProperty("jobShift")
    public JobShift getJobShift() { return jobShift; }

    @JsonProperty("jobShift")
    public void setJobShift(JobShift jobShift) { this.jobShift = jobShift; }

    @JsonProperty("clientCorporation")
    public ClientCorporation getClientCorporation() { return clientCorporation; }

    @JsonProperty("clientCorporation")
    public void setClientCorporation(ClientCorporation clientCorporation) { this.clientCorporation = clientCorporation; }

    @JsonProperty("clientCorporation")
    public CorporateUser getOwner() { return owner; }

    @JsonProperty("clientCorporation")
    public void setOwner(CorporateUser owner) { this.owner = owner; }

    @JsonProperty("clientCorporation")
    public Candidate getCandidate() { return candidate; }

    @JsonProperty("clientCorporation")
    public void setCandidate(Candidate candidate) { this.candidate = candidate; }

    @JsonProperty("clientCorporation")
    public String getStatus() { return status; }

    @JsonProperty("clientCorporation")
    public void setStatus(String status) { this.status = status; }

    @JsonProperty("clientCorporation")
    public String getScheduledStartTime() { return scheduledStartTime; }

    @JsonProperty("clientCorporation")
    public void setScheduledStartTime(String scheduledStartTime) { this.scheduledStartTime = scheduledStartTime; }

    @JsonProperty("clientCorporation")
    public String getScheduledEndTime() { return scheduledEndTime; }

    @JsonProperty("clientCorporation")
    public void setScheduledEndTime(String scheduledEndTime) { this.scheduledEndTime = scheduledEndTime; }

    @JsonProperty("clientCorporation")
    public Long getActualStartTime() { return actualStartTime; }

    @JsonProperty("clientCorporation")
    public void setActualStartTime(Long actualStartTime) { this.actualStartTime = actualStartTime; }

    @JsonProperty("clientCorporation")
    public Long getActualEndTime() { return actualEndTime; }

    @JsonProperty("clientCorporation")
    public void setActualEndTime(Long actualEndTime) { this.actualEndTime = actualEndTime; }

    @JsonProperty("clientCorporation")
    public Long getUtcStartDate() { return utcStartDate; }

    @JsonProperty("clientCorporation")
    public void setUtcStartDate(Long utcStartDate) { this.utcStartDate = utcStartDate; }

    @JsonProperty("clientCorporation")
    public Integer getStartingDayNumber() { return startingDayNumber; }

    @JsonProperty("clientCorporation")
    public void setStartingDayNumber(Integer startingDayNumber) { this.startingDayNumber = startingDayNumber; }

    @JsonProperty("clientCorporation")
    public Integer getStartingDayMatchMask() { return startingDayMatchMask; }

    @JsonProperty("clientCorporation")
    public void setStartingDayMatchMask(Integer startingDayMatchMask) { this.startingDayMatchMask = startingDayMatchMask; }

    @JsonProperty("clientCorporation")
    public Long getUtcEndDate() { return utcEndDate; }

    @JsonProperty("clientCorporation")
    public void setUtcEndDate(Long utcEndDate) { this.utcEndDate = utcEndDate; }

    @JsonProperty("clientCorporation")
    public Integer getEndingDayNumber() { return endingDayNumber; }

    @JsonProperty("clientCorporation")
    public void setEndingDayNumber(Integer endingDayNumber) { this.endingDayNumber = endingDayNumber; }

    @JsonProperty("clientCorporation")
    public Integer getEndingDayMatchMask() { return endingDayMatchMask; }

    @JsonProperty("clientCorporation")
    public void setEndingDayMatchMask(Integer endingDayMatchMask) { this.endingDayMatchMask = endingDayMatchMask; }

    @JsonProperty("clientCorporation")
    public String getReasonCancelled() { return reasonCancelled; }

    @JsonProperty("clientCorporation")
    public void setReasonCancelled(String reasonCancelled) { this.reasonCancelled = reasonCancelled; }

    @JsonProperty("clientCorporation")
    public Boolean getCancelled() { return isCancelled; }

    @JsonProperty("clientCorporation")
    public void setCancelled(Boolean cancelled) { isCancelled = cancelled; }

    @JsonProperty("clientCorporation")
    public Placement getPlacement() { return placement; }

    @JsonProperty("clientCorporation")
    public void setPlacement(Placement placement) { this.placement = placement; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobShiftAssignment jobShiftAssignment = (JobShiftAssignment) o;
        return Objects.equals(id, jobShiftAssignment.id) &&
            Objects.equals(dateAdded, jobShiftAssignment.dateAdded) &&
            Objects.equals(dateLastModified, jobShiftAssignment.dateLastModified) &&
            Objects.equals(jobShift, jobShiftAssignment.jobShift) &&
            Objects.equals(placement, jobShiftAssignment.placement) &&
            Objects.equals(clientCorporation, jobShiftAssignment.clientCorporation) &&
            Objects.equals(owner, jobShiftAssignment.owner) &&
            Objects.equals(candidate, jobShiftAssignment.candidate) &&
            Objects.equals(status, jobShiftAssignment.status) &&
            Objects.equals(scheduledStartTime, jobShiftAssignment.scheduledStartTime) &&
            Objects.equals(scheduledEndTime, jobShiftAssignment.scheduledEndTime) &&
            Objects.equals(actualStartTime, jobShiftAssignment.actualStartTime) &&
            Objects.equals(actualEndTime, jobShiftAssignment.actualEndTime) &&
            Objects.equals(utcStartDate, jobShiftAssignment.utcStartDate) &&
            Objects.equals(startingDayNumber, jobShiftAssignment.startingDayNumber) &&
            Objects.equals(startingDayMatchMask, jobShiftAssignment.startingDayMatchMask) &&
            Objects.equals(utcEndDate, jobShiftAssignment.utcEndDate) &&
            Objects.equals(endingDayNumber, jobShiftAssignment.endingDayNumber) &&
            Objects.equals(endingDayMatchMask, jobShiftAssignment.endingDayMatchMask) &&
            Objects.equals(reasonCancelled, jobShiftAssignment.reasonCancelled) &&
            Objects.equals(isCancelled, jobShiftAssignment.isCancelled);
    }

    //     "id", "dateAdded", "dateLastModified", "jobShift", "placement", "clientCorporation", "owner", "candidate", "status",
    //         "scheduledStartTime",  "scheduledEndTime", "actualStartTime", "actualEndTime", "utcStartDate", "startingDayNumber", "startingDayMatchMask",
    //         "utcEndDate", "endingDayNumber", "endingDayMatchMask", "reasonCancelled", "isCancelled"})
    @Override
    public int hashCode() {
        return Objects.hash(id, dateAdded, dateLastModified, jobShift, placement, clientCorporation, owner, candidate,
            status, scheduledStartTime, scheduledEndTime, actualStartTime, actualEndTime, utcStartDate, startingDayNumber,
            startingDayMatchMask, utcEndDate, endingDayNumber, endingDayMatchMask, reasonCancelled, isCancelled);
    }

    @Override
    public String toString() {
        return "JobShiftAssignment{" +
            "id=" + id +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", jobShift=" + jobShift +
            ", placement=" + placement +
            ", clientCorporation=" + clientCorporation +
            ", owner=" + owner +
            ", candidate='" + candidate +
            ", status=" + status + '\'' +
            ", scheduledStartTime=" + scheduledStartTime +
            ", scheduledEndTime='" + scheduledEndTime +
            ", actualStartTime=" + actualStartTime +
            ", actualEndTime=" + actualEndTime + '\'' +
            ", utcStartDate=" + utcStartDate + '\'' +
            ", startingDayNumber=" + startingDayNumber + '\'' +
            ", startingDayMatchMask=" + startingDayMatchMask + '\'' +
            ", utcEndDate=" + utcEndDate + '\'' +
            ", endingDayNumber=" + endingDayNumber + '\'' +
            ", endingDayMatchMask=" + endingDayMatchMask + '\'' +
            ", reasonCancelled=" + reasonCancelled + '\'' +
            ", isCancelled=" + isCancelled +
            '}';
    }
}
