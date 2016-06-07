package com.bullhornsdk.data.model.entity.core.standard;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by hiqbal on 6/1/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Settings{

    private Integer accountLockoutDuration;
    private List<Integer> allDeptIds;
    private List<Integer> allPrivateLabelIds;
    private boolean allowColumnCustomization;
    private boolean autoAddFromEmailEnabled;
    private String bboApiUrl;
    private String bboName;
    private String bullhornStaffingHost;
    private boolean candidateDashboard;
    private List<String> candidateViewableConfidentialFields;
    private List<String> candidateWorkFlowSteps;
    private String careerPortalDomainRoot;
    private boolean careerPortalEnabled;
    private List<String> clientContactWorkFlowSteps;
    private List<String> clientCorporationWorkFlowSteps;
    private boolean clientDashboard;
    private boolean clientTracksAsEntities;
    private List<String> commentActionList;
    private boolean commercialEnabled;
    private List<String> confidentialFieldList;
    private boolean contactDashboard;
    private boolean contactTracksAsEntities;
    private Integer corpPrivateLabelId;
    private Integer corporationId;
    private String corporationName;
    private String currencyFormat;
    private boolean dashboardsEnabled;
    private Integer defaultCalendarReminder;
    private List<String> defaultListColumnsCandidate;
    private List<String> defaultListColumnsClientContact;
    private List<String> defaultListColumnsClientCorporation;
    private List<String> defaultListColumnsClientCorporation1;
    private List<String> defaultListColumnsClientCorporation2;
    private List<String> defaultListColumnsClientCorporation3;
    private List<String> defaultListColumnsClientCorporation4;
    private List<String> defaultListColumnsClientCorporation5;
    private List<String> defaultListColumnsHousingComplex;
    private List<String> defaultListColumnsJobOrder;
    private List<String> defaultListColumnsJobOrder1;
    private List<String> defaultListColumnsJobOrder2;
    private List<String> defaultListColumnsJobOrder3;
    private List<String> defaultListColumnsJobOrder4;
    private List<String> defaultListColumnsJobOrder5;
    private List<String> defaultListColumnsJobSubmission;
    private List<String> defaultListColumnsLead;
    private List<String> defaultListColumnsOpportunity;
    private List<String> defaultListColumnsPlacement;
    private Integer defaultMinutesSpent;
    private Integer deptId;
    private Integer emailMaxTotalAttachmentSize;
    private boolean emailTriggerWordsEnabled;
    private boolean enterpriseEmailEnabled;
    private String entityTitleCandidate;
    private String entityTitleClientContact;
    private String entityTitleClientCorporation;
    private String entityTitleEducation;
    private String entityTitleJobOrder;
    private String entityTitleJobResponse;
    private String entityTitleJobSubmission;
    private String entityTitleLead;
    private String entityTitleOpportunity;
    private String entityTitlePlacement;
    private String entityTitlePlacementChangeRequest;
    private String entityTitleSendout;
    private String entityTitleShortList;
    private String entityTitleWorkHistory;
    private String externalAccounts;
    private Integer failedLoginLockoutThreshold;
    private boolean forwardingToStaffingAlias;
    private String headingBGColorCandidate;
    private String headingBGColorClientContact;
    private String headingBGColorClientCorporation;
    private String headingBGColorJobOrder;
    private String headingBGColorLead;
    private String headingBGColorOpportunity;
    private List<String> interviewScheduledJobResponseStatus;
    private boolean isBigDataEnabled;
    private boolean isCRMOnly;
    private boolean isNoteActionRequired;
    private boolean isSelfSignup;
    private boolean jobDashboard;
    private List<String> jobOrderWorkFlowSteps;
    private List<String> jobResponseStatusList;
    private boolean jobTracksAsEntities;
    private boolean leadAndOpportunityEnabled;
    private boolean leadDashboard;
    private List<String> leadWorkFlowSteps;
    private List<String> listExpandedLeftCandidate;
    private List<String> listExpandedLeftClientContact;
    private List<String> listExpandedLeftClientCorporation;
    private List<String> listExpandedLeftClientCorporation1;
    private List<String> listExpandedLeftClientCorporation2;
    private List<String> listExpandedLeftClientCorporation3;
    private List<String> listExpandedLeftClientCorporation4;
    private List<String> listExpandedLeftClientCorporation5;
    private List<String> listExpandedLeftHousingComplex;
    private List<String> listExpandedLeftJobOrder;
    private List<String> listExpandedLeftJobOrder1;
    private List<String> listExpandedLeftJobOrder2;
    private List<String> listExpandedLeftJobOrder3;
    private List<String> listExpandedLeftJobOrder4;
    private List<String> listExpandedLeftJobOrder5;
    private List<String> listExpandedLeftLead;
    private List<String> listExpandedLeftOpportunity;
    private List<String> listExpandedLeftPlacement;
    private List<String> listExpandedMiddleCandidate;
    private List<String> listExpandedMiddleClientContact;
    private List<String> listExpandedMiddleJobOrder;
    private List<String> listExpandedRightCandidate;
    private List<String> listExpandedRightClientContact;
    private List<String> listExpandedRightJobOrder;
    private String locale;
    private boolean luceneFastFindEnabled;
    private boolean marketIntelligenceEnabled;
    private String mobileDefaultView;
    private boolean mobileEnabled;
    private String mobileWebAccess;
    private boolean novoEnabled;
    private boolean npsEnabled;
    private boolean opportunityDashboard;
    private String opportunityStatusProbabilityToClose;
    private List<String> opportunityWorkFlowSteps;
    private boolean parseWebResponseResumeForExistingCNs;
    private boolean placementDashboard;
    private Integer privateLabelId;
    private boolean quickNoteEnabled;
    private boolean rememberLastCommentAction;
    private List<String> resumeWizardSkillLevel;
    private boolean submissionDashboard;
    private String tabletDefaultView;
    private boolean universalSearchEnabled;
    private boolean useExactSearchForNoteAction;
    private List<String> userEntitlements;
    private Integer userId;
    private String webResponseLabel;
    private String zipRadiusSearchUnits;
    private String zipRadiusSearchUnitsUserPref;

    public Settings() {
    }

    public Integer getAccountLockoutDuration(){
        return accountLockoutDuration;
    }

    @JsonProperty("accountLockoutDuration")
    public void setAccountLockoutDuration(Integer accountLockoutDuration){
        this.accountLockoutDuration = accountLockoutDuration;
    }

    public List<Integer> getAllDeptIds(){
        return allDeptIds;
    }

    @JsonProperty("allDeptIds")
    public void setAllDeptIds(List<Integer> allDeptIds){
        this.allDeptIds = allDeptIds;
    }

    public List<Integer> getAllPrivateLabelIds(){
        return allPrivateLabelIds;
    }

    @JsonProperty("allPrivateLabelIds")
    public void setAllPrivateLabelIds(List<Integer> allPrivateLabelIds){
        this.allPrivateLabelIds = allPrivateLabelIds;
    }

    public boolean getAllowColumnCustomization(){
        return allowColumnCustomization;
    }

    @JsonProperty("allowColumnCustomization")
    public void setAllowColumnCustomization(boolean allowColumnCustomization){
        this.allowColumnCustomization = allowColumnCustomization;
    }

    public boolean getAutoAddFromEmailEnabled(){
        return autoAddFromEmailEnabled;
    }

    @JsonProperty("autoAddFromEmailEnabled")
    public void setAutoAddFromEmailEnabled(boolean autoAddFromEmailEnabled){
        this.autoAddFromEmailEnabled = autoAddFromEmailEnabled;
    }

    public String getBboApiUrl(){
        return bboApiUrl;
    }

    @JsonProperty("bboApiUrl")
    public void setBboApiUrl(String bboApiUrl){
        this.bboApiUrl = bboApiUrl;
    }

    public String getBboName(){
        return bboName;
    }

    @JsonProperty("bboName")
    public void setBboName(String bboName){
        this.bboName = bboName;
    }

    public String getBullhornStaffingHost(){
        return bullhornStaffingHost;
    }

    @JsonProperty("bullhornStaffingHost")
    public void setBullhornStaffingHost(String bullhornStaffingHost){
        this.bullhornStaffingHost = bullhornStaffingHost;
    }

    public boolean getCandidateDashboard(){
        return candidateDashboard;
    }

    @JsonProperty("candidateDashboard")
    public void setCandidateDashboard(boolean candidateDashboard){
        this.candidateDashboard = candidateDashboard;
    }

    public List<String> getCandidateViewableConfidentialFields(){
        return candidateViewableConfidentialFields;
    }

    @JsonProperty("candidateViewableConfidentialFields")
    public void setCandidateViewableConfidentialFields(List<String> candidateViewableConfidentialFields){
        this.candidateViewableConfidentialFields = candidateViewableConfidentialFields;
    }

    public List<String> getCandidateWorkFlowSteps(){
        return candidateWorkFlowSteps;
    }

    @JsonProperty("candidateWorkFlowSteps")
    public void setCandidateWorkFlowSteps(List<String> candidateWorkFlowSteps){
        this.candidateWorkFlowSteps = candidateWorkFlowSteps;
    }

    public String getCareerPortalDomainRoot(){
        return careerPortalDomainRoot;
    }

    @JsonProperty("careerPortalDomainRoot")
    public void setCareerPortalDomainRoot(String careerPortalDomainRoot){
        this.careerPortalDomainRoot = careerPortalDomainRoot;
    }

    public boolean getCareerPortalEnabled(){
        return careerPortalEnabled;
    }

    @JsonProperty("careerPortalEnabled")
    public void setCareerPortalEnabled(boolean careerPortalEnabled){
        this.careerPortalEnabled = careerPortalEnabled;
    }

    public List<String> getClientContactWorkFlowSteps(){
        return clientContactWorkFlowSteps;
    }

    @JsonProperty("clientContactWorkFlowSteps")
    public void setClientContactWorkFlowSteps(List<String> clientContactWorkFlowSteps){
        this.clientContactWorkFlowSteps = clientContactWorkFlowSteps;
    }

    public List<String> getClientCorporationWorkFlowSteps(){
        return clientCorporationWorkFlowSteps;
    }

    @JsonProperty("clientCorporationWorkFlowSteps")
    public void setClientCorporationWorkFlowSteps(List<String> clientCorporationWorkFlowSteps){
        this.clientCorporationWorkFlowSteps = clientCorporationWorkFlowSteps;
    }

    public boolean getClientDashboard(){
        return clientDashboard;
    }

    @JsonProperty("clientDashboard")
    public void setClientDashboard(boolean clientDashboard){
        this.clientDashboard = clientDashboard;
    }

    public boolean getClientTracksAsEntities(){
        return clientTracksAsEntities;
    }

    @JsonProperty("clientTracksAsEntities")
    public void setClientTracksAsEntities(boolean clientTracksAsEntities){
        this.clientTracksAsEntities = clientTracksAsEntities;
    }

    public List<String> getCommentActionList(){
        return commentActionList;
    }

    @JsonProperty("commentActionList")
    public void setCommentActionList(List<String> commentActionList){
        this.commentActionList = commentActionList;
    }

    public boolean getCommercialEnabled(){
        return commercialEnabled;
    }

    @JsonProperty("commercialEnabled")
    public void setCommercialEnabled(boolean commercialEnabled){
        this.commercialEnabled = commercialEnabled;
    }

    public List<String> getConfidentialFieldList(){
        return confidentialFieldList;
    }

    @JsonProperty("confidentialFieldList")
    public void setConfidentialFieldList(List<String> confidentialFieldList){
        this.confidentialFieldList = confidentialFieldList;
    }

    public boolean getContactDashboard(){
        return contactDashboard;
    }

    @JsonProperty("contactDashboard")
    public void setContactDashboard(boolean contactDashboard){
        this.contactDashboard = contactDashboard;
    }

    public boolean getContactTracksAsEntities(){
        return contactTracksAsEntities;
    }

    @JsonProperty("contactTracksAsEntities")
    public void setContactTracksAsEntities(boolean contactTracksAsEntities){
        this.contactTracksAsEntities = contactTracksAsEntities;
    }

    public Integer getCorpPrivateLabelId(){
        return corpPrivateLabelId;
    }

    @JsonProperty("corpPrivateLabelId")
    public void setCorpPrivateLabelId(Integer corpPrivateLabelId){
        this.corpPrivateLabelId = corpPrivateLabelId;
    }

    public Integer getCorporationId(){
        return corporationId;
    }

    @JsonProperty("corporationId")
    public void setCorporationId(Integer corporationId){
        this.corporationId = corporationId;
    }

    public String getCorporationName(){
        return corporationName;
    }

    @JsonProperty("corporationName")
    public void setCorporationName(String corporationName){
        this.corporationName = corporationName;
    }

    public String getCurrencyFormat(){
        return currencyFormat;
    }

    @JsonProperty("currencyFormat")
    public void setCurrencyFormat(String currencyFormat){
        this.currencyFormat = currencyFormat;
    }

    public boolean getDashboardsEnabled(){
        return dashboardsEnabled;
    }

    @JsonProperty("dashboardsEnabled")
    public void setDashboardsEnabled(boolean dashboardsEnabled){
        this.dashboardsEnabled = dashboardsEnabled;
    }

    public Integer getDefaultCalendarReminder(){
        return defaultCalendarReminder;
    }

    @JsonProperty("defaultCalendarReminder")
    public void setDefaultCalendarReminder(Integer defaultCalendarReminder){
        this.defaultCalendarReminder = defaultCalendarReminder;
    }

    public List<String> getDefaultListColumnsCandidate(){
        return defaultListColumnsCandidate;
    }

    @JsonProperty("defaultListColumnsCandidate")
    public void setDefaultListColumnsCandidate(List<String> defaultListColumnsCandidate){
        this.defaultListColumnsCandidate = defaultListColumnsCandidate;
    }

    public List<String> getDefaultListColumnsClientContact(){
        return defaultListColumnsClientContact;
    }

    @JsonProperty("defaultListColumnsClientContact")
    public void setDefaultListColumnsClientContact(List<String> defaultListColumnsClientContact){
        this.defaultListColumnsClientContact = defaultListColumnsClientContact;
    }

    public List<String> getDefaultListColumnsClientCorporation(){
        return defaultListColumnsClientCorporation;
    }

    @JsonProperty("defaultListColumnsClientCorporation")
    public void setDefaultListColumnsClientCorporation(List<String> defaultListColumnsClientCorporation){
        this.defaultListColumnsClientCorporation = defaultListColumnsClientCorporation;
    }

    public List<String> getDefaultListColumnsClientCorporation1(){
        return defaultListColumnsClientCorporation1;
    }

    @JsonProperty("defaultListColumnsClientCorporation1")
    public void setDefaultListColumnsClientCorporation1(List<String> defaultListColumnsClientCorporation1){
        this.defaultListColumnsClientCorporation1 = defaultListColumnsClientCorporation1;
    }

    public List<String> getDefaultListColumnsClientCorporation2(){
        return defaultListColumnsClientCorporation2;
    }

    @JsonProperty("defaultListColumnsClientCorporation2")
    public void setDefaultListColumnsClientCorporation2(List<String> defaultListColumnsClientCorporation2){
        this.defaultListColumnsClientCorporation2 = defaultListColumnsClientCorporation2;
    }

    public List<String> getDefaultListColumnsClientCorporation3(){
        return defaultListColumnsClientCorporation3;
    }

    @JsonProperty("defaultListColumnsClientCorporation3")
    public void setDefaultListColumnsClientCorporation3(List<String> defaultListColumnsClientCorporation3){
        this.defaultListColumnsClientCorporation3 = defaultListColumnsClientCorporation3;
    }

    public List<String> getDefaultListColumnsClientCorporation4(){
        return defaultListColumnsClientCorporation4;
    }

    @JsonProperty("defaultListColumnsClientCorporation4")
    public void setDefaultListColumnsClientCorporation4(List<String> defaultListColumnsClientCorporation4){
        this.defaultListColumnsClientCorporation4 = defaultListColumnsClientCorporation4;
    }

    public List<String> getDefaultListColumnsClientCorporation5(){
        return defaultListColumnsClientCorporation5;
    }

    @JsonProperty("defaultListColumnsClientCorporation5")
    public void setDefaultListColumnsClientCorporation5(List<String> defaultListColumnsClientCorporation5){
        this.defaultListColumnsClientCorporation5 = defaultListColumnsClientCorporation5;
    }

    public List<String> getDefaultListColumnsHousingComplex(){
        return defaultListColumnsHousingComplex;
    }

    @JsonProperty("defaultListColumnsHousingComplex")
    public void setDefaultListColumnsHousingComplex(List<String> defaultListColumnsHousingComplex){
        this.defaultListColumnsHousingComplex = defaultListColumnsHousingComplex;
    }

    public List<String> getDefaultListColumnsJobOrder(){
        return defaultListColumnsJobOrder;
    }

    @JsonProperty("defaultListColumnsJobOrder")
    public void setDefaultListColumnsJobOrder(List<String> defaultListColumnsJobOrder){
        this.defaultListColumnsJobOrder = defaultListColumnsJobOrder;
    }

    public List<String> getDefaultListColumnsJobOrder1(){
        return defaultListColumnsJobOrder1;
    }

    @JsonProperty("defaultListColumnsJobOrder1")
    public void setDefaultListColumnsJobOrder1(List<String> defaultListColumnsJobOrder1){
        this.defaultListColumnsJobOrder1 = defaultListColumnsJobOrder1;
    }

    public List<String> getDefaultListColumnsJobOrder2(){
        return defaultListColumnsJobOrder2;
    }

    @JsonProperty("defaultListColumnsJobOrder2")
    public void setDefaultListColumnsJobOrder2(List<String> defaultListColumnsJobOrder2){
        this.defaultListColumnsJobOrder2 = defaultListColumnsJobOrder2;
    }

    public List<String> getDefaultListColumnsJobOrder3(){
        return defaultListColumnsJobOrder3;
    }

    @JsonProperty("defaultListColumnsJobOrder3")
    public void setDefaultListColumnsJobOrder3(List<String> defaultListColumnsJobOrder3){
        this.defaultListColumnsJobOrder3 = defaultListColumnsJobOrder3;
    }

    public List<String> getDefaultListColumnsJobOrder4(){
        return defaultListColumnsJobOrder4;
    }

    @JsonProperty("defaultListColumnsJobOrder4")
    public void setDefaultListColumnsJobOrder4(List<String> defaultListColumnsJobOrder4){
        this.defaultListColumnsJobOrder4 = defaultListColumnsJobOrder4;
    }

    public List<String> getDefaultListColumnsJobOrder5(){
        return defaultListColumnsJobOrder5;
    }

    @JsonProperty("defaultListColumnsJobOrder5")
    public void setDefaultListColumnsJobOrder5(List<String> defaultListColumnsJobOrder5){
        this.defaultListColumnsJobOrder5 = defaultListColumnsJobOrder5;
    }

    public List<String> getDefaultListColumnsJobSubmission(){
        return defaultListColumnsJobSubmission;
    }

    @JsonProperty("defaultListColumnsJobSubmission")
    public void setDefaultListColumnsJobSubmission(List<String> defaultListColumnsJobSubmission){
        this.defaultListColumnsJobSubmission = defaultListColumnsJobSubmission;
    }

    public List<String> getDefaultListColumnsLead(){
        return defaultListColumnsLead;
    }

    @JsonProperty("defaultListColumnsLead")
    public void setDefaultListColumnsLead(List<String> defaultListColumnsLead){
        this.defaultListColumnsLead = defaultListColumnsLead;
    }

    public List<String> getDefaultListColumnsOpportunity(){
        return defaultListColumnsOpportunity;
    }

    @JsonProperty("defaultListColumnsOpportunity")
    public void setDefaultListColumnsOpportunity(List<String> defaultListColumnsOpportunity){
        this.defaultListColumnsOpportunity = defaultListColumnsOpportunity;
    }

    public List<String> getDefaultListColumnsPlacement(){
        return defaultListColumnsPlacement;
    }

    @JsonProperty("defaultListColumnsPlacement")
    public void setDefaultListColumnsPlacement(List<String> defaultListColumnsPlacement){
        this.defaultListColumnsPlacement = defaultListColumnsPlacement;
    }

    public Integer getDefaultMinutesSpent(){
        return defaultMinutesSpent;
    }

    @JsonProperty("defaultMinutesSpent")
    public void setDefaultMinutesSpent(Integer defaultMinutesSpent){
        this.defaultMinutesSpent = defaultMinutesSpent;
    }

    public Integer getDeptId(){
        return deptId;
    }

    @JsonProperty("deptId")
    public void setDeptId(Integer deptId){
        this.deptId = deptId;
    }

    public Integer getEmailMaxTotalAttachmentSize(){
        return emailMaxTotalAttachmentSize;
    }

    @JsonProperty("emailMaxTotalAttachmentSize")
    public void setEmailMaxTotalAttachmentSize(Integer emailMaxTotalAttachmentSize){
        this.emailMaxTotalAttachmentSize = emailMaxTotalAttachmentSize;
    }

    public boolean getEmailTriggerWordsEnabled(){
        return emailTriggerWordsEnabled;
    }

    @JsonProperty("emailTriggerWordsEnabled")
    public void setEmailTriggerWordsEnabled(boolean emailTriggerWordsEnabled){
        this.emailTriggerWordsEnabled = emailTriggerWordsEnabled;
    }

    public boolean getEnterpriseEmailEnabled(){
        return enterpriseEmailEnabled;
    }

    @JsonProperty("enterpriseEmailEnabled")
    public void setEnterpriseEmailEnabled(boolean enterpriseEmailEnabled){
        this.enterpriseEmailEnabled = enterpriseEmailEnabled;
    }

    public String getEntityTitleCandidate(){
        return entityTitleCandidate;
    }

    @JsonProperty("entityTitleCandidate")
    public void setEntityTitleCandidate(String entityTitleCandidate){
        this.entityTitleCandidate = entityTitleCandidate;
    }

    public String getEntityTitleClientContact(){
        return entityTitleClientContact;
    }

    @JsonProperty("entityTitleClientContact")
    public void setEntityTitleClientContact(String entityTitleClientContact){
        this.entityTitleClientContact = entityTitleClientContact;
    }

    public String getEntityTitleClientCorporation(){
        return entityTitleClientCorporation;
    }

    @JsonProperty("entityTitleClientCorporation")
    public void setEntityTitleClientCorporation(String entityTitleClientCorporation){
        this.entityTitleClientCorporation = entityTitleClientCorporation;
    }

    public String getEntityTitleEducation(){
        return entityTitleEducation;
    }

    @JsonProperty("entityTitleEducation")
    public void setEntityTitleEducation(String entityTitleEducation){
        this.entityTitleEducation = entityTitleEducation;
    }

    public String getEntityTitleJobOrder(){
        return entityTitleJobOrder;
    }

    @JsonProperty("entityTitleJobOrder")
    public void setEntityTitleJobOrder(String entityTitleJobOrder){
        this.entityTitleJobOrder = entityTitleJobOrder;
    }

    public String getEntityTitleJobResponse(){
        return entityTitleJobResponse;
    }

    @JsonProperty("entityTitleJobResponse")
    public void setEntityTitleJobResponse(String entityTitleJobResponse){
        this.entityTitleJobResponse = entityTitleJobResponse;
    }

    public String getEntityTitleJobSubmission(){
        return entityTitleJobSubmission;
    }

    @JsonProperty("entityTitleJobSubmission")
    public void setEntityTitleJobSubmission(String entityTitleJobSubmission){
        this.entityTitleJobSubmission = entityTitleJobSubmission;
    }

    public String getEntityTitleLead(){
        return entityTitleLead;
    }

    @JsonProperty("entityTitleLead")
    public void setEntityTitleLead(String entityTitleLead){
        this.entityTitleLead = entityTitleLead;
    }

    public String getEntityTitleOpportunity(){
        return entityTitleOpportunity;
    }

    @JsonProperty("entityTitleOpportunity")
    public void setEntityTitleOpportunity(String entityTitleOpportunity){
        this.entityTitleOpportunity = entityTitleOpportunity;
    }

    public String getEntityTitlePlacement(){
        return entityTitlePlacement;
    }

    @JsonProperty("entityTitlePlacement")
    public void setEntityTitlePlacement(String entityTitlePlacement){
        this.entityTitlePlacement = entityTitlePlacement;
    }

    public String getEntityTitlePlacementChangeRequest(){
        return entityTitlePlacementChangeRequest;
    }

    @JsonProperty("entityTitlePlacementChangeRequest")
    public void setEntityTitlePlacementChangeRequest(String entityTitlePlacementChangeRequest){
        this.entityTitlePlacementChangeRequest = entityTitlePlacementChangeRequest;
    }

    public String getEntityTitleSendout(){
        return entityTitleSendout;
    }

    @JsonProperty("entityTitleSendout")
    public void setEntityTitleSendout(String entityTitleSendout){
        this.entityTitleSendout = entityTitleSendout;
    }

    public String getEntityTitleShortList(){
        return entityTitleShortList;
    }

    @JsonProperty("entityTitleShortList")
    public void setEntityTitleShortList(String entityTitleShortList){
        this.entityTitleShortList = entityTitleShortList;
    }

    public String getEntityTitleWorkHistory(){
        return entityTitleWorkHistory;
    }

    @JsonProperty("entityTitleWorkHistory")
    public void setEntityTitleWorkHistory(String entityTitleWorkHistory){
        this.entityTitleWorkHistory = entityTitleWorkHistory;
    }

    public String getExternalAccounts(){
        return externalAccounts;
    }

    @JsonProperty("externalAccounts")
    public void setExternalAccounts(String externalAccounts){
        this.externalAccounts = externalAccounts;
    }

    public Integer getFailedLoginLockoutThreshold(){
        return failedLoginLockoutThreshold;
    }

    @JsonProperty("failedLoginLockoutThreshold")
    public void setFailedLoginLockoutThreshold(Integer failedLoginLockoutThreshold){
        this.failedLoginLockoutThreshold = failedLoginLockoutThreshold;
    }

    public boolean getForwardingToStaffingAlias(){
        return forwardingToStaffingAlias;
    }

    @JsonProperty("forwardingToStaffingAlias")
    public void setForwardingToStaffingAlias(boolean forwardingToStaffingAlias){
        this.forwardingToStaffingAlias = forwardingToStaffingAlias;
    }

    public String getHeadingBGColorCandidate(){
        return headingBGColorCandidate;
    }

    @JsonProperty("headingBGColorCandidate")
    public void setHeadingBGColorCandidate(String headingBGColorCandidate){
        this.headingBGColorCandidate = headingBGColorCandidate;
    }

    public String getHeadingBGColorClientContact(){
        return headingBGColorClientContact;
    }

    @JsonProperty("headingBGColorClientContact")
    public void setHeadingBGColorClientContact(String headingBGColorClientContact){
        this.headingBGColorClientContact = headingBGColorClientContact;
    }

    public String getHeadingBGColorClientCorporation(){
        return headingBGColorClientCorporation;
    }

    @JsonProperty("headingBGColorClientCorporation")
    public void setHeadingBGColorClientCorporation(String headingBGColorClientCorporation){
        this.headingBGColorClientCorporation = headingBGColorClientCorporation;
    }

    public String getHeadingBGColorJobOrder(){
        return headingBGColorJobOrder;
    }

    @JsonProperty("headingBGColorJobOrder")
    public void setHeadingBGColorJobOrder(String headingBGColorJobOrder){
        this.headingBGColorJobOrder = headingBGColorJobOrder;
    }

    public String getHeadingBGColorLead(){
        return headingBGColorLead;
    }

    @JsonProperty("headingBGColorLead")
    public void setHeadingBGColorLead(String headingBGColorLead){
        this.headingBGColorLead = headingBGColorLead;
    }

    public String getHeadingBGColorOpportunity(){
        return headingBGColorOpportunity;
    }

    @JsonProperty("headingBGColorOpportunity")
    public void setHeadingBGColorOpportunity(String headingBGColorOpportunity){
        this.headingBGColorOpportunity = headingBGColorOpportunity;
    }

    public List<String> getInterviewScheduledJobResponseStatus(){
        return interviewScheduledJobResponseStatus;
    }

    @JsonProperty("interviewScheduledJobResponseStatus")
    public void setInterviewScheduledJobResponseStatus(List<String> interviewScheduledJobResponseStatus){
        this.interviewScheduledJobResponseStatus = interviewScheduledJobResponseStatus;
    }

    public boolean getIsBigDataEnabled(){
        return isBigDataEnabled;
    }

    @JsonProperty("isBigDataEnabled")
    public void setIsBigDataEnabled(boolean isBigDataEnabled){
        this.isBigDataEnabled = isBigDataEnabled;
    }

    public boolean getIsCRMOnly(){
        return isCRMOnly;
    }

    @JsonProperty("isCRMOnly")
    public void setIsCRMOnly(boolean isCRMOnly){
        this.isCRMOnly = isCRMOnly;
    }

    public boolean getIsNoteActionRequired(){
        return isNoteActionRequired;
    }

    @JsonProperty("isNoteActionRequired")
    public void setIsNoteActionRequired(boolean isNoteActionRequired){
        this.isNoteActionRequired = isNoteActionRequired;
    }

    public boolean getIsSelfSignup(){
        return isSelfSignup;
    }

    @JsonProperty("isSelfSignup")
    public void setIsSelfSignup(boolean isSelfSignup){
        this.isSelfSignup = isSelfSignup;
    }

    public boolean getJobDashboard(){
        return jobDashboard;
    }

    @JsonProperty("jobDashboard")
    public void setJobDashboard(boolean jobDashboard){
        this.jobDashboard = jobDashboard;
    }

    public List<String> getJobOrderWorkFlowSteps(){
        return jobOrderWorkFlowSteps;
    }

    @JsonProperty("jobOrderWorkFlowSteps")
    public void setJobOrderWorkFlowSteps(List<String> jobOrderWorkFlowSteps){
        this.jobOrderWorkFlowSteps = jobOrderWorkFlowSteps;
    }

    public List<String> getJobResponseStatusList(){
        return jobResponseStatusList;
    }

    @JsonProperty("jobResponseStatusList")
    public void setJobResponseStatusList(List<String> jobResponseStatusList){
        this.jobResponseStatusList = jobResponseStatusList;
    }

    public boolean getJobTracksAsEntities(){
        return jobTracksAsEntities;
    }

    @JsonProperty("jobTracksAsEntities")
    public void setJobTracksAsEntities(boolean jobTracksAsEntities){
        this.jobTracksAsEntities = jobTracksAsEntities;
    }

    public boolean getLeadAndOpportunityEnabled(){
        return leadAndOpportunityEnabled;
    }

    @JsonProperty("leadAndOpportunityEnabled")
    public void setLeadAndOpportunityEnabled(boolean leadAndOpportunityEnabled){
        this.leadAndOpportunityEnabled = leadAndOpportunityEnabled;
    }

    public boolean getLeadDashboard(){
        return leadDashboard;
    }

    @JsonProperty("leadDashboard")
    public void setLeadDashboard(boolean leadDashboard){
        this.leadDashboard = leadDashboard;
    }

    public List<String> getLeadWorkFlowSteps(){
        return leadWorkFlowSteps;
    }

    @JsonProperty("leadWorkFlowSteps")
    public void setLeadWorkFlowSteps(List<String> leadWorkFlowSteps){
        this.leadWorkFlowSteps = leadWorkFlowSteps;
    }

    public List<String> getListExpandedLeftCandidate(){
        return listExpandedLeftCandidate;
    }

    @JsonProperty("listExpandedLeftCandidate")
    public void setListExpandedLeftCandidate(List<String> listExpandedLeftCandidate){
        this.listExpandedLeftCandidate = listExpandedLeftCandidate;
    }

    public List<String> getListExpandedLeftClientContact(){
        return listExpandedLeftClientContact;
    }

    @JsonProperty("listExpandedLeftClientContact")
    public void setListExpandedLeftClientContact(List<String> listExpandedLeftClientContact){
        this.listExpandedLeftClientContact = listExpandedLeftClientContact;
    }

    public List<String> getListExpandedLeftClientCorporation(){
        return listExpandedLeftClientCorporation;
    }

    @JsonProperty("listExpandedLeftClientCorporation")
    public void setListExpandedLeftClientCorporation(List<String> listExpandedLeftClientCorporation){
        this.listExpandedLeftClientCorporation = listExpandedLeftClientCorporation;
    }

    public List<String> getListExpandedLeftClientCorporation1(){
        return listExpandedLeftClientCorporation1;
    }

    @JsonProperty("listExpandedLeftClientCorporation1")
    public void setListExpandedLeftClientCorporation1(List<String> listExpandedLeftClientCorporation1){
        this.listExpandedLeftClientCorporation1 = listExpandedLeftClientCorporation1;
    }

    public List<String> getListExpandedLeftClientCorporation2(){
        return listExpandedLeftClientCorporation2;
    }

    @JsonProperty("listExpandedLeftClientCorporation2")
    public void setListExpandedLeftClientCorporation2(List<String> listExpandedLeftClientCorporation2){
        this.listExpandedLeftClientCorporation2 = listExpandedLeftClientCorporation2;
    }

    public List<String> getListExpandedLeftClientCorporation3(){
        return listExpandedLeftClientCorporation3;
    }

    @JsonProperty("listExpandedLeftClientCorporation3")
    public void setListExpandedLeftClientCorporation3(List<String> listExpandedLeftClientCorporation3){
        this.listExpandedLeftClientCorporation3 = listExpandedLeftClientCorporation3;
    }

    public List<String> getListExpandedLeftClientCorporation4(){
        return listExpandedLeftClientCorporation4;
    }

    @JsonProperty("listExpandedLeftClientCorporation4")
    public void setListExpandedLeftClientCorporation4(List<String> listExpandedLeftClientCorporation4){
        this.listExpandedLeftClientCorporation4 = listExpandedLeftClientCorporation4;
    }

    public List<String> getListExpandedLeftClientCorporation5(){
        return listExpandedLeftClientCorporation5;
    }

    @JsonProperty("listExpandedLeftClientCorporation5")
    public void setListExpandedLeftClientCorporation5(List<String> listExpandedLeftClientCorporation5){
        this.listExpandedLeftClientCorporation5 = listExpandedLeftClientCorporation5;
    }

    public List<String> getListExpandedLeftHousingComplex(){
        return listExpandedLeftHousingComplex;
    }

    @JsonProperty("listExpandedLeftHousingComplex")
    public void setListExpandedLeftHousingComplex(List<String> listExpandedLeftHousingComplex){
        this.listExpandedLeftHousingComplex = listExpandedLeftHousingComplex;
    }

    public List<String> getListExpandedLeftJobOrder(){
        return listExpandedLeftJobOrder;
    }

    @JsonProperty("listExpandedLeftJobOrder")
    public void setListExpandedLeftJobOrder(List<String> listExpandedLeftJobOrder){
        this.listExpandedLeftJobOrder = listExpandedLeftJobOrder;
    }

    public List<String> getListExpandedLeftJobOrder1(){
        return listExpandedLeftJobOrder1;
    }

    @JsonProperty("listExpandedLeftJobOrder1")
    public void setListExpandedLeftJobOrder1(List<String> listExpandedLeftJobOrder1){
        this.listExpandedLeftJobOrder1 = listExpandedLeftJobOrder1;
    }

    public List<String> getListExpandedLeftJobOrder2(){
        return listExpandedLeftJobOrder2;
    }

    @JsonProperty("listExpandedLeftJobOrder2")
    public void setListExpandedLeftJobOrder2(List<String> listExpandedLeftJobOrder2){
        this.listExpandedLeftJobOrder2 = listExpandedLeftJobOrder2;
    }

    public List<String> getListExpandedLeftJobOrder3(){
        return listExpandedLeftJobOrder3;
    }

    @JsonProperty("listExpandedLeftJobOrder3")
    public void setListExpandedLeftJobOrder3(List<String> listExpandedLeftJobOrder3){
        this.listExpandedLeftJobOrder3 = listExpandedLeftJobOrder3;
    }

    public List<String> getListExpandedLeftJobOrder4(){
        return listExpandedLeftJobOrder4;
    }

    @JsonProperty("listExpandedLeftJobOrder4")
    public void setListExpandedLeftJobOrder4(List<String> listExpandedLeftJobOrder4){
        this.listExpandedLeftJobOrder4 = listExpandedLeftJobOrder4;
    }

    public List<String> getListExpandedLeftJobOrder5(){
        return listExpandedLeftJobOrder5;
    }

    @JsonProperty("listExpandedLeftJobOrder5")
    public void setListExpandedLeftJobOrder5(List<String> listExpandedLeftJobOrder5){
        this.listExpandedLeftJobOrder5 = listExpandedLeftJobOrder5;
    }

    public List<String> getListExpandedLeftLead(){
        return listExpandedLeftLead;
    }

    @JsonProperty("listExpandedLeftLead")
    public void setListExpandedLeftLead(List<String> listExpandedLeftLead){
        this.listExpandedLeftLead = listExpandedLeftLead;
    }

    public List<String> getListExpandedLeftOpportunity(){
        return listExpandedLeftOpportunity;
    }

    @JsonProperty("listExpandedLeftOpportunity")
    public void setListExpandedLeftOpportunity(List<String> listExpandedLeftOpportunity){
        this.listExpandedLeftOpportunity = listExpandedLeftOpportunity;
    }

    public List<String> getListExpandedLeftPlacement(){
        return listExpandedLeftPlacement;
    }

    @JsonProperty("listExpandedLeftPlacement")
    public void setListExpandedLeftPlacement(List<String> listExpandedLeftPlacement){
        this.listExpandedLeftPlacement = listExpandedLeftPlacement;
    }

    public List<String> getListExpandedMiddleCandidate(){
        return listExpandedMiddleCandidate;
    }

    @JsonProperty("listExpandedMiddleCandidate")
    public void setListExpandedMiddleCandidate(List<String> listExpandedMiddleCandidate){
        this.listExpandedMiddleCandidate = listExpandedMiddleCandidate;
    }

    public List<String> getListExpandedMiddleClientContact(){
        return listExpandedMiddleClientContact;
    }

    @JsonProperty("listExpandedMiddleClientContact")
    public void setListExpandedMiddleClientContact(List<String> listExpandedMiddleClientContact){
        this.listExpandedMiddleClientContact = listExpandedMiddleClientContact;
    }

    public List<String> getListExpandedMiddleJobOrder(){
        return listExpandedMiddleJobOrder;
    }

    @JsonProperty("listExpandedMiddleJobOrder")
    public void setListExpandedMiddleJobOrder(List<String> listExpandedMiddleJobOrder){
        this.listExpandedMiddleJobOrder = listExpandedMiddleJobOrder;
    }

    public List<String> getListExpandedRightCandidate(){
        return listExpandedRightCandidate;
    }

    @JsonProperty("listExpandedRightCandidate")
    public void setListExpandedRightCandidate(List<String> listExpandedRightCandidate){
        this.listExpandedRightCandidate = listExpandedRightCandidate;
    }

    public List<String> getListExpandedRightClientContact(){
        return listExpandedRightClientContact;
    }

    @JsonProperty("listExpandedRightClientContact")
    public void setListExpandedRightClientContact(List<String> listExpandedRightClientContact){
        this.listExpandedRightClientContact = listExpandedRightClientContact;
    }

    public List<String> getListExpandedRightJobOrder(){
        return listExpandedRightJobOrder;
    }

    @JsonProperty("listExpandedRightJobOrder")
    public void setListExpandedRightJobOrder(List<String> listExpandedRightJobOrder){
        this.listExpandedRightJobOrder = listExpandedRightJobOrder;
    }

    public String getLocale(){
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale){
        this.locale = locale;
    }

    public boolean getLuceneFastFindEnabled(){
        return luceneFastFindEnabled;
    }

    @JsonProperty("luceneFastFindEnabled")
    public void setLuceneFastFindEnabled(boolean luceneFastFindEnabled){
        this.luceneFastFindEnabled = luceneFastFindEnabled;
    }

    public boolean getMarketIntelligenceEnabled(){
        return marketIntelligenceEnabled;
    }

    @JsonProperty("marketIntelligenceEnabled")
    public void setMarketIntelligenceEnabled(boolean marketIntelligenceEnabled){
        this.marketIntelligenceEnabled = marketIntelligenceEnabled;
    }

    public String getMobileDefaultView(){
        return mobileDefaultView;
    }

    @JsonProperty("mobileDefaultView")
    public void setMobileDefaultView(String mobileDefaultView){
        this.mobileDefaultView = mobileDefaultView;
    }

    public boolean getMobileEnabled(){
        return mobileEnabled;
    }

    @JsonProperty("mobileEnabled")
    public void setMobileEnabled(boolean mobileEnabled){
        this.mobileEnabled = mobileEnabled;
    }

    public String getMobileWebAccess(){
        return mobileWebAccess;
    }

    @JsonProperty("mobileWebAccess")
    public void setMobileWebAccess(String mobileWebAccess){
        this.mobileWebAccess = mobileWebAccess;
    }

    public boolean getNovoEnabled(){
        return novoEnabled;
    }

    @JsonProperty("novoEnabled")
    public void setNovoEnabled(boolean novoEnabled){
        this.novoEnabled = novoEnabled;
    }

    public boolean getNpsEnabled(){
        return npsEnabled;
    }

    @JsonProperty("npsEnabled")
    public void setNpsEnabled(boolean npsEnabled){
        this.npsEnabled = npsEnabled;
    }

    public boolean getOpportunityDashboard(){
        return opportunityDashboard;
    }

    @JsonProperty("opportunityDashboard")
    public void setOpportunityDashboard(boolean opportunityDashboard){
        this.opportunityDashboard = opportunityDashboard;
    }

    public String getOpportunityStatusProbabilityToClose(){
        return opportunityStatusProbabilityToClose;
    }

    @JsonProperty("opportunityStatusProbabilityToClose")
    public void setOpportunityStatusProbabilityToClose(String opportunityStatusProbabilityToClose){
        this.opportunityStatusProbabilityToClose = opportunityStatusProbabilityToClose;
    }

    public List<String> getOpportunityWorkFlowSteps(){
        return opportunityWorkFlowSteps;
    }

    @JsonProperty("opportunityWorkFlowSteps")
    public void setOpportunityWorkFlowSteps(List<String> opportunityWorkFlowSteps){
        this.opportunityWorkFlowSteps = opportunityWorkFlowSteps;
    }

    public boolean getParseWebResponseResumeForExistingCNs(){
        return parseWebResponseResumeForExistingCNs;
    }

    @JsonProperty("parseWebResponseResumeForExistingCNs")
    public void setParseWebResponseResumeForExistingCNs(boolean parseWebResponseResumeForExistingCNs){
        this.parseWebResponseResumeForExistingCNs = parseWebResponseResumeForExistingCNs;
    }

    public boolean getPlacementDashboard(){
        return placementDashboard;
    }

    @JsonProperty("placementDashboard")
    public void setPlacementDashboard(boolean placementDashboard){
        this.placementDashboard = placementDashboard;
    }

    public Integer getPrivateLabelId(){
        return privateLabelId;
    }

    @JsonProperty("privateLabelId")
    public void setPrivateLabelId(Integer privateLabelId){
        this.privateLabelId = privateLabelId;
    }

    public boolean getQuickNoteEnabled(){
        return quickNoteEnabled;
    }

    @JsonProperty("quickNoteEnabled")
    public void setQuickNoteEnabled(boolean quickNoteEnabled){
        this.quickNoteEnabled = quickNoteEnabled;
    }

    public boolean getRememberLastCommentAction(){
        return rememberLastCommentAction;
    }

    @JsonProperty("rememberLastCommentAction")
    public void setRememberLastCommentAction(boolean rememberLastCommentAction){
        this.rememberLastCommentAction = rememberLastCommentAction;
    }

    public List<String> getResumeWizardSkillLevel(){
        return resumeWizardSkillLevel;
    }

    @JsonProperty("resumeWizardSkillLevel")
    public void setResumeWizardSkillLevel(List<String> resumeWizardSkillLevel){
        this.resumeWizardSkillLevel = resumeWizardSkillLevel;
    }

    public boolean getSubmissionDashboard(){
        return submissionDashboard;
    }

    @JsonProperty("submissionDashboard")
    public void setSubmissionDashboard(boolean submissionDashboard){
        this.submissionDashboard = submissionDashboard;
    }

    public String getTabletDefaultView(){
        return tabletDefaultView;
    }

    @JsonProperty("tabletDefaultView")
    public void setTabletDefaultView(String tabletDefaultView){
        this.tabletDefaultView = tabletDefaultView;
    }

    public boolean getUniversalSearchEnabled(){
        return universalSearchEnabled;
    }

    @JsonProperty("universalSearchEnabled")
    public void setUniversalSearchEnabled(boolean universalSearchEnabled){
        this.universalSearchEnabled = universalSearchEnabled;
    }

    public boolean getUseExactSearchForNoteAction(){
        return useExactSearchForNoteAction;
    }

    @JsonProperty("useExactSearchForNoteAction")
    public void setUseExactSearchForNoteAction(boolean useExactSearchForNoteAction){
        this.useExactSearchForNoteAction = useExactSearchForNoteAction;
    }

    public List<String> getUserEntitlements(){
        return userEntitlements;
    }

    @JsonProperty("userEntitlements")
    public void setUserEntitlements(List<String> userEntitlements){
        this.userEntitlements = userEntitlements;
    }

    public Integer getUserId(){
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public String getWebResponseLabel(){
        return webResponseLabel;
    }

    @JsonProperty("webResponseLabel")
    public void setWebResponseLabel(String webResponseLabel){
        this.webResponseLabel = webResponseLabel;
    }

    public String getZipRadiusSearchUnits(){
        return zipRadiusSearchUnits;
    }

    @JsonProperty("zipRadiusSearchUnits")
    public void setZipRadiusSearchUnits(String zipRadiusSearchUnits){
        this.zipRadiusSearchUnits = zipRadiusSearchUnits;
    }

    public String getZipRadiusSearchUnitsUserPref(){
        return zipRadiusSearchUnitsUserPref;
    }

    @JsonProperty("zipRadiusSearchUnitsUserPref")
    public void setZipRadiusSearchUnitsUserPref(String zipRadiusSearchUnitsUserPref){
        this.zipRadiusSearchUnitsUserPref = zipRadiusSearchUnitsUserPref;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Settings)) return false;

        Settings settings = (Settings) o;

        if (allowColumnCustomization != settings.allowColumnCustomization) return false;
        if (autoAddFromEmailEnabled != settings.autoAddFromEmailEnabled) return false;
        if (candidateDashboard != settings.candidateDashboard) return false;
        if (careerPortalEnabled != settings.careerPortalEnabled) return false;
        if (clientDashboard != settings.clientDashboard) return false;
        if (clientTracksAsEntities != settings.clientTracksAsEntities) return false;
        if (commercialEnabled != settings.commercialEnabled) return false;
        if (contactDashboard != settings.contactDashboard) return false;
        if (contactTracksAsEntities != settings.contactTracksAsEntities) return false;
        if (dashboardsEnabled != settings.dashboardsEnabled) return false;
        if (emailTriggerWordsEnabled != settings.emailTriggerWordsEnabled) return false;
        if (enterpriseEmailEnabled != settings.enterpriseEmailEnabled) return false;
        if (forwardingToStaffingAlias != settings.forwardingToStaffingAlias) return false;
        if (isBigDataEnabled != settings.isBigDataEnabled) return false;
        if (isCRMOnly != settings.isCRMOnly) return false;
        if (isNoteActionRequired != settings.isNoteActionRequired) return false;
        if (isSelfSignup != settings.isSelfSignup) return false;
        if (jobDashboard != settings.jobDashboard) return false;
        if (jobTracksAsEntities != settings.jobTracksAsEntities) return false;
        if (leadAndOpportunityEnabled != settings.leadAndOpportunityEnabled) return false;
        if (leadDashboard != settings.leadDashboard) return false;
        if (luceneFastFindEnabled != settings.luceneFastFindEnabled) return false;
        if (marketIntelligenceEnabled != settings.marketIntelligenceEnabled) return false;
        if (mobileEnabled != settings.mobileEnabled) return false;
        if (novoEnabled != settings.novoEnabled) return false;
        if (npsEnabled != settings.npsEnabled) return false;
        if (opportunityDashboard != settings.opportunityDashboard) return false;
        if (parseWebResponseResumeForExistingCNs != settings.parseWebResponseResumeForExistingCNs) return false;
        if (placementDashboard != settings.placementDashboard) return false;
        if (quickNoteEnabled != settings.quickNoteEnabled) return false;
        if (rememberLastCommentAction != settings.rememberLastCommentAction) return false;
        if (submissionDashboard != settings.submissionDashboard) return false;
        if (universalSearchEnabled != settings.universalSearchEnabled) return false;
        if (useExactSearchForNoteAction != settings.useExactSearchForNoteAction) return false;
        if (accountLockoutDuration != null ? !accountLockoutDuration.equals(settings.accountLockoutDuration) : settings.accountLockoutDuration != null)
            return false;
        if (allDeptIds != null ? !allDeptIds.equals(settings.allDeptIds) : settings.allDeptIds != null) return false;
        if (allPrivateLabelIds != null ? !allPrivateLabelIds.equals(settings.allPrivateLabelIds) : settings.allPrivateLabelIds != null)
            return false;
        if (bboApiUrl != null ? !bboApiUrl.equals(settings.bboApiUrl) : settings.bboApiUrl != null) return false;
        if (bboName != null ? !bboName.equals(settings.bboName) : settings.bboName != null) return false;
        if (bullhornStaffingHost != null ? !bullhornStaffingHost.equals(settings.bullhornStaffingHost) : settings.bullhornStaffingHost != null)
            return false;
        if (candidateViewableConfidentialFields != null ? !candidateViewableConfidentialFields.equals(settings.candidateViewableConfidentialFields) : settings.candidateViewableConfidentialFields != null)
            return false;
        if (candidateWorkFlowSteps != null ? !candidateWorkFlowSteps.equals(settings.candidateWorkFlowSteps) : settings.candidateWorkFlowSteps != null)
            return false;
        if (careerPortalDomainRoot != null ? !careerPortalDomainRoot.equals(settings.careerPortalDomainRoot) : settings.careerPortalDomainRoot != null)
            return false;
        if (clientContactWorkFlowSteps != null ? !clientContactWorkFlowSteps.equals(settings.clientContactWorkFlowSteps) : settings.clientContactWorkFlowSteps != null)
            return false;
        if (clientCorporationWorkFlowSteps != null ? !clientCorporationWorkFlowSteps.equals(settings.clientCorporationWorkFlowSteps) : settings.clientCorporationWorkFlowSteps != null)
            return false;
        if (commentActionList != null ? !commentActionList.equals(settings.commentActionList) : settings.commentActionList != null)
            return false;
        if (confidentialFieldList != null ? !confidentialFieldList.equals(settings.confidentialFieldList) : settings.confidentialFieldList != null)
            return false;
        if (corpPrivateLabelId != null ? !corpPrivateLabelId.equals(settings.corpPrivateLabelId) : settings.corpPrivateLabelId != null)
            return false;
        if (corporationId != null ? !corporationId.equals(settings.corporationId) : settings.corporationId != null)
            return false;
        if (corporationName != null ? !corporationName.equals(settings.corporationName) : settings.corporationName != null)
            return false;
        if (currencyFormat != null ? !currencyFormat.equals(settings.currencyFormat) : settings.currencyFormat != null)
            return false;
        if (defaultCalendarReminder != null ? !defaultCalendarReminder.equals(settings.defaultCalendarReminder) : settings.defaultCalendarReminder != null)
            return false;
        if (defaultListColumnsCandidate != null ? !defaultListColumnsCandidate.equals(settings.defaultListColumnsCandidate) : settings.defaultListColumnsCandidate != null)
            return false;
        if (defaultListColumnsClientContact != null ? !defaultListColumnsClientContact.equals(settings.defaultListColumnsClientContact) : settings.defaultListColumnsClientContact != null)
            return false;
        if (defaultListColumnsClientCorporation != null ? !defaultListColumnsClientCorporation.equals(settings.defaultListColumnsClientCorporation) : settings.defaultListColumnsClientCorporation != null)
            return false;
        if (defaultListColumnsClientCorporation1 != null ? !defaultListColumnsClientCorporation1.equals(settings.defaultListColumnsClientCorporation1) : settings.defaultListColumnsClientCorporation1 != null)
            return false;
        if (defaultListColumnsClientCorporation2 != null ? !defaultListColumnsClientCorporation2.equals(settings.defaultListColumnsClientCorporation2) : settings.defaultListColumnsClientCorporation2 != null)
            return false;
        if (defaultListColumnsClientCorporation3 != null ? !defaultListColumnsClientCorporation3.equals(settings.defaultListColumnsClientCorporation3) : settings.defaultListColumnsClientCorporation3 != null)
            return false;
        if (defaultListColumnsClientCorporation4 != null ? !defaultListColumnsClientCorporation4.equals(settings.defaultListColumnsClientCorporation4) : settings.defaultListColumnsClientCorporation4 != null)
            return false;
        if (defaultListColumnsClientCorporation5 != null ? !defaultListColumnsClientCorporation5.equals(settings.defaultListColumnsClientCorporation5) : settings.defaultListColumnsClientCorporation5 != null)
            return false;
        if (defaultListColumnsHousingComplex != null ? !defaultListColumnsHousingComplex.equals(settings.defaultListColumnsHousingComplex) : settings.defaultListColumnsHousingComplex != null)
            return false;
        if (defaultListColumnsJobOrder != null ? !defaultListColumnsJobOrder.equals(settings.defaultListColumnsJobOrder) : settings.defaultListColumnsJobOrder != null)
            return false;
        if (defaultListColumnsJobOrder1 != null ? !defaultListColumnsJobOrder1.equals(settings.defaultListColumnsJobOrder1) : settings.defaultListColumnsJobOrder1 != null)
            return false;
        if (defaultListColumnsJobOrder2 != null ? !defaultListColumnsJobOrder2.equals(settings.defaultListColumnsJobOrder2) : settings.defaultListColumnsJobOrder2 != null)
            return false;
        if (defaultListColumnsJobOrder3 != null ? !defaultListColumnsJobOrder3.equals(settings.defaultListColumnsJobOrder3) : settings.defaultListColumnsJobOrder3 != null)
            return false;
        if (defaultListColumnsJobOrder4 != null ? !defaultListColumnsJobOrder4.equals(settings.defaultListColumnsJobOrder4) : settings.defaultListColumnsJobOrder4 != null)
            return false;
        if (defaultListColumnsJobOrder5 != null ? !defaultListColumnsJobOrder5.equals(settings.defaultListColumnsJobOrder5) : settings.defaultListColumnsJobOrder5 != null)
            return false;
        if (defaultListColumnsJobSubmission != null ? !defaultListColumnsJobSubmission.equals(settings.defaultListColumnsJobSubmission) : settings.defaultListColumnsJobSubmission != null)
            return false;
        if (defaultListColumnsLead != null ? !defaultListColumnsLead.equals(settings.defaultListColumnsLead) : settings.defaultListColumnsLead != null)
            return false;
        if (defaultListColumnsOpportunity != null ? !defaultListColumnsOpportunity.equals(settings.defaultListColumnsOpportunity) : settings.defaultListColumnsOpportunity != null)
            return false;
        if (defaultListColumnsPlacement != null ? !defaultListColumnsPlacement.equals(settings.defaultListColumnsPlacement) : settings.defaultListColumnsPlacement != null)
            return false;
        if (defaultMinutesSpent != null ? !defaultMinutesSpent.equals(settings.defaultMinutesSpent) : settings.defaultMinutesSpent != null)
            return false;
        if (deptId != null ? !deptId.equals(settings.deptId) : settings.deptId != null) return false;
        if (emailMaxTotalAttachmentSize != null ? !emailMaxTotalAttachmentSize.equals(settings.emailMaxTotalAttachmentSize) : settings.emailMaxTotalAttachmentSize != null)
            return false;
        if (entityTitleCandidate != null ? !entityTitleCandidate.equals(settings.entityTitleCandidate) : settings.entityTitleCandidate != null)
            return false;
        if (entityTitleClientContact != null ? !entityTitleClientContact.equals(settings.entityTitleClientContact) : settings.entityTitleClientContact != null)
            return false;
        if (entityTitleClientCorporation != null ? !entityTitleClientCorporation.equals(settings.entityTitleClientCorporation) : settings.entityTitleClientCorporation != null)
            return false;
        if (entityTitleEducation != null ? !entityTitleEducation.equals(settings.entityTitleEducation) : settings.entityTitleEducation != null)
            return false;
        if (entityTitleJobOrder != null ? !entityTitleJobOrder.equals(settings.entityTitleJobOrder) : settings.entityTitleJobOrder != null)
            return false;
        if (entityTitleJobResponse != null ? !entityTitleJobResponse.equals(settings.entityTitleJobResponse) : settings.entityTitleJobResponse != null)
            return false;
        if (entityTitleJobSubmission != null ? !entityTitleJobSubmission.equals(settings.entityTitleJobSubmission) : settings.entityTitleJobSubmission != null)
            return false;
        if (entityTitleLead != null ? !entityTitleLead.equals(settings.entityTitleLead) : settings.entityTitleLead != null)
            return false;
        if (entityTitleOpportunity != null ? !entityTitleOpportunity.equals(settings.entityTitleOpportunity) : settings.entityTitleOpportunity != null)
            return false;
        if (entityTitlePlacement != null ? !entityTitlePlacement.equals(settings.entityTitlePlacement) : settings.entityTitlePlacement != null)
            return false;
        if (entityTitlePlacementChangeRequest != null ? !entityTitlePlacementChangeRequest.equals(settings.entityTitlePlacementChangeRequest) : settings.entityTitlePlacementChangeRequest != null)
            return false;
        if (entityTitleSendout != null ? !entityTitleSendout.equals(settings.entityTitleSendout) : settings.entityTitleSendout != null)
            return false;
        if (entityTitleShortList != null ? !entityTitleShortList.equals(settings.entityTitleShortList) : settings.entityTitleShortList != null)
            return false;
        if (entityTitleWorkHistory != null ? !entityTitleWorkHistory.equals(settings.entityTitleWorkHistory) : settings.entityTitleWorkHistory != null)
            return false;
        if (externalAccounts != null ? !externalAccounts.equals(settings.externalAccounts) : settings.externalAccounts != null)
            return false;
        if (failedLoginLockoutThreshold != null ? !failedLoginLockoutThreshold.equals(settings.failedLoginLockoutThreshold) : settings.failedLoginLockoutThreshold != null)
            return false;
        if (headingBGColorCandidate != null ? !headingBGColorCandidate.equals(settings.headingBGColorCandidate) : settings.headingBGColorCandidate != null)
            return false;
        if (headingBGColorClientContact != null ? !headingBGColorClientContact.equals(settings.headingBGColorClientContact) : settings.headingBGColorClientContact != null)
            return false;
        if (headingBGColorClientCorporation != null ? !headingBGColorClientCorporation.equals(settings.headingBGColorClientCorporation) : settings.headingBGColorClientCorporation != null)
            return false;
        if (headingBGColorJobOrder != null ? !headingBGColorJobOrder.equals(settings.headingBGColorJobOrder) : settings.headingBGColorJobOrder != null)
            return false;
        if (headingBGColorLead != null ? !headingBGColorLead.equals(settings.headingBGColorLead) : settings.headingBGColorLead != null)
            return false;
        if (headingBGColorOpportunity != null ? !headingBGColorOpportunity.equals(settings.headingBGColorOpportunity) : settings.headingBGColorOpportunity != null)
            return false;
        if (interviewScheduledJobResponseStatus != null ? !interviewScheduledJobResponseStatus.equals(settings.interviewScheduledJobResponseStatus) : settings.interviewScheduledJobResponseStatus != null)
            return false;
        if (jobOrderWorkFlowSteps != null ? !jobOrderWorkFlowSteps.equals(settings.jobOrderWorkFlowSteps) : settings.jobOrderWorkFlowSteps != null)
            return false;
        if (jobResponseStatusList != null ? !jobResponseStatusList.equals(settings.jobResponseStatusList) : settings.jobResponseStatusList != null)
            return false;
        if (leadWorkFlowSteps != null ? !leadWorkFlowSteps.equals(settings.leadWorkFlowSteps) : settings.leadWorkFlowSteps != null)
            return false;
        if (listExpandedLeftCandidate != null ? !listExpandedLeftCandidate.equals(settings.listExpandedLeftCandidate) : settings.listExpandedLeftCandidate != null)
            return false;
        if (listExpandedLeftClientContact != null ? !listExpandedLeftClientContact.equals(settings.listExpandedLeftClientContact) : settings.listExpandedLeftClientContact != null)
            return false;
        if (listExpandedLeftClientCorporation != null ? !listExpandedLeftClientCorporation.equals(settings.listExpandedLeftClientCorporation) : settings.listExpandedLeftClientCorporation != null)
            return false;
        if (listExpandedLeftClientCorporation1 != null ? !listExpandedLeftClientCorporation1.equals(settings.listExpandedLeftClientCorporation1) : settings.listExpandedLeftClientCorporation1 != null)
            return false;
        if (listExpandedLeftClientCorporation2 != null ? !listExpandedLeftClientCorporation2.equals(settings.listExpandedLeftClientCorporation2) : settings.listExpandedLeftClientCorporation2 != null)
            return false;
        if (listExpandedLeftClientCorporation3 != null ? !listExpandedLeftClientCorporation3.equals(settings.listExpandedLeftClientCorporation3) : settings.listExpandedLeftClientCorporation3 != null)
            return false;
        if (listExpandedLeftClientCorporation4 != null ? !listExpandedLeftClientCorporation4.equals(settings.listExpandedLeftClientCorporation4) : settings.listExpandedLeftClientCorporation4 != null)
            return false;
        if (listExpandedLeftClientCorporation5 != null ? !listExpandedLeftClientCorporation5.equals(settings.listExpandedLeftClientCorporation5) : settings.listExpandedLeftClientCorporation5 != null)
            return false;
        if (listExpandedLeftHousingComplex != null ? !listExpandedLeftHousingComplex.equals(settings.listExpandedLeftHousingComplex) : settings.listExpandedLeftHousingComplex != null)
            return false;
        if (listExpandedLeftJobOrder != null ? !listExpandedLeftJobOrder.equals(settings.listExpandedLeftJobOrder) : settings.listExpandedLeftJobOrder != null)
            return false;
        if (listExpandedLeftJobOrder1 != null ? !listExpandedLeftJobOrder1.equals(settings.listExpandedLeftJobOrder1) : settings.listExpandedLeftJobOrder1 != null)
            return false;
        if (listExpandedLeftJobOrder2 != null ? !listExpandedLeftJobOrder2.equals(settings.listExpandedLeftJobOrder2) : settings.listExpandedLeftJobOrder2 != null)
            return false;
        if (listExpandedLeftJobOrder3 != null ? !listExpandedLeftJobOrder3.equals(settings.listExpandedLeftJobOrder3) : settings.listExpandedLeftJobOrder3 != null)
            return false;
        if (listExpandedLeftJobOrder4 != null ? !listExpandedLeftJobOrder4.equals(settings.listExpandedLeftJobOrder4) : settings.listExpandedLeftJobOrder4 != null)
            return false;
        if (listExpandedLeftJobOrder5 != null ? !listExpandedLeftJobOrder5.equals(settings.listExpandedLeftJobOrder5) : settings.listExpandedLeftJobOrder5 != null)
            return false;
        if (listExpandedLeftLead != null ? !listExpandedLeftLead.equals(settings.listExpandedLeftLead) : settings.listExpandedLeftLead != null)
            return false;
        if (listExpandedLeftOpportunity != null ? !listExpandedLeftOpportunity.equals(settings.listExpandedLeftOpportunity) : settings.listExpandedLeftOpportunity != null)
            return false;
        if (listExpandedLeftPlacement != null ? !listExpandedLeftPlacement.equals(settings.listExpandedLeftPlacement) : settings.listExpandedLeftPlacement != null)
            return false;
        if (listExpandedMiddleCandidate != null ? !listExpandedMiddleCandidate.equals(settings.listExpandedMiddleCandidate) : settings.listExpandedMiddleCandidate != null)
            return false;
        if (listExpandedMiddleClientContact != null ? !listExpandedMiddleClientContact.equals(settings.listExpandedMiddleClientContact) : settings.listExpandedMiddleClientContact != null)
            return false;
        if (listExpandedMiddleJobOrder != null ? !listExpandedMiddleJobOrder.equals(settings.listExpandedMiddleJobOrder) : settings.listExpandedMiddleJobOrder != null)
            return false;
        if (listExpandedRightCandidate != null ? !listExpandedRightCandidate.equals(settings.listExpandedRightCandidate) : settings.listExpandedRightCandidate != null)
            return false;
        if (listExpandedRightClientContact != null ? !listExpandedRightClientContact.equals(settings.listExpandedRightClientContact) : settings.listExpandedRightClientContact != null)
            return false;
        if (listExpandedRightJobOrder != null ? !listExpandedRightJobOrder.equals(settings.listExpandedRightJobOrder) : settings.listExpandedRightJobOrder != null)
            return false;
        if (locale != null ? !locale.equals(settings.locale) : settings.locale != null) return false;
        if (mobileDefaultView != null ? !mobileDefaultView.equals(settings.mobileDefaultView) : settings.mobileDefaultView != null)
            return false;
        if (mobileWebAccess != null ? !mobileWebAccess.equals(settings.mobileWebAccess) : settings.mobileWebAccess != null)
            return false;
        if (opportunityStatusProbabilityToClose != null ? !opportunityStatusProbabilityToClose.equals(settings.opportunityStatusProbabilityToClose) : settings.opportunityStatusProbabilityToClose != null)
            return false;
        if (opportunityWorkFlowSteps != null ? !opportunityWorkFlowSteps.equals(settings.opportunityWorkFlowSteps) : settings.opportunityWorkFlowSteps != null)
            return false;
        if (privateLabelId != null ? !privateLabelId.equals(settings.privateLabelId) : settings.privateLabelId != null)
            return false;
        if (resumeWizardSkillLevel != null ? !resumeWizardSkillLevel.equals(settings.resumeWizardSkillLevel) : settings.resumeWizardSkillLevel != null)
            return false;
        if (tabletDefaultView != null ? !tabletDefaultView.equals(settings.tabletDefaultView) : settings.tabletDefaultView != null)
            return false;
        if (userEntitlements != null ? !userEntitlements.equals(settings.userEntitlements) : settings.userEntitlements != null)
            return false;
        if (userId != null ? !userId.equals(settings.userId) : settings.userId != null) return false;
        if (webResponseLabel != null ? !webResponseLabel.equals(settings.webResponseLabel) : settings.webResponseLabel != null)
            return false;
        if (zipRadiusSearchUnits != null ? !zipRadiusSearchUnits.equals(settings.zipRadiusSearchUnits) : settings.zipRadiusSearchUnits != null)
            return false;
        return !(zipRadiusSearchUnitsUserPref != null ? !zipRadiusSearchUnitsUserPref.equals(settings.zipRadiusSearchUnitsUserPref) : settings.zipRadiusSearchUnitsUserPref != null);

    }

    @Override
    public int hashCode() {
        int result = accountLockoutDuration != null ? accountLockoutDuration.hashCode() : 0;
        result = 31 * result + (allDeptIds != null ? allDeptIds.hashCode() : 0);
        result = 31 * result + (allPrivateLabelIds != null ? allPrivateLabelIds.hashCode() : 0);
        result = 31 * result + (allowColumnCustomization ? 1 : 0);
        result = 31 * result + (autoAddFromEmailEnabled ? 1 : 0);
        result = 31 * result + (bboApiUrl != null ? bboApiUrl.hashCode() : 0);
        result = 31 * result + (bboName != null ? bboName.hashCode() : 0);
        result = 31 * result + (bullhornStaffingHost != null ? bullhornStaffingHost.hashCode() : 0);
        result = 31 * result + (candidateDashboard ? 1 : 0);
        result = 31 * result + (candidateViewableConfidentialFields != null ? candidateViewableConfidentialFields.hashCode() : 0);
        result = 31 * result + (candidateWorkFlowSteps != null ? candidateWorkFlowSteps.hashCode() : 0);
        result = 31 * result + (careerPortalDomainRoot != null ? careerPortalDomainRoot.hashCode() : 0);
        result = 31 * result + (careerPortalEnabled ? 1 : 0);
        result = 31 * result + (clientContactWorkFlowSteps != null ? clientContactWorkFlowSteps.hashCode() : 0);
        result = 31 * result + (clientCorporationWorkFlowSteps != null ? clientCorporationWorkFlowSteps.hashCode() : 0);
        result = 31 * result + (clientDashboard ? 1 : 0);
        result = 31 * result + (clientTracksAsEntities ? 1 : 0);
        result = 31 * result + (commentActionList != null ? commentActionList.hashCode() : 0);
        result = 31 * result + (commercialEnabled ? 1 : 0);
        result = 31 * result + (confidentialFieldList != null ? confidentialFieldList.hashCode() : 0);
        result = 31 * result + (contactDashboard ? 1 : 0);
        result = 31 * result + (contactTracksAsEntities ? 1 : 0);
        result = 31 * result + (corpPrivateLabelId != null ? corpPrivateLabelId.hashCode() : 0);
        result = 31 * result + (corporationId != null ? corporationId.hashCode() : 0);
        result = 31 * result + (corporationName != null ? corporationName.hashCode() : 0);
        result = 31 * result + (currencyFormat != null ? currencyFormat.hashCode() : 0);
        result = 31 * result + (dashboardsEnabled ? 1 : 0);
        result = 31 * result + (defaultCalendarReminder != null ? defaultCalendarReminder.hashCode() : 0);
        result = 31 * result + (defaultListColumnsCandidate != null ? defaultListColumnsCandidate.hashCode() : 0);
        result = 31 * result + (defaultListColumnsClientContact != null ? defaultListColumnsClientContact.hashCode() : 0);
        result = 31 * result + (defaultListColumnsClientCorporation != null ? defaultListColumnsClientCorporation.hashCode() : 0);
        result = 31 * result + (defaultListColumnsClientCorporation1 != null ? defaultListColumnsClientCorporation1.hashCode() : 0);
        result = 31 * result + (defaultListColumnsClientCorporation2 != null ? defaultListColumnsClientCorporation2.hashCode() : 0);
        result = 31 * result + (defaultListColumnsClientCorporation3 != null ? defaultListColumnsClientCorporation3.hashCode() : 0);
        result = 31 * result + (defaultListColumnsClientCorporation4 != null ? defaultListColumnsClientCorporation4.hashCode() : 0);
        result = 31 * result + (defaultListColumnsClientCorporation5 != null ? defaultListColumnsClientCorporation5.hashCode() : 0);
        result = 31 * result + (defaultListColumnsHousingComplex != null ? defaultListColumnsHousingComplex.hashCode() : 0);
        result = 31 * result + (defaultListColumnsJobOrder != null ? defaultListColumnsJobOrder.hashCode() : 0);
        result = 31 * result + (defaultListColumnsJobOrder1 != null ? defaultListColumnsJobOrder1.hashCode() : 0);
        result = 31 * result + (defaultListColumnsJobOrder2 != null ? defaultListColumnsJobOrder2.hashCode() : 0);
        result = 31 * result + (defaultListColumnsJobOrder3 != null ? defaultListColumnsJobOrder3.hashCode() : 0);
        result = 31 * result + (defaultListColumnsJobOrder4 != null ? defaultListColumnsJobOrder4.hashCode() : 0);
        result = 31 * result + (defaultListColumnsJobOrder5 != null ? defaultListColumnsJobOrder5.hashCode() : 0);
        result = 31 * result + (defaultListColumnsJobSubmission != null ? defaultListColumnsJobSubmission.hashCode() : 0);
        result = 31 * result + (defaultListColumnsLead != null ? defaultListColumnsLead.hashCode() : 0);
        result = 31 * result + (defaultListColumnsOpportunity != null ? defaultListColumnsOpportunity.hashCode() : 0);
        result = 31 * result + (defaultListColumnsPlacement != null ? defaultListColumnsPlacement.hashCode() : 0);
        result = 31 * result + (defaultMinutesSpent != null ? defaultMinutesSpent.hashCode() : 0);
        result = 31 * result + (deptId != null ? deptId.hashCode() : 0);
        result = 31 * result + (emailMaxTotalAttachmentSize != null ? emailMaxTotalAttachmentSize.hashCode() : 0);
        result = 31 * result + (emailTriggerWordsEnabled ? 1 : 0);
        result = 31 * result + (enterpriseEmailEnabled ? 1 : 0);
        result = 31 * result + (entityTitleCandidate != null ? entityTitleCandidate.hashCode() : 0);
        result = 31 * result + (entityTitleClientContact != null ? entityTitleClientContact.hashCode() : 0);
        result = 31 * result + (entityTitleClientCorporation != null ? entityTitleClientCorporation.hashCode() : 0);
        result = 31 * result + (entityTitleEducation != null ? entityTitleEducation.hashCode() : 0);
        result = 31 * result + (entityTitleJobOrder != null ? entityTitleJobOrder.hashCode() : 0);
        result = 31 * result + (entityTitleJobResponse != null ? entityTitleJobResponse.hashCode() : 0);
        result = 31 * result + (entityTitleJobSubmission != null ? entityTitleJobSubmission.hashCode() : 0);
        result = 31 * result + (entityTitleLead != null ? entityTitleLead.hashCode() : 0);
        result = 31 * result + (entityTitleOpportunity != null ? entityTitleOpportunity.hashCode() : 0);
        result = 31 * result + (entityTitlePlacement != null ? entityTitlePlacement.hashCode() : 0);
        result = 31 * result + (entityTitlePlacementChangeRequest != null ? entityTitlePlacementChangeRequest.hashCode() : 0);
        result = 31 * result + (entityTitleSendout != null ? entityTitleSendout.hashCode() : 0);
        result = 31 * result + (entityTitleShortList != null ? entityTitleShortList.hashCode() : 0);
        result = 31 * result + (entityTitleWorkHistory != null ? entityTitleWorkHistory.hashCode() : 0);
        result = 31 * result + (externalAccounts != null ? externalAccounts.hashCode() : 0);
        result = 31 * result + (failedLoginLockoutThreshold != null ? failedLoginLockoutThreshold.hashCode() : 0);
        result = 31 * result + (forwardingToStaffingAlias ? 1 : 0);
        result = 31 * result + (headingBGColorCandidate != null ? headingBGColorCandidate.hashCode() : 0);
        result = 31 * result + (headingBGColorClientContact != null ? headingBGColorClientContact.hashCode() : 0);
        result = 31 * result + (headingBGColorClientCorporation != null ? headingBGColorClientCorporation.hashCode() : 0);
        result = 31 * result + (headingBGColorJobOrder != null ? headingBGColorJobOrder.hashCode() : 0);
        result = 31 * result + (headingBGColorLead != null ? headingBGColorLead.hashCode() : 0);
        result = 31 * result + (headingBGColorOpportunity != null ? headingBGColorOpportunity.hashCode() : 0);
        result = 31 * result + (interviewScheduledJobResponseStatus != null ? interviewScheduledJobResponseStatus.hashCode() : 0);
        result = 31 * result + (isBigDataEnabled ? 1 : 0);
        result = 31 * result + (isCRMOnly ? 1 : 0);
        result = 31 * result + (isNoteActionRequired ? 1 : 0);
        result = 31 * result + (isSelfSignup ? 1 : 0);
        result = 31 * result + (jobDashboard ? 1 : 0);
        result = 31 * result + (jobOrderWorkFlowSteps != null ? jobOrderWorkFlowSteps.hashCode() : 0);
        result = 31 * result + (jobResponseStatusList != null ? jobResponseStatusList.hashCode() : 0);
        result = 31 * result + (jobTracksAsEntities ? 1 : 0);
        result = 31 * result + (leadAndOpportunityEnabled ? 1 : 0);
        result = 31 * result + (leadDashboard ? 1 : 0);
        result = 31 * result + (leadWorkFlowSteps != null ? leadWorkFlowSteps.hashCode() : 0);
        result = 31 * result + (listExpandedLeftCandidate != null ? listExpandedLeftCandidate.hashCode() : 0);
        result = 31 * result + (listExpandedLeftClientContact != null ? listExpandedLeftClientContact.hashCode() : 0);
        result = 31 * result + (listExpandedLeftClientCorporation != null ? listExpandedLeftClientCorporation.hashCode() : 0);
        result = 31 * result + (listExpandedLeftClientCorporation1 != null ? listExpandedLeftClientCorporation1.hashCode() : 0);
        result = 31 * result + (listExpandedLeftClientCorporation2 != null ? listExpandedLeftClientCorporation2.hashCode() : 0);
        result = 31 * result + (listExpandedLeftClientCorporation3 != null ? listExpandedLeftClientCorporation3.hashCode() : 0);
        result = 31 * result + (listExpandedLeftClientCorporation4 != null ? listExpandedLeftClientCorporation4.hashCode() : 0);
        result = 31 * result + (listExpandedLeftClientCorporation5 != null ? listExpandedLeftClientCorporation5.hashCode() : 0);
        result = 31 * result + (listExpandedLeftHousingComplex != null ? listExpandedLeftHousingComplex.hashCode() : 0);
        result = 31 * result + (listExpandedLeftJobOrder != null ? listExpandedLeftJobOrder.hashCode() : 0);
        result = 31 * result + (listExpandedLeftJobOrder1 != null ? listExpandedLeftJobOrder1.hashCode() : 0);
        result = 31 * result + (listExpandedLeftJobOrder2 != null ? listExpandedLeftJobOrder2.hashCode() : 0);
        result = 31 * result + (listExpandedLeftJobOrder3 != null ? listExpandedLeftJobOrder3.hashCode() : 0);
        result = 31 * result + (listExpandedLeftJobOrder4 != null ? listExpandedLeftJobOrder4.hashCode() : 0);
        result = 31 * result + (listExpandedLeftJobOrder5 != null ? listExpandedLeftJobOrder5.hashCode() : 0);
        result = 31 * result + (listExpandedLeftLead != null ? listExpandedLeftLead.hashCode() : 0);
        result = 31 * result + (listExpandedLeftOpportunity != null ? listExpandedLeftOpportunity.hashCode() : 0);
        result = 31 * result + (listExpandedLeftPlacement != null ? listExpandedLeftPlacement.hashCode() : 0);
        result = 31 * result + (listExpandedMiddleCandidate != null ? listExpandedMiddleCandidate.hashCode() : 0);
        result = 31 * result + (listExpandedMiddleClientContact != null ? listExpandedMiddleClientContact.hashCode() : 0);
        result = 31 * result + (listExpandedMiddleJobOrder != null ? listExpandedMiddleJobOrder.hashCode() : 0);
        result = 31 * result + (listExpandedRightCandidate != null ? listExpandedRightCandidate.hashCode() : 0);
        result = 31 * result + (listExpandedRightClientContact != null ? listExpandedRightClientContact.hashCode() : 0);
        result = 31 * result + (listExpandedRightJobOrder != null ? listExpandedRightJobOrder.hashCode() : 0);
        result = 31 * result + (locale != null ? locale.hashCode() : 0);
        result = 31 * result + (luceneFastFindEnabled ? 1 : 0);
        result = 31 * result + (marketIntelligenceEnabled ? 1 : 0);
        result = 31 * result + (mobileDefaultView != null ? mobileDefaultView.hashCode() : 0);
        result = 31 * result + (mobileEnabled ? 1 : 0);
        result = 31 * result + (mobileWebAccess != null ? mobileWebAccess.hashCode() : 0);
        result = 31 * result + (novoEnabled ? 1 : 0);
        result = 31 * result + (npsEnabled ? 1 : 0);
        result = 31 * result + (opportunityDashboard ? 1 : 0);
        result = 31 * result + (opportunityStatusProbabilityToClose != null ? opportunityStatusProbabilityToClose.hashCode() : 0);
        result = 31 * result + (opportunityWorkFlowSteps != null ? opportunityWorkFlowSteps.hashCode() : 0);
        result = 31 * result + (parseWebResponseResumeForExistingCNs ? 1 : 0);
        result = 31 * result + (placementDashboard ? 1 : 0);
        result = 31 * result + (privateLabelId != null ? privateLabelId.hashCode() : 0);
        result = 31 * result + (quickNoteEnabled ? 1 : 0);
        result = 31 * result + (rememberLastCommentAction ? 1 : 0);
        result = 31 * result + (resumeWizardSkillLevel != null ? resumeWizardSkillLevel.hashCode() : 0);
        result = 31 * result + (submissionDashboard ? 1 : 0);
        result = 31 * result + (tabletDefaultView != null ? tabletDefaultView.hashCode() : 0);
        result = 31 * result + (universalSearchEnabled ? 1 : 0);
        result = 31 * result + (useExactSearchForNoteAction ? 1 : 0);
        result = 31 * result + (userEntitlements != null ? userEntitlements.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (webResponseLabel != null ? webResponseLabel.hashCode() : 0);
        result = 31 * result + (zipRadiusSearchUnits != null ? zipRadiusSearchUnits.hashCode() : 0);
        result = 31 * result + (zipRadiusSearchUnitsUserPref != null ? zipRadiusSearchUnitsUserPref.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "accountLockoutDuration=" + accountLockoutDuration +
                ", allDeptIds=" + allDeptIds +
                ", allPrivateLabelIds=" + allPrivateLabelIds +
                ", allowColumnCustomization=" + allowColumnCustomization +
                ", autoAddFromEmailEnabled=" + autoAddFromEmailEnabled +
                ", bboApiUrl='" + bboApiUrl + '\'' +
                ", bboName='" + bboName + '\'' +
                ", bullhornStaffingHost='" + bullhornStaffingHost + '\'' +
                ", candidateDashboard=" + candidateDashboard +
                ", candidateViewableConfidentialFields=" + candidateViewableConfidentialFields +
                ", candidateWorkFlowSteps=" + candidateWorkFlowSteps +
                ", careerPortalDomainRoot='" + careerPortalDomainRoot + '\'' +
                ", careerPortalEnabled=" + careerPortalEnabled +
                ", clientContactWorkFlowSteps=" + clientContactWorkFlowSteps +
                ", clientCorporationWorkFlowSteps=" + clientCorporationWorkFlowSteps +
                ", clientDashboard=" + clientDashboard +
                ", clientTracksAsEntities=" + clientTracksAsEntities +
                ", commentActionList=" + commentActionList +
                ", commercialEnabled=" + commercialEnabled +
                ", confidentialFieldList=" + confidentialFieldList +
                ", contactDashboard=" + contactDashboard +
                ", contactTracksAsEntities=" + contactTracksAsEntities +
                ", corpPrivateLabelId=" + corpPrivateLabelId +
                ", corporationId=" + corporationId +
                ", corporationName='" + corporationName + '\'' +
                ", currencyFormat='" + currencyFormat + '\'' +
                ", dashboardsEnabled=" + dashboardsEnabled +
                ", defaultCalendarReminder=" + defaultCalendarReminder +
                ", defaultListColumnsCandidate=" + defaultListColumnsCandidate +
                ", defaultListColumnsClientContact=" + defaultListColumnsClientContact +
                ", defaultListColumnsClientCorporation=" + defaultListColumnsClientCorporation +
                ", defaultListColumnsClientCorporation1=" + defaultListColumnsClientCorporation1 +
                ", defaultListColumnsClientCorporation2=" + defaultListColumnsClientCorporation2 +
                ", defaultListColumnsClientCorporation3=" + defaultListColumnsClientCorporation3 +
                ", defaultListColumnsClientCorporation4=" + defaultListColumnsClientCorporation4 +
                ", defaultListColumnsClientCorporation5=" + defaultListColumnsClientCorporation5 +
                ", defaultListColumnsHousingComplex=" + defaultListColumnsHousingComplex +
                ", defaultListColumnsJobOrder=" + defaultListColumnsJobOrder +
                ", defaultListColumnsJobOrder1=" + defaultListColumnsJobOrder1 +
                ", defaultListColumnsJobOrder2=" + defaultListColumnsJobOrder2 +
                ", defaultListColumnsJobOrder3=" + defaultListColumnsJobOrder3 +
                ", defaultListColumnsJobOrder4=" + defaultListColumnsJobOrder4 +
                ", defaultListColumnsJobOrder5=" + defaultListColumnsJobOrder5 +
                ", defaultListColumnsJobSubmission=" + defaultListColumnsJobSubmission +
                ", defaultListColumnsLead=" + defaultListColumnsLead +
                ", defaultListColumnsOpportunity=" + defaultListColumnsOpportunity +
                ", defaultListColumnsPlacement=" + defaultListColumnsPlacement +
                ", defaultMinutesSpent=" + defaultMinutesSpent +
                ", deptId=" + deptId +
                ", emailMaxTotalAttachmentSize=" + emailMaxTotalAttachmentSize +
                ", emailTriggerWordsEnabled=" + emailTriggerWordsEnabled +
                ", enterpriseEmailEnabled=" + enterpriseEmailEnabled +
                ", entityTitleCandidate='" + entityTitleCandidate + '\'' +
                ", entityTitleClientContact='" + entityTitleClientContact + '\'' +
                ", entityTitleClientCorporation='" + entityTitleClientCorporation + '\'' +
                ", entityTitleEducation='" + entityTitleEducation + '\'' +
                ", entityTitleJobOrder='" + entityTitleJobOrder + '\'' +
                ", entityTitleJobResponse='" + entityTitleJobResponse + '\'' +
                ", entityTitleJobSubmission='" + entityTitleJobSubmission + '\'' +
                ", entityTitleLead='" + entityTitleLead + '\'' +
                ", entityTitleOpportunity='" + entityTitleOpportunity + '\'' +
                ", entityTitlePlacement='" + entityTitlePlacement + '\'' +
                ", entityTitlePlacementChangeRequest='" + entityTitlePlacementChangeRequest + '\'' +
                ", entityTitleSendout='" + entityTitleSendout + '\'' +
                ", entityTitleShortList='" + entityTitleShortList + '\'' +
                ", entityTitleWorkHistory='" + entityTitleWorkHistory + '\'' +
                ", externalAccounts='" + externalAccounts + '\'' +
                ", failedLoginLockoutThreshold=" + failedLoginLockoutThreshold +
                ", forwardingToStaffingAlias=" + forwardingToStaffingAlias +
                ", headingBGColorCandidate='" + headingBGColorCandidate + '\'' +
                ", headingBGColorClientContact='" + headingBGColorClientContact + '\'' +
                ", headingBGColorClientCorporation='" + headingBGColorClientCorporation + '\'' +
                ", headingBGColorJobOrder='" + headingBGColorJobOrder + '\'' +
                ", headingBGColorLead='" + headingBGColorLead + '\'' +
                ", headingBGColorOpportunity='" + headingBGColorOpportunity + '\'' +
                ", interviewScheduledJobResponseStatus=" + interviewScheduledJobResponseStatus +
                ", isBigDataEnabled=" + isBigDataEnabled +
                ", isCRMOnly=" + isCRMOnly +
                ", isNoteActionRequired=" + isNoteActionRequired +
                ", isSelfSignup=" + isSelfSignup +
                ", jobDashboard=" + jobDashboard +
                ", jobOrderWorkFlowSteps=" + jobOrderWorkFlowSteps +
                ", jobResponseStatusList=" + jobResponseStatusList +
                ", jobTracksAsEntities=" + jobTracksAsEntities +
                ", leadAndOpportunityEnabled=" + leadAndOpportunityEnabled +
                ", leadDashboard=" + leadDashboard +
                ", leadWorkFlowSteps=" + leadWorkFlowSteps +
                ", listExpandedLeftCandidate=" + listExpandedLeftCandidate +
                ", listExpandedLeftClientContact=" + listExpandedLeftClientContact +
                ", listExpandedLeftClientCorporation=" + listExpandedLeftClientCorporation +
                ", listExpandedLeftClientCorporation1=" + listExpandedLeftClientCorporation1 +
                ", listExpandedLeftClientCorporation2=" + listExpandedLeftClientCorporation2 +
                ", listExpandedLeftClientCorporation3=" + listExpandedLeftClientCorporation3 +
                ", listExpandedLeftClientCorporation4=" + listExpandedLeftClientCorporation4 +
                ", listExpandedLeftClientCorporation5=" + listExpandedLeftClientCorporation5 +
                ", listExpandedLeftHousingComplex=" + listExpandedLeftHousingComplex +
                ", listExpandedLeftJobOrder=" + listExpandedLeftJobOrder +
                ", listExpandedLeftJobOrder1=" + listExpandedLeftJobOrder1 +
                ", listExpandedLeftJobOrder2=" + listExpandedLeftJobOrder2 +
                ", listExpandedLeftJobOrder3=" + listExpandedLeftJobOrder3 +
                ", listExpandedLeftJobOrder4=" + listExpandedLeftJobOrder4 +
                ", listExpandedLeftJobOrder5=" + listExpandedLeftJobOrder5 +
                ", listExpandedLeftLead=" + listExpandedLeftLead +
                ", listExpandedLeftOpportunity=" + listExpandedLeftOpportunity +
                ", listExpandedLeftPlacement=" + listExpandedLeftPlacement +
                ", listExpandedMiddleCandidate=" + listExpandedMiddleCandidate +
                ", listExpandedMiddleClientContact=" + listExpandedMiddleClientContact +
                ", listExpandedMiddleJobOrder=" + listExpandedMiddleJobOrder +
                ", listExpandedRightCandidate=" + listExpandedRightCandidate +
                ", listExpandedRightClientContact=" + listExpandedRightClientContact +
                ", listExpandedRightJobOrder=" + listExpandedRightJobOrder +
                ", locale='" + locale + '\'' +
                ", luceneFastFindEnabled=" + luceneFastFindEnabled +
                ", marketIntelligenceEnabled=" + marketIntelligenceEnabled +
                ", mobileDefaultView='" + mobileDefaultView + '\'' +
                ", mobileEnabled=" + mobileEnabled +
                ", mobileWebAccess='" + mobileWebAccess + '\'' +
                ", novoEnabled=" + novoEnabled +
                ", npsEnabled=" + npsEnabled +
                ", opportunityDashboard=" + opportunityDashboard +
                ", opportunityStatusProbabilityToClose='" + opportunityStatusProbabilityToClose + '\'' +
                ", opportunityWorkFlowSteps=" + opportunityWorkFlowSteps +
                ", parseWebResponseResumeForExistingCNs=" + parseWebResponseResumeForExistingCNs +
                ", placementDashboard=" + placementDashboard +
                ", privateLabelId=" + privateLabelId +
                ", quickNoteEnabled=" + quickNoteEnabled +
                ", rememberLastCommentAction=" + rememberLastCommentAction +
                ", resumeWizardSkillLevel=" + resumeWizardSkillLevel +
                ", submissionDashboard=" + submissionDashboard +
                ", tabletDefaultView='" + tabletDefaultView + '\'' +
                ", universalSearchEnabled=" + universalSearchEnabled +
                ", useExactSearchForNoteAction=" + useExactSearchForNoteAction +
                ", userEntitlements=" + userEntitlements +
                ", userId=" + userId +
                ", webResponseLabel='" + webResponseLabel + '\'' +
                ", zipRadiusSearchUnits='" + zipRadiusSearchUnits + '\'' +
                ", zipRadiusSearchUnitsUserPref='" + zipRadiusSearchUnitsUserPref + '\'' +
                '}';
    }
}