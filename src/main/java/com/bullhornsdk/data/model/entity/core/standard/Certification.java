package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigInteger;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "category", "certificationGroups", "countryID",
    "customDate1", "customDate2", "customDate3", "customFloat1", "customFloat2", "customFloat3",
    "customInt1", "customInt2", "customInt3", "customText1", "customText2", "customText3", "customText4", "customText5",
    "customText6", "customText7", "customText8", "customText9", "customText10", "customTextBlock1",
    "customTextBlock2", "customTextBlock3", "customTextBlock4", "customTextBlock5", "dateAdded", "dateLastModified",
    "description", "expirationDateOptional", "migrateGUID", "name", "privateLabels", "specialty", "state", "category",
    "code", "defaultExpirationReminderDays", "equivalents", "hasLicenseNumber", "isAbstract", "isStateRequired",
    "isStateSpecific", "isTransferable", "isTwoSided", "licenseNumberRequired", "numSupplementalsRequired",
    "requiresFileAttachment", "skills", "specialties", "supplementals", "type"})
public class Certification extends CustomFieldsB implements QueryEntity, UpdateEntity, CreateEntity, DeleteEntity, AllRecordsEntity, DateLastModifiedEntity {

    private Integer id;

    @JsonIgnore
    private String description;

    @JsonIgnore
    @Size(max = 100)
    private String name;

    private Category category;
    private OneToMany<CertificationGroup> certificationGroups;
    private Country countryID;
    private Boolean expirationDateOptional;

    @JsonIgnore
    @Size(max = 36)
    private String migrateGUID;

    private OneToMany<PrivateLabel> privateLabels;

    private Specialty specialty;

    @JsonIgnore
    @Size(max = 100)
    private String state;

    private DateTime dateAdded;
    private DateTime dateLastModified;

    private OneToMany<Category> categories;

    private String code;

    private BigInteger defaultExpirationReminderDays;

    private OneToMany<Certification> equivalents;

    private Boolean hasLicenseNumber;

    private Boolean isAbstract;

    private Boolean isStateRequired;

    private Boolean isStateSpecific;

    private Boolean isTransferable;

    private Boolean isTwoSided;

    private Boolean licenseNumberRequired;

    private BigInteger numSupplementalsRequired;

    private Boolean requiresFileAttachment;

    private OneToMany<Skill> skills;

    private OneToMany<Specialty> specialties;

    private OneToMany<Certification> supplementals;

    private String type;

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

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonIgnore
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonIgnore
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonProperty("certificationGroups")
    public OneToMany<CertificationGroup> getCertificationGroups() {
        return certificationGroups;
    }

    @JsonProperty("certificationGroups")
    public void setCertificationGroups(OneToMany<CertificationGroup> certificationGroups) {
        this.certificationGroups = certificationGroups;
    }

    @JsonProperty("country")
    public Country getCountry() {
        return countryID;
    }

    @JsonProperty("country")
    public void setCountry(Country country) {
        this.countryID = country;
    }

    @JsonProperty("expirationDateOptional")
    public Boolean getExpirationDateOptional() {
        return expirationDateOptional;
    }

    @JsonProperty("expirationDateOptional")
    public void setExpirationDateOptional(Boolean expirationDateOptional) {
        this.expirationDateOptional = expirationDateOptional;
    }

    @JsonProperty("migrateGUID")
    public String getMigrateGUID() {
        return migrateGUID;
    }

    @JsonIgnore
    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    @JsonProperty("privateLabels")
    public OneToMany<PrivateLabel> getPrivateLabels() {
        return privateLabels;
    }

    @JsonProperty("privateLabels")
    public void setPrivateLabels(OneToMany<PrivateLabel> privateLabels) {
        this.privateLabels = privateLabels;
    }

    @JsonProperty("specialty")
    public Specialty getSpecialty() {
        return specialty;
    }

    @JsonProperty("specialty")
    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonIgnore
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @ReadOnly
    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
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

    public OneToMany<Category> getCategories() {
        return categories;
    }

