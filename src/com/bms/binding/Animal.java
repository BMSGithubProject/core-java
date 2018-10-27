package com.bms.binding;


/** Created - 27/10/2017
 * @author BMS Team
 */
public class Animal {

    public void makeNoise() {
        System.out.println("generic animal noise");
    }

    public void makeNoise(Integer repetitions) {
        while(repetitions != 0) {
        	System.out.println("generic animal noise countdown " + repetitions);
            repetitions -= 1;
        }
    }
}
