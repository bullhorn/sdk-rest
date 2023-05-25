package com.bullhornsdk.data;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Contains the PS Sandbox test entities that should be used in unit tests.
 *
 * @author magnus.palm
 */
public class TestEntities {

    private Integer appointmentId;

    private Integer appointmentAttendeeId;

    private Integer branchId;

    private Integer businessSectorId;

    private Integer candidateId;

    private Integer candidateCertificationId;

    private Integer candidateEducationId;

    private Integer candidateReferenceId;

    private Integer candidateWorkHistoryId;

    private Integer categoryId;

    private Integer certificationId;

    private Integer certificationGroupId;

    private Integer clientContactId;

    private Integer clientCorporationId;

    private Integer corporateUserId;

    private Integer corporationDepartmentId;

    private Integer countryId;

    private Integer departmentId;

    private Integer distributionListId;

    private Integer fileId;

    private Integer goalTargetId;

    private Integer housingComplexId;

    private Integer jobOrderId;

    private Integer jobBoardPostId;

    private Integer jobShiftId;

    private Integer jobSubmissionId;

    private Integer jobSubmissionHistoryId;

    private Integer leadId;

    private Integer noteId;

    private Set<Integer> noteIdList;

    private Integer noteEntityId;

    private Integer opportunityId;

    private Integer placementId;

    private Integer placementCertificationId;

    private Integer placementChangeRequestId;

    private Integer placementCommissionId;

    private Integer sendoutId;

    private Integer skillId;

    private Integer specialtyId;

    private Integer stateId;

    private Integer taskId;

    private Integer tearsheetId;

    private Integer timeUnitId;

    private Integer userSettingId;

    private Integer workersCompensationId;

    private Integer workersCompensationRateId;

    private Integer allCustomObjectsId;

    private Integer requestId;

    private String subscriptionId;

    private Integer candidateFileAttachmentId;

    private Integer certificationFileAttachmentId;

    private Integer clientContactFileAttachmentId;

    private Integer clientCorporationFileAttachmentId;

    private Integer jobOrderFileAttachmentId;

    private Integer opportunityFileAttachmentId;

    private Integer placementFileAttachmentId;

    private Integer localTaxFormId;

    private Integer stateTaxFormId;

    private Integer federalTaxFormId;

    private Integer unbilledRevenueDistributionId;

    private Integer invoiceTermVersionId;

    private Integer invoiceTermId;

    private Integer invoiceStatementLineItemId;

    private Integer invoiceStatementBatchId;

    private Integer invoiceStatementId;

    private Integer invoiceStatementDistributionBatchId;

    private Integer invoiceStatementHistoryId;

    private Integer placementShiftSetId;

    public TestEntities() {
        super();
        this.appointmentId = 1;

        this.appointmentAttendeeId = 1;

        this.branchId = 1;

        this.businessSectorId = 1;

        this.candidateId = 1;

        this.candidateCertificationId = 1;

        this.candidateEducationId = 1;

        this.candidateReferenceId = 1;

        this.candidateWorkHistoryId = 1;

        this.categoryId = 1;

        this.certificationId = 1;

        this.certificationGroupId = 1;

        this.clientContactId = 1;

        this.clientCorporationId = 1;

        this.corporateUserId = 1;

        this.corporationDepartmentId = 1;

        this.countryId = 1;

        this.departmentId = 1;

        this.distributionListId = 1;

        this.fileId = 1;

        this.goalTargetId = 1;

        this.housingComplexId = 1;

        this.jobOrderId = 1;

        this.jobBoardPostId = 1;

        this.jobShiftId = 1;

        this.jobSubmissionId = 1;

        this.jobSubmissionHistoryId = 1;

        this.leadId = 1;

        this.noteId = 1;

        this.noteIdList = Stream.of(1, 2).collect(Collectors.toSet());

        this.noteEntityId = 1;

        this.opportunityId = 1;

        this.placementId = 1;

        this.placementCertificationId = 1;

        this.placementChangeRequestId = 1;

        this.placementCommissionId = 1;

        this.sendoutId = 1;

        this.skillId = 1;

        this.specialtyId = 1;

        this.stateId = 1;

        this.taskId = 1;

        this.tearsheetId = 1;

        this.timeUnitId = 1;

        this.userSettingId = 1;

        this.workersCompensationId = 1;

        this.workersCompensationRateId = 1;

        this.allCustomObjectsId = 1;

        this.requestId = 1;

        this.subscriptionId = "bhps_test_subscription";

        this.candidateFileAttachmentId = 1;

        this.certificationFileAttachmentId = 1;

        this.clientContactFileAttachmentId = 1;

        this.clientCorporationFileAttachmentId = 1;

        this.jobOrderFileAttachmentId = 1;

        this.opportunityFileAttachmentId = 1;

        this.placementFileAttachmentId = 1;

        this.localTaxFormId = 1;

        this.stateTaxFormId = 1;

        this.federalTaxFormId = 1;

        this.unbilledRevenueDistributionId = 1;

        this.invoiceTermVersionId = 1;

        this.invoiceTermId = 1;

        this.invoiceStatementLineItemId = 1;

        this.invoiceStatementBatchId = 1;

        this.invoiceStatementId = 1;

        this.invoiceStatementDistributionBatchId = 1;

        this.invoiceStatementHistoryId = 1;

        this.placementShiftSetId = 1;
    }

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Integer getAppointmentAttendeeId() {
        return appointmentAttendeeId;
    }

