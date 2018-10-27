package com.bms.methodoverloadingoverriding.util;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class Multiplier {
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
}
