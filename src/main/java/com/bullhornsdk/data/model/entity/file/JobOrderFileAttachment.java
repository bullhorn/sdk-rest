package com.bullhornsdk.data.model.entity.file;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Person;
import com.fasterxml.jackson.annotation.JsonInclude;
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
    "description",
    "directory",
    "distribution",
    "externalID",
    "fileExtension",
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
    "type",
    "user",
    "usersSharedWith",
    "uuid"
})
public class JobOrderFileAttachment extends EntityFileAttachmentExtraFields {

    private JobOrder jobOrder;

    private Person user;

    public JobOrder getJobOrder() {
        return jobOrder;
    }

    public void setJobOrder(JobOrder jobOrder) {
        this.jobOrder = jobOrder;
    }

    public Person getUser() {
        return user;
    }

    public void setUser(Person user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        JobOrderFileAttachment that = (JobOrderFileAttachment) o;

        if (jobOrder != null ? !jobOrder.equals(that.jobOrder) : that.jobOrder != null) return false;
        return user != null ? user.equals(that.user) : that.user == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (jobOrder != null ? jobOrder.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
