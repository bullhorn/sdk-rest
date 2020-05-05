package com.bullhornsdk.data.model.entity.core.paybill.transaction;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
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
public class TransactionStatus extends AbstractEntity implements QueryEntity {

    private Integer id;
    private String name;

    public TransactionStatus() {
    }

    public TransactionStatus(Integer id) {
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

    @Override
    public String toString() {
        return "TransactionStatus{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionStatus that = (TransactionStatus) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


//    enum KnownIds {
//        Pending(1),
//        Submitted(2),
//        PaymentApproved(3, "Payment Approved"),
//        Approved(4);
//
//        private TransactionStatus entity;
//
//        KnownIds(int id) {
//            this(id, null);
//        }
//
//        KnownIds(int id, String name) {
//            if (name == null) {
//                name = this.name();
//            }
//            this.entity = new TransactionStatus();
//            this.entity.setId(id);
//            this.entity.setName(name);
//        }
//
//        public int getId() {
//            return getEntity().getId();
//        }
//
//        public TransactionStatus getEntity() {
//            return entity;
//        }
//    }


}
