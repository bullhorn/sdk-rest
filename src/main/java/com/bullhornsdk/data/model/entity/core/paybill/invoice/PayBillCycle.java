package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;
import java.util.Objects;

/**
 * Created by fayranne.lipton 4/3/2020
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "billEvalEnabled", "billingCalendar", "billingCalendarFrequencyLookup", "dateAdded", "dateLastModified",
    "invoiceCycleEnabled", "label", "payEvalEnabled", "timesheetEnabled"
})
public class PayBillCycle extends CustomFieldsB implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity {

    private Integer id;
    private Boolean billEvalEnabled;
    private Calendar billingCalendar;
    private CalendarFrequencyLookup billingCalendarFrequencyLookup;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private Boolean invoiceCycleEnabled;
    @JsonIgnore
    private String label;
    private Boolean payEvalEnabled;
    private Boolean timesheetEnabled;

    public PayBillCycle() {
    }

    public PayBillCycle(Integer id) {
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

    @JsonProperty("billEvalEnabled")
    public Boolean getBillEvalEnabled() {
        return billEvalEnabled;
    }

    @JsonProperty("billEvalEnabled")
    public void setBillEvalEnabled(Boolean billEvalEnabled) {
        this.billEvalEnabled = billEvalEnabled;
    }

    @JsonProperty("billingCalendar")
    public Calendar getBillingCalendar() {
        return billingCalendar;
    }

    @JsonProperty("billingCalendar")
    public void setBillingCalendar(Calendar billingCalendar) {
        this.billingCalendar = billingCalendar;
    }

    @JsonProperty("billingCalendarFrequencyLookup")
    public CalendarFrequencyLookup getBillingCalendarFrequencyLookup() {
        return billingCalendarFrequencyLookup;
    }

    @JsonProperty("billingCalendarFrequencyLookup")
    public void setBillingCalendarFrequencyLookup(CalendarFrequencyLookup billingCalendarFrequencyLookup) {
        this.billingCalendarFrequencyLookup = billingCalendarFrequencyLookup;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("invoiceCycleEnabled")
    public Boolean getInvoiceCycleEnabled() {
        return invoiceCycleEnabled;
    }

    @JsonProperty("invoiceCycleEnabled")
    public void setInvoiceCycleEnabled(Boolean invoiceCycleEnabled) {
        this.invoiceCycleEnabled = invoiceCycleEnabled;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("payEvalEnabled")
    public Boolean getPayEvalEnabled() {
        return payEvalEnabled;
    }

    @JsonProperty("payEvalEnabled")
    public void setPayEvalEnabled(Boolean payEvalEnabled) {
        this.payEvalEnabled = payEvalEnabled;
    }

    @JsonProperty("timesheetEnabled")
    public Boolean getTimesheetEnabled() {
        return timesheetEnabled;
    }

    @JsonProperty("timesheetEnabled")
    public void setTimesheetEnabled(Boolean timesheetEnabled) {
        this.timesheetEnabled = timesheetEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PayBillCycle that = (PayBillCycle) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(billEvalEnabled, that.billEvalEnabled) &&
            Objects.equals(billingCalendar, that.billingCalendar) &&
            Objects.equals(billingCalendarFrequencyLookup, that.billingCalendarFrequencyLookup) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(invoiceCycleEnabled, that.invoiceCycleEnabled) &&
            Objects.equals(label, that.label) &&
            Objects.equals(payEvalEnabled, that.payEvalEnabled) &&
            Objects.equals(timesheetEnabled, that.timesheetEnabled);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), id, billEvalEnabled, billingCalendar, billingCalendarFrequencyLookup, dateAdded, dateLastModified, invoiceCycleEnabled, label, payEvalEnabled, timesheetEnabled);
    }

    @Override
    public String toString() {
        return "PayBillCycle{" +
            "id=" + id +
            ", billEvalEnabled=" + billEvalEnabled +
            ", billingCalendar=" + billingCalendar +
            ", billingCalendarFrequencyLookup=" + billingCalendarFrequencyLookup +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", invoiceCycleEnabled=" + invoiceCycleEnabled +
            ", label='" + label + '\'' +
            ", payEvalEnabled=" + payEvalEnabled +
            ", timesheetEnabled=" + timesheetEnabled +
            '}';
    }
}
