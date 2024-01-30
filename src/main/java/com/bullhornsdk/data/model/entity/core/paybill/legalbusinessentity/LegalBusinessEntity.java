package com.bullhornsdk.data.model.entity.core.paybill.legalbusinessentity;

import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "countryID", "dateAdded", "dateLastModified", "currencyUnit", "isDeleted", "legalName", "legalEntityNumber", "shortName", "statusLookup"})
public class LegalBusinessEntity implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity, EditHistoryEntity {

    private Integer id;
    private Integer countryID;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private CurrencyUnit currencyUnit;
    private Boolean isDeleted;
    private String legalName;
    private String legalEntityNumber;
    private String shortName;
    private SimplifiedOptionsLookup statusLookup;

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

    @JsonProperty("countryID")
    public Integer getCountryID() {
        return countryID;
    }

    @JsonProperty("countryID")
    public void setCountryID(Integer countryID) {
        this.countryID = countryID;
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

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("currencyUnit")
    public CurrencyUnit getCurrencyUnit() {
        return currencyUnit;
    }

    @JsonProperty("currencyUnit")
    public void setCurrencyUnit(CurrencyUnit currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    @JsonProperty("isDeleted")
    public Boolean getDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @JsonProperty("legalName")
    public String getLegalName() {
        return legalName;
    }

    @JsonProperty("legalName")
    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    @JsonProperty("legalEntityNumber")
    public String getLegalEntityNumber() {
        return legalEntityNumber;
    }

    @JsonProperty("legalEntityNumber")
    public void setLegalEntityNumber(String legalEntityNumber) {
        this.legalEntityNumber = legalEntityNumber;
    }

    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("statusLookup")
    public SimplifiedOptionsLookup getStatusLookup() {
        return statusLookup;
    }

    @JsonProperty("statusLookup")
    public void setStatusLookup(SimplifiedOptionsLookup statusLookup) {
        this.statusLookup = statusLookup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LegalBusinessEntity that = (LegalBusinessEntity) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(countryID, that.countryID) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(currencyUnit, that.currencyUnit) &&
            Objects.equals(isDeleted, that.isDeleted) &&
            Objects.equals(legalName, that.legalName) &&
            Objects.equals(legalEntityNumber, that.legalEntityNumber) &&
            Objects.equals(shortName, that.shortName) &&
            Objects.equals(statusLookup, that.statusLookup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, countryID, dateAdded, dateLastModified, currencyUnit, isDeleted, legalName, legalEntityNumber, shortName, statusLookup);
    }
}
