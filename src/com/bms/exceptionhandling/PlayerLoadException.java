package com.bms.exceptionhandling;

import java.io.IOException;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class PlayerLoadException extends Exception {

    public PlayerLoadException(IOException io) {
        super(io);
    }

}
