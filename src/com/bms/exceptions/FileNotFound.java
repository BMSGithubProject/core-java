package com.bms.exceptions;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class FileNotFound {

    
    public static void main(String[] args) {
        
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File("/invalid/file/location")));
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException caught!");
        }
    }
    
}
