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
 * Created by mkesmetzis 22-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "label", "isDeleted"})
public class SimplifiedOptionsLookup extends AbstractEntity implements SoftDeleteEntity, EditHistoryEntity {

    private Integer id;

    private String label;

    private Boolean isDeleted;

    public SimplifiedOptionsLookup() {
    }

    public SimplifiedOptionsLookup(Integer id) {
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
        return "SimplifiedOptionsLookup{" +
            "id=" + id +
            ", label='" + label + '\'' +
            ", isDeleted=" + isDeleted +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimplifiedOptionsLookup that = (SimplifiedOptionsLookup) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(label, that.label) &&
            Objects.equals(isDeleted, that.isDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, isDeleted);
    }
}
