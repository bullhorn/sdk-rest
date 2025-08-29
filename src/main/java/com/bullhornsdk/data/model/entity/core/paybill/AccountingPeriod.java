package com.bullhornsdk.data.model.entity.core.paybill;

import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import lombok.Data;
import org.joda.time.DateTime;

import java.util.Date;

@Data
public class AccountingPeriod implements QueryEntity, AssociationEntity {
    private Integer id;
    private Date accountingPeriodDate;
    private DateTime dateAdded;
}
