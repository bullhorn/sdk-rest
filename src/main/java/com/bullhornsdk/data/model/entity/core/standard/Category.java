package com.bullhornsdk.data.model.entity.core.standard;

import javax.validation.constraints.Size;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "dateAdded", "description", "enabled", "externalID", "name", "occupation", "privateLabels", "skills", "specialties", "type" })
public class Category extends AbstractEntity implements QueryEntity, AssociationEntity {

	private Integer id;

	private DateTime dateAdded;

	@JsonIgnore
	@Size(max = 255)
	private String description;

	private Boolean enabled;

	private Object externalID;

	@JsonIgnore
	@Size(max = 100)
	private String name;

	@JsonIgnore
	@Size(max = 50)
	private String occupation;

	private OneToMany<PrivateLabel> privateLabels;

	private OneToMany<Skill> skills;

	private OneToMany<Category> specialties;

	@JsonIgnore
	@Size(max = 20)
	private String type;

	public Category() {
		super();
	}

	public Category(Integer id) {
		super();
		this.id = id;
	}

	@Override
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@Override
	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("dateAdded")
	public DateTime getDateAdded() {
		return dateAdded;
	}

	@JsonProperty("dateAdded")
	public void setDateAdded(DateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonIgnore
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("enabled")
	public Boolean getEnabled() {
		return enabled;
	}

	@JsonProperty("enabled")
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@JsonProperty("externalID")
	public Object getExternalID() {
		return externalID;
	}

	@JsonProperty("externalID")
	public void setExternalID(Object externalID) {
		this.externalID = externalID;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonIgnore
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("occupation")
	public String getOccupation() {
		return occupation;
	}

	@JsonIgnore
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@JsonProperty("privateLabels")
	public OneToMany<PrivateLabel> getPrivateLabels() {
		return privateLabels;
	}

	@JsonProperty("privateLabels")
	public void setPrivateLabels(OneToMany<PrivateLabel> privateLabels) {
		this.privateLabels = privateLabels;
	}

	@JsonProperty("skills")
	public OneToMany<Skill> getSkills() {
		return skills;
	}

	@JsonProperty("skills")
	public void setSkills(OneToMany<Skill> skills) {
		this.skills = skills;
	}

	@JsonProperty("specialties")
	public OneToMany<Category> getSpecialties() {
		return specialties;
	}

	@JsonProperty("specialties")
	public void setSpecialties(OneToMany<Category> specialties) {
		this.specialties = specialties;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonIgnore
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Category category = (Category) o;

		if (id != null ? !id.equals(category.id) : category.id != null) return false;
		if (dateAdded != null ? !dateAdded.equals(category.dateAdded) : category.dateAdded != null) return false;
		if (description != null ? !description.equals(category.description) : category.description != null)
			return false;
		if (enabled != null ? !enabled.equals(category.enabled) : category.enabled != null) return false;
		if (externalID != null ? !externalID.equals(category.externalID) : category.externalID != null) return false;
		if (name != null ? !name.equals(category.name) : category.name != null) return false;
		if (occupation != null ? !occupation.equals(category.occupation) : category.occupation != null) return false;
		if (privateLabels != null ? !privateLabels.equals(category.privateLabels) : category.privateLabels != null)
			return false;
		if (skills != null ? !skills.equals(category.skills) : category.skills != null) return false;
		if (specialties != null ? !specialties.equals(category.specialties) : category.specialties != null)
			return false;
		return !(type != null ? !type.equals(category.type) : category.type != null);

	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
		result = 31 * result + (externalID != null ? externalID.hashCode() : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (occupation != null ? occupation.hashCode() : 0);
		result = 31 * result + (privateLabels != null ? privateLabels.hashCode() : 0);
		result = 31 * result + (skills != null ? skills.hashCode() : 0);
		result = 31 * result + (specialties != null ? specialties.hashCode() : 0);
		result = 31 * result + (type != null ? type.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Category{" +
				"id=" + id +
				", dateAdded=" + dateAdded +
				", description='" + description + '\'' +
				", enabled=" + enabled +
				", externalID=" + externalID +
				", name='" + name + '\'' +
				", occupation='" + occupation + '\'' +
				", privateLabels=" + privateLabels +
				", skills=" + skills +
				", specialties=" + specialties +
				", type='" + type + '\'' +
				'}';
	}
}