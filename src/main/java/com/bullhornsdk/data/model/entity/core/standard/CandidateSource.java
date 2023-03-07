package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonRootName("data")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CandidateSource extends AbstractEntity implements QueryEntity, UpdateEntity {
    private Integer id;
    private String accountNumber;
    private Address address;
    private Candidate candidate;
    private Corporation corporation;
    private String fax;
    private BigDecimal fee;
    private String feeType;
    private String migrateGUID;
    private String name;
    private String phone;
    private String type;

}
