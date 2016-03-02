package com.bullhornsdk.data.model.enums;


import com.bullhornsdk.data.model.entity.core.customobject.*;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.response.list.*;
import com.bullhornsdk.data.model.response.list.customobject.*;
import com.bullhornsdk.data.model.response.single.*;
import com.bullhornsdk.data.model.response.single.customobject.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Enum that contains the following information about the RestEntities:
 * 
 * 1. The pretty name.
 * 
 * 2. The BullhornEntity specific Class<T>
 * 
 * 3. The ListWrapper<T> class that wraps a list of RestEntities for query/search type requests.
 * 
 * 4. Mapping between Class<T> and its name.
 * 
 * 5. Mapping between Class<T> and its ListWrapper<T>.
 * 
 * @author magnus.palm
 * 
 */
public enum BullhornEntityInfo {

    ADDRESS("Address", null, null, null),
    APPOINTMENT("Appointment", Appointment.class, AppointmentWrapper.class, AppointmentListWrapper.class),
    APPOINTMENT_ATTENDEE("AppointmentAttendee", AppointmentAttendee.class, AppointmentAttendeeWrapper.class,
            AppointmentAttendeeListWrapper.class),
    BUSINESS_SECTOR("BusinessSector", BusinessSector.class, BusinessSectorWrapper.class, BusinessSectorListWrapper.class),
    CANDIDATE("Candidate", Candidate.class, CandidateWrapper.class, CandidateListWrapper.class),
    CANDIDATE_EDUCATION("CandidateEducation", CandidateEducation.class, CandidateEducationWrapper.class,
            CandidateEducationListWrapper.class),
    CANDIDATE_REFERENCE("CandidateReference", CandidateReference.class, CandidateReferenceWrapper.class,
            CandidateReferenceListWrapper.class),
    CANDIDATE_WORK_HISTORY("CandidateWorkHistory", CandidateWorkHistory.class, CandidateWorkHistoryWrapper.class,
            CandidateWorkHistoryListWrapper.class),
    CATEGORY("Category", Category.class, CategoryWrapper.class, CategoryListWrapper.class),
    CERTIFICATION("Certification", Certification.class, CertificationWrapper.class, CertificationListWrapper.class),
    CLIENT_CONTACT("ClientContact", ClientContact.class, ClientContactWrapper.class, ClientContactListWrapper.class),
    CLIENT_CORPORATION("ClientCorporation", ClientCorporation.class, ClientCorporationWrapper.class,
            ClientCorporationListWrapper.class),
    CORPORATE_USER("CorporateUser", CorporateUser.class, CorporateUserWrapper.class, CorporateUserListWrapper.class),
    CORPORATION_DEPARTMENT("CorporationDepartment", CorporationDepartment.class, CorporationDepartmentWrapper.class,
            CorporationDepartmentListWrapper.class),
    COUNTRY("Country", Country.class, CountryWrapper.class, CountryListWrapper.class),
    HOUSING_COMPLEX("HousingComplex", HousingComplex.class, HousingComplexWrapper.class, HousingComplexListWrapper.class),
    JOB_ORDER("JobOrder", JobOrder.class, JobOrderWrapper.class, JobOrderListWrapper.class),
    JOB_SUBMISSION("JobSubmission", JobSubmission.class, JobSubmissionWrapper.class, JobSubmissionListWrapper.class),
    JOB_SUBMISSION_HISTORY("JobSubmissionHistory", JobSubmissionHistory.class, JobSubmissionHistoryWrapper.class, JobSubmissionHistoryListWrapper.class),
    LEAD("Lead", Lead.class, LeadWrapper.class, LeadListWrapper.class),
    LOGIN_RESTRICTIONS("LoginRestrictions", null, null, null),
    NOTE("Note", Note.class, NoteWrapper.class, NoteListWrapper.class),
    NOTE_ENTITY("NoteEntity", NoteEntity.class, NoteEntityWrapper.class, NoteEntityListWrapper.class),
    OPPORTUNITY("Opportunity", Opportunity.class, OpportunityWrapper.class, OpportunityListWrapper.class),
    PLACEMENT("Placement", Placement.class, PlacementWrapper.class, PlacementListWrapper.class),
    PLACEMENT_CHANGE_REQUEST("PlacementChangeRequest", PlacementChangeRequest.class, PlacementChangeRequestWrapper.class,
            PlacementChangeRequestListWrapper.class),
    PLACEMENT_COMMISSION("PlacementCommission", PlacementCommission.class, PlacementCommissionWrapper.class,
            PlacementCommissionListWrapper.class),
    SENDOUT("Sendout", Sendout.class, SendoutWrapper.class, SendoutListWrapper.class),
    SKILL("Skill", Skill.class, SkillWrapper.class, SkillListWrapper.class),
    SPECIALTY("Specialty", Specialty.class, SpecialtyWrapper.class, SpecialtyListWrapper.class),
    STATE("State", State.class, StateWrapper.class, StateListWrapper.class),
    TASK("Task", Task.class, TaskWrapper.class, TaskListWrapper.class),
    TEARSHEET("Tearsheet", Tearsheet.class, TearsheetWrapper.class, TearsheetListWrapper.class),
    TIME_UNIT("TimeUnit", TimeUnit.class, TimeUnitWrapper.class, TimeUnitListWrapper.class),

    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_1("JobOrderCustomObjectInstance1", JobOrderCustomObjectInstance1.class, JobOrderCustomObjectInstance1Wrapper.class, JobOrderCustomObjectInstance1ListWrapper.class),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_2("JobOrderCustomObjectInstance2", JobOrderCustomObjectInstance2.class, JobOrderCustomObjectInstance2Wrapper.class, JobOrderCustomObjectInstance2ListWrapper.class),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_3("JobOrderCustomObjectInstance3", JobOrderCustomObjectInstance3.class, JobOrderCustomObjectInstance3Wrapper.class, JobOrderCustomObjectInstance3ListWrapper.class),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_4("JobOrderCustomObjectInstance4", JobOrderCustomObjectInstance4.class, JobOrderCustomObjectInstance4Wrapper.class, JobOrderCustomObjectInstance4ListWrapper.class),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_5("JobOrderCustomObjectInstance5", JobOrderCustomObjectInstance5.class, JobOrderCustomObjectInstance5Wrapper.class, JobOrderCustomObjectInstance5ListWrapper.class),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_6("JobOrderCustomObjectInstance6", JobOrderCustomObjectInstance6.class, JobOrderCustomObjectInstance6Wrapper.class, JobOrderCustomObjectInstance6ListWrapper.class),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_7("JobOrderCustomObjectInstance7", JobOrderCustomObjectInstance7.class, JobOrderCustomObjectInstance7Wrapper.class, JobOrderCustomObjectInstance7ListWrapper.class),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_8("JobOrderCustomObjectInstance8", JobOrderCustomObjectInstance8.class, JobOrderCustomObjectInstance8Wrapper.class, JobOrderCustomObjectInstance8ListWrapper.class),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_9("JobOrderCustomObjectInstance9", JobOrderCustomObjectInstance9.class, JobOrderCustomObjectInstance9Wrapper.class, JobOrderCustomObjectInstance9ListWrapper.class),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_10("JobOrderCustomObjectInstance10", JobOrderCustomObjectInstance10.class, JobOrderCustomObjectInstance10Wrapper.class, JobOrderCustomObjectInstance10ListWrapper.class),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_1("PlacementCustomObjectInstance1", PlacementCustomObjectInstance1.class, PlacementCustomObjectInstance1Wrapper.class, PlacementCustomObjectInstance1ListWrapper.class),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_2("PlacementCustomObjectInstance2", PlacementCustomObjectInstance2.class, PlacementCustomObjectInstance2Wrapper.class, PlacementCustomObjectInstance2ListWrapper.class),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_3("PlacementCustomObjectInstance3", PlacementCustomObjectInstance3.class, PlacementCustomObjectInstance3Wrapper.class, PlacementCustomObjectInstance3ListWrapper.class),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_4("PlacementCustomObjectInstance4", PlacementCustomObjectInstance4.class, PlacementCustomObjectInstance4Wrapper.class, PlacementCustomObjectInstance4ListWrapper.class),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_5("PlacementCustomObjectInstance5", PlacementCustomObjectInstance5.class, PlacementCustomObjectInstance5Wrapper.class, PlacementCustomObjectInstance5ListWrapper.class),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_6("PlacementCustomObjectInstance6", PlacementCustomObjectInstance6.class, PlacementCustomObjectInstance6Wrapper.class, PlacementCustomObjectInstance6ListWrapper.class),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_7("PlacementCustomObjectInstance7", PlacementCustomObjectInstance7.class, PlacementCustomObjectInstance7Wrapper.class, PlacementCustomObjectInstance7ListWrapper.class),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_8("PlacementCustomObjectInstance8", PlacementCustomObjectInstance8.class, PlacementCustomObjectInstance8Wrapper.class, PlacementCustomObjectInstance8ListWrapper.class),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_9("PlacementCustomObjectInstance9", PlacementCustomObjectInstance9.class, PlacementCustomObjectInstance9Wrapper.class, PlacementCustomObjectInstance9ListWrapper.class),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_10("PlacementCustomObjectInstance10", PlacementCustomObjectInstance10.class, PlacementCustomObjectInstance10Wrapper.class, PlacementCustomObjectInstance10ListWrapper.class),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_1("ClientCorporationCustomObjectInstance1", ClientCorporationCustomObjectInstance1.class, ClientCorporationCustomObjectInstance1Wrapper.class, ClientCorporationCustomObjectInstance1ListWrapper.class),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_2("ClientCorporationCustomObjectInstance2", ClientCorporationCustomObjectInstance2.class, ClientCorporationCustomObjectInstance2Wrapper.class, ClientCorporationCustomObjectInstance2ListWrapper.class),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_3("ClientCorporationCustomObjectInstance3", ClientCorporationCustomObjectInstance3.class, ClientCorporationCustomObjectInstance3Wrapper.class, ClientCorporationCustomObjectInstance3ListWrapper.class),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_4("ClientCorporationCustomObjectInstance4", ClientCorporationCustomObjectInstance4.class, ClientCorporationCustomObjectInstance4Wrapper.class, ClientCorporationCustomObjectInstance4ListWrapper.class),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_5("ClientCorporationCustomObjectInstance5", ClientCorporationCustomObjectInstance5.class, ClientCorporationCustomObjectInstance5Wrapper.class, ClientCorporationCustomObjectInstance5ListWrapper.class),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_6("ClientCorporationCustomObjectInstance6", ClientCorporationCustomObjectInstance6.class, ClientCorporationCustomObjectInstance6Wrapper.class, ClientCorporationCustomObjectInstance6ListWrapper.class),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_7("ClientCorporationCustomObjectInstance7", ClientCorporationCustomObjectInstance7.class, ClientCorporationCustomObjectInstance7Wrapper.class, ClientCorporationCustomObjectInstance7ListWrapper.class),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_8("ClientCorporationCustomObjectInstance8", ClientCorporationCustomObjectInstance8.class, ClientCorporationCustomObjectInstance8Wrapper.class, ClientCorporationCustomObjectInstance8ListWrapper.class),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_9("ClientCorporationCustomObjectInstance9", ClientCorporationCustomObjectInstance9.class, ClientCorporationCustomObjectInstance9Wrapper.class, ClientCorporationCustomObjectInstance9ListWrapper.class),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_10("ClientCorporationCustomObjectInstance10", ClientCorporationCustomObjectInstance10.class, ClientCorporationCustomObjectInstance10Wrapper.class, ClientCorporationCustomObjectInstance10ListWrapper.class),
    PERSON_CUSTOM_OBJECT_INSTANCE_1("PersonCustomObjectInstance1", PersonCustomObjectInstance1.class, PersonCustomObjectInstance1Wrapper.class, PersonCustomObjectInstance1ListWrapper.class),
    PERSON_CUSTOM_OBJECT_INSTANCE_2("PersonCustomObjectInstance2", PersonCustomObjectInstance2.class, PersonCustomObjectInstance2Wrapper.class, PersonCustomObjectInstance2ListWrapper.class),
    PERSON_CUSTOM_OBJECT_INSTANCE_3("PersonCustomObjectInstance3", PersonCustomObjectInstance3.class, PersonCustomObjectInstance3Wrapper.class, PersonCustomObjectInstance3ListWrapper.class),
    PERSON_CUSTOM_OBJECT_INSTANCE_4("PersonCustomObjectInstance4", PersonCustomObjectInstance4.class, PersonCustomObjectInstance4Wrapper.class, PersonCustomObjectInstance4ListWrapper.class),
    PERSON_CUSTOM_OBJECT_INSTANCE_5("PersonCustomObjectInstance5", PersonCustomObjectInstance5.class, PersonCustomObjectInstance5Wrapper.class, PersonCustomObjectInstance5ListWrapper.class),
    PERSON_CUSTOM_OBJECT_INSTANCE_6("PersonCustomObjectInstance6", PersonCustomObjectInstance6.class, PersonCustomObjectInstance6Wrapper.class, PersonCustomObjectInstance6ListWrapper.class),
    PERSON_CUSTOM_OBJECT_INSTANCE_7("PersonCustomObjectInstance7", PersonCustomObjectInstance7.class, PersonCustomObjectInstance7Wrapper.class, PersonCustomObjectInstance7ListWrapper.class),
    PERSON_CUSTOM_OBJECT_INSTANCE_8("PersonCustomObjectInstance8", PersonCustomObjectInstance8.class, PersonCustomObjectInstance8Wrapper.class, PersonCustomObjectInstance8ListWrapper.class),
    PERSON_CUSTOM_OBJECT_INSTANCE_9("PersonCustomObjectInstance9", PersonCustomObjectInstance9.class, PersonCustomObjectInstance9Wrapper.class, PersonCustomObjectInstance9ListWrapper.class),
    PERSON_CUSTOM_OBJECT_INSTANCE_10("PersonCustomObjectInstance10", PersonCustomObjectInstance10.class, PersonCustomObjectInstance10Wrapper.class, PersonCustomObjectInstance10ListWrapper.class)
    ;

