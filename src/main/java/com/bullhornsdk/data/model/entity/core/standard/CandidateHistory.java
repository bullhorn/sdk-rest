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
@JsonPropertyOrder({"id", "candidate", "candidateID", "comments", "dateAdded", "migrateGUID", "modifyingUser", "status"})
public class CandidateHistory extends AbstractEntity implements QueryEntity {
    private Integer id;
    private Candidate candidate;
    private Integer candidateID;

    private String comments;
    private DateTime dateAdded;
    private String migrateGUID;
    private CorporateUser modifyingUser;
    private String status;

    public Integer getId() {
        return this.id;
    }

    @ReadOnly
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("candidateID")
    public Integer getCandidateID() {
        return candidateID;
    }

    @JsonProperty("candidateID")
    public void setCandidateID(Integer candidateID) {
        this.candidateID = candidateID;
    }

    @JsonProperty("candidate")
    public Candidate getCandidate() {
        return this.candidate;
    }

    @JsonProperty("candidate")
    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @JsonProperty("comments")
    public String getComments() {
        return this.comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return this.dateAdded;
    }

    @ReadOnly
    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("migrateGUID")
    public String getMigrateGUID() {
        return this.migrateGUID;
    }

    @JsonProperty("migrateGUID")
    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    @JsonProperty("modifyingUser")
    public CorporateUser getModifyingUser() {
        return this.modifyingUser;
    }

    @JsonProperty("modifyingUser")
    public void setModifyingUser(CorporateUser modifyingUser) {
        this.modifyingUser = modifyingUser;
    }

    @JsonProperty("status")
    public String getStatus() {
        return this.status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CandidateHistory)) return false;

        CandidateHistory that = (CandidateHistory) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(candidate, that.candidate)) return false;
        if (!Objects.equals(candidateID, that.candidateID)) return false;
        if (!Objects.equals(comments, that.comments)) return false;
        if (!Objects.equals(dateAdded, that.dateAdded)) return false;
        if (!Objects.equals(migrateGUID, that.migrateGUID)) return false;
        if (!Objects.equals(modifyingUser, that.modifyingUser))
            return false;
        return Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (candidate != null ? candidate.hashCode() : 0);
        result = 31 * result + (candidateID != null ? candidateID.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (migrateGUID != null ? migrateGUID.hashCode() : 0);
        result = 31 * result + (modifyingUser != null ? modifyingUser.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CandidateHistory{" +
            "id=" + id +
            ", candidate=" + candidate +
            ", candidateID=" + candidateID +
            ", comments='" + comments + '\'' +
            ", dateAdded=" + dateAdded +
            ", migrateGUID='" + migrateGUID + '\'' +
            ", modifyingUser=" + modifyingUser +
            ", status='" + status + '\'' +
            '}';
    }
}
