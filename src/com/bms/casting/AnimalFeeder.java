package com.bms.casting;

import java.util.List;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class AnimalFeeder {

    public void feed(List<Animal> animals) {
        animals.forEach(animal -> {
            animal.eat();
            if (animal instanceof Cat) {
                ((Cat) animal).meow();
            }
        });
    }

    public void uncheckedFeed(List<Animal> animals) {
        animals.forEach(animal -> {
            animal.eat();
            ((Cat) animal).meow();
        });
    }

}
