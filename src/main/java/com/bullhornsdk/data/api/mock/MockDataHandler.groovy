package com.bullhornsdk.data.api.mock

import com.bullhornsdk.data.exception.RestApiException
import com.bullhornsdk.data.model.entity.association.AssociationField
import com.bullhornsdk.data.model.entity.core.edithistory.EditHistory
import com.bullhornsdk.data.model.entity.core.edithistory.FieldChange
import com.bullhornsdk.data.model.entity.core.standard.*
import com.bullhornsdk.data.model.entity.core.type.*
import com.bullhornsdk.data.model.entity.embedded.OneToMany
import com.bullhornsdk.data.model.entity.meta.MetaData
import com.bullhornsdk.data.model.enums.MetaParameter
import com.bullhornsdk.data.model.enums.SettingsFields
import com.bullhornsdk.data.model.parameter.*
import com.bullhornsdk.data.model.parameter.standard.ParamFactory
import com.bullhornsdk.data.model.response.crud.CreateResponse
import com.bullhornsdk.data.model.response.crud.CrudResponse
import com.bullhornsdk.data.model.response.crud.DeleteResponse
import com.bullhornsdk.data.model.response.crud.UpdateResponse
import com.bullhornsdk.data.model.response.edithistory.EditHistoryListWrapper
import com.bullhornsdk.data.model.response.edithistory.FieldChangeListWrapper
import com.bullhornsdk.data.model.response.event.GetEventsResponse
import com.bullhornsdk.data.model.response.event.GetLastRequestIdResponse
import com.bullhornsdk.data.model.response.event.standard.StandardGetEventsResponse
import com.bullhornsdk.data.model.response.event.standard.StandardGetLastRequestIdResponse
import com.bullhornsdk.data.model.response.file.FileApiResponse
import com.bullhornsdk.data.model.response.file.FileContent
import com.bullhornsdk.data.model.file.FileMeta
import com.bullhornsdk.data.model.response.file.FileWrapper
import com.bullhornsdk.data.model.response.file.standard.StandardFileApiResponse
import com.bullhornsdk.data.model.response.file.standard.StandardFileContent
import com.bullhornsdk.data.model.file.standard.StandardFileMeta
import com.bullhornsdk.data.model.response.file.standard.StandardFileWrapper
import com.bullhornsdk.data.model.response.list.FastFindListWrapper
import com.bullhornsdk.data.model.response.list.ListWrapper
import com.bullhornsdk.data.model.response.list.PropertyOptionsListWrapper
import com.bullhornsdk.data.model.response.list.StandardListWrapper
import com.bullhornsdk.data.model.response.resume.ParsedResume
import com.bullhornsdk.data.model.response.resume.standard.StandardParsedResume
import com.bullhornsdk.data.util.copy.KryoObjectCopyHelper
import org.apache.commons.lang3.StringUtils
import org.apache.log4j.Logger
import org.codehaus.groovy.runtime.NullObject
import org.joda.time.DateTime
import org.springframework.web.multipart.MultipartFile
import java.io.File as JavaFile

import java.beans.BeanInfo
import java.beans.Introspector
import java.beans.PropertyDescriptor
/**
 * This class is stand in for the actual BH Rest api. It tries to mimic the way the Rest apis work.
 * 
 * A map (restEntityMap) can be seen as the db containing all records. This map is populated from text files containing json, see
 * {@link MockDataLoader} for this.
 * 
 * @author Magnus Fiore Palm
 * 
 */

public class MockDataHandler {

	private final static Logger log = Logger.getLogger(MockDataHandler.class);
	private final MockDataLoader mockDataLoader;
	private Map<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>> restEntityMap;
	private Map<Class<? extends BullhornEntity>, MetaData<?>> restMetaDataMap;
	private Map<Class<? extends SearchEntity>, List<MockSearchField>> searchFieldsMap;
	private Map<String,Closure> queryClosures = new HashMap<String,Closure>();
	private List<FastFindResult> fastFindResults;
	private List<EditHistory> editHistoryList;
	private List<FieldChange> editHistoryFieldChangeList;
	private Map<String, Object> settingsResults;
	private Settings settingsObjectResults;
    private StandardGetEventsResponse getEventsResponse;
    private StandardGetLastRequestIdResponse getLastRequestIdResponse;
    private List<PropertyOptionsResult> propertyOptionsResults;

	public MockDataHandler() {
		this.mockDataLoader = new MockDataLoader();
		this.restEntityMap = mockDataLoader.getEntityTestData();
		this.restMetaDataMap = mockDataLoader.getMetaTestData();
		this.searchFieldsMap = mockDataLoader.getSearchFields();
		this.fastFindResults = mockDataLoader.getFastFindResults();
		this.editHistoryList = mockDataLoader.getEditHistoryList();
		this.editHistoryFieldChangeList = mockDataLoader.getEditHistoryFieldChangeList()
		this.settingsResults = mockDataLoader.getSettingsResults();
		this.settingsObjectResults = mockDataLoader.getSettingsObjectResults();
        this.getEventsResponse = mockDataLoader.getEventsResponse();
        this.getLastRequestIdResponse = mockDataLoader.getLastRequestIdResponse();
		this.queryClosures = addQueryClosures();
        this.propertyOptionsResults = mockDataLoader.getPropertyOptionsResults();
	}

	public void refreshTestData(){
		this.restEntityMap = mockDataLoader.reloadEntityDataFromCache();
		this.restMetaDataMap = mockDataLoader.reloadMetaDataFromCache();
	}

