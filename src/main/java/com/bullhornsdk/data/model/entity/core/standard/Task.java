package com.bullhornsdk.data.model.entity.core.standard;

import javax.validation.constraints.Size;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToManyLinkedId;
import com.bullhornsdk.data.validation.BullhornUUID;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "candidate", "childTasks", "clientContact", "dateAdded", "dateBegin", "dateCompleted", "dateEnd",
		"dateLastModified", "description", "isCompleted", "isDeleted", "isPrivate", "isSystemTask", "jobOrder", "jobSubmission",
		"migrateGUID", "notificationMinutes", "opportunity", "owner", "parentTask", "placement", "recurrenceDayBits", "recurrenceFrequency",
		"recurrenceMax", "recurrenceMonthBits", "recurrenceStyle", "recurrenceType", "subject", "taskUUID", "timeZoneID", "type" })
public class Task extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity {

	private Integer id;

	private Candidate candidate;

	private OneToManyLinkedId childTasks;

	private ClientContact clientContact;

	private DateTime dateAdded;

	private DateTime dateBegin;

	private DateTime dateCompleted;

	private DateTime dateEnd;

	private DateTime dateLastModified;

	private String description;

	private Boolean isCompleted;

	private Boolean isDeleted;

	private Boolean isPrivate;

	private Boolean isSystemTask;

	private JobOrder jobOrder;

	private JobSubmission jobSubmission;

	private String migrateGUID;

	private Integer notificationMinutes;

	private Opportunity opportunity;

	private CorporateUser owner;

	private Task parentTask;

	private Placement placement;

	private Integer recurrenceDayBits;

	private Integer recurrenceFrequency;

	private Integer recurrenceMax;

	private Integer recurrenceMonthBits;

	@Size(max = 10)
	private String recurrenceStyle;

	@Size(max = 1)
	private String recurrenceType;

	@Size(max = 100)
	private String subject;

	@BullhornUUID
	@Size(max = 35)
	private String taskUUID;

	@Size(max = 50)
	private String timeZoneID;

	@Size(max = 30)
	private String type;

	public Task() {
		super();
	}

