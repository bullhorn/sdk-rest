package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.paybill.earncode.EarnCode;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsI;
import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.joda.time.DateTime;

import java.math.BigDecimal;

@Data
@JsonFilter(DynamicNullValueFilter.FILTER_NAME)
@EqualsAndHashCode(callSuper = false)
public class ClientCorporationRateAgreementCardLine extends CustomFieldsI implements QueryEntity, UpdateEntity, CreateEntity,
    EditHistoryEntity, DateLastModifiedEntity {
    Integer id;
    String alias;
    CurrencyUnit billCurrencyUnit;
    BigDecimal billMultiplier;
    BigDecimal billRate;
    DateTime dateLastModified;
    ClientCorporationRateAgreementCardLineGroup clientCorporationRateAgreementCardLineGroup;
    EarnCode earnCode;
    BigDecimal markupPercent;
    BigDecimal markupValue;
    String migrateGUID;
    CurrencyUnit payCurrencyUnit;
    BigDecimal payMultiplier;
    BigDecimal payRate;
}
