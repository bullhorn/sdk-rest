package com.bullhornsdk.data.api;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.springframework.web.multipart.MultipartFile;

import com.bullhornsdk.data.api.helper.RestApiSession;
import com.bullhornsdk.data.exception.RestApiException;
import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.FileEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.meta.MetaData;
import com.bullhornsdk.data.model.enums.MetaParameter;
import com.bullhornsdk.data.model.parameter.AssociationParams;
import com.bullhornsdk.data.model.parameter.CorpNotesParams;
import com.bullhornsdk.data.model.parameter.FileParams;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.ResumeFileParseParams;
import com.bullhornsdk.data.model.parameter.ResumeTextParseParams;
import com.bullhornsdk.data.model.parameter.SearchParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import com.bullhornsdk.data.model.response.crud.CrudResponse;
import com.bullhornsdk.data.model.response.file.FileApiResponse;
import com.bullhornsdk.data.model.response.file.FileContent;
import com.bullhornsdk.data.model.response.file.FileMeta;
import com.bullhornsdk.data.model.response.file.FileWrapper;
import com.bullhornsdk.data.model.response.list.ListWrapper;
import com.bullhornsdk.data.model.response.resume.ParsedResume;

/**
 * Core bullhorn data service, handles api calls and data mapping.
 * 
 * @author magnus.palm
 * 
 */
public interface BullhornData {

	/**
	 * Returns all fields for passed in entity type with the passed in id
	 * 
	 * @param type
	 *            type of BullhornEntity
	 * @param id
	 *            id of BullhornEntity
	 * @return an entity of type T, or null if an error occurred
	 */

	public <T extends BullhornEntity> T findEntity(Class<T> type, Integer id);

	/**
	 * Returns the entity of passed in type with the passed in id, fields to get are specifed by the fieldSet.
	 * 
	 * @param type
	 *            type of BullhornEntity
	 * @param id
	 *            id of BullhornEntity
	 * @param fieldSet
	 *            fields to query for
	 * 
	 * @throws RestApiException
	 *             when the api call fails
	 * @return an entity of type T, or null if an error occurred
	 */
	public <T extends BullhornEntity> T findEntity(Class<T> type, Integer id, Set<String> fieldSet);

	/**
	 * Queries for QueryEntity of type T and returns a List<T>.
	 * 
	 * @param type
	 *            type of QueryEntity to query for
	 * @param where
	 *            SQL-style filter clause
	 * @param fieldSet
	 *            fields to query for
	 * 
	 * @param params
	 *            optional QueryParams parameters to use in the api request, pass in null for default.
	 * 
	 * @see QueryParams
	 * @see ParamFactory
	 * 
	 * @return a List<T>
	 */
	public <T extends QueryEntity> List<T> queryForList(Class<T> type, String where, Set<String> fieldSet, QueryParams params);

	/**
	 * Searches for SearchEntity of type T and returns a List<T>.
	 * 
	 * @param type
	 *            type of SearchEntity to query for
	 * @param query
	 *            Lucene query string
	 * @param fieldSet
	 *            fields to query for
	 * @param params
	 *            optional SearchParams parameters to use in the api request, pass in null for default.
	 * 
	 * @see SearchParams
	 * @see ParamFactory
	 * @see <a href="http://www.lucenetutorial.com/lucene-query-syntax.html">lucenetutorial</a>
	 * 
	 * @return a List<T>
	 */
	public <T extends SearchEntity> List<T> searchForList(Class<T> type, String query, Set<String> fieldSet, SearchParams params);

	/**
	 * Queries for QueryEntity of type T and returns a ListWrapper<T>.
	 * 
	 * @param type
	 *            type of QueryEntity to query for
	 * @param where
	 *            SQL-style filter clause
	 * @param fieldSet
	 *            fields to query for
	 * 
	 * @param params
	 *            optional QueryParams parameters to use in the api request, pass in null for default.
	 * 
	 * @see QueryParams
	 * @see ParamFactory
	 * 
	 * @return a ListWrapper<T> that wraps a List<T> plus some additional info about the data
	 */
	public <T extends QueryEntity, L extends ListWrapper<T>> L query(Class<T> type, String where, Set<String> fieldSet, QueryParams params);

