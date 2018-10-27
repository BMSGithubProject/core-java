package com.bms.casting;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class Cat extends Animal implements Mew {

    public void eat() {
        System.out.println("cat is eating");
    }

    public void meow() {
        System.out.println("meow");
    }
}
