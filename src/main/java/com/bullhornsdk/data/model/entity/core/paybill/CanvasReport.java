package com.bullhornsdk.data.model.entity.core.paybill;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.CorporationDepartment;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created by mkesmetzis 23-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "dateAdded", "dateLastModified", "dateLastRun", "departments", "description", "isDeleted",
    "name", "owner", "path", "users", "visibility"})
public class CanvasReport extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity {

    private Integer id;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private DateTime dateLastRun;
    private CorporationDepartment departments;
    @Size(max = 1000)
    private String description;
    private Boolean isDeleted;
    @Size(max = 255)
    private String name;
    private CorporateUser owner;
    private String path;
    private OneToMany<CorporateUser> users;
    @Size(max = 100)
    private String visibility;

    public CanvasReport() {
    }

    public CanvasReport(Integer id) {
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

    @JsonProperty("dateLastRun")
    public DateTime getDateLastRun() {
        return dateLastRun;
    }

    @JsonProperty("dateLastRun")
    public void setDateLastRun(DateTime dateLastRun) {
        this.dateLastRun = dateLastRun;
    }

    @JsonProperty("departments")
    public CorporationDepartment getDepartments() {
        return departments;
    }

    @JsonProperty("departments")
    public void setDepartments(CorporationDepartment departments) {
        this.departments = departments;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("users")
    public OneToMany<CorporateUser> getUsers() {
        return users;
    }

    @JsonProperty("users")
    public void setUsers(OneToMany<CorporateUser> users) {
        this.users = users;
    }

    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
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

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "CanvasReport{" +
            "id=" + id +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", dateLastRun=" + dateLastRun +
            ", departments=" + departments +
            ", description='" + description + '\'' +
            ", isDeleted=" + isDeleted +
            ", name='" + name + '\'' +
            ", owner=" + owner +
            ", path='" + path + '\'' +
            ", users=" + users +
            ", visibility='" + visibility + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CanvasReport that = (CanvasReport) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(dateLastRun, that.dateLastRun) &&
            Objects.equals(departments, that.departments) &&
            Objects.equals(description, that.description) &&
            Objects.equals(isDeleted, that.isDeleted) &&
            Objects.equals(name, that.name) &&
            Objects.equals(owner, that.owner) &&
            Objects.equals(path, that.path) &&
            Objects.equals(users, that.users) &&
            Objects.equals(visibility, that.visibility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateAdded, dateLastModified, dateLastRun, departments, description, isDeleted, name, owner, path, users, visibility);
    }
}
