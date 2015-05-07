package com.bullhornsdk.data.model.entity.customfields;

import java.math.BigDecimal;

import javax.validation.constraints.Size;

import org.joda.time.DateTime;

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
 * customText 1-20
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
 * @author magnus.palm
 * 
 */
public class CustomFieldsC extends CustomFieldsB {

	private DateTime correlatedCustomDate1;

	private DateTime correlatedCustomDate2;

	private DateTime correlatedCustomDate3;

	private BigDecimal correlatedCustomFloat1;

	private BigDecimal correlatedCustomFloat2;

	private BigDecimal correlatedCustomFloat3;

	private Integer correlatedCustomInt1;

	private Integer correlatedCustomInt2;

	private Integer correlatedCustomInt3;

	@JsonIgnore
	@Size(max = 100)
	private String correlatedCustomText1;

	@JsonIgnore
	@Size(max = 100)
	private String correlatedCustomText2;

	@JsonIgnore
	@Size(max = 100)
	private String correlatedCustomText3;

	@JsonIgnore
	@Size(max = 100)
	private String correlatedCustomText4;

	@JsonIgnore
	@Size(max = 100)
	private String correlatedCustomText5;

	@JsonIgnore
	@Size(max = 100)
	private String correlatedCustomText6;

	@JsonIgnore
	@Size(max = 100)
	private String correlatedCustomText7;

	@JsonIgnore
	@Size(max = 100)
	private String correlatedCustomText8;

	@JsonIgnore
	@Size(max = 100)
	private String correlatedCustomText9;

	@JsonIgnore
	@Size(max = 100)
	private String correlatedCustomText10;

	@JsonIgnore
	private String correlatedCustomTextBlock1;

	@JsonIgnore
	private String correlatedCustomTextBlock2;

	@JsonIgnore
	private String correlatedCustomTextBlock3;

	@JsonProperty("correlatedCustomDate1")
	public DateTime getCorrelatedCustomDate1() {
		return correlatedCustomDate1;
	}

	@JsonProperty("correlatedCustomDate1")
	public void setCorrelatedCustomDate1(DateTime correlatedCustomDate1) {
		this.correlatedCustomDate1 = correlatedCustomDate1;
	}

	@JsonProperty("correlatedCustomDate2")
	public DateTime getCorrelatedCustomDate2() {
		return correlatedCustomDate2;
	}

	@JsonProperty("correlatedCustomDate2")
	public void setCorrelatedCustomDate2(DateTime correlatedCustomDate2) {
		this.correlatedCustomDate2 = correlatedCustomDate2;
	}

	@JsonProperty("correlatedCustomDate3")
	public DateTime getCorrelatedCustomDate3() {
		return correlatedCustomDate3;
	}

	@JsonProperty("correlatedCustomDate3")
	public void setCorrelatedCustomDate3(DateTime correlatedCustomDate3) {
		this.correlatedCustomDate3 = correlatedCustomDate3;
	}

	@JsonProperty("correlatedCustomFloat1")
	public BigDecimal getCorrelatedCustomFloat1() {
		return correlatedCustomFloat1;
	}

	@JsonProperty("correlatedCustomFloat1")
	public void setCorrelatedCustomFloat1(BigDecimal correlatedCustomFloat1) {
		this.correlatedCustomFloat1 = correlatedCustomFloat1;
	}

	@JsonProperty("correlatedCustomFloat2")
	public BigDecimal getCorrelatedCustomFloat2() {
		return correlatedCustomFloat2;
	}

	@JsonProperty("correlatedCustomFloat2")
	public void setCorrelatedCustomFloat2(BigDecimal correlatedCustomFloat2) {
		this.correlatedCustomFloat2 = correlatedCustomFloat2;
	}

	@JsonProperty("correlatedCustomFloat3")
	public BigDecimal getCorrelatedCustomFloat3() {
		return correlatedCustomFloat3;
	}

	@JsonProperty("correlatedCustomFloat3")
	public void setCorrelatedCustomFloat3(BigDecimal correlatedCustomFloat3) {
		this.correlatedCustomFloat3 = correlatedCustomFloat3;
	}

	@JsonProperty("correlatedCustomInt1")
	public Integer getCorrelatedCustomInt1() {
		return correlatedCustomInt1;
	}

	@JsonProperty("correlatedCustomInt1")
	public void setCorrelatedCustomInt1(Integer correlatedCustomInt1) {
		this.correlatedCustomInt1 = correlatedCustomInt1;
	}

	@JsonProperty("correlatedCustomInt2")
	public Integer getCorrelatedCustomInt2() {
		return correlatedCustomInt2;
	}

	@JsonProperty("correlatedCustomInt2")
	public void setCorrelatedCustomInt2(Integer correlatedCustomInt2) {
		this.correlatedCustomInt2 = correlatedCustomInt2;
	}