	/**
	 * Searches for SearchEntity of type T and returns a ListWrapper<T>.
	 * 
	 * @param type
	 *            type of SearchEntity to query for
	 * @param query
	 *            Lucene query string
	 * @param fieldSet
	 *            fields to query for
	 * @param params
	 *            optional SearchParams parameters to use in the api request, pass in null for default.
	 * 
	 * @see SearchParams
	 * @see ParamFactory
	 * @see <a href="http://www.lucenetutorial.com/lucene-query-syntax.html">lucenetutorial</a>
	 * 
	 * @return a ListWrapper<T> that wraps a List<T> plus some additional info about the data
	 */
	public <T extends SearchEntity, L extends ListWrapper<T>> L search(Class<T> type, String query, Set<String> fieldSet,
			SearchParams params);

	/**
	 * Same as {@link BullhornData#query(Class, String, Set, QueryParams)} but with one important difference: This method will pull all
	 * records that qualifies using the query.
	 * <p>
	 * Since the bullhorn apis has a limit on how many records to pull in one go, this will be achieved through a recursive query that pulls
	 * 500 records each time. Setting this to true should be used sparingly and only when the number of records will be limited.
	 * </p>
	 * <p>
	 * PLEASE NOTE: Using this method will pull all records from the bullhorn api using the query. ONLY USE THIS IF YOU KNOW YOUR QUERY
	 * RETURNS A REASONABLE AMOUNT OF RECORDS.
	 * </p>
	 * 
	 * @param type
	 *            type of QueryEntity to query for
	 * @param where
	 *            SQL-style filter clause
	 * @param fieldSet
	 *            fields to query for
	 * 
	 * @param params
	 *            optional QueryParams parameters to use in the api request, pass in null for default.
	 * 
	 * @see QueryParams
	 * @see ParamFactory
	 * 
	 * @return a ListWrapper<T> that wraps a List<T> plus some additional info about the data
	 */
	public <T extends QueryEntity, L extends ListWrapper<T>> L queryForAllRecords(Class<T> type, String where, Set<String> fieldSet,
			QueryParams params);

	/**
	 * Same as {@link BullhornData#search(Class, String, Set, SearchParams)} but with one important difference: This method will pull all
	 * records that qualifies using the query.
	 * <p>
	 * Since the bullhorn apis has a limit on how many records to pull in one go, this will be achieved through a recursive query that pulls
	 * 500 records each time. Setting this to true should be used sparingly and only when the number of records will be limited.
	 * </p>
	 * <p>
	 * PLEASE NOTE: Using this method will pull all records from the bullhorn api using the query. ONLY USE THIS IF YOU KNOW YOUR QUERY
	 * RETURNS A REASONABLE AMOUNT OF RECORDS.
	 * </p>
	 * 
	 * @param type
	 *            type of SearchEntity to query for
	 * @param query
	 *            Lucene query string
	 * @param fieldSet
	 *            fields to query for
	 * @param params
	 *            optional SearchParams parameters to use in the api request, pass in null for default.
	 * 
	 * @see SearchParams
	 * @see ParamFactory
	 * @see <a href="http://www.lucenetutorial.com/lucene-query-syntax.html">lucenetutorial</a>
	 * 
	 * @return a ListWrapper<T> that wraps a List<T> plus some additional info about the data
	 */
	public <T extends SearchEntity, L extends ListWrapper<T>> L searchForAllRecords(Class<T> type, String query, Set<String> fieldSet,
			SearchParams params);

	/**
	 * Updates an UpdateEntity that is a sub type of BullhornEntity and returns a CrudResponse with info on the update, such as warnings, errors
	 * and validation errors.
	 * 
	 * Please note, the id of the passed in entity cannot be null.
	 * 
	 * @param the
	 *            entity to update, must have the id field set.
	 * 
	 * @return a CrudResponse
	 */

	public <C extends CrudResponse, T extends UpdateEntity> C updateEntity(T entity);

