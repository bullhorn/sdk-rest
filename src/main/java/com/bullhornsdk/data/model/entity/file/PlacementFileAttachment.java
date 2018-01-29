package com.bullhornsdk.data.model.entity.file;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author Murray
 * @since 11/08/2017
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({
    "id",
    "contentSubType",
    "contentType",
    "dateAdded",
    "departmentsSharedWith",
    "description",
    "directory",
    "distribution",
    "externalID",
    "fileExtension",
    "fileOwner",
    "fileSize",
    "fileType",
    "isCopied",
    "isDeleted",
    "isExternal",
    "isOpen",
    "isPrivate",
    "isSendOut",
    "jobOrder",
    "name",
    "placement",
    "type",
    "user",
    "usersSharedWith",
    "uuid"
})
public class PlacementFileAttachment extends EntityFileAttachment {

    private JobOrder jobOrder;

    private Placement placement;

    private Candidate user;

    @JsonProperty("jobOrder")
    public JobOrder getJobOrder() {
        return jobOrder;
    }

    @JsonProperty("jobOrder")
    public void setJobOrder(JobOrder jobOrder) {
        this.jobOrder = jobOrder;
    }

    @JsonProperty("placement")
    public Placement getPlacement() {
        return placement;
    }

    @JsonProperty("placement")
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    @JsonProperty("user")
    public Candidate getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(Candidate user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PlacementFileAttachment that = (PlacementFileAttachment) o;

        return placement != null ? placement.equals(that.placement) : that.placement == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (placement != null ? placement.hashCode() : 0);
        return result;
    }
}
