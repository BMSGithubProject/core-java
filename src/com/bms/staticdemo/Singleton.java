package com.bms.staticdemo;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class Singleton  {    
    private Singleton() {}
    
    private static class SingletonHolder {    
        public static final Singleton instance = new Singleton();
    }    

    public static Singleton getInstance() {    
        return SingletonHolder.instance;    
    }    
}