	/**
	 * Same as updateEntity, but handles a list of entities to update.
	 * 
	 * @param entityList
	 * @return
	 */
	public <C extends CrudResponse, T extends UpdateEntity> List<C> updateMultipleEntities(List<T> entityList);

	/**
	 * Inserts a CreateEntity that is a sub type of BullhornEntity and returns a CrudResponse with info on the update, such as warnings, errors
	 * and validation errors.
	 * 
	 * @param the
	 *            CreateEntity to insert
	 * 
	 * @return a CrudResponse
	 */

	public <C extends CrudResponse, T extends CreateEntity> C insertEntity(T entity);

	/**
	 * Soft deletes a SoftDelete entity and hard deletes a HardDeleteEntity both are sub types of DeleteEntity that is a sub type of
	 * BullhornEntity and returns a CrudResponse with info on the delete.
	 * 
	 * @param entity
	 * @return
	 */
	public <C extends CrudResponse, T extends DeleteEntity> C deleteEntity(Class<T> type, Integer id);

	/**
	 * 
	 * Returns the MetaData for passed in type.
	 * 
	 * @param type
	 *            a BullhornEntity
	 * @param metaParameter
	 *            specifies how much meta data to fetch (basic or full). Null will default to basic.
	 * 
	 * @param fieldSet
	 *            fields to return meta data for. Pass in null for all fields.
	 * @return
	 */

	public <T extends BullhornEntity> MetaData<T> getMetaData(Class<T> type, MetaParameter metaParameter, Set<String> fieldSet);

	/**
	 * Returns a valid bhRestToken to be used in a bh rest api call.
	 * 
	 * @return the BhRestToken
	 */
	public String getBhRestToken();

	/**
	 * Returns a valid, brand new, bhRestToken to be used in a bh rest api call.
	 * 
	 * @return the new BhRestToken
	 */
	public String refreshBhRestToken();

	/**
	 * Get the rest url to be used in a bh rest api call.
	 * 
	 * @return
	 */
	public String getRestUrl();

	/**
	 * Parses a resume file to a ParsedResume object containing possible Candidate, CandidateEducation and CandidateWorkHistory data.
	 * 
	 * Please note that this method will only parse the the information but it will not save the data to Bullhorn. In order to save the
	 * parsed data make subsequent api calls using the saveParsedResumeDataToBullhorn method.
	 * 
	 * @param resume
	 *            the MultipartFile to parse
	 * @param params
	 *            the additional parameters to pass in the api call, pass in null for defaults.
	 * @return the parsed resume values.
	 */
	public ParsedResume parseResumeFile(MultipartFile resume, ResumeFileParseParams params);

	/**
	 * Parses a resume in plain text or html to a ParsedResume object containing possible Candidate, CandidateEducation and
	 * CandidateWorkHistory data.
	 * 
	 * Please note that this method will only parse the the information but it will not save the data to Bullhorn. In order to save the
	 * parsed data make subsequent api calls using the saveParsedResumeDataToBullhorn method.
	 * 
	 * @param resume
	 *            the the resume text to parse
	 * @param params
	 *            the additional parameters to pass in the api call, pass in null for defaults.
	 * @return the parsed resume values.
	 */
	public ParsedResume parseResumeText(String resume, ResumeTextParseParams params);

	/**
	 * Inserts the parsed resume data to bullhorn and returns that data with the ids of the entities added.
	 * 
	 * Set the id on the passed in candidate to guarantee an update of the candidate record instead of an insert.
	 * 
	 * If no id on the candidate exists then this method will make a duplicate check on the passed in data. If an existing candidate is
	 * found then that candidate will be updated otherwise a new candidate will be inserted.
	 * 
	 * @param parsedResume
	 *            a ParsedResume object, usually fetched using the parseResumeFile method.
	 * @return the ParsedResume with the objects updated with the ids in bullhorn. Null if save failed.
	 */
	public ParsedResume saveParsedResumeDataToBullhorn(ParsedResume parsedResume);