	/**
	 * Returns the entity with the required fields for an insert set.
	 * 
	 * @return
	 */
	public Task instantiateForInsert() {
		Task entity = new Task();
		entity.setIsCompleted(Boolean.FALSE);
		entity.setIsDeleted(Boolean.FALSE);
		entity.setIsPrivate(Boolean.FALSE);
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

	@JsonProperty("childTasks")
	public OneToManyLinkedId getChildTasks() {
		return childTasks;
	}

	@JsonProperty("childTasks")
	public void setChildTasks(OneToManyLinkedId childTasks) {
		this.childTasks = childTasks;
	}

	@JsonProperty("clientContact")
	public ClientContact getClientContact() {
		return clientContact;
	}

	@JsonProperty("clientContact")
	public void setClientContact(ClientContact clientContact) {
		this.clientContact = clientContact;
	}

	@JsonProperty("dateAdded")
	public DateTime getDateAdded() {
		return dateAdded;
	}

	@JsonProperty("dateAdded")
	public void setDateAdded(DateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	@JsonProperty("dateBegin")
	public DateTime getDateBegin() {
		return dateBegin;
	}

	@JsonProperty("dateBegin")
	public void setDateBegin(DateTime dateBegin) {
		this.dateBegin = dateBegin;
	}

	@JsonProperty("dateCompleted")
	public DateTime getDateCompleted() {
		return dateCompleted;
	}

	@JsonProperty("dateCompleted")
	public void setDateCompleted(DateTime dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	@JsonProperty("dateEnd")
	public DateTime getDateEnd() {
		return dateEnd;
	}

	@JsonProperty("dateEnd")
	public void setDateEnd(DateTime dateEnd) {
		this.dateEnd = dateEnd;
	}

	@JsonProperty("dateLastModified")
	public DateTime getDateLastModified() {
		return dateLastModified;
	}

	@JsonProperty("dateLastModified")
	public void setDateLastModified(DateTime dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("isCompleted")
	public Boolean getIsCompleted() {
		return isCompleted;
	}

	@JsonProperty("isCompleted")
	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
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

	@JsonProperty("isSystemTask")
	public Boolean getIsSystemTask() {
		return isSystemTask;
	}

	@JsonProperty("isSystemTask")
	public void setIsSystemTask(Boolean isSystemTask) {
		this.isSystemTask = isSystemTask;
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

	@JsonProperty("notificationMinutes")
	public Integer getNotificationMinutes() {
		return notificationMinutes;
	}

	@JsonProperty("notificationMinutes")
	public void setNotificationMinutes(Integer notificationMinutes) {
		this.notificationMinutes = notificationMinutes;
	}

	@JsonProperty("opportunity")
	public Opportunity getOpportunity() {
		return opportunity;
	}

	public void setOpportunity(Opportunity opportunity) {
		this.opportunity = opportunity;
	}

	@JsonProperty("owner")
	public CorporateUser getOwner() {
		return owner;
	}

	@JsonProperty("owner")
	public void setOwner(CorporateUser owner) {
		this.owner = owner;
	}

	@JsonProperty("parentTask")
	public Task getParentTask() {
		return parentTask;
	}

	@JsonProperty("parentTask")
	public void setParentTask(Task parentTask) {
		this.parentTask = parentTask;
	}

	@JsonProperty("placement")
	public Placement getPlacement() {
		return placement;
	}

	@JsonProperty("placement")
	public void setPlacement(Placement placement) {
		this.placement = placement;
	}

	@JsonProperty("recurrenceDayBits")
	public Integer getRecurrenceDayBits() {
		return recurrenceDayBits;
	}

	@JsonProperty("recurrenceDayBits")
	public void setRecurrenceDayBits(Integer recurrenceDayBits) {
		this.recurrenceDayBits = recurrenceDayBits;
	}

	@JsonProperty("recurrenceFrequency")
	public Integer getRecurrenceFrequency() {
		return recurrenceFrequency;
	}

	@JsonProperty("recurrenceFrequency")
	public void setRecurrenceFrequency(Integer recurrenceFrequency) {
		this.recurrenceFrequency = recurrenceFrequency;
	}

	@JsonProperty("recurrenceMax")
	public Integer getRecurrenceMax() {
		return recurrenceMax;
	}

	@JsonProperty("recurrenceMax")
	public void setRecurrenceMax(Integer recurrenceMax) {
		this.recurrenceMax = recurrenceMax;
	}

	@JsonProperty("recurrenceMonthBits")
	public Integer getRecurrenceMonthBits() {
		return recurrenceMonthBits;
	}

	@JsonProperty("recurrenceMonthBits")
	public void setRecurrenceMonthBits(Integer recurrenceMonthBits) {
		this.recurrenceMonthBits = recurrenceMonthBits;
	}

	@JsonProperty("recurrenceStyle")
	public String getRecurrenceStyle() {
		return recurrenceStyle;
	}

	@JsonProperty("recurrenceStyle")
	public void setRecurrenceStyle(String recurrenceStyle) {
		this.recurrenceStyle = recurrenceStyle;
	}

	@JsonProperty("recurrenceType")
	public String getRecurrenceType() {
		return recurrenceType;
	}

	@JsonProperty("recurrenceType")
	public void setRecurrenceType(String recurrenceType) {
		this.recurrenceType = recurrenceType;
	}

	@JsonProperty("subject")
	public String getSubject() {
		return subject;
	}

	@JsonProperty("subject")
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@JsonProperty("taskUUID")
	public String getTaskUUID() {
		return taskUUID;
	}

	@JsonProperty("taskUUID")
	public void setTaskUUID(String taskUUID) {
		this.taskUUID = taskUUID;
	}

	@JsonProperty("timeZoneID")
	public String getTimeZoneID() {
		return timeZoneID;
	}

	@JsonProperty("timeZoneID")
	public void setTimeZoneID(String timeZoneID) {
		this.timeZoneID = timeZoneID;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((candidate == null) ? 0 : candidate.hashCode());
		result = prime * result + ((childTasks == null) ? 0 : childTasks.hashCode());
		result = prime * result + ((clientContact == null) ? 0 : clientContact.hashCode());
		result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
		result = prime * result + ((dateBegin == null) ? 0 : dateBegin.hashCode());
		result = prime * result + ((dateCompleted == null) ? 0 : dateCompleted.hashCode());
		result = prime * result + ((dateEnd == null) ? 0 : dateEnd.hashCode());
		result = prime * result + ((dateLastModified == null) ? 0 : dateLastModified.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isCompleted == null) ? 0 : isCompleted.hashCode());
		result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
		result = prime * result + ((isPrivate == null) ? 0 : isPrivate.hashCode());
		result = prime * result + ((isSystemTask == null) ? 0 : isSystemTask.hashCode());
		result = prime * result + ((jobOrder == null) ? 0 : jobOrder.hashCode());
		result = prime * result + ((jobSubmission == null) ? 0 : jobSubmission.hashCode());
		result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
		result = prime * result + ((notificationMinutes == null) ? 0 : notificationMinutes.hashCode());
		result = prime * result + ((opportunity == null) ? 0 : opportunity.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((parentTask == null) ? 0 : parentTask.hashCode());
		result = prime * result + ((placement == null) ? 0 : placement.hashCode());
		result = prime * result + ((recurrenceDayBits == null) ? 0 : recurrenceDayBits.hashCode());
		result = prime * result + ((recurrenceFrequency == null) ? 0 : recurrenceFrequency.hashCode());
		result = prime * result + ((recurrenceMax == null) ? 0 : recurrenceMax.hashCode());
		result = prime * result + ((recurrenceMonthBits == null) ? 0 : recurrenceMonthBits.hashCode());
		result = prime * result + ((recurrenceStyle == null) ? 0 : recurrenceStyle.hashCode());
		result = prime * result + ((recurrenceType == null) ? 0 : recurrenceType.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + ((taskUUID == null) ? 0 : taskUUID.hashCode());
		result = prime * result + ((timeZoneID == null) ? 0 : timeZoneID.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Task other = (Task) obj;
		if (candidate == null) {
			if (other.candidate != null)
				return false;
		} else if (!candidate.equals(other.candidate))
			return false;
		if (childTasks == null) {
			if (other.childTasks != null)
				return false;
		} else if (!childTasks.equals(other.childTasks))
			return false;
		if (clientContact == null) {
			if (other.clientContact != null)
				return false;
		} else if (!clientContact.equals(other.clientContact))
			return false;
		if (dateAdded == null) {
			if (other.dateAdded != null)
				return false;
		} else if (!dateAdded.isEqual(other.dateAdded))
			return false;
		if (dateBegin == null) {
			if (other.dateBegin != null)
				return false;
		} else if (!dateBegin.isEqual(other.dateBegin))
			return false;
		if (dateCompleted == null) {
			if (other.dateCompleted != null)
				return false;
		} else if (!dateCompleted.isEqual(other.dateCompleted))
			return false;
		if (dateEnd == null) {
			if (other.dateEnd != null)
				return false;
		} else if (!dateEnd.isEqual(other.dateEnd))
			return false;
		if (dateLastModified == null) {
			if (other.dateLastModified != null)
				return false;
		} else if (!dateLastModified.isEqual(other.dateLastModified))
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
		if (isCompleted == null) {
			if (other.isCompleted != null)
				return false;
		} else if (!isCompleted.equals(other.isCompleted))
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
		if (isSystemTask == null) {
			if (other.isSystemTask != null)
				return false;
		} else if (!isSystemTask.equals(other.isSystemTask))
			return false;
		if (jobOrder == null) {
			if (other.jobOrder != null)
				return false;
		} else if (!jobOrder.equals(other.jobOrder))
			return false;
		if (jobSubmission == null) {
			if (other.jobSubmission != null)
				return false;
		} else if (!jobSubmission.equals(other.jobSubmission))
			return false;
		if (migrateGUID == null) {
			if (other.migrateGUID != null)
				return false;
		} else if (!migrateGUID.equals(other.migrateGUID))
			return false;
		if (notificationMinutes == null) {
			if (other.notificationMinutes != null)
				return false;
		} else if (!notificationMinutes.equals(other.notificationMinutes))
			return false;
		if (opportunity == null) {
			if (other.opportunity != null)
				return false;
		} else if (!opportunity.equals(other.opportunity))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (parentTask == null) {
			if (other.parentTask != null)
				return false;
		} else if (!parentTask.equals(other.parentTask))
			return false;
		if (placement == null) {
			if (other.placement != null)
				return false;
		} else if (!placement.equals(other.placement))
			return false;
		if (recurrenceDayBits == null) {
			if (other.recurrenceDayBits != null)
				return false;
		} else if (!recurrenceDayBits.equals(other.recurrenceDayBits))
			return false;
		if (recurrenceFrequency == null) {
			if (other.recurrenceFrequency != null)
				return false;
		} else if (!recurrenceFrequency.equals(other.recurrenceFrequency))
			return false;
		if (recurrenceMax == null) {
			if (other.recurrenceMax != null)
				return false;
		} else if (!recurrenceMax.equals(other.recurrenceMax))
			return false;
		if (recurrenceMonthBits == null) {
			if (other.recurrenceMonthBits != null)
				return false;
		} else if (!recurrenceMonthBits.equals(other.recurrenceMonthBits))
			return false;
		if (recurrenceStyle == null) {
			if (other.recurrenceStyle != null)
				return false;
		} else if (!recurrenceStyle.equals(other.recurrenceStyle))
			return false;
		if (recurrenceType == null) {
			if (other.recurrenceType != null)
				return false;
		} else if (!recurrenceType.equals(other.recurrenceType))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		if (taskUUID == null) {
			if (other.taskUUID != null)
				return false;
		} else if (!taskUUID.equals(other.taskUUID))
			return false;
		if (timeZoneID == null) {
			if (other.timeZoneID != null)
				return false;
		} else if (!timeZoneID.equals(other.timeZoneID))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return new StringBuilder("Task {")
                .append("\n\t\"candidate\": ")
                .append(candidate)
                .append(",\n\t\"id\": ")
                .append(id)
                .append(",\n\t\"childTasks\": ")
                .append(childTasks)
                .append(",\n\t\"clientContact\": ")
                .append(clientContact)
                .append(",\n\t\"dateAdded\": ")
                .append(dateAdded)
                .append(",\n\t\"dateBegin\": ")
                .append(dateBegin)
                .append(",\n\t\"dateCompleted\": ")
                .append(dateCompleted)
                .append(",\n\t\"dateEnd\": ")
                .append(dateEnd)
                .append(",\n\t\"dateLastModified\": ")
                .append(dateLastModified)
                .append(",\n\t\"description\": ")
                .append("'")
                .append(description).append('\'')
                .append(",\n\t\"isCompleted\": ")
                .append(isCompleted)
                .append(",\n\t\"isDeleted\": ")
                .append(isDeleted)
                .append(",\n\t\"isPrivate\": ")
                .append(isPrivate)
                .append(",\n\t\"isSystemTask\": ")
                .append(isSystemTask)
                .append(",\n\t\"jobOrder\": ")
                .append(jobOrder)
                .append(",\n\t\"jobSubmission\": ")
                .append(jobSubmission)
                .append(",\n\t\"migrateGUID\": ")
                .append("'")
                .append(migrateGUID).append('\'')
                .append(",\n\t\"notificationMinutes\": ")
                .append(notificationMinutes)
				.append(",\n\t\"opportunity\": ")
				.append(opportunity)
                .append(",\n\t\"owner\": ")
                .append(owner)
                .append(",\n\t\"parentTask\": ")
                .append(parentTask)
                .append(",\n\t\"placement\": ")
                .append(placement)
                .append(",\n\t\"recurrenceDayBits\": ")
                .append(recurrenceDayBits)
                .append(",\n\t\"recurrenceFrequency\": ")
                .append(recurrenceFrequency)
                .append(",\n\t\"recurrenceMax\": ")
                .append(recurrenceMax)
                .append(",\n\t\"recurrenceMonthBits\": ")
                .append(recurrenceMonthBits)
                .append(",\n\t\"recurrenceStyle\": ")
                .append("'")
                .append(recurrenceStyle).append('\'')
                .append(",\n\t\"recurrenceType\": ")
                .append("'")
                .append(recurrenceType).append('\'')
                .append(",\n\t\"subject\": ")
                .append("'")
                .append(subject).append('\'')
                .append(",\n\t\"taskUUID\": ")
                .append("'")
                .append(taskUUID).append('\'')
                .append(",\n\t\"timeZoneID\": ")
                .append("'")
                .append(timeZoneID).append('\'')
                .append(",\n\t\"type\": ")
                .append("'")
                .append(type).append('\'')
                .append('}')
                .toString();
    }
}