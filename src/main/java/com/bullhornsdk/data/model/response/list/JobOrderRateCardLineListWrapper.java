package com.bullhornsdk.data.model.response.list;

import com.bullhornsdk.data.model.entity.core.paybill.rate.JobOrderRateCardLine;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"data", "count", "start"})
public class JobOrderRateCardLineListWrapper extends StandardListWrapper<JobOrderRateCardLine> {
}
