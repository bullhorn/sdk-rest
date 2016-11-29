package com.bullhornsdk.data.model.response.list;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporationAppointment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "start", "count", "data" })
public class ClientCorporationAppointmentListWrapper extends StandardListWrapper<ClientCorporationAppointment> {
}
