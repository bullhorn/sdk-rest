package com.bullhornsdk.data.model.parameter;

public interface ResumeAsNewEntityParams extends RequestParameters {

    void setEntityType(String entityType);

    void setDuplicateCheckOnName(Boolean duplicateCheckOnName);

    void setOwnerID(Integer ownerID);

    void setCategoryID(Integer categoryID);

    void setStatus(String status);

    void setExternalID(String externalID);
}
