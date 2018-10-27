package com.bms.synthetic;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class SyntheticConstructorDemo {

    /**
     * We need to instantiate the {@link NestedClass} using a private
     * constructor from the enclosing instance in order to generate a synthetic
     * constructor.
     */
    private NestedClass nestedClass = new NestedClass();

    /** Created - 27/10/2017
     * @author BMS Team
     */
    class NestedClass {

        /**
         * In order to generate a synthetic constructor, this class must have a
         * private constructor.
         */
        private NestedClass() {
        }
    }

}