package com.bms.exceptions;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class ArrayIndexOutOfBounds {


    public static void main(String[] args) {

        int[] nums = new int[] { 1, 2, 3 };

        try {
            int numFromNegativeIndex = nums[-1]; // Trying to access at negative index
            int numFromGreaterIndex = nums[4]; // Trying to access at greater index
            int numFromLengthIndex = nums[3]; // Trying to access at index equal to size of the array
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException caught");
        }

    }

}
