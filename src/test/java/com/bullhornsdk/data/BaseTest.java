package com.bullhornsdk.data;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.api.mock.MockBullhornData;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest {


    public TestEntities testEntities;

    public BullhornData bullhornData;

    @BeforeEach
    public void scaffoldTests() {
        this.bullhornData = new MockBullhornData();
        this.testEntities = new TestEntities();
    }

}
