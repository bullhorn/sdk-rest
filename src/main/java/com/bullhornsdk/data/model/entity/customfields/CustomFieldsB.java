package com.bullhornsdk.data.model.entity.customfields;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Common custom fields: 
 * 
 * customDate 1-3
 * 
 * customFloat 1-3
 * 
 * customInt 1-3
 * 
 * customText 1-20 customTextBlock 1-5
 * 
 * @author magnus.palm
 * 
 */
public class CustomFieldsB extends CustomFieldsA {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((customTextBlock1 == null) ? 0 : customTextBlock1.hashCode());
		result = prime * result + ((customTextBlock2 == null) ? 0 : customTextBlock2.hashCode());
		result = prime * result + ((customTextBlock3 == null) ? 0 : customTextBlock3.hashCode());
		result = prime * result + ((customTextBlock4 == null) ? 0 : customTextBlock4.hashCode());
		result = prime * result + ((customTextBlock5 == null) ? 0 : customTextBlock5.hashCode());
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
		CustomFieldsB other = (CustomFieldsB) obj;
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
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
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

		return builder.toString();
	}

}
