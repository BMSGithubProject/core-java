package com.bms.typeerasure;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class IntegerStack extends Stack<Integer> {

    public IntegerStack(int capacity) {
        super(capacity);
    }

    public void push(Integer value) {
        System.out.println("Pushing into my integerStack");
        super.push(value);
    }
}
