package com.googlemaps.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.googlemaps.HelperUtils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class DistanceInfo {

    @Getter @Setter @JsonSetter("elements")
    private List<DistanceElements> elements;

    @Override
    public String toString() {
        return "DistanceInfo{" +
            "elements=" + HelperUtils.getListAsString(elements) +
            '}';
    }

}
