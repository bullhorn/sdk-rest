package com.bullhornsdk.data.model.entity.core.paybill.optionslookup;

import java.util.Objects;

import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by claude 2025
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "label", "isDeleted", "description", "isSystem", "isHidden", "shouldShowInPicker",
    "dateAdded", "dateLastModified", "modifiedByUser"})
public class DeliveryMethodLookup extends SpecializedOptionsLookup implements QueryEntity {

    public DeliveryMethodLookup() {
        super();
    }

    @Override
    public String toString() {
        return "DeliveryMethodLookup{}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}
