package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.util.Objects;

@JsonRootName("data")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Shift extends AbstractEntity implements QueryEntity, UpdateEntity, SoftDeleteEntity, DateLastModifiedEntity {
    private Integer id;
    private ClientCorporation clientCorporation;
    private DateTime dateLastModified;
    private Integer dayOfWeek;
    private DateTime endTime;
    private Boolean friday;
    private String htmlColorCode;
    private Boolean isDefault;
    private Boolean isDeleted;
    private CorporateUser lastModifyingUser;
    private String migrateGUID;
    private Boolean monday;
    private String name;
    private Boolean saturday;
    private String shortName;
    private DateTime startTime;
    private Boolean sunday;
    private Boolean thursday;
    private Boolean tuesday;
    private String type;
    private Boolean wednesday;

    public Shift() {
    }

    public Integer getId() {
        return this.id;
    }

    public ClientCorporation getClientCorporation() {
        return this.clientCorporation;
    }

    public DateTime getDateLastModified() {
        return this.dateLastModified;
    }

    public Integer getDayOfWeek() {
        return this.dayOfWeek;
    }

    public DateTime getEndTime() {
        return this.endTime;
    }

    public Boolean getFriday() {
        return this.friday;
    }

    public String getHtmlColorCode() {
        return this.htmlColorCode;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public CorporateUser getLastModifyingUser() {
        return this.lastModifyingUser;
    }

    public String getMigrateGUID() {
        return this.migrateGUID;
    }

    public Boolean getMonday() {
        return this.monday;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getSaturday() {
        return this.saturday;
    }

    public String getShortName() {
        return this.shortName;
    }

    public DateTime getStartTime() {
        return this.startTime;
    }

    public Boolean getSunday() {
        return this.sunday;
    }

    public Boolean getThursday() {
        return this.thursday;
    }

    public Boolean getTuesday() {
        return this.tuesday;
    }

    public String getType() {
        return this.type;
    }

    public Boolean getWednesday() {
        return this.wednesday;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setClientCorporation(ClientCorporation clientCorporation) {
        this.clientCorporation = clientCorporation;
    }

    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }

    public void setFriday(Boolean friday) {
        this.friday = friday;
    }

    public void setHtmlColorCode(String htmlColorCode) {
        this.htmlColorCode = htmlColorCode;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setLastModifyingUser(CorporateUser lastModifyingUser) {
        this.lastModifyingUser = lastModifyingUser;
    }

    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    public void setMonday(Boolean monday) {
        this.monday = monday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSaturday(Boolean saturday) {
        this.saturday = saturday;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    public void setSunday(Boolean sunday) {
        this.sunday = sunday;
    }

    public void setThursday(Boolean thursday) {
        this.thursday = thursday;
    }

    public void setTuesday(Boolean tuesday) {
        this.tuesday = tuesday;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWednesday(Boolean wednesday) {
        this.wednesday = wednesday;
    }

    public String toString() {
        return "Shift(id=" + this.getId() + ", clientCorporation=" + this.getClientCorporation() + ", dateLastModified=" + this.getDateLastModified() + ", dayOfWeek=" + this.getDayOfWeek() + ", endTime=" + this.getEndTime() + ", friday=" + this.getFriday() + ", htmlColorCode=" + this.getHtmlColorCode() + ", isDefault=" + this.getIsDefault() + ", isDeleted=" + this.getIsDeleted() + ", lastModifyingUser=" + this.getLastModifyingUser() + ", migrateGUID=" + this.getMigrateGUID() + ", monday=" + this.getMonday() + ", name=" + this.getName() + ", saturday=" + this.getSaturday() + ", shortName=" + this.getShortName() + ", startTime=" + this.getStartTime() + ", sunday=" + this.getSunday() + ", thursday=" + this.getThursday() + ", tuesday=" + this.getTuesday() + ", type=" + this.getType() + ", wednesday=" + this.getWednesday() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shift shift = (Shift) o;

        if (!Objects.equals(id, shift.id)) return false;
        if (!Objects.equals(clientCorporation, shift.clientCorporation))
            return false;
        if (!Objects.equals(dateLastModified, shift.dateLastModified))
            return false;
        if (!Objects.equals(dayOfWeek, shift.dayOfWeek)) return false;
        if (!Objects.equals(endTime, shift.endTime)) return false;
        if (!Objects.equals(friday, shift.friday)) return false;
        if (!Objects.equals(htmlColorCode, shift.htmlColorCode))
            return false;
        if (!Objects.equals(isDefault, shift.isDefault)) return false;
        if (!Objects.equals(isDeleted, shift.isDeleted)) return false;
        if (!Objects.equals(lastModifyingUser, shift.lastModifyingUser))
            return false;
        if (!Objects.equals(migrateGUID, shift.migrateGUID)) return false;
        if (!Objects.equals(monday, shift.monday)) return false;
        if (!Objects.equals(name, shift.name)) return false;
        if (!Objects.equals(saturday, shift.saturday)) return false;
        if (!Objects.equals(shortName, shift.shortName)) return false;
        if (!Objects.equals(startTime, shift.startTime)) return false;
        if (!Objects.equals(sunday, shift.sunday)) return false;
        if (!Objects.equals(thursday, shift.thursday)) return false;
        if (!Objects.equals(tuesday, shift.tuesday)) return false;
        if (!Objects.equals(type, shift.type)) return false;
        return Objects.equals(wednesday, shift.wednesday);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (clientCorporation != null ? clientCorporation.hashCode() : 0);
        result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
        result = 31 * result + (dayOfWeek != null ? dayOfWeek.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (friday != null ? friday.hashCode() : 0);
        result = 31 * result + (htmlColorCode != null ? htmlColorCode.hashCode() : 0);
        result = 31 * result + (isDefault != null ? isDefault.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (lastModifyingUser != null ? lastModifyingUser.hashCode() : 0);
        result = 31 * result + (migrateGUID != null ? migrateGUID.hashCode() : 0);
        result = 31 * result + (monday != null ? monday.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (saturday != null ? saturday.hashCode() : 0);
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (sunday != null ? sunday.hashCode() : 0);
        result = 31 * result + (thursday != null ? thursday.hashCode() : 0);
        result = 31 * result + (tuesday != null ? tuesday.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (wednesday != null ? wednesday.hashCode() : 0);
        return result;
    }
}
