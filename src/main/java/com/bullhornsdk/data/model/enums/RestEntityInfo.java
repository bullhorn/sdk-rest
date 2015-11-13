package com.bullhornsdk.data.model.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bullhornsdk.data.model.entity.core.standard.Appointment;
import com.bullhornsdk.data.model.entity.core.standard.AppointmentAttendee;
import com.bullhornsdk.data.model.entity.core.standard.BusinessSector;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation;
import com.bullhornsdk.data.model.entity.core.standard.CandidateReference;
import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.CorporationDepartment;
import com.bullhornsdk.data.model.entity.core.standard.Country;
import com.bullhornsdk.data.model.entity.core.standard.HousingComplex;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmissionHistory;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.NoteEntity;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;
import com.bullhornsdk.data.model.entity.core.standard.Sendout;
import com.bullhornsdk.data.model.entity.core.standard.Skill;
import com.bullhornsdk.data.model.entity.core.standard.Specialty;
import com.bullhornsdk.data.model.entity.core.standard.State;
import com.bullhornsdk.data.model.entity.core.standard.Task;
import com.bullhornsdk.data.model.entity.core.standard.TimeUnit;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.response.list.AppointmentAttendeeListWrapper;
import com.bullhornsdk.data.model.response.list.AppointmentListWrapper;
import com.bullhornsdk.data.model.response.list.BusinessSectorListWrapper;
import com.bullhornsdk.data.model.response.list.CandidateEducationListWrapper;
import com.bullhornsdk.data.model.response.list.CandidateListWrapper;
import com.bullhornsdk.data.model.response.list.CandidateReferenceListWrapper;
import com.bullhornsdk.data.model.response.list.CandidateWorkHistoryListWrapper;
import com.bullhornsdk.data.model.response.list.CategoryListWrapper;
import com.bullhornsdk.data.model.response.list.CertificationListWrapper;
import com.bullhornsdk.data.model.response.list.ClientContactListWrapper;
import com.bullhornsdk.data.model.response.list.ClientCorporationListWrapper;
import com.bullhornsdk.data.model.response.list.CorporateUserListWrapper;
import com.bullhornsdk.data.model.response.list.CorporationDepartmentListWrapper;
import com.bullhornsdk.data.model.response.list.CountryListWrapper;
import com.bullhornsdk.data.model.response.list.HousingComplexListWrapper;
import com.bullhornsdk.data.model.response.list.JobOrderListWrapper;
import com.bullhornsdk.data.model.response.list.JobSubmissionHistoryListWrapper;
import com.bullhornsdk.data.model.response.list.JobSubmissionListWrapper;
import com.bullhornsdk.data.model.response.list.LeadListWrapper;
import com.bullhornsdk.data.model.response.list.ListWrapper;
import com.bullhornsdk.data.model.response.list.NoteEntityListWrapper;
import com.bullhornsdk.data.model.response.list.NoteListWrapper;
import com.bullhornsdk.data.model.response.list.OpportunityListWrapper;
import com.bullhornsdk.data.model.response.list.PlacementChangeRequestListWrapper;
import com.bullhornsdk.data.model.response.list.PlacementCommissionListWrapper;
import com.bullhornsdk.data.model.response.list.PlacementListWrapper;
import com.bullhornsdk.data.model.response.list.SendoutListWrapper;
import com.bullhornsdk.data.model.response.list.SkillListWrapper;
import com.bullhornsdk.data.model.response.list.SpecialtyListWrapper;
import com.bullhornsdk.data.model.response.list.StateListWrapper;
import com.bullhornsdk.data.model.response.list.TaskListWrapper;
import com.bullhornsdk.data.model.response.list.TimeUnitListWrapper;
import com.bullhornsdk.data.model.response.single.AppointmentAttendeeWrapper;
import com.bullhornsdk.data.model.response.single.AppointmentWrapper;
import com.bullhornsdk.data.model.response.single.BusinessSectorWrapper;
import com.bullhornsdk.data.model.response.single.CandidateEducationWrapper;
import com.bullhornsdk.data.model.response.single.CandidateReferenceWrapper;
import com.bullhornsdk.data.model.response.single.CandidateWorkHistoryWrapper;
import com.bullhornsdk.data.model.response.single.CandidateWrapper;
import com.bullhornsdk.data.model.response.single.CategoryWrapper;
import com.bullhornsdk.data.model.response.single.CertificationWrapper;
import com.bullhornsdk.data.model.response.single.ClientContactWrapper;
import com.bullhornsdk.data.model.response.single.ClientCorporationWrapper;
import com.bullhornsdk.data.model.response.single.CorporateUserWrapper;
import com.bullhornsdk.data.model.response.single.CorporationDepartmentWrapper;
import com.bullhornsdk.data.model.response.single.CountryWrapper;
import com.bullhornsdk.data.model.response.single.HousingComplexWrapper;
import com.bullhornsdk.data.model.response.single.JobOrderWrapper;
import com.bullhornsdk.data.model.response.single.JobSubmissionHistoryWrapper;
import com.bullhornsdk.data.model.response.single.JobSubmissionWrapper;
import com.bullhornsdk.data.model.response.single.LeadWrapper;
import com.bullhornsdk.data.model.response.single.NoteEntityWrapper;
import com.bullhornsdk.data.model.response.single.NoteWrapper;
import com.bullhornsdk.data.model.response.single.OpportunityWrapper;
import com.bullhornsdk.data.model.response.single.PlacementChangeRequestWrapper;
import com.bullhornsdk.data.model.response.single.PlacementCommissionWrapper;
import com.bullhornsdk.data.model.response.single.PlacementWrapper;
import com.bullhornsdk.data.model.response.single.SendoutWrapper;
import com.bullhornsdk.data.model.response.single.SkillWrapper;
import com.bullhornsdk.data.model.response.single.SpecialtyWrapper;
import com.bullhornsdk.data.model.response.single.StateWrapper;
import com.bullhornsdk.data.model.response.single.TaskWrapper;
import com.bullhornsdk.data.model.response.single.TimeUnitWrapper;
import com.bullhornsdk.data.model.response.single.Wrapper;

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
public enum RestEntityInfo {

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
    TIME_UNIT("TimeUnit", TimeUnit.class, TimeUnitWrapper.class, TimeUnitListWrapper.class);

