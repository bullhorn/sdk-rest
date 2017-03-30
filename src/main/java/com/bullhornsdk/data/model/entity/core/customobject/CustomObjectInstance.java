 package com.bullhornsdk.data.model.entity.core.customobject;

 import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
 import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
 import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
 import com.bullhornsdk.data.model.entity.core.type.HardDeleteEntity;
 import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
 import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
 import com.fasterxml.jackson.annotation.JsonProperty;
 import org.joda.time.DateTime;

 import java.math.BigDecimal;

public abstract class CustomObjectInstance extends AbstractEntity implements QueryEntity, DateLastModifiedEntity, UpdateEntity, CreateEntity, HardDeleteEntity {

	private Integer id;
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
    private BigDecimal float1;
    private BigDecimal float2;
    private BigDecimal float3;
    private BigDecimal float4;
    private BigDecimal float5;
    private BigDecimal float6;
    private BigDecimal float7;
    private BigDecimal float8;
    private BigDecimal float9;
    private BigDecimal float10;
    private String textBlock1;
    private String textBlock2;
    private String textBlock3;
    private String textBlock4;
    private String textBlock5;
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
	private DateTime dateAdded;
    private DateTime dateLastModified;

    public CustomObjectInstance() {
        super();
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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

    @JsonProperty("float1")
    public BigDecimal getFloat1() {
        return float1;
    }

    @JsonProperty("float1")
    public void setFloat1(BigDecimal float1) {
        this.float1 = float1;
    }

    @JsonProperty("float2")
    public BigDecimal getFloat2() {
        return float2;
    }

    @JsonProperty("float2")
    public void setFloat2(BigDecimal float2) {
        this.float2 = float2;
    }

    @JsonProperty("float3")
    public BigDecimal getFloat3() {
        return float3;
    }

    @JsonProperty("float3")
    public void setFloat3(BigDecimal float3) {
        this.float3 = float3;
    }

    @JsonProperty("float4")
    public BigDecimal getFloat4() {
        return float4;
    }

    @JsonProperty("float4")
    public void setFloat4(BigDecimal float4) {
        this.float4 = float4;
    }

    @JsonProperty("float5")
    public BigDecimal getFloat5() {
        return float5;
    }

    @JsonProperty("float5")
    public void setFloat5(BigDecimal float5) {
        this.float5 = float5;
    }

    @JsonProperty("float6")
    public BigDecimal getFloat6() {
        return float6;
    }

    @JsonProperty("float6")
    public void setFloat6(BigDecimal float6) {
        this.float6 = float6;
    }

    @JsonProperty("float7")
    public BigDecimal getFloat7() {
        return float7;
    }

    @JsonProperty("float7")
    public void setFloat7(BigDecimal float7) {
        this.float7 = float7;
    }

    @JsonProperty("float8")
    public BigDecimal getFloat8() {
        return float8;
    }

    @JsonProperty("float8")
    public void setFloat8(BigDecimal float8) {
        this.float8 = float8;
    }

    @JsonProperty("float9")
    public BigDecimal getFloat9() {
        return float9;
    }

    @JsonProperty("float9")
    public void setFloat9(BigDecimal float9) {
        this.float9 = float9;
    }

    @JsonProperty("float10")
    public BigDecimal getFloat10() {
        return float10;
    }

    @JsonProperty("float10")
    public void setFloat10(BigDecimal float10) {
        this.float10 = float10;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomObjectInstance that = (CustomObjectInstance) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (text1 != null ? !text1.equals(that.text1) : that.text1 != null) return false;
        if (text2 != null ? !text2.equals(that.text2) : that.text2 != null) return false;
        if (text3 != null ? !text3.equals(that.text3) : that.text3 != null) return false;
        if (text4 != null ? !text4.equals(that.text4) : that.text4 != null) return false;
        if (text5 != null ? !text5.equals(that.text5) : that.text5 != null) return false;
        if (text6 != null ? !text6.equals(that.text6) : that.text6 != null) return false;
        if (text7 != null ? !text7.equals(that.text7) : that.text7 != null) return false;
        if (text8 != null ? !text8.equals(that.text8) : that.text8 != null) return false;
        if (text9 != null ? !text9.equals(that.text9) : that.text9 != null) return false;
        if (text10 != null ? !text10.equals(that.text10) : that.text10 != null) return false;
        if (text11 != null ? !text11.equals(that.text11) : that.text11 != null) return false;
        if (text12 != null ? !text12.equals(that.text12) : that.text12 != null) return false;
        if (text13 != null ? !text13.equals(that.text13) : that.text13 != null) return false;
        if (text14 != null ? !text14.equals(that.text14) : that.text14 != null) return false;
        if (text15 != null ? !text15.equals(that.text15) : that.text15 != null) return false;
        if (text16 != null ? !text16.equals(that.text16) : that.text16 != null) return false;
        if (text17 != null ? !text17.equals(that.text17) : that.text17 != null) return false;
        if (text18 != null ? !text18.equals(that.text18) : that.text18 != null) return false;
        if (text19 != null ? !text19.equals(that.text19) : that.text19 != null) return false;
        if (text20 != null ? !text20.equals(that.text20) : that.text20 != null) return false;
        if (int1 != null ? !int1.equals(that.int1) : that.int1 != null) return false;
        if (int2 != null ? !int2.equals(that.int2) : that.int2 != null) return false;
        if (int3 != null ? !int3.equals(that.int3) : that.int3 != null) return false;
        if (int4 != null ? !int4.equals(that.int4) : that.int4 != null) return false;
        if (int5 != null ? !int5.equals(that.int5) : that.int5 != null) return false;
        if (int6 != null ? !int6.equals(that.int6) : that.int6 != null) return false;
        if (int7 != null ? !int7.equals(that.int7) : that.int7 != null) return false;
        if (int8 != null ? !int8.equals(that.int8) : that.int8 != null) return false;
        if (int9 != null ? !int9.equals(that.int9) : that.int9 != null) return false;
        if (int10 != null ? !int10.equals(that.int10) : that.int10 != null) return false;
        if (float1 != null ? !float1.equals(that.float1) : that.float1 != null) return false;
        if (float2 != null ? !float2.equals(that.float2) : that.float2 != null) return false;
        if (float3 != null ? !float3.equals(that.float3) : that.float3 != null) return false;
        if (float4 != null ? !float4.equals(that.float4) : that.float4 != null) return false;
        if (float5 != null ? !float5.equals(that.float5) : that.float5 != null) return false;
        if (float6 != null ? !float6.equals(that.float6) : that.float6 != null) return false;
        if (float7 != null ? !float7.equals(that.float7) : that.float7 != null) return false;
        if (float8 != null ? !float8.equals(that.float8) : that.float8 != null) return false;
        if (float9 != null ? !float9.equals(that.float9) : that.float9 != null) return false;
        if (float10 != null ? !float10.equals(that.float10) : that.float10 != null) return false;
        if (textBlock1 != null ? !textBlock1.equals(that.textBlock1) : that.textBlock1 != null) return false;
        if (textBlock2 != null ? !textBlock2.equals(that.textBlock2) : that.textBlock2 != null) return false;
        if (textBlock3 != null ? !textBlock3.equals(that.textBlock3) : that.textBlock3 != null) return false;
        if (textBlock4 != null ? !textBlock4.equals(that.textBlock4) : that.textBlock4 != null) return false;
        if (textBlock5 != null ? !textBlock5.equals(that.textBlock5) : that.textBlock5 != null) return false;
        if (date1 != null ? !date1.equals(that.date1) : that.date1 != null) return false;
        if (date2 != null ? !date2.equals(that.date2) : that.date2 != null) return false;
        if (date3 != null ? !date3.equals(that.date3) : that.date3 != null) return false;
        if (date4 != null ? !date4.equals(that.date4) : that.date4 != null) return false;
        if (date5 != null ? !date5.equals(that.date5) : that.date5 != null) return false;
        if (date6 != null ? !date6.equals(that.date6) : that.date6 != null) return false;
        if (date7 != null ? !date7.equals(that.date7) : that.date7 != null) return false;
        if (date8 != null ? !date8.equals(that.date8) : that.date8 != null) return false;
        if (date9 != null ? !date9.equals(that.date9) : that.date9 != null) return false;
        if (date10 != null ? !date10.equals(that.date10) : that.date10 != null) return false;
        if (dateAdded != null ? !dateAdded.equals(that.dateAdded) : that.dateAdded != null) return false;
        return !(dateLastModified != null ? !dateLastModified.equals(that.dateLastModified) : that.dateLastModified != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (text1 != null ? text1.hashCode() : 0);
        result = 31 * result + (text2 != null ? text2.hashCode() : 0);
        result = 31 * result + (text3 != null ? text3.hashCode() : 0);
        result = 31 * result + (text4 != null ? text4.hashCode() : 0);
        result = 31 * result + (text5 != null ? text5.hashCode() : 0);
        result = 31 * result + (text6 != null ? text6.hashCode() : 0);
        result = 31 * result + (text7 != null ? text7.hashCode() : 0);
        result = 31 * result + (text8 != null ? text8.hashCode() : 0);
        result = 31 * result + (text9 != null ? text9.hashCode() : 0);
        result = 31 * result + (text10 != null ? text10.hashCode() : 0);
        result = 31 * result + (text11 != null ? text11.hashCode() : 0);
        result = 31 * result + (text12 != null ? text12.hashCode() : 0);
        result = 31 * result + (text13 != null ? text13.hashCode() : 0);
        result = 31 * result + (text14 != null ? text14.hashCode() : 0);
        result = 31 * result + (text15 != null ? text15.hashCode() : 0);
        result = 31 * result + (text16 != null ? text16.hashCode() : 0);
        result = 31 * result + (text17 != null ? text17.hashCode() : 0);
        result = 31 * result + (text18 != null ? text18.hashCode() : 0);
        result = 31 * result + (text19 != null ? text19.hashCode() : 0);
        result = 31 * result + (text20 != null ? text20.hashCode() : 0);
        result = 31 * result + (int1 != null ? int1.hashCode() : 0);
        result = 31 * result + (int2 != null ? int2.hashCode() : 0);
        result = 31 * result + (int3 != null ? int3.hashCode() : 0);
        result = 31 * result + (int4 != null ? int4.hashCode() : 0);
        result = 31 * result + (int5 != null ? int5.hashCode() : 0);
        result = 31 * result + (int6 != null ? int6.hashCode() : 0);
        result = 31 * result + (int7 != null ? int7.hashCode() : 0);
        result = 31 * result + (int8 != null ? int8.hashCode() : 0);
        result = 31 * result + (int9 != null ? int9.hashCode() : 0);
        result = 31 * result + (int10 != null ? int10.hashCode() : 0);
        result = 31 * result + (float1 != null ? float1.hashCode() : 0);
        result = 31 * result + (float2 != null ? float2.hashCode() : 0);
        result = 31 * result + (float3 != null ? float3.hashCode() : 0);
        result = 31 * result + (float4 != null ? float4.hashCode() : 0);
        result = 31 * result + (float5 != null ? float5.hashCode() : 0);
        result = 31 * result + (float6 != null ? float6.hashCode() : 0);
        result = 31 * result + (float7 != null ? float7.hashCode() : 0);
        result = 31 * result + (float8 != null ? float8.hashCode() : 0);
        result = 31 * result + (float9 != null ? float9.hashCode() : 0);
        result = 31 * result + (float10 != null ? float10.hashCode() : 0);
        result = 31 * result + (textBlock1 != null ? textBlock1.hashCode() : 0);
        result = 31 * result + (textBlock2 != null ? textBlock2.hashCode() : 0);
        result = 31 * result + (textBlock3 != null ? textBlock3.hashCode() : 0);
        result = 31 * result + (textBlock4 != null ? textBlock4.hashCode() : 0);
        result = 31 * result + (textBlock5 != null ? textBlock5.hashCode() : 0);
        result = 31 * result + (date1 != null ? date1.hashCode() : 0);
        result = 31 * result + (date2 != null ? date2.hashCode() : 0);
        result = 31 * result + (date3 != null ? date3.hashCode() : 0);
        result = 31 * result + (date4 != null ? date4.hashCode() : 0);
        result = 31 * result + (date5 != null ? date5.hashCode() : 0);
        result = 31 * result + (date6 != null ? date6.hashCode() : 0);
        result = 31 * result + (date7 != null ? date7.hashCode() : 0);
        result = 31 * result + (date8 != null ? date8.hashCode() : 0);
        result = 31 * result + (date9 != null ? date9.hashCode() : 0);
        result = 31 * result + (date10 != null ? date10.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CustomObjectInstance{" +
                "id=" + id +
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
                ", textBlock1='" + textBlock1 + '\'' +
                ", textBlock2='" + textBlock2 + '\'' +
                ", textBlock3='" + textBlock3 + '\'' +
                ", textBlock4='" + textBlock4 + '\'' +
                ", textBlock5='" + textBlock5 + '\'' +
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
                ", dateAdded=" + dateAdded +
                ", dateLastModified=" + dateLastModified +
                '}';
    }
}
