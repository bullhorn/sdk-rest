package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.HardDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.hibernate.validator.constraints.Email;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "candidate", "clientContact", "clientCorporation", "dateAdded", "email", "isRead", "jobOrder", "jobSubmission",
    "migrateGUID", "user", "numTimesRead" })
public class Sendout extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, HardDeleteEntity {

    private Integer id;

    private Candidate candidate;

    private ClientContact clientContact;

    private ClientCorporation clientCorporation;

    private DateTime dateAdded;

    @Email
    @Size(max = 100)
    private String email;

    private Boolean isRead;

    private JobOrder jobOrder;

    private JobSubmission jobSubmission;

    private String migrateGUID;

    private CorporateUser user;

    private Integer numTimesRead;

    public Sendout() {
        super();
    }

    /**
     * Returns the entity with the required fields for an insert set.
     *
     * @return
     */
    public Sendout instantiateForInsert() {
        Sendout entity = new Sendout();
        entity.setIsRead(Boolean.FALSE);
        entity.setCandidate(new Candidate(1));
        entity.setUser(new CorporateUser(1));
        return entity;
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

    @JsonProperty("candidate")
    public Candidate getCandidate() {
        return candidate;
    }

    @JsonProperty("candidate")
    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @JsonProperty("clientContact")
    public ClientContact getClientContact() {
        return clientContact;
    }

    @JsonProperty("clientContact")
    public void setClientContact(ClientContact clientContact) {
        this.clientContact = clientContact;
    }

    @JsonProperty("clientCorporation")
    public ClientCorporation getClientCorporation() {
        return clientCorporation;
    }

    @JsonProperty("clientCorporation")
    public void setClientCorporation(ClientCorporation clientCorporation) {
        this.clientCorporation = clientCorporation;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("isRead")
    public Boolean getIsRead() {
        return isRead;
    }

    @JsonProperty("isRead")
    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    @JsonProperty("jobOrder")
    public JobOrder getJobOrder() {
        return jobOrder;
    }

    @JsonProperty("jobOrder")
    public void setJobOrder(JobOrder jobOrder) {
        this.jobOrder = jobOrder;
    }

    @JsonProperty("jobSubmission")
    public JobSubmission getJobSubmission() {
        return jobSubmission;
    }

    @JsonProperty("jobSubmission")
    public void setJobSubmission(JobSubmission jobSubmission) {
        this.jobSubmission = jobSubmission;
    }

    @JsonProperty("migrateGUID")
    public String getMigrateGUID() {
        return migrateGUID;
    }

    @JsonProperty("migrateGUID")
    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    @JsonProperty("user")
    public CorporateUser getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(CorporateUser user) {
        this.user = user;
    }

    @JsonProperty("numTimesRead")
    public Integer getNumTimesRead() {
        return numTimesRead;
    }

    @JsonProperty("numTimesRead")
    public void setNumTimesRead(Integer numTimesRead) {
        this.numTimesRead = numTimesRead;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sendout sendout = (Sendout) o;
        return Objects.equals(id, sendout.id) &&
            Objects.equals(candidate, sendout.candidate) &&
            Objects.equals(clientContact, sendout.clientContact) &&
            Objects.equals(clientCorporation, sendout.clientCorporation) &&
            Objects.equals(dateAdded, sendout.dateAdded) &&
            Objects.equals(email, sendout.email) &&
            Objects.equals(isRead, sendout.isRead) &&
            Objects.equals(jobOrder, sendout.jobOrder) &&
            Objects.equals(jobSubmission, sendout.jobSubmission) &&
            Objects.equals(migrateGUID, sendout.migrateGUID) &&
            Objects.equals(user, sendout.user) &&
            Objects.equals(numTimesRead, sendout.numTimesRead);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, candidate, clientContact, clientCorporation, dateAdded, email, isRead, jobOrder, jobSubmission, migrateGUID, user, numTimesRead);
    }

    @Override
    public String toString() {
        return "Sendout{" +
            "id=" + id +
            ", candidate=" + candidate +
            ", clientContact=" + clientContact +
            ", clientCorporation=" + clientCorporation +
            ", dateAdded=" + dateAdded +
            ", email='" + email + '\'' +
            ", isRead=" + isRead +
            ", jobOrder=" + jobOrder +
            ", jobSubmission=" + jobSubmission +
            ", migrateGUID='" + migrateGUID + '\'' +
            ", user=" + user + '\'' +
            ", numTimesRead=" + numTimesRead +
            '}';
    }
}
