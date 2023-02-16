package com.bullhornsdk.data.model.parameter.standard;

import java.util.LinkedHashMap;
import java.util.Map;

import com.bullhornsdk.data.model.parameter.ResumeAsNewEntityParams;

public class StandardResumeAsNewEntityParams implements ResumeAsNewEntityParams {

    private String entityType;
    private Boolean duplicateCheckOnName;
    private Integer ownerID;
    private Integer categoryID;
    private String status;
    private String externalID;

    private StandardResumeAsNewEntityParams() {
        setEntityType("Candidate");
        setDuplicateCheckOnName(false);
    }

    public static ResumeAsNewEntityParams getInstance() {
        StandardResumeAsNewEntityParams params = new StandardResumeAsNewEntityParams();

        return params;
    }

    @Override
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @Override
    public void setDuplicateCheckOnName(Boolean duplicateCheckOnName) {
        this.duplicateCheckOnName = duplicateCheckOnName;
    }

    @Override
    public void setOwnerID(Integer ownerID) {
        this.ownerID = ownerID;
    }

    @Override
    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    @Override
    public String getUrlString() {
        StringBuilder url = new StringBuilder();

        if (entityType != null) {
            url.append("&entityType={entityType}");
        }
        if (duplicateCheckOnName != null) {
            url.append("&duplicateCheckOnName={duplicateCheckOnName}");
        }
        if (ownerID != null) {
            url.append("&ownerID={ownerID}");
        }
        if (categoryID != null) {
            url.append("&categoryID={categoryID}");
        }
        if (status != null) {
            url.append("&status={status}");
        }
        if (externalID != null) {
            url.append("&externalID={externalID}");
        }

        return url.toString();
    }

    @Override
    public Map<String, String> getParameterMap() {
        Map<String, String> uriVariables = new LinkedHashMap<String, String>();

        if (entityType != null) {
            uriVariables.put("entityType", entityType);
        }
        if (duplicateCheckOnName != null) {
            uriVariables.put("duplicateCheckOnName", duplicateCheckOnName.toString());
        }
        if (ownerID != null) {
            uriVariables.put("ownerID", ownerID.toString());
        }
        if (categoryID != null) {
            uriVariables.put("categoryID", categoryID.toString());
        }
        if (status != null) {
            uriVariables.put("status", status);
        }
        if (externalID != null) {
            uriVariables.put("externalID", externalID);
        }

        return uriVariables;
    }
}
