package com.bullhornsdk.data.model.entity.association.standard;


import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.WorkersCompensation;
import com.bullhornsdk.data.model.entity.core.standard.WorkersCompensationRate;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Factory class for Tearsheet Associations.
 * 
 * @author Magnus Fiore Palm
 * 
 */
public final class WorkersCompensationAssociations implements EntityAssociations<WorkersCompensation> {

	private final AssociationField<WorkersCompensation, WorkersCompensationRate> rates = instantiateAssociationField("rates", WorkersCompensationRate.class);
	private List<AssociationField<WorkersCompensation, ? extends BullhornEntity>> allAssociations;
	private static final WorkersCompensationAssociations INSTANCE = new WorkersCompensationAssociations();

    public WorkersCompensationAssociations() {
		super();
	}

	public static WorkersCompensationAssociations getInstance() {
		return INSTANCE;
	}

	public AssociationField<WorkersCompensation, WorkersCompensationRate> rates() {
		return rates;
	}

	private <E extends BullhornEntity> AssociationField<WorkersCompensation, E> instantiateAssociationField(String associationName, Class<E> associationType) {
		return new StandardAssociationField<WorkersCompensation, E>(associationName, associationType);
	}

	@Override
	public List<AssociationField<WorkersCompensation, ? extends BullhornEntity>> allAssociations() {
		if (allAssociations == null) {
			allAssociations = new ArrayList<>();
			allAssociations.add(rates());
		}
		return allAssociations;
	}

	@Override
	public AssociationField<WorkersCompensation, ? extends BullhornEntity> getAssociation(String associationName) {
		for (AssociationField<WorkersCompensation, ? extends BullhornEntity> associationField : allAssociations()) {
			if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
				return associationField;
			}
		}

		throw new IllegalArgumentException("There is no association on entity Tearsheet called: " + associationName);
	}

}
