package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "dateAdded", "groupName", "groupName", "isPrivate", "isReadOnly", "members", "migrateGUID", "name", "owner", "searchURL", "type"})
public class DistributionList extends AbstractEntity implements QueryEntity, HardDeleteEntity, UpdateEntity {

    private Integer id;

    private DateTime dateAdded;

    @Size(max = 200000)
    private String description;

    @Size(max = 100)
    private String groupName;

    private Boolean isPrivate;

    private Boolean isReadOnly;

    private OneToMany<Person> members;

    @Size(max = 36)
    private String migrateGUID;

    @Size(max = 100)
    private String name;

    private CorporateUser owner;

    @Size(max = 200000)
    private String searchURL;

    @Size(max = 30)
    private String type;

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

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

    @JsonProperty("groupName")
    public String getGroupName() {
        return groupName;
    }

    @JsonProperty("groupName")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @JsonProperty("isPrivate")
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    @JsonProperty("isPrivate")
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    @JsonProperty("isReadOnly")
    public Boolean getIsReadOnly() {
        return isReadOnly;
    }

    @JsonProperty("isReadOnly")
    public void setIsReadOnly(Boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    @JsonProperty("members")
    public OneToMany<Person> getMembers() {
        return members;
    }

    @JsonProperty("members")
    public void setMembers(OneToMany<Person> members) {
        this.members = members;
    }

    @JsonProperty("migrateGUID")
    public String getMigrateGUID() {
        return migrateGUID;
    }

    @JsonProperty("migrateGUID")
    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
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

    @JsonProperty("searchURL")
    public String getSearchURL() {
        return searchURL;
    }

    @JsonProperty("searchURL")
    public void setSearchURL(String searchURL) {
        this.searchURL = searchURL;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DistributionList{" +
                "id=" + id +
                ", dateAdded=" + dateAdded +
                ", description='" + description + '\'' +
                ", groupName='" + groupName + '\'' +
                ", isPrivate=" + isPrivate +
                ", isReadOnly=" + isReadOnly +
                ", members=" + members +
                ", migrateGUID='" + migrateGUID + '\'' +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                ", searchURL='" + searchURL + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DistributionList)) return false;

        DistributionList that = (DistributionList) o;

        if (!id.equals(that.id)) return false;
        if (dateAdded != null ? !dateAdded.equals(that.dateAdded) : that.dateAdded != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (groupName != null ? !groupName.equals(that.groupName) : that.groupName != null) return false;
        if (isPrivate != null ? !isPrivate.equals(that.isPrivate) : that.isPrivate != null) return false;
        if (isReadOnly != null ? !isReadOnly.equals(that.isReadOnly) : that.isReadOnly != null) return false;
        if (members != null ? !members.equals(that.members) : that.members != null) return false;
        if (migrateGUID != null ? !migrateGUID.equals(that.migrateGUID) : that.migrateGUID != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (owner != null ? !owner.equals(that.owner) : that.owner != null) return false;
        if (searchURL != null ? !searchURL.equals(that.searchURL) : that.searchURL != null) return false;
        return !(type != null ? !type.equals(that.type) : that.type != null);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        result = 31 * result + (isPrivate != null ? isPrivate.hashCode() : 0);
        result = 31 * result + (isReadOnly != null ? isReadOnly.hashCode() : 0);
        result = 31 * result + (members != null ? members.hashCode() : 0);
        result = 31 * result + (migrateGUID != null ? migrateGUID.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (searchURL != null ? searchURL.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
