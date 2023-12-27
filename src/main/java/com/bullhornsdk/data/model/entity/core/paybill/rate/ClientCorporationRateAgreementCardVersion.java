package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.paybill.JobCode;
import com.bullhornsdk.data.model.entity.core.paybill.Location;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.Specialty;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@JsonFilter(DynamicNullValueFilter.FILTER_NAME)
public class ClientCorporationRateAgreementCardVersion extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity, EffectiveDateEntity, AssociationEntity {
    Integer id;
    OneToMany<Category> categories;
    OneToMany<ClientCorporationRateAgreementCardLineGroup> clientCorporationRateAgreementCardLineGroups;
    DateTime customDate1;
    DateTime customDate2;
    DateTime customDate3;
    BigDecimal customFloat1;
    BigDecimal customFloat2;
    BigDecimal customFloat3;
    BigInteger customInt1;
    BigInteger customInt2;
    BigInteger customInt3;
    String customText1;
    String customText2;
    String customText3;
    String customText4;
    String customText5;
    String customText6;
    String customText7;
    String customText8;
    String customText9;
    String customText10;
    DateTime dateAdded;
    DateTime dateLastModified;
    String effectiveDate;
    String effectiveEndDate;
    String employmentTypes;
    Boolean isFirst;
    OneToMany<JobCode> jobCodes;
    OneToMany<Location> locations;
    OneToMany<Specialty> specialties;
    String states;
    SimplifiedOptionsLookup statusLookup;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @Override
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @Override
    public String getEffectiveEndDate() {
        return effectiveEndDate;
    }
}
