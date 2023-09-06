package com.bullhornsdk.data.api.helper.json.replaceall;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class OneToManySerializer extends StdSerializer<OneToMany<? extends BullhornEntity>> {
    protected OneToManySerializer() {
        super((Class<OneToMany<? extends BullhornEntity>>) (Class<?>) OneToMany.class);
    }

    @Override
    public void serialize(OneToMany<? extends BullhornEntity> value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        int[] ids = value.getData().stream().mapToInt(BullhornEntity::getId).toArray();
        gen.writeStartObject();
        gen.writeFieldName("replaceAll");
        gen.writeArray(ids, 0, ids.length);
        gen.writeEndObject();
    }
}
