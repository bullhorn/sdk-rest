package com.bullhornsdk.data.model.entity.association.standard;

import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.TimeUnit;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Factory class for Placement Associations.
 * 
 * @author Magnus Fiore Palm
 * 
 */
public final class PlacementAssociations implements EntityAssociations<Placement> {

    private final AssociationField<Placement,TimeUnit> timeUnits= instantiateAssociationField("timeUnits",TimeUnit.class);
    private List<AssociationField<Placement,? extends BullhornEntity>> allAssociations;
    private static final PlacementAssociations INSTANCE = new PlacementAssociations();

    private PlacementAssociations() {
        super();
    }

    public static PlacementAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<Placement,TimeUnit> timeUnits() {
        return timeUnits;
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
