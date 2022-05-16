package com.bullhornsdk.data;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.paybill.distribution.UnbilledRevenueDistribution;
import com.google.common.collect.Sets;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.log4j.Logger;
import org.junit.Test;

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
    private final Logger log = Logger.getLogger(TestStandardBullhornApiRestAssociations.class);

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
        assertNotNull(type.getSimpleName() + " is null", response);
        assertFalse("Error occurred while associating to the " + type.getSimpleName(), response.isError());
    }

}
