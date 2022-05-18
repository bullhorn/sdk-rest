package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;

import org.joda.time.DateTime;

import java.util.Objects;

/**
 * Created by fayranne.lipton 4/8/2020
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "contentSubType", "contentType", "dateAdded", "dateLastModified", "description", "directory", "fileExtension", "fileOwner", "fileSize",
    "name", "type"})
public class InvoiceStatementTemplate implements QueryEntity, DateLastModifiedEntity {

    private Integer id;

    private String name;

    private String description;

    private String type;

    private String contentType;

    private String contentSubType;

    private String directory;

    private String fileExtension;

    private CorporateUser fileOwner;

    private Integer fileSize;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    public InvoiceStatementTemplate() {
    }

    public InvoiceStatementTemplate(Integer id) {
        this.id = id;
    }

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @ReadOnly
    @Override
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @JsonProperty("contentSubType")
    public String getContentSubType() {
        return contentSubType;
    }

    @JsonProperty("contentSubType")
    public void setContentSubType(String contentSubType) {
        this.contentSubType = contentSubType;
    }

    @JsonProperty("directory")
    public String getDirectory() {
        return directory;
    }

    @JsonProperty("directory")
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @JsonProperty("fileExtension")
    public String getFileExtension() {
        return fileExtension;
    }

    @JsonProperty("fileExtension")
    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    @JsonProperty("fileOwner")
    public CorporateUser getFileOwner() {
        return fileOwner;
    }

    @JsonProperty("fileOwner")
    public void setFileOwner(CorporateUser fileOwner) {
        this.fileOwner = fileOwner;
    }

    @JsonProperty("fileSize")
    public Integer getFileSize() {
        return fileSize;
    }

    @JsonProperty("fileSize")
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @ReadOnly
    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @ReadOnly
    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceStatementTemplate that = (InvoiceStatementTemplate) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(name, that.name) &&
            Objects.equals(description, that.description) &&
            Objects.equals(type, that.type) &&
            Objects.equals(contentType, that.contentType) &&
            Objects.equals(contentSubType, that.contentSubType) &&
            Objects.equals(directory, that.directory) &&
            Objects.equals(fileExtension, that.fileExtension) &&
            Objects.equals(fileOwner, that.fileOwner) &&
            Objects.equals(fileSize, that.fileSize) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, type, contentType, contentSubType,
            directory, fileExtension, fileOwner, fileSize, dateAdded, dateLastModified);
    }

    @Override
    public String toString() {
        return "InvoiceStatementTemplate{" +
            "id='" + id + '\'' +
            "name='" + name + '\'' +
            "description='" + description + '\'' +
            "type='" + type + '\'' +
            "contentType='" + contentType + '\'' +
            "contentSubType='" + contentSubType + '\'' +
            "directory='" + directory + '\'' +
            "fileExtension='" + fileExtension + '\'' +
            "fileOwner='" + fileOwner + '\'' +
            "fileSize='" + fileSize + '\'' +
            "dateAdded='" + dateAdded + '\'' +
            "dateLastModified='" + dateLastModified + '\'' +
            '}';
    }
}
