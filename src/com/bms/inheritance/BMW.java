package com.bms.inheritance;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class BMW extends Car {
    public BMW() {
    	super(5, "BMW");
    }
	
	@Override
    public String toString() {
    	return model;
    }
}
