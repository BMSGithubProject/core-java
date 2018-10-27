package com.bms.keyword;

import com.bms.keyword.superkeyword.SuperSub;
import com.bms.keyword.thiskeyword.KeywordUnitTest;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class KeywordDemo {

    public static void main(String[] args) {
        KeywordUnitTest keyword = new KeywordUnitTest();

        SuperSub child = new SuperSub("message from the child class");
    }
}
