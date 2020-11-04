package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.paybill.master.BillMaster;
import com.bullhornsdk.data.model.entity.core.paybill.rate.DiscountRate;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "billMaster", "dateAdded", "discountRate", "owner"})
public class BillMasterDiscountRate extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity{

    private Integer id;

    private BillMaster billMaster;

    private DateTime dateAdded;

    private DiscountRate discountRate;

    private CorporateUser owner;

    @Override
    @JsonProperty("id")
    public Integer getId() { return id; }

    @Override
    @JsonProperty("id")
    public void setId(Integer id) { this.id = id; }

    @JsonProperty("billMaster")
    public BillMaster getBillMaster() { return billMaster; }

    @JsonProperty("billMaster")
    public void setBillMaster(BillMaster billMaster) { this.billMaster = billMaster; }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("discountRate")
    public DiscountRate getDiscountRate() { return discountRate; }

    @JsonProperty("discountRate")
    public void setDiscountRate(DiscountRate discountRate) { this.discountRate = discountRate; }

    @JsonProperty("owner")
    public CorporateUser getOwner() { return owner; }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) { this.owner = owner; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillMasterDiscountRate that = (BillMasterDiscountRate) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(billMaster, that.billMaster) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(discountRate, that.discountRate) &&
            Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, billMaster, dateAdded, discountRate, owner);
    }

    @Override
    public String toString() {
        return "BillMasterDiscountRate{" +
            "id=" + id +
            ", billMaster=" + billMaster +
            ", dateAdded=" + dateAdded +
            ", discountRate=" + discountRate +
            ", owner=" + owner +
            '}';
    }
}
