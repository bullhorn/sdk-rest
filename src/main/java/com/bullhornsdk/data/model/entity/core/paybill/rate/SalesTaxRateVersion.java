package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.type.*;
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
@JsonPropertyOrder({"id", "amount", "dateAdded", "dateLastModified", "effectiveDate", "effectiveEndDate", "isFirst", "jurisdictionName",
    "label", "rate", "reportingCodeName", "source", "status", "taxType"
})
public class SalesTaxRateVersion extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity, EffectiveDateEntity {

    private Integer id;
    private BigDecimal amount;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private String effectiveDate;
    private String effectiveEndDate;
    private Boolean isFirst;
    private String jurisdictionName;
    private String label;
    private BigDecimal rate;
    private String reportingCodeName;
    private SimplifiedOptionsLookup source;
    private SimplifiedOptionsLookup status;
    private SimplifiedOptionsLookup taxType;

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

    @JsonProperty("amount")
    public BigDecimal getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    @JsonProperty("isFirst")
    public Boolean getIsFirst() {
        return isFirst;
    }

    @JsonProperty("isFirst")
    public void setIsFirst(Boolean isFirst) {
        this.isFirst = isFirst;
    }

    @JsonProperty("jurisdictionName")
    public String getJurisdictionName() {
        return jurisdictionName;
    }

    @JsonProperty("jurisdictionName")
    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
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

    @JsonProperty("reportingCodeName")
    public String getReportingCodeName() {
        return reportingCodeName;
    }

    @JsonProperty("reportingCodeName")
    public void setReportingCodeName(String reportingCodeName) {
        this.reportingCodeName = reportingCodeName;
    }

    @JsonProperty("source")
    public SimplifiedOptionsLookup getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(SimplifiedOptionsLookup source) {
        this.source = source;
    }

    @JsonProperty("status")
    public SimplifiedOptionsLookup getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(SimplifiedOptionsLookup status) {
        this.status = status;
    }

    @JsonProperty("taxType")
    public SimplifiedOptionsLookup getTaxType() {
        return taxType;
    }

    @JsonProperty("taxType")
    public void setTaxType(SimplifiedOptionsLookup taxType) {
        this.taxType = taxType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesTaxRateVersion that = (SalesTaxRateVersion) o;
        return Objects.equals(id, that.id) && Objects.equals(amount, that.amount) && Objects.equals(dateAdded, that.dateAdded) && Objects.equals(dateLastModified, that.dateLastModified) && Objects.equals(effectiveDate, that.effectiveDate) && Objects.equals(effectiveEndDate, that.effectiveEndDate) && Objects.equals(isFirst, that.isFirst) && Objects.equals(jurisdictionName, that.jurisdictionName) && Objects.equals(label, that.label) && Objects.equals(rate, that.rate) && Objects.equals(reportingCodeName, that.reportingCodeName) && Objects.equals(source, that.source) && Objects.equals(status, that.status) && Objects.equals(taxType, that.taxType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, dateAdded, dateLastModified, effectiveDate, effectiveEndDate, isFirst, jurisdictionName, label, rate, reportingCodeName, source, status, taxType);
    }

    @Override
    public String toString() {
        return "SalesTaxRateVersion{" +
            "id=" + id +
            ", amount=" + amount +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", effectiveDate=" + effectiveDate +
            ", effectiveEndDate=" + effectiveEndDate +
            ", isFirst=" + isFirst +
            ", jurisdictionName='" + jurisdictionName + '\'' +
            ", label='" + label + '\'' +
            ", rate=" + rate +
            ", reportingCodeName='" + reportingCodeName + '\'' +
            ", source=" + source +
            ", status=" + status +
            ", taxType=" + taxType +
            '}';
    }
}
