package com.bullhornsdk.data.model.entity.core.onboarding365;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsE;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by dhuber 27-Oct-21
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "acceptDateAtUTC", "additionalInfo", "businessKey", "candidate", "certifyDateAtUTC", "dateAdded", "dateLastModified", "documentType",
    "documentTypeId", "friendlyName", "generatedDateAtUTC", "name", "uniqueId"})
public class DocumentDataFlowback implements QueryEntity {

    private Integer id;

    private DateTime acceptDateAtUTC;

    @JsonIgnore
    @Size
    private String additionalInfo;

    @JsonIgnore
    @Size
    private String businessKey;

    private Candidate candidate;

    private DateTime certifyDateAtUTC;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    @JsonIgnore
    @Size(max = 255)
    private String documentType;

    @JsonIgnore
    @Size(max = 36)
    private String documentTypeId;

    @JsonIgnore
    @Size
    private String friendlyName;

    private DateTime generatedDateAtUTC;

    @JsonIgnore
    @Size
    private String name;

    @JsonIgnore
    @Size(max = 36)
    private String uniqueId;

    public DocumentDataFlowback() {
    }

    public DocumentDataFlowback(Integer id) {
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

    @JsonProperty("acceptDateAtUTC")
    public DateTime getAcceptDateAtUTC() {
        return acceptDateAtUTC;
    }

    @JsonProperty("acceptDateAtUTC")
    public void setAcceptDateAtUTC(DateTime acceptDateAtUTC) {
        this.acceptDateAtUTC = acceptDateAtUTC;
    }

    @JsonProperty("additionalInfo")
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    @JsonIgnore
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @JsonProperty("businessKey")
    public String getBusinessKey() {
        return businessKey;
    }

    @JsonIgnore
    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    @JsonProperty("candidate")
    public Candidate getCandidate() {
        return candidate;
    }

    @JsonProperty("candidate")
    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @JsonProperty("certifyDateAtUTC")
    public DateTime getCertifyDateAtUTC() {
        return certifyDateAtUTC;
    }

    @JsonProperty("certifyDateAtUTC")
    public void setCertifyDateAtUTC(DateTime certifyDateAtUTC) {
        this.certifyDateAtUTC = certifyDateAtUTC;
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

    @JsonProperty("documentType")
    public String getDocumentType() {
        return documentType;
    }

    @JsonIgnore
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    @JsonProperty("documentTypeId")
    public String getDocumentTypeId() {
        return documentTypeId;
    }

    @JsonIgnore
    public void setDocumentTypeId(String documentTypeId) {
        this.documentTypeId = documentTypeId;
    }

    @JsonProperty("friendlyName")
    public String getFriendlyName() {
        return friendlyName;
    }

    @JsonIgnore
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    @JsonProperty("generatedDateAtUTC")
    public DateTime getGeneratedDateAtUTC() {
        return generatedDateAtUTC;
    }

    @JsonProperty("generatedDateAtUTC")
    public void setGeneratedDateAtUTC(DateTime generatedDateAtUTC) {
        this.generatedDateAtUTC = generatedDateAtUTC;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonIgnore
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("uniqueId")
    public String getUniqueId() {
        return uniqueId;
    }

    @JsonIgnore
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Override
    public String toString() {
        return "DocumentDataFlowback{" +
            "id=" + id +
            ", acceptDateAtUTC=" + acceptDateAtUTC +
            ", additionalInfo='" + additionalInfo + '\'' +
            ", businessKey='" + businessKey + '\'' +
            ", candidate=" + candidate +
            ", certifyDateAtUTC=" + certifyDateAtUTC +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", documentType='" + documentType + '\'' +
            ", documentTypeId='" + documentTypeId + '\'' +
            ", friendlyName='" + friendlyName + '\'' +
            ", generatedDateAtUTC=" + generatedDateAtUTC +
            ", name='" + name + '\'' +
            ", uniqueId='" + uniqueId + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DocumentDataFlowback that = (DocumentDataFlowback) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(acceptDateAtUTC, that.acceptDateAtUTC) &&
            Objects.equals(additionalInfo, that.additionalInfo) &&
            Objects.equals(businessKey, that.businessKey) &&
            Objects.equals(candidate, that.candidate) &&
            Objects.equals(certifyDateAtUTC, that.certifyDateAtUTC) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(documentType, that.documentType) &&
            Objects.equals(documentTypeId, that.documentTypeId) &&
            Objects.equals(friendlyName, that.friendlyName) &&
            Objects.equals(generatedDateAtUTC, that.generatedDateAtUTC) &&
            Objects.equals(name, that.name) &&
            Objects.equals(uniqueId, that.uniqueId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), id, acceptDateAtUTC, additionalInfo, businessKey, candidate, certifyDateAtUTC, dateAdded, dateLastModified, documentType, documentTypeId, friendlyName, generatedDateAtUTC, name, uniqueId);
    }
}
