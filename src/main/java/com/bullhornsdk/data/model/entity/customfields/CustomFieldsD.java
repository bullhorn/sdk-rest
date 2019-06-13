package com.bullhornsdk.data.model.entity.customfields;

import java.math.BigDecimal;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

/**
 * Common custom fields for Placement and PlacementChangeRequest:
 * 
 * customDate 1-13
 * 
 * customFloat 1-23
 * 
 * customInt 1-23
 * 
 * customText 1-60
 * 
 * customTextBlock 1-10
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
    private String customEncryptedText1;

    @JsonIgnore
    private String customEncryptedText2;

    @JsonIgnore
    private String customEncryptedText3;

    @JsonIgnore
    private String customEncryptedText4;

    @JsonIgnore
    private String customEncryptedText5;

    @JsonIgnore
    private String customEncryptedText6;

    @JsonIgnore
    private String customEncryptedText7;

    @JsonIgnore
    private String customEncryptedText8;

    @JsonIgnore
    private String customEncryptedText9;

    @JsonIgnore
    private String customEncryptedText10;

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

    @JsonIgnore
    @Size(max = 100)
    private String customText41;

    @JsonIgnore
    @Size(max = 100)
    private String customText42;

    @JsonIgnore
    @Size(max = 100)
    private String customText43;

    @JsonIgnore
    @Size(max = 100)
    private String customText44;

    @JsonIgnore
    @Size(max = 100)
    private String customText45;

    @JsonIgnore
    @Size(max = 100)
    private String customText46;

    @JsonIgnore
    @Size(max = 100)
    private String customText47;

    @JsonIgnore
    @Size(max = 100)
    private String customText48;

    @JsonIgnore
    @Size(max = 100)
    private String customText49;

    @JsonIgnore
    @Size(max = 100)
    private String customText50;

    @JsonIgnore
    @Size(max = 100)
    private String customText51;

    @JsonIgnore
    @Size(max = 100)
    private String customText52;

    @JsonIgnore
    @Size(max = 100)
    private String customText53;

    @JsonIgnore
    @Size(max = 100)
    private String customText54;

    @JsonIgnore
    @Size(max = 100)
    private String customText55;

    @JsonIgnore
    @Size(max = 100)
    private String customText56;

    @JsonIgnore
    @Size(max = 100)
    private String customText57;

    @JsonIgnore
    @Size(max = 100)
    private String customText58;

    @JsonIgnore
    @Size(max = 100)
    private String customText59;

    @JsonIgnore
    @Size(max = 100)
    private String customText60;

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

    private DateTime customDate4;
    private DateTime customDate5;
    private DateTime customDate6;
    private DateTime customDate7;
    private DateTime customDate8;
    private DateTime customDate9;
    private DateTime customDate10;
    private DateTime customDate11;
    private DateTime customDate12;
    private DateTime customDate13;

    private Integer customInt4;
    private Integer customInt5;
    private Integer customInt6;
    private Integer customInt7;
    private Integer customInt8;
    private Integer customInt9;
    private Integer customInt10;
    private Integer customInt11;
    private Integer customInt12;
    private Integer customInt13;
    private Integer customInt14;
    private Integer customInt15;
    private Integer customInt16;
    private Integer customInt17;
    private Integer customInt18;
    private Integer customInt19;
    private Integer customInt20;
    private Integer customInt21;
    private Integer customInt22;
    private Integer customInt23;

    private BigDecimal customFloat4;
    private BigDecimal customFloat5;
    private BigDecimal customFloat6;
    private BigDecimal customFloat7;
    private BigDecimal customFloat8;
    private BigDecimal customFloat9;
    private BigDecimal customFloat10;
    private BigDecimal customFloat11;
    private BigDecimal customFloat12;
    private BigDecimal customFloat13;
    private BigDecimal customFloat14;
    private BigDecimal customFloat15;
    private BigDecimal customFloat16;
    private BigDecimal customFloat17;
    private BigDecimal customFloat18;
    private BigDecimal customFloat19;
    private BigDecimal customFloat20;
    private BigDecimal customFloat21;
    private BigDecimal customFloat22;
    private BigDecimal customFloat23;

    @JsonProperty("customFloat4")
    public BigDecimal getCustomFloat4() {
        return customFloat4;
    }

    @JsonProperty("customFloat4")
    public void setCustomFloat4(BigDecimal customFloat4) {
        this.customFloat4 = customFloat4;
    }

    @JsonProperty("customFloat5")
    public BigDecimal getCustomFloat5() {
        return customFloat5;
    }

    @JsonProperty("customFloat5")
    public void setCustomFloat5(BigDecimal customFloat5) {
        this.customFloat5 = customFloat5;
    }

    @JsonProperty("customFloat6")
    public BigDecimal getCustomFloat6() {
        return customFloat6;
    }

    @JsonProperty("customFloat6")
    public void setCustomFloat6(BigDecimal customFloat6) {
        this.customFloat6 = customFloat6;
    }

    @JsonProperty("customFloat7")
    public BigDecimal getCustomFloat7() {
        return customFloat7;
    }

    @JsonProperty("customFloat7")
    public void setCustomFloat7(BigDecimal customFloat7) {
        this.customFloat7 = customFloat7;
    }

    @JsonProperty("customFloat8")
    public BigDecimal getCustomFloat8() {
        return customFloat8;
    }

    @JsonProperty("customFloat8")
    public void setCustomFloat8(BigDecimal customFloat8) {
        this.customFloat8 = customFloat8;
    }

    @JsonProperty("customFloat9")
    public BigDecimal getCustomFloat9() {
        return customFloat9;
    }

    @JsonProperty("customFloat9")
    public void setCustomFloat9(BigDecimal customFloat9) {
        this.customFloat9 = customFloat9;
    }

    @JsonProperty("customFloat10")
    public BigDecimal getCustomFloat10() {
        return customFloat10;
    }

    @JsonProperty("customFloat10")
    public void setCustomFloat10(BigDecimal customFloat10) {
        this.customFloat10 = customFloat10;
    }

    @JsonProperty("customFloat11")
    public BigDecimal getCustomFloat11() {
        return customFloat11;
    }

    @JsonProperty("customFloat11")
    public void setCustomFloat11(BigDecimal customFloat11) {
        this.customFloat11 = customFloat11;
    }

    @JsonProperty("customFloat12")
    public BigDecimal getCustomFloat12() {
        return customFloat12;
    }

    @JsonProperty("customFloat12")
    public void setCustomFloat12(BigDecimal customFloat12) {
        this.customFloat12 = customFloat12;
    }

    @JsonProperty("customFloat13")
    public BigDecimal getCustomFloat13() {
        return customFloat13;
    }

    @JsonProperty("customFloat13")
    public void setCustomFloat13(BigDecimal customFloat13) {
        this.customFloat13 = customFloat13;
    }

    @JsonProperty("customFloat14")
    public BigDecimal getCustomFloat14() {
        return customFloat14;
    }

    @JsonProperty("customFloat14")
    public void setCustomFloat14(BigDecimal customFloat14) {
        this.customFloat14 = customFloat14;
    }

    @JsonProperty("customFloat15")
    public BigDecimal getCustomFloat15() {
        return customFloat15;
    }

    @JsonProperty("customFloat15")
    public void setCustomFloat15(BigDecimal customFloat15) {
        this.customFloat15 = customFloat15;
    }

    @JsonProperty("customFloat16")
    public BigDecimal getCustomFloat16() {
        return customFloat16;
    }

    @JsonProperty("customFloat16")
    public void setCustomFloat16(BigDecimal customFloat16) {
        this.customFloat16 = customFloat16;
    }

    @JsonProperty("customFloat17")
    public BigDecimal getCustomFloat17() {
        return customFloat17;
    }

    @JsonProperty("customFloat17")
    public void setCustomFloat17(BigDecimal customFloat17) {
        this.customFloat17 = customFloat17;
    }

    @JsonProperty("customFloat18")
    public BigDecimal getCustomFloat18() {
        return customFloat18;
    }

    @JsonProperty("customFloat18")
    public void setCustomFloat18(BigDecimal customFloat18) {
        this.customFloat18 = customFloat18;
    }

    @JsonProperty("customFloat19")
    public BigDecimal getCustomFloat19() {
        return customFloat19;
    }

    @JsonProperty("customFloat19")
    public void setCustomFloat19(BigDecimal customFloat19) {
        this.customFloat19 = customFloat19;
    }

    @JsonProperty("customFloat20")
    public BigDecimal getCustomFloat20() {
        return customFloat20;
    }

    @JsonProperty("customFloat20")
    public void setCustomFloat20(BigDecimal customFloat20) {
        this.customFloat20 = customFloat20;
    }

    @JsonProperty("customFloat21")
    public BigDecimal getCustomFloat21() {
        return customFloat21;
    }

    @JsonProperty("customFloat21")
    public void setCustomFloat21(BigDecimal customFloat21) {
        this.customFloat21 = customFloat21;
    }

    @JsonProperty("customFloat22")
    public BigDecimal getCustomFloat22() {
        return customFloat22;
    }

    @JsonProperty("customFloat22")
    public void setCustomFloat22(BigDecimal customFloat22) {
        this.customFloat22 = customFloat22;
    }

    @JsonProperty("customFloat23")
    public BigDecimal getCustomFloat23() {
        return customFloat23;
    }

    @JsonProperty("customFloat23")
    public void setCustomFloat23(BigDecimal customFloat23) {
        this.customFloat23 = customFloat23;
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

    @JsonProperty("customInt6")
    public Integer getCustomInt6() {
        return customInt6;
    }

    @JsonProperty("customInt6")
    public void setCustomInt6(Integer customInt6) {
        this.customInt6 = customInt6;
    }

    @JsonProperty("customInt7")
    public Integer getCustomInt7() {
        return customInt7;
    }

    @JsonProperty("customInt7")
    public void setCustomInt7(Integer customInt7) {
        this.customInt7 = customInt7;
    }

    @JsonProperty("customInt8")
    public Integer getCustomInt8() {
        return customInt8;
    }

    @JsonProperty("customInt8")
    public void setCustomInt8(Integer customInt8) {
        this.customInt8 = customInt8;
    }

    @JsonProperty("customInt9")
    public Integer getCustomInt9() {
        return customInt9;
    }

    @JsonProperty("customInt9")
    public void setCustomInt9(Integer customInt9) {
        this.customInt9 = customInt9;
    }

    @JsonProperty("customInt10")
    public Integer getCustomInt10() {
        return customInt10;
    }

    @JsonProperty("customInt10")
    public void setCustomInt10(Integer customInt10) {
        this.customInt10 = customInt10;
    }

    @JsonProperty("customInt11")
    public Integer getCustomInt11() {
        return customInt11;
    }

    @JsonProperty("customInt11")
    public void setCustomInt11(Integer customInt11) {
        this.customInt11 = customInt11;
    }

    @JsonProperty("customInt12")
    public Integer getCustomInt12() {
        return customInt12;
    }

    @JsonProperty("customInt12")
    public void setCustomInt12(Integer customInt12) {
        this.customInt12 = customInt12;
    }

    @JsonProperty("customInt13")
    public Integer getCustomInt13() {
        return customInt13;
    }

    @JsonProperty("customInt13")
    public void setCustomInt13(Integer customInt13) {
        this.customInt13 = customInt13;
    }

    @JsonProperty("customInt14")
    public Integer getCustomInt14() {
        return customInt14;
    }

    @JsonProperty("customInt14")
    public void setCustomInt14(Integer customInt14) {
        this.customInt14 = customInt14;
    }

    @JsonProperty("customInt15")
    public Integer getCustomInt15() {
        return customInt15;
    }

    @JsonProperty("customInt15")
    public void setCustomInt15(Integer customInt15) {
        this.customInt15 = customInt15;
    }

    @JsonProperty("customInt16")
    public Integer getCustomInt16() {
        return customInt16;
    }

    @JsonProperty("customInt16")
    public void setCustomInt16(Integer customInt16) {
        this.customInt16 = customInt16;
    }

    @JsonProperty("customInt17")
    public Integer getCustomInt17() {
        return customInt17;
    }

    @JsonProperty("customInt17")
    public void setCustomInt17(Integer customInt17) {
        this.customInt17 = customInt17;
    }

    @JsonProperty("customInt18")
    public Integer getCustomInt18() {
        return customInt18;
    }

    @JsonProperty("customInt18")
    public void setCustomInt18(Integer customInt18) {
        this.customInt18 = customInt18;
    }

    @JsonProperty("customInt19")
    public Integer getCustomInt19() {
        return customInt19;
    }

    @JsonProperty("customInt19")
    public void setCustomInt19(Integer customInt19) {
        this.customInt19 = customInt19;
    }

    @JsonProperty("customInt20")
    public Integer getCustomInt20() {
        return customInt20;
    }

    @JsonProperty("customInt20")
    public void setCustomInt20(Integer customInt20) {
        this.customInt20 = customInt20;
    }

    @JsonProperty("customInt21")
    public Integer getCustomInt21() {
        return customInt21;
    }

    @JsonProperty("customInt21")
    public void setCustomInt21(Integer customInt21) {
        this.customInt21 = customInt21;
    }

    @JsonProperty("customInt22")
    public Integer getCustomInt22() {
        return customInt22;
    }

    @JsonProperty("customInt22")
    public void setCustomInt22(Integer customInt22) {
        this.customInt22 = customInt22;
    }

    @JsonProperty("customInt23")
    public Integer getCustomInt23() {
        return customInt23;
    }

    @JsonProperty("customInt23")
    public void setCustomInt23(Integer customInt23) {
        this.customInt23 = customInt23;
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

    @JsonProperty("customDate11")
    public DateTime getCustomDate11() {
        return customDate11;
    }

    @JsonProperty("customDate11")
    public void setCustomDate11(DateTime customDate11) {
        this.customDate11 = customDate11;
    }

    @JsonProperty("customDate12")
    public DateTime getCustomDate12() {
        return customDate12;
    }

    @JsonProperty("customDate12")
    public void setCustomDate12(DateTime customDate12) {
        this.customDate12 = customDate12;
    }

    @JsonProperty("customDate13")
    public DateTime getCustomDate13() {
        return customDate13;
    }

    @JsonProperty("customDate13")
    public void setCustomDate13(DateTime customDate13) {
        this.customDate13 = customDate13;
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

    @JsonProperty("customText41")
    public String getCustomText41() {
        return customText41;
    }

    @JsonIgnore
    public void setCustomText41(String customText41) {
        this.customText41 = customText41;
    }

    @JsonProperty("customText42")
    public String getCustomText42() {
        return customText42;
    }

    @JsonIgnore
    public void setCustomText42(String customText42) {
        this.customText42 = customText42;
    }

    @JsonProperty("customText43")
    public String getCustomText43() {
        return customText43;
    }

    @JsonIgnore
    public void setCustomText43(String customText43) {
        this.customText43 = customText43;
    }

    @JsonProperty("customText44")
    public String getCustomText44() {
        return customText44;
    }

    @JsonIgnore
    public void setCustomText44(String customText44) {
        this.customText44 = customText44;
    }

    @JsonProperty("customText45")
    public String getCustomText45() {
        return customText45;
    }

    @JsonIgnore
    public void setCustomText45(String customText45) {
        this.customText45 = customText45;
    }

    @JsonProperty("customText46")
    public String getCustomText46() {
        return customText46;
    }

    @JsonIgnore
    public void setCustomText46(String customText46) {
        this.customText46 = customText46;
    }

    @JsonProperty("customText47")
    public String getCustomText47() {
        return customText47;
    }

    @JsonIgnore
    public void setCustomText47(String customText47) {
        this.customText47 = customText47;
    }

    @JsonProperty("customText48")
    public String getCustomText48() {
        return customText48;
    }

    @JsonIgnore
    public void setCustomText48(String customText48) {
        this.customText48 = customText48;
    }

    @JsonProperty("customText49")
    public String getCustomText49() {
        return customText49;
    }

    @JsonIgnore
    public void setCustomText49(String customText49) {
        this.customText49 = customText49;
    }

    @JsonProperty("customText50")
    public String getCustomText50() {
        return customText50;
    }

    @JsonIgnore
    public void setCustomText50(String customText50) {
        this.customText50 = customText50;
    }

    @JsonProperty("customText51")
    public String getCustomText51() {
        return customText51;
    }

    @JsonIgnore
    public void setCustomText51(String customText51) {
        this.customText51 = customText51;
    }

    @JsonProperty("customText52")
    public String getCustomText52() {
        return customText52;
    }

    @JsonIgnore
    public void setCustomText52(String customText52) {
        this.customText52 = customText52;
    }

    @JsonProperty("customText53")
    public String getCustomText53() {
        return customText53;
    }

    @JsonIgnore
    public void setCustomText53(String customText53) {
        this.customText53 = customText53;
    }

    @JsonProperty("customText54")
    public String getCustomText54() {
        return customText54;
    }

    @JsonIgnore
    public void setCustomText54(String customText54) {
        this.customText54 = customText54;
    }

    @JsonProperty("customText55")
    public String getCustomText55() {
        return customText55;
    }

    @JsonIgnore
    public void setCustomText55(String customText55) {
        this.customText55 = customText55;
    }

    @JsonProperty("customText56")
    public String getCustomText56() {
        return customText56;
    }

    @JsonIgnore
    public void setCustomText56(String customText56) {
        this.customText56 = customText56;
    }

    @JsonProperty("customText57")
    public String getCustomText57() {
        return customText57;
    }

    @JsonIgnore
    public void setCustomText57(String customText57) {
        this.customText57 = customText57;
    }

    @JsonProperty("customText58")
    public String getCustomText58() {
        return customText58;
    }

    @JsonIgnore
    public void setCustomText58(String customText58) {
        this.customText58 = customText58;
    }

    @JsonProperty("customText59")
    public String getCustomText59() {
        return customText59;
    }

    @JsonIgnore
    public void setCustomText59(String customText59) {
        this.customText59 = customText59;
    }

    @JsonProperty("customText60")
    public String getCustomText60() {
        return customText60;
    }

    @JsonIgnore
    public void setCustomText60(String customText60) {
        this.customText60 = customText60;
    }

    @JsonProperty("customEncryptedText1")
    public String getCustomEncryptedText1() {
        return customEncryptedText1;
    }

    @JsonProperty("customEncryptedText1")
    @JsonIgnore
    public void setCustomEncryptedText1(String customEncryptedText1) {
        this.customEncryptedText1 = customEncryptedText1;
    }

    @JsonProperty("customEncryptedText2")
    public String getCustomEncryptedText2() {
        return customEncryptedText2;
    }

    @JsonProperty("customEncryptedText2")
    @JsonIgnore
    public void setCustomEncryptedText2(String customEncryptedText2) {
        this.customEncryptedText2 = customEncryptedText2;
    }

    @JsonProperty("customEncryptedText3")
    public String getCustomEncryptedText3() {
        return customEncryptedText3;
    }

    @JsonProperty("customEncryptedText3")
    @JsonIgnore
    public void setCustomEncryptedText3(String customEncryptedText3) {
        this.customEncryptedText3 = customEncryptedText3;
    }

    @JsonProperty("customEncryptedText4")
    public String getCustomEncryptedText4() {
        return customEncryptedText4;
    }

    @JsonProperty("customEncryptedText4")
    @JsonIgnore
    public void setCustomEncryptedText4(String customEncryptedText4) {
        this.customEncryptedText4 = customEncryptedText4;
    }

    @JsonProperty("customEncryptedText5")
    public String getCustomEncryptedText5() {
        return customEncryptedText5;
    }

    @JsonProperty("customEncryptedText5")
    @JsonIgnore
    public void setCustomEncryptedText5(String customEncryptedText5) {
        this.customEncryptedText5 = customEncryptedText5;
    }

    @JsonProperty("customEncryptedText6")
    public String getCustomEncryptedText6() {
        return customEncryptedText6;
    }

    @JsonProperty("customEncryptedText6")
    @JsonIgnore
    public void setCustomEncryptedText6(String customEncryptedText6) {
        this.customEncryptedText6 = customEncryptedText6;
    }

    @JsonProperty("customEncryptedText7")
    public String getCustomEncryptedText7() {
        return customEncryptedText7;
    }

    @JsonProperty("customEncryptedText7")
    @JsonIgnore
    public void setCustomEncryptedText7(String customEncryptedText7) {
        this.customEncryptedText7 = customEncryptedText7;
    }

    @JsonProperty("customEncryptedText8")
    public String getCustomEncryptedText8() {
        return customEncryptedText8;
    }

    @JsonProperty("customEncryptedText8")
    @JsonIgnore
    public void setCustomEncryptedText8(String customEncryptedText8) {
        this.customEncryptedText8 = customEncryptedText8;
    }

    @JsonProperty("customEncryptedText9")
    public String getCustomEncryptedText9() {
        return customEncryptedText9;
    }

    @JsonProperty("customEncryptedText9")
    @JsonIgnore
    public void setCustomEncryptedText9(String customEncryptedText9) {
        this.customEncryptedText9 = customEncryptedText9;
    }

    @JsonProperty("customEncryptedText10")
    public String getCustomEncryptedText10() {
        return customEncryptedText10;
    }

    @JsonProperty("customEncryptedText10")
    @JsonIgnore
    public void setCustomEncryptedText10(String customEncryptedText10) {
        this.customEncryptedText10 = customEncryptedText10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CustomFieldsD that = (CustomFieldsD) o;

        if (customBillRate1 != null ? !customBillRate1.equals(that.customBillRate1) : that.customBillRate1 != null)
            return false;
        if (customBillRate10 != null ? !customBillRate10.equals(that.customBillRate10) : that.customBillRate10 != null)
            return false;
        if (customBillRate2 != null ? !customBillRate2.equals(that.customBillRate2) : that.customBillRate2 != null)
            return false;
        if (customBillRate3 != null ? !customBillRate3.equals(that.customBillRate3) : that.customBillRate3 != null)
            return false;
        if (customBillRate4 != null ? !customBillRate4.equals(that.customBillRate4) : that.customBillRate4 != null)
            return false;
        if (customBillRate5 != null ? !customBillRate5.equals(that.customBillRate5) : that.customBillRate5 != null)
            return false;
        if (customBillRate6 != null ? !customBillRate6.equals(that.customBillRate6) : that.customBillRate6 != null)
            return false;
        if (customBillRate7 != null ? !customBillRate7.equals(that.customBillRate7) : that.customBillRate7 != null)
            return false;
        if (customBillRate8 != null ? !customBillRate8.equals(that.customBillRate8) : that.customBillRate8 != null)
            return false;
        if (customBillRate9 != null ? !customBillRate9.equals(that.customBillRate9) : that.customBillRate9 != null)
            return false;
        if (customPayRate1 != null ? !customPayRate1.equals(that.customPayRate1) : that.customPayRate1 != null)
            return false;
        if (customPayRate10 != null ? !customPayRate10.equals(that.customPayRate10) : that.customPayRate10 != null)
            return false;
        if (customPayRate2 != null ? !customPayRate2.equals(that.customPayRate2) : that.customPayRate2 != null)
            return false;
        if (customPayRate3 != null ? !customPayRate3.equals(that.customPayRate3) : that.customPayRate3 != null)
            return false;
        if (customPayRate4 != null ? !customPayRate4.equals(that.customPayRate4) : that.customPayRate4 != null)
            return false;
        if (customPayRate5 != null ? !customPayRate5.equals(that.customPayRate5) : that.customPayRate5 != null)
            return false;
        if (customPayRate6 != null ? !customPayRate6.equals(that.customPayRate6) : that.customPayRate6 != null)
            return false;
        if (customPayRate7 != null ? !customPayRate7.equals(that.customPayRate7) : that.customPayRate7 != null)
            return false;
        if (customPayRate8 != null ? !customPayRate8.equals(that.customPayRate8) : that.customPayRate8 != null)
            return false;
        if (customPayRate9 != null ? !customPayRate9.equals(that.customPayRate9) : that.customPayRate9 != null)
            return false;
        if (customEncryptedText1 != null ? !customEncryptedText1.equals(that.customEncryptedText1) : that.customEncryptedText1 != null)
            return false;
        if (customEncryptedText2 != null ? !customEncryptedText2.equals(that.customEncryptedText2) : that.customEncryptedText2 != null)
            return false;
        if (customEncryptedText3 != null ? !customEncryptedText3.equals(that.customEncryptedText3) : that.customEncryptedText3 != null)
            return false;
        if (customEncryptedText4 != null ? !customEncryptedText4.equals(that.customEncryptedText4) : that.customEncryptedText4 != null)
            return false;
        if (customEncryptedText5 != null ? !customEncryptedText5.equals(that.customEncryptedText5) : that.customEncryptedText5 != null)
            return false;
        if (customEncryptedText6 != null ? !customEncryptedText6.equals(that.customEncryptedText6) : that.customEncryptedText6 != null)
            return false;
        if (customEncryptedText7 != null ? !customEncryptedText7.equals(that.customEncryptedText7) : that.customEncryptedText7 != null)
            return false;
        if (customEncryptedText8 != null ? !customEncryptedText8.equals(that.customEncryptedText8) : that.customEncryptedText8 != null)
            return false;
        if (customEncryptedText9 != null ? !customEncryptedText9.equals(that.customEncryptedText9) : that.customEncryptedText9 != null)
            return false;
        if (customEncryptedText10 != null ? !customEncryptedText10.equals(that.customEncryptedText10) : that.customEncryptedText10 != null)
            return false;
        if (customText21 != null ? !customText21.equals(that.customText21) : that.customText21 != null) return false;
        if (customText22 != null ? !customText22.equals(that.customText22) : that.customText22 != null) return false;
        if (customText23 != null ? !customText23.equals(that.customText23) : that.customText23 != null) return false;
        if (customText24 != null ? !customText24.equals(that.customText24) : that.customText24 != null) return false;
        if (customText25 != null ? !customText25.equals(that.customText25) : that.customText25 != null) return false;
        if (customText26 != null ? !customText26.equals(that.customText26) : that.customText26 != null) return false;
        if (customText27 != null ? !customText27.equals(that.customText27) : that.customText27 != null) return false;
        if (customText28 != null ? !customText28.equals(that.customText28) : that.customText28 != null) return false;
        if (customText29 != null ? !customText29.equals(that.customText29) : that.customText29 != null) return false;
        if (customText30 != null ? !customText30.equals(that.customText30) : that.customText30 != null) return false;
        if (customText31 != null ? !customText31.equals(that.customText31) : that.customText31 != null) return false;
        if (customText32 != null ? !customText32.equals(that.customText32) : that.customText32 != null) return false;
        if (customText33 != null ? !customText33.equals(that.customText33) : that.customText33 != null) return false;
        if (customText34 != null ? !customText34.equals(that.customText34) : that.customText34 != null) return false;
        if (customText35 != null ? !customText35.equals(that.customText35) : that.customText35 != null) return false;
        if (customText36 != null ? !customText36.equals(that.customText36) : that.customText36 != null) return false;
        if (customText37 != null ? !customText37.equals(that.customText37) : that.customText37 != null) return false;
        if (customText38 != null ? !customText38.equals(that.customText38) : that.customText38 != null) return false;
        if (customText39 != null ? !customText39.equals(that.customText39) : that.customText39 != null) return false;
        if (customText40 != null ? !customText40.equals(that.customText40) : that.customText40 != null) return false;
        if (customText41 != null ? !customText41.equals(that.customText41) : that.customText41 != null) return false;
        if (customText42 != null ? !customText42.equals(that.customText42) : that.customText42 != null) return false;
        if (customText43 != null ? !customText43.equals(that.customText43) : that.customText43 != null) return false;
        if (customText44 != null ? !customText44.equals(that.customText44) : that.customText44 != null) return false;
        if (customText45 != null ? !customText45.equals(that.customText45) : that.customText45 != null) return false;
        if (customText46 != null ? !customText46.equals(that.customText46) : that.customText46 != null) return false;
        if (customText47 != null ? !customText47.equals(that.customText47) : that.customText47 != null) return false;
        if (customText48 != null ? !customText48.equals(that.customText48) : that.customText48 != null) return false;
        if (customText49 != null ? !customText49.equals(that.customText49) : that.customText49 != null) return false;
        if (customText50 != null ? !customText50.equals(that.customText50) : that.customText50 != null) return false;
        if (customText51 != null ? !customText51.equals(that.customText51) : that.customText51 != null) return false;
        if (customText52 != null ? !customText52.equals(that.customText52) : that.customText52 != null) return false;
        if (customText53 != null ? !customText53.equals(that.customText53) : that.customText53 != null) return false;
        if (customText54 != null ? !customText54.equals(that.customText54) : that.customText54 != null) return false;
        if (customText55 != null ? !customText55.equals(that.customText55) : that.customText55 != null) return false;
        if (customText56 != null ? !customText56.equals(that.customText56) : that.customText56 != null) return false;
        if (customText57 != null ? !customText57.equals(that.customText57) : that.customText57 != null) return false;
        if (customText58 != null ? !customText58.equals(that.customText58) : that.customText58 != null) return false;
        if (customText59 != null ? !customText59.equals(that.customText59) : that.customText59 != null) return false;
        if (customText60 != null ? !customText60.equals(that.customText60) : that.customText60 != null) return false;
        if (customTextBlock6 != null ? !customTextBlock6.equals(that.customTextBlock6) : that.customTextBlock6 != null)
            return false;
        if (customTextBlock7 != null ? !customTextBlock7.equals(that.customTextBlock7) : that.customTextBlock7 != null)
            return false;
        if (customTextBlock8 != null ? !customTextBlock8.equals(that.customTextBlock8) : that.customTextBlock8 != null)
            return false;
        if (customTextBlock9 != null ? !customTextBlock9.equals(that.customTextBlock9) : that.customTextBlock9 != null)
            return false;
        if (customTextBlock10 != null ? !customTextBlock10.equals(that.customTextBlock10) : that.customTextBlock10 != null)
            return false;
        if (customDate4 != null ? !customDate4.equals(that.customDate4) : that.customDate4 != null) return false;
        if (customDate5 != null ? !customDate5.equals(that.customDate5) : that.customDate5 != null) return false;
        if (customDate6 != null ? !customDate6.equals(that.customDate6) : that.customDate6 != null) return false;
        if (customDate7 != null ? !customDate7.equals(that.customDate7) : that.customDate7 != null) return false;
        if (customDate8 != null ? !customDate8.equals(that.customDate8) : that.customDate8 != null) return false;
        if (customDate9 != null ? !customDate9.equals(that.customDate9) : that.customDate9 != null) return false;
        if (customDate10 != null ? !customDate10.equals(that.customDate10) : that.customDate10 != null) return false;
        if (customDate11 != null ? !customDate11.equals(that.customDate11) : that.customDate11 != null) return false;
        if (customDate12 != null ? !customDate12.equals(that.customDate12) : that.customDate12 != null) return false;
        if (customDate13 != null ? !customDate13.equals(that.customDate13) : that.customDate13 != null) return false;
        if (customInt4 != null ? !customInt4.equals(that.customInt4) : that.customInt4 != null) return false;
        if (customInt5 != null ? !customInt5.equals(that.customInt5) : that.customInt5 != null) return false;
        if (customInt6 != null ? !customInt6.equals(that.customInt6) : that.customInt6 != null) return false;
        if (customInt7 != null ? !customInt7.equals(that.customInt7) : that.customInt7 != null) return false;
        if (customInt8 != null ? !customInt8.equals(that.customInt8) : that.customInt8 != null) return false;
        if (customInt9 != null ? !customInt9.equals(that.customInt9) : that.customInt9 != null) return false;
        if (customInt10 != null ? !customInt10.equals(that.customInt10) : that.customInt10 != null) return false;
        if (customInt11 != null ? !customInt11.equals(that.customInt11) : that.customInt11 != null) return false;
        if (customInt12 != null ? !customInt12.equals(that.customInt12) : that.customInt12 != null) return false;
        if (customInt13 != null ? !customInt13.equals(that.customInt13) : that.customInt13 != null) return false;
        if (customInt14 != null ? !customInt14.equals(that.customInt14) : that.customInt14 != null) return false;
        if (customInt15 != null ? !customInt15.equals(that.customInt15) : that.customInt15 != null) return false;
        if (customInt16 != null ? !customInt16.equals(that.customInt16) : that.customInt16 != null) return false;
        if (customInt17 != null ? !customInt17.equals(that.customInt17) : that.customInt17 != null) return false;
        if (customInt18 != null ? !customInt18.equals(that.customInt18) : that.customInt18 != null) return false;
        if (customInt19 != null ? !customInt19.equals(that.customInt19) : that.customInt19 != null) return false;
        if (customInt20 != null ? !customInt20.equals(that.customInt20) : that.customInt20 != null) return false;
        if (customInt21 != null ? !customInt21.equals(that.customInt21) : that.customInt21 != null) return false;
        if (customInt22 != null ? !customInt22.equals(that.customInt22) : that.customInt22 != null) return false;
        if (customInt23 != null ? !customInt23.equals(that.customInt23) : that.customInt23 != null) return false;
        if (customFloat4 != null ? !customFloat4.equals(that.customFloat4) : that.customFloat4 != null) return false;
        if (customFloat5 != null ? !customFloat5.equals(that.customFloat5) : that.customFloat5 != null) return false;
        if (customFloat6 != null ? !customFloat6.equals(that.customFloat6) : that.customFloat6 != null) return false;
        if (customFloat7 != null ? !customFloat7.equals(that.customFloat7) : that.customFloat7 != null) return false;
        if (customFloat8 != null ? !customFloat8.equals(that.customFloat8) : that.customFloat8 != null) return false;
        if (customFloat9 != null ? !customFloat9.equals(that.customFloat9) : that.customFloat9 != null) return false;
        if (customFloat10 != null ? !customFloat10.equals(that.customFloat10) : that.customFloat10 != null)
            return false;
        if (customFloat11 != null ? !customFloat11.equals(that.customFloat11) : that.customFloat11 != null)
            return false;
        if (customFloat12 != null ? !customFloat12.equals(that.customFloat12) : that.customFloat12 != null)
            return false;
        if (customFloat13 != null ? !customFloat13.equals(that.customFloat13) : that.customFloat13 != null)
            return false;
        if (customFloat14 != null ? !customFloat14.equals(that.customFloat14) : that.customFloat14 != null)
            return false;
        if (customFloat15 != null ? !customFloat15.equals(that.customFloat15) : that.customFloat15 != null)
            return false;
        if (customFloat16 != null ? !customFloat16.equals(that.customFloat16) : that.customFloat16 != null)
            return false;
        if (customFloat17 != null ? !customFloat17.equals(that.customFloat17) : that.customFloat17 != null)
            return false;
        if (customFloat18 != null ? !customFloat18.equals(that.customFloat18) : that.customFloat18 != null)
            return false;
        if (customFloat19 != null ? !customFloat19.equals(that.customFloat19) : that.customFloat19 != null)
            return false;
        if (customFloat20 != null ? !customFloat20.equals(that.customFloat20) : that.customFloat20 != null)
            return false;
        if (customFloat21 != null ? !customFloat21.equals(that.customFloat21) : that.customFloat21 != null)
            return false;
        if (customFloat22 != null ? !customFloat22.equals(that.customFloat22) : that.customFloat22 != null)
            return false;
        return customFloat23 != null ? customFloat23.equals(that.customFloat23) : that.customFloat23 == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (customBillRate1 != null ? customBillRate1.hashCode() : 0);
        result = 31 * result + (customBillRate10 != null ? customBillRate10.hashCode() : 0);
        result = 31 * result + (customBillRate2 != null ? customBillRate2.hashCode() : 0);
        result = 31 * result + (customBillRate3 != null ? customBillRate3.hashCode() : 0);
        result = 31 * result + (customBillRate4 != null ? customBillRate4.hashCode() : 0);
        result = 31 * result + (customBillRate5 != null ? customBillRate5.hashCode() : 0);
        result = 31 * result + (customBillRate6 != null ? customBillRate6.hashCode() : 0);
        result = 31 * result + (customBillRate7 != null ? customBillRate7.hashCode() : 0);
        result = 31 * result + (customBillRate8 != null ? customBillRate8.hashCode() : 0);
        result = 31 * result + (customBillRate9 != null ? customBillRate9.hashCode() : 0);
        result = 31 * result + (customPayRate1 != null ? customPayRate1.hashCode() : 0);
        result = 31 * result + (customPayRate10 != null ? customPayRate10.hashCode() : 0);
        result = 31 * result + (customPayRate2 != null ? customPayRate2.hashCode() : 0);
        result = 31 * result + (customPayRate3 != null ? customPayRate3.hashCode() : 0);
        result = 31 * result + (customPayRate4 != null ? customPayRate4.hashCode() : 0);
        result = 31 * result + (customPayRate5 != null ? customPayRate5.hashCode() : 0);
        result = 31 * result + (customPayRate6 != null ? customPayRate6.hashCode() : 0);
        result = 31 * result + (customPayRate7 != null ? customPayRate7.hashCode() : 0);
        result = 31 * result + (customPayRate8 != null ? customPayRate8.hashCode() : 0);
        result = 31 * result + (customPayRate9 != null ? customPayRate9.hashCode() : 0);
        result = 31 * result + (customEncryptedText1 != null ? customEncryptedText1.hashCode() : 0);
        result = 31 * result + (customEncryptedText2 != null ? customEncryptedText2.hashCode() : 0);
        result = 31 * result + (customEncryptedText3 != null ? customEncryptedText3.hashCode() : 0);
        result = 31 * result + (customEncryptedText4 != null ? customEncryptedText4.hashCode() : 0);
        result = 31 * result + (customEncryptedText5 != null ? customEncryptedText5.hashCode() : 0);
        result = 31 * result + (customEncryptedText6 != null ? customEncryptedText6.hashCode() : 0);
        result = 31 * result + (customEncryptedText7 != null ? customEncryptedText7.hashCode() : 0);
        result = 31 * result + (customEncryptedText8 != null ? customEncryptedText8.hashCode() : 0);
        result = 31 * result + (customEncryptedText9 != null ? customEncryptedText9.hashCode() : 0);
        result = 31 * result + (customEncryptedText10 != null ? customEncryptedText10.hashCode() : 0);
        result = 31 * result + (customText21 != null ? customText21.hashCode() : 0);
        result = 31 * result + (customText22 != null ? customText22.hashCode() : 0);
        result = 31 * result + (customText23 != null ? customText23.hashCode() : 0);
        result = 31 * result + (customText24 != null ? customText24.hashCode() : 0);
        result = 31 * result + (customText25 != null ? customText25.hashCode() : 0);
        result = 31 * result + (customText26 != null ? customText26.hashCode() : 0);
        result = 31 * result + (customText27 != null ? customText27.hashCode() : 0);
        result = 31 * result + (customText28 != null ? customText28.hashCode() : 0);
        result = 31 * result + (customText29 != null ? customText29.hashCode() : 0);
        result = 31 * result + (customText30 != null ? customText30.hashCode() : 0);
        result = 31 * result + (customText31 != null ? customText31.hashCode() : 0);
        result = 31 * result + (customText32 != null ? customText32.hashCode() : 0);
        result = 31 * result + (customText33 != null ? customText33.hashCode() : 0);
        result = 31 * result + (customText34 != null ? customText34.hashCode() : 0);
        result = 31 * result + (customText35 != null ? customText35.hashCode() : 0);
        result = 31 * result + (customText36 != null ? customText36.hashCode() : 0);
        result = 31 * result + (customText37 != null ? customText37.hashCode() : 0);
        result = 31 * result + (customText38 != null ? customText38.hashCode() : 0);
        result = 31 * result + (customText39 != null ? customText39.hashCode() : 0);
        result = 31 * result + (customText40 != null ? customText40.hashCode() : 0);
        result = 31 * result + (customText41 != null ? customText41.hashCode() : 0);
        result = 31 * result + (customText42 != null ? customText42.hashCode() : 0);
        result = 31 * result + (customText43 != null ? customText43.hashCode() : 0);
        result = 31 * result + (customText44 != null ? customText44.hashCode() : 0);
        result = 31 * result + (customText45 != null ? customText45.hashCode() : 0);
        result = 31 * result + (customText46 != null ? customText46.hashCode() : 0);
        result = 31 * result + (customText47 != null ? customText47.hashCode() : 0);
        result = 31 * result + (customText48 != null ? customText48.hashCode() : 0);
        result = 31 * result + (customText49 != null ? customText49.hashCode() : 0);
        result = 31 * result + (customText50 != null ? customText50.hashCode() : 0);
        result = 31 * result + (customText51 != null ? customText51.hashCode() : 0);
        result = 31 * result + (customText52 != null ? customText52.hashCode() : 0);
        result = 31 * result + (customText53 != null ? customText53.hashCode() : 0);
        result = 31 * result + (customText54 != null ? customText54.hashCode() : 0);
        result = 31 * result + (customText55 != null ? customText55.hashCode() : 0);
        result = 31 * result + (customText56 != null ? customText56.hashCode() : 0);
        result = 31 * result + (customText57 != null ? customText57.hashCode() : 0);
        result = 31 * result + (customText58 != null ? customText58.hashCode() : 0);
        result = 31 * result + (customText59 != null ? customText59.hashCode() : 0);
        result = 31 * result + (customText60 != null ? customText60.hashCode() : 0);
        result = 31 * result + (customTextBlock6 != null ? customTextBlock6.hashCode() : 0);
        result = 31 * result + (customTextBlock7 != null ? customTextBlock7.hashCode() : 0);
        result = 31 * result + (customTextBlock8 != null ? customTextBlock8.hashCode() : 0);
        result = 31 * result + (customTextBlock9 != null ? customTextBlock9.hashCode() : 0);
        result = 31 * result + (customTextBlock10 != null ? customTextBlock10.hashCode() : 0);
        result = 31 * result + (customDate4 != null ? customDate4.hashCode() : 0);
        result = 31 * result + (customDate5 != null ? customDate5.hashCode() : 0);
        result = 31 * result + (customDate6 != null ? customDate6.hashCode() : 0);
        result = 31 * result + (customDate7 != null ? customDate7.hashCode() : 0);
        result = 31 * result + (customDate8 != null ? customDate8.hashCode() : 0);
        result = 31 * result + (customDate9 != null ? customDate9.hashCode() : 0);
        result = 31 * result + (customDate10 != null ? customDate10.hashCode() : 0);
        result = 31 * result + (customDate11 != null ? customDate11.hashCode() : 0);
        result = 31 * result + (customDate12 != null ? customDate12.hashCode() : 0);
        result = 31 * result + (customDate13 != null ? customDate13.hashCode() : 0);
        result = 31 * result + (customInt4 != null ? customInt4.hashCode() : 0);
        result = 31 * result + (customInt5 != null ? customInt5.hashCode() : 0);
        result = 31 * result + (customInt6 != null ? customInt6.hashCode() : 0);
        result = 31 * result + (customInt7 != null ? customInt7.hashCode() : 0);
        result = 31 * result + (customInt8 != null ? customInt8.hashCode() : 0);
        result = 31 * result + (customInt9 != null ? customInt9.hashCode() : 0);
        result = 31 * result + (customInt10 != null ? customInt10.hashCode() : 0);
        result = 31 * result + (customInt11 != null ? customInt11.hashCode() : 0);
        result = 31 * result + (customInt12 != null ? customInt12.hashCode() : 0);
        result = 31 * result + (customInt13 != null ? customInt13.hashCode() : 0);
        result = 31 * result + (customInt14 != null ? customInt14.hashCode() : 0);
        result = 31 * result + (customInt15 != null ? customInt15.hashCode() : 0);
        result = 31 * result + (customInt16 != null ? customInt16.hashCode() : 0);
        result = 31 * result + (customInt17 != null ? customInt17.hashCode() : 0);
        result = 31 * result + (customInt18 != null ? customInt18.hashCode() : 0);
        result = 31 * result + (customInt19 != null ? customInt19.hashCode() : 0);
        result = 31 * result + (customInt20 != null ? customInt20.hashCode() : 0);
        result = 31 * result + (customInt21 != null ? customInt21.hashCode() : 0);
        result = 31 * result + (customInt22 != null ? customInt22.hashCode() : 0);
        result = 31 * result + (customInt23 != null ? customInt23.hashCode() : 0);
        result = 31 * result + (customFloat4 != null ? customFloat4.hashCode() : 0);
        result = 31 * result + (customFloat5 != null ? customFloat5.hashCode() : 0);
        result = 31 * result + (customFloat6 != null ? customFloat6.hashCode() : 0);
        result = 31 * result + (customFloat7 != null ? customFloat7.hashCode() : 0);
        result = 31 * result + (customFloat8 != null ? customFloat8.hashCode() : 0);
        result = 31 * result + (customFloat9 != null ? customFloat9.hashCode() : 0);
        result = 31 * result + (customFloat10 != null ? customFloat10.hashCode() : 0);
        result = 31 * result + (customFloat11 != null ? customFloat11.hashCode() : 0);
        result = 31 * result + (customFloat12 != null ? customFloat12.hashCode() : 0);
        result = 31 * result + (customFloat13 != null ? customFloat13.hashCode() : 0);
        result = 31 * result + (customFloat14 != null ? customFloat14.hashCode() : 0);
        result = 31 * result + (customFloat15 != null ? customFloat15.hashCode() : 0);
        result = 31 * result + (customFloat16 != null ? customFloat16.hashCode() : 0);
        result = 31 * result + (customFloat17 != null ? customFloat17.hashCode() : 0);
        result = 31 * result + (customFloat18 != null ? customFloat18.hashCode() : 0);
        result = 31 * result + (customFloat19 != null ? customFloat19.hashCode() : 0);
        result = 31 * result + (customFloat20 != null ? customFloat20.hashCode() : 0);
        result = 31 * result + (customFloat21 != null ? customFloat21.hashCode() : 0);
        result = 31 * result + (customFloat22 != null ? customFloat22.hashCode() : 0);
        result = 31 * result + (customFloat23 != null ? customFloat23.hashCode() : 0);
        return result;
    }

    @Override
    public String toStringNonNull(boolean includeLineBreaks) {
        String lbc = ", ";
        if(includeLineBreaks)
            lbc = ",\n ";
        StringBuilder sb = new StringBuilder(super.toStringNonNull(includeLineBreaks));
        if(customBillRate1 != null){
            sb.append(lbc + "customBillRate1=").append(customBillRate1);
        }
        if(customBillRate2 != null){
            sb.append(lbc + "customBillRate2=").append(customBillRate2);
        }
        if(customBillRate3 != null){
            sb.append(lbc + "customBillRate3=").append(customBillRate3);
        }
        if(customBillRate4 != null){
            sb.append(lbc + "customBillRate4=").append(customBillRate4);
        }
        if(customBillRate5 != null){
            sb.append(lbc + "customBillRate5=").append(customBillRate5);
        }
        if(customBillRate6 != null){
            sb.append(lbc + "customBillRate6=").append(customBillRate6);
        }
        if(customBillRate7 != null){
            sb.append(lbc + "customBillRate7=").append(customBillRate7);
        }
        if(customBillRate8 != null){
            sb.append(lbc + "customBillRate8=").append(customBillRate8);
        }
        if(customBillRate9 != null){
            sb.append(lbc + "customBillRate9=").append(customBillRate9);
        }
        if(customBillRate10 != null){
            sb.append(lbc + "customBillRate10=").append(customBillRate10);
        }
        if(customPayRate1 != null){
            sb.append(lbc + "customPayRate1=").append(customPayRate1);
        }
        if(customPayRate2 != null){
            sb.append(lbc + "customPayRate2=").append(customPayRate2);
        }
        if(customPayRate3 != null){
            sb.append(lbc + "customPayRate3=").append(customPayRate3);
        }
        if(customPayRate4 != null){
            sb.append(lbc + "customPayRate4=").append(customPayRate4);
        }
        if(customPayRate5 != null){
            sb.append(lbc + "customPayRate5=").append(customPayRate5);
        }
        if(customPayRate6 != null){
            sb.append(lbc + "customPayRate6=").append(customPayRate6);
        }
        if(customPayRate7 != null){
            sb.append(lbc + "customPayRate7=").append(customPayRate7);
        }
        if(customPayRate8 != null){
            sb.append(lbc + "customPayRate8=").append(customPayRate8);
        }
        if(customPayRate9 != null){
            sb.append(lbc + "customPayRate9=").append(customPayRate9);
        }
        if(customPayRate10 != null){
            sb.append(lbc + "customPayRate10=").append(customPayRate10);
        }
        if(customEncryptedText1 != null){
            sb.append(lbc + "customEncryptedText1=").append(customEncryptedText1);
        }
        if(customEncryptedText2 != null){
            sb.append(lbc + "customEncryptedText2=").append(customEncryptedText2);
        }
        if(customEncryptedText3 != null){
            sb.append(lbc + "customEncryptedText3=").append(customEncryptedText3);
        }
        if(customEncryptedText4 != null){
            sb.append(lbc + "customEncryptedText4=").append(customEncryptedText4);
        }
        if(customEncryptedText5 != null){
            sb.append(lbc + "customEncryptedText5=").append(customEncryptedText5);
        }
        if(customEncryptedText6 != null){
            sb.append(lbc + "customEncryptedText6=").append(customEncryptedText6);
        }
        if(customEncryptedText7 != null){
            sb.append(lbc + "customEncryptedText7=").append(customEncryptedText7);
        }
        if(customEncryptedText8 != null){
            sb.append(lbc + "customEncryptedText8=").append(customEncryptedText8);
        }
        if(customEncryptedText9 != null){
            sb.append(lbc + "customEncryptedText9=").append(customEncryptedText9);
        }
        if(customEncryptedText10 != null){
            sb.append(lbc + "customEncryptedText10=").append(customEncryptedText10);
        }
        if(customText21 != null){
            sb.append(lbc + "customText21=").append(customText21);
        }
        if(customText22 != null){
            sb.append(lbc + "customText22=").append(customText22);
        }
        if(customText23 != null){
            sb.append(lbc + "customText23=").append(customText23);
        }
        if(customText24 != null){
            sb.append(lbc + "customText24=").append(customText24);
        }
        if(customText25 != null){
            sb.append(lbc + "customText25=").append(customText25);
        }
        if(customText26 != null){
            sb.append(lbc + "customText26=").append(customText26);
        }
        if(customText27 != null){
            sb.append(lbc + "customText27=").append(customText27);
        }
        if(customText28 != null){
            sb.append(lbc + "customText28=").append(customText28);
        }
        if(customText29 != null){
            sb.append(lbc + "customText29=").append(customText29);
        }
        if(customText30 != null){
            sb.append(lbc + "customText30=").append(customText30);
        }
        if(customText31 != null){
            sb.append(lbc + "customText31=").append(customText31);
        }
        if(customText32 != null){
            sb.append(lbc + "customText32=").append(customText32);
        }
        if(customText33 != null){
            sb.append(lbc + "customText33=").append(customText33);
        }
        if(customText34 != null){
            sb.append(lbc + "customText34=").append(customText34);
        }
        if(customText35 != null){
            sb.append(lbc + "customText35=").append(customText35);
        }
        if(customText36 != null){
            sb.append(lbc + "customText36=").append(customText36);
        }
        if(customText37 != null){
            sb.append(lbc + "customText37=").append(customText37);
        }
        if(customText38 != null){
            sb.append(lbc + "customText38=").append(customText38);
        }
        if(customText39 != null){
            sb.append(lbc + "customText39=").append(customText39);
        }
        if(customText40 != null){
            sb.append(lbc + "customText40=").append(customText40);
        }
        if(customText41 != null){
            sb.append(lbc + "customText41=").append(customText41);
        }
        if(customText42 != null){
            sb.append(lbc + "customText42=").append(customText42);
        }
        if(customText43 != null){
            sb.append(lbc + "customText43=").append(customText43);
        }
        if(customText44 != null){
            sb.append(lbc + "customText44=").append(customText44);
        }
        if(customText45 != null){
            sb.append(lbc + "customText45=").append(customText45);
        }
        if(customText46 != null){
            sb.append(lbc + "customText46=").append(customText46);
        }
        if(customText47 != null){
            sb.append(lbc + "customText47=").append(customText47);
        }
        if(customText48 != null){
            sb.append(lbc + "customText48=").append(customText48);
        }
        if(customText49 != null){
            sb.append(lbc + "customText49=").append(customText49);
        }
        if(customText50 != null){
            sb.append(lbc + "customText50=").append(customText50);
        }
        if(customText51 != null){
            sb.append(lbc + "customText51=").append(customText51);
        }
        if(customText52 != null){
            sb.append(lbc + "customText52=").append(customText52);
        }
        if(customText53 != null){
            sb.append(lbc + "customText53=").append(customText53);
        }
        if(customText54 != null){
            sb.append(lbc + "customText54=").append(customText54);
        }
        if(customText55 != null){
            sb.append(lbc + "customText55=").append(customText55);
        }
        if(customText56 != null){
            sb.append(lbc + "customText56=").append(customText56);
        }
        if(customText57 != null){
            sb.append(lbc + "customText57=").append(customText57);
        }
        if(customText58 != null){
            sb.append(lbc + "customText58=").append(customText58);
        }
        if(customText59 != null){
            sb.append(lbc + "customText59=").append(customText59);
        }
        if(customText60 != null){
            sb.append(lbc + "customText60=").append(customText60);
        }
        if(customTextBlock6 != null){
            sb.append(lbc + "customTextBlock6=").append(customTextBlock6);
        }
        if(customTextBlock7 != null){
            sb.append(lbc + "customTextBlock7=").append(customTextBlock7);
        }
        if(customTextBlock8 != null){
            sb.append(lbc + "customTextBlock8=").append(customTextBlock8);
        }
        if(customTextBlock9 != null){
            sb.append(lbc + "customTextBlock9=").append(customTextBlock9);
        }
        if(customTextBlock10 != null){
            sb.append(lbc + "customTextBlock10=").append(customTextBlock10);
        }
        if(customDate4 != null){
            sb.append(lbc + "customDate4=").append(customDate4);
        }
        if(customDate5 != null){
            sb.append(lbc + "customDate5=").append(customDate5);
        }
        if(customDate6 != null){
            sb.append(lbc + "customDate6=").append(customDate6);
        }
        if(customDate7 != null){
            sb.append(lbc + "customDate7=").append(customDate7);
        }
        if(customDate8 != null){
            sb.append(lbc + "customDate8=").append(customDate8);
        }
        if(customDate9 != null){
            sb.append(lbc + "customDate9=").append(customDate9);
        }
        if(customDate10 != null){
            sb.append(lbc + "customDate10=").append(customDate10);
        }
        if(customDate11 != null){
            sb.append(lbc + "customDate11=").append(customDate11);
        }
        if(customDate12 != null){
            sb.append(lbc + "customDate12=").append(customDate12);
        }
        if(customDate13 != null){
            sb.append(lbc + "customDate13=").append(customDate13);
        }
        if(customInt4 != null){
            sb.append(lbc + "customInt4=").append(customInt4);
        }
        if(customInt5 != null){
            sb.append(lbc + "customInt5=").append(customInt5);
        }
        if(customInt6 != null){
            sb.append(lbc + "customInt6=").append(customInt6);
        }
        if(customInt7 != null){
            sb.append(lbc + "customInt7=").append(customInt7);
        }
        if(customInt8 != null){
            sb.append(lbc + "customInt8=").append(customInt8);
        }
        if(customInt9 != null){
            sb.append(lbc + "customInt9=").append(customInt9);
        }
        if(customInt10 != null){
            sb.append(lbc + "customInt10=").append(customInt10);
        }
        if(customInt11 != null){
            sb.append(lbc + "customInt11=").append(customInt11);
        }
        if(customInt12 != null){
            sb.append(lbc + "customInt12=").append(customInt12);
        }
        if(customInt13 != null){
            sb.append(lbc + "customInt13=").append(customInt13);
        }
        if(customInt14 != null){
            sb.append(lbc + "customInt14=").append(customInt14);
        }
        if(customInt15 != null){
            sb.append(lbc + "customInt15=").append(customInt15);
        }
        if(customInt16 != null){
            sb.append(lbc + "customInt16=").append(customInt16);
        }
        if(customInt17 != null){
            sb.append(lbc + "customInt17=").append(customInt17);
        }
        if(customInt18 != null){
            sb.append(lbc + "customInt18=").append(customInt18);
        }
        if(customInt19 != null){
            sb.append(lbc + "customInt19=").append(customInt19);
        }
        if(customInt20 != null){
            sb.append(lbc + "customInt20=").append(customInt20);
        }
        if(customInt21 != null){
            sb.append(lbc + "customInt21=").append(customInt21);
        }
        if(customInt22 != null){
            sb.append(lbc + "customInt22=").append(customInt22);
        }
        if(customInt23 != null){
            sb.append(lbc + "customInt23=").append(customInt23);
        }
        if(customFloat4 != null){
            sb.append(lbc + "customFloat4=").append(customFloat4);
        }
        if(customFloat5 != null){
            sb.append(lbc + "customFloat5=").append(customFloat5);
        }
        if(customFloat6 != null){
            sb.append(lbc + "customFloat6=").append(customFloat6);
        }
        if(customFloat7 != null){
            sb.append(lbc + "customFloat7=").append(customFloat7);
        }
        if(customFloat8 != null){
            sb.append(lbc + "customFloat8=").append(customFloat8);
        }
        if(customFloat9 != null){
            sb.append(lbc + "customFloat9=").append(customFloat9);
        }
        if(customFloat10 != null){
            sb.append(lbc + "customFloat10=").append(customFloat10);
        }
        if(customFloat11 != null){
            sb.append(lbc + "customFloat11=").append(customFloat11);
        }
        if(customFloat12 != null){
            sb.append(lbc + "customFloat12=").append(customFloat12);
        }
        if(customFloat13 != null){
            sb.append(lbc + "customFloat13=").append(customFloat13);
        }
        if(customFloat14 != null){
            sb.append(lbc + "customFloat14=").append(customFloat14);
        }
        if(customFloat15 != null){
            sb.append(lbc + "customFloat15=").append(customFloat15);
        }
        if(customFloat16 != null){
            sb.append(lbc + "customFloat16=").append(customFloat16);
        }
        if(customFloat17 != null){
            sb.append(lbc + "customFloat17=").append(customFloat17);
        }
        if(customFloat18 != null){
            sb.append(lbc + "customFloat18=").append(customFloat18);
        }
        if(customFloat19 != null){
            sb.append(lbc + "customFloat19=").append(customFloat19);
        }
        if(customFloat20 != null){
            sb.append(lbc + "customFloat20=").append(customFloat20);
        }
        if(customFloat21 != null){
            sb.append(lbc + "customFloat21=").append(customFloat21);
        }
        if(customFloat22 != null){
            sb.append(lbc + "customFloat22=").append(customFloat22);
        }
        if(customFloat23 != null){
            sb.append(lbc + "customFloat23=").append(customFloat23);
        }
        return sb.toString();
    }

    @Override
    public String toStringNonNull() {
        String lbc = ", ";
        StringBuilder sb = new StringBuilder(super.toStringNonNull());
        if(customBillRate1 != null){
            sb.append(lbc + "customBillRate1=").append(customBillRate1);
        }
        if(customBillRate2 != null){
            sb.append(lbc + "customBillRate2=").append(customBillRate2);
        }
        if(customBillRate3 != null){
            sb.append(lbc + "customBillRate3=").append(customBillRate3);
        }
        if(customBillRate4 != null){
            sb.append(lbc + "customBillRate4=").append(customBillRate4);
        }
        if(customBillRate5 != null){
            sb.append(lbc + "customBillRate5=").append(customBillRate5);
        }
        if(customBillRate6 != null){
            sb.append(lbc + "customBillRate6=").append(customBillRate6);
        }
        if(customBillRate7 != null){
            sb.append(lbc + "customBillRate7=").append(customBillRate7);
        }
        if(customBillRate8 != null){
            sb.append(lbc + "customBillRate8=").append(customBillRate8);
        }
        if(customBillRate9 != null){
            sb.append(lbc + "customBillRate9=").append(customBillRate9);
        }
        if(customBillRate10 != null){
            sb.append(lbc + "customBillRate10=").append(customBillRate10);
        }
        if(customPayRate1 != null){
            sb.append(lbc + "customPayRate1=").append(customPayRate1);
        }
        if(customPayRate2 != null){
            sb.append(lbc + "customPayRate2=").append(customPayRate2);
        }
        if(customPayRate3 != null){
            sb.append(lbc + "customPayRate3=").append(customPayRate3);
        }
        if(customPayRate4 != null){
            sb.append(lbc + "customPayRate4=").append(customPayRate4);
        }
        if(customPayRate5 != null){
            sb.append(lbc + "customPayRate5=").append(customPayRate5);
        }
        if(customPayRate6 != null){
            sb.append(lbc + "customPayRate6=").append(customPayRate6);
        }
        if(customPayRate7 != null){
            sb.append(lbc + "customPayRate7=").append(customPayRate7);
        }
        if(customPayRate8 != null){
            sb.append(lbc + "customPayRate8=").append(customPayRate8);
        }
        if(customPayRate9 != null){
            sb.append(lbc + "customPayRate9=").append(customPayRate9);
        }
        if(customPayRate10 != null){
            sb.append(lbc + "customPayRate10=").append(customPayRate10);
        }
        if(customEncryptedText1 != null){
            sb.append(lbc + "customEncryptedText1=").append(customEncryptedText1);
        }
        if(customEncryptedText2 != null){
            sb.append(lbc + "customEncryptedText2=").append(customEncryptedText2);
        }
        if(customEncryptedText3 != null){
            sb.append(lbc + "customEncryptedText3=").append(customEncryptedText3);
        }
        if(customEncryptedText4 != null){
            sb.append(lbc + "customEncryptedText4=").append(customEncryptedText4);
        }
        if(customEncryptedText5 != null){
            sb.append(lbc + "customEncryptedText5=").append(customEncryptedText5);
        }
        if(customEncryptedText6 != null){
            sb.append(lbc + "customEncryptedText6=").append(customEncryptedText6);
        }
        if(customEncryptedText7 != null){
            sb.append(lbc + "customEncryptedText7=").append(customEncryptedText7);
        }
        if(customEncryptedText8 != null){
            sb.append(lbc + "customEncryptedText8=").append(customEncryptedText8);
        }
        if(customEncryptedText9 != null){
            sb.append(lbc + "customEncryptedText9=").append(customEncryptedText9);
        }
        if(customEncryptedText10 != null){
            sb.append(lbc + "customEncryptedText10=").append(customEncryptedText10);
        }
        if(customText21 != null){
            sb.append(lbc + "customText21=").append(customText21);
        }
        if(customText22 != null){
            sb.append(lbc + "customText22=").append(customText22);
        }
        if(customText23 != null){
            sb.append(lbc + "customText23=").append(customText23);
        }
        if(customText24 != null){
            sb.append(lbc + "customText24=").append(customText24);
        }
        if(customText25 != null){
            sb.append(lbc + "customText25=").append(customText25);
        }
        if(customText26 != null){
            sb.append(lbc + "customText26=").append(customText26);
        }
        if(customText27 != null){
            sb.append(lbc + "customText27=").append(customText27);
        }
        if(customText28 != null){
            sb.append(lbc + "customText28=").append(customText28);
        }
        if(customText29 != null){
            sb.append(lbc + "customText29=").append(customText29);
        }
        if(customText30 != null){
            sb.append(lbc + "customText30=").append(customText30);
        }
        if(customText31 != null){
            sb.append(lbc + "customText31=").append(customText31);
        }
        if(customText32 != null){
            sb.append(lbc + "customText32=").append(customText32);
        }
        if(customText33 != null){
            sb.append(lbc + "customText33=").append(customText33);
        }
        if(customText34 != null){
            sb.append(lbc + "customText34=").append(customText34);
        }
        if(customText35 != null){
            sb.append(lbc + "customText35=").append(customText35);
        }
        if(customText36 != null){
            sb.append(lbc + "customText36=").append(customText36);
        }
        if(customText37 != null){
            sb.append(lbc + "customText37=").append(customText37);
        }
        if(customText38 != null){
            sb.append(lbc + "customText38=").append(customText38);
        }
        if(customText39 != null){
            sb.append(lbc + "customText39=").append(customText39);
        }
        if(customText40 != null){
            sb.append(lbc + "customText40=").append(customText40);
        }
        if(customText41 != null){
            sb.append(lbc + "customText41=").append(customText41);
        }
        if(customText42 != null){
            sb.append(lbc + "customText42=").append(customText42);
        }
        if(customText43 != null){
            sb.append(lbc + "customText43=").append(customText43);
        }
        if(customText44 != null){
            sb.append(lbc + "customText44=").append(customText44);
        }
        if(customText45 != null){
            sb.append(lbc + "customText45=").append(customText45);
        }
        if(customText46 != null){
            sb.append(lbc + "customText46=").append(customText46);
        }
        if(customText47 != null){
            sb.append(lbc + "customText47=").append(customText47);
        }
        if(customText48 != null){
            sb.append(lbc + "customText48=").append(customText48);
        }
        if(customText49 != null){
            sb.append(lbc + "customText49=").append(customText49);
        }
        if(customText50 != null){
            sb.append(lbc + "customText50=").append(customText50);
        }
        if(customText51 != null){
            sb.append(lbc + "customText51=").append(customText51);
        }
        if(customText52 != null){
            sb.append(lbc + "customText52=").append(customText52);
        }
        if(customText53 != null){
            sb.append(lbc + "customText53=").append(customText53);
        }
        if(customText54 != null){
            sb.append(lbc + "customText54=").append(customText54);
        }
        if(customText55 != null){
            sb.append(lbc + "customText55=").append(customText55);
        }
        if(customText56 != null){
            sb.append(lbc + "customText56=").append(customText56);
        }
        if(customText57 != null){
            sb.append(lbc + "customText57=").append(customText57);
        }
        if(customText58 != null){
            sb.append(lbc + "customText58=").append(customText58);
        }
        if(customText59 != null){
            sb.append(lbc + "customText59=").append(customText59);
        }
        if(customText60 != null){
            sb.append(lbc + "customText60=").append(customText60);
        }
        if(customTextBlock6 != null){
            sb.append(lbc + "customTextBlock6=").append(customTextBlock6);
        }
        if(customTextBlock7 != null){
            sb.append(lbc + "customTextBlock7=").append(customTextBlock7);
        }
        if(customTextBlock8 != null){
            sb.append(lbc + "customTextBlock8=").append(customTextBlock8);
        }
        if(customTextBlock9 != null){
            sb.append(lbc + "customTextBlock9=").append(customTextBlock9);
        }
        if(customTextBlock10 != null){
            sb.append(lbc + "customTextBlock10=").append(customTextBlock10);
        }
        if(customDate4 != null){
            sb.append(lbc + "customDate4=").append(customDate4);
        }
        if(customDate5 != null){
            sb.append(lbc + "customDate5=").append(customDate5);
        }
        if(customDate6 != null){
            sb.append(lbc + "customDate6=").append(customDate6);
        }
        if(customDate7 != null){
            sb.append(lbc + "customDate7=").append(customDate7);
        }
        if(customDate8 != null){
            sb.append(lbc + "customDate8=").append(customDate8);
        }
        if(customDate9 != null){
            sb.append(lbc + "customDate9=").append(customDate9);
        }
        if(customDate10 != null){
            sb.append(lbc + "customDate10=").append(customDate10);
        }
        if(customDate11 != null){
            sb.append(lbc + "customDate11=").append(customDate11);
        }
        if(customDate12 != null){
            sb.append(lbc + "customDate12=").append(customDate12);
        }
        if(customDate13 != null){
            sb.append(lbc + "customDate13=").append(customDate13);
        }
        if(customInt4 != null){
            sb.append(lbc + "customInt4=").append(customInt4);
        }
        if(customInt5 != null){
            sb.append(lbc + "customInt5=").append(customInt5);
        }
        if(customInt6 != null){
            sb.append(lbc + "customInt6=").append(customInt6);
        }
        if(customInt7 != null){
            sb.append(lbc + "customInt7=").append(customInt7);
        }
        if(customInt8 != null){
            sb.append(lbc + "customInt8=").append(customInt8);
        }
        if(customInt9 != null){
            sb.append(lbc + "customInt9=").append(customInt9);
        }
        if(customInt10 != null){
            sb.append(lbc + "customInt10=").append(customInt10);
        }
        if(customInt11 != null){
            sb.append(lbc + "customInt11=").append(customInt11);
        }
        if(customInt12 != null){
            sb.append(lbc + "customInt12=").append(customInt12);
        }
        if(customInt13 != null){
            sb.append(lbc + "customInt13=").append(customInt13);
        }
        if(customInt14 != null){
            sb.append(lbc + "customInt14=").append(customInt14);
        }
        if(customInt15 != null){
            sb.append(lbc + "customInt15=").append(customInt15);
        }
        if(customInt16 != null){
            sb.append(lbc + "customInt16=").append(customInt16);
        }
        if(customInt17 != null){
            sb.append(lbc + "customInt17=").append(customInt17);
        }
        if(customInt18 != null){
            sb.append(lbc + "customInt18=").append(customInt18);
        }
        if(customInt19 != null){
            sb.append(lbc + "customInt19=").append(customInt19);
        }
        if(customInt20 != null){
            sb.append(lbc + "customInt20=").append(customInt20);
        }
        if(customInt21 != null){
            sb.append(lbc + "customInt21=").append(customInt21);
        }
        if(customInt22 != null){
            sb.append(lbc + "customInt22=").append(customInt22);
        }
        if(customInt23 != null){
            sb.append(lbc + "customInt23=").append(customInt23);
        }
        if(customFloat4 != null){
            sb.append(lbc + "customFloat4=").append(customFloat4);
        }
        if(customFloat5 != null){
            sb.append(lbc + "customFloat5=").append(customFloat5);
        }
        if(customFloat6 != null){
            sb.append(lbc + "customFloat6=").append(customFloat6);
        }
        if(customFloat7 != null){
            sb.append(lbc + "customFloat7=").append(customFloat7);
        }
        if(customFloat8 != null){
            sb.append(lbc + "customFloat8=").append(customFloat8);
        }
        if(customFloat9 != null){
            sb.append(lbc + "customFloat9=").append(customFloat9);
        }
        if(customFloat10 != null){
            sb.append(lbc + "customFloat10=").append(customFloat10);
        }
        if(customFloat11 != null){
            sb.append(lbc + "customFloat11=").append(customFloat11);
        }
        if(customFloat12 != null){
            sb.append(lbc + "customFloat12=").append(customFloat12);
        }
        if(customFloat13 != null){
            sb.append(lbc + "customFloat13=").append(customFloat13);
        }
        if(customFloat14 != null){
            sb.append(lbc + "customFloat14=").append(customFloat14);
        }
        if(customFloat15 != null){
            sb.append(lbc + "customFloat15=").append(customFloat15);
        }
        if(customFloat16 != null){
            sb.append(lbc + "customFloat16=").append(customFloat16);
        }
        if(customFloat17 != null){
            sb.append(lbc + "customFloat17=").append(customFloat17);
        }
        if(customFloat18 != null){
            sb.append(lbc + "customFloat18=").append(customFloat18);
        }
        if(customFloat19 != null){
            sb.append(lbc + "customFloat19=").append(customFloat19);
        }
        if(customFloat20 != null){
            sb.append(lbc + "customFloat20=").append(customFloat20);
        }
        if(customFloat21 != null){
            sb.append(lbc + "customFloat21=").append(customFloat21);
        }
        if(customFloat22 != null){
            sb.append(lbc + "customFloat22=").append(customFloat22);
        }
        if(customFloat23 != null){
            sb.append(lbc + "customFloat23=").append(customFloat23);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", customBillRate1=").append(customBillRate1);
        sb.append(", customBillRate2=").append(customBillRate2);
        sb.append(", customBillRate3=").append(customBillRate3);
        sb.append(", customBillRate4=").append(customBillRate4);
        sb.append(", customBillRate5=").append(customBillRate5);
        sb.append(", customBillRate6=").append(customBillRate6);
        sb.append(", customBillRate7=").append(customBillRate7);
        sb.append(", customBillRate8=").append(customBillRate8);
        sb.append(", customBillRate9=").append(customBillRate9);
        sb.append(", customBillRate10=").append(customBillRate10);
        sb.append(", customPayRate1=").append(customPayRate1);
        sb.append(", customPayRate2=").append(customPayRate2);
        sb.append(", customPayRate3=").append(customPayRate3);
        sb.append(", customPayRate4=").append(customPayRate4);
        sb.append(", customPayRate5=").append(customPayRate5);
        sb.append(", customPayRate6=").append(customPayRate6);
        sb.append(", customPayRate7=").append(customPayRate7);
        sb.append(", customPayRate8=").append(customPayRate8);
        sb.append(", customPayRate9=").append(customPayRate9);
        sb.append(", customPayRate10=").append(customPayRate10);
        sb.append(", customEncryptedText1=").append(customEncryptedText1);
        sb.append(", customEncryptedText2=").append(customEncryptedText2);
        sb.append(", customEncryptedText3=").append(customEncryptedText3);
        sb.append(", customEncryptedText4=").append(customEncryptedText4);
        sb.append(", customEncryptedText5=").append(customEncryptedText5);
        sb.append(", customEncryptedText6=").append(customEncryptedText6);
        sb.append(", customEncryptedText7=").append(customEncryptedText7);
        sb.append(", customEncryptedText8=").append(customEncryptedText8);
        sb.append(", customEncryptedText9=").append(customEncryptedText9);
        sb.append(", customEncryptedText10=").append(customEncryptedText10);
        sb.append(", customText21=").append(customText21);
        sb.append(", customText22=").append(customText22);
        sb.append(", customText23=").append(customText23);
        sb.append(", customText24=").append(customText24);
        sb.append(", customText25=").append(customText25);
        sb.append(", customText26=").append(customText26);
        sb.append(", customText27=").append(customText27);
        sb.append(", customText28=").append(customText28);
        sb.append(", customText29=").append(customText29);
        sb.append(", customText30=").append(customText30);
        sb.append(", customText31=").append(customText31);
        sb.append(", customText32=").append(customText32);
        sb.append(", customText33=").append(customText33);
        sb.append(", customText34=").append(customText34);
        sb.append(", customText35=").append(customText35);
        sb.append(", customText36=").append(customText36);
        sb.append(", customText37=").append(customText37);
        sb.append(", customText38=").append(customText38);
        sb.append(", customText39=").append(customText39);
        sb.append(", customText40=").append(customText40);
        sb.append(", customText41=").append(customText41);
        sb.append(", customText42=").append(customText42);
        sb.append(", customText43=").append(customText43);
        sb.append(", customText44=").append(customText44);
        sb.append(", customText45=").append(customText45);
        sb.append(", customText46=").append(customText46);
        sb.append(", customText47=").append(customText47);
        sb.append(", customText48=").append(customText48);
        sb.append(", customText49=").append(customText49);
        sb.append(", customText50=").append(customText50);
        sb.append(", customText51=").append(customText51);
        sb.append(", customText52=").append(customText52);
        sb.append(", customText53=").append(customText53);
        sb.append(", customText54=").append(customText54);
        sb.append(", customText55=").append(customText55);
        sb.append(", customText56=").append(customText56);
        sb.append(", customText57=").append(customText57);
        sb.append(", customText58=").append(customText58);
        sb.append(", customText59=").append(customText59);
        sb.append(", customText60=").append(customText60);
        sb.append(", customTextBlock6=").append(customTextBlock6);
        sb.append(", customTextBlock7=").append(customTextBlock7);
        sb.append(", customTextBlock8=").append(customTextBlock8);
        sb.append(", customTextBlock9=").append(customTextBlock9);
        sb.append(", customTextBlock10=").append(customTextBlock10);
        sb.append(", customDate4=").append(customDate4);
        sb.append(", customDate5=").append(customDate5);
        sb.append(", customDate6=").append(customDate6);
        sb.append(", customDate7=").append(customDate7);
        sb.append(", customDate8=").append(customDate8);
        sb.append(", customDate9=").append(customDate9);
        sb.append(", customDate10=").append(customDate10);
        sb.append(", customDate11=").append(customDate11);
        sb.append(", customDate12=").append(customDate12);
        sb.append(", customDate13=").append(customDate13);
        sb.append(", customInt4=").append(customInt4);
        sb.append(", customInt5=").append(customInt5);
        sb.append(", customInt6=").append(customInt6);
        sb.append(", customInt7=").append(customInt7);
        sb.append(", customInt8=").append(customInt8);
        sb.append(", customInt9=").append(customInt9);
        sb.append(", customInt10=").append(customInt10);
        sb.append(", customInt11=").append(customInt11);
        sb.append(", customInt12=").append(customInt12);
        sb.append(", customInt13=").append(customInt13);
        sb.append(", customInt14=").append(customInt14);
        sb.append(", customInt15=").append(customInt15);
        sb.append(", customInt16=").append(customInt16);
        sb.append(", customInt17=").append(customInt17);
        sb.append(", customInt18=").append(customInt18);
        sb.append(", customInt19=").append(customInt19);
        sb.append(", customInt20=").append(customInt20);
        sb.append(", customInt21=").append(customInt21);
        sb.append(", customInt22=").append(customInt22);
        sb.append(", customInt23=").append(customInt23);
        sb.append(", customFloat4=").append(customFloat4);
        sb.append(", customFloat5=").append(customFloat5);
        sb.append(", customFloat6=").append(customFloat6);
        sb.append(", customFloat7=").append(customFloat7);
        sb.append(", customFloat8=").append(customFloat8);
        sb.append(", customFloat9=").append(customFloat9);
        sb.append(", customFloat10=").append(customFloat10);
        sb.append(", customFloat11=").append(customFloat11);
        sb.append(", customFloat12=").append(customFloat12);
        sb.append(", customFloat13=").append(customFloat13);
        sb.append(", customFloat14=").append(customFloat14);
        sb.append(", customFloat15=").append(customFloat15);
        sb.append(", customFloat16=").append(customFloat16);
        sb.append(", customFloat17=").append(customFloat17);
        sb.append(", customFloat18=").append(customFloat18);
        sb.append(", customFloat19=").append(customFloat19);
        sb.append(", customFloat20=").append(customFloat20);
        sb.append(", customFloat21=").append(customFloat21);
        sb.append(", customFloat22=").append(customFloat22);
        sb.append(", customFloat23=").append(customFloat23);
        return sb.toString();
    }

}
