package com.bullhornsdk.data.model.entity.core.paybill.unit;

import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SpecializedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by mkesmetzis 22-Apr-20
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "label", "dateAdded", "dateLastModified", "description", "isDeleted", "isSystem",
    "isHidden", "shouldShowInPicker", "modifiedByUser"})
public class UnitOfMeasure extends SpecializedOptionsLookup implements QueryEntity {

    private Integer id;

    public UnitOfMeasure() {
        super();
    }

    public UnitOfMeasure(Integer id) {
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

}
