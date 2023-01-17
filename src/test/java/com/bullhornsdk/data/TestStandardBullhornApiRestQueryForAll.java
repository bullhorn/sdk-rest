package com.bullhornsdk.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.bullhornsdk.data.model.entity.core.standard.Branch;
import com.bullhornsdk.data.model.entity.core.standard.BusinessSector;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.CorporationDepartment;
import com.bullhornsdk.data.model.entity.core.standard.Country;
import com.bullhornsdk.data.model.entity.core.standard.Department;
import com.bullhornsdk.data.model.entity.core.standard.PrivateLabel;
import com.bullhornsdk.data.model.entity.core.standard.Skill;
import com.bullhornsdk.data.model.entity.core.standard.Specialty;
import com.bullhornsdk.data.model.entity.core.standard.State;
import com.bullhornsdk.data.model.entity.core.standard.WorkersCompensation;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import com.bullhornsdk.data.model.response.list.ListWrapper;

/**
 * Tests the "query" request
 *
 * @author magnus.palm
 *
 */

public class TestStandardBullhornApiRestQueryForAll extends BaseTest {

    private String where = "id>0 AND id<21";

    private QueryParams queryParams;

    public TestStandardBullhornApiRestQueryForAll() {
        super();
        this.queryParams = ParamFactory.queryParams();

    }

    @Test
    public void testQueryBusinessSector() {

        ListWrapper<BusinessSector> wrapper = bullhornData.queryForAllRecords(BusinessSector.class, where, null, queryParams);

        runAssertions("ListWrapper<BusinessSector>", wrapper);
    }

    @Test
    public void testQueryBranch() {

        ListWrapper<Branch> wrapper = bullhornData.queryForAllRecords(Branch.class, where, null, queryParams);

        runAssertions("ListWrapper<Branch>", wrapper);
    }

    @Test
    public void testQueryCategory() {

        ListWrapper<Category> wrapper = bullhornData.queryForAllRecords(Category.class, where, null, queryParams);

        runAssertions("ListWrapper<Category>", wrapper);

    }

    @Test
    public void testQueryCertification() {

        ListWrapper<Certification> wrapper = bullhornData.queryForAllRecords(Certification.class, where, null, queryParams);

        runAssertions("ListWrapper<Certification>", wrapper);

    }

    @Test
    public void testQueryCorporationDepartment() {

        ListWrapper<CorporationDepartment> wrapper = bullhornData.queryForAllRecords(CorporationDepartment.class, where, null,
            queryParams);

        runAssertions("ListWrapper<CorporationDepartment>", wrapper);

    }

    @Test
    public void testQueryCountry() {

        ListWrapper<Country> wrapper = bullhornData.queryForAllRecords(Country.class, where, null, queryParams);

        runAssertions("ListWrapper<Country>", wrapper);

    }

    @Test
    public void testQueryDepartment() {

        ListWrapper<Department> wrapper = bullhornData.queryForAllRecords(Department.class, where, null, queryParams);

        runAssertions("ListWrapper<Department>", wrapper);

    }

    @Test
    public void testQueryPrivateLabel() {

        ListWrapper<PrivateLabel> wrapper = bullhornData.queryForAllRecords(PrivateLabel.class, where, null, queryParams);

        runAssertions("ListWrapper<PrivateLabel>", wrapper);

    }

    @Test
    public void testQuerySkill() {

        ListWrapper<Skill> wrapper = bullhornData.queryForAllRecords(Skill.class, where, null, queryParams);

        runAssertions("ListWrapper<Skill>", wrapper);

    }

    @Test
    public void testQuerySpecialty() {

        ListWrapper<Specialty> wrapper = bullhornData.queryForAllRecords(Specialty.class, where, null, queryParams);

        runAssertions("ListWrapper<Specialty>", wrapper);

    }

    @Test
    public void testQueryWorkersCompensation() {

        ListWrapper<WorkersCompensation> wrapper = bullhornData.queryForAllRecords(WorkersCompensation.class, where, null, queryParams);

        runAssertions("ListWrapper<WorkersCompensation>", wrapper);

    }

    @Test
    public void testQueryState() {
        ListWrapper<State> wrapper = bullhornData.queryForAllRecords(State.class, where, null, queryParams);

        runAssertions("ListWrapper<State>", wrapper);
    }

    private <T extends BullhornEntity> void runAssertions(String wrapperName, ListWrapper<T> wrapper) {
        Assertions.assertNotNull(wrapper, wrapperName + " is null");
        Assertions.assertNotNull(wrapper.getData(), wrapperName + ".data is null");
        Assertions.assertTrue(wrapper.getData() != null && wrapper.getData().size() > 0, wrapperName + ".data is empty");
        Assertions.assertTrue(wrapper.getData().size() == wrapper.getCount(), wrapperName + ".data.size() is not equal to count");
    }

}
