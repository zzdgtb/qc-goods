package com.qcwoshou.config.adapter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class NullStringJsonSerializer extends JsonSerializer<Object> {
  

  @Override
  public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
      if (value == null) {
          jgen.writeObject("");
      } else {
          jgen.writeObject(value);
      }
  }

}