	@JsonProperty("correlatedCustomInt3")
	public Integer getCorrelatedCustomInt3() {
		return correlatedCustomInt3;
	}

	@JsonProperty("correlatedCustomInt3")
	public void setCorrelatedCustomInt3(Integer correlatedCustomInt3) {
		this.correlatedCustomInt3 = correlatedCustomInt3;
	}

	@JsonProperty("correlatedCustomText1")
	public String getCorrelatedCustomText1() {
		return correlatedCustomText1;
	}

	@JsonIgnore
	public void setCorrelatedCustomText1(String correlatedCustomText1) {
		this.correlatedCustomText1 = correlatedCustomText1;
	}

	@JsonProperty("correlatedCustomText10")
	public String getCorrelatedCustomText10() {
		return correlatedCustomText10;
	}

	@JsonIgnore
	public void setCorrelatedCustomText10(String correlatedCustomText10) {
		this.correlatedCustomText10 = correlatedCustomText10;
	}

	@JsonProperty("correlatedCustomText2")
	public String getCorrelatedCustomText2() {
		return correlatedCustomText2;
	}

	@JsonIgnore
	public void setCorrelatedCustomText2(String correlatedCustomText2) {
		this.correlatedCustomText2 = correlatedCustomText2;
	}

	@JsonProperty("correlatedCustomText3")
	public String getCorrelatedCustomText3() {
		return correlatedCustomText3;
	}

	@JsonIgnore
	public void setCorrelatedCustomText3(String correlatedCustomText3) {
		this.correlatedCustomText3 = correlatedCustomText3;
	}

	@JsonProperty("correlatedCustomText4")
	public String getCorrelatedCustomText4() {
		return correlatedCustomText4;
	}

	@JsonIgnore
	public void setCorrelatedCustomText4(String correlatedCustomText4) {
		this.correlatedCustomText4 = correlatedCustomText4;
	}

	@JsonProperty("correlatedCustomText5")
	public String getCorrelatedCustomText5() {
		return correlatedCustomText5;
	}

	@JsonIgnore
	public void setCorrelatedCustomText5(String correlatedCustomText5) {
		this.correlatedCustomText5 = correlatedCustomText5;
	}

	@JsonProperty("correlatedCustomText6")
	public String getCorrelatedCustomText6() {
		return correlatedCustomText6;
	}

	@JsonIgnore
	public void setCorrelatedCustomText6(String correlatedCustomText6) {
		this.correlatedCustomText6 = correlatedCustomText6;
	}

	@JsonProperty("correlatedCustomText7")
	public String getCorrelatedCustomText7() {
		return correlatedCustomText7;
	}

	@JsonIgnore
	public void setCorrelatedCustomText7(String correlatedCustomText7) {
		this.correlatedCustomText7 = correlatedCustomText7;
	}

	@JsonProperty("correlatedCustomText8")
	public String getCorrelatedCustomText8() {
		return correlatedCustomText8;
	}

	@JsonIgnore
	public void setCorrelatedCustomText8(String correlatedCustomText8) {
		this.correlatedCustomText8 = correlatedCustomText8;
	}

	@JsonProperty("correlatedCustomText9")
	public String getCorrelatedCustomText9() {
		return correlatedCustomText9;
	}

	@JsonIgnore
	public void setCorrelatedCustomText9(String correlatedCustomText9) {
		this.correlatedCustomText9 = correlatedCustomText9;
	}

	@JsonProperty("correlatedCustomTextBlock1")
	public String getCorrelatedCustomTextBlock1() {
		return correlatedCustomTextBlock1;
	}

	@JsonIgnore
	public void setCorrelatedCustomTextBlock1(String correlatedCustomTextBlock1) {
		this.correlatedCustomTextBlock1 = correlatedCustomTextBlock1;
	}

	@JsonProperty("correlatedCustomTextBlock2")
	public String getCorrelatedCustomTextBlock2() {
		return correlatedCustomTextBlock2;
	}

	@JsonIgnore
	public void setCorrelatedCustomTextBlock2(String correlatedCustomTextBlock2) {
		this.correlatedCustomTextBlock2 = correlatedCustomTextBlock2;
	}

	@JsonProperty("correlatedCustomTextBlock3")
	public String getCorrelatedCustomTextBlock3() {
		return correlatedCustomTextBlock3;
	}

