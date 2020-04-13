 package com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder;

 import com.bullhornsdk.data.model.entity.core.customobjectinstances.CustomObjectInstance;
 import com.bullhornsdk.data.model.entity.core.standard.JobOrder;

 public abstract class JobOrderCustomObjectInstance extends CustomObjectInstance {

     private JobOrder jobOrder;

     public JobOrder getJobOrder() {
         return jobOrder;
     }

     public void setJobOrder(JobOrder jobOrder) {
         this.jobOrder = jobOrder;
     }

 }
