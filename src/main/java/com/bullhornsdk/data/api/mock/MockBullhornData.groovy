package com.bullhornsdk.data.api.mock;


import org.apache.log4j.Logger
import org.springframework.validation.Errors
import org.springframework.web.multipart.MultipartFile

import com.bullhornsdk.data.api.BullhornData
import com.bullhornsdk.data.api.helper.RestApiSession
import com.bullhornsdk.data.api.helper.RestErrorHandler
import com.bullhornsdk.data.exception.RestApiException
import com.bullhornsdk.data.model.entity.association.AssociationField
import com.bullhornsdk.data.model.entity.core.standard.Note
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity
import com.bullhornsdk.data.model.entity.core.type.CreateEntity
import com.bullhornsdk.data.model.entity.core.type.DeleteEntity
import com.bullhornsdk.data.model.entity.core.type.FileEntity
import com.bullhornsdk.data.model.entity.core.type.QueryEntity
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity
import com.bullhornsdk.data.model.entity.core.type.SearchEntity
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity
import com.bullhornsdk.data.model.entity.meta.MetaData
import com.bullhornsdk.data.model.enums.MetaParameter
import com.bullhornsdk.data.model.parameter.AssociationParams
import com.bullhornsdk.data.model.parameter.CorpNotesParams
import com.bullhornsdk.data.model.parameter.FileParams
import com.bullhornsdk.data.model.parameter.QueryParams
import com.bullhornsdk.data.model.parameter.ResumeFileParseParams
import com.bullhornsdk.data.model.parameter.ResumeTextParseParams
import com.bullhornsdk.data.model.parameter.SearchParams
import com.bullhornsdk.data.model.response.crud.CreateResponse
import com.bullhornsdk.data.model.response.crud.CrudResponse
import com.bullhornsdk.data.model.response.crud.UpdateResponse
import com.bullhornsdk.data.model.response.file.FileApiResponse
import com.bullhornsdk.data.model.response.file.FileContent
import com.bullhornsdk.data.model.response.file.FileMeta
import com.bullhornsdk.data.model.response.file.FileWrapper
import com.bullhornsdk.data.model.response.list.ListWrapper
import com.bullhornsdk.data.model.response.resume.ParsedResume
import com.bullhornsdk.data.validation.RestEntityValidator
import com.bullhornsdk.data.validation.StandardRestEntityValidator

/**
 * Testing implementation populated with local in memory test data.
 * 
 * @author Magnus Fiore Palm
 * 
 */

public class MockBullhornData implements BullhornData {

	private final MockDataHandler mockDataHandler;
	private final RestEntityValidator restEntityValidator;
	private final RestErrorHandler restErrorHandler;
	private final RestApiSession restSession;
	private final Logger log = Logger.getLogger(MockBullhornData.class);

	
	public MockBullhornData() {
		this.mockDataHandler = new MockDataHandler();
		this.restEntityValidator = StandardRestEntityValidator.getDefaultInstance();
		this.restErrorHandler = new RestErrorHandler();
	}
	
	public MockBullhornData(RestApiSession restSession) {
		this.mockDataHandler = new MockDataHandler();
		this.restEntityValidator = StandardRestEntityValidator.getDefaultInstance();
		this.restErrorHandler = new RestErrorHandler();
		this.restSession = restSession;
	}

	public void refreshTestData() {
		this.mockDataHandler.refreshTestData();
	}

	/**
	 * Caches the data in restEntityMap after the first time an entity is fetched.
	 */
	@Override
	public <T extends BullhornEntity> T findEntity(Class<T> type, Integer id) {
		return mockDataHandler.findEntity(type, id);
	}
	

	@Override
	public <T extends BullhornEntity> T findEntity(Class<T> type, Integer id, Set<String> fieldSet) {
		return mockDataHandler.findEntity(type, id, fieldSet);
	}

