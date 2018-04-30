package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "certification", "clientCorporation", "comments", "dateLastModified", "modifyingUser", "offsetDays", "quantity" })
public class ClientCorporationCertification extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, DeleteEntity {

    private Integer id;

    private Certification certification;

    private ClientCorporation clientCorporation;

    @JsonIgnore
    private String comments;

    private Integer offsetDays;

    private Integer quantity;

    @JsonIgnore
    private String location;

    private DateTime dateLastModified;

    private CorporateUser modifyingUser;

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

    @JsonProperty("certification")
    public Certification getCertification() {
        return certification;
    }

    @JsonProperty("certification")
    public void setCertification(Certification certification) {
        this.certification = certification;
    }

    @JsonProperty("clientCorporation")
    public ClientCorporation getClientCorporation() {
        return clientCorporation;
    }

    @JsonProperty("clientCorporation")
    public void setClientCorporation(ClientCorporation clientCorporation) { this.clientCorporation = clientCorporation; }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonIgnore
    public void setComments(String comments) { this.comments = comments; }

    @JsonProperty("offsetDays")
    public Integer getOffsetDays() {
        return offsetDays;
    }

    @JsonProperty("offsetDays")
    public void setOffsetDays(Integer offsetDays) {
        this.offsetDays = offsetDays;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonIgnore
    public void setLocation(String location) { this.location = location; }

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("modifyingUser")
    public CorporateUser getModifyingUser() { return modifyingUser; }

    @JsonProperty("modifyingUser")
    public void setModifyingUser(CorporateUser modifyingUser) { this.modifyingUser = modifyingUser; }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((certification == null) ? 0 : certification.hashCode());
        result = prime * result + ((comments == null) ? 0 : comments.hashCode());
        result = prime * result + ((offsetDays == null) ? 0 : offsetDays.hashCode());
        result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
        result = prime * result + ((location == null) ? 0 : location.hashCode());
        result = prime * result + ((dateLastModified == null) ? 0 : dateLastModified.hashCode());
        result = prime * result + ((modifyingUser == null) ? 0 : modifyingUser.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ClientCorporationCertification)) return false;

        ClientCorporationCertification that = (ClientCorporationCertification) obj;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (certification != null ? !certification.equals(that.certification) : that.certification != null) return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (offsetDays != null ? !offsetDays.equals(that.offsetDays) : that.offsetDays != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (dateLastModified != null ? !dateLastModified.equals(that.dateLastModified) : that.dateLastModified != null) return false;
        if (modifyingUser != null ? !modifyingUser.equals(that.modifyingUser) : that.modifyingUser != null) return false;
        return true;
    }

    @Override
    public String toString() {
        return "ClientCorporationCertification{" +
            "id=" + id +
            ", certification='" + certification + '\'' +
            ", comments=" + comments +
            ", offsetDays=" + offsetDays +
            ", quantity='" + quantity + '\'' +
            ", location='" + location + '\'' +
            ", dateLastModified=" + dateLastModified +
            ", modifyingUser=" + modifyingUser +
            super.toString() +
            '}';
    }

}
