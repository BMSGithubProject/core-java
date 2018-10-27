package com.bms.accessmodifiers.another;

import com.bms.accessmodifiers.SuperPublic;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class AnotherSuperPublic {
    public AnotherSuperPublic() {
        SuperPublic.publicMethod(); // Available everywhere. Let's note different package.
    }
}
