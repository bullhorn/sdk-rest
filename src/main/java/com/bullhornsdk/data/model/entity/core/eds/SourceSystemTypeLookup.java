package com.bullhornsdk.data.model.entity.core.eds;

import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "label", "description", "isDeleted"})
@Data
@EqualsAndHashCode(callSuper = false)
public class SourceSystemTypeLookup implements QueryEntity {

    @Getter(onMethod_ = @Override)
    @Setter(onMethod_ = @Override)
    private Integer id;

    private String description;

    private String display;

    private Boolean isDeleted;

}
