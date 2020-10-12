package com.bullhornsdk.data.model.entity.core.paybill.detail;

import com.bullhornsdk.data.model.entity.core.paybill.rate.BillMasterTransactionSalesTaxRate;
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
@JsonPropertyOrder({"id", "billMasterTransactionSalesTaxRates", "dateAdded", "jurisdictionName", "rate"
})
public class BillMasterTransactionSalesTaxDetail extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {

    private Integer id;
    private OneToMany<BillMasterTransactionSalesTaxRate> billMasterTransactionSalesTaxRates;
    private DateTime dateAdded;
    private String jurisdictionName;
    private BigDecimal rate;

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

    @JsonProperty("billMasterTransactionSalesTaxRates")
    public OneToMany<BillMasterTransactionSalesTaxRate> getBillMasterTransactionSalesTaxRates() {
        return billMasterTransactionSalesTaxRates;
    }

    @JsonProperty("billMasterTransactionSalesTaxRates")
    public void setBillMasterTransactionSalesTaxRates(OneToMany<BillMasterTransactionSalesTaxRate> billMasterTransactionSalesTaxRates) {
        this.billMasterTransactionSalesTaxRates = billMasterTransactionSalesTaxRates;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("jurisdictionName")
    public String getJurisdictionName() {
        return jurisdictionName;
    }

    @JsonProperty("jurisdictionName")
    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
    }

    @JsonProperty("rate")
    public BigDecimal getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillMasterTransactionSalesTaxDetail that = (BillMasterTransactionSalesTaxDetail) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(billMasterTransactionSalesTaxRates, that.billMasterTransactionSalesTaxRates) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(jurisdictionName, that.jurisdictionName) &&
            Objects.equals(rate, that.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, billMasterTransactionSalesTaxRates, dateAdded, jurisdictionName, rate);
    }

    @Override
    public String toString() {
        return "BillMasterTransactionSalesTaxDetail{" +
            "id=" + id +
            ", billMasterTransactionSalesTaxRates=" + billMasterTransactionSalesTaxRates +
            ", dateAdded=" + dateAdded +
            ", jurisdictionName='" + jurisdictionName + '\'' +
            ", rate=" + rate +
            '}';
    }
}
