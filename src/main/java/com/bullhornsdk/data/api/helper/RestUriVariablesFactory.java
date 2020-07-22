package com.bullhornsdk.data.api.helper;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.exception.NoAllFieldsException;
import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.enums.BullhornEntityInfo;
import com.bullhornsdk.data.model.enums.EntityEventType;
import com.bullhornsdk.data.model.enums.EventType;
import com.bullhornsdk.data.model.enums.MetaParameter;
import com.bullhornsdk.data.model.file.FileMeta;
import com.bullhornsdk.data.model.parameter.AssociationParams;
import com.bullhornsdk.data.model.parameter.CorpNotesParams;
import com.bullhornsdk.data.model.parameter.EntityParams;
import com.bullhornsdk.data.model.parameter.FastFindParams;
import com.bullhornsdk.data.model.parameter.FileParams;
import com.bullhornsdk.data.model.parameter.OptionsParams;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.ResumeFileParseParams;
import com.bullhornsdk.data.model.parameter.ResumeTextParseParams;
import com.bullhornsdk.data.model.parameter.SearchParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;

public class RestUriVariablesFactory {

	private final BullhornData bullhornApiRest;

	private final RestFileManager restFileManager;

	// url parameter names
    private static final String ACCOCIATION_IDS = "associationIds";
	private static final String ACCOCIATION_NAME = "associationName";
	private static final String BH_REST_TOKEN = "bhRestToken";
	private static final String CLIENT_CORP_ID = "clientCorpId";
	private static final String ENTITY_ID = "entityId";
	private static final String ENTITY_TYPE = "entityType";
	private static final String EXECUTE_FORM_TRIGGERS = "executeFormTriggers";
	private static final String EXTERNAL_ID = "externalID";
	private static final String FIELDS = "fields";
	private static final String FILE_ID = "fileId";
	private static final String FORMAT = "format";
	private static final String ID = "id";
	private static final String MAX_EVENTS = "maxEvents";
	private static final String META = "meta";
    private static final String OPTIONS_IDS = "optionsIds";
	private static final String PRIVATE_LABEL_ID = "privateLabelId";
	private static final String QUERY = "query";
    private static final String REQUEST_ID = "requestId";
    private static final String SETTINGS = "settings";
    private static final String SUBSCRIPTION_ID = "subscriptionId";
    private static final String WHERE = "where";

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

	public Map<String, String> getUriVariablesForMeta(BullhornEntityInfo entityInfo, MetaParameter metaParameter, Set<String> fieldSet, Integer privateLabelId) {
		return getUriVariablesForMeta(entityInfo.getName(), metaParameter, fieldSet, privateLabelId);
	}

	/*
	 * **************************************************************************************************************
	 * uri variables **************************************************************************************************************
	 */

    /**
     * Returns the uri variables needed for a meta call.
     *
     * @param entityType
     * @param metaParameter
     * @param fieldSet
     * @return
     */

