package com.bullhornsdk.data.api.helper;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.enums.MetaParameter;
import com.bullhornsdk.data.model.enums.RestEntityInfo;
import com.bullhornsdk.data.model.parameter.AssociationParams;
import com.bullhornsdk.data.model.parameter.CorpNotesParams;
import com.bullhornsdk.data.model.parameter.EntityParams;
import com.bullhornsdk.data.model.parameter.FileParams;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.ResumeFileParseParams;
import com.bullhornsdk.data.model.parameter.ResumeTextParseParams;
import com.bullhornsdk.data.model.parameter.SearchParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;

public class RestUriVariablesFactory {

	private final BullhornData bullhornApiRest;

	private final RestFileManager restFileManager;

	// url parameter names
	private static final String BH_REST_TOKEN = "bhRestToken";
	private static final String ENTITY_TYPE = "entityType";
	private static final String FIELDS = "fields";
	private static final String META = "meta";
	private static final String WHERE = "where";
	private static final String QUERY = "query";
	private static final String FORMAT = "format";
	private static final String ENTITY_ID = "entityId";
	private static final String FILE_ID = "fileId";
	private static final String EXTERNAL_ID = "externalID";
	private static final String ID = "id";
	private static final String ACCOCIATION_NAME = "associationName";
	private static final String ACCOCIATION_IDS = "associationIds";
	private static final String CLIENT_CORP_ID = "clientCorpId";

	public RestUriVariablesFactory(BullhornData bullhornApiRest, RestFileManager restFileManager) {
		super();
		this.bullhornApiRest = bullhornApiRest;
		this.restFileManager = restFileManager;
	}

	/*
	 * **************************************************************************************************************
	 * uri variables **************************************************************************************************************
	 */

	/**
	 * Returns the uri variables needed for a meta call.
	 * 
	 * @param entityInfo
	 * @param metaParameter
	 * @param fieldSet
	 * @return
	 */

	public Map<String, String> getUriVariablesForMeta(RestEntityInfo entityInfo, MetaParameter metaParameter, Set<String> fieldSet) {
		Map<String, String> uriVariables = new LinkedHashMap<String, String>();
		String bhRestToken = bullhornApiRest.getBhRestToken();
		uriVariables.put(BH_REST_TOKEN, bhRestToken);
		uriVariables.put(ENTITY_TYPE, entityInfo.getName());
		String fields = this.convertFieldSetToString(fieldSet);
		uriVariables.put(FIELDS, fields);

		if (metaParameter == null) {
			uriVariables.put(META, MetaParameter.BASIC.getName());
		} else {
			uriVariables.put(META, metaParameter.getName());
		}
		return uriVariables;
	}

	/**
	 * Returns the uri variables needed for an "entity" GET
	 * 
	 * @param entityInfo
	 * @param id
	 * @param fieldSet
	 * @param params
	 * @return all uriVariables needed for the api call
	 */
	public Map<String, String> getUriVariablesForEntity(RestEntityInfo entityInfo, Integer id, Set<String> fieldSet, EntityParams params) {

		if (params == null) {
			params = ParamFactory.entityParams();
		}

		Map<String, String> uriVariables = params.getParameterMap();
		this.addCommonUriVariables(fieldSet, entityInfo, uriVariables);
		
		uriVariables.put(ID, id == null ? "" : id.toString());
		return uriVariables;
	}

	/**
	 * Returns the uri variables needed for an "entity" DELETE
	 * 
	 * @param entityInfo
	 * @param id
	 * @return all uriVariables needed for the api call
	 */
	public Map<String, String> getUriVariablesForEntityDelete(RestEntityInfo entityInfo, Integer id) {
		Map<String, String> uriVariables = new LinkedHashMap<String, String>();
		String bhRestToken = bullhornApiRest.getBhRestToken();
		uriVariables.put(BH_REST_TOKEN, bhRestToken);
		uriVariables.put(ENTITY_TYPE, entityInfo.getName());
		uriVariables.put(ID, id.toString());
		return uriVariables;
	}

	/**
	 * Returns the uri variables needed for a "entity" POST request
	 * 
	 * @param entityInfo
	 * @param id
	 * @return all uriVariables needed for the api call
	 */
	public Map<String, String> getUriVariablesForEntityUpdate(RestEntityInfo entityInfo, Integer id) {

		Map<String, String> uriVariables = new LinkedHashMap<String, String>();
		String bhRestToken = bullhornApiRest.getBhRestToken();
		uriVariables.put(BH_REST_TOKEN, bhRestToken);
		uriVariables.put(ENTITY_TYPE, entityInfo.getName());
		uriVariables.put(ID, id.toString());
		return uriVariables;
	}

