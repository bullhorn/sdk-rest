package com.bullhornsdk.data.api.mock

import com.bullhornsdk.data.api.BullhornData
import com.bullhornsdk.data.api.helper.EntityIdBoundaries
import com.bullhornsdk.data.api.helper.RestApiSession
import com.bullhornsdk.data.api.helper.RestErrorHandler
import com.bullhornsdk.data.exception.RestApiException
import com.bullhornsdk.data.model.entity.association.AssociationField
import com.bullhornsdk.data.model.entity.core.standard.*
import com.bullhornsdk.data.model.entity.core.type.*
import com.bullhornsdk.data.model.entity.meta.MetaData
import com.bullhornsdk.data.model.enums.EntityEventType
import com.bullhornsdk.data.model.enums.EventType
import com.bullhornsdk.data.model.enums.MetaParameter
import com.bullhornsdk.data.model.file.FileMeta
import com.bullhornsdk.data.model.parameter.*
import com.bullhornsdk.data.model.parameter.standard.StandardQueryParams
import com.bullhornsdk.data.model.parameter.standard.StandardSearchParams
import com.bullhornsdk.data.model.response.crud.CrudResponse
import com.bullhornsdk.data.model.response.edithistory.EditHistoryListWrapper
import com.bullhornsdk.data.model.response.edithistory.FieldChangeListWrapper
import com.bullhornsdk.data.model.response.event.GetEventsResponse
import com.bullhornsdk.data.model.response.file.FileApiResponse
import com.bullhornsdk.data.model.response.file.FileContent
import com.bullhornsdk.data.model.response.file.FileWrapper
import com.bullhornsdk.data.model.response.list.FastFindListWrapper
import com.bullhornsdk.data.model.response.list.IdListWrapper
import com.bullhornsdk.data.model.response.list.ListWrapper
import com.bullhornsdk.data.model.response.resume.ParsedResume
import com.bullhornsdk.data.model.response.subscribe.SubscribeToEventsResponse
import com.bullhornsdk.data.model.response.subscribe.standard.StandardSubscribeToEventsResponse
import org.apache.log4j.Logger
import org.joda.time.DateTime
import org.springframework.web.multipart.MultipartFile

import java.io.File
/**
 * Testing implementation populated with local in memory test data.
 *
 * @author Magnus Fiore Palm
 *
 */

public class MockBullhornData implements BullhornData {

    private final MockDataHandler mockDataHandler;
    private final RestErrorHandler restErrorHandler;
    private final RestApiSession restSession;
    private final Logger log = Logger.getLogger(MockBullhornData.class);
    protected Boolean executeFormTriggers = false;


    public MockBullhornData() {
        this.mockDataHandler = new MockDataHandler();
        this.restErrorHandler = new RestErrorHandler();
    }

    public MockBullhornData(RestApiSession restSession) {
        this.mockDataHandler = new MockDataHandler();
        this.restErrorHandler = new RestErrorHandler();
        this.restSession = restSession;
    }

    public void refreshTestData() {
        this.mockDataHandler.refreshTestData();
    }

    @Override
    public <T extends BullhornEntity> T findEntity(Class<T> type, Integer id, Set<String> fieldSet) {
        return mockDataHandler.findEntity(type, id, fieldSet);
    }

    @Override
    public <T extends BullhornEntity, L extends ListWrapper<T>> L findMultipleEntity(Class<T> type, Set<Integer> idList, Set<String> fieldSet) {
        return mockDataHandler.findMultipleEntities(type, idList, fieldSet);
    }

    @Override
    public <T extends QueryEntity> List<T> queryForList(Class<T> type, String where, Set<String> fieldSet, QueryParams params) {
        return mockDataHandler.queryForList(type, where, fieldSet, params);
    }

    /**
     * Will return all values of type T. The search functionality has not been implemented in the {@link MockBullhornData}
     *
     * @throws IllegalArgumentException when a non-valid search field is used.
     */
    @Override
    public <T extends SearchEntity> List<T> searchForList(Class<T> type, String query, Set<String> fieldSet, SearchParams params) {
        return mockDataHandler.searchForList(type, query, fieldSet, params);
    }

    /**
     * Will return all values of type T. The search functionality has not been implemented in the {@link MockBullhornData}
     *
     * @throws IllegalArgumentException when a non-valid search field is used.
     */
    @Override
    public <T extends SearchEntity> IdListWrapper searchForIdList(Class<T> type, String query, SearchParams params) {
        return mockDataHandler.searchForList(type, query, fieldSet, params);
    }

