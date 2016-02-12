package com.bullhornsdk.data.model.entity.embedded;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "ipAddress", "timeStart", "timeEnd", "weekDays" })
public class LoginRestrictions extends AbstractEntity {

    private String ipAddress;

    private DateTime timeStart;

    private DateTime timeEnd;

    private List<String> weekDays = new ArrayList<String>();

    @JsonProperty("ipAddress")
    public String getIpAddress() {
        return ipAddress;
    }

    @JsonProperty("ipAddress")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @JsonProperty("timeStart")
    public DateTime getTimeStart() {
        return timeStart;
    }

    @JsonProperty("timeStart")
    public void setTimeStart(DateTime timeStart) {
        this.timeStart = timeStart;
    }

    @JsonProperty("timeEnd")
    public DateTime getTimeEnd() {
        return timeEnd;
    }

    @JsonProperty("timeEnd")
    public void setTimeEnd(DateTime timeEnd) {
        this.timeEnd = timeEnd;
    }

    @JsonProperty("weekDays")
    public List<String> getWeekDays() {
        return weekDays;
    }

    @JsonProperty("weekDays")
    public void setWeekDays(List<String> weekDays) {
        this.weekDays = weekDays;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ipAddress == null) ? 0 : ipAddress.hashCode());
        result = prime * result + ((timeEnd == null) ? 0 : timeEnd.hashCode());
        result = prime * result + ((timeStart == null) ? 0 : timeStart.hashCode());
        result = prime * result + ((weekDays == null) ? 0 : weekDays.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LoginRestrictions other = (LoginRestrictions) obj;
        if (ipAddress == null) {
            if (other.ipAddress != null)
                return false;
        } else if (!ipAddress.equals(other.ipAddress))
            return false;
        if (timeEnd == null) {
            if (other.timeEnd != null)
                return false;
        } else if (!timeEnd.isEqual(other.timeEnd))
            return false;
        if (timeStart == null) {
            if (other.timeStart != null)
                return false;
        } else if (!timeStart.isEqual(other.timeStart))
            return false;
        if (weekDays == null) {
            if (other.weekDays != null)
                return false;
        } else if (!weekDays.equals(other.weekDays))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" {\nipAddress=");
        builder.append(ipAddress);
        builder.append(", \ntimeStart=");
        builder.append(timeStart);
        builder.append(", \ntimeEnd=");
        builder.append(timeEnd);
        builder.append(", \nweekDays=");
        builder.append(weekDays);
        builder.append("\n}");
        return builder.toString();
    }

}
