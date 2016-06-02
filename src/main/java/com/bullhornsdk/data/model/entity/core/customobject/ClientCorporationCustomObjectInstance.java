 package com.bullhornsdk.data.model.entity.core.customobject;

 import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
 import com.fasterxml.jackson.annotation.JsonInclude;
 import com.fasterxml.jackson.annotation.JsonPropertyOrder;
 import com.fasterxml.jackson.annotation.JsonRootName;

 public abstract class ClientCorporationCustomObjectInstance extends CustomObjectInstance {

     private ClientCorporation clientCorporation;

     public ClientCorporation getClientCorporation() {
         return clientCorporation;
     }

     public void setClientCorporation(ClientCorporation clientCorporation) {
         this.clientCorporation = clientCorporation;
     }

 }