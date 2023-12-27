package com.bullhornsdk.data.model.entity.core.paybill;

import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.standard.BusinessSector;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.CorporationDepartment;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.joda.time.DateTime;

import java.math.BigDecimal;

@Data
@JsonFilter(DynamicNullValueFilter.FILTER_NAME)
public class JobCode extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity, SoftDeleteEntity {
    Integer id;
    OneToMany<BusinessSector> businessSectors;
    OneToMany<Category> categories;
    DateTime customDate1;
    DateTime customDate2;
    DateTime customDate3;
    BigDecimal customFloat1;
    BigDecimal customFloat2;
    BigDecimal customFloat3;
    Integer customInt1;
    Integer customInt2;
    Integer customInt3;
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
    String customText11;
    String customText12;
    String customText13;
    String customText14;
    String customText15;
    String customText16;
    String customText17;
    String customText18;
    String customText19;
    String customText20;
    String customTextBlock1;
    String customTextBlock2;
    String customTextBlock3;
    DateTime dateAdded;
    DateTime dateLastModified;
    OneToMany<CorporationDepartment> corporationDepartments;
    String description;
    String externalID;
    Boolean isDeleted;
    CorporateUser owner;
    String status;
    String title;

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
    public Boolean getIsDeleted() {
        return isDeleted;
    }
}
