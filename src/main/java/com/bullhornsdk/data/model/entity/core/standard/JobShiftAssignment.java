package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "actualStartTime", "actualEndTime", "candidate", "clientCorporation", "dateAdded",
    "dateLastModified", "endingDayMatchMask", "endingDayNumber", "isCancelled", "jobShift", "owner", "placement",
    "reasonCancelled", "scheduledStartTime",  "scheduledEndTime", "startingDayMatchMask", "startingDayNumber", "status",
    "utcEndDate", "utcStartDate"})

@Data
@JsonFilter(DynamicNullValueFilter.FILTER_NAME)
@EqualsAndHashCode(callSuper = false)
public class JobShiftAssignment extends AbstractEntity implements QueryEntity, UpdateEntity, HardDeleteEntity, CreateEntity, DateLastModifiedEntity {

    @Getter(onMethod_ = @Override)
    @Setter(onMethod_ = @Override)
    private Integer id;

    private DateTime dateAdded;

    @Getter(onMethod_ = @Override)
    private DateTime dateLastModified;

    private Placement placement;

    private JobShift jobShift;

    private ClientCorporation clientCorporation;

    private CorporateUser owner;

    private Candidate candidate;

    private String status;

    private String scheduledStartTime;

    private String scheduledEndTime;

    private Long actualStartTime;

    private Long actualEndTime;

    private Long utcStartDate;

    private Integer startingDayNumber;

    private Integer startingDayMatchMask;

    private Long utcEndDate;

    private Integer endingDayNumber;

    private Integer endingDayMatchMask;

    private String reasonCancelled;

    private Boolean isCancelled;
}
