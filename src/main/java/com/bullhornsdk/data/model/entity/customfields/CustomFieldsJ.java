package com.bullhornsdk.data.model.entity.customfields;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Common custom fields for *UnbilledRevenueDistribution:
 * <p>
 * customDate 1-3
 * <p>
 * customInt 1-5
 * <p>
 * customText 1-5
 */
public class CustomFieldsJ extends BaseCustomFields {

    private DateTime customDate1;

    private DateTime customDate2;

    private DateTime customDate3;

    private Integer customInt1;

    private Integer customInt2;

    private Integer customInt3;

    private Integer customInt4;

    private Integer customInt5;

    @JsonIgnore
    @Size(max = 100)
    private String customText1;

    @JsonIgnore
    @Size(max = 100)
    private String customText2;

    @JsonIgnore
    @Size(max = 100)
    private String customText3;

    @JsonIgnore
    @Size(max = 100)
    private String customText4;

    @JsonIgnore
    @Size(max = 100)
    private String customText5;

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

    @JsonProperty("customInt4")
    public Integer getCustomInt4() {
        return customInt4;
    }

    @JsonProperty("customInt4")
    public void setCustomInt4(Integer customInt4) {
        this.customInt4 = customInt4;
    }

    @JsonProperty("customInt5")
    public Integer getCustomInt5() {
        return customInt5;
    }

    @JsonProperty("customInt5")
    public void setCustomInt5(Integer customInt5) {
        this.customInt5 = customInt5;
    }

    @JsonProperty("customText1")
    public String getCustomText1() {
        return customText1;
    }

    @JsonIgnore
    public void setCustomText1(String customText1) {
        this.customText1 = customText1;
    }

    @JsonProperty("customText2")
    public String getCustomText2() {
        return customText2;
    }

    @JsonIgnore
    public void setCustomText2(String customText2) {
        this.customText2 = customText2;
    }

    @JsonProperty("customText3")
    public String getCustomText3() {
        return customText3;
    }

    @JsonIgnore
    public void setCustomText3(String customText3) {
        this.customText3 = customText3;
    }

    @JsonProperty("customText4")
    public String getCustomText4() {
        return customText4;
    }

    @JsonIgnore
    public void setCustomText4(String customText4) {
        this.customText4 = customText4;
    }

    @JsonProperty("customText5")
    public String getCustomText5() {
        return customText5;
    }

    @JsonIgnore
    public void setCustomText5(String customText5) {
        this.customText5 = customText5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CustomFieldsJ that = (CustomFieldsJ) o;
        return Objects.equals(customDate1, that.customDate1) && Objects.equals(customDate2, that.customDate2) && Objects.equals(customDate3, that.customDate3) && Objects.equals(customInt1, that.customInt1) && Objects.equals(customInt2, that.customInt2) && Objects.equals(customInt3, that.customInt3) && Objects.equals(customInt4, that.customInt4) && Objects.equals(customInt5, that.customInt5) && Objects.equals(customText1, that.customText1) && Objects.equals(customText2, that.customText2) && Objects.equals(customText3, that.customText3) && Objects.equals(customText4, that.customText4) && Objects.equals(customText5, that.customText5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), customDate1, customDate2, customDate3, customInt1, customInt2, customInt3, customInt4, customInt5, customText1, customText2, customText3, customText4, customText5);
    }

    @Override
    public String toString() {
        return "CustomFieldsJ{" +
            "customDate1=" + customDate1 +
            ", customDate2=" + customDate2 +
            ", customDate3=" + customDate3 +
            ", customInt1=" + customInt1 +
            ", customInt2=" + customInt2 +
            ", customInt3=" + customInt3 +
            ", customInt4=" + customInt4 +
            ", customInt5=" + customInt5 +
            ", customText1='" + customText1 + '\'' +
            ", customText2='" + customText2 + '\'' +
            ", customText3='" + customText3 + '\'' +
            ", customText4='" + customText4 + '\'' +
            ", customText5='" + customText5 + '\'' +
            '}';
    }
}
