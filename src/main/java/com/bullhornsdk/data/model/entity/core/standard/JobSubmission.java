package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.EditHistoryEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.BaseCustomFields;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.embedded.OneToManyLinkedId;
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
@JsonPropertyOrder({ "id", "appointments", "billRate", "branch", "candidate", "customText1", "customText2", "customText3", "customText4",
        "customText5", "dateAdded", "dateLastModified", "dateWebResponse", "isDeleted", "isHidden", "jobOrder", "migrateGUID",
        "payRate", "salary", "sendingUser", "source", "status", "tasks" })
public class JobSubmission extends BaseCustomFields implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, SearchEntity, DateLastModifiedEntity, EditHistoryEntity {

	private Integer id;
	private OneToManyLinkedId appointments;
	private BigDecimal billRate;

	private Branch branch;

	private Candidate candidate;

    @JsonIgnore
    private String customText1;

    @JsonIgnore
    private String customText2;

    @JsonIgnore
    private String customText3;

    @JsonIgnore
    private String customText4;

    @JsonIgnore
    private String customText5;

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

    @JsonIgnore
	private String comments;
    
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
		entity.setJobOrder(new JobOrder(1));
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

	@JsonProperty("appointments")
	public OneToManyLinkedId getAppointments() {
		return appointments;
	}

    @ReadOnly
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

    @JsonProperty("branch")
    public Branch getBranch() {
        return branch;
    }

    @JsonProperty("branch")
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @JsonProperty("candidate")
	public Candidate getCandidate() {
		return candidate;
	}

	@JsonProperty("candidate")
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

    @JsonProperty("customText1")
    public String getCustomText1() {
        return customText1;
    }

    @JsonProperty("customText1")
    public void setCustomText1(String customText1) {
        this.customText1 = customText1;
    }

    @JsonProperty("customText2")
    public String getCustomText2() {
        return customText2;
    }

    @JsonProperty("customText2")
    public void setCustomText2(String customText2) {
        this.customText2 = customText2;
    }

    @JsonProperty("customText3")
    public String getCustomText3() {
        return customText3;
    }

    @JsonProperty("customText3")
    public void setCustomText3(String customText3) {
        this.customText3 = customText3;
    }

    @JsonProperty("customText4")
    public String getCustomText4() {
        return customText4;
    }

    @JsonProperty("customText4")
    public void setCustomText4(String customText4) {
        this.customText4 = customText4;
    }

    @JsonProperty("customText5")
    public String getCustomText5() {
        return customText5;
    }

