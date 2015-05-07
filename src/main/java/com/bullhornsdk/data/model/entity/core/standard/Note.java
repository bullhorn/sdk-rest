package com.bullhornsdk.data.model.entity.core.standard;

import java.math.BigDecimal;

import javax.validation.constraints.Size;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.LinkedPerson;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.embedded.OneToManyLinkedId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "action", "bhTimeStamp", "candidates", "clientContacts", "commentingPerson", "comments", "corporateUsers",
		"dateAdded", "entities", "isDeleted", "jobOrder", "jobOrders", "migrateGUID", "minutesSpent", "personReference", "placements" })
public class Note extends AbstractEntity implements SearchEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, AssociationEntity {

	private BigDecimal luceneScore;

	private Integer id;

	@JsonIgnore
	@Size(max = 30)
	private String action;

	private String bhTimeStamp;

	private OneToMany<Candidate> candidates;

	private OneToMany<ClientContact> clientContacts;

	private LinkedPerson commentingPerson;

	@JsonIgnore
	private String comments;

	private OneToMany<CorporateUser> corporateUsers;

	private DateTime dateAdded;

	private OneToManyLinkedId entities;

	private Boolean isDeleted;

	private JobOrder jobOrder;

	private OneToMany<JobOrder> jobOrders;

	private String migrateGUID;

	private Integer minutesSpent;

	private LinkedPerson personReference;

	private OneToMany<Placement> placements;

	public Note() {
		super();
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

	@JsonProperty("bhTimeStamp")
	public void setBhTimeStamp(String bhTimeStamp) {
		this.bhTimeStamp = bhTimeStamp;
	}

	@JsonIgnore
	public OneToMany<Candidate> getCandidates() {
		return candidates;
	}

	@JsonProperty("candidates")
	public void setCandidates(OneToMany<Candidate> candidates) {
		this.candidates = candidates;
	}

	@JsonIgnore
	public OneToMany<ClientContact> getClientContacts() {
		return clientContacts;
	}

	@JsonProperty("clientContacts")
	public void setClientContacts(OneToMany<ClientContact> clientContacts) {
		this.clientContacts = clientContacts;
	}

	@JsonProperty("commentingPerson")
	public LinkedPerson getCommentingPerson() {
		return commentingPerson;
	}

	@JsonProperty("commentingPerson")
	public void setCommentingPerson(LinkedPerson commentingPerson) {
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

	@JsonProperty("dateAdded")
	public void setDateAdded(DateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	@JsonIgnore
	public OneToManyLinkedId getEntities() {
		return entities;
	}

	@JsonProperty("entities")
	public void setEntities(OneToManyLinkedId entities) {
		this.entities = entities;
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

	@JsonIgnore
	public OneToMany<JobOrder> getJobOrders() {
		return jobOrders;
	}

	@JsonProperty("jobOrders")
	public void setJobOrders(OneToMany<JobOrder> jobOrders) {
		this.jobOrders = jobOrders;
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

	@JsonProperty("personReference")
	public LinkedPerson getPersonReference() {
		return personReference;
	}

	@JsonProperty("personReference")
	public void setPersonReference(LinkedPerson personReference) {
		this.personReference = personReference;
	}

	@JsonIgnore
	public OneToMany<Placement> getPlacements() {
		return placements;
	}

	@JsonProperty("placements")
	public void setPlacements(OneToMany<Placement> placements) {
		this.placements = placements;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((action == null) ? 0 : action.hashCode());
		result = prime * result + ((bhTimeStamp == null) ? 0 : bhTimeStamp.hashCode());
		result = prime * result + ((candidates == null) ? 0 : candidates.hashCode());
		result = prime * result + ((clientContacts == null) ? 0 : clientContacts.hashCode());
		result = prime * result + ((commentingPerson == null) ? 0 : commentingPerson.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((corporateUsers == null) ? 0 : corporateUsers.hashCode());
		result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
		result = prime * result + ((entities == null) ? 0 : entities.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
		result = prime * result + ((jobOrder == null) ? 0 : jobOrder.hashCode());
		result = prime * result + ((jobOrders == null) ? 0 : jobOrders.hashCode());
		result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
		result = prime * result + ((minutesSpent == null) ? 0 : minutesSpent.hashCode());
		result = prime * result + ((personReference == null) ? 0 : personReference.hashCode());
		result = prime * result + ((placements == null) ? 0 : placements.hashCode());
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
		Note other = (Note) obj;
		if (action == null) {
			if (other.action != null)
				return false;
		} else if (!action.equals(other.action))
			return false;
		if (bhTimeStamp == null) {
			if (other.bhTimeStamp != null)
				return false;
		} else if (!bhTimeStamp.equals(other.bhTimeStamp))
			return false;
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
		if (commentingPerson == null) {
			if (other.commentingPerson != null)
				return false;
		} else if (!commentingPerson.equals(other.commentingPerson))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (corporateUsers == null) {
			if (other.corporateUsers != null)
				return false;
		} else if (!corporateUsers.equals(other.corporateUsers))
			return false;
		if (dateAdded == null) {
			if (other.dateAdded != null)
				return false;
		} else if (!dateAdded.isEqual(other.dateAdded))
			return false;
		if (entities == null) {
			if (other.entities != null)
				return false;
		} else if (!entities.equals(other.entities))
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
		if (jobOrder == null) {
			if (other.jobOrder != null)
				return false;
		} else if (!jobOrder.equals(other.jobOrder))
			return false;
		if (jobOrders == null) {
			if (other.jobOrders != null)
				return false;
		} else if (!jobOrders.equals(other.jobOrders))
			return false;
		if (migrateGUID == null) {
			if (other.migrateGUID != null)
				return false;
		} else if (!migrateGUID.equals(other.migrateGUID))
			return false;
		if (minutesSpent == null) {
			if (other.minutesSpent != null)
				return false;
		} else if (!minutesSpent.equals(other.minutesSpent))
			return false;
		if (personReference == null) {
			if (other.personReference != null)
				return false;
		} else if (!personReference.equals(other.personReference))
			return false;
		if (placements == null) {
			if (other.placements != null)
				return false;
		} else if (!placements.equals(other.placements))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Note {\nid=");
		builder.append(id);
		builder.append(", \naction=");
		builder.append(action);
		builder.append(", \nbhTimeStamp=");
		builder.append(bhTimeStamp);
		builder.append(", \ncandidates=");
		builder.append(candidates);
		builder.append(", \nclientContacts=");
		builder.append(clientContacts);
		builder.append(", \ncommentingPerson=");
		builder.append(commentingPerson);
		builder.append(", \ncomments=");
		builder.append(comments);
		builder.append(", \ncorporateUsers=");
		builder.append(corporateUsers);
		builder.append(", \ndateAdded=");
		builder.append(dateAdded);
		builder.append(", \nentities=");
		builder.append(entities);
		builder.append(", \nisDeleted=");
		builder.append(isDeleted);
		builder.append(", \njobOrder=");
		builder.append(jobOrder);
		builder.append(", \njobOrders=");
		builder.append(jobOrders);
		builder.append(", \nmigrateGUID=");
		builder.append(migrateGUID);
		builder.append(", \nminutesSpent=");
		builder.append(minutesSpent);
		builder.append(", \npersonReference=");
		builder.append(personReference);
		builder.append(", \nplacements=");
		builder.append(placements);
		builder.append(", \nadditionalProperties=");
		builder.append(this.getAdditionalProperties());
		builder.append("\n}");
		return builder.toString();
	}

}