	/**
	 * Returns a copy of the entity stored in restEntityMap.
	 * 
	 * @param type
	 * @param id
	 * @return
	 */
	public <T extends BullhornEntity> T findEntity(Class<T> type, Integer id, Set<String> fieldSet) {
		T entity = getEntityFromMap(type,id);
		
		if(entity == null){
			throw new RestApiException("No entity of type "+type.getSimpleName()+" with id "+id+" exists.");
		}
		Set<String> verifiedAndModifiedFields = checkAndModifyFields(fieldSet,type);

		T newEntity = createNewInstanceWithOnlySpecifiedFieldsPopulated(entity,verifiedAndModifiedFields);

		return newEntity;
	}

	/**
	 * Returns a copy of the entity stored in restEntityMap.
	 *
	 * @param type
	 * @param id
	 * @return
	 */
	public <T extends BullhornEntity> ListWrapper<T> findMultipleEntities(Class<T> type, Set<Integer> idList, Set<String> fieldSet) {
		List<T> entityList = new ArrayList<T>();
		for (Integer id : idList) {
			T entity = getEntityFromMap(type, id)
			if(entity == null){
				throw new RestApiException("No entity of type "+type.getSimpleName()+" with id "+id+" exists.");
			}
			Set<String> verifiedAndModifiedFields = checkAndModifyFields(fieldSet,type);

			T newEntity = createNewInstanceWithOnlySpecifiedFieldsPopulated(entity,verifiedAndModifiedFields);
			entityList.add(newEntity);
		}

		ListWrapper<T> wrapper = new StandardListWrapper<T>(entityList);
		wrapper.setTotal(entityList.size());
		wrapper.setStart(0);
		return wrapper;
	}
	
	private <T extends BullhornEntity> T getEntityFromMap(Class<T> type, Integer id){
		T entity = null;
		if(id != null){
			 entity = (T) restEntityMap.get(type).get(id);
		}
		return entity;
	}


	/**
	 * Mimics an insert by adding the passed in entity to the restEntityMap.
	 * 
	 * The id for the new entity will be the previously highest id + 1.
	 * 
	 * @param entity
	 * @return
	 */
	public <C extends CrudResponse, T extends CreateEntity> C insertEntity(T entity) {

		Map<Integer, T> currentValues = (Map<Integer, T>) restEntityMap.get(entity.getClass());

		int newId = Collections.max(currentValues.keySet()) + 1;
		entity.setId(newId);
		currentValues.put(newId, entity);

		CrudResponse response = new CreateResponse();
		response.setChangedEntityId(newId);
		response.setChangedEntityType(entity.getClass().getSimpleName().toUpperCase());
		return (C) response;
	}

	
	public <C extends CrudResponse, T extends DeleteEntity> C softDeleteEntity(Class<T> type, Integer id) {
		return deleteEntity(type,id);
	}
	
	public <C extends CrudResponse, T extends DeleteEntity> C hardDeleteEntity(Class<T> type, Integer id) {
		return deleteEntity(type,id);
	}
	
	
	/**
	 * Removes the entity with the id and type from the restEntityMap.
	 * 
	 * @param type
	 * @param id
	 * @return
	 */
	public <C extends CrudResponse, T extends DeleteEntity> C deleteEntity(Class<T> type, Integer id) {
		Map<Integer, T> currentValues = (Map<Integer, T>) restEntityMap.get(type);

		T entity = currentValues.get(id);
		if(entity == null){
			throw new RestApiException("No entity of type "+type.getSimpleName()+" with id "+id+" exists.");
		}
		try{
			//soft delete
			entity.isDeleted = true;
		}catch(MissingPropertyException e){
			log.debug("hard delete",e);
			//hard delete
			currentValues.remove(id);
		}

		CrudResponse response = new DeleteResponse();
		response.setChangedEntityId(id);
		response.setChangedEntityType(type.getSimpleName().toUpperCase());
		return (C) response;
	}

	/**
	 * Updates the entity.
	 * 
	 * @param entity
	 * @return
	 */
	public <C extends CrudResponse, T extends UpdateEntity> C updateEntity(T entity) {
		Map<Integer, T> currentValues = (Map<Integer, T>) restEntityMap.get(entity.getClass());
		CrudResponse response = new UpdateResponse();
		response.setChangedEntityId(entity.getId());
		response.setChangedEntityType(entity.getClass().getSimpleName().toUpperCase());
		
		T existingEntity = currentValues.get(entity.getId());
		if(existingEntity == null){
			throw new RestApiException("No entity of type "+entity.getClass().getSimpleName()+" with id "+entity.getId()+" exists.");
		}
		try {
			updateExistingEntityWithNewNonNullValues(entity, existingEntity);
		} catch (Exception e) {
			response.setErrorCode("500");
			response.setErrorMessage("Error updating entity of type: " + entity.getClass().getSimpleName() + " with id: " + entity.getId());
			log.error("Error updating entity of type: " + entity.getClass().getSimpleName() + " with id: " + entity.getId(), e);
		}

		return (C) response;
	}


