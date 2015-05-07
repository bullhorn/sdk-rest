package com.bullhornsdk.data.model.response.crud;

import com.bullhornsdk.data.model.enums.ChangeType;

/**
 * Contains the response from an entity insert.
 * 
 * Any response messages from bh AND validation errors from our own side will be added to messages.
 * 
 * @author magnus.palm
 * 
 */

public class CreateResponse extends AbstractCrudResponse {

    public CreateResponse(){
        this.setChangeType(ChangeType.INSERT.toString());
    }
    
}
