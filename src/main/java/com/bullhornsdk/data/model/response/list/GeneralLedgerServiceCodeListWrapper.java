package com.bullhornsdk.data.model.response.list;

import com.bullhornsdk.data.model.entity.core.paybill.chartofaccounts.GeneralLedgerServiceCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"data", "count", "start"})
public class GeneralLedgerServiceCodeListWrapper extends StandardListWrapper<GeneralLedgerServiceCode> {

}