	/**
	 * Convenience method to parse the resume file and add the file to the fileEntity specified.
	 * 
	 * If the parse is successful the file will be attached. In that case a FileWrapper will be added to the ParsedResume returned.
	 * 
	 * @param type
	 *            the FileEntity to attach the file to
	 * @param entityId
	 *            the id of the file entity
	 * @param file
	 *            the resume
	 * @param externalId
	 *            External identifier for the file. Example: "portfolio"
	 * @param fileParams
	 * @param resumeFileParseParams
	 * @return The ParsedResume. If the parse was successful, then the ParsedResume will contain a FileWrapper.
	 */
	public ParsedResume parseResumeThenAddfile(Class<? extends FileEntity> type, Integer entityId, MultipartFile file, String externalId,
			FileParams fileParams, ResumeFileParseParams resumeFileParseParams);

	/**
	 * Adds a file to the bh entity with the entityId, passing in a File.
	 * 
	 * @param type
	 * @param entityId
	 * @param file
	 * @param externalId
	 * @param params
	 * @return
	 */
	public FileWrapper addFile(Class<? extends FileEntity> type, Integer entityId, File file, String externalId, FileParams params);

	/**
	 * Returns a file for the passed in FileEntity type. No FileMeta data included.
	 * 
	 * @param type
	 *            the bh type of the entity that has a file attached
	 * @param entityId
	 *            the entity of the bh entity with an attached file
	 * @param fileId
	 *            the file id
	 * @return
	 */
	public FileContent getFileContent(Class<? extends FileEntity> type, Integer entityId, Integer fileId);

	/**
	 * Returns a list containing the FileMeta data for all files for the bullhorn type with entityId.
	 * 
	 * @param type
	 *            the bh type of the entity that has a file attached
	 * @param entityId
	 *            the entity of the bh entity with an attached file
	 * @return
	 */
	public List<FileMeta> getFileMetaData(Class<? extends FileEntity> type, Integer entityId);

	/**
	 * Return file content + FileMeta data for a file
	 * 
	 * @param type
	 *            the bh type of the entity that has a file attached
	 * @param entityId
	 *            the entity of the bh entity with an attached file
	 * @param fileId
	 *            the file id
	 * @return
	 */
	public FileWrapper getFile(Class<? extends FileEntity> type, Integer entityId, Integer fileId);

	/**
	 * Return a list of file content + FileMeta data for a bullhorn entity.
	 * 
	 * @param type
	 *            the bh type of the entity that has a file attached
	 * @param entityId
	 *            the entity of the bh entity with an attached file
	 * @return
	 */
	public List<FileWrapper> getAllFiles(Class<? extends FileEntity> type, Integer entityId);

	/**
	 * Adds a file to the bh entity with the entityId.
	 * 
	 * @param type
	 *            the bullhorn type, such as a Candidate
	 * @param entityId
	 *            the id of the bullhorn type
	 * @param file
	 *            the file to attach
	 * @param externalId
	 *            External identifier for the type of file attached. Pass in null for default value.
	 * @param params
	 *            optional parameters.
	 * @return a FileWrapper containing the added file
	 */
	public FileWrapper addFile(Class<? extends FileEntity> type, Integer entityId, MultipartFile file, String externalId, FileParams params);

	/**
	 * Adds the resume file to the candidate. Also updates the description on that candidate with the resume text.
	 * 
	 * This method is intended to mimic the legacy api for attaching resumes to a candidate + updating the candidate.description.
	 * 
	 * @param candidateId
	 *            the id of the candidate to update with file and description
	 * @param file
	 *            the file to attach to the candidate
	 * @param candidateDescription
	 *            Will be used to populate the candidate description
	 * @param externalId
	 * @param params
	 *            the FileParams. User ParamFactory.fileParams()
	 * 
	 * @return a FileWrapper with the file information
	 */
	public FileWrapper addResumeFileAndPopulateCandidateDescription(Integer candidateId, File file, String candidateDescription,
			String externalId, FileParams params);

