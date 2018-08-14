package com.bullhornsdk.data.model.enums;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bullhornsdk.data.model.entity.core.customobject.*;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.embedded.UserType;
import com.bullhornsdk.data.model.entity.file.*;
import com.bullhornsdk.data.model.response.list.*;
import com.bullhornsdk.data.model.response.list.customobject.*;
import com.bullhornsdk.data.model.response.single.*;
import com.bullhornsdk.data.model.response.single.customobject.*;

/**
 * Enum that contains the following information about the RestEntities:
 * <p>
 * 1. The pretty name.
 * <p>
 * 2. The BullhornEntity specific Class<T>
 * <p>
 * 3. The ListWrapper<T> class that wraps a list of RestEntities for query/search type requests.
 * <p>
 * 4. Mapping between Class<T> and its name.
 * <p>
 * 5. Mapping between Class<T> and its ListWrapper<T>.
 *
 * @author magnus.palm
 */
public enum BullhornEntityInfo {

    ADDRESS("Address", null, null, null, null, null),
    APPOINTMENT("Appointment", Appointment.class, AppointmentWrapper.class, AppointmentListWrapper.class,
        "AppointmentEditHistory", "AppointmentEditHistoryFieldChange"),
    APPOINTMENT_ATTENDEE("AppointmentAttendee", AppointmentAttendee.class, AppointmentAttendeeWrapper.class,
        AppointmentAttendeeListWrapper.class, null, null),
    BRANCH("Branch", Branch.class, BranchWrapper.class, BranchListWrapper.class, null, null),
    BUSINESS_SECTOR("BusinessSector", BusinessSector.class, BusinessSectorWrapper.class, BusinessSectorListWrapper.class, null, null),
    CANDIDATE("Candidate", Candidate.class, CandidateWrapper.class, CandidateListWrapper.class, "UserEditHistory",
        "UserEditHistoryFieldChange"),
    CANDIDATE_CERTIFICATION("CandidateCertification", CandidateCertification.class, CandidateCertificationWrapper.class,
        CandidateCertificationListWrapper.class, "CandidateCertificationEditHistory", "CandidateCertificationEditHistoryFieldChange"),
    CANDIDATE_EDUCATION("CandidateEducation", CandidateEducation.class, CandidateEducationWrapper.class,
        CandidateEducationListWrapper.class, null, null),
    CANDIDATE_REFERENCE("CandidateReference", CandidateReference.class, CandidateReferenceWrapper.class,
        CandidateReferenceListWrapper.class, null, null),
    CANDIDATE_WORK_HISTORY("CandidateWorkHistory", CandidateWorkHistory.class, CandidateWorkHistoryWrapper.class,
        CandidateWorkHistoryListWrapper.class, null, null),
    CATEGORY("Category", Category.class, CategoryWrapper.class, CategoryListWrapper.class, null, null),
    CERTIFICATION("Certification", Certification.class, CertificationWrapper.class, CertificationListWrapper.class, null, null),
    CERTIFICATIONGROUP("CertificationGroup", CertificationGroup.class, CertificationGroupWrapper.class, CertificationGroupListWrapper.class, null, null),
    CLIENT_CONTACT("ClientContact", ClientContact.class, ClientContactWrapper.class, ClientContactListWrapper.class, "UserEditHistory",
        "UserEditHistoryFieldChange"),
    CLIENT_CONTACT1("ClientContact1", ClientContact1.class, ClientContact1Wrapper.class, ClientContact1ListWrapper.class, "UserEditHistory",
            "UserEditHistoryFieldChange"),
    CLIENT_CONTACT2("ClientContact2", ClientContact2.class, ClientContact2Wrapper.class, ClientContact2ListWrapper.class, "UserEditHistory",
            "UserEditHistoryFieldChange"),
    CLIENT_CONTACT3("ClientContact3", ClientContact3.class, ClientContact3Wrapper.class, ClientContact3ListWrapper.class, "UserEditHistory",
            "UserEditHistoryFieldChange"),
    CLIENT_CONTACT4("ClientContact4", ClientContact4.class, ClientContact4Wrapper.class, ClientContact4ListWrapper.class, "UserEditHistory",
            "UserEditHistoryFieldChange"),
    CLIENT_CONTACT5("ClientContact5", ClientContact5.class, ClientContact5Wrapper.class, ClientContact5ListWrapper.class, "UserEditHistory",
            "UserEditHistoryFieldChange"),
    CLIENT_CORPORATION("ClientCorporation", ClientCorporation.class, ClientCorporationWrapper.class,
        ClientCorporationListWrapper.class, "ClientCorporationEditHistory", "ClientCorporationEditHistoryFieldChange"),
    CLIENT_CORPORATION1("ClientCorporation1", ClientCorporation1.class, ClientCorporation1Wrapper.class,
        ClientCorporation1ListWrapper.class, "ClientCorporationEditHistory", "ClientCorporationEditHistoryFieldChange"),
    CLIENT_CORPORATION2("ClientCorporation2", ClientCorporation2.class, ClientCorporation2Wrapper.class,
        ClientCorporation2ListWrapper.class, "ClientCorporationEditHistory", "ClientCorporationEditHistoryFieldChange"),
    CLIENT_CORPORATION3("ClientCorporation3", ClientCorporation3.class, ClientCorporation3Wrapper.class,
        ClientCorporation3ListWrapper.class, "ClientCorporationEditHistory", "ClientCorporationEditHistoryFieldChange"),
    CLIENT_CORPORATION4("ClientCorporation4", ClientCorporation4.class, ClientCorporation4Wrapper.class,
        ClientCorporation4ListWrapper.class, "ClientCorporationEditHistory", "ClientCorporationEditHistoryFieldChange"),
    CLIENT_CORPORATION5("ClientCorporation5", ClientCorporation5.class, ClientCorporation5Wrapper.class,
        ClientCorporation5ListWrapper.class, "ClientCorporationEditHistory", "ClientCorporationEditHistoryFieldChange"),
    CLIENT_CORPORATION_CERTIFICATION("ClientCorporationCertification", ClientCorporationCertification.class, ClientCorporationCertificationWrapper.class,
        ClientCorporationCertificationListWrapper.class, null, null),
    CORPORATE_USER("CorporateUser", CorporateUser.class, CorporateUserWrapper.class, CorporateUserListWrapper.class, "UserEditHistory",
        "UserEditHistoryFieldChange"),
    CORPORATION_DEPARTMENT("CorporationDepartment", CorporationDepartment.class, CorporationDepartmentWrapper.class,
        CorporationDepartmentListWrapper.class, null, null),
    COUNTRY("Country", Country.class, CountryWrapper.class, CountryListWrapper.class, null, null),
    DEPARTMENT("Department", Department.class, DepartmentWrapper.class, DepartmentListWrapper.class, null, null),
    DISTRIBUTION_LIST("DistributionList", DistributionList.class, DistributionListWrapper.class, DistributionListListWrapper.class, null, null),
    FILE("File", File.class, FileEntityWrapper.class, FileEntityListWrapper.class, null, null),
    HOUSING_COMPLEX("HousingComplex", HousingComplex.class, HousingComplexWrapper.class, HousingComplexListWrapper.class, null, null),
    HOUSING_COMPLEX_UNIT("HousingComplexUnit", HousingComplexUnit.class, HousingComplexUnitWrapper.class, HousingComplexUnitListWrapper.class, null, null),
    HOUSING_COMPLEX_FURNITURE_DELIVERY("HousingComplexFurnitureDelivery", HousingComplexFurnitureDelivery.class, HousingComplexFurnitureDeliveryWrapper.class, HousingComplexFurnitureDeliveryListWrapper.class, null, null),
    HOUSING_COMPLEX_UTILITY_ACCOUNT("HousingComplexUtilityAccount", HousingComplexUtilityAccount.class, HousingComplexUtilityAccountWrapper.class, HousingComplexUtilityAccountListWrapper.class, null, null),
    USER_HOUSING_COMPLEX_UNIT("UserHousingComplexUnit", UserHousingComplexUnit.class, UserHousingComplexUnitWrapper.class, UserHousingComplexUnitListWrapper.class, null, null),
    JOB_ORDER("JobOrder", JobOrder.class, JobOrderWrapper.class, JobOrderListWrapper.class, "JobOrderEditHistory",
        "JobOrderEditHistoryFieldChange"),
    JOB_BOARD_POST("JobBoardPost", JobBoardPost.class, JobBoardPostWrapper.class, JobBoardPostListWrapper.class, null, null),
    JOB_SUBMISSION("JobSubmission", JobSubmission.class, JobSubmissionWrapper.class, JobSubmissionListWrapper.class,
        "JobSubmissionEditHistory", "JobSubmissionEditHistoryFieldChange"),
    JOB_SUBMISSION_HISTORY("JobSubmissionHistory", JobSubmissionHistory.class, JobSubmissionHistoryWrapper.class,
        JobSubmissionHistoryListWrapper.class, null, null),
    LEAD("Lead", Lead.class, LeadWrapper.class, LeadListWrapper.class, "UserEditHistory", "UserEditHistoryFieldChange"),
    LOGIN_RESTRICTIONS("LoginRestrictions", null, null, null, null, null),
    NOTE("Note", Note.class, NoteWrapper.class, NoteListWrapper.class, null, null),
    NOTE_ENTITY("NoteEntity", NoteEntity.class, NoteEntityWrapper.class, NoteEntityListWrapper.class, null, null),
    OPPORTUNITY("Opportunity", Opportunity.class, OpportunityWrapper.class, OpportunityListWrapper.class, "OpportunityEditHistory", "OpportunityEditHistoryFieldChange"),
    PERSON("Person", Person.class, PersonWrapper.class, PersonListWrapper.class, null, null),
    PLACEMENT("Placement", Placement.class, PlacementWrapper.class, PlacementListWrapper.class, "PlacementEditHistory",
        "PlacementEditHistoryFieldChange"),
    PLACEMENT_CHANGE_REQUEST("PlacementChangeRequest", PlacementChangeRequest.class, PlacementChangeRequestWrapper.class,
        PlacementChangeRequestListWrapper.class, "PlacementChangeRequestEditHistory", "PlacementChangeRequestEditHistoryFieldChange"),
    PLACEMENT_CERTIFICATION("PlacementCertification", PlacementCertification.class, PlacementCertificationWrapper.class,
        PlacementCertificationListWrapper.class, "PlacementCertificationEditHistory", "PlacementCertificationEditHistoryFieldChange"),
    PLACEMENT_COMMISSION("PlacementCommission", PlacementCommission.class, PlacementCommissionWrapper.class,
        PlacementCommissionListWrapper.class, "PlacementCommissionEditHistory", "PlacementCommissionEditHistoryFieldChange"),
    PRIVATE_LABEL("PrivateLabel", PrivateLabel.class, PrivateLabelWrapper.class, PrivateLabelListWrapper.class, null, null),
    SENDOUT("Sendout", Sendout.class, SendoutWrapper.class, SendoutListWrapper.class, null, null),
    SKILL("Skill", Skill.class, SkillWrapper.class, SkillListWrapper.class, null, null),
    SPECIALTY("Specialty", Specialty.class, SpecialtyWrapper.class, SpecialtyListWrapper.class, null, null),
    STATE("State", State.class, StateWrapper.class, StateListWrapper.class, null, null),
    TASK("Task", Task.class, TaskWrapper.class, TaskListWrapper.class,
        "TaskEditHistory", "TaskEditHistoryFieldChange"),
    TEARSHEET("Tearsheet", Tearsheet.class, TearsheetWrapper.class, TearsheetListWrapper.class, null, null),
    TEARSHEET_MEMBER("TearsheetMember", TearsheetMember.class, TearsheetMemberWrapper.class, TearsheetMemberListWrapper.class, null, null),
    TIME_UNIT("TimeUnit", TimeUnit.class, TimeUnitWrapper.class, TimeUnitListWrapper.class, null, null),
    USER_TYPE("UserType", UserType.class, UserTypeWrapper.class, UserTypeListWrapper.class, null, null),
    WORKERS_COMPENSATION("WorkersCompensation", WorkersCompensation.class, WorkersCompensationWrapper.class, WorkersCompensationListWrapper.class, null, null),
    WORKERS_COMPENSATION_RATE("WorkersCompensationRate", WorkersCompensationRate.class, WorkersCompensationRateWrapper.class, WorkersCompensationRateListWrapper.class, null, null),

    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_1("JobOrderCustomObjectInstance1", JobOrderCustomObjectInstance1.class, JobOrderCustomObjectInstance1Wrapper.class, JobOrderCustomObjectInstance1ListWrapper.class, "JobOrderCustomObject1EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_2("JobOrderCustomObjectInstance2", JobOrderCustomObjectInstance2.class, JobOrderCustomObjectInstance2Wrapper.class, JobOrderCustomObjectInstance2ListWrapper.class, "JobOrderCustomObject2EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_3("JobOrderCustomObjectInstance3", JobOrderCustomObjectInstance3.class, JobOrderCustomObjectInstance3Wrapper.class, JobOrderCustomObjectInstance3ListWrapper.class, "JobOrderCustomObject3EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_4("JobOrderCustomObjectInstance4", JobOrderCustomObjectInstance4.class, JobOrderCustomObjectInstance4Wrapper.class, JobOrderCustomObjectInstance4ListWrapper.class, "JobOrderCustomObject4EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_5("JobOrderCustomObjectInstance5", JobOrderCustomObjectInstance5.class, JobOrderCustomObjectInstance5Wrapper.class, JobOrderCustomObjectInstance5ListWrapper.class, "JobOrderCustomObject5EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_6("JobOrderCustomObjectInstance6", JobOrderCustomObjectInstance6.class, JobOrderCustomObjectInstance6Wrapper.class, JobOrderCustomObjectInstance6ListWrapper.class, "JobOrderCustomObject6EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_7("JobOrderCustomObjectInstance7", JobOrderCustomObjectInstance7.class, JobOrderCustomObjectInstance7Wrapper.class, JobOrderCustomObjectInstance7ListWrapper.class, "JobOrderCustomObject7EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_8("JobOrderCustomObjectInstance8", JobOrderCustomObjectInstance8.class, JobOrderCustomObjectInstance8Wrapper.class, JobOrderCustomObjectInstance8ListWrapper.class, "JobOrderCustomObject8EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_9("JobOrderCustomObjectInstance9", JobOrderCustomObjectInstance9.class, JobOrderCustomObjectInstance9Wrapper.class, JobOrderCustomObjectInstance9ListWrapper.class, "JobOrderCustomObject9EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_10("JobOrderCustomObjectInstance10", JobOrderCustomObjectInstance10.class, JobOrderCustomObjectInstance10Wrapper.class, JobOrderCustomObjectInstance10ListWrapper.class, "JobOrderCustomObject10EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_1("OpportunityCustomObjectInstance1", OpportunityCustomObjectInstance1.class, OpportunityCustomObjectInstance1Wrapper.class, OpportunityCustomObjectInstance1ListWrapper.class, "OpportunityCustomObject1EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_2("OpportunityCustomObjectInstance2", OpportunityCustomObjectInstance2.class, OpportunityCustomObjectInstance2Wrapper.class, OpportunityCustomObjectInstance2ListWrapper.class, "OpportunityCustomObject2EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_3("OpportunityCustomObjectInstance3", OpportunityCustomObjectInstance3.class, OpportunityCustomObjectInstance3Wrapper.class, OpportunityCustomObjectInstance3ListWrapper.class, "OpportunityCustomObject3EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_4("OpportunityCustomObjectInstance4", OpportunityCustomObjectInstance4.class, OpportunityCustomObjectInstance4Wrapper.class, OpportunityCustomObjectInstance4ListWrapper.class, "OpportunityCustomObject4EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_5("OpportunityCustomObjectInstance5", OpportunityCustomObjectInstance5.class, OpportunityCustomObjectInstance5Wrapper.class, OpportunityCustomObjectInstance5ListWrapper.class, "OpportunityCustomObject5EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_6("OpportunityCustomObjectInstance6", OpportunityCustomObjectInstance6.class, OpportunityCustomObjectInstance6Wrapper.class, OpportunityCustomObjectInstance6ListWrapper.class, "OpportunityCustomObject6EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_7("OpportunityCustomObjectInstance7", OpportunityCustomObjectInstance7.class, OpportunityCustomObjectInstance7Wrapper.class, OpportunityCustomObjectInstance7ListWrapper.class, "OpportunityCustomObject7EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_8("OpportunityCustomObjectInstance8", OpportunityCustomObjectInstance8.class, OpportunityCustomObjectInstance8Wrapper.class, OpportunityCustomObjectInstance8ListWrapper.class, "OpportunityCustomObject8EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_9("OpportunityCustomObjectInstance9", OpportunityCustomObjectInstance9.class, OpportunityCustomObjectInstance9Wrapper.class, OpportunityCustomObjectInstance9ListWrapper.class, "OpportunityCustomObject9EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_10("OpportunityCustomObjectInstance10", OpportunityCustomObjectInstance10.class, OpportunityCustomObjectInstance10Wrapper.class, OpportunityCustomObjectInstance10ListWrapper.class, "OpportunityCustomObject10EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_1("PlacementCustomObjectInstance1", PlacementCustomObjectInstance1.class, PlacementCustomObjectInstance1Wrapper.class, PlacementCustomObjectInstance1ListWrapper.class, "PlacementCustomObject1EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_2("PlacementCustomObjectInstance2", PlacementCustomObjectInstance2.class, PlacementCustomObjectInstance2Wrapper.class, PlacementCustomObjectInstance2ListWrapper.class, "PlacementCustomObject2EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_3("PlacementCustomObjectInstance3", PlacementCustomObjectInstance3.class, PlacementCustomObjectInstance3Wrapper.class, PlacementCustomObjectInstance3ListWrapper.class, "PlacementCustomObject3EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_4("PlacementCustomObjectInstance4", PlacementCustomObjectInstance4.class, PlacementCustomObjectInstance4Wrapper.class, PlacementCustomObjectInstance4ListWrapper.class, "PlacementCustomObject4EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_5("PlacementCustomObjectInstance5", PlacementCustomObjectInstance5.class, PlacementCustomObjectInstance5Wrapper.class, PlacementCustomObjectInstance5ListWrapper.class, "PlacementCustomObject5EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_6("PlacementCustomObjectInstance6", PlacementCustomObjectInstance6.class, PlacementCustomObjectInstance6Wrapper.class, PlacementCustomObjectInstance6ListWrapper.class, "PlacementCustomObject6EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_7("PlacementCustomObjectInstance7", PlacementCustomObjectInstance7.class, PlacementCustomObjectInstance7Wrapper.class, PlacementCustomObjectInstance7ListWrapper.class, "PlacementCustomObject7EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_8("PlacementCustomObjectInstance8", PlacementCustomObjectInstance8.class, PlacementCustomObjectInstance8Wrapper.class, PlacementCustomObjectInstance8ListWrapper.class, "PlacementCustomObject8EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_9("PlacementCustomObjectInstance9", PlacementCustomObjectInstance9.class, PlacementCustomObjectInstance9Wrapper.class, PlacementCustomObjectInstance9ListWrapper.class, "PlacementCustomObject9EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_10("PlacementCustomObjectInstance10", PlacementCustomObjectInstance10.class, PlacementCustomObjectInstance10Wrapper.class, PlacementCustomObjectInstance10ListWrapper.class, "PlacementCustomObject10EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_1("ClientCorporationCustomObjectInstance1", ClientCorporationCustomObjectInstance1.class, ClientCorporationCustomObjectInstance1Wrapper.class, ClientCorporationCustomObjectInstance1ListWrapper.class, "ClientCorporationCustomObject1EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_2("ClientCorporationCustomObjectInstance2", ClientCorporationCustomObjectInstance2.class, ClientCorporationCustomObjectInstance2Wrapper.class, ClientCorporationCustomObjectInstance2ListWrapper.class, "ClientCorporationCustomObject2EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_3("ClientCorporationCustomObjectInstance3", ClientCorporationCustomObjectInstance3.class, ClientCorporationCustomObjectInstance3Wrapper.class, ClientCorporationCustomObjectInstance3ListWrapper.class, "ClientCorporationCustomObject3EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_4("ClientCorporationCustomObjectInstance4", ClientCorporationCustomObjectInstance4.class, ClientCorporationCustomObjectInstance4Wrapper.class, ClientCorporationCustomObjectInstance4ListWrapper.class, "ClientCorporationCustomObject4EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_5("ClientCorporationCustomObjectInstance5", ClientCorporationCustomObjectInstance5.class, ClientCorporationCustomObjectInstance5Wrapper.class, ClientCorporationCustomObjectInstance5ListWrapper.class, "ClientCorporationCustomObject5EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_6("ClientCorporationCustomObjectInstance6", ClientCorporationCustomObjectInstance6.class, ClientCorporationCustomObjectInstance6Wrapper.class, ClientCorporationCustomObjectInstance6ListWrapper.class, "ClientCorporationCustomObject6EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_7("ClientCorporationCustomObjectInstance7", ClientCorporationCustomObjectInstance7.class, ClientCorporationCustomObjectInstance7Wrapper.class, ClientCorporationCustomObjectInstance7ListWrapper.class, "ClientCorporationCustomObject7EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_8("ClientCorporationCustomObjectInstance8", ClientCorporationCustomObjectInstance8.class, ClientCorporationCustomObjectInstance8Wrapper.class, ClientCorporationCustomObjectInstance8ListWrapper.class, "ClientCorporationCustomObject8EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_9("ClientCorporationCustomObjectInstance9", ClientCorporationCustomObjectInstance9.class, ClientCorporationCustomObjectInstance9Wrapper.class, ClientCorporationCustomObjectInstance9ListWrapper.class, "ClientCorporationCustomObject9EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_10("ClientCorporationCustomObjectInstance10", ClientCorporationCustomObjectInstance10.class, ClientCorporationCustomObjectInstance10Wrapper.class, ClientCorporationCustomObjectInstance10ListWrapper.class, "ClientCorporationCustomObject10EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_11("ClientCorporationCustomObjectInstance11", ClientCorporationCustomObjectInstance11.class, ClientCorporationCustomObjectInstance11Wrapper.class, ClientCorporationCustomObjectInstance11ListWrapper.class, "ClientCorporationCustomObject11EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_12("ClientCorporationCustomObjectInstance12", ClientCorporationCustomObjectInstance12.class, ClientCorporationCustomObjectInstance12Wrapper.class, ClientCorporationCustomObjectInstance12ListWrapper.class, "ClientCorporationCustomObject12EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_13("ClientCorporationCustomObjectInstance13", ClientCorporationCustomObjectInstance13.class, ClientCorporationCustomObjectInstance13Wrapper.class, ClientCorporationCustomObjectInstance13ListWrapper.class, "ClientCorporationCustomObject13EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_14("ClientCorporationCustomObjectInstance14", ClientCorporationCustomObjectInstance14.class, ClientCorporationCustomObjectInstance14Wrapper.class, ClientCorporationCustomObjectInstance14ListWrapper.class, "ClientCorporationCustomObject14EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_15("ClientCorporationCustomObjectInstance15", ClientCorporationCustomObjectInstance15.class, ClientCorporationCustomObjectInstance15Wrapper.class, ClientCorporationCustomObjectInstance15ListWrapper.class, "ClientCorporationCustomObject15EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_16("ClientCorporationCustomObjectInstance16", ClientCorporationCustomObjectInstance16.class, ClientCorporationCustomObjectInstance16Wrapper.class, ClientCorporationCustomObjectInstance16ListWrapper.class, "ClientCorporationCustomObject16EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_17("ClientCorporationCustomObjectInstance17", ClientCorporationCustomObjectInstance17.class, ClientCorporationCustomObjectInstance17Wrapper.class, ClientCorporationCustomObjectInstance17ListWrapper.class, "ClientCorporationCustomObject17EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_18("ClientCorporationCustomObjectInstance18", ClientCorporationCustomObjectInstance18.class, ClientCorporationCustomObjectInstance18Wrapper.class, ClientCorporationCustomObjectInstance18ListWrapper.class, "ClientCorporationCustomObject18EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_19("ClientCorporationCustomObjectInstance19", ClientCorporationCustomObjectInstance19.class, ClientCorporationCustomObjectInstance19Wrapper.class, ClientCorporationCustomObjectInstance19ListWrapper.class, "ClientCorporationCustomObject19EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_20("ClientCorporationCustomObjectInstance20", ClientCorporationCustomObjectInstance20.class, ClientCorporationCustomObjectInstance20Wrapper.class, ClientCorporationCustomObjectInstance20ListWrapper.class, "ClientCorporationCustomObject20EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_21("ClientCorporationCustomObjectInstance21", ClientCorporationCustomObjectInstance21.class, ClientCorporationCustomObjectInstance21Wrapper.class, ClientCorporationCustomObjectInstance21ListWrapper.class, "ClientCorporationCustomObject21EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_22("ClientCorporationCustomObjectInstance22", ClientCorporationCustomObjectInstance22.class, ClientCorporationCustomObjectInstance22Wrapper.class, ClientCorporationCustomObjectInstance22ListWrapper.class, "ClientCorporationCustomObject22EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_23("ClientCorporationCustomObjectInstance23", ClientCorporationCustomObjectInstance23.class, ClientCorporationCustomObjectInstance23Wrapper.class, ClientCorporationCustomObjectInstance23ListWrapper.class, "ClientCorporationCustomObject23EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_24("ClientCorporationCustomObjectInstance24", ClientCorporationCustomObjectInstance24.class, ClientCorporationCustomObjectInstance24Wrapper.class, ClientCorporationCustomObjectInstance24ListWrapper.class, "ClientCorporationCustomObject24EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_25("ClientCorporationCustomObjectInstance25", ClientCorporationCustomObjectInstance25.class, ClientCorporationCustomObjectInstance25Wrapper.class, ClientCorporationCustomObjectInstance25ListWrapper.class, "ClientCorporationCustomObject25EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_26("ClientCorporationCustomObjectInstance26", ClientCorporationCustomObjectInstance26.class, ClientCorporationCustomObjectInstance26Wrapper.class, ClientCorporationCustomObjectInstance26ListWrapper.class, "ClientCorporationCustomObject26EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_27("ClientCorporationCustomObjectInstance27", ClientCorporationCustomObjectInstance27.class, ClientCorporationCustomObjectInstance27Wrapper.class, ClientCorporationCustomObjectInstance27ListWrapper.class, "ClientCorporationCustomObject27EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_28("ClientCorporationCustomObjectInstance28", ClientCorporationCustomObjectInstance28.class, ClientCorporationCustomObjectInstance28Wrapper.class, ClientCorporationCustomObjectInstance28ListWrapper.class, "ClientCorporationCustomObject28EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_29("ClientCorporationCustomObjectInstance29", ClientCorporationCustomObjectInstance29.class, ClientCorporationCustomObjectInstance29Wrapper.class, ClientCorporationCustomObjectInstance29ListWrapper.class, "ClientCorporationCustomObject29EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_30("ClientCorporationCustomObjectInstance30", ClientCorporationCustomObjectInstance30.class, ClientCorporationCustomObjectInstance30Wrapper.class, ClientCorporationCustomObjectInstance30ListWrapper.class, "ClientCorporationCustomObject30EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_31("ClientCorporationCustomObjectInstance31", ClientCorporationCustomObjectInstance31.class, ClientCorporationCustomObjectInstance31Wrapper.class, ClientCorporationCustomObjectInstance31ListWrapper.class, "ClientCorporationCustomObject31EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_32("ClientCorporationCustomObjectInstance32", ClientCorporationCustomObjectInstance32.class, ClientCorporationCustomObjectInstance32Wrapper.class, ClientCorporationCustomObjectInstance32ListWrapper.class, "ClientCorporationCustomObject32EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_33("ClientCorporationCustomObjectInstance33", ClientCorporationCustomObjectInstance33.class, ClientCorporationCustomObjectInstance33Wrapper.class, ClientCorporationCustomObjectInstance33ListWrapper.class, "ClientCorporationCustomObject33EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_34("ClientCorporationCustomObjectInstance34", ClientCorporationCustomObjectInstance34.class, ClientCorporationCustomObjectInstance34Wrapper.class, ClientCorporationCustomObjectInstance34ListWrapper.class, "ClientCorporationCustomObject34EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_35("ClientCorporationCustomObjectInstance35", ClientCorporationCustomObjectInstance35.class, ClientCorporationCustomObjectInstance35Wrapper.class, ClientCorporationCustomObjectInstance35ListWrapper.class, "ClientCorporationCustomObject35EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),


    PERSON_CUSTOM_OBJECT_INSTANCE_1("PersonCustomObjectInstance1", PersonCustomObjectInstance1.class, PersonCustomObjectInstance1Wrapper.class, PersonCustomObjectInstance1ListWrapper.class, "PersonCustomObject1EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_2("PersonCustomObjectInstance2", PersonCustomObjectInstance2.class, PersonCustomObjectInstance2Wrapper.class, PersonCustomObjectInstance2ListWrapper.class, "PersonCustomObject2EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_3("PersonCustomObjectInstance3", PersonCustomObjectInstance3.class, PersonCustomObjectInstance3Wrapper.class, PersonCustomObjectInstance3ListWrapper.class, "PersonCustomObject3EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_4("PersonCustomObjectInstance4", PersonCustomObjectInstance4.class, PersonCustomObjectInstance4Wrapper.class, PersonCustomObjectInstance4ListWrapper.class, "PersonCustomObject4EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_5("PersonCustomObjectInstance5", PersonCustomObjectInstance5.class, PersonCustomObjectInstance5Wrapper.class, PersonCustomObjectInstance5ListWrapper.class, "PersonCustomObject5EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_6("PersonCustomObjectInstance6", PersonCustomObjectInstance6.class, PersonCustomObjectInstance6Wrapper.class, PersonCustomObjectInstance6ListWrapper.class, "PersonCustomObject6EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_7("PersonCustomObjectInstance7", PersonCustomObjectInstance7.class, PersonCustomObjectInstance7Wrapper.class, PersonCustomObjectInstance7ListWrapper.class, "PersonCustomObject7EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_8("PersonCustomObjectInstance8", PersonCustomObjectInstance8.class, PersonCustomObjectInstance8Wrapper.class, PersonCustomObjectInstance8ListWrapper.class, "PersonCustomObject8EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_9("PersonCustomObjectInstance9", PersonCustomObjectInstance9.class, PersonCustomObjectInstance9Wrapper.class, PersonCustomObjectInstance9ListWrapper.class, "PersonCustomObject9EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_10("PersonCustomObjectInstance10", PersonCustomObjectInstance10.class, PersonCustomObjectInstance10Wrapper.class, PersonCustomObjectInstance10ListWrapper.class, "PersonCustomObject10EditHistory", "PersonCustomObjectEditHistoryFieldChange"),

    CANDIDATE_FILE_ATTACHMENT("CandidateFileAttachment", CandidateFileAttachment.class, CandidateFileAttachmentWrapper.class, CandidateFileAttachmentListWrapper.class, null, null),
    CLIENT_CONTACT_FILE_ATTACHMENT("ClientContactFileAttachment", ClientContactFileAttachment.class, ClientContactFileAttachmentWrapper.class, ClientContactFileAttachmentListWrapper.class, null, null),
    CLIENT_CORPORATION_FILE_ATTACHMENT("ClientCorporationFileAttachment", ClientCorporationFileAttachment.class, ClientCorporationFileAttachmentWrapper.class, ClientCorporationFileAttachmentListWrapper.class, null, null),
    JOB_ORDER_FILE_ATTACHMENT("JobOrderFileAttachment", JobOrderFileAttachment.class, JobOrderFileAttachmentWrapper.class, JobOrderFileAttachmentListWrapper.class, null, null),
    OPPORTUNITY_FILE_ATTACHMENT("OpportunityFileAttachment", OpportunityFileAttachment.class, OpportunityFileAttachmentWrapper.class, OpportunityFileAttachmentListWrapper.class, null, null),
    PLACEMENT_FILE_ATTACHMENT("PlacementFileAttachment", PlacementFileAttachment.class, PlacementFileAttachmentWrapper.class, PlacementFileAttachmentListWrapper.class, null, null);

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
     * @param type the BullhornEntity class
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
