package com.bms.exceptions;


/** Created - 27/10/2017
 * @author BMS Team
 */
public class Arithmetic {


    public static void main(String[] args) {

        try {
            int result = 30 / 0; // Trying to divide by zero
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught!");
        }

    }

}
