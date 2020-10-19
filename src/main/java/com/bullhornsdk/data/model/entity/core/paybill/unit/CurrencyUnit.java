package com.bullhornsdk.data.model.entity.core.paybill.unit;

import com.bullhornsdk.data.model.entity.core.type.EditHistoryEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created by fayranne.lipton 4/8/2020
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "name", "alphabeticCode", "numericCode", "minorUnits" })
public class CurrencyUnit implements QueryEntity, EditHistoryEntity {

    private Integer id;

    @Size(max = 3)
    private String alphabeticCode;

    @Size(max = 100)
    private String name;

    private Integer numericCode;

    private Integer minorUnits;

    public CurrencyUnit() {
        super();
    }

    public CurrencyUnit(Integer id) {
        super();
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("alphabeticCode")
    public String getAlphabeticCode() {
        return alphabeticCode;
    }

    @JsonProperty("alphabeticCode")
    public void setAlphabeticCode(String alphabeticCode) {
        this.alphabeticCode = alphabeticCode;
    }

    @JsonProperty("numericCode")
    public Integer getNumericCode() {
        return numericCode;
    }

    @JsonProperty("numericCode")
    public void setNumericCode(Integer numericCode) {
        this.numericCode = numericCode;
    }

    @JsonProperty("minorUnits")
    public Integer getMinorUnits() {
        return minorUnits;
    }

    @JsonProperty("minorUnits")
    public void setMinorUnits(Integer minorUnits) {
        this.minorUnits = minorUnits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyUnit that = (CurrencyUnit) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(name, that.name) &&
            Objects.equals(alphabeticCode, that.alphabeticCode) &&
            Objects.equals(numericCode, that.numericCode) &&
            Objects.equals(minorUnits, that.minorUnits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, alphabeticCode, numericCode, minorUnits);
    }

    @Override
    public String toString() {
        return "CurrencyUnit{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", alphabeticCode='" + alphabeticCode + '\'' +
            ", numericCode=" + numericCode +
            ", minorUnits=" + minorUnits +
            '}';
    }
}
