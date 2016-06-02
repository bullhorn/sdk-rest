package com.bullhornsdk.data.model.entity.core.standard;

import javax.validation.constraints.Size;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.embedded.LinkedId;
import com.bullhornsdk.data.model.entity.embedded.LinkedPerson;
import com.bullhornsdk.data.model.entity.embedded.OneToManyLinkedId;
import com.bullhornsdk.data.validation.BullhornUUID;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "appointmentUUID", "attendees", "candidateReference", "childAppointments", "clientContactReference",
        "communicationMethod", "dateAdded", "dateBegin", "dateEnd", "dateLastModified", "description", "isAllDay", "isDeleted",
        "isPrivate", "jobOrder", "location", "migrateGUID", "notificationMinutes", "owner", "parentAppointment", "placement",
        "recurrenceDayBits", "recurrenceFrequency", "recurrenceMax", "recurrenceMonthBits", "recurrenceStyle", "recurrenceType",
        "showTimeAs", "subject", "timeZoneID", "type" })
public class Appointment extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, AssociationEntity {

    private Integer id;

    @BullhornUUID
    private String appointmentUUID;

    private OneToManyLinkedId attendees;

    private Candidate candidateReference;

    private OneToManyLinkedId childAppointments;

    private ClientContact clientContactReference;

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

    @Size(max = 100)
    private String location;

    private Object migrateGUID;

    private Integer notificationMinutes;

    private LinkedPerson owner;

    private LinkedId parentAppointment;

    private LinkedId placement;

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

    @Size(max = 30)
    private String type;

    private Opportunity opportunity;

