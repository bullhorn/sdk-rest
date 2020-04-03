package com.bullhornsdk.data.model.entity.core.paybill;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Person;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created by fayranne.lipton 4/3/2020
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "bccRecipients", "billingAttention", "billingClientCorporation",
    "billingContact", "billingCorporateUser", "billingLocation", "ccRecipients", "clientCorporation",
    "customDate1", "customDate2", "customDate3",
    "customFloat1", "customFloat2", "customFloat3", "customInt1",
    "customInt2", "customInt3", "customText1", "customText10",
    "customText11", "customText12", "customText13", "customText14",
    "customText15", "customText16", "customText17", "customText18",
    "customText19", "customText2", "customText20", "customText3",
    "customText4", "customText5", "customText6", "customText7",
    "customText8", "customText9", "customTextBlock1", "customTextBlock2",
    "customTextBlock3", "customTextBlock4", "customTextBlock5",
    "dateAdded", "dateLastModified", "deliveryMethod", "description", "effectiveDate",
    "effectiveEndDate", "externalID", "invoiceStatementMessageTemplate", "invoiceTerm",
    "isDeleted", "owner", "toRecipients", "status", "title", "versionID", "versions" })
public class BillingProfile extends CustomFieldsB implements QueryEntity,
    UpdateEntity, CreateEntity, SoftDeleteEntity, DateLastModifiedEntity, EffectiveDateEntity {

    private Integer id;

    private OneToMany<Person> bccRecipients;

    @JsonIgnore
    private String billingAttention;

    private ClientCorporation billingClientCorporation;

    private ClientContact billingContact;

    private CorporateUser billingCorporateUser;

    private Location billingLocation;

    private OneToMany<Person> ccRecipients;

    private ClientCorporation clientCorporation;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    @JsonIgnore
    private String deliveryMethod;

    @JsonIgnore
    private String description;

    private Date effectiveDate;

    private Date effectiveEndDate;

    @JsonIgnore
    private String externalID;

    private InvoiceStatementMessageTemplate invoiceStatementMessageTemplate;

    private InvoiceTerm invoiceTerm;

    private boolean isDeleted;

    private CorporateUser owner;

    private OneToMany<Person> toRecipients;

    @JsonIgnore
    private String status;

    @JsonIgnore
    private String title;

    private Integer versionID;

    private List<BillingProfileVersion> versions = new ArrayList<BillingProfileVersion>();

}
