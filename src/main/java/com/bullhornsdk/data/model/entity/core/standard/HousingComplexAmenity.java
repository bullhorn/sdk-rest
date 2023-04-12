package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.util.Objects;

@JsonRootName("data")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HousingComplexAmenity extends AbstractEntity implements QueryEntity, UpdateEntity, SoftDeleteEntity {
    private Integer id;
    private String amenityName;
    private Corporation corporation;
    private DateTime dateAdded;
    private OneToMany<HousingComplexUnit> housingComplexUnits;
    private OneToMany<HousingComplex> housingComplexes;
    private Boolean isDeleted;
    private String migrateGUID;
    private OneToMany<PlacementChangeRequest> placementChangeRequests;
    private OneToMany<Placement> placements;

    public HousingComplexAmenity() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getAmenityName() {
        return this.amenityName;
    }

    public Corporation getCorporation() {
        return this.corporation;
    }

    public DateTime getDateAdded() {
        return this.dateAdded;
    }

    public OneToMany<HousingComplexUnit> getHousingComplexUnits() {
        return this.housingComplexUnits;
    }

    public OneToMany<HousingComplex> getHousingComplexes() {
        return this.housingComplexes;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public String getMigrateGUID() {
        return this.migrateGUID;
    }

    public OneToMany<PlacementChangeRequest> getPlacementChangeRequests() {
        return this.placementChangeRequests;
    }

    public OneToMany<Placement> getPlacements() {
        return this.placements;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAmenityName(String amenityName) {
        this.amenityName = amenityName;
    }

    public void setCorporation(Corporation corporation) {
        this.corporation = corporation;
    }

    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setHousingComplexUnits(OneToMany<HousingComplexUnit> housingComplexUnits) {
        this.housingComplexUnits = housingComplexUnits;
    }

    public void setHousingComplexes(OneToMany<HousingComplex> housingComplexes) {
        this.housingComplexes = housingComplexes;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    public void setPlacementChangeRequests(OneToMany<PlacementChangeRequest> placementChangeRequests) {
        this.placementChangeRequests = placementChangeRequests;
    }

    public void setPlacements(OneToMany<Placement> placements) {
        this.placements = placements;
    }

    public String toString() {
        return "HousingComplexAmenity(id=" + this.getId() + ", amenityName=" + this.getAmenityName() + ", corporation=" + this.getCorporation() + ", dateAdded=" + this.getDateAdded() + ", housingComplexUnits=" + this.getHousingComplexUnits() + ", housingComplexes=" + this.getHousingComplexes() + ", isDeleted=" + this.getIsDeleted() + ", migrateGUID=" + this.getMigrateGUID() + ", placementChangeRequests=" + this.getPlacementChangeRequests() + ", placements=" + this.getPlacements() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HousingComplexAmenity that = (HousingComplexAmenity) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(amenityName, that.amenityName)) return false;
        if (!Objects.equals(corporation, that.corporation)) return false;
        if (!Objects.equals(dateAdded, that.dateAdded)) return false;
        if (!Objects.equals(housingComplexUnits, that.housingComplexUnits))
            return false;
        if (!Objects.equals(housingComplexes, that.housingComplexes))
            return false;
        if (!Objects.equals(isDeleted, that.isDeleted)) return false;
        if (!Objects.equals(migrateGUID, that.migrateGUID)) return false;
        if (!Objects.equals(placementChangeRequests, that.placementChangeRequests))
            return false;
        return Objects.equals(placements, that.placements);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (amenityName != null ? amenityName.hashCode() : 0);
        result = 31 * result + (corporation != null ? corporation.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (housingComplexUnits != null ? housingComplexUnits.hashCode() : 0);
        result = 31 * result + (housingComplexes != null ? housingComplexes.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (migrateGUID != null ? migrateGUID.hashCode() : 0);
        result = 31 * result + (placementChangeRequests != null ? placementChangeRequests.hashCode() : 0);
        result = 31 * result + (placements != null ? placements.hashCode() : 0);
        return result;
    }
}
