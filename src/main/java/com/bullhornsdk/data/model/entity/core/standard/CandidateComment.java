package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import org.joda.time.DateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonRootName("data")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CandidateComment extends AbstractEntity implements QueryEntity, UpdateEntity, DateLastModifiedEntity {
    private Integer id;
    private String comments;
    @Setter(onMethod = @__({@ReadOnly}))
    private DateTime dateLastModified;
    private String name;
}
