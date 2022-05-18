package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import java.util.Date;
import java.util.Objects;

/**
 * Created by fayranne.lipton 4/3/2020
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "calendarFrequencyLookup", "dateAdded", "dateLastModified", "isCustom",
    "invoiceCycleEnabled", "label", "payEvalEnabled", "timesheetEnabled"
})
public class Calendar extends CustomFieldsB implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity {

    private Integer id;
    private CalendarFrequencyLookup calendarFrequencyLookup;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private Boolean isCustom;
    @JsonIgnore
    private String label;
    private Integer offset;
    private Date startDate;

    public Calendar() {
    }

    public Calendar(Integer id) {
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

    @JsonProperty("calendarFrequencyLookup")
    public CalendarFrequencyLookup getCalendarFrequencyLookup() {
        return calendarFrequencyLookup;
    }

    @JsonProperty("calendarFrequencyLookup")
    public void setCalendarFrequencyLookup(CalendarFrequencyLookup calendarFrequencyLookup) {
        this.calendarFrequencyLookup = calendarFrequencyLookup;
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

    @JsonProperty("isCustom")
    public Boolean getCustom() {
        return isCustom;
    }

    @JsonProperty("isCustom")
    public void setCustom(Boolean custom) {
        isCustom = custom;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Calendar calendar = (Calendar) o;
        return Objects.equals(id, calendar.id) &&
            Objects.equals(calendarFrequencyLookup, calendar.calendarFrequencyLookup) &&
            Objects.equals(dateAdded, calendar.dateAdded) &&
            Objects.equals(dateLastModified, calendar.dateLastModified) &&
            Objects.equals(isCustom, calendar.isCustom) &&
            Objects.equals(label, calendar.label) &&
            Objects.equals(offset, calendar.offset) &&
            Objects.equals(startDate, calendar.startDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), id, calendarFrequencyLookup, dateAdded, dateLastModified, isCustom, label, offset, startDate);
    }

    @Override
    public String toString() {
        return "Calendar{" +
            "id=" + id +
            ", calendarFrequencyLookup=" + calendarFrequencyLookup +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", isCustom=" + isCustom +
            ", label='" + label + '\'' +
            ", offset=" + offset +
            ", startDate=" + startDate +
            '}';
    }
}
