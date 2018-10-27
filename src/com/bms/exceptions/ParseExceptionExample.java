package com.bms.exceptions;

import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class ParseExceptionExample {

	public static void main(String[] args) {

		DateFormat format = new SimpleDateFormat("MM, dd, yyyy");

		try {
			format.parse("01, , 2010");
		} catch (ParseException e) {
			System.err.println("ParseException caught!");
		}
	}

}
