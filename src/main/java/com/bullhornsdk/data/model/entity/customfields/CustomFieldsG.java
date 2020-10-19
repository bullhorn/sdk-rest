package com.bullhornsdk.data.model.entity.customfields;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.constraints.Size;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Common custom fields:
 *
 * customDate 1-10 (extends 1-3)
 *
 * customFloat 1-3 (extends 1-3)
 *
 * customInt 1-3 (extends 1-3)
 *
 * customText 1-10 (extends 1-5)
 *
 * customTextBlock 1-10
 *
 * @author mkesmetzis
 *
 */
public class CustomFieldsG extends BaseCustomFields {

    private DateTime customDate1;

    private DateTime customDate2;

    private DateTime customDate3;

    private DateTime customDate4;

    private DateTime customDate5;

    private DateTime customDate6;

    private DateTime customDate7;

    private DateTime customDate8;

    private DateTime customDate9;

    private DateTime customDate10;

    private BigDecimal customFloat1;

    private BigDecimal customFloat2;

    private BigDecimal customFloat3;

    private Integer customInt1;

    private Integer customInt2;

    private Integer customInt3;

    @JsonIgnore
    private String customTextBlock1;

    @JsonIgnore
    private String customTextBlock2;

    @JsonIgnore
    private String customTextBlock3;

    @JsonIgnore
    private String customTextBlock4;

    @JsonIgnore
    private String customTextBlock5;

    @JsonIgnore
    private String customTextBlock6;

    @JsonIgnore
    private String customTextBlock7;

    @JsonIgnore
    private String customTextBlock8;

    @JsonIgnore
    private String customTextBlock9;

    @JsonIgnore
    private String customTextBlock10;

    @JsonIgnore
    @Size(max = 100)
    private String customText6;

    @JsonIgnore
    @Size(max = 100)
    private String customText7;

    @JsonIgnore
    @Size(max = 100)
    private String customText8;

    @JsonIgnore
    @Size(max = 100)
    private String customText9;

    @JsonIgnore
    @Size(max = 100)
    private String customText10;

    @JsonProperty("customDate1")
    public DateTime getCustomDate1() {
        return customDate1;
    }

    @JsonProperty("customDate1")
    public void setCustomDate1(DateTime customDate1) {
        this.customDate1 = customDate1;
    }

    @JsonProperty("customDate2")
    public DateTime getCustomDate2() {
        return customDate2;
    }

    @JsonProperty("customDate2")
    public void setCustomDate2(DateTime customDate2) {
        this.customDate2 = customDate2;
    }

    @JsonProperty("customDate3")
    public DateTime getCustomDate3() {
        return customDate3;
    }

    @JsonProperty("customDate3")
    public void setCustomDate3(DateTime customDate3) {
        this.customDate3 = customDate3;
    }

    @JsonProperty("customDate4")
    public DateTime getCustomDate4() {
        return customDate4;
    }

    @JsonProperty("customDate4")
    public void setCustomDate4(DateTime customDate4) {
        this.customDate4 = customDate4;
    }

    @JsonProperty("customDate5")
    public DateTime getCustomDate5() {
        return customDate5;
    }

    @JsonProperty("customDate5")
    public void setCustomDate5(DateTime customDate5) {
        this.customDate5 = customDate5;
    }

    @JsonProperty("customDate6")
    public DateTime getCustomDate6() {
        return customDate6;
    }

    @JsonProperty("customDate6")
    public void setCustomDate6(DateTime customDate6) {
        this.customDate6 = customDate6;
    }

    @JsonProperty("customDate7")
    public DateTime getCustomDate7() {
        return customDate7;
    }

    @JsonProperty("customDate7")
    public void setCustomDate7(DateTime customDate7) {
        this.customDate7 = customDate7;
    }

    @JsonProperty("customDate8")
    public DateTime getCustomDate8() {
        return customDate8;
    }

    @JsonProperty("customDate8")
    public void setCustomDate8(DateTime customDate8) {
        this.customDate8 = customDate8;
    }

    @JsonProperty("customDate9")
    public DateTime getCustomDate9() {
        return customDate9;
    }

    @JsonProperty("customDate9")
    public void setCustomDate9(DateTime customDate9) {
        this.customDate9 = customDate9;
    }

    @JsonProperty("customDate10")
    public DateTime getCustomDate10() {
        return customDate10;
    }

    @JsonProperty("customDate10")
    public void setCustomDate10(DateTime customDate10) {
        this.customDate10 = customDate10;
    }

    @JsonProperty("customFloat1")
    public BigDecimal getCustomFloat1() {
        return customFloat1;
    }

