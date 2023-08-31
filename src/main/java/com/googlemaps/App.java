package com.googlemaps;

import com.googlemaps.model.DirectionResponse;
import com.googlemaps.model.Point;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Point origin = new Point(25.0663661,55.2162454);
        Point destination = new Point(25.065923914565097,55.21645995498684);
        DirectionResponse response = GoogleMapsDistance.measure(origin, destination);
        System.out.println("sidtance = " + response.getDistanceValue());

        System.out.println(response);
    }
}