    private final String name;

    private final Class<?> type;

    private final Class<? extends Wrapper<?>> wrapperType;

    private final Class<? extends ListWrapper<?>> listWrapperType;

    private static Map<Class<?>, BullhornEntityInfo> classToRestEntityName;

    <T extends BullhornEntity> BullhornEntityInfo(String name, Class<T> type, Class<? extends Wrapper<T>> wrapperType,
                                                  Class<? extends ListWrapper<T>> listWrapperType) {
        this.name = name;
        this.type = type;
        this.wrapperType = wrapperType;
        this.listWrapperType = listWrapperType;
    }

    /**
     * Returns the case sensitive name that should be used in bh rest api calls.
     * 
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the type of the wrapper for this BullhornEntity
     * 
     * @return
     */
    public <T extends BullhornEntity, E extends Wrapper<T>> Class<E> getWrapperType() {
        return (Class<E>) wrapperType;
    }

    /**
     * Returns the BullhornEntity class.
     * 
     * @return
     */
    public <T extends BullhornEntity> Class<T> getType() {
        return (Class<T>) type;
    }

    /**
     * Returns a list of all RestEntityNames
     * 
     * @return
     */
    public List<BullhornEntityInfo> getAllEntities() {
        return Arrays.asList(BullhornEntityInfo.values());
    }

