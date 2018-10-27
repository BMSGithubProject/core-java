package com.bms.zoneddatetime;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class OffsetDateTimeExample {

    public OffsetDateTime getCurrentTimeByZoneOffset(String offset) {
        ZoneOffset zoneOffSet= ZoneOffset.of(offset);
        OffsetDateTime date = OffsetDateTime.now(zoneOffSet);
        return date;
    }
}
