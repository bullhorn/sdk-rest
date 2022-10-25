package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.certificationrequirement.JobSubmissionCertificationRequirement;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsD;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.embedded.OneToManyLinkedId;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

@JsonFilter(DynamicNullValueFilter.FILTER_NAME)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "appointments", "billRate", "branch", "candidate", "comments",
    "customDate1", "customDate2", "customDate3", "customDate4", "customDate5",
    "customFloat1", "customFloat2", "customFloat3", "customFloat4", "customFloat5",
    "customInt1", "customInt2", "customInt3", "customInt4", "customInt5",
    "customText1", "customText2", "customText3", "customText4", "customText5",
    "customText6", "customText7", "customText8", "customText9", "customText10",
    "customText11", "customText12", "customText13", "customText14", "customText15",
    "customText16", "customText17", "customText18", "customText19", "customText20",
    "customText21", "customText22", "customText23", "customText24", "customText25",
    "customTextBlock1", "customTextBlock2", "customTextBlock3", "customTextBlock4", "customTextBlock5",
    "dateAdded", "dateLastModified", "dateWebResponse", "endDate", "isDeleted", "isHidden", "jobOrder", "jobSubmissionCertificationRequirements",
    "migrateGUID", "owners", "payRate", "salary", "sendingUser", "source", "startDate", "status", "tasks"})
public class JobSubmission extends CustomFieldsD implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, SearchEntity, DateLastModifiedEntity, EditHistoryEntity {

    private Integer id;
    private OneToManyLinkedId appointments;
    private BigDecimal billRate;

    private Branch branch;

    private Candidate candidate;

    @JsonIgnore
    private String comments;

    private DateTime dateAdded;
    private DateTime dateLastModified;
    private DateTime dateWebResponse;

    private OneToMany<JobSubmissionCertificationRequirement> jobSubmissionCertificationRequirements;

    private DateTime endDate;

    private Boolean isDeleted;
    private Boolean isHidden;
    private JobOrder jobOrder;
    private Appointment latestAppointment;
    private String migrateGUID;

    private OneToMany<CorporateUser> owners;

    private BigDecimal payRate;
    private BigDecimal salary;
    private CorporateUser sendingUser;

    private DateTime startDate;

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

    @JsonProperty("endDate")
    public DateTime getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("latestAppointment")
    public Appointment getLatestAppointment() {
        return latestAppointment;
    }

    @JsonProperty("latestAppointment")
    public void setLatestAppointment(Appointment latestAppointment) {
        this.latestAppointment = latestAppointment;
    }

    @JsonProperty("owners")
    public OneToMany<CorporateUser> getOwners() {
        return owners;
    }

    @JsonProperty("owners")
    public void setOwners(OneToMany<CorporateUser> owners) {
        this.owners = owners;
    }

    @JsonProperty("startDate")
    public DateTime getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("jobSubmissionCertificationRequirements")
    public OneToMany<JobSubmissionCertificationRequirement> getJobSubmissionCertificationRequirements() {
        return jobSubmissionCertificationRequirements;
    }

    @JsonProperty("jobSubmissionCertificationRequirements")
    public void setJobSubmissionCertificationRequirements(OneToMany<JobSubmissionCertificationRequirement> jobSubmissionCertificationRequirements) {
        this.jobSubmissionCertificationRequirements = jobSubmissionCertificationRequirements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JobSubmission that = (JobSubmission) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(appointments, that.appointments) &&
            Objects.equals(billRate, that.billRate) &&
            Objects.equals(branch, that.branch) &&
            Objects.equals(candidate, that.candidate) &&
            Objects.equals(comments, that.comments) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(dateWebResponse, that.dateWebResponse) &&
            Objects.equals(jobSubmissionCertificationRequirements, that.jobSubmissionCertificationRequirements) &&
            Objects.equals(endDate, that.endDate) &&
            Objects.equals(isDeleted, that.isDeleted) &&
            Objects.equals(isHidden, that.isHidden) &&
            Objects.equals(jobOrder, that.jobOrder) &&
            Objects.equals(latestAppointment, that.latestAppointment) &&
            Objects.equals(migrateGUID, that.migrateGUID) &&
            Objects.equals(owners, that.owners) &&
            Objects.equals(payRate, that.payRate) &&
            Objects.equals(salary, that.salary) &&
            Objects.equals(sendingUser, that.sendingUser) &&
            Objects.equals(startDate, that.startDate) &&
            Objects.equals(source, that.source) &&
            Objects.equals(status, that.status) &&
            Objects.equals(tasks, that.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, appointments, billRate, branch, candidate, comments, dateAdded, dateLastModified, dateWebResponse, jobSubmissionCertificationRequirements, endDate, isDeleted, isHidden, jobOrder, latestAppointment, migrateGUID, owners, payRate, salary, sendingUser, startDate, source, status, tasks);
    }

    @Override
    public String toString() {
        return "JobSubmission{" +
            "id=" + id +
            ", appointments=" + appointments +
            ", billRate=" + billRate +
            ", branch=" + branch +
            ", candidate=" + candidate +
            ", comments='" + comments + '\'' +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", dateWebResponse=" + dateWebResponse +
            ", jobSubmissionCertificationRequirements=" + jobSubmissionCertificationRequirements +
            ", endDate=" + endDate +
            ", isDeleted=" + isDeleted +
            ", isHidden=" + isHidden +
            ", jobOrder=" + jobOrder +
            ", latestAppointment=" + latestAppointment +
            ", migrateGUID='" + migrateGUID + '\'' +
            ", owners=" + owners +
            ", payRate=" + payRate +
            ", salary=" + salary +
            ", sendingUser=" + sendingUser +
            ", startDate=" + startDate +
            ", source='" + source + '\'' +
            ", status='" + status + '\'' +
            ", tasks=" + tasks +
            '}';
    }
}
