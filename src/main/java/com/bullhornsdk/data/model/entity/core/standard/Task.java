package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToManyLinkedId;
import com.bullhornsdk.data.validation.BullhornUUID;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "candidate", "childTasks", "clientContact", "dateAdded", "dateBegin", "dateCompleted", "dateEnd",
		"dateLastModified", "description", "isCompleted", "isDeleted", "isPrivate", "isSystemTask", "jobOrder", "jobSubmission", "lead",
		"migrateGUID", "notificationMinutes", "opportunity", "owner", "parentTask", "priority", "placement", "recurrenceDayBits", "recurrenceFrequency",
		"recurrenceMax", "recurrenceMonthBits", "recurrenceStyle", "recurrenceType", "subject", "taskUUID", "timeZoneID", "type" })
public class Task extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, DateLastModifiedEntity {

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

	private Lead lead;

	private String migrateGUID;

	private Integer notificationMinutes;

	private Opportunity opportunity;

	private CorporateUser owner;

	private Task parentTask;

	private Integer priority;

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

	@JsonProperty("lead")
	public Lead getLead() {
		return lead;
	}

	@JsonProperty("lead")
	public void setLead(Lead lead) {
		this.lead = lead;
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

	@JsonProperty("opportunity")
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

	@JsonProperty("priority")
	public Integer getPriority() {
		return priority;
	}

	@JsonProperty("priority")
	public void setPriority(Integer priority) {
		this.priority = priority;
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
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Task task = (Task) o;

		if (id != null ? !id.equals(task.id) : task.id != null) return false;
		if (candidate != null ? !candidate.equals(task.candidate) : task.candidate != null) return false;
		if (childTasks != null ? !childTasks.equals(task.childTasks) : task.childTasks != null) return false;
		if (clientContact != null ? !clientContact.equals(task.clientContact) : task.clientContact != null)
			return false;
		if (dateAdded != null ? !dateAdded.equals(task.dateAdded) : task.dateAdded != null) return false;
		if (dateBegin != null ? !dateBegin.equals(task.dateBegin) : task.dateBegin != null) return false;
		if (dateCompleted != null ? !dateCompleted.equals(task.dateCompleted) : task.dateCompleted != null)
			return false;
		if (dateEnd != null ? !dateEnd.equals(task.dateEnd) : task.dateEnd != null) return false;
		if (dateLastModified != null ? !dateLastModified.equals(task.dateLastModified) : task.dateLastModified != null)
			return false;
		if (description != null ? !description.equals(task.description) : task.description != null) return false;
		if (isCompleted != null ? !isCompleted.equals(task.isCompleted) : task.isCompleted != null) return false;
		if (isDeleted != null ? !isDeleted.equals(task.isDeleted) : task.isDeleted != null) return false;
		if (isPrivate != null ? !isPrivate.equals(task.isPrivate) : task.isPrivate != null) return false;
		if (isSystemTask != null ? !isSystemTask.equals(task.isSystemTask) : task.isSystemTask != null) return false;
		if (jobOrder != null ? !jobOrder.equals(task.jobOrder) : task.jobOrder != null) return false;
		if (jobSubmission != null ? !jobSubmission.equals(task.jobSubmission) : task.jobSubmission != null)
			return false;
		if (lead != null ? !lead.equals(task.lead) : task.lead != null) return false;
		if (migrateGUID != null ? !migrateGUID.equals(task.migrateGUID) : task.migrateGUID != null) return false;
		if (notificationMinutes != null ? !notificationMinutes.equals(task.notificationMinutes) : task.notificationMinutes != null)
			return false;
		if (opportunity != null ? !opportunity.equals(task.opportunity) : task.opportunity != null) return false;
		if (owner != null ? !owner.equals(task.owner) : task.owner != null) return false;
		if (parentTask != null ? !parentTask.equals(task.parentTask) : task.parentTask != null) return false;
		if (priority != null ? !priority.equals(task.priority) : task.priority != null) return false;
		if (placement != null ? !placement.equals(task.placement) : task.placement != null) return false;
		if (recurrenceDayBits != null ? !recurrenceDayBits.equals(task.recurrenceDayBits) : task.recurrenceDayBits != null)
			return false;
		if (recurrenceFrequency != null ? !recurrenceFrequency.equals(task.recurrenceFrequency) : task.recurrenceFrequency != null)
			return false;
		if (recurrenceMax != null ? !recurrenceMax.equals(task.recurrenceMax) : task.recurrenceMax != null)
			return false;
		if (recurrenceMonthBits != null ? !recurrenceMonthBits.equals(task.recurrenceMonthBits) : task.recurrenceMonthBits != null)
			return false;
		if (recurrenceStyle != null ? !recurrenceStyle.equals(task.recurrenceStyle) : task.recurrenceStyle != null)
			return false;
		if (recurrenceType != null ? !recurrenceType.equals(task.recurrenceType) : task.recurrenceType != null)
			return false;
		if (subject != null ? !subject.equals(task.subject) : task.subject != null) return false;
		if (taskUUID != null ? !taskUUID.equals(task.taskUUID) : task.taskUUID != null) return false;
		if (timeZoneID != null ? !timeZoneID.equals(task.timeZoneID) : task.timeZoneID != null) return false;
		return !(type != null ? !type.equals(task.type) : task.type != null);

	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (candidate != null ? candidate.hashCode() : 0);
		result = 31 * result + (childTasks != null ? childTasks.hashCode() : 0);
		result = 31 * result + (clientContact != null ? clientContact.hashCode() : 0);
		result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
		result = 31 * result + (dateBegin != null ? dateBegin.hashCode() : 0);
		result = 31 * result + (dateCompleted != null ? dateCompleted.hashCode() : 0);
		result = 31 * result + (dateEnd != null ? dateEnd.hashCode() : 0);
		result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (isCompleted != null ? isCompleted.hashCode() : 0);
		result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
		result = 31 * result + (isPrivate != null ? isPrivate.hashCode() : 0);
		result = 31 * result + (isSystemTask != null ? isSystemTask.hashCode() : 0);
		result = 31 * result + (jobOrder != null ? jobOrder.hashCode() : 0);
		result = 31 * result + (jobSubmission != null ? jobSubmission.hashCode() : 0);
		result = 31 * result + (lead != null ? lead.hashCode() : 0);
		result = 31 * result + (migrateGUID != null ? migrateGUID.hashCode() : 0);
		result = 31 * result + (notificationMinutes != null ? notificationMinutes.hashCode() : 0);
		result = 31 * result + (opportunity != null ? opportunity.hashCode() : 0);
		result = 31 * result + (owner != null ? owner.hashCode() : 0);
		result = 31 * result + (parentTask != null ? parentTask.hashCode() : 0);
		result = 31 * result + (priority != null ? priority.hashCode() : 0);
		result = 31 * result + (placement != null ? placement.hashCode() : 0);
		result = 31 * result + (recurrenceDayBits != null ? recurrenceDayBits.hashCode() : 0);
		result = 31 * result + (recurrenceFrequency != null ? recurrenceFrequency.hashCode() : 0);
		result = 31 * result + (recurrenceMax != null ? recurrenceMax.hashCode() : 0);
		result = 31 * result + (recurrenceMonthBits != null ? recurrenceMonthBits.hashCode() : 0);
		result = 31 * result + (recurrenceStyle != null ? recurrenceStyle.hashCode() : 0);
		result = 31 * result + (recurrenceType != null ? recurrenceType.hashCode() : 0);
		result = 31 * result + (subject != null ? subject.hashCode() : 0);
		result = 31 * result + (taskUUID != null ? taskUUID.hashCode() : 0);
		result = 31 * result + (timeZoneID != null ? timeZoneID.hashCode() : 0);
		result = 31 * result + (type != null ? type.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Task{" +
				"id=" + id +
				", candidate=" + candidate +
				", childTasks=" + childTasks +
				", clientContact=" + clientContact +
				", dateAdded=" + dateAdded +
				", dateBegin=" + dateBegin +
				", dateCompleted=" + dateCompleted +
				", dateEnd=" + dateEnd +
				", dateLastModified=" + dateLastModified +
				", description='" + description + '\'' +
				", isCompleted=" + isCompleted +
				", isDeleted=" + isDeleted +
				", isPrivate=" + isPrivate +
				", isSystemTask=" + isSystemTask +
				", jobOrder=" + jobOrder +
				", jobSubmission=" + jobSubmission +
				", lead=" + lead +
				", migrateGUID='" + migrateGUID + '\'' +
				", notificationMinutes=" + notificationMinutes +
				", opportunity=" + opportunity +
				", owner=" + owner +
				", parentTask=" + parentTask +
				", priority=" + priority +
				", placement=" + placement +
				", recurrenceDayBits=" + recurrenceDayBits +
				", recurrenceFrequency=" + recurrenceFrequency +
				", recurrenceMax=" + recurrenceMax +
				", recurrenceMonthBits=" + recurrenceMonthBits +
				", recurrenceStyle='" + recurrenceStyle + '\'' +
				", recurrenceType='" + recurrenceType + '\'' +
				", subject='" + subject + '\'' +
				", taskUUID='" + taskUUID + '\'' +
				", timeZoneID='" + timeZoneID + '\'' +
				", type='" + type + '\'' +
				'}';
	}
}