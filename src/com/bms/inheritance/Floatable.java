package com.bms.inheritance;

/** Created - 27/10/2017
 * @author BMS Team
 */
public interface Floatable {
    int duration = 10;
    void floatOnWater();
    
    default void repair() {
        System.out.println("Repairing Floatable object");   
    }
}