    @Override
    public List<FastFindResult> fastFindForList(String query, FastFindParams params) {
        return mockDataHandler.fastFindForList(query, params);
    }

    @Override
    public <T extends QueryEntity, L extends ListWrapper<T>> L query(Class<T> type, String where, Set<String> fieldSet, QueryParams params) {
        return mockDataHandler.query(type, where, fieldSet, params);
    }

    @Override
    public <T extends EditHistoryEntity> EditHistoryListWrapper queryEntityForEditHistory(Class<T> entityType, String where, Set<String> fieldSet, QueryParams params) {
        return mockDataHandler.queryEntityForEditHistory(entityType, where, fieldSet, params);
    }

    @Override
    public <T extends EditHistoryEntity> FieldChangeListWrapper queryEntityForEditHistoryFieldChanges(Class<T> entityType, String where, Set<String> fieldSet, QueryParams params) {
        return mockDataHandler.queryEntityForEditHistoryFieldChanges(entityType, where, fieldSet, params);
    }

    /**
     * Will return all values of type T. The search functionality has not been implemented in the {@link MockBullhornData}
     *
     * @throws IllegalArgumentException when a non-valid search field is used.
     */
    @Override
    public <T extends SearchEntity, L extends ListWrapper<T>> L search(Class<T> type, String query, Set<String> fieldSet,
                                                                       SearchParams params) {
        return mockDataHandler.search(type, query, fieldSet, params);
    }

    @Override
    public FastFindListWrapper fastFind(String query, FastFindParams params) {
        return mockDataHandler.fastFind(query, params);
    }

    @Override
    public <T extends QueryEntity & AllRecordsEntity, L extends ListWrapper<T>> L queryForAllRecords(Class<T> type, String where, Set<String> fieldSet, QueryParams params) {
        params.setCount(500);
        return query(type, where, fieldSet, params);
    }

    @Override
    public <C extends CrudResponse, T extends UpdateEntity> C updateEntity(T entity) {

        CrudResponse response = null;

        response = mockDataHandler.updateEntity(entity);

        return (C) response;
    }

    @Override
    public <C extends CrudResponse, T extends UpdateEntity> List<C> updateMultipleEntities(List<T> entityList) {
        List<C> responseList = new ArrayList<C>();
        entityList.each {
            try {
                responseList.add(updateEntity(it));
            } catch (RestApiException e) {
                log.error("Error updating entity.", e);
            }
        }
        return responseList;
    }

