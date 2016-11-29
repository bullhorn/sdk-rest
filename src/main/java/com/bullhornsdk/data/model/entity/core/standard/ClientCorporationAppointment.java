package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "appointment", "clientContact", "clientCorporation" })
public class ClientCorporationAppointment implements QueryEntity {

    private Integer id;

    private Appointment appointment;

    private ClientContact clientContact;

    private ClientCorporation clientCorporation;

    @JsonProperty("id")
    @Override
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    @ReadOnly
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty(value = "appointment")
    public Appointment getAppointment() {
        return appointment;
    }

    @JsonProperty(value = "appointment")
    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @JsonProperty(value = "clientContact")
    public ClientContact getClientContact() {
        return clientContact;
    }

    @JsonProperty(value = "clientContact")
    public void setClientContact(ClientContact clientContact) {
        this.clientContact = clientContact;
    }

    @JsonProperty(value = "clientCorporation")
    public ClientCorporation getClientCorporation() {
        return clientCorporation;
    }

    @JsonProperty(value = "clientCorporation")
    public void setClientCorporation(ClientCorporation clientCorporation) {
        this.clientCorporation = clientCorporation;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("ClientCorporationAppointment");
        stringBuilder.append("\nid: ").append(id);
        if (clientContact != null) {
            stringBuilder.append("\nclientContact.id: ").append(clientContact.getId());
            stringBuilder.append("\nclientContact.name: ").append(clientContact.getName());
        }
        if (clientCorporation != null) {
            stringBuilder.append("\nclientCorporation.id: ").append(clientCorporation.getId());
            stringBuilder.append("\nclientCorporation.name: ").append(clientCorporation.getName());
        }

        return stringBuilder.toString();
    }

    @Override
    public int hashCode() {

        int result = 47 + (id != null ? id.hashCode() : 0);
        result *= 47 + (clientContact != null ? clientContact.hashCode() : 0);
        result *= 47 + (clientCorporation != null ? clientCorporation.hashCode() : 0);

        return result;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        ClientCorporationAppointment that = (ClientCorporationAppointment) object;

        if (id != null ? !id.equals(that.id) : that.id != null) {
            return false;
        }

        if (clientContact != null ? !clientContact.equals(that.clientContact) : that.clientContact != null) {
            return false;
        }

        return !(clientCorporation != null ? !clientCorporation.equals(that.clientCorporation) : that.clientCorporation != null);
    }
}
