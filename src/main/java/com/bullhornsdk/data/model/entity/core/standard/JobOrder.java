package com.bullhornsdk.data.model.entity.core.standard;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.EditHistoryEntity;
import com.bullhornsdk.data.model.entity.core.type.FileEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "address", "appointments", "approvedPlacements", "assignedUsers", "benefits", "billRateCategoryID",
		"bonusPackage", "branch", "branchCode", "businessSectors", "categories", "certificationList", "certifications", "clientBillRate",
		"clientContact", "clientCorporation", "correlatedCustomDate1", "correlatedCustomDate2", "correlatedCustomDate3",
		"correlatedCustomFloat1", "correlatedCustomFloat2", "correlatedCustomFloat3", "correlatedCustomInt1", "correlatedCustomInt2",
		"correlatedCustomInt3", "correlatedCustomText1", "correlatedCustomText10", "correlatedCustomText2", "correlatedCustomText3",
		"correlatedCustomText4", "correlatedCustomText5", "correlatedCustomText6", "correlatedCustomText7", "correlatedCustomText8",
		"correlatedCustomText9", "correlatedCustomTextBlock1", "correlatedCustomTextBlock2", "correlatedCustomTextBlock3", "costCenter",
		"customDate1", "customDate2", "customDate3", "customFloat1", "customFloat2", "customFloat3", "customInt1", "customInt2",
		"customInt3", "customText1", "customText10", "customText11", "customText12", "customText13", "customText14", "customText15",
		"customText16", "customText17", "customText18", "customText19", "customText2", "customText20", "customText3", "customText4",
		"customText5", "customText6", "customText7", "customText8", "customText9", "customTextBlock1", "customTextBlock2",
		"customTextBlock3", "customTextBlock4", "customTextBlock5", "dateAdded", "dateClosed", "dateEnd", "dateLastExported", "dateLastModified", "degreeList",
		"description", "durationWeeks", "educationDegree", "employmentType", "externalCategoryID", "externalID", "feeArrangement",
		"hoursOfOperation", "hoursPerWeek", "interviews", "isClientEditable", "isDeleted", "isInterviewRequired", "isJobcastPublished",
		"isOpen", "isPublic", "jobBoardList", "notes", "numOpenings", "onSite", "opportunity", "optionsPackage", "owner", "payRate", "placements",
		"publicDescription", "publishedZip", "reasonClosed", "reportTo", "reportToClientContact", "responseUser", "salary", "salaryUnit",
		"sendouts", "skillList", "skills", "source", "specialties", "startDate", "status", "submissions", "tasks", "taxRate", "taxStatus",
		"tearsheets", "timeUnits", "title", "travelRequirements", "type", "webResponses", "willRelocate", "willRelocateInt", "willSponsor", "workersCompRate", "yearsRequired",
		"customObject1s", "customObject2s", "customObject3s", "customObject4s", "customObject5s", "customObject6s", "customObject7s",
        "customObject8s", "customObject9s", "customObject10s"})
public class JobOrder extends JobData implements QueryEntity, SearchEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, FileEntity,
		AssociationEntity, DateLastModifiedEntity, EditHistoryEntity {

    public JobOrder() {
    }

    public JobOrder(Integer id) {
        super(id);
    }

    public JobOrder instantiateForInsert() {
		JobOrder entity = new JobOrder();

		entity.setEmploymentType("Contract");
		entity.setStartDate(new DateTime());
		entity.setClientCorporation(new ClientCorporation(1));
		entity.setClientContact(new ClientContact(1));

		return entity;
	}

}
