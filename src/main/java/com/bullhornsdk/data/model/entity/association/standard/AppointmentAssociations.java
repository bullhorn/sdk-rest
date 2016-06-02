package com.bullhornsdk.data.model.entity.association.standard;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.Appointment;
import com.bullhornsdk.data.model.entity.core.standard.AppointmentAttendee;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hiqbal on 6/2/2016.
 */
public class AppointmentAssociations implements EntityAssociations<Appointment> {

    private final AssociationField<Appointment, AppointmentAttendee> attendees = instantiateAssociationField("guests",
            AppointmentAttendee.class);
    private final AssociationField<Appointment, Appointment> childAppointments = instantiateAssociationField("childAppointments", Appointment.class);

    private List<AssociationField<Appointment, ? extends BullhornEntity>> allAssociations;

    private static final AppointmentAssociations INSTANCE = new AppointmentAssociations();

    private AppointmentAssociations() {
        super();
    }

    public static AppointmentAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<Appointment, AppointmentAttendee> attendees() {
        return attendees;
    }

    public AssociationField<Appointment, Appointment> childAppointments() {
        return childAppointments;
    }

    private <E extends BullhornEntity> AssociationField<Appointment, E> instantiateAssociationField(String associationName,
                                                                                                  Class<E> associationType) {
        return new StandardAssociationField<Appointment, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<Appointment, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<Appointment, ? extends BullhornEntity>>();
            allAssociations.add(attendees());
            allAssociations.add(childAppointments());
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
