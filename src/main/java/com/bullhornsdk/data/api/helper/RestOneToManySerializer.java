package com.bullhornsdk.data.api.helper;

import java.io.IOException;

import com.bullhornsdk.data.model.entity.core.customobjectinstances.CustomObjectInstance;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class RestOneToManySerializer extends JsonSerializer<OneToMany<?>> {

	public RestOneToManySerializer() {
	}

	@Override
	public void serialize(OneToMany<?> value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		jgen.writeStartArray();

		for(Object object : value.getData()) {
			jgen.writeObject(object);
		}

		jgen.writeEndArray();
	}

}
