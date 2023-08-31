package com.googlemaps;


import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.googlemaps.mapper.MatrixMapper;
import com.googlemaps.model.DirectionResponse;
import com.googlemaps.model.Point;

import java.io.IOException;
import java.util.Objects;

public class GoogleMapsDistance {

    private static final Logger logger = LogManager.getLogger(GoogleMapsDistance.class);
    public static DirectionResponse measure(Point origins, Point destinations) {
        //request query params
        String baseUrl = "https://maps.googleapis.com/maps/api/distancematrix/json";
        String apikey = "<add your api key here>";
        String units = "metric";

        //create the OKHttpClient
        OkHttpClient client = new OkHttpClient().newBuilder().build();

        //build the url with query parameters
        HttpUrl.Builder urlBuilder = Objects.requireNonNull(HttpUrl.parse(baseUrl)).newBuilder();
        urlBuilder.addQueryParameter("origins", origins.toString());
        urlBuilder.addQueryParameter("destinations", destinations.toString());
        urlBuilder.addQueryParameter("units", units);
        urlBuilder.addQueryParameter("key", apikey);
        String url = urlBuilder.build().toString();

        logger.info("google distance url : " + url);

        Request request = new Request.Builder()
            .url(url)
            .addHeader("Connection", "close")
            .method("GET", null)
            .build();
        try (Response response = client.newCall(request).execute()){
            assert response.body() != null;
            return MatrixMapper.getMatrix(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
