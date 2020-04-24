package com.bullhornsdk.data.model.entity.core.paybill.surcharge;

import com.bullhornsdk.data.model.entity.core.paybill.earncode.EarnCode;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * Created by mkesmetzis 24-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "addedByUser", "dateAdded", "earnCode", "label", "surchargeType", "value"})
public class Surcharge extends AbstractEntity implements QueryEntity {

    private Integer id;
    private CorporateUser addedByUser;
    private DateTime dateAdded;
    private EarnCode earnCode;
    @JsonIgnore
    private String label;
    private SurchargeType surchargeType;
    private BigDecimal value;

    public Surcharge() {
    }

    public Surcharge(Integer id) {
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

    @JsonProperty("surchargeType")
    public SurchargeType getSurchargeType() {
        return surchargeType;
    }

    @JsonProperty("surchargeType")
    public void setSurchargeType(SurchargeType surchargeType) {
        this.surchargeType = surchargeType;
    }

    @JsonProperty("value")
    public BigDecimal getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
