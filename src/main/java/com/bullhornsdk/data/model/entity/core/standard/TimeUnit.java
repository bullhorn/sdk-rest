package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "name", "timeMarker", "weekDay" })
public class TimeUnit extends AbstractEntity implements QueryEntity {

    private Integer id;

    private String name;

    private Integer timeMarker;

    private Integer weekDay;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("timeMarker")
    public Integer getTimeMarker() {
        return timeMarker;
    }

    @JsonProperty("timeMarker")
    public void setTimeMarker(Integer timeMarker) {
        this.timeMarker = timeMarker;
    }

    @JsonProperty("weekDay")
    public Integer getWeekDay() {
        return weekDay;
    }

    @JsonProperty("weekDay")
    public void setWeekDay(Integer weekDay) {
        this.weekDay = weekDay;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((timeMarker == null) ? 0 : timeMarker.hashCode());
        result = prime * result + ((weekDay == null) ? 0 : weekDay.hashCode());
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
        TimeUnit other = (TimeUnit) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (timeMarker == null) {
            if (other.timeMarker != null)
                return false;
        } else if (!timeMarker.equals(other.timeMarker))
            return false;
        if (weekDay == null) {
            if (other.weekDay != null)
                return false;
        } else if (!weekDay.equals(other.weekDay))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TimeUnit {\nid=");
        builder.append(id);
        builder.append(", \nname=");
        builder.append(name);
        builder.append(", \ntimeMarker=");
        builder.append(timeMarker);
        builder.append(", \nweekDay=");
        builder.append(weekDay);
        builder.append("\n}");
        return builder.toString();
    }

}