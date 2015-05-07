package com.bullhornsdk.data.model.entity.customfields;

import java.math.BigDecimal;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Common custom fields for Placement and PlacementChangeRequest:
 * 
 * customDate 1-3
 * 
 * customFloat 1-3
 * 
 * customInt 1-3
 * 
 * customText 1-40
 * 
 * customTextBlock 1-5
 * 
 * correlatedCustomDate 1-3
 * 
 * correlatedCustomFloat 1-3
 * 
 * correlatedCustomInt 1-3
 * 
 * correlatedCustomText 1-10
 * 
 * correlatedCustomTextBlock 1-3
 * 
 * customBillRate 1-10
 * 
 * customPayRate 1-10
 * 
 * @author magnus.palm
 * 
 */
public class CustomFieldsD extends CustomFieldsC {

	private BigDecimal customBillRate1;

	private BigDecimal customBillRate10;

	private BigDecimal customBillRate2;

	private BigDecimal customBillRate3;

	private BigDecimal customBillRate4;

	private BigDecimal customBillRate5;

	private BigDecimal customBillRate6;

	private BigDecimal customBillRate7;

	private BigDecimal customBillRate8;

	private BigDecimal customBillRate9;

	private BigDecimal customPayRate1;

	private BigDecimal customPayRate10;

	private BigDecimal customPayRate2;

	private BigDecimal customPayRate3;

	private BigDecimal customPayRate4;

	private BigDecimal customPayRate5;

	private BigDecimal customPayRate6;

	private BigDecimal customPayRate7;

	private BigDecimal customPayRate8;

	private BigDecimal customPayRate9;

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

	@JsonProperty("customBillRate1")
	public BigDecimal getCustomBillRate1() {
		return customBillRate1;
	}

	@JsonProperty("customBillRate1")
	public void setCustomBillRate1(BigDecimal customBillRate1) {
		this.customBillRate1 = customBillRate1;
	}

	@JsonProperty("customBillRate10")
	public BigDecimal getCustomBillRate10() {
		return customBillRate10;
	}

	@JsonProperty("customBillRate10")
	public void setCustomBillRate10(BigDecimal customBillRate10) {
		this.customBillRate10 = customBillRate10;
	}

	@JsonProperty("customBillRate2")
	public BigDecimal getCustomBillRate2() {
		return customBillRate2;
	}

	@JsonProperty("customBillRate2")
	public void setCustomBillRate2(BigDecimal customBillRate2) {
		this.customBillRate2 = customBillRate2;
	}

	@JsonProperty("customBillRate3")
	public BigDecimal getCustomBillRate3() {
		return customBillRate3;
	}

	@JsonProperty("customBillRate3")
	public void setCustomBillRate3(BigDecimal customBillRate3) {
		this.customBillRate3 = customBillRate3;
	}

	@JsonProperty("customBillRate4")
	public BigDecimal getCustomBillRate4() {
		return customBillRate4;
	}

	@JsonProperty("customBillRate4")
	public void setCustomBillRate4(BigDecimal customBillRate4) {
		this.customBillRate4 = customBillRate4;
	}

	@JsonProperty("customBillRate5")
	public BigDecimal getCustomBillRate5() {
		return customBillRate5;
	}

	@JsonProperty("customBillRate5")
	public void setCustomBillRate5(BigDecimal customBillRate5) {
		this.customBillRate5 = customBillRate5;
	}

	@JsonProperty("customBillRate6")
	public BigDecimal getCustomBillRate6() {
		return customBillRate6;
	}

	@JsonProperty("customBillRate6")
	public void setCustomBillRate6(BigDecimal customBillRate6) {
		this.customBillRate6 = customBillRate6;
	}

	@JsonProperty("customBillRate7")
	public BigDecimal getCustomBillRate7() {
		return customBillRate7;
	}

	@JsonProperty("customBillRate7")
	public void setCustomBillRate7(BigDecimal customBillRate7) {
		this.customBillRate7 = customBillRate7;
	}

	@JsonProperty("customBillRate8")
	public BigDecimal getCustomBillRate8() {
		return customBillRate8;
	}

	@JsonProperty("customBillRate8")
	public void setCustomBillRate8(BigDecimal customBillRate8) {
		this.customBillRate8 = customBillRate8;
	}

	@JsonProperty("customBillRate9")
	public BigDecimal getCustomBillRate9() {
		return customBillRate9;
	}

	@JsonProperty("customBillRate9")
	public void setCustomBillRate9(BigDecimal customBillRate9) {
		this.customBillRate9 = customBillRate9;
	}

	@JsonProperty("customPayRate1")
	public BigDecimal getCustomPayRate1() {
		return customPayRate1;
	}

