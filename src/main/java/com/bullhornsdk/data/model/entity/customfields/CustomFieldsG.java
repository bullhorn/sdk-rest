package com.bullhornsdk.data.model.entity.customfields;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Common custom fields:
 *
 * customDate 1-10 (extends 1-3)
 *
 * customFloat 1-3 (extends 1-3)
 *
 * customInt 1-3 (extends 1-3)
 *
 * customText 1-20 (extends 1-20)
 *
 * customTextBlock 1-10 (extends 1-5)
 *
 * @author mkesmetzis
 *
 */
public class CustomFieldsG extends CustomFieldsB {

    private DateTime customDate4;

    private DateTime customDate5;

    private DateTime customDate6;

    private DateTime customDate7;

    private DateTime customDate8;

    private DateTime customDate9;

    private DateTime customDate10;

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


    @Override
    public String toString() {
        return "CustomFieldsG{" +
            "customDate4=" + customDate4 +
            ", customDate5=" + customDate5 +
            ", customDate6=" + customDate6 +
            ", customDate7=" + customDate7 +
            ", customDate8=" + customDate8 +
            ", customDate9=" + customDate9 +
            ", customDate10=" + customDate10 +
            ", customTextBlock6='" + customTextBlock6 + '\'' +
            ", customTextBlock7='" + customTextBlock7 + '\'' +
            ", customTextBlock8='" + customTextBlock8 + '\'' +
            ", customTextBlock9='" + customTextBlock9 + '\'' +
            ", customTextBlock10='" + customTextBlock10 + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CustomFieldsG that = (CustomFieldsG) o;
        return Objects.equals(customDate4, that.customDate4) &&
            Objects.equals(customDate5, that.customDate5) &&
            Objects.equals(customDate6, that.customDate6) &&
            Objects.equals(customDate7, that.customDate7) &&
            Objects.equals(customDate8, that.customDate8) &&
            Objects.equals(customDate9, that.customDate9) &&
            Objects.equals(customDate10, that.customDate10) &&
            Objects.equals(customTextBlock6, that.customTextBlock6) &&
            Objects.equals(customTextBlock7, that.customTextBlock7) &&
            Objects.equals(customTextBlock8, that.customTextBlock8) &&
            Objects.equals(customTextBlock9, that.customTextBlock9) &&
            Objects.equals(customTextBlock10, that.customTextBlock10);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), customDate4, customDate5, customDate6, customDate7, customDate8, customDate9, customDate10, customTextBlock6, customTextBlock7, customTextBlock8, customTextBlock9, customTextBlock10);
    }
}
