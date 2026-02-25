package com.bullhornsdk.data.model.entity.file;

import com.bullhornsdk.data.model.entity.core.standard.Appointment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * FileAttachment entity for Appointment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({
    "id",
    "appointment",
    "contentSubType",
    "contentType",
    "dateAdded",
    "departmentsSharedWith",
    "description",
    "directory",
    "distribution",
    "externalID",
    "fileExtension",
    "fileOwner",
    "fileSize",
    "fileType",
    "isCopied",
    "isDeleted",
    "isEncrypted",
    "isExternal",
    "isOpen",
    "isPrivate",
    "isSendOut",
    "name",
    "type",
    "usersSharedWith",
    "uuid"
})
public class AppointmentFileAttachment extends EntityFileAttachment {

    private Appointment appointment;

    @JsonProperty("appointment")
    public Appointment getAppointment() {
        return appointment;
    }

    @JsonProperty("appointment")
    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        AppointmentFileAttachment that = (AppointmentFileAttachment) o;

        return appointment != null ? appointment.equals(that.appointment) : that.appointment == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (appointment != null ? appointment.hashCode() : 0);
        return result;
    }
}