    private final String name;

    private final Class<?> type;

    private final Class<? extends Wrapper<?>> wrapperType;

    private final Class<? extends ListWrapper<?>> listWrapperType;

    private static Map<Class<?>, RestEntityInfo> classToRestEntityName;

    private RestEntityInfo(String name, Class<?> type, Class<? extends Wrapper<?>> wrapperType,
            Class<? extends ListWrapper<?>> listWrapperType) {
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
    public List<RestEntityInfo> getAllEntities() {
        return Arrays.asList(RestEntityInfo.values());
    }

    /**
     * Returns the wrapper class for the BullhornEntity Class<T>
     * 
     * @param type
     *            the BullhornEntity class
     * @return
     */
    public static <T extends BullhornEntity, E extends Wrapper<T>> Class<E> getTypesWrapperType(Class<T> type) {
        return (Class<E>) RestEntityInfo.getTypesRestEntityName(type).wrapperType;

    }

    /**
     * Returns the list wrapper class for the BullhornEntity Class<T>
     * 
     * @param type
     * @return
     */
    public static <T extends BullhornEntity, E extends ListWrapper<T>> Class<E> getTypesListWrapperType(Class<T> type) {
        return (Class<E>) RestEntityInfo.getTypesRestEntityName(type).listWrapperType;

    }

    /**
     * Returns the pretty name for a BullhornEntity Class<T>
     * 
     * @param type
     * @return
     */
    public static <T extends BullhornEntity> String getTypesName(Class<T> type) {
        return RestEntityInfo.getTypesRestEntityName(type).name;

    }

    /**
     * Returns the RestEntityInfo for the BullhornEntity Class<T> passed in
     * 
     * @param type
     * @return
     */
    public static <T extends BullhornEntity> RestEntityInfo getTypesRestEntityName(Class<T> type) {
        if (RestEntityInfo.classToRestEntityName == null) {
            RestEntityInfo.initMapping();
        }

        RestEntityInfo value = RestEntityInfo.classToRestEntityName.get(type);

        if (value == null) {
            RestEntityInfo.initMapping();
        } else {
            return value;
        }

        return RestEntityInfo.classToRestEntityName.get(type);

    }

    /**
     * Returns the RestEntityInfo for the name of the BullhornEntity passed in. Not case sensitive.
     * 
     * @param name
     * @return
     */
    public static RestEntityInfo getTypeFromName(String name) {

        for (RestEntityInfo restEntityInfo : RestEntityInfo.values()) {
            if (restEntityInfo.getName().equalsIgnoreCase(name)) {
                return restEntityInfo;
            }
        }
        throw new IllegalArgumentException("No BullhornEntity exists with the name: " + name);

    }

    private synchronized static void initMapping() {
        classToRestEntityName = new HashMap<Class<?>, RestEntityInfo>();
        for (RestEntityInfo s : values()) {
            classToRestEntityName.put(s.type, s);
        }
    }

}