	/**
	 * Currently this method does NOT support OR logic.
	 * @param type
	 * @param where
	 * @param fieldSet
	 * @param params
	 * @return
	 */
	public <T extends QueryEntity,L extends ListWrapper<T>> L query(Class<T> type, String where, Set<String> fieldSet, QueryParams params) {
		if(params == null){
			params = ParamFactory.queryParams();
		}
		Set<String> verifiedAndModifiedFields = checkAndModifyFields(fieldSet,type);
		List<T> filteredValues = queryForData(type, where);

		List<T> filteredValuesWithFieldsSet = filteredValues.collect(){
			entity ->
			createNewInstanceWithOnlySpecifiedFieldsPopulated(entity,verifiedAndModifiedFields)
		}
		
		List<T> entitiesOverCountRemoved = handleCount(filteredValuesWithFieldsSet, params.getCount());
		ListWrapper<T> wrapper = new StandardListWrapper<T>(entitiesOverCountRemoved);
		wrapper.setTotal(filteredValuesWithFieldsSet.size());
		wrapper.setStart(params.getStart());
		return wrapper;

		return new StandardListWrapper<T>(filteredValuesWithFieldsSet);
	}

	public <T extends BullhornEntity> EditHistoryListWrapper queryEntityForEditHistory(Class<T> entityType, String where, Set<String> fieldSet, QueryParams params) {
		if(params == null){
			params = ParamFactory.queryParams();
		}
		List<EditHistory> result = getEditHistoryList();
		EditHistoryListWrapper wrapper = new EditHistoryListWrapper(result);
		return wrapper;
	}

	public <T extends BullhornEntity> FieldChangeListWrapper queryEntityForEditHistoryFieldChanges(Class<T> entityType, String where, Set<String> fieldSet, QueryParams params) {
		if(params == null){
			params = ParamFactory.queryParams();
		}
		List<EditHistory> result = getEditHistoryFieldChangeList();
		FieldChangeListWrapper wrapper = new FieldChangeListWrapper(result);
		return wrapper;
	}
	
	public <T extends QueryEntity> List<T> queryForList(Class<T> type, String where, Set<String> fieldSet, QueryParams params) {

		return query(type, where, fieldSet, params).getData();
	}
	
	public <T extends SearchEntity> List<T> searchForList(Class<T> type, String query, Set<String> fieldSet, SearchParams params) {
		return search(type,query,fieldSet,params).getData();
	}

	public List<FastFindResult> fastFindForList(String query, FastFindParams params) {
		return fastFind(query, params).getData();
	}

	public <T extends SearchEntity,L extends ListWrapper<T>> L search(Class<T> type, String query, Set<String> fieldSet,
		SearchParams params) {
			if(params == null){
				params = ParamFactory.searchParams();
			}
			Set<String> verifiedAndModifiedFields = checkAndModifyFields(fieldSet,type);
			verifySearchFields(query,type);
			List<T> allEntities  = getAllEntitiesOfType(type);
			List<T> entitiesOverCountRemoved = handleCount(allEntities, params.getCount());
			ListWrapper<T> wrapper = new StandardListWrapper<T>(entitiesOverCountRemoved);
			wrapper.setTotal(allEntities.size());
			wrapper.setStart(params.getStart());
			return wrapper;
		}

	public FastFindListWrapper fastFind(String query, FastFindParams params) {
		if(params == null){
			params = ParamFactory.fastFindParams();
		}

		List<FastFindResult> result = getFastFindResults();
		FastFindListWrapper wrapper = new FastFindListWrapper(result);
		return wrapper;
	}

    public PropertyOptionsListWrapper getOptions(Class<? extends BullhornEntity> type, OptionsParams params) {
        if(params == null){
            params = ParamFactory.optionsParams();
        }

        List<PropertyOptionsResult> result = getPropertyOptionsResults();
        PropertyOptionsListWrapper wrapper = new PropertyOptionsListWrapper(result);
        return wrapper;
    }

    public PropertyOptionsListWrapper getOptions(Class<? extends BullhornEntity> type, Set<Integer> optionsIds, OptionsParams params) {
        if(params == null){
            params = ParamFactory.optionsParams();
        }

        List<PropertyOptionsResult> result = getPropertyOptionsResults();
        PropertyOptionsListWrapper wrapper = new PropertyOptionsListWrapper(result);
        return wrapper;
    }

	private <T> List<T> handleCount(List<T> entities, Integer count){
		if(count != null && count < entities.size()){
			return entities.subList(0, count);
		}
		return entities;
	}


	/**
	 * Verifies that every fieldName in the fieldSet are correct fields for the BH Search api call. The valid search fields can be found
	 * in resources/testdata/rest/searchfields/*
	 * 
	 * @param fieldSet the fields that sh
	 * @param type
	 */
	public <T extends SearchEntity> void verifySearchFields(String query,Class<T> type){

		String noParentheses = removeParentheses(query);

		Set<String> splitByAndOr = splitStringOnAND_OR(noParentheses);
		Set<String> fieldsFromQuery = splitEachStringOnColon(splitByAndOr);
		Set<String> fieldsFromQueryWithoutMinusSigns = removeMinusSigns(fieldsFromQuery);
		
		List<MockSearchField> validSearchFields = searchFieldsMap.get(type);

		fieldsFromQueryWithoutMinusSigns.each {
			fieldName ->
			def field = validSearchFields.find {
				searchField ->
				searchField.getName() == fieldName;
			}

			if(field == null){
				throw new IllegalArgumentException(fieldName +" is not a valid search field on a "+type.getSimpleName()+" Valid fields are: ["+validSearchFields.collect({
					it.name
				}).join(",")+"]");
			}
		}
	}

	
	public Set<String> removeMinusSigns(Set<String> values){
		return values.collect {
			StringUtils.replace(it, "-", "");
		}  as LinkedHashSet<String>;
	}
	
	public String removeParentheses(String text){
		return text.replace("(", "").replace(")", "");
	}

