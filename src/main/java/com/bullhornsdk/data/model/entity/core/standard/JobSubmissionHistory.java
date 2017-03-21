package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.HardDeleteEntity;
import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "comments", "dateAdded", "jobSubmission", "migrateGUID", "modifyingUser", "status", "transactionID" })
public class JobSubmissionHistory extends AbstractEntity implements QueryEntity, HardDeleteEntity {

	private Integer id;

	private String comments;

	private DateTime dateAdded;

	private JobSubmission jobSubmission;

	private String migrateGUID;

	private CorporateUser modifyingUser;

	private String status;

	private String transactionID;

	@Override
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("comments")
	public String getComments() {
		return comments;
	}

	@JsonProperty("comments")
	public void setComments(String comments) {
		this.comments = comments;
	}

	@JsonProperty("dateAdded")
	public DateTime getDateAdded() {
		return dateAdded;
	}

	@JsonProperty("dateAdded")
	public void setDateAdded(DateTime dateAdded) {
		this.dateAdded = dateAdded;
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

	@JsonProperty("modifyingUser")
	public CorporateUser getModifyingUser() {
		return modifyingUser;
	}

	@JsonProperty("modifyingUser")
	public void setModifyingUser(CorporateUser modifyingUser) {
		this.modifyingUser = modifyingUser;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("transactionID")
	public String getTransactionID() {
		return transactionID;
	}

	@JsonProperty("transactionID")
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((jobSubmission == null) ? 0 : jobSubmission.hashCode());
		result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
		result = prime * result + ((modifyingUser == null) ? 0 : modifyingUser.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((transactionID == null) ? 0 : transactionID.hashCode());
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
		JobSubmissionHistory other = (JobSubmissionHistory) obj;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (dateAdded == null) {
			if (other.dateAdded != null)
				return false;
		} else if (!dateAdded.equals(other.dateAdded))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		if (modifyingUser == null) {
			if (other.modifyingUser != null)
				return false;
		} else if (!modifyingUser.equals(other.modifyingUser))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (transactionID == null) {
			if (other.transactionID != null)
				return false;
		} else if (!transactionID.equals(other.transactionID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getName());
		builder.append(" {\n\tid: ");
		builder.append(id);
		builder.append("\n\tcomments: ");
		builder.append(comments);
		builder.append("\n\tdateAdded: ");
		builder.append(dateAdded);
		builder.append("\n\tjobSubmission: ");
		builder.append(jobSubmission);
		builder.append("\n\tmigrateGUID: ");
		builder.append(migrateGUID);
		builder.append("\n\tmodifyingUser: ");
		builder.append(modifyingUser);
		builder.append("\n\tstatus: ");
		builder.append(status);
		builder.append("\n\ttransactionID: ");
		builder.append(transactionID);
		builder.append("\n}");
		return builder.toString();
	}

}
