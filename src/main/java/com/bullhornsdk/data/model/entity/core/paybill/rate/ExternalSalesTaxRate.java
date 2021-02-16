package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "dateAdded", "dateLastModified", "effectiveDate", "effectiveEndDate", "generalLedgerAccount",
    "jurisdictionName", "jurisdictionType", "label", "rate", "source", "stateID", "taxType", "versionID", "versions"
})
public class ExternalSalesTaxRate extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity,
    EffectiveDateEntity, AssociationEntity {

    private Integer id;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private String effectiveDate;
    private String effectiveEndDate;
    private String jurisdictionName;
    private SimplifiedOptionsLookup jurisdictionType;
    private String label;
    private BigDecimal rate;
    private SimplifiedOptionsLookup source;
    private Integer stateID;
    private SimplifiedOptionsLookup taxType;
    private Integer versionID;
    private OneToMany<ExternalSalesTaxRateVersion> versions;

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

    @ReadOnly
    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @ReadOnly
    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @Override
    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("effectiveEndDate")
    public String getEffectiveEndDate() {
        return effectiveEndDate;
    }

    @JsonProperty("effectiveEndDate")
    public void setEffectiveEndDate(String effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    @JsonProperty("jurisdictionName")
    public String getJurisdictionName() {
        return jurisdictionName;
    }

    @JsonProperty("jurisdictionName")
    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
    }

    @JsonProperty("jurisdictionType")
    public SimplifiedOptionsLookup getJurisdictionType() {
        return jurisdictionType;
    }

    @JsonProperty("jurisdictionType")
    public void setJurisdictionType(SimplifiedOptionsLookup jurisdictionType) {
        this.jurisdictionType = jurisdictionType;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("rate")
    public BigDecimal getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @JsonProperty("source")
    public SimplifiedOptionsLookup getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(SimplifiedOptionsLookup source) {
        this.source = source;
    }

    @JsonProperty("stateID")
    public Integer getStateID() {
        return stateID;
    }

    @JsonProperty("stateID")
    public void setStateID(Integer stateID) {
        this.stateID = stateID;
    }

    @JsonProperty("taxType")
    public SimplifiedOptionsLookup getTaxType() {
        return taxType;
    }

    @JsonProperty("taxType")
    public void setTaxType(SimplifiedOptionsLookup taxType) {
        this.taxType = taxType;
    }

    @JsonProperty("versionID")
    public Integer getVersionID() {
        return versionID;
    }

    @JsonProperty("versionID")
    public void setVersionID(Integer versionID) {
        this.versionID = versionID;
    }

    @JsonProperty("versions")
    public OneToMany<ExternalSalesTaxRateVersion> getVersions() {
        return versions;
    }

    @JsonProperty("versions")
    public void setVersions(OneToMany<ExternalSalesTaxRateVersion> versions) {
        this.versions = versions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExternalSalesTaxRate that = (ExternalSalesTaxRate) o;
        return Objects.equals(id, that.id) && Objects.equals(dateAdded, that.dateAdded) && Objects.equals(dateLastModified, that.dateLastModified) && Objects.equals(effectiveDate, that.effectiveDate) && Objects.equals(effectiveEndDate, that.effectiveEndDate) && Objects.equals(jurisdictionName, that.jurisdictionName) && Objects.equals(jurisdictionType, that.jurisdictionType) && Objects.equals(label, that.label) && Objects.equals(rate, that.rate) && Objects.equals(source, that.source) && Objects.equals(stateID, that.stateID) && Objects.equals(taxType, that.taxType) && Objects.equals(versionID, that.versionID) && Objects.equals(versions, that.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateAdded, dateLastModified, effectiveDate, effectiveEndDate, jurisdictionName, jurisdictionType, label, rate, source, stateID, taxType, versionID, versions);
    }

    @Override
    public String toString() {
        return "ExternalSalesTaxRate{" +
            "id=" + id +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", effectiveDate=" + effectiveDate +
            ", effectiveEndDate=" + effectiveEndDate +
            ", jurisdictionName='" + jurisdictionName + '\'' +
            ", jurisdictionType=" + jurisdictionType +
            ", label='" + label + '\'' +
            ", rate=" + rate +
            ", source=" + source +
            ", stateID=" + stateID +
            ", taxType=" + taxType +
            ", versionID=" + versionID +
            ", versions=" + versions +
            '}';
    }
}
