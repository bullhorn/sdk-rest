package com.bullhornsdk.data.model.response.edithistory;

import com.bullhornsdk.data.model.entity.core.edithistory.FieldChange;
import com.bullhornsdk.data.model.response.list.StandardListWrapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by acrowe on 3/2/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "count", "start" })
public class FieldChangeListWrapper extends StandardListWrapper<FieldChange> {
}
