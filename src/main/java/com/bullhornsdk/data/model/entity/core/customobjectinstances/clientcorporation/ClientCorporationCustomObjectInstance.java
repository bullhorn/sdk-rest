 package com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation;

 import com.bullhornsdk.data.model.entity.core.customobjectinstances.CustomObjectInstance;
 import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;

 public abstract class ClientCorporationCustomObjectInstance extends CustomObjectInstance {

     private ClientCorporation clientCorporation;

     public ClientCorporation getClientCorporation() {
         return clientCorporation;
     }

     public void setClientCorporation(ClientCorporation clientCorporation) {
         this.clientCorporation = clientCorporation;
     }

 }
