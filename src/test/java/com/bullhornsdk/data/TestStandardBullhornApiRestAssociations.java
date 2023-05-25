package com.bullhornsdk.data;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.paybill.distribution.UnbilledRevenueDistribution;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.*;
import com.bullhornsdk.data.model.entity.core.standard.PlacementShiftSet;
import com.google.common.collect.Sets;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.bullhornsdk.data.model.entity.association.AssociationFactory;
import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.core.standard.Branch;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.DistributionList;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.response.crud.CrudResponse;

public class TestStandardBullhornApiRestAssociations extends BaseTest {
    private final Logger log = LogManager.getLogger(TestStandardBullhornApiRestAssociations.class);

    public TestStandardBullhornApiRestAssociations() {
        super();
    }

    @Test
    public void testAssociateBranch() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Branch entity = bullhornData.findEntity(Branch.class, testEntities.getBranchId(), Sets.newHashSet("id", "corporateUsers"));
        Set<Integer> associationIds = new HashSet<Integer>();

        OneToMany<CorporateUser> linkedIds = entity.getCorporateUsers();

        if (linkedIds != null && !linkedIds.getData().isEmpty()) {
            associationIds.add(linkedIds.getData().get(0).getId());

            testAssociation(Branch.class, testEntities.getBranchId(), associationIds, AssociationFactory.branchAssociations().corporateUsers());
        }
    }

    @Test
    public void testAssociateCandidate() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(), getAssociationFieldSet(AssociationFactory.candidateAssociations()));
        for (AssociationField<Candidate, ? extends BullhornEntity> association : AssociationFactory.candidateAssociations().allAssociations()) {

            Set<Integer> associationIds = new HashSet<Integer>();
            OneToMany<? extends BullhornEntity> linkedIds = (OneToMany<? extends BullhornEntity>) PropertyUtils.getProperty(entity,
                association.getAssociationFieldName());
            if (linkedIds != null && !linkedIds.getData().isEmpty()) {

                associationIds.add(linkedIds.getData().get(0).getId());
                testAssociation(Candidate.class, testEntities.getCandidateId(), associationIds, association);

            }
        }

    }

    @Test
    public void testAssociateClientContact() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        ClientContact entity = bullhornData.findEntity(ClientContact.class, testEntities.getClientContactId(), getAssociationFieldSet(AssociationFactory.clientContactAssociations()));
        for (AssociationField<ClientContact, ? extends BullhornEntity> association : AssociationFactory.clientContactAssociations()
            .allAssociations()) {

            Set<Integer> associationIds = new HashSet<Integer>();
            OneToMany<? extends BullhornEntity> linkedIds = (OneToMany<? extends BullhornEntity>) PropertyUtils.getProperty(entity,
                association.getAssociationFieldName());
            if (linkedIds != null && !linkedIds.getData().isEmpty()) {

                associationIds.add(linkedIds.getData().get(0).getId());
                testAssociation(ClientContact.class, testEntities.getClientContactId(), associationIds, association);

            }
        }
    }

    @Test
    public void testAssociateClientCorporation() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        ClientCorporation entity = bullhornData.findEntity(ClientCorporation.class, testEntities.getClientCorporationId(), getAssociationFieldSet(AssociationFactory.clientCorporationAssociations()));
        for (AssociationField<ClientCorporation, ? extends BullhornEntity> association : AssociationFactory.clientCorporationAssociations()
            .allAssociations()) {

            Set<Integer> associationIds = new HashSet<Integer>();
            OneToMany<? extends BullhornEntity> linkedIds = (OneToMany<? extends BullhornEntity>) PropertyUtils.getProperty(entity,
                association.getAssociationFieldName());
            if (linkedIds != null && !linkedIds.getData().isEmpty()) {

                associationIds.add(linkedIds.getData().get(0).getId());
                testAssociation(ClientCorporation.class, testEntities.getClientCorporationId(), associationIds, association);

            }
        }
    }

    @Test
    public void testAssociateJobOrder() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        JobOrder entity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId(), getAssociationFieldSet(AssociationFactory.jobOrderAssociations()));
        for (AssociationField<JobOrder, ? extends BullhornEntity> association : AssociationFactory.jobOrderAssociations().allAssociations()) {

            Set<Integer> associationIds = new HashSet<Integer>();
            OneToMany<? extends BullhornEntity> linkedIds = (OneToMany<? extends BullhornEntity>) PropertyUtils.getProperty(entity,
                association.getAssociationFieldName());
            if (linkedIds != null && !linkedIds.getData().isEmpty()) {

                associationIds.add(linkedIds.getData().get(0).getId());
                testAssociation(JobOrder.class, testEntities.getJobOrderId(), associationIds, association);

            }
        }

    }

    @Test
    public void testAssociateLead() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Lead entity = bullhornData.findEntity(Lead.class, testEntities.getLeadId(), getAssociationFieldSet(AssociationFactory.leadAssociations()));
        for (AssociationField<Lead, ? extends BullhornEntity> association : AssociationFactory.leadAssociations().allAssociations()) {

            Set<Integer> associationIds = new HashSet<Integer>();
            OneToMany<? extends BullhornEntity> linkedIds = (OneToMany<? extends BullhornEntity>) PropertyUtils.getProperty(entity,
                association.getAssociationFieldName());
            if (linkedIds != null && !linkedIds.getData().isEmpty()) {

                associationIds.add(linkedIds.getData().get(0).getId());
                testAssociation(Lead.class, testEntities.getLeadId(), associationIds, association);

            }
        }
    }

    @Test
    public void testAssociateUnbilledRevenueDistribution() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        UnbilledRevenueDistribution entity = bullhornData.findEntity(UnbilledRevenueDistribution.class, testEntities.getUnbilledRevenueDistributionId(), getAssociationFieldSet(AssociationFactory.unbilledRevenueDistributionAssociations()));
        for (AssociationField<UnbilledRevenueDistribution, ? extends BullhornEntity> association : AssociationFactory.unbilledRevenueDistributionAssociations().allAssociations()) {

            Set<Integer> associationIds = new HashSet<Integer>();
            OneToMany<? extends BullhornEntity> linkedIds = (OneToMany<? extends BullhornEntity>) PropertyUtils.getProperty(entity,
                association.getAssociationFieldName());
            if (linkedIds != null && !linkedIds.getData().isEmpty()) {

                associationIds.add(linkedIds.getData().get(0).getId());
                testAssociation(UnbilledRevenueDistribution.class, testEntities.getUnbilledRevenueDistributionId(), associationIds, association);

            }
        }
    }

    @Test
    public void testAssociateInvoiceTerm() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        InvoiceTerm entity = bullhornData.findEntity(InvoiceTerm.class, testEntities.getInvoiceTermId(), getAssociationFieldSet(AssociationFactory.invoiceTermAssociations()));
        for (AssociationField<InvoiceTerm, ? extends BullhornEntity> association : AssociationFactory.invoiceTermAssociations().allAssociations()) {

            Set<Integer> associationIds = new HashSet<Integer>();
            OneToMany<? extends BullhornEntity> linkedIds = (OneToMany<? extends BullhornEntity>) PropertyUtils.getProperty(entity,
                association.getAssociationFieldName());
            if (linkedIds != null && !linkedIds.getData().isEmpty()) {

                associationIds.add(linkedIds.getData().get(0).getId());
                testAssociation(InvoiceTerm.class, testEntities.getInvoiceTermId(), associationIds, association);

            }
        }
    }

    @Test
    public void testAssociateInvoiceStatementLineItem() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        InvoiceStatementLineItem entity = bullhornData.findEntity(InvoiceStatementLineItem.class, testEntities.getInvoiceStatementLineItemId(), getAssociationFieldSet(AssociationFactory.invoiceStatementLineItemAssociations()));
        for (AssociationField<InvoiceStatementLineItem, ? extends BullhornEntity> association : AssociationFactory.invoiceStatementLineItemAssociations().allAssociations()) {

            Set<Integer> associationIds = new HashSet<Integer>();
            OneToMany<? extends BullhornEntity> linkedIds = (OneToMany<? extends BullhornEntity>) PropertyUtils.getProperty(entity,
                association.getAssociationFieldName());
            if (linkedIds != null && !linkedIds.getData().isEmpty()) {

                associationIds.add(linkedIds.getData().get(0).getId());
                testAssociation(InvoiceStatementLineItem.class, testEntities.getInvoiceStatementLineItemId(), associationIds, association);

            }
        }
    }

    @Test
    public void testAssociateInvoiceStatement() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        InvoiceStatement entity = bullhornData.findEntity(InvoiceStatement.class, testEntities.getInvoiceStatementId(), getAssociationFieldSet(AssociationFactory.invoiceStatementAssociations()));
        for (AssociationField<InvoiceStatement, ? extends BullhornEntity> association : AssociationFactory.invoiceStatementAssociations().allAssociations()) {

            Set<Integer> associationIds = new HashSet<Integer>();
            OneToMany<? extends BullhornEntity> linkedIds = (OneToMany<? extends BullhornEntity>) PropertyUtils.getProperty(entity,
                association.getAssociationFieldName());
            if (linkedIds != null && !linkedIds.getData().isEmpty()) {

                associationIds.add(linkedIds.getData().get(0).getId());
                testAssociation(InvoiceStatement.class, testEntities.getInvoiceStatementId(), associationIds, association);

            }
        }
    }

    @Test
    public void testAssociateInvoiceStatementBatch() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        InvoiceStatementBatch entity = bullhornData.findEntity(InvoiceStatementBatch.class, testEntities.getInvoiceStatementBatchId(), getAssociationFieldSet(AssociationFactory.invoiceStatementBatchAssociations()));
        for (AssociationField<InvoiceStatementBatch, ? extends BullhornEntity> association : AssociationFactory.invoiceStatementBatchAssociations().allAssociations()) {

            Set<Integer> associationIds = new HashSet<Integer>();
            OneToMany<? extends BullhornEntity> linkedIds = (OneToMany<? extends BullhornEntity>) PropertyUtils.getProperty(entity,
                association.getAssociationFieldName());
            if (linkedIds != null && !linkedIds.getData().isEmpty()) {

                associationIds.add(linkedIds.getData().get(0).getId());
                testAssociation(InvoiceStatementBatch.class, testEntities.getInvoiceStatementBatchId(), associationIds, association);

            }
        }
    }

    @Test
    public void testAssociateInvoiceStatementDistributionBatch() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        InvoiceStatementDistributionBatch entity = bullhornData.findEntity(InvoiceStatementDistributionBatch.class, testEntities.getInvoiceStatementDistributionBatchId(), getAssociationFieldSet(AssociationFactory.invoiceStatementDistributionBatchAssociations()));
        for (AssociationField<InvoiceStatementDistributionBatch, ? extends BullhornEntity> association : AssociationFactory.invoiceStatementDistributionBatchAssociations().allAssociations()) {

            Set<Integer> associationIds = new HashSet<Integer>();
            OneToMany<? extends BullhornEntity> linkedIds = (OneToMany<? extends BullhornEntity>) PropertyUtils.getProperty(entity,
                association.getAssociationFieldName());
            if (linkedIds != null && !linkedIds.getData().isEmpty()) {

                associationIds.add(linkedIds.getData().get(0).getId());
                testAssociation(InvoiceStatementDistributionBatch.class, testEntities.getInvoiceStatementDistributionBatchId(), associationIds, association);

            }
        }
    }

    @Test
    public void testAssociateNote() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Note entity = bullhornData.findEntity(Note.class, testEntities.getNoteId(), getAssociationFieldSet(AssociationFactory.noteAssociations()));
        for (AssociationField<Note, ? extends BullhornEntity> association : AssociationFactory.noteAssociations().allAssociations()) {

            Set<Integer> associationIds = new HashSet<Integer>();
            OneToMany<? extends BullhornEntity> linkedIds = (OneToMany<? extends BullhornEntity>) PropertyUtils.getProperty(entity,
                association.getAssociationFieldName());
            if (linkedIds != null && !linkedIds.getData().isEmpty()) {

                associationIds.add(linkedIds.getData().get(0).getId());
                testAssociation(Note.class, testEntities.getNoteId(), associationIds, association);

            }
        }
    }

    @Test
    public void testAssociateOpportunity() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Opportunity entity = bullhornData.findEntity(Opportunity.class, testEntities.getOpportunityId(), getAssociationFieldSet(AssociationFactory.opportunityAssociations()));
        for (AssociationField<Opportunity, ? extends BullhornEntity> association : AssociationFactory.opportunityAssociations().allAssociations()) {

            Set<Integer> associationIds = new HashSet<Integer>();
            OneToMany<? extends BullhornEntity> linkedIds = (OneToMany<? extends BullhornEntity>) PropertyUtils.getProperty(entity,
                association.getAssociationFieldName());
            if (linkedIds != null && !linkedIds.getData().isEmpty()) {

                associationIds.add(linkedIds.getData().get(0).getId());
                testAssociation(Opportunity.class, testEntities.getOpportunityId(), associationIds, association);

            }
        }
    }

    @Test
    public void testAssociatePlacement() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Placement entity = bullhornData.findEntity(Placement.class, testEntities.getPlacementId(), getAssociationFieldSet(AssociationFactory.placementAssociations()));
        for (AssociationField<Placement, ? extends BullhornEntity> association : AssociationFactory.placementAssociations().allAssociations()) {

            Set<Integer> associationIds = new HashSet<Integer>();
            OneToMany<? extends BullhornEntity> linkedIds = (OneToMany<? extends BullhornEntity>) PropertyUtils.getProperty(entity,
                association.getAssociationFieldName());
            if (linkedIds != null && !linkedIds.getData().isEmpty()) {

                associationIds.add(linkedIds.getData().get(0).getId());

                testAssociation(Placement.class, testEntities.getPlacementId(), associationIds, association);

            }
        }
    }

    @Test
    public void testAssociateDistributionList() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        DistributionList entity = bullhornData.findEntity(DistributionList.class, testEntities.getDistributionListId(), getAssociationFieldSet(AssociationFactory.distributionListAssociations()));

        for (AssociationField<DistributionList, ? extends BullhornEntity> association : AssociationFactory.distributionListAssociations().allAssociations()) {
            Set<Integer> associationIds = new HashSet<Integer>();

            OneToMany<? extends BullhornEntity> linkedIds = (OneToMany<? extends BullhornEntity>) PropertyUtils.getProperty(entity, association.getAssociationFieldName());

            if (linkedIds != null && !linkedIds.getData().isEmpty()) {
                associationIds.add(linkedIds.getData().get(0).getId());

                testAssociation(DistributionList.class, testEntities.getDistributionListId(), associationIds, association);
            }
        }
    }

    @Test
    public void testAssociatePlacementShiftSet() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        PlacementShiftSet entity = bullhornData.findEntity(PlacementShiftSet.class, testEntities.getPlacementShiftSetId(), getAssociationFieldSet(AssociationFactory.placementShiftSetAssociations()));
        for (AssociationField<PlacementShiftSet, ? extends BullhornEntity> association : AssociationFactory.placementShiftSetAssociations().allAssociations()) {

            Set<Integer> associationIds = new HashSet<Integer>();
            OneToMany<? extends BullhornEntity> linkedIds = (OneToMany<? extends BullhornEntity>) PropertyUtils.getProperty(entity,
                association.getAssociationFieldName());
            if (linkedIds != null && !linkedIds.getData().isEmpty()) {

                associationIds.add(linkedIds.getData().get(0).getId());
                testAssociation(PlacementShiftSet.class, testEntities.getPlacementShiftSetId(), associationIds, association);

            }
        }
    }

    private <T extends AssociationEntity> Set<String> getAssociationFieldSet(EntityAssociations<T> associations) {
        return Sets.union(associations.allAssociations().stream().map(association -> {
            return association.getAssociationFieldName();
        }).collect(Collectors.toSet()), Sets.newHashSet("id"));
    }

    private <T extends AssociationEntity> void testAssociation(Class<T> type, Integer entityId, Set<Integer> associationIds,
                                                               AssociationField<T, ? extends BullhornEntity> association) {
        CrudResponse deleteResponse = bullhornData.disassociateWithEntity(type, entityId, association, associationIds);
        assertCrudResponse(type, deleteResponse);

        CrudResponse createResponse = bullhornData.associateWithEntity(type, entityId, association, associationIds);
        assertCrudResponse(type, createResponse);

        CrudResponse deleteResponse2 = bullhornData.disassociateWithEntity(type, entityId, association, associationIds);
        assertCrudResponse(type, deleteResponse2);
    }

    private void assertCrudResponse(Class<? extends AssociationEntity> type, CrudResponse response) {
        Assertions.assertNotNull(response, type.getSimpleName() + " is null");
        Assertions.assertFalse(response.isError(), "Error occurred while associating to the " + type.getSimpleName());
    }

}
