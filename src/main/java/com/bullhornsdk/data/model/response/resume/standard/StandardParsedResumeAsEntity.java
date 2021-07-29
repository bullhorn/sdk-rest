package com.bullhornsdk.data.model.response.resume.standard;

import java.util.Set;

import com.bullhornsdk.data.model.response.resume.ParsedResumeAsEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
public class StandardParsedResumeAsEntity implements ParsedResumeAsEntity {

    private String entityType;
    private Boolean isSuccess;
    private Integer entityId;
    private Boolean isDuplicate;
    private Set<Integer> duplicateEntityIds;
    private String errorMessage;

    @Override
    @JsonProperty("entityName")
    public String getEntityName() {
        return entityType;
    }

    @Override
    public void setEntityName(String entityType) {
        this.entityType = entityType;
    }

    @Override
    @JsonProperty("success")
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    @Override
    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    @Override
    @JsonProperty("id")
    public Integer getEntityId() {
        return entityId;
    }

    @Override
    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    @Override
    @JsonProperty("duplicate")
    public Boolean getIsDuplicate() {
        return isDuplicate;
    }

    @Override
    public void setIsDuplicate(Boolean isDuplicate) {
        this.isDuplicate = isDuplicate;
    }

    @Override
    @JsonProperty("duplicates")
    public Set<Integer> getDuplicateEntityIds() {
        return duplicateEntityIds;
    }

    @Override
    public void setDuplicateEntityIds(Set<Integer> duplicateEntityIds) {
        this.duplicateEntityIds = duplicateEntityIds;
    }

    @Override
    @JsonProperty("errorMessage")
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
