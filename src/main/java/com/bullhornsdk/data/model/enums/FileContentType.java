package com.bullhornsdk.data.model.enums;

public enum FileContentType {

    DOC("application/msword"),
    DOCX("application/vnd.openxmlformatsofficedocument.wordprocessingml.document"),
    HTML("text/html"),
    ODT("application/vnd.oasis.opendocument.text"),
    PDF("application/pdf"),
    RTF("application/rtf"),
    TXT("text/plain");
   
    private final String mimeType;

    private FileContentType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getMimeType() {
        return mimeType;
    }

}
