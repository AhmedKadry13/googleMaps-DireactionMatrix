package com.googlemaps.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Duration {

    @Getter @Setter @JsonSetter("text")
    private String text;

    @Getter @Setter @JsonSetter("value")
    private String value;

    @Override
    public String toString() {
        return "Distance{" +
            "text='" + text + '\'' +
            ", value='" + value + '\'' +
            '}';
    }

}
