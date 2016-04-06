package com.bullhornsdk.data.model.entity.association;

import com.bullhornsdk.data.model.entity.association.standard.*;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Central factory class when dealing with entity associations. In most cases client code will only need to deal with this factory
 * class. This class, and the underlying EntityAssociations<T extends AssociationEntity>, ensures type safety and that only valid associations are used when accessing the REST api.
 * 
 * @author magnus.palm
 * 
 */
public class AssociationFactory {

    private static final CandidateAssociations candidateAssociations = CandidateAssociations.getInstance();
    private static final CategoryAssociations categoryAssociations = CategoryAssociations.getInstance();
    private static final ClientContactAssociations clientContactAssociations = ClientContactAssociations.getInstance();
    private static final ClientCorporationAssociations clientCorporationAssociations = ClientCorporationAssociations
            .getInstance();
    private static final JobOrderAssociations jobOrderAssociations = JobOrderAssociations.getInstance();
    private static final NoteAssociations noteAssociations = NoteAssociations.getInstance();
    private static final PlacementAssociations placementAssociations = PlacementAssociations.getInstance();
    private static final OpportunityAssociations opportunityAssociations = OpportunityAssociations.getInstance();
    private static final LeadAssociations leadAssociations = LeadAssociations.getInstance();
    private static final TearsheetAssociations tearsheetAssociations = TearsheetAssociations.getInstance();
    private static final AppointmentAssociations appointmentAssociations = AppointmentAssociations.getInstance();

    /**
     * Returns the AssociationField for the passed in entity type (Candiate, ClientContact etc.), with the association name of the
     * passed in assocationName.
     * 
     * <b> NOTE: for type safety use candidateAssociations(),categoryAssociations() etc. instead! </b>
     * 
     * @throws IllegalArgumentException
     *             if no association with the assocationName exists in the type.
     * 
     * @param type
     * @param associationName
     * @return
     */
    public static <T extends AssociationEntity> AssociationField<T, ? extends BullhornEntity> getAssociationField(Class<T> type,
            String associationName) {

        EntityAssociations<T> entityAssociations = getEntityAssociation(type, associationName);

        return entityAssociations.getAssociation(associationName);

    }

    @SuppressWarnings("unchecked")
    private static <T extends AssociationEntity> EntityAssociations<T> getEntityAssociation(Class<T> type, String associationName) {

        if (type == Candidate.class) {
            return (EntityAssociations<T>) candidateAssociations;
        }

        if (type == Category.class) {
            return (EntityAssociations<T>) categoryAssociations;
        }

        if (type == ClientContact.class) {
            return (EntityAssociations<T>) clientContactAssociations;
        }

        if (type == ClientCorporation.class) {
            return (EntityAssociations<T>) clientCorporationAssociations;
        }

        if (type == JobOrder.class) {
            return (EntityAssociations<T>) jobOrderAssociations;
        }

        if (type == Note.class) {
            return (EntityAssociations<T>) noteAssociations;
        }

        if (type == Placement.class) {
            return (EntityAssociations<T>) placementAssociations;
        }

        if (type == Opportunity.class) {
            return (EntityAssociations<T>) opportunityAssociations;
        }

        if (type == Lead.class) {
            return (EntityAssociations<T>) leadAssociations;
        }

        if (type == Tearsheet.class) {
            return (EntityAssociations<T>) tearsheetAssociations;
        }

        if (type == Appointment.class) {
            return (EntityAssociations<T>) appointmentAssociations;
        }

        return null;

    }

    /**
     * Returns the associations for Candidate
     * 
     * @return
     */
    public static CandidateAssociations candidateAssociations() {
        return candidateAssociations;
    }

    /**
     * Returns the associations for Category
     * 
     * @return
     */
    public static CategoryAssociations categoryAssociations() {
        return categoryAssociations;
    }

    /**
     * Returns the associations for ClientContact
     * 
     * @return
     */
    public static ClientContactAssociations clientContactAssociations() {
        return clientContactAssociations;
    }

    /**
     * Returns the associations for ClientCorporation
     * 
     * @return
     */
    public static ClientCorporationAssociations clientCorporationAssociations() {
        return clientCorporationAssociations;
    }

    /**
     * Returns the associations for JobOrder
     * 
     * @return
     */
    public static JobOrderAssociations jobOrderAssociations() {
        return jobOrderAssociations;
    }

    /**
     * Returns the associations for Note
     * 
     * @return
     */
    public static NoteAssociations noteAssociations() {
        return noteAssociations;
    }

    /**
     * Returns the associations for Placement
     * 
     * @return
     */
    public static PlacementAssociations placementAssociations() {
        return placementAssociations;
    }

    /**
     * Returns the associations for Opportunity
     *
     * @return
     */
    public static OpportunityAssociations opportunityAssociations() {
        return opportunityAssociations;
    }

    /**
     * Returns the associations for Lead
     *
     * @return
     */
    public static LeadAssociations leadAssociations() {
        return leadAssociations;
    }

    /**
     * Returns the associations for Tearsheet
     *
     * @return
     */
    public static TearsheetAssociations tearsheetAssociations() {
        return tearsheetAssociations;
    }

    /**
     * Returns the associations for Appointment
     *
     * @return
     */
    public static AppointmentAssociations appointmentAssociations() {
        return appointmentAssociations;
    }

}
