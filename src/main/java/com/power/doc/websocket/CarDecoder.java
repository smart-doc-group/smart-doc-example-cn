package com.power.doc.websocket;

import tools.jackson.databind.ObjectMapper;
import tools.jackson.core.JacksonException;
import com.power.doc.entity.Car;
import jakarta.websocket.DecodeException;
import jakarta.websocket.Decoder;

/**
 * car decoder; json string to car
 *
 * @author linwumingshi
 */
public class CarDecoder implements Decoder.Text<Car> {

    private final ObjectMapper objectMapper = new ObjectMapper();


    @Override
    public Car decode(String s) throws DecodeException {
        try {
            return objectMapper.readValue(s, Car.class);
        } catch (JacksonException e) {
            throw new DecodeException(s, "Error decoding Car", e);
        }
    }

    @Override
    public boolean willDecode(String s) {
        return true;
    }
}