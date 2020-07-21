package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.BaseCustomFields;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "userId", "goalId", "goalPeriodId", "periodname", "startDate", "endDate", "target"})
public class GoalTarget implements AllRecordsEntity, CreateEntity, UpdateEntity, QueryEntity, AssociationEntity, HardDeleteEntity {

    private Integer id;

    private Integer userID;

    private Integer goalID;

    private Integer goalPeriodID;

    private String periodname;

    private DateTime startDate;

    private DateTime endDate;

    private Integer target;


    @JsonProperty("id")
    @Override
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("userId")
     public Integer getUserId() {
        return userID;
    }

    @JsonProperty("userId")
    public void setUserId(Integer userID) {
        this.userID = userID;
    }

    @JsonProperty("goalId")
    public Integer getGoalId() {
        return goalID;
    }

    @JsonProperty("goalId")
    public void setGoalId(Integer goalID) {
        this.goalID = goalID;
    }

    @JsonProperty("goalPeriodId")
    public Integer getGoalPeriodId() {
        return goalPeriodID;
    }

    @JsonProperty("goalPeriodId")
    public void setGoalPeriodId(Integer goalPeriodID) {
        this.goalPeriodID = goalPeriodID;
    }

    @JsonProperty("periodname")
    public String getPeriodName() {
        return periodname;
    }

    @JsonProperty("periodname")
    public void setPeriodName(String periodName) {
        this.periodname = periodName;
    }

    @JsonProperty("startDate")
    public DateTime getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("endDate")
    public DateTime getEndDate() {
        return startDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("target")
    public Integer getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(Integer target) {
        this.target = target;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GoalTarget)) return false;

        GoalTarget goalTarget = (GoalTarget) o;

        if (id != null ? !id.equals(goalTarget.id) : goalTarget.id != null) return false;
        if (userID != null ? !userID.equals(goalTarget.userID) : goalTarget.userID != null) return false;
        if (goalID != null ? !goalID.equals(goalTarget.goalID) : goalTarget.goalID != null) return false;
        if (goalPeriodID != null ? !goalPeriodID.equals(goalTarget.goalPeriodID) : goalTarget.goalPeriodID != null)
            return false;
        if (periodname != null ? !periodname.equals(goalTarget.periodname) : goalTarget.periodname != null) return false;
        if (startDate != null ? !startDate.equals(goalTarget.startDate) : goalTarget.startDate != null) return false;
        if (endDate != null ? !endDate.equals(goalTarget.endDate) : goalTarget.endDate != null) return false;
        return target != null ? target.equals(goalTarget.target) : goalTarget.target == null;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (userID != null ? userID.hashCode() : 0);
        result = 31 * result + (goalID != null ? goalID.hashCode() : 0);
        result = 31 * result + (goalPeriodID != null ? goalPeriodID.hashCode() : 0);
        result = 31 * result + (periodname != null ? periodname.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (target != null ? target.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder("goalTarget {")
            .append("\n\t\"id\": ")
            .append(id)
            .append(",\n\t\"userID\": ")
            .append("'")
            .append(userID).append('\'')
            .append(",\n\t\"goalID\": ")
            .append(goalID).append('\'')
            .append(",\n\t\"goalPeriodID\": ")
            .append(goalPeriodID).append('\'')
            .append(",\n\t\"periodName\": ")
            .append("'")
            .append(periodname).append('\'')
            .append(",\n\t\"startDate\": ")
            .append(startDate).append('\'')
            .append(",\n\t\"endDate\": ")
            .append("'")
            .append(endDate).append('\'')
            .append(",\n\t\"target\": ")
            .append("'")
            .append(target).append('\'')
            .append('}')
            .toString();
    }
}
