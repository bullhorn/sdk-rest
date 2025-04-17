package com.bullhornsdk.data.api.mock

import com.bullhornsdk.data.api.helper.RestJsonConverter
import com.bullhornsdk.data.api.helper.concurrency.ConcurrencyService
import com.bullhornsdk.data.api.helper.concurrency.standard.RestConcurrencyService
import com.bullhornsdk.data.model.entity.core.bte.Holiday
import com.bullhornsdk.data.model.entity.core.bte.HolidayInstance
import com.bullhornsdk.data.model.entity.core.bte.rules.ClientCorporationBillRuleset
import com.bullhornsdk.data.model.entity.core.bte.rules.ClientCorporationBillRulesetVersion
import com.bullhornsdk.data.model.entity.core.bte.rules.ClientCorporationPayRuleset
import com.bullhornsdk.data.model.entity.core.bte.rules.ClientCorporationPayRulesetVersion
import com.bullhornsdk.data.model.entity.core.bte.rules.TimeLaborEvalRule
import com.bullhornsdk.data.model.entity.core.bte.rules.TimeLaborEvalRuleTemplate
import com.bullhornsdk.data.model.entity.core.certificationrequirement.CandidateCertificationRequirement
import com.bullhornsdk.data.model.entity.core.certificationrequirement.CertificationRequirement
import com.bullhornsdk.data.model.entity.core.certificationrequirement.JobSubmissionCertificationRequirement
import com.bullhornsdk.data.model.entity.core.certificationrequirement.optionslookup.CertificationRequirementStatusLookup
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObject
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObject
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObject
import com.bullhornsdk.data.model.entity.core.customobject.UserCustomObject
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.*
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.*
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.*
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.*
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.*
import com.bullhornsdk.data.model.entity.core.edithistory.EditHistory
import com.bullhornsdk.data.model.entity.core.edithistory.FieldChange
import com.bullhornsdk.data.model.entity.core.eds.EdsData
import com.bullhornsdk.data.model.entity.core.eds.EdsEntityType
import com.bullhornsdk.data.model.entity.core.eds.EdsEntityTypeSchemaVersion
import com.bullhornsdk.data.model.entity.core.eds.EdsSourceSystem
import com.bullhornsdk.data.model.entity.core.eds.SourceSystemTypeLookup
import com.bullhornsdk.data.model.entity.core.onboarding365.forms.FederalTaxForm
import com.bullhornsdk.data.model.entity.core.onboarding365.forms.LocalTaxForm
import com.bullhornsdk.data.model.entity.core.onboarding365.forms.StateTaxForm
import com.bullhornsdk.data.model.entity.core.paybill.BillingProfile
import com.bullhornsdk.data.model.entity.core.paybill.CanvasReport
import com.bullhornsdk.data.model.entity.core.paybill.JobCode
import com.bullhornsdk.data.model.entity.core.paybill.Location
import com.bullhornsdk.data.model.entity.core.paybill.charge.BillableCharge
import com.bullhornsdk.data.model.entity.core.paybill.charge.PayExportBatch
import com.bullhornsdk.data.model.entity.core.paybill.charge.PayableCharge
import com.bullhornsdk.data.model.entity.core.paybill.detail.BillMasterTransactionDiscountDetail
import com.bullhornsdk.data.model.entity.core.paybill.detail.BillMasterTransactionSalesTaxDetail
import com.bullhornsdk.data.model.entity.core.paybill.detail.BillMasterTransactionSurchargeDetail
import com.bullhornsdk.data.model.entity.core.paybill.discount.Discount
import com.bullhornsdk.data.model.entity.core.paybill.distribution.BillMasterTransactionDistributionBatch
import com.bullhornsdk.data.model.entity.core.paybill.distribution.UnbilledRevenueDistribution
import com.bullhornsdk.data.model.entity.core.paybill.distribution.UnbilledRevenueDistributionBatch
import com.bullhornsdk.data.model.entity.core.paybill.earncode.EarnCode
import com.bullhornsdk.data.model.entity.core.paybill.earncode.EarnCodeGroup
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.*
import com.bullhornsdk.data.model.entity.core.paybill.invoice.*
import com.bullhornsdk.data.model.entity.core.paybill.master.BatchGroup
import com.bullhornsdk.data.model.entity.core.paybill.master.BillMaster
import com.bullhornsdk.data.model.entity.core.paybill.master.BillingSyncBatch
import com.bullhornsdk.data.model.entity.core.paybill.master.PayMaster
import com.bullhornsdk.data.model.entity.core.paybill.rate.*
import com.bullhornsdk.data.model.entity.core.paybill.surcharge.Surcharge
import com.bullhornsdk.data.model.entity.core.paybill.tax.Tax
import com.bullhornsdk.data.model.entity.core.paybill.transaction.BillMasterTransaction
import com.bullhornsdk.data.model.entity.core.paybill.transaction.PayMasterTransaction
import com.bullhornsdk.data.model.entity.core.paybill.transaction.UnbilledRevenueGeneralLedgerExportStatusLookup
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit
import com.bullhornsdk.data.model.entity.core.standard.*
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity
import com.bullhornsdk.data.model.entity.core.type.SearchEntity
import com.bullhornsdk.data.model.entity.embedded.UserType
import com.bullhornsdk.data.model.entity.file.*
import com.bullhornsdk.data.model.entity.meta.MetaData
import com.bullhornsdk.data.model.entity.meta.StandardMetaData
import com.bullhornsdk.data.model.entity.report.Report
import com.bullhornsdk.data.model.enums.BullhornEntityInfo
import com.bullhornsdk.data.model.response.edithistory.EditHistoryListWrapper
import com.bullhornsdk.data.model.response.edithistory.FieldChangeListWrapper
import com.bullhornsdk.data.model.response.event.standard.StandardGetEventsResponse
import com.bullhornsdk.data.model.response.event.standard.StandardGetLastRequestIdResponse
import com.bullhornsdk.data.model.response.list.FastFindListWrapper
import com.bullhornsdk.data.model.response.list.ListWrapper
import com.bullhornsdk.data.model.response.list.PropertyOptionsListWrapper
import com.bullhornsdk.data.util.copy.KryoObjectCopyHelper
import org.apache.commons.io.IOUtils
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.io.ClassPathResource

import java.util.concurrent.ConcurrentHashMap

public class MockDataLoader {

    private final static Logger log = LogManager.getLogger(MockDataLoader.class);
    private final RestJsonConverter restJsonConverter;

    private Map<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>> restEntityMapCache;
    private List<FastFindResult> fastFindResultListCache;
    private List<EditHistory> editHistoryListCache;
    private List<FieldChange> editHistoryFieldChangeListCache;
    private StandardGetEventsResponse getEventsResponseCache;
    private StandardGetLastRequestIdResponse getLastRequestIdResponseCache;
    private Map<String, Object> settingsResultMapCache;
    private Settings settingsObjectResultCache;
    private Map<Class<? extends BullhornEntity>, MetaData<?>> restMetaDataMapCache;
    private Map<Class<? extends SearchEntity>, List<MockSearchField>> searchFieldsMapCache;
    private List<PropertyOptionsResult> propertyOptionsResultListCache;

    private Map<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>> restEntityMap;
    private List<FastFindResult> fastFindResultList;
    private List<EditHistory> editHistoryList;
    private List<FieldChange> editHistoryFieldChangeList;
    private StandardGetEventsResponse getEventsResponse;
    private StandardGetLastRequestIdResponse getLastRequestIdResponse;
    private Map<String, Object> settingsResultMap;
    private Settings settingsObjectResult;
    private Map<Class<? extends BullhornEntity>, MetaData<?>> restMetaDataMap
    private List<PropertyOptionsResult> propertyOptionsResultList;

    private Map<Class<? extends BullhornEntity>, String> entityFileNames;
    private Map<Class<? extends BullhornEntity>, String> metaDataFileNames;
    private Map<Class<? extends SearchEntity>, String> searchFieldsFileNames;
    private final ConcurrencyService concurrencyService;

    private Map<Class<? extends SearchEntity>, List<MockSearchField>> searchFieldsMap;

    public MockDataLoader() {
        super();
        this.restJsonConverter = new RestJsonConverter();
        this.entityFileNames = getEntityFileNames();
        this.metaDataFileNames = getMetaDataFileNames();
        this.searchFieldsFileNames = getSearchFieldFileNames();
        this.concurrencyService = new RestConcurrencyService();
    }

    public Map<Class<? extends SearchEntity>, List<MockSearchField>> getSearchFields() {
        if (searchFieldsMap == null) {
            reloadSearchFieldData();
            this.searchFieldsMapCache = KryoObjectCopyHelper.copy(searchFieldsMap);
        }
        return searchFieldsMap;
    }

    public Map<Class<? extends BullhornEntity>, MetaData<?>> getMetaTestData() {
        if (restMetaDataMap == null) {
            reloadMetaData();
            this.restMetaDataMapCache = KryoObjectCopyHelper.copy(restMetaDataMap);
        }
        return restMetaDataMap;
    }

