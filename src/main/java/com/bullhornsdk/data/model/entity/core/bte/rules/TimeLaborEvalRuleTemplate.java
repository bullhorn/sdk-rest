package com.bullhornsdk.data.model.entity.core.bte.rules;

import com.bullhornsdk.data.api.helper.RestOneToManySerializer;
import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.joda.time.DateTime;

@Data
@JsonFilter(DynamicNullValueFilter.FILTER_NAME)
@EqualsAndHashCode(callSuper = false)
public class TimeLaborEvalRuleTemplate extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity, AssociationEntity {
    Integer id;
    DateTime addedAtUtc;
    CorporateUser addedByUser;
    String description;
    Boolean isDefault;
    DateTime lastModifiedAtUtc;
    CorporateUser modifyingUser;
    String name;
    @JsonSerialize(using = RestOneToManySerializer.class)
    OneToMany<TimeLaborEvalRule> timeLaborEvalRules;
    OneToMany<SimplifiedOptionsLookup> timeLaborEvalRulesCalcTypes;
    OneToMany<SimplifiedOptionsLookup> timeLaborEvalRulesCategories;
}
