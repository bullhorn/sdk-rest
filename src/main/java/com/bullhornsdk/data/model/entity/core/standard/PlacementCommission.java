package com.bullhornsdk.data.model.entity.core.standard;

import java.math.BigDecimal;

import javax.validation.constraints.Size;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.HardDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.LinkedId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "comments", "commissionPercentage", "dateAdded", "externalRecipient", "flatPayout",
        "grossMarginPercentage", "hourlyPayout", "migrateGUID", "placement", "role", "status", "user" })
public class PlacementCommission extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, HardDeleteEntity {

    private Integer id;

    @JsonIgnore
    private String comments;

    private BigDecimal commissionPercentage;

    private DateTime dateAdded;

    @Size(max = 100)
    private String externalRecipient;

    private BigDecimal flatPayout;

    private BigDecimal grossMarginPercentage;

    private BigDecimal hourlyPayout;

    private String migrateGUID;

    private LinkedId placement;

    @JsonIgnore
    @Size(max = 50)
    private String role;

    @JsonIgnore
    private String status;

    private LinkedId user;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    @JsonProperty("commissionPercentage")
    public BigDecimal getCommissionPercentage() {
        return commissionPercentage;
    }

    @JsonProperty("commissionPercentage")
    public void setCommissionPercentage(BigDecimal commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("externalRecipient")
    public String getExternalRecipient() {
        return externalRecipient;
    }

    @JsonIgnore
    public void setExternalRecipient(String externalRecipient) {
        this.externalRecipient = externalRecipient;
    }

    @JsonProperty("flatPayout")
    public BigDecimal getFlatPayout() {
        return flatPayout;
    }

    @JsonProperty("flatPayout")
    public void setFlatPayout(BigDecimal flatPayout) {
        this.flatPayout = flatPayout;
    }

    @JsonProperty("grossMarginPercentage")
    public BigDecimal getGrossMarginPercentage() {
        return grossMarginPercentage;
    }

    @JsonProperty("grossMarginPercentage")
    public void setGrossMarginPercentage(BigDecimal grossMarginPercentage) {
        this.grossMarginPercentage = grossMarginPercentage;
    }

    @JsonProperty("hourlyPayout")
    public BigDecimal getHourlyPayout() {
        return hourlyPayout;
    }

    @JsonProperty("hourlyPayout")
    public void setHourlyPayout(BigDecimal hourlyPayout) {
        this.hourlyPayout = hourlyPayout;
    }

    @JsonProperty("migrateGUID")
    public String getMigrateGUID() {
        return migrateGUID;
    }

    @JsonProperty("migrateGUID")
    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    @JsonProperty("placement")
    public LinkedId getPlacement() {
        return placement;
    }

    @JsonProperty("placement")
    public void setPlacement(LinkedId placement) {
        this.placement = placement;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonIgnore
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonIgnore
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("user")
    public LinkedId getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(LinkedId user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((comments == null) ? 0 : comments.hashCode());
        result = prime * result + ((commissionPercentage == null) ? 0 : commissionPercentage.hashCode());
        result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
        result = prime * result + ((externalRecipient == null) ? 0 : externalRecipient.hashCode());
        result = prime * result + ((flatPayout == null) ? 0 : flatPayout.hashCode());
        result = prime * result + ((grossMarginPercentage == null) ? 0 : grossMarginPercentage.hashCode());
        result = prime * result + ((hourlyPayout == null) ? 0 : hourlyPayout.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
        result = prime * result + ((placement == null) ? 0 : placement.hashCode());
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((user == null) ? 0 : user.hashCode());
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
        PlacementCommission other = (PlacementCommission) obj;
        if (comments == null) {
            if (other.comments != null)
                return false;
        } else if (!comments.equals(other.comments))
            return false;
        if (commissionPercentage == null) {
            if (other.commissionPercentage != null)
                return false;
        } else if (!commissionPercentage.equals(other.commissionPercentage))
            return false;
        if (dateAdded == null) {
            if (other.dateAdded != null)
                return false;
        } else if (!dateAdded.isEqual(other.dateAdded))
            return false;
        if (externalRecipient == null) {
            if (other.externalRecipient != null)
                return false;
        } else if (!externalRecipient.equals(other.externalRecipient))
            return false;
        if (flatPayout == null) {
            if (other.flatPayout != null)
                return false;
        } else if (!flatPayout.equals(other.flatPayout))
            return false;
        if (grossMarginPercentage == null) {
            if (other.grossMarginPercentage != null)
                return false;
        } else if (!grossMarginPercentage.equals(other.grossMarginPercentage))
            return false;
        if (hourlyPayout == null) {
            if (other.hourlyPayout != null)
                return false;
        } else if (!hourlyPayout.equals(other.hourlyPayout))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (migrateGUID == null) {
            if (other.migrateGUID != null)
                return false;
        } else if (!migrateGUID.equals(other.migrateGUID))
            return false;
        if (placement == null) {
            if (other.placement != null)
                return false;
        } else if (!placement.equals(other.placement))
            return false;
        if (role == null) {
            if (other.role != null)
                return false;
        } else if (!role.equals(other.role))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        if (user == null) {
            if (other.user != null)
                return false;
        } else if (!user.equals(other.user))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PlacementCommission {\nid=");
        builder.append(id);
        builder.append(", \ncomments=");
        builder.append(comments);
        builder.append(", \ncommissionPercentage=");
        builder.append(commissionPercentage);
        builder.append(", \ndateAdded=");
        builder.append(dateAdded);
        builder.append(", \nexternalRecipient=");
        builder.append(externalRecipient);
        builder.append(", \nflatPayout=");
        builder.append(flatPayout);
        builder.append(", \ngrossMarginPercentage=");
        builder.append(grossMarginPercentage);
        builder.append(", \nhourlyPayout=");
        builder.append(hourlyPayout);
        builder.append(", \nmigrateGUID=");
        builder.append(migrateGUID);
        builder.append(", \nplacement=");
        builder.append(placement);
        builder.append(", \nrole=");
        builder.append(role);
        builder.append(", \nstatus=");
        builder.append(status);
        builder.append(", \nuser=");
        builder.append(user);
        builder.append("\n}");
        return builder.toString();
    }

}