package com.bullhornsdk.data.model.entity.core.standard;

import java.math.BigDecimal;

import javax.validation.constraints.Size;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.embedded.OneToManyLinkedId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "appointments", "billRate", "candidate", "dateAdded", "dateWebResponse", "isDeleted", "isHidden", "jobOrder",
		"migrateGUID", "payRate", "salary", "sendingUser", "source", "status", "tasks" })
public class JobSubmission extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, SearchEntity {

	private Integer id;
	private OneToManyLinkedId appointments;
	private BigDecimal billRate;
	private Candidate candidate;
	private DateTime dateAdded;
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
	public static JobSubmission instantiateForInsert() {
		JobSubmission entity = new JobSubmission();
		entity.setIsDeleted(Boolean.FALSE);
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appointments == null) ? 0 : appointments.hashCode());
		result = prime * result + ((billRate == null) ? 0 : billRate.hashCode());
		result = prime * result + ((candidate == null) ? 0 : candidate.hashCode());
		result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
		result = prime * result + ((dateWebResponse == null) ? 0 : dateWebResponse.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
		result = prime * result + ((isHidden == null) ? 0 : isHidden.hashCode());
		result = prime * result + ((jobOrder == null) ? 0 : jobOrder.hashCode());
		result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
		result = prime * result + ((payRate == null) ? 0 : payRate.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result + ((sendingUser == null) ? 0 : sendingUser.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((tasks == null) ? 0 : tasks.hashCode());
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
		JobSubmission other = (JobSubmission) obj;
		if (appointments == null) {
			if (other.appointments != null)
				return false;
		} else if (!appointments.equals(other.appointments))
			return false;
		if (billRate == null) {
			if (other.billRate != null)
				return false;
		} else if (!billRate.equals(other.billRate))
			return false;
		if (candidate == null) {
			if (other.candidate != null)
				return false;
		} else if (!candidate.equals(other.candidate))
			return false;
		if (dateAdded == null) {
			if (other.dateAdded != null)
				return false;
		} else if (!dateAdded.equals(other.dateAdded))
			return false;
		if (dateWebResponse == null) {
			if (other.dateWebResponse != null)
				return false;
		} else if (!dateWebResponse.equals(other.dateWebResponse))
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
		if (isHidden == null) {
			if (other.isHidden != null)
				return false;
		} else if (!isHidden.equals(other.isHidden))
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
		if (payRate == null) {
			if (other.payRate != null)
				return false;
		} else if (!payRate.equals(other.payRate))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		if (sendingUser == null) {
			if (other.sendingUser != null)
				return false;
		} else if (!sendingUser.equals(other.sendingUser))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (tasks == null) {
			if (other.tasks != null)
				return false;
		} else if (!tasks.equals(other.tasks))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getName());
		builder.append(" {\n\tid: ");
		builder.append(id);
		builder.append("\n\tappointments: ");
		builder.append(appointments);
		builder.append("\n\tbillRate: ");
		builder.append(billRate);
		builder.append("\n\tcandidate: ");
		builder.append(candidate);
		builder.append("\n\tdateAdded: ");
		builder.append(dateAdded);
		builder.append("\n\tdateWebResponse: ");
		builder.append(dateWebResponse);
		builder.append("\n\tisDeleted: ");
		builder.append(isDeleted);
		builder.append("\n\tisHidden: ");
		builder.append(isHidden);
		builder.append("\n\tjobOrder: ");
		builder.append(jobOrder);
		builder.append("\n\tmigrateGUID: ");
		builder.append(migrateGUID);
		builder.append("\n\tpayRate: ");
		builder.append(payRate);
		builder.append("\n\tsalary: ");
		builder.append(salary);
		builder.append("\n\tsendingUser: ");
		builder.append(sendingUser);
		builder.append("\n\tsource: ");
		builder.append(source);
		builder.append("\n\tstatus: ");
		builder.append(status);
		builder.append("\n\ttasks: ");
		builder.append(tasks);
		builder.append("\n}");
		return builder.toString();
	}

}