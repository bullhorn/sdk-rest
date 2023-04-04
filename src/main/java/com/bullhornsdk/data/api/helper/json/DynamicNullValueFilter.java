package com.bullhornsdk.data.api.helper.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;

import java.util.Set;

public class DynamicNullValueFilter extends SimpleBeanPropertyFilter {
    public final static String FILTER_NAME = "dynamicNullValue";
    private final Set<String> fieldsToAllow;

    public DynamicNullValueFilter(Set<String> fieldsToAllow) {
        this.fieldsToAllow = fieldsToAllow;
    }

    @Override
    public void serializeAsField(Object pojo, JsonGenerator jgen, SerializerProvider provider, PropertyWriter writer) throws Exception {
        if (include(writer)) {
            if (fieldsToAllow.contains(writer.getName()) || hasNotNullValue(pojo, writer)) {
                writer.serializeAsField(pojo, jgen, provider);
            }
        } else if (!jgen.canOmitFields()) {
            writer.serializeAsOmittedField(pojo, jgen, provider);
        }
    }

    private boolean hasNotNullValue(Object pojo, PropertyWriter writer) {
        return writer.getMember().getValue(pojo) != null;
    }
}
