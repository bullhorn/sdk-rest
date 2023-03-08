package com.bullhornsdk.data.model.entity.file;

import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
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
    "name",
    "opportunity",
    "type",
    "usersSharedWith",
    "uuid",
    "isEncrypted"
})
public class OpportunityFileAttachment extends EntityFileAttachment {

    private Opportunity opportunity;

    @JsonProperty("opportunity")
    public Opportunity getOpportunity() {
        return opportunity;
    }

    @JsonProperty("opportunity")
    public void setOpportunity(Opportunity opportunity) {
        this.opportunity = opportunity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        OpportunityFileAttachment that = (OpportunityFileAttachment) o;

        return opportunity != null ? opportunity.equals(that.opportunity) : that.opportunity == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (opportunity != null ? opportunity.hashCode() : 0);
        return result;
    }
}
