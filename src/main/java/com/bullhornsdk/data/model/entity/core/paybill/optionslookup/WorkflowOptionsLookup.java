package com.bullhornsdk.data.model.entity.core.paybill.optionslookup;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Objects;

/**
 * Created by mkesmetzis 22-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "label", "isDeleted", "description", "isSystem", "isHidden", "shouldShowInPicker", "isSystem",
    "dateAdded", "dateLastModified", "modifiedByUser", "workflowOrder", "isDownstreamOnly", "canBypass"})
public class WorkflowOptionsLookup extends SpecializedOptionsLookup {

    private Integer workflowOrder;
    private Boolean isDownstreamOnly;
    private Boolean canBypass;

    public WorkflowOptionsLookup() {
        super();
        this.canBypass = Boolean.TRUE;
        this.isDownstreamOnly = Boolean.FALSE;
        this.workflowOrder = 0;
    }

    @JsonProperty("workflowOrder")
    public Integer getWorkflowOrder() {
        return workflowOrder;
    }

    @JsonProperty("workflowOrder")
    public void setWorkflowOrder(Integer workflowOrder) {
        this.workflowOrder = workflowOrder;
    }

    @JsonProperty("isDownstreamOnly")
    public Boolean getDownstreamOnly() {
        return isDownstreamOnly;
    }

    @JsonProperty("isDownstreamOnly")
    public void setDownstreamOnly(Boolean downstreamOnly) {
        isDownstreamOnly = downstreamOnly;
    }

    @JsonProperty("canBypass")
    public Boolean getCanBypass() {
        return canBypass;
    }

    @JsonProperty("canBypass")
    public void setCanBypass(Boolean canBypass) {
        this.canBypass = canBypass;
    }

    @Override
    public String toString() {
        return "WorkflowOptionsLookup{" +
            "workflowOrder=" + workflowOrder +
            ", isDownstreamOnly=" + isDownstreamOnly +
            ", canBypass=" + canBypass +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WorkflowOptionsLookup that = (WorkflowOptionsLookup) o;
        return Objects.equals(workflowOrder, that.workflowOrder) &&
            Objects.equals(isDownstreamOnly, that.isDownstreamOnly) &&
            Objects.equals(canBypass, that.canBypass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), workflowOrder, isDownstreamOnly, canBypass);
    }
}
