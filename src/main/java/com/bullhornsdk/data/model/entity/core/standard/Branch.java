package com.bullhornsdk.data.model.entity.core.standard;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AllRecordsEntity;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.BaseCustomFields;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by john.sullivan on 10/7/2017.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "name", "isDeleted", "parentBranch", "externalID", "dateAdded", "customText1", "customText2", "customText3",
    "customText4", "customText5", "customText6", "customText7", "customText8", "customText9", "customText10", "customTextBlock1",
    "customTextBlock2", "customTextBlock3", "customDate1", "customDate2", "customDate3", "customDate4", "customDate5", "customDate6",
    "customFloat1", "customFloat2", "customFloat3", "customFloat4", "customFloat5", "customFloat6", "customInt1", "customInt2", "customInt3",
    "customInt4", "customInt5", "customInt6", "customInt7", "customInt8", "customInt9", "customInt10", "ancestors", "descendants", "corporateUsers"})
public class Branch extends BaseCustomFields implements AllRecordsEntity, CreateEntity, UpdateEntity, QueryEntity, SoftDeleteEntity, AssociationEntity {

    private Integer id;

    private String name;

    private Boolean isDeleted;

    private Branch parentBranch;

    private String externalID;

    private DateTime dateAdded;

    private String customText1;

    private String customText2;

    private String customText3;

    private String customText4;

    private String customText5;

    private String customText6;

    private String customText7;

    private String customText8;

    private String customText9;

    private String customText10;

    private String customTextBlock1;

    private String customTextBlock2;

    private String customTextBlock3;

    private DateTime customDate1;

    private DateTime customDate2;

    private DateTime customDate3;

    private DateTime customDate4;

    private DateTime customDate5;

    private DateTime customDate6;

    private Double customFloat1;

    private Double customFloat2;

    private Double customFloat3;

    private Double customFloat4;

    private Double customFloat5;

    private Double customFloat6;

    private Integer customInt1;

    private Integer customInt2;

    private Integer customInt3;

    private Integer customInt4;

    private Integer customInt5;

    private Integer customInt6;

    private Integer customInt7;

    private Integer customInt8;

    private Integer customInt9;

    private Integer customInt10;

    private OneToMany<Branch> ancestors;

    private OneToMany<Branch> descendants;

    private OneToMany<CorporateUser> corporateUsers;

    @JsonProperty("id")
    @Override
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("isDeleted")
    @Override
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("parentBranch")
    public Branch getParentBranch() {
        return parentBranch;
    }

    @JsonProperty("parentBranch")
    public void setParentBranch(Branch parentBranch) {
        this.parentBranch = parentBranch;
    }

    @JsonProperty("externalID")
    public String getExternalID() {
        return externalID;
    }

    @JsonProperty("externalID")
    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("customText1")
    public String getCustomText1() {
        return customText1;
    }

    @JsonProperty("customText1")
    public void setCustomText1(String customText1) {
        this.customText1 = customText1;
    }

    @JsonProperty("customText2")
    public String getCustomText2() {
        return customText2;
    }

    @JsonProperty("customText2")
    public void setCustomText2(String customText2) {
        this.customText2 = customText2;
    }

    @JsonProperty("customText3")
    public String getCustomText3() {
        return customText3;
    }

    @JsonProperty("customText3")
    public void setCustomText3(String customText3) {
        this.customText3 = customText3;
    }

    @JsonProperty("customText4")
    public String getCustomText4() {
        return customText4;
    }

    @JsonProperty("customText4")
    public void setCustomText4(String customText4) {
        this.customText4 = customText4;
    }

    @JsonProperty("customText5")
    public String getCustomText5() {
        return customText5;
    }

    @JsonProperty("customText5")
    public void setCustomText5(String customText5) {
        this.customText5 = customText5;
    }

    @JsonProperty("customText6")
    public String getCustomText6() {
        return customText6;
    }

    @JsonProperty("customText6")
    public void setCustomText6(String customText6) {
        this.customText6 = customText6;
    }

    @JsonProperty("customText7")
    public String getCustomText7() {
        return customText7;
    }

