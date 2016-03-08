package com.bullhornsdk.data.model.response.edithistory;

import com.bullhornsdk.data.model.entity.core.edithistory.EditHistory;
import com.bullhornsdk.data.model.response.list.StandardListWrapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by acrowe on 3/2/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "count", "start", "data" })
public class EditHistoryListWrapper extends StandardListWrapper<EditHistory> {
}
