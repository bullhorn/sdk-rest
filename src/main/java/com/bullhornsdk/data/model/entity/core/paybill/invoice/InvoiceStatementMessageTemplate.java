package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created by fayranne.lipton 4/6/2020
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "dateAdded", "messageText", "name", "owner", "subject" })
public class InvoiceStatementMessageTemplate implements QueryEntity, UpdateEntity, CreateEntity {

    private Integer id;

    private DateTime dateAdded;

    private String messageText;

    @Size(max = 100)
    private String name;

    private CorporateUser owner;

    @Size(max = 100)
    private String subject;

    public InvoiceStatementMessageTemplate() {
    }

    public InvoiceStatementMessageTemplate(Integer id) {
        this.id = id;
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

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @ReadOnly
    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("messageText")
    public String getMessageText() {
        return messageText;
    }

    @JsonProperty("messageText")
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("owner")
    public CorporateUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceStatementMessageTemplate that = (InvoiceStatementMessageTemplate) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(messageText, that.messageText) &&
            Objects.equals(name, that.name) &&
            Objects.equals(owner, that.owner) &&
            Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateAdded, messageText, name, owner, subject);
    }

    @Override
    public String toString() {
        return "InvoiceStatementMessageTemplate{" +
            "id=" + id +
            ", dateAdded=" + dateAdded +
            ", messageText='" + messageText + '\'' +
            ", name='" + name + '\'' +
            ", owner=" + owner +
            ", subject='" + subject + '\'' +
            '}';
    }
}
