package br.com.ddouglss.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class GenderSerializer extends JsonSerializer<String> {
    @Override
    public void serialize(String gender, JsonGenerator gen, SerializerProvider serializer) throws IOException {
        String formatedGender = "Male".equalsIgnoreCase(gender) ? "M" : "F";
        gen.writeString(formatedGender);
    }
}
