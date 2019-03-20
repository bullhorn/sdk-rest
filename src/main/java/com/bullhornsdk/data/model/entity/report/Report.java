//
// Generated Source.
//
// WARNING: DO NOT CHANGE THIS FILE. IT WILL BE OVERRIDDEN NEXT TIME IT IS GENERATED.
//
package com.bullhornsdk.data.model.entity.report;

import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.UserType;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Collection;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"category", "cognosType", "dashboard", "dateAdded", "dateLastModified",
    "description", "entitlements", "name", "oldReportID", "owner", "packageName", "path", "reportID",
    "reportJar", "reportRTF", "reportXML", "sqlData", "type", "version"})
public class Report extends AbstractEntity implements QueryEntity, BullhornEntity {

    private Integer reportID;

    private String name;

    private String description;

    private Category category;

    private String path;

    private String cognosType;

    private Integer version;

    private String packageName;

    private byte[] reportJar;

    private Collection<UserType> entitlements = new ArrayList<UserType>();

    private String reportXML;

    private CorporateUser owner;

    private Integer oldReportID;

    private String sqlData;

    private String reportRTF;

    private String type;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    public Integer getId() {
        return getReportID();
    }

    public void setId(Integer id){
        setReportID(id);
    }

    @JsonProperty("reportID")
    public Integer getReportID() {
        return this.reportID;
    }

    @JsonProperty("reportID")
    public void setReportID(Integer reportID) {
        this.reportID = reportID;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("category")
    public Category getCategory() {
        return this.category;
    }

    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonProperty("path")
    public String getPath() {
        return this.path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("cognosType")
    public String getCognosType() {
        return this.cognosType;
    }

    @JsonProperty("cognosType")
    public void setCognosType(String cognosType) {
        this.cognosType = cognosType;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return this.dateAdded;
    }

    @ReadOnly
    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @JsonProperty("version")
    public Integer getVersion() {
        return this.version;
    }

    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @ReadOnly
    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return this.dateLastModified;
    }

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("sqlData")
    public String getSqlData() {
        return this.sqlData;
    }

    @JsonProperty("sqlData")
    public void setSqlData(String sqlData) {
        this.sqlData = sqlData;
    }

    @JsonProperty("packageName")
    public String getPackageName() {
        return this.packageName;
    }

    @JsonProperty("packageName")
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    @JsonProperty("reportXML")
    public String getReportXML() {
        return this.reportXML;
    }

    @JsonProperty("reportXML")
    public void setReportXML(String reportXML) {
        this.reportXML = reportXML;
    }

    @JsonProperty("reportRTF")
    public String getReportRTF() {
        return this.reportRTF;
    }

    @JsonProperty("reportRTF")
    public void setReportRTF(String reportRTF) {
        this.reportRTF = reportRTF;
    }

    @JsonProperty("oldReportID")
    public Integer getOldReportID() {
        return this.oldReportID;
    }

    @JsonProperty("oldReportID")
    public void setOldReportID(Integer oldReportID) {
        this.oldReportID = oldReportID;
    }

    @JsonProperty("reportJar")
    public byte[] getReportJar() {
        return this.reportJar;
    }

    @JsonProperty("reportJar")
    public void setReportJar(byte[] reportJar) {
        this.reportJar = reportJar;
    }

    @JsonProperty("entitlements")
    public Collection<UserType> getEntitlements() {
        return entitlements;
    }

    @JsonProperty("entitlements")
    public void setEntitlements(Collection<UserType> entitlements) {
        this.entitlements = entitlements;
    }

}