	/**
	 * Deletes a file from the bullhorn entity
	 * 
	 * @param type
	 * @param entityId
	 * @param fileId
	 * @return A FileApiResponse
	 */
	public FileApiResponse deleteFile(Class<? extends FileEntity> type, Integer entityId, Integer fileId);

	/**
	 * Associates the associationName with the entity.
	 * 
	 * @param type
	 *            the AssociationEntity type that will have associations added
	 * @param entityId
	 *            the id of the AssociationEntity type. Example candidate.id
	 * @param associationName
	 *            the name of the association on the entity. Use the factory classes in
	 *            com.bullhornsdk.data.model.entity.association.standard to see what associations are available.
	 * @param associationIds
	 *            the ids of the associations to be added to the entity
	 * @return a CrudResponse
	 */
	public <C extends CrudResponse, T extends AssociationEntity> C associateWithEntity(Class<T> type, Integer entityId,
			AssociationField<T, ? extends BullhornEntity> associationName, Set<Integer> associationIds);

	/**
	 * Disassociates the associationName with the entity.
	 * 
	 * @param type
	 *            the AssociationEntity type that will have associations added
	 * @param entityId
	 *            the id of the AssociationEntity type. Example candidate.id
	 * @param associationName
	 *            Use the factory classes in com.bullhornsdk.data.model.entity.association.standard to see what associations are available.
	 * @param associationIds
	 *            the ids of the associations to be removed from the entity
	 * @return a CrudResponse
	 */
	public <C extends CrudResponse, T extends AssociationEntity> C disassociateWithEntity(Class<T> type, Integer entityId,
			AssociationField<T, ? extends BullhornEntity> associationName, Set<Integer> associationIds);

	/**
	 * Returns a List<E> of entities associated with the type T.
	 * 
	 * Example: Pass in Category.class as Class<T> and Skill.class as Class<E> to get a list of List<Skill> associated with the category
	 * 
	 * @param type
	 *            a AssociationEntity of type T that has associations of type E
	 * @param entityIds
	 *            the ids of the type T BullhornEntity to return associations from
	 * @param associationType
	 *            a BullhornEntity of type E to be returned
	 * @param fieldSet
	 *            fields of the associationType to return
	 * 
	 * @param params
	 *            optional parameters such as count and order by
	 * 
	 * @return a list containing type E
	 */
	public <T extends AssociationEntity, E extends BullhornEntity> List<E> getAssociation(Class<T> type, Set<Integer> entityIds,
			AssociationField<T, E> associationName, Set<String> fieldSet, AssociationParams params);

	/**
	 * Returns a List<Note> of all notes associated with ClientContacts of the give ClientCorporation
	 * 
	 * @param clientCorporationID
	 *            the id of the ClientCorporation whose notes we want to retrieve
	 * @param fieldSet
	 *            fields of the Notes to return
	 * @param params
	 *            optional parameters such as count and order by
	 * @return a list<Note> of the clientCorporation's notes
	 */
	public List<Note> getAllCorpNotes(Integer clientCorporationID, Set<String> fieldSet, CorpNotesParams params);

	/**
	 * Handles the multi-step process of adding a {@link Note} and associating it with targetEntityTypes.
	 * 
	 * Set the note.personReference to associate the note with a Candidate, ClientContact or CorporateUser: make sure to provide the id of
	 * the person.
	 * 
	 * Set the note.jobOrder to associate the note with a JobOrder: make sure to provide the id of said JobOrder
	 * 
	 * Set the note.placements to associate the note with a Placement: make sure to provide the id for the placements you wish to add.
	 * 
	 * If the Note insert fails no attempt to add a NoteEntity will occur.
	 * 
	 * @param note
	 *            The {@link Note} to add. The note.personReference,note.jobOrder and note.placements determine what entities the note will
	 *            be associated with via a NoteEntity.
	 * 
	 * @return a CrudResponse
	 */
	public <C extends CrudResponse> C addNoteAndAssociateWithEntity(Note note);

	/**
	 * Returns the RestApiSession that manages the sessions for one corporation. Use this get access to corporationID and apiKey.
	 * 
	 * @return
	 */
	public RestApiSession getRestApiSession();

}
