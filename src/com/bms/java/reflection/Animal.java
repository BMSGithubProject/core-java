package com.bms.java.reflection;

/** Created - 27/10/2017
 * @author BMS Team
 */
public abstract class Animal implements Eating {

    public static final String CATEGORY = "domestic";

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract String getSound();

}
