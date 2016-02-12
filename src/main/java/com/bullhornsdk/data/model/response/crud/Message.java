package com.bullhornsdk.data.model.response.crud;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.FieldError;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A message about the failed update.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "detailMessage", "propertyName", "severity", "type" })
public class Message {

	private String detailMessage;

	private String propertyName;

	private String severity;

	private String type;

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Message() {
		super();
	}

	public Message(FieldError fieldError) {
		super();
		this.detailMessage = fieldError.getDefaultMessage() + ". REJECTED VALUE = " + fieldError.getRejectedValue();
		this.propertyName = fieldError.getField();
		this.severity = "ERROR";
		this.type = "VALIDATION_ERROR";
	}

	@JsonProperty("detailMessage")
	public String getDetailMessage() {
		return detailMessage;
	}

	@JsonProperty("detailMessage")
	public void setDetailMessage(String detailMessage) {
		this.detailMessage = detailMessage;
	}

	@JsonProperty("propertyName")
	public String getPropertyName() {
		return propertyName;
	}

	@JsonProperty("propertyName")
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	@JsonProperty("severity")
	public String getSeverity() {
		return severity;
	}

	@JsonProperty("severity")
	public void setSeverity(String severity) {
		this.severity = severity;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperties(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	/**
	 * Returns a Message with Severity set to ERROR and the detailMessage set to what is passed in.
	 * 
	 * @param detailMessage
	 * @return Returns a Message with Severity set to ERROR and the detailMessage set to what is passed in.
	 */
	@JsonIgnore
	public static Message errorMessage(String detailMessage) {
		Message message = new Message();
		message.setDetailMessage(detailMessage);
		message.setSeverity("ERROR");
		message.setType("");
		return message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" {\ndetailMessage=");
		builder.append(detailMessage);
		builder.append(", \npropertyName=");
		builder.append(propertyName);
		builder.append(", \nseverity=");
		builder.append(severity);
		builder.append(", \ntype=");
		builder.append(type);
		builder.append("\n}");
		return builder.toString();
	}

}