    private OneToMany<LinkedPerson> guests;

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
        entity.setIsDeleted(Boolean.FALSE);
        entity.setIsPrivate(Boolean.FALSE);
        return entity;
    }

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
    public OneToManyLinkedId getAttendees() {
        return attendees;
    }

    @JsonProperty("attendees")
    public void setAttendees(OneToManyLinkedId attendees) {
        this.attendees = attendees;
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

    @JsonProperty("communicationMethod")
    public void setCommunicationMethod(String communicationMethod) {
        this.communicationMethod = communicationMethod;
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

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
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
    public LinkedPerson getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(LinkedPerson owner) {
        this.owner = owner;
    }

    @JsonProperty("parentAppointment")
    public LinkedId getParentAppointment() {
        return parentAppointment;
    }

    @JsonProperty("parentAppointment")
    public void setParentAppointment(LinkedId parentAppointment) {
        this.parentAppointment = parentAppointment;
    }

    @JsonProperty("placement")
    public LinkedId getPlacement() {
        return placement;
    }

    @JsonProperty("placement")
    public void setPlacement(LinkedId placement) {
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

    @JsonProperty("type")
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

    @JsonProperty("guests")
    public OneToMany<LinkedPerson> getGuests() {
        return guests;
    }

    @JsonProperty("guests")
    public void setGuests(OneToMany<LinkedPerson> guests) {
        this.guests = guests;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((appointmentUUID == null) ? 0 : appointmentUUID.hashCode());
        result = prime * result + ((attendees == null) ? 0 : attendees.hashCode());
        result = prime * result + ((candidateReference == null) ? 0 : candidateReference.hashCode());
        result = prime * result + ((childAppointments == null) ? 0 : childAppointments.hashCode());
        result = prime * result + ((clientContactReference == null) ? 0 : clientContactReference.hashCode());
        result = prime * result + ((communicationMethod == null) ? 0 : communicationMethod.hashCode());
        result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
        result = prime * result + ((dateBegin == null) ? 0 : dateBegin.hashCode());
        result = prime * result + ((dateEnd == null) ? 0 : dateEnd.hashCode());
        result = prime * result + ((dateLastModified == null) ? 0 : dateLastModified.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((isAllDay == null) ? 0 : isAllDay.hashCode());
        result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
        result = prime * result + ((isPrivate == null) ? 0 : isPrivate.hashCode());
        result = prime * result + ((jobOrder == null) ? 0 : jobOrder.hashCode());
        result = prime * result + ((location == null) ? 0 : location.hashCode());
        result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
        result = prime * result + ((notificationMinutes == null) ? 0 : notificationMinutes.hashCode());
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
        result = prime * result + ((parentAppointment == null) ? 0 : parentAppointment.hashCode());
        result = prime * result + ((placement == null) ? 0 : placement.hashCode());
        result = prime * result + ((recurrenceDayBits == null) ? 0 : recurrenceDayBits.hashCode());
        result = prime * result + ((recurrenceFrequency == null) ? 0 : recurrenceFrequency.hashCode());
        result = prime * result + ((recurrenceMax == null) ? 0 : recurrenceMax.hashCode());
        result = prime * result + ((recurrenceMonthBits == null) ? 0 : recurrenceMonthBits.hashCode());
        result = prime * result + ((recurrenceStyle == null) ? 0 : recurrenceStyle.hashCode());
        result = prime * result + ((recurrenceType == null) ? 0 : recurrenceType.hashCode());
        result = prime * result + ((showTimeAs == null) ? 0 : showTimeAs.hashCode());
        result = prime * result + ((subject == null) ? 0 : subject.hashCode());
        result = prime * result + ((timeZoneID == null) ? 0 : timeZoneID.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((opportunity == null) ? 0 : opportunity.hashCode());
        result = prime * result + ((guests == null) ? 0 : guests.hashCode());

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
        Appointment other = (Appointment) obj;
        if (appointmentUUID == null) {
            if (other.appointmentUUID != null)
                return false;
        } else if (!appointmentUUID.equals(other.appointmentUUID))
            return false;
        if (attendees == null) {
            if (other.attendees != null)
                return false;
        } else if (!attendees.equals(other.attendees))
            return false;
        if (candidateReference == null) {
            if (other.candidateReference != null)
                return false;
        } else if (!candidateReference.equals(other.candidateReference))
            return false;
        if (childAppointments == null) {
            if (other.childAppointments != null)
                return false;
        } else if (!childAppointments.equals(other.childAppointments))
            return false;
        if (clientContactReference == null) {
            if (other.clientContactReference != null)
                return false;
        } else if (!clientContactReference.equals(other.clientContactReference))
            return false;
        if (communicationMethod == null) {
            if (other.communicationMethod != null)
                return false;
        } else if (!communicationMethod.equals(other.communicationMethod))
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
        if (isAllDay == null) {
            if (other.isAllDay != null)
                return false;
        } else if (!isAllDay.equals(other.isAllDay))
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
        if (jobOrder == null) {
            if (other.jobOrder != null)
                return false;
        } else if (!jobOrder.equals(other.jobOrder))
            return false;
        if (location == null) {
            if (other.location != null)
                return false;
        } else if (!location.equals(other.location))
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
        if (owner == null) {
            if (other.owner != null)
                return false;
        } else if (!owner.equals(other.owner))
            return false;
        if (parentAppointment == null) {
            if (other.parentAppointment != null)
                return false;
        } else if (!parentAppointment.equals(other.parentAppointment))
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
        if (showTimeAs == null) {
            if (other.showTimeAs != null)
                return false;
        } else if (!showTimeAs.equals(other.showTimeAs))
            return false;
        if (subject == null) {
            if (other.subject != null)
                return false;
        } else if (!subject.equals(other.subject))
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
        if (opportunity == null) {
            if (other.opportunity != null)
                return false;
        } else if (!opportunity.equals(other.opportunity))
            return false;
        if (guests == null) {
            if (other.guests != null)
                return false;
        } else if (!guests.equals(other.guests))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Appointment {\nid=");
        builder.append(id);
        builder.append(", \nappointmentUUID=");
        builder.append(appointmentUUID);
        builder.append(", \nattendees=");
        builder.append(attendees);
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
        builder.append(", \nguests=");
        builder.append(guests);
        builder.append(", \nadditionalProperties=");
        builder.append(this.getAdditionalProperties());
        builder.append("\n}");
        return builder.toString();
    }

}
