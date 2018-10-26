package com.qcwoshou.config.adapter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.List;

public class NullListJsonSerializer extends JsonSerializer<Object> {

	@Override
	public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
	    if (value == null) {
	    	gen.writeStartArray();
	        gen.writeEndArray();
	    } else {
	        gen.writeObject((List)value);
	    }
	}

}