    @JsonProperty("customText5")
    public void setCustomText5(String customText5) {
        this.customText5 = customText5;
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

	@ReadOnly
	@JsonProperty("tasks")
	public void setTasks(OneToMany<Task> tasks) {
		this.tasks = tasks;
	}
    
    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }
    
    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        JobSubmission that = (JobSubmission) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (appointments != null ? !appointments.equals(that.appointments) : that.appointments != null) return false;
        if (billRate != null ? !billRate.equals(that.billRate) : that.billRate != null) return false;
        if (branch != null ? !branch.equals(that.branch) : that.branch != null) return false;
        if (candidate != null ? !candidate.equals(that.candidate) : that.candidate != null) return false;
        if (customText1 != null ? !customText1.equals(that.customText1) : that.customText1 != null) return false;
        if (customText2 != null ? !customText2.equals(that.customText2) : that.customText2 != null) return false;
        if (customText3 != null ? !customText3.equals(that.customText3) : that.customText3 != null) return false;
        if (customText4 != null ? !customText4.equals(that.customText4) : that.customText4 != null) return false;
        if (customText5 != null ? !customText5.equals(that.customText5) : that.customText5 != null) return false;
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
        if (tasks != null ? !tasks.equals(that.tasks) : that.tasks != null) return false;
        return comments != null ? comments.equals(that.comments) : that.comments == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (appointments != null ? appointments.hashCode() : 0);
        result = 31 * result + (billRate != null ? billRate.hashCode() : 0);
        result = 31 * result + (branch != null ? branch.hashCode() : 0);
        result = 31 * result + (candidate != null ? candidate.hashCode() : 0);
        result = 31 * result + (customText1 != null ? customText1.hashCode() : 0);
        result = 31 * result + (customText2 != null ? customText2.hashCode() : 0);
        result = 31 * result + (customText3 != null ? customText3.hashCode() : 0);
        result = 31 * result + (customText4 != null ? customText4.hashCode() : 0);
        result = 31 * result + (customText5 != null ? customText5.hashCode() : 0);
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
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        return result;
    }

    @Override
    public String toStringNonNull(boolean includeLineBreaks) {
        String lbc = ", ";
        if(includeLineBreaks)
            lbc = ",\n ";
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName()  + " { ");
        if(includeLineBreaks)
            sb.append("\n");
        if(id != null){
            sb.append("id=").append(id);
        }
        if(appointments != null){
            sb.append(lbc + "appointments=").append(appointments.toStringNonNull(includeLineBreaks));
        }
        if(billRate != null){
            sb.append(lbc + "billRate=").append(billRate);
        }
        if(branch != null){
            sb.append(lbc + "branch=").append(branch.toStringNonNull(includeLineBreaks));
        }
        if(candidate != null){
            sb.append(lbc + "candidate=").append(candidate.toStringNonNull(includeLineBreaks));
        }
        if(customText1 != null){
            sb.append(lbc + "customText1=").append(customText1);
        }
        if(customText2 != null){
            sb.append(lbc + "customText2=").append(customText2);
        }
        if(customText3 != null){
            sb.append(lbc + "customText3=").append(customText3);
        }
        if(customText4 != null){
            sb.append(lbc + "customText4=").append(customText4);
        }
        if(customText5 != null){
            sb.append(lbc + "customText5=").append(customText5);
        }
        if(dateAdded != null){
            sb.append(lbc + "dateAdded=").append(dateAdded);
        }
        if(dateLastModified != null){
            sb.append(lbc + "dateLastModified=").append(dateLastModified);
        }
        if(dateWebResponse != null){
            sb.append(lbc + "dateWebResponse=").append(dateWebResponse);
        }
        if(isDeleted != null){
            sb.append(lbc + "isDeleted=").append(isDeleted);
        }
        if(isHidden != null){
            sb.append(lbc + "isHidden=").append(isHidden);
        }
        if(jobOrder != null){
            sb.append(lbc + "jobOrder=").append(jobOrder.toStringNonNull(includeLineBreaks));
        }
        if(migrateGUID != null){
            sb.append(lbc + "migrateGUID=").append(migrateGUID);
        }
        if(payRate != null){
            sb.append(lbc + "payRate=").append(payRate);
        }
        if(salary != null){
            sb.append(lbc + "salary=").append(salary);
        }
        if(sendingUser != null){
            sb.append(lbc + "sendingUser=").append(sendingUser.toStringNonNull(includeLineBreaks));
        }
        if(source != null){
            sb.append(lbc + "source=").append(source);
        }
        if(status != null){
            sb.append(lbc + "status=").append(status);
        }
        if(tasks != null){
            sb.append(lbc + "tasks=").append(tasks.toStringNonNull(includeLineBreaks));
        }
        if(comments != null){
            sb.append(lbc + "comments=").append(comments);
        }
        if(includeLineBreaks)
            sb.append("\n");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toStringNonNull() {
        String lbc = ", ";
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName()  + " { ");
        if(id != null){
            sb.append("id=").append(id);
        }
        if(appointments != null){
            sb.append(lbc + "appointments=").append(appointments.toStringNonNull());
        }
        if(billRate != null){
            sb.append(lbc + "billRate=").append(billRate);
        }
        if(branch != null){
            sb.append(lbc + "branch=").append(branch.toStringNonNull());
        }
        if(candidate != null){
            sb.append(lbc + "candidate=").append(candidate.toStringNonNull());
        }
        if(customText1 != null){
            sb.append(lbc + "customText1=").append(customText1);
        }
        if(customText2 != null){
            sb.append(lbc + "customText2=").append(customText2);
        }
        if(customText3 != null){
            sb.append(lbc + "customText3=").append(customText3);
        }
        if(customText4 != null){
            sb.append(lbc + "customText4=").append(customText4);
        }
        if(customText5 != null){
            sb.append(lbc + "customText5=").append(customText5);
        }
        if(dateAdded != null){
            sb.append(lbc + "dateAdded=").append(dateAdded);
        }
        if(dateLastModified != null){
            sb.append(lbc + "dateLastModified=").append(dateLastModified);
        }
        if(dateWebResponse != null){
            sb.append(lbc + "dateWebResponse=").append(dateWebResponse);
        }
        if(isDeleted != null){
            sb.append(lbc + "isDeleted=").append(isDeleted);
        }
        if(isHidden != null){
            sb.append(lbc + "isHidden=").append(isHidden);
        }
        if(jobOrder != null){
            sb.append(lbc + "jobOrder=").append(jobOrder.toStringNonNull());
        }
        if(migrateGUID != null){
            sb.append(lbc + "migrateGUID=").append(migrateGUID);
        }
        if(payRate != null){
            sb.append(lbc + "payRate=").append(payRate);
        }
        if(salary != null){
            sb.append(lbc + "salary=").append(salary);
        }
        if(sendingUser != null){
            sb.append(lbc + "sendingUser=").append(sendingUser.toStringNonNull());
        }
        if(source != null){
            sb.append(lbc + "source=").append(source);
        }
        if(status != null){
            sb.append(lbc + "status=").append(status);
        }
        if(tasks != null){
            sb.append(lbc + "tasks=").append(tasks.toStringNonNull());
        }
        if(comments != null){
            sb.append(lbc + "comments=").append(comments);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName()  + " { ");
        sb.append("id=").append(id);
        sb.append(", appointments=").append(appointments);
        sb.append(", billRate=").append(billRate);
        sb.append(", branch=").append(branch);
        sb.append(", candidate=").append(candidate);
        sb.append(", customText1=").append(customText1);
        sb.append(", customText2=").append(customText2);
        sb.append(", customText3=").append(customText3);
        sb.append(", customText4=").append(customText4);
        sb.append(", customText5=").append(customText5);
        sb.append(", dateAdded=").append(dateAdded);
        sb.append(", dateLastModified=").append(dateLastModified);
        sb.append(", dateWebResponse=").append(dateWebResponse);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", isHidden=").append(isHidden);
        sb.append(", jobOrder=").append(jobOrder);
        sb.append(", migrateGUID=").append(migrateGUID);
        sb.append(", payRate=").append(payRate);
        sb.append(", salary=").append(salary);
        sb.append(", sendingUser=").append(sendingUser);
        sb.append(", source=").append(source);
        sb.append(", status=").append(status);
        sb.append(", tasks=").append(tasks);
        sb.append(", comments=").append(comments);
        sb.append("}");
        return sb.toString();
    }
}
