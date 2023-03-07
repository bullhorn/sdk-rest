package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.joda.time.DateTime;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonRootName("data")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Corporation extends AbstractEntity implements QueryEntity {
    private Integer id;
    private Address address;
    private String companyURL;
    private DateTime dateAdded;
    private DateTime dateBillingBegin;
    private DateTime dateBillingEnd;
    private Boolean enabled;
    private String externalID;
    private String fax;
    private BigDecimal flatMonthlyFee;
    private Integer flatStorageLimitMB;
    private String inboundListenerEmail;
    private BigDecimal minimumMonthlyFee;
    private String name;
    private String newLeadEmail;
    private Integer perUserStorageLimitMB;
    private String phone;
    private PrivateLabel privateLabel;
    private OneToMany<PrivateLabel> privateLabels;
    private BigDecimal storageFee;
}
