package com.bullhornsdk.data.model.entity.association.standard;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateFileAttachment;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

public class CandidateFileAttachmentAssociations implements EntityAssociations<CandidateFileAttachment> {

	private final AssociationField<CandidateFileAttachment, CorporateUser> usersSharedWith = instantiateAssociationField("usersSharedWidth", CorporateUser.class);
	private final AssociationField<CandidateFileAttachment, Candidate> candidate = instantiateAssociationField("candidate", Candidate.class);

	private List<AssociationField<CandidateFileAttachment, ? extends BullhornEntity>> allAssociations;
	private static final CandidateFileAttachmentAssociations INSTANCE = new CandidateFileAttachmentAssociations();

	private CandidateFileAttachmentAssociations() {
		super();
	}

	public static CandidateFileAttachmentAssociations getInstance() {
		return INSTANCE;
	}

	private <E extends BullhornEntity> AssociationField<CandidateFileAttachment, E> instantiateAssociationField(String associationName,
	                                                                                                       Class<E> associationType) {
		return new StandardAssociationField<CandidateFileAttachment, E>(associationName, associationType);
	}

	public AssociationField<CandidateFileAttachment, CorporateUser> usersSharedWith() {
		return usersSharedWith;
	}
	public AssociationField<CandidateFileAttachment, Candidate> candidate() {
		return candidate;
	}

	@Override
	public List<AssociationField<CandidateFileAttachment, ? extends BullhornEntity>> allAssociations() {
		if (allAssociations == null) {
			allAssociations = new ArrayList<AssociationField<CandidateFileAttachment, ? extends BullhornEntity>>();
			allAssociations.add(usersSharedWith());
			allAssociations.add(candidate());
		}
		return allAssociations;
	}

	@Override
	public AssociationField<CandidateFileAttachment, ? extends BullhornEntity> getAssociation(String associationName) {
		for (AssociationField<CandidateFileAttachment, ? extends BullhornEntity> associationField : allAssociations()) {
			if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
				return associationField;
			}
		}
		throw new IllegalArgumentException("There is no association on entity Candidate Education called: " + associationName);
	}
}
