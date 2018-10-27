package com.bms.collections.combiningcollections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/** Created - 27/10/2017
 * @author BMS Team
 */
public class CombiningSets {
    
    public static Set<Object> usingNativeJava(Set<Object> first, Set<Object> second) {
        Set<Object> combined = new HashSet<>();
        combined.addAll(first);
        combined.addAll(second);
        return combined;
    }
    
    public static Set<Object> usingJava8ObjectStream(Set<Object> first, Set<Object> second) {
        Set<Object> combined = Stream.concat(first.stream(), second.stream()).collect(Collectors.toSet());
        return combined;
    }

    public static Set<Object> usingJava8FlatMaps(Set<Object> first, Set<Object> second) {
        Set<Object> combined = Stream.of(first, second).flatMap(Collection::stream).collect(Collectors.toSet());
        return combined;
    }

    
}
