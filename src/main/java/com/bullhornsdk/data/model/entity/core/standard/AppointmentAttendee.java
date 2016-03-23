package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.LinkedId;
import com.bullhornsdk.data.model.entity.embedded.LinkedPerson;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "acceptanceStatus", "appointment", "attendee", "migrateGUID" })
public class AppointmentAttendee extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity {

    private Integer id;

    private Integer acceptanceStatus;

    private LinkedId appointment;

    private LinkedPerson attendee;

    private Object migrateGUID;

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

    @JsonProperty("acceptanceStatus")
    public Integer getAcceptanceStatus() {
        return acceptanceStatus;
    }

    @JsonProperty("acceptanceStatus")
    public void setAcceptanceStatus(Integer acceptanceStatus) {
        this.acceptanceStatus = acceptanceStatus;
    }

    @JsonProperty("appointment")
    public LinkedId getAppointment() {
        return appointment;
    }

    @JsonProperty("appointment")
    public void setAppointment(LinkedId appointment) {
        this.appointment = appointment;
    }

    @JsonProperty("attendee")
    public LinkedPerson getAttendee() {
        return attendee;
    }

    @JsonProperty("attendee")
    public void setAttendee(LinkedPerson attendee) {
        this.attendee = attendee;
    }

    @JsonProperty("migrateGUID")
    public Object getMigrateGUID() {
        return migrateGUID;
    }

    @JsonProperty("migrateGUID")
    public void setMigrateGUID(Object migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((acceptanceStatus == null) ? 0 : acceptanceStatus.hashCode());
        result = prime * result + ((appointment == null) ? 0 : appointment.hashCode());
        result = prime * result + ((attendee == null) ? 0 : attendee.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
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
        AppointmentAttendee other = (AppointmentAttendee) obj;
        if (acceptanceStatus == null) {
            if (other.acceptanceStatus != null)
                return false;
        } else if (!acceptanceStatus.equals(other.acceptanceStatus))
            return false;
        if (appointment == null) {
            if (other.appointment != null)
                return false;
        } else if (!appointment.equals(other.appointment))
            return false;
        if (attendee == null) {
            if (other.attendee != null)
                return false;
        } else if (!attendee.equals(other.attendee))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (migrateGUID == null) {
            if (other.migrateGUID != null)
                return false;
        } else if (!migrateGUID.equals(other.migrateGUID))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AppointmentAttendee {\nid=");
        builder.append(id);
        builder.append(", \nacceptanceStatus=");
        builder.append(acceptanceStatus);
        builder.append(", \nappointment=");
        builder.append(appointment);
        builder.append(", \nattendee=");
        builder.append(attendee);
        builder.append(", \nmigrateGUID=");
        builder.append(migrateGUID);
        builder.append(", \nadditionalProperties=");
        builder.append(this.getAdditionalProperties());
        builder.append("\n}");
        return builder.toString();
    }

}