	public Set<String> splitStringOnAND_OR(String text){
		Set<String> values =  text.split(" AND | And | and | OR | Or | or ") as LinkedHashSet<String>;

		return values.collect {
			it.trim();
		}  as LinkedHashSet<String>;
	}

	/**
	 * Examples: ["id:1","status:Approved"] will return ["id","status"]
	 * @param values
	 * @return
	 */
	public Set<String> splitEachStringOnColon(Set<String> values){

		return values.collect(){
			splitStringOnColonAndReturnValueLeftOfColon(it);
		} as LinkedHashSet<String>;
	}


	public String splitStringOnColonAndReturnValueLeftOfColon(String text){
		if(text.contains(":")){
			return text.split(":")[0];
		}else{
			return text
		}
	}


	/**
	 * Returns the meta data. Ignores metaParameters and fieldSet since this method always returns MetaParameter.FULL and "*" as fieldSet
	 * @param type
	 * @param metaParameter
	 * @param fieldSet
	 * @return
	 */
	public <T extends BullhornEntity> MetaData<T> getMetaData(Class<T> type, MetaParameter metaParameter, Set<String> fieldSet){
		return restMetaDataMap.get(type);
	}

	/**
	 * Returns the settings data. 
	 * @param settingSet
	 * @return
	 */
	public Map<String,Object> getSettingsData(Set<String> settingSet){
		return this.settingsResults;
	}

	public Settings getSettingsObjectData(Set<SettingsFields> settingSet){
		return this.settingsResults;
	}

    public GetEventsResponse getEventsData(Integer maxResults) {
        if(this.getEventsResponse.events.size() > maxResults) {
            StandardGetEventsResponse response = KryoObjectCopyHelper.copy(this.getEventsResponse);

            response.setEvents(response.getEvents().subList(0, maxResults));

            return response;
        }

        return this.getEventsResponse;
    }

    public GetEventsResponse getEventsDataByRequest(Integer requestId) {
        if(!this.getEventsResponse.getRequestId().equals(requestId)) {
            StandardGetEventsResponse response = KryoObjectCopyHelper.copy(this.getEventsResponse);

            response.setRequestId(requestId);

            return response;
        }

        return this.getEventsResponse;
    }

    public GetLastRequestIdResponse getLastRequestId(String subscriptionId) {
        return this.getLastRequestIdResponse;
    }

	/**
	 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * FILE HANDLING
	 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 */

	public ParsedResume parseResumeFile(MultipartFile resume, ResumeFileParseParams params) {
		ParsedResume parsedResume = createParsedResume(1,[1],[1],[1],true);
		return parsedResume;
	}


	public ParsedResume parseResumeText(String resume, ResumeTextParseParams params) {
		ParsedResume parsedResume = createParsedResume(1,[1],[1],[1],true);
		return parsedResume;
	}


	public ParsedResume saveParsedResumeDataToBullhorn(ParsedResume parsedResume) {
		CrudResponse candidateInsert = this.insertEntity(parsedResume.getCandidate());

		List<Integer> educationIds = [];

		for(CandidateEducation education : parsedResume.getCandidateEducation()){
			CrudResponse educationInsert = this.insertEntity(education);
			educationIds.add(educationInsert.getChangedEntityId());
		}

		List<Integer> workHistoryIds = [];

		for(CandidateWorkHistory workHistory : parsedResume.getCandidateWorkHistory()){
			CrudResponse workHistoryInsert = this.insertEntity(workHistory);
			workHistoryIds.add(workHistoryInsert.getChangedEntityId());
		}

		return createParsedResume(candidateInsert.getChangedEntityId(),educationIds,workHistoryIds,[1],false);
	}


	public ParsedResume parseResumeThenAddfile(Class<? extends FileEntity> type, Integer entityId, MultipartFile file, String externalId,
	    FileParams fileParams, ResumeFileParseParams resumeFileParseParams) {

		StandardFileWrapper fileWrapper = createMockFileWrapper(file.getOriginalFilename());

		ParsedResume parsedResume = createParsedResume(1,[1],[1],[1],true);
		if (!parsedResume.isError()) {
			parsedResume.setFileWrapper(fileWrapper);
		}

		return parsedResume;
	}

	private FileWrapper createMockFileWrapper(String fileName){

		StandardFileContent fileContent = createMockFileContent(fileName);

		StandardFileMeta fileMeta = createMockFileMeta(fileName);

		return new StandardFileWrapper(fileContent, fileMeta);
	}

	private FileContent createMockFileContent(String fileName){
		if(fileName == null){
			fileName = "SmallFile.txt";
		}

		return new StandardFileContent([id: 1,
			contentType: 'text/plain',
			fileContent:'VGhpcyBpcyBhIHZlcnkgc21hbGwgdGV4dCBmaWxlLg0KDQpTbWFsbFRleHRGaWxl',
			name:fileName]);
	}


	private FileMeta createMockFileMeta(String fileName){
		if(fileName == null){
			fileName = "SmallFile.txt";
		}

		return new StandardFileMeta([id:2734,
			type:"Resume",
			name:fileName,
			description:null,
			contentType:null,
			contentSubType:null,
			fileType:null,
			externalID:"Portfolio",
            dateAdded: DateTime.now(),
            distribution: "Internal"]);
	}



	public FileWrapper addFile(Class<? extends FileEntity> type, Integer entityId, JavaFile file, String externalId, FileParams params) {
		String fileName = file.getName();
		return createMockFileWrapper(fileName);
	}


