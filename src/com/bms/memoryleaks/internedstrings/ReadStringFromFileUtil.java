package com.bms.memoryleaks.internedstrings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class ReadStringFromFileUtil {

    public static String read(String fileName) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
