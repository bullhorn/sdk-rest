package com.bullhornsdk.data.model.response.single;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporationAppointment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class ClientCorporationAppointmentWrapper extends StandardWrapper<ClientCorporationAppointment> {
}
