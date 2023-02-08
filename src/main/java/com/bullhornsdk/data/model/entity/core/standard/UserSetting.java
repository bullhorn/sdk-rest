package com.bullhornsdk.data.model.entity.core.standard;

import java.util.Objects;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "dateAdded", "isPersistent", "person", "setting", "value" })
public class UserSetting extends AbstractEntity implements BullhornEntity, QueryEntity {
    private Integer id;

    private DateTime dateAdded;

    private Boolean isPersistent;

    private Person person;

    private String setting;

    private String value;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("isPersistent")
    public Boolean getPersistent() {
        return isPersistent;
    }

    @JsonProperty("isPersistent")
    public void setPersistent(Boolean persistent) {
        isPersistent = persistent;
    }

    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    @JsonProperty("setting")
    public String getSetting() {
        return setting;
    }

    @JsonProperty("setting")
    public void setSetting(String setting) {
        this.setting = setting;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSetting that = (UserSetting) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(isPersistent, that.isPersistent) &&
            Objects.equals(person, that.person) &&
            Objects.equals(setting, that.setting) &&
            Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateAdded, isPersistent, person, setting, value);
    }

    @Override
    public String toString() {
        return "UserSetting{" +
            "id=" + id +
            ", dateAdded=" + dateAdded +
            ", isPersistent=" + isPersistent +
            ", person=" + person +
            ", setting='" + setting + '\'' +
            ", value='" + value + '\'' +
            '}';
    }
}
