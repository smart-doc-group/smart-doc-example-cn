package com.power.doc.filter;

import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.ValueSerializer;
import tools.jackson.databind.SerializationContext;
import org.apache.commons.text.StringEscapeUtils;

/**
 * @author yu 2019/1/20.
 */
public class XssStringJsonSerializer extends ValueSerializer<String> {

    @Override
    public Class<?> handledType() {
        return String.class;
    }

    @Override
    public void serialize(String value, JsonGenerator jsonGenerator,
                          SerializationContext serializationContext) {
        if (value != null) {
            String encodedValue = StringEscapeUtils.escapeHtml4(value);
            jsonGenerator.writeString(encodedValue);
        }
    }
}
