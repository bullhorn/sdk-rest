package com.bullhornsdk.data.api;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.Errors;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.bullhornsdk.data.api.helper.EntityUpdateWorker;
import com.bullhornsdk.data.api.helper.FileWorker;
import com.bullhornsdk.data.api.helper.RestApiSession;
import com.bullhornsdk.data.api.helper.RestErrorHandler;
import com.bullhornsdk.data.api.helper.RestFileManager;
import com.bullhornsdk.data.api.helper.RestJsonConverter;
import com.bullhornsdk.data.api.helper.RestTemplateFactory;
import com.bullhornsdk.data.api.helper.RestUriVariablesFactory;
import com.bullhornsdk.data.api.helper.RestUrlFactory;
import com.bullhornsdk.data.api.helper.concurrency.ConcurrencyService;
import com.bullhornsdk.data.api.helper.concurrency.standard.RestConcurrencyService;
import com.bullhornsdk.data.exception.RestApiException;
import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation;
import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.bullhornsdk.data.model.entity.core.standard.FastFindResult;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.NoteEntity;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.FileEntity;
import com.bullhornsdk.data.model.entity.core.type.HardDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.LinkedId;
import com.bullhornsdk.data.model.entity.meta.MetaData;
import com.bullhornsdk.data.model.entity.meta.StandardMetaData;
import com.bullhornsdk.data.model.enums.BullhornEntityInfo;
import com.bullhornsdk.data.model.enums.MetaParameter;
import com.bullhornsdk.data.model.parameter.AssociationParams;
import com.bullhornsdk.data.model.parameter.CorpNotesParams;
import com.bullhornsdk.data.model.parameter.EntityParams;
import com.bullhornsdk.data.model.parameter.FastFindParams;
import com.bullhornsdk.data.model.parameter.FileParams;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.ResumeFileParseParams;
import com.bullhornsdk.data.model.parameter.ResumeTextParseParams;
import com.bullhornsdk.data.model.parameter.SearchParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import com.bullhornsdk.data.model.response.crud.CreateResponse;
import com.bullhornsdk.data.model.response.crud.CrudResponse;
import com.bullhornsdk.data.model.response.crud.DeleteResponse;
import com.bullhornsdk.data.model.response.crud.Message;
import com.bullhornsdk.data.model.response.crud.UpdateResponse;
import com.bullhornsdk.data.model.response.edithistory.EditHistoryListWrapper;
import com.bullhornsdk.data.model.response.edithistory.FieldChangeListWrapper;
import com.bullhornsdk.data.model.response.event.GetEventsResponse;
import com.bullhornsdk.data.model.response.event.GetLastRequestIdResponse;
import com.bullhornsdk.data.model.response.event.standard.StandardGetEventsResponse;
import com.bullhornsdk.data.model.response.event.standard.StandardGetLastRequestIdResponse;
import com.bullhornsdk.data.model.response.file.EntityMetaFiles;
import com.bullhornsdk.data.model.response.file.FileApiResponse;
import com.bullhornsdk.data.model.response.file.FileContent;
import com.bullhornsdk.data.model.response.file.FileMeta;
import com.bullhornsdk.data.model.response.file.FileWrapper;
import com.bullhornsdk.data.model.response.file.standard.StandardEntityMetaFiles;
import com.bullhornsdk.data.model.response.file.standard.StandardFileApiResponse;
import com.bullhornsdk.data.model.response.file.standard.StandardFileContent;
import com.bullhornsdk.data.model.response.file.standard.StandardFileWrapper;
import com.bullhornsdk.data.model.response.list.FastFindListWrapper;
import com.bullhornsdk.data.model.response.list.ListWrapper;
import com.bullhornsdk.data.model.response.list.NoteListWrapper;
import com.bullhornsdk.data.model.response.list.StandardListWrapper;
import com.bullhornsdk.data.model.response.resume.ParsedResume;
import com.bullhornsdk.data.model.response.resume.standard.StandardParsedResume;
import com.bullhornsdk.data.validation.RestEntityValidator;
import com.bullhornsdk.data.validation.StandardRestEntityValidator;

/**
 * Standard implementation of the BullhornData interface that manages all rest calls and data binding from/to json - java.
 * 
 * This class can be injected using the standard @Autowired syntax:
 * 
 * @Autowired private BullhornData bullhornData;
 * 
 * @see RestApiSession for session management
 * @see RestTemplate for http calls
 * @see ParamFactory for how to pass in parameters to the specific methods
 * @see RestEntityValidator for validations
 * @see RestJsonConverter for json/java conversion
 * @see RestUrlFactory for assembling the urls for the api calls
 * @see RestUriVariablesFactory for adding the specific variables needed for the api calls
 * @see RestFileManager for file management related to resume parsing and file api calls
 * @see RestErrorHandler for error handling
 * 
 * @author Magnus Fiore Palm
 * 
 */

public class StandardBullhornData implements BullhornData {
	private static Logger log = Logger.getLogger(StandardBullhornData.class);

	private final RestApiSession restSession;

	private final RestTemplate restTemplate;

	private final String restUrl;

	private final RestJsonConverter restJsonConverter;

	private final RestEntityValidator restEntityValidator;

	private final RestUrlFactory restUrlFactory;

	private final RestUriVariablesFactory restUriVariablesFactory;

	private final RestFileManager restFileManager;

	private final RestErrorHandler restErrorHandler;

	private final ConcurrencyService concurrencyService;

	private final static int RESUME_PARSE_RETRY = 10;

	private final static int API_RETRY = 3;

	private final static int MAX_RECORDS_TO_RETURN_IN_ONE_PULL = 500;

	private final static int MAX_RECORDS_TO_RETURN_TOTAL = 20000;

	public StandardBullhornData(BullhornRestCredentials bullhornRestCredentials) {
		this.restSession = new RestApiSession(bullhornRestCredentials);
		this.restTemplate = RestTemplateFactory.getInstance();
		this.restUrl = restSession.getRestUrl();
		this.restJsonConverter = new RestJsonConverter();
		this.restEntityValidator = StandardRestEntityValidator.getDefaultInstance();
		this.restUrlFactory = new RestUrlFactory(restUrl);
		this.restFileManager = new RestFileManager();
		this.restUriVariablesFactory = new RestUriVariablesFactory(this, this.restFileManager);
		this.restErrorHandler = new RestErrorHandler();
		this.concurrencyService = new RestConcurrencyService();
	}

