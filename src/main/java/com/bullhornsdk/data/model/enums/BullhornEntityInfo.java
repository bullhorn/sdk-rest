package com.bullhornsdk.data.model.enums;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bullhornsdk.data.model.entity.core.certificationrequirement.CandidateCertificationRequirement;
import com.bullhornsdk.data.model.entity.core.certificationrequirement.CertificationRequirement;
import com.bullhornsdk.data.model.entity.core.certificationrequirement.JobSubmissionCertificationRequirement;
import com.bullhornsdk.data.model.entity.core.certificationrequirement.optionslookup.CertificationRequirementStatusLookup;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObject;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObject;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObject;
import com.bullhornsdk.data.model.entity.core.customobject.UserCustomObject;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance11;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance12;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance13;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance14;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance15;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance16;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance17;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance18;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance19;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance20;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance21;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance22;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance23;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance24;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance25;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance26;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance27;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance28;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance29;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance30;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance31;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance32;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance33;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance34;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance35;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance9;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance9;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance9;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance9;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance9;
import com.bullhornsdk.data.model.entity.core.paybill.BillingProfile;
import com.bullhornsdk.data.model.entity.core.paybill.CanvasReport;
import com.bullhornsdk.data.model.entity.core.paybill.Location;
import com.bullhornsdk.data.model.entity.core.paybill.charge.BillableCharge;
import com.bullhornsdk.data.model.entity.core.paybill.charge.PayableCharge;
import com.bullhornsdk.data.model.entity.core.paybill.discount.Discount;
import com.bullhornsdk.data.model.entity.core.paybill.earncode.EarnCode;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerAccount;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerSegment;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerSegment1;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerSegment2;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerSegment3;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerSegment4;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerSegment5;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerSegmentType;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerServiceCode;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatement;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementBatch;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementDiscount;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementExportBatch;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementLineItem;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementMessageTemplate;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementSurcharge;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementTax;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementTemplate;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceTerm;
import com.bullhornsdk.data.model.entity.core.paybill.master.BatchGroup;
import com.bullhornsdk.data.model.entity.core.paybill.master.BillMaster;
import com.bullhornsdk.data.model.entity.core.paybill.master.BillingSyncBatch;
import com.bullhornsdk.data.model.entity.core.paybill.master.PayMaster;
import com.bullhornsdk.data.model.entity.core.paybill.surcharge.Surcharge;
import com.bullhornsdk.data.model.entity.core.paybill.tax.Tax;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.*;
import com.bullhornsdk.data.model.entity.core.paybill.unit.CurrencyUnit;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.embedded.UserType;
import com.bullhornsdk.data.model.entity.file.BillableChargeFileAttachment;
import com.bullhornsdk.data.model.entity.file.CandidateFileAttachment;
import com.bullhornsdk.data.model.entity.file.CertificationFileAttachment;
import com.bullhornsdk.data.model.entity.file.ClientContactFileAttachment;
import com.bullhornsdk.data.model.entity.file.ClientCorporationFileAttachment;
import com.bullhornsdk.data.model.entity.file.InvoiceStatementExport;
import com.bullhornsdk.data.model.entity.file.JobOrderFileAttachment;
import com.bullhornsdk.data.model.entity.file.OpportunityFileAttachment;
import com.bullhornsdk.data.model.entity.file.PlacementFileAttachment;
import com.bullhornsdk.data.model.response.list.*;
import com.bullhornsdk.data.model.response.list.customobject.ClientCorporationCustomObjectListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.JobOrderCustomObjectListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.PlacementCustomObjectListWrapper;
import com.bullhornsdk.data.model.response.list.customobject.UserCustomObjectListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance10ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance11ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance12ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance13ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance14ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance15ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance16ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance17ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance18ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance19ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance1ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance20ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance21ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance22ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance23ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance24ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance25ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance26ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance27ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance28ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance29ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance2ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance30ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance31ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance32ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance33ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance34ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance35ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance3ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance4ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance5ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance6ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance7ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance8ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.ClientCorporationCustomObjectInstance9ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.JobOrderCustomObjectInstance10ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.JobOrderCustomObjectInstance1ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.JobOrderCustomObjectInstance2ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.JobOrderCustomObjectInstance3ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.JobOrderCustomObjectInstance4ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.JobOrderCustomObjectInstance5ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.JobOrderCustomObjectInstance6ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.JobOrderCustomObjectInstance7ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.JobOrderCustomObjectInstance8ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.JobOrderCustomObjectInstance9ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.OpportunityCustomObjectInstance10ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.OpportunityCustomObjectInstance1ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.OpportunityCustomObjectInstance2ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.OpportunityCustomObjectInstance3ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.OpportunityCustomObjectInstance4ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.OpportunityCustomObjectInstance5ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.OpportunityCustomObjectInstance6ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.OpportunityCustomObjectInstance7ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.OpportunityCustomObjectInstance8ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.OpportunityCustomObjectInstance9ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PersonCustomObjectInstance10ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PersonCustomObjectInstance1ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PersonCustomObjectInstance2ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PersonCustomObjectInstance3ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PersonCustomObjectInstance4ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PersonCustomObjectInstance5ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PersonCustomObjectInstance6ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PersonCustomObjectInstance7ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PersonCustomObjectInstance8ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PersonCustomObjectInstance9ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PlacementCustomObjectInstance10ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PlacementCustomObjectInstance1ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PlacementCustomObjectInstance2ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PlacementCustomObjectInstance3ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PlacementCustomObjectInstance4ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PlacementCustomObjectInstance5ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PlacementCustomObjectInstance6ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PlacementCustomObjectInstance7ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PlacementCustomObjectInstance8ListWrapper;
import com.bullhornsdk.data.model.response.list.customobjectinstances.PlacementCustomObjectInstance9ListWrapper;
import com.bullhornsdk.data.model.response.single.*;
import com.bullhornsdk.data.model.response.single.customobject.ClientCorporationCustomObjectWrapper;
import com.bullhornsdk.data.model.response.single.customobject.JobOrderCustomObjectWrapper;
import com.bullhornsdk.data.model.response.single.customobject.PlacementCustomObjectWrapper;
import com.bullhornsdk.data.model.response.single.customobject.UserCustomObjectWrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance10Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance11Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance12Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance13Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance14Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance15Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance16Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance17Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance18Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance19Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance1Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance20Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance21Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance22Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance23Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance24Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance25Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance26Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance27Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance28Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance29Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance2Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance30Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance31Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance32Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance33Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance34Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance35Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance3Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance4Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance5Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance6Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance7Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance8Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.ClientCorporationCustomObjectInstance9Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.JobOrderCustomObjectInstance10Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.JobOrderCustomObjectInstance1Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.JobOrderCustomObjectInstance2Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.JobOrderCustomObjectInstance3Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.JobOrderCustomObjectInstance4Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.JobOrderCustomObjectInstance5Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.JobOrderCustomObjectInstance6Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.JobOrderCustomObjectInstance7Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.JobOrderCustomObjectInstance8Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.JobOrderCustomObjectInstance9Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.OpportunityCustomObjectInstance10Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.OpportunityCustomObjectInstance1Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.OpportunityCustomObjectInstance2Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.OpportunityCustomObjectInstance3Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.OpportunityCustomObjectInstance4Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.OpportunityCustomObjectInstance5Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.OpportunityCustomObjectInstance6Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.OpportunityCustomObjectInstance7Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.OpportunityCustomObjectInstance8Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.OpportunityCustomObjectInstance9Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PersonCustomObjectInstance10Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PersonCustomObjectInstance1Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PersonCustomObjectInstance2Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PersonCustomObjectInstance3Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PersonCustomObjectInstance4Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PersonCustomObjectInstance5Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PersonCustomObjectInstance6Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PersonCustomObjectInstance7Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PersonCustomObjectInstance8Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PersonCustomObjectInstance9Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PlacementCustomObjectInstance10Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PlacementCustomObjectInstance1Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PlacementCustomObjectInstance2Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PlacementCustomObjectInstance3Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PlacementCustomObjectInstance4Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PlacementCustomObjectInstance5Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PlacementCustomObjectInstance6Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PlacementCustomObjectInstance7Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PlacementCustomObjectInstance8Wrapper;
import com.bullhornsdk.data.model.response.single.customobjectinstances.PlacementCustomObjectInstance9Wrapper;

