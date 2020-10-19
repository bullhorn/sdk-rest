package com.bullhornsdk.data.model.entity.core.paybill.detail;

import com.bullhornsdk.data.model.entity.core.paybill.rate.BillMasterTransactionSurchargeRate;
import com.bullhornsdk.data.model.entity.core.paybill.rate.SurchargeRate;
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
@JsonPropertyOrder({"id", "amount", "billMasterTransactionSurchargeRates", "dateAdded", "rate", "surchargeRate", "title"
})
public class BillMasterTransactionSurchargeDetail extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity {

    private Integer id;
    private BigDecimal amount;
    private OneToMany<BillMasterTransactionSurchargeRate> billMasterTransactionSurchargeRates;
    private DateTime dateAdded;
    private BigDecimal rate;
    private SurchargeRate surchargeRate;
    private String title;

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

    @JsonProperty("billMasterTransactionSurchargeRates")
    public OneToMany<BillMasterTransactionSurchargeRate> getBillMasterTransactionSurchargeRates() {
        return billMasterTransactionSurchargeRates;
    }

    @JsonProperty("billMasterTransactionSurchargeRates")
    public void setBillMasterTransactionSurchargeRates(OneToMany<BillMasterTransactionSurchargeRate> billMasterTransactionSurchargeRates) {
        this.billMasterTransactionSurchargeRates = billMasterTransactionSurchargeRates;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("rate")
    public BigDecimal getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @JsonProperty("surchargeRate")
    public SurchargeRate getSurchargeRate() {
        return surchargeRate;
    }

    @JsonProperty("surchargeRate")
    public void setSurchargeRate(SurchargeRate surchargeRate) {
        this.surchargeRate = surchargeRate;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillMasterTransactionSurchargeDetail that = (BillMasterTransactionSurchargeDetail) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(amount, that.amount) &&
            Objects.equals(billMasterTransactionSurchargeRates, that.billMasterTransactionSurchargeRates) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(rate, that.rate) &&
            Objects.equals(surchargeRate, that.surchargeRate) &&
            Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, billMasterTransactionSurchargeRates, dateAdded, rate, surchargeRate, title);
    }

    @Override
    public String toString() {
        return "BillMasterTransactionSurchargeDetail{" +
            "id=" + id +
            ", amount=" + amount +
            ", billMasterTransactionSurchargeRates=" + billMasterTransactionSurchargeRates +
            ", dateAdded=" + dateAdded +
            ", rate=" + rate +
            ", surchargeRate=" + surchargeRate +
            ", title='" + title + '\'' +
            '}';
    }
}
