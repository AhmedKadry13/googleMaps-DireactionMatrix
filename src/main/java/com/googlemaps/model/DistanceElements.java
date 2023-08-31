package com.googlemaps.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
public class DistanceElements {

    @Getter @Setter @JsonSetter("distance")
    private Distance distance;

    @Getter @Setter @JsonSetter("duration")
    private Duration duration;

    @Getter @Setter @JsonSetter("status")
    private String status;

    @Override
    public String toString() {
        return "DistanceElements{" +
            "distance=" + distance +
            ", duration=" + duration +
            ", status='" + status + '\'' +
            '}';
    }
}
