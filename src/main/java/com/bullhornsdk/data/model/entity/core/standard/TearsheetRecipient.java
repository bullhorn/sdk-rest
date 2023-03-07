package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class TearsheetRecipient extends AbstractEntity implements QueryEntity, UpdateEntity {

    private Integer id;
    private Integer candidateRestrictionBits;
    @Setter(onMethod = @__({@JsonIgnore}))
    private String comments;
    private DateTime dateAdded;
    private Boolean isSent;
    private JobOrder jobOrder;
    private Person person;
    private Tearsheet tearsheet;

    public Boolean getSent() {
        return isSent;
    }

    public void setSent(Boolean sent) {
        isSent = sent;
    }

}
