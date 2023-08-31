package com.googlemaps;

import java.util.List;
import java.util.stream.Collectors;

public class HelperUtils {

    //function to call toString() of T in list
    public static <T> String getListAsString(List<T> items) {
        List<String> res = items.stream().map(Object::toString).collect(Collectors.toList());
        return String.join(", ", res);
    }
    
}
