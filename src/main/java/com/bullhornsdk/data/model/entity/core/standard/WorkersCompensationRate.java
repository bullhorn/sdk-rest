package com.bullhornsdk.data.model.entity.core.standard;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "startDate", "endDate", "privateLabel", "rate", "compensation" })
public class WorkersCompensationRate extends AbstractEntity implements QueryEntity, CreateEntity, UpdateEntity {

    private Integer id;

    private DateTime startDate;

    private DateTime endDate;

    private PrivateLabel privateLabel;

    private BigDecimal rate;

    private WorkersCompensation compensation;

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @Override
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("privateLabel")
    public PrivateLabel getPrivateLabel() {
        return privateLabel;
    }

    @JsonProperty("privateLabel")
    public void setPrivateLabel(PrivateLabel privateLabel) {
        this.privateLabel = privateLabel;
    }

    @JsonProperty("rate")
    public BigDecimal getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @JsonProperty("compensation")
    public WorkersCompensation getCompensation() {
        return compensation;
    }

    @JsonProperty("compensation")
    public void setCompensation(WorkersCompensation compensation) {
        this.compensation = compensation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkersCompensationRate)) return false;

        WorkersCompensationRate that = (WorkersCompensationRate) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (privateLabel != null ? !privateLabel.equals(that.privateLabel) : that.privateLabel != null) return false;
        if (rate != null ? !rate.equals(that.rate) : that.rate != null) return false;
        return compensation != null ? compensation.equals(that.compensation) : that.compensation == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (privateLabel != null ? privateLabel.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (compensation != null ? compensation.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder("WorkersCompensationRate {")
            .append("\n\t\"id\": ")
            .append(id)
            .append(",\n\t\"startDate\": ")
            .append(startDate)
            .append(",\n\t\"endDate\": ")
            .append(endDate)
            .append(",\n\t\"privateLabel\": ")
            .append(privateLabel)
            .append(",\n\t\"rate\": ")
            .append(rate)
            .append(",\n\t\"compensation\": ")
            .append(compensation)
            .append('}')
            .toString();
    }
}
