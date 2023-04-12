package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.EditHistoryEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.embedded.OneToManyLinkedId;
import com.bullhornsdk.data.util.ReadOnly;
import com.bullhornsdk.data.validation.BullhornUUID;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;

@JsonFilter(DynamicNullValueFilter.FILTER_NAME)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "appointmentUUID", "guests", "candidateReference", "childAppointments", "clientContactReference",
        "communicationMethod", "dateAdded", "dateBegin", "dateEnd", "dateLastModified", "description", "isAllDay", "isDeleted",
        "isPrivate", "jobOrder", "lead", "location", "migrateGUID", "notificationMinutes", "opportunity", "owner", "parentAppointment", "placement",
        "recurrenceDayBits", "recurrenceFrequency", "recurrenceMax", "recurrenceMonthBits", "recurrenceStyle", "recurrenceType",
        "showTimeAs", "subject", "timeZoneID", "type", "jobSubmission" })
public class Appointment extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity,
        DateLastModifiedEntity, EditHistoryEntity, AssociationEntity {
    private Integer id;

    @BullhornUUID
    private String appointmentUUID;

    private OneToMany<Person> guests;

    private Candidate candidateReference;

    private OneToManyLinkedId childAppointments;

    private ClientContact clientContactReference;

    @JsonIgnore
    @Size(max = 30)
    private String communicationMethod;

    private DateTime dateAdded;

    private DateTime dateBegin;

    private DateTime dateEnd;

    private DateTime dateLastModified;

    private String description;

    private Boolean isAllDay;

    private Boolean isDeleted;

    private Boolean isPrivate;

    private JobOrder jobOrder;

    private Lead lead;

    @JsonIgnore
    @Size(max = 100)
    private String location;

    private Object migrateGUID;

    private Integer notificationMinutes;

    private Opportunity opportunity;

    private Person owner;

    private Appointment parentAppointment;

    private Placement placement;

    private Integer recurrenceDayBits;

    private Integer recurrenceFrequency;

    private Integer recurrenceMax;

    private Integer recurrenceMonthBits;

    @Size(max = 10)
    private String recurrenceStyle;

    @Size(max = 1)
    private String recurrenceType;

    private String showTimeAs;

    @Size(max = 100)
    private String subject;

    private String timeZoneID;

    private JobSubmission jobSubmission;

    @JsonIgnore
    @Size(max = 30)
    private String type;

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    public Appointment() {
        super();

    }

    /**
     * Returns the entity with the required fields for an insert set.
     *
     * @return
     */
    public Appointment instantiateForInsert() {
        Appointment entity = new Appointment();
        entity.setCommunicationMethod("Phone");
        entity.setDateBegin(new DateTime());
        entity.setDateEnd(new DateTime());
        entity.setDescription("Test");
        entity.setIsDeleted(Boolean.FALSE);
        entity.setIsPrivate(Boolean.FALSE);
        entity.setNotificationMinutes(0);
        entity.setSubject("Test");
        entity.setType("Test");
        return entity;
    }

    @ReadOnly
    @Override
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("appointmentUUID")
    public String getAppointmentUUID() {
        return appointmentUUID;
    }

    @JsonProperty("appointmentUUID")
    public void setAppointmentUUID(String appointmentUUID) {
        this.appointmentUUID = appointmentUUID;
    }

    @JsonIgnore
    public OneToMany<Person> getGuests() {
        return guests;
    }

    @ReadOnly
    @JsonProperty("guests")
    public void setGuests(OneToMany<Person> guests) {
        this.guests = guests;
    }

    @JsonProperty("candidateReference")
    public Candidate getCandidateReference() {
        return candidateReference;
    }

    @JsonProperty("candidateReference")
    public void setCandidateReference(Candidate candidateReference) {
        this.candidateReference = candidateReference;
    }

    @JsonIgnore
    public OneToManyLinkedId getChildAppointments() {
        return childAppointments;
    }

    @JsonProperty("childAppointments")
    public void setChildAppointments(OneToManyLinkedId childAppointments) {
        this.childAppointments = childAppointments;
    }

    @JsonProperty("clientContactReference")
    public ClientContact getClientContactReference() {
        return clientContactReference;
    }

    @JsonProperty("clientContactReference")
    public void setClientContactReference(ClientContact clientContactReference) {
        this.clientContactReference = clientContactReference;
    }

    @JsonProperty("communicationMethod")
    public String getCommunicationMethod() {
        return communicationMethod;
    }

    @JsonIgnore
    public void setCommunicationMethod(String communicationMethod) {
        this.communicationMethod = communicationMethod;
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

    @JsonProperty("dateBegin")
    public DateTime getDateBegin() {
        return dateBegin;
    }

    @JsonProperty("dateBegin")
    public void setDateBegin(DateTime dateBegin) {
        this.dateBegin = dateBegin;
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

    @ReadOnly
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

    @JsonProperty("isAllDay")
    public Boolean getIsAllDay() {
        return isAllDay;
    }

    @JsonProperty("isAllDay")
    public void setIsAllDay(Boolean isAllDay) {
        this.isAllDay = isAllDay;
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

    @JsonProperty("jobOrder")
    public JobOrder getJobOrder() {
        return jobOrder;
    }

    @JsonProperty("jobOrder")
    public void setJobOrder(JobOrder jobOrder) {
        this.jobOrder = jobOrder;
    }

    @JsonProperty("lead")
    public Lead getLead() {
        return lead;
    }

    @JsonProperty("lead")
    public void setLead(Lead lead) {
        this.lead = lead;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonIgnore
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("migrateGUID")
    public Object getMigrateGUID() {
        return migrateGUID;
    }

    @JsonProperty("migrateGUID")
    public void setMigrateGUID(Object migrateGUID) {
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

    @JsonProperty("owner")
    public Person getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @JsonProperty("parentAppointment")
    public Appointment getParentAppointment() {
        return parentAppointment;
    }

    @JsonProperty("parentAppointment")
    public void setParentAppointment(Appointment parentAppointment) {
        this.parentAppointment = parentAppointment;
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

    @JsonProperty("showTimeAs")
    public String getShowTimeAs() {
        return showTimeAs;
    }

    @JsonProperty("showTimeAs")
    public void setShowTimeAs(String showTimeAs) {
        this.showTimeAs = showTimeAs;
    }

    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
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

    @JsonIgnore
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("opportunity")
    public Opportunity getOpportunity() {
        return opportunity;
    }

    @JsonProperty("opportunity")
    public void setOpportunity(Opportunity opportunity) {
        this.opportunity = opportunity;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (appointmentUUID != null ? !appointmentUUID.equals(that.appointmentUUID) : that.appointmentUUID != null)
            return false;
        if (guests != null ? !guests.equals(that.guests) : that.guests != null) return false;
        if (candidateReference != null ? !candidateReference.equals(that.candidateReference) : that.candidateReference != null)
            return false;
        if (childAppointments != null ? !childAppointments.equals(that.childAppointments) : that.childAppointments != null)
            return false;
        if (clientContactReference != null ? !clientContactReference.equals(that.clientContactReference) : that.clientContactReference != null)
            return false;
        if (communicationMethod != null ? !communicationMethod.equals(that.communicationMethod) : that.communicationMethod != null)
            return false;
        if (dateAdded != null ? !dateAdded.equals(that.dateAdded) : that.dateAdded != null) return false;
        if (dateBegin != null ? !dateBegin.equals(that.dateBegin) : that.dateBegin != null) return false;
        if (dateEnd != null ? !dateEnd.equals(that.dateEnd) : that.dateEnd != null) return false;
        if (dateLastModified != null ? !dateLastModified.equals(that.dateLastModified) : that.dateLastModified != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (isAllDay != null ? !isAllDay.equals(that.isAllDay) : that.isAllDay != null) return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;
        if (isPrivate != null ? !isPrivate.equals(that.isPrivate) : that.isPrivate != null) return false;
        if (jobOrder != null ? !jobOrder.equals(that.jobOrder) : that.jobOrder != null) return false;
        if (lead != null ? !lead.equals(that.lead) : that.lead != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (migrateGUID != null ? !migrateGUID.equals(that.migrateGUID) : that.migrateGUID != null) return false;
        if (notificationMinutes != null ? !notificationMinutes.equals(that.notificationMinutes) : that.notificationMinutes != null)
            return false;
        if (opportunity != null ? !opportunity.equals(that.opportunity) : that.opportunity != null) return false;
        if (owner != null ? !owner.equals(that.owner) : that.owner != null) return false;
        if (parentAppointment != null ? !parentAppointment.equals(that.parentAppointment) : that.parentAppointment != null)
            return false;
        if (placement != null ? !placement.equals(that.placement) : that.placement != null) return false;
        if (recurrenceDayBits != null ? !recurrenceDayBits.equals(that.recurrenceDayBits) : that.recurrenceDayBits != null)
            return false;
        if (recurrenceFrequency != null ? !recurrenceFrequency.equals(that.recurrenceFrequency) : that.recurrenceFrequency != null)
            return false;
        if (recurrenceMax != null ? !recurrenceMax.equals(that.recurrenceMax) : that.recurrenceMax != null)
            return false;
        if (recurrenceMonthBits != null ? !recurrenceMonthBits.equals(that.recurrenceMonthBits) : that.recurrenceMonthBits != null)
            return false;
        if (recurrenceStyle != null ? !recurrenceStyle.equals(that.recurrenceStyle) : that.recurrenceStyle != null)
            return false;
        if (recurrenceType != null ? !recurrenceType.equals(that.recurrenceType) : that.recurrenceType != null)
            return false;
        if (showTimeAs != null ? !showTimeAs.equals(that.showTimeAs) : that.showTimeAs != null) return false;
        if (subject != null ? !subject.equals(that.subject) : that.subject != null) return false;
        if (timeZoneID != null ? !timeZoneID.equals(that.timeZoneID) : that.timeZoneID != null) return false;
        return !(type != null ? !type.equals(that.type) : that.type != null);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Appointment {\nid=");
        builder.append(id);
        builder.append(", \nappointmentUUID=");
        builder.append(appointmentUUID);
        builder.append(", \nguests=");
        builder.append(guests);
        builder.append(", \ncandidateReference=");
        builder.append(candidateReference);
        builder.append(", \nchildAppointments=");
        builder.append(childAppointments);
        builder.append(", \nclientContactReference=");
        builder.append(clientContactReference);
        builder.append(", \ncommunicationMethod=");
        builder.append(communicationMethod);
        builder.append(", \ndateAdded=");
        builder.append(dateAdded);
        builder.append(", \ndateBegin=");
        builder.append(dateBegin);
        builder.append(", \ndateEnd=");
        builder.append(dateEnd);
        builder.append(", \ndateLastModified=");
        builder.append(dateLastModified);
        builder.append(", \ndescription=");
        builder.append(description);
        builder.append(", \nisAllDay=");
        builder.append(isAllDay);
        builder.append(", \nisDeleted=");
        builder.append(isDeleted);
        builder.append(", \nisPrivate=");
        builder.append(isPrivate);
        builder.append(", \njobOrder=");
        builder.append(jobOrder);
        builder.append(", \nlocation=");
        builder.append(location);
        builder.append(", \nmigrateGUID=");
        builder.append(migrateGUID);
        builder.append(", \nnotificationMinutes=");
        builder.append(notificationMinutes);
        builder.append(", \nowner=");
        builder.append(owner);
        builder.append(", \nparentAppointment=");
        builder.append(parentAppointment);
        builder.append(", \nplacement=");
        builder.append(placement);
        builder.append(", \nrecurrenceDayBits=");
        builder.append(recurrenceDayBits);
        builder.append(", \nrecurrenceFrequency=");
        builder.append(recurrenceFrequency);
        builder.append(", \nrecurrenceMax=");
        builder.append(recurrenceMax);
        builder.append(", \nrecurrenceMonthBits=");
        builder.append(recurrenceMonthBits);
        builder.append(", \nrecurrenceStyle=");
        builder.append(recurrenceStyle);
        builder.append(", \nrecurrenceType=");
        builder.append(recurrenceType);
        builder.append(", \nshowTimeAs=");
        builder.append(showTimeAs);
        builder.append(", \nsubject=");
        builder.append(subject);
        builder.append(", \ntimeZoneID=");
        builder.append(timeZoneID);
        builder.append(", \ntype=");
        builder.append(type);
        builder.append(", \nopportunity=");
        builder.append(opportunity);
        builder.append(", \nadditionalProperties=");
        builder.append(this.getAdditionalProperties());
        builder.append("\n}");
        return builder.toString();
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (appointmentUUID != null ? appointmentUUID.hashCode() : 0);
        result = 31 * result + (guests != null ? guests.hashCode() : 0);
        result = 31 * result + (candidateReference != null ? candidateReference.hashCode() : 0);
        result = 31 * result + (childAppointments != null ? childAppointments.hashCode() : 0);
        result = 31 * result + (clientContactReference != null ? clientContactReference.hashCode() : 0);
        result = 31 * result + (communicationMethod != null ? communicationMethod.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (dateBegin != null ? dateBegin.hashCode() : 0);
        result = 31 * result + (dateEnd != null ? dateEnd.hashCode() : 0);
        result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (isAllDay != null ? isAllDay.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (isPrivate != null ? isPrivate.hashCode() : 0);
        result = 31 * result + (jobOrder != null ? jobOrder.hashCode() : 0);
        result = 31 * result + (lead != null ? lead.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (migrateGUID != null ? migrateGUID.hashCode() : 0);
        result = 31 * result + (notificationMinutes != null ? notificationMinutes.hashCode() : 0);
        result = 31 * result + (opportunity != null ? opportunity.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (parentAppointment != null ? parentAppointment.hashCode() : 0);
        result = 31 * result + (placement != null ? placement.hashCode() : 0);
        result = 31 * result + (recurrenceDayBits != null ? recurrenceDayBits.hashCode() : 0);
        result = 31 * result + (recurrenceFrequency != null ? recurrenceFrequency.hashCode() : 0);
        result = 31 * result + (recurrenceMax != null ? recurrenceMax.hashCode() : 0);
        result = 31 * result + (recurrenceMonthBits != null ? recurrenceMonthBits.hashCode() : 0);
        result = 31 * result + (recurrenceStyle != null ? recurrenceStyle.hashCode() : 0);
        result = 31 * result + (recurrenceType != null ? recurrenceType.hashCode() : 0);
        result = 31 * result + (showTimeAs != null ? showTimeAs.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (timeZoneID != null ? timeZoneID.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }



}
