package com.power.doc.websocket;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.power.common.model.CommonResult;
import jakarta.websocket.EncodeException;
import jakarta.websocket.Encoder;

/**
 * object encoder; object to result json string
 *
 * @author linwumingshi
 */
public class ObjectEncoder implements Encoder.Text<CommonResult<?>> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String encode(CommonResult<?> object) throws EncodeException {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
