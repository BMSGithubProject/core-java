package com.bms.chainedexception.exceptions;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class ManagerUpsetException extends Exception {

    public ManagerUpsetException(String message, Throwable cause) {
        super(message, cause);
    }

    public ManagerUpsetException(String message) {
        super(message);
    }
}
