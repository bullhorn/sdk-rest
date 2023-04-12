package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.certificationrequirement.AbstractRequirement;
import com.bullhornsdk.data.model.entity.core.edithistory.EditHistory;
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
@JsonPropertyOrder({"id", "candidateCertification", "candidateCertificationName",
    "candidateCertificationStatus", "candidate", "certification", "certificationFileAttachments",
    "customDate1", "customDate10", "customDate2", "customDate3", "customDate4", "customDate5", "customDate6",
    "customDate7", "customDate8", "customDate9", "customFloat1", "customFloat2", "customFloat3", "customInt1",
    "customInt2", "customInt3", "customText1", "customText10", "customText2", "customText3",
    "customText4", "customText5", "customText6", "customText7", "customText8", "customText9", "customTextBlock1",
    "customTextBlock10", "customTextBlock2", "customTextBlock3", "customTextBlock4", "customTextBlock5", "customTextBlock6",
    "customTextBlock7", "customTextBlock8", "customTextBlock9", "dateAdded", "dateExpiration", "dateLastModified", "documentDeadline",
    "editHistories", "fileAttachments", "matchingCredentialCount", "modifyingUser", "owner", "status", "isDeleted", "isRequired",
"matchStatus", "migrateGUID", "placement"})
public class PlacementCertification extends AbstractRequirement implements UpdateEntity, CreateEntity, QueryEntity, DeleteEntity, AssociationEntity, EditHistoryEntity {

    private Placement placement;
    private OneToMany<EditHistory> editHistories;
    private DateTime dateLastModified;
    @Size(max = 100)
    private String candidateCertificationName;
    @Size(max = 30)
    private String candidateCertificationStatus;

    private Boolean isRequired;

    private String matchStatus;

    private String migrateGUID;


    @JsonProperty("placement")
    public Placement getPlacement() {
        return placement;
    }

    @JsonProperty("placement")
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }


    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("editHistories")
    public OneToMany<EditHistory> getEditHistories() {
        return editHistories;
    }

    @JsonProperty("editHistories")
    public void setEditHistories(OneToMany<EditHistory> editHistories) {
        this.editHistories = editHistories;
    }

    @JsonProperty("candidateCertificationName")
    public String getCandidateCertificationName() {
        return candidateCertificationName;
    }

    @JsonProperty("candidateCertificationName")
    public void setCandidateCertificationName(String candidateCertificationName) {
        this.candidateCertificationName = candidateCertificationName;
    }

    @JsonProperty("candidateCertificationStatus")
    public String getCandidateCertificationStatus() {
        return candidateCertificationStatus;
    }

    @JsonProperty("candidateCertificationStatus")
    public void setCandidateCertificationStatus(String candidateCertificationStatus) {
        this.candidateCertificationStatus = candidateCertificationStatus;
    }

    public Boolean getRequired() {
        return isRequired;
    }

    public void setRequired(Boolean required) {
        isRequired = required;
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    public String getMigrateGUID() {
        return migrateGUID;
    }

    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }
}
