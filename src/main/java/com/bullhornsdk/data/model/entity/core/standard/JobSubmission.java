package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.embedded.OneToManyLinkedId;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "appointments", "billRate", "candidate", "dateAdded", "dateLastModified", "dateWebResponse", "isDeleted", "isHidden", "jobOrder",
		"migrateGUID", "payRate", "salary", "sendingUser", "source", "status", "tasks" })
public class JobSubmission extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, SearchEntity, DateLastModifiedEntity, EditHistoryEntity {

	private Integer id;
	private OneToManyLinkedId appointments;
	private BigDecimal billRate;
	private Candidate candidate;
	private DateTime dateAdded;
	private DateTime dateLastModified;
	private DateTime dateWebResponse;
	private Boolean isDeleted;
	private Boolean isHidden;
	private JobOrder jobOrder;
	private String migrateGUID;
	private BigDecimal payRate;
	private BigDecimal salary;
	private CorporateUser sendingUser;

	@JsonIgnore
	@Size(max = 100)
	private String source;

	@JsonIgnore
	@Size(max = 30)
	private String status;

	private OneToMany<Task> tasks;

	public JobSubmission() {
		super();
	}

	public JobSubmission(Integer id) {
		super();
		this.id = id;
	}

	/**
	 * Returns the entity with the required fields for an insert set.
	 * 
	 * @return
	 */
	public JobSubmission instantiateForInsert() {
		JobSubmission entity = new JobSubmission();
		entity.setIsDeleted(Boolean.FALSE);
		entity.setStatus("Submitted");
		entity.setCandidate(new Candidate(1));
		entity.setSendingUser(new CorporateUser(1));
		entity.setJobOrder(new JobOrder(1));
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

	@JsonProperty("appointments")
	public OneToManyLinkedId getAppointments() {
		return appointments;
	}

	@JsonProperty("appointments")
	public void setAppointments(OneToManyLinkedId appointments) {
		this.appointments = appointments;
	}

	@JsonProperty("billRate")
	public BigDecimal getBillRate() {
		return billRate;
	}

	@JsonProperty("billRate")
	public void setBillRate(BigDecimal billRate) {
		this.billRate = billRate;
	}

	@JsonProperty("candidate")
	public Candidate getCandidate() {
		return candidate;
	}

	@JsonProperty("candidate")
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
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

	@JsonProperty("dateWebResponse")
	public DateTime getDateWebResponse() {
		return dateWebResponse;
	}

	@JsonProperty("dateWebResponse")
	public void setDateWebResponse(DateTime dateWebResponse) {
		this.dateWebResponse = dateWebResponse;
	}

	@JsonProperty("isDeleted")
	public Boolean getIsDeleted() {
		return isDeleted;
	}

	@JsonProperty("isDeleted")
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@JsonProperty("isHidden")
	public Boolean getIsHidden() {
		return isHidden;
	}

	@JsonProperty("isHidden")
	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
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

	@JsonProperty("payRate")
	public BigDecimal getPayRate() {
		return payRate;
	}

	@JsonProperty("payRate")
	public void setPayRate(BigDecimal payRate) {
		this.payRate = payRate;
	}

	@JsonProperty("salary")
	public BigDecimal getSalary() {
		return salary;
	}

	@JsonProperty("salary")
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@JsonProperty("sendingUser")
	public CorporateUser getSendingUser() {
		return sendingUser;
	}

	@JsonProperty("sendingUser")
	public void setSendingUser(CorporateUser sendingUser) {
		this.sendingUser = sendingUser;
	}

	@JsonProperty("source")
	public String getSource() {
		return source;
	}

	@JsonIgnore
	public void setSource(String source) {
		this.source = source;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonIgnore
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("tasks")
	public OneToMany<Task> getTasks() {
		return tasks;
	}

	@JsonProperty("tasks")
	public void setTasks(OneToMany<Task> tasks) {
		this.tasks = tasks;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		JobSubmission that = (JobSubmission) o;

		if (id != null ? !id.equals(that.id) : that.id != null) return false;
		if (appointments != null ? !appointments.equals(that.appointments) : that.appointments != null) return false;
		if (billRate != null ? !billRate.equals(that.billRate) : that.billRate != null) return false;
		if (candidate != null ? !candidate.equals(that.candidate) : that.candidate != null) return false;
		if (dateAdded != null ? !dateAdded.equals(that.dateAdded) : that.dateAdded != null) return false;
		if (dateLastModified != null ? !dateLastModified.equals(that.dateLastModified) : that.dateLastModified != null)
			return false;
		if (dateWebResponse != null ? !dateWebResponse.equals(that.dateWebResponse) : that.dateWebResponse != null)
			return false;
		if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;
		if (isHidden != null ? !isHidden.equals(that.isHidden) : that.isHidden != null) return false;
		if (jobOrder != null ? !jobOrder.equals(that.jobOrder) : that.jobOrder != null) return false;
		if (migrateGUID != null ? !migrateGUID.equals(that.migrateGUID) : that.migrateGUID != null) return false;
		if (payRate != null ? !payRate.equals(that.payRate) : that.payRate != null) return false;
		if (salary != null ? !salary.equals(that.salary) : that.salary != null) return false;
		if (sendingUser != null ? !sendingUser.equals(that.sendingUser) : that.sendingUser != null) return false;
		if (source != null ? !source.equals(that.source) : that.source != null) return false;
		if (status != null ? !status.equals(that.status) : that.status != null) return false;
		return !(tasks != null ? !tasks.equals(that.tasks) : that.tasks != null);

	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (appointments != null ? appointments.hashCode() : 0);
		result = 31 * result + (billRate != null ? billRate.hashCode() : 0);
		result = 31 * result + (candidate != null ? candidate.hashCode() : 0);
		result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
		result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
		result = 31 * result + (dateWebResponse != null ? dateWebResponse.hashCode() : 0);
		result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
		result = 31 * result + (isHidden != null ? isHidden.hashCode() : 0);
		result = 31 * result + (jobOrder != null ? jobOrder.hashCode() : 0);
		result = 31 * result + (migrateGUID != null ? migrateGUID.hashCode() : 0);
		result = 31 * result + (payRate != null ? payRate.hashCode() : 0);
		result = 31 * result + (salary != null ? salary.hashCode() : 0);
		result = 31 * result + (sendingUser != null ? sendingUser.hashCode() : 0);
		result = 31 * result + (source != null ? source.hashCode() : 0);
		result = 31 * result + (status != null ? status.hashCode() : 0);
		result = 31 * result + (tasks != null ? tasks.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "JobSubmission{" +
				"id=" + id +
				", appointments=" + appointments +
				", billRate=" + billRate +
				", candidate=" + candidate +
				", dateAdded=" + dateAdded +
				", dateLastModified=" + dateLastModified +
				", dateWebResponse=" + dateWebResponse +
				", isDeleted=" + isDeleted +
				", isHidden=" + isHidden +
				", jobOrder=" + jobOrder +
				", migrateGUID='" + migrateGUID + '\'' +
				", payRate=" + payRate +
				", salary=" + salary +
				", sendingUser=" + sendingUser +
				", source='" + source + '\'' +
				", status='" + status + '\'' +
				", tasks=" + tasks +
				'}';
	}
}