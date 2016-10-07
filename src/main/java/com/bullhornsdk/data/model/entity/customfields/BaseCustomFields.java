package com.bullhornsdk.data.model.entity.customfields;

import javax.validation.constraints.Size;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Common custom fields:
 *
 * customText 1-5
 * 
 * @author awu
 * 
 */
public class BaseCustomFields extends AbstractEntity {

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customText1 == null) ? 0 : customText1.hashCode());
		result = prime * result + ((customText2 == null) ? 0 : customText2.hashCode());
		result = prime * result + ((customText3 == null) ? 0 : customText3.hashCode());
		result = prime * result + ((customText4 == null) ? 0 : customText4.hashCode());
		result = prime * result + ((customText5 == null) ? 0 : customText5.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseCustomFields other = (BaseCustomFields) obj;
		if (customText1 == null) {
			if (other.customText1 != null)
				return false;
		} else if (!customText1.equals(other.customText1))
			return false;
		if (customText2 == null) {
			if (other.customText2 != null)
				return false;
		} else if (!customText2.equals(other.customText2))
			return false;
		if (customText3 == null) {
			if (other.customText3 != null)
				return false;
		} else if (!customText3.equals(other.customText3))
			return false;
		if (customText4 == null) {
			if (other.customText4 != null)
				return false;
		} else if (!customText4.equals(other.customText4))
			return false;
		if (customText5 == null) {
			if (other.customText5 != null)
				return false;
		} else if (!customText5.equals(other.customText5))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(customText1);
		builder.append(", \ncustomText2=");
		builder.append(customText2);
		builder.append(", \ncustomText3=");
		builder.append(customText3);
		builder.append(", \ncustomText4=");
		builder.append(customText4);
		builder.append(", \ncustomText5=");
		builder.append(customText5);

		return builder.toString();
	}

}
