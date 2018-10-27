package com.bms.scope.variable;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class ChildVariable extends ParentVariable {

    String instanceVariable = "child variable";

    public void printInstanceVariable() {
        System.out.println(instanceVariable);
    }
}