/**
 * Enum that contains the following information about the RestEntities:
 * <p>
 * 1. The pretty name.
 * <p>
 * 2. The BullhornEntity specific Class<T>
 * <p>
 * 3. The ListWrapper<T> class that wraps a list of RestEntities for query/search type requests.
 * <p>
 * 4. Mapping between Class<T> and its name.
 * <p>
 * 5. Mapping between Class<T> and its ListWrapper<T>.
 *
 * @author magnus.palm
 */
public enum BullhornEntityInfo {

    // Standard Entities
    ADDRESS("Address", null, null, null, null, null),
    APPOINTMENT("Appointment", Appointment.class, AppointmentWrapper.class, AppointmentListWrapper.class,
        "AppointmentEditHistory", "AppointmentEditHistoryFieldChange"),
    APPOINTMENT_ATTENDEE("AppointmentAttendee", AppointmentAttendee.class, AppointmentAttendeeWrapper.class,
        AppointmentAttendeeListWrapper.class, null, null),
    BRANCH("Branch", Branch.class, BranchWrapper.class, BranchListWrapper.class, null, null),
    BUSINESS_SECTOR("BusinessSector", BusinessSector.class, BusinessSectorWrapper.class, BusinessSectorListWrapper.class, null, null),
    CANDIDATE("Candidate", Candidate.class, CandidateWrapper.class, CandidateListWrapper.class, "UserEditHistory",
        "UserEditHistoryFieldChange"),
    CANDIDATE_CERTIFICATION("CandidateCertification", CandidateCertification.class, CandidateCertificationWrapper.class,
        CandidateCertificationListWrapper.class, "CandidateCertificationEditHistory", "CandidateCertificationEditHistoryFieldChange"),
    CANDIDATE_EDUCATION("CandidateEducation", CandidateEducation.class, CandidateEducationWrapper.class,
        CandidateEducationListWrapper.class, null, null),
    CANDIDATE_REFERENCE("CandidateReference", CandidateReference.class, CandidateReferenceWrapper.class,
        CandidateReferenceListWrapper.class, null, null),
    CANDIDATE_WORK_HISTORY("CandidateWorkHistory", CandidateWorkHistory.class, CandidateWorkHistoryWrapper.class,
        CandidateWorkHistoryListWrapper.class, null, null),
    CATEGORY("Category", Category.class, CategoryWrapper.class, CategoryListWrapper.class, null, null),
    CERTIFICATION("Certification", Certification.class, CertificationWrapper.class, CertificationListWrapper.class, null, null),
    CERTIFICATIONGROUP("CertificationGroup", CertificationGroup.class, CertificationGroupWrapper.class, CertificationGroupListWrapper.class, null, null),
    CLIENT_CONTACT("ClientContact", ClientContact.class, ClientContactWrapper.class, ClientContactListWrapper.class, "UserEditHistory",
        "UserEditHistoryFieldChange"),
    CLIENT_CONTACT1("ClientContact1", ClientContact1.class, ClientContact1Wrapper.class, ClientContact1ListWrapper.class, "UserEditHistory",
        "UserEditHistoryFieldChange"),
    CLIENT_CONTACT2("ClientContact2", ClientContact2.class, ClientContact2Wrapper.class, ClientContact2ListWrapper.class, "UserEditHistory",
        "UserEditHistoryFieldChange"),
    CLIENT_CONTACT3("ClientContact3", ClientContact3.class, ClientContact3Wrapper.class, ClientContact3ListWrapper.class, "UserEditHistory",
        "UserEditHistoryFieldChange"),
    CLIENT_CONTACT4("ClientContact4", ClientContact4.class, ClientContact4Wrapper.class, ClientContact4ListWrapper.class, "UserEditHistory",
        "UserEditHistoryFieldChange"),
    CLIENT_CONTACT5("ClientContact5", ClientContact5.class, ClientContact5Wrapper.class, ClientContact5ListWrapper.class, "UserEditHistory",
        "UserEditHistoryFieldChange"),
    CLIENT_CORPORATION("ClientCorporation", ClientCorporation.class, ClientCorporationWrapper.class,
        ClientCorporationListWrapper.class, "ClientCorporationEditHistory", "ClientCorporationEditHistoryFieldChange"),
    CLIENT_CORPORATION1("ClientCorporation1", ClientCorporation1.class, ClientCorporation1Wrapper.class,
        ClientCorporation1ListWrapper.class, "ClientCorporationEditHistory", "ClientCorporationEditHistoryFieldChange"),
    CLIENT_CORPORATION2("ClientCorporation2", ClientCorporation2.class, ClientCorporation2Wrapper.class,
        ClientCorporation2ListWrapper.class, "ClientCorporationEditHistory", "ClientCorporationEditHistoryFieldChange"),
    CLIENT_CORPORATION3("ClientCorporation3", ClientCorporation3.class, ClientCorporation3Wrapper.class,
        ClientCorporation3ListWrapper.class, "ClientCorporationEditHistory", "ClientCorporationEditHistoryFieldChange"),
    CLIENT_CORPORATION4("ClientCorporation4", ClientCorporation4.class, ClientCorporation4Wrapper.class,
        ClientCorporation4ListWrapper.class, "ClientCorporationEditHistory", "ClientCorporationEditHistoryFieldChange"),
    CLIENT_CORPORATION5("ClientCorporation5", ClientCorporation5.class, ClientCorporation5Wrapper.class,
        ClientCorporation5ListWrapper.class, "ClientCorporationEditHistory", "ClientCorporationEditHistoryFieldChange"),
    CLIENT_CORPORATION_CERTIFICATION("ClientCorporationCertification", ClientCorporationCertification.class, ClientCorporationCertificationWrapper.class,
        ClientCorporationCertificationListWrapper.class, null, null),
    CORPORATE_USER("CorporateUser", CorporateUser.class, CorporateUserWrapper.class, CorporateUserListWrapper.class, "UserEditHistory",
        "UserEditHistoryFieldChange"),
    CORPORATION_DEPARTMENT("CorporationDepartment", CorporationDepartment.class, CorporationDepartmentWrapper.class,
        CorporationDepartmentListWrapper.class, null, null),
    COUNTRY("Country", Country.class, CountryWrapper.class, CountryListWrapper.class, null, null),
    DEPARTMENT("Department", Department.class, DepartmentWrapper.class, DepartmentListWrapper.class, null, null),
    DISTRIBUTION_LIST("DistributionList", DistributionList.class, DistributionListWrapper.class, DistributionListListWrapper.class, null, null),
    FILE("File", File.class, FileEntityWrapper.class, FileEntityListWrapper.class, null, null),
    GOAL_TARGET("GoalTarget", GoalTarget.class, GoalTargetWrapper.class, GoalTargetListWrapper.class, null, null),
    HOUSING_COMPLEX("HousingComplex", HousingComplex.class, HousingComplexWrapper.class, HousingComplexListWrapper.class, null, null),
    HOUSING_COMPLEX_UNIT("HousingComplexUnit", HousingComplexUnit.class, HousingComplexUnitWrapper.class, HousingComplexUnitListWrapper.class, null, null),
    HOUSING_COMPLEX_FURNITURE_DELIVERY("HousingComplexFurnitureDelivery", HousingComplexFurnitureDelivery.class, HousingComplexFurnitureDeliveryWrapper.class, HousingComplexFurnitureDeliveryListWrapper.class, null, null),
    HOUSING_COMPLEX_UTILITY_ACCOUNT("HousingComplexUtilityAccount", HousingComplexUtilityAccount.class, HousingComplexUtilityAccountWrapper.class, HousingComplexUtilityAccountListWrapper.class, null, null),
    USER_HOUSING_COMPLEX_UNIT("UserHousingComplexUnit", UserHousingComplexUnit.class, UserHousingComplexUnitWrapper.class, UserHousingComplexUnitListWrapper.class, null, null),
    JOB_ORDER("JobOrder", JobOrder.class, JobOrderWrapper.class, JobOrderListWrapper.class, "JobOrderEditHistory",
        "JobOrderEditHistoryFieldChange"),
    JOB_BOARD_POST("JobBoardPost", JobBoardPost.class, JobBoardPostWrapper.class, JobBoardPostListWrapper.class, null, null),
    JOB_SUBMISSION("JobSubmission", JobSubmission.class, JobSubmissionWrapper.class, JobSubmissionListWrapper.class,
        "JobSubmissionEditHistory", "JobSubmissionEditHistoryFieldChange"),
    JOB_SUBMISSION_HISTORY("JobSubmissionHistory", JobSubmissionHistory.class, JobSubmissionHistoryWrapper.class,
        JobSubmissionHistoryListWrapper.class, null, null),
    LEAD("Lead", Lead.class, LeadWrapper.class, LeadListWrapper.class, "UserEditHistory", "UserEditHistoryFieldChange"),
    LOGIN_RESTRICTIONS("LoginRestrictions", null, null, null, null, null),
    NOTE("Note", Note.class, NoteWrapper.class, NoteListWrapper.class, null, null),
    NOTE_ENTITY("NoteEntity", NoteEntity.class, NoteEntityWrapper.class, NoteEntityListWrapper.class, null, null),
    OPPORTUNITY("Opportunity", Opportunity.class, OpportunityWrapper.class, OpportunityListWrapper.class, "OpportunityEditHistory", "OpportunityEditHistoryFieldChange"),
    PERSON("Person", Person.class, PersonWrapper.class, PersonListWrapper.class, null, null),
    PLACEMENT("Placement", Placement.class, PlacementWrapper.class, PlacementListWrapper.class, "PlacementEditHistory",
        "PlacementEditHistoryFieldChange"),
    PLACEMENT_CHANGE_REQUEST("PlacementChangeRequest", PlacementChangeRequest.class, PlacementChangeRequestWrapper.class,
        PlacementChangeRequestListWrapper.class, "PlacementChangeRequestEditHistory", "PlacementChangeRequestEditHistoryFieldChange"),
    PLACEMENT_CERTIFICATION("PlacementCertification", PlacementCertification.class, PlacementCertificationWrapper.class,
        PlacementCertificationListWrapper.class, "PlacementCertificationEditHistory", "PlacementCertificationEditHistoryFieldChange"),
    PLACEMENT_COMMISSION("PlacementCommission", PlacementCommission.class, PlacementCommissionWrapper.class,
        PlacementCommissionListWrapper.class, "PlacementCommissionEditHistory", "PlacementCommissionEditHistoryFieldChange"),
    PRIVATE_LABEL("PrivateLabel", PrivateLabel.class, PrivateLabelWrapper.class, PrivateLabelListWrapper.class, null, null),
    SENDOUT("Sendout", Sendout.class, SendoutWrapper.class, SendoutListWrapper.class, null, null),
    SKILL("Skill", Skill.class, SkillWrapper.class, SkillListWrapper.class, null, null),
    SPECIALTY("Specialty", Specialty.class, SpecialtyWrapper.class, SpecialtyListWrapper.class, null, null),
    STATE("State", State.class, StateWrapper.class, StateListWrapper.class, null, null),
    TASK("Task", Task.class, TaskWrapper.class, TaskListWrapper.class,
        "TaskEditHistory", "TaskEditHistoryFieldChange"),
    TEARSHEET("Tearsheet", Tearsheet.class, TearsheetWrapper.class, TearsheetListWrapper.class, null, null),
    TEARSHEET_MEMBER("TearsheetMember", TearsheetMember.class, TearsheetMemberWrapper.class, TearsheetMemberListWrapper.class, null, null),
    TIME_UNIT("TimeUnit", TimeUnit.class, TimeUnitWrapper.class, TimeUnitListWrapper.class, null, null),
    USER_TYPE("UserType", UserType.class, UserTypeWrapper.class, UserTypeListWrapper.class, null, null),
    WORKERS_COMPENSATION("WorkersCompensation", WorkersCompensation.class, WorkersCompensationWrapper.class, WorkersCompensationListWrapper.class, null, null),
    WORKERS_COMPENSATION_RATE("WorkersCompensationRate", WorkersCompensationRate.class, WorkersCompensationRateWrapper.class, WorkersCompensationRateListWrapper.class, null, null),

