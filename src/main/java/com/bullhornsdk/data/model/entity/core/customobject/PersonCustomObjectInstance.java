package com.bullhornsdk.data.model.entity.core.customobject;

import com.bullhornsdk.data.model.entity.core.standard.Person;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class PersonCustomObjectInstance extends CustomObjectInstance {

	private Person person;

	@JsonProperty("person")
	public Person getPerson() {
		return person;
	}

	@JsonProperty("person")
	public void setPerson(Person person) {
		this.person = person;
	}

}