package com.bullhornsdk.data.model.entity.file;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
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
    "candidate",
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
    "name",
    "type",
    "usersSharedWith",
    "uuid"
})
public class CandidateFileAttachment extends EntityFileAttachment {

    private Candidate candidate;

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CandidateFileAttachment that = (CandidateFileAttachment) o;

        return candidate != null ? candidate.equals(that.candidate) : that.candidate == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (candidate != null ? candidate.hashCode() : 0);
        return result;
    }
}