    // PayBill Entities
    LOCATION("Location", Location.class, LocationWrapper.class, LocationListWrapper.class, null, null),
    BILLING_PROFILE("BillingProfile", BillingProfile.class, BillingProfileWrapper.class, BillingProfileListWrapper.class, null, null),
    GENERAL_LEDGER_ACCOUNT("GeneralLedgerAccount", GeneralLedgerAccount.class, GeneralLedgerAccountWrapper.class, GeneralLedgerAccountListWrapper.class, null, null),
    INVOICE_STATEMENT_TEMPLATE("InvoiceStatementTemplate", InvoiceStatementTemplate.class, InvoiceStatementTemplateWrapper.class, InvoiceStatementTemplateListWrapper.class, null, null),
    INVOICE_STATEMENT_MESSAGE_TEMPLATE("InvoiceStatementMessageTemplate", InvoiceStatementMessageTemplate.class, InvoiceStatementMessageTemplateWrapper.class, InvoiceStatementMessageTemplateListWrapper.class, null, null),
    CURRENCY_UNIT("CurrencyUnit", CurrencyUnit.class, CurrencyUnityWrapper.class, CurrencyUnitListWrapper.class, null, null),
    INVOICE_TERM("InvoiceTerm", InvoiceTerm.class, InvoiceTermWrapper.class, InvoiceTermListWrapper.class, null, null),

