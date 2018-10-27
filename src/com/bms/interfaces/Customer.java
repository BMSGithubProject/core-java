package com.bms.interfaces;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class Customer {
    public interface List {
        void Add(Customer customer);

        String getCustomerNames();
    }

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
