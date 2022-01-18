package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.paybill.Location;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "dateAdded", "dateLastModified", "endTime", "fillRatio", "isClosed", "isDeleted", "jobOrder",  "location",
    "name", "notes", "numAssigned", "openings", "reasonClosed", "sequenceID", "startTime" })
public class JobShift extends AbstractEntity implements SearchEntity, UpdateEntity, CreateEntity,
    SoftDeleteEntity, AssociationEntity {

    private Integer id;

    private Timestamp dateAdded;

    private Timestamp dateLastModified;

    private OffsetDateTime endTime;

    private Double fillRatio;

    private Boolean isClosed;

    private Boolean isDeleted;

    private JobOrder jobOrder;

    private Location location;

    private String name;

    private OneToMany<Note> notes;

    private Integer numAssigned;

    private Integer openings;

    private String reasonClosed;

    private String sequenceID;

    private OffsetDateTime startTime;

    public JobShift() { super(); }

    public JobShift(Integer id) {
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
    public Timestamp getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(Timestamp dateAdded) { this.dateAdded = dateAdded; }

    @JsonProperty("dateLastModified")
    public Timestamp getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("dateLastModified")
    public void setDateLastModified(Timestamp dateLastModified) { this.dateLastModified = dateLastModified; }

    @JsonProperty("endTime")
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    @JsonProperty("endTime")
    public void setEndTime(OffsetDateTime endTime) { this.endTime = endTime; }

    @JsonProperty("fillRatio")
    public Double getFillRatio() {
        return fillRatio;
    }

    @JsonProperty("fillRatio")
    public void getFillRatio(Double fillRatio) { this.fillRatio = fillRatio; }

    @JsonProperty("isClosed")
    public Boolean getIsClosed() { return isClosed; }

    @JsonProperty("isClosed")
    public void setIsClosed(Boolean isClosed) { this.isClosed = isClosed; }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("jobOrder")
    public JobOrder getJobOrder() {
        return jobOrder;
    }

    @JsonProperty("jobOrder")
    public void setJobOrder(JobOrder jobOrder) {
        this.jobOrder = jobOrder;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("notes")
    public OneToMany<Note> getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(OneToMany<Note> notes) {
        this.notes = notes;
    }

    @JsonProperty("numAssigned")
    public Integer getNumAssigned() {
        return numAssigned;
    }

    @JsonProperty("numAssigned")
    public void setNumAssigned(Integer numAssigned) {
        this.numAssigned = numAssigned;
    }

    @JsonProperty("openings")
    public Integer getOpenings() {
        return openings;
    }

    @JsonProperty("openings")
    public void setOpenings(Integer openings) {
        this.openings = openings;
    }

    @JsonProperty("reasonClosed")
    public String getReasonClosed() {
        return reasonClosed;
    }

    @JsonProperty("reasonClosed")
    public void setReasonClosed(String reasonClosed) {
        this.reasonClosed = reasonClosed;
    }

    @JsonProperty("sequenceID")
    public String getSequenceID() {
        return sequenceID;
    }

    @JsonProperty("sequenceID")
    public void setSequenceID(String sequenceID) {
        this.sequenceID = sequenceID;
    }

    @JsonProperty("startTime")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    @JsonProperty("startTime")
    public void setStartTime(OffsetDateTime startTime) { this.startTime = startTime; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JobShift jobShift = (JobShift) o;
        return Objects.equals(id, jobShift.id) &&
            Objects.equals(dateAdded, jobShift.dateAdded) &&
            Objects.equals(dateLastModified, jobShift.dateLastModified) &&
            Objects.equals(endTime, jobShift.endTime) &&
            Objects.equals(fillRatio, jobShift.fillRatio) &&
            Objects.equals(isClosed, jobShift.isClosed) &&
            Objects.equals(isDeleted, jobShift.isDeleted) &&
            Objects.equals(jobOrder, jobShift.jobOrder) &&
            Objects.equals(location, jobShift.location) &&
            Objects.equals(name, jobShift.name) &&
            Objects.equals(notes, jobShift.notes) &&
            Objects.equals(numAssigned, jobShift.numAssigned) &&
            Objects.equals(openings, jobShift.openings) &&
            Objects.equals(reasonClosed, jobShift.reasonClosed) &&
            Objects.equals(sequenceID, jobShift.sequenceID) &&
            Objects.equals(startTime, jobShift.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, dateAdded, dateLastModified, endTime, fillRatio, isClosed, isDeleted, jobOrder, location, name, notes, numAssigned, openings, reasonClosed, sequenceID, startTime);
    }

    @Override
    public String toString() {
        return "Note{" +
            ", id=" + id +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", endTime=" + endTime +
            ", fillRatio=" + fillRatio +
            ", isClosed=" + isClosed +
            ", isDeleted=" + isDeleted +
            ", jobOrder=" + jobOrder +
            ", location='" + location +
            ", name=" + name + '\'' +
            ", notes=" + notes +
            ", numAssigned='" + numAssigned +
            ", openings=" + openings +
            ", reasonClosed=" + reasonClosed + '\'' +
            ", sequenceID=" + sequenceID + '\'' +
            ", startTime=" + startTime +
            '}';
    }
}
