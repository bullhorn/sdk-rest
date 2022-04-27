package com.bullhornsdk.data.model.entity.customfields;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Common custom fields for *RateCardLines:
 * <p>
 * customFloat 1-5
 * <p>
 * customInt 1-5
 * <p>
 * customRate 1-5
 * <p>
 * customText 1-10 (extends 1-5)
 *
 * @author onaumov
 */
public class CustomFieldsI extends BaseCustomFields {

    private BigDecimal customFloat1;

    private BigDecimal customFloat2;

    private BigDecimal customFloat3;

    private BigDecimal customFloat4;

    private BigDecimal customFloat5;

    private Integer customInt1;

    private Integer customInt2;

    private Integer customInt3;

    private Integer customInt4;

    private Integer customInt5;

    private BigDecimal customRate1;

    private BigDecimal customRate2;

    private BigDecimal customRate3;

    private BigDecimal customRate4;

    private BigDecimal customRate5;

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

    @JsonProperty("customFloat4")
    public BigDecimal getCustomFloat4() {
        return customFloat4;
    }

    @JsonProperty("customFloat4")
    public void setCustomFloat4(BigDecimal customFloat4) {
        this.customFloat4 = customFloat4;
    }

    @JsonProperty("customFloat5")
    public BigDecimal getCustomFloat5() {
        return customFloat5;
    }

    @JsonProperty("customFloat5")
    public void setCustomFloat5(BigDecimal customFloat5) {
        this.customFloat5 = customFloat5;
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

    @JsonProperty("customRate1")
    public BigDecimal getCustomRate1() {
        return customRate1;
    }

    @JsonProperty("customRate1")
    public void setCustomRate1(BigDecimal customRate1) {
        this.customRate1 = customRate1;
    }

    @JsonProperty("customRate2")
    public BigDecimal getCustomRate2() {
        return customRate2;
    }

    @JsonProperty("customRate2")
    public void setCustomRate2(BigDecimal customRate2) {
        this.customRate2 = customRate2;
    }

    @JsonProperty("customRate3")
    public BigDecimal getCustomRate3() {
        return customRate3;
    }

    @JsonProperty("customRate3")
    public void setCustomRate3(BigDecimal customRate3) {
        this.customRate3 = customRate3;
    }

    @JsonProperty("customRate4")
    public BigDecimal getCustomRate4() {
        return customRate4;
    }

    @JsonProperty("customRate4")
    public void setCustomRate4(BigDecimal customRate4) {
        this.customRate4 = customRate4;
    }

    @JsonProperty("customRate5")
    public BigDecimal getCustomRate5() {
        return customRate5;
    }

    @JsonProperty("customRate5")
    public void setCustomRate5(BigDecimal customRate5) {
        this.customRate5 = customRate5;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CustomFieldsI that = (CustomFieldsI) o;
        return Objects.equals(customFloat1, that.customFloat1) && Objects.equals(customFloat2, that.customFloat2) && Objects.equals(customFloat3, that.customFloat3) && Objects.equals(customFloat4, that.customFloat4) && Objects.equals(customFloat5, that.customFloat5) && Objects.equals(customInt1, that.customInt1) && Objects.equals(customInt2, that.customInt2) && Objects.equals(customInt3, that.customInt3) && Objects.equals(customInt4, that.customInt4) && Objects.equals(customInt5, that.customInt5) && Objects.equals(customRate1, that.customRate1) && Objects.equals(customRate2, that.customRate2) && Objects.equals(customRate3, that.customRate3) && Objects.equals(customRate4, that.customRate4) && Objects.equals(customRate5, that.customRate5) && Objects.equals(customText6, that.customText6) && Objects.equals(customText7, that.customText7) && Objects.equals(customText8, that.customText8) && Objects.equals(customText9, that.customText9) && Objects.equals(customText10, that.customText10);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), customFloat1, customFloat2, customFloat3, customFloat4, customFloat5, customInt1, customInt2, customInt3, customInt4, customInt5, customRate1, customRate2, customRate3, customRate4, customRate5, customText6, customText7, customText8, customText9, customText10);
    }

    @Override
    public String toString() {
        return "CustomFieldsI{" +
            "customFloat1=" + customFloat1 +
            ", customFloat2=" + customFloat2 +
            ", customFloat3=" + customFloat3 +
            ", customFloat4=" + customFloat4 +
            ", customFloat5=" + customFloat5 +
            ", customInt1=" + customInt1 +
            ", customInt2=" + customInt2 +
            ", customInt3=" + customInt3 +
            ", customInt4=" + customInt4 +
            ", customInt5=" + customInt5 +
            ", customRate1=" + customRate1 +
            ", customRate2=" + customRate2 +
            ", customRate3=" + customRate3 +
            ", customRate4=" + customRate4 +
            ", customRate5=" + customRate5 +
            ", customText6='" + customText6 + '\'' +
            ", customText7='" + customText7 + '\'' +
            ", customText8='" + customText8 + '\'' +
            ", customText9='" + customText9 + '\'' +
            ", customText10='" + customText10 + '\'' +
            '}';
    }
}
