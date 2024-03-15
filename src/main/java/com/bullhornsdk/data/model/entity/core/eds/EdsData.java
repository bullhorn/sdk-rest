package com.bullhornsdk.data.model.entity.core.eds;

import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "entityType", "sourceId", "entityTypeSchemaVersion", "dateAdded", "dateLastModified",
    "dateAddedInSourceSystem", "dateLastModifiedInSourceSystem", "payload", "isDeleted", "candidateId", "clientCorporationId",
    "clientContactId", "jobOrderId", "jobSubmissionId", "corporateUserId", "leadId", "opportunityId", "placementId", "appointmentId", "noteId", "payableChargeId", "billableChargeId"})
public class EdsData implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity {
    private Integer id;
    private EdsEntityType entityType;
    private String sourceId;
    private EdsEntityTypeSchemaVersion entityTypeSchemaVersion;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private DateTime dateAddedInSourceSystem;
    private DateTime dateLastModifiedInSourceSystem;
    private String payload;
    private Boolean isDeleted;
    private Integer candidateId;
    private Integer clientCorporationId;
    private Integer clientContactId;
    private Integer jobOrderId;
    private Integer jobSubmissionId;
    private Integer corporateUserId;
    private Integer leadId;
    private Integer opportunityId;
    private Integer placementId;
    private Integer appointmentId;
    private Integer noteId;
    private Integer payableChargeId;
    private Integer billableChargeId;

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

    @JsonProperty("entityType")
    public EdsEntityType getEntityType() {
        return entityType;
    }

    @JsonProperty("entityType")
    public void setEntityType(EdsEntityType entityType) {
        this.entityType = entityType;
    }

    @JsonProperty("sourceId")
    public String getSourceId() {
        return sourceId;
    }

    @JsonProperty("sourceId")
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    @JsonProperty("entityTypeSchemaVersion")
    public EdsEntityTypeSchemaVersion getEntityTypeSchemaVersion() {
        return entityTypeSchemaVersion;
    }