    @Override
    public <C extends CrudResponse, T extends CreateEntity> C insertEntity(T entity) {

        CrudResponse response = mockDataHandler.insertEntity(entity);

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
    public <T extends BullhornEntity> MetaData<T> getMetaData(Class<T> type, MetaParameter metaParameter, Set<String> fieldSet, Integer privateLabelId) {
        return mockDataHandler.getMetaData(type, metaParameter, fieldSet);
    }

    @Override
    def <T extends BullhornEntity> MetaData<T> getJobMetaData(MetaParameter metaParameter, Set<String> fieldSet, Integer track) {
        return mockDataHandler.getMetaData(JobOrder.class, metaParameter, fieldSet);
    }

    @Override
    def <T extends BullhornEntity> MetaData<T> getJobMetaData(MetaParameter metaParameter, Set<String> fieldSet, Integer track, Integer privateLabelId) {
        return mockDataHandler.getMetaData(JobOrder.class, metaParameter, fieldSet);
    }

    @Override
    def <T extends BullhornEntity> MetaData<T> getOpportunityMetaData(MetaParameter metaParameter, Set<String> fieldSet, Integer track) {
        return mockDataHandler.getMetaData(Opportunity.class, metaParameter, fieldSet);
    }

    @Override
    def <T extends BullhornEntity> MetaData<T> getOpportunityMetaData(MetaParameter metaParameter, Set<String> fieldSet, Integer track, Integer privateLabelId) {
        return mockDataHandler.getMetaData(Opportunity.class, metaParameter, fieldSet);
    }

    @Override
    public Map<String, Object> getSettings(java.util.Set settingSet) {
        return mockDataHandler.getSettingsData(settingSet);
    }

    @Override
    public Settings getSettingsObject(java.util.Set settingSet) {
        return mockDataHandler.getSettingsObjectData(settingSet);
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
    public FileWrapper addFile(Class<? extends FileEntity> type, Integer entityId, File file, String externalId, FileParams params, boolean deleteFile) {
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
    public FileWrapper addFile(Class<? extends FileEntity> type, Integer entityId, MultipartFile file, String externalId, FileParams params, boolean deleteFile) {
        return mockDataHandler.addFile(type, entityId, file, externalId, params);
    }

    @Override
    public FileWrapper addFile(Class<? extends FileEntity> type, Integer entityId, FileMeta fileMeta) {
        return mockDataHandler.addFile(type, entityId, fileMeta);
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
    public FileWrapper updateFile(Class<? extends FileEntity> type, Integer entityId, FileMeta fileMeta) {
        return mockDataHandler.updateFile(type, entityId, fileMeta);
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
    public <T extends AssociationEntity, E extends BullhornEntity> ListWrapper<E> getAllAssociations(Class<T> type, Set<Integer> entityIds,
                                                                                                     AssociationField<T, E> associationName, Set<String> fieldSet, AssociationParams params) {
        return mockDataHandler.getAllAssociations(type, entityIds, associationName, fieldSet, params);
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
    public Integer getLastRequestId(String subscriptionId) {
        return mockDataHandler.getLastRequestId(subscriptionId).getResult();
    }

    @Override
    public GetEventsResponse getEvents(String subscriptionId, Integer maxEvents) {
        return mockDataHandler.getEventsData(maxEvents);
    }

    @Override
    public GetEventsResponse regetEvents(String subscriptionId, Integer requestId) {
        return mockDataHandler.getEventsDataByRequest(requestId);
    }

    @Override
    public RestApiSession getRestApiSession() {
        return this.restSession;
    }

    @Override
    SubscribeToEventsResponse subscribeToEvents(String subscriptionId, EventType eventType, List<Class> entityClasses,
                                                List<EntityEventType> entityEventTypes) {
        StringBuilder jmsSelectorBuilder = new StringBuilder("JMSType='")
            .append(eventType.value()).append("' AND BhCorpId=1")
        if (eventType == EventType.ENTITY && !entityClasses?.isEmpty()) {
            jmsSelectorBuilder.append(" AND BhEntityName")
            if (entityClasses.size() == 1) {
                jmsSelectorBuilder.append("='").append(entityClasses.first().simpleName).append("'")
            } else {
                jmsSelectorBuilder.append(" IN (")
                    .append(entityClasses.collect { "'" + it.simpleName + "'" }.join(","))
                    .append(")")
            }
        }
        jmsSelectorBuilder.append(" AND BhEntityEventType IN (")
            .append(entityEventTypes.collect { "'" + it.name() + "'" }.join(","))
            .append(")")
        new StandardSubscribeToEventsResponse(
            subscriptionId: subscriptionId,
            lastRequestId: 0,
            createdOn: DateTime.now(),
            jmsSelector: jmsSelectorBuilder.toString()
        )
    }

    @Override
    boolean unsubscribeToEvents(String subscriptionId) {
        true
    }


    def <T extends QueryEntity> EntityIdBoundaries queryForIdBoundaries(Class<T> entityClass) {
        List<T> entities = mockDataHandler.queryForList(entityClass, "id>0", ["id"].toSet(), StandardQueryParams.instance)

        List<Integer> ids = entities.collect { it.id }

        new EntityIdBoundaries(ids.min(), ids.max(), entityClass)
    }

    @Override
    def <T extends SearchEntity> EntityIdBoundaries searchForIdBoundaries(Class<T> entityClass) {
        List<T> entities = mockDataHandler.searchForList(entityClass, "id>0", ["id"].toSet(), StandardSearchParams.instance)

        List<Integer> ids = entities.collect { it.id }

        new EntityIdBoundaries(ids.min(), ids.max(), entityClass)
    }

    @Override
    public Boolean getExecuteFormTriggers() {
        return executeFormTriggers;
    }

    @Override
    public void setExecuteFormTriggers(Boolean executeFormTriggers) {
        this.executeFormTriggers = executeFormTriggers;
    }

    @Override
    public List<PropertyOptionsResult> getOptions(Class<? extends BullhornEntity> type, OptionsParams params) {
        return mockDataHandler.getOptions(type, params);
    }

    @Override
    public List<PropertyOptionsResult> getOptions(Class<? extends BullhornEntity> type, Set<Integer> optionsIds, OptionsParams params){
        return mockDataHandler.getOptions(type, optionsIds, params);
    }
}
