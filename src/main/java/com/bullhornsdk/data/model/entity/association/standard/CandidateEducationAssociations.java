package com.bullhornsdk.data.model.entity.association.standard;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

public final class CandidateEducationAssociations implements EntityAssociations<CandidateEducation> {

	private AssociationField<CandidateEducation, Candidate> candidate = instantiateAssociationField("candidate", Candidate.class);
	private List<AssociationField<CandidateEducation, ? extends BullhornEntity>> allAssociations;
	private static final CandidateEducationAssociations INSTANCE = new CandidateEducationAssociations();

	private CandidateEducationAssociations() {
		super();
	}


	public static CandidateEducationAssociations getInstance() {
		return INSTANCE;
	}

	private <E extends BullhornEntity> AssociationField<CandidateEducation, E> instantiateAssociationField(String associationName,
	                                                                                                Class<E> associationType) {
		return new StandardAssociationField<CandidateEducation, E>(associationName, associationType);
	}

	public AssociationField<CandidateEducation, Candidate> candidate() {
		return candidate;
	}

	@Override
	public List<AssociationField<CandidateEducation, ? extends BullhornEntity>> allAssociations() {
		if (allAssociations == null) {
			allAssociations = new ArrayList<AssociationField<CandidateEducation, ? extends BullhornEntity>>();
			allAssociations.add(candidate());
		}
		return allAssociations;
	}

	@Override
	public AssociationField<CandidateEducation, ? extends BullhornEntity> getAssociation(String associationName) {
		for (AssociationField<CandidateEducation, ? extends BullhornEntity> associationField : allAssociations()) {
			if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
				return associationField;
			}
		}
		throw new IllegalArgumentException("There is no association on entity Candidate Education called: " + associationName);
	}
}
