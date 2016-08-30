package com.bullhornsdk.data.model.entity.association.standard;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

public class CandidateWorkHistoryAssociations implements EntityAssociations<CandidateWorkHistory> {

	private final AssociationField<CandidateWorkHistory, Candidate> workHistories = instantiateAssociationField("workHistories", Candidate.class);

	private List<AssociationField<CandidateWorkHistory, ? extends BullhornEntity>> allAssociations;
	private static final CandidateWorkHistoryAssociations INSTANCE = new CandidateWorkHistoryAssociations();

	private CandidateWorkHistoryAssociations() {
		super();
	}

	public AssociationField<CandidateWorkHistory, Candidate> workHistories() {
		return workHistories;
	}

	public static CandidateWorkHistoryAssociations getInstance() {
		return INSTANCE;
	}

	private <E extends BullhornEntity> AssociationField<CandidateWorkHistory, E> instantiateAssociationField(String associationName,
	                                                                                                       Class<E> associationType) {
		return new StandardAssociationField<CandidateWorkHistory, E>(associationName, associationType);
	}

	@Override
	public List<AssociationField<CandidateWorkHistory, ? extends BullhornEntity>> allAssociations() {
		if (allAssociations == null) {
			allAssociations = new ArrayList<AssociationField<CandidateWorkHistory, ? extends BullhornEntity>>();
			allAssociations.add(workHistories());
		}
		return allAssociations;
	}

	@Override
	public AssociationField<CandidateWorkHistory, ? extends BullhornEntity> getAssociation(String associationName) {
		for (AssociationField<CandidateWorkHistory, ? extends BullhornEntity> associationField : allAssociations()) {
			if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
				return associationField;
			}
		}
		throw new IllegalArgumentException("There is no association on entity Candidate Work History called: " + associationName);
	}
}
