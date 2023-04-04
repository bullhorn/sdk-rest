package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("data")
public class UserDepartmentGrouping extends AbstractEntity implements QueryEntity {
    private Integer id;
    private CorporateUser corporateUser;
    private CorporationDepartment department;
    private Boolean isPrimaryDepartment;

    public UserDepartmentGrouping() {
    }

    public Integer getId() {
        return this.id;
    }

    public CorporateUser getCorporateUser() {
        return this.corporateUser;
    }

    public CorporationDepartment getDepartment() {
        return this.department;
    }

    public Boolean getIsPrimaryDepartment() {
        return this.isPrimaryDepartment;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCorporateUser(CorporateUser corporateUser) {
        this.corporateUser = corporateUser;
    }

    public void setDepartment(CorporationDepartment department) {
        this.department = department;
    }

    public void setIsPrimaryDepartment(Boolean isPrimaryDepartment) {
        this.isPrimaryDepartment = isPrimaryDepartment;
    }

    public String toString() {
        return "UserDepartmentGrouping(id=" + this.getId() + ", corporateUser=" + this.getCorporateUser() + ", department=" + this.getDepartment() + ", isPrimaryDepartment=" + this.getIsPrimaryDepartment() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDepartmentGrouping that = (UserDepartmentGrouping) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(corporateUser, that.corporateUser))
            return false;
        if (!Objects.equals(department, that.department)) return false;
        return Objects.equals(isPrimaryDepartment, that.isPrimaryDepartment);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (corporateUser != null ? corporateUser.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (isPrimaryDepartment != null ? isPrimaryDepartment.hashCode() : 0);
        return result;
    }
}
