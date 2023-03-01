package com.bullhornsdk.data.model.entity.core.customobject;

import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"attributes", "corporationID", "dateAdded", "description", "displayType", "enabled", "icon", "isHIidden",
    "name", "objectDepartments", "objectNumber", "reportID", "staticTemplateName", "tabName", "useClientDefinedName"})
public class UserCustomObject extends CustomObjectBase implements QueryEntity {

    private Integer id;

    private String type;

    private Integer isPublic;

    private OneToMany<UserCustomObjectAttribute> attributes;

    private Integer corporationID;

    private DateTime dateAdded;

    private String description;

    private String displayType;

    private Boolean enabled;

    private String icon;

    private Boolean isHidden;

    private String name;

    private OneToMany<UserCustomObjectDepartment> objectDepartments;

    private Integer objectNumber;

    private Integer reportID;

    private String staticTemplateName;

    private String tabName;

    private Boolean useClientDefinedName;

    public UserCustomObject() {
        super();
    }

    public UserCustomObject(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonIgnore
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("isPublic")
    public Integer getIsPublic() {
        return isPublic;
    }

    @JsonIgnore
    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    public OneToMany<UserCustomObjectAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(OneToMany<UserCustomObjectAttribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public Integer getCorporationID() {
        return corporationID;
    }

    @Override
    public void setCorporationID(Integer corporationID) {
        this.corporationID = corporationID;
    }

    @Override
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @Override
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getDisplayType() {
        return displayType;
    }

    @Override
    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    @Override
    public Boolean getEnabled() {
        return enabled;
    }

    @Override
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String getIcon() {
        return icon;
    }

    @Override
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getHidden() {
        return isHidden;
    }

    public void setHidden(Boolean hidden) {
        isHidden = hidden;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public OneToMany<UserCustomObjectDepartment> getObjectDepartments() {
        return objectDepartments;
    }

    public void setObjectDepartments(OneToMany<UserCustomObjectDepartment> objectDepartments) {
        this.objectDepartments = objectDepartments;
    }

    @Override
    public Integer getObjectNumber() {
        return objectNumber;
    }

    @Override
    public void setObjectNumber(Integer objectNumber) {
        this.objectNumber = objectNumber;
    }

    @Override
    public Integer getReportID() {
        return reportID;
    }

    @Override
    public void setReportID(Integer reportID) {
        this.reportID = reportID;
    }

    @Override
    public String getStaticTemplateName() {
        return staticTemplateName;
    }

    @Override
    public void setStaticTemplateName(String staticTemplateName) {
        this.staticTemplateName = staticTemplateName;
    }

    @Override
    public String getTabName() {
        return tabName;
    }

    @Override
    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    @Override
    public Boolean getUseClientDefinedName() {
        return useClientDefinedName;
    }

    @Override
    public void setUseClientDefinedName(Boolean useClientDefinedName) {
        this.useClientDefinedName = useClientDefinedName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserCustomObject{");
        sb.append("id=").append(id);
        sb.append(", type='").append(type).append('\'');
        sb.append(", isPublic=").append(isPublic);
        sb.append(", name='").append(name).append('\'');
        sb.append(", tabName='").append(tabName).append('\'');
        sb.append(", displayType='").append(displayType).append('\'');
        sb.append(", enabled=").append(enabled);
        sb.append(", description='").append(description).append('\'');
        sb.append(", dateAdded=").append(dateAdded);
        sb.append(", reportID=").append(reportID);
        sb.append(", corporationID=").append(corporationID);
        sb.append(", objectNumber=").append(objectNumber);
        sb.append(", useClientDefinedName=").append(useClientDefinedName);
        sb.append(", isHidden=").append(isHidden);
        sb.append(", icon='").append(icon).append('\'');
        sb.append(", staticTemplateName='").append(staticTemplateName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserCustomObject that = (UserCustomObject) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (isPublic != null ? !isPublic.equals(that.isPublic) : that.isPublic != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (tabName != null ? !tabName.equals(that.tabName) : that.tabName != null) return false;
        if (displayType != null ? !displayType.equals(that.displayType) : that.displayType != null) return false;
        if (enabled != null ? !enabled.equals(that.enabled) : that.enabled != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (dateAdded != null ? !dateAdded.equals(that.dateAdded) : that.dateAdded != null) return false;
        if (reportID != null ? !reportID.equals(that.reportID) : that.reportID != null) return false;
        if (corporationID != null ? !corporationID.equals(that.corporationID) : that.corporationID != null)
            return false;
        if (objectNumber != null ? !objectNumber.equals(that.objectNumber) : that.objectNumber != null) return false;
        if (useClientDefinedName != null ? !useClientDefinedName.equals(that.useClientDefinedName) : that.useClientDefinedName != null)
            return false;
        if (isHidden != null ? !isHidden.equals(that.isHidden) : that.isHidden != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        return staticTemplateName != null ? staticTemplateName.equals(that.staticTemplateName) : that.staticTemplateName == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (isPublic != null ? isPublic.hashCode() : 0);
        result = 31 * result + (tabName != null ? tabName.hashCode() : 0);
        result = 31 * result + (displayType != null ? displayType.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (reportID != null ? reportID.hashCode() : 0);
        result = 31 * result + (corporationID != null ? corporationID.hashCode() : 0);
        result = 31 * result + (objectNumber != null ? objectNumber.hashCode() : 0);
        result = 31 * result + (useClientDefinedName != null ? useClientDefinedName.hashCode() : 0);
        result = 31 * result + (isHidden != null ? isHidden.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (staticTemplateName != null ? staticTemplateName.hashCode() : 0);
        return result;
    }
}
