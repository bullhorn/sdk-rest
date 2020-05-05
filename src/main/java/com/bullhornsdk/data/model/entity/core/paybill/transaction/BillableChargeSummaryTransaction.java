package com.bullhornsdk.data.model.entity.core.paybill.transaction;

import com.bullhornsdk.data.model.entity.core.paybill.Location;
import com.bullhornsdk.data.model.entity.core.paybill.charge.BillableCharge;
import com.bullhornsdk.data.model.entity.core.paybill.master.BillMaster;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Objects;

/**
 * Created by mkesmetzis 22-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "amount", "billMaster", "billableCharge", "billingSyncBatch",
    "currencyUnit", "earnCode", "location", "quantity", "rate", "transactionDate", "unitOfMeasure"})
public class BillableChargeSummaryTransaction extends AbstractTransaction implements QueryEntity {

    private BillMaster billMasters;
    private BillableCharge billableCharge;
    private Location location;

    public BillableChargeSummaryTransaction() {

    }

    public BillableChargeSummaryTransaction(Integer id) {
        super(id);
    }


    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("billMasters")
    public BillMaster getBillMasters() {
        return billMasters;
    }

    @JsonProperty("billMasters")
    public void setBillMasters(BillMaster billMasters) {
        this.billMasters = billMasters;
    }

    @JsonProperty("billableCharge")
    public BillableCharge getBillableCharge() {
        return billableCharge;
    }

    @JsonProperty("billableCharge")
    public void setBillableCharge(BillableCharge billableCharge) {
        this.billableCharge = billableCharge;
    }

    @Override
    public String toString() {
        return "BillableChargeSummaryTransaction{" +
            "billMasters=" + billMasters +
            ", billableCharge=" + billableCharge +
            ", location=" + location +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BillableChargeSummaryTransaction that = (BillableChargeSummaryTransaction) o;
        return Objects.equals(billMasters, that.billMasters) &&
            Objects.equals(billableCharge, that.billableCharge) &&
            Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), billMasters, billableCharge, location);
    }


}
