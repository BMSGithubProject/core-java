package com.bms.methodoverloadingoverriding.model;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class Vehicle {
    
    public String accelerate(long mph) {
        return "The vehicle accelerates at : " + mph + " MPH.";
    }
    
    public String stop() {
        return "The vehicle has stopped.";
    }
    
    public String run() {
        return "The vehicle is running.";
    }
}
