package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.api.helper.RestOneToManySerializer;
import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.paybill.earncode.EarnCodeGroup;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@JsonFilter(DynamicNullValueFilter.FILTER_NAME)
@EqualsAndHashCode(callSuper = false)
public class ClientCorporationRateAgreementCardLineGroup extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {
    Integer id;
    ClientCorporationRateAgreementCard clientCorporationRateAgreementCard;
    @JsonSerialize(using = RestOneToManySerializer.class)
    OneToMany<ClientCorporationRateAgreementCardLine> clientCorporationRateAgreementCardLines;
    ClientCorporationRateAgreementCardVersion clientCorporationRateAgreementCardVersion;
    EarnCodeGroup earnCodeGroup;
    String externalID;
    Boolean isBase;
    String migrateGUID;
}
