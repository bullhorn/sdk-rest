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
 * customDate 1-3
 * 
 * customFloat 1-3
 * 
 * customInt 1-3
 * 
 * customText 6-20
 * 
 * @author magnus.palm
 * 
 */
public class CustomFieldsA extends BaseCustomFields {

	private DateTime customDate1;

	private DateTime customDate2;

	private DateTime customDate3;

	private BigDecimal customFloat1;

	private BigDecimal customFloat2;

	private BigDecimal customFloat3;

	private Integer customInt1;

	private Integer customInt2;

	private Integer customInt3;

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
	@Size(max = 100)
	private String customText11;

	@JsonIgnore
	@Size(max = 100)
	private String customText12;

	@JsonIgnore
	@Size(max = 100)
	private String customText13;

	@JsonIgnore
	@Size(max = 100)
	private String customText14;

	@JsonIgnore
	@Size(max = 100)
	private String customText15;

	@JsonIgnore
	@Size(max = 100)
	private String customText16;

	@JsonIgnore
	@Size(max = 100)
	private String customText17;

	@JsonIgnore
	@Size(max = 100)
	private String customText18;

	@JsonIgnore
	@Size(max = 100)
	private String customText19;

	@JsonIgnore
	@Size(max = 100)
	private String customText20;

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

	@JsonProperty("customText11")
	public String getCustomText11() {
		return customText11;
	}

	@JsonIgnore
	public void setCustomText11(String customText11) {
		this.customText11 = customText11;
	}

	@JsonProperty("customText12")
	public String getCustomText12() {
		return customText12;
	}

	@JsonIgnore
	public void setCustomText12(String customText12) {
		this.customText12 = customText12;
	}

	@JsonProperty("customText13")
	public String getCustomText13() {
		return customText13;
	}

	@JsonIgnore
	public void setCustomText13(String customText13) {
		this.customText13 = customText13;
	}

	@JsonProperty("customText14")
	public String getCustomText14() {
		return customText14;
	}

	@JsonIgnore
	public void setCustomText14(String customText14) {
		this.customText14 = customText14;
	}

	@JsonProperty("customText15")
	public String getCustomText15() {
		return customText15;
	}

	@JsonIgnore
	public void setCustomText15(String customText15) {
		this.customText15 = customText15;
	}

	@JsonProperty("customText16")
	public String getCustomText16() {
		return customText16;
	}

	@JsonIgnore
	public void setCustomText16(String customText16) {
		this.customText16 = customText16;
	}

	@JsonProperty("customText17")
	public String getCustomText17() {
		return customText17;
	}

	@JsonIgnore
	public void setCustomText17(String customText17) {
		this.customText17 = customText17;
	}

	@JsonProperty("customText18")
	public String getCustomText18() {
		return customText18;
	}

	@JsonIgnore
	public void setCustomText18(String customText18) {
		this.customText18 = customText18;
	}

	@JsonProperty("customText19")
	public String getCustomText19() {
		return customText19;
	}

	@JsonIgnore
	public void setCustomText19(String customText19) {
		this.customText19 = customText19;
	}

	@JsonProperty("customText20")
	public String getCustomText20() {
		return customText20;
	}

