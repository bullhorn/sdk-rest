package com.bullhornsdk.data.api.mock

import com.bullhornsdk.data.api.helper.RestJsonConverter
import com.bullhornsdk.data.api.helper.concurrency.ConcurrencyService
import com.bullhornsdk.data.api.helper.concurrency.standard.RestConcurrencyService
import com.bullhornsdk.data.model.entity.core.customobject.*
import com.bullhornsdk.data.model.entity.core.edithistory.EditHistory
import com.bullhornsdk.data.model.entity.core.edithistory.FieldChange
import com.bullhornsdk.data.model.entity.core.standard.*
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity
import com.bullhornsdk.data.model.entity.core.type.SearchEntity
import com.bullhornsdk.data.model.entity.embedded.UserType
import com.bullhornsdk.data.model.entity.meta.MetaData
import com.bullhornsdk.data.model.entity.meta.StandardMetaData
import com.bullhornsdk.data.model.enums.BullhornEntityInfo
import com.bullhornsdk.data.model.response.edithistory.EditHistoryListWrapper
import com.bullhornsdk.data.model.response.edithistory.FieldChangeListWrapper
import com.bullhornsdk.data.model.response.event.standard.StandardGetEventsResponse
import com.bullhornsdk.data.model.response.event.standard.StandardGetLastRequestIdResponse
import com.bullhornsdk.data.model.response.list.FastFindListWrapper
import com.bullhornsdk.data.model.response.list.ListWrapper
import com.bullhornsdk.data.util.copy.KryoObjectCopyHelper
import org.apache.commons.io.IOUtils
import org.apache.log4j.Logger
import org.springframework.core.io.ClassPathResource

import java.util.concurrent.ConcurrentHashMap

public class MockDataLoader {

	private final static Logger log = Logger.getLogger(MockDataLoader.class);
	private final RestJsonConverter restJsonConverter;

	private Map<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>> restEntityMapCache;
	private List<FastFindResult> fastFindResultListCache;
	private List<EditHistory> editHistoryListCache;
	private List<FieldChange> editHistoryFieldChangeListCache;
    private StandardGetEventsResponse getEventsResponseCache;
    private StandardGetLastRequestIdResponse getLastRequestIdResponseCache;
	private Map<String,Object> settingsResultMapCache;
	private Settings settingsObjectResultCache;
	private Map<Class<? extends BullhornEntity>, MetaData<?>> restMetaDataMapCache;
	private Map<Class<? extends SearchEntity>, List<MockSearchField>> searchFieldsMapCache;

	private Map<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>> restEntityMap;
	private List<FastFindResult> fastFindResultList;
	private List<EditHistory> editHistoryList;
	private List<FieldChange> editHistoryFieldChangeList;
    private StandardGetEventsResponse getEventsResponse;
    private StandardGetLastRequestIdResponse getLastRequestIdResponse;
	private Map<String,Object> settingsResultMap;
	private Settings settingsObjectResult;
	private Map<Class<? extends BullhornEntity>, MetaData<?>> restMetaDataMap;

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
        if(getEventsResponse == null) {
            reloadGetEventsResponses();
            this.getEventsResponseCache = KryoObjectCopyHelper.copy(getEventsResponse);
        }

