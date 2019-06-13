package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "action", "bhTimeStamp", "candidates", "clientContacts", "commentingPerson", "comments", "corporateUsers",
		"dateAdded", "dateLastModified", "entities", "externalID", "isDeleted", "jobOrder", "jobOrders", "leads", "migrateGUID", "minutesSpent",
        "opportunities", "personReference", "placements" })
public class Note extends AbstractEntity implements SearchEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, AssociationEntity, DateLastModifiedEntity {

	private BigDecimal luceneScore;

	private Integer id;

	@JsonIgnore
	@Size(max = 30)
	private String action;

	private String bhTimeStamp;

	private OneToMany<Candidate> candidates;

	private OneToMany<ClientContact> clientContacts;

	private Person commentingPerson;

	@JsonIgnore
	private String comments;

	private OneToMany<CorporateUser> corporateUsers;

	private DateTime dateAdded;

	private DateTime dateLastModified;

	private OneToMany<NoteEntity> entities;

    @JsonIgnore
    @Size(max = 50)
    private String externalID;

	private Boolean isDeleted;

	private JobOrder jobOrder;

	private OneToMany<JobOrder> jobOrders;

    private OneToMany<Lead> leads;

	private String migrateGUID;

	private Integer minutesSpent;

    private OneToMany<Opportunity> opportunities;

	private Person personReference;

	private OneToMany<Placement> placements;

	public Note() {
		super();
	}

	public Note(Integer id) {
		super();
		setId(id);
	}

	/**
	 * Returns the entity with the required fields for an insert set.
	 * 
	 * @return
	 */
	public Note instantiateForInsert() {
		Note entity = new Note();
		entity.setIsDeleted(Boolean.FALSE);
		return entity;
	}

	@JsonIgnore
	public BigDecimal getLuceneScore() {
		return luceneScore;
	}

