package com.bullhornsdk.data.model.entity.file;

import java.util.Objects;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateCertification;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by mkesmetzis 01-Apr-20
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({
    "id",
    "candidate",
    "candidateCertification",
    "contentSubType",
    "contentType",
    "dateAdded",
    "dateLastModified",
    "directory",
    "fileExtension",
    "fileOwner",
    "fileSize",
    "isEncrypted",
    "isExternal",
    "migrateGUID",
    "name",
    "type"
})
public class CertificationFileAttachment extends CommonFileAttachment implements CreateEntity, AssociationEntity {

    private Candidate candidate;
    private CandidateCertification candidateCertification;

    @JsonProperty("candidate")
    public Candidate getCandidate() {
        return candidate;
    }

    @JsonProperty("candidate")
    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @JsonProperty("candidateCertification")
    public CandidateCertification getCandidateCertification() {
        return candidateCertification;
    }

    @JsonProperty("candidateCertification")
    public void setCandidateCertification(CandidateCertification candidateCertification) {
        this.candidateCertification = candidateCertification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CertificationFileAttachment that = (CertificationFileAttachment) o;
        return Objects.equals(candidate, that.candidate) &&
            Objects.equals(candidateCertification, that.candidateCertification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), candidate, candidateCertification);
    }

}
