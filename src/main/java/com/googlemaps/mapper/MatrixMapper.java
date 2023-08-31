package com.googlemaps.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.googlemaps.model.DirectionResponse;


public class MatrixMapper {

    public static DirectionResponse getMatrix(String response) {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(response, DirectionResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