	public FileContent getFileContent(Class<? extends FileEntity> type, Integer entityId, Integer fileId) {
		return createMockFileContent(null);
	}


	public List<FileMeta> getFileMetaData(Class<? extends FileEntity> type, Integer entityId) {
		return [createMockFileMeta(null)];
	}


	public FileWrapper getFile(Class<? extends FileEntity> type, Integer entityId, Integer fileId) {
		return createMockFileWrapper(null);
	}


	public List<FileWrapper> getAllFiles(Class<? extends FileEntity> type, Integer entityId) {
		return [createMockFileWrapper(null)];
	}


	public FileWrapper addFile(Class<? extends FileEntity> type, Integer entityId, MultipartFile file, String externalId, FileParams params) {
		return createMockFileWrapper(file.getOriginalFilename());
	}


	public FileWrapper addResumeFileAndPopulateCandidateDescription(Integer candidateId, JavaFile file, String candidateDescription,
	String externalId, FileParams params) {
	     
		 Candidate candidate = findEntity(Candidate.class, candidateId, [ "id" ] as Set);
		 candidate.setDescription(candidateDescription);
		 updateEntity(candidate);
		 
		String fileName = file.getName();
		return createMockFileWrapper(fileName);
	}

	public FileApiResponse deleteFile(Class<? extends FileEntity> type, Integer entityId, Integer fileId) {
		return new StandardFileApiResponse([fileId:fileId,changeType:"DELETED"]);
	}

	/*
	 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * ASSOCIATION HANDLING
	 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 */



	
	public <C extends CrudResponse, T extends AssociationEntity> C associateWithEntity(Class<T> type, Integer entityId,
	AssociationField<T, ? extends BullhornEntity> associationName, Set<Integer> associationIds) {

		return new CreateResponse([changedEntityId:entityId,changedEntityType:type.getSimpleName(),changeType:"INSERT"]);
	}

	
	public <C extends CrudResponse, T extends AssociationEntity> C disassociateWithEntity(Class<T> type, Integer entityId,
	AssociationField<T, ? extends BullhornEntity> associationName, Set<Integer> associationIds) {
		return new DeleteResponse([changedEntityId:entityId,changedEntityType:type.getSimpleName(),changeType:"DELETE"]);
	}

	
	public <T extends AssociationEntity, E extends BullhornEntity> List<E> getAssociation(Class<T> type, Set<Integer> entityIds,
	AssociationField<T, E> associationName, Set<String> fieldSet, AssociationParams params) {
	
		return getAllEntitiesOfType(associationName.getAssociationType());
		
	}

	public <T extends AssociationEntity, E extends BullhornEntity> ListWrapper<E> getAllAssociations(Class<T> type, Set<Integer> entityIds,
																						  AssociationField<T, E> associationName, Set<String> fieldSet, AssociationParams params) {
		return new StandardListWrapper<E>(getAllEntitiesOfType(associationName.getAssociationType()));
	}



	
	public List<Note> getAllCorpNotes(Integer clientCorporationID, Set<String> fieldSet, CorpNotesParams params) {

		Set<String> verifiedAndModifiedFields = checkAndModifyFields(fieldSet,Note.class);

		List<Note> allValues = getAllEntitiesOfType(Note.class);

		List<Note> filteredValuesWithFieldsSet = allValues.collect(){
			entity ->
			createNewInstanceWithOnlySpecifiedFieldsPopulated(entity,verifiedAndModifiedFields)
		}

		return filteredValuesWithFieldsSet;
	}

	
	public <C extends CrudResponse> C addNoteAndAssociateWithEntity(Note note) {
		return this.insertEntity(note);
	}
	
	
	


	/**
	 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * 
	 * HELPER METHODS STARTS HERE		
	 * 
	 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=
	 */
	
	
	private <T extends BullhornEntity> List<T> getAllEntitiesOfType(Class<T> type){
		Map<Integer, T> currentValues = (Map<Integer, Note>) restEntityMap.get(type);
		
		return currentValues.values().findAll(){
			it
		};
	}

	private List<FastFindResult> getFastFindResults() {
		return this.fastFindResults;
	}

	private List<EditHistory> getEditHistoryList() {
		return this.editHistoryList;
	}

	private List<FieldChange> getEditHistoryFieldChangeList() {
		return this.editHistoryFieldChangeList;
	}

	private Map<String,Object> getSettingsResults() {
		return this.settingsResults;
	}

    private List<PropertyOptionsResult> getPropertyOptionsResults() {
        return this.propertyOptionsResults;
    }

		/**
	 * Merges non-null values from an entity to another entity. This mimics the update function where Jackson does not serialize the null
	 * values to send in the bh rest api update call.
	 *
	 * @param from
	 *            The entity to grab the new values from
	 * @param to
	 *            The entity to update.
	 * @throws Exception
	 */


	private <T extends QueryEntity> List<T> queryForData(Class<T> type, String where){

		List<T> filteredValues = getAllEntitiesOfType(type);

		String whereWithoutSingleQuotes = StringUtils.replace(where, "'", "");
		String whereWithoutParentheses = removeParentheses(whereWithoutSingleQuotes);
		Set<String> ands = whereWithoutParentheses.split("AND");

		for(String and: ands){
			and = and.trim();
			String operator = getOperator(and);
			def value = getValue(and,operator);
			def fullPropertyPath = getPropertyPath(and,operator);
			def query = queryClosures.get(operator?.trim());
			assert query != null, "Query operator ${operator} is not valid";

			filteredValues =  filteredValues.findAll(){
				def targetProperty = it;
				for(partialPath in fullPropertyPath){
					targetProperty = targetProperty?."${partialPath}";
				}
				if(targetProperty instanceof String){
					query(targetProperty?.toString(),value?.toString())
				}else if(targetProperty instanceof DateTime && value instanceof BigDecimal){
					query(targetProperty?.getMillis(),value);
				}else {
					query(targetProperty,value)
				}
				
			}
		}


		return filteredValues;
	}

