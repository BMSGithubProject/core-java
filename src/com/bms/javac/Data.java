package com.bms.javac;

import java.util.ArrayList;
import java.util.List;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class Data {
    List<String> textList = new ArrayList();

    public void addText(String text) {
        textList.add(text);
    }

    public List getTextList() {
        return this.textList;
    }
}