package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "candidate", "customDate1", "customDate2", "customDate3", "customDate4", "customDate5", "customFloat1",
    "customFloat2", "customFloat3", "customFloat4", "customFloat5", "customInt1", "customInt2", "customInt3", "customInt4", "customInt5",
    "customText1", "customText2", "customText3", "customText4", "customText5", "customTextBlock1", "customTextBlock2", "customTextBlock3",
    "customTextBlock4", "customTextBlock5", "dateBegin", "dateEnd", "deduction", "isDeleted", "migrateGUID", "placement", "unit" })
public class UserHousingComplexUnit extends CustomFieldsB implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity {

    private Integer id;

    private Candidate candidate;

    private DateTime customDate4;

    private DateTime customDate5;

    private BigDecimal customFloat4;

    private BigDecimal customFloat5;

    private Integer customInt4;

    private Integer customInt5;

    private DateTime dateBegin;

    private DateTime dateEnd;

    private BigDecimal deduction;

    private Boolean isDeleted;

    private String migrateGUID;

    private Placement placement;

    private HousingComplexUnit unit;

    public UserHousingComplexUnit() {
	super();
    }

    /**
     * Returns the entity with the required fields for an insert set.
     * 
     * @return
     */
	public UserHousingComplexUnit instantiateForInsert() {
		UserHousingComplexUnit entity = new UserHousingComplexUnit();
		entity.setIsDeleted(Boolean.FALSE);
		return entity;
    }

    @Override
    @JsonProperty("id")
    public Integer getId() {
	return id;
    }

    @ReadOnly
    @Override
    @JsonProperty("id")
    public void setId(Integer id) {
	this.id = id;
    }

    @JsonProperty("candidate")
    public Candidate getCandidate() {
	return candidate;
    }

    @ReadOnly
    @JsonProperty("candidate")
    public void setCandidate(Candidate candidate) {
	this.candidate = candidate;
    }

    @JsonProperty("customDate4")
    public DateTime getCustomDate4() {
        return customDate4;
    }

    @ReadOnly
    @JsonProperty("customDate4")
    public void setCustomDate4(DateTime customDate4) {
        this.customDate4 = customDate4;
    }

    @JsonProperty("customDate5")
    public DateTime getCustomDate5() {
        return customDate5;
    }

    @ReadOnly
    @JsonProperty("customDate5")
    public void setCustomDate5(DateTime customDate5) {
        this.customDate5 = customDate5;
    }

    @JsonProperty("customFloat4")
    public BigDecimal getCustomFloat4() {
        return customFloat4;
    }

    @ReadOnly
    @JsonProperty("customFloat4")
    public void setCustomFloat4(BigDecimal customFloat4) {
        this.customFloat4 = customFloat4;
    }

    @JsonProperty("customFloat5")
    public BigDecimal getCustomFloat5() {
        return customFloat5;
    }

    @ReadOnly
    @JsonProperty("customFloat5")
    public void setCustomFloat5(BigDecimal customFloat5) {
        this.customFloat5 = customFloat5;
    }

    @JsonProperty("customInt4")
    public Integer getCustomInt4() { return customInt4; }

    @ReadOnly
    @JsonProperty("customInt4")
    public void setCustomInt4(Integer customInt4) {
        this.customInt4 = customInt4;
    }

    @JsonProperty("customInt5")
    public Integer getCustomInt5() { return customInt5; }

    @ReadOnly
    @JsonProperty("customInt5")
    public void setCustomInt5(Integer customInt5) {
        this.customInt5 = customInt5;
    }

    @JsonProperty("dateBegin")
    public DateTime getDateBegin() {
	return dateBegin;
    }

    @ReadOnly
    @JsonProperty("dateBegin")
    public void setDateBegin(DateTime dateBegin) {
	this.dateBegin = dateBegin;
    }

    @JsonProperty("dateEnd")
    public DateTime getDateEnd() {
        return dateEnd;
    }

    @ReadOnly
    @JsonProperty("dateEnd")
    public void setDateEnd(DateTime dateEnd) {
        this.dateEnd = dateEnd;
    }

    @JsonProperty("deduction")
    public BigDecimal getDeduction() {
        return deduction;
    }