	@Override
	public <T extends QueryEntity> List<T> queryForList(Class<T> type, String where, Set<String> fieldSet, QueryParams params) {
		return mockDataHandler.queryForList(type, where, fieldSet, params);
	}

	/**
	 * Will return all values of type T. The search functionality has not been implemented in the {@link MockBullhornData}
	 * 
	 * @throws IllegalArgumentException
	 *             when a non-valid search field is used.
	 */
	@Override
	public <T extends SearchEntity> List<T> searchForList(Class<T> type, String query, Set<String> fieldSet, SearchParams params) {
		return mockDataHandler.searchForList(type, query, fieldSet, params);
	}

	@Override
	public <T extends QueryEntity,L extends ListWrapper<T>> L query(Class<T> type, String where, Set<String> fieldSet, QueryParams params) {
		return mockDataHandler.query(type, where, fieldSet, params);
	}

	/**
	 * Will return all values of type T. The search functionality has not been implemented in the {@link MockBullhornData}
	 * 
	 * @throws IllegalArgumentException
	 *             when a non-valid search field is used.
	 */
	@Override
	public <T extends SearchEntity,L extends ListWrapper<T>> L search(Class<T> type, String query, Set<String> fieldSet,
			SearchParams params) {
		return mockDataHandler.search(type, query, fieldSet, params);
	}
			
	@Override
	public <T extends QueryEntity,L extends ListWrapper<T>> L queryForAllRecords(Class<T> type, String where, Set<String> fieldSet,
			QueryParams params) {
			params.setCount(500);
		return query(type, where, fieldSet, params);
	}

	@Override
	public <T extends SearchEntity,L extends ListWrapper<T>> L searchForAllRecords(Class<T> type, String query, Set<String> fieldSet,
			SearchParams params) {
		params.setCount(500);
		return search(type, query, fieldSet, params);
	}

	@Override
	public <C extends CrudResponse, T extends UpdateEntity> C updateEntity(T entity) {

		CrudResponse response = null;
		Errors validationErrors = restEntityValidator.validateEntityOnUpdate(entity);

		if (validationErrors.hasErrors()) {
			response = new UpdateResponse();
			restErrorHandler.handleValidationErrors(response, validationErrors);
		} else {
			response = mockDataHandler.updateEntity(entity);
		}

		return (C) response;
	}
	
	@Override
	public <C extends CrudResponse, T extends UpdateEntity> List<C> updateMultipleEntities(List<T> entityList) {
		List<C> responseList = new ArrayList<C>();
		entityList.each {
			try{
				responseList.add(updateEntity(it));
			}catch(RestApiException e){
				log.error("Error updating entity.",e);
			}
		}
		return responseList;
	}

	@Override
	public <C extends CrudResponse, T extends CreateEntity> C insertEntity(T entity) {

		CrudResponse response = null;
		Errors validationErrors = restEntityValidator.validateEntityOnInsert(entity);

		if (validationErrors.hasErrors()) {
			response = new CreateResponse();
			restErrorHandler.handleValidationErrors(response, validationErrors);
		} else {
			response = mockDataHandler.insertEntity(entity);
		}
		return (C) response;
	}

	@Override
	public <C extends CrudResponse, T extends DeleteEntity> C deleteEntity(Class<T> type, Integer id) {
		return mockDataHandler.deleteEntity(type, id);
	}

	@Override
	public <T extends BullhornEntity> MetaData<T> getMetaData(Class<T> type, MetaParameter metaParameter, Set<String> fieldSet) {
		return mockDataHandler.getMetaData(type, metaParameter, fieldSet);
	}

	@Override
	public String getBhRestToken() {
		return "mock-bh-rest-token";
	}
	
	@Override
	public String refreshBhRestToken() {
		return "mock-bh-rest-token";
	}

	@Override
	public String getRestUrl() {
		return "mock-rest-url";
	}

	@Override
	public ParsedResume parseResumeFile(MultipartFile resume, ResumeFileParseParams params) {
		return mockDataHandler.parseResumeFile(resume, params);
	}

