package com.bms.methodoverloadingoverriding.model;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class Car extends Vehicle {

    @Override
    public String accelerate(long mph) {
        return "The car accelerates at : " + mph + " MPH.";
    }
}
