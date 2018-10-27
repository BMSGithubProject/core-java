package com.bms.collections.java_8_features;


/** Created - 27/10/2017
 * @author BMS Team
 */
public class Car {

    private String model;
    private int topSpeed;

    public Car(String model, int topSpeed) {
        super();
        this.model = model;
        this.topSpeed = topSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }


}
