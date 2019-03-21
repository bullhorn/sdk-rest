//
// Generated Source.
//
// WARNING: DO NOT CHANGE THIS FILE. IT WILL BE OVERRIDDEN NEXT TIME IT IS GENERATED.
//
package com.bullhornsdk.data.model.entity.report;

import com.bullhornsdk.data.api.helper.RestOneToManySerializer;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.embedded.UserType;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.time.DateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "category", "cognosType", "dashboard", "dateAdded", "dateLastModified",
    "description", "entitlements", "name", "owner", "packageName", "path", "oldReportID",
    "reportJar", "reportRTF", "reportXML", "sqlData", "type", "version"})
public class Report extends AbstractEntity implements QueryEntity, BullhornEntity {

    private Integer id;

    private Category category;

    private String cognosType;

    private Boolean dashboard;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    private String description;

    private OneToMany<UserType> entitlements;

    private String name;

    private CorporateUser owner;

    private String packageName;

    private String path;

    private Integer oldReportID;

    private String reportJar;

    private String reportRTF;

    private String reportXML;

    private String sqlData;

    private String type;

    private Integer version;

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return this.id;
    }

    @ReadOnly
    @Override
    @JsonProperty("id")
    public void setId(Integer id){
        this.id = id;
    }

    public Integer getReportId() {
        return getId();
    }

    public void setReportId(Integer id) {
        setId(id);
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
    public String getReportJar() {
        return this.reportJar;
    }

    @JsonProperty("reportJar")
    public void setReportJar(String reportJar) {
        this.reportJar = reportJar;
    }

    @JsonProperty("entitlements")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<UserType> getEntitlements() {
        return entitlements;
    }

    @JsonProperty("entitlements")
    public void setEntitlements(OneToMany<UserType> entitlements) {
        this.entitlements = entitlements;
    }

    @JsonProperty("dashboard")
    public Boolean getDashboard() {
        return dashboard;
    }

    @JsonProperty("dashboard")
    public void setDashboard(Boolean dashboard) {
        this.dashboard = dashboard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Report report = (Report) o;
        if (id != null ? !id.equals(report.id) : report.id != null) return false;
        if (category != null ? !category.equals(report.category) : report.category != null) return false;
        if (cognosType != null ? !cognosType.equals(report.cognosType) : report.cognosType != null) return false;
        if (dashboard != null ? !dashboard.equals(report.dashboard) : report.dashboard != null) return false;
        if (dateAdded != null ? !dateAdded.equals(report.dateAdded) : report.dateAdded != null) return false;
        if (dateLastModified != null ? !dateLastModified.equals(report.dateLastModified) : report.dateLastModified != null)
            return false;
        if (description != null ? !description.equals(report.description) : report.description != null) return false;
        if (entitlements != null ? !entitlements.equals(report.entitlements) : report.entitlements != null) return false;
        if (name != null ? !name.equals(report.name) : report.name != null) return false;
        if (oldReportID != null ? !oldReportID.equals(report.oldReportID) : report.oldReportID != null) return false;
        if (owner != null ? !owner.equals(report.owner) : report.owner != null) return false;
        if (packageName != null ? !packageName.equals(report.packageName) : report.packageName != null) return false;
        if (path != null ? !path.equals(report.path) : report.path != null) return false;
        if (reportJar != null ? !reportJar.equals(report.reportJar) : report.reportJar != null) return false;
        if (reportRTF != null ? !reportRTF.equals(report.reportRTF) : report.reportRTF != null) return false;
        if (reportXML != null ? !reportXML.equals(report.reportXML) : report.reportXML != null) return false;
        if (sqlData != null ? !sqlData.equals(report.sqlData) : report.sqlData != null) return false;
        if (type != null ? !type.equals(report.type) : report.type != null) return false;

        return !(version != null ? !version.equals(report.version) : report.version != null);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (cognosType != null ? cognosType.hashCode() : 0);
        result = 31 * result + (dashboard != null ? dashboard.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (entitlements != null ? entitlements.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (oldReportID != null ? oldReportID.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (packageName != null ? packageName.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (reportJar != null ? reportJar.hashCode() : 0);
        result = 31 * result + (reportRTF != null ? reportRTF.hashCode() : 0);
        result = 31 * result + (reportXML != null ? reportXML.hashCode() : 0);
        result = 31 * result + (sqlData != null ? sqlData.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder("Report {")
            .append("\t\"reportID\": ").append(id).append(",\n")
            .append("\t\"category\": ").append(category).append(",\n")
            .append("\t\"cognosType\": ").append(cognosType).append(",\n")
            .append("\t\"dashboard\": ").append(dashboard).append(",\n")
            .append("\t\"dateAdded\": ").append(dateAdded).append(",\n")
            .append("\t\"dateLastModified\": ").append(dateLastModified).append(",\n")
            .append("\t\"description\": ").append(description).append(",\n")
            .append("\t\"entitlements\": ").append(entitlements).append(",\n")
            .append("\t\"name\": ").append(name).append(",\n")
            .append("\t\"oldReportID\": ").append(oldReportID).append(",\n")
            .append("\t\"owner\": ").append(owner).append(",\n")
            .append("\t\"packageName\": ").append(packageName).append(",\n")
            .append("\t\"path\": ").append(path).append(",\n")
            .append("\t\"reportJar\": ").append(reportJar).append(",\n")
            .append("\t\"reportRTF\": ").append(reportRTF).append(",\n")
            .append("\t\"reportXML\": ").append(reportXML).append(",\n")
            .append("\t\"sqlData\": ").append(sqlData).append(",\n")
            .append("\t\"type\": ").append(type).append(",\n")
            .append("\t\"version\": ").append(version).append(",\n")
            .append('}')
            .toString();

    }

}
