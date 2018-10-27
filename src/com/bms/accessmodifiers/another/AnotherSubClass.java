package com.bms.accessmodifiers.another;

import com.bms.accessmodifiers.SuperPublic;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class AnotherSubClass extends SuperPublic {
    public AnotherSubClass() {
        SuperPublic.publicMethod(); // Available everywhere.
        SuperPublic.protectedMethod(); // Available in subclass. Let's note different package.
    }
}
