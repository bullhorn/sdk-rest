package com.bullhornsdk.data.model.response.single;

import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class PlacementWrapper extends StandardWrapper<Placement> {

}