    @JsonProperty("entityTypeSchemaVersion")
    public void setEntityTypeSchemaVersion(EdsEntityTypeSchemaVersion entityTypeSchemaVersion) {
        this.entityTypeSchemaVersion = entityTypeSchemaVersion;
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

    @ReadOnly
    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("dateAddedInSourceSystem")
    public DateTime getDateAddedInSourceSystem() {
        return dateAddedInSourceSystem;
    }

    @JsonProperty("dateAddedInSourceSystem")
    public void setDateAddedInSourceSystem(DateTime dateAddedInSourceSystem) {
        this.dateAddedInSourceSystem = dateAddedInSourceSystem;
    }

    @JsonProperty("dateLastModifiedInSourceSystem")
    public DateTime getDateLastModifiedInSourceSystem() {
        return dateLastModifiedInSourceSystem;
    }

    @JsonProperty("dateLastModifiedInSourceSystem")
    public void setDateLastModifiedInSourceSystem(DateTime dateLastModifiedInSourceSystem) {
        this.dateLastModifiedInSourceSystem = dateLastModifiedInSourceSystem;
    }

    @JsonProperty("payload")
    public String getPayload() {
        return payload;
    }

    @JsonProperty("payload")
    public void setPayload(String payload) {
        this.payload = payload;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @JsonProperty("candidateId")
    public Integer getCandidateId() {
        return candidateId;
    }

    @JsonProperty("candidateId")
    public void setCandidateId(Integer candidateId) {
        this.candidateId = candidateId;
    }

    @JsonProperty("clientCorporationId")
    public Integer getClientCorporationId() {
        return clientCorporationId;
    }

    @JsonProperty("clientCorporationId")
    public void setClientCorporationId(Integer clientCorporationId) {
        this.clientCorporationId = clientCorporationId;
    }

    @JsonProperty("clientContactId")
    public Integer getClientContactId() {
        return clientContactId;
    }

    @JsonProperty("clientContactId")
    public void setClientContactId(Integer clientContactId) {
        this.clientContactId = clientContactId;
    }

    @JsonProperty("jobOrderId")
    public Integer getJobOrderId() {
        return jobOrderId;
    }

    @JsonProperty("jobOrderId")
    public void setJobOrderId(Integer jobOrderId) {
        this.jobOrderId = jobOrderId;
    }

    @JsonProperty("jobSubmissionId")
    public Integer getJobSubmissionId() {
        return jobSubmissionId;
    }

    @JsonProperty("jobSubmissionId")
    public void setJobSubmissionId(Integer jobSubmissionId) {
        this.jobSubmissionId = jobSubmissionId;
    }

    @JsonProperty("corporateUserId")
    public Integer getCorporateUserId() {
        return corporateUserId;
    }

    @JsonProperty("corporateUserId")
    public void setCorporateUserId(Integer corporateUserId) {
        this.corporateUserId = corporateUserId;
    }

    @JsonProperty("leadId")
    public Integer getLeadId() {
        return leadId;
    }

    @JsonProperty("leadId")
    public void setLeadId(Integer leadId) {
        this.leadId = leadId;
    }

    @JsonProperty("opportunityId")
    public Integer getOpportunityId() {
        return opportunityId;
    }

    @JsonProperty("opportunityId")
    public void setOpportunityId(Integer opportunityId) {
        this.opportunityId = opportunityId;
    }

    @JsonProperty("placementId")
    public Integer getPlacementId() {
        return placementId;
    }

    @JsonProperty("placementId")
    public void setPlacementId(Integer placementId) {
        this.placementId = placementId;
    }

    @JsonProperty("appointmentId")
    public Integer getAppointmentId() {
        return appointmentId;
    }

    @JsonProperty("appointmentId")
    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    @JsonProperty("noteId")
    public Integer getNoteId() {
        return noteId;
    }

    @JsonProperty("noteId")
    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    @JsonProperty("payableChargeId")
    public Integer getPayableChargeId() {
        return payableChargeId;
    }

    @JsonProperty("payableChargeId")
    public void setPayableChargeId(Integer payableChargeId) {
        this.payableChargeId = payableChargeId;
    }

    @JsonProperty("billableChargeId")
    public Integer getBillableChargeId() {
        return billableChargeId;
    }

    @JsonProperty("billableChargeId")
    public void setBillableChargeId(Integer billableChargeId) {
        this.billableChargeId = billableChargeId;
    }

    @Override
    public String toString() {
        return "EdsData{" +
            "id=" + id +
            ", entityType =" + entityType +
            ", sourceId =" + sourceId +
            ", entityTypeSchemaVersion =" + entityTypeSchemaVersion +
            ", dateAdded =" + dateAdded +
            ", dateLastModified =" + dateLastModified +
            ", dateAddedInSource =" + dateAddedInSourceSystem +
            ", dateLastModifiedInSource =" + dateLastModifiedInSourceSystem +
            ", payload =" + payload +
            ", isDeleted =" + isDeleted +
            ", candidateId =" + candidateId +
            ", clientCorporationId =" + clientCorporationId +
            ", clientContactId =" + clientContactId +
            ", jobOrderId =" + jobOrderId +
            ", jobSubmission =" + jobSubmissionId +
            ", corporateUserId =" + corporateUserId +
            ", leadId =" + leadId +
            ", opportunityId =" + opportunityId +
            ", placementId =" + placementId +
            ", appointmentId =" + appointmentId +
            ", noteId =" + noteId +
            ", payableChargeId =" + payableChargeId +
            ", billableChargeId =" + billableChargeId +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EdsData that = (EdsData) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(entityType, that.entityType) &&
            Objects.equals(sourceId, that.sourceId) &&
            Objects.equals(entityTypeSchemaVersion, that.entityTypeSchemaVersion) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(dateAddedInSourceSystem, that.dateAddedInSourceSystem) &&
            Objects.equals(dateLastModifiedInSourceSystem, that.dateLastModifiedInSourceSystem) &&
            Objects.equals(payload, that.payload) &&
            Objects.equals(isDeleted, that.isDeleted) &&
            Objects.equals(candidateId, that.candidateId) &&
            Objects.equals(clientCorporationId, that.clientCorporationId) &&
            Objects.equals(clientContactId, that.clientContactId) &&
            Objects.equals(jobOrderId, that.jobOrderId) &&
            Objects.equals(jobSubmissionId, that.jobSubmissionId) &&
            Objects.equals(corporateUserId, that.corporateUserId) &&
            Objects.equals(leadId, that.leadId) &&
            Objects.equals(opportunityId, that.opportunityId) &&
            Objects.equals(placementId, that.placementId) &&
            Objects.equals(appointmentId, that.appointmentId) &&
            Objects.equals(noteId, that.noteId) &&
            Objects.equals(payableChargeId, that.payableChargeId) &&
            Objects.equals(billableChargeId, that.billableChargeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            entityType,
            sourceId,
            entityTypeSchemaVersion,
            dateAdded,
            dateLastModified,
            dateAddedInSourceSystem,
            dateLastModifiedInSourceSystem,
            payload,
            isDeleted,
            candidateId,
            clientCorporationId,
            clientContactId,
            jobOrderId,
            jobSubmissionId,
            corporateUserId,
            leadId,
            opportunityId,
            placementId,
            appointmentId,
            noteId,
            payableChargeId,
            billableChargeId);
    }
}
