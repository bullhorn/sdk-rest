 package com.bullhornsdk.data.model.entity.core.customobject;

 import com.fasterxml.jackson.annotation.JsonInclude;
 import com.fasterxml.jackson.annotation.JsonPropertyOrder;
 import com.fasterxml.jackson.annotation.JsonRootName;

 @JsonInclude(JsonInclude.Include.NON_NULL)
 @JsonRootName(value = "data")
 @JsonPropertyOrder({ "id", "person", "text1", "text2", "text3", "text4", "text5", "text6", "text7", "text8", "text9", "text10", "text11", "text12", "text13",
         "text14", "text15", "text16", "text17", "text18", "text19", "text20", "int1", "int2", "int3", "int4", "int5", "int6", "int7", "int8", "int9",
         "int10", "float1", "float2", "float3", "float4", "float5", "float6", "float7", "float8", "float9", "float10", "textBlock1", "textBlock2",
         "textBlock3", "textBlock4", "textBlock5", "date1", "date2", "date3", "date4", "date5", "date6", "date7", "date8", "date9", "date10", "dateAdded" })
 public class PersonCustomObjectInstance2 extends PersonCustomObjectInstance {
 }