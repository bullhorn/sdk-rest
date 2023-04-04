package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.util.Objects;

@JsonRootName("data")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TearsheetRecipient extends AbstractEntity implements QueryEntity, UpdateEntity {

    private Integer id;
    private Integer candidateRestrictionBits;
    private String comments;
    private DateTime dateAdded;
    private Boolean isSent;
    private JobOrder jobOrder;
    private Person person;
    private Tearsheet tearsheet;

    public TearsheetRecipient() {
    }


    public Integer getId() {
        return this.id;
    }

    public Integer getCandidateRestrictionBits() {
        return this.candidateRestrictionBits;
    }

    public String getComments() {
        return this.comments;
    }

    public DateTime getDateAdded() {
        return this.dateAdded;
    }

    public Boolean getIsSent() {
        return this.isSent;
    }

    public JobOrder getJobOrder() {
        return this.jobOrder;
    }

    public Person getPerson() {
        return this.person;
    }

    public Tearsheet getTearsheet() {
        return this.tearsheet;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCandidateRestrictionBits(Integer candidateRestrictionBits) {
        this.candidateRestrictionBits = candidateRestrictionBits;
    }

    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setIsSent(Boolean isSent) {
        this.isSent = isSent;
    }

    public void setJobOrder(JobOrder jobOrder) {
        this.jobOrder = jobOrder;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setTearsheet(Tearsheet tearsheet) {
        this.tearsheet = tearsheet;
    }

    public String toString() {
        return "TearsheetRecipient(id=" + this.getId() + ", candidateRestrictionBits=" + this.getCandidateRestrictionBits() + ", comments=" + this.getComments() + ", dateAdded=" + this.getDateAdded() + ", isSent=" + this.getIsSent() + ", jobOrder=" + this.getJobOrder() + ", person=" + this.getPerson() + ", tearsheet=" + this.getTearsheet() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TearsheetRecipient that = (TearsheetRecipient) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(candidateRestrictionBits, that.candidateRestrictionBits))
            return false;
        if (!Objects.equals(comments, that.comments)) return false;
        if (!Objects.equals(dateAdded, that.dateAdded)) return false;
        if (!Objects.equals(isSent, that.isSent)) return false;
        if (!Objects.equals(jobOrder, that.jobOrder)) return false;
        if (!Objects.equals(person, that.person)) return false;
        return Objects.equals(tearsheet, that.tearsheet);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (candidateRestrictionBits != null ? candidateRestrictionBits.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (isSent != null ? isSent.hashCode() : 0);
        result = 31 * result + (jobOrder != null ? jobOrder.hashCode() : 0);
        result = 31 * result + (person != null ? person.hashCode() : 0);
        result = 31 * result + (tearsheet != null ? tearsheet.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    public void setComments(String comments) {
        this.comments = comments;
    }
}
