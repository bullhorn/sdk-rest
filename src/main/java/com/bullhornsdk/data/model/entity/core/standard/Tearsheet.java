package com.bullhornsdk.data.model.entity.core.standard;


import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "candidate", "clientContacts", " dateAdded", "description", "isDeleted", "isPrivate", "jobOrders", "name", "owner" })
public class Tearsheet extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, AssociationEntity {

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

	public Tearsheet() {
		super();
	}

	@Override
	public Tearsheet instantiateForInsert(){
		Tearsheet tearsheet = new Tearsheet();
		return tearsheet;
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

	@JsonIgnore
	public CorporateUser getOwner() {
		return owner;
	}

	@JsonProperty("owner")
	public void setOwner(CorporateUser owner) {
		this.owner = owner;
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