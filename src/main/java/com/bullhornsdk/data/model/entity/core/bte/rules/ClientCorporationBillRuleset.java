package com.bullhornsdk.data.model.entity.core.bte.rules;

import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.joda.time.DateTime;

@Data
@JsonFilter(DynamicNullValueFilter.FILTER_NAME)
@EqualsAndHashCode(callSuper = false)
public class ClientCorporationBillRuleset extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity, EffectiveDateEntity, SoftDeleteEntity, AssociationEntity {
    Integer id;
    ClientCorporation clientCorporation;
    DateTime dateAdded;
    DateTime dateLastModified;
    String effectiveDate;
    String effectiveEndDate;
    Boolean isDeleted;
    CorporateUser owner;
    OneToMany<TimeLaborEvalRule> timeLaborEvalRules;
    Integer versionID;
    OneToMany<ClientCorporationBillRulesetVersion> versions;
}
