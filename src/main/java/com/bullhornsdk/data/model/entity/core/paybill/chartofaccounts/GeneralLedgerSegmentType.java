package com.bullhornsdk.data.model.entity.core.paybill.chartofaccounts;

import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.Size;

/**
 * Created by mkesmetzis 21-Apr-20
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "description", "isEnabled", "segmentType"})
public class GeneralLedgerSegmentType implements QueryEntity, UpdateEntity {

    private Integer id;

    @JsonIgnore
    @Size(max = 100)
    private String description;

    private Boolean isEnabled;

    @Size(max = 100)
    private String segmentType;

    public GeneralLedgerSegmentType(Integer id) {
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

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("isEnabled")
    public Boolean getEnabled() {
        return isEnabled;
    }

    @JsonProperty("isEnabled")
    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    @JsonProperty("segmentType")
    public String getSegmentType() {
        return segmentType;
    }

    @JsonProperty("segmentType")
    public void setSegmentType(String segmentType) {
        this.segmentType = segmentType;
    }
}
