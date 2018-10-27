package com.bms.collections.list.listoflist;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class Pencil implements Stationery{
    
    public String name;
    
    public Pencil(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}