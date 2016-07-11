 package com.bullhornsdk.data.model.entity.core.customobject;

 import com.bullhornsdk.data.model.entity.core.standard.Placement;

 public abstract class PlacementCustomObjectInstance extends CustomObjectInstance {

     private Placement placement;

     public Placement getPlacement() {
         return placement;
     }

     public void setPlacement(Placement placement) {
         this.placement = placement;
     }

 }