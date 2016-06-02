package com.bullhornsdk.data.model.entity.core.edithistory;

import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by acrowe on 3/2/2016.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "columnName", "display", "editHistory", "newValue", "oldValue"})
public class FieldChange implements QueryEntity {
    private Integer id;

    private String columnName;

    private String display;

    private EditHistory editHistory;

    private String newValue;

    private String oldValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public EditHistory getEditHistory() {
        return editHistory;
    }

    public void setEditHistory(EditHistory editHistory) {
        this.editHistory = editHistory;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FieldChange that = (FieldChange) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (columnName != null ? !columnName.equals(that.columnName) : that.columnName != null) return false;
        if (display != null ? !display.equals(that.display) : that.display != null) return false;
        if (editHistory != null ? !editHistory.equals(that.editHistory) : that.editHistory != null) return false;
        if (newValue != null ? !newValue.equals(that.newValue) : that.newValue != null) return false;
        return !(oldValue != null ? !oldValue.equals(that.oldValue) : that.oldValue != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (columnName != null ? columnName.hashCode() : 0);
        result = 31 * result + (display != null ? display.hashCode() : 0);
        result = 31 * result + (editHistory != null ? editHistory.hashCode() : 0);
        result = 31 * result + (newValue != null ? newValue.hashCode() : 0);
        result = 31 * result + (oldValue != null ? oldValue.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FieldChange{" +
                "id=" + id +
                ", columnName='" + columnName + '\'' +
                ", display='" + display + '\'' +
                ", editHistory=" + editHistory +
                ", newValue='" + newValue + '\'' +
                ", oldValue='" + oldValue + '\'' +
                '}';
    }
}
