package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.joda.time.DateTime;

@Data
@EqualsAndHashCode(callSuper = true)
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
}
