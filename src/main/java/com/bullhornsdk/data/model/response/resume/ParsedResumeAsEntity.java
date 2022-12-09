package com.bullhornsdk.data.model.response.resume;

import java.util.Set;

public interface ParsedResumeAsEntity {

    String getEntityName();

    void setEntityName(String entityName);

    Boolean getIsSuccess();

    void setIsSuccess(Boolean success);

    Integer getEntityId();

    void setEntityId(Integer entityId);

    Boolean getIsDuplicate();

    void setIsDuplicate(Boolean isDuplicate);

    Set<Integer> getDuplicateEntityIds();

    void setDuplicateEntityIds(Set<Integer> duplicateEntityIds);

    String getErrorMessage();

    void setErrorMessage(String errorMessage);
}
