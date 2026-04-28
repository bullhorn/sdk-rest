package com.bullhornsdk.data.model.entity.core.paybill.optionslookup;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.EditHistoryEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Objects;

/**
 * DirectDepositAccountTypeLookup entity for Bullhorn CRM
 * Represents lookup values for direct deposit account types (Checking, Savings, Pay Card, etc.)
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "label", "isPayCard", "isDeleted"})
public class DirectDepositAccountTypeLookup extends AbstractEntity implements SoftDeleteEntity, EditHistoryEntity {

    private Integer id;

    private String label;

    private Boolean isPayCard;

    private Boolean isDeleted;

    public DirectDepositAccountTypeLookup() {
    }

    public DirectDepositAccountTypeLookup(Integer id) {
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

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("isPayCard")
    public Boolean getIsPayCard() {
        return isPayCard;
    }

    @JsonProperty("isPayCard")
    public void setIsPayCard(Boolean isPayCard) {
        this.isPayCard = isPayCard;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "DirectDepositAccountTypeLookup{" +
            "id=" + id +
            ", label='" + label + '\'' +
            ", isPayCard=" + isPayCard +
            ", isDeleted=" + isDeleted +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DirectDepositAccountTypeLookup that = (DirectDepositAccountTypeLookup) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(label, that.label) &&
            Objects.equals(isPayCard, that.isPayCard) &&
            Objects.equals(isDeleted, that.isDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, isPayCard, isDeleted);
    }
}
