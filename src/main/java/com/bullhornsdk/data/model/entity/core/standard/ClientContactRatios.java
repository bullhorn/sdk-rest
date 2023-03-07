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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("data")
public class ClientContactRatios extends AbstractEntity implements QueryEntity {
    private Integer id;
    private ClientContact clientContact;
    private BigDecimal overallFillRatio;
    private BigDecimal overallInterviewToPlacementRatio;
    private BigDecimal overallSubmissionToInterviewRatio;
    private BigDecimal ytdFillRatio;
    private BigDecimal ytdInterviewToPlacementRatio;
    private BigDecimal ytdSubmissionToInterviewRatio;
}