    @JsonProperty("customFloat1")
    public void setCustomFloat1(BigDecimal customFloat1) {
        this.customFloat1 = customFloat1;
    }

    @JsonProperty("customFloat2")
    public BigDecimal getCustomFloat2() {
        return customFloat2;
    }

    @JsonProperty("customFloat2")
    public void setCustomFloat2(BigDecimal customFloat2) {
        this.customFloat2 = customFloat2;
    }

    @JsonProperty("customFloat3")
    public BigDecimal getCustomFloat3() {
        return customFloat3;
    }

    @JsonProperty("customFloat3")
    public void setCustomFloat3(BigDecimal customFloat3) {
        this.customFloat3 = customFloat3;
    }

    @JsonProperty("customInt1")
    public Integer getCustomInt1() {
        return customInt1;
    }

    @JsonProperty("customInt1")
    public void setCustomInt1(Integer customInt1) {
        this.customInt1 = customInt1;
    }

    @JsonProperty("customInt2")
    public Integer getCustomInt2() {
        return customInt2;
    }

    @JsonProperty("customInt2")
    public void setCustomInt2(Integer customInt2) {
        this.customInt2 = customInt2;
    }

    @JsonProperty("customInt3")
    public Integer getCustomInt3() {
        return customInt3;
    }

    @JsonProperty("customInt3")
    public void setCustomInt3(Integer customInt3) {
        this.customInt3 = customInt3;
    }

    @JsonProperty("customTextBlock1")
    public String getCustomTextBlock1() {
        return customTextBlock1;
    }

    @JsonIgnore
    public void setCustomTextBlock1(String customTextBlock1) {
        this.customTextBlock1 = customTextBlock1;
    }

    @JsonProperty("customTextBlock2")
    public String getCustomTextBlock2() {
        return customTextBlock2;
    }

    @JsonIgnore
    public void setCustomTextBlock2(String customTextBlock2) {
        this.customTextBlock2 = customTextBlock2;
    }

    @JsonProperty("customTextBlock3")
    public String getCustomTextBlock3() {
        return customTextBlock3;
    }

    @JsonIgnore
    public void setCustomTextBlock3(String customTextBlock3) {
        this.customTextBlock3 = customTextBlock3;
    }

    @JsonProperty("customTextBlock4")
    public String getCustomTextBlock4() {
        return customTextBlock4;
    }

    @JsonIgnore
    public void setCustomTextBlock4(String customTextBlock4) {
        this.customTextBlock4 = customTextBlock4;
    }

    @JsonProperty("customTextBlock5")
    public String getCustomTextBlock5() {
        return customTextBlock5;
    }

    @JsonIgnore
    public void setCustomTextBlock5(String customTextBlock5) {
        this.customTextBlock5 = customTextBlock5;
    }

    @JsonProperty("customTextBlock6")
    public String getCustomTextBlock6() {
        return customTextBlock6;
    }

    @JsonIgnore
    public void setCustomTextBlock6(String customTextBlock6) {
        this.customTextBlock6 = customTextBlock6;
    }

    @JsonProperty("customTextBlock7")
    public String getCustomTextBlock7() {
        return customTextBlock7;
    }

    @JsonIgnore
    public void setCustomTextBlock7(String customTextBlock7) {
        this.customTextBlock7 = customTextBlock7;
    }

    @JsonProperty("customTextBlock8")
    public String getCustomTextBlock8() {
        return customTextBlock8;
    }

    @JsonIgnore
    public void setCustomTextBlock8(String customTextBlock8) {
        this.customTextBlock8 = customTextBlock8;
    }

    @JsonProperty("customTextBlock9")
    public String getCustomTextBlock9() {
        return customTextBlock9;
    }

    @JsonIgnore
    public void setCustomTextBlock9(String customTextBlock9) {
        this.customTextBlock9 = customTextBlock9;
    }

    @JsonProperty("customTextBlock10")
    public String getCustomTextBlock10() {
        return customTextBlock10;
    }

    @JsonIgnore
    public void setCustomTextBlock10(String customTextBlock10) {
        this.customTextBlock10 = customTextBlock10;
    }

    @JsonProperty("customText6")
    public String getCustomText6() {
        return customText6;
    }

    @JsonIgnore
    public void setCustomText6(String customText6) {
        this.customText6 = customText6;
    }

    @JsonProperty("customText7")
    public String getCustomText7() {
        return customText7;
    }

    @JsonIgnore
    public void setCustomText7(String customText7) {
        this.customText7 = customText7;
    }

    @JsonProperty("customText8")
    public String getCustomText8() {
        return customText8;
    }

