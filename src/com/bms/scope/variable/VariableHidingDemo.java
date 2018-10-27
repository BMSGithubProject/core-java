package com.bms.scope.variable;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class VariableHidingDemo {
    public static void main(String[] args) {
        HideVariable variable = new HideVariable();
        variable.printLocalVariable();
        variable.printInstanceVariable();

        ParentVariable parentVariable = new ParentVariable();
        ParentVariable childVariable = new ChildVariable();

        parentVariable.printInstanceVariable();
        childVariable.printInstanceVariable();
    }
}
