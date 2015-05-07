package com.bullhornsdk.data.api.helper;

import java.util.concurrent.Callable;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.type.FileEntity;
import com.bullhornsdk.data.model.response.file.FileContent;

public class FileWorker implements Callable<FileContent> {

    private final Integer entityId;

    private final Integer fileId;

    private final Class<? extends FileEntity> type;

    private final BullhornData bullhornApiRest;

    public FileWorker(Integer entityId, Integer fileId, Class<? extends FileEntity> type, BullhornData bullhornApiRest) {
        super();
        this.entityId = entityId;
        this.fileId = fileId;
        this.type = type;
        this.bullhornApiRest = bullhornApiRest;
    }

    @Override
    public FileContent call() throws Exception {
        return bullhornApiRest.getFileContent(type, entityId, fileId);
    }

}
