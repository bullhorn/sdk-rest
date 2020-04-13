package com.bullhornsdk.data.model.entity.association.standard;


import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory class for Tearsheet Associations.
 * 
 * @author Magnus Fiore Palm
 * 
 */
public final class TearsheetAssociations implements EntityAssociations<Tearsheet> {

	private final AssociationField<Tearsheet, ClientContact> clientContacts = instantiateAssociationField("clientContacts", ClientContact.class);
	private final AssociationField<Tearsheet, Candidate> candidates = instantiateAssociationField("candidates", Candidate.class);
	private final AssociationField<Tearsheet, JobOrder> jobOrders = instantiateAssociationField("jobOrders", JobOrder.class);
	private final AssociationField<Tearsheet, Lead> leads = instantiateAssociationField("leads", Lead.class);
	private final AssociationField<Tearsheet, Opportunity> opportunities = instantiateAssociationField("opportunities", Opportunity.class);
	private List<AssociationField<Tearsheet, ? extends BullhornEntity>> allAssociations;
	private static final TearsheetAssociations INSTANCE = new TearsheetAssociations();

    public TearsheetAssociations() {
		super();
	}

	public static TearsheetAssociations getInstance() {
		return INSTANCE;
	}

	public AssociationField<Tearsheet, ClientContact> clientContacts() {
		return clientContacts;
	}

	public AssociationField<Tearsheet, Candidate> candidates() {
		return candidates;
	}

	public AssociationField<Tearsheet, JobOrder> jobOrders() {
		return jobOrders;
	}

	public AssociationField<Tearsheet, Lead> leads() {
		return leads;
	}

	public AssociationField<Tearsheet, Opportunity> opportunities() {
		return opportunities;
	}

	private <E extends BullhornEntity> AssociationField<Tearsheet, E> instantiateAssociationField(String associationName, Class<E> associationType) {
		return new StandardAssociationField<Tearsheet, E>(associationName, associationType);
	}

	@Override
	public List<AssociationField<Tearsheet, ? extends BullhornEntity>> allAssociations() {
		if (allAssociations == null) {
			allAssociations = new ArrayList<AssociationField<Tearsheet, ? extends BullhornEntity>>();
			allAssociations.add(clientContacts());
			allAssociations.add(candidates());
			allAssociations.add(jobOrders());
			allAssociations.add(leads());
			allAssociations.add(opportunities());
		}
		return allAssociations;
	}

	@Override
	public AssociationField<Tearsheet, ? extends BullhornEntity> getAssociation(String associationName) {
		for (AssociationField<Tearsheet, ? extends BullhornEntity> associationField : allAssociations()) {
			if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
				return associationField;
			}
		}

		throw new IllegalArgumentException("There is no association on entity Tearsheet called: " + associationName);
	}

}