	/**
	 * Returns the uri variables needed for the "entity" PUT request.
	 * 
	 * @param entityInfo
	 * @return
	 */
	public Map<String, String> getUriVariablesForEntityInsert(RestEntityInfo entityInfo) {

		Map<String, String> uriVariables = new LinkedHashMap<String, String>();
		String bhRestToken = bullhornApiRest.getBhRestToken();
		uriVariables.put(BH_REST_TOKEN, bhRestToken);
		uriVariables.put(ENTITY_TYPE, entityInfo.getName());
		return uriVariables;
	}

	/**
	 * Returns the uri variables needed for a "query" request
	 * 
	 * @param entityInfo
	 * @param where
	 * @param fieldSet
	 * @param params
	 * @return all uriVariables needed for the api call
	 */
	public Map<String, String> getUriVariablesForQuery(RestEntityInfo entityInfo, String where, Set<String> fieldSet, QueryParams params) {

		Map<String, String> uriVariables = params.getParameterMap();

		this.addCommonUriVariables(fieldSet, entityInfo, uriVariables);
		uriVariables.put(WHERE, where);

		return uriVariables;
	}

	/**
	 * Returns the uri variables needed for a "search" request
	 * 
	 * @param entityInfo
	 * @param query
	 * @param fieldSet
	 * @param params
	 * @return all uriVariables needed for the api call
	 */
	public Map<String, String> getUriVariablesForSearch(RestEntityInfo entityInfo, String query, Set<String> fieldSet, SearchParams params) {

		Map<String, String> uriVariables = params.getParameterMap();

		this.addCommonUriVariables(fieldSet, entityInfo, uriVariables);
		uriVariables.put(QUERY, query);

		return uriVariables;
	}

	/**
	 * Returns the uri variables needed for a resume file request
	 * 
	 * @param params
	 * @param resume
	 * @return
	 */
	public Map<String, String> getUriVariablesForResumeFileParse(ResumeFileParseParams params, MultipartFile resume) {

		if (params == null) {
			params = ParamFactory.resumeFileParseParams();
		}

		Map<String, String> uriVariables = params.getParameterMap();

		String bhRestToken = bullhornApiRest.getBhRestToken();
		uriVariables.put(BH_REST_TOKEN, bhRestToken);
		uriVariables.put(FORMAT, restFileManager.getFileParam(resume));
		return uriVariables;
	}

	/**
	 * Returns the uri variables needed for a resume text request
	 * 
	 * @param params
	 * @return
	 */
	public Map<String, String> getUriVariablesForResumeTextParse(ResumeTextParseParams params) {

		if (params == null) {
			params = ParamFactory.resumeTextParseParams();
		}

		Map<String, String> uriVariables = params.getParameterMap();

		String bhRestToken = bullhornApiRest.getBhRestToken();
		uriVariables.put(BH_REST_TOKEN, bhRestToken);
		return uriVariables;
	}

	/**
	 * Returns the uri variables needed for a get file request
	 * 
	 * @param typesRestEntityName
	 * @param entityId
	 * @param fileId
	 * @return
	 */
	public Map<String, String> getUriVariablesForGetFile(RestEntityInfo entityInfo, Integer entityId, Integer fileId) {
		Map<String, String> uriVariables = new LinkedHashMap<String, String>();
		String bhRestToken = bullhornApiRest.getBhRestToken();
		uriVariables.put(BH_REST_TOKEN, bhRestToken);
		uriVariables.put(ENTITY_TYPE, entityInfo.getName());
		uriVariables.put(ENTITY_ID, entityId.toString());
		uriVariables.put(FILE_ID, fileId.toString());
		return uriVariables;
	}

	/**
	 * Returns the uri variables needed for a get entity meta files api call.
	 * 
	 * @param entityInfo
	 * @param entityId
	 * @return
	 */
	public Map<String, String> getUriVariablesForGetEntityMetaFiles(RestEntityInfo entityInfo, Integer entityId) {
		Map<String, String> uriVariables = new LinkedHashMap<String, String>();
		String bhRestToken = bullhornApiRest.getBhRestToken();
		uriVariables.put(BH_REST_TOKEN, bhRestToken);
		uriVariables.put(ENTITY_TYPE, entityInfo.getName());
		uriVariables.put(ENTITY_ID, entityId.toString());

		return uriVariables;
	}

	/**
	 * Returns the uri variables needed for adding a file
	 * 
	 * @param entityInfo
	 * @param entityId
	 * @param externalId
	 * @param params
	 * @return
	 */
	public Map<String, String> getUriVariablesForAddFile(RestEntityInfo entityInfo, Integer entityId, String externalId, FileParams params) {
		if (params == null) {
			params = ParamFactory.fileParams();
		}

		Map<String, String> uriVariables = params.getParameterMap();

		String bhRestToken = bullhornApiRest.getBhRestToken();
		uriVariables.put(BH_REST_TOKEN, bhRestToken);
		uriVariables.put(EXTERNAL_ID, externalId);
		uriVariables.put(ENTITY_TYPE, entityInfo.getName());
		uriVariables.put(ENTITY_ID, entityId.toString());
		return uriVariables;
	}

