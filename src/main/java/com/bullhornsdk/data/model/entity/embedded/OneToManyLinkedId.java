package com.bullhornsdk.data.model.entity.embedded;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "total" })
public class OneToManyLinkedId extends OneToMany<LinkedId> {

}