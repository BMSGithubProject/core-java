package com.bms.stackoverflowerror;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class UnintendedInfiniteRecursion {
    public int calculateFactorial(int number) {
        return number * calculateFactorial(number - 1);
    }
}
