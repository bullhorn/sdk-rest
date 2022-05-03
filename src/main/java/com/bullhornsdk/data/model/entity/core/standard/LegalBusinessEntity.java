package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "countryID", "dateAdded", "dateLastModified", "defaultCurrencyUnit",
    "isDeleted", "legalEntityNumber", "legalName", "shortName", "statusLookup"})
public class LegalBusinessEntity implements QueryEntity, UpdateEntity, CreateEntity {

    private Integer id;

    private Integer countryID;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    private CurrencyUnit defaultCurrencyUnit;

    private Boolean isDeleted;

    @Size(max = 200)
    private String legalEntityNumber;

    @Size(max = 200)
    private String legalName;

    @Size(max = 30)
    private String shortName;

    private SimplifiedOptionsLookup statusLookup;

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

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

    @JsonProperty("defaultCurrencyUnit")
    public CurrencyUnit getDefaultCurrencyUnit() {
        return defaultCurrencyUnit;
    }

    @JsonProperty("defaultCurrencyUnit")
    public void setDefaultCurrencyUnit(CurrencyUnit defaultCurrencyUnit) {
        this.defaultCurrencyUnit = defaultCurrencyUnit;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("legalEntityNumber")
    public String getLegalEntityNumber() {
        return legalEntityNumber;
    }

    @JsonProperty("legalEntityNumber")
    public void setLegalEntityNumber(String legalEntityNumber) {
        this.legalEntityNumber = legalEntityNumber;
    }

    @JsonProperty("legalName")
    public String getLegalName() {
        return legalName;
    }

    @JsonProperty("legalName")
    public void setLegalName(String legalName) {
        this.legalName = legalName;
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
        return Objects.equals(id, that.id)
            && Objects.equals(countryID, that.countryID)
            && Objects.equals(dateAdded, that.dateAdded)
            && Objects.equals(dateLastModified, that.dateLastModified)
            && Objects.equals(defaultCurrencyUnit, that.defaultCurrencyUnit)
            && Objects.equals(isDeleted, that.isDeleted)
            && Objects.equals(legalEntityNumber, that.legalEntityNumber)
            && Objects.equals(legalName, that.legalName)
            && Objects.equals(shortName, that.shortName)
            && Objects.equals(statusLookup, that.statusLookup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, countryID, dateAdded, dateLastModified, defaultCurrencyUnit,
            isDeleted, legalEntityNumber, legalName, shortName, statusLookup);
    }

    @Override
    public String toString() {
        return "LegalBusinessEntity{" +
            "id=" + id +
            ", countryID=" + countryID +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", defaultCurrencyUnit=" + defaultCurrencyUnit +
            ", isDeleted=" + isDeleted +
            ", legalEntityNumber='" + legalEntityNumber + '\'' +
            ", legalName='" + legalName + '\'' +
            ", shortName='" + shortName + '\'' +
            ", statusLookup=" + statusLookup +
            '}';
    }
}
