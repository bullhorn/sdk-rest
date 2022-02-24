package com.bullhornsdk.data.model.entity.customfields;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Common custom fields:
 *
 * customDate 1-5 (extends 1-3)
 *
 * customInt 1-5 (extends 1-3)
 *
 * customMoney 1-5
 *
 * customText 1-10 (extends 1-5)
 *
 * @author dhuber
 *
 */
public class CustomFieldsH extends BaseCustomFields {

    private DateTime customDate1;

    private DateTime customDate2;

    private DateTime customDate3;

    private DateTime customDate4;

    private DateTime customDate5;

    private Integer customInt1;

    private Integer customInt2;

    private Integer customInt3;

    private Integer customInt4;

    private Integer customInt5;

    private BigDecimal customMoney1;

    private BigDecimal customMoney2;

    private BigDecimal customMoney3;

    private BigDecimal customMoney4;

    private BigDecimal customMoney5;

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

    @JsonProperty("customMoney1")
    public BigDecimal getCustomMoney1() {
        return customMoney1;
    }

    @JsonProperty("customMoney1")
    public void setCustomMoney1(BigDecimal customMoney1) {
        this.customMoney1 = customMoney1;
    }

    @JsonProperty("customMoney2")
    public BigDecimal getCustomMoney2() {
        return customMoney2;
    }

    @JsonProperty("customMoney2")
    public void setCustomMoney2(BigDecimal customMoney2) {
        this.customMoney2 = customMoney2;
    }

    @JsonProperty("customMoney3")
    public BigDecimal getCustomMoney3() {
        return customMoney3;
    }

    @JsonProperty("customMoney3")
    public void setCustomMoney3(BigDecimal customMoney3) {
        this.customMoney3 = customMoney3;
    }

    @JsonProperty("customMoney4")
    public BigDecimal getCustomMoney4() {
        return customMoney4;
    }

    @JsonProperty("customMoney4")
    public void setCustomMoney4(BigDecimal customMoney4) {
        this.customMoney4 = customMoney4;
    }

    @JsonProperty("customMoney5")
    public BigDecimal getCustomMoney5() {
        return customMoney5;
    }

    @JsonProperty("customMoney5")
    public void setCustomMoney5(BigDecimal customMoney5) {
        this.customMoney5 = customMoney5;
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


}
