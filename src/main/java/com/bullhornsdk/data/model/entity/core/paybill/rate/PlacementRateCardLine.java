package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.model.entity.core.paybill.earncode.EarnCode;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsI;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "alias", "billCurrencyUnit", "billRate", "earnCode",
    "customFloat1", "customFloat2", "customFloat3", "customFloat4", "customFloat5",
    "customInt1", "customInt2", "customInt3", "customInt4", "customInt5",
    "customRate1", "customRate2", "customRate3", "customRate4", "customRate5",
    "customText1", "customText2", "customText3", "customText4", "customText5",
    "customText6", "customText7", "customText8", "customText9", "customText10",
    "externalID", "migrateGUID", "payCurrencyUnit", "payRate", "placementRateCardLineGroup",
    "payMultiplier", "billMultiplier", "markupPercent", "markupValue", "dateLastModified",
    "taxableMargin"})
@Data
@EqualsAndHashCode(callSuper = false)
public class PlacementRateCardLine extends CustomFieldsI implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity {

    @Getter(onMethod_ = @Override)
    @Setter(onMethod_ = @Override)
    private Integer id;

    @Size(max = 100)
    private String alias;

    private CurrencyUnit billCurrencyUnit;

    private BigDecimal billRate;

    private EarnCode earnCode;

    @Size(max = 100)
    private String externalID;

    @Size(max = 36)
    private String migrateGUID;

    private CurrencyUnit payCurrencyUnit;

    private BigDecimal payRate;

    private PlacementRateCardLineGroup placementRateCardLineGroup;

    private BigDecimal payMultiplier;

    private BigDecimal billMultiplier;

    private BigDecimal markupPercent;

    private BigDecimal markupValue;

    @Getter(onMethod_ = @Override)
    private DateTime dateLastModified;

    private BigDecimal taxableMargin;
}
