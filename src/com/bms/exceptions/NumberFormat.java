package com.bms.exceptions;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class NumberFormat {

	public static void main(String[] args) {

		String str1 = "100ABCD";

		try {
			int x = Integer.parseInt(str1); // Converting string with inappropriate format
			int y = Integer.valueOf(str1);
		} catch (NumberFormatException e) {
			System.err.println("NumberFormatException caught!");
		}

	}

}
