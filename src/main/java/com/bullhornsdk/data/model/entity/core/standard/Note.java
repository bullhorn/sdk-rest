package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.LinkedPerson;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "action", "bhTimeStamp", "candidates", "clientContacts", "commentingPerson", "comments", "corporateUsers",
		"dateAdded", "dateLastModified", "entities", "isDeleted", "jobOrder", "jobOrders", "migrateGUID", "minutesSpent", "personReference", "placements" })
public class Note extends AbstractEntity implements SearchEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, AssociationEntity, DateLastModifiedEntity {

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

	private DateTime dateLastModified;

	private OneToMany<NoteEntity> entities;

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

	@JsonProperty("dateLastModified")
	public DateTime getDateLastModified() {
		return dateLastModified;
	}

	@JsonProperty("dateLastModified")
	public void setDateLastModified(DateTime dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

	@JsonIgnore
	public OneToMany<NoteEntity> getEntities() {
		return entities;
	}

	@JsonProperty("entities")
	public void setEntities(OneToMany<NoteEntity> entities) {
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
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

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
		if (isDeleted != null ? !isDeleted.equals(note.isDeleted) : note.isDeleted != null) return false;
		if (jobOrder != null ? !jobOrder.equals(note.jobOrder) : note.jobOrder != null) return false;
		if (jobOrders != null ? !jobOrders.equals(note.jobOrders) : note.jobOrders != null) return false;
		if (migrateGUID != null ? !migrateGUID.equals(note.migrateGUID) : note.migrateGUID != null) return false;
		if (minutesSpent != null ? !minutesSpent.equals(note.minutesSpent) : note.minutesSpent != null) return false;
		if (personReference != null ? !personReference.equals(note.personReference) : note.personReference != null)
			return false;
		return !(placements != null ? !placements.equals(note.placements) : note.placements != null);

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
		result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
		result = 31 * result + (jobOrder != null ? jobOrder.hashCode() : 0);
		result = 31 * result + (jobOrders != null ? jobOrders.hashCode() : 0);
		result = 31 * result + (migrateGUID != null ? migrateGUID.hashCode() : 0);
		result = 31 * result + (minutesSpent != null ? minutesSpent.hashCode() : 0);
		result = 31 * result + (personReference != null ? personReference.hashCode() : 0);
		result = 31 * result + (placements != null ? placements.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Note{" +
				"luceneScore=" + luceneScore +
				", id=" + id +
				", action='" + action + '\'' +
				", bhTimeStamp='" + bhTimeStamp + '\'' +
				", candidates=" + candidates +
				", clientContacts=" + clientContacts +
				", commentingPerson=" + commentingPerson +
				", comments='" + comments + '\'' +
				", corporateUsers=" + corporateUsers +
				", dateAdded=" + dateAdded +
				", dateLastModified=" + dateLastModified +
				", entities=" + entities +
				", isDeleted=" + isDeleted +
				", jobOrder=" + jobOrder +
				", jobOrders=" + jobOrders +
				", migrateGUID='" + migrateGUID + '\'' +
				", minutesSpent=" + minutesSpent +
				", personReference=" + personReference +
				", placements=" + placements +
				'}';
	}
}
