package com.bullhornsdk.data.model.entity.core.customobject;

import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
public class UserCustomObject extends CustomObjectBase implements QueryEntity {

    private Integer id;

    private String type;

    private Integer isPublic;

    public UserCustomObject() {
        super();
    }

    public UserCustomObject(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() { return this.id; }

    @Override
    public void setId(Integer id) { this.id = id; }

    public String getType() {
        return type;
    }

    @JsonIgnore
    public void setType(String type) {
        this.type = type;
    }

    public Integer getIsPublic() {
        return isPublic;
    }

    @JsonIgnore
    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
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
