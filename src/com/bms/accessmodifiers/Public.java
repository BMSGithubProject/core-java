package com.bms.accessmodifiers;


/** Created - 27/10/2017
 * @author BMS Team
 */
public class Public {
    public Public() {
        SuperPublic.publicMethod(); // Available everywhere.
        SuperPublic.protectedMethod(); // Available in the same package or subclass.
        SuperPublic.defaultMethod(); // Available in the same package.
    }
}