	@JsonIgnore
	public void setCustomText20(String customText20) {
		this.customText20 = customText20;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((customDate1 == null) ? 0 : customDate1.hashCode());
		result = prime * result + ((customDate2 == null) ? 0 : customDate2.hashCode());
		result = prime * result + ((customDate3 == null) ? 0 : customDate3.hashCode());
		result = prime * result + ((customFloat1 == null) ? 0 : customFloat1.hashCode());
		result = prime * result + ((customFloat2 == null) ? 0 : customFloat2.hashCode());
		result = prime * result + ((customFloat3 == null) ? 0 : customFloat3.hashCode());
		result = prime * result + ((customInt1 == null) ? 0 : customInt1.hashCode());
		result = prime * result + ((customInt2 == null) ? 0 : customInt2.hashCode());
		result = prime * result + ((customInt3 == null) ? 0 : customInt3.hashCode());
		result = prime * result + ((customText10 == null) ? 0 : customText10.hashCode());
		result = prime * result + ((customText11 == null) ? 0 : customText11.hashCode());
		result = prime * result + ((customText12 == null) ? 0 : customText12.hashCode());
		result = prime * result + ((customText13 == null) ? 0 : customText13.hashCode());
		result = prime * result + ((customText14 == null) ? 0 : customText14.hashCode());
		result = prime * result + ((customText15 == null) ? 0 : customText15.hashCode());
		result = prime * result + ((customText16 == null) ? 0 : customText16.hashCode());
		result = prime * result + ((customText17 == null) ? 0 : customText17.hashCode());
		result = prime * result + ((customText18 == null) ? 0 : customText18.hashCode());
		result = prime * result + ((customText19 == null) ? 0 : customText19.hashCode());
		result = prime * result + ((customText20 == null) ? 0 : customText20.hashCode());
		result = prime * result + ((customText6 == null) ? 0 : customText6.hashCode());
		result = prime * result + ((customText7 == null) ? 0 : customText7.hashCode());
		result = prime * result + ((customText8 == null) ? 0 : customText8.hashCode());
		result = prime * result + ((customText9 == null) ? 0 : customText9.hashCode());
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
		CustomFieldsA other = (CustomFieldsA) obj;
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
		if (customFloat1 == null) {
			if (other.customFloat1 != null)
				return false;
		} else if (!customFloat1.equals(other.customFloat1))
			return false;
		if (customFloat2 == null) {
			if (other.customFloat2 != null)
				return false;
		} else if (!customFloat2.equals(other.customFloat2))
			return false;
		if (customFloat3 == null) {
			if (other.customFloat3 != null)
				return false;
		} else if (!customFloat3.equals(other.customFloat3))
			return false;
		if (customInt1 == null) {
			if (other.customInt1 != null)
				return false;
		} else if (!customInt1.equals(other.customInt1))
			return false;
		if (customInt2 == null) {
			if (other.customInt2 != null)
				return false;
		} else if (!customInt2.equals(other.customInt2))
			return false;
		if (customInt3 == null) {
			if (other.customInt3 != null)
				return false;
		} else if (!customInt3.equals(other.customInt3))
			return false;
		if (customText10 == null) {
			if (other.customText10 != null)
				return false;
		} else if (!customText10.equals(other.customText10))
			return false;
		if (customText11 == null) {
			if (other.customText11 != null)
				return false;
		} else if (!customText11.equals(other.customText11))
			return false;
		if (customText12 == null) {
			if (other.customText12 != null)
				return false;
		} else if (!customText12.equals(other.customText12))
			return false;
		if (customText13 == null) {
			if (other.customText13 != null)
				return false;
		} else if (!customText13.equals(other.customText13))
			return false;
		if (customText14 == null) {
			if (other.customText14 != null)
				return false;
		} else if (!customText14.equals(other.customText14))
			return false;
		if (customText15 == null) {
			if (other.customText15 != null)
				return false;
		} else if (!customText15.equals(other.customText15))
			return false;
		if (customText16 == null) {
			if (other.customText16 != null)
				return false;
		} else if (!customText16.equals(other.customText16))
			return false;
		if (customText17 == null) {
			if (other.customText17 != null)
				return false;
		} else if (!customText17.equals(other.customText17))
			return false;
		if (customText18 == null) {
			if (other.customText18 != null)
				return false;
		} else if (!customText18.equals(other.customText18))
			return false;
		if (customText19 == null) {
			if (other.customText19 != null)
				return false;
		} else if (!customText19.equals(other.customText19))
			return false;
		if (customText20 == null) {
			if (other.customText20 != null)
				return false;
		} else if (!customText20.equals(other.customText20))
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
		builder.append(", \ncustomFloat1=");
		builder.append(customFloat1);
		builder.append(", \ncustomFloat2=");
		builder.append(customFloat2);
		builder.append(", \ncustomFloat3=");
		builder.append(customFloat3);
		builder.append(", \ncustomInt1=");
		builder.append(customInt1);
		builder.append(", \ncustomInt2=");
		builder.append(customInt2);
		builder.append(", \ncustomInt3=");
		builder.append(customInt3);
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
		builder.append(", \ncustomText11=");
		builder.append(customText11);
		builder.append(", \ncustomText12=");
		builder.append(customText12);
		builder.append(", \ncustomText13=");
		builder.append(customText13);
		builder.append(", \ncustomText14=");
		builder.append(customText14);
		builder.append(", \ncustomText15=");
		builder.append(customText15);
		builder.append(", \ncustomText16=");
		builder.append(customText16);
		builder.append(", \ncustomText17=");
		builder.append(customText17);
		builder.append(", \ncustomText18=");
		builder.append(customText18);
		builder.append(", \ncustomText19=");
		builder.append(customText19);
		builder.append(", \ncustomText20=");
		builder.append(customText20);

		return builder.toString();
	}

}
