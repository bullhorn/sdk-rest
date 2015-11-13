package com.bullhornsdk.data.api.mock
import com.bullhornsdk.data.api.helper.RestJsonConverter
import com.bullhornsdk.data.api.helper.concurrency.ConcurrencyService
import com.bullhornsdk.data.api.helper.concurrency.standard.RestConcurrencyService
import com.bullhornsdk.data.model.entity.core.standard.*
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity
import com.bullhornsdk.data.model.entity.core.type.SearchEntity
import com.bullhornsdk.data.model.entity.meta.MetaData
import com.bullhornsdk.data.model.entity.meta.StandardMetaData
import com.bullhornsdk.data.model.enums.RestEntityInfo
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
	private Map<String,Object> settingsResultMapCache;
	private Map<Class<? extends BullhornEntity>, MetaData<?>> restMetaDataMapCache;
	private Map<Class<? extends SearchEntity>, List<MockSearchField>> searchFieldsMapCache;
	private Map<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>> restEntityMap;
	private List<FastFindResult> fastFindResultList;
	private Map<String,Object> settingsResultMap;
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

	public List<FastFindResult> getFastFindResults() {
		if (fastFindResultList == null) {
			reloadFastFindResults();
			this.fastFindResultListCache = KryoObjectCopyHelper.copy(fastFindResultList);
		}
		return fastFindResultList;
	}

	public Map<String,Object> getSettingsResults() {
		if (settingsResultMap == null) {
			reloadSettingsResults();
			this.settingsResultMapCache = KryoObjectCopyHelper.copy(settingsResultMap);
		}
		return settingsResultMap;
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

	public void reloadFastFindResults() {

		String jsonData = getFileData("fastfind-data.txt");
		FastFindListWrapper listWrapper = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, FastFindListWrapper.class);
		this.fastFindResultList = listWrapper.getData();
	}

	public void reloadSettingsResults() {

		String jsonData = getFileData("settings-data.txt");
		Map<String,Object> resultData = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, Map.class);
		this.settingsResultMap = resultData;
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

		ListWrapper<T> listWrapper = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, RestEntityInfo.getTypesListWrapperType(type));

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
		entityFiles.put(HousingComplex.class, "housingcomplex-data.txt");
		entityFiles.put(JobOrder.class, "joborder-data.txt");
		entityFiles.put(JobSubmission.class, "jobsubmission-data.txt");
		entityFiles.put(JobSubmissionHistory.class, "jobsubmissionhistory-data.txt");
        entityFiles.put(Lead.class, "lead-data.txt");
		entityFiles.put(Note.class, "note-data.txt");
		entityFiles.put(NoteEntity.class, "noteentity-data.txt");
        entityFiles.put(Opportunity.class, "opportunity-data.txt");
		entityFiles.put(Placement.class, "placement-data.txt");
		entityFiles.put(PlacementChangeRequest.class, "placementchangerequest-data.txt");
		entityFiles.put(PlacementCommission.class, "placementcommission-data.txt");
		entityFiles.put(Sendout.class, "sendout-data.txt");
		entityFiles.put(Skill.class, "skill-data.txt");
		entityFiles.put(Specialty.class, "specialty-data.txt");
		entityFiles.put(State.class, "state-data.txt");
		entityFiles.put(Task.class, "task-data.txt");
		entityFiles.put(TimeUnit.class, "timeunit-data.txt");

		return entityFiles;
	}

	public static Map<Class<? extends BullhornEntity>, String> getMetaDataFileNames() {
		Map<Class<? extends BullhornEntity>, String> entityMetaFiles = new LinkedHashMap<Class<? extends BullhornEntity>, String>();
		entityMetaFiles.put(Appointment.class, "meta/appointment-meta-data.txt");
		entityMetaFiles.put(AppointmentAttendee.class, "meta/appointmentattendee-meta-data.txt");
		entityMetaFiles.put(BusinessSector.class, "meta/businesssector-meta-data.txt");
		entityMetaFiles.put(Candidate.class, "meta/candidate-meta-data.txt");
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
		entityMetaFiles.put(HousingComplex.class, "meta/housingcomplex-meta-data.txt");
		entityMetaFiles.put(JobOrder.class, "meta/joborder-meta-data.txt");
		entityMetaFiles.put(JobSubmission.class, "meta/jobsubmission-meta-data.txt");
		entityMetaFiles.put(JobSubmissionHistory.class, "meta/jobsubmissionhistory-meta-data.txt");
        entityMetaFiles.put(Lead.class, "meta/lead-meta-data.txt");
		entityMetaFiles.put(Note.class, "meta/note-meta-data.txt");
		entityMetaFiles.put(NoteEntity.class, "meta/noteentity-meta-data.txt");
        entityMetaFiles.put(Opportunity.class, "meta/opportunity-meta-data.txt");
		entityMetaFiles.put(Placement.class, "meta/placement-meta-data.txt");
		entityMetaFiles.put(PlacementChangeRequest.class, "meta/placementchangerequest-meta-data.txt");
		entityMetaFiles.put(PlacementCommission.class, "meta/placementcommission-meta-data.txt");
		entityMetaFiles.put(Sendout.class, "meta/sendout-meta-data.txt");
		entityMetaFiles.put(Skill.class, "meta/skill-meta-data.txt");
		entityMetaFiles.put(Specialty.class, "meta/specialty-meta-data.txt");
		entityMetaFiles.put(State.class, "meta/state-meta-data.txt");
		entityMetaFiles.put(Task.class, "meta/task-meta-data.txt");
		entityMetaFiles.put(TimeUnit.class, "meta/timeunit-meta-data.txt");

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
		searchFieldsFiles.put(Note.class, "searchfields/note-searchfields.txt");
        searchFieldsFiles.put(Opportunity.class, "searchfields/opportunity-searchfields.txt");
		searchFieldsFiles.put(Placement.class, "searchfields/placement-searchfields.txt");

		return searchFieldsFiles;
	}

}
