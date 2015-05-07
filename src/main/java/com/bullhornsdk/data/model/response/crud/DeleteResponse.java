package com.bullhornsdk.data.model.response.crud;

import com.bullhornsdk.data.model.enums.ChangeType;

/**
 * Contains the response from an entity delete.
 * 
 * Any response messages from bh AND validation errors from our own side will be added to messages.
 * 
 * @author magnus.palm
 * 
 */

public class DeleteResponse extends AbstractCrudResponse {
    
    public DeleteResponse() {
        this.setChangeType(ChangeType.DELETE.toString());
    }
}
