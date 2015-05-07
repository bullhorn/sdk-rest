package com.bullhornsdk.data.model.parameter.standard;

import java.util.LinkedHashMap;
import java.util.Map;

import com.bullhornsdk.data.model.enums.FileContentType;
import com.bullhornsdk.data.model.parameter.FileParams;

public class StandardFileParams implements FileParams {

    private FileContentType fileContentType;

    private String description;

    private String type;
    
    private final String fileType; 
  
    
    private StandardFileParams() {
        super();
        this.fileContentType = FileContentType.DOC;
        this.description = "";
        this.type = "Resume";
        this.fileType = "SAMPLE";//should always be SAMPLE according to bh rest docs.
    }

    public static StandardFileParams getInstance() {
        StandardFileParams params = new StandardFileParams();

        return params;
    }

    @Override
    public String getUrlString() {
        StringBuilder url = new StringBuilder();

        if (fileContentType != null) {
            url.append("&contentType={contentType}");
        }
        if (description != null) {
            url.append("&description={description}");
        }
        if (type != null) {
            url.append("&type={type}");
        }
        if (fileType != null) {
            url.append("&fileType={fileType}");
        }

        return url.toString();
    }

    @Override
    public Map<String, String> getParameterMap() {
        Map<String, String> uriVariables = new LinkedHashMap<String, String>();

        if (fileContentType != null) {
            uriVariables.put("contentType", fileContentType.getMimeType());
        }
        if (description != null) {
            uriVariables.put("description", description);
        }
        if (type != null) {
            uriVariables.put("type", type);
        }
        if (fileType != null) {
            uriVariables.put("fileType", fileType);
        }

        return uriVariables;
    }

    @Override
    public void setContentType(FileContentType fileContentType) {
        this.fileContentType = fileContentType;

    }

    @Override
    public void setDescription(String description) {
        this.description = description;

    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
    
    

}
