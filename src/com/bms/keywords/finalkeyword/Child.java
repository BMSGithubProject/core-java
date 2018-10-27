package com.bms.keywords.finalkeyword;


/** Created - 27/10/2017
 * @author BMS Team
 */
public final class Child extends Parent {

    @Override
    void method1(int arg1, final int arg2) {
        // OK
    }

/*    @Override
    void method2() {
        // Compilation error
    }*/

}
