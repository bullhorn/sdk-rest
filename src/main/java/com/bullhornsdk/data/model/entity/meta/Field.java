package com.bullhornsdk.data.model.entity.meta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "type", "dataType", "dataSpecialization", "maxLength", "confidential", "optional", "label", "required",
		"readOnly", "multiValue", "defaultValue", "inputType", "optionsType", "optionsUrl", "hideFromSearch", "sortOrder", "hint",
		"description", "associatedEntity", "options", "fields" })
public class Field {

    private String name;

    private String type;

    private String dataType;

    private String dataSpecialization;

	private Integer maxLength;

	private Boolean confidential;

	private Boolean optional;

    private String label;

	private Boolean required;

	private Boolean readOnly;

	private Boolean multiValue;

	private Object defaultValue;

	private String inputType;

	private String optionsType;

	private String optionsUrl;

	private Boolean hideFromSearch;

	private Integer sortOrder;

	private String hint;

	private String description;

    private StandardMetaData<?> associatedEntity;

    private List<Option> options = new ArrayList<Option>();

	private List<Field> fields = new ArrayList<Field>();

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("dataType")
    public String getDataType() {
        return dataType;
    }

    @JsonProperty("dataType")
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @JsonProperty("dataSpecialization")
    public String getDataSpecialization() {
        return dataSpecialization;
    }

    @JsonProperty("dataSpecialization")
    public void setDataSpecialization(String dataSpecialization) {
        this.dataSpecialization = dataSpecialization;
    }

    @JsonProperty("maxLength")
	public Integer getMaxLength() {
		return maxLength;
	}

	@JsonProperty("maxLength")
	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}

	@JsonProperty("confidential")
	public Boolean getConfidential() {
		return confidential;
	}

	@JsonProperty("confidential")
	public void setConfidential(Boolean confidential) {
		this.confidential = confidential;
	}

	@JsonProperty("optional")
	public Boolean getOptional() {
		return optional;
	}

	@JsonProperty("optional")
	public void setOptional(Boolean optional) {
		this.optional = optional;
	}

	@JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("required")
	public Boolean getRequired() {
		return required;
	}

	@JsonProperty("required")
	public void setRequired(Boolean required) {
		this.required = required;
	}

	@JsonProperty("readOnly")
	public Boolean getReadOnly() {
		return readOnly;
	}

	@JsonProperty("readOnly")
	public void setReadOnly(Boolean readOnly) {
		this.readOnly = readOnly;
	}

	@JsonProperty("multiValue")
	public Boolean getMultiValue() {
		return multiValue;
	}

	@JsonProperty("multiValue")
	public void setMultiValue(Boolean multiValue) {
		this.multiValue = multiValue;
	}

    @JsonProperty("defaultValue")
    public Object getDefaultValue() {
        return defaultValue;
    }

    @JsonProperty("defaultValue")
    public void setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    @JsonProperty("inputType")
	public String getInputType() {
		return inputType;
	}

	@JsonProperty("inputType")
	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	@JsonProperty("optionsType")
	public String getOptionsType() {
		return optionsType;
	}

	@JsonProperty("optionsType")
	public void setOptionsType(String optionsType) {
		this.optionsType = optionsType;
	}

	@JsonProperty("optionsUrl")
	public String getOptionsUrl() {
		return optionsUrl;
	}

	@JsonProperty("optionsUrl")
	public void setOptionsUrl(String optionsUrl) {
		this.optionsUrl = optionsUrl;
	}

	@JsonProperty("hideFromSearch")
	public Boolean getHideFromSearch() {
		return hideFromSearch;
	}

	@JsonProperty("hideFromSearch")
	public void setHideFromSearch(Boolean hideFromSearch) {
		this.hideFromSearch = hideFromSearch;
	}

	@JsonProperty("sortOrder")
	public Integer getSortOrder() {
		return sortOrder;
	}

	@JsonProperty("sortOrder")
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	@JsonProperty("hint")
	public String getHint() {
		return hint;
	}

	@JsonProperty("hint")
	public void setHint(String hint) {
		this.hint = hint;
	}

	@JsonProperty("associatedEntity")
    public StandardMetaData<?> getAssociatedEntity() {
        return associatedEntity;
    }

    @JsonProperty("associatedEntity")
    public void setAssociatedEntity(StandardMetaData<?> associatedEntity) {
        this.associatedEntity = associatedEntity;
    }

    @JsonProperty("options")
    public List<Option> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<Option> options) {
        this.options = options;
    }

	@JsonProperty("fields")
	public List<Field> getFields() {
		return fields;
	}

	@JsonProperty("fields")
	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

	@JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Field{");
        sb.append("name='").append(name).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", dataType='").append(dataType).append('\'');
        sb.append(", dataSpecialization='").append(dataSpecialization).append('\'');
        sb.append(", maxLength=").append(maxLength);
        sb.append(", confidential=").append(confidential);
        sb.append(", optional=").append(optional);
        sb.append(", label='").append(label).append('\'');
        sb.append(", required=").append(required);
        sb.append(", readOnly=").append(readOnly);
        sb.append(", multiValue=").append(multiValue);
        sb.append(", defaultValue=").append(defaultValue);
        sb.append(", inputType='").append(inputType).append('\'');
        sb.append(", optionsType='").append(optionsType).append('\'');
        sb.append(", optionsUrl='").append(optionsUrl).append('\'');
        sb.append(", hideFromSearch=").append(hideFromSearch);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", hint='").append(hint).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", associatedEntity=").append(associatedEntity);
        sb.append(", options=").append(options);
        sb.append(", fields=").append(fields);
        sb.append(", additionalProperties=").append(additionalProperties);
        sb.append('}');
        return sb.toString();
    }
}