    // PayBill Entities v2
    BILLABLE_CHARGE("BillableCharge", BillableCharge.class, BillableChargeWrapper.class, BillableChargeListWrapper.class, null, null),
    PAYABLE_CHARGE("PayableCharge", PayableCharge.class, PayableChargeWrapper.class, PayableChargeListWrapper.class, null, null),
    GENERAL_LEDGER_SEGMENT("GeneralLedgerSegment", GeneralLedgerSegment.class, GeneralLedgerSegmentWrapper.class, GeneralLedgerSegmentListWrapper.class, null, null),
    GENERAL_LEDGER_SEGMENT_1("GeneralLedgerSegment1", GeneralLedgerSegment1.class, GeneralLedgerSegment1Wrapper.class, GeneralLedgerSegment1ListWrapper.class, null, null),
    GENERAL_LEDGER_SEGMENT_2("GeneralLedgerSegment2", GeneralLedgerSegment2.class, GeneralLedgerSegment2Wrapper.class, GeneralLedgerSegment2ListWrapper.class, null, null),
    GENERAL_LEDGER_SEGMENT_3("GeneralLedgerSegment3", GeneralLedgerSegment3.class, GeneralLedgerSegment3Wrapper.class, GeneralLedgerSegment3ListWrapper.class, null, null),
    GENERAL_LEDGER_SEGMENT_4("GeneralLedgerSegment4", GeneralLedgerSegment4.class, GeneralLedgerSegment4Wrapper.class, GeneralLedgerSegment4ListWrapper.class, null, null),
    GENERAL_LEDGER_SEGMENT_5("GeneralLedgerSegment5", GeneralLedgerSegment5.class, GeneralLedgerSegment5Wrapper.class, GeneralLedgerSegment5ListWrapper.class, null, null),
    GENERAL_LEDGER_SEGMENT_TYPE("GeneralLedgerSegmentType", GeneralLedgerSegmentType.class, GeneralLedgerSegmentTypeWrapper.class, GeneralLedgerSegmentTypeListWrapper.class, null, null),
    GENERAL_LEDGER_SERVICE_CODE("GeneralLedgerServiceCode", GeneralLedgerServiceCode.class, GeneralLedgerServiceCodeWrapper.class, GeneralLedgerServiceCodeListWrapper.class, null, null),
    DISCOUNT("Discount", Discount.class, DiscountWrapper.class, DiscountListWrapper.class, null, null),
    EARN_CODE("EarnCode", EarnCode.class, EarnCodeWrapper.class, EarnCodeListWrapper.class, null, null),
    INVOICE_STATEMENT("InvoiceStatement", InvoiceStatement.class, InvoiceStatementWrapper.class, InvoiceStatementListWrapper.class, null, null),
    INVOICE_STATEMENT_BATCH("InvoiceStatementBatch", InvoiceStatementBatch.class, InvoiceStatementBatchWrapper.class, InvoiceStatementBatchListWrapper.class, null, null),
    INVOICE_STATEMENT_DISCOUNT("InvoiceStatementDiscount", InvoiceStatementDiscount.class, InvoiceStatementDiscountWrapper.class, InvoiceStatementDiscountListWrapper.class, null, null),
    INVOICE_STATEMENT_EXPORT_BATCH("InvoiceStatementExportBatch", InvoiceStatementExportBatch.class, InvoiceStatementExportBatchWrapper.class, InvoiceStatementExportBatchListWrapper.class, null, null),
    INVOICE_STATEMENT_LINE_ITEM("InvoiceStatementLineItem", InvoiceStatementLineItem.class, InvoiceStatementLineItemWrapper.class, InvoiceStatementLineItemListWrapper.class, null, null),
    INVOICE_STATEMENT_SURCHARGE("InvoiceStatementSurcharge", InvoiceStatementSurcharge.class, InvoiceStatementSurchargeWrapper.class, InvoiceStatementSurchargeListWrapper.class, null, null),
    INVOICE_STATEMENT_TAX("InvoiceStatementTax", InvoiceStatementTax.class, InvoiceStatementTaxWrapper.class, InvoiceStatementTaxListWrapper.class, null, null),
    BATCH_GROUP("BatchGroup", BatchGroup.class, BatchGroupWrapper.class, BatchGroupListWrapper.class, null, null),
    BILLING_SYNC_BATCH("BillingSyncBatch", BillingSyncBatch.class, BillingSyncBatchWrapper.class, BillingSyncBatchListWrapper.class, null, null),
    BILL_MASTER("BillMaster", BillMaster.class, BillMasterWrapper.class, BillMasterListWrapper.class, null, null),
    BILL_MASTER_TRANSACTION("BillMasterTransaction", BillMasterTransaction.class, BillMasterTransactionWrapper.class, BillMasterTransactionListWrapper.class, null, null),
    PAY_MASTER("PayMaster", PayMaster.class, PayMasterWrapper.class, PayMasterListWrapper.class, null, null),
    PAY_MASTER_TRANSACTION("PayMasterTransaction", PayMasterTransaction.class, PayMasterTransactionWrapper.class, PayMasterTransactionListWrapper.class, null, null),
    SURCHARGE("Surcharge", Surcharge.class, SurchargeWrapper.class, SurchargeListWrapper.class, null, null),
    TAX("Tax", Tax.class, TaxWrapper.class, TaxListWrapper.class, null, null),
    CANVAS_REPORT("CanvasReport", CanvasReport.class, CanvasReportWrapper.class, CanvasReportListWrapper.class, null, null),

    // Certification Requirements
    CANDIDATE_CERTIFICATION_REQUIREMENT("CandidateCertificationRequirement", CandidateCertificationRequirement.class, CandidateCertificationRequirementWrapper.class, CandidateCertificationRequirementListWrapper.class, "CandidateCertificationRequirementEditHistory", "CandidateCertificationRequirementEditHistoryFieldChange"),
    CERTIFICATION_REQUIREMENT("CertificationRequirement", CertificationRequirement.class, CertificationRequirementWrapper.class, CertificationRequirementListWrapper.class, "CertificationRequirementEditHistory", "CertificationRequirementEditHistoryFieldChange"),
    JOB_SUBMISSION_CERTIFICATION_REQUIREMENT("JobSubmissionCertificationRequirement", JobSubmissionCertificationRequirement.class, JobSubmissionCertificationRequirementWrapper.class, JobSubmissionCertificationRequirementListWrapper.class, "JobSubmissionCertificationRequirementEditHistory", "JobSubmissionCertificationRequirementEditHistoryFieldChange"),


