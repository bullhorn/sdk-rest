package com.bullhornsdk.data.model.entity.core.certificationrequirement.optionslookup;

import java.util.Objects;

import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SpecializedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by mkesmetzis 22-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "label", "isDeleted", "description", "isSystem", "isHidden", "shouldShowInPicker", "isSystem",
    "dateAdded", "dateLastModified", "modifiedByUser"})
public class CertificationRequirementStatusLookup extends SpecializedOptionsLookup implements QueryEntity {

    public CertificationRequirementStatusLookup() {
        super();
    }

    @Override
    public String toString() {
        return "CertificationRequirementStatusLookup{}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}