	/**
	 * Returns the uri variables needed for a file delete api call
	 * 
	 * @param entityInfo
	 * @param entityId
	 * @param fileId
	 * @return
	 */
	public Map<String, String> getUriVariablesDeleteFile(RestEntityInfo entityInfo, Integer entityId, Integer fileId) {
		Map<String, String> uriVariables = new LinkedHashMap<String, String>();
		String bhRestToken = bullhornApiRest.getBhRestToken();
		uriVariables.put(BH_REST_TOKEN, bhRestToken);
		uriVariables.put(ENTITY_TYPE, entityInfo.getName());
		uriVariables.put(ENTITY_ID, entityId.toString());
		uriVariables.put(FILE_ID, fileId.toString());
		return uriVariables;
	}

	public <T extends AssociationEntity> Map<String, String> getUriVariablesForAssociateWithEntity(RestEntityInfo entityInfo,
			Integer entityId, AssociationField<T, ? extends BullhornEntity> associationName, Set<Integer> associationIds) {
		Map<String, String> uriVariables = new LinkedHashMap<String, String>();
		String bhRestToken = bullhornApiRest.getBhRestToken();
		uriVariables.put(BH_REST_TOKEN, bhRestToken);
		uriVariables.put(ENTITY_TYPE, entityInfo.getName());
		uriVariables.put(ENTITY_ID, entityId.toString());
		uriVariables.put(ACCOCIATION_NAME, associationName.getAssociationFieldName());
		uriVariables.put(ACCOCIATION_IDS, StringUtils.join(associationIds, ","));
		return uriVariables;
	}

	public <T extends AssociationEntity> Map<String, String> getUriVariablesForGetAssociation(RestEntityInfo entityInfo,
			Set<Integer> entityIds, AssociationField<T, ? extends BullhornEntity> associationName, Set<String> fieldSet,
			AssociationParams params) {
		Map<String, String> uriVariables = params.getParameterMap();

		addCommonUriVariables(fieldSet, entityInfo, uriVariables);

		uriVariables.put(ENTITY_ID, StringUtils.join(entityIds, ","));
		uriVariables.put(ACCOCIATION_NAME, associationName.getAssociationFieldName());

		return uriVariables;
	}

	/**
	 * Returns the uri variables needed for a get corp notes call
	 * 
	 * @param clientCorporationID
	 * @param fieldSet
	 * @param params
	 * @return
	 */
	public Map<String, String> getUriVariablesForCorpNotes(Integer clientCorporationID, Set<String> fieldSet, CorpNotesParams params) {
		if (params == null) {
			params = ParamFactory.corpNotesParams();
		}

		Map<String, String> uriVariables = params.getParameterMap();

		String bhRestToken = bullhornApiRest.getBhRestToken();
		uriVariables.put(BH_REST_TOKEN, bhRestToken);
		String fields = this.convertFieldSetToString(fieldSet);
		uriVariables.put(FIELDS, fields);
		uriVariables.put(CLIENT_CORP_ID, clientCorporationID.toString());

		return uriVariables;
	}

	/**
	 * Adds url variables common to all requests to the passed in map: bhRestToken,fields,entityType
	 * 
	 * @param fieldSet
	 * @param entityInfo
	 */
	public void addCommonUriVariables(Set<String> fieldSet, RestEntityInfo entityInfo, Map<String, String> uriVariables) {
		String bhRestToken = bullhornApiRest.getBhRestToken();
		String fields = convertFieldSetToString(fieldSet);
		uriVariables.put(BH_REST_TOKEN, bhRestToken);
		uriVariables.put(FIELDS, fields);
		uriVariables.put(ENTITY_TYPE, entityInfo.getName());

	}

	/**
	 * Converts the Set to a string. Adds the id field if only blank fields present. If fieldset is null returns "*"
	 * 
	 * @param fieldSet
	 * @return
	 */
	public String convertFieldSetToString(Set<String> fieldSet) {

		if (fieldSet == null || fieldSet.isEmpty() || fieldSet.contains("*")) {
			return "*";
		}

		Set<String> interim = fieldSet.stream().filter(s -> !StringUtils.isBlank(s)).collect(Collectors.toSet());
		if (interim.isEmpty()) {
			interim.add(ID);
		}
		return interim.stream().collect(Collectors.joining(","));

	}

}