    @ReadOnly
    @JsonProperty("deduction")
    public void setDeduiction(BigDecimal deduction) {
        this.deduction = deduction;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() { return isDeleted; }

    @ReadOnly
    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
	this.isDeleted = isDeleted;
    }

    @JsonProperty("migrateGUID")
    public String getMigrateGUID() {
        return migrateGUID;
    }

    @ReadOnly
    @JsonProperty("migrateGUID")
    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    @JsonProperty("placement")
    public Placement getPlacement() {
        return placement;
    }

    @ReadOnly
    @JsonProperty("placement")
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    @JsonProperty("unit")
    public HousingComplexUnit getUnit() {
        return unit;
    }

    @ReadOnly
    @JsonProperty("unit")
    public void setUnit(HousingComplexUnit unit) {
        this.unit = unit;
    }


    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((candidate == null) ? 0 : candidate.hashCode());
        result = prime * result + ((customDate4 == null) ? 0 : customDate4.hashCode());
        result = prime * result + ((customDate5 == null) ? 0 : customDate5.hashCode());
        result = prime * result + ((customFloat4 == null) ? 0 : customFloat4.hashCode());
        result = prime * result + ((customFloat5 == null) ? 0 : customFloat5.hashCode());
        result = prime * result + ((customInt4 == null) ? 0 : customInt4.hashCode());
        result = prime * result + ((customInt5 == null) ? 0 : customInt5.hashCode());
        result = prime * result + ((dateBegin == null) ? 0 : dateBegin.hashCode());
        result = prime * result + ((dateEnd == null) ? 0 : dateEnd.hashCode());
        result = prime * result + ((deduction == null) ? 0 : deduction.hashCode());
        result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
        result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
        result = prime * result + ((placement == null) ? 0 : placement.hashCode());
        result = prime * result + ((unit == null) ? 0 : unit.hashCode());
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
        UserHousingComplexUnit other = (UserHousingComplexUnit) obj;

        if (candidate != null ? !candidate.equals(other.candidate) : other.candidate != null)
            return false;
        if (customDate4 != null ? !customDate4.equals(other.customDate4) : other.customDate4 != null)
            return false;
        if (customDate5 != null ? !customDate5.equals(other.customDate5) : other.customDate5 != null)
            return false;
        if (customFloat4 != null ? !customFloat4.equals(other.customFloat4) : other.customFloat4 != null)
            return false;
        if (customFloat5 != null ? !customFloat5.equals(other.customFloat5) : other.customFloat5 != null)
            return false;
        if (customInt4 != null ? !customInt4.equals(other.customInt4) : other.customInt4 != null)
            return false;
        if (customInt5 != null ? !customInt5.equals(other.customInt5) : other.customInt5 != null)
            return false;
        if (dateBegin != null ? !dateBegin.equals(other.dateBegin) : other.dateBegin != null)
            return false;
        if (dateEnd != null ? !dateEnd.equals(other.dateEnd) : other.dateEnd != null)
            return false;
        if (deduction != null ? !deduction.equals(other.deduction) : other.deduction != null)
            return false;
        if (isDeleted != null ? !isDeleted.equals(other.isDeleted) : other.isDeleted != null)
        if (migrateGUID != null ? !migrateGUID.equals(other.migrateGUID) : other.migrateGUID != null)
            return false;
        if (placement != null ? !placement.equals(other.placement) : other.placement != null)
            return false;
        if (unit != null ? !unit.equals(other.unit) : other.unit != null)
            return false;
	    return true;
    }

    @Override
    public String toString() {
	return "id=" + id +
        ", candidate=" + candidate +
        ", customDate4=" + customDate4 +
        ", customDate5=" + customDate5 +
        ", customFloat4=" + customFloat4 +
        ", customFloat5=" + customFloat5 +
        ", customInt4=" + customInt4 +
        ", customInt5=" + customInt5 +
        ", dateBegin=" + dateBegin +
        ", dateEnd=" + dateEnd +
        ", deduction=" + deduction +
        ", isDeleted=" + isDeleted +
        ", migrateGUID=" + migrateGUID +
        ", placement=" + placement +
        ", unit=" + unit +
        super.toString();
    }
}
