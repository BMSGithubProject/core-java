package com.bms.nth.root.main;

import com.bms.nth.root.calculator.NthRootCalculator;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class Main {
    public static void main(String[] args) {
        NthRootCalculator calculator = new NthRootCalculator();
        Double base = Double.parseDouble(args[0]);
        Double n = Double.parseDouble(args[1]);
        Double result = calculator.calculate(base, n);
        System.out.println("The " + n + " root of " + base + " equals to " + result + ".");
    }
}
