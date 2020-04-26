package com.bullhornsdk.data.model.entity.core.paybill.transaction;

import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Objects;

/**
 * Created by mkesmetzis 21-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "name"})
public class TransactionType implements QueryEntity {

    private Integer id;
    private String name;

    public TransactionType() {
    }

    public TransactionType(Integer id) {
        this.id = id;
    }

    public TransactionType(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "TransactionType{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionType that = (TransactionType) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
