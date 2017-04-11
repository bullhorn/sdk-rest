package com.bullhornsdk.data;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import com.bullhornsdk.data.model.entity.association.AssociationFactory;
import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.DistributionList;
import com.bullhornsdk.data.model.entity.core.standard.Person;
import com.bullhornsdk.data.model.entity.core.standard.Skill;
import com.bullhornsdk.data.model.entity.core.standard.Specialty;
import com.bullhornsdk.data.model.entity.core.standard.WorkersCompensation;
import com.bullhornsdk.data.model.entity.core.standard.WorkersCompensationRate;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.parameter.AssociationParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import com.bullhornsdk.data.model.response.crud.CrudResponse;

public class TestStandardBullhornApiRestGetAssociations extends BaseTest {
	
	public TestStandardBullhornApiRestGetAssociations() {
		super();
	}

	@Test
	public void testGetCandidateAssociationCategories() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Set<Integer> entityIds = new HashSet<Integer>();
		entityIds.add(testEntities.getCandidateId());
		Set<Integer> associationIds = new HashSet<Integer>();
		associationIds.add(testEntities.getCategoryId());

		this.setUpAssociation(Candidate.class, testEntities.getCandidateId(), associationIds, AssociationFactory.candidateAssociations()
				.categories());

		AssociationParams params = ParamFactory.associationParams();
		params.setCount(100);

		List<Category> associationList = bullhornData.getAssociation(Candidate.class, entityIds, AssociationFactory
				.candidateAssociations().categories(), getFields(), params);
		assertResponse(Category.class, associationList);

	}

	@Test
	public void testGetCandidateAssociationSpecialties() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Set<Integer> entityIds = new HashSet<Integer>();
		entityIds.add(testEntities.getCandidateId());
		Set<Integer> associationIds = new HashSet<Integer>();
		associationIds.add(testEntities.getSpecialtyId());

		this.setUpAssociation(Candidate.class, testEntities.getCandidateId(), associationIds, AssociationFactory.candidateAssociations()
				.specialties());

		AssociationParams params = ParamFactory.associationParams();
		params.setCount(100);

		List<Specialty> associationList = bullhornData.getAssociation(Candidate.class, entityIds, AssociationFactory
				.candidateAssociations().specialties(), getFields(), params);
		assertResponse(Category.class, associationList);

	}

	@Test
	public void testGetAllCandidateAssociationSpecialties() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Set<Integer> entityIds = new HashSet<Integer>();
		entityIds.add(testEntities.getCandidateId());
		Set<Integer> associationIds = new HashSet<Integer>();
		associationIds.add(testEntities.getSpecialtyId());

		this.setUpAssociation(Candidate.class, testEntities.getCandidateId(), associationIds, AssociationFactory.candidateAssociations()
				.specialties());

		AssociationParams params = ParamFactory.associationParams();

		List<Specialty> associationList = bullhornData.getAllAssociations(Candidate.class, entityIds, AssociationFactory
				.candidateAssociations().specialties(), getFields(), params).getData();
		assertResponse(Category.class, associationList);

	}

	@Test
	public void testGetCategoryAssociation() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

		Set<Integer> entityIds = new HashSet<Integer>();
		entityIds.add(testEntities.getCategoryId());

		AssociationParams params = ParamFactory.associationParams();
		params.setCount(100);
		List<Skill> associationList = bullhornData.getAssociation(Category.class, entityIds, AssociationFactory.categoryAssociations()
				.skills(), getFields(), params);
		assertResponse(Category.class, associationList);

	}

    @Test
    public void testGetDistributionListAssociation() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        Set<Integer> entityIds = new HashSet<Integer>();
        entityIds.add(testEntities.getDistributionListId());

        AssociationParams params = ParamFactory.associationParams();
        params.setCount(100);
        List<Person> associationList = bullhornData.getAssociation(DistributionList.class, entityIds, AssociationFactory.distributionListAssociations()
            .members(), getFields(), params);
        assertResponse(DistributionList.class, associationList);

    }

    @Test
    public void testGetWorkersCompensationAssociation() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        Set<Integer> entityIds = new HashSet<Integer>();
        entityIds.add(testEntities.getWorkersCompensationId());

        AssociationParams params = ParamFactory.associationParams();
        params.setCount(100);
        List<WorkersCompensationRate> associationList = bullhornData.getAssociation(WorkersCompensation.class, entityIds, AssociationFactory.workersCompensationAssociations()
            .rates(), getFields(), params);
        assertResponse(WorkersCompensation.class, associationList);

    }

	private Set<String> getFields() {
		Set<String> fields = new HashSet<String>();
		fields.add("id");
		fields.add("name");
		fields.add("enabled");
		return fields;
	}

	private <T extends AssociationEntity, E extends BullhornEntity> void assertResponse(Class<T> type, List<E> response) {
		assertNotNull(type.getSimpleName() + " is null", response);
		assertFalse("No records fetched " + type.getSimpleName(), response.isEmpty());
	}

	private <T extends AssociationEntity> void setUpAssociation(Class<T> type, Integer entityId, Set<Integer> associationIds,
			AssociationField<T, ? extends BullhornEntity> association) {
		CrudResponse deleteResponse = bullhornData.disassociateWithEntity(type, entityId, association, associationIds);
		assertCrudResponse(type, deleteResponse);

		CrudResponse createResponse = bullhornData.associateWithEntity(type, entityId, association, associationIds);
		assertCrudResponse(type, createResponse);

	}

	private void assertCrudResponse(Class<? extends AssociationEntity> type, CrudResponse response) {
		assertNotNull(type.getSimpleName() + " is null", response);
		assertFalse("Error occurred while associating to the " + type.getSimpleName(), response.isError());
	}

}
