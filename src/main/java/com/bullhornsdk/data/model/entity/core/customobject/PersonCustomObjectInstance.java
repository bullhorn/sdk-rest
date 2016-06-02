 package com.bullhornsdk.data.model.entity.core.customobject;

 import com.bullhornsdk.data.model.entity.embedded.LinkedPerson;
 import com.fasterxml.jackson.annotation.JsonProperty;

 public abstract class PersonCustomObjectInstance extends CustomObjectInstance {

     private LinkedPerson person;

     @JsonProperty("person")
     public LinkedPerson getPerson() {
         return person;
     }

     @JsonProperty("person")
     public void setPerson(LinkedPerson person) {
         this.person = person;
     }

 }