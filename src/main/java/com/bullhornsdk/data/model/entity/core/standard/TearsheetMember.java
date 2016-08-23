package com.bullhornsdk.data.model.entity.core.standard;


import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "dateAdded", "person", "tearsheet" })
public class TearsheetMember extends AbstractEntity implements QueryEntity, AssociationEntity {

	private Integer id;

	private DateTime dateAdded;

	private Person person;

	private Tearsheet tearsheet;


	public TearsheetMember() {
		super();
	}

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

	@JsonProperty("dateAdded")
	public DateTime getDateAdded() {
		return dateAdded;
	}

	@JsonProperty("dateAdded")
	public void setDateAdded(DateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	@JsonProperty("person")
	public Person getPerson() {
		return person;
	}

	@JsonProperty("person")
	public void setPerson(Person person) {
		this.person = person;
	}

	@JsonProperty("tearsheet")
	public Tearsheet getTearsheet() {
		return tearsheet;
	}

	@JsonProperty("tearsheet")
	public void setTearsheet(Tearsheet tearsheet) {
		this.tearsheet = tearsheet;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tearsheet [id=");
		builder.append(id);
		builder.append(", dateAdded=");
		builder.append(dateAdded);
		builder.append(", person=");
		builder.append(person);
		builder.append(", tearsheet=");
		builder.append(tearsheet);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		result = prime * result + ((tearsheet == null) ? 0 : tearsheet.hashCode());
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
		TearsheetMember other = (TearsheetMember) obj;
		if (dateAdded == null) {
			if (other.dateAdded != null)
				return false;
		} else if (!dateAdded.equals(other.dateAdded))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		if (tearsheet == null) {
			if (other.tearsheet != null)
				return false;
		} else if (!tearsheet.equals(other.tearsheet))
			return false;
		return true;
	}

}