	@Override
	public ParsedResume parseResumeText(String resume, ResumeTextParseParams params) {
		return mockDataHandler.parseResumeText(resume, params);
	}

	@Override
	public ParsedResume saveParsedResumeDataToBullhorn(ParsedResume parsedResume) {
		return mockDataHandler.saveParsedResumeDataToBullhorn(parsedResume);
	}

	@Override
	public ParsedResume parseResumeThenAddfile(Class<? extends FileEntity> type, Integer entityId, MultipartFile file, String externalId,
			FileParams fileParams, ResumeFileParseParams resumeFileParseParams) {
		return mockDataHandler.parseResumeThenAddfile(type, entityId, file, externalId, fileParams, resumeFileParseParams);

	}

	@Override
	public FileWrapper addFile(Class<? extends FileEntity> type, Integer entityId, File file, String externalId, FileParams params) {
		return mockDataHandler.addFile(type, entityId, file, externalId, params);
	}

	@Override
	public FileContent getFileContent(Class<? extends FileEntity> type, Integer entityId, Integer fileId) {
		return mockDataHandler.getFileContent(type, entityId, fileId);
	}

	@Override
	public List<FileMeta> getFileMetaData(Class<? extends FileEntity> type, Integer entityId) {
		return mockDataHandler.getFileMetaData(type, entityId);
	}

	@Override
	public FileWrapper getFile(Class<? extends FileEntity> type, Integer entityId, Integer fileId) {
		return mockDataHandler.getFile(type, entityId, fileId);
	}

	@Override
	public List<FileWrapper> getAllFiles(Class<? extends FileEntity> type, Integer entityId) {
		return mockDataHandler.getAllFiles(type, entityId);
	}

	@Override
	public FileWrapper addFile(Class<? extends FileEntity> type, Integer entityId, MultipartFile file, String externalId, FileParams params) {
		return mockDataHandler.addFile(type, entityId, file, externalId, params);
	}

	@Override
	public FileWrapper addResumeFileAndPopulateCandidateDescription(Integer candidateId, File file, String candidateDescription,
			String externalId, FileParams params) {
		return mockDataHandler.addResumeFileAndPopulateCandidateDescription(candidateId, file, candidateDescription, externalId, params);
	}

	@Override
	public FileApiResponse deleteFile(Class<? extends FileEntity> type, Integer entityId, Integer fileId) {
		return mockDataHandler.deleteFile(type, entityId, fileId);
	}

	@Override
	public <C extends CrudResponse, T extends AssociationEntity> C associateWithEntity(Class<T> type, Integer entityId,
			AssociationField<T, ? extends BullhornEntity> associationName, Set<Integer> associationIds) {
		return mockDataHandler.associateWithEntity(type, entityId, associationName, associationIds);
	}

	@Override
	public <C extends CrudResponse, T extends AssociationEntity> C disassociateWithEntity(Class<T> type, Integer entityId,
			AssociationField<T, ? extends BullhornEntity> associationName, Set<Integer> associationIds) {
		return mockDataHandler.disassociateWithEntity(type, entityId, associationName, associationIds);
	}

	@Override
	public <T extends AssociationEntity, E extends BullhornEntity> List<E> getAssociation(Class<T> type, Set<Integer> entityIds,
			AssociationField<T, E> associationName, Set<String> fieldSet, AssociationParams params) {
		return mockDataHandler.getAssociation(type, entityIds, associationName, fieldSet, params);
	}

	@Override
	public List<Note> getAllCorpNotes(Integer clientCorporationID, Set<String> fieldSet, CorpNotesParams params) {
		return mockDataHandler.getAllCorpNotes(clientCorporationID, fieldSet, params);
	}

	@Override
	public <C extends CrudResponse> C addNoteAndAssociateWithEntity(Note note) {
		return mockDataHandler.addNoteAndAssociateWithEntity(note);
	}
	
	@Override
	public RestApiSession getRestApiSession(){
		return this.restSession;
	}

}