    @JsonProperty("customText7")
    public void setCustomText7(String customText7) {
        this.customText7 = customText7;
    }

    @JsonProperty("customText8")
    public String getCustomText8() {
        return customText8;
    }

    @JsonProperty("customText8")
    public void setCustomText8(String customText8) {
        this.customText8 = customText8;
    }

    @JsonProperty("customText9")
    public String getCustomText9() {
        return customText9;
    }

    @JsonProperty("customText9")
    public void setCustomText9(String customText9) {
        this.customText9 = customText9;
    }

    @JsonProperty("customText10")
    public String getCustomText10() {
        return customText10;
    }

    @JsonProperty("customText10")
    public void setCustomText10(String customText10) {
        this.customText10 = customText10;
    }

    @JsonProperty("customTextBlock1")
    public String getCustomTextBlock1() {
        return customTextBlock1;
    }

    @JsonProperty("customTextBlock1")
    public void setCustomTextBlock1(String customTextBlock1) {
        this.customTextBlock1 = customTextBlock1;
    }

    @JsonProperty("customTextBlock2")
    public String getCustomTextBlock2() {
        return customTextBlock2;
    }

    @JsonProperty("customTextBlock2")
    public void setCustomTextBlock2(String customTextBlock2) {
        this.customTextBlock2 = customTextBlock2;
    }

    @JsonProperty("customTextBlock3")
    public String getCustomTextBlock3() {
        return customTextBlock3;
    }

    @JsonProperty("customTextBlock3")
    public void setCustomTextBlock3(String customTextBlock3) {
        this.customTextBlock3 = customTextBlock3;
    }

    @JsonProperty("customDate1")
    public DateTime getCustomDate1() {
        return customDate1;
    }

    @JsonProperty("customDate1")
    public void setCustomDate1(DateTime customDate1) {
        this.customDate1 = customDate1;
    }

    @JsonProperty("customDate2")
    public DateTime getCustomDate2() {
        return customDate2;
    }

    @JsonProperty("customDate2")
    public void setCustomDate2(DateTime customDate2) {
        this.customDate2 = customDate2;
    }

    @JsonProperty("customDate3")
    public DateTime getCustomDate3() {
        return customDate3;
    }

    @JsonProperty("customDate3")
    public void setCustomDate3(DateTime customDate3) {
        this.customDate3 = customDate3;
    }

    @JsonProperty("customDate4")
    public DateTime getCustomDate4() {
        return customDate4;
    }

    @JsonProperty("customDate4")
    public void setCustomDate4(DateTime customDate4) {
        this.customDate4 = customDate4;
    }

    @JsonProperty("customDate5")
    public DateTime getCustomDate5() {
        return customDate5;
    }

    @JsonProperty("customDate5")
    public void setCustomDate5(DateTime customDate5) {
        this.customDate5 = customDate5;
    }

    @JsonProperty("customDate6")
    public DateTime getCustomDate6() {
        return customDate6;
    }

    @JsonProperty("customDate6")
    public void setCustomDate6(DateTime customDate6) {
        this.customDate6 = customDate6;
    }

    @JsonProperty("customFloat1")
    public Double getCustomFloat1() {
        return customFloat1;
    }

    @JsonProperty("customFloat1")
    public void setCustomFloat1(Double customFloat1) {
        this.customFloat1 = customFloat1;
    }

    @JsonProperty("customFloat2")
    public Double getCustomFloat2() {
        return customFloat2;
    }

    @JsonProperty("customFloat2")
    public void setCustomFloat2(Double customFloat2) {
        this.customFloat2 = customFloat2;
    }

    @JsonProperty("customFloat3")
    public Double getCustomFloat3() {
        return customFloat3;
    }

    @JsonProperty("customFloat3")
    public void setCustomFloat3(Double customFloat3) {
        this.customFloat3 = customFloat3;
    }

    @JsonProperty("customFloat4")
    public Double getCustomFloat4() {
        return customFloat4;
    }

