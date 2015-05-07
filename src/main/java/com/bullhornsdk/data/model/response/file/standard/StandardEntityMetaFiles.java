package com.bullhornsdk.data.model.response.file.standard;

import java.util.List;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.response.file.EntityMetaFiles;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StandardEntityMetaFiles extends AbstractEntity implements EntityMetaFiles<StandardFileMeta> {

    private List<StandardFileMeta> fileMetas;

    @Override
    @JsonProperty(value = "EntityFiles")
    public List<StandardFileMeta> getFileMetas() {
        return fileMetas;
    }

    @Override
    @JsonProperty(value = "EntityFiles")
    public void setFileMetas(List<StandardFileMeta> fileMetas) {
        this.fileMetas = fileMetas;
    }

}
