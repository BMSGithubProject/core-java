package com.bms.classloader;


import java.util.ArrayList;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class PrintClassLoader {

    public void printClassLoaders() throws ClassNotFoundException {

        System.out.println("Classloader of this class:" + PrintClassLoader.class.getClassLoader());
        System.out.println("Classloader of ArrayList:" + ArrayList.class.getClassLoader());

    }
}
