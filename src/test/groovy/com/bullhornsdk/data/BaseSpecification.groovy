package com.bullhornsdk.data

import com.bullhornsdk.data.api.BullhornData
import com.bullhornsdk.data.api.mock.MockBullhornData
import spock.lang.Specification

class BaseSpecification extends Specification {

    static TestEntities testEntities;

    static BullhornData bullhornData;

    def setupSpec() {
        bullhornData = new MockBullhornData()
        testEntities = new TestEntities()
    }
}
