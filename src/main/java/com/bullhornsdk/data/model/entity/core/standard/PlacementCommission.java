package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.LinkedId;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "comments", "commissionPercentage", "dateAdded", "dateLastModified", "externalRecipient", "flatPayout",
        "grossMarginPercentage", "hourlyPayout", "migrateGUID", "placement", "role", "status", "user" })
public class PlacementCommission extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, HardDeleteEntity, DateLastModifiedEntity {

    private Integer id;

    @JsonIgnore
    private String comments;

    private BigDecimal commissionPercentage;

    private DateTime dateAdded;

    private DateTime dateLastModified;

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

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlacementCommission that = (PlacementCommission) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (commissionPercentage != null ? !commissionPercentage.equals(that.commissionPercentage) : that.commissionPercentage != null)
            return false;
        if (dateAdded != null ? !dateAdded.equals(that.dateAdded) : that.dateAdded != null) return false;
        if (dateLastModified != null ? !dateLastModified.equals(that.dateLastModified) : that.dateLastModified != null)
            return false;
        if (externalRecipient != null ? !externalRecipient.equals(that.externalRecipient) : that.externalRecipient != null)
            return false;
        if (flatPayout != null ? !flatPayout.equals(that.flatPayout) : that.flatPayout != null) return false;
        if (grossMarginPercentage != null ? !grossMarginPercentage.equals(that.grossMarginPercentage) : that.grossMarginPercentage != null)
            return false;
        if (hourlyPayout != null ? !hourlyPayout.equals(that.hourlyPayout) : that.hourlyPayout != null) return false;
        if (migrateGUID != null ? !migrateGUID.equals(that.migrateGUID) : that.migrateGUID != null) return false;
        if (placement != null ? !placement.equals(that.placement) : that.placement != null) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        return !(user != null ? !user.equals(that.user) : that.user != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (commissionPercentage != null ? commissionPercentage.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
        result = 31 * result + (externalRecipient != null ? externalRecipient.hashCode() : 0);
        result = 31 * result + (flatPayout != null ? flatPayout.hashCode() : 0);
        result = 31 * result + (grossMarginPercentage != null ? grossMarginPercentage.hashCode() : 0);
        result = 31 * result + (hourlyPayout != null ? hourlyPayout.hashCode() : 0);
        result = 31 * result + (migrateGUID != null ? migrateGUID.hashCode() : 0);
        result = 31 * result + (placement != null ? placement.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PlacementCommission{" +
                "id=" + id +
                ", comments='" + comments + '\'' +
                ", commissionPercentage=" + commissionPercentage +
                ", dateAdded=" + dateAdded +
                ", dateLastModified=" + dateLastModified +
                ", externalRecipient='" + externalRecipient + '\'' +
                ", flatPayout=" + flatPayout +
                ", grossMarginPercentage=" + grossMarginPercentage +
                ", hourlyPayout=" + hourlyPayout +
                ", migrateGUID='" + migrateGUID + '\'' +
                ", placement=" + placement +
                ", role='" + role + '\'' +
                ", status='" + status + '\'' +
                ", user=" + user +
                '}';
    }
}