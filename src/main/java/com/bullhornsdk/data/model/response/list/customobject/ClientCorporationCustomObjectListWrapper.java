package com.bullhornsdk.data.model.response.list.customobject;

import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObject;
import com.bullhornsdk.data.model.response.list.StandardListWrapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "count", "start" })
public class ClientCorporationCustomObjectListWrapper extends StandardListWrapper<ClientCorporationCustomObject> {
}