    public void setCategories(OneToMany<Category> categories) {
        this.categories = categories;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigInteger getDefaultExpirationReminderDays() {
        return defaultExpirationReminderDays;
    }

    public void setDefaultExpirationReminderDays(BigInteger defaultExpirationReminderDays) {
        this.defaultExpirationReminderDays = defaultExpirationReminderDays;
    }

    public OneToMany<Certification> getEquivalents() {
        return equivalents;
    }

    public void setEquivalents(OneToMany<Certification> equivalents) {
        this.equivalents = equivalents;
    }

    public Boolean getHasLicenseNumber() {
        return hasLicenseNumber;
    }

    public void setHasLicenseNumber(Boolean hasLicenseNumber) {
        this.hasLicenseNumber = hasLicenseNumber;
    }

    public Boolean getAbstract() {
        return isAbstract;
    }

    public void setAbstract(Boolean anAbstract) {
        isAbstract = anAbstract;
    }

    public Boolean getStateRequired() {
        return isStateRequired;
    }

    public void setStateRequired(Boolean stateRequired) {
        isStateRequired = stateRequired;
    }

    public Boolean getStateSpecific() {
        return isStateSpecific;
    }

    public void setStateSpecific(Boolean stateSpecific) {
        isStateSpecific = stateSpecific;
    }

    public Boolean getTransferable() {
        return isTransferable;
    }

    public void setTransferable(Boolean transferable) {
        isTransferable = transferable;
    }

    public Boolean getTwoSided() {
        return isTwoSided;
    }

    public void setTwoSided(Boolean twoSided) {
        isTwoSided = twoSided;
    }

    public Boolean getLicenseNumberRequired() {
        return licenseNumberRequired;
    }

    public void setLicenseNumberRequired(Boolean licenseNumberRequired) {
        this.licenseNumberRequired = licenseNumberRequired;
    }

    public BigInteger getNumSupplementalsRequired() {
        return numSupplementalsRequired;
    }

    public void setNumSupplementalsRequired(BigInteger numSupplementalsRequired) {
        this.numSupplementalsRequired = numSupplementalsRequired;
    }

    public Boolean getRequiresFileAttachment() {
        return requiresFileAttachment;
    }

    public void setRequiresFileAttachment(Boolean requiresFileAttachment) {
        this.requiresFileAttachment = requiresFileAttachment;
    }

    public OneToMany<Skill> getSkills() {
        return skills;
    }

    public void setSkills(OneToMany<Skill> skills) {
        this.skills = skills;
    }

    public OneToMany<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(OneToMany<Specialty> specialties) {
        this.specialties = specialties;
    }

    public OneToMany<Certification> getSupplementals() {
        return supplementals;
    }

    public void setSupplementals(OneToMany<Certification> supplementals) {
        this.supplementals = supplementals;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Certification that = (Certification) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(description, that.description) &&
            Objects.equals(name, that.name) &&
            Objects.equals(category, that.category) &&
            Objects.equals(certificationGroups, that.certificationGroups) &&
            Objects.equals(countryID, that.countryID) &&
            Objects.equals(expirationDateOptional, that.expirationDateOptional) &&
            Objects.equals(migrateGUID, that.migrateGUID) &&
            Objects.equals(privateLabels, that.privateLabels) &&
            Objects.equals(specialty, that.specialty) &&
            Objects.equals(state, that.state) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, description, name, category, certificationGroups, countryID, expirationDateOptional, migrateGUID, privateLabels, specialty, state, dateAdded, dateLastModified);
    }

    @Override
    public String toString() {
        return "Certification{" +
            "id=" + id +
            ", description='" + description + '\'' +
            ", name='" + name + '\'' +
            ", category=" + category +
            ", certificationGroups=" + certificationGroups +
            ", countryID=" + countryID +
            ", expirationDateOptional=" + expirationDateOptional +
            ", migrateGUID='" + migrateGUID + '\'' +
            ", privateLabels=" + privateLabels +
            ", specialty=" + specialty +
            ", state='" + state + '\'' +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            '}';
    }

}