    public Map<String, String> getUriVariablesForMeta(String entityType, MetaParameter metaParameter, Set<String> fieldSet, Integer privateLabelId) {
        Map<String, String> uriVariables = new LinkedHashMap<String, String>();
        String bhRestToken = bullhornApiRest.getBhRestToken();
        uriVariables.put(BH_REST_TOKEN, bhRestToken);
        uriVariables.put(ENTITY_TYPE, entityType);

        try {
            String fields = this.convertFieldSetToString(fieldSet);

            uriVariables.put(FIELDS, fields);
        } catch(NoAllFieldsException e) {
            uriVariables.put(FIELDS, "*");
        }

        if (metaParameter == null) {
            uriVariables.put(META, MetaParameter.BASIC.getName());
        } else {
            uriVariables.put(META, metaParameter.getName());
        }

        if(privateLabelId != null) {
            uriVariables.put(PRIVATE_LABEL_ID, privateLabelId.toString());
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
	public Map<String, String> getUriVariablesForEntity(BullhornEntityInfo entityInfo, Integer id, Set<String> fieldSet, EntityParams params) {

		if (params == null) {
			params = ParamFactory.entityParams();
		}

		Map<String, String> uriVariables = params.getParameterMap();
		this.addCommonUriVariables(fieldSet, entityInfo, uriVariables);
		
		uriVariables.put(ID, id == null ? "" : id.toString());
		return uriVariables;
	}

	public Map<String, String> getUriVariablesForGetMultiple(BullhornEntityInfo entityInfo, String ids, Set<String> fieldSet, EntityParams params) {

		Map<String, String> uriVariables = params.getParameterMap();

		this.addCommonUriVariables(fieldSet, entityInfo, uriVariables);
		uriVariables.put(ID, ids);

		return uriVariables;
	}

	/**
	 * Returns the uri variables needed for an "entity" DELETE
	 * 
	 * @param entityInfo
	 * @param id
	 * @return all uriVariables needed for the api call
	 */
	public Map<String, String> getUriVariablesForEntityDelete(BullhornEntityInfo entityInfo, Integer id) {
		Map<String, String> uriVariables = new LinkedHashMap<String, String>();
        addModifyingUriVariables(uriVariables, entityInfo);
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
	public Map<String, String> getUriVariablesForEntityUpdate(BullhornEntityInfo entityInfo, Integer id) {
		Map<String, String> uriVariables = new LinkedHashMap<String, String>();
        addModifyingUriVariables(uriVariables, entityInfo);
        uriVariables.put(ID, id.toString());
		return uriVariables;
	}

	/**
	 * Returns the uri variables needed for the "entity" PUT request.
	 * 
	 * @param entityInfo
	 * @return
	 */
	public Map<String, String> getUriVariablesForEntityInsert(BullhornEntityInfo entityInfo) {
		Map<String, String> uriVariables = new LinkedHashMap<String, String>();
        addModifyingUriVariables(uriVariables, entityInfo);
        return uriVariables;
	}

    /**
     * Returns the uri variables needed for a "query" request minus where since that will be in the body
     *
     * @param entityInfo
     * @param fieldSet
     * @param params
     * @return all uriVariables needed for the api call
     */
    public Map<String, String> getUriVariablesForQueryWithPost(BullhornEntityInfo entityInfo, Set<String> fieldSet, QueryParams params) {

        Map<String, String> uriVariables = params.getParameterMap();

        this.addCommonUriVariables(fieldSet, entityInfo, uriVariables);

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
	public Map<String, String> getUriVariablesForQuery(BullhornEntityInfo entityInfo, String where, Set<String> fieldSet, QueryParams params) {

		Map<String, String> uriVariables = params.getParameterMap();

		this.addCommonUriVariables(fieldSet, entityInfo, uriVariables);
		uriVariables.put(WHERE, where);

		return uriVariables;
	}

    /**
     * Returns the uri variables needed for a "search" request minus query
     *
     * @param entityInfo
     * @param fieldSet
     * @param params
     * @return all uriVariables needed for the api call
     */
    public Map<String, String> getUriVariablesForSearchWithPost(BullhornEntityInfo entityInfo, Set<String> fieldSet, SearchParams params) {

        Map<String, String> uriVariables = params.getParameterMap();

        this.addCommonUriVariables(fieldSet, entityInfo, uriVariables);

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
	public Map<String, String> getUriVariablesForSearch(BullhornEntityInfo entityInfo, String query, Set<String> fieldSet, SearchParams params) {

		Map<String, String> uriVariables = params.getParameterMap();

		this.addCommonUriVariables(fieldSet, entityInfo, uriVariables);
		uriVariables.put(QUERY, query);

		return uriVariables;
	}

    /**
     * Returns the uri variables needed for a id "search" request
     */
    public Map<String, String> getUriVariablesForIdSearch(BullhornEntityInfo entityInfo,
                                                                 String query,
                                                                 SearchParams params) {

        Map<String, String> uriVariables = params.getParameterMap();

        uriVariables.put(BH_REST_TOKEN, bullhornApiRest.getBhRestToken());
        uriVariables.put(ENTITY_TYPE, entityInfo.getName());
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
	 * @param entityInfo
	 * @param entityId
	 * @param fileId
	 * @return
	 */
	public Map<String, String> getUriVariablesForGetFile(BullhornEntityInfo entityInfo, Integer entityId, Integer fileId) {
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
	public Map<String, String> getUriVariablesForGetEntityMetaFiles(BullhornEntityInfo entityInfo, Integer entityId) {
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
	public Map<String, String> getUriVariablesForAddFile(BullhornEntityInfo entityInfo, Integer entityId, String externalId, FileParams params) {
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
	 * Returns the uri variables needed for adding a file
	 *
	 * @param entityInfo
	 * @param entityId
	 * @param fileMeta
	 * @return
	 */
	public Map<String, String> getUriVariablesForAddFile(BullhornEntityInfo entityInfo, Integer entityId, FileMeta fileMeta) {
		Map<String, String> uriVariables = fileMeta.getParameterMap();

		String bhRestToken = bullhornApiRest.getBhRestToken();
		uriVariables.put(BH_REST_TOKEN, bhRestToken);
		uriVariables.put(ENTITY_TYPE, entityInfo.getName());
		uriVariables.put(ENTITY_ID, entityId.toString());

		if (fileMeta.getId() != null) {
			uriVariables.put(FILE_ID, fileMeta.getId().toString());
		}

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
	public Map<String, String> getUriVariablesDeleteFile(BullhornEntityInfo entityInfo, Integer entityId, Integer fileId) {
		Map<String, String> uriVariables = new LinkedHashMap<String, String>();
		String bhRestToken = bullhornApiRest.getBhRestToken();
		uriVariables.put(BH_REST_TOKEN, bhRestToken);
		uriVariables.put(ENTITY_TYPE, entityInfo.getName());
		uriVariables.put(ENTITY_ID, entityId.toString());
		uriVariables.put(FILE_ID, fileId.toString());
		return uriVariables;
	}

	public <T extends AssociationEntity> Map<String, String> getUriVariablesForAssociateWithEntity(BullhornEntityInfo entityInfo,
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

	public <T extends AssociationEntity> Map<String, String> getUriVariablesForGetAssociation(BullhornEntityInfo entityInfo,
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
	public void addCommonUriVariables(Set<String> fieldSet, BullhornEntityInfo entityInfo, Map<String, String> uriVariables) {
		String bhRestToken = bullhornApiRest.getBhRestToken();
		String fields = convertFieldSetToString(fieldSet);
		uriVariables.put(BH_REST_TOKEN, bhRestToken);
		uriVariables.put(FIELDS, fields);
		uriVariables.put(ENTITY_TYPE, entityInfo.getName());
	}

    /**
     * Adds common URI Variables for calls that are creating, updating, or deleting data.
     *
     * Adds the execute form triggers url parameter if it has been configured.
     *
     * @param uriVariables The variables map to add the flag to
     * @param entityInfo The bullhorn entity that is being modified by this call
     */
    private void addModifyingUriVariables(Map<String, String> uriVariables, BullhornEntityInfo entityInfo) {
        String bhRestToken = bullhornApiRest.getBhRestToken();
        uriVariables.put(BH_REST_TOKEN, bhRestToken);
        uriVariables.put(ENTITY_TYPE, entityInfo.getName());
        uriVariables.put(EXECUTE_FORM_TRIGGERS, bullhornApiRest.getExecuteFormTriggers() ? "true" : "false");
    }

	/**
	 * Converts the Set to a string. Adds the id field if only blank fields present. If fieldset is null returns "id"
	 *
	 * @param fieldSet
	 * @return
	 */
	public String convertFieldSetToString(Set<String> fieldSet) {
		if (fieldSet == null || fieldSet.isEmpty()) {
			return ID;
		} else if (fieldSet.contains("*")) {
            throw new NoAllFieldsException();
        }

		Set<String> interim = fieldSet.stream().filter(s -> !StringUtils.isBlank(s)).collect(Collectors.toSet());
		if (interim.isEmpty()) {
			interim.add(ID);
		}
		return interim.stream().collect(Collectors.joining(","));

	}

	/**
	 * Returns the uri variables needed for a "fastFind" request
	 *
	 * @param query
	 * @param params
	 * @return all uriVariables needed for the api call
	 */
	public Map<String, String> getUriVariablesForFastFind(String query, FastFindParams params) {

		Map<String, String> uriVariables = params.getParameterMap();

		uriVariables.put(BH_REST_TOKEN, bullhornApiRest.getBhRestToken());
		uriVariables.put(QUERY, query);

		return uriVariables;
	}

	public Map<String, String> getUriVariablesForSettings(Set<String> settingSet) {

		Map<String, String> uriVariables = new LinkedHashMap<String, String>();

		uriVariables.put(BH_REST_TOKEN, bullhornApiRest.getBhRestToken());

		try {
		    uriVariables.put(SETTINGS, convertFieldSetToString(settingSet));
        } catch(NoAllFieldsException e) {
            uriVariables.put(SETTINGS, "*");
        }

		return uriVariables;
	}

    public Map<String, String> getUriVariablesForGetLastRequestId(String subscriptionId) {

        Map<String, String> uriVariables = new LinkedHashMap<String, String>();

        uriVariables.put(BH_REST_TOKEN, bullhornApiRest.getBhRestToken());
        uriVariables.put(SUBSCRIPTION_ID, subscriptionId);

        return uriVariables;
    }

    public Map<String, String> getUriVariablesForGetEvents(String subscriptionId, Integer maxEvents) {

        Map<String, String> uriVariables = new LinkedHashMap<String, String>();

        uriVariables.put(BH_REST_TOKEN, bullhornApiRest.getBhRestToken());
        uriVariables.put(MAX_EVENTS, maxEvents.toString());
        uriVariables.put(SUBSCRIPTION_ID, subscriptionId);

        return uriVariables;
    }

    public Map<String, String> getUriVariablesForRegetEvents(String subscriptionId, Integer requestId) {

        Map<String, String> uriVariables = new LinkedHashMap<String, String>();

        uriVariables.put(BH_REST_TOKEN, bullhornApiRest.getBhRestToken());
        uriVariables.put(REQUEST_ID, requestId.toString());
        uriVariables.put(SUBSCRIPTION_ID, subscriptionId);

        return uriVariables;
    }

	public Map<String, String> getUriVariablesForEditHistoryQuery(BullhornEntityInfo entityInfo, String where, Set<String> fieldSet, QueryParams params) {
		Map<String, String> uriVariables = params.getParameterMap();

		this.addCommonUriVariables(fieldSet, entityInfo, uriVariables);
		uriVariables.put(WHERE, where);
		uriVariables.put(ENTITY_TYPE, entityInfo.getEditHistoryName());

		return uriVariables;
	}

	public Map<String, String> getUriVariablesForEditHistoryFieldChangeQuery(BullhornEntityInfo entityInfo, String where, Set<String> fieldSet, QueryParams params) {
		Map<String, String> uriVariables = params.getParameterMap();

		this.addCommonUriVariables(fieldSet, entityInfo, uriVariables);
		uriVariables.put(WHERE, where);
		uriVariables.put(ENTITY_TYPE, entityInfo.getEditHistoryFieldChangeName());

		return uriVariables;
	}

	public Map<String, String> getUriVariablesForSubscribeToEvents(String subscriptionId, EventType eventType,
																   List<Class> entityClasses,
																   List<EntityEventType> entityEventTypes){
		Map<String, String> uriVariables = new LinkedHashMap<>();
		uriVariables.put(BH_REST_TOKEN, bullhornApiRest.getBhRestToken());
		uriVariables.put(SUBSCRIPTION_ID, subscriptionId);
		uriVariables.put("type", eventType.typeValue());
		if (EventType.ENTITY == eventType && entityClasses != null){
			uriVariables.put("names", entityClasses.stream().map(Class::getSimpleName).collect(Collectors.joining(",")));
		}
		uriVariables.put("eventTypes", entityEventTypes != null ?
				entityEventTypes.stream().map(EntityEventType::value).collect(Collectors.joining(",")) : "");
		return uriVariables;
	}

	public Map<String, String> getUriVariablesForUnsubscribeToEvents(String subscriptionId){
		Map<String, String> uriVariables = new LinkedHashMap<>();
		uriVariables.put(BH_REST_TOKEN, bullhornApiRest.getBhRestToken());
		uriVariables.put(SUBSCRIPTION_ID, subscriptionId);
		return uriVariables;
	}

    public Map<String, String> getUriVariablesForOptions(BullhornEntityInfo entityInfo, OptionsParams params) {
        if (params == null) {
            params = ParamFactory.optionsParams();
        }
        Map<String, String> uriVariables = params.getParameterMap();
        uriVariables.put(BH_REST_TOKEN, bullhornApiRest.getBhRestToken());
        uriVariables.put(ENTITY_TYPE, entityInfo.getName());
        return uriVariables;
    }

    public Map<String, String> getUriVariablesForOptionsWithIds(BullhornEntityInfo entityInfo, OptionsParams params, Set<Integer> optionsIds) {
        if (params == null) {
            params = ParamFactory.optionsParams();
        }
        Map<String, String> uriVariables = params.getParameterMap();
        uriVariables.put(BH_REST_TOKEN, bullhornApiRest.getBhRestToken());
        uriVariables.put(ENTITY_TYPE, entityInfo.getName());
        uriVariables.put(OPTIONS_IDS, StringUtils.join(optionsIds, ","));
        return uriVariables;
    }
}
