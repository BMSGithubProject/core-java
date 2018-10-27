package com.bms.collections.java.iterable;

import java.util.Collection;
import java.util.stream.StreamSupport;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class IterableSize {

    /**
     * Get the size of {@code Iterable} using Java 7.
     *
     * @param data the iterable
     * @return the size of the iterable
     */
    public static int sizeUsingJava7(final Iterable data) {

        if (data instanceof Collection) {
            return ((Collection<?>) data).size();
        }
        int counter = 0;
        for (final Object i : data) {
            counter++;
        }
        return counter;
    }

    /**
     * Get the size of {@code Iterable} using Java 8.
     *
     * @param data the iterable
     * @return the size of the iterable
     */
    public static long sizeUsingJava8(final Iterable data) {

        return StreamSupport.stream(data.spliterator(), false).count();
    }

    
}
