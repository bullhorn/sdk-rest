package com.bullhornsdk.data.model.entity.core.paybill.master;

import com.bullhornsdk.data.model.entity.core.paybill.transaction.TransactionOrigin;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.TransactionStatus;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.TransactionType;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.paybill.unit.UnitOfMeasure;
import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by mkesmetzis 22-Apr-20
 */
public class AbstractMasterTransaction extends AbstractEntity implements DateLastModifiedEntity {

    private Integer id;

    private Integer adjustmentSequenceNumber;

    private BigDecimal amount;

    private String comment;

    private CurrencyUnit currencyUnit;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    private BigDecimal quantity;

    private BigDecimal rate;

    private Date recordingDate;

    private TransactionOrigin transactionOrigin;

    private TransactionStatus transactionStatus;

    private TransactionType transactionType;

    private UnitOfMeasure unitOfMeasure;


    public AbstractMasterTransaction() {

    }

    public AbstractMasterTransaction(Integer id) {
        this.id = id;
    }

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @ReadOnly
    @Override
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }


    @JsonProperty("adjustmentSequenceNumber")
    public Integer getAdjustmentSequenceNumbe4() {
        return adjustmentSequenceNumber;
    }

    @JsonProperty("adjustmentSequenceNumber")
    public void setAdjustmentSequenceNumber(Integer adjustmentSequenceNumber) {
        this.adjustmentSequenceNumber = adjustmentSequenceNumber;
    }

    @JsonProperty("amount")
    public BigDecimal getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("currencyUnit")
    public CurrencyUnit getCurrencyUnit() {
        return currencyUnit;
    }

    @JsonProperty("currencyUnit")
    public void setCurrencyUnit(CurrencyUnit currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @ReadOnly
    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("quantity")
    public BigDecimal getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("rate")
    public BigDecimal getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @JsonProperty("recordingDate")
    public Date getRecordingDate() {
        return recordingDate;
    }

    @JsonProperty("recordingDate")
    public void setRecordingDate(Date recordingDate) {
        this.recordingDate = recordingDate;
    }

    @JsonProperty("transactionOrigin")
    public TransactionOrigin getTransactionOrigin() {
        return transactionOrigin;
    }

    @JsonProperty("transactionOrigin")
    public void setTransactionOrigin(TransactionOrigin transactionOrigin) {
        this.transactionOrigin = transactionOrigin;
    }

    @JsonProperty("transactionStatus")
    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    @JsonProperty("transactionStatus")
    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    @JsonProperty("transactionType")
    public TransactionType getTransactionType() {
        return transactionType;
    }

    @JsonProperty("transactionType")
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    @JsonProperty("unitOfMeasure")
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    @JsonProperty("unitOfMeasure")
    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

}
