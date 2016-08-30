package com.bullhornsdk.data.model.entity.association.standard;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.ClientContactFileAttachment;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

public class ClientContactFileAttachmentAssociations implements EntityAssociations<ClientContactFileAttachment> {


	private final AssociationField<ClientContactFileAttachment, CorporateUser> usersSharedWith = instantiateAssociationField("usersSharedWidth", CorporateUser.class);

	private List<AssociationField<ClientContactFileAttachment, ? extends BullhornEntity>> allAssociations;
	private static final ClientContactFileAttachmentAssociations INSTANCE = new ClientContactFileAttachmentAssociations();

	private ClientContactFileAttachmentAssociations() {
		super();
	}

	public static ClientContactFileAttachmentAssociations getInstance() {
		return INSTANCE;
	}

	private <E extends BullhornEntity> AssociationField<ClientContactFileAttachment, E> instantiateAssociationField(String associationName,
	                                                                                                            Class<E> associationType) {
		return new StandardAssociationField<ClientContactFileAttachment, E>(associationName, associationType);
	}

	public AssociationField<ClientContactFileAttachment, CorporateUser> usersSharedWith() {
		return usersSharedWith;
	}

	@Override
	public List<AssociationField<ClientContactFileAttachment, ? extends BullhornEntity>> allAssociations() {
		if (allAssociations == null) {
			allAssociations = new ArrayList<AssociationField<ClientContactFileAttachment, ? extends BullhornEntity>>();
			allAssociations.add(usersSharedWith());
		}
		return allAssociations;
	}

	@Override
	public AssociationField<ClientContactFileAttachment, ? extends BullhornEntity> getAssociation(String associationName) {
		for (AssociationField<ClientContactFileAttachment, ? extends BullhornEntity> associationField : allAssociations()) {
			if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
				return associationField;
			}
		}
		throw new IllegalArgumentException("There is no association on entity Candidate Education called: " + associationName);
	}
}
