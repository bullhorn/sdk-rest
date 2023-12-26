package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.paybill.JobCode;
import com.bullhornsdk.data.model.entity.core.paybill.Location;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.Specialty;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Data;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@JsonFilter(DynamicNullValueFilter.FILTER_NAME)
public class ClientCorporationRateAgreementCard extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity,
    SoftDeleteEntity, EffectiveDateEntity, AssociationEntity {
    Integer id;
    OneToMany<Category> categories;
    ClientCorporation clientCorporation;
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
    Boolean isDeleted;
    OneToMany<JobCode> jobCodes;
    OneToMany<Location> locations;
    String name;
    String rootExternalID;
    String rootMigrateGUID;
    OneToMany<Specialty> specialties;
    String states;
    SimplifiedOptionsLookup statusLookup;
    Integer versionID;
    OneToMany<ClientCorporationRateAgreementCardVersion> versions;
}
