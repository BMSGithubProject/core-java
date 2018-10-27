package com.bms.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class CommaSeparatedCustomers implements Customer.List {

    private List<Customer> customers = new ArrayList<Customer>();

    @Override
    public void Add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public String getCustomerNames() {
        return customers.stream().map(customer -> customer.getName()).collect(Collectors.joining(","));
    }

}
