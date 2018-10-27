package com.bms.customexception;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class IncorrectFileNameException extends Exception {
    private static final long serialVersionUID = 1L;
    
    public IncorrectFileNameException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
