package com.bullhornsdk.data.api.helper;

import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.client.HttpStatusCodeException;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.response.crud.CrudResponse;
import com.bullhornsdk.data.model.response.crud.Message;

/**
 * 
 * 
 * Error handling for StandardBullhornData
 * 
 * @author Magnus Fiore Palm
 * 
 */
public class RestErrorHandler {

    /**
     * Updates the passed in CrudResponse with the HttpStatusCodeException thrown by the RestTemplate.
     * 
     * @param response
     * @param error
     * @param entity
     * @return
     */
    public <T extends BullhornEntity> CrudResponse handleHttpFourAndFiveHundredErrors(CrudResponse response,
            HttpStatusCodeException error, Integer id) {
        response.setChangedEntityId(id);
        Message message = new Message();
        message.setDetailMessage(error.getResponseBodyAsString());
        message.setSeverity("ERROR");
        message.setType(error.getStatusCode().toString());
        response.addOneMessage(message);
        response.setErrorCode(error.getStatusCode().toString());
        response.setErrorMessage(error.getResponseBodyAsString());
        return response;

    }

    public void handleValidationErrors(CrudResponse response, Errors validationErrors) {

        for (FieldError fieldError : validationErrors.getFieldErrors()) {
            Message message = new Message(fieldError);
            response.addOneMessage(message);
        }

    }
    
    
}
