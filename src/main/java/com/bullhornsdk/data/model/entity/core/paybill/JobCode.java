package com.bullhornsdk.data.model.entity.core.paybill;

import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.standard.BusinessSector;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.CorporationDepartment;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
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
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText1;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText2;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText3;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText4;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText5;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText6;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText7;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText8;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText9;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText10;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText11;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText12;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText13;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText14;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText15;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText16;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText17;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText18;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText19;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customText20;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customTextBlock1;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
    String customTextBlock2;
    @JsonIgnore
    @Getter(onMethod = @__(@JsonProperty))
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
