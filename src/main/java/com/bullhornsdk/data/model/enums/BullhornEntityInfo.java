package com.bullhornsdk.data.model.enums;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance9;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance9;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance9;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance9;
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
import com.bullhornsdk.data.model.entity.core.standard.File;
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
import com.bullhornsdk.data.model.entity.core.standard.Tearsheet;
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
import com.bullhornsdk.data.model.response.list.FileEntityListWrapper;
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
import com.bullhornsdk.data.model.response.list.TearsheetListWrapper;
import com.bullhornsdk.data.model.response.list.TimeUnitListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.ClientCorporationCustomObjectInstance10ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.ClientCorporationCustomObjectInstance1ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.ClientCorporationCustomObjectInstance2ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.ClientCorporationCustomObjectInstance3ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.ClientCorporationCustomObjectInstance4ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.ClientCorporationCustomObjectInstance5ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.ClientCorporationCustomObjectInstance6ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.ClientCorporationCustomObjectInstance7ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.ClientCorporationCustomObjectInstance8ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.ClientCorporationCustomObjectInstance9ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.JobOrderCustomObjectInstance10ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.JobOrderCustomObjectInstance1ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.JobOrderCustomObjectInstance2ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.JobOrderCustomObjectInstance3ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.JobOrderCustomObjectInstance4ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.JobOrderCustomObjectInstance5ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.JobOrderCustomObjectInstance6ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.JobOrderCustomObjectInstance7ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.JobOrderCustomObjectInstance8ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.JobOrderCustomObjectInstance9ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PersonCustomObjectInstance10ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PersonCustomObjectInstance1ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PersonCustomObjectInstance2ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PersonCustomObjectInstance3ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PersonCustomObjectInstance4ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PersonCustomObjectInstance5ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PersonCustomObjectInstance6ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PersonCustomObjectInstance7ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PersonCustomObjectInstance8ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PersonCustomObjectInstance9ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PlacementCustomObjectInstance10ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PlacementCustomObjectInstance1ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PlacementCustomObjectInstance2ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PlacementCustomObjectInstance3ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PlacementCustomObjectInstance4ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PlacementCustomObjectInstance5ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PlacementCustomObjectInstance6ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PlacementCustomObjectInstance7ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PlacementCustomObjectInstance8ListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PlacementCustomObjectInstance9ListWrapper;
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
import com.bullhornsdk.data.model.response.single.FileEntityWrapper;
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
import com.bullhornsdk.data.model.response.single.TearsheetWrapper;
import com.bullhornsdk.data.model.response.single.TimeUnitWrapper;
import com.bullhornsdk.data.model.response.single.Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.ClientCorporationCustomObjectInstance10Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.ClientCorporationCustomObjectInstance1Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.ClientCorporationCustomObjectInstance2Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.ClientCorporationCustomObjectInstance3Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.ClientCorporationCustomObjectInstance4Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.ClientCorporationCustomObjectInstance5Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.ClientCorporationCustomObjectInstance6Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.ClientCorporationCustomObjectInstance7Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.ClientCorporationCustomObjectInstance8Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.ClientCorporationCustomObjectInstance9Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.JobOrderCustomObjectInstance10Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.JobOrderCustomObjectInstance1Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.JobOrderCustomObjectInstance2Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.JobOrderCustomObjectInstance3Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.JobOrderCustomObjectInstance4Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.JobOrderCustomObjectInstance5Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.JobOrderCustomObjectInstance6Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.JobOrderCustomObjectInstance7Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.JobOrderCustomObjectInstance8Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.JobOrderCustomObjectInstance9Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PersonCustomObjectInstance10Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PersonCustomObjectInstance1Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PersonCustomObjectInstance2Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PersonCustomObjectInstance3Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PersonCustomObjectInstance4Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PersonCustomObjectInstance5Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PersonCustomObjectInstance6Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PersonCustomObjectInstance7Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PersonCustomObjectInstance8Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PersonCustomObjectInstance9Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PlacementCustomObjectInstance10Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PlacementCustomObjectInstance1Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PlacementCustomObjectInstance2Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PlacementCustomObjectInstance3Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PlacementCustomObjectInstance4Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PlacementCustomObjectInstance5Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PlacementCustomObjectInstance6Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PlacementCustomObjectInstance7Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PlacementCustomObjectInstance8Wrapper;
import com.bullhornsdk.data.model.response.single.customobject.PlacementCustomObjectInstance9Wrapper;

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

    ADDRESS("Address", null, null, null, null, null),
    APPOINTMENT("Appointment", Appointment.class, AppointmentWrapper.class, AppointmentListWrapper.class, "AppointmentEditHistory",
            "AppointmentEditHistoryFieldChange"),
    APPOINTMENT_ATTENDEE("AppointmentAttendee", AppointmentAttendee.class, AppointmentAttendeeWrapper.class,
            AppointmentAttendeeListWrapper.class, null, null),
    BUSINESS_SECTOR("BusinessSector", BusinessSector.class, BusinessSectorWrapper.class, BusinessSectorListWrapper.class, null, null),
    CANDIDATE("Candidate", Candidate.class, CandidateWrapper.class, CandidateListWrapper.class, "UserEditHistory",
            "UserEditHistoryFieldChange"),
    CANDIDATE_EDUCATION("CandidateEducation", CandidateEducation.class, CandidateEducationWrapper.class,
            CandidateEducationListWrapper.class, null, null),
    CANDIDATE_REFERENCE("CandidateReference", CandidateReference.class, CandidateReferenceWrapper.class,
            CandidateReferenceListWrapper.class, null, null),
    CANDIDATE_WORK_HISTORY("CandidateWorkHistory", CandidateWorkHistory.class, CandidateWorkHistoryWrapper.class,
            CandidateWorkHistoryListWrapper.class, null, null),
    CATEGORY("Category", Category.class, CategoryWrapper.class, CategoryListWrapper.class, null, null),
    CERTIFICATION("Certification", Certification.class, CertificationWrapper.class, CertificationListWrapper.class, null, null),
    CLIENT_CONTACT("ClientContact", ClientContact.class, ClientContactWrapper.class, ClientContactListWrapper.class, "UserEditHistory",
            "UserEditHistoryFieldChange"),
    CLIENT_CORPORATION("ClientCorporation", ClientCorporation.class, ClientCorporationWrapper.class,
            ClientCorporationListWrapper.class, "ClientCorporationEditHistory", "ClientCorporationEditHistoryFieldChange"),
    CORPORATE_USER("CorporateUser", CorporateUser.class, CorporateUserWrapper.class, CorporateUserListWrapper.class, null, null),
    CORPORATION_DEPARTMENT("CorporationDepartment", CorporationDepartment.class, CorporationDepartmentWrapper.class,
            CorporationDepartmentListWrapper.class, null, null),
    COUNTRY("Country", Country.class, CountryWrapper.class, CountryListWrapper.class, null, null),
    FILE("File", File.class, FileEntityWrapper.class, FileEntityListWrapper.class, null, null),
    HOUSING_COMPLEX("HousingComplex", HousingComplex.class, HousingComplexWrapper.class, HousingComplexListWrapper.class, null, null),
    JOB_ORDER("JobOrder", JobOrder.class, JobOrderWrapper.class, JobOrderListWrapper.class, "JobOrderEditHistory",
            "JobOrderEditHistoryFieldChange"),
    JOB_SUBMISSION("JobSubmission", JobSubmission.class, JobSubmissionWrapper.class, JobSubmissionListWrapper.class,
            "JobSubmissionEditHistory", "JobSubmissionEditHistoryFieldChange"),
    JOB_SUBMISSION_HISTORY("JobSubmissionHistory", JobSubmissionHistory.class, JobSubmissionHistoryWrapper.class,
            JobSubmissionHistoryListWrapper.class, null, null),
    LEAD("Lead", Lead.class, LeadWrapper.class, LeadListWrapper.class, "UserEditHistory", "UserEditHistoryFieldChange"),
    LOGIN_RESTRICTIONS("LoginRestrictions", null, null, null, null, null),
    NOTE("Note", Note.class, NoteWrapper.class, NoteListWrapper.class, null, null),
    NOTE_ENTITY("NoteEntity", NoteEntity.class, NoteEntityWrapper.class, NoteEntityListWrapper.class, null, null),
    OPPORTUNITY("Opportunity", Opportunity.class, OpportunityWrapper.class, OpportunityListWrapper.class, null, null),
    PLACEMENT("Placement", Placement.class, PlacementWrapper.class, PlacementListWrapper.class, "PlacementEditHistory",
            "PlacementEditHistoryFieldChange"),
    PLACEMENT_CHANGE_REQUEST("PlacementChangeRequest", PlacementChangeRequest.class, PlacementChangeRequestWrapper.class,
            PlacementChangeRequestListWrapper.class, null, null),
    PLACEMENT_COMMISSION("PlacementCommission", PlacementCommission.class, PlacementCommissionWrapper.class,
            PlacementCommissionListWrapper.class, "PlacementCommissionEditHistory", "PlacementCommissionEditHistoryFieldChange"),
    SENDOUT("Sendout", Sendout.class, SendoutWrapper.class, SendoutListWrapper.class, null, null),
    SKILL("Skill", Skill.class, SkillWrapper.class, SkillListWrapper.class, null, null),
    SPECIALTY("Specialty", Specialty.class, SpecialtyWrapper.class, SpecialtyListWrapper.class, null, null),
    STATE("State", State.class, StateWrapper.class, StateListWrapper.class, null, null),
    TASK("Task", Task.class, TaskWrapper.class, TaskListWrapper.class, null, null),
    TEARSHEET("Tearsheet", Tearsheet.class, TearsheetWrapper.class, TearsheetListWrapper.class, null, null),
    TIME_UNIT("TimeUnit", TimeUnit.class, TimeUnitWrapper.class, TimeUnitListWrapper.class, null, null),

    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_1("JobOrderCustomObjectInstance1", JobOrderCustomObjectInstance1.class, JobOrderCustomObjectInstance1Wrapper.class, JobOrderCustomObjectInstance1ListWrapper.class, null, null),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_2("JobOrderCustomObjectInstance2", JobOrderCustomObjectInstance2.class, JobOrderCustomObjectInstance2Wrapper.class, JobOrderCustomObjectInstance2ListWrapper.class, null, null),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_3("JobOrderCustomObjectInstance3", JobOrderCustomObjectInstance3.class, JobOrderCustomObjectInstance3Wrapper.class, JobOrderCustomObjectInstance3ListWrapper.class, null, null),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_4("JobOrderCustomObjectInstance4", JobOrderCustomObjectInstance4.class, JobOrderCustomObjectInstance4Wrapper.class, JobOrderCustomObjectInstance4ListWrapper.class, null, null),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_5("JobOrderCustomObjectInstance5", JobOrderCustomObjectInstance5.class, JobOrderCustomObjectInstance5Wrapper.class, JobOrderCustomObjectInstance5ListWrapper.class, null, null),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_6("JobOrderCustomObjectInstance6", JobOrderCustomObjectInstance6.class, JobOrderCustomObjectInstance6Wrapper.class, JobOrderCustomObjectInstance6ListWrapper.class, null, null),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_7("JobOrderCustomObjectInstance7", JobOrderCustomObjectInstance7.class, JobOrderCustomObjectInstance7Wrapper.class, JobOrderCustomObjectInstance7ListWrapper.class, null, null),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_8("JobOrderCustomObjectInstance8", JobOrderCustomObjectInstance8.class, JobOrderCustomObjectInstance8Wrapper.class, JobOrderCustomObjectInstance8ListWrapper.class, null, null),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_9("JobOrderCustomObjectInstance9", JobOrderCustomObjectInstance9.class, JobOrderCustomObjectInstance9Wrapper.class, JobOrderCustomObjectInstance9ListWrapper.class, null, null),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_10("JobOrderCustomObjectInstance10", JobOrderCustomObjectInstance10.class, JobOrderCustomObjectInstance10Wrapper.class, JobOrderCustomObjectInstance10ListWrapper.class, null, null),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_1("PlacementCustomObjectInstance1", PlacementCustomObjectInstance1.class, PlacementCustomObjectInstance1Wrapper.class, PlacementCustomObjectInstance1ListWrapper.class, null, null),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_2("PlacementCustomObjectInstance2", PlacementCustomObjectInstance2.class, PlacementCustomObjectInstance2Wrapper.class, PlacementCustomObjectInstance2ListWrapper.class, null, null),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_3("PlacementCustomObjectInstance3", PlacementCustomObjectInstance3.class, PlacementCustomObjectInstance3Wrapper.class, PlacementCustomObjectInstance3ListWrapper.class, null, null),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_4("PlacementCustomObjectInstance4", PlacementCustomObjectInstance4.class, PlacementCustomObjectInstance4Wrapper.class, PlacementCustomObjectInstance4ListWrapper.class, null, null),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_5("PlacementCustomObjectInstance5", PlacementCustomObjectInstance5.class, PlacementCustomObjectInstance5Wrapper.class, PlacementCustomObjectInstance5ListWrapper.class, null, null),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_6("PlacementCustomObjectInstance6", PlacementCustomObjectInstance6.class, PlacementCustomObjectInstance6Wrapper.class, PlacementCustomObjectInstance6ListWrapper.class, null, null),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_7("PlacementCustomObjectInstance7", PlacementCustomObjectInstance7.class, PlacementCustomObjectInstance7Wrapper.class, PlacementCustomObjectInstance7ListWrapper.class, null, null),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_8("PlacementCustomObjectInstance8", PlacementCustomObjectInstance8.class, PlacementCustomObjectInstance8Wrapper.class, PlacementCustomObjectInstance8ListWrapper.class, null, null),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_9("PlacementCustomObjectInstance9", PlacementCustomObjectInstance9.class, PlacementCustomObjectInstance9Wrapper.class, PlacementCustomObjectInstance9ListWrapper.class, null, null),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_10("PlacementCustomObjectInstance10", PlacementCustomObjectInstance10.class, PlacementCustomObjectInstance10Wrapper.class, PlacementCustomObjectInstance10ListWrapper.class, null, null),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_1("ClientCorporationCustomObjectInstance1", ClientCorporationCustomObjectInstance1.class, ClientCorporationCustomObjectInstance1Wrapper.class, ClientCorporationCustomObjectInstance1ListWrapper.class, null, null),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_2("ClientCorporationCustomObjectInstance2", ClientCorporationCustomObjectInstance2.class, ClientCorporationCustomObjectInstance2Wrapper.class, ClientCorporationCustomObjectInstance2ListWrapper.class, null, null),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_3("ClientCorporationCustomObjectInstance3", ClientCorporationCustomObjectInstance3.class, ClientCorporationCustomObjectInstance3Wrapper.class, ClientCorporationCustomObjectInstance3ListWrapper.class, null, null),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_4("ClientCorporationCustomObjectInstance4", ClientCorporationCustomObjectInstance4.class, ClientCorporationCustomObjectInstance4Wrapper.class, ClientCorporationCustomObjectInstance4ListWrapper.class, null, null),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_5("ClientCorporationCustomObjectInstance5", ClientCorporationCustomObjectInstance5.class, ClientCorporationCustomObjectInstance5Wrapper.class, ClientCorporationCustomObjectInstance5ListWrapper.class, null, null),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_6("ClientCorporationCustomObjectInstance6", ClientCorporationCustomObjectInstance6.class, ClientCorporationCustomObjectInstance6Wrapper.class, ClientCorporationCustomObjectInstance6ListWrapper.class, null, null),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_7("ClientCorporationCustomObjectInstance7", ClientCorporationCustomObjectInstance7.class, ClientCorporationCustomObjectInstance7Wrapper.class, ClientCorporationCustomObjectInstance7ListWrapper.class, null, null),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_8("ClientCorporationCustomObjectInstance8", ClientCorporationCustomObjectInstance8.class, ClientCorporationCustomObjectInstance8Wrapper.class, ClientCorporationCustomObjectInstance8ListWrapper.class, null, null),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_9("ClientCorporationCustomObjectInstance9", ClientCorporationCustomObjectInstance9.class, ClientCorporationCustomObjectInstance9Wrapper.class, ClientCorporationCustomObjectInstance9ListWrapper.class, null, null),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_10("ClientCorporationCustomObjectInstance10", ClientCorporationCustomObjectInstance10.class, ClientCorporationCustomObjectInstance10Wrapper.class, ClientCorporationCustomObjectInstance10ListWrapper.class, null, null),
    PERSON_CUSTOM_OBJECT_INSTANCE_1("PersonCustomObjectInstance1", PersonCustomObjectInstance1.class, PersonCustomObjectInstance1Wrapper.class, PersonCustomObjectInstance1ListWrapper.class, null, null),
    PERSON_CUSTOM_OBJECT_INSTANCE_2("PersonCustomObjectInstance2", PersonCustomObjectInstance2.class, PersonCustomObjectInstance2Wrapper.class, PersonCustomObjectInstance2ListWrapper.class, null, null),
    PERSON_CUSTOM_OBJECT_INSTANCE_3("PersonCustomObjectInstance3", PersonCustomObjectInstance3.class, PersonCustomObjectInstance3Wrapper.class, PersonCustomObjectInstance3ListWrapper.class, null, null),
    PERSON_CUSTOM_OBJECT_INSTANCE_4("PersonCustomObjectInstance4", PersonCustomObjectInstance4.class, PersonCustomObjectInstance4Wrapper.class, PersonCustomObjectInstance4ListWrapper.class, null, null),
    PERSON_CUSTOM_OBJECT_INSTANCE_5("PersonCustomObjectInstance5", PersonCustomObjectInstance5.class, PersonCustomObjectInstance5Wrapper.class, PersonCustomObjectInstance5ListWrapper.class, null, null),
    PERSON_CUSTOM_OBJECT_INSTANCE_6("PersonCustomObjectInstance6", PersonCustomObjectInstance6.class, PersonCustomObjectInstance6Wrapper.class, PersonCustomObjectInstance6ListWrapper.class, null, null),
    PERSON_CUSTOM_OBJECT_INSTANCE_7("PersonCustomObjectInstance7", PersonCustomObjectInstance7.class, PersonCustomObjectInstance7Wrapper.class, PersonCustomObjectInstance7ListWrapper.class, null, null),
    PERSON_CUSTOM_OBJECT_INSTANCE_8("PersonCustomObjectInstance8", PersonCustomObjectInstance8.class, PersonCustomObjectInstance8Wrapper.class, PersonCustomObjectInstance8ListWrapper.class, null, null),
    PERSON_CUSTOM_OBJECT_INSTANCE_9("PersonCustomObjectInstance9", PersonCustomObjectInstance9.class, PersonCustomObjectInstance9Wrapper.class, PersonCustomObjectInstance9ListWrapper.class, null, null),
    PERSON_CUSTOM_OBJECT_INSTANCE_10("PersonCustomObjectInstance10", PersonCustomObjectInstance10.class, PersonCustomObjectInstance10Wrapper.class, PersonCustomObjectInstance10ListWrapper.class, null, null)
    ;

    private final String name;

    private final Class<?> type;

    private final Class<? extends Wrapper<?>> wrapperType;

    private final Class<? extends ListWrapper<?>> listWrapperType;

    private final String editHistoryName;

    private final String editHistoryFieldChangeName;

    private static Map<Class<?>, BullhornEntityInfo> classToRestEntityName;

    <T extends BullhornEntity> BullhornEntityInfo(String name, Class<T> type, Class<? extends Wrapper<T>> wrapperType,
                                                  Class<? extends ListWrapper<T>> listWrapperType, String editHistoryName,
                                                  String editHistoryFieldChangeName) {
        this.name = name;
        this.type = type;
        this.wrapperType = wrapperType;
        this.listWrapperType = listWrapperType;
        this.editHistoryName = editHistoryName;
        this.editHistoryFieldChangeName = editHistoryFieldChangeName;
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

    /**
     * Returns the edithistory name for a BullhornEntity Class<T>
     *
     * @param type
     * @return
     */
    public static <T extends BullhornEntity> String getTypesEditHistoryName(Class<T> type) {
        return BullhornEntityInfo.getTypesRestEntityName(type).editHistoryName;

    }

    /**
     * Returns the edithistoryfieldchange name for a BullhornEntity Class<T>
     *
     * @param type
     * @return
     */
    public static <T extends BullhornEntity> String getTypesEditHistoryFieldChangeName(Class<T> type) {
        return BullhornEntityInfo.getTypesRestEntityName(type).editHistoryFieldChangeName;

    }

    public String getEditHistoryName() {
        return editHistoryName;
    }

    public String getEditHistoryFieldChangeName() {
        return editHistoryFieldChangeName;
    }

    private synchronized static void initMapping() {
        classToRestEntityName = new HashMap<Class<?>, BullhornEntityInfo>();
        for (BullhornEntityInfo s : values()) {
            classToRestEntityName.put(s.type, s);
        }
    }

}
