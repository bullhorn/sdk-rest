package com.bullhornsdk.data.model.entity.core.bte.rules;

import com.bullhornsdk.data.api.helper.RestOneToManySerializer;
import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
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
public class ClientCorporationBillRulesetVersion extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity, EffectiveDateEntity, AssociationEntity {
    Integer id;
    ClientCorporation clientCorporation;
    DateTime dateAdded;
    DateTime dateLastModified;
    String effectiveDate;
    String effectiveEndDate;
    Boolean isFirst;
    @JsonSerialize(using = RestOneToManySerializer.class)
    OneToMany<TimeLaborEvalRule> timeLaborEvalRules;
}
