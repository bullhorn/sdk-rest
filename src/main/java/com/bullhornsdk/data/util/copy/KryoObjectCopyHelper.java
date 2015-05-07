package com.bullhornsdk.data.util.copy;

import org.joda.time.DateTime;

import com.esotericsoftware.kryo.Kryo;

import de.javakaffee.kryoserializers.jodatime.JodaDateTimeSerializer;

public class KryoObjectCopyHelper {

	public static <T> T copy(T entity) {
		Kryo kryo = new Kryo();
		kryo.register( DateTime.class, new JodaDateTimeSerializer() );
		return kryo.copy(entity);
	}

	public static <T> T copyShallow(T entity) {
		Kryo kryo = new Kryo();
		kryo.register( DateTime.class, new JodaDateTimeSerializer() );
		return kryo.copyShallow(entity);
	}

}