        return getEventsResponse;
    }

    public StandardGetLastRequestIdResponse getLastRequestIdResponse() {
        if(getLastRequestIdResponse == null) {
            reloadGetLastRequestIdResponses();
            this.getLastRequestIdResponseCache = KryoObjectCopyHelper.copy(getLastRequestIdResponse);
        }

        return getLastRequestIdResponse;
    }



	public Map<String,Object> getSettingsResults() {
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
		EditHistoryListWrapper listWrapper = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, EditHistoryListWrapper.class);
		this.editHistoryList = listWrapper.getData();
	}

	public void reloadEditHistoryFieldChangeResults() {
		String jsonData = getFileData("edithistory/fieldchange-data.txt");
		FieldChangeListWrapper listWrapper = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, FieldChangeListWrapper.class);
		this.editHistoryFieldChangeList = listWrapper.getData();
	}

	public void reloadFastFindResults() {

		String jsonData = getFileData("fastfind-data.txt");
		FastFindListWrapper listWrapper = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, FastFindListWrapper.class);
		this.fastFindResultList = listWrapper.getData();
	}

    public void reloadGetEventsResponses() {
        String jsonData = getFileData("event-data.txt");
        StandardGetEventsResponse eventsResponse = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, StandardGetEventsResponse.class);
        this.getEventsResponse = eventsResponse;
    }

    public void reloadGetLastRequestIdResponses() {
        String jsonData = getFileData("lastrequestid-data.txt");
        StandardGetLastRequestIdResponse response = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, StandardGetLastRequestIdResponse.class);
        this.getLastRequestIdResponse = response;
    }

	public void reloadSettingsResults() {

		String jsonData = getFileData("settings-data.txt");
		Map<String,Object> resultData = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, Map.class);
		this.settingsResultMap = resultData;
	}

	public void reloadSettingsObjectResults() {

		String jsonData = getFileData("settings-data.txt");
		Settings resultData = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, Settings.class);
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
	public <T extends SearchEntity> Map<Class<? extends SearchEntity>,List<MockSearchField>> reloadSearchFieldData() {
		this.searchFieldsMap = new ConcurrentHashMap<Class<? extends SearchEntity>,List<MockSearchField>>();
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
			log.error("Unable to load test data from filename: " + fileName);
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

		ListWrapper<T> listWrapper = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, BullhornEntityInfo.getTypesListWrapperType(type));

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
		return restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, StandardMetaData.class);
	}

	/**
	 * Converts the searchField json data to a list of fields
	 * @param jsonData
	 * @return
	 */
	private List<MockSearchField> jsonStringToMockSearchFields(String jsonData) {

		MockSearchFieldWrapper fieldsWrapper = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, MockSearchFieldWrapper.class);

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
		entityFiles.put(BusinessSector.class, "businesssector-data.txt");
		entityFiles.put(Candidate.class, "candidate-data.txt");
        entityFiles.put(CandidateCertification.class, "candidatecertification-data.txt");
		entityFiles.put(CandidateEducation.class, "candidateeducation-data.txt");
		entityFiles.put(CandidateReference.class, "candidatereference-data.txt");
		entityFiles.put(CandidateWorkHistory.class, "candidateworkhistory-data.txt");
		entityFiles.put(Category.class, "category-data.txt");
		entityFiles.put(Certification.class, "certification-data.txt");
		entityFiles.put(ClientContact.class, "clientcontact-data.txt");
		entityFiles.put(ClientCorporation.class, "clientcorporation-data.txt");
		entityFiles.put(CorporateUser.class, "corporateuser-data.txt");
		entityFiles.put(CorporationDepartment.class, "corporationdepartment-data.txt");
		entityFiles.put(Country.class, "country-data.txt");
        entityFiles.put(DistributionList.class, "distributionlist-data.txt");
        entityFiles.put(File.class, "file-data.txt");
		entityFiles.put(HousingComplex.class, "housingcomplex-data.txt");
		entityFiles.put(JobBoardPost.class, "jobboardpost-data.txt");
        entityFiles.put(JobOrder.class, "joborder-data.txt");
		entityFiles.put(JobSubmission.class, "jobsubmission-data.txt");
		entityFiles.put(JobSubmissionHistory.class, "jobsubmissionhistory-data.txt");
        entityFiles.put(Lead.class, "lead-data.txt");
		entityFiles.put(Note.class, "note-data.txt");
		entityFiles.put(NoteEntity.class, "noteentity-data.txt");
        entityFiles.put(Opportunity.class, "opportunity-data.txt");
        entityFiles.put(Person.class, "person-data.txt");
		entityFiles.put(Placement.class, "placement-data.txt");
        entityFiles.put(PlacementCertification.class, "placementcertification-data.txt");
		entityFiles.put(PlacementChangeRequest.class, "placementchangerequest-data.txt");
		entityFiles.put(PlacementCommission.class, "placementcommission-data.txt");
		entityFiles.put(PrivateLabel.class, "privatelabel-data.txt");
		entityFiles.put(Sendout.class, "sendout-data.txt");
		entityFiles.put(Skill.class, "skill-data.txt");
		entityFiles.put(Specialty.class, "specialty-data.txt");
		entityFiles.put(State.class, "state-data.txt");
		entityFiles.put(Task.class, "task-data.txt");
		entityFiles.put(Tearsheet.class, "tearsheet-data.txt");
		entityFiles.put(TearsheetMember.class, "tearsheetmember-data.txt");
		entityFiles.put(TimeUnit.class, "timeunit-data.txt");
        entityFiles.put(UserType.class, "usertype-data.txt");
        entityFiles.put(WorkersCompensation.class, "workerscompensation-data.txt");
        entityFiles.put(WorkersCompensationRate.class, "workerscompensationrate-data.txt");

        entityFiles.put(JobOrderCustomObjectInstance1.class, "customobject/jobordercustomobjectinstance1-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance2.class, "customobject/jobordercustomobjectinstance2-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance3.class, "customobject/jobordercustomobjectinstance3-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance4.class, "customobject/jobordercustomobjectinstance4-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance5.class, "customobject/jobordercustomobjectinstance5-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance6.class, "customobject/jobordercustomobjectinstance6-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance7.class, "customobject/jobordercustomobjectinstance7-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance8.class, "customobject/jobordercustomobjectinstance8-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance9.class, "customobject/jobordercustomobjectinstance9-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance10.class, "customobject/jobordercustomobjectinstance10-data.txt");
		entityFiles.put(OpportunityCustomObjectInstance1.class, "customobject/opportunitycustomobjectinstance1-data.txt");
		entityFiles.put(OpportunityCustomObjectInstance2.class, "customobject/opportunitycustomobjectinstance2-data.txt");
		entityFiles.put(OpportunityCustomObjectInstance3.class, "customobject/opportunitycustomobjectinstance3-data.txt");
		entityFiles.put(OpportunityCustomObjectInstance4.class, "customobject/opportunitycustomobjectinstance4-data.txt");
		entityFiles.put(OpportunityCustomObjectInstance5.class, "customobject/opportunitycustomobjectinstance5-data.txt");
		entityFiles.put(OpportunityCustomObjectInstance6.class, "customobject/opportunitycustomobjectinstance6-data.txt");
		entityFiles.put(OpportunityCustomObjectInstance7.class, "customobject/opportunitycustomobjectinstance7-data.txt");
		entityFiles.put(OpportunityCustomObjectInstance8.class, "customobject/opportunitycustomobjectinstance8-data.txt");
		entityFiles.put(OpportunityCustomObjectInstance9.class, "customobject/opportunitycustomobjectinstance9-data.txt");
		entityFiles.put(OpportunityCustomObjectInstance10.class, "customobject/opportunitycustomobjectinstance10-data.txt");
		entityFiles.put(PlacementCustomObjectInstance1.class, "customobject/placementcustomobjectinstance1-data.txt");
        entityFiles.put(PlacementCustomObjectInstance2.class, "customobject/placementcustomobjectinstance2-data.txt");
        entityFiles.put(PlacementCustomObjectInstance3.class, "customobject/placementcustomobjectinstance3-data.txt");
        entityFiles.put(PlacementCustomObjectInstance4.class, "customobject/placementcustomobjectinstance4-data.txt");
        entityFiles.put(PlacementCustomObjectInstance5.class, "customobject/placementcustomobjectinstance5-data.txt");
        entityFiles.put(PlacementCustomObjectInstance6.class, "customobject/placementcustomobjectinstance6-data.txt");
        entityFiles.put(PlacementCustomObjectInstance7.class, "customobject/placementcustomobjectinstance7-data.txt");
        entityFiles.put(PlacementCustomObjectInstance8.class, "customobject/placementcustomobjectinstance8-data.txt");
        entityFiles.put(PlacementCustomObjectInstance9.class, "customobject/placementcustomobjectinstance9-data.txt");
        entityFiles.put(PlacementCustomObjectInstance10.class, "customobject/placementcustomobjectinstance10-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance1.class, "customobject/clientcorporationcustomobjectinstance1-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance2.class, "customobject/clientcorporationcustomobjectinstance2-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance3.class, "customobject/clientcorporationcustomobjectinstance3-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance4.class, "customobject/clientcorporationcustomobjectinstance4-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance5.class, "customobject/clientcorporationcustomobjectinstance5-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance6.class, "customobject/clientcorporationcustomobjectinstance6-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance7.class, "customobject/clientcorporationcustomobjectinstance7-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance8.class, "customobject/clientcorporationcustomobjectinstance8-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance9.class, "customobject/clientcorporationcustomobjectinstance9-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance10.class, "customobject/clientcorporationcustomobjectinstance10-data.txt");
        entityFiles.put(PersonCustomObjectInstance1.class, "customobject/personcustomobjectinstance1-data.txt");
        entityFiles.put(PersonCustomObjectInstance2.class, "customobject/personcustomobjectinstance2-data.txt");
        entityFiles.put(PersonCustomObjectInstance3.class, "customobject/personcustomobjectinstance3-data.txt");
        entityFiles.put(PersonCustomObjectInstance4.class, "customobject/personcustomobjectinstance4-data.txt");
        entityFiles.put(PersonCustomObjectInstance5.class, "customobject/personcustomobjectinstance5-data.txt");
        entityFiles.put(PersonCustomObjectInstance6.class, "customobject/personcustomobjectinstance6-data.txt");
        entityFiles.put(PersonCustomObjectInstance7.class, "customobject/personcustomobjectinstance7-data.txt");
        entityFiles.put(PersonCustomObjectInstance8.class, "customobject/personcustomobjectinstance8-data.txt");
        entityFiles.put(PersonCustomObjectInstance9.class, "customobject/personcustomobjectinstance9-data.txt");
        entityFiles.put(PersonCustomObjectInstance10.class, "customobject/personcustomobjectinstance10-data.txt");

		return entityFiles;
	}

	public static Map<Class<? extends BullhornEntity>, String> getMetaDataFileNames() {
        Map<Class<? extends BullhornEntity>, String> entityMetaFiles = new LinkedHashMap<Class<? extends BullhornEntity>, String>();

		entityMetaFiles.put(Appointment.class, "meta/appointment-meta-data.txt");
		entityMetaFiles.put(AppointmentAttendee.class, "meta/appointmentattendee-meta-data.txt");
		entityMetaFiles.put(BusinessSector.class, "meta/businesssector-meta-data.txt");
		entityMetaFiles.put(Candidate.class, "meta/candidate-meta-data.txt");
        entityMetaFiles.put(CandidateCertification.class, "meta/candidatecertification-meta-data.txt");
		entityMetaFiles.put(CandidateEducation.class, "meta/candidateeducation-meta-data.txt");
		entityMetaFiles.put(CandidateReference.class, "meta/candidatereference-meta-data.txt");
		entityMetaFiles.put(CandidateWorkHistory.class, "meta/candidateworkhistory-meta-data.txt");
		entityMetaFiles.put(Category.class, "meta/category-meta-data.txt");
		entityMetaFiles.put(Certification.class, "meta/certification-meta-data.txt");
		entityMetaFiles.put(ClientContact.class, "meta/clientcontact-meta-data.txt");
		entityMetaFiles.put(ClientCorporation.class, "meta/clientcorporation-meta-data.txt");
		entityMetaFiles.put(CorporateUser.class, "meta/corporateuser-meta-data.txt");
		entityMetaFiles.put(CorporationDepartment.class, "meta/corporationdepartment-meta-data.txt");
		entityMetaFiles.put(Country.class, "meta/country-meta-data.txt");
        entityMetaFiles.put(DistributionList.class, "meta/distributionlist-meta-data.txt");
        entityMetaFiles.put(File.class, "meta/file-meta-data.txt");
		entityMetaFiles.put(HousingComplex.class, "meta/housingcomplex-meta-data.txt");
        entityMetaFiles.put(JobBoardPost.class, "meta/jobboardpost-meta-data.txt");
		entityMetaFiles.put(JobOrder.class, "meta/joborder-meta-data.txt");
		entityMetaFiles.put(JobSubmission.class, "meta/jobsubmission-meta-data.txt");
		entityMetaFiles.put(JobSubmissionHistory.class, "meta/jobsubmissionhistory-meta-data.txt");
        entityMetaFiles.put(Lead.class, "meta/lead-meta-data.txt");
		entityMetaFiles.put(Note.class, "meta/note-meta-data.txt");
		entityMetaFiles.put(NoteEntity.class, "meta/noteentity-meta-data.txt");
        entityMetaFiles.put(Opportunity.class, "meta/opportunity-meta-data.txt");
		entityMetaFiles.put(Person.class, "meta/person-meta-data.txt");
		entityMetaFiles.put(Placement.class, "meta/placement-meta-data.txt");
        entityMetaFiles.put(PlacementCertification.class, "meta/placementcertification-meta-data.txt");
		entityMetaFiles.put(PlacementChangeRequest.class, "meta/placementchangerequest-meta-data.txt");
		entityMetaFiles.put(PlacementCommission.class, "meta/placementcommission-meta-data.txt");
		entityMetaFiles.put(PrivateLabel.class, "meta/privatelabel-meta-data.txt");
		entityMetaFiles.put(Sendout.class, "meta/sendout-meta-data.txt");
		entityMetaFiles.put(Skill.class, "meta/skill-meta-data.txt");
		entityMetaFiles.put(Specialty.class, "meta/specialty-meta-data.txt");
		entityMetaFiles.put(State.class, "meta/state-meta-data.txt");
		entityMetaFiles.put(Task.class, "meta/task-meta-data.txt");
		entityMetaFiles.put(TimeUnit.class, "meta/timeunit-meta-data.txt");
        entityMetaFiles.put(UserType.class, "meta/usertype-meta-data.txt");
        entityMetaFiles.put(WorkersCompensation.class, "meta/workerscompensation-meta-data.txt");
        entityMetaFiles.put(WorkersCompensationRate.class, "meta/workerscompensationrate-meta-data.txt");

        entityMetaFiles.put(JobOrderCustomObjectInstance1.class, "meta/customobject/jobordercustomobjectinstance1-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance2.class, "meta/customobject/jobordercustomobjectinstance2-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance3.class, "meta/customobject/jobordercustomobjectinstance3-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance4.class, "meta/customobject/jobordercustomobjectinstance4-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance5.class, "meta/customobject/jobordercustomobjectinstance5-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance6.class, "meta/customobject/jobordercustomobjectinstance6-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance7.class, "meta/customobject/jobordercustomobjectinstance7-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance8.class, "meta/customobject/jobordercustomobjectinstance8-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance9.class, "meta/customobject/jobordercustomobjectinstance9-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance10.class, "meta/customobject/jobordercustomobjectinstance10-meta-data.txt");
		entityMetaFiles.put(OpportunityCustomObjectInstance1.class, "meta/customobject/opportunitycustomobjectinstance1-meta-data.txt");
		entityMetaFiles.put(OpportunityCustomObjectInstance2.class, "meta/customobject/opportunitycustomobjectinstance2-meta-data.txt");
		entityMetaFiles.put(OpportunityCustomObjectInstance3.class, "meta/customobject/opportunitycustomobjectinstance3-meta-data.txt");
		entityMetaFiles.put(OpportunityCustomObjectInstance4.class, "meta/customobject/opportunitycustomobjectinstance4-meta-data.txt");
		entityMetaFiles.put(OpportunityCustomObjectInstance5.class, "meta/customobject/opportunitycustomobjectinstance5-meta-data.txt");
		entityMetaFiles.put(OpportunityCustomObjectInstance6.class, "meta/customobject/opportunitycustomobjectinstance6-meta-data.txt");
		entityMetaFiles.put(OpportunityCustomObjectInstance7.class, "meta/customobject/opportunitycustomobjectinstance7-meta-data.txt");
		entityMetaFiles.put(OpportunityCustomObjectInstance8.class, "meta/customobject/opportunitycustomobjectinstance8-meta-data.txt");
		entityMetaFiles.put(OpportunityCustomObjectInstance9.class, "meta/customobject/opportunitycustomobjectinstance9-meta-data.txt");
		entityMetaFiles.put(OpportunityCustomObjectInstance10.class, "meta/customobject/opportunitycustomobjectinstance10-meta-data.txt");
		entityMetaFiles.put(PlacementCustomObjectInstance1.class, "meta/customobject/placementcustomobjectinstance1-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance2.class, "meta/customobject/placementcustomobjectinstance2-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance3.class, "meta/customobject/placementcustomobjectinstance3-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance4.class, "meta/customobject/placementcustomobjectinstance4-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance5.class, "meta/customobject/placementcustomobjectinstance5-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance6.class, "meta/customobject/placementcustomobjectinstance6-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance7.class, "meta/customobject/placementcustomobjectinstance7-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance8.class, "meta/customobject/placementcustomobjectinstance8-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance9.class, "meta/customobject/placementcustomobjectinstance9-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance10.class, "meta/customobject/placementcustomobjectinstance10-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance1.class, "meta/customobject/clientcorporationcustomobjectinstance1-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance2.class, "meta/customobject/clientcorporationcustomobjectinstance2-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance3.class, "meta/customobject/clientcorporationcustomobjectinstance3-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance4.class, "meta/customobject/clientcorporationcustomobjectinstance4-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance5.class, "meta/customobject/clientcorporationcustomobjectinstance5-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance6.class, "meta/customobject/clientcorporationcustomobjectinstance6-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance7.class, "meta/customobject/clientcorporationcustomobjectinstance7-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance8.class, "meta/customobject/clientcorporationcustomobjectinstance8-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance9.class, "meta/customobject/clientcorporationcustomobjectinstance9-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance10.class, "meta/customobject/clientcorporationcustomobjectinstance10-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance1.class, "meta/customobject/personcustomobjectinstance1-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance2.class, "meta/customobject/personcustomobjectinstance2-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance3.class, "meta/customobject/personcustomobjectinstance3-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance4.class, "meta/customobject/personcustomobjectinstance4-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance5.class, "meta/customobject/personcustomobjectinstance5-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance6.class, "meta/customobject/personcustomobjectinstance6-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance7.class, "meta/customobject/personcustomobjectinstance7-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance8.class, "meta/customobject/personcustomobjectinstance8-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance9.class, "meta/customobject/personcustomobjectinstance9-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance10.class, "meta/customobject/personcustomobjectinstance10-meta-data.txt");

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
