package com.bms.console;

import java.io.Console;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class ConsoleConsoleClass {

    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.print("No console available");
            return;
        }

        String progLanguauge = console.readLine("Enter your favourite programming language: ");
        console.printf(progLanguauge + " is very interesting!");

        char[] pass = console.readPassword("To finish, enter password: ");
        
        if ("bms".equals(pass.toString().toUpperCase()))
            console.printf("Good! Regards!");
        else 
            console.printf("Nice try. Regards.");

    }
}
