package com.bms.fileparser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class ScannerStringExample {

    protected static ArrayList<String> generateArrayListFromFile(String filename) throws IOException {
        
        ArrayList<String> result = new ArrayList<>();

        try (Scanner s = new Scanner(new FileReader(filename))) {

            while (s.hasNext()) {
                result.add(s.nextLine());
            }
            return result;
        }

    }

}
