package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.HardDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonFilter(DynamicNullValueFilter.FILTER_NAME)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "note", "targetEntityID", "targetEntityName" })
public class NoteEntity extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, HardDeleteEntity {

    private Integer id;

    private Note note;

    private Integer targetEntityID;

    private String targetEntityName;

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

    @JsonProperty("note")
    public Note getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(Note note) {
        this.note = note;
    }

    @JsonProperty("targetEntityID")
    public Integer getTargetEntityID() {
        return targetEntityID;
    }

    @JsonProperty("targetEntityID")
    public void setTargetEntityID(Integer targetEntityID) {
        this.targetEntityID = targetEntityID;
    }

    @JsonProperty("targetEntityName")
    public String getTargetEntityName() {
        return targetEntityName;
    }

    @JsonProperty("targetEntityName")
    public void setTargetEntityName(String targetEntityName) {
        this.targetEntityName = targetEntityName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((note == null) ? 0 : note.hashCode());
        result = prime * result + ((targetEntityID == null) ? 0 : targetEntityID.hashCode());
        result = prime * result + ((targetEntityName == null) ? 0 : targetEntityName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        NoteEntity other = (NoteEntity) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (note == null) {
            if (other.note != null)
                return false;
        } else if (!note.equals(other.note))
            return false;
        if (targetEntityID == null) {
            if (other.targetEntityID != null)
                return false;
        } else if (!targetEntityID.equals(other.targetEntityID))
            return false;
        if (targetEntityName == null) {
            if (other.targetEntityName != null)
                return false;
        } else if (!targetEntityName.equals(other.targetEntityName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("NoteEntity {\nid=");
        builder.append(id);
        builder.append(", \nnote=");
        builder.append(note);
        builder.append(", \ntargetEntityID=");
        builder.append(targetEntityID);
        builder.append(", \ntargetEntityName=");
        builder.append(targetEntityName);
        builder.append("\n}");
        return builder.toString();
    }

}
