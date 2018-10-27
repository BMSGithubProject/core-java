package com.bms.collections.combiningcollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class CombiningLists {
    
    public static List<Object> usingNativeJava(List<Object> first, List<Object> second) {
        List<Object> combined = new ArrayList<>();
        combined.addAll(first);
        combined.addAll(second);
        return combined;
    }
    
    public static List<Object> usingJava8ObjectStream(List<Object> first, List<Object> second) {
        List<Object> combined = Stream.concat(first.stream(), second.stream()).collect(Collectors.toList());
        return combined;
    }

    public static List<Object> usingJava8FlatMaps(List<Object> first, List<Object> second) {
        List<Object> combined = Stream.of(first, second).flatMap(Collection::stream).collect(Collectors.toList());
        return combined;
    }
    
    
}
