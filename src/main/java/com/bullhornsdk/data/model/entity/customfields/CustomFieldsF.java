package com.bullhornsdk.data.model.entity.customfields;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Size;
import java.util.Objects;

public class CustomFieldsF extends CustomFieldsB {

    @JsonIgnore
    @Size(max = 100)
    private String customText21;

    @JsonIgnore
    @Size(max = 100)
    private String customText22;

    @JsonIgnore
    @Size(max = 100)
    private String customText23;

    @JsonIgnore
    @Size(max = 100)
    private String customText24;

    @JsonIgnore
    @Size(max = 100)
    private String customText25;

    @JsonIgnore
    @Size(max = 100)
    private String customText26;

    @JsonIgnore
    @Size(max = 100)
    private String customText27;

    @JsonIgnore
    @Size(max = 100)
    private String customText28;

    @JsonIgnore
    @Size(max = 100)
    private String customText29;

    @JsonIgnore
    @Size(max = 100)
    private String customText30;

    @JsonIgnore
    @Size(max = 100)
    private String customText31;

    @JsonIgnore
    @Size(max = 100)
    private String customText32;

    @JsonIgnore
    @Size(max = 100)
    private String customText33;

    @JsonIgnore
    @Size(max = 100)
    private String customText34;

    @JsonIgnore
    @Size(max = 100)
    private String customText35;

    @JsonIgnore
    @Size(max = 100)
    private String customText36;

    @JsonIgnore
    @Size(max = 100)
    private String customText37;

    @JsonIgnore
    @Size(max = 100)
    private String customText38;

    @JsonIgnore
    @Size(max = 100)
    private String customText39;

    @JsonIgnore
    @Size(max = 100)
    private String customText40;

    @JsonProperty("customText21")
    public String getCustomText21() {
        return customText21;
    }

    @JsonIgnore
    public void setCustomText21(String customText21) {
        this.customText21 = customText21;
    }

    @JsonProperty("customText22")
    public String getCustomText22() {
        return customText22;
    }

    @JsonIgnore
    public void setCustomText22(String customText22) {
        this.customText22 = customText22;
    }

    @JsonProperty("customText23")
    public String getCustomText23() {
        return customText23;
    }

    @JsonIgnore
    public void setCustomText23(String customText23) {
        this.customText23 = customText23;
    }

    @JsonProperty("customText24")
    public String getCustomText24() {
        return customText24;
    }

    @JsonIgnore
    public void setCustomText24(String customText24) {
        this.customText24 = customText24;
    }

    @JsonProperty("customText25")
    public String getCustomText25() {
        return customText25;
    }

    @JsonIgnore
    public void setCustomText25(String customText25) {
        this.customText25 = customText25;
    }

    @JsonProperty("customText26")
    public String getCustomText26() {
        return customText26;
    }

    @JsonIgnore
    public void setCustomText26(String customText26) {
        this.customText26 = customText26;
    }

    @JsonProperty("customText27")
    public String getCustomText27() {
        return customText27;
    }

    @JsonIgnore
    public void setCustomText27(String customText27) {
        this.customText27 = customText27;
    }

    @JsonProperty("customText28")
    public String getCustomText28() {
        return customText28;
    }

    @JsonIgnore
    public void setCustomText28(String customText28) {
        this.customText28 = customText28;
    }

    @JsonProperty("customText29")
    public String getCustomText29() {
        return customText29;
    }

    @JsonIgnore
    public void setCustomText29(String customText29) {
        this.customText29 = customText29;
    }

    @JsonProperty("customText30")
    public String getCustomText30() {
        return customText30;
    }

    @JsonIgnore
    public void setCustomText30(String customText30) {
        this.customText30 = customText30;
    }

    @JsonProperty("customText31")
    public String getCustomText31() {
        return customText31;
    }

    @JsonIgnore
    public void setCustomText31(String customText31) {
        this.customText31 = customText31;
    }

    @JsonProperty("customText32")
    public String getCustomText32() {
        return customText32;
    }

    @JsonIgnore
    public void setCustomText32(String customText32) {
        this.customText32 = customText32;
    }

