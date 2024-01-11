package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.paybill.earncode.EarnCodeGroup;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@JsonFilter(DynamicNullValueFilter.FILTER_NAME)
public class ClientCorporationRateAgreementCardLineGroup extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {
    Integer id;
    ClientCorporationRateAgreementCard clientCorporationRateAgreementCard;
    OneToMany<ClientCorporationRateAgreementCardLine> clientCorporationRateAgreementCardLines;
    ClientCorporationRateAgreementCardVersion clientCorporationRateAgreementCardVersion;
    EarnCodeGroup earnCodeGroup;
    String externalID;
    Boolean isBase;
    String migrateGUID;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }
}
