package com.bms.stackoverflowerror;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class InfiniteRecursionWithTerminationCondition {
    public int calculateFactorial(final int number) {
        return number == 1 ? 1 : number * calculateFactorial(number - 1);
    }
}
