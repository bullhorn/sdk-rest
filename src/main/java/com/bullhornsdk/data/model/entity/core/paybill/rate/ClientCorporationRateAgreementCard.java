package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.api.helper.RestOneToManySerializer;
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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@JsonFilter(DynamicNullValueFilter.FILTER_NAME)
@EqualsAndHashCode(callSuper = false)
public class ClientCorporationRateAgreementCard extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity,
    SoftDeleteEntity, EffectiveDateEntity, AssociationEntity {
    Integer id;
    OneToMany<Category> categories;
    ClientCorporation clientCorporation;
    @JsonSerialize(using = RestOneToManySerializer.class)
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
    @JsonIgnore
    @Getter(onMethod_ = {@JsonProperty})
    String customText1;
    @JsonIgnore
    @Getter(onMethod_ = {@JsonProperty})
    String customText2;
    @JsonIgnore
    @Getter(onMethod_ = {@JsonProperty})
    String customText3;
    @JsonIgnore
    @Getter(onMethod_ = {@JsonProperty})
    String customText4;
    @JsonIgnore
    @Getter(onMethod_ = {@JsonProperty})
    String customText5;
    @JsonIgnore
    @Getter(onMethod_ = {@JsonProperty})
    String customText6;
    @JsonIgnore
    @Getter(onMethod_ = {@JsonProperty})
    String customText7;
    @JsonIgnore
    @Getter(onMethod_ = {@JsonProperty})
    String customText8;
    @JsonIgnore
    @Getter(onMethod_ = {@JsonProperty})
    String customText9;
    @JsonIgnore
    @Getter(onMethod_ = {@JsonProperty})
    String customText10;
    DateTime dateAdded;
    DateTime dateLastModified;
    String effectiveDate;
    String effectiveEndDate;
    @JsonIgnore
    @Getter(onMethod_ = {@JsonProperty})
    String employmentTypes;
    Boolean isDeleted;
    OneToMany<JobCode> jobCodes;
    OneToMany<Location> locations;
    String name;
    String rootExternalID;
    String rootMigrateGUID;
    OneToMany<Specialty> specialties;
    @JsonIgnore
    @Getter(onMethod_ = {@JsonProperty})
    String states;
    SimplifiedOptionsLookup statusLookup;
    Integer versionID;
    OneToMany<ClientCorporationRateAgreementCardVersion> versions;

//    @JsonProperty("id")
//    public Integer getId() {
//        return id;
//    }
//
//    @JsonProperty("id")
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    @Override
//    public DateTime getDateLastModified() {
//        return dateLastModified;
//    }
//
//    @Override
//    public Boolean getIsDeleted() {
//        return isDeleted;
//    }
//
//    @Override
//    public String getEffectiveDate() {
//        return effectiveDate;
//    }
//
//    @Override
//    public String getEffectiveEndDate() {
//        return effectiveEndDate;
//    }
}
