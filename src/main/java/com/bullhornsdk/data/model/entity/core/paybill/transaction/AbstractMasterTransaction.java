package com.bullhornsdk.data.model.entity.core.paybill.transaction;

import com.bullhornsdk.data.model.entity.core.paybill.AccountingPeriod;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.paybill.unit.UnitOfMeasure;
import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 * Created by mkesmetzis 22-Apr-20
 */
public class AbstractMasterTransaction extends AbstractEntity implements DateLastModifiedEntity {

    private Integer id;

    @Getter
    @Setter
    private AccountingPeriod accountingPeriod;

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

    @Override
    public String toString() {
        return "AbstractMasterTransaction{" +
            "id=" + id +
            ", accountingPeriod=" + accountingPeriod +
            ", adjustmentSequenceNumber=" + adjustmentSequenceNumber +
            ", amount=" + amount +
            ", comment='" + comment + '\'' +
            ", currencyUnit=" + currencyUnit +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", quantity=" + quantity +
            ", rate=" + rate +
            ", recordingDate=" + recordingDate +
            ", transactionOrigin=" + transactionOrigin +
            ", transactionStatus=" + transactionStatus +
            ", transactionType=" + transactionType +
            ", unitOfMeasure=" + unitOfMeasure +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractMasterTransaction that = (AbstractMasterTransaction) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(accountingPeriod, that.accountingPeriod) &&
            Objects.equals(adjustmentSequenceNumber, that.adjustmentSequenceNumber) &&
            Objects.equals(amount, that.amount) &&
            Objects.equals(comment, that.comment) &&
            Objects.equals(currencyUnit, that.currencyUnit) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(quantity, that.quantity) &&
            Objects.equals(rate, that.rate) &&
            Objects.equals(recordingDate, that.recordingDate) &&
            Objects.equals(transactionOrigin, that.transactionOrigin) &&
            Objects.equals(transactionStatus, that.transactionStatus) &&
            Objects.equals(transactionType, that.transactionType) &&
            Objects.equals(unitOfMeasure, that.unitOfMeasure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountingPeriod, adjustmentSequenceNumber, amount, comment, currencyUnit, dateAdded, dateLastModified, quantity, rate, recordingDate, transactionOrigin, transactionStatus, transactionType, unitOfMeasure);
    }
}
