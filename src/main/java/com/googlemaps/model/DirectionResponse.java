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
public class DirectionResponse {

    @Getter @Setter @JsonSetter("destination_addresses")
    private List<String> destination_addresses;

    @Getter @Setter @JsonSetter("origin_addresses")
    private List<String> origin_addresses;

    @Getter @Setter @JsonSetter("rows")
    private List<DistanceInfo> rows;

    @Getter @Setter @JsonSetter("status")
    private String status;

    public String getDistanceText() {
        return getRows().get(0).getElements().get(0).getDistance().getText();
    }

    public Double getDistanceValue() {
        return Double.parseDouble(rows.get(0).getElements().get(0).getDistance().getValue()) / 1000.0;
    }

    public String getDurationText() {
        return getRows().get(0).getElements().get(0).getDuration().getText();
    }

    @Override
    public String toString() {
        return "DirectionResponse{" +
            "destination_addresses=" +  HelperUtils.getListAsString(destination_addresses) +
            ", origin_addresses=" +  HelperUtils.getListAsString(origin_addresses) +
            ", rows=" + HelperUtils.getListAsString(rows) +
            ", status='" + status + '\'' +
            '}';
    }

}
