package com.bullhornsdk.data.model.entity.customfields;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;

/**
 * Common custom fields:
 *
 * customDate 4-10
 *
 * customText 6-10
 *
 * customTextBlock 6-10
 *
 */
public class CustomFieldsF extends CustomFieldsD {

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
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((customDate4 == null) ? 0 : customDate4.hashCode());
        result = prime * result + ((customDate5 == null) ? 0 : customDate5.hashCode());
        result = prime * result + ((customDate6 == null) ? 0 : customDate6.hashCode());
        result = prime * result + ((customDate7 == null) ? 0 : customDate7.hashCode());
        result = prime * result + ((customDate8 == null) ? 0 : customDate8.hashCode());
        result = prime * result + ((customDate9 == null) ? 0 : customDate9.hashCode());
        result = prime * result + ((customDate10 == null) ? 0 : customDate10.hashCode());
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
        CustomFieldsF other = (CustomFieldsF) obj;
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
        builder.append("\ncustomDate4=");
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