	public StandardBullhornData(RestApiSession restApiSession) {
		this.restSession = restApiSession;
		this.restTemplate = RestTemplateFactory.getInstance();
		this.restUrl = restSession.getRestUrl();
		this.restJsonConverter = new RestJsonConverter();
		this.restEntityValidator = StandardRestEntityValidator.getDefaultInstance();
		this.restUrlFactory = new RestUrlFactory(restUrl);
		this.restFileManager = new RestFileManager();
		this.restUriVariablesFactory = new RestUriVariablesFactory(this, this.restFileManager);
		this.restErrorHandler = new RestErrorHandler();
		this.concurrencyService = new RestConcurrencyService();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T extends BullhornEntity> T findEntity(Class<T> type, Integer id) {
		return this.handleGetEntity(type, id, null, ParamFactory.entityParams());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T extends BullhornEntity> T findEntity(Class<T> type, Integer id, Set<String> fieldSet) {
		return this.handleGetEntity(type, id, fieldSet, ParamFactory.entityParams());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T extends BullhornEntity, L extends ListWrapper<T>> L findMultipleEntity(Class<T> type, List<Integer> idList, Set<String> fieldSet) {
		List<Integer> uniqueIdList = new ArrayList<Integer>();
		for (Integer id : idList) {
			if (!uniqueIdList.contains(id)) {
				uniqueIdList.add(id);
			}
		}
		if (uniqueIdList.size() == 1) {
			List<T> list = new ArrayList<T>();
			list.add(this.handleGetEntity(type, uniqueIdList.get(0), fieldSet, ParamFactory.entityParams()));
			return (L) new StandardListWrapper<T>(list);
		}
		return this.handleGetMultipleEntities(type, uniqueIdList, fieldSet, ParamFactory.entityParams());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T extends QueryEntity> List<T> queryForList(Class<T> type, String where, Set<String> fieldSet, QueryParams params) {
		ListWrapper<T> wrapper = this.handleQueryForEntities(type, where, fieldSet, params);
		if (wrapper == null) {
			return Collections.emptyList();
		}
		return wrapper.getData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T extends SearchEntity> List<T> searchForList(Class<T> type, String query, Set<String> fieldSet, SearchParams params) {
		ListWrapper<T> wrapper = this.handleSearchForEntities(type, query, fieldSet, params);
		if (wrapper == null) {
			return Collections.emptyList();
		}
		return wrapper.getData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<FastFindResult> fastFindForList(String query, FastFindParams params) {
		FastFindListWrapper wrapper = this.handleFastFindForEntities(query, params);
		if (wrapper == null) {
			return Collections.emptyList();
		}
		return wrapper.getData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T extends QueryEntity, L extends ListWrapper<T>> L query(Class<T> type, String where, Set<String> fieldSet, QueryParams params) {
		return this.handleQueryForEntities(type, where, fieldSet, params);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T extends BullhornEntity> EditHistoryListWrapper queryEntityForEditHistory(Class<T> entityType, String where, Set<String> fieldSet, QueryParams params) {
		return this.handleQueryForEntityEditHistory(entityType, where, fieldSet, params);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T extends BullhornEntity> FieldChangeListWrapper queryEntityForEditHistoryFieldChanges(Class<T> entityType, String where, Set<String> fieldSet, QueryParams params) {
		return this.handleQueryForEntityEditHistoryFieldChange(entityType, where, fieldSet, params);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T extends SearchEntity, L extends ListWrapper<T>> L search(Class<T> type, String query, Set<String> fieldSet,
			SearchParams params) {
		return this.handleSearchForEntities(type, query, fieldSet, params);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FastFindListWrapper fastFind(String query, FastFindParams params) {
		return this.handleFastFindForEntities(query, params);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T extends QueryEntity, L extends ListWrapper<T>> L queryForAllRecords(Class<T> type, String where, Set<String> fieldSet,
			QueryParams params) {
		return this.handleQueryForAllRecords(type, where, fieldSet, params);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T extends SearchEntity, L extends ListWrapper<T>> L searchForAllRecords(Class<T> type, String query, Set<String> fieldSet,
			SearchParams params) {
		return this.handleSearchForAllRecords(type, query, fieldSet, params);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <C extends CrudResponse, T extends UpdateEntity> C updateEntity(T entity) {
		return this.handleUpdateEntity(entity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <C extends CrudResponse, T extends UpdateEntity> List<C> updateMultipleEntities(List<T> entityList) {
		return this.handleMultipleUpdates(entityList);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <C extends CrudResponse, T extends CreateEntity> C insertEntity(T entity) {
		return this.handleInsertEntity(entity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <C extends CrudResponse, T extends DeleteEntity> C deleteEntity(Class<T> type, Integer id) {
		return this.handleDeleteEntity(type, id);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T extends BullhornEntity> MetaData<T> getMetaData(Class<T> type, MetaParameter metaParameter, Set<String> fieldSet) {
		return this.handleGetMetaData(type, metaParameter, fieldSet);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Map<String, Object> getSettings(Set<String> settingSet) {
		return this.handleGetSettingsData(settingSet);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParsedResume parseResumeFile(MultipartFile resume, ResumeFileParseParams params) {
		return this.handleParseResumeFile(resume, params);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParsedResume parseResumeText(String resume, ResumeTextParseParams params) {
		return this.handleParseResumeText(resume, params);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParsedResume saveParsedResumeDataToBullhorn(ParsedResume parsedResume) {
		return this.handleSaveParsedResumeDataToBullhorn(parsedResume);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FileContent getFileContent(Class<? extends FileEntity> type, Integer entityId, Integer fileId) {
		return this.handleGetFileContent(type, entityId, fileId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<FileMeta> getFileMetaData(Class<? extends FileEntity> type, Integer entityId) {
		return this.handleGetEntityMetaFiles(type, entityId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FileWrapper getFile(Class<? extends FileEntity> type, Integer entityId, Integer fileId) {
		return this.handleGetFileContentWithMetaData(type, entityId, fileId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<FileWrapper> getAllFiles(Class<? extends FileEntity> type, Integer entityId) {
		return this.handleGetAllFileContentWithMetaData(type, entityId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FileWrapper addFile(Class<? extends FileEntity> type, Integer entityId, MultipartFile file, String externalId, FileParams params) {
		return this.handleAddFileWithMultipartFile(type, entityId, file, externalId, params);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FileWrapper addFile(Class<? extends FileEntity> type, Integer entityId, File file, String externalId, FileParams params) {
		return this.handleAddFileWithFile(type, entityId, file, externalId, params);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FileWrapper addResumeFileAndPopulateCandidateDescription(Integer candidateId, File file, String candidateDescription,
			String externalId, FileParams params) {

		return this.handleAddFileAndUpdateCandidateDescription(candidateId, file, candidateDescription, externalId, params);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParsedResume parseResumeThenAddfile(Class<? extends FileEntity> type, Integer entityId, MultipartFile file, String externalId,
			FileParams fileParams, ResumeFileParseParams resumeFileParseParams) {
		return this.addFileThenHandleParseResume(type, entityId, file, externalId, fileParams, resumeFileParseParams);

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FileApiResponse deleteFile(Class<? extends FileEntity> type, Integer entityId, Integer fileId) {
		return this.handleDeleteFile(type, entityId, fileId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <C extends CrudResponse, T extends AssociationEntity> C associateWithEntity(Class<T> type, Integer entityId,
			AssociationField<T, ? extends BullhornEntity> associationName, Set<Integer> associationIds) {
		return this.handleAssociateWithEntity(type, entityId, associationName, associationIds);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <C extends CrudResponse, T extends AssociationEntity> C disassociateWithEntity(Class<T> type, Integer entityId,
			AssociationField<T, ? extends BullhornEntity> associationName, Set<Integer> associationIds) {
		return this.handleDisassociateWithEntity(type, entityId, associationName, associationIds);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T extends AssociationEntity, E extends BullhornEntity> List<E> getAssociation(Class<T> type, Set<Integer> entityIds,
			AssociationField<T, E> associationName, Set<String> fieldSet, AssociationParams params) {
		return this.handleGetAssociation(type, entityIds, associationName, fieldSet, params);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Note> getAllCorpNotes(Integer clientCorporationID, Set<String> fieldSet, CorpNotesParams params) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForCorpNotes(clientCorporationID, fieldSet, params);

		String url = restUrlFactory.assembleCorpNotesUrl(params);

		NoteListWrapper wrapper = this.performGetRequest(url, NoteListWrapper.class, uriVariables);

		return wrapper.getData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <C extends CrudResponse> C addNoteAndAssociateWithEntity(Note note) {
		return this.handleAddNoteAndAssociateToEntity(note);
	}

    @Override
    public Integer getLastRequestId(String subscriptionId) {
        return this.handleGetLastRequestId(subscriptionId);
    }

    @Override
    public GetEventsResponse getEvents(String subscriptionId, Integer maxEvents) {
        return this.handleGetEvents(subscriptionId, maxEvents);
    }

    @Override
    public GetEventsResponse regetEvents(String subscriptionId, Integer requestId) {
        return this.handleRegetEvents(subscriptionId, requestId);
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RestApiSession getRestApiSession() {
		return restSession;
	}

	private <C extends CrudResponse> C handleAddNoteAndAssociateToEntity(Note note) {
		C noteAdded = this.insertEntity(note);

		if (noteAdded.getChangedEntityId() == null) {
			log.error("Error inserting the note in addNoteAndAssociateToEntity. The NoteEntity will note be added either.");
			Message message = Message
					.errorMessage("Error inserting the note in addNoteAndAssociateToEntity. The NoteEntity will note be added either.");
			noteAdded.addOneMessage(message);
			return noteAdded;
		}

		if (noteHasPersonReference(note)) {
			NoteEntity candidateNoteEntity = createNoteEntity(noteAdded, "User", note.getPersonReference().getId());
			this.insertEntity(candidateNoteEntity);
		}
		if (noteHasJobReference(note)) {
			NoteEntity jobNoteEntity = createNoteEntity(noteAdded, "JobOrder", note.getJobOrder().getId());
			this.insertEntity(jobNoteEntity);
		}
		if (noteHasPlacementReference(note)) {
			for (Placement placement : note.getPlacements().getData()) {
				NoteEntity placementNoteEntity = createNoteEntity(noteAdded, "Placement", placement.getId());
				this.insertEntity(placementNoteEntity);
			}
		}
		return noteAdded;
	}

	private boolean noteHasPlacementReference(Note note) {
		if (note.getPlacements() != null && note.getPlacements().getData() != null && note.getPlacements().getData().size() > 0) {
			return true;
		}
		return false;
	}

	private boolean noteHasPersonReference(Note note) {
		if (note.getPersonReference() != null && note.getPersonReference().getId() != null) {
			return true;
		}
		return false;
	}

	private boolean noteHasJobReference(Note note) {
		if (note.getJobOrder() != null && note.getJobOrder().getId() != null) {
			return true;
		}
		return false;
	}

	private NoteEntity createNoteEntity(CrudResponse noteAdded, String targetEntityName, Integer targetEntityID) {
		NoteEntity noteEntity = new NoteEntity();

		noteEntity.setNote(new LinkedId(noteAdded.getChangedEntityId()));
		noteEntity.setTargetEntityID(targetEntityID);
		noteEntity.setTargetEntityName(targetEntityName);
		return noteEntity;
	}

	private <T extends AssociationEntity, E extends BullhornEntity> List<E> handleGetAssociation(Class<T> type, Set<Integer> entityIds,
			AssociationField<T, E> associationName, Set<String> fieldSet, AssociationParams params) {

		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForGetAssociation(
				BullhornEntityInfo.getTypesRestEntityName(type), entityIds, associationName, fieldSet, params);
		String url = restUrlFactory.assembleGetAssociationUrl(params);
		ListWrapper<E> listWrapper = this.performGetRequest(url,
				BullhornEntityInfo.getTypesListWrapperType(associationName.getAssociationType()), uriVariables);

		if (listWrapper == null) {
			return Collections.emptyList();
		}
		return listWrapper.getData();

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getBhRestToken() {
		String bhRestToken = null;
		try {
			bhRestToken = restSession.getBhRestToken();
		} catch (RestApiException e) {
			log.error("Error getting bhRestToken! ", e);
		}
		return bhRestToken;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String refreshBhRestToken() {
		String bhRestToken = null;
		try {
			bhRestToken = restSession.refreshBhRestToken();
		} catch (RestApiException e) {
			log.error("Error getting bhRestToken! ", e);
		}
		return bhRestToken;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getRestUrl() {
		return restUrl;
	}

	/*
	 * ***********************************************************************************************************
	 * Helper methods that handle the api calls.
	 * **********************************************************************************************************
	 */

	/**
	 * Makes the "entity" api call for getting entities.
	 * 
	 * 
	 * HTTP Method: GET
	 * 
	 * @param type
	 * @param id
	 * @param fieldSet
	 * @param params
	 *            optional entity parameters
	 * @return
	 */
	protected <T extends BullhornEntity> T handleGetEntity(Class<T> type, Integer id, Set<String> fieldSet, EntityParams params) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForEntity(BullhornEntityInfo.getTypesRestEntityName(type),
				id, fieldSet, params);
		String url = restUrlFactory.assembleEntityUrl(params);
		String jsonString = this.performGetRequest(url, String.class, uriVariables);

		return restJsonConverter.jsonToEntityUnwrapRoot(jsonString, type);

	}

	/**
	 * Makes the "entity" api call for getting multiple entities.
	 *
	 *
	 * HTTP Method: GET
	 *
	 * @param type
	 * @param idList
	 * @param fieldSet
	 * @param params
	 * @param <L>
	 * @param <T>
	 * @return
	 */
	private <L extends ListWrapper<T>, T extends BullhornEntity> L handleGetMultipleEntities(Class<T> type, List<Integer> idList, Set<String> fieldSet, EntityParams params) {
		String ids = idList.stream().map(id -> String.valueOf(id)).collect(Collectors.joining(","));
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForGetMultiple(BullhornEntityInfo.getTypesRestEntityName(type), ids, fieldSet, params);
		String url = restUrlFactory.assembleEntityUrl(params);

		return (L) this.performGetRequest(url, BullhornEntityInfo.getTypesListWrapperType(type), uriVariables);
	}

	/**
	 * Makes the "query" api call
	 * 
	 * 
	 * HTTP Method: GET
	 * 
	 * @param type
	 *            the BullhornEntity type
	 * @param where
	 *            a SQL type where clause
	 * @param fieldSet
	 *            the fields to return, if null or emtpy will default to "*" all
	 * @param params
	 *            optional QueryParams.
	 * @return a LinsWrapper containing the records plus some additional information
	 */
	private <L extends ListWrapper<T>, T extends QueryEntity> L handleQueryForEntities(Class<T> type, String where, Set<String> fieldSet,
			QueryParams params) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForQuery(BullhornEntityInfo.getTypesRestEntityName(type),
				where, fieldSet, params);

		String url = restUrlFactory.assembleQueryUrl(params);

		return (L) this.performGetRequest(url, BullhornEntityInfo.getTypesListWrapperType(type), uriVariables);

	}

	/**
	 * Makes the "query" api call for EditHistory
	 *
	 *
	 * HTTP Method: GET
	 *
	 * @param entityType
	 *            the BullhornEntity type
	 * @param where
	 *            a SQL type where clause
	 * @param fieldSet
	 *            the fields to return, if null or emtpy will default to "*" all
	 * @param params
	 *            optional QueryParams.
	 * @return a EditHistoryListWrapper containing the records plus some additional information
	 */
	private <T extends BullhornEntity> EditHistoryListWrapper handleQueryForEntityEditHistory(Class<T> entityType, String where, Set<String> fieldSet, QueryParams params) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForQuery(BullhornEntityInfo.getTypesRestEntityName(entityType), where, fieldSet, params);
		String entity = uriVariables.get("entityType");
		if (entity == "Candidate" || entity == "ClientContact") {
			uriVariables.put("entityType", "User");
		}
		uriVariables.put("entityType", uriVariables.get("entityType") + "EditHistory");

		String url = restUrlFactory.assembleQueryUrl(params);

		return this.performGetRequest(url, EditHistoryListWrapper.class, uriVariables);

	}

	/**
	 * Makes the "query" api call for EditHistoryFieldChange
	 *
	 *
	 * HTTP Method: GET
	 *
	 * @param entityType
	 *            the BullhornEntity type
	 * @param where
	 *            a SQL type where clause
	 * @param fieldSet
	 *            the fields to return, if null or emtpy will default to "*" all
	 * @param params
	 *            optional QueryParams.
	 * @return a FieldChangeWrapper containing the records plus some additional information
	 */
	private <T extends BullhornEntity> FieldChangeListWrapper handleQueryForEntityEditHistoryFieldChange(Class<T> entityType, String where, Set<String> fieldSet, QueryParams params) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForQuery(BullhornEntityInfo.getTypesRestEntityName(entityType), where, fieldSet, params);
		uriVariables.put("entityType", uriVariables.get("entityType") + "EditHistoryFieldChange");

		String url = restUrlFactory.assembleQueryUrl(params);

		return this.performGetRequest(url, FieldChangeListWrapper.class, uriVariables);

	}

	private <L extends ListWrapper<T>, T extends QueryEntity> L handleQueryForAllRecords(Class<T> type, String where, Set<String> fieldSet,
			QueryParams params) {
		List<T> allEntities = new ArrayList<T>();
		params.setCount(MAX_RECORDS_TO_RETURN_IN_ONE_PULL);
		recursiveQueryPull(allEntities, type, where, fieldSet, params);
		return (L) new StandardListWrapper<T>(allEntities);
	}

	private <T extends QueryEntity> void recursiveQueryPull(List<T> allEntities, Class<T> type, String where, Set<String> fieldSet,
			QueryParams params) {
		ListWrapper<T> onePull = handleQueryForEntities(type, where, fieldSet, params);

		allEntities.addAll(onePull.getData());
		if (moreRecordsExist(onePull) && ceilingNotReached(allEntities)) {
			setStart(params, allEntities.size());
			recursiveQueryPull(allEntities, type, where, fieldSet, params);
		}
	}

	private void setStart(QueryParams params, int numberOfRecordsPulledAlready) {
		params.setStart(numberOfRecordsPulledAlready);
	}

	private <L extends ListWrapper<T>, T extends SearchEntity> L handleSearchForAllRecords(Class<T> type, String query,
			Set<String> fieldSet, SearchParams params) {
		List<T> allEntities = new ArrayList<T>();
		params.setCount(MAX_RECORDS_TO_RETURN_IN_ONE_PULL);
		recursiveSearchPull(allEntities, type, query, fieldSet, params);
		return (L) new StandardListWrapper<T>(allEntities);
	}

	private <T extends SearchEntity> void recursiveSearchPull(List<T> allEntities, Class<T> type, String query, Set<String> fieldSet,
			SearchParams params) {
		ListWrapper<T> onePull = handleSearchForEntities(type, query, fieldSet, params);

		allEntities.addAll(onePull.getData());
		if (moreRecordsExist(onePull) && ceilingNotReached(allEntities)) {
			setStart(params, allEntities.size());
			recursiveSearchPull(allEntities, type, query, fieldSet, params);
		}
	}

	private void setStart(SearchParams params, int numberOfRecordsPulledAlready) {
		params.setStart(numberOfRecordsPulledAlready);
	}

	/**
	 * Safety catch so that we will never pull more records than MAX_RECORDS_TO_RETURN_TOTAL
	 * 
	 * @param allEntities
	 * @return true if the MAX_RECORDS_TO_RETURN_TOTAL has been reached
	 */
	private boolean ceilingNotReached(List<?> allEntities) {
		if (allEntities.size() < MAX_RECORDS_TO_RETURN_TOTAL) {
			return true;
		}
		return false;

	}

	private boolean moreRecordsExist(ListWrapper<?> onePull) {
		int total = onePull.getTotal();
		int start = onePull.getStart();
		int count = onePull.getCount();

		if ((start + count >= total) || count == 0) {
			return false;
		}

		return true;
	}

	/**
	 * Makes the "search" api call
	 * 
	 * HTTP Method: GET
	 * 
	 * @param type
	 *            the BullhornEntity type
	 * @param query
	 *            Lucene query string
	 * @param fieldSet
	 *            the fields to return, if null or emtpy will default to "*" all
	 * @param params
	 *            optional SearchParams .
	 * @return a LinsWrapper containing the records plus some additional information
	 */
	private <L extends ListWrapper<T>, T extends SearchEntity> L handleSearchForEntities(Class<T> type, String query, Set<String> fieldSet,
			SearchParams params) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForSearch(BullhornEntityInfo.getTypesRestEntityName(type),
				query, fieldSet, params);

		String url = restUrlFactory.assembleSearchUrl(params);
		// temporary fix
		if (Candidate.class == type) {
			url = url + "&useV2=true";
		}
		// String jsonString = this.performGetRequest(url, String.class, uriVariables);

		return (L) this.performGetRequest(url, BullhornEntityInfo.getTypesListWrapperType(type), uriVariables);

	}

	/**
	 * Makes the "fast find" api call
	 *
	 * HTTP Method: GET
	 *
	 * @param query
	 * 				fast find query string
	 * @param params
	 * 				optional FastFindParams .
	 * @return a ListWrapper containing the records plus some additional information
	 */
	private FastFindListWrapper handleFastFindForEntities(String query, FastFindParams params) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForFastFind(query, params);

		String url = restUrlFactory.assembleFastFindUrl(params);

		String jsonString = this.performGetRequest(url, String.class, uriVariables);

		return restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonString, FastFindListWrapper.class);
	}

	/**
	 * Makes the "entity" api call for updating entities
	 * 
	 * HTTP Method: POST
	 * 
	 * @param entity
	 * @return a UpdateResponse
	 */
	private <C extends CrudResponse, T extends UpdateEntity> C handleUpdateEntity(T entity) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForEntityUpdate(
				BullhornEntityInfo.getTypesRestEntityName(entity.getClass()), entity.getId());
		String url = restUrlFactory.assembleEntityUrlForUpdate();

		CrudResponse response = null;
		Errors validationErrors = restEntityValidator.validateEntityOnUpdate(entity);

		if (validationErrors.hasErrors()) {
			response = new UpdateResponse();
			restErrorHandler.handleValidationErrors(response, validationErrors);

		} else {

			try {
				String jsonString = restJsonConverter.convertEntityToJsonString(entity);
				response = this.performPostRequest(url, jsonString, UpdateResponse.class, uriVariables);
			} catch (HttpStatusCodeException error) {
				response = restErrorHandler.handleHttpFourAndFiveHundredErrors(new UpdateResponse(), error, entity.getId());
			}

		}
		return (C) response;
	}

	/**
	 * Spins off threads that will call handleUpdateEntity for each entity.
	 * 
	 * @param entityList
	 * @return
	 */
	private <C extends CrudResponse, T extends UpdateEntity> List<C> handleMultipleUpdates(List<T> entityList) {

		if (entityList == null || entityList.isEmpty()) {
			return Collections.emptyList();
		}

		List<EntityUpdateWorker<C>> taskList = new ArrayList<EntityUpdateWorker<C>>();
		for (T entity : entityList) {
			taskList.add(new EntityUpdateWorker<C>(this, entity));
		}

		return concurrencyService.spinThreadsAndWaitForResult(taskList);

	}

	/**
	 * Makes the "entity" api call for inserting entities
	 * 
	 * HTTP Method: PUT
	 * 
	 * @param entity
	 *            CreateEntity
	 * @return a UpdateResponse
	 */
	private <C extends CrudResponse, T extends CreateEntity> C handleInsertEntity(T entity) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForEntityInsert(BullhornEntityInfo
				.getTypesRestEntityName(entity.getClass()));
		String url = restUrlFactory.assembleEntityUrlForInsert();

		CrudResponse response = null;
		Errors validationErrors = restEntityValidator.validateEntityOnInsert(entity);

		if (validationErrors.hasErrors()) {
			response = new CreateResponse();
			restErrorHandler.handleValidationErrors(response, validationErrors);

		} else {

			try {
				String jsonString = restJsonConverter.convertEntityToJsonString(entity);
				response = this.performCustomRequest(url, jsonString, CreateResponse.class, uriVariables, HttpMethod.PUT, null);
			} catch (HttpStatusCodeException error) {
				response = restErrorHandler.handleHttpFourAndFiveHundredErrors(new CreateResponse(), error, entity.getId());
			}

		}
		return (C) response;
	}

	/**
	 * Makes the delete api call. The type of delete (soft or hard) depends on the DeleteEntity type of the Class<T> type passed in.
	 * 
	 * @param type
	 * @param id
	 * @return
	 */
	private <C extends CrudResponse, T extends DeleteEntity> C handleDeleteEntity(Class<T> type, Integer id) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForEntityDelete(
				BullhornEntityInfo.getTypesRestEntityName(type), id);
		String url = restUrlFactory.assembleEntityDeleteUrl();

		CrudResponse response = null;

		try {

			if (isSoftDeleteEntity(type)) {
				String jsonString = "{\"isDeleted\" : true}";

				response = this.performPostRequest(url, jsonString, DeleteResponse.class, uriVariables);
			}

			if (isHardDeleteEntity(type)) {
				response = this.performCustomRequest(url, null, DeleteResponse.class, uriVariables, HttpMethod.DELETE, null);
			}
		} catch (HttpStatusCodeException error) {
			response = restErrorHandler.handleHttpFourAndFiveHundredErrors(new DeleteResponse(), error, id);
		}

		return (C) response;
	}

	private <T extends DeleteEntity> boolean isSoftDeleteEntity(Class<T> type) {
		if (SoftDeleteEntity.class.isAssignableFrom(type)) {
			return true;
		}
		return false;
	}

	private <T extends DeleteEntity> boolean isHardDeleteEntity(Class<T> type) {
		if (HardDeleteEntity.class.isAssignableFrom(type)) {
			return true;
		}
		return false;
	}

	/**
	 * Makes the "meta" api call
	 * 
	 * HttpMethod: GET
	 * 
	 * @param type
	 *            the BullhornEntity type
	 * @param metaParameter
	 *            additional meta parameters
	 * @param fieldSet
	 *            fields to return meta information about. Pass in null for all fields.
	 * @return the MetaData
	 */
	private <T extends BullhornEntity> MetaData<T> handleGetMetaData(Class<T> type, MetaParameter metaParameter, Set<String> fieldSet) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForMeta(BullhornEntityInfo.getTypesRestEntityName(type),
				metaParameter, fieldSet);
		String url = restUrlFactory.assembleEntityUrlForMeta();

		MetaData<T> response = this.performGetRequest(url, StandardMetaData.class, uriVariables);

		return response;

	}

	/**
	 * Makes the "settings" api call
	 * 
	 * HttpMethod: GET
	 * 
	 * @param settingSet
	 *            settings to return information about. Pass in null for all fields.
	 * @return the settings
	 */
	@SuppressWarnings("unchecked")
    private Map<String,Object> handleGetSettingsData(Set<String> settingSet) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForSettings(settingSet);
		String url = restUrlFactory.assembleUrlForSettings();

		Map<String,Object> response = this.performGetRequest(url, Map.class, uriVariables);

		return response;

	}

	/**
	 * Handles the parsing of a resume text. Contains retry logic.
	 * 
	 * @param resume
	 * @param params
	 * @return
	 */
	private <P extends ParsedResume> P handleParseResumeText(String resume, ResumeTextParseParams params) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForResumeTextParse(params);
		String url = restUrlFactory.assembleParseResumeTextUrl(params);

		JSONObject resumeInfoToPost = new JSONObject();
		try {
			resumeInfoToPost.put("resume", resume);
		} catch (JSONException e) {
			log.error("Error creating JsonObject with resume text.", e);
		}

		String jsonEncodedResume = resumeInfoToPost.toString();

		ParsedResume response = this.parseResume(url, jsonEncodedResume, uriVariables);

		return (P) response;
	}

	private <P extends ParsedResume> P handleParseResumeFile(MultipartFile resume, ResumeFileParseParams params) {

		if (!restFileManager.validFile(resume)) {
			return restFileManager.handleNotValidFileFormat(resume);
		}

		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForResumeFileParse(params, resume);
		String url = restUrlFactory.assembleParseResumeFileUrl(params);

		MultiValueMap<String, Object> multiValueMap = null;
		try {
			multiValueMap = restFileManager.addResumeToMultiValueMap(resume);
		} catch (IOException e) {
			log.error("Error creating temp file", e);
		}
		ParsedResume response = this.parseResume(url, multiValueMap, uriVariables);

		restFileManager.deleteTempResume(multiValueMap);

		return (P) response;
	}

	/**
	 * Makes the call to the resume parser. If parse fails this method will retry RESUME_PARSE_RETRY number of times.
	 * 
	 * @param url
	 * @param requestPayLoad
	 * @param uriVariables
	 * @return
	 */
	private ParsedResume parseResume(String url, Object requestPayLoad, Map<String, String> uriVariables) {
		ParsedResume response = null;
		for (int tryNumber = 1; tryNumber <= RESUME_PARSE_RETRY; tryNumber++) {
			try {
				response = this.performPostResumeRequest(url, requestPayLoad, uriVariables);
				break;
			} catch (HttpStatusCodeException error) {
				response = handleResumeParseError(tryNumber, error);
			} catch (Exception e) {
				log.error("error", e);
			}
		}

		return response;
	}

	private ParsedResume handleResumeParseError(int tryNumber, HttpStatusCodeException error) {
		ParsedResume response = null;
		if (tryNumber >= RESUME_PARSE_RETRY) {
			response = new StandardParsedResume();
			response.setErrorCode(error.getStatusCode().name());
			response.setErrorMessage("BH api responded with the following message: " + error.getResponseBodyAsString());
			log.error("Failed to parse resume after " + RESUME_PARSE_RETRY + " tries. Response body from bh rest apis = "
					+ error.getResponseBodyAsString());
		} else {
			log.info(error.getResponseBodyAsString() + " Try " + tryNumber + " out of " + RESUME_PARSE_RETRY
					+ ". Trying again. Response body from bh rest apis = " + error.getResponseBodyAsString());
		}

		return response;
	}

	/**
	 * 
	 * @param parsedResume
	 * @return
	 */
	private ParsedResume handleSaveParsedResumeDataToBullhorn(ParsedResume parsedResume) {
		if (parsedResume == null) {
			return null;
		}

		Candidate candidate = parsedResume.getCandidate();

		if (candidate != null) {
			// first check for duplicates
			candidate = checkForDuplicates(candidate);
			parsedResume.setCandidate(candidate);

			// if the candidate now has an id then update that candidate otherwise insert a new candidate
			if (candidateHasId(candidate)) {
				CrudResponse response = this.updateEntity(candidate);
			} else {
				// set all required fields if id is null
				Candidate.setRequiredFieldsForInsert(candidate);
				CrudResponse response = this.insertEntity(candidate);
				candidate.setId(response.getChangedEntityId());
			}

			List<CandidateEducation> candidateEducationList = parsedResume.getCandidateEducation();

			if (candidateEducationList != null) {

				for (CandidateEducation candidateEducation : candidateEducationList) {
					candidateEducation.setCandidate(candidate);
					CrudResponse response = this.insertEntity(candidateEducation);
					candidateEducation.setId(response.getChangedEntityId());
				}
			}

			List<CandidateWorkHistory> candidateWorkHistoryList = parsedResume.getCandidateWorkHistory();

			if (candidateWorkHistoryList != null) {

				for (CandidateWorkHistory candidateWorkHistory : candidateWorkHistoryList) {
					candidateWorkHistory.setCandidate(candidate);
					CrudResponse response = this.insertEntity(candidateWorkHistory);
					candidateWorkHistory.setId(response.getChangedEntityId());
				}
			}
		}

		return parsedResume;
	}

	/**
	 * Runs a search query on firstName, lastName and email to find possible candidate duplicate. If a duplicate exists that candidate is
	 * returned.
	 * 
	 * If the passed in candidate already has an id the duplicate check is never run and the passed in candidate is returned without any
	 * changes made to it.
	 * 
	 * @param candidate
	 * @return
	 */
	private Candidate checkForDuplicates(Candidate candidate) {
		if (candidate == null || candidate.getId() != null) {
			return candidate;
		}

		String email = candidate.getEmail();
		String firstName = candidate.getFirstName();
		String lastName = candidate.getLastName();

		if (!StringUtils.isEmpty(firstName) && !StringUtils.isEmpty(lastName) && !StringUtils.isEmpty(email)) {

			StringBuilder query = new StringBuilder();

			query.append("isDeleted:0");

			query.append(" AND firstName:" + firstName);
			query.append(" AND lastName:" + lastName);
			query.append(" AND email:" + email);
			query.append(" NOT status:Archive");
			SearchParams params = ParamFactory.searchParams();
			params.setCount(1);

			List<Candidate> candidateSearch = this.searchForList(Candidate.class, query.toString(), null, params);

			if (candidateSearch != null && candidateSearch.size() > 0) {
				return candidateSearch.get(0);
			}
		}

		return candidate;
	}

	private boolean candidateHasId(Candidate candidate) {
		if (candidate != null && candidate.getId() != null) {
			return true;
		}
		return false;
	}

	/**
	 * This method will get all the meta data and then handle the fetching of FileContent in a multi-threaded fashion.
	 * 
	 * @param type
	 * @param entityId
	 * @return
	 */
	private List<FileWrapper> handleGetAllFileContentWithMetaData(Class<? extends FileEntity> type, Integer entityId) {
		List<FileMeta> metaDataList = this.handleGetEntityMetaFiles(type, entityId);
		// Create an ExecutorService with the number of processors available to the Java virtual machine.
		ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		// First get all the FileContent
		List<Future<FileContent>> futureList = new ArrayList<Future<FileContent>>();

		for (FileMeta metaData : metaDataList) {
			FileWorker fileWorker = new FileWorker(entityId, metaData.getId(), type, this);
			Future<FileContent> fileContent = executor.submit(fileWorker);
			futureList.add(fileContent);
		}

		Map<Integer, FileContent> fileContentMap = new HashMap<Integer, FileContent>();
		for (Future<FileContent> future : futureList) {
			try {
				fileContentMap.put(future.get().getId(), future.get());
			} catch (InterruptedException e) {
				log.error("Error in bullhornapirest.getAllFileContentWithMetaData", e);
			} catch (ExecutionException e) {
				log.error("Error in bullhornapirest.getAllFileContentWithMetaData", e);
			}
		}

		// shutdown pool, wait until it's done
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		// null it out
		executor = null;

		// Second create the FileWrapper list from the FileContent and FileMeta
		List<FileWrapper> fileWrapperList = new ArrayList<FileWrapper>();
		for (FileMeta metaData : metaDataList) {
			FileContent fileContent = fileContentMap.get(metaData.getId());
			FileWrapper fileWrapper = new StandardFileWrapper(fileContent, metaData);
			fileWrapperList.add(fileWrapper);
		}
		return fileWrapperList;
	}

	/**
	 * Makes the api call to get both the file content and filemeta data, and combines those two to a FileWrapper
	 * 
	 * @param type
	 * @param entityId
	 * @param fileId
	 * @return
	 */
	private FileWrapper handleGetFileContentWithMetaData(Class<? extends FileEntity> type, Integer entityId, Integer fileId) {
		FileWrapper fileWrapper = null;
		try {
			FileContent fileContent = this.handleGetFileContent(type, entityId, fileId);

			List<FileMeta> metaDataList = this.handleGetEntityMetaFiles(type, entityId);
			FileMeta correctMetaData = null;
			for (FileMeta metaData : metaDataList) {
				if (fileId.equals(metaData.getId())) {
					correctMetaData = metaData;
					break;
				}
			}

			fileWrapper = new StandardFileWrapper(fileContent, correctMetaData);
		} catch (Exception e) {
			log.error("Error getting file with id: " + fileId + " for " + type.getSimpleName() + " with id:" + entityId);
		}

		return fileWrapper;
	}

	/**
	 * Makes the api call to get the FileMeta data for an entity
	 * 
	 * @param type
	 * @param entityId
	 * @return
	 */
	private List<FileMeta> handleGetEntityMetaFiles(Class<? extends FileEntity> type, Integer entityId) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForGetEntityMetaFiles(
				BullhornEntityInfo.getTypesRestEntityName(type), entityId);
		String url = restUrlFactory.assembleGetEntityMetaFilesUrl();
		String jsonString = this.performGetRequest(url, String.class, uriVariables);
		EntityMetaFiles<? extends FileMeta> entityMetaFiles = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonString,
				StandardEntityMetaFiles.class);
		if (entityMetaFiles == null || entityMetaFiles.getFileMetas() == null) {
			return Collections.emptyList();
		}
		return (List<FileMeta>) entityMetaFiles.getFileMetas();
	}

	/**
	 * Makes the api call to get the file content
	 * 
	 * @param type
	 * @param entityId
	 * @param fileId
	 * @return
	 */
	private FileContent handleGetFileContent(Class<? extends FileEntity> type, Integer entityId, Integer fileId) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForGetFile(BullhornEntityInfo.getTypesRestEntityName(type),
				entityId, fileId);
		String url = restUrlFactory.assembleGetFileUrl();
		String jsonString = this.performGetRequest(url, String.class, uriVariables);
		FileContent fileContent = restJsonConverter.jsonToEntityUnwrapRoot(jsonString, StandardFileContent.class);
		fileContent.setId(fileId);
		return fileContent;
	}

	/**
	 * Makes the api call to add files to an entity. Takes a MultipartFile.
	 * 
	 * @param type
	 * @param entityId
	 * @param multipartFile
	 * @param externalId
	 * @param params
	 * @return
	 */
	private FileWrapper handleAddFileWithMultipartFile(Class<? extends FileEntity> type, Integer entityId, MultipartFile multipartFile,
			String externalId, FileParams params) {

		MultiValueMap<String, Object> multiValueMap = null;
		try {
			multiValueMap = restFileManager.addFileToMultiValueMap(multipartFile);
		} catch (IOException e) {
			log.error("Error creating temp file", e);
		}

		return this.handleAddFile(type, entityId, multiValueMap, externalId, params, multipartFile.getOriginalFilename());

	}

	/**
	 * Makes the api call to add files to an entity. Takes a File.
	 * 
	 * @param type
	 * @param entityId
	 * @param file
	 * @param externalId
	 * @param params
	 * @return
	 */
	private FileWrapper handleAddFileWithFile(Class<? extends FileEntity> type, Integer entityId, File file, String externalId,
			FileParams params) {






		MultiValueMap<String, Object> multiValueMap = restFileManager.addFileToMultiValueMap(file);

		return this.handleAddFile(type, entityId, multiValueMap, externalId, params, file.getName());
	}

	private FileWrapper handleAddFile(Class<? extends FileEntity> type, Integer entityId, MultiValueMap<String, Object> multiValueMap,
			String externalId, FileParams params, String fileName) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForAddFile(BullhornEntityInfo.getTypesRestEntityName(type),
				entityId, externalId, params);
		String url = restUrlFactory.assembleAddFileUrl(params);
		StandardFileApiResponse fileApiResponse = this.performCustomRequest(url, multiValueMap, StandardFileApiResponse.class,
				uriVariables, HttpMethod.PUT, this.getMultipartHeadersForFileAttachement(fileName));

		restFileManager.deleteTempFile(multiValueMap);

		Integer fileId = fileApiResponse.getFileId();

		return this.handleGetFileContentWithMetaData(type, entityId, fileId);

	}

	/**
	 * Handles logic to add the file to the candidate entity AND updating the candidate.description with the resume text.
	 * 
	 * @param candidateId
	 * @param file
	 * @param externalId
	 * @param params
	 * @return
	 */
	private FileWrapper handleAddFileAndUpdateCandidateDescription(Integer candidateId, File file, String candidateDescription,
			String externalId, FileParams params) {
		// first add the file
		FileWrapper fileWrapper = this.handleAddFileWithFile(Candidate.class, candidateId, file, externalId, params);

		// second update the candidate
		try {

			Candidate candidateToUpdate = new Candidate();
			candidateToUpdate.setId(candidateId);

			if (!StringUtils.isBlank(candidateDescription)) {
				candidateToUpdate.setDescription(candidateDescription);
				this.updateEntity(candidateToUpdate);
			}
		} catch (Exception e) {
			log.error("Error reading file to resume text", e);
		}

		return fileWrapper;
	}

	/**
	 * Makes the api call to both parse the resume and then attach the file. File is only attached if the resume parse was successful.
	 * 
	 * @param type
	 * @param entityId
	 * @param multipartFile
	 * @param externalId
	 * @param fileParams
	 * @param params
	 * @return
	 */
	private <P extends ParsedResume> P addFileThenHandleParseResume(Class<? extends FileEntity> type, Integer entityId,
			MultipartFile multipartFile, String externalId, FileParams fileParams, ResumeFileParseParams params) {
		FileWrapper fileWrapper = handleAddFileWithMultipartFile(type, entityId, multipartFile, externalId, fileParams);
		P parsedResume = this.handleParseResumeFile(multipartFile, params);
		if (!parsedResume.isError()) {
			parsedResume.setFileWrapper(fileWrapper);
		}

		return parsedResume;

	}

	/**
	 * Makes the api call to delete a file attached to an entity.
	 * 
	 * @param type
	 * @param entityId
	 * @param fileId
	 * @return
	 */
	private FileApiResponse handleDeleteFile(Class<? extends FileEntity> type, Integer entityId, Integer fileId) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesDeleteFile(BullhornEntityInfo.getTypesRestEntityName(type),
				entityId, fileId);
		String url = restUrlFactory.assembleDeleteFileUrl();
		StandardFileApiResponse fileApiResponse = this.performCustomRequest(url, null, StandardFileApiResponse.class, uriVariables,
				HttpMethod.DELETE, null);

		return fileApiResponse;
	}

	/**
	 * Makes the api call to create associations.
	 * 
	 * @param type
	 * @param entityId
	 * @param associationName
	 * @param associationIds
	 * @return
	 */
	private <C extends CrudResponse, T extends AssociationEntity> C handleAssociateWithEntity(Class<T> type, Integer entityId,
			AssociationField<T, ? extends BullhornEntity> associationName, Set<Integer> associationIds) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForAssociateWithEntity(
				BullhornEntityInfo.getTypesRestEntityName(type), entityId, associationName, associationIds);
		String url = restUrlFactory.assembleEntityUrlForAssociateWithEntity();

		CrudResponse response = null;
		try {
			response = this.performCustomRequest(url, null, CreateResponse.class, uriVariables, HttpMethod.PUT, null);
		} catch (HttpStatusCodeException error) {
			response = restErrorHandler.handleHttpFourAndFiveHundredErrors(new CreateResponse(), error, entityId);
		}

		return (C) response;
	}

	/**
	 * Make the api call to delete associations
	 * 
	 * @param type
	 * @param entityId
	 * @param associationName
	 * @param associationIds
	 * @return
	 */
	private <C extends CrudResponse, T extends AssociationEntity> C handleDisassociateWithEntity(Class<T> type, Integer entityId,
			AssociationField<T, ? extends BullhornEntity> associationName, Set<Integer> associationIds) {
		Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForAssociateWithEntity(
				BullhornEntityInfo.getTypesRestEntityName(type), entityId, associationName, associationIds);
		String url = restUrlFactory.assembleEntityUrlForAssociateWithEntity();

		CrudResponse response = null;
		try {
			response = this.performCustomRequest(url, null, DeleteResponse.class, uriVariables, HttpMethod.DELETE, null);
		} catch (HttpStatusCodeException error) {
			response = restErrorHandler.handleHttpFourAndFiveHundredErrors(new DeleteResponse(), error, entityId);
		}

		return (C) response;
	}

    private Integer handleGetLastRequestId(String subscriptionId) {
        Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForGetLastRequestId(subscriptionId);
        String url = restUrlFactory.assembleGetLastRequstIdUrl();

        Integer lastRequestId = -1;

        GetLastRequestIdResponse response = this.performGetRequest(url, StandardGetLastRequestIdResponse.class, uriVariables);

        if(response != null && response.getResult() != null) {
            lastRequestId = response.getResult();
        }

        return lastRequestId;
    }

    private GetEventsResponse handleGetEvents(String subscriptionId, Integer maxEvents) {
        Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForGetEvents(subscriptionId, maxEvents);
        String url = restUrlFactory.assembleGetEventsUrl();

        return this.performGetRequest(url, StandardGetEventsResponse.class, uriVariables);
    }

    private GetEventsResponse handleRegetEvents(String subscriptionId, Integer requestId) {
        Map<String, String> uriVariables = restUriVariablesFactory.getUriVariablesForRegetEvents(subscriptionId, requestId);
        String url = restUrlFactory.assembleRegetEventsUrl();

        return this.performGetRequest(url, StandardGetEventsResponse.class, uriVariables);
    }

	/*
	 * *************************************************************************
	 * 
	 * Methods making the actual REST calls.
	 * 
	 * *************************************************************************
	 */

	public <T> T performGetRequest(String url, Class<T> returnType, Map<String, String> uriVariables) {

		for (int tryNumber = 1; tryNumber <= API_RETRY; tryNumber++) {
			try {
				return restTemplate.getForObject(url, returnType, uriVariables);
			} catch (HttpStatusCodeException error) {
				handleHttpStatusCodeError(uriVariables, tryNumber, error);
			} catch (Exception e) {
				handleApiError(uriVariables, tryNumber, e);
			}
		}

		throw new RestApiException("Error getting " + returnType.getSimpleName() + " url variables " + uriVariables.toString());

	}

	/**
	 * Performs a POST request to the specified url. Retries the POST API_RETRY times.
	 * 
	 * @param url
	 * @param requestPayLoad
	 * @param returnType
	 * @param uriVariables
	 * @return
	 */
	private <T> T performPostRequest(String url, Object requestPayLoad, Class<T> returnType, Map<String, String> uriVariables) {
		for (int tryNumber = 1; tryNumber <= API_RETRY; tryNumber++) {
			try {
				return restTemplate.postForObject(url, requestPayLoad, returnType, uriVariables);
			} catch (HttpStatusCodeException error) {
				handleHttpStatusCodeError(uriVariables, tryNumber, error);
			} catch (Exception e) {
				handleApiError(uriVariables, tryNumber, e);
			}
		}

		throw new RestApiException("Error posting " + returnType.getSimpleName() + " url variables " + uriVariables.toString());
	}

	/**
	 * Performs a request to the passed in url of the passed in HttpMethod type (POST, GET, PUT etc).
	 * 
	 * @param url
	 * @param requestPayLoad
	 * @param returnType
	 * @param uriVariables
	 * @param httpMethod
	 * @param headers
	 *            the headers for the request
	 * @return
	 */
	private <T> T performCustomRequest(String url, Object requestPayLoad, Class<T> returnType, Map<String, String> uriVariables,
			HttpMethod httpMethod, HttpHeaders headers) {

		if (headers == null) {
			headers = new HttpHeaders();
		}

		HttpEntity<Object> requestEntity = new HttpEntity<Object>(requestPayLoad, headers);

		for (int tryNumber = 1; tryNumber <= API_RETRY; tryNumber++) {
			try {
				ResponseEntity<T> responseEntity = restTemplate.exchange(url, httpMethod, requestEntity, returnType, uriVariables);
				return responseEntity.getBody();
			} catch (HttpStatusCodeException error) {
				handleHttpStatusCodeError(uriVariables, tryNumber, error);
			} catch (Exception e) {
				handleApiError(uriVariables, tryNumber, e);
			}
		}

		throw new RestApiException("Error posting " + returnType.getSimpleName() + " url variables " + uriVariables.toString());
	}

	/**
	 * @param uriVariables
	 * @param tryNumber
	 * @param error
	 * 
	 * @throws RestApiException
	 *             if tryNumber >= API_RETRY.
	 */
	private void handleHttpStatusCodeError(Map<String, String> uriVariables, int tryNumber, HttpStatusCodeException error) {
		resetBhRestToken(uriVariables);
		log.error(
				"HttpStatusCodeError making api call. Try number:" + tryNumber + " out of " + API_RETRY + ". Http status code: "
						+ error.getStatusCode() + ". Response body: " + error.getResponseBodyAsString(), error);
		if (tryNumber >= API_RETRY) {
			throw new RestApiException("HttpStatusCodeError making api call with url variables " + uriVariables.toString()
					+ ". Http status code: " + error.getStatusCode().toString() + ". Response body: " + error == null ? ""
					: error.getResponseBodyAsString());
		}
	}

	private void handleApiError(Map<String, String> uriVariables, int tryNumber, Exception e) {
		resetBhRestToken(uriVariables);
		log.error("Error making api call. Try number:" + tryNumber + " out of " + API_RETRY, e);
	}

	private void resetBhRestToken(Map<String, String> uriVariables) {
		String bhRestToken = this.refreshBhRestToken();
		uriVariables.put("bhRestToken", bhRestToken);
	}

	private ParsedResume performPostResumeRequest(String url, Object requestPayLoad, Map<String, String> uriVariables) {
		if (requestPayLoad instanceof String) {
			return postResume(url, requestPayLoad, StandardParsedResume.class, uriVariables, null);
		} else {
			return postResume(url, requestPayLoad, StandardParsedResume.class, uriVariables, getMultipartHeadersForResumeParse());
		}
	}

	private <T> T postResume(String url, Object requestPayLoad, Class<T> returnType, Map<String, String> uriVariables, HttpHeaders headers) {

		if (headers == null) {
			headers = new HttpHeaders();
		}

		HttpEntity<Object> requestEntity = new HttpEntity<Object>(requestPayLoad, headers);

		ResponseEntity<T> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, returnType, uriVariables);
		return responseEntity.getBody();

	}

	private HttpHeaders getMultipartHeadersForFileAttachement(String fileName) {
		HttpHeaders headers = getMultipartHeadersForResumeParse();
		headers.setContentDispositionFormData(this.restFileManager.getFormFileName(), fileName);
		return headers;
	}

	private HttpHeaders getMultipartHeadersForResumeParse() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);
		return headers;
	}

}
