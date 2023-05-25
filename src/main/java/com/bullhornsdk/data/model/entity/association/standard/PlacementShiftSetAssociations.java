package com.bullhornsdk.data.model.entity.association.standard;

import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.PlacementShiftSet;
import com.bullhornsdk.data.model.entity.core.standard.PlacementShiftSetVersion;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

public class PlacementShiftSetAssociations implements EntityAssociations<PlacementShiftSet> {

    private List<AssociationField<PlacementShiftSet, ? extends BullhornEntity>> allAssociations;
    private final AssociationField<PlacementShiftSet, PlacementShiftSetVersion> versions = instantiateAssociationField("versions", PlacementShiftSetVersion.class);

    private static final PlacementShiftSetAssociations INSTANCE = new PlacementShiftSetAssociations();

    private PlacementShiftSetAssociations() {
        super();
    }

    public static PlacementShiftSetAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<PlacementShiftSet, PlacementShiftSetVersion> versions() {
        return versions;
    }


    private <E extends BullhornEntity> AssociationField<PlacementShiftSet, E> instantiateAssociationField(String associationName, Class<E> associationType) {
        return new StandardAssociationField<PlacementShiftSet, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<PlacementShiftSet, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<PlacementShiftSet, ? extends BullhornEntity>>();
            allAssociations.add(versions());
        }
        return allAssociations;
    }

    @Override
    public AssociationField<PlacementShiftSet, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<PlacementShiftSet, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity PlacementShiftSet called: " + associationName);
    }
}
