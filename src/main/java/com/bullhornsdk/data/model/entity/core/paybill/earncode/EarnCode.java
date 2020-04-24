package com.bullhornsdk.data.model.entity.core.paybill.earncode;

import com.bullhornsdk.data.model.entity.core.paybill.GeneralLedgerAccount;
import com.bullhornsdk.data.model.entity.core.paybill.chartofaccounts.*;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsA;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;

/**
 * Created by mkesmetzis 23-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "code", "customDate1", "customDate2", "customDate3", "customFloat1", "customFloat2", "customFloat3",
    "customInt1", "customInt2", "customInt3", "customText1", "customText10", "customText11", "customText12", "customText13",
    "customText14", "customText15", "customText16", "customText17", "customText18", "customText19", "customText2",
    "customText20", "customText3", "customText4", "customText5", "customText6", "customText7", "customText8", "customText9",
    "dateAdded", "dateLastModified", "description", "earnCodeGroup", "earnCodeTypeLookup", "externalID", "isDeleted",
    "owner", "status", "title", "generalLedgerServiceCode", "generalLedgerBillAccount", "generalLedgerPayAccount",
    "generalLedgerSegment1", "generalLedgerSegment2", "generalLedgerSegment3", "generalLedgerSegment4", "generalLedgerSegment5"})
public class EarnCode extends CustomFieldsA implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity, EditHistoryEntity {

    private Integer id;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    @JsonIgnore
    private String description;
    private SimplifiedOptionsLookup earnCodeGroup;
    private SimplifiedOptionsLookup earnCodeTypeLookup;
    @Size(max = 100)
    private String code;
    private String externalID;
    private Boolean isDeleted;
    private CorporateUser owner;
    @Size(max = 100)
    private String status;
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

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
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
    public SimplifiedOptionsLookup getEarnCodeGroup() {
        return earnCodeGroup;
    }

    @JsonProperty("earnCodeGroup")
    public void setEarnCodeGroup(SimplifiedOptionsLookup earnCodeGroup) {
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

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
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
}
