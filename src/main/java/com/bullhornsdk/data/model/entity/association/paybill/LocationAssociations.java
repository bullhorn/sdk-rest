package com.bullhornsdk.data.model.entity.association.paybill;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.association.standard.StandardAssociationField;
import com.bullhornsdk.data.model.entity.core.paybill.Location;
import com.bullhornsdk.data.model.entity.core.paybill.LocationVersion;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fayranne.lipton 4/10/2020
 */
public class LocationAssociations implements EntityAssociations<Location> {

    private List<AssociationField<Location, ? extends BullhornEntity>> allAssociations;
    private final AssociationField<Location, LocationVersion> versions = instantiateAssociationField("versions", LocationVersion.class);

    private static final LocationAssociations INSTANCE = new LocationAssociations();

    private LocationAssociations() {
        super();
    }

    public static LocationAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<Location, LocationVersion> versions() {
        return versions;
    }

    private <E extends BullhornEntity> AssociationField<Location, E> instantiateAssociationField(String associationName, Class<E> associationType) {
        return new StandardAssociationField<Location, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<Location, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<Location, ? extends BullhornEntity>>();
            allAssociations.add(versions());

        }
        return allAssociations;
    }

    @Override
    public AssociationField<Location, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<Location, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity Location called: " + associationName);
    }
}