    /**
     * Returns the wrapper class for the BullhornEntity Class<T>
     * 
     * @param type
     *            the BullhornEntity class
     * @return
     */
    public static <T extends BullhornEntity, E extends Wrapper<T>> Class<E> getTypesWrapperType(Class<T> type) {
        return (Class<E>) BullhornEntityInfo.getTypesRestEntityName(type).wrapperType;

    }

    /**
     * Returns the list wrapper class for the BullhornEntity Class<T>
     * 
     * @param type
     * @return
     */
    public static <T extends BullhornEntity, E extends ListWrapper<T>> Class<E> getTypesListWrapperType(Class<T> type) {
        return (Class<E>) BullhornEntityInfo.getTypesRestEntityName(type).listWrapperType;

    }

    /**
     * Returns the pretty name for a BullhornEntity Class<T>
     * 
     * @param type
     * @return
     */
    public static <T extends BullhornEntity> String getTypesName(Class<T> type) {
        return BullhornEntityInfo.getTypesRestEntityName(type).name;

    }

    /**
     * Returns the BullhornEntityInfo for the BullhornEntity Class<T> passed in
     * 
     * @param type
     * @return
     */
    public static <T extends BullhornEntity> BullhornEntityInfo getTypesRestEntityName(Class<T> type) {
        if (BullhornEntityInfo.classToRestEntityName == null) {
            BullhornEntityInfo.initMapping();
        }

        BullhornEntityInfo value = BullhornEntityInfo.classToRestEntityName.get(type);

        if (value == null) {
            BullhornEntityInfo.initMapping();
        } else {
            return value;
        }

        return BullhornEntityInfo.classToRestEntityName.get(type);

    }

    /**
     * Returns the BullhornEntityInfo for the name of the BullhornEntity passed in. Not case sensitive.
     * 
     * @param name
     * @return
     */
    public static BullhornEntityInfo getTypeFromName(String name) {

        for (BullhornEntityInfo bullhornEntityInfo : BullhornEntityInfo.values()) {
            if (bullhornEntityInfo.getName().equalsIgnoreCase(name)) {
                return bullhornEntityInfo;
            }
        }
        throw new IllegalArgumentException("No BullhornEntity exists with the name: " + name);

    }

    private synchronized static void initMapping() {
        classToRestEntityName = new HashMap<Class<?>, BullhornEntityInfo>();
        for (BullhornEntityInfo s : values()) {
            classToRestEntityName.put(s.type, s);
        }
    }

}