    @JsonProperty("customText33")
    public String getCustomText33() {
        return customText33;
    }

    @JsonIgnore
    public void setCustomText33(String customText33) {
        this.customText33 = customText33;
    }

    @JsonProperty("customText34")
    public String getCustomText34() {
        return customText34;
    }

    @JsonIgnore
    public void setCustomText34(String customText34) {
        this.customText34 = customText34;
    }

    @JsonProperty("customText35")
    public String getCustomText35() {
        return customText35;
    }

    @JsonIgnore
    public void setCustomText35(String customText35) {
        this.customText35 = customText35;
    }

    @JsonProperty("customText36")
    public String getCustomText36() {
        return customText36;
    }

    @JsonIgnore
    public void setCustomText36(String customText36) {
        this.customText36 = customText36;
    }

    @JsonProperty("customText37")
    public String getCustomText37() {
        return customText37;
    }

    @JsonIgnore
    public void setCustomText37(String customText37) {
        this.customText37 = customText37;
    }

    @JsonProperty("customText38")
    public String getCustomText38() {
        return customText38;
    }

    @JsonIgnore
    public void setCustomText38(String customText38) {
        this.customText38 = customText38;
    }

    @JsonProperty("customText39")
    public String getCustomText39() {
        return customText39;
    }

    @JsonIgnore
    public void setCustomText39(String customText39) {
        this.customText39 = customText39;
    }

    @JsonProperty("customText40")
    public String getCustomText40() {
        return customText40;
    }

    @JsonIgnore
    public void setCustomText40(String customText40) {
        this.customText40 = customText40;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CustomFieldsF that = (CustomFieldsF) o;
        return Objects.equals(customText21, that.customText21) &&
            Objects.equals(customText22, that.customText22) &&
            Objects.equals(customText23, that.customText23) &&
            Objects.equals(customText24, that.customText24) &&
            Objects.equals(customText25, that.customText25) &&
            Objects.equals(customText26, that.customText26) &&
            Objects.equals(customText27, that.customText27) &&
            Objects.equals(customText28, that.customText28) &&
            Objects.equals(customText29, that.customText29) &&
            Objects.equals(customText30, that.customText30) &&
            Objects.equals(customText31, that.customText31) &&
            Objects.equals(customText32, that.customText32) &&
            Objects.equals(customText33, that.customText33) &&
            Objects.equals(customText34, that.customText34) &&
            Objects.equals(customText35, that.customText35) &&
            Objects.equals(customText36, that.customText36) &&
            Objects.equals(customText37, that.customText37) &&
            Objects.equals(customText38, that.customText38) &&
            Objects.equals(customText39, that.customText39) &&
            Objects.equals(customText40, that.customText40);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), customText21, customText22, customText23, customText24, customText25, customText26, customText27, customText28, customText29, customText30, customText31, customText32, customText33, customText34, customText35, customText36, customText37, customText38, customText39, customText40);
    }

    @Override
    public String toString() {
        return "CustomFieldsF{" +
            "customText21='" + customText21 + '\'' +
            ", customText22='" + customText22 + '\'' +
            ", customText23='" + customText23 + '\'' +
            ", customText24='" + customText24 + '\'' +
            ", customText25='" + customText25 + '\'' +
            ", customText26='" + customText26 + '\'' +
            ", customText27='" + customText27 + '\'' +
            ", customText28='" + customText28 + '\'' +
            ", customText29='" + customText29 + '\'' +
            ", customText30='" + customText30 + '\'' +
            ", customText31='" + customText31 + '\'' +
            ", customText32='" + customText32 + '\'' +
            ", customText33='" + customText33 + '\'' +
            ", customText34='" + customText34 + '\'' +
            ", customText35='" + customText35 + '\'' +
            ", customText36='" + customText36 + '\'' +
            ", customText37='" + customText37 + '\'' +
            ", customText38='" + customText38 + '\'' +
            ", customText39='" + customText39 + '\'' +
            ", customText40='" + customText40 + '\'' +
            '}';
    }
}
