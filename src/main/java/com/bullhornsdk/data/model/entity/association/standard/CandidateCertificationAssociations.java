package com.bullhornsdk.data.model.entity.association.standard;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateCertification;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

public class CandidateCertificationAssociations implements EntityAssociations<CandidateCertification> {

	private final AssociationField<CandidateCertification, Candidate> candidate = instantiateAssociationField("candidate", Candidate.class);
	private final AssociationField<CandidateCertification, Certification> certification = instantiateAssociationField("certification", Certification.class);
	private final AssociationField<CandidateCertification, CorporateUser> modifyingUser = instantiateAssociationField("modifyingUser", CorporateUser.class);

	private static final CandidateCertificationAssociations INSTANCE = new CandidateCertificationAssociations();
	private List<AssociationField<CandidateCertification, ? extends BullhornEntity>> allAssociations;
	private CandidateCertificationAssociations() {
		super();
	}

	public static CandidateCertificationAssociations getInstance() {
		return INSTANCE;
	}

	public AssociationField<CandidateCertification, Candidate> candidate() {
		return candidate;
	}

	public AssociationField<CandidateCertification, Certification> certification() {
		return certification;
	}

	public AssociationField<CandidateCertification, CorporateUser> modifyingUser() {
		return modifyingUser;
	}

	private <E extends BullhornEntity> AssociationField<CandidateCertification, E> instantiateAssociationField(String associationName, Class<E> associationType) {
		return new StandardAssociationField<CandidateCertification, E>(associationName, associationType);
	}

	@Override
	public List<AssociationField<CandidateCertification, ? extends BullhornEntity>> allAssociations() {
		if (allAssociations == null) {
			allAssociations = new ArrayList<AssociationField<CandidateCertification, ? extends BullhornEntity>>();
			allAssociations.add(candidate());
			allAssociations.add(certification());
			allAssociations.add(modifyingUser());
		}
		return allAssociations;
	}

	@Override
	public AssociationField<CandidateCertification, ? extends BullhornEntity> getAssociation(String associationName) {
		for (AssociationField<CandidateCertification, ? extends BullhornEntity> associationField : allAssociations()) {
			if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
				return associationField;
			}
		}

		throw new IllegalArgumentException("There is no association on entity Tearsheet called: " + associationName);
	}

}
