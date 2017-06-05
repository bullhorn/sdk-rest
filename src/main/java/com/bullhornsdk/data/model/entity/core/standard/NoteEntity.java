package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.HardDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "note", "targetEntityID", "targetEntityName", "opportunities", "jobOrders", "leads", "placements", "clientContacts", "candidates" })
public class NoteEntity extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, HardDeleteEntity {

    private Integer id;

    private Note note;

    private Integer targetEntityID;

    private String targetEntityName;

    private List<Opportunity> opportunities;

    private List<JobOrder> jobOrders;

    private List<Lead> leads;

    private List<Placement> placements;

    private List<ClientContact> clientContacts;

    private List<Candidate> candidates;

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

    @JsonProperty("note")
    public Note getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(Note note) {
        this.note = note;
    }

    @JsonProperty("targetEntityID")
    public Integer getTargetEntityID() {
        return targetEntityID;
    }

    @JsonProperty("targetEntityID")
    public void setTargetEntityID(Integer targetEntityID) {
        this.targetEntityID = targetEntityID;
    }

    @JsonProperty("targetEntityName")
    public String getTargetEntityName() {
        return targetEntityName;
    }

    @JsonProperty("targetEntityName")
    public void setTargetEntityName(String targetEntityName) {
        this.targetEntityName = targetEntityName;
    }

    @JsonProperty("opportunities")
    public List<Opportunity> getOpportunities() {
        return opportunities;
    }

    @JsonProperty("opportunities")
    public void setOpportunities(List<Opportunity> opportunities) {
        this.opportunities = opportunities;
    }

    @JsonProperty("jobOrders")
    public List<JobOrder> getJobOrders() {
        return jobOrders;
    }

    @JsonProperty("jobOrders")
    public void setJobOrders(List<JobOrder> jobOrders) {
        this.jobOrders = jobOrders;
    }

    @JsonProperty("leads")
    public List<Lead> getLeads() {
        return leads;
    }

    @JsonProperty("leads")
    public void setLeads(List<Lead> leads) {
        this.leads = leads;
    }

    @JsonProperty("placements")
    public List<Placement> getPlacements() {
        return placements;
    }

    @JsonProperty("placements")
    public void setPlacements(List<Placement> placements) {
        this.placements = placements;
    }

    @JsonProperty("clientContacts")
    public List<ClientContact> getClientContacts() {
        return clientContacts;
    }

    @JsonProperty("clientContacts")
    public void setClientContacts(List<ClientContact> clientContacts) {
        this.clientContacts = clientContacts;
    }

    @JsonProperty("candidates")
    public List<Candidate> getCandidates() {
        return candidates;
    }

    @JsonProperty("candidates")
    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((note == null) ? 0 : note.hashCode());
        result = prime * result + ((targetEntityID == null) ? 0 : targetEntityID.hashCode());
        result = prime * result + ((targetEntityName == null) ? 0 : targetEntityName.hashCode());
        result = prime * result + ((opportunities == null) ? 0 : opportunities.hashCode());
        result = prime * result + ((jobOrders == null) ? 0 : jobOrders.hashCode());
        result = prime * result + ((leads == null) ? 0 : leads.hashCode());
        result = prime * result + ((placements == null) ? 0 : placements.hashCode());
        result = prime * result + ((clientContacts == null) ? 0 : clientContacts.hashCode());
        result = prime * result + ((candidates == null) ? 0 : candidates.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        NoteEntity other = (NoteEntity) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (note == null) {
            if (other.note != null)
                return false;
        } else if (!note.equals(other.note))
            return false;
        if (targetEntityID == null) {
            if (other.targetEntityID != null)
                return false;
        } else if (!targetEntityID.equals(other.targetEntityID))
            return false;
        if (targetEntityName == null) {
            if (other.targetEntityName != null)
                return false;
        } else if (!targetEntityName.equals(other.targetEntityName))
            return false;
        if (opportunities == null) {
            if (other.opportunities != null)
                return false;
        } else if (!opportunities.equals(other.opportunities))
            return false;
        if (jobOrders == null) {
            if (other.jobOrders != null)
                return false;
        } else if (!jobOrders.equals(other.jobOrders))
            return false;
        if (leads == null) {
            if (other.leads != null)
                return false;
        } else if (!leads.equals(other.leads))
            return false;
        if (placements == null) {
            if (other.placements != null)
                return false;
        } else if (!placements.equals(other.placements))
            return false;
        if (clientContacts == null) {
            if (other.clientContacts != null)
                return false;
        } else if (!clientContacts.equals(other.clientContacts))
            return false;
        if (candidates == null) {
            if (other.candidates != null)
                return false;
        } else if (!candidates.equals(other.candidates))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("NoteEntity {\nid=");
        builder.append(id);
        builder.append(", \nnote=");
        builder.append(note);
        builder.append(", \ntargetEntityID=");
        builder.append(targetEntityID);
        builder.append(", \ntargetEntityName=");
        builder.append(targetEntityName);
        builder.append(", \nopportunities=");
        builder.append(opportunities);
        builder.append(", \njobOrders=");
        builder.append(jobOrders);
        builder.append(", \nleads=");
        builder.append(leads);
        builder.append(", \nplacements=");
        builder.append(placements);
        builder.append(", \nclientContacts=");
        builder.append(clientContacts);
        builder.append(", \ncandidates=");
        builder.append(candidates);
        builder.append("\n}");
        return builder.toString();
    }
}
