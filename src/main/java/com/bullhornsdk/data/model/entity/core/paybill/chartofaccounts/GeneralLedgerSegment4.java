package com.bullhornsdk.data.model.entity.core.paybill.chartofaccounts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by mkesmetzis 21-Apr-20
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "externalSegmentName", "externalSegmentNumber", "generalLedgerSegmentType", "isActive", "isDeleted", "dateAdded", "dateLastModified"})
public class GeneralLedgerSegment4 extends GeneralLedgerSegment {
    public GeneralLedgerSegment4() {
        super();
        this.setGeneralLedgerSegmentType(new GeneralLedgerSegmentType(4));
    }

}
