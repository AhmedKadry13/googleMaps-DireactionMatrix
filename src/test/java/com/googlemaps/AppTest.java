package com.googlemaps;

import org.junit.jupiter.api.Test;

import com.googlemaps.model.DirectionResponse;
import com.googlemaps.model.Point;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AppTest {

    @Test
    void testApp() {

        Point origin = new Point(25.0663661,55.2162454);
        Point destination = new Point(25.065923914565097,55.21645995498684);

        double expectedDistance = 0.054;

        DirectionResponse response = GoogleMapsDistance.measure(origin, destination);
        assertEquals(expectedDistance, response.getDistanceValue());
    }
}
