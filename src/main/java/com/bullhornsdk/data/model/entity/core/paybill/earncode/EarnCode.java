package com.bullhornsdk.data.model.entity.core.paybill.earncode;

import java.util.Objects;

import javax.validation.constraints.Size;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerAccount;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerSegment1;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerSegment2;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerSegment3;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerSegment4;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerSegment5;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerServiceCode;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.EditHistoryEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsA;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by mkesmetzis 23-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "code", "customDate1", "customDate2", "customDate3", "customFloat1", "customFloat2", "customFloat3",
    "customInt1", "customInt2", "customInt3", "customText1", "customText10", "customText11", "customText12", "customText13",
    "customText14", "customText15", "customText16", "customText17", "customText18", "customText19", "customText2",
    "customText20", "customText3", "customText4", "customText5", "customText6", "customText7", "customText8", "customText9",
    "dateAdded", "dateLastModified", "description", "earnCodeGroup", "earnCodeTypeLookup", "externalID",
    "owner", "title", "generalLedgerServiceCode", "generalLedgerBillAccount", "generalLedgerPayAccount",
    "generalLedgerSegment1", "generalLedgerSegment2", "generalLedgerSegment3", "generalLedgerSegment4", "generalLedgerSegment5"})
public class EarnCode extends CustomFieldsA implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity, EditHistoryEntity {

    private Integer id;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    @JsonIgnore
    private String description;
    private EarnCodeGroup earnCodeGroup;
    private SimplifiedOptionsLookup earnCodeTypeLookup;
    @Size(max = 100)
    private String code;
    private String externalID;
    private CorporateUser owner;
    private String title;
    private GeneralLedgerServiceCode generalLedgerServiceCode;
    private GeneralLedgerAccount generalLedgerBillAccount;
    private GeneralLedgerAccount generalLedgerPayAccount;
    private GeneralLedgerSegment1 generalLedgerSegment1;
    private GeneralLedgerSegment2 generalLedgerSegment2;
    private GeneralLedgerSegment3 generalLedgerSegment3;
    private GeneralLedgerSegment4 generalLedgerSegment4;
    private GeneralLedgerSegment5 generalLedgerSegment5;

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @ReadOnly
    @Override
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @ReadOnly
    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("generalLedgerSegment1")
    public GeneralLedgerSegment1 getGeneralLedgerSegment1() {
        return generalLedgerSegment1;
    }

    @JsonProperty("generalLedgerSegment1")
    public void setGeneralLedgerSegment1(GeneralLedgerSegment1 generalLedgerSegment1) {
        this.generalLedgerSegment1 = generalLedgerSegment1;
    }

    @JsonProperty("earnCodeGroup")
    public EarnCodeGroup getEarnCodeGroup() {
        return earnCodeGroup;
    }

    @JsonProperty("earnCodeGroup")
    public void setEarnCodeGroup(EarnCodeGroup earnCodeGroup) {
        this.earnCodeGroup = earnCodeGroup;
    }

    @JsonProperty("earnCodeTypeLookup")
    public SimplifiedOptionsLookup getEarnCodeTypeLookup() {
        return earnCodeTypeLookup;
    }

    @JsonProperty("earnCodeTypeLookup")
    public void setEarnCodeTypeLookup(SimplifiedOptionsLookup earnCodeTypeLookup) {
        this.earnCodeTypeLookup = earnCodeTypeLookup;
    }

    @JsonProperty("externalID")
    public String getExternalID() {
        return externalID;
    }

    @JsonProperty("externalID")
    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    @JsonProperty("generalLedgerSegment2")
    public GeneralLedgerSegment2 getGeneralLedgerSegment2() {
        return generalLedgerSegment2;
    }

    @JsonProperty("generalLedgerSegment2")
    public void setGeneralLedgerSegment2(GeneralLedgerSegment2 generalLedgerSegment2) {
        this.generalLedgerSegment2 = generalLedgerSegment2;
    }

    @JsonProperty("generalLedgerSegment3")
    public GeneralLedgerSegment3 getGeneralLedgerSegment3() {
        return generalLedgerSegment3;
    }

    @JsonProperty("generalLedgerSegment3")
    public void setGeneralLedgerSegment3(GeneralLedgerSegment3 generalLedgerSegment3) {
        this.generalLedgerSegment3 = generalLedgerSegment3;
    }

    @JsonProperty("generalLedgerSegment4")
    public GeneralLedgerSegment4 getGeneralLedgerSegment4() {
        return generalLedgerSegment4;
    }

