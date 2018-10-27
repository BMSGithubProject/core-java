package com.bms.chainedexception.exceptions;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class TeamLeadUpsetException extends Exception {

    public TeamLeadUpsetException(String message, Throwable cause) {
        super(message, cause);
    }

    public TeamLeadUpsetException(String message) {
        super(message);
    }
}
