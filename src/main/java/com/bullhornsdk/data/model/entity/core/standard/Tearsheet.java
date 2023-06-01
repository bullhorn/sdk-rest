package com.bullhornsdk.data.model.entity.core.standard;


import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "candidate", "clientContacts", " dateAdded", "description", "isDeleted", "isPrivate", "jobOrders", "name", "owner",
    "candidates", "dateAdded", "dateLastModified", "isUserTearsheet", "leads", "opportunities", "recipients", "users"})
public class Tearsheet extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, AssociationEntity, DateLastModifiedEntity {

    private Integer id;

    private OneToMany<Candidate> candidates;

    private OneToMany<ClientContact> clientContacts;

    private DateTime dateAdded;

    private String description;

    private Boolean isDeleted;

    private Boolean isPrivate;

    private OneToMany<JobOrder> jobOrders;

    private String name;

    private CorporateUser owner;

    private DateTime dateLastModified;

    private Boolean isUserTearsheet;

    private OneToMany<Lead> leads;

    private OneToMany<Opportunity> opportunities;

    private OneToMany<TearsheetRecipient> recipients;

    private OneToMany<CorporateUser> users;

    public Tearsheet() {
        super();
    }

    public Tearsheet instantiateForInsert() {
        Tearsheet entity = new Tearsheet();
        entity.setIsDeleted(Boolean.FALSE);
        entity.setName("Test Tearsheet");
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

    @JsonProperty("candidates")
    public OneToMany<Candidate> getCandidates() {
        return candidates;
    }

    @JsonProperty("candidates")
    public void setCandidates(OneToMany<Candidate> candidates) {
        this.candidates = candidates;
    }

    @JsonProperty("clientContacts")
    public OneToMany<ClientContact> getClientContacts() {
        return clientContacts;
    }

    @JsonProperty("clientContacts")
    public void setClientContacts(OneToMany<ClientContact> clientContacts) {
        this.clientContacts = clientContacts;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @ReadOnly
    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("isPrivate")
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    @JsonProperty("isPrivate")
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    @JsonProperty("jobOrders")
    public OneToMany<JobOrder> getJobOrders() {
        return jobOrders;
    }

    @JsonProperty("jobOrders")
    public void setJobOrders(OneToMany<JobOrder> jobOrders) {
        this.jobOrders = jobOrders;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @Override
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public Boolean getUserTearsheet() {
        return isUserTearsheet;
    }

    public void setUserTearsheet(Boolean userTearsheet) {
        isUserTearsheet = userTearsheet;
    }

    public OneToMany<Lead> getLeads() {
        return leads;
    }

    public void setLeads(OneToMany<Lead> leads) {
        this.leads = leads;
    }

    public OneToMany<Opportunity> getOpportunities() {
        return opportunities;
    }

    public void setOpportunities(OneToMany<Opportunity> opportunities) {
        this.opportunities = opportunities;
    }

    public OneToMany<TearsheetRecipient> getRecipients() {
        return recipients;
    }

    public void setRecipients(OneToMany<TearsheetRecipient> recipients) {
        this.recipients = recipients;
    }

    public OneToMany<CorporateUser> getUsers() {
        return users;
    }

    public void setUsers(OneToMany<CorporateUser> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tearsheet [id=");
        builder.append(id);
        builder.append(", candidates=");
        builder.append(candidates);
        builder.append(", clientContacts=");
        builder.append(clientContacts);
        builder.append(", dateAdded=");
        builder.append(dateAdded);
        builder.append(", description=");
        builder.append(description);
        builder.append(", isDeleted=");
        builder.append(isDeleted);
        builder.append(", isPrivate=");
        builder.append(isPrivate);
        builder.append(", jobOrders=");
        builder.append(jobOrders);
        builder.append(", name=");
        builder.append(name);
        builder.append(", owner=");
        builder.append(owner);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((candidates == null) ? 0 : candidates.hashCode());
        result = prime * result + ((clientContacts == null) ? 0 : clientContacts.hashCode());
        result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
        result = prime * result + ((isPrivate == null) ? 0 : isPrivate.hashCode());
        result = prime * result + ((jobOrders == null) ? 0 : jobOrders.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
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
        Tearsheet other = (Tearsheet) obj;
        if (candidates == null) {
            if (other.candidates != null)
                return false;
        } else if (!candidates.equals(other.candidates))
            return false;
        if (clientContacts == null) {
            if (other.clientContacts != null)
                return false;
        } else if (!clientContacts.equals(other.clientContacts))
            return false;
        if (dateAdded == null) {
            if (other.dateAdded != null)
                return false;
        } else if (!dateAdded.equals(other.dateAdded))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (isDeleted == null) {
            if (other.isDeleted != null)
                return false;
        } else if (!isDeleted.equals(other.isDeleted))
            return false;
        if (isPrivate == null) {
            if (other.isPrivate != null)
                return false;
        } else if (!isPrivate.equals(other.isPrivate))
            return false;
        if (jobOrders == null) {
            if (other.jobOrders != null)
                return false;
        } else if (!jobOrders.equals(other.jobOrders))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (owner == null) {
            if (other.owner != null)
                return false;
        } else if (!owner.equals(other.owner))
            return false;
        return true;
    }

}
