package com.bullhornsdk.data.model.entity.association.standard;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.customobject.*;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.PlacementCertification;
import com.bullhornsdk.data.model.entity.core.standard.TimeUnit;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory class for Placement Associations.
 *
 * @author Magnus Fiore Palm
 *
 */
public final class PlacementAssociations implements EntityAssociations<Placement> {

    private final AssociationField<Placement,TimeUnit> timeUnits= instantiateAssociationField("timeUnits",TimeUnit.class);
    private final AssociationField<Placement, PlacementCertification> placementCertifications = instantiateAssociationField("placementCertifications", PlacementCertification.class);

    private final AssociationField<Placement, PlacementCustomObjectInstance1> customObject1s = instantiateAssociationField("customObject1s", PlacementCustomObjectInstance1.class);
    private final AssociationField<Placement, PlacementCustomObjectInstance2> customObject2s = instantiateAssociationField("customObject2s", PlacementCustomObjectInstance2.class);
    private final AssociationField<Placement, PlacementCustomObjectInstance3> customObject3s = instantiateAssociationField("customObject3s", PlacementCustomObjectInstance3.class);
    private final AssociationField<Placement, PlacementCustomObjectInstance4> customObject4s = instantiateAssociationField("customObject4s", PlacementCustomObjectInstance4.class);
    private final AssociationField<Placement, PlacementCustomObjectInstance5> customObject5s = instantiateAssociationField("customObject5s", PlacementCustomObjectInstance5.class);
    private final AssociationField<Placement, PlacementCustomObjectInstance6> customObject6s = instantiateAssociationField("customObject6s", PlacementCustomObjectInstance6.class);
    private final AssociationField<Placement, PlacementCustomObjectInstance7> customObject7s = instantiateAssociationField("customObject7s", PlacementCustomObjectInstance7.class);
    private final AssociationField<Placement, PlacementCustomObjectInstance8> customObject8s = instantiateAssociationField("customObject8s", PlacementCustomObjectInstance8.class);
    private final AssociationField<Placement, PlacementCustomObjectInstance9> customObject9s = instantiateAssociationField("customObject9s", PlacementCustomObjectInstance9.class);
    private final AssociationField<Placement, PlacementCustomObjectInstance10> customObject10s = instantiateAssociationField("customObject10s", PlacementCustomObjectInstance10.class);

    private static final PlacementAssociations INSTANCE = new PlacementAssociations();
    private List<AssociationField<Placement,? extends BullhornEntity>> allAssociations;

    public PlacementAssociations() {
        super();
    }

    public static PlacementAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<Placement,TimeUnit> timeUnits() {
        return timeUnits;
    }

    public AssociationField<Placement,PlacementCertification> placementCertifications() { return placementCertifications; }

    public AssociationField<Placement, PlacementCustomObjectInstance1> customObject1s() {
        return customObject1s;
    }

    public AssociationField<Placement, PlacementCustomObjectInstance2> customObject2s() {
        return customObject2s;
    }

    public AssociationField<Placement, PlacementCustomObjectInstance3> customObject3s() {
        return customObject3s;
    }

    public AssociationField<Placement, PlacementCustomObjectInstance4> customObject4s() {
        return customObject4s;
    }

    public AssociationField<Placement, PlacementCustomObjectInstance5> customObject5s() {
        return customObject5s;
    }

    public AssociationField<Placement, PlacementCustomObjectInstance6> customObject6s() {
        return customObject6s;
    }

    public AssociationField<Placement, PlacementCustomObjectInstance7> customObject7s() {
        return customObject7s;
    }

    public AssociationField<Placement, PlacementCustomObjectInstance8> customObject8s() {
        return customObject8s;
    }

    public AssociationField<Placement, PlacementCustomObjectInstance9> customObject9s() {
        return customObject9s;
    }

    public AssociationField<Placement, PlacementCustomObjectInstance10> customObject10s() {
        return customObject10s;
    }

    private <E extends BullhornEntity> AssociationField<Placement, E> instantiateAssociationField(String associationName,
                                                                                              Class<E> associationType) {
        return new StandardAssociationField<Placement, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<Placement,? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<Placement,? extends BullhornEntity>>();
            allAssociations.add(timeUnits());
            allAssociations.add(placementCertifications());
            allAssociations.add(customObject1s());
            allAssociations.add(customObject2s());
            allAssociations.add(customObject3s());
            allAssociations.add(customObject4s());
            allAssociations.add(customObject5s());
            allAssociations.add(customObject6s());
            allAssociations.add(customObject7s());
            allAssociations.add(customObject8s());
            allAssociations.add(customObject9s());
            allAssociations.add(customObject10s());
        }
        return allAssociations;
    }

    @Override
    public AssociationField<Placement,? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<Placement,? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity Placement called: " + associationName);
    }

}
