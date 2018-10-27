package com.bms.keyword.superkeyword;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class SuperBase {

    String message = "super class";

    public SuperBase() {
    }

    public SuperBase(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }
}