    @JsonProperty("customFloat4")
    public void setCustomFloat4(Double customFloat4) {
        this.customFloat4 = customFloat4;
    }

    @JsonProperty("customFloat5")
    public Double getCustomFloat5() {
        return customFloat5;
    }

    @JsonProperty("customFloat5")
    public void setCustomFloat5(Double customFloat5) {
        this.customFloat5 = customFloat5;
    }

    @JsonProperty("customFloat6")
    public Double getCustomFloat6() {
        return customFloat6;
    }

    @JsonProperty("customFloat6")
    public void setCustomFloat6(Double customFloat6) {
        this.customFloat6 = customFloat6;
    }

    @JsonProperty("customInt1")
    public Integer getCustomInt1() {
        return customInt1;
    }

    @JsonProperty("customInt1")
    public void setCustomInt1(Integer customInt1) {
        this.customInt1 = customInt1;
    }

    @JsonProperty("customInt2")
    public Integer getCustomInt2() {
        return customInt2;
    }

    @JsonProperty("customInt2")
    public void setCustomInt2(Integer customInt2) {
        this.customInt2 = customInt2;
    }

    @JsonProperty("customInt3")
    public Integer getCustomInt3() {
        return customInt3;
    }

    @JsonProperty("customInt3")
    public void setCustomInt3(Integer customInt3) {
        this.customInt3 = customInt3;
    }

    @JsonProperty("customInt4")
    public Integer getCustomInt4() {
        return customInt4;
    }

    @JsonProperty("customInt4")
    public void setCustomInt4(Integer customInt4) {
        this.customInt4 = customInt4;
    }

    @JsonProperty("customInt5")
    public Integer getCustomInt5() {
        return customInt5;
    }

    @JsonProperty("customInt5")
    public void setCustomInt5(Integer customInt5) {
        this.customInt5 = customInt5;
    }

    @JsonProperty("customInt6")
    public Integer getCustomInt6() {
        return customInt6;
    }

    @JsonProperty("customInt6")
    public void setCustomInt6(Integer customInt6) {
        this.customInt6 = customInt6;
    }

    @JsonProperty("customInt7")
    public Integer getCustomInt7() {
        return customInt7;
    }

    @JsonProperty("customInt7")
    public void setCustomInt7(Integer customInt7) {
        this.customInt7 = customInt7;
    }

    @JsonProperty("customInt8")
    public Integer getCustomInt8() {
        return customInt8;
    }

    @JsonProperty("customInt8")
    public void setCustomInt8(Integer customInt8) {
        this.customInt8 = customInt8;
    }

    @JsonProperty("customInt9")
    public Integer getCustomInt9() {
        return customInt9;
    }

    @JsonProperty("customInt9")
    public void setCustomInt9(Integer customInt9) {
        this.customInt9 = customInt9;
    }

    @JsonProperty("customInt10")
    public Integer getCustomInt10() {
        return customInt10;
    }

    @JsonProperty("customInt10")
    public void setCustomInt10(Integer customInt10) {
        this.customInt10 = customInt10;
    }

    @JsonProperty("ancestors")
    public OneToMany<Branch> getAncestors() {
        return ancestors;
    }

    @JsonProperty("ancestors")
    @ReadOnly
    public void setAncestors(OneToMany<Branch> ancestors) {
        this.ancestors = ancestors;
    }

    @JsonProperty("descendants")
    public OneToMany<Branch> getDescendants() {
        return descendants;
    }

    @JsonProperty("descendants")
    @ReadOnly
    public void setDescendants(OneToMany<Branch> descendants) {
        this.descendants = descendants;
    }

    @JsonProperty("corporateUsers")
    public OneToMany<CorporateUser> getCorporateUsers() {
        return corporateUsers;
    }

