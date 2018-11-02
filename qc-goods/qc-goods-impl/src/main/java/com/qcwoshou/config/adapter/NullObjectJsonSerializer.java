package com.qcwoshou.config.adapter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @ClassName NullObjectJsonSerializer
 * @Author wh
 * @Date 2018/11/1
 * @Version 1.0.0
 */
public class NullObjectJsonSerializer extends JsonSerializer<Object> {
    @Override
    public void serialize(Object value, JsonGenerator jgen, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        if (value == null) {
            jgen.writeStartObject();
            jgen.writeEndObject();
        } else {
            jgen.writeObject(value);
        }
    }
}
