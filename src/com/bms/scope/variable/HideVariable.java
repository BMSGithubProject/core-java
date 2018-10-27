package com.bms.scope.variable;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class HideVariable {

    private String message = "this is instance variable";

    HideVariable() {
        String message = "constructor local variable";
        System.out.println(message);
    }

    public void printLocalVariable() {
        String message = "method local variable";
        System.out.println(message);
    }

    public void printInstanceVariable() {
        System.out.println(this.message);
    }
}
