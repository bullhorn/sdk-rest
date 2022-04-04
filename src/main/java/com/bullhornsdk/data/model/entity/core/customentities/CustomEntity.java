package com.bullhornsdk.data.model.entity.core.customentities;

import com.bullhornsdk.data.model.entity.core.type.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import java.util.Objects;

public class CustomEntity extends AbstractEntity implements QueryEntity , DateLastModifiedEntity, UpdateEntity, CreateEntity, HardDeleteEntity, EditHistoryEntity{

    private Integer id;
    private CustomEntityType customEntityType;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private String migrateGUID;
    private String text1;
    private String text2;
    private String text3;
    private String text4;
    private String text5;
    private String text6;
    private String text7;
    private String text8;
    private String text9;
    private String text10;
    private String text11;
    private String text12;
    private String text13;
    private String text14;
    private String text15;
    private String text16;
    private String text17;
    private String text18;
    private String text19;
    private String text20;
    private String text21;
    private String text22;
    private String text23;
    private String text24;
    private String text25;
    private String text26;
    private String text27;
    private String text28;
    private String text29;
    private String text30;
    private String text31;
    private String text32;
    private String text33;
    private String text34;
    private String text35;
    private String text36;
    private String text37;
    private String text38;
    private String text39;
    private String text40;
    private String textBlock1;
    private String textBlock2;
    private String textBlock3;
    private String textBlock4;
    private String textBlock5;
    private String textBlock6;
    private String textBlock7;
    private String textBlock8;
    private String textBlock9;
    private Integer int1;
    private Integer int2;
    private Integer int3;
    private Integer int4;
    private Integer int5;
    private Integer int6;
    private Integer int7;
    private Integer int8;
    private Integer int9;
    private Integer int10;
    private Integer int11;
    private Integer int12;
    private Integer int13;
    private Integer int14;
    private Integer int15;
    private Float float1;
    private Float float2;
    private Float float3;
    private Float float4;
    private Float float5;
    private Float float6;
    private Float float7;
    private Float float8;
    private Float float9;
    private Float float10;
    private Float float11;
    private Float float12;
    private Float float13;
    private Float float14;
    private Float float15;
    private DateTime date1;
    private DateTime date2;
    private DateTime date3;
    private DateTime date4;
    private DateTime date5;
    private DateTime date6;
    private DateTime date7;
    private DateTime date8;
    private DateTime date9;
    private DateTime date10;
    private DateTime date11;
    private DateTime date12;
    private DateTime date13;
    private DateTime date14;
    private DateTime date15;
    private Integer userID1;
    private Integer userID2;
    private Integer userID3;
    private Integer userID4;
    private Integer userID5;
    private Integer clientCorporationID1;
    private Integer clientCorporationID2;
    private Integer clientCorporationID3;
    private Integer clientCorporationID4;
    private Integer clientCorporationID5;
    private Integer jobOrderID1;
    private Integer jobOrderID2;
    private Integer jobOrderID3;
    private Integer jobOrderID4;
    private Integer jobOrderID5;
    private Integer opportunityID1;
    private Integer opportunityID2;
    private Integer opportunityID3;
    private Integer opportunityID4;
    private Integer opportunityID5;
    private Integer placementID1;
    private Integer placementID2;
    private Integer placementID3;
    private Integer placementID4;
    private Integer placementID5;
    private Integer customEntityID1;
    private Integer customEntityID2;
    private Integer customEntityID3;
    private Integer customEntityID4;
    private Integer customEntityID5;

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return this.id;
    }

    @Override
    @JsonProperty("id")
    public void setId(Integer customEntityID) {
        this.id = customEntityID;
    }

    @JsonProperty("customEntityType")
    public CustomEntityType getCustomEntityType() {
        return customEntityType;
    }

    @JsonProperty("customEntityType")
    public void setCustomEntityType(CustomEntityType customEntityType) {
        this.customEntityType = customEntityType;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("migrateGUID")
    public String getMigrateGUID() {
        return migrateGUID;
    }

    @JsonProperty("migrateGUID")
    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    @JsonProperty("text1")
    public String getText1() {
        return text1;
    }

    @JsonProperty("text1")
    public void setText1(String text1) {
        this.text1 = text1;
    }

    @JsonProperty("text2")
    public String getText2() {
        return text2;
    }

    @JsonProperty("text2")
    public void setText2(String text2) {
        this.text2 = text2;
    }

    @JsonProperty("text3")
    public String getText3() {
        return text3;
    }

    @JsonProperty("text3")
    public void setText3(String text3) {
        this.text3 = text3;
    }

    @JsonProperty("text4")
    public String getText4() {
        return text4;
    }

    @JsonProperty("text4")
    public void setText4(String text4) {
        this.text4 = text4;
    }

    @JsonProperty("text5")
    public String getText5() {
        return text5;
    }

    @JsonProperty("text5")
    public void setText5(String text5) {
        this.text5 = text5;
    }

    @JsonProperty("text6")
    public String getText6() {
        return text6;
    }

    @JsonProperty("text6")
    public void setText6(String text6) {
        this.text6 = text6;
    }

    @JsonProperty("text7")
    public String getText7() {
        return text7;
    }

    @JsonProperty("text7")
    public void setText7(String text7) {
        this.text7 = text7;
    }

    @JsonProperty("text8")
    public String getText8() {
        return text8;
    }

    @JsonProperty("text8")
    public void setText8(String text8) {
        this.text8 = text8;
    }

    @JsonProperty("text9")
    public String getText9() {
        return text9;
    }

    @JsonProperty("text9")
    public void setText9(String text9) {
        this.text9 = text9;
    }

    @JsonProperty("text10")
    public String getText10() {
        return text10;
    }

    @JsonProperty("text10")
    public void setText10(String text10) {
        this.text10 = text10;
    }

    @JsonProperty("text11")
    public String getText11() {
        return text11;
    }

    @JsonProperty("text11")
    public void setText11(String text11) {
        this.text11 = text11;
    }

    @JsonProperty("text12")
    public String getText12() {
        return text12;
    }

    @JsonProperty("text12")
    public void setText12(String text12) {
        this.text12 = text12;
    }

    @JsonProperty("text13")
    public String getText13() {
        return text13;
    }

    @JsonProperty("text13")
    public void setText13(String text13) {
        this.text13 = text13;
    }

    @JsonProperty("text14")
    public String getText14() {
        return text14;
    }

    @JsonProperty("text14")
    public void setText14(String text14) {
        this.text14 = text14;
    }

    @JsonProperty("text15")
    public String getText15() {
        return text15;
    }

    @JsonProperty("text15")
    public void setText15(String text15) {
        this.text15 = text15;
    }

    @JsonProperty("text16")
    public String getText16() {
        return text16;
    }

    @JsonProperty("text16")
    public void setText16(String text16) {
        this.text16 = text16;
    }

    @JsonProperty("text17")
    public String getText17() {
        return text17;
    }

    @JsonProperty("text17")
    public void setText17(String text17) {
        this.text17 = text17;
    }

    @JsonProperty("text18")
    public String getText18() {
        return text18;
    }

    @JsonProperty("text18")
    public void setText18(String text18) {
        this.text18 = text18;
    }

    @JsonProperty("text19")
    public String getText19() {
        return text19;
    }

    @JsonProperty("text19")
    public void setText19(String text19) {
        this.text19 = text19;
    }

    @JsonProperty("text20")
    public String getText20() {
        return text20;
    }

    @JsonProperty("text20")
    public void setText20(String text20) {
        this.text20 = text20;
    }

    @JsonProperty("text21")
    public String getText21() {
        return text21;
    }

    @JsonProperty("text21")
    public void setText21(String text21) {
        this.text21 = text21;
    }

    @JsonProperty("text22")
    public String getText22() {
        return text22;
    }

    @JsonProperty("text22")
    public void setText22(String text22) {
        this.text22 = text22;
    }

    @JsonProperty("text23")
    public String getText23() {
        return text23;
    }

    @JsonProperty("text23")
    public void setText23(String text23) {
        this.text23 = text23;
    }

    @JsonProperty("text24")
    public String getText24() {
        return text24;
    }

    @JsonProperty("text24")
    public void setText24(String text24) {
        this.text24 = text24;
    }

    @JsonProperty("text25")
    public String getText25() {
        return text25;
    }

    @JsonProperty("text25")
    public void setText25(String text25) {
        this.text25 = text25;
    }

    @JsonProperty("text26")
    public String getText26() {
        return text26;
    }

    @JsonProperty("text26")
    public void setText26(String text26) {
        this.text26 = text26;
    }

    @JsonProperty("text27")
    public String getText27() {
        return text27;
    }

    @JsonProperty("text27")
    public void setText27(String text27) {
        this.text27 = text27;
    }

    @JsonProperty("text28")
    public String getText28() {
        return text28;
    }

    @JsonProperty("text28")
    public void setText28(String text28) {
        this.text28 = text28;
    }

    @JsonProperty("text29")
    public String getText29() {
        return text29;
    }

    @JsonProperty("text29")
    public void setText29(String text29) {
        this.text29 = text29;
    }

    @JsonProperty("text30")
    public String getText30() {
        return text30;
    }

    @JsonProperty("text30")
    public void setText30(String text30) {
        this.text30 = text30;
    }

    @JsonProperty("text31")
    public String getText31() {
        return text31;
    }

    @JsonProperty("text31")
    public void setText31(String text31) {
        this.text31 = text31;
    }

    @JsonProperty("text32")
    public String getText32() {
        return text32;
    }

    @JsonProperty("text32")
    public void setText32(String text32) {
        this.text32 = text32;
    }

    @JsonProperty("text33")
    public String getText33() {
        return text33;
    }

    @JsonProperty("text33")
    public void setText33(String text33) {
        this.text33 = text33;
    }

    @JsonProperty("text34")
    public String getText34() {
        return text34;
    }

    @JsonProperty("text34")
    public void setText34(String text34) {
        this.text34 = text34;
    }

    @JsonProperty("text35")
    public String getText35() {
        return text35;
    }

    @JsonProperty("text35")
    public void setText35(String text35) {
        this.text35 = text35;
    }

    @JsonProperty("text36")
    public String getText36() {
        return text36;
    }

    @JsonProperty("text36")
    public void setText36(String text36) {
        this.text36 = text36;
    }

    @JsonProperty("text37")
    public String getText37() {
        return text37;
    }

    @JsonProperty("text37")
    public void setText37(String text37) {
        this.text37 = text37;
    }

    @JsonProperty("text38")
    public String getText38() {
        return text38;
    }

    @JsonProperty("text38")
    public void setText38(String text38) {
        this.text38 = text38;
    }

    @JsonProperty("text39")
    public String getText39() {
        return text39;
    }

    @JsonProperty("text39")
    public void setText39(String text39) {
        this.text39 = text39;
    }

    @JsonProperty("text40")
    public String getText40() {
        return text40;
    }

    @JsonProperty("text40")
    public void setText40(String text40) {
        this.text40 = text40;
    }

    @JsonProperty("textBlock1")
    public String getTextBlock1() {
        return textBlock1;
    }

    @JsonProperty("textBlock1")
    public void setTextBlock1(String textBlock1) {
        this.textBlock1 = textBlock1;
    }

    @JsonProperty("textBlock2")
    public String getTextBlock2() {
        return textBlock2;
    }

    @JsonProperty("textBlock2")
    public void setTextBlock2(String textBlock2) {
        this.textBlock2 = textBlock2;
    }

    @JsonProperty("textBlock3")
    public String getTextBlock3() {
        return textBlock3;
    }

    @JsonProperty("textBlock3")
    public void setTextBlock3(String textBlock3) {
        this.textBlock3 = textBlock3;
    }

    @JsonProperty("textBlock4")
    public String getTextBlock4() {
        return textBlock4;
    }

    @JsonProperty("textBlock4")
    public void setTextBlock4(String textBlock4) {
        this.textBlock4 = textBlock4;
    }

    @JsonProperty("textBlock5")
    public String getTextBlock5() {
        return textBlock5;
    }

    @JsonProperty("textBlock5")
    public void setTextBlock5(String textBlock5) {
        this.textBlock5 = textBlock5;
    }

    @JsonProperty("textBlock6")
    public String getTextBlock6() {
        return textBlock6;
    }

    @JsonProperty("textBlock6")
    public void setTextBlock6(String textBlock6) {
        this.textBlock6 = textBlock6;
    }

    @JsonProperty("textBlock7")
    public String getTextBlock7() {
        return textBlock7;
    }

    @JsonProperty("textBlock7")
    public void setTextBlock7(String textBlock7) {
        this.textBlock7 = textBlock7;
    }

    @JsonProperty("textBlock8")
    public String getTextBlock8() {
        return textBlock8;
    }

    @JsonProperty("textBlock8")
    public void setTextBlock8(String textBlock8) {
        this.textBlock8 = textBlock8;
    }

    @JsonProperty("textBlock9")
    public String getTextBlock9() {
        return textBlock9;
    }

    @JsonProperty("textBlock9")
    public void setTextBlock9(String textBlock9) {
        this.textBlock9 = textBlock9;
    }

    @JsonProperty("int1")
    public Integer getInt1() {
        return int1;
    }

    @JsonProperty("int1")
    public void setInt1(Integer int1) {
        this.int1 = int1;
    }

    @JsonProperty("int2")
    public Integer getInt2() {
        return int2;
    }

    @JsonProperty("int2")
    public void setInt2(Integer int2) {
        this.int2 = int2;
    }

    @JsonProperty("int3")
    public Integer getInt3() {
        return int3;
    }

    @JsonProperty("int3")
    public void setInt3(Integer int3) {
        this.int3 = int3;
    }

    @JsonProperty("int4")
    public Integer getInt4() {
        return int4;
    }

    @JsonProperty("int4")
    public void setInt4(Integer int4) {
        this.int4 = int4;
    }

    @JsonProperty("int5")
    public Integer getInt5() {
        return int5;
    }

    @JsonProperty("int5")
    public void setInt5(Integer int5) {
        this.int5 = int5;
    }

    @JsonProperty("int6")
    public Integer getInt6() {
        return int6;
    }

    @JsonProperty("int6")
    public void setInt6(Integer int6) {
        this.int6 = int6;
    }

    @JsonProperty("int7")
    public Integer getInt7() {
        return int7;
    }

    @JsonProperty("int7")
    public void setInt7(Integer int7) {
        this.int7 = int7;
    }

    @JsonProperty("int8")
    public Integer getInt8() {
        return int8;
    }

    @JsonProperty("int8")
    public void setInt8(Integer int8) {
        this.int8 = int8;
    }

    @JsonProperty("int9")
    public Integer getInt9() {
        return int9;
    }

    @JsonProperty("int9")
    public void setInt9(Integer int9) {
        this.int9 = int9;
    }

    @JsonProperty("int10")
    public Integer getInt10() {
        return int10;
    }

    @JsonProperty("int10")
    public void setInt10(Integer int10) {
        this.int10 = int10;
    }

    @JsonProperty("int11")
    public Integer getInt11() {
        return int11;
    }

    @JsonProperty("int11")
    public void setInt11(Integer int11) {
        this.int11 = int11;
    }

    @JsonProperty("int12")
    public Integer getInt12() {
        return int12;
    }

    @JsonProperty("int12")
    public void setInt12(Integer int12) {
        this.int12 = int12;
    }

    @JsonProperty("int13")
    public Integer getInt13() {
        return int13;
    }

    @JsonProperty("int13")
    public void setInt13(Integer int13) {
        this.int13 = int13;
    }

    @JsonProperty("int14")
    public Integer getInt14() {
        return int14;
    }

    @JsonProperty("int14")
    public void setInt14(Integer int14) {
        this.int14 = int14;
    }

    @JsonProperty("int15")
    public Integer getInt15() {
        return int15;
    }

    @JsonProperty("int15")
    public void setInt15(Integer int15) {
        this.int15 = int15;
    }

    @JsonProperty("float1")
    public Float getFloat1() {
        return float1;
    }

    @JsonProperty("float1")
    public void setFloat1(Float float1) {
        this.float1 = float1;
    }

    @JsonProperty("float2")
    public Float getFloat2() {
        return float2;
    }

    @JsonProperty("float2")
    public void setFloat2(Float float2) {
        this.float2 = float2;
    }

    @JsonProperty("float3")
    public Float getFloat3() {
        return float3;
    }

    @JsonProperty("float3")
    public void setFloat3(Float float3) {
        this.float3 = float3;
    }

    @JsonProperty("float4")
    public Float getFloat4() {
        return float4;
    }

    @JsonProperty("float4")
    public void setFloat4(Float float4) {
        this.float4 = float4;
    }

    @JsonProperty("float5")
    public Float getFloat5() {
        return float5;
    }

    @JsonProperty("float5")
    public void setFloat5(Float float5) {
        this.float5 = float5;
    }

    @JsonProperty("float6")
    public Float getFloat6() {
        return float6;
    }

    @JsonProperty("float6")
    public void setFloat6(Float float6) {
        this.float6 = float6;
    }

    @JsonProperty("float7")
    public Float getFloat7() {
        return float7;
    }

    @JsonProperty("float7")
    public void setFloat7(Float float7) {
        this.float7 = float7;
    }

    @JsonProperty("float8")
    public Float getFloat8() {
        return float8;
    }

    @JsonProperty("float8")
    public void setFloat8(Float float8) {
        this.float8 = float8;
    }

    @JsonProperty("float9")
    public Float getFloat9() {
        return float9;
    }

    @JsonProperty("float9")
    public void setFloat9(Float float9) {
        this.float9 = float9;
    }

    @JsonProperty("float10")
    public Float getFloat10() {
        return float10;
    }

    @JsonProperty("float10")
    public void setFloat10(Float float10) {
        this.float10 = float10;
    }

    @JsonProperty("float11")
    public Float getFloat11() {
        return float11;
    }

    @JsonProperty("float11")
    public void setFloat11(Float float11) {
        this.float11 = float11;
    }

    @JsonProperty("float12")
    public Float getFloat12() {
        return float12;
    }

    @JsonProperty("float12")
    public void setFloat12(Float float12) {
        this.float12 = float12;
    }

    @JsonProperty("float13")
    public Float getFloat13() {
        return float13;
    }

    @JsonProperty("float13")
    public void setFloat13(Float float13) {
        this.float13 = float13;
    }

    @JsonProperty("float14")
    public Float getFloat14() {
        return float14;
    }

    @JsonProperty("float14")
    public void setFloat14(Float float14) {
        this.float14 = float14;
    }

    @JsonProperty("float15")
    public Float getFloat15() {
        return float15;
    }

    @JsonProperty("float15")
    public void setFloat15(Float float15) {
        this.float15 = float15;
    }

    @JsonProperty("date1")
    public DateTime getDate1() {
        return date1;
    }

    @JsonProperty("date1")
    public void setDate1(DateTime date1) {
        this.date1 = date1;
    }

    @JsonProperty("date2")
    public DateTime getDate2() {
        return date2;
    }

    @JsonProperty("date2")
    public void setDate2(DateTime date2) {
        this.date2 = date2;
    }

    @JsonProperty("date3")
    public DateTime getDate3() {
        return date3;
    }

    @JsonProperty("date3")
    public void setDate3(DateTime date3) {
        this.date3 = date3;
    }

    @JsonProperty("date4")
    public DateTime getDate4() {
        return date4;
    }

    @JsonProperty("date4")
    public void setDate4(DateTime date4) {
        this.date4 = date4;
    }

    @JsonProperty("date5")
    public DateTime getDate5() {
        return date5;
    }

    @JsonProperty("date5")
    public void setDate5(DateTime date5) {
        this.date5 = date5;
    }

    @JsonProperty("date6")
    public DateTime getDate6() {
        return date6;
    }

    @JsonProperty("date6")
    public void setDate6(DateTime date6) {
        this.date6 = date6;
    }

    @JsonProperty("date7")
    public DateTime getDate7() {
        return date7;
    }

    @JsonProperty("date7")
    public void setDate7(DateTime date7) {
        this.date7 = date7;
    }

    @JsonProperty("date8")
    public DateTime getDate8() {
        return date8;
    }

    @JsonProperty("date8")
    public void setDate8(DateTime date8) {
        this.date8 = date8;
    }

    @JsonProperty("date9")
    public DateTime getDate9() {
        return date9;
    }

    @JsonProperty("date9")
    public void setDate9(DateTime date9) {
        this.date9 = date9;
    }

    @JsonProperty("date10")
    public DateTime getDate10() {
        return date10;
    }

    @JsonProperty("date10")
    public void setDate10(DateTime date10) {
        this.date10 = date10;
    }

    @JsonProperty("date11")
    public DateTime getDate11() {
        return date11;
    }

    @JsonProperty("date11")
    public void setDate11(DateTime date11) {
        this.date11 = date11;
    }

    @JsonProperty("date12")
    public DateTime getDate12() {
        return date12;
    }

    @JsonProperty("date12")
    public void setDate12(DateTime date12) {
        this.date12 = date12;
    }

    @JsonProperty("date13")
    public DateTime getDate13() {
        return date13;
    }

    @JsonProperty("date13")
    public void setDate13(DateTime date13) {
        this.date13 = date13;
    }

    @JsonProperty("date14")
    public DateTime getDate14() {
        return date14;
    }

    @JsonProperty("date14")
    public void setDate14(DateTime date14) {
        this.date14 = date14;
    }

    @JsonProperty("date15")
    public DateTime getDate15() {
        return date15;
    }

    @JsonProperty("date15")
    public void setDate15(DateTime date15) {
        this.date15 = date15;
    }

    @JsonProperty("userID1")
    public Integer getUserID1() {
        return userID1;
    }

    @JsonProperty("userID1")
    public void setUserID1(Integer userID1) {
        this.userID1 = userID1;
    }

    @JsonProperty("userID2")
    public Integer getUserID2() {
        return userID2;
    }

    @JsonProperty("userID2")
    public void setUserID2(Integer userID2) {
        this.userID2 = userID2;
    }

    @JsonProperty("userID3")
    public Integer getUserID3() {
        return userID3;
    }

    @JsonProperty("userID3")
    public void setUserID3(Integer userID3) {
        this.userID3 = userID3;
    }

    @JsonProperty("userID4")
    public Integer getUserID4() {
        return userID4;
    }

    @JsonProperty("userID4")
    public void setUserID4(Integer userID4) {
        this.userID4 = userID4;
    }

    @JsonProperty("userID5")
    public Integer getUserID5() {
        return userID5;
    }

    @JsonProperty("userID5")
    public void setUserID5(Integer userID5) {
        this.userID5 = userID5;
    }

    @JsonProperty("clientCorporationID1")
    public Integer getClientCorporationID1() {
        return clientCorporationID1;
    }

    @JsonProperty("clientCorporationID1")
    public void setClientCorporationID1(Integer clientCorporationID1) {
        this.clientCorporationID1 = clientCorporationID1;
    }

    @JsonProperty("clientCorporationID2")
    public Integer getClientCorporationID2() {
        return clientCorporationID2;
    }

    @JsonProperty("clientCorporationID2")
    public void setClientCorporationID2(Integer clientCorporationID2) {
        this.clientCorporationID2 = clientCorporationID2;
    }

    @JsonProperty("clientCorporationID3")
    public Integer getClientCorporationID3() {
        return clientCorporationID3;
    }

    @JsonProperty("clientCorporationID3")
    public void setClientCorporationID3(Integer clientCorporationID3) {
        this.clientCorporationID3 = clientCorporationID3;
    }

    @JsonProperty("clientCorporationID4")
    public Integer getClientCorporationID4() {
        return clientCorporationID4;
    }

    @JsonProperty("clientCorporationID4")
    public void setClientCorporationID4(Integer clientCorporationID4) {
        this.clientCorporationID4 = clientCorporationID4;
    }

    @JsonProperty("clientCorporationID5")
    public Integer getClientCorporationID5() {
        return clientCorporationID5;
    }

    @JsonProperty("clientCorporationID5")
    public void setClientCorporationID5(Integer clientCorporationID5) {
        this.clientCorporationID5 = clientCorporationID5;
    }

    @JsonProperty("jobOrderID1")
    public Integer getJobOrderID1() {
        return jobOrderID1;
    }

    @JsonProperty("jobOrderID1")
    public void setJobOrderID1(Integer jobOrderID1) {
        this.jobOrderID1 = jobOrderID1;
    }

    @JsonProperty("jobOrderID2")
    public Integer getJobOrderID2() {
        return jobOrderID2;
    }

    @JsonProperty("jobOrderID2")
    public void setJobOrderID2(Integer jobOrderID2) {
        this.jobOrderID2 = jobOrderID2;
    }

    @JsonProperty("jobOrderID3")
    public Integer getJobOrderID3() {
        return jobOrderID3;
    }

    @JsonProperty("jobOrderID3")
    public void setJobOrderID3(Integer jobOrderID3) {
        this.jobOrderID3 = jobOrderID3;
    }

    @JsonProperty("jobOrderID4")
    public Integer getJobOrderID4() {
        return jobOrderID4;
    }

    @JsonProperty("jobOrderID4")
    public void setJobOrderID4(Integer jobOrderID4) {
        this.jobOrderID4 = jobOrderID4;
    }

    @JsonProperty("jobOrderID5")
    public Integer getJobOrderID5() {
        return jobOrderID5;
    }

    @JsonProperty("jobOrderID5")
    public void setJobOrderID5(Integer jobOrderID5) {
        this.jobOrderID5 = jobOrderID5;
    }

    @JsonProperty("opportunityID1")
    public Integer getOpportunityID1() {
        return opportunityID1;
    }

    @JsonProperty("opportunityID1")
    public void setOpportunityID1(Integer opportunityID1) {
        this.opportunityID1 = opportunityID1;
    }

    @JsonProperty("opportunityID2")
    public Integer getOpportunityID2() {
        return opportunityID2;
    }

    @JsonProperty("opportunityID2")
    public void setOpportunityID2(Integer opportunityID2) {
        this.opportunityID2 = opportunityID2;
    }

    @JsonProperty("opportunityID3")
    public Integer getOpportunityID3() {
        return opportunityID3;
    }

    @JsonProperty("opportunityID3")
    public void setOpportunityID3(Integer opportunityID3) {
        this.opportunityID3 = opportunityID3;
    }

    @JsonProperty("opportunityID4")
    public Integer getOpportunityID4() {
        return opportunityID4;
    }

    @JsonProperty("opportunityID4")
    public void setOpportunityID4(Integer opportunityID4) {
        this.opportunityID4 = opportunityID4;
    }

    @JsonProperty("opportunityID5")
    public Integer getOpportunityID5() {
        return opportunityID5;
    }

    @JsonProperty("opportunityID5")
    public void setOpportunityID5(Integer opportunityID5) {
        this.opportunityID5 = opportunityID5;
    }

    @JsonProperty("placementID1")
    public Integer getPlacementID1() {
        return placementID1;
    }

    @JsonProperty("placementID1")
    public void setPlacementID1(Integer placementID1) {
        this.placementID1 = placementID1;
    }

    @JsonProperty("placementID2")
    public Integer getPlacementID2() {
        return placementID2;
    }

    @JsonProperty("placementID2")
    public void setPlacementID2(Integer placementID2) {
        this.placementID2 = placementID2;
    }

    @JsonProperty("placementID3")
    public Integer getPlacementID3() {
        return placementID3;
    }

    @JsonProperty("placementID3")
    public void setPlacementID3(Integer placementID3) {
        this.placementID3 = placementID3;
    }

    @JsonProperty("placementID4")
    public Integer getPlacementID4() {
        return placementID4;
    }

    @JsonProperty("placementID4")
    public void setPlacementID4(Integer placementID4) {
        this.placementID4 = placementID4;
    }

    @JsonProperty("placementID5")
    public Integer getPlacementID5() {
        return placementID5;
    }

    @JsonProperty("placementID5")
    public void setPlacementID5(Integer placementID5) {
        this.placementID5 = placementID5;
    }

    @JsonProperty("customEntityID1")
    public Integer getCustomEntityID1() {
        return customEntityID1;
    }

    @JsonProperty("customEntityID1")
    public void setCustomEntityID1(Integer customEntityID1) {
        this.customEntityID1 = customEntityID1;
    }

    @JsonProperty("customEntityID2")
    public Integer getCustomEntityID2() {
        return customEntityID2;
    }

    @JsonProperty("customEntityID2")
    public void setCustomEntityID2(Integer customEntityID2) {
        this.customEntityID2 = customEntityID2;
    }

    @JsonProperty("customEntityID3")
    public Integer getCustomEntityID3() {
        return customEntityID3;
    }

    @JsonProperty("customEntityID3")
    public void setCustomEntityID3(Integer customEntityID3) {
        this.customEntityID3 = customEntityID3;
    }

    @JsonProperty("customEntityID4")
    public Integer getCustomEntityID4() {
        return customEntityID4;
    }

    @JsonProperty("customEntityID4")
    public void setCustomEntityID4(Integer customEntityID4) {
        this.customEntityID4 = customEntityID4;
    }

    @JsonProperty("customEntityID5")
    public Integer getCustomEntityID5() {
        return customEntityID5;
    }

    @JsonProperty("customEntityID5")
    public void setCustomEntityID5(Integer customEntityID5) {
        this.customEntityID5 = customEntityID5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomEntity)) return false;
        CustomEntity that = (CustomEntity) o;
        return id.equals(that.id) && Objects.equals(customEntityType, that.customEntityType) && Objects.equals(dateAdded, that.dateAdded) && Objects.equals(dateLastModified, that.dateLastModified) && Objects.equals(migrateGUID, that.migrateGUID) && Objects.equals(text1, that.text1) && Objects.equals(text2, that.text2) && Objects.equals(text3, that.text3) && Objects.equals(text4, that.text4) && Objects.equals(text5, that.text5) && Objects.equals(text6, that.text6) && Objects.equals(text7, that.text7) && Objects.equals(text8, that.text8) && Objects.equals(text9, that.text9) && Objects.equals(text10, that.text10) && Objects.equals(text11, that.text11) && Objects.equals(text12, that.text12) && Objects.equals(text13, that.text13) && Objects.equals(text14, that.text14) && Objects.equals(text15, that.text15) && Objects.equals(text16, that.text16) && Objects.equals(text17, that.text17) && Objects.equals(text18, that.text18) && Objects.equals(text19, that.text19) && Objects.equals(text20, that.text20) && Objects.equals(text21, that.text21) && Objects.equals(text22, that.text22) && Objects.equals(text23, that.text23) && Objects.equals(text24, that.text24) && Objects.equals(text25, that.text25) && Objects.equals(text26, that.text26) && Objects.equals(text27, that.text27) && Objects.equals(text28, that.text28) && Objects.equals(text29, that.text29) && Objects.equals(text30, that.text30) && Objects.equals(text31, that.text31) && Objects.equals(text32, that.text32) && Objects.equals(text33, that.text33) && Objects.equals(text34, that.text34) && Objects.equals(text35, that.text35) && Objects.equals(text36, that.text36) && Objects.equals(text37, that.text37) && Objects.equals(text38, that.text38) && Objects.equals(text39, that.text39) && Objects.equals(text40, that.text40) && Objects.equals(textBlock1, that.textBlock1) && Objects.equals(textBlock2, that.textBlock2) && Objects.equals(textBlock3, that.textBlock3) && Objects.equals(textBlock4, that.textBlock4) && Objects.equals(textBlock5, that.textBlock5) && Objects.equals(textBlock6, that.textBlock6) && Objects.equals(textBlock7, that.textBlock7) && Objects.equals(textBlock8, that.textBlock8) && Objects.equals(textBlock9, that.textBlock9) && Objects.equals(int1, that.int1) && Objects.equals(int2, that.int2) && Objects.equals(int3, that.int3) && Objects.equals(int4, that.int4) && Objects.equals(int5, that.int5) && Objects.equals(int6, that.int6) && Objects.equals(int7, that.int7) && Objects.equals(int8, that.int8) && Objects.equals(int9, that.int9) && Objects.equals(int10, that.int10) && Objects.equals(int11, that.int11) && Objects.equals(int12, that.int12) && Objects.equals(int13, that.int13) && Objects.equals(int14, that.int14) && Objects.equals(int15, that.int15) && Objects.equals(float1, that.float1) && Objects.equals(float2, that.float2) && Objects.equals(float3, that.float3) && Objects.equals(float4, that.float4) && Objects.equals(float5, that.float5) && Objects.equals(float6, that.float6) && Objects.equals(float7, that.float7) && Objects.equals(float8, that.float8) && Objects.equals(float9, that.float9) && Objects.equals(float10, that.float10) && Objects.equals(float11, that.float11) && Objects.equals(float12, that.float12) && Objects.equals(float13, that.float13) && Objects.equals(float14, that.float14) && Objects.equals(float15, that.float15) && Objects.equals(date1, that.date1) && Objects.equals(date2, that.date2) && Objects.equals(date3, that.date3) && Objects.equals(date4, that.date4) && Objects.equals(date5, that.date5) && Objects.equals(date6, that.date6) && Objects.equals(date7, that.date7) && Objects.equals(date8, that.date8) && Objects.equals(date9, that.date9) && Objects.equals(date10, that.date10) && Objects.equals(date11, that.date11) && Objects.equals(date12, that.date12) && Objects.equals(date13, that.date13) && Objects.equals(date14, that.date14) && Objects.equals(date15, that.date15) && Objects.equals(userID1, that.userID1) && Objects.equals(userID2, that.userID2) && Objects.equals(userID3, that.userID3) && Objects.equals(userID4, that.userID4) && Objects.equals(userID5, that.userID5) && Objects.equals(clientCorporationID1, that.clientCorporationID1) && Objects.equals(clientCorporationID2, that.clientCorporationID2) && Objects.equals(clientCorporationID3, that.clientCorporationID3) && Objects.equals(clientCorporationID4, that.clientCorporationID4) && Objects.equals(clientCorporationID5, that.clientCorporationID5) && Objects.equals(jobOrderID1, that.jobOrderID1) && Objects.equals(jobOrderID2, that.jobOrderID2) && Objects.equals(jobOrderID3, that.jobOrderID3) && Objects.equals(jobOrderID4, that.jobOrderID4) && Objects.equals(jobOrderID5, that.jobOrderID5) && Objects.equals(opportunityID1, that.opportunityID1) && Objects.equals(opportunityID2, that.opportunityID2) && Objects.equals(opportunityID3, that.opportunityID3) && Objects.equals(opportunityID4, that.opportunityID4) && Objects.equals(opportunityID5, that.opportunityID5) && Objects.equals(placementID1, that.placementID1) && Objects.equals(placementID2, that.placementID2) && Objects.equals(placementID3, that.placementID3) && Objects.equals(placementID4, that.placementID4) && Objects.equals(placementID5, that.placementID5) && Objects.equals(customEntityID1, that.customEntityID1) && Objects.equals(customEntityID2, that.customEntityID2) && Objects.equals(customEntityID3, that.customEntityID3) && Objects.equals(customEntityID4, that.customEntityID4) && Objects.equals(customEntityID5, that.customEntityID5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customEntityType, dateAdded, dateLastModified, migrateGUID, text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12, text13, text14, text15, text16, text17, text18, text19, text20, text21, text22, text23, text24, text25, text26, text27, text28, text29, text30, text31, text32, text33, text34, text35, text36, text37, text38, text39, text40, textBlock1, textBlock2, textBlock3, textBlock4, textBlock5, textBlock6, textBlock7, textBlock8, textBlock9, int1, int2, int3, int4, int5, int6, int7, int8, int9, int10, int11, int12, int13, int14, int15, float1, float2, float3, float4, float5, float6, float7, float8, float9, float10, float11, float12, float13, float14, float15, date1, date2, date3, date4, date5, date6, date7, date8, date9, date10, date11, date12, date13, date14, date15, userID1, userID2, userID3, userID4, userID5, clientCorporationID1, clientCorporationID2, clientCorporationID3, clientCorporationID4, clientCorporationID5, jobOrderID1, jobOrderID2, jobOrderID3, jobOrderID4, jobOrderID5, opportunityID1, opportunityID2, opportunityID3, opportunityID4, opportunityID5, placementID1, placementID2, placementID3, placementID4, placementID5, customEntityID1, customEntityID2, customEntityID3, customEntityID4, customEntityID5);
    }

    @Override
    public String toString() {
        return "CustomEntity{" +
            "id=" + id +
            ", customEntityType=" + customEntityType +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", migrateGUID='" + migrateGUID + '\'' +
            ", text1='" + text1 + '\'' +
            ", text2='" + text2 + '\'' +
            ", text3='" + text3 + '\'' +
            ", text4='" + text4 + '\'' +
            ", text5='" + text5 + '\'' +
            ", text6='" + text6 + '\'' +
            ", text7='" + text7 + '\'' +
            ", text8='" + text8 + '\'' +
            ", text9='" + text9 + '\'' +
            ", text10='" + text10 + '\'' +
            ", text11='" + text11 + '\'' +
            ", text12='" + text12 + '\'' +
            ", text13='" + text13 + '\'' +
            ", text14='" + text14 + '\'' +
            ", text15='" + text15 + '\'' +
            ", text16='" + text16 + '\'' +
            ", text17='" + text17 + '\'' +
            ", text18='" + text18 + '\'' +
            ", text19='" + text19 + '\'' +
            ", text20='" + text20 + '\'' +
            ", text21='" + text21 + '\'' +
            ", text22='" + text22 + '\'' +
            ", text23='" + text23 + '\'' +
            ", text24='" + text24 + '\'' +
            ", text25='" + text25 + '\'' +
            ", text26='" + text26 + '\'' +
            ", text27='" + text27 + '\'' +
            ", text28='" + text28 + '\'' +
            ", text29='" + text29 + '\'' +
            ", text30='" + text30 + '\'' +
            ", text31='" + text31 + '\'' +
            ", text32='" + text32 + '\'' +
            ", text33='" + text33 + '\'' +
            ", text34='" + text34 + '\'' +
            ", text35='" + text35 + '\'' +
            ", text36='" + text36 + '\'' +
            ", text37='" + text37 + '\'' +
            ", text38='" + text38 + '\'' +
            ", text39='" + text39 + '\'' +
            ", text40='" + text40 + '\'' +
            ", textBlock1='" + textBlock1 + '\'' +
            ", textBlock2='" + textBlock2 + '\'' +
            ", textBlock3='" + textBlock3 + '\'' +
            ", textBlock4='" + textBlock4 + '\'' +
            ", textBlock5='" + textBlock5 + '\'' +
            ", textBlock6='" + textBlock6 + '\'' +
            ", textBlock7='" + textBlock7 + '\'' +
            ", textBlock8='" + textBlock8 + '\'' +
            ", textBlock9='" + textBlock9 + '\'' +
            ", int1=" + int1 +
            ", int2=" + int2 +
            ", int3=" + int3 +
            ", int4=" + int4 +
            ", int5=" + int5 +
            ", int6=" + int6 +
            ", int7=" + int7 +
            ", int8=" + int8 +
            ", int9=" + int9 +
            ", int10=" + int10 +
            ", int11=" + int11 +
            ", int12=" + int12 +
            ", int13=" + int13 +
            ", int14=" + int14 +
            ", int15=" + int15 +
            ", float1=" + float1 +
            ", float2=" + float2 +
            ", float3=" + float3 +
            ", float4=" + float4 +
            ", float5=" + float5 +
            ", float6=" + float6 +
            ", float7=" + float7 +
            ", float8=" + float8 +
            ", float9=" + float9 +
            ", float10=" + float10 +
            ", float11=" + float11 +
            ", float12=" + float12 +
            ", float13=" + float13 +
            ", float14=" + float14 +
            ", float15=" + float15 +
            ", date1=" + date1 +
            ", date2=" + date2 +
            ", date3=" + date3 +
            ", date4=" + date4 +
            ", date5=" + date5 +
            ", date6=" + date6 +
            ", date7=" + date7 +
            ", date8=" + date8 +
            ", date9=" + date9 +
            ", date10=" + date10 +
            ", date11=" + date11 +
            ", date12=" + date12 +
            ", date13=" + date13 +
            ", date14=" + date14 +
            ", date15=" + date15 +
            ", userID1=" + userID1 +
            ", userID2=" + userID2 +
            ", userID3=" + userID3 +
            ", userID4=" + userID4 +
            ", userID5=" + userID5 +
            ", clientCorporationID1=" + clientCorporationID1 +
            ", clientCorporationID2=" + clientCorporationID2 +
            ", clientCorporationID3=" + clientCorporationID3 +
            ", clientCorporationID4=" + clientCorporationID4 +
            ", clientCorporationID5=" + clientCorporationID5 +
            ", jobOrderID1=" + jobOrderID1 +
            ", jobOrderID2=" + jobOrderID2 +
            ", jobOrderID3=" + jobOrderID3 +
            ", jobOrderID4=" + jobOrderID4 +
            ", jobOrderID5=" + jobOrderID5 +
            ", opportunityID1=" + opportunityID1 +
            ", opportunityID2=" + opportunityID2 +
            ", opportunityID3=" + opportunityID3 +
            ", opportunityID4=" + opportunityID4 +
            ", opportunityID5=" + opportunityID5 +
            ", placementID1=" + placementID1 +
            ", placementID2=" + placementID2 +
            ", placementID3=" + placementID3 +
            ", placementID4=" + placementID4 +
            ", placementID5=" + placementID5 +
            ", customEntityID1=" + customEntityID1 +
            ", customEntityID2=" + customEntityID2 +
            ", customEntityID3=" + customEntityID3 +
            ", customEntityID4=" + customEntityID4 +
            ", customEntityID5=" + customEntityID5 +
            '}';
    }
}
