package com.bms.zoneddatetime;

import java.time.OffsetTime;
import java.time.ZoneOffset;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class OffsetTimeExample {

    public OffsetTime getCurrentTimeByZoneOffset(String offset) {
        ZoneOffset zoneOffSet = ZoneOffset.of(offset);
        OffsetTime time = OffsetTime.now(zoneOffSet);
        return time;
    }
}
