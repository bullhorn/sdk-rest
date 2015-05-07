package com.bullhornsdk.data.api.helper;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;

public class CustomDeserializationProblemHandler extends DeserializationProblemHandler {

    
    @Override
    public boolean handleUnknownProperty(DeserializationContext ctxt, JsonParser jp,
            JsonDeserializer<?> deserializer, Object beanOrClass, String propertyName)
        throws IOException, JsonProcessingException
    {
        return false;
    }
}
