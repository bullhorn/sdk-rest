package com.bullhornsdk.data.model.response.list;

import com.bullhornsdk.data.model.entity.core.certificationrequirement.optionslookup.CertificationRequirementStatusLookup;
import com.bullhornsdk.data.model.entity.core.onboarding365.forms.StateTaxForm;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"data", "count", "start"})
public class StateTaxFormListWrapper extends StandardListWrapper<StateTaxForm> {

}