    public void setAppointmentAttendeeId(Integer appointmentAttendeeId) {
        this.appointmentAttendeeId = appointmentAttendeeId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public Integer getBusinessSectorId() {
        return businessSectorId;
    }

    public void setBusinessSectorId(Integer businessSectorId) {
        this.businessSectorId = businessSectorId;
    }

    public Integer getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Integer candidateId) {
        this.candidateId = candidateId;
    }

    public Integer getCandidateEducationId() {
        return candidateEducationId;
    }

    public void setCandidateEducationId(Integer candidateEducationId) {
        this.candidateEducationId = candidateEducationId;
    }

    public Integer getCandidateReferenceId() {
        return candidateReferenceId;
    }

    public void setCandidateReferenceId(Integer candidateReferenceId) {
        this.candidateReferenceId = candidateReferenceId;
    }

    public Integer getCandidateWorkHistoryId() {
        return candidateWorkHistoryId;
    }

    public void setCandidateWorkHistoryId(Integer candidateWorkHistoryId) {
        this.candidateWorkHistoryId = candidateWorkHistoryId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCertificationId() {
        return certificationId;
    }

    public void setCertificationId(Integer certificationId) {
        this.certificationId = certificationId;
    }

    public Integer getCertificationGroupId() {
        return certificationGroupId;
    }

    public void setCertificationGroupId(Integer certificationGroupId) {
        this.certificationGroupId = certificationGroupId;
    }

    public Integer getClientContactId() {
        return clientContactId;
    }

    public void setClientContactId(Integer clientContactId) {
        this.clientContactId = clientContactId;
    }

    public Integer getClientCorporationId() {
        return clientCorporationId;
    }

    public void setClientCorporationId(Integer clientCorporationId) {
        this.clientCorporationId = clientCorporationId;
    }

    public Integer getCorporateUserId() {
        return corporateUserId;
    }

    public void setCorporateUserId(Integer corporateUserId) {
        this.corporateUserId = corporateUserId;
    }

    public Integer getCorporationDepartmentId() {
        return corporationDepartmentId;
    }

    public void setCorporationDepartmentId(Integer corporationDepartmentId) {
        this.corporationDepartmentId = corporationDepartmentId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getDistributionListId() {
        return distributionListId;
    }

    public void setDistributionListId(Integer distributionListId) {
        this.distributionListId = distributionListId;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getGoalTargetId() {
        return goalTargetId;
    }

    public void setGoalTargetId(Integer goalTargetId) {
        this.goalTargetId = goalTargetId;
    }

    public Integer getHousingComplexId() {
        return housingComplexId;
    }

    public void setHousingComplexId(Integer housingComplexId) {
        this.housingComplexId = housingComplexId;
    }

    public Integer getJobOrderId() {
        return jobOrderId;
    }

    public void setJobOrderId(Integer jobOrderId) {
        this.jobOrderId = jobOrderId;
    }

    public Integer getJobBoardPostId() {
        return jobBoardPostId;
    }

    public void setJobBoardPostId(Integer jobBoardPostId) {
        this.jobBoardPostId = jobBoardPostId;
    }

    public Integer getJobShiftId() {
        return jobShiftId;
    }

    public void setJobShiftId(Integer jobShiftId) {
        this.jobShiftId = jobShiftId;
    }

    public Integer getJobSubmissionId() {
        return jobSubmissionId;
    }

    public void setJobSubmissionId(Integer jobSubmissionId) {
        this.jobSubmissionId = jobSubmissionId;
    }

    public Integer getJobSubmissionHistoryId() {
        return jobSubmissionHistoryId;
    }

    public void setJobSubmissionHistoryId(Integer jobSubmissionHistoryId) {
        this.jobSubmissionHistoryId = jobSubmissionHistoryId;
    }

    public Integer getLeadId() {
        return leadId;
    }

    public void setLeadId(Integer leadId) {
        this.leadId = leadId;
    }

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public Set<Integer> getNoteIdList() {
        return noteIdList;
    }

    public void setNoteIdList(Set<Integer> noteIdList) {
        this.noteIdList = noteIdList;
    }

    public Integer getNoteEntityId() {
        return noteEntityId;
    }

    public void setNoteEntityId(Integer noteEntityId) {
        this.noteEntityId = noteEntityId;
    }

    public Integer getOpportunityId() {
        return opportunityId;
    }

    public void setOpportunityId(Integer opportunityId) {
        this.opportunityId = opportunityId;
    }

    public Integer getPlacementId() {
        return placementId;
    }

    public void setPlacementId(Integer placementId) {
        this.placementId = placementId;
    }

    public Integer getPlacementChangeRequestId() {
        return placementChangeRequestId;
    }

    public void setPlacementChangeRequestId(Integer placementChangeRequestId) {
        this.placementChangeRequestId = placementChangeRequestId;
    }

    public Integer getPlacementCommissionId() {
        return placementCommissionId;
    }

    public void setPlacementCommissionId(Integer placementCommissionId) {
        this.placementCommissionId = placementCommissionId;
    }

    public Integer getSendoutId() {
        return sendoutId;
    }

    public void setSendoutId(Integer sendoutId) {
        this.sendoutId = sendoutId;
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public Integer getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(Integer specialtyId) {
        this.specialtyId = specialtyId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getTimeUnitId() {
        return timeUnitId;
    }

    public void setTimeUnitId(Integer timeUnitId) {
        this.timeUnitId = timeUnitId;
    }

    public Integer getUserSettingId() {
        return userSettingId;
    }

    public void setUserSettingId(Integer userSettingId) {
        this.userSettingId = userSettingId;
    }

    public Integer getTearsheetId() {
        return tearsheetId;
    }

    public void setTearsheetId(Integer tearsheetId) {
        this.tearsheetId = tearsheetId;
    }

    public Integer getWorkersCompensationId() {
        return workersCompensationId;
    }

    public void setWorkersCompensationId(Integer workersCompensationId) {
        this.workersCompensationId = workersCompensationId;
    }

    public Integer getWorkersCompensationRateId() {
        return workersCompensationRateId;
    }

    public void setWorkersCompensationRateId(Integer workersCompensationRateId) {
        this.workersCompensationRateId = workersCompensationRateId;
    }

    public Integer getAllCustomObjectsId() {
        return allCustomObjectsId;
    }

    public void setAllCustomObjectsId(Integer allCustomObjectsId) {
        this.allCustomObjectsId = allCustomObjectsId;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public Integer getCandidateCertificationId() {
        return candidateCertificationId;
    }

    public void setCandidateCertificationId(Integer candidateCertificationId) {
        this.candidateCertificationId = candidateCertificationId;
    }

    public Integer getPlacementCertificationId() {
        return placementCertificationId;
    }

    public void setPlacementCertificationId(Integer placementCertificationId) {
        this.placementCertificationId = placementCertificationId;
    }

    public Integer getCandidateFileAttachmentId() {
        return candidateFileAttachmentId;
    }

    public void setCertificationFileAttachmentId(Integer certificationFileAttachmentId) {
        this.certificationFileAttachmentId = certificationFileAttachmentId;
    }

    public Integer getCertificationFileAttachmentId() {
        return certificationFileAttachmentId;
    }

    public void setCandidateFileAttachmentId(Integer candidateFileAttachmentId) {
        this.candidateFileAttachmentId = candidateFileAttachmentId;
    }

    public Integer getClientContactFileAttachmentId() {
        return clientContactFileAttachmentId;
    }

    public void setClientContactFileAttachmentId(Integer clientContactFileAttachmentId) {
        this.clientContactFileAttachmentId = clientContactFileAttachmentId;
    }

    public Integer getClientCorporationFileAttachmentId() {
        return clientCorporationFileAttachmentId;
    }

    public void setClientCorporationFileAttachmentId(Integer clientCorporationFileAttachmentId) {
        this.clientCorporationFileAttachmentId = clientCorporationFileAttachmentId;
    }

    public Integer getJobOrderFileAttachmentId() {
        return jobOrderFileAttachmentId;
    }

    public void setJobOrderFileAttachmentId(Integer jobOrderFileAttachmentId) {
        this.jobOrderFileAttachmentId = jobOrderFileAttachmentId;
    }

    public Integer getOpportunityFileAttachmentId() {
        return opportunityFileAttachmentId;
    }

    public void setOpportunityFileAttachmentId(Integer opportunityFileAttachmentId) {
        this.opportunityFileAttachmentId = opportunityFileAttachmentId;
    }

    public Integer getPlacementFileAttachmentId() {
        return placementFileAttachmentId;
    }

    public void setPlacementFileAttachmentId(Integer placementFileAttachmentId) {
        this.placementFileAttachmentId = placementFileAttachmentId;
    }

    public Integer getLocalTaxFormId() {
        return localTaxFormId;
    }

    public void setLocalTaxFormId(Integer localTaxFormId) {
        this.localTaxFormId = localTaxFormId;
    }

    public Integer getStateTaxFormId() {
        return stateTaxFormId;
    }

    public void setStateTaxFormId(Integer stateTaxFormId) {
        this.stateTaxFormId = stateTaxFormId;
    }

    public Integer getFederalTaxFormId() {
        return federalTaxFormId;
    }

    public void setFederalTaxFormId(Integer federalTaxFormId) {
        this.federalTaxFormId = federalTaxFormId;
    }

    public Integer getUnbilledRevenueDistributionId() {
        return unbilledRevenueDistributionId;
    }

    public void setUnbilledRevenueDistributionId(Integer unbilledRevenueDistributionId) {
        this.unbilledRevenueDistributionId = unbilledRevenueDistributionId;
    }

    public Integer getInvoiceTermVersionId() {
        return invoiceTermVersionId;
    }

    public void setInvoiceTermVersionId(Integer invoiceTermVersionId) {
        this.invoiceTermVersionId = invoiceTermVersionId;
    }

    public Integer getInvoiceTermId() {
        return invoiceTermId;
    }

    public void setInvoiceTermId(Integer invoiceTermId) {
        this.invoiceTermId = invoiceTermId;
    }

    public Integer getInvoiceStatementLineItemId() {
        return invoiceStatementLineItemId;
    }

    public void setInvoiceStatementLineItemId(Integer invoiceStatementLineItem) {
        this.invoiceStatementLineItemId = invoiceStatementLineItem;
    }

    public Integer getInvoiceStatementBatchId() {
        return invoiceStatementBatchId;
    }

    public void setInvoiceStatementBatchId(Integer invoiceStatementBatchId) {
        this.invoiceStatementBatchId = invoiceStatementBatchId;
    }

    public Integer getInvoiceStatementDistributionBatchId() {
        return invoiceStatementDistributionBatchId;
    }

    public void setInvoiceStatementDistributionBatchId(Integer invoiceStatementDistributionBatchId) {
        this.invoiceStatementDistributionBatchId = invoiceStatementDistributionBatchId;
    }

    public Integer getInvoiceStatementId() {
        return invoiceStatementId;
    }

    public void setInvoiceStatementId(Integer invoiceStatementId) {
        this.invoiceStatementId = invoiceStatementId;
    }

    public Integer getInvoiceStatementHistoryId() {
        return invoiceStatementHistoryId;
    }

    public void setInvoiceStatementHistoryId(Integer invoiceStatementHistoryId) {
        this.invoiceStatementHistoryId = invoiceStatementHistoryId;
    }

    public Integer getPlacementShiftSetId() { return placementShiftSetId; }

    public void setPlacementShiftSetId(Integer placementShiftSetId) {
        this.placementShiftSetId = placementShiftSetId;
    }

    @Override
    public String toString() {
        return "TestEntities{" +
            "appointmentId=" + appointmentId +
            ", appointmentAttendeeId=" + appointmentAttendeeId +
            ", branchId=" + branchId +
            ", businessSectorId=" + businessSectorId +
            ", candidateId=" + candidateId +
            ", candidateCertificationId=" + candidateCertificationId +
            ", candidateEducationId=" + candidateEducationId +
            ", candidateReferenceId=" + candidateReferenceId +
            ", candidateWorkHistoryId=" + candidateWorkHistoryId +
            ", categoryId=" + categoryId +
            ", certificationId=" + certificationId +
            ", certificationGroupId=" + certificationGroupId +
            ", clientContactId=" + clientContactId +
            ", clientCorporationId=" + clientCorporationId +
            ", corporateUserId=" + corporateUserId +
            ", corporationDepartmentId=" + corporationDepartmentId +
            ", countryId=" + countryId +
            ", departmentId=" + departmentId +
            ", distributionListId=" + distributionListId +
            ", fileId=" + fileId +
            ", goalTargetId=" + goalTargetId +
            ", housingComplexId=" + housingComplexId +
            ", jobOrderId=" + jobOrderId +
            ", jobBoardPostId=" + jobBoardPostId +
            ", jobShiftId=" + jobShiftId +
            ", jobSubmissionId=" + jobSubmissionId +
            ", jobSubmissionHistoryId=" + jobSubmissionHistoryId +
            ", leadId=" + leadId +
            ", noteId=" + noteId +
            ", noteIdList=" + noteIdList +
            ", noteEntityId=" + noteEntityId +
            ", opportunityId=" + opportunityId +
            ", placementId=" + placementId +
            ", placementCertificationId=" + placementCertificationId +
            ", placementChangeRequestId=" + placementChangeRequestId +
            ", placementCommissionId=" + placementCommissionId +
            ", sendoutId=" + sendoutId +
            ", skillId=" + skillId +
            ", specialtyId=" + specialtyId +
            ", stateId=" + stateId +
            ", taskId=" + taskId +
            ", tearsheetId=" + tearsheetId +
            ", timeUnitId=" + timeUnitId +
            ", userSettingId=" + userSettingId +
            ", workersCompensationId=" + workersCompensationId +
            ", workersCompensationRateId=" + workersCompensationRateId +
            ", allCustomObjectsId=" + allCustomObjectsId +
            ", requestId=" + requestId +
            ", subscriptionId='" + subscriptionId + '\'' +
            ", candidateFileAttachmentId=" + candidateFileAttachmentId +
            ", certificationFileAttachmentId=" + certificationFileAttachmentId +
            ", clientContactFileAttachmentId=" + clientContactFileAttachmentId +
            ", clientCorporationFileAttachmentId=" + clientCorporationFileAttachmentId +
            ", jobOrderFileAttachmentId=" + jobOrderFileAttachmentId +
            ", opportunityFileAttachmentId=" + opportunityFileAttachmentId +
            ", placementFileAttachmentId=" + placementFileAttachmentId +
            ", localTaxFormId=" + localTaxFormId +
            ", stateTaxFormId=" + stateTaxFormId +
            ", federalTaxFormId=" + federalTaxFormId +
            ", unbilledRevenueDistributionId=" + unbilledRevenueDistributionId +
            ", invoiceTermVersionId=" + invoiceTermVersionId +
            ", invoiceTermId=" + invoiceTermId +
            ", invoiceStatementLineItemId=" + invoiceStatementLineItemId +
            ", invoiceStatementBatchId=" + invoiceStatementBatchId +
            ", invoiceStatementId=" + invoiceStatementId +
            ", invoiceStatementDistributionBatchId=" + invoiceStatementDistributionBatchId +
            ", invoiceStatementHistoryId=" + invoiceStatementHistoryId +
            ", placementShiftSetId=" + placementShiftSetId +
            '}';
    }
}
