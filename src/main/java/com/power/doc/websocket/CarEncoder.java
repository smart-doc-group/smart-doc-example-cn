package com.power.doc.websocket;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.power.doc.entity.Car;
import jakarta.websocket.EncodeException;
import jakarta.websocket.Encoder;

/**
 * car encoder; car to json string
 *
 * @author linwumingshi
 */
public class CarEncoder implements Encoder.Text<Car> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String encode(Car object) throws EncodeException {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
