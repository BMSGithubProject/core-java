package com.bms.constructorsstaticfactorymethods.application;

import com.bms.constructorsstaticfactorymethods.entities.User;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class Application {

    public static void main(String[] args) {
        User user1 = User.createWithDefaultCountry("John", "john@domain.com");
        User user2 = User.createWithLoggedInstantiationTime("John", "john@domain.com", "Argentina");
        User user3 = User.getSingletonInstance("John", "john@domain.com", "Argentina");
    }
}