	/**
	 * Finds the operator in the queryString.
	 *
	 * Example: queryString = "id > 0", will return " > ".
	 *
	 * Special cases for NULL type queries.
	 *
	 * @param queryString
	 * @return
	 */
	private String getOperator(String queryString){

		String operator;
		if(StringUtils.containsIgnoreCase(queryString, "IS NULL")){
			operator = "=";
		}else if(StringUtils.containsIgnoreCase(queryString, "IS NOT NULL")){
			operator = "<>";
		}else if(StringUtils.contains(queryString, "LIKE")){
			operator = "LIKE";
		}else if(StringUtils.containsIgnoreCase(queryString, " IN ") || StringUtils.containsIgnoreCase(queryString, " IN")){
			operator = "IN";
		}else{
			operator =queryString.find("[^\\w\\.]+");
		}
		return operator;
	}

	/**
	 * Finds the value from the queryString.
	 *
	 * NULL type queries will return a null value to be used in filter.
	 *
	 * Example: queryString = "status = Approved", will return Approved.
	 *
	 * @param queryString
	 * @param operator
	 * @return
	 */
	private def getValue(String queryString,String operator){

		def value = null;
		if(StringUtils.containsIgnoreCase(queryString, "IS NULL")){
		}else if(StringUtils.containsIgnoreCase(queryString, "IS NOT NULL")){
		}else{
			String tempValueAsString =  StringUtils.substringAfter(queryString, operator).trim();
			value = getTypeSpecificValue(tempValueAsString);
		}
		return value;
	}


	/**
	 * Will get the property path from the where clause, and return it as an array of each part of that property path.
	 *
	 * Example: queryString = "candidate.id = 1", operator = " = ", this will return ["candidate","id"]
	 *
	 * @param queryString "candidate.id = 1"
	 * @param operator  " = "
	 *
	 * @return ["candidate","id"]
	 */
	private def getPropertyPath(String queryString,String operator){

		String propertyPath;
		if(StringUtils.containsIgnoreCase(queryString, "IS NULL")){
			propertyPath = subStringBeforeIgnoreCase(queryString, "is null");
		}else if(StringUtils.containsIgnoreCase(queryString, "IS NOT NULL")){
			propertyPath = subStringBeforeIgnoreCase(queryString, "is not null");
		}else{
			propertyPath = StringUtils.substringBefore(queryString, operator);
		}
		return propertyPath.trim().split("\\.");
	}

    private static String subStringBeforeIgnoreCase(String value, String separator) {
        return StringUtils.substring(value, 0, StringUtils.indexOfIgnoreCase(value, separator) - 1).trim();
    }

	private Object getTypeSpecificValue(String value){
		if(value?.isNumber()){
			return new BigDecimal(value);
		}
		if('true'.equalsIgnoreCase(value)){
			return true;
		}
		if('false'.equalsIgnoreCase(value)){
			return false;
		}

		return value;
	}

	/**
	 * Provides a number of Closures used to query the data.
	 * @return
	 */
	public Map<String,Closure> addQueryClosures(){
		def greaterThan = {
			 field1, value1 -> field1 > value1
		};
		def greaterThanEqualTo = {
			field1,value1 -> field1 >= value1
		};
		def lessThan = {
			field1,value1 -> field1 < value1
		};
		def lessThanEqualTo = {
			field1,value1 -> field1 <= value1
		};
		def equalTo = {
			field1,value1 -> field1 == value1
		};
		def notEqualTo = {
			field1,value1 -> field1 != value1
		};
		def queryByIn = {
			field1,value1 ->
			boolean containsValue = false;
			if(value1 instanceof String){  
			 containsValue = value1.split("\\,").contains(field1);
			}else {
			   containsValue = (field1 == value1);
			}
			//log.info("field1 = "+field1+" value1 = "+value1+" containsValue = "+containsValue);
			return containsValue;
		};
	
		def queryLike = {
			field1,value1 ->
			boolean containsValue = false;
			String valueString = value1?.toString();
			valueString = valueString.replace('%','');

			return field1?.toString().startsWith(valueString);
		};

		Map<String,Closure> queryClosures = new HashMap<String,Closure>();
		queryClosures.put(">",greaterThan);
		queryClosures.put(">=",greaterThanEqualTo);
		queryClosures.put("<",lessThan);
		queryClosures.put("<=",lessThanEqualTo);
		queryClosures.put("=",equalTo);
		queryClosures.put("<>",notEqualTo);
		queryClosures.put("IN",queryByIn);
		queryClosures.put("LIKE",queryLike);

		return queryClosures;
	}

	/**
	 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=
	 * Helper methods for field handling
	 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=
	 * 
	 */


	private <T extends BullhornEntity> Set<String> checkAndModifyFields(Set<String> fields, Class<T> type){
		if(fields == null){
			fields = ["*"] as Set;
		}
		verifyFields(fields, type)
		return modifyFieldsForNestedPropertyAccess(fields);
	}

