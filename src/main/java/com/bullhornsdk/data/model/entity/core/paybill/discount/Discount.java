package com.bullhornsdk.data.model.entity.core.paybill.discount;

import com.bullhornsdk.data.model.entity.core.paybill.AbstractType;
import com.bullhornsdk.data.model.entity.core.paybill.earncode.EarnCode;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by mkesmetzis 23-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "discountType", "earnCode", "label", "value", "dateAdded", "addedByUser"})
public class Discount implements QueryEntity {

    private Integer id;
    private AbstractType discountType;
    private EarnCode earnCode;
    @Size(max = 100)
    private String label;
    private BigDecimal value;
    private DateTime dateAdded;
    private CorporateUser addedByUser;

    public Discount() {
    }

    public Discount(Integer id) {
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

    @JsonProperty("discountType")
    public AbstractType getDiscountType() {
        return discountType;
    }

    @JsonProperty("discountType")
    public void setDiscountType(AbstractType discountType) {
        this.discountType = discountType;
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

    @JsonProperty("value")
    public BigDecimal getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("addedByUser")
    public CorporateUser getAddedByUser() {
        return addedByUser;
    }

    @JsonProperty("addedByUser")
    public void setAddedByUser(CorporateUser addedByUser) {
        this.addedByUser = addedByUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discount discount = (Discount) o;
        return Objects.equals(id, discount.id) &&
            Objects.equals(discountType, discount.discountType) &&
            Objects.equals(earnCode, discount.earnCode) &&
            Objects.equals(label, discount.label) &&
            Objects.equals(value, discount.value) &&
            Objects.equals(dateAdded, discount.dateAdded) &&
            Objects.equals(addedByUser, discount.addedByUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, discountType, earnCode, label, value, dateAdded, addedByUser);
    }

    @Override
    public String toString() {
        return "Discount{" +
            "id=" + id +
            ", discountType=" + discountType +
            ", earnCode=" + earnCode +
            ", label='" + label + '\'' +
            ", value=" + value +
            ", dateAdded=" + dateAdded +
            ", addedByUser=" + addedByUser +
            '}';
    }
}
