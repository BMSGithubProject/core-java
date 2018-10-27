package com.bms.inheritancecomposition.model;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class Actress extends Person {
    
    public Actress(String name, String email, int age) {
        super(name, email, age);
    }
    
    public String readScript(String movie) {
        return "Reading the script of " + movie;
    }
    
    public String performRole() {
        return "Performing a role";
    }
}
