package com.bullhornsdk.data.model.response.list;

import javax.annotation.Generated;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({ "data", "count", "start" })
public class JobOrderListWrapper extends StandardListWrapper<JobOrder> {

}