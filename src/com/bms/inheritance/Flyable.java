package com.bms.inheritance;

/** Created - 27/10/2017
 * @author BMS Team
 */
public interface Flyable {
    int duration = 10;
    void fly();
    
    /*
     * Commented 
     */
    //default void repair() {
    //    System.out.println("Repairing Flyable object"); 
    //}
}
