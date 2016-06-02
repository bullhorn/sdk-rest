package com.bullhornsdk.data.model.entity.core.edithistory;

/**
 * Created by acrowe on 3/2/2016.
 */

import com.bullhornsdk.data.model.entity.core.type.EditHistoryEntity;
import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.embedded.LinkedId;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "auditTrail", "dateAdded", "fieldChanges", "migrateGUID", "modifyingPerson", "targetEntity", "transactionID"})
public class EditHistory implements QueryEntity {
    private Integer id;

    private String auditTrail;

    private DateTime dateAdded;

    private OneToMany<FieldChange> fieldChanges;

    private Object migrateGUID;

    private CorporateUser modifyingPerson;

    private LinkedId targetEntity;

    private String transactionID;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("auditTrail")
    public String getAuditTrail() {
        return auditTrail;
    }

    @JsonProperty("auditTrail")
    public void setAuditTrail(String auditTrail) {
        this.auditTrail = auditTrail;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("fieldChanges")
    public OneToMany<FieldChange> getFieldChanges() {
        return fieldChanges;
    }

    @JsonProperty("fieldChanges")
    public void setFieldChanges(OneToMany<FieldChange> fieldChanges) {
        this.fieldChanges = fieldChanges;
    }

    @JsonProperty("migrateGUID")
    public Object getMigrateGUID() {
        return migrateGUID;
    }

    @JsonProperty("migrateGUID")
    public void setMigrateGUID(Object migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    @JsonProperty("modifyingPerson")
    public CorporateUser getModifyingPerson() {
        return modifyingPerson;
    }

    @JsonProperty("modifyingPerson")
    public void setModifyingPerson(CorporateUser modifyingPerson) {
        this.modifyingPerson = modifyingPerson;
    }

    @JsonProperty("targetEntity")
    public LinkedId getTargetEntity() {
        return targetEntity;
    }

    @JsonProperty("targetEntity")
    public void setTargetEntity(LinkedId targetEntity) {
        this.targetEntity = targetEntity;
    }

    @JsonProperty("transactionID")
    public String getTransactionID() {
        return transactionID;
    }

    @JsonProperty("transactionID")
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EditHistory that = (EditHistory) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (auditTrail != null ? !auditTrail.equals(that.auditTrail) : that.auditTrail != null) return false;
        if (dateAdded != null ? !dateAdded.equals(that.dateAdded) : that.dateAdded != null) return false;
        if (fieldChanges != null ? !fieldChanges.equals(that.fieldChanges) : that.fieldChanges != null) return false;
        if (migrateGUID != null ? !migrateGUID.equals(that.migrateGUID) : that.migrateGUID != null) return false;
        if (modifyingPerson != null ? !modifyingPerson.equals(that.modifyingPerson) : that.modifyingPerson != null)
            return false;
        if (targetEntity != null ? !targetEntity.equals(that.targetEntity) : that.targetEntity != null) return false;
        return !(transactionID != null ? !transactionID.equals(that.transactionID) : that.transactionID != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (auditTrail != null ? auditTrail.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (fieldChanges != null ? fieldChanges.hashCode() : 0);
        result = 31 * result + (migrateGUID != null ? migrateGUID.hashCode() : 0);
        result = 31 * result + (modifyingPerson != null ? modifyingPerson.hashCode() : 0);
        result = 31 * result + (targetEntity != null ? targetEntity.hashCode() : 0);
        result = 31 * result + (transactionID != null ? transactionID.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EditHistory{" +
                "id=" + id +
                ", auditTrail='" + auditTrail + '\'' +
                ", dateAdded=" + dateAdded +
                ", fieldChanges=" + fieldChanges +
                ", migrateGUID=" + migrateGUID +
                ", modifyingPerson=" + modifyingPerson +
                ", targetEntity=" + targetEntity +
                ", transactionID='" + transactionID + '\'' +
                '}';
    }
}
