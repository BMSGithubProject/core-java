package com.bms.outofmemoryerror;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class OutOfMemoryGCLimitExceed {
    public static void addRandomDataToMap() {
        Map<Integer, String> dataMap = new HashMap<>();
        Random r = new Random();
        while (true) {
            dataMap.put(r.nextInt(), String.valueOf(r.nextInt()));
        }
    }

    public static void main(String[] args) {
        OutOfMemoryGCLimitExceed.addRandomDataToMap();
    }
}
