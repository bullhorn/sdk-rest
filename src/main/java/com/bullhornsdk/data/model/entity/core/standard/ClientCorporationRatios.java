package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonRootName("data")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientCorporationRatios extends AbstractEntity implements QueryEntity {
    private Integer id;
    private ClientCorporation clientCorporation;
    private BigDecimal overallFillRatio;
    private BigDecimal overallInterviewToPlacementRatio;
    private BigDecimal overallSubmissionToInterviewRatio;
    private BigDecimal ytdFillRatio;
    private BigDecimal ytdInterviewToPlacementRatio;
    private BigDecimal ytdSubmissionToInterviewRatio;
}
