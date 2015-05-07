package com.bullhornsdk.data.model.response.crud;

import java.util.List;

/**
 * Response from an insert, update or delete request.
 * 
 * @author magnus.palm
 * 
 */
public interface CrudResponse {

    /**
     * The BullhornEntity type.
     * @return
     */
    public String getChangedEntityType();

    public void setChangedEntityType(String changedEntityType);

    /**
     * The id of the impacted BullhornEntity
     * @return
     */
    public Integer getChangedEntityId();

    public void setChangedEntityId(Integer changedEntityId);

    public String getChangeType();

    public void setChangeType(String changeType);

    /**
     * Any messages returned from the request, both warnings and errors (such as 400 and 500 errors).
     * 
     * @return
     */
    public List<Message> getMessages();

    public void setMessages(List<Message> messages);

    /**
     * A 400 or 500 error code. If this errorCode is not a blank String something bad happened.
     * 
     * @return
     */
    public String getErrorCode();

    public void setErrorCode(String errorCode);

    /**
     * The error message if a 400 or 500 error code was returned from the request.
     * 
     * @return
     */
    public String getErrorMessage();

    public void setErrorMessage(String errorMessage);

    /**
     * Retruns true if api insert, update or delete failed because of validation errors.
     * 
     * @return
     */
    public boolean hasValidationErrors();

    /**
     * Returns true if any message was returned from the request, either messages from the server or validation messages.
     * 
     * @return
     */
    public boolean hasMessages();

    /**
     * Returns true if the request returned any errors, (such as 400 or 500 error codes). This represents a completely failed
     * attempt.
     * 
     * @return true if an error exists.
     */
    public boolean isError();

    /**
     * Returns true if any warning messages was returned from the request.
     * 
     * @return
     */
    public boolean hasWarnings();

    /**
     * Adds one Message to the message list.
     * 
     * @param message
     */
    public void addOneMessage(Message message);

}