    @JsonProperty("generalLedgerSegment4")
    public void setGeneralLedgerSegment4(GeneralLedgerSegment4 generalLedgerSegment4) {
        this.generalLedgerSegment4 = generalLedgerSegment4;
    }

    @JsonProperty("generalLedgerSegment5")
    public GeneralLedgerSegment5 getGeneralLedgerSegment5() {
        return generalLedgerSegment5;
    }

    @JsonProperty("generalLedgerSegment5")
    public void setGeneralLedgerSegment5(GeneralLedgerSegment5 generalLedgerSegment5) {
        this.generalLedgerSegment5 = generalLedgerSegment5;
    }

    @JsonProperty("generalLedgerServiceCode")
    public GeneralLedgerServiceCode getGeneralLedgerServiceCode() {
        return generalLedgerServiceCode;
    }

    @JsonProperty("generalLedgerServiceCode")
    public void setGeneralLedgerServiceCode(GeneralLedgerServiceCode generalLedgerServiceCode) {
        this.generalLedgerServiceCode = generalLedgerServiceCode;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }


    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("generalLedgerBillAccount")
    public GeneralLedgerAccount getGeneralLedgerBillAccount() {
        return generalLedgerBillAccount;
    }

    @JsonProperty("generalLedgerBillAccount")
    public void setGeneralLedgerBillAccount(GeneralLedgerAccount generalLedgerBillAccount) {
        this.generalLedgerBillAccount = generalLedgerBillAccount;
    }

    @JsonProperty("generalLedgerPayAccount")
    public GeneralLedgerAccount getGeneralLedgerPayAccount() {
        return generalLedgerPayAccount;
    }

    @JsonProperty("generalLedgerPayAccount")
    public void setGeneralLedgerPayAccount(GeneralLedgerAccount generalLedgerPayAccount) {
        this.generalLedgerPayAccount = generalLedgerPayAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EarnCode earnCode = (EarnCode) o;
        return Objects.equals(id, earnCode.id) &&
            Objects.equals(dateAdded, earnCode.dateAdded) &&
            Objects.equals(dateLastModified, earnCode.dateLastModified) &&
            Objects.equals(description, earnCode.description) &&
            Objects.equals(earnCodeGroup, earnCode.earnCodeGroup) &&
            Objects.equals(earnCodeTypeLookup, earnCode.earnCodeTypeLookup) &&
            Objects.equals(code, earnCode.code) &&
            Objects.equals(externalID, earnCode.externalID) &&
            Objects.equals(owner, earnCode.owner) &&
            Objects.equals(title, earnCode.title) &&
            Objects.equals(generalLedgerServiceCode, earnCode.generalLedgerServiceCode) &&
            Objects.equals(generalLedgerBillAccount, earnCode.generalLedgerBillAccount) &&
            Objects.equals(generalLedgerPayAccount, earnCode.generalLedgerPayAccount) &&
            Objects.equals(generalLedgerSegment1, earnCode.generalLedgerSegment1) &&
            Objects.equals(generalLedgerSegment2, earnCode.generalLedgerSegment2) &&
            Objects.equals(generalLedgerSegment3, earnCode.generalLedgerSegment3) &&
            Objects.equals(generalLedgerSegment4, earnCode.generalLedgerSegment4) &&
            Objects.equals(generalLedgerSegment5, earnCode.generalLedgerSegment5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, dateAdded, dateLastModified, description, earnCodeGroup, earnCodeTypeLookup, code, externalID, owner, title, generalLedgerServiceCode, generalLedgerBillAccount, generalLedgerPayAccount, generalLedgerSegment1, generalLedgerSegment2, generalLedgerSegment3, generalLedgerSegment4, generalLedgerSegment5);
    }

    @Override
    public String toString() {
        return "EarnCode{" +
            "id=" + id +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", description='" + description + '\'' +
            ", earnCodeGroup=" + earnCodeGroup +
            ", earnCodeTypeLookup=" + earnCodeTypeLookup +
            ", code='" + code + '\'' +
            ", externalID='" + externalID + '\'' +
            ", owner=" + owner +
            ", title='" + title + '\'' +
            ", generalLedgerServiceCode=" + generalLedgerServiceCode +
            ", generalLedgerBillAccount=" + generalLedgerBillAccount +
            ", generalLedgerPayAccount=" + generalLedgerPayAccount +
            ", generalLedgerSegment1=" + generalLedgerSegment1 +
            ", generalLedgerSegment2=" + generalLedgerSegment2 +
            ", generalLedgerSegment3=" + generalLedgerSegment3 +
            ", generalLedgerSegment4=" + generalLedgerSegment4 +
            ", generalLedgerSegment5=" + generalLedgerSegment5 +
            '}';
    }
}