	@JsonProperty("customPayRate1")
	public void setCustomPayRate1(BigDecimal customPayRate1) {
		this.customPayRate1 = customPayRate1;
	}

	@JsonProperty("customPayRate10")
	public BigDecimal getCustomPayRate10() {
		return customPayRate10;
	}

	@JsonProperty("customPayRate10")
	public void setCustomPayRate10(BigDecimal customPayRate10) {
		this.customPayRate10 = customPayRate10;
	}

	@JsonProperty("customPayRate2")
	public BigDecimal getCustomPayRate2() {
		return customPayRate2;
	}

	@JsonProperty("customPayRate2")
	public void setCustomPayRate2(BigDecimal customPayRate2) {
		this.customPayRate2 = customPayRate2;
	}

	@JsonProperty("customPayRate3")
	public BigDecimal getCustomPayRate3() {
		return customPayRate3;
	}

	@JsonProperty("customPayRate3")
	public void setCustomPayRate3(BigDecimal customPayRate3) {
		this.customPayRate3 = customPayRate3;
	}

	@JsonProperty("customPayRate4")
	public BigDecimal getCustomPayRate4() {
		return customPayRate4;
	}

	@JsonProperty("customPayRate4")
	public void setCustomPayRate4(BigDecimal customPayRate4) {
		this.customPayRate4 = customPayRate4;
	}

	@JsonProperty("customPayRate5")
	public BigDecimal getCustomPayRate5() {
		return customPayRate5;
	}

	@JsonProperty("customPayRate5")
	public void setCustomPayRate5(BigDecimal customPayRate5) {
		this.customPayRate5 = customPayRate5;
	}

	@JsonProperty("customPayRate6")
	public BigDecimal getCustomPayRate6() {
		return customPayRate6;
	}

	@JsonProperty("customPayRate6")
	public void setCustomPayRate6(BigDecimal customPayRate6) {
		this.customPayRate6 = customPayRate6;
	}

	@JsonProperty("customPayRate7")
	public BigDecimal getCustomPayRate7() {
		return customPayRate7;
	}

	@JsonProperty("customPayRate7")
	public void setCustomPayRate7(BigDecimal customPayRate7) {
		this.customPayRate7 = customPayRate7;
	}

	@JsonProperty("customPayRate8")
	public BigDecimal getCustomPayRate8() {
		return customPayRate8;
	}

	@JsonProperty("customPayRate8")
	public void setCustomPayRate8(BigDecimal customPayRate8) {
		this.customPayRate8 = customPayRate8;
	}

	@JsonProperty("customPayRate9")
	public BigDecimal getCustomPayRate9() {
		return customPayRate9;
	}

