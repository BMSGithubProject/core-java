package com.bms.exceptions;

/** Created - 27/10/2017
 * @author BMS Team
 */
class ChildThread extends Thread {

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.err.println("InterruptedException caught!");
		}
	}

}

public class InterruptedExceptionExample {

	public static void main(String[] args) throws InterruptedException {
		ChildThread childThread = new ChildThread();
		childThread.start();
		childThread.interrupt();
	}

}
