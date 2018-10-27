package com.bms.finalize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class Finalizable {
    private BufferedReader reader;

    public Finalizable() {
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("file.txt");
        reader = new BufferedReader(new InputStreamReader(input));
    }

    public String readFirstLine() throws IOException {
        String firstLine = reader.readLine();
        return firstLine;
    }

    @Override
    public void finalize() {
        try {
            reader.close();
            System.out.println("Closed BufferedReader in the finalizer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
