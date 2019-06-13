package com.bullhornsdk.data.model.entity.embedded;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.collect.Lists;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "total" })
public class OneToMany<T> extends AbstractEntity {

	private List<T> data = new ArrayList<T>();

	private Integer total;

	public OneToMany() {
		super();
	}

	public OneToMany(T... elements) {
		super();
		this.data = Lists.newArrayList(elements);
	}

	@JsonProperty("data")
	public List<T> getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(List<T> data) {
		this.data = data;
	}

	@JsonProperty("total")
	public Integer getTotal() {
		return total;
	}

	@JsonProperty("total")
	public void setTotal(Integer total) {
		this.total = total;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
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
		OneToMany<?> other = (OneToMany<?>) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		return true;
	}

    @Override
    public String toStringNonNull() {
        StringBuilder builder = new StringBuilder();
        builder.append(" {\n data=[");
        builder.append(data.stream().map(T ->{
            if (T instanceof AbstractEntity)
                return ((AbstractEntity)T).toStringNonNull();
            return T.toString();
        }).collect(Collectors.joining(",")));
        builder.append("], total=");
        builder.append(total);
        builder.append("}");
        return builder.toString();
    }

    @Override
    public String toStringNonNull(boolean includeLineBreaks) {
        String lbc = ", ";
        if(includeLineBreaks)
            lbc = ",\n ";
        StringBuilder builder = new StringBuilder();
        builder.append(" { data=[");
        builder.append(data.stream().map(T ->{
            if (T instanceof AbstractEntity)
                return ((AbstractEntity)T).toStringNonNull(includeLineBreaks);
            return T.toString();
        }).collect(Collectors.joining(lbc)));
        builder.append("]" + lbc + " total=");
        builder.append(total);
        if(includeLineBreaks)
            builder.append("\n");
        builder.append("}");
        return builder.toString();
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" {\n data=");
		builder.append(data);
		builder.append(",\n total=");
		builder.append(total);
		builder.append("\n}");
		return builder.toString();
	}

}
