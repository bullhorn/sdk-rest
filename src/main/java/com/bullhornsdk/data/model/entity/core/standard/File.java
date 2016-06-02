package com.bullhornsdk.data.model.entity.core.standard;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "companyID", "dateAdded", "description", "fileName", "firstName", "jobPostingID", "lastName", "name", "title",
        "type", "userID", "userType" })
public class File extends AbstractEntity implements QueryEntity {

	private BigDecimal luceneScore;

	private Integer id;

    private Integer companyID;

    private DateTime dateAdded;

    private String description;

    private String fileName;

    private String firstName;

    private Integer jobPostingID;

    private String lastName;

    private String name;

    private String title;

    private String type;

    private Integer userID;

    private String userType;

	public File() {
		super();
	}

	@JsonIgnore
	public BigDecimal getLuceneScore() {
		return luceneScore;
	}

	@JsonProperty("_score")
	public void setLuceneScore(BigDecimal luceneScore) {
		this.luceneScore = luceneScore;
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

    @JsonProperty("companyID")
    public Integer getCompanyID() {
        return companyID;
    }

    @JsonProperty("companyID")
    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
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

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("fileName")
    public String getFileName() {
        return fileName;
    }

    @JsonProperty("fileName")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("jobPostingID")
    public Integer getJobPostingID() {
        return jobPostingID;
    }

    @JsonProperty("jobPostingID")
    public void setJobPostingID(Integer jobPostingID) {
        this.jobPostingID = jobPostingID;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("userID")
    public Integer getUserID() {
        return userID;
    }

    @JsonProperty("userID")
    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    @JsonProperty("userType")
    public String getUserType() {
        return userType;
    }

    @JsonProperty("userType")
    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof File)) return false;

        File file = (File) o;

        if (luceneScore != null ? !luceneScore.equals(file.luceneScore) : file.luceneScore != null) return false;
        if (id != null ? !id.equals(file.id) : file.id != null) return false;
        if (companyID != null ? !companyID.equals(file.companyID) : file.companyID != null) return false;
        if (dateAdded != null ? !dateAdded.equals(file.dateAdded) : file.dateAdded != null) return false;
        if (description != null ? !description.equals(file.description) : file.description != null) return false;
        if (fileName != null ? !fileName.equals(file.fileName) : file.fileName != null) return false;
        if (firstName != null ? !firstName.equals(file.firstName) : file.firstName != null) return false;
        if (jobPostingID != null ? !jobPostingID.equals(file.jobPostingID) : file.jobPostingID != null) return false;
        if (lastName != null ? !lastName.equals(file.lastName) : file.lastName != null) return false;
        if (name != null ? !name.equals(file.name) : file.name != null) return false;
        if (title != null ? !title.equals(file.title) : file.title != null) return false;
        if (type != null ? !type.equals(file.type) : file.type != null) return false;
        if (userID != null ? !userID.equals(file.userID) : file.userID != null) return false;
        return userType != null ? userType.equals(file.userType) : file.userType == null;

    }

    @Override
    public int hashCode() {
        int result = luceneScore != null ? luceneScore.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (companyID != null ? companyID.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (jobPostingID != null ? jobPostingID.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (userID != null ? userID.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder("File {")
                .append("\n\t\"luceneScore\": ")
                .append(luceneScore)
                .append(",\n\t\"id\": ")
                .append(id)
                .append(",\n\t\"companyID\": ")
                .append(companyID)
                .append(",\n\t\"dateAdded\": ")
                .append(dateAdded)
                .append(",\n\t\"description\": ")
                .append("'")
                .append(description).append('\'')
                .append(",\n\t\"fileName\": ")
                .append("'")
                .append(fileName).append('\'')
                .append(",\n\t\"firstName\": ")
                .append("'")
                .append(firstName).append('\'')
                .append(",\n\t\"jobPostingID\": ")
                .append(jobPostingID)
                .append(",\n\t\"lastName\": ")
                .append("'")
                .append(lastName).append('\'')
                .append(",\n\t\"name\": ")
                .append("'")
                .append(name).append('\'')
                .append(",\n\t\"title\": ")
                .append("'")
                .append(title).append('\'')
                .append(",\n\t\"type\": ")
                .append("'")
                .append(type).append('\'')
                .append(",\n\t\"userID\": ")
                .append(userID)
                .append(",\n\t\"userType\": ")
                .append("'")
                .append(userType).append('\'')
                .append('}')
                .toString();
    }
}
