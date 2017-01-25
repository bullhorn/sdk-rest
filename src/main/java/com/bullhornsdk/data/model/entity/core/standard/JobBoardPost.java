package com.bullhornsdk.data.model.entity.core.standard;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "address", "appointments", "approvedPlacements", "assignedUsers", "benefits", "billRateCategoryID",
		"bonusPackage", "branchCode", "businessSectors", "categories", "certificationList", "certifications", "clientBillRate",
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
		"tearsheets", "timeUnits", "title", "travelRequirements", "type", "webResponses", "willRelocate", "willRelocateInt", "willSponsor", "yearsRequired",
		"customObject1s", "customObject2s", "customObject3s", "customObject4s", "customObject5s", "customObject6s", "customObject7s",
        "customObject8s", "customObject9s", "customObject10s", "dateLastPublished"})
public class JobBoardPost extends JobData implements QueryEntity, DateLastModifiedEntity {

    private DateTime dateLastPublished;

    @JsonProperty("dateLastExported")
    public DateTime getDateLastPublished() {
        return dateLastPublished;
    }

    @ReadOnly
    @JsonProperty("dateLastExported")
    public void setDateLastPublished(DateTime dateLastPublished) {
        this.dateLastPublished = dateLastPublished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobBoardPost)) return false;
        if (!super.equals(o)) return false;

        JobBoardPost that = (JobBoardPost) o;

        return dateLastPublished != null ? dateLastPublished.equals(that.dateLastPublished) : that.dateLastPublished == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (dateLastPublished != null ? dateLastPublished.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder("JobBoardPost {")
            .append("\n\t\"dateLastPublished\": ")
            .append(dateLastPublished)
            .append('}')
            .toString();
    }
}
