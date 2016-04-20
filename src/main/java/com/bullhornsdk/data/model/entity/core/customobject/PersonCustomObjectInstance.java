 package com.bullhornsdk.data.model.entity.core.customobject;

 import com.bullhornsdk.data.model.entity.embedded.LinkedPerson;
 import com.fasterxml.jackson.annotation.JsonProperty;

 public abstract class PersonCustomObjectInstance extends CustomObjectInstance {

     private LinkedPerson linkedPerson;

     @JsonProperty("person")
     public LinkedPerson getLinkedPerson() {
         return linkedPerson;
     }

     @JsonProperty("person")
     public void setLinkedPersoninkedPerson(LinkedPerson linkedPerson) {
         this.linkedPerson = linkedPerson;
     }

 }