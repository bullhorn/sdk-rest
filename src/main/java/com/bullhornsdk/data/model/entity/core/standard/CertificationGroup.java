package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "name", "privateLabel", "certifications", "dateAdded", "dateLastModified", "migrateGUID" })
public class CertificationGroup extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, DeleteEntity, AssociationEntity {

    private Integer id;

    @Size(max = 100)
    private String name;

    private Integer privateLabelID;

    private OneToMany<Certification> certifications;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    private String migrateGUID;

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @Override
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonIgnore
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("privateLabelID")
    public Integer getPrivateLabelID() {
        return privateLabelID;
    }

    @JsonProperty("privateLabelID")
    public void setPrivateLabelID(Integer privateLabelID) {
        this.privateLabelID = privateLabelID;
    }

    @JsonProperty("certifications")
    public OneToMany<Certification> getCertifications() {
        return certifications;
    }

    public void setCertifications(OneToMany<Certification> certifications) {
        this.certifications = certifications;
    }

    public DateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public String getMigrateGUID() {
        return migrateGUID;
    }

    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((privateLabelID == null) ? 0 : privateLabelID.hashCode());
        result = prime * result + ((certifications == null) ? 0 : certifications.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CertificationGroup other = (CertificationGroup) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (privateLabelID != null ? !privateLabelID.equals(other.privateLabelID) : other.privateLabelID != null)
            return false;
        if (certifications != null ? !certifications.equals(other.certifications) : other.certifications != null)
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Certification {\nid=");
        builder.append(id);
        builder.append(", \nname=");
        builder.append(name);
        builder.append(", \nprivateLabelID=");
        builder.append(privateLabelID);
        builder.append(", \ncertifications=");
        builder.append(certifications);
        builder.append("\n}");
        return builder.toString();
    }

}