	@JsonProperty("customPayRate9")
	public void setCustomPayRate9(BigDecimal customPayRate9) {
		this.customPayRate9 = customPayRate9;
	}

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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((customBillRate1 == null) ? 0 : customBillRate1.hashCode());
		result = prime * result + ((customBillRate10 == null) ? 0 : customBillRate10.hashCode());
		result = prime * result + ((customBillRate2 == null) ? 0 : customBillRate2.hashCode());
		result = prime * result + ((customBillRate3 == null) ? 0 : customBillRate3.hashCode());
		result = prime * result + ((customBillRate4 == null) ? 0 : customBillRate4.hashCode());
		result = prime * result + ((customBillRate5 == null) ? 0 : customBillRate5.hashCode());
		result = prime * result + ((customBillRate6 == null) ? 0 : customBillRate6.hashCode());
		result = prime * result + ((customBillRate7 == null) ? 0 : customBillRate7.hashCode());
		result = prime * result + ((customBillRate8 == null) ? 0 : customBillRate8.hashCode());
		result = prime * result + ((customBillRate9 == null) ? 0 : customBillRate9.hashCode());
		result = prime * result + ((customPayRate1 == null) ? 0 : customPayRate1.hashCode());
		result = prime * result + ((customPayRate10 == null) ? 0 : customPayRate10.hashCode());
		result = prime * result + ((customPayRate2 == null) ? 0 : customPayRate2.hashCode());
		result = prime * result + ((customPayRate3 == null) ? 0 : customPayRate3.hashCode());
		result = prime * result + ((customPayRate4 == null) ? 0 : customPayRate4.hashCode());
		result = prime * result + ((customPayRate5 == null) ? 0 : customPayRate5.hashCode());
		result = prime * result + ((customPayRate6 == null) ? 0 : customPayRate6.hashCode());
		result = prime * result + ((customPayRate7 == null) ? 0 : customPayRate7.hashCode());
		result = prime * result + ((customPayRate8 == null) ? 0 : customPayRate8.hashCode());
		result = prime * result + ((customPayRate9 == null) ? 0 : customPayRate9.hashCode());
		result = prime * result + ((customText21 == null) ? 0 : customText21.hashCode());
		result = prime * result + ((customText22 == null) ? 0 : customText22.hashCode());
		result = prime * result + ((customText23 == null) ? 0 : customText23.hashCode());
		result = prime * result + ((customText24 == null) ? 0 : customText24.hashCode());
		result = prime * result + ((customText25 == null) ? 0 : customText25.hashCode());
		result = prime * result + ((customText26 == null) ? 0 : customText26.hashCode());
		result = prime * result + ((customText27 == null) ? 0 : customText27.hashCode());
		result = prime * result + ((customText28 == null) ? 0 : customText28.hashCode());
		result = prime * result + ((customText29 == null) ? 0 : customText29.hashCode());
		result = prime * result + ((customText30 == null) ? 0 : customText30.hashCode());
		result = prime * result + ((customText31 == null) ? 0 : customText31.hashCode());
		result = prime * result + ((customText32 == null) ? 0 : customText32.hashCode());
		result = prime * result + ((customText33 == null) ? 0 : customText33.hashCode());
		result = prime * result + ((customText34 == null) ? 0 : customText34.hashCode());
		result = prime * result + ((customText35 == null) ? 0 : customText35.hashCode());
		result = prime * result + ((customText36 == null) ? 0 : customText36.hashCode());
		result = prime * result + ((customText37 == null) ? 0 : customText37.hashCode());
		result = prime * result + ((customText38 == null) ? 0 : customText38.hashCode());
		result = prime * result + ((customText39 == null) ? 0 : customText39.hashCode());
		result = prime * result + ((customText40 == null) ? 0 : customText40.hashCode());
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
		CustomFieldsD other = (CustomFieldsD) obj;
		if (customBillRate1 == null) {
			if (other.customBillRate1 != null)
				return false;
		} else if (!customBillRate1.equals(other.customBillRate1))
			return false;
		if (customBillRate10 == null) {
			if (other.customBillRate10 != null)
				return false;
		} else if (!customBillRate10.equals(other.customBillRate10))
			return false;
		if (customBillRate2 == null) {
			if (other.customBillRate2 != null)
				return false;
		} else if (!customBillRate2.equals(other.customBillRate2))
			return false;
		if (customBillRate3 == null) {
			if (other.customBillRate3 != null)
				return false;
		} else if (!customBillRate3.equals(other.customBillRate3))
			return false;
		if (customBillRate4 == null) {
			if (other.customBillRate4 != null)
				return false;
		} else if (!customBillRate4.equals(other.customBillRate4))
			return false;
		if (customBillRate5 == null) {
			if (other.customBillRate5 != null)
				return false;
		} else if (!customBillRate5.equals(other.customBillRate5))
			return false;
		if (customBillRate6 == null) {
			if (other.customBillRate6 != null)
				return false;
		} else if (!customBillRate6.equals(other.customBillRate6))
			return false;
		if (customBillRate7 == null) {
			if (other.customBillRate7 != null)
				return false;
		} else if (!customBillRate7.equals(other.customBillRate7))
			return false;
		if (customBillRate8 == null) {
			if (other.customBillRate8 != null)
				return false;
		} else if (!customBillRate8.equals(other.customBillRate8))
			return false;
		if (customBillRate9 == null) {
			if (other.customBillRate9 != null)
				return false;
		} else if (!customBillRate9.equals(other.customBillRate9))
			return false;
		if (customPayRate1 == null) {
			if (other.customPayRate1 != null)
				return false;
		} else if (!customPayRate1.equals(other.customPayRate1))
			return false;
		if (customPayRate10 == null) {
			if (other.customPayRate10 != null)
				return false;
		} else if (!customPayRate10.equals(other.customPayRate10))
			return false;
		if (customPayRate2 == null) {
			if (other.customPayRate2 != null)
				return false;
		} else if (!customPayRate2.equals(other.customPayRate2))
			return false;
		if (customPayRate3 == null) {
			if (other.customPayRate3 != null)
				return false;
		} else if (!customPayRate3.equals(other.customPayRate3))
			return false;
		if (customPayRate4 == null) {
			if (other.customPayRate4 != null)
				return false;
		} else if (!customPayRate4.equals(other.customPayRate4))
			return false;
		if (customPayRate5 == null) {
			if (other.customPayRate5 != null)
				return false;
		} else if (!customPayRate5.equals(other.customPayRate5))
			return false;
		if (customPayRate6 == null) {
			if (other.customPayRate6 != null)
				return false;
		} else if (!customPayRate6.equals(other.customPayRate6))
			return false;
		if (customPayRate7 == null) {
			if (other.customPayRate7 != null)
				return false;
		} else if (!customPayRate7.equals(other.customPayRate7))
			return false;
		if (customPayRate8 == null) {
			if (other.customPayRate8 != null)
				return false;
		} else if (!customPayRate8.equals(other.customPayRate8))
			return false;
		if (customPayRate9 == null) {
			if (other.customPayRate9 != null)
				return false;
		} else if (!customPayRate9.equals(other.customPayRate9))
			return false;
		if (customText21 == null) {
			if (other.customText21 != null)
				return false;
		} else if (!customText21.equals(other.customText21))
			return false;
		if (customText22 == null) {
			if (other.customText22 != null)
				return false;
		} else if (!customText22.equals(other.customText22))
			return false;
		if (customText23 == null) {
			if (other.customText23 != null)
				return false;
		} else if (!customText23.equals(other.customText23))
			return false;
		if (customText24 == null) {
			if (other.customText24 != null)
				return false;
		} else if (!customText24.equals(other.customText24))
			return false;
		if (customText25 == null) {
			if (other.customText25 != null)
				return false;
		} else if (!customText25.equals(other.customText25))
			return false;
		if (customText26 == null) {
			if (other.customText26 != null)
				return false;
		} else if (!customText26.equals(other.customText26))
			return false;
		if (customText27 == null) {
			if (other.customText27 != null)
				return false;
		} else if (!customText27.equals(other.customText27))
			return false;
		if (customText28 == null) {
			if (other.customText28 != null)
				return false;
		} else if (!customText28.equals(other.customText28))
			return false;
		if (customText29 == null) {
			if (other.customText29 != null)
				return false;
		} else if (!customText29.equals(other.customText29))
			return false;
		if (customText30 == null) {
			if (other.customText30 != null)
				return false;
		} else if (!customText30.equals(other.customText30))
			return false;
		if (customText31 == null) {
			if (other.customText31 != null)
				return false;
		} else if (!customText31.equals(other.customText31))
			return false;
		if (customText32 == null) {
			if (other.customText32 != null)
				return false;
		} else if (!customText32.equals(other.customText32))
			return false;
		if (customText33 == null) {
			if (other.customText33 != null)
				return false;
		} else if (!customText33.equals(other.customText33))
			return false;
		if (customText34 == null) {
			if (other.customText34 != null)
				return false;
		} else if (!customText34.equals(other.customText34))
			return false;
		if (customText35 == null) {
			if (other.customText35 != null)
				return false;
		} else if (!customText35.equals(other.customText35))
			return false;
		if (customText36 == null) {
			if (other.customText36 != null)
				return false;
		} else if (!customText36.equals(other.customText36))
			return false;
		if (customText37 == null) {
			if (other.customText37 != null)
				return false;
		} else if (!customText37.equals(other.customText37))
			return false;
		if (customText38 == null) {
			if (other.customText38 != null)
				return false;
		} else if (!customText38.equals(other.customText38))
			return false;
		if (customText39 == null) {
			if (other.customText39 != null)
				return false;
		} else if (!customText39.equals(other.customText39))
			return false;
		if (customText40 == null) {
			if (other.customText40 != null)
				return false;
		} else if (!customText40.equals(other.customText40))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(", \ncustomText21=");
		builder.append(customText21);
		builder.append(", \ncustomText22=");
		builder.append(customText22);
		builder.append(", \ncustomText23=");
		builder.append(customText23);
		builder.append(", \ncustomText24=");
		builder.append(customText24);
		builder.append(", \ncustomText25=");
		builder.append(customText25);
		builder.append(", \ncustomText26=");
		builder.append(customText26);
		builder.append(", \ncustomText27=");
		builder.append(customText27);
		builder.append(", \ncustomText28=");
		builder.append(customText28);
		builder.append(", \ncustomText29=");
		builder.append(customText29);
		builder.append(", \ncustomText30=");
		builder.append(customText30);
		builder.append(", \ncustomText31=");
		builder.append(customText31);
		builder.append(", \ncustomText32=");
		builder.append(customText32);
		builder.append(", \ncustomText33=");
		builder.append(customText33);
		builder.append(", \ncustomText34=");
		builder.append(customText34);
		builder.append(", \ncustomText35=");
		builder.append(customText35);
		builder.append(", \ncustomText36=");
		builder.append(customText36);
		builder.append(", \ncustomText37=");
		builder.append(customText37);
		builder.append(", \ncustomText38=");
		builder.append(customText38);
		builder.append(", \ncustomText39=");
		builder.append(customText39);
		builder.append(", \ncustomText40=");
		builder.append(customText40);
		return builder.toString();
	}

}
