package com.bms.inheritance;

/** Created - 27/10/2017
 * @author BMS Team
 */
public interface SpaceTraveller extends Floatable, Flyable {
    int duration = 10;
    void remoteControl();
}