	/**
	 * Checks that the fields are valid bh rest api fields for this entity.
	 * @param fields
	 * @param entity
	 */
	private  <T extends BullhornEntity> void verifyFields(Set<String> fields,Class<T> type){
		//TODO: implement
	}


	/**
	 * Changes the fields from fields used in the BH rest apis to the fields used to manage property access in {@link MockDataHandler}.
	 *
	 * Example: "jobOrder(id,title,clientContact(id,name,clientCorporation(id,name)))" will be changed to a Set<String> of values :
	 *
	 * ['jobOrder.id','jobOrder.title','jobOrder.clientContact.id','jobOrder.clientContact.name','jobOrder.clientContact.clientCorporation.id','jobOrder.clientContact.clientCorporation.name']
	 *
	 *
	 * @param fields
	 * @return
	 */
	private Set<String> modifyFieldsForNestedPropertyAccess(Set<String> fields){

		Set<String> squareBracketsFilter = fields.collect(){
			it.replaceAll('\\[\\d+\\]', "")
		};

		Set<String> modifiedFields = new LinkedHashSet<String>();

		squareBracketsFilter.each {
			
			it = setDefaultFieldsForNestedObjects(it);
			handleNestedPath(it,modifiedFields);
		}

		return modifiedFields;
	}
	
	
	private String setDefaultFieldsForNestedObjects(String field){
		if(['sendingUser','candidateReference','clientContactReference','clientContact','owner','candidate','approvingClientContact','backupApprovingClientContact','billingClientContact','statementClientContact'].contains(field)){
			return field+'(id,firstName,lastName)';
		}
		if(['jobOrder'].contains(field)){
			return field+'(id,title)';
		}
		if(['clientCorporation','vendorClientCorporation','parentCategory','category','primaryDepartment','userType','country'].contains(field)){
			return field+'(id,name)';
		}
		if(['placement','appointment','jobSubmission','user'].contains(field)){
			return field+'(id)';
		}
		return field;
	}

	/**
	 * Will recursively turn a path used in the actual rest apis to a path used for property access of groovy objects.
	 *
	 * Example: path = "jobOrder(id,title,clientContact(id,name,clientCorporation(id,name)))" will populate the Set<String> values with
	 *
	 *   ['jobOrder.id','jobOrder.title','jobOrder.clientContact.id','jobOrder.clientContact.name','jobOrder.clientContact.clientCorporation.id','jobOrder.clientContact.clientCorporation.name']
	 *
	 * @param path the bh api rest path for fields.
	 * @param values Set that will be populated with the property access paths
	 */
	public void handleNestedPath(String path,Set<String> values){

		if(path.contains("(")){

			String parent = StringUtils.substringBefore(path, "(");
			String restOfPath = StringUtils.substringBeforeLast(StringUtils.substringAfter(path, "("), ")");

			List<String> split = splitByCommaIfNotInParenthesis(restOfPath);
			List<String> tempValues = split.collect() {
				parent+'.'+it;
			}

			for(String value:tempValues){
				handleNestedPath(value,values);
			}
		}else {

			values.add(path);
		}
	}

	private List<String> splitByCommaIfNotInParenthesis(String orig) {
		List<String> splitted = new ArrayList<String>();
		int skipCommas = 0;
		String s = "";
		for ( char c : orig.toCharArray() ) {
			if ( c==',' && skipCommas == 0) {
				splitted.add (s);
				s="";
			} else {
				if ( c=='(' )
				skipCommas++;
				if ( c==')' )
				skipCommas--;
				s+= c;
			}
		}
		splitted.add(s);
		return splitted;
	}


	/**
	 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=
	 * Helper methods for dynamic property getting and setting
	 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=
	 *
	 */

	private <M> void updateExistingEntityWithNewNonNullValues(M from, M to) throws Exception {
		BeanInfo beanInfo = Introspector.getBeanInfo(to.getClass());

		// Iterate over all the attributes
		for (PropertyDescriptor descriptor : beanInfo.getPropertyDescriptors()) {

			// Only copy writable attributes
			if (descriptor.getWriteMethod() != null) {

				Object newValue = descriptor.getReadMethod().invoke(from);
				if (newValue != null && !"id".equals(descriptor.getName())) {
					descriptor.getWriteMethod().invoke(to, newValue);
				}

			}
		}
	}

	/**
	 * Merges values from the fromEntity to a brand new entity of the same type. Only fields in the fieldsSet will be populated on the new entity.
	 *
	 * Nested RestEntities (such as placement.candidate are supported). 
	 * 
	 * {@link OneToMany} nested objects are partially supported. The entire object will be set from the "from" entity
	 * but will not take the fields into account on the OneToMany.data entities.
	 *
	 * @param fromEntity The entity to grab fields from
	 * @param fields The fields/properties to populate on the new entity
	 * @return a new entity of type M with the fields from the fieldSet populated by those fields in the fromEntity.
	 * @throws Exception
	 */
	private <M> M createNewInstanceWithOnlySpecifiedFieldsPopulated(M fromEntity, Set<String> fields) throws Exception {

		if(fields == null || fields.contains("*")){
			return KryoObjectCopyHelper.copy(fromEntity);
		}

		M toEntity = fromEntity.getClass().newInstance();
		
		M copyOfFromEntity = KryoObjectCopyHelper.copy(fromEntity);
		
		for(String fullPath: fields){
			// Removes spaces in order to find properties
			fullPath = fullPath.replaceAll(" ", "");

            try {
                setValueFromPath(copyOfFromEntity,toEntity,fullPath)
            } catch(MissingPropertyException e) {
                log.error("Missing property " + e.getProperty() + " on entity " + fromEntity.getClass().getSimpleName());
            }
		}

		return toEntity;
	}

