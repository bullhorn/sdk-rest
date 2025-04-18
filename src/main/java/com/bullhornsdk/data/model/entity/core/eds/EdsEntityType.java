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
@JsonPropertyOrder({"id", "sourceSystem", "edsData", "edsEntityTypeSchemaVersions", "name", "display", "isPrivate", "enabled" })
@Data
@EqualsAndHashCode(callSuper = false)
public class EdsEntityType implements QueryEntity, UpdateEntity, CreateEntity {

    @Getter(onMethod_ = @Override)
    @Setter(onMethod_ = @Override)
    private Integer id;

    private EdsSourceSystem sourceSystem;

    @JsonSerialize(using = RestOneToManySerializer.class)
    private OneToMany<EdsData> edsData;

    @JsonSerialize(using = RestOneToManySerializer.class)
    private OneToMany<EdsEntityTypeSchemaVersion> edsEntityTypeSchemaVersions;

    private String name;

    private String display;

    private Boolean isPrivate;

    private Boolean enabled;
}
