package com.bms.exceptions;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class IllegalArgument {

	public static void main(String[] args) {
		try {
			Thread.sleep(-1000);
		} catch (InterruptedException e) {
			System.err.println("IllegalArgumentException caught!");
		}
	}

}
