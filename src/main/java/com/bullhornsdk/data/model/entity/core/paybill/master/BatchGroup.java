package com.bullhornsdk.data.model.entity.core.paybill.master;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.util.Objects;

/**
 * Created by mkesmetzis 22-Apr-20
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "dateAdded"})
public class BatchGroup extends AbstractEntity implements QueryEntity {

    private Integer id;

    private DateTime dateAdded;


    public BatchGroup() {
    }

    public BatchGroup(Integer id) {
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

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "BatchGroup{" +
            "id=" + id +
            ", dateAdded=" + dateAdded +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BatchGroup that = (BatchGroup) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(dateAdded, that.dateAdded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateAdded);
    }
}
