package com.bullhornsdk.data.model.response.file;

import java.util.List;

public interface EntityMetaFiles<T extends FileMeta> {

    public List<T> getFileMetas();
    
    public void setFileMetas(List<T> fileMetas);

}
