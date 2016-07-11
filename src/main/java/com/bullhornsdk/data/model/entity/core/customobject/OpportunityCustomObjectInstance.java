 package com.bullhornsdk.data.model.entity.core.customobject;

 import com.bullhornsdk.data.model.entity.core.standard.Opportunity;

 public abstract class OpportunityCustomObjectInstance extends CustomObjectInstance {

     private Opportunity opportunity;

     public Opportunity getOpportunity() {
         return opportunity;
     }

     public void setOpportunity(Opportunity opportunity) {
         this.opportunity = opportunity;
     }

 }