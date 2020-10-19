package com.bullhornsdk.data.model.response.list;

import com.bullhornsdk.data.model.entity.file.BillableChargeFileAttachment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by mkesmetzis 01-Apr-20
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"data", "count", "start"})
public class BillableChargeFileAttachmentListWrapper extends StandardListWrapper<BillableChargeFileAttachment> {
}
