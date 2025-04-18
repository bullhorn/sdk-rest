package com.bullhornsdk.data.model.entity.core.eds;

import com.bullhornsdk.data.api.helper.RestOneToManySerializer;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "name", "display", "edsEntityTypes", "enabled", "sourceSystemType"})
@Data
@EqualsAndHashCode(callSuper = false)
public class EdsSourceSystem implements QueryEntity, UpdateEntity, CreateEntity {

    @Getter(onMethod_ = @Override)
    @Setter(onMethod_ = @Override)
    private Integer id;

    private String name;

    private String display;

    @JsonSerialize(using = RestOneToManySerializer.class)
    private OneToMany<EdsEntityType> edsEntityTypes;

    private Boolean enabled;

    private SourceSystemTypeLookup sourceSystemType;
}
