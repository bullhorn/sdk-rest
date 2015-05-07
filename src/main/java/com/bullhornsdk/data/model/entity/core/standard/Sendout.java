package com.bullhornsdk.data.model.entity.core.standard;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.HardDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.LinkedId;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "candidate", "clientContact", "clientCorporation", "dateAdded", "email", "isRead", "jobOrder",
        "migrateGUID", "user" })
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

    private String migrateGUID;

    private LinkedId user;

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
        return entity;
    }

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

    @JsonProperty("migrateGUID")
    public String getMigrateGUID() {
        return migrateGUID;
    }

    @JsonProperty("migrateGUID")
    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    @JsonProperty("user")
    public LinkedId getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(LinkedId user) {
        this.user = user;
    }

    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((candidate == null) ? 0 : candidate.hashCode());
        result = prime * result + ((clientContact == null) ? 0 : clientContact.hashCode());
        result = prime * result + ((clientCorporation == null) ? 0 : clientCorporation.hashCode());
        result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((isRead == null) ? 0 : isRead.hashCode());
        result = prime * result + ((jobOrder == null) ? 0 : jobOrder.hashCode());
        result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
        result = prime * result + ((user == null) ? 0 : user.hashCode());
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
        Sendout other = (Sendout) obj;
        if (candidate == null) {
            if (other.candidate != null)
                return false;
        } else if (!candidate.equals(other.candidate))
            return false;
        if (clientContact == null) {
            if (other.clientContact != null)
                return false;
        } else if (!clientContact.equals(other.clientContact))
            return false;
        if (clientCorporation == null) {
            if (other.clientCorporation != null)
                return false;
        } else if (!clientCorporation.equals(other.clientCorporation))
            return false;
        if (dateAdded == null) {
            if (other.dateAdded != null)
                return false;
        } else if (!dateAdded.isEqual(other.dateAdded))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (isRead == null) {
            if (other.isRead != null)
                return false;
        } else if (!isRead.equals(other.isRead))
            return false;
        if (jobOrder == null) {
            if (other.jobOrder != null)
                return false;
        } else if (!jobOrder.equals(other.jobOrder))
            return false;
        if (migrateGUID == null) {
            if (other.migrateGUID != null)
                return false;
        } else if (!migrateGUID.equals(other.migrateGUID))
            return false;
        if (user == null) {
            if (other.user != null)
                return false;
        } else if (!user.equals(other.user))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Sendout {\nid=");
        builder.append(id);
        builder.append(", \ncandidate=");
        builder.append(candidate);
        builder.append(", \nclientContact=");
        builder.append(clientContact);
        builder.append(", \nclientCorporation=");
        builder.append(clientCorporation);
        builder.append(", \ndateAdded=");
        builder.append(dateAdded);
        builder.append(", \nemail=");
        builder.append(email);
        builder.append(", \nisRead=");
        builder.append(isRead);
        builder.append(", \njobOrder=");
        builder.append(jobOrder);
        builder.append(", \nmigrateGUID=");
        builder.append(migrateGUID);
        builder.append(", \nuser=");
        builder.append(user);
        builder.append(", \nadditionalProperties=");
        builder.append(this.getAdditionalProperties());
        builder.append("\n}");
        return builder.toString();
    }

}