package com.bullhornsdk.data.model.entity.customfields;

import java.math.BigDecimal;

import javax.validation.constraints.Size;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Common custom fields:
 *
 * customDate 1-10
 *
 * customText 6-10
 *
 * customTextBlock 1-10
 *
 * @author Anita Wu
 *
 */
public class CustomFieldsE extends BaseCustomFields {

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


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((customDate1 == null) ? 0 : customDate1.hashCode());
        result = prime * result + ((customDate2 == null) ? 0 : customDate2.hashCode());
        result = prime * result + ((customDate3 == null) ? 0 : customDate3.hashCode());
        result = prime * result + ((customDate4 == null) ? 0 : customDate4.hashCode());
        result = prime * result + ((customDate5 == null) ? 0 : customDate5.hashCode());
        result = prime * result + ((customDate6 == null) ? 0 : customDate6.hashCode());
        result = prime * result + ((customDate7 == null) ? 0 : customDate7.hashCode());
        result = prime * result + ((customDate8 == null) ? 0 : customDate8.hashCode());
        result = prime * result + ((customDate9 == null) ? 0 : customDate9.hashCode());
        result = prime * result + ((customDate10 == null) ? 0 : customDate10.hashCode());
        result = prime * result + ((customText6 == null) ? 0 : customText6.hashCode());
        result = prime * result + ((customText7 == null) ? 0 : customText7.hashCode());
        result = prime * result + ((customText8 == null) ? 0 : customText8.hashCode());
        result = prime * result + ((customText9 == null) ? 0 : customText9.hashCode());
        result = prime * result + ((customText10 == null) ? 0 : customText10.hashCode());
        result = prime * result + ((customTextBlock1 == null) ? 0 : customTextBlock1.hashCode());
        result = prime * result + ((customTextBlock2 == null) ? 0 : customTextBlock2.hashCode());
        result = prime * result + ((customTextBlock3 == null) ? 0 : customTextBlock3.hashCode());
        result = prime * result + ((customTextBlock4 == null) ? 0 : customTextBlock4.hashCode());
        result = prime * result + ((customTextBlock5 == null) ? 0 : customTextBlock5.hashCode());
        result = prime * result + ((customTextBlock6 == null) ? 0 : customTextBlock6.hashCode());
        result = prime * result + ((customTextBlock7 == null) ? 0 : customTextBlock7.hashCode());
        result = prime * result + ((customTextBlock8 == null) ? 0 : customTextBlock8.hashCode());
        result = prime * result + ((customTextBlock9 == null) ? 0 : customTextBlock9.hashCode());
        result = prime * result + ((customTextBlock10 == null) ? 0 : customTextBlock10.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        CustomFieldsE other = (CustomFieldsE) obj;
        if (customDate1 == null) {
            if (other.customDate1 != null)
                return false;
        } else if (!customDate1.isEqual(other.customDate1))
            return false;
        if (customDate2 == null) {
            if (other.customDate2 != null)
                return false;
        } else if (!customDate2.isEqual(other.customDate2))
            return false;
        if (customDate3 == null) {
            if (other.customDate3 != null)
                return false;
        } else if (!customDate3.isEqual(other.customDate3))
            return false;
        if (customDate4 == null) {
            if (other.customDate4!= null)
                return false;
        } else if (!customDate4.isEqual(other.customDate4))
            return false;
        if (customDate5 == null) {
            if (other.customDate5 != null)
                return false;
        } else if (!customDate5.isEqual(other.customDate5))
            return false;
        if (customDate6 == null) {
            if (other.customDate6 != null)
                return false;
        } else if (!customDate6.isEqual(other.customDate6))
            return false;
        if (customDate7 == null) {
            if (other.customDate7 != null)
                return false;
        } else if (!customDate7.isEqual(other.customDate7))
            return false;
        if (customDate8 == null) {
            if (other.customDate8!= null)
                return false;
        } else if (!customDate8.isEqual(other.customDate8))
            return false;
        if (customDate9 == null) {
            if (other.customDate9 != null)
                return false;
        } else if (!customDate9.isEqual(other.customDate9))
            return false;
        if (customDate10 == null) {
            if (other.customDate10 != null)
                return false;
        } else if (!customDate10.isEqual(other.customDate10))
            return false;
        if (customText6 == null) {
            if (other.customText6 != null)
                return false;
        } else if (!customText6.equals(other.customText6))
            return false;
        if (customText7 == null) {
            if (other.customText7 != null)
                return false;
        } else if (!customText7.equals(other.customText7))
            return false;
        if (customText8 == null) {
            if (other.customText8 != null)
                return false;
        } else if (!customText8.equals(other.customText8))
            return false;
        if (customText9 == null) {
            if (other.customText9 != null)
                return false;
        } else if (!customText9.equals(other.customText9))
            return false;
        if (customText10 == null) {
            if (other.customText10 != null)
                return false;
        } else if (!customText10.equals(other.customText10))
            return false;
        if (customTextBlock1 == null) {
            if (other.customTextBlock1 != null)
                return false;
        } else if (!customTextBlock1.equals(other.customTextBlock1))
            return false;
        if (customTextBlock2 == null) {
            if (other.customTextBlock2 != null)
                return false;
        } else if (!customTextBlock2.equals(other.customTextBlock2))
            return false;
        if (customTextBlock3 == null) {
            if (other.customTextBlock3 != null)
                return false;
        } else if (!customTextBlock3.equals(other.customTextBlock3))
            return false;
        if (customTextBlock4 == null) {
            if (other.customTextBlock4 != null)
                return false;
        } else if (!customTextBlock4.equals(other.customTextBlock4))
            return false;
        if (customTextBlock5 == null) {
            if (other.customTextBlock5 != null)
                return false;
        } else if (!customTextBlock5.equals(other.customTextBlock5))
            return false;
        if (customTextBlock6 == null) {
            if (other.customTextBlock6 != null)
                return false;
        } else if (!customTextBlock6.equals(other.customTextBlock6))
            return false;
        if (customTextBlock7 == null) {
            if (other.customTextBlock7 != null)
                return false;
        } else if (!customTextBlock7.equals(other.customTextBlock7))
            return false;
        if (customTextBlock8 == null) {
            if (other.customTextBlock8 != null)
                return false;
        } else if (!customTextBlock8.equals(other.customTextBlock8))
            return false;
        if (customTextBlock9 == null) {
            if (other.customTextBlock9 != null)
                return false;
        } else if (!customTextBlock9.equals(other.customTextBlock9))
            return false;
        if (customTextBlock10 == null) {
            if (other.customTextBlock10 != null)
                return false;
        } else if (!customTextBlock10.equals(other.customTextBlock10))
            return false;


        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(", \ncustomDate1=");
        builder.append(customDate1);
        builder.append(", \ncustomDate2=");
        builder.append(customDate2);
        builder.append(", \ncustomDate3=");
        builder.append(customDate3);
        builder.append(", \ncustomDate4=");
        builder.append(customDate4);
        builder.append(", \ncustomDate5=");
        builder.append(customDate5);
        builder.append(", \ncustomDate6=");
        builder.append(customDate6);
        builder.append(", \ncustomDate7=");
        builder.append(customDate7);
        builder.append(", \ncustomDate8=");
        builder.append(customDate8);
        builder.append(", \ncustomDate9=");
        builder.append(customDate9);
        builder.append(", \ncustomDate10=");
        builder.append(customDate10);
        builder.append(", \ncustomText6=");
        builder.append(customText6);
        builder.append(", \ncustomText7=");
        builder.append(customText7);
        builder.append(", \ncustomText8=");
        builder.append(customText8);
        builder.append(", \ncustomText9=");
        builder.append(customText9);
        builder.append(", \ncustomText10=");
        builder.append(customText10);
        builder.append(", \ncustomTextBlock1=");
        builder.append(customTextBlock1);
        builder.append(", \ncustomTextBlock2=");
        builder.append(customTextBlock2);
        builder.append(", \ncustomTextBlock3=");
        builder.append(customTextBlock3);
        builder.append(", \ncustomTextBlock4=");
        builder.append(customTextBlock4);
        builder.append(", \ncustomTextBlock5=");
        builder.append(customTextBlock5);
        builder.append(", \ncustomTextBlock6=");
        builder.append(customTextBlock6);
        builder.append(", \ncustomTextBlock7=");
        builder.append(customTextBlock7);
        builder.append(", \ncustomTextBlock8=");
        builder.append(customTextBlock8);
        builder.append(", \ncustomTextBlock9=");
        builder.append(customTextBlock9);
        builder.append(", \ncustomTextBlock10=");
        builder.append(customTextBlock10);

        return builder.toString();
    }

}
