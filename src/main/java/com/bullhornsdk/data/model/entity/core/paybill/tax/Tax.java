package com.bullhornsdk.data.model.entity.core.paybill.tax;

import com.bullhornsdk.data.model.entity.core.paybill.AbstractType;
import com.bullhornsdk.data.model.entity.core.paybill.earncode.EarnCode;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by mkesmetzis 24-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "addedByUser", "dateAdded", "earnCode", "jurisdictionName", "jurisdictionType", "label", "taxType", "value"})
public class Tax extends AbstractEntity implements QueryEntity {

    private Integer id;
    private CorporateUser addedByUser;
    private DateTime dateAdded;
    private EarnCode earnCode;
    @JsonIgnore
    private String label;
    @JsonIgnore
    private String jurisdictionName;
    private SimplifiedOptionsLookup jurisdictionType;
    private AbstractType taxType;
    private BigDecimal value;

    public Tax() {
    }

    public Tax(Integer id) {
        this.id = id;
    }

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

    @JsonProperty("addedByUser")
    public CorporateUser getAddedByUser() {
        return addedByUser;
    }

    @JsonProperty("addedByUser")
    public void setAddedByUser(CorporateUser addedByUser) {
        this.addedByUser = addedByUser;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("earnCode")
    public EarnCode getEarnCode() {
        return earnCode;
    }

    @JsonProperty("earnCode")
    public void setEarnCode(EarnCode earnCode) {
        this.earnCode = earnCode;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
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

    @JsonProperty("taxType")
    public AbstractType getTaxType() {
        return taxType;
    }

    @JsonProperty("taxType")
    public void setTaxType(AbstractType taxType) {
        this.taxType = taxType;
    }

    @JsonProperty("value")
    public BigDecimal getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Tax{" +
            "id=" + id +
            ", addedByUser=" + addedByUser +
            ", dateAdded=" + dateAdded +
            ", earnCode=" + earnCode +
            ", label='" + label + '\'' +
            ", jurisdictionName='" + jurisdictionName + '\'' +
            ", jurisdictionType=" + jurisdictionType +
            ", taxType=" + taxType +
            ", value=" + value +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tax tax = (Tax) o;
        return Objects.equals(id, tax.id) &&
            Objects.equals(addedByUser, tax.addedByUser) &&
            Objects.equals(dateAdded, tax.dateAdded) &&
            Objects.equals(earnCode, tax.earnCode) &&
            Objects.equals(label, tax.label) &&
            Objects.equals(jurisdictionName, tax.jurisdictionName) &&
            Objects.equals(jurisdictionType, tax.jurisdictionType) &&
            Objects.equals(taxType, tax.taxType) &&
            Objects.equals(value, tax.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addedByUser, dateAdded, earnCode, label, jurisdictionName, jurisdictionType, taxType, value);
    }
}