	@JsonIgnore
	public void setCorrelatedCustomTextBlock3(String correlatedCustomTextBlock3) {
		this.correlatedCustomTextBlock3 = correlatedCustomTextBlock3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((correlatedCustomDate1 == null) ? 0 : correlatedCustomDate1.hashCode());
		result = prime * result + ((correlatedCustomDate2 == null) ? 0 : correlatedCustomDate2.hashCode());
		result = prime * result + ((correlatedCustomDate3 == null) ? 0 : correlatedCustomDate3.hashCode());
		result = prime * result + ((correlatedCustomFloat1 == null) ? 0 : correlatedCustomFloat1.hashCode());
		result = prime * result + ((correlatedCustomFloat2 == null) ? 0 : correlatedCustomFloat2.hashCode());
		result = prime * result + ((correlatedCustomFloat3 == null) ? 0 : correlatedCustomFloat3.hashCode());
		result = prime * result + ((correlatedCustomInt1 == null) ? 0 : correlatedCustomInt1.hashCode());
		result = prime * result + ((correlatedCustomInt2 == null) ? 0 : correlatedCustomInt2.hashCode());
		result = prime * result + ((correlatedCustomInt3 == null) ? 0 : correlatedCustomInt3.hashCode());
		result = prime * result + ((correlatedCustomText1 == null) ? 0 : correlatedCustomText1.hashCode());
		result = prime * result + ((correlatedCustomText10 == null) ? 0 : correlatedCustomText10.hashCode());
		result = prime * result + ((correlatedCustomText2 == null) ? 0 : correlatedCustomText2.hashCode());
		result = prime * result + ((correlatedCustomText3 == null) ? 0 : correlatedCustomText3.hashCode());
		result = prime * result + ((correlatedCustomText4 == null) ? 0 : correlatedCustomText4.hashCode());
		result = prime * result + ((correlatedCustomText5 == null) ? 0 : correlatedCustomText5.hashCode());
		result = prime * result + ((correlatedCustomText6 == null) ? 0 : correlatedCustomText6.hashCode());
		result = prime * result + ((correlatedCustomText7 == null) ? 0 : correlatedCustomText7.hashCode());
		result = prime * result + ((correlatedCustomText8 == null) ? 0 : correlatedCustomText8.hashCode());
		result = prime * result + ((correlatedCustomText9 == null) ? 0 : correlatedCustomText9.hashCode());
		result = prime * result + ((correlatedCustomTextBlock1 == null) ? 0 : correlatedCustomTextBlock1.hashCode());
		result = prime * result + ((correlatedCustomTextBlock2 == null) ? 0 : correlatedCustomTextBlock2.hashCode());
		result = prime * result + ((correlatedCustomTextBlock3 == null) ? 0 : correlatedCustomTextBlock3.hashCode());
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
		CustomFieldsC other = (CustomFieldsC) obj;
		if (correlatedCustomDate1 == null) {
			if (other.correlatedCustomDate1 != null)
				return false;
		} else if (!correlatedCustomDate1.isEqual(other.correlatedCustomDate1))
			return false;
		if (correlatedCustomDate2 == null) {
			if (other.correlatedCustomDate2 != null)
				return false;
		} else if (!correlatedCustomDate2.isEqual(other.correlatedCustomDate2))
			return false;
		if (correlatedCustomDate3 == null) {
			if (other.correlatedCustomDate3 != null)
				return false;
		} else if (!correlatedCustomDate3.isEqual(other.correlatedCustomDate3))
			return false;
		if (correlatedCustomFloat1 == null) {
			if (other.correlatedCustomFloat1 != null)
				return false;
		} else if (!correlatedCustomFloat1.equals(other.correlatedCustomFloat1))
			return false;
		if (correlatedCustomFloat2 == null) {
			if (other.correlatedCustomFloat2 != null)
				return false;
		} else if (!correlatedCustomFloat2.equals(other.correlatedCustomFloat2))
			return false;
		if (correlatedCustomFloat3 == null) {
			if (other.correlatedCustomFloat3 != null)
				return false;
		} else if (!correlatedCustomFloat3.equals(other.correlatedCustomFloat3))
			return false;
		if (correlatedCustomInt1 == null) {
			if (other.correlatedCustomInt1 != null)
				return false;
		} else if (!correlatedCustomInt1.equals(other.correlatedCustomInt1))
			return false;
		if (correlatedCustomInt2 == null) {
			if (other.correlatedCustomInt2 != null)
				return false;
		} else if (!correlatedCustomInt2.equals(other.correlatedCustomInt2))
			return false;
		if (correlatedCustomInt3 == null) {
			if (other.correlatedCustomInt3 != null)
				return false;
		} else if (!correlatedCustomInt3.equals(other.correlatedCustomInt3))
			return false;
		if (correlatedCustomText1 == null) {
			if (other.correlatedCustomText1 != null)
				return false;
		} else if (!correlatedCustomText1.equals(other.correlatedCustomText1))
			return false;
		if (correlatedCustomText10 == null) {
			if (other.correlatedCustomText10 != null)
				return false;
		} else if (!correlatedCustomText10.equals(other.correlatedCustomText10))
			return false;
		if (correlatedCustomText2 == null) {
			if (other.correlatedCustomText2 != null)
				return false;
		} else if (!correlatedCustomText2.equals(other.correlatedCustomText2))
			return false;
		if (correlatedCustomText3 == null) {
			if (other.correlatedCustomText3 != null)
				return false;
		} else if (!correlatedCustomText3.equals(other.correlatedCustomText3))
			return false;
		if (correlatedCustomText4 == null) {
			if (other.correlatedCustomText4 != null)
				return false;
		} else if (!correlatedCustomText4.equals(other.correlatedCustomText4))
			return false;
		if (correlatedCustomText5 == null) {
			if (other.correlatedCustomText5 != null)
				return false;
		} else if (!correlatedCustomText5.equals(other.correlatedCustomText5))
			return false;
		if (correlatedCustomText6 == null) {
			if (other.correlatedCustomText6 != null)
				return false;
		} else if (!correlatedCustomText6.equals(other.correlatedCustomText6))
			return false;
		if (correlatedCustomText7 == null) {
			if (other.correlatedCustomText7 != null)
				return false;
		} else if (!correlatedCustomText7.equals(other.correlatedCustomText7))
			return false;
		if (correlatedCustomText8 == null) {
			if (other.correlatedCustomText8 != null)
				return false;
		} else if (!correlatedCustomText8.equals(other.correlatedCustomText8))
			return false;
		if (correlatedCustomText9 == null) {
			if (other.correlatedCustomText9 != null)
				return false;
		} else if (!correlatedCustomText9.equals(other.correlatedCustomText9))
			return false;
		if (correlatedCustomTextBlock1 == null) {
			if (other.correlatedCustomTextBlock1 != null)
				return false;
		} else if (!correlatedCustomTextBlock1.equals(other.correlatedCustomTextBlock1))
			return false;
		if (correlatedCustomTextBlock2 == null) {
			if (other.correlatedCustomTextBlock2 != null)
				return false;
		} else if (!correlatedCustomTextBlock2.equals(other.correlatedCustomTextBlock2))
			return false;
		if (correlatedCustomTextBlock3 == null) {
			if (other.correlatedCustomTextBlock3 != null)
				return false;
		} else if (!correlatedCustomTextBlock3.equals(other.correlatedCustomTextBlock3))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(", \ncorrelatedCustomDate1=");
		builder.append(correlatedCustomDate1);
		builder.append(", \ncorrelatedCustomDate2=");
		builder.append(correlatedCustomDate2);
		builder.append(", \ncorrelatedCustomDate3=");
		builder.append(correlatedCustomDate3);
		builder.append(", \ncorrelatedCustomFloat1=");
		builder.append(correlatedCustomFloat1);
		builder.append(", \ncorrelatedCustomFloat2=");
		builder.append(correlatedCustomFloat2);
		builder.append(", \ncorrelatedCustomFloat3=");
		builder.append(correlatedCustomFloat3);
		builder.append(", \ncorrelatedCustomInt1=");
		builder.append(correlatedCustomInt1);
		builder.append(", \ncorrelatedCustomInt2=");
		builder.append(correlatedCustomInt2);
		builder.append(", \ncorrelatedCustomInt3=");
		builder.append(correlatedCustomInt3);
		builder.append(", \ncorrelatedCustomText1=");
		builder.append(correlatedCustomText1);
		builder.append(", \ncorrelatedCustomText2=");
		builder.append(correlatedCustomText2);
		builder.append(", \ncorrelatedCustomText3=");
		builder.append(correlatedCustomText3);
		builder.append(", \ncorrelatedCustomText4=");
		builder.append(correlatedCustomText4);
		builder.append(", \ncorrelatedCustomText5=");
		builder.append(correlatedCustomText5);
		builder.append(", \ncorrelatedCustomText6=");
		builder.append(correlatedCustomText6);
		builder.append(", \ncorrelatedCustomText7=");
		builder.append(correlatedCustomText7);
		builder.append(", \ncorrelatedCustomText8=");
		builder.append(correlatedCustomText8);
		builder.append(", \ncorrelatedCustomText9=");
		builder.append(correlatedCustomText9);
		builder.append(", \ncorrelatedCustomText10=");
		builder.append(correlatedCustomText10);
		builder.append(", \ncorrelatedCustomTextBlock1=");
		builder.append(correlatedCustomTextBlock1);
		builder.append(", \ncorrelatedCustomTextBlock2=");
		builder.append(correlatedCustomTextBlock2);
		builder.append(", \ncorrelatedCustomTextBlock3=");
		builder.append(correlatedCustomTextBlock3);
		builder.append(super.toString());
		return builder.toString();
	}

}
