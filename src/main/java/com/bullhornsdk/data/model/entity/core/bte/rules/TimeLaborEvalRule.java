package com.bullhornsdk.data.model.entity.core.bte.rules;

import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.bte.Holiday;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.State;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.joda.time.DateTime;

import java.util.Map;

@Data
@JsonFilter(DynamicNullValueFilter.FILTER_NAME)
@EqualsAndHashCode(callSuper = false)
public class TimeLaborEvalRule extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, AssociationEntity {
    Integer id;
    DateTime addedAtUtc;
    CorporateUser addedByUser;
    String description;
    OneToMany<Holiday> holidays;
    Boolean isRun;
    DateTime lastModifiedAtUtc;
    CorporateUser modifyingUser;
    String name;
    Map<String, Object> parameters;
    OneToMany<State> states;
    SimplifiedOptionsLookup timeLaborCalcTypeLookup;
    SimplifiedOptionsLookup timeLaborEvalRuleCategoryLookup;
    SimplifiedOptionsLookup timeLaborEvalRuleCombineCriteriaLookup;
    SimplifiedOptionsLookup timeLaborEvalRuleStatusLookup;
    OneToMany<TimeLaborEvalRuleTemplate> timeLaborEvalRuleTemplates;
    SimplifiedOptionsLookup timeLaborEvalRuleTypeLookup;

}