    public Map<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>> getEntityTestData() {
        if (restEntityMap == null) {
            reloadEntityData();
            this.restEntityMapCache = KryoObjectCopyHelper.copy(restEntityMap);
        }
        return restEntityMap;
    }

    public List<EditHistory> getEditHistoryList() {
        if (editHistoryList == null) {
            reloadEditHistoryResults();
            this.editHistoryListCache = KryoObjectCopyHelper.copy(editHistoryList);
        }
        return editHistoryList;
    }

    public List<EditHistory> getEditHistoryFieldChangeList() {
        if (editHistoryFieldChangeList == null) {
            reloadEditHistoryFieldChangeResults();
            this.editHistoryFieldChangeListCache = KryoObjectCopyHelper.copy(editHistoryFieldChangeList);
        }
        return editHistoryFieldChangeList;
    }

    public List<FastFindResult> getFastFindResults() {
        if (fastFindResultList == null) {
            reloadFastFindResults();
            this.fastFindResultListCache = KryoObjectCopyHelper.copy(fastFindResultList);
        }
        return fastFindResultList;
    }

    public StandardGetEventsResponse getEventsResponse() {
        if (getEventsResponse == null) {
            reloadGetEventsResponses();
            this.getEventsResponseCache = KryoObjectCopyHelper.copy(getEventsResponse);
        }

        return getEventsResponse;
    }

    public StandardGetLastRequestIdResponse getLastRequestIdResponse() {
        if (getLastRequestIdResponse == null) {
            reloadGetLastRequestIdResponses();
            this.getLastRequestIdResponseCache = KryoObjectCopyHelper.copy(getLastRequestIdResponse);
        }

        return getLastRequestIdResponse;
    }


    public Map<String, Object> getSettingsResults() {
        if (settingsResultMap == null) {
            reloadSettingsResults();
            this.settingsResultMapCache = KryoObjectCopyHelper.copy(settingsResultMap);
        }
        return settingsResultMap;
    }

    public Settings getSettingsObjectResults() {
        if (settingsObjectResult == null) {
            reloadSettingsObjectResults();
            this.settingsObjectResultCache = KryoObjectCopyHelper.copy(settingsObjectResult);
        }
        return settingsObjectResult;
    }

    public List<PropertyOptionsResult> getPropertyOptionsResults() {
        if (propertyOptionsResultList == null) {
            reloadPropertyOptionsResults();
            this.propertyOptionsResultListCache = KryoObjectCopyHelper.copy(propertyOptionsResultList);
        }
        return propertyOptionsResultList;
    }

    /**
     * Returns a map with entities loaded fresh from the test data.
     *
     * @return
     */
    public <T extends BullhornEntity> Map<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>> reloadEntityData() {
        this.restEntityMap = new ConcurrentHashMap<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>>();

        entityFileNames.entrySet().parallelStream().each {
            String jsonData = getFileData(it.getValue());
            List<? extends BullhornEntity> data = jsonStringToEntityList(jsonData, it.getKey());
            addMapEntryForOneEntity(data, it.getKey());
        };

        return restEntityMap;

    }

    public void reloadEditHistoryResults() {
        String jsonData = getFileData("edithistory/edithistory-data.txt");
        EditHistoryListWrapper listWrapper = restJsonConverter.jsonToEntity(jsonData, EditHistoryListWrapper.class);
        this.editHistoryList = listWrapper.getData();
    }

    public void reloadEditHistoryFieldChangeResults() {
        String jsonData = getFileData("edithistory/fieldchange-data.txt");
        FieldChangeListWrapper listWrapper = restJsonConverter.jsonToEntity(jsonData, FieldChangeListWrapper.class);
        this.editHistoryFieldChangeList = listWrapper.getData();
    }

    public void reloadFastFindResults() {

        String jsonData = getFileData("fastfind-data.txt");
        FastFindListWrapper listWrapper = restJsonConverter.jsonToEntity(jsonData, FastFindListWrapper.class);
        this.fastFindResultList = listWrapper.getData();
    }

    public void reloadGetEventsResponses() {
        String jsonData = getFileData("event-data.txt");
        StandardGetEventsResponse eventsResponse = restJsonConverter.jsonToEntity(jsonData, StandardGetEventsResponse.class);
        this.getEventsResponse = eventsResponse;
    }

    public void reloadGetLastRequestIdResponses() {
        String jsonData = getFileData("lastrequestid-data.txt");
        StandardGetLastRequestIdResponse response = restJsonConverter.jsonToEntity(jsonData, StandardGetLastRequestIdResponse.class);
        this.getLastRequestIdResponse = response;
    }

    public void reloadSettingsResults() {

        String jsonData = getFileData("settings-data.txt");
        Map<String, Object> resultData = restJsonConverter.jsonToEntity(jsonData, Map.class);
        this.settingsResultMap = resultData;
    }

    public void reloadSettingsObjectResults() {

        String jsonData = getFileData("settings-data.txt");
        Settings resultData = restJsonConverter.jsonToEntity(jsonData, Settings.class);
        this.settingsObjectResult = resultData;
    }

    /**
     * Returns a map with entities loaded fresh from the test data.
     *
     * @return
     */
    public <T extends BullhornEntity> Map<Class<? extends BullhornEntity>, MetaData<?>> reloadMetaData() {
        this.restMetaDataMap = new ConcurrentHashMap<Class<? extends BullhornEntity>, MetaData<?>>();

        metaDataFileNames.entrySet().parallelStream().each {
            String jsonData = getFileData(it.getValue());
            MetaData<T> metaData = jsonStringToMetaData(jsonData);
            restMetaDataMap.put(it.getKey(), metaData);
        }
        return restMetaDataMap;

    }

    /**
     * Returns a map with entities loaded fresh from the test data.
     *
     * @return
     */
    public <T extends SearchEntity> Map<Class<? extends SearchEntity>, List<MockSearchField>> reloadSearchFieldData() {
        this.searchFieldsMap = new ConcurrentHashMap<Class<? extends SearchEntity>, List<MockSearchField>>();
        searchFieldsFileNames.entrySet().parallelStream().each {
            String jsonData = getFileData(it.getValue());
            List<MockSearchField> searchFields = jsonStringToMockSearchFields(jsonData);
            searchFieldsMap.put(it.getKey(), searchFields);
        }
        return searchFieldsMap;

    }


    public <T extends BullhornEntity> Map<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>> reloadEntityDataFromCache() {
        this.restEntityMap = KryoObjectCopyHelper.copy(restEntityMapCache);
        return restEntityMap;

    }

    /**
     * Returns a map with entities loaded fresh from the test data.
     *
     * @return
     */
    public <T extends BullhornEntity> Map<Class<? extends BullhornEntity>, MetaData<?>> reloadMetaDataFromCache() {
        this.restMetaDataMap = KryoObjectCopyHelper.copy(restMetaDataMapCache);
        return restMetaDataMap;

    }

    public void reloadPropertyOptionsResults() {
        String jsonData = getFileData("propertyoptions-data.txt");
        PropertyOptionsListWrapper listWrapper = restJsonConverter.jsonToEntity(jsonData, PropertyOptionsListWrapper.class);
        this.propertyOptionsResultList = listWrapper.getData();
    }

    /**
     * Get the json data from a file.
     *
     * @param fileName
     * @return The json data stored in a file
     */
    private String getFileData(String fileName) {

        String jsonDataString = "";
        try {

            ClassPathResource data = new ClassPathResource("testdata/rest/" + fileName);
            jsonDataString = IOUtils.toString(data.getInputStream(), "UTF-8");

        } catch (IOException e) {
            log.error("Unable to load test data from filename: {}", fileName);
            throw new IllegalArgumentException("Unable to load test data from filename: " + fileName, e);
        }

        return jsonDataString;
    }

    /**
     * Convert the json data to a List<T> of RestEntities
     *
     * @param jsonData
     *            The string of json to convert
     * @param type
     *            The type to convert to
     *
     * @return a list of RestEntities of type T
     */
    private <T extends BullhornEntity> List<T> jsonStringToEntityList(String jsonData, Class<T> type) {

        ListWrapper<T> listWrapper = restJsonConverter.jsonToEntity(jsonData, BullhornEntityInfo.getTypesListWrapperType(type));

        return listWrapper.getData();

    }

    /**
     * Converts the json data to a MetaData<T> object
     *
     * @param jsonData
     * @param type
     *            the BullhornEntity type
     * @return
     */
    private <T extends BullhornEntity> MetaData<T> jsonStringToMetaData(String jsonData) {
        return restJsonConverter.jsonToEntity(jsonData, StandardMetaData.class);
    }

    /**
     * Converts the searchField json data to a list of fields
     * @param jsonData
     * @return
     */
    private List<MockSearchField> jsonStringToMockSearchFields(String jsonData) {

        MockSearchFieldWrapper fieldsWrapper = restJsonConverter.jsonToEntity(jsonData, MockSearchFieldWrapper.class);

        return fieldsWrapper.getSearchFields();

    }

