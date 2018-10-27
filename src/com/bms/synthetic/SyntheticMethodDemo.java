package com.bms.synthetic;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class SyntheticMethodDemo {

    class NestedClass {

        private String nestedField;
    }

    public String getNestedField() {
        return new NestedClass().nestedField;
    }

    public void setNestedField(String nestedField) {
        new NestedClass().nestedField = nestedField;
    }

}