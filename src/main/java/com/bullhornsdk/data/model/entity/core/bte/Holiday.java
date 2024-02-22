package com.bullhornsdk.data.model.entity.core.bte;

import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.bte.rules.TimeLaborEvalRule;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
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
public class Holiday extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity, SoftDeleteEntity, AssociationEntity {
    Integer id;
    String cronExpression;
    DateTime dateAdded;
    DateTime dateLastModified;
    String description;
    Integer duration;
    SimplifiedOptionsLookup holidayCategoryLookup;
    OneToMany<HolidayInstance> holidayInstances;
    SimplifiedOptionsLookup holidayStatusLookup;
    Boolean isDeleted;
    Boolean isRun;
    String label;
    CorporateUser modifyingUser;
    DateTime nextOccurrence;
    OneToMany<TimeLaborEvalRule> timeLaborEvalRules;
}
