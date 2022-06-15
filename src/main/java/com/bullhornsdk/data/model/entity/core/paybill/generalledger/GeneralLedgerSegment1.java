package com.bullhornsdk.data.model.entity.core.paybill.generalledger;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by mkesmetzis 21-Apr-20
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "dateAdded", "dateLastModified", "externalSegmentName", "externalSegmentNumber", "generalLedgerSegmentType", "isActive", "isDeleted"})
public class GeneralLedgerSegment1 extends GeneralLedgerSegment {

    public GeneralLedgerSegment1() {
        super();
    }

}