    /**
     * Adds a list of List<T> RestEntities to the restEntityMap
     *
     * @param type
     * @param data
     */
    private <T extends BullhornEntity> void addMapEntryForOneEntity(List<T> data, Class<? extends BullhornEntity> type) {

        Map<Integer, T> oneEntityMap = new ConcurrentHashMap<Integer, T>();

        for (T entity : data) {
            oneEntityMap.put(entity.getId(), entity);
        }

        this.restEntityMap.put(type, oneEntityMap);

    }

    public static Map<Class<? extends BullhornEntity>, String> getEntityFileNames() {
        Map<Class<? extends BullhornEntity>, String> entityFiles = new LinkedHashMap<Class<? extends BullhornEntity>, String>();
        entityFiles.put(Appointment.class, "appointment-data.txt");
        entityFiles.put(AppointmentAttendee.class, "appointmentattendee-data.txt");
        entityFiles.put(Branch.class, "branch-data.txt");
        entityFiles.put(BusinessSector.class, "businesssector-data.txt");
        entityFiles.put(Candidate.class, "candidate-data.txt");
        entityFiles.put(CandidateCertification.class, "candidatecertification-data.txt");
        entityFiles.put(CandidateEducation.class, "candidateeducation-data.txt");
        entityFiles.put(CandidateReference.class, "candidatereference-data.txt");
        entityFiles.put(CandidateSource.class, "candidatesource-data.txt");
        entityFiles.put(CandidateWorkHistory.class, "candidateworkhistory-data.txt");
        entityFiles.put(Category.class, "category-data.txt");
        entityFiles.put(Certification.class, "certification-data.txt");
        entityFiles.put(CertificationGroup.class, "certificationgroup-data.txt");
        entityFiles.put(ClientContact.class, "clientcontact-data.txt");
        entityFiles.put(ClientContact1.class, "clientcontact1-data.txt");
        entityFiles.put(ClientContact2.class, "clientcontact2-data.txt");
        entityFiles.put(ClientContact3.class, "clientcontact3-data.txt");
        entityFiles.put(ClientContact4.class, "clientcontact4-data.txt");
        entityFiles.put(ClientContact5.class, "clientcontact5-data.txt");
        entityFiles.put(ClientCorporation.class, "clientcorporation-data.txt");
        entityFiles.put(ClientCorporation1.class, "clientcorporation1-data.txt");
        entityFiles.put(ClientCorporation2.class, "clientcorporation2-data.txt");
        entityFiles.put(ClientCorporation3.class, "clientcorporation3-data.txt");
        entityFiles.put(ClientCorporation4.class, "clientcorporation4-data.txt");
        entityFiles.put(ClientCorporation5.class, "clientcorporation5-data.txt");
        entityFiles.put(ClientCorporationCertification.class, "clientcorporationcertification-data.txt");
        entityFiles.put(CorporateUser.class, "corporateuser-data.txt");
        entityFiles.put(CorporationDepartment.class, "corporationdepartment-data.txt");
        entityFiles.put(Corporation.class, "corporation-data.txt");
        entityFiles.put(Country.class, "country-data.txt");
        entityFiles.put(Department.class, "department-data.txt");
        entityFiles.put(DistributionList.class, "distributionlist-data.txt");
        entityFiles.put(File.class, "file-data.txt");
        entityFiles.put(GoalTarget.class, "goaltarget-data.txt");
        entityFiles.put(HousingComplex.class, "housingcomplex-data.txt");
        entityFiles.put(HousingComplexAmenity.class, "housingcomplexamenity-data.txt");
        entityFiles.put(HousingComplexUnit.class, "housingcomplexunit-data.txt");
        entityFiles.put(HousingComplexFurnitureDelivery.class, "housingcomplexfurnituredelivery-data.txt");
        entityFiles.put(HousingComplexUtilityAccount.class, "housingcomplexutilityaccount-data.txt");
        entityFiles.put(UserHousingComplexUnit.class, "userhousingcomplexunit-data.txt");
        entityFiles.put(CandidateTaxInfo.class, "candidatetaxinfo-data.txt");
        entityFiles.put(JobBoardPost.class, "jobboardpost-data.txt");
        entityFiles.put(JobOrder.class, "joborder-data.txt");
        entityFiles.put(JobShift.class, "jobshift-data.txt");
        entityFiles.put(JobShiftAssignment.class, "jobshiftassignment-data.txt");
        entityFiles.put(JobSubmission.class, "jobsubmission-data.txt");
        entityFiles.put(JobSubmissionHistory.class, "jobsubmissionhistory-data.txt");
        entityFiles.put(Lead.class, "lead-data.txt");
        entityFiles.put(Note.class, "note-data.txt");
        entityFiles.put(NoteEntity.class, "noteentity-data.txt");
        entityFiles.put(Opportunity.class, "opportunity-data.txt");
        entityFiles.put(Person.class, "person-data.txt");
        entityFiles.put(Placement.class, "placement-data.txt");
        entityFiles.put(DocumentDataFlowback.class, "documentdataflowback-data.txt");
        entityFiles.put(PlacementCertification.class, "placementcertification-data.txt");
        entityFiles.put(PlacementChangeRequest.class, "placementchangerequest-data.txt");
        entityFiles.put(PlacementCommission.class, "placementcommission-data.txt");
        entityFiles.put(PlacementShiftSet.class, "placementshiftset-data.txt");
        entityFiles.put(PlacementShiftSetVersion.class, "placementshiftsetVersion-data.txt");
        entityFiles.put(PrivateLabel.class, "privatelabel-data.txt");
        entityFiles.put(Report.class, "report-data.txt");
        entityFiles.put(Sendout.class, "sendout-data.txt");
        entityFiles.put(Skill.class, "skill-data.txt");
        entityFiles.put(Specialty.class, "specialty-data.txt");
        entityFiles.put(State.class, "state-data.txt");
        entityFiles.put(Task.class, "task-data.txt");
        entityFiles.put(Tearsheet.class, "tearsheet-data.txt");
        entityFiles.put(TearsheetMember.class, "tearsheetmember-data.txt");
        entityFiles.put(TimeUnit.class, "timeunit-data.txt");
        entityFiles.put(UserSetting.class, "usersetting-data.txt");
        entityFiles.put(UserType.class, "usertype-data.txt");
        entityFiles.put(WorkersCompensation.class, "workerscompensation-data.txt");
        entityFiles.put(WorkersCompensationRate.class, "workerscompensationrate-data.txt");

        entityFiles.put(BillingProfile.class, "paybill/billingprofile-data.txt");
        entityFiles.put(InvoiceTerm.class, "paybill/invoiceterm-data.txt");
        entityFiles.put(Location.class, "paybill/location-data.txt");
        entityFiles.put(GeneralLedgerAccount.class, "paybill/generalLedgerAccount-data.txt");
        entityFiles.put(InvoiceStatementTemplate.class, "paybill/invoiceStatementTemplate-data.txt");
        entityFiles.put(InvoiceStatementMessageTemplate.class, "paybill/invoiceStatementMessageTemplate-data.txt");
        entityFiles.put(CurrencyUnit.class, "paybill/currencyUnit-data.txt");

        entityFiles.put(JobOrderRateCard.class, "paybill/rate/joborderratecard-data.txt");
        entityFiles.put(JobOrderRateCardLine.class, "paybill/rate/joborderratecardline-data.txt");
        entityFiles.put(JobOrderRateCardLineGroup.class, "paybill/rate/joborderratecardlinegroup-data.txt");
        entityFiles.put(JobOrderRateCardVersion.class, "paybill/rate/joborderratecardversion-data.txt");

        entityFiles.put(PlacementRateCard.class, "paybill/rate/placementratecard-data.txt");
        entityFiles.put(PlacementRateCardLine.class, "paybill/rate/placementratecardline-data.txt");
        entityFiles.put(PlacementRateCardLineGroup.class, "paybill/rate/placementratecardlinegroup-data.txt");
        entityFiles.put(PlacementRateCardVersion.class, "paybill/rate/placementratecardversion-data.txt");

        entityFiles.put(PlacementTimeAndExpense.class, "placementtimeandexpense-data.txt");

        entityFiles.put(BillMasterTransactionDiscountDetail.class, "paybill/detail/billmastertransactiondiscountdetail-data.txt");
        entityFiles.put(BillMasterTransactionSalesTaxDetail.class, "paybill/detail/billmastertransactionsalestaxdetail-data.txt");
        entityFiles.put(BillMasterTransactionSurchargeDetail.class, "paybill/detail/billmastertransactionsurchargedetail-data.txt");
        entityFiles.put(BillMasterDiscountRate.class, "billmasterdiscountrate-data.txt");

        entityFiles.put(InvoiceStatementDistributionBatch.class, "paybill/invoice/invoicestatementdistributionbatch-data.txt");
        entityFiles.put(InvoiceStatementLineDistribution.class, "paybill/invoice/invoicestatementlinedistribution-data.txt");

        entityFiles.put(AllSalesTaxRate.class, "paybill/rate/allsalestaxrate-data.txt");
        entityFiles.put(BillMasterTransactionDiscountRate.class, "paybill/rate/billmastertransactiondiscountrate-data.txt");
        entityFiles.put(BillMasterTransactionSalesTaxRate.class, "paybill/rate/billmastertransactionsalestaxrate-data.txt");
        entityFiles.put(BillMasterTransactionSurchargeRate.class, "paybill/rate/billmastertransactionsurchargerate-data.txt");
        entityFiles.put(DiscountRate.class, "paybill/rate/discountrate-data.txt");
        entityFiles.put(DiscountRateVersion.class, "paybill/rate/discountrateversion-data.txt");
        entityFiles.put(ExternalSalesTaxRate.class, "paybill/rate/externalsalestaxrate-data.txt");
        entityFiles.put(ExternalSalesTaxRateVersion.class, "paybill/rate/externalsalestaxrateversion-data.txt");
        entityFiles.put(InvoiceStatementLineItemDiscountRate.class, "paybill/rate/invoicestatementlineitemdiscountrate-data.txt");
        entityFiles.put(InvoiceStatementLineItemSalesTaxRate.class, "paybill/rate/invoicestatementlineitemsalestaxrate-data.txt");
        entityFiles.put(InvoiceStatementLineItemSurchargeRate.class, "paybill/rate/invoicestatementlineitemsurchargerate-data.txt");
        entityFiles.put(InvoiceStatementDiscountRate.class, "paybill/rate/invoicestatementdiscountrate-data.txt");
        entityFiles.put(InvoiceStatementSalesTaxRate.class, "paybill/rate/invoicestatementsalestaxrate-data.txt");
        entityFiles.put(InvoiceStatementSurchargeRate.class, "paybill/rate/invoicestatementsurchargerate-data.txt");
        entityFiles.put(SalesTaxRate.class, "paybill/rate/salestaxrate-data.txt");
        entityFiles.put(SalesTaxRateVersion.class, "paybill/rate/salestaxrateversion-data.txt");
        entityFiles.put(SurchargeRate.class, "paybill/rate/surchargerate-data.txt");

        // TODO add v2 of PAY and Bill Entities data
        entityFiles.put(BillableCharge.class, "paybill/billablecharge-data.txt");
        entityFiles.put(PayableCharge.class, "paybill/payablecharge-data.txt");
        entityFiles.put(GeneralLedgerSegment.class, "paybill/generalledgersegment-data.txt");
        entityFiles.put(GeneralLedgerSegment1.class, "paybill/generalledgersegment1-data.txt");
        entityFiles.put(GeneralLedgerSegment2.class, "paybill/generalledgersegment2-data.txt");
        entityFiles.put(GeneralLedgerSegment3.class, "paybill/generalledgersegment3-data.txt");
        entityFiles.put(GeneralLedgerSegment4.class, "paybill/generalledgersegment4-data.txt");
        entityFiles.put(GeneralLedgerSegment5.class, "paybill/generalledgersegment5-data.txt");
        entityFiles.put(GeneralLedgerSegmentType.class, "paybill/generalledgersegmenttype-data.txt");
        entityFiles.put(GeneralLedgerServiceCode.class, "paybill/generalledgerservicecode-data.txt");
        entityFiles.put(Discount.class, "paybill/discount-data.txt");
        entityFiles.put(EarnCode.class, "paybill/earncode-data.txt");
        entityFiles.put(EarnCodeGroup.class, "paybill/earncodegroup-data.txt");
        entityFiles.put(InvoiceStatement.class, "paybill/invoicestatement-data.txt");
        entityFiles.put(InvoiceStatementBatch.class, "paybill/invoicestatementbatch-data.txt");
        entityFiles.put(InvoiceStatementHistory.class, "paybill/invoicestatementhistory-data.txt");
        entityFiles.put(InvoiceStatementDiscount.class, "paybill/invoicestatementdiscount-data.txt");
        entityFiles.put(InvoiceStatementExportBatch.class, "paybill/invoicestatementexportbatch-data.txt");
        entityFiles.put(InvoiceStatementLineItem.class, "paybill/invoicestatementlineitem-data.txt");
        entityFiles.put(InvoiceStatementSurcharge.class, "paybill/invoicestatementsurcharge-data.txt");
        entityFiles.put(InvoiceStatementTax.class, "paybill/invoicestatementtax-data.txt");
        entityFiles.put(BatchGroup.class, "paybill/batchgroup-data.txt");
        entityFiles.put(BillingSyncBatch.class, "paybill/billingsyncbatch-data.txt");
        entityFiles.put(BillMaster.class, "paybill/billmaster-data.txt");
        entityFiles.put(BillMasterTransaction.class, "paybill/billmastertransaction-data.txt");
        entityFiles.put(PayMaster.class, "paybill/paymaster-data.txt");
        entityFiles.put(PayMasterTransaction.class, "paybill/paymastertransaction-data.txt");
        entityFiles.put(PayExportBatch.class, "paybill/payexportbatch-data.txt");
        entityFiles.put(Surcharge.class, "paybill/surcharge-data.txt");
        entityFiles.put(Tax.class, "paybill/tax-data.txt");
        entityFiles.put(CanvasReport.class, "paybill/canvasreport-data.txt");
        entityFiles.put(BillMasterTransactionDistributionBatch.class, "paybill/billmastertransactiondistributionbatch-data.txt");
        entityFiles.put(UnbilledRevenueDistribution.class, "paybill/unbilledrevenuedistribution-data.txt");
        entityFiles.put(UnbilledRevenueDistributionBatch.class, "paybill/unbilledrevenuedistributionbatch-data.txt");
        entityFiles.put(UnbilledRevenueGeneralLedgerExportStatusLookup.class, "paybill/unbilledrevenuegeneralledgerexportstatuslookup-data.txt");
        entityFiles.put(JobCode.class, "paybill/jobcode-data.txt");

        entityFiles.put(ClientCorporationRateAgreementCard.class, "paybill/rate/clientcorporationrateagreementcard-data.txt");
        entityFiles.put(ClientCorporationRateAgreementCardLine.class, "paybill/rate/clientcorporationrateagreementcardline-data.txt");
        entityFiles.put(ClientCorporationRateAgreementCardLineGroup.class, "paybill/rate/clientcorporationrateagreementcardlinegroup-data.txt");
        entityFiles.put(ClientCorporationRateAgreementCardVersion.class, "paybill/rate/clientcorporationrateagreementcardversion-data.txt");

        entityFiles.put(CandidateCertificationRequirement.class, "candidatecertificationrequirement-data.txt");
        entityFiles.put(CertificationRequirement.class, "certificationrequirement-data.txt");
        entityFiles.put(JobSubmissionCertificationRequirement.class, "jobsubmissioncertificationrequirement-data.txt");
        entityFiles.put(CertificationRequirementStatusLookup.class, "certificationrequirementstatuslookup-data.txt");

        entityFiles.put(JobOrderCustomObjectInstance1.class, "customobjectinstances/jobordercustomobjectinstance1-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance2.class, "customobjectinstances/jobordercustomobjectinstance2-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance3.class, "customobjectinstances/jobordercustomobjectinstance3-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance4.class, "customobjectinstances/jobordercustomobjectinstance4-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance5.class, "customobjectinstances/jobordercustomobjectinstance5-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance6.class, "customobjectinstances/jobordercustomobjectinstance6-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance7.class, "customobjectinstances/jobordercustomobjectinstance7-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance8.class, "customobjectinstances/jobordercustomobjectinstance8-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance9.class, "customobjectinstances/jobordercustomobjectinstance9-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance10.class, "customobjectinstances/jobordercustomobjectinstance10-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance1.class, "customobjectinstances/opportunitycustomobjectinstance1-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance2.class, "customobjectinstances/opportunitycustomobjectinstance2-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance3.class, "customobjectinstances/opportunitycustomobjectinstance3-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance4.class, "customobjectinstances/opportunitycustomobjectinstance4-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance5.class, "customobjectinstances/opportunitycustomobjectinstance5-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance6.class, "customobjectinstances/opportunitycustomobjectinstance6-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance7.class, "customobjectinstances/opportunitycustomobjectinstance7-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance8.class, "customobjectinstances/opportunitycustomobjectinstance8-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance9.class, "customobjectinstances/opportunitycustomobjectinstance9-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance10.class, "customobjectinstances/opportunitycustomobjectinstance10-data.txt");
        entityFiles.put(PlacementCustomObjectInstance1.class, "customobjectinstances/placementcustomobjectinstance1-data.txt");
        entityFiles.put(PlacementCustomObjectInstance2.class, "customobjectinstances/placementcustomobjectinstance2-data.txt");
        entityFiles.put(PlacementCustomObjectInstance3.class, "customobjectinstances/placementcustomobjectinstance3-data.txt");
        entityFiles.put(PlacementCustomObjectInstance4.class, "customobjectinstances/placementcustomobjectinstance4-data.txt");
        entityFiles.put(PlacementCustomObjectInstance5.class, "customobjectinstances/placementcustomobjectinstance5-data.txt");
        entityFiles.put(PlacementCustomObjectInstance6.class, "customobjectinstances/placementcustomobjectinstance6-data.txt");
        entityFiles.put(PlacementCustomObjectInstance7.class, "customobjectinstances/placementcustomobjectinstance7-data.txt");
        entityFiles.put(PlacementCustomObjectInstance8.class, "customobjectinstances/placementcustomobjectinstance8-data.txt");
        entityFiles.put(PlacementCustomObjectInstance9.class, "customobjectinstances/placementcustomobjectinstance9-data.txt");
        entityFiles.put(PlacementCustomObjectInstance10.class, "customobjectinstances/placementcustomobjectinstance10-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance1.class, "customobjectinstances/clientcorporationcustomobjectinstance1-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance2.class, "customobjectinstances/clientcorporationcustomobjectinstance2-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance3.class, "customobjectinstances/clientcorporationcustomobjectinstance3-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance4.class, "customobjectinstances/clientcorporationcustomobjectinstance4-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance5.class, "customobjectinstances/clientcorporationcustomobjectinstance5-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance6.class, "customobjectinstances/clientcorporationcustomobjectinstance6-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance7.class, "customobjectinstances/clientcorporationcustomobjectinstance7-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance8.class, "customobjectinstances/clientcorporationcustomobjectinstance8-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance9.class, "customobjectinstances/clientcorporationcustomobjectinstance9-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance10.class, "customobjectinstances/clientcorporationcustomobjectinstance10-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance11.class, "customobjectinstances/clientcorporationcustomobjectinstance11-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance12.class, "customobjectinstances/clientcorporationcustomobjectinstance12-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance13.class, "customobjectinstances/clientcorporationcustomobjectinstance13-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance14.class, "customobjectinstances/clientcorporationcustomobjectinstance14-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance15.class, "customobjectinstances/clientcorporationcustomobjectinstance15-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance16.class, "customobjectinstances/clientcorporationcustomobjectinstance16-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance17.class, "customobjectinstances/clientcorporationcustomobjectinstance17-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance18.class, "customobjectinstances/clientcorporationcustomobjectinstance18-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance19.class, "customobjectinstances/clientcorporationcustomobjectinstance19-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance20.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance21.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance22.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance23.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance24.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance25.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance26.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance27.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance28.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance29.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance30.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance31.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance32.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance33.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance34.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance35.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(PersonCustomObjectInstance1.class, "customobjectinstances/personcustomobjectinstance1-data.txt");
        entityFiles.put(PersonCustomObjectInstance2.class, "customobjectinstances/personcustomobjectinstance2-data.txt");
        entityFiles.put(PersonCustomObjectInstance3.class, "customobjectinstances/personcustomobjectinstance3-data.txt");
        entityFiles.put(PersonCustomObjectInstance4.class, "customobjectinstances/personcustomobjectinstance4-data.txt");
        entityFiles.put(PersonCustomObjectInstance5.class, "customobjectinstances/personcustomobjectinstance5-data.txt");
        entityFiles.put(PersonCustomObjectInstance6.class, "customobjectinstances/personcustomobjectinstance6-data.txt");
        entityFiles.put(PersonCustomObjectInstance7.class, "customobjectinstances/personcustomobjectinstance7-data.txt");
        entityFiles.put(PersonCustomObjectInstance8.class, "customobjectinstances/personcustomobjectinstance8-data.txt");
        entityFiles.put(PersonCustomObjectInstance9.class, "customobjectinstances/personcustomobjectinstance9-data.txt");
        entityFiles.put(PersonCustomObjectInstance10.class, "customobjectinstances/personcustomobjectinstance10-data.txt");
        entityFiles.put(PersonCustomObjectInstance11.class, "customobjectinstances/personcustomobjectinstance11-data.txt");
        entityFiles.put(PersonCustomObjectInstance12.class, "customobjectinstances/personcustomobjectinstance12-data.txt");
        entityFiles.put(PersonCustomObjectInstance13.class, "customobjectinstances/personcustomobjectinstance13-data.txt");
        entityFiles.put(PersonCustomObjectInstance14.class, "customobjectinstances/personcustomobjectinstance14-data.txt");
        entityFiles.put(PersonCustomObjectInstance15.class, "customobjectinstances/personcustomobjectinstance15-data.txt");
        entityFiles.put(PersonCustomObjectInstance16.class, "customobjectinstances/personcustomobjectinstance16-data.txt");
        entityFiles.put(PersonCustomObjectInstance17.class, "customobjectinstances/personcustomobjectinstance17-data.txt");
        entityFiles.put(PersonCustomObjectInstance18.class, "customobjectinstances/personcustomobjectinstance18-data.txt");
        entityFiles.put(PersonCustomObjectInstance19.class, "customobjectinstances/personcustomobjectinstance19-data.txt");
        entityFiles.put(PersonCustomObjectInstance20.class, "customobjectinstances/personcustomobjectinstance20-data.txt");
        entityFiles.put(PersonCustomObjectInstance21.class, "customobjectinstances/personcustomobjectinstance21-data.txt");
        entityFiles.put(PersonCustomObjectInstance22.class, "customobjectinstances/personcustomobjectinstance22-data.txt");
        entityFiles.put(PersonCustomObjectInstance23.class, "customobjectinstances/personcustomobjectinstance23-data.txt");
        entityFiles.put(PersonCustomObjectInstance24.class, "customobjectinstances/personcustomobjectinstance24-data.txt");
        entityFiles.put(PersonCustomObjectInstance25.class, "customobjectinstances/personcustomobjectinstance25-data.txt");
        entityFiles.put(PersonCustomObjectInstance26.class, "customobjectinstances/personcustomobjectinstance26-data.txt");
        entityFiles.put(PersonCustomObjectInstance27.class, "customobjectinstances/personcustomobjectinstance27-data.txt");
        entityFiles.put(PersonCustomObjectInstance28.class, "customobjectinstances/personcustomobjectinstance28-data.txt");
        entityFiles.put(PersonCustomObjectInstance29.class, "customobjectinstances/personcustomobjectinstance29-data.txt");
        entityFiles.put(PersonCustomObjectInstance30.class, "customobjectinstances/personcustomobjectinstance30-data.txt");
        entityFiles.put(PersonCustomObjectInstance31.class, "customobjectinstances/personcustomobjectinstance31-data.txt");
        entityFiles.put(PersonCustomObjectInstance32.class, "customobjectinstances/personcustomobjectinstance32-data.txt");
        entityFiles.put(PersonCustomObjectInstance33.class, "customobjectinstances/personcustomobjectinstance33-data.txt");
        entityFiles.put(PersonCustomObjectInstance34.class, "customobjectinstances/personcustomobjectinstance34-data.txt");
        entityFiles.put(PersonCustomObjectInstance35.class, "customobjectinstances/personcustomobjectinstance35-data.txt");

        entityFiles.put(CandidateFileAttachment.class, "file/candidatefileattachment-data.txt");
        entityFiles.put(CertificationFileAttachment.class, "file/certificationfileattachment-data.txt");
        entityFiles.put(ClientContactFileAttachment.class, "file/clientcontactfileattachment-data.txt");
        entityFiles.put(ClientCorporationFileAttachment.class, "file/clientcorporationfileattachment-data.txt");
        entityFiles.put(JobOrderFileAttachment.class, "file/joborderfileattachment-data.txt");
        entityFiles.put(OpportunityFileAttachment.class, "file/opportunityfileattachment-data.txt");
        entityFiles.put(PlacementFileAttachment.class, "file/placementfileattachment-data.txt");
        entityFiles.put(BillableChargeFileAttachment.class, "file/billablechargefileattachment-data.txt");
        entityFiles.put(InvoiceStatementExport.class, "file/invoicestatementexport-data.txt");


        entityFiles.put(ClientCorporationCustomObject.class, "customobject/clientcorporationcustomobject-data.txt");
        entityFiles.put(JobOrderCustomObject.class, "customobject/jobordercustomobject-data.txt");
        entityFiles.put(PlacementCustomObject.class, "customobject/placementcustomobject-data.txt");
        entityFiles.put(UserCustomObject.class, "customobject/usercustomobject-data.txt");

        entityFiles.put(LocalTaxForm.class, "onboarding365/localtaxform-data.txt");
        entityFiles.put(StateTaxForm.class, "onboarding365/statetaxform-data.txt");
        entityFiles.put(FederalTaxForm.class, "onboarding365/federaltaxform-data.txt");

        entityFiles.put(CandidateAvailability.class, "candidateavailability-data.txt");

        // enterprise data store
        entityFiles.put(EdsData.class, "eds/edsdata-data.txt");
        entityFiles.put(EdsEntityType.class, "eds/entitytype-data.txt");
        entityFiles.put(EdsEntityTypeSchemaVersion.class, "eds/entitytypeschemaversion-data.txt");
        entityFiles.put(EdsSourceSystem.class, "eds/sourcesystem-data.txt");
        entityFiles.put(SourceSystemTypeLookup.class, "eds/sourcesystemtypelookup-data.txt");

        // bte
        entityFiles.put(ClientCorporationBillRuleset.class, "bte/rules/clientcorporationbillruleset-data.txt");
        entityFiles.put(ClientCorporationBillRulesetVersion.class, "bte/rules/clientcorporationbillrulesetversion-data.txt");
        entityFiles.put(ClientCorporationPayRuleset.class, "bte/rules/clientcorporationpayruleset-data.txt");
        entityFiles.put(ClientCorporationPayRulesetVersion.class, "bte/rules/clientcorporationpayrulesetversion-data.txt");
        entityFiles.put(TimeLaborEvalRule.class, "bte/rules/timelaborevalrule-data.txt");
        entityFiles.put(TimeLaborEvalRuleTemplate.class, "bte/rules/timelaborevalruletemplate-data.txt");
        entityFiles.put(Holiday.class, "bte/holiday-data.txt");
        entityFiles.put(HolidayInstance.class, "bte/holidayinstance-data.txt");

        return entityFiles;
    }

    public static Map<Class<? extends BullhornEntity>, String> getMetaDataFileNames() {
        Map<Class<? extends BullhornEntity>, String> entityMetaFiles = new LinkedHashMap<Class<? extends BullhornEntity>, String>();

        entityMetaFiles.put(Appointment.class, "meta/appointment-meta-data.txt");
        entityMetaFiles.put(AppointmentAttendee.class, "meta/appointmentattendee-meta-data.txt");
        entityMetaFiles.put(Branch.class, "meta/branch-meta-data.txt");
        entityMetaFiles.put(BusinessSector.class, "meta/businesssector-meta-data.txt");
        entityMetaFiles.put(Candidate.class, "meta/candidate-meta-data.txt");
        entityMetaFiles.put(CandidateCertification.class, "meta/candidatecertification-meta-data.txt");
        entityMetaFiles.put(CandidateEducation.class, "meta/candidateeducation-meta-data.txt");
        entityMetaFiles.put(CandidateReference.class, "meta/candidatereference-meta-data.txt");
        entityMetaFiles.put(CandidateWorkHistory.class, "meta/candidateworkhistory-meta-data.txt");
        entityMetaFiles.put(Category.class, "meta/category-meta-data.txt");
        entityMetaFiles.put(Certification.class, "meta/certification-meta-data.txt");
        entityMetaFiles.put(CertificationGroup.class, "meta/certificationgroup-meta-data.txt");
        entityMetaFiles.put(ClientContact.class, "meta/clientcontact-meta-data.txt");
        entityMetaFiles.put(ClientCorporation.class, "meta/clientcorporation-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCertification.class, "meta/clientcorporationcertification-meta-data.txt");
        entityMetaFiles.put(CorporateUser.class, "meta/corporateuser-meta-data.txt");
        entityMetaFiles.put(CorporationDepartment.class, "meta/corporationdepartment-meta-data.txt");
        entityMetaFiles.put(Country.class, "meta/country-meta-data.txt");
        entityMetaFiles.put(Department.class, "meta/department-meta-data.txt");
        entityMetaFiles.put(DistributionList.class, "meta/distributionlist-meta-data.txt");
        entityMetaFiles.put(File.class, "meta/file-meta-data.txt");
        entityMetaFiles.put(GoalTarget.class, "meta/goaltarget-meta-data.txt");
        entityMetaFiles.put(HousingComplex.class, "meta/housingcomplex-meta-data.txt");
        entityMetaFiles.put(HousingComplexUnit.class, "meta/housingcomplexunit-meta-data.txt");
        entityMetaFiles.put(HousingComplexFurnitureDelivery.class, "meta/housingcomplexfurnituredelivery-meta-data.txt");
        entityMetaFiles.put(HousingComplexUtilityAccount.class, "meta/housingcomplexutilityaccount-meta-data.txt");
        entityMetaFiles.put(UserHousingComplexUnit.class, "meta/userhousingcomplexunit-meta-data.txt");
        entityMetaFiles.put(JobBoardPost.class, "meta/jobboardpost-meta-data.txt");
        entityMetaFiles.put(JobOrder.class, "meta/joborder-meta-data.txt");
        entityMetaFiles.put(JobShift.class, "meta/jobshift-meta-data.txt")
        entityMetaFiles.put(JobSubmission.class, "meta/jobsubmission-meta-data.txt");
        entityMetaFiles.put(JobSubmissionHistory.class, "meta/jobsubmissionhistory-meta-data.txt");
        entityMetaFiles.put(Lead.class, "meta/lead-meta-data.txt");
        entityMetaFiles.put(Note.class, "meta/note-meta-data.txt");
        entityMetaFiles.put(NoteEntity.class, "meta/noteentity-meta-data.txt");
        entityMetaFiles.put(Opportunity.class, "meta/opportunity-meta-data.txt");
        entityMetaFiles.put(Person.class, "meta/person-meta-data.txt");
        entityMetaFiles.put(Placement.class, "meta/placement-meta-data.txt");
        entityMetaFiles.put(CandidateTaxInfo.class, "meta/candidatetaxinfo-meta-data.txt");
        entityMetaFiles.put(DocumentDataFlowback.class, "meta/documentdataflowback-meta-data.txt");
        entityMetaFiles.put(PlacementCertification.class, "meta/placementcertification-meta-data.txt");
        entityMetaFiles.put(PlacementChangeRequest.class, "meta/placementchangerequest-meta-data.txt");
        entityMetaFiles.put(PlacementCommission.class, "meta/placementcommission-meta-data.txt");
        entityMetaFiles.put(PlacementShiftSet.class, "meta/placementshiftset-meta-data.txt");
        entityMetaFiles.put(PrivateLabel.class, "meta/privatelabel-meta-data.txt");
        entityMetaFiles.put(Report.class, "meta/report-meta-data.txt")
        entityMetaFiles.put(Sendout.class, "meta/sendout-meta-data.txt");
        entityMetaFiles.put(Skill.class, "meta/skill-meta-data.txt");
        entityMetaFiles.put(Specialty.class, "meta/specialty-meta-data.txt");
        entityMetaFiles.put(State.class, "meta/state-meta-data.txt");
        entityMetaFiles.put(Task.class, "meta/task-meta-data.txt");
        entityMetaFiles.put(TimeUnit.class, "meta/timeunit-meta-data.txt");
        entityMetaFiles.put(UserSetting.class, "meta/usersetting-meta-data.txt");
        entityMetaFiles.put(UserType.class, "meta/usertype-meta-data.txt");
        entityMetaFiles.put(WorkersCompensation.class, "meta/workerscompensation-meta-data.txt");
        entityMetaFiles.put(WorkersCompensationRate.class, "meta/workerscompensationrate-meta-data.txt");

        entityMetaFiles.put(BillingProfile.class, "meta/paybill/billingprofile-meta-data.txt");
        entityMetaFiles.put(Location.class, "meta/paybill/location-meta-data.txt");
        entityMetaFiles.put(InvoiceTerm.class, "meta/paybill/invoiceterm-meta-data.txt");

        entityMetaFiles.put(JobOrderRateCard.class, "meta/paybill/rate/joborderratecard-meta-data.txt");
        entityMetaFiles.put(JobOrderRateCardLine.class, "meta/paybill/rate/joborderratecardline-meta-data.txt");
        entityMetaFiles.put(JobOrderRateCardLineGroup.class, "meta/paybill/rate/joborderratecardlinegroup-meta-data.txt");
        entityMetaFiles.put(JobOrderRateCardVersion.class, "meta/paybill/rate/joborderratecardversion-meta-data.txt");
        entityMetaFiles.put(JobCode.class, "meta/paybill/jobcode-meta-data.txt");

        entityMetaFiles.put(PlacementRateCard.class, "meta/paybill/rate/placementratecard-meta-data.txt");
        entityMetaFiles.put(PlacementRateCardLine.class, "meta/paybill/rate/placementratecardline-meta-data.txt");
        entityMetaFiles.put(PlacementRateCardLineGroup.class, "meta/paybill/rate/placementratecardlinegroup-meta-data.txt");
        entityMetaFiles.put(PlacementRateCardVersion.class, "meta/paybill/rate/placementratecardversion-meta-data.txt");

        entityMetaFiles.put(ClientCorporationRateAgreementCard.class, "meta/paybill/rate/clientcorporationrateagreementcard-meta-data.txt");
        entityMetaFiles.put(ClientCorporationRateAgreementCardLine.class, "meta/paybill/rate/clientcorporationrateagreementcardline-meta-data.txt");
        entityMetaFiles.put(ClientCorporationRateAgreementCardLineGroup.class, "meta/paybill/rate/clientcorporationrateagreementcardlinegroup-meta-data.txt");
        entityMetaFiles.put(ClientCorporationRateAgreementCardVersion.class, "meta/paybill/rate/clientcorporationrateagreementcardversion-meta-data.txt");

        entityMetaFiles.put(PlacementTimeAndExpense.class, "meta/placementtimeandexpense-meta-data.txt");

        entityMetaFiles.put(BillMasterDiscountRate.class, "meta/billmasterdiscountrate-meta-data.txt");


        // TODO v2 meta entities
        entityMetaFiles.put(BillableCharge.class, "meta/paybill/billablecharge-meta-data.txt");
        entityMetaFiles.put(PayableCharge.class, "meta/paybill/payablecharge-meta-data.txt");
        entityMetaFiles.put(GeneralLedgerSegment.class, "meta/paybill/generalledgersegment-meta-data.txt");
        entityMetaFiles.put(GeneralLedgerSegment1.class, "meta/paybill/generalledgersegment1-meta-data.txt");
        entityMetaFiles.put(GeneralLedgerSegment2.class, "meta/paybill/generalledgersegment2-meta-data.txt");
        entityMetaFiles.put(GeneralLedgerSegment3.class, "meta/paybill/generalledgersegment3-meta-data.txt");
        entityMetaFiles.put(GeneralLedgerSegment4.class, "meta/paybill/generalledgersegment4-meta-data.txt");
        entityMetaFiles.put(GeneralLedgerSegment5.class, "meta/paybill/generalledgersegment5-meta-data.txt");
        entityMetaFiles.put(GeneralLedgerSegmentType.class, "meta/paybill/generalledgersegmenttype-meta-data.txt");
        entityMetaFiles.put(GeneralLedgerServiceCode.class, "meta/paybill/generalledgerservicecode-meta-data.txt");
        entityMetaFiles.put(Discount.class, "meta/paybill/discount-meta-data.txt");
        entityMetaFiles.put(EarnCode.class, "meta/paybill/earncode-meta-data.txt");
        entityMetaFiles.put(EarnCodeGroup.class, "meta/paybill/earncodegroup-meta-data.txt");
        entityMetaFiles.put(InvoiceStatement.class, "meta/paybill/invoicestatement-meta-data.txt");
        entityMetaFiles.put(InvoiceStatementBatch.class, "meta/paybill/invoicestatementbatch-meta-data.txt");
        entityMetaFiles.put(InvoiceStatementDiscount.class, "meta/paybill/invoicestatementdiscount-meta-data.txt");
        entityMetaFiles.put(InvoiceStatementExportBatch.class, "meta/paybill/invoicestatementexportbatch-meta-data.txt");
        entityMetaFiles.put(InvoiceStatementLineItem.class, "meta/paybill/invoicestatementlineitem-meta-data.txt");
        entityMetaFiles.put(InvoiceStatementSurcharge.class, "meta/paybill/invoicestatementsurcharge-meta-data.txt");
        entityMetaFiles.put(InvoiceStatementTax.class, "meta/paybill/invoicestatementtax-meta-data.txt");
        entityMetaFiles.put(BatchGroup.class, "meta/paybill/batchgroup-meta-data.txt");
        entityMetaFiles.put(BillingSyncBatch.class, "meta/paybill/billingsyncbatch-meta-data.txt");
        entityMetaFiles.put(BillMaster.class, "meta/paybill/billmaster-meta-data.txt");
        entityMetaFiles.put(BillMasterTransaction.class, "meta/paybill/billmastertransaction-meta-data.txt");
        entityMetaFiles.put(PayMaster.class, "meta/paybill/paymaster-meta-data.txt");
        entityMetaFiles.put(PayMasterTransaction.class, "meta/paybill/paymastertransaction-meta-data.txt");
        entityMetaFiles.put(PayExportBatch.class, "meta/paybill/payexportbatch-meta-data.txt");
        entityMetaFiles.put(Surcharge.class, "meta/paybill/surcharge-meta-data.txt");
        entityMetaFiles.put(Tax.class, "meta/paybill/tax-meta-data.txt");
        entityMetaFiles.put(CanvasReport.class, "meta/paybill/canvasreport-meta-data.txt");

        entityMetaFiles.put(BillMasterTransactionDiscountDetail.class, "meta/paybill/detail/billmastertransactiondiscountdetail-meta-data.txt");
        entityMetaFiles.put(BillMasterTransactionSalesTaxDetail.class, "meta/paybill/detail/billmastertransactionsalestaxdetail-meta-data.txt");
        entityMetaFiles.put(BillMasterTransactionSurchargeDetail.class, "meta/paybill/detail/billmastertransactionsurchargedetail-meta-data.txt");

        entityMetaFiles.put(InvoiceStatementDistributionBatch.class, "meta/paybill/invoice/invoicestatementdistributionbatch-meta-data.txt");
        entityMetaFiles.put(InvoiceStatementLineDistribution.class, "meta/paybill/invoice/invoicestatementlinedistribution-meta-data.txt");

        entityMetaFiles.put(AllSalesTaxRate.class, "meta/paybill/rate/allsalestaxrate-meta-data.txt");
        entityMetaFiles.put(BillMasterTransactionDiscountRate.class, "meta/paybill/rate/billmastertransactiondiscountrate-meta-data.txt");
        entityMetaFiles.put(BillMasterTransactionSalesTaxRate.class, "meta/paybill/rate/billmastertransactionsalestaxrate-meta-data.txt");
        entityMetaFiles.put(BillMasterTransactionSurchargeRate.class, "meta/paybill/rate/billmastertransactionsurchargerate-meta-data.txt");
        entityMetaFiles.put(DiscountRate.class, "meta/paybill/rate/discountrate-meta-data.txt");
        entityMetaFiles.put(DiscountRateVersion.class, "meta/paybill/rate/discountrateversion-meta-data.txt");
        entityMetaFiles.put(ExternalSalesTaxRate.class, "meta/paybill/rate/externalsalestaxrate-meta-data.txt");
        entityMetaFiles.put(ExternalSalesTaxRateVersion.class, "meta/paybill/rate/externalsalestaxrateversion-meta-data.txt");
        entityMetaFiles.put(InvoiceStatementLineItemDiscountRate.class, "meta/paybill/rate/invoicestatementlineitemdiscountrate-meta-data.txt");
        entityMetaFiles.put(InvoiceStatementLineItemSalesTaxRate.class, "meta/paybill/rate/invoicestatementlineitemsalestaxrate-meta-data.txt");
        entityMetaFiles.put(InvoiceStatementLineItemSurchargeRate.class, "meta/paybill/rate/invoicestatementlineitemsurchargerate-meta-data.txt");
        entityMetaFiles.put(InvoiceStatementDiscountRate.class, "meta/paybill/rate/invoicestatementdiscountrate-meta-data.txt");
        entityMetaFiles.put(InvoiceStatementSalesTaxRate.class, "meta/paybill/rate/invoicestatementsalestaxrate-meta-data.txt");
        entityMetaFiles.put(InvoiceStatementSurchargeRate.class, "meta/paybill/rate/invoicestatementsurchargerate-meta-data.txt");
        entityMetaFiles.put(SalesTaxRate.class, "meta/paybill/rate/salestaxrate-meta-data.txt");
        entityMetaFiles.put(SalesTaxRateVersion.class, "meta/paybill/rate/salestaxrateversion-meta-data.txt");
        entityMetaFiles.put(SurchargeRate.class, "meta/paybill/rate/surchargerate-meta-data.txt");

        entityMetaFiles.put(BillMasterTransactionDistributionBatch.class, "meta/paybill/billmastertransactiondistributionbatch-meta-data.txt");
        entityMetaFiles.put(UnbilledRevenueDistribution.class, "meta/paybill/unbilledrevenuedistribution-meta-data.txt");
        entityMetaFiles.put(UnbilledRevenueDistributionBatch.class, "meta/paybill/unbilledrevenuedistributionbatch-meta-data.txt");
        entityMetaFiles.put(UnbilledRevenueGeneralLedgerExportStatusLookup.class, "meta/paybill/unbilledrevenuegeneralledgerexportstatuslookup-meta-data.txt");


        // Certification Requirements
        entityMetaFiles.put(CandidateCertificationRequirement.class, "meta/candidatecertificationrequirement-meta-data.txt");
        entityMetaFiles.put(CertificationRequirement.class, "meta/certificationrequirement-meta-data.txt");
        entityMetaFiles.put(JobSubmissionCertificationRequirement.class, "meta/jobsubmissioncertificationrequirement-meta-data.txt");


        entityMetaFiles.put(JobOrderCustomObjectInstance1.class, "meta/customobjectinstances/jobordercustomobjectinstance1-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance2.class, "meta/customobjectinstances/jobordercustomobjectinstance2-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance3.class, "meta/customobjectinstances/jobordercustomobjectinstance3-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance4.class, "meta/customobjectinstances/jobordercustomobjectinstance4-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance5.class, "meta/customobjectinstances/jobordercustomobjectinstance5-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance6.class, "meta/customobjectinstances/jobordercustomobjectinstance6-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance7.class, "meta/customobjectinstances/jobordercustomobjectinstance7-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance8.class, "meta/customobjectinstances/jobordercustomobjectinstance8-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance9.class, "meta/customobjectinstances/jobordercustomobjectinstance9-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance10.class, "meta/customobjectinstances/jobordercustomobjectinstance10-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance1.class, "meta/customobjectinstances/opportunitycustomobjectinstance1-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance2.class, "meta/customobjectinstances/opportunitycustomobjectinstance2-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance3.class, "meta/customobjectinstances/opportunitycustomobjectinstance3-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance4.class, "meta/customobjectinstances/opportunitycustomobjectinstance4-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance5.class, "meta/customobjectinstances/opportunitycustomobjectinstance5-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance6.class, "meta/customobjectinstances/opportunitycustomobjectinstance6-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance7.class, "meta/customobjectinstances/opportunitycustomobjectinstance7-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance8.class, "meta/customobjectinstances/opportunitycustomobjectinstance8-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance9.class, "meta/customobjectinstances/opportunitycustomobjectinstance9-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance10.class, "meta/customobjectinstances/opportunitycustomobjectinstance10-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance1.class, "meta/customobjectinstances/placementcustomobjectinstance1-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance2.class, "meta/customobjectinstances/placementcustomobjectinstance2-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance3.class, "meta/customobjectinstances/placementcustomobjectinstance3-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance4.class, "meta/customobjectinstances/placementcustomobjectinstance4-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance5.class, "meta/customobjectinstances/placementcustomobjectinstance5-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance6.class, "meta/customobjectinstances/placementcustomobjectinstance6-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance7.class, "meta/customobjectinstances/placementcustomobjectinstance7-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance8.class, "meta/customobjectinstances/placementcustomobjectinstance8-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance9.class, "meta/customobjectinstances/placementcustomobjectinstance9-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance10.class, "meta/customobjectinstances/placementcustomobjectinstance10-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance1.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance1-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance2.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance2-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance3.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance3-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance4.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance4-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance5.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance5-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance6.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance6-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance7.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance7-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance8.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance8-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance9.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance9-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance10.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance10-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance11.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance11-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance12.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance12-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance13.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance13-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance14.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance14-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance15.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance15-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance16.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance16-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance17.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance17-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance18.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance18-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance19.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance19-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance20.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance20-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance21.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance21-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance22.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance22-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance23.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance23-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance24.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance24-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance25.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance25-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance26.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance26-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance27.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance27-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance28.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance28-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance29.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance29-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance30.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance30-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance31.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance31-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance32.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance32-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance33.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance33-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance34.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance34-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance35.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance35-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance1.class, "meta/customobjectinstances/personcustomobjectinstance1-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance2.class, "meta/customobjectinstances/personcustomobjectinstance2-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance3.class, "meta/customobjectinstances/personcustomobjectinstance3-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance4.class, "meta/customobjectinstances/personcustomobjectinstance4-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance5.class, "meta/customobjectinstances/personcustomobjectinstance5-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance6.class, "meta/customobjectinstances/personcustomobjectinstance6-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance7.class, "meta/customobjectinstances/personcustomobjectinstance7-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance8.class, "meta/customobjectinstances/personcustomobjectinstance8-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance9.class, "meta/customobjectinstances/personcustomobjectinstance9-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance10.class, "meta/customobjectinstances/personcustomobjectinstance10-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance11.class, "meta/customobjectinstances/personcustomobjectinstance11-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance12.class, "meta/customobjectinstances/personcustomobjectinstance12-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance13.class, "meta/customobjectinstances/personcustomobjectinstance13-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance14.class, "meta/customobjectinstances/personcustomobjectinstance14-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance15.class, "meta/customobjectinstances/personcustomobjectinstance15-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance16.class, "meta/customobjectinstances/personcustomobjectinstance16-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance17.class, "meta/customobjectinstances/personcustomobjectinstance17-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance18.class, "meta/customobjectinstances/personcustomobjectinstance18-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance19.class, "meta/customobjectinstances/personcustomobjectinstance19-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance20.class, "meta/customobjectinstances/personcustomobjectinstance20-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance21.class, "meta/customobjectinstances/personcustomobjectinstance21-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance22.class, "meta/customobjectinstances/personcustomobjectinstance22-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance23.class, "meta/customobjectinstances/personcustomobjectinstance23-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance24.class, "meta/customobjectinstances/personcustomobjectinstance24-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance25.class, "meta/customobjectinstances/personcustomobjectinstance25-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance29.class, "meta/customobjectinstances/personcustomobjectinstance29-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance30.class, "meta/customobjectinstances/personcustomobjectinstance30-meta-data.txt");

        entityMetaFiles.put(ClientCorporationCustomObject.class, "meta/customobject/clientcorporationcustomobject-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObject.class, "meta/customobject/jobordercustomobject-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObject.class, "meta/customobject/placementcustomobject-meta-data.txt");
        entityMetaFiles.put(UserCustomObject.class, "meta/customobject/usercustomobject-meta-data.txt");

        entityMetaFiles.put(LocalTaxForm.class, "meta/onboarding365/localtaxform-meta-data.txt");
        entityMetaFiles.put(StateTaxForm.class, "meta/onboarding365/statetaxform-meta-data.txt");
        entityMetaFiles.put(FederalTaxForm.class, "meta/onboarding365/federaltaxform-meta-data.txt");

        entityMetaFiles.put(CandidateAvailability.class, "meta/candidateavailability-meta-data.txt");

        // enterprise data store
        entityMetaFiles.put(EdsData.class, "meta/eds/edsdata-meta-data.txt");
        entityMetaFiles.put(EdsEntityType.class, "meta/eds/entitytype-meta-data.txt");
        entityMetaFiles.put(EdsEntityTypeSchemaVersion.class, "meta/eds/entitytypeschemaversion-meta-data.txt");
        entityMetaFiles.put(EdsSourceSystem.class, "meta/eds/sourcesystem-meta-data.txt");

        // bte
        entityMetaFiles.put(ClientCorporationBillRuleset.class, "meta/bte/rules/clientcorporationbillruleset-meta-data.txt");
        entityMetaFiles.put(ClientCorporationBillRulesetVersion.class, "meta/bte/rules/clientcorporationbillrulesetversion-meta-data.txt");
        entityMetaFiles.put(ClientCorporationPayRuleset.class, "meta/bte/rules/clientcorporationpayruleset-meta-data.txt");
        entityMetaFiles.put(ClientCorporationPayRulesetVersion.class, "meta/bte/rules/clientcorporationpayrulesetversion-meta-data.txt");
        entityMetaFiles.put(TimeLaborEvalRule.class, "meta/bte/rules/timelaborevalrule-meta-data.txt");
        entityMetaFiles.put(TimeLaborEvalRuleTemplate.class, "meta/bte/rules/timelaborevalruletemplate-meta-data.txt");
        entityMetaFiles.put(Holiday.class, "meta/bte/holiday-meta-data.txt");
        entityMetaFiles.put(HolidayInstance.class, "meta/bte/holidayinstance-meta-data.txt");

        return entityMetaFiles;
    }

    public static Map<Class<? extends SearchEntity>, String> getSearchFieldFileNames() {
        Map<Class<? extends SearchEntity>, String> searchFieldsFiles = new LinkedHashMap<Class<? extends SearchEntity>, String>();

        searchFieldsFiles.put(Candidate.class, "searchfields/candidate-searchfields.txt");
        searchFieldsFiles.put(ClientContact.class, "searchfields/clientcontact-searchfields.txt");
        searchFieldsFiles.put(ClientCorporation.class, "searchfields/clientcorporation-searchfields.txt");
        searchFieldsFiles.put(JobOrder.class, "searchfields/joborder-searchfields.txt");
        searchFieldsFiles.put(JobSubmission.class, "searchfields/jobsubmission-searchfields.txt");
        searchFieldsFiles.put(Lead.class, "searchfields/lead-searchfields.txt");
        searchFieldsFiles.put(Person.class, "searchfields/person-searchfields.txt");
        searchFieldsFiles.put(Note.class, "searchfields/note-searchfields.txt");
        searchFieldsFiles.put(Opportunity.class, "searchfields/opportunity-searchfields.txt");
        searchFieldsFiles.put(Placement.class, "searchfields/placement-searchfields.txt");

        return searchFieldsFiles;
    }

}
