package com.bms.memoryleaks.finalize;

import java.nio.charset.Charset;
import java.util.Random;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class BulkyObjectOptimized {
    private String data[];
    
    public BulkyObjectOptimized() {
        data = new String[1000000];
        
        for(int i=0; i<1000000; i++) {
            data[i] = getRandomString();
        }
    }
    
    private String getRandomString() {
        byte[] array = new byte[1000];
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }
}
