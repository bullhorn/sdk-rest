package com.bullhornsdk.data.api.helper;

import com.bullhornsdk.data.api.helper.json.DynamicNullValueFilter;
import com.bullhornsdk.data.exception.RestMappingException;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Collections;
import java.util.Set;

public class RestJsonConverter {

    private static Logger log = Logger.getLogger(RestJsonConverter.class);

    private final ObjectMapper objectMapperWrapped;

    private final ObjectMapper objectMapperStandard;

    public RestJsonConverter() {
        super();
        this.objectMapperWrapped = createObjectMapperWithRootUnWrap();
        this.objectMapperStandard = createObjectMapper();
    }

    /*
     * **************************************************************************************************************
     * json/java conversion
     * **************************************************************************************************************
     */

    /**
     * Create the ObjectMapper that deserializes entity to json String.
     *
     * Registers the JodaModule to convert DateTime so-called epoch timestamp (number of milliseconds since January 1st, 1970,
     * UTC)
     *
     * @return
     */
    private ObjectMapper createObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JodaModule());
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapper.setFilterProvider(createFieldFilter(Collections.emptySet()));
        return mapper;
    }

    /**
     * Creates the ObjectMapper that serializes json to entity. Wraps the root (most often "data").
     *
     * See @JsonRootName on the RestEntities
     *
     * @return
     */
    private ObjectMapper createObjectMapperWithRootUnWrap() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        mapper.addHandler(new CustomDeserializationProblemHandler());
        mapper.setFilterProvider(createFieldFilter(Collections.emptySet()));
        mapper.registerModule(new JodaModule());
        return mapper;
    }

    /**
     * Converts a jsonString to an object of type T. Unwraps from root, most often this means that the "data" tag is ignored and
     * that the entity is created from within that data tag.
     *
     * @param jsonString
     *            the returned json from the api call.
     * @param type
     *            the type to convert to
     * @return a type T
     */
    public <T> T jsonToEntityUnwrapRoot(String jsonString, Class<T> type) {
        return jsonToEntity(jsonString, type, this.objectMapperWrapped);
    }

    public <T> T jsonToEntityDoNotUnwrapRoot(String jsonString, Class<T> type) {
        return jsonToEntity(jsonString, type, this.objectMapperStandard);
    }

    public <T> T jsonToEntity(String jsonString, Class<T> type, ObjectMapper objectMapper) {

        try {
            return objectMapper.readValue(jsonString, type);
        } catch(JsonParseException e) {
            throw new RestMappingException("Error mapping jsonString to " + type + ". jsonString = " + jsonString, e);
        } catch(JsonMappingException e) {
            throw new RestMappingException("Error mapping jsonString to " + type + ". jsonString = " + jsonString, e);
        } catch(IOException e) {
            throw new RestMappingException("Error mapping jsonString to " + type + ". jsonString = " + jsonString, e);
        }
    }

    /**
     * Takes a BullhornEntity and converts it to a String in json format.
     *
     * @param entity
     *            a BullhornEntity
     * @return the jsonString
     */
    public <T extends BullhornEntity> String convertEntityToJsonString(T entity) {
        String jsonString = "";
        try {
            jsonString = objectMapperStandard.writeValueAsString(entity);
        } catch (JsonProcessingException e) {
            log.error("Error deserializing entity of type" + entity.getClass() + " to jsonString.", e);
        }
        return jsonString;
    }

    /**
     * Takes a BullhornEntity and converts it to a String in json format, optionally including null values.
     *
     * @param entity
     *            a BullhornEntity
     * @param nullBypassFields fields to include regardless of whether they are null.
     * @return the jsonString
     */
    public <T extends BullhornEntity> String convertEntityToJsonString(T entity, Set<String> nullBypassFields) {
        String jsonString = "";
        try {
            jsonString = objectMapperStandard.writer(createFieldFilter(nullBypassFields)).writeValueAsString(entity);
        } catch (JsonProcessingException e) {
            log.error("Error deserializing entity of type" + entity.getClass() + " to jsonString.", e);
        }
        return jsonString;
    }

    private FilterProvider createFieldFilter(Set<String> nullBypassFields) {
        return new SimpleFilterProvider().addFilter(DynamicNullValueFilter.FILTER_NAME, new DynamicNullValueFilter(nullBypassFields));
    }
}
