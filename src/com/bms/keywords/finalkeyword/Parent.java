package com.bms.keywords.finalkeyword;


/** Created - 27/10/2017
 * @author BMS Team
 */
public class Parent {

    int field1 = 1;
    final int field2 = 2;

    Parent() {
        field1 = 2; // OK
//        field2 = 3; // Compilation error
    }

    void method1(int arg1, final int arg2) {
        arg1 = 2; // OK
//        arg2 = 3; // Compilation error
    }

    final void method2() {
        final int localVar = 2; // OK
//        localVar = 3; // Compilation error
    }

}
