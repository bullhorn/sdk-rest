package com.bullhornsdk.data.model.entity.association.standard;


import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.Appointment;
import com.bullhornsdk.data.model.entity.core.standard.AppointmentAttendee;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Factory class for Appointment Associations.
 * 
 * @author Anita Wu
 * 
 */
public final class AppointmentAssociations implements EntityAssociations<Appointment> {

	private final AssociationField<Appointment, AppointmentAttendee> appointmentAttendees = instantiateAssociationField("appointmentAttendees", AppointmentAttendee.class);
	private List<AssociationField<Appointment, ? extends BullhornEntity>> allAssociations;
	private static final AppointmentAssociations INSTANCE = new AppointmentAssociations();

	private AppointmentAssociations() {
		super();
	}

	public static AppointmentAssociations getInstance() {
		return INSTANCE;
	}

	public AssociationField<Appointment, AppointmentAttendee> appointmentAttendees() {
		return appointmentAttendees;
	}

	private <E extends BullhornEntity> AssociationField<Appointment, E> instantiateAssociationField(String associationName, Class<E> associationType) {
		return new StandardAssociationField<Appointment, E>(associationName, associationType);
	}

	@Override
	public List<AssociationField<Appointment, ? extends BullhornEntity>> allAssociations() {
		if (allAssociations == null) {
			allAssociations = new ArrayList<AssociationField<Appointment, ? extends BullhornEntity>>();
			allAssociations.add(appointmentAttendees());
		}
		return allAssociations;
	}

	@Override
	public AssociationField<Appointment, ? extends BullhornEntity> getAssociation(String associationName) {
		for (AssociationField<Appointment, ? extends BullhornEntity> associationField : allAssociations()) {
			if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
				return associationField;
			}
		}

		throw new IllegalArgumentException("There is no association on entity Appointment called: " + associationName);
	}

}
