package com.bullhornsdk.data.model.entity.core.bte;

import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.joda.time.DateTime;

@Data
@JsonFilter(DynamicNullValueFilter.FILTER_NAME)
@EqualsAndHashCode(callSuper = false)
public class HolidayInstance extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity, AssociationEntity {
    Integer id;
    DateTime dateAdded;
    DateTime dateLastModified;
    DateTime endAt;
    Holiday holiday;
    CorporateUser modifyingUser;
    DateTime startAt;
}
