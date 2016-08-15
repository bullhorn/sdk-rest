package com.bullhornsdk.data.api.helper;

import com.bullhornsdk.data.model.file.FileMeta;
import com.bullhornsdk.data.model.parameter.AssociationParams;
import com.bullhornsdk.data.model.parameter.CorpNotesParams;
import com.bullhornsdk.data.model.parameter.EntityParams;
import com.bullhornsdk.data.model.parameter.FastFindParams;
import com.bullhornsdk.data.model.parameter.FileParams;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.ResumeFileParseParams;
import com.bullhornsdk.data.model.parameter.ResumeTextParseParams;
import com.bullhornsdk.data.model.parameter.SearchParams;

public class RestUrlFactory {

    private final String restUrl;

    public RestUrlFactory(String restUrl) {
        super();
        this.restUrl = restUrl;
    }

    /*
     * **************************************************************************************************************
     * Assemble urls
     * **************************************************************************************************************
     */

    /**
     * Assemble url for entity request.
     * 
     * @param params
     *            EntityParams
     * @return the full url to use in the api call with {fieldName}-type placeholders for the uriVariables
     */

    public String assembleEntityUrl(EntityParams params) {
        return restUrl + "entity/{entityType}/{id}?fields={fields}&BhRestToken={bhRestToken}" + params.getUrlString();
    }

    /**
     * Assemble url for entity request DELETE
     * 
     * @return
     */
    public String assembleEntityDeleteUrl() {
        return restUrl + "entity/{entityType}/{id}?BhRestToken={bhRestToken}";
    }

    /**
     * Assemble url for entity request POST/Update
     * 
     * @return
     */
    public String assembleEntityUrlForUpdate() {
        return restUrl + "entity/{entityType}/{id}?BhRestToken={bhRestToken}";
    }

    /**
     * Assemble url for entity PUT request. These are insert requests.
     * 
     * @return
     */
    public String assembleEntityUrlForInsert() {
        return restUrl + "entity/{entityType}?BhRestToken={bhRestToken}";
    }

    /**
     * Assemble url for query request.
     * 
     * @param params
     *            QueryParams
     * @return the full url to use in the api call with {fieldName} type placeholders for the uriVariables
     */
    public String assembleQueryUrl(QueryParams params) {
        return restUrl + "query/{entityType}?where={where}&fields={fields}&BhRestToken={bhRestToken}" + params.getUrlString();
    }

    /**
     * Assemble url for search request.
     * 
     * @param params
     *            SearchParams
     * @return the full url to use in the api call with {fieldName} type placeholders for the uriVariables
     */
    public String assembleSearchUrl(SearchParams params) {
        return restUrl + "search/{entityType}?query={query}&fields={fields}&BhRestToken={bhRestToken}" + params.getUrlString();
    }

    /**
     * Assemble the url for a meta request
     * 
     * @return
     */
    public String assembleEntityUrlForMeta() {
        return restUrl + "meta/{entityType}?fields={fields}&BhRestToken={bhRestToken}&meta={meta}";
    }

    /**
     * Assemble the url for a parseToCandidate request
     * 
     * @param params
     * @return
     */
    public String assembleParseResumeFileUrl(ResumeFileParseParams params) {
        return restUrl + "resume/parseToCandidate?format={format}&BhRestToken={bhRestToken}" + params.getUrlString();
    }

    /**
     * Assemble the url for a parseToCandidateViaJson request
     * 
     * @param params
     * @return
     */
    public String assembleParseResumeTextUrl(ResumeTextParseParams params) {
        return restUrl + "resume/parseToCandidateViaJson?BhRestToken={bhRestToken}" + params.getUrlString();
    }

    /**
     * Assemble the url for a get file request
     *
     * @return
     */

    public String assemblePutFileUrl() {
        return restUrl + "file/{entityType}/{entityId}?BhRestToken={bhRestToken}";
    }

    /**
     * Assemble the url for a get file request
     * 
     * @return
     */

    public String assembleGetFileUrl() {
        return restUrl + "file/{entityType}/{entityId}/{fileId}?BhRestToken={bhRestToken}";
    }

    /**
     * Assemble the url for a get entityFiles request
     * 
     * @return
     */
    public String assembleGetEntityMetaFilesUrl() {
        return restUrl + "entityFiles/{entityType}/{entityId}?BhRestToken={bhRestToken}";
    }

    /**
     * Assemble the url for the put raw file request.
     *
     * @param params
     * @return
     */
    public String assembleAddFileUrl(FileParams params) {
        return restUrl + "file/{entityType}/{entityId}/raw?BhRestToken={bhRestToken}&externalID={externalID}"
                + params.getUrlString();
    }

    /**
     * Assemble the url for the put raw file request.
     *
     * @param fileMeta
     * @return
     */
    public String assembleAddFileUrl(FileMeta fileMeta) {
        return restUrl + "file/{entityType}/{entityId}/raw?BhRestToken={bhRestToken}"
                + fileMeta.getUrlString();
    }

    /**
     * Assemble the url for the delete file request
     * 
     * @return
     */
    public String assembleDeleteFileUrl() {
        return restUrl + "file/{entityType}/{entityId}/{fileId}?BhRestToken={bhRestToken}";
    }

    public String assembleEntityUrlForAssociateWithEntity() {
        return restUrl + "entity/{entityType}/{entityId}/{associationName}/{associationIds}?BhRestToken={bhRestToken}";
    }

    public String assembleGetLastRequstIdUrl() {
        return restUrl+"event/subscription/{subscriptionId}/lastRequestId?BhRestToken={bhRestToken}";
    }

    public String assembleGetEventsUrl() {
        return restUrl+"event/subscription/{subscriptionId}?maxEvents={maxEvents}&BhRestToken={bhRestToken}";
    }

    public String assembleRegetEventsUrl() {
        return restUrl+"event/subscription/{subscriptionId}?requestId={requestId}&BhRestToken={bhRestToken}";
    }

    public String assembleGetAssociationUrl(AssociationParams params) {
        return restUrl + "entity/{entityType}/{entityId}/{associationName}?fields={fields}&BhRestToken={bhRestToken}&showTotalMatched=true"
                + params.getUrlString();
    }

    /**
     * Assembles the url for the get corp notes request
     * 
     * @param params
     * @return
     */
    public String assembleCorpNotesUrl(CorpNotesParams params) {
        return restUrl + "allCorpNotes?fields={fields}&BhRestToken={bhRestToken}&clientCorpId={clientCorpId}"
                + params.getUrlString();
    }

    /**
     * Assemble url for fastFind request.
     *
     * @param params
     *            SearchParams
     * @return the full url to use in the api call with {fieldName} type placeholders for the uriVariables
     */
    public String assembleFastFindUrl(FastFindParams params) {
        return restUrl + "find?query={query}&BhRestToken={bhRestToken}" + params.getUrlString();
    }

	public String assembleUrlForSettings() {
        return restUrl + "settings/{settings}?BhRestToken={bhRestToken}";
	}

    public String assembleSubscribeToEventsUrl(boolean withNames) {
        return restUrl + "event/subscription/{subscriptionId}?type={type}&eventTypes={eventTypes}&BhRestToken={bhRestToken}"
                + (withNames ? "&names={names}" : "");
    }

    public String assembleUnsubscribeToEventsUrl(){
        return restUrl + "event/subscription/{subscriptionId}?BhRestToken={bhRestToken}";
    }

}
