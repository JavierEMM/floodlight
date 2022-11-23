package net.floodlightcontroller.mactracker;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class StringSetSerializer extends JsonSerializer<StringClass> {
    @Override
    public void serialize(StringClass s, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("IP",s.getIP());
        jsonGenerator.writeStringField("MAC",s.getMAC());
        jsonGenerator.writeEndObject();
    }
}
