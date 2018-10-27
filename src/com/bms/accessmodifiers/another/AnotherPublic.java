package com.bms.accessmodifiers.another;

import com.bms.accessmodifiers.SuperPublic;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class AnotherPublic {
    public AnotherPublic() {
        SuperPublic.publicMethod(); // Available everywhere.
    }
}