    // Custom Objects
    CLIENT_CORPORATION_CUSTOM_OBJECT("ClientCorporationCustomObject", ClientCorporationCustomObject.class, ClientCorporationCustomObjectWrapper.class, ClientCorporationCustomObjectListWrapper.class, null, null),
    JOB_ORDER_CUSTOM_OBJECT("JobOrderCustomObject", JobOrderCustomObject.class, JobOrderCustomObjectWrapper.class, JobOrderCustomObjectListWrapper.class, null, null),
    PLACEMENT_CUSTOM_OBJECT("PlacementCustomObject", PlacementCustomObject.class, PlacementCustomObjectWrapper.class, PlacementCustomObjectListWrapper.class, null, null),
    USER_CUSTOM_OBJECT("UserCustomObject", UserCustomObject.class, UserCustomObjectWrapper.class, UserCustomObjectListWrapper.class, null, null),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_1("JobOrderCustomObjectInstance1", JobOrderCustomObjectInstance1.class, JobOrderCustomObjectInstance1Wrapper.class, JobOrderCustomObjectInstance1ListWrapper.class, "JobOrderCustomObject1EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_2("JobOrderCustomObjectInstance2", JobOrderCustomObjectInstance2.class, JobOrderCustomObjectInstance2Wrapper.class, JobOrderCustomObjectInstance2ListWrapper.class, "JobOrderCustomObject2EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_3("JobOrderCustomObjectInstance3", JobOrderCustomObjectInstance3.class, JobOrderCustomObjectInstance3Wrapper.class, JobOrderCustomObjectInstance3ListWrapper.class, "JobOrderCustomObject3EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_4("JobOrderCustomObjectInstance4", JobOrderCustomObjectInstance4.class, JobOrderCustomObjectInstance4Wrapper.class, JobOrderCustomObjectInstance4ListWrapper.class, "JobOrderCustomObject4EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_5("JobOrderCustomObjectInstance5", JobOrderCustomObjectInstance5.class, JobOrderCustomObjectInstance5Wrapper.class, JobOrderCustomObjectInstance5ListWrapper.class, "JobOrderCustomObject5EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_6("JobOrderCustomObjectInstance6", JobOrderCustomObjectInstance6.class, JobOrderCustomObjectInstance6Wrapper.class, JobOrderCustomObjectInstance6ListWrapper.class, "JobOrderCustomObject6EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_7("JobOrderCustomObjectInstance7", JobOrderCustomObjectInstance7.class, JobOrderCustomObjectInstance7Wrapper.class, JobOrderCustomObjectInstance7ListWrapper.class, "JobOrderCustomObject7EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_8("JobOrderCustomObjectInstance8", JobOrderCustomObjectInstance8.class, JobOrderCustomObjectInstance8Wrapper.class, JobOrderCustomObjectInstance8ListWrapper.class, "JobOrderCustomObject8EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_9("JobOrderCustomObjectInstance9", JobOrderCustomObjectInstance9.class, JobOrderCustomObjectInstance9Wrapper.class, JobOrderCustomObjectInstance9ListWrapper.class, "JobOrderCustomObject9EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    JOB_ORDER_CUSTOM_OBJECT_INSTANCE_10("JobOrderCustomObjectInstance10", JobOrderCustomObjectInstance10.class, JobOrderCustomObjectInstance10Wrapper.class, JobOrderCustomObjectInstance10ListWrapper.class, "JobOrderCustomObject10EditHistory", "JobOrderCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_1("OpportunityCustomObjectInstance1", OpportunityCustomObjectInstance1.class, OpportunityCustomObjectInstance1Wrapper.class, OpportunityCustomObjectInstance1ListWrapper.class, "OpportunityCustomObject1EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_2("OpportunityCustomObjectInstance2", OpportunityCustomObjectInstance2.class, OpportunityCustomObjectInstance2Wrapper.class, OpportunityCustomObjectInstance2ListWrapper.class, "OpportunityCustomObject2EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_3("OpportunityCustomObjectInstance3", OpportunityCustomObjectInstance3.class, OpportunityCustomObjectInstance3Wrapper.class, OpportunityCustomObjectInstance3ListWrapper.class, "OpportunityCustomObject3EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_4("OpportunityCustomObjectInstance4", OpportunityCustomObjectInstance4.class, OpportunityCustomObjectInstance4Wrapper.class, OpportunityCustomObjectInstance4ListWrapper.class, "OpportunityCustomObject4EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_5("OpportunityCustomObjectInstance5", OpportunityCustomObjectInstance5.class, OpportunityCustomObjectInstance5Wrapper.class, OpportunityCustomObjectInstance5ListWrapper.class, "OpportunityCustomObject5EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_6("OpportunityCustomObjectInstance6", OpportunityCustomObjectInstance6.class, OpportunityCustomObjectInstance6Wrapper.class, OpportunityCustomObjectInstance6ListWrapper.class, "OpportunityCustomObject6EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_7("OpportunityCustomObjectInstance7", OpportunityCustomObjectInstance7.class, OpportunityCustomObjectInstance7Wrapper.class, OpportunityCustomObjectInstance7ListWrapper.class, "OpportunityCustomObject7EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_8("OpportunityCustomObjectInstance8", OpportunityCustomObjectInstance8.class, OpportunityCustomObjectInstance8Wrapper.class, OpportunityCustomObjectInstance8ListWrapper.class, "OpportunityCustomObject8EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_9("OpportunityCustomObjectInstance9", OpportunityCustomObjectInstance9.class, OpportunityCustomObjectInstance9Wrapper.class, OpportunityCustomObjectInstance9ListWrapper.class, "OpportunityCustomObject9EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    OPPORTUNITY_CUSTOM_OBJECT_INSTANCE_10("OpportunityCustomObjectInstance10", OpportunityCustomObjectInstance10.class, OpportunityCustomObjectInstance10Wrapper.class, OpportunityCustomObjectInstance10ListWrapper.class, "OpportunityCustomObject10EditHistory", "OpportunityCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_1("PlacementCustomObjectInstance1", PlacementCustomObjectInstance1.class, PlacementCustomObjectInstance1Wrapper.class, PlacementCustomObjectInstance1ListWrapper.class, "PlacementCustomObject1EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_2("PlacementCustomObjectInstance2", PlacementCustomObjectInstance2.class, PlacementCustomObjectInstance2Wrapper.class, PlacementCustomObjectInstance2ListWrapper.class, "PlacementCustomObject2EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_3("PlacementCustomObjectInstance3", PlacementCustomObjectInstance3.class, PlacementCustomObjectInstance3Wrapper.class, PlacementCustomObjectInstance3ListWrapper.class, "PlacementCustomObject3EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_4("PlacementCustomObjectInstance4", PlacementCustomObjectInstance4.class, PlacementCustomObjectInstance4Wrapper.class, PlacementCustomObjectInstance4ListWrapper.class, "PlacementCustomObject4EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_5("PlacementCustomObjectInstance5", PlacementCustomObjectInstance5.class, PlacementCustomObjectInstance5Wrapper.class, PlacementCustomObjectInstance5ListWrapper.class, "PlacementCustomObject5EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_6("PlacementCustomObjectInstance6", PlacementCustomObjectInstance6.class, PlacementCustomObjectInstance6Wrapper.class, PlacementCustomObjectInstance6ListWrapper.class, "PlacementCustomObject6EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_7("PlacementCustomObjectInstance7", PlacementCustomObjectInstance7.class, PlacementCustomObjectInstance7Wrapper.class, PlacementCustomObjectInstance7ListWrapper.class, "PlacementCustomObject7EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_8("PlacementCustomObjectInstance8", PlacementCustomObjectInstance8.class, PlacementCustomObjectInstance8Wrapper.class, PlacementCustomObjectInstance8ListWrapper.class, "PlacementCustomObject8EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_9("PlacementCustomObjectInstance9", PlacementCustomObjectInstance9.class, PlacementCustomObjectInstance9Wrapper.class, PlacementCustomObjectInstance9ListWrapper.class, "PlacementCustomObject9EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    PLACEMENT_CUSTOM_OBJECT_INSTANCE_10("PlacementCustomObjectInstance10", PlacementCustomObjectInstance10.class, PlacementCustomObjectInstance10Wrapper.class, PlacementCustomObjectInstance10ListWrapper.class, "PlacementCustomObject10EditHistory", "PlacementCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_1("ClientCorporationCustomObjectInstance1", ClientCorporationCustomObjectInstance1.class, ClientCorporationCustomObjectInstance1Wrapper.class, ClientCorporationCustomObjectInstance1ListWrapper.class, "ClientCorporationCustomObject1EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_2("ClientCorporationCustomObjectInstance2", ClientCorporationCustomObjectInstance2.class, ClientCorporationCustomObjectInstance2Wrapper.class, ClientCorporationCustomObjectInstance2ListWrapper.class, "ClientCorporationCustomObject2EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_3("ClientCorporationCustomObjectInstance3", ClientCorporationCustomObjectInstance3.class, ClientCorporationCustomObjectInstance3Wrapper.class, ClientCorporationCustomObjectInstance3ListWrapper.class, "ClientCorporationCustomObject3EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_4("ClientCorporationCustomObjectInstance4", ClientCorporationCustomObjectInstance4.class, ClientCorporationCustomObjectInstance4Wrapper.class, ClientCorporationCustomObjectInstance4ListWrapper.class, "ClientCorporationCustomObject4EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_5("ClientCorporationCustomObjectInstance5", ClientCorporationCustomObjectInstance5.class, ClientCorporationCustomObjectInstance5Wrapper.class, ClientCorporationCustomObjectInstance5ListWrapper.class, "ClientCorporationCustomObject5EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_6("ClientCorporationCustomObjectInstance6", ClientCorporationCustomObjectInstance6.class, ClientCorporationCustomObjectInstance6Wrapper.class, ClientCorporationCustomObjectInstance6ListWrapper.class, "ClientCorporationCustomObject6EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_7("ClientCorporationCustomObjectInstance7", ClientCorporationCustomObjectInstance7.class, ClientCorporationCustomObjectInstance7Wrapper.class, ClientCorporationCustomObjectInstance7ListWrapper.class, "ClientCorporationCustomObject7EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_8("ClientCorporationCustomObjectInstance8", ClientCorporationCustomObjectInstance8.class, ClientCorporationCustomObjectInstance8Wrapper.class, ClientCorporationCustomObjectInstance8ListWrapper.class, "ClientCorporationCustomObject8EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_9("ClientCorporationCustomObjectInstance9", ClientCorporationCustomObjectInstance9.class, ClientCorporationCustomObjectInstance9Wrapper.class, ClientCorporationCustomObjectInstance9ListWrapper.class, "ClientCorporationCustomObject9EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_10("ClientCorporationCustomObjectInstance10", ClientCorporationCustomObjectInstance10.class, ClientCorporationCustomObjectInstance10Wrapper.class, ClientCorporationCustomObjectInstance10ListWrapper.class, "ClientCorporationCustomObject10EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_11("ClientCorporationCustomObjectInstance11", ClientCorporationCustomObjectInstance11.class, ClientCorporationCustomObjectInstance11Wrapper.class, ClientCorporationCustomObjectInstance11ListWrapper.class, "ClientCorporationCustomObject11EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_12("ClientCorporationCustomObjectInstance12", ClientCorporationCustomObjectInstance12.class, ClientCorporationCustomObjectInstance12Wrapper.class, ClientCorporationCustomObjectInstance12ListWrapper.class, "ClientCorporationCustomObject12EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_13("ClientCorporationCustomObjectInstance13", ClientCorporationCustomObjectInstance13.class, ClientCorporationCustomObjectInstance13Wrapper.class, ClientCorporationCustomObjectInstance13ListWrapper.class, "ClientCorporationCustomObject13EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_14("ClientCorporationCustomObjectInstance14", ClientCorporationCustomObjectInstance14.class, ClientCorporationCustomObjectInstance14Wrapper.class, ClientCorporationCustomObjectInstance14ListWrapper.class, "ClientCorporationCustomObject14EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_15("ClientCorporationCustomObjectInstance15", ClientCorporationCustomObjectInstance15.class, ClientCorporationCustomObjectInstance15Wrapper.class, ClientCorporationCustomObjectInstance15ListWrapper.class, "ClientCorporationCustomObject15EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_16("ClientCorporationCustomObjectInstance16", ClientCorporationCustomObjectInstance16.class, ClientCorporationCustomObjectInstance16Wrapper.class, ClientCorporationCustomObjectInstance16ListWrapper.class, "ClientCorporationCustomObject16EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_17("ClientCorporationCustomObjectInstance17", ClientCorporationCustomObjectInstance17.class, ClientCorporationCustomObjectInstance17Wrapper.class, ClientCorporationCustomObjectInstance17ListWrapper.class, "ClientCorporationCustomObject17EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_18("ClientCorporationCustomObjectInstance18", ClientCorporationCustomObjectInstance18.class, ClientCorporationCustomObjectInstance18Wrapper.class, ClientCorporationCustomObjectInstance18ListWrapper.class, "ClientCorporationCustomObject18EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_19("ClientCorporationCustomObjectInstance19", ClientCorporationCustomObjectInstance19.class, ClientCorporationCustomObjectInstance19Wrapper.class, ClientCorporationCustomObjectInstance19ListWrapper.class, "ClientCorporationCustomObject19EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_20("ClientCorporationCustomObjectInstance20", ClientCorporationCustomObjectInstance20.class, ClientCorporationCustomObjectInstance20Wrapper.class, ClientCorporationCustomObjectInstance20ListWrapper.class, "ClientCorporationCustomObject20EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_21("ClientCorporationCustomObjectInstance21", ClientCorporationCustomObjectInstance21.class, ClientCorporationCustomObjectInstance21Wrapper.class, ClientCorporationCustomObjectInstance21ListWrapper.class, "ClientCorporationCustomObject21EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_22("ClientCorporationCustomObjectInstance22", ClientCorporationCustomObjectInstance22.class, ClientCorporationCustomObjectInstance22Wrapper.class, ClientCorporationCustomObjectInstance22ListWrapper.class, "ClientCorporationCustomObject22EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_23("ClientCorporationCustomObjectInstance23", ClientCorporationCustomObjectInstance23.class, ClientCorporationCustomObjectInstance23Wrapper.class, ClientCorporationCustomObjectInstance23ListWrapper.class, "ClientCorporationCustomObject23EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_24("ClientCorporationCustomObjectInstance24", ClientCorporationCustomObjectInstance24.class, ClientCorporationCustomObjectInstance24Wrapper.class, ClientCorporationCustomObjectInstance24ListWrapper.class, "ClientCorporationCustomObject24EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_25("ClientCorporationCustomObjectInstance25", ClientCorporationCustomObjectInstance25.class, ClientCorporationCustomObjectInstance25Wrapper.class, ClientCorporationCustomObjectInstance25ListWrapper.class, "ClientCorporationCustomObject25EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_26("ClientCorporationCustomObjectInstance26", ClientCorporationCustomObjectInstance26.class, ClientCorporationCustomObjectInstance26Wrapper.class, ClientCorporationCustomObjectInstance26ListWrapper.class, "ClientCorporationCustomObject26EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_27("ClientCorporationCustomObjectInstance27", ClientCorporationCustomObjectInstance27.class, ClientCorporationCustomObjectInstance27Wrapper.class, ClientCorporationCustomObjectInstance27ListWrapper.class, "ClientCorporationCustomObject27EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_28("ClientCorporationCustomObjectInstance28", ClientCorporationCustomObjectInstance28.class, ClientCorporationCustomObjectInstance28Wrapper.class, ClientCorporationCustomObjectInstance28ListWrapper.class, "ClientCorporationCustomObject28EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_29("ClientCorporationCustomObjectInstance29", ClientCorporationCustomObjectInstance29.class, ClientCorporationCustomObjectInstance29Wrapper.class, ClientCorporationCustomObjectInstance29ListWrapper.class, "ClientCorporationCustomObject29EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_30("ClientCorporationCustomObjectInstance30", ClientCorporationCustomObjectInstance30.class, ClientCorporationCustomObjectInstance30Wrapper.class, ClientCorporationCustomObjectInstance30ListWrapper.class, "ClientCorporationCustomObject30EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_31("ClientCorporationCustomObjectInstance31", ClientCorporationCustomObjectInstance31.class, ClientCorporationCustomObjectInstance31Wrapper.class, ClientCorporationCustomObjectInstance31ListWrapper.class, "ClientCorporationCustomObject31EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_32("ClientCorporationCustomObjectInstance32", ClientCorporationCustomObjectInstance32.class, ClientCorporationCustomObjectInstance32Wrapper.class, ClientCorporationCustomObjectInstance32ListWrapper.class, "ClientCorporationCustomObject32EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_33("ClientCorporationCustomObjectInstance33", ClientCorporationCustomObjectInstance33.class, ClientCorporationCustomObjectInstance33Wrapper.class, ClientCorporationCustomObjectInstance33ListWrapper.class, "ClientCorporationCustomObject33EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_34("ClientCorporationCustomObjectInstance34", ClientCorporationCustomObjectInstance34.class, ClientCorporationCustomObjectInstance34Wrapper.class, ClientCorporationCustomObjectInstance34ListWrapper.class, "ClientCorporationCustomObject34EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    CLIENT_CORPORATION_CUSTOM_OBJECT_INSTANCE_35("ClientCorporationCustomObjectInstance35", ClientCorporationCustomObjectInstance35.class, ClientCorporationCustomObjectInstance35Wrapper.class, ClientCorporationCustomObjectInstance35ListWrapper.class, "ClientCorporationCustomObject35EditHistory", "ClientCorporationCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_1("PersonCustomObjectInstance1", PersonCustomObjectInstance1.class, PersonCustomObjectInstance1Wrapper.class, PersonCustomObjectInstance1ListWrapper.class, "PersonCustomObject1EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_2("PersonCustomObjectInstance2", PersonCustomObjectInstance2.class, PersonCustomObjectInstance2Wrapper.class, PersonCustomObjectInstance2ListWrapper.class, "PersonCustomObject2EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_3("PersonCustomObjectInstance3", PersonCustomObjectInstance3.class, PersonCustomObjectInstance3Wrapper.class, PersonCustomObjectInstance3ListWrapper.class, "PersonCustomObject3EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_4("PersonCustomObjectInstance4", PersonCustomObjectInstance4.class, PersonCustomObjectInstance4Wrapper.class, PersonCustomObjectInstance4ListWrapper.class, "PersonCustomObject4EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_5("PersonCustomObjectInstance5", PersonCustomObjectInstance5.class, PersonCustomObjectInstance5Wrapper.class, PersonCustomObjectInstance5ListWrapper.class, "PersonCustomObject5EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_6("PersonCustomObjectInstance6", PersonCustomObjectInstance6.class, PersonCustomObjectInstance6Wrapper.class, PersonCustomObjectInstance6ListWrapper.class, "PersonCustomObject6EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_7("PersonCustomObjectInstance7", PersonCustomObjectInstance7.class, PersonCustomObjectInstance7Wrapper.class, PersonCustomObjectInstance7ListWrapper.class, "PersonCustomObject7EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_8("PersonCustomObjectInstance8", PersonCustomObjectInstance8.class, PersonCustomObjectInstance8Wrapper.class, PersonCustomObjectInstance8ListWrapper.class, "PersonCustomObject8EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_9("PersonCustomObjectInstance9", PersonCustomObjectInstance9.class, PersonCustomObjectInstance9Wrapper.class, PersonCustomObjectInstance9ListWrapper.class, "PersonCustomObject9EditHistory", "PersonCustomObjectEditHistoryFieldChange"),
    PERSON_CUSTOM_OBJECT_INSTANCE_10("PersonCustomObjectInstance10", PersonCustomObjectInstance10.class, PersonCustomObjectInstance10Wrapper.class, PersonCustomObjectInstance10ListWrapper.class, "PersonCustomObject10EditHistory", "PersonCustomObjectEditHistoryFieldChange"),

    // File Attachment Entities
    CANDIDATE_FILE_ATTACHMENT("CandidateFileAttachment", CandidateFileAttachment.class, CandidateFileAttachmentWrapper.class, CandidateFileAttachmentListWrapper.class, null, null),
    CERTIFICATION_FILE_ATTACHMENT("CertificationFileAttachment", CertificationFileAttachment.class, CertificationFileAttachmentWrapper.class, CertificationFileAttachmentListWrapper.class, null, null),
    CLIENT_CONTACT_FILE_ATTACHMENT("ClientContactFileAttachment", ClientContactFileAttachment.class, ClientContactFileAttachmentWrapper.class, ClientContactFileAttachmentListWrapper.class, null, null),
    CLIENT_CORPORATION_FILE_ATTACHMENT("ClientCorporationFileAttachment", ClientCorporationFileAttachment.class, ClientCorporationFileAttachmentWrapper.class, ClientCorporationFileAttachmentListWrapper.class, null, null),
    JOB_ORDER_FILE_ATTACHMENT("JobOrderFileAttachment", JobOrderFileAttachment.class, JobOrderFileAttachmentWrapper.class, JobOrderFileAttachmentListWrapper.class, null, null),
    OPPORTUNITY_FILE_ATTACHMENT("OpportunityFileAttachment", OpportunityFileAttachment.class, OpportunityFileAttachmentWrapper.class, OpportunityFileAttachmentListWrapper.class, null, null),
    PLACEMENT_FILE_ATTACHMENT("PlacementFileAttachment", PlacementFileAttachment.class, PlacementFileAttachmentWrapper.class, PlacementFileAttachmentListWrapper.class, null, null),
    BILLABLE_CHARGE_FILE_ATTACHMENT("BillableChargeFileAttachment", BillableChargeFileAttachment.class, BillableChargeFileAttachmentWrapper.class, BillableChargeFileAttachmentListWrapper.class, null, null),
    INVOICE_STATEMENT_EXPORT("InvoiceStatementExport", InvoiceStatementExport.class, InvoiceStatementExportWrapper.class, InvoiceStatementExportListWrapper.class, null, null),

    // Specialized Lookup Entities
    CERTIFICATION_REQUIREMENT_STATUS_LOOKUP("CertificationRequirementStatusLookup", CertificationRequirementStatusLookup.class, CertificationRequirementStatusLookupWrapper.class, CertificationRequirementStatusLookupListWrapper.class, null, null);

    private final String name;

    private final Class<?> type;

    private final Class<? extends Wrapper<?>> wrapperType;

    private final Class<? extends ListWrapper<?>> listWrapperType;

    private final String editHistoryName;

    private final String editHistoryFieldChangeName;

    private static Map<Class<?>, BullhornEntityInfo> classToRestEntityName;

    <T extends BullhornEntity> BullhornEntityInfo(String name, Class<T> type, Class<? extends Wrapper<T>> wrapperType,
                                                  Class<? extends ListWrapper<T>> listWrapperType, String editHistoryName,
                                                  String editHistoryFieldChangeName) {
        this.name = name;
        this.type = type;
        this.wrapperType = wrapperType;
        this.listWrapperType = listWrapperType;
        this.editHistoryName = editHistoryName;
        this.editHistoryFieldChangeName = editHistoryFieldChangeName;
    }

    /**
     * Returns the case sensitive name that should be used in bh rest api calls.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the type of the wrapper for this BullhornEntity
     *
     * @return
     */
    public <T extends BullhornEntity, E extends Wrapper<T>> Class<E> getWrapperType() {
        return (Class<E>) wrapperType;
    }

    /**
     * Returns the BullhornEntity class.
     *
     * @return
     */
    public <T extends BullhornEntity> Class<T> getType() {
        return (Class<T>) type;
    }

    /**
     * Returns a list of all RestEntityNames
     *
     * @return
     */
    public List<BullhornEntityInfo> getAllEntities() {
        return Arrays.asList(BullhornEntityInfo.values());
    }

    /**
     * Returns the wrapper class for the BullhornEntity Class<T>
     *
     * @param type the BullhornEntity class
     * @return
     */
    public static <T extends BullhornEntity, E extends Wrapper<T>> Class<E> getTypesWrapperType(Class<T> type) {
        return (Class<E>) BullhornEntityInfo.getTypesRestEntityName(type).wrapperType;

    }

    /**
     * Returns the list wrapper class for the BullhornEntity Class<T>
     *
     * @param type
     * @return
     */
    public static <T extends BullhornEntity, E extends ListWrapper<T>> Class<E> getTypesListWrapperType(Class<T> type) {
        return (Class<E>) BullhornEntityInfo.getTypesRestEntityName(type).listWrapperType;

    }

    /**
     * Returns the pretty name for a BullhornEntity Class<T>
     *
     * @param type
     * @return
     */
    public static <T extends BullhornEntity> String getTypesName(Class<T> type) {
        return BullhornEntityInfo.getTypesRestEntityName(type).name;

    }

    /**
     * Returns the BullhornEntityInfo for the BullhornEntity Class<T> passed in
     *
     * @param type
     * @return
     */
    public static <T extends BullhornEntity> BullhornEntityInfo getTypesRestEntityName(Class<T> type) {
        if (BullhornEntityInfo.classToRestEntityName == null) {
            BullhornEntityInfo.initMapping();
        }

        BullhornEntityInfo value = BullhornEntityInfo.classToRestEntityName.get(type);

        if (value == null) {
            BullhornEntityInfo.initMapping();
        } else {
            return value;
        }

        return BullhornEntityInfo.classToRestEntityName.get(type);

    }

    /**
     * Returns the BullhornEntityInfo for the name of the BullhornEntity passed in. Not case sensitive.
     *
     * @param name
     * @return
     */
    public static BullhornEntityInfo getTypeFromName(String name) {

        for (BullhornEntityInfo bullhornEntityInfo : BullhornEntityInfo.values()) {
            if (bullhornEntityInfo.getName().equalsIgnoreCase(name)) {
                return bullhornEntityInfo;
            }
        }
        throw new IllegalArgumentException("No BullhornEntity exists with the name: " + name);

    }

    /**
     * Returns the edithistory name for a BullhornEntity Class<T>
     *
     * @param type
     * @return
     */
    public static <T extends BullhornEntity> String getTypesEditHistoryName(Class<T> type) {
        return BullhornEntityInfo.getTypesRestEntityName(type).editHistoryName;

    }

    /**
     * Returns the edithistoryfieldchange name for a BullhornEntity Class<T>
     *
     * @param type
     * @return
     */
    public static <T extends BullhornEntity> String getTypesEditHistoryFieldChangeName(Class<T> type) {
        return BullhornEntityInfo.getTypesRestEntityName(type).editHistoryFieldChangeName;

    }

    public String getEditHistoryName() {
        return editHistoryName;
    }

    public String getEditHistoryFieldChangeName() {
        return editHistoryFieldChangeName;
    }

    private synchronized static void initMapping() {
        classToRestEntityName = new HashMap<Class<?>, BullhornEntityInfo>();
        for (BullhornEntityInfo s : values()) {
            classToRestEntityName.put(s.type, s);
        }
    }

}
