package com.bms.exceptions;

import java.net.MalformedURLException;
import java.net.URL;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class MalformedURL {

	public static void main(String[] args) {

		URL bmsURL = null;

		try {
			bmsURL = new URL("malformedurl");
		} catch (MalformedURLException e) {
			System.err.println("MalformedURLException caught!");
		}

	}

}
