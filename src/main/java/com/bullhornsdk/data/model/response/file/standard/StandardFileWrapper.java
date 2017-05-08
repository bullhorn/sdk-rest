package com.bullhornsdk.data.model.response.file.standard;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.util.FileCopyUtils;

import com.bullhornsdk.data.model.response.file.FileContent;
import com.bullhornsdk.data.model.file.FileMeta;
import com.bullhornsdk.data.model.response.file.FileWrapper;

public final class StandardFileWrapper implements FileWrapper {

    private static Logger log = Logger.getLogger(StandardFileWrapper.class);

    private byte[] fileContentAsByteArray;

    private File file;

    private final String base64RawFileContent;

    private final Integer id;

    private final String type;

    private final String name;

    private final String description;

    private final String contentType;

    private final String contentSubType;

    private final String fileType;

    private final String externalID;

    private final DateTime dateAdded;

    private final String distribution;

    public StandardFileWrapper(FileContent fileContent, FileMeta fileMeta) {
        super();

        if (fileContent == null) {
            log.error("fileContent is null in StandardFileWrapper for filemeta.id=" + fileMeta.getId()
                    + ". This means there was an issue finding the file content using the bullhorn apis. The file could be lost");
            this.base64RawFileContent = null;
            this.contentType = null;
        } else {
            this.base64RawFileContent = fileContent.getFileContent();
            this.contentType = fileContent.getContentType();
        }

        this.id = fileMeta.getId();
        this.type = fileMeta.getType();
        this.name = fileMeta.getName();
        this.description = fileMeta.getDescription();

        this.contentSubType = fileMeta.getContentSubType();
        this.fileType = fileMeta.getFileType();
        this.externalID = fileMeta.getExternalID();
        this.dateAdded = fileMeta.getDateAdded();
        this.distribution = fileMeta.getDistribution();
    }

    @Override
    public byte[] getFileContentAsByteArray() {
        if (fileContentAsByteArray != null) {
            return fileContentAsByteArray.clone();
        }
        String base64RawFileContent = getBase64RawFileContent();
        if (base64RawFileContent == null) {
            return null;
        }

        fileContentAsByteArray = Base64.decodeBase64(base64RawFileContent);
        return fileContentAsByteArray.clone();
    }

    @Override
    public String getBase64RawFileContent() {
        if (base64RawFileContent == null) {
            log.error("base64RawFileContent is null in StandardFileWrapper for filemeta.id=" + id
                    + ". This means there was an issue finding the file content using the bullhorn apis. The file could be lost");
        }
        return base64RawFileContent;
    }

    @Override
    public File getFile() {
        if (file != null) {
            return file;
        }

        createTempFile();
        return file;
    }

    private void createTempFile() {
        try {
            String fileName = getFileName();
            String fileEnding = getFileEnding();

            File tempFile = File.createTempFile(fileName, fileEnding);
            tempFile.deleteOnExit();
            FileCopyUtils.copy(getFileContentAsByteArray(), tempFile);
            file = tempFile;
        } catch (IOException e) {
            log.error("Error while creating temp file: " + name, e);
        }

    }

    private String getFileName() {
        String fileName = StringUtils.substringBeforeLast(this.name, ".");
        if (fileName == null || fileName.isEmpty()) {
            return name;
        }
        return fileName;
    }

    private String getFileEnding() {
        String fileEnding = StringUtils.substringAfterLast(this.name, ".");
        if (fileEnding == null || fileEnding.isEmpty()) {
            return ".tmp";
        }
        return "." + fileEnding;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    @Override
    public String getContentSubType() {
        return contentSubType;
    }

    @Override
    public String getFileType() {
        return fileType;
    }

    @Override
    public String getExternalID() {
        return externalID;
    }

    @Override
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @Override
    public String getDistribution() {
        return distribution;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" {\nfileContentAsByteArray=");
        builder.append(Arrays.toString(fileContentAsByteArray));
        builder.append(", \nfile=");
        builder.append(file);
        builder.append(", \nbase64RawFileContent=");
        builder.append(base64RawFileContent);
        builder.append(", \nid=");
        builder.append(id);
        builder.append(", \ntype=");
        builder.append(type);
        builder.append(", \nname=");
        builder.append(name);
        builder.append(", \ndescription=");
        builder.append(description);
        builder.append(", \ncontentType=");
        builder.append(contentType);
        builder.append(", \ncontentSubType=");
        builder.append(contentSubType);
        builder.append(", \nfileType=");
        builder.append(fileType);
        builder.append(", \nexternalID=");
        builder.append(externalID);
        builder.append(", \ndateAdded=");
        builder.append(dateAdded);
        builder.append(", \ndistribution=");
        builder.append(distribution);
        builder.append("}");
        return builder.toString();
    }

}
