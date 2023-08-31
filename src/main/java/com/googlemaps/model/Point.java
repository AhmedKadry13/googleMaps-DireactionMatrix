package com.googlemaps.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;


@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
public class Point {

    @Getter @Setter @JsonSetter("lat")
    private double lat;

    @Getter @Setter @JsonSetter("lng")
    private double lng;

    @JsonIgnore
    public Map<String, String> getPointAsMap() {
        Map<String, String> point = new HashMap<>();
        point.put("lat", String.valueOf(getLat()));
        point.put("lng", String.valueOf(getLng()));
        return point;
    }

    @Override
    public String toString(){
        return getLat() + "," + getLng();
    }
    
}