    @JsonProperty("corporateUsers")
    @ReadOnly
    public void setCorporateUsers(OneToMany<CorporateUser> corporateUsers) {
        this.corporateUsers = corporateUsers;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Branch)) return false;
        if (!super.equals(o)) return false;

        Branch branch = (Branch) o;

        if (id != null ? !id.equals(branch.id) : branch.id != null) return false;
        if (name != null ? !name.equals(branch.name) : branch.name != null) return false;
        if (isDeleted != null ? !isDeleted.equals(branch.isDeleted) : branch.isDeleted != null) return false;
        if (parentBranch != null ? !parentBranch.equals(branch.parentBranch) : branch.parentBranch != null)
            return false;
        if (externalID != null ? !externalID.equals(branch.externalID) : branch.externalID != null) return false;
        if (dateAdded != null ? !dateAdded.equals(branch.dateAdded) : branch.dateAdded != null) return false;
        if (customText1 != null ? !customText1.equals(branch.customText1) : branch.customText1 != null) return false;
        if (customText2 != null ? !customText2.equals(branch.customText2) : branch.customText2 != null) return false;
        if (customText3 != null ? !customText3.equals(branch.customText3) : branch.customText3 != null) return false;
        if (customText4 != null ? !customText4.equals(branch.customText4) : branch.customText4 != null) return false;
        if (customText5 != null ? !customText5.equals(branch.customText5) : branch.customText5 != null) return false;
        if (customText6 != null ? !customText6.equals(branch.customText6) : branch.customText6 != null) return false;
        if (customText7 != null ? !customText7.equals(branch.customText7) : branch.customText7 != null) return false;
        if (customText8 != null ? !customText8.equals(branch.customText8) : branch.customText8 != null) return false;
        if (customText9 != null ? !customText9.equals(branch.customText9) : branch.customText9 != null) return false;
        if (customText10 != null ? !customText10.equals(branch.customText10) : branch.customText10 != null)
            return false;
        if (customTextBlock1 != null ? !customTextBlock1.equals(branch.customTextBlock1) : branch.customTextBlock1 != null)
            return false;
        if (customTextBlock2 != null ? !customTextBlock2.equals(branch.customTextBlock2) : branch.customTextBlock2 != null)
            return false;
        if (customTextBlock3 != null ? !customTextBlock3.equals(branch.customTextBlock3) : branch.customTextBlock3 != null)
            return false;
        if (customDate1 != null ? !customDate1.equals(branch.customDate1) : branch.customDate1 != null) return false;
        if (customDate2 != null ? !customDate2.equals(branch.customDate2) : branch.customDate2 != null) return false;
        if (customDate3 != null ? !customDate3.equals(branch.customDate3) : branch.customDate3 != null) return false;
        if (customDate4 != null ? !customDate4.equals(branch.customDate4) : branch.customDate4 != null) return false;
        if (customDate5 != null ? !customDate5.equals(branch.customDate5) : branch.customDate5 != null) return false;
        if (customDate6 != null ? !customDate6.equals(branch.customDate6) : branch.customDate6 != null) return false;
        if (customFloat1 != null ? !customFloat1.equals(branch.customFloat1) : branch.customFloat1 != null)
            return false;
        if (customFloat2 != null ? !customFloat2.equals(branch.customFloat2) : branch.customFloat2 != null)
            return false;
        if (customFloat3 != null ? !customFloat3.equals(branch.customFloat3) : branch.customFloat3 != null)
            return false;
        if (customFloat4 != null ? !customFloat4.equals(branch.customFloat4) : branch.customFloat4 != null)
            return false;
        if (customFloat5 != null ? !customFloat5.equals(branch.customFloat5) : branch.customFloat5 != null)
            return false;
        if (customFloat6 != null ? !customFloat6.equals(branch.customFloat6) : branch.customFloat6 != null)
            return false;
        if (customInt1 != null ? !customInt1.equals(branch.customInt1) : branch.customInt1 != null) return false;
        if (customInt2 != null ? !customInt2.equals(branch.customInt2) : branch.customInt2 != null) return false;
        if (customInt3 != null ? !customInt3.equals(branch.customInt3) : branch.customInt3 != null) return false;
        if (customInt4 != null ? !customInt4.equals(branch.customInt4) : branch.customInt4 != null) return false;
        if (customInt5 != null ? !customInt5.equals(branch.customInt5) : branch.customInt5 != null) return false;
        if (customInt6 != null ? !customInt6.equals(branch.customInt6) : branch.customInt6 != null) return false;
        if (customInt7 != null ? !customInt7.equals(branch.customInt7) : branch.customInt7 != null) return false;
        if (customInt8 != null ? !customInt8.equals(branch.customInt8) : branch.customInt8 != null) return false;
        if (customInt9 != null ? !customInt9.equals(branch.customInt9) : branch.customInt9 != null) return false;
        if (customInt10 != null ? !customInt10.equals(branch.customInt10) : branch.customInt10 != null) return false;
        if (ancestors != null ? !ancestors.equals(branch.ancestors) : branch.ancestors != null) return false;
        if (descendants != null ? !descendants.equals(branch.descendants) : branch.descendants != null) return false;
        return corporateUsers != null ? corporateUsers.equals(branch.corporateUsers) : branch.corporateUsers == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (parentBranch != null ? parentBranch.hashCode() : 0);
        result = 31 * result + (externalID != null ? externalID.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (customText1 != null ? customText1.hashCode() : 0);
        result = 31 * result + (customText2 != null ? customText2.hashCode() : 0);
        result = 31 * result + (customText3 != null ? customText3.hashCode() : 0);
        result = 31 * result + (customText4 != null ? customText4.hashCode() : 0);
        result = 31 * result + (customText5 != null ? customText5.hashCode() : 0);
        result = 31 * result + (customText6 != null ? customText6.hashCode() : 0);
        result = 31 * result + (customText7 != null ? customText7.hashCode() : 0);
        result = 31 * result + (customText8 != null ? customText8.hashCode() : 0);
        result = 31 * result + (customText9 != null ? customText9.hashCode() : 0);
        result = 31 * result + (customText10 != null ? customText10.hashCode() : 0);
        result = 31 * result + (customTextBlock1 != null ? customTextBlock1.hashCode() : 0);
        result = 31 * result + (customTextBlock2 != null ? customTextBlock2.hashCode() : 0);
        result = 31 * result + (customTextBlock3 != null ? customTextBlock3.hashCode() : 0);
        result = 31 * result + (customDate1 != null ? customDate1.hashCode() : 0);
        result = 31 * result + (customDate2 != null ? customDate2.hashCode() : 0);
        result = 31 * result + (customDate3 != null ? customDate3.hashCode() : 0);
        result = 31 * result + (customDate4 != null ? customDate4.hashCode() : 0);
        result = 31 * result + (customDate5 != null ? customDate5.hashCode() : 0);
        result = 31 * result + (customDate6 != null ? customDate6.hashCode() : 0);
        result = 31 * result + (customFloat1 != null ? customFloat1.hashCode() : 0);
        result = 31 * result + (customFloat2 != null ? customFloat2.hashCode() : 0);
        result = 31 * result + (customFloat3 != null ? customFloat3.hashCode() : 0);
        result = 31 * result + (customFloat4 != null ? customFloat4.hashCode() : 0);
        result = 31 * result + (customFloat5 != null ? customFloat5.hashCode() : 0);
        result = 31 * result + (customFloat6 != null ? customFloat6.hashCode() : 0);
        result = 31 * result + (customInt1 != null ? customInt1.hashCode() : 0);
        result = 31 * result + (customInt2 != null ? customInt2.hashCode() : 0);
        result = 31 * result + (customInt3 != null ? customInt3.hashCode() : 0);
        result = 31 * result + (customInt4 != null ? customInt4.hashCode() : 0);
        result = 31 * result + (customInt5 != null ? customInt5.hashCode() : 0);
        result = 31 * result + (customInt6 != null ? customInt6.hashCode() : 0);
        result = 31 * result + (customInt7 != null ? customInt7.hashCode() : 0);
        result = 31 * result + (customInt8 != null ? customInt8.hashCode() : 0);
        result = 31 * result + (customInt9 != null ? customInt9.hashCode() : 0);
        result = 31 * result + (customInt10 != null ? customInt10.hashCode() : 0);
        result = 31 * result + (ancestors != null ? ancestors.hashCode() : 0);
        result = 31 * result + (descendants != null ? descendants.hashCode() : 0);
        result = 31 * result + (corporateUsers != null ? corporateUsers.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder("Branch {")
            .append("\n\t\"id\": ")
            .append(id)
            .append(",\n\t\"name\": ")
            .append("'")
            .append(name).append('\'')
            .append(",\n\t\"isDeleted\": ")
            .append(isDeleted)
            .append(",\n\t\"parentBranch\": ")
            .append(parentBranch)
            .append(",\n\t\"externalID\": ")
            .append("'")
            .append(externalID).append('\'')
            .append(",\n\t\"dateAdded\": ")
            .append(dateAdded)
            .append(",\n\t\"customText1\": ")
            .append("'")
            .append(customText1).append('\'')
            .append(",\n\t\"customText2\": ")
            .append("'")
            .append(customText2).append('\'')
            .append(",\n\t\"customText3\": ")
            .append("'")
            .append(customText3).append('\'')
            .append(",\n\t\"customText4\": ")
            .append("'")
            .append(customText4).append('\'')
            .append(",\n\t\"customText5\": ")
            .append("'")
            .append(customText5).append('\'')
            .append(",\n\t\"customText6\": ")
            .append("'")
            .append(customText6).append('\'')
            .append(",\n\t\"customText7\": ")
            .append("'")
            .append(customText7).append('\'')
            .append(",\n\t\"customText8\": ")
            .append("'")
            .append(customText8).append('\'')
            .append(",\n\t\"customText9\": ")
            .append("'")
            .append(customText9).append('\'')
            .append(",\n\t\"customText10\": ")
            .append("'")
            .append(customText10).append('\'')
            .append(",\n\t\"customTextBlock1\": ")
            .append("'")
            .append(customTextBlock1).append('\'')
            .append(",\n\t\"customTextBlock2\": ")
            .append("'")
            .append(customTextBlock2).append('\'')
            .append(",\n\t\"customTextBlock3\": ")
            .append("'")
            .append(customTextBlock3).append('\'')
            .append(",\n\t\"customDate1\": ")
            .append(customDate1)
            .append(",\n\t\"customDate2\": ")
            .append(customDate2)
            .append(",\n\t\"customDate3\": ")
            .append(customDate3)
            .append(",\n\t\"customDate4\": ")
            .append(customDate4)
            .append(",\n\t\"customDate5\": ")
            .append(customDate5)
            .append(",\n\t\"customDate6\": ")
            .append(customDate6)
            .append(",\n\t\"customFloat1\": ")
            .append(customFloat1)
            .append(",\n\t\"customFloat2\": ")
            .append(customFloat2)
            .append(",\n\t\"customFloat3\": ")
            .append(customFloat3)
            .append(",\n\t\"customFloat4\": ")
            .append(customFloat4)
            .append(",\n\t\"customFloat5\": ")
            .append(customFloat5)
            .append(",\n\t\"customFloat6\": ")
            .append(customFloat6)
            .append(",\n\t\"customInt1\": ")
            .append(customInt1)
            .append(",\n\t\"customInt2\": ")
            .append(customInt2)
            .append(",\n\t\"customInt3\": ")
            .append(customInt3)
            .append(",\n\t\"customInt4\": ")
            .append(customInt4)
            .append(",\n\t\"customInt5\": ")
            .append(customInt5)
            .append(",\n\t\"customInt6\": ")
            .append(customInt6)
            .append(",\n\t\"customInt7\": ")
            .append(customInt7)
            .append(",\n\t\"customInt8\": ")
            .append(customInt8)
            .append(",\n\t\"customInt9\": ")
            .append(customInt9)
            .append(",\n\t\"customInt10\": ")
            .append(customInt10)
            .append(",\n\t\"ancestors\": ")
            .append(ancestors)
            .append(",\n\t\"descendants\": ")
            .append(descendants)
            .append(",\n\t\"corporateUsers\": ")
            .append(corporateUsers)
            .append('}')
            .toString();
    }
}