	/**
	 * Takes a value from the "from" entity and sets it on the "to" entity, using the path specified.
	 *
	 *
	 * Example of paths: candidate.id, jobOrder.title, name, jobOrder.clientContact.name
	 *
	 * @param from an entity of any kind
	 * @param to an entity of any kind
	 * @param path the path to the property to get and set. Example: "candidate.id"
	 * @throws MissingPropertyException
	 */
	private <M> void setValueFromPath(M from, M to, String path) throws MissingPropertyException{

		if(from == null){
			from = from.getClass().newInstance();
		}

		LinkedHashSet<String> fullPropertyPath = path.split("\\.");

		def toProperty = to;
		def fromProperty = from;

		if(nestedPath(fullPropertyPath)){
			for(partialPath in fullPropertyPath){
				try {
                    setValueFromPath(fromProperty,toProperty, partialPath)
                } catch(MissingPropertyException e) {
                    log.error("Missing property " + e.getProperty() + " on entity " + to.getClass().getSimpleName());
                }

                if(!parentPropertyIsOneToMany(fromProperty,toProperty,path)){
					fromProperty = fromProperty?."${partialPath}";
					toProperty = toProperty?."${partialPath}";
				}
			}

		}else if(fromProperty == null || fromProperty instanceof NullObject){
			log.debug("fromProperty is null, no need to set the toProperty then. ");
		}else if(parentPropertyIsOneToMany(fromProperty,toProperty,path)){
			//All fields on the OneToMany are set under propertyIsOneToMany. 
		    //Field selection for OneToMany is not currently supported.
		    log.debug("parent is OneToMany: "+path);
		}else if(propertyIsOneToMany(fromProperty,toProperty,path)){
			toProperty?."${path}" = fromProperty?."${path}";
		}else if(propertyIsNullNestedRestEntity(fromProperty,toProperty,path)){
			//Set nested RestEntities using the actual entity and not just the nested json. Example: placement.candidate will be set using the id
			//of the nested json in placement-data.txt to get the corresponding entity in candidate-data.txt
			fromProperty?."${path}" = findEntity(fromProperty?."${path}".getClass(),fromProperty?."${path}".getId(), [ "*" ] as Set);
			toProperty?."${path}" = fromProperty?."${path}".getClass().newInstance();
		}else if(propertyIsSimpleType(fromProperty,toProperty,path)){
			toProperty?."${path}" = fromProperty?."${path}";
		}
	}
	
	
	private <M> boolean propertyIsSimpleType(M fromProperty,M toProperty,String path){
		if(fromProperty?."${path}" instanceof BullhornEntity){
			return false;
		}
		return true;
	}

	private <M> boolean propertyIsNullNestedRestEntity(M fromProperty,M toProperty,String path){
		if(fromProperty?."${path}" instanceof BullhornEntity && toProperty?."${path}" == null){
			return true;
		}
		return false;
	}
	
	private <M> boolean propertyIsOneToMany(M fromProperty,M toProperty,String path){
	
		if(fromProperty?."${path}" instanceof OneToMany && toProperty?."${path}" == null){
			return true;
	     }
		
		return false;
	}
	
	private <M> boolean parentPropertyIsOneToMany(M fromProperty,M toProperty,String path){
		if(fromProperty instanceof OneToMany){
			return true;
		}
		return false;
	}
	
	private boolean nestedPath(Set fullPropertyPath){
		if(fullPropertyPath.size() > 1){
			return true;
		}
		return false;
	}


	/**
	 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=
	 * Helper methods for resume
	 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=
	 *
	 */

	private ParsedResume createParsedResume(Integer candidateId, List<Integer> educationIds,List<Integer> workHistoryIds,List<Integer> skillIds,boolean nullOutIds){
		ParsedResume parsedResume = new StandardParsedResume();
		Candidate candidate = this.findEntity(Candidate.class, candidateId, [ "*" ] as Set);
		if(nullOutIds){
			candidate.setId(null);
		}
		List<CandidateEducation> education = new ArrayList<CandidateEducation>();

		for(Integer id: educationIds){
			CandidateEducation candidateEducation = this.findEntity(CandidateEducation.class, 1, [ "*" ] as Set);
			if(nullOutIds){
				candidateEducation.setId(null);
				candidateEducation.setCandidate(null);
			}
			education.add(candidateEducation);
		}

		List<CandidateEducation> workHistory = new ArrayList<CandidateEducation>();
		for(Integer id: workHistoryIds){
			CandidateWorkHistory candiateWorkHistory = this.findEntity(CandidateWorkHistory.class, id, [ "*" ] as Set);
			if(nullOutIds){
				candiateWorkHistory.setId(null);
				candiateWorkHistory.setCandidate(null);
			}
			workHistory.add(candiateWorkHistory);
		}

		List<Skill> skills = new ArrayList<Skill>();
		for(Integer id: skillIds){
			Skill skill = this.findEntity(Skill.class, id, [ "*" ] as Set);
			if(nullOutIds){
				skill.setId(null);

			}
			skills.add(skill);
		}

		parsedResume.setCandidate(candidate);
		parsedResume.setCandidateEducation(education);
		parsedResume.setCandidateWorkHistory(workHistory);
		parsedResume.setSkillList(skills);
		return parsedResume;
	}



}
