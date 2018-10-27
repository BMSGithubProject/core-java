package com.bms.exceptions;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class GlobalExceptionHandler {

	public static void main(String[] args) {

		Handler globalExceptionHandler = new Handler();
		Thread.setDefaultUncaughtExceptionHandler(globalExceptionHandler);
		new GlobalExceptionHandler().performArithmeticOperation(10, 0);
	}

	public int performArithmeticOperation(int num1, int num2) {
		return num1 / num2;
	}

}

class Handler implements Thread.UncaughtExceptionHandler {

	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Unhandled exception caught!");
	}
}
