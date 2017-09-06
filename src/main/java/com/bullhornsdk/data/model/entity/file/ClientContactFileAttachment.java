package com.bullhornsdk.data.model.entity.file;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author Murray
 * @since 11/08/2017
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({
    "id",
    "clientContact",
    "contentSubType",
    "contentType",
    "dateAdded",
    "description",
    "directory",
    "distribution",
    "externalID",
    "fileExtension",
    "fileSize",
    "fileType",
    "isCopied",
    "isDeleted",
    "isExternal",
    "isOpen",
    "isPrivate",
    "isSendOut",
    "name",
    "type",
    "usersSharedWith",
    "uuid"
})
public class ClientContactFileAttachment extends EntityFileAttachmentExtraFields {

    private ClientContact clientContact;

    public ClientContact getClientContact() {
        return clientContact;
    }

    public void setClientContact(ClientContact clientContact) {
        this.clientContact = clientContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ClientContactFileAttachment that = (ClientContactFileAttachment) o;

        return clientContact != null ? clientContact.equals(that.clientContact) : that.clientContact == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (clientContact != null ? clientContact.hashCode() : 0);
        return result;
    }
}
