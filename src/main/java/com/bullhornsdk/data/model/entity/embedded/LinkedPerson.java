package com.bullhornsdk.data.model.entity.embedded;

import javax.annotation.Generated;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({ "id", "_subtype" })
public class LinkedPerson extends AbstractEntity {

	private Integer id;

	private String _subtype;

	public LinkedPerson() {
		super();
	}

	public LinkedPerson(Integer id) {
		super();
		this.id = id;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("_subtype")
	public String get_subtype() {
		return _subtype;
	}

	@JsonProperty("_subtype")
	public void set_subtype(String _subtype) {
		this._subtype = _subtype;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_subtype == null) ? 0 : _subtype.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		LinkedPerson other = (LinkedPerson) obj;
		if (_subtype == null) {
			if (other._subtype != null)
				return false;
		} else if (!_subtype.equals(other._subtype))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" {\nid=");
		builder.append(id);
		builder.append(", \n_subtype=");
		builder.append(_subtype);
		builder.append("\n}");
		return builder.toString();
	}

}
