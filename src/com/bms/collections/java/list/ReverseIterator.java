package com.bms.collections.java.list;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/** Created - 27/10/2017
 * @author BMS Team
 */
/**
 * Provides methods for iterating backward over a list.
 */
public class ReverseIterator {

    /**
     * Iterate using the for loop.
     *
     * @param list the list
     */
    public void iterateUsingForLoop(final List<String> list) {

        for (int i = list.size(); i-- > 0; ) {
            System.out.println(list.get(i));
        }
    }

    /**
     * Iterate using the Java {@link ListIterator}.
     *
     * @param list the list
     */
    public void iterateUsingListIterator(final List<String> list) {

        final ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

    /**
     * Iterate using Java {@link Collections} API.
     *
     * @param list the list
     */
    public void iterateUsingCollections(final List<String> list) {

        Collections.reverse(list);
        for (final String item : list) {
            System.out.println(item);
        }
    }


}
