package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.DirectDepositAccountTypeLookup;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * DirectDepositAccount entity for Bullhorn CRM
 * Represents direct deposit account information for candidates
 */
@Data
@EqualsAndHashCode(callSuper = false)
@JsonPropertyOrder({"id", "accountNumber", "allocationMethod", "amount", "bankName", "candidate",
    "currencyUnit", "dateAdded", "dateLastModified", "deletedByUser", "directDepositAccountTypeLookup",
    "institutionNumber", "isDeleted", "paymentOrder", "percentValue", "remainder", "transitNumber"})
public class DirectDepositAccount extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity,
    SoftDeleteEntity, DateLastModifiedEntity {

    private Integer id;

    private String accountNumber;

    private String allocationMethod;

    private BigDecimal amount;

    private String bankName;

    private Candidate candidate;

    private CurrencyUnit currencyUnit;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    private CorporateUser deletedByUser;

    private DirectDepositAccountTypeLookup directDepositAccountTypeLookup;

    private String institutionNumber;

    private Boolean isDeleted;

    private Integer paymentOrder;

    private BigDecimal percentValue;

    private Boolean remainder;

    private String transitNumber;

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @Override
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }
}
