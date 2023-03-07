package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.joda.time.DateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonRootName("data")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Shift extends AbstractEntity implements QueryEntity, UpdateEntity, SoftDeleteEntity, DateLastModifiedEntity {
    private Integer id;
    private ClientCorporation clientCorporation;
    private DateTime dateLastModified;
    private Integer dayOfWeek;
    private DateTime endTime;
    private Boolean friday;
    private String htmlColorCode;
    private Boolean isDefault;
    private Boolean isDeleted;
    private CorporateUser lastModifyingUser;
    private String migrateGUID;
    private Boolean monday;
    private String name;
    private Boolean saturday;
    private String shortName;
    private DateTime startTime;
    private Boolean sunday;
    private Boolean thursday;
    private Boolean tuesday;
    private String type;
    private Boolean wednesday;
}
