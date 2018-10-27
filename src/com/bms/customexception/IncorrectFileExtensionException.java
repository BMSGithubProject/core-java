package com.bms.customexception;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class IncorrectFileExtensionException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public IncorrectFileExtensionException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
