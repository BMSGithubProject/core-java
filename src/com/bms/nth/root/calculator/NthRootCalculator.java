package com.bms.nth.root.calculator;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class NthRootCalculator
{
    public Double calculate(Double base, Double n) {
        return Math.pow(Math.E, Math.log(base)/n);
    }
}