	@JsonProperty("_score")
	public void setLuceneScore(BigDecimal luceneScore) {
		this.luceneScore = luceneScore;
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

	@JsonProperty("action")
	public String getAction() {
		return action;
	}

	@JsonIgnore
	public void setAction(String action) {
		this.action = action;
	}

	@JsonIgnore
	public String getBhTimeStamp() {
		return bhTimeStamp;
	}

    @ReadOnly
	@JsonProperty("bhTimeStamp")
	public void setBhTimeStamp(String bhTimeStamp) {
		this.bhTimeStamp = bhTimeStamp;
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

	@JsonProperty("commentingPerson")
	public Person getCommentingPerson() {
		return commentingPerson;
	}

	@JsonProperty("commentingPerson")
	public void setCommentingPerson(Person commentingPerson) {
		this.commentingPerson = commentingPerson;
	}

	@JsonProperty("comments")
	public String getComments() {
		return comments;
	}

	@JsonIgnore
	public void setComments(String comments) {
		this.comments = comments;
	}

	@JsonIgnore
	public OneToMany<CorporateUser> getCorporateUsers() {
		return corporateUsers;
	}

	@JsonProperty("corporateUsers")
	public void setCorporateUsers(OneToMany<CorporateUser> corporateUsers) {
		this.corporateUsers = corporateUsers;
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

	@JsonProperty("dateLastModified")
	public DateTime getDateLastModified() {
		return dateLastModified;
	}

    @ReadOnly
	@JsonProperty("dateLastModified")
	public void setDateLastModified(DateTime dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

	@JsonIgnore
	public OneToMany<NoteEntity> getEntities() {
		return entities;
	}

    @ReadOnly
	@JsonProperty("entities")
	public void setEntities(OneToMany<NoteEntity> entities) {
		this.entities = entities;
	}

    @JsonProperty("externalID")
    public String getExternalID() {
        return externalID;
    }

    @JsonProperty("externalID")
    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

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

    @JsonProperty("jobOrders")
	public OneToMany<JobOrder> getJobOrders() {
		return jobOrders;
	}

	@JsonProperty("jobOrders")
	public void setJobOrders(OneToMany<JobOrder> jobOrders) {
		this.jobOrders = jobOrders;
	}

    @JsonProperty("leads")
    public OneToMany<Lead> getLeads() {
        return leads;
    }

    @JsonProperty("leads")
    public void setLeads(OneToMany<Lead> leads) {
        this.leads = leads;
    }

    @JsonProperty("migrateGUID")
	public String getMigrateGUID() {
		return migrateGUID;
	}

	@JsonProperty("migrateGUID")
	public void setMigrateGUID(String migrateGUID) {
		this.migrateGUID = migrateGUID;
	}

	@JsonProperty("minutesSpent")
	public Integer getMinutesSpent() {
		return minutesSpent;
	}

	@JsonProperty("minutesSpent")
	public void setMinutesSpent(Integer minutesSpent) {
		this.minutesSpent = minutesSpent;
	}

    @JsonProperty("opportunities")
    public OneToMany<Opportunity> getOpportunities() {
        return opportunities;
    }

    @JsonProperty("opportunities")
    public void setOpportunities(OneToMany<Opportunity> opportunities) {
        this.opportunities = opportunities;
    }

    @JsonProperty("personReference")
	public Person getPersonReference() {
		return personReference;
	}

	@JsonProperty("personReference")
	public void setPersonReference(Person personReference) {
		this.personReference = personReference;
	}

    @JsonProperty("placements")
	public OneToMany<Placement> getPlacements() {
		return placements;
	}

	@JsonProperty("placements")
	public void setPlacements(OneToMany<Placement> placements) {
		this.placements = placements;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Note)) return false;

        Note note = (Note) o;

        if (luceneScore != null ? !luceneScore.equals(note.luceneScore) : note.luceneScore != null) return false;
        if (id != null ? !id.equals(note.id) : note.id != null) return false;
        if (action != null ? !action.equals(note.action) : note.action != null) return false;
        if (bhTimeStamp != null ? !bhTimeStamp.equals(note.bhTimeStamp) : note.bhTimeStamp != null) return false;
        if (candidates != null ? !candidates.equals(note.candidates) : note.candidates != null) return false;
        if (clientContacts != null ? !clientContacts.equals(note.clientContacts) : note.clientContacts != null)
            return false;
        if (commentingPerson != null ? !commentingPerson.equals(note.commentingPerson) : note.commentingPerson != null)
            return false;
        if (comments != null ? !comments.equals(note.comments) : note.comments != null) return false;
        if (corporateUsers != null ? !corporateUsers.equals(note.corporateUsers) : note.corporateUsers != null)
            return false;
        if (dateAdded != null ? !dateAdded.equals(note.dateAdded) : note.dateAdded != null) return false;
        if (dateLastModified != null ? !dateLastModified.equals(note.dateLastModified) : note.dateLastModified != null)
            return false;
        if (entities != null ? !entities.equals(note.entities) : note.entities != null) return false;
        if (externalID != null ? !externalID.equals(note.externalID) : note.externalID != null) return false;
        if (isDeleted != null ? !isDeleted.equals(note.isDeleted) : note.isDeleted != null) return false;
        if (jobOrder != null ? !jobOrder.equals(note.jobOrder) : note.jobOrder != null) return false;
        if (jobOrders != null ? !jobOrders.equals(note.jobOrders) : note.jobOrders != null) return false;
        if (leads != null ? !leads.equals(note.leads) : note.leads != null) return false;
        if (migrateGUID != null ? !migrateGUID.equals(note.migrateGUID) : note.migrateGUID != null) return false;
        if (minutesSpent != null ? !minutesSpent.equals(note.minutesSpent) : note.minutesSpent != null) return false;
        if (opportunities != null ? !opportunities.equals(note.opportunities) : note.opportunities != null)
            return false;
        if (personReference != null ? !personReference.equals(note.personReference) : note.personReference != null)
            return false;
        return placements != null ? placements.equals(note.placements) : note.placements == null;

    }

    @Override
    public int hashCode() {
        int result = luceneScore != null ? luceneScore.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (action != null ? action.hashCode() : 0);
        result = 31 * result + (bhTimeStamp != null ? bhTimeStamp.hashCode() : 0);
        result = 31 * result + (candidates != null ? candidates.hashCode() : 0);
        result = 31 * result + (clientContacts != null ? clientContacts.hashCode() : 0);
        result = 31 * result + (commentingPerson != null ? commentingPerson.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (corporateUsers != null ? corporateUsers.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
        result = 31 * result + (entities != null ? entities.hashCode() : 0);
        result = 31 * result + (externalID != null ? externalID.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (jobOrder != null ? jobOrder.hashCode() : 0);
        result = 31 * result + (jobOrders != null ? jobOrders.hashCode() : 0);
        result = 31 * result + (leads != null ? leads.hashCode() : 0);
        result = 31 * result + (migrateGUID != null ? migrateGUID.hashCode() : 0);
        result = 31 * result + (minutesSpent != null ? minutesSpent.hashCode() : 0);
        result = 31 * result + (opportunities != null ? opportunities.hashCode() : 0);
        result = 31 * result + (personReference != null ? personReference.hashCode() : 0);
        result = 31 * result + (placements != null ? placements.hashCode() : 0);
        return result;
    }

    @Override
    public String toStringNonNull(boolean includeLineBreaks) {
        String lbc = ", ";
        if(includeLineBreaks)
            lbc = ",\n ";
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() + " { ");
        if(includeLineBreaks)
            sb.append("\n");
        if(id != null){
            sb.append(lbc + "id=");
            sb.append(id);
        }
        if(action != null){
            sb.append(lbc + "action=");
            sb.append(action);
        }
        if(bhTimeStamp != null){
            sb.append(lbc + "bhTimeStamp=");
            sb.append(bhTimeStamp);
        }
        if(candidates != null){
            sb.append(lbc + "candidates=");
            sb.append(candidates.toStringNonNull(includeLineBreaks));
        }
        if(clientContacts != null){
            sb.append(lbc + "clientContacts=");
            sb.append(clientContacts.toStringNonNull(includeLineBreaks));
        }
        if(commentingPerson != null){
            sb.append(lbc + "commentingPerson=");
            sb.append(commentingPerson.toStringNonNull(includeLineBreaks));
        }
        if(comments != null){
            sb.append(lbc + "comments=");
            sb.append(comments);
        }
        if(corporateUsers != null){
            sb.append(lbc + "corporateUsers=");
            sb.append(corporateUsers.toStringNonNull(includeLineBreaks));
        }
        if(dateAdded != null){
            sb.append(lbc + "dateAdded=");
            sb.append(dateAdded);
        }
        if(dateLastModified != null){
            sb.append(lbc + "dateLastModified=");
            sb.append(dateLastModified);
        }
        if(entities != null){
            sb.append(lbc + "entities=");
            sb.append(entities.toStringNonNull(includeLineBreaks));
        }
        if(externalID != null){
            sb.append(lbc + "externalID=");
            sb.append(externalID);
        }
        if(isDeleted != null){
            sb.append(lbc + "isDeleted=");
            sb.append(isDeleted);
        }
        if(jobOrder != null){
            sb.append(lbc + "jobOrder=");
            sb.append(jobOrder.toStringNonNull(includeLineBreaks));
        }
        if(jobOrders != null){
            sb.append(lbc + "jobOrders=");
            sb.append(jobOrders.toStringNonNull(includeLineBreaks));
        }
        if(leads != null){
            sb.append(lbc + "leads=");
            sb.append(leads.toStringNonNull(includeLineBreaks));
        }
        if(migrateGUID != null){
            sb.append(lbc + "migrateGUID=");
            sb.append(migrateGUID);
        }
        if(luceneScore != null){
            sb.append(lbc + "luceneScore=");
            sb.append(luceneScore);
        }
        if(minutesSpent != null){
            sb.append(lbc + "minutesSpent=");
            sb.append(minutesSpent);
        }
        if(opportunities != null){
            sb.append(lbc + "opportunities=");
            sb.append(opportunities.toStringNonNull(includeLineBreaks));
        }
        if(personReference != null){
            sb.append(lbc + "personReference=");
            sb.append(personReference.toStringNonNull(includeLineBreaks));
        }
        if(placements != null){
            sb.append(lbc + "placements=");
            sb.append(placements.toStringNonNull(includeLineBreaks));
        }
        if(includeLineBreaks)
            sb.append("\n");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toStringNonNull() {
        String lbc = ", ";
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() + " { ");
        if(id != null){
            sb.append("id=");
            sb.append(id);
        }
        if(action != null){
            sb.append(lbc + "action=");
            sb.append(action);
        }
        if(bhTimeStamp != null){
            sb.append(lbc + "bhTimeStamp=");
            sb.append(bhTimeStamp);
        }
        if(candidates != null){
            sb.append(lbc + "candidates=");
            sb.append(candidates.toStringNonNull());
        }
        if(clientContacts != null){
            sb.append(lbc + "clientContacts=");
            sb.append(clientContacts.toStringNonNull());
        }
        if(commentingPerson != null){
            sb.append(lbc + "commentingPerson=");
            sb.append(commentingPerson.toStringNonNull());
        }
        if(comments != null){
            sb.append(lbc + "comments=");
            sb.append(comments);
        }
        if(corporateUsers != null){
            sb.append(lbc + "corporateUsers=");
            sb.append(corporateUsers.toStringNonNull());
        }
        if(dateAdded != null){
            sb.append(lbc + "dateAdded=");
            sb.append(dateAdded);
        }
        if(dateLastModified != null){
            sb.append(lbc + "dateLastModified=");
            sb.append(dateLastModified);
        }
        if(entities != null){
            sb.append(lbc + "entities=");
            sb.append(entities.toStringNonNull());
        }
        if(externalID != null){
            sb.append(lbc + "externalID=");
            sb.append(externalID);
        }
        if(isDeleted != null){
            sb.append(lbc + "isDeleted=");
            sb.append(isDeleted);
        }
        if(jobOrder != null){
            sb.append(lbc + "jobOrder=");
            sb.append(jobOrder.toStringNonNull());
        }
        if(jobOrders != null){
            sb.append(lbc + "jobOrders=");
            sb.append(jobOrders.toStringNonNull());
        }
        if(leads != null){
            sb.append(lbc + "leads=");
            sb.append(leads.toStringNonNull());
        }
        if(migrateGUID != null){
            sb.append(lbc + "migrateGUID=");
            sb.append(migrateGUID);
        }
        if(luceneScore != null){
            sb.append(lbc + "luceneScore=");
            sb.append(luceneScore);
        }
        if(minutesSpent != null){
            sb.append(lbc + "minutesSpent=");
            sb.append(minutesSpent);
        }
        if(opportunities != null){
            sb.append(lbc + "opportunities=");
            sb.append(opportunities.toStringNonNull());
        }
        if(personReference != null){
            sb.append(lbc + "personReference=");
            sb.append(personReference.toStringNonNull());
        }
        if(placements != null){
            sb.append(lbc + "placements=");
            sb.append(placements.toStringNonNull());
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() + " { ")
            .append(",\n id=")
            .append(id)
            .append(",\n action=")
            .append(action)
            .append(",\n bhTimeStamp=")
            .append(bhTimeStamp)
            .append(",\n candidates=")
            .append(candidates)
            .append(",\n clientContacts=")
            .append(clientContacts)
            .append(",\n commentingPerson=")
            .append(commentingPerson)
            .append(",\n comments=")
            .append(comments)
            .append(",\n corporateUsers=")
            .append(corporateUsers)
            .append(",\n dateAdded=")
            .append(dateAdded)
            .append(",\n dateLastModified=")
            .append(dateLastModified)
            .append(",\n entities=")
            .append(entities)
            .append(",\n externalID=")
            .append(externalID)
            .append(",\n isDeleted=")
            .append(isDeleted)
            .append(",\n jobOrder=")
            .append(jobOrder)
            .append(",\n jobOrders=")
            .append(jobOrders)
            .append(",\n leads=")
            .append(leads)
            .append(",\n migrateGUID=")
            .append(migrateGUID)
            .append("\n luceneScore=")
            .append(luceneScore)
            .append(",\n minutesSpent=")
            .append(minutesSpent)
            .append(",\n opportunities=")
            .append(opportunities)
            .append(",\n personReference=")
            .append(personReference)
            .append(",\n placements=")
            .append(placements)
            .append("}");
        return sb.toString();
    }
}
