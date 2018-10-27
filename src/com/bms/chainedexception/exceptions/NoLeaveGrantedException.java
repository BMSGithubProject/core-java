package com.bms.chainedexception.exceptions;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class NoLeaveGrantedException extends Exception {

    public NoLeaveGrantedException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoLeaveGrantedException(String message) {
        super(message);
    }
}