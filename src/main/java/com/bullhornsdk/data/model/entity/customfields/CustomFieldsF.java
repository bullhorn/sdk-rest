package com.bullhornsdk.data.model.entity.customfields;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomFieldsF extends CustomFieldsB {

    @JsonIgnore
    private String customText21;

    @JsonProperty("customText21")
    public String getCustomText21() {
        return customText21;
    }

    @JsonIgnore
    public void setCustomText21(String customText21) {
        this.customText21 = customText21;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((customText21 == null) ? 0 : customText21.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        CustomFieldsF other = (CustomFieldsF) obj;
        if (customText21 == null) {
            if (other.customText21 != null)
                return false;
        } else if (!customText21.equals(other.customText21))
            return false;

        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(", \ncustomText21=");
        builder.append(customText21);


        return builder.toString();
    }
}