    @JsonIgnore
    public void setCustomText8(String customText8) {
        this.customText8 = customText8;
    }

    @JsonProperty("customText9")
    public String getCustomText9() {
        return customText9;
    }

    @JsonIgnore
    public void setCustomText9(String customText9) {
        this.customText9 = customText9;
    }

    @JsonProperty("customText10")
    public String getCustomText10() {
        return customText10;
    }

    @JsonIgnore
    public void setCustomText10(String customText10) {
        this.customText10 = customText10;
    }

    @Override
    public String toString() {
        return "CustomFieldsG{" +
            "customDate1=" + customDate1 +
            ", customDate2=" + customDate2 +
            ", customDate3=" + customDate3 +
            ", customDate4=" + customDate4 +
            ", customDate5=" + customDate5 +
            ", customDate6=" + customDate6 +
            ", customDate7=" + customDate7 +
            ", customDate8=" + customDate8 +
            ", customDate9=" + customDate9 +
            ", customDate10=" + customDate10 +
            ", customFloat1=" + customFloat1 +
            ", customFloat2=" + customFloat2 +
            ", customFloat3=" + customFloat3 +
            ", customInt1=" + customInt1 +
            ", customInt2=" + customInt2 +
            ", customInt3=" + customInt3 +
            ", customTextBlock1='" + customTextBlock1 + '\'' +
            ", customTextBlock2='" + customTextBlock2 + '\'' +
            ", customTextBlock3='" + customTextBlock3 + '\'' +
            ", customTextBlock4='" + customTextBlock4 + '\'' +
            ", customTextBlock5='" + customTextBlock5 + '\'' +
            ", customTextBlock6='" + customTextBlock6 + '\'' +
            ", customTextBlock7='" + customTextBlock7 + '\'' +
            ", customTextBlock8='" + customTextBlock8 + '\'' +
            ", customTextBlock9='" + customTextBlock9 + '\'' +
            ", customTextBlock10='" + customTextBlock10 + '\'' +
            ", customText6='" + customText6 + '\'' +
            ", customText7='" + customText7 + '\'' +
            ", customText8='" + customText8 + '\'' +
            ", customText9='" + customText9 + '\'' +
            ", customText10='" + customText10 + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CustomFieldsG that = (CustomFieldsG) o;
        return Objects.equals(customDate1, that.customDate1) &&
            Objects.equals(customDate2, that.customDate2) &&
            Objects.equals(customDate3, that.customDate3) &&
            Objects.equals(customDate4, that.customDate4) &&
            Objects.equals(customDate5, that.customDate5) &&
            Objects.equals(customDate6, that.customDate6) &&
            Objects.equals(customDate7, that.customDate7) &&
            Objects.equals(customDate8, that.customDate8) &&
            Objects.equals(customDate9, that.customDate9) &&
            Objects.equals(customDate10, that.customDate10) &&
            Objects.equals(customFloat1, that.customFloat1) &&
            Objects.equals(customFloat2, that.customFloat2) &&
            Objects.equals(customFloat3, that.customFloat3) &&
            Objects.equals(customInt1, that.customInt1) &&
            Objects.equals(customInt2, that.customInt2) &&
            Objects.equals(customInt3, that.customInt3) &&
            Objects.equals(customTextBlock1, that.customTextBlock1) &&
            Objects.equals(customTextBlock2, that.customTextBlock2) &&
            Objects.equals(customTextBlock3, that.customTextBlock3) &&
            Objects.equals(customTextBlock4, that.customTextBlock4) &&
            Objects.equals(customTextBlock5, that.customTextBlock5) &&
            Objects.equals(customTextBlock6, that.customTextBlock6) &&
            Objects.equals(customTextBlock7, that.customTextBlock7) &&
            Objects.equals(customTextBlock8, that.customTextBlock8) &&
            Objects.equals(customTextBlock9, that.customTextBlock9) &&
            Objects.equals(customTextBlock10, that.customTextBlock10) &&
            Objects.equals(customText6, that.customText6) &&
            Objects.equals(customText7, that.customText7) &&
            Objects.equals(customText8, that.customText8) &&
            Objects.equals(customText9, that.customText9) &&
            Objects.equals(customText10, that.customText10);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), customDate1, customDate2, customDate3, customDate4, customDate5, customDate6, customDate7, customDate8, customDate9, customDate10, customFloat1, customFloat2, customFloat3, customInt1, customInt2, customInt3, customTextBlock1, customTextBlock2, customTextBlock3, customTextBlock4, customTextBlock5, customTextBlock6, customTextBlock7, customTextBlock8, customTextBlock9, customTextBlock10, customText6, customText7, customText8, customText9, customText10);
    }
}
