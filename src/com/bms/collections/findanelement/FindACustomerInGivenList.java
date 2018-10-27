package com.bms.collections.findanelement;

import java.util.Iterator;
import java.util.List;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class FindACustomerInGivenList {

    public Customer findUsingGivenIndex(int indexOfCustomer, List<Customer> customers) {
        if (indexOfCustomer >= 0 && indexOfCustomer < customers.size())
            return customers.get(indexOfCustomer);
        return null;
    }

    public int findUsingIndexOf(Customer customer, List<Customer> customers) {
        return customers.indexOf(customer);
    }

    public boolean findUsingContains(Customer customer, List<Customer> customers) {
        return customers.contains(customer);
    }

    public Customer findUsingIterator(String name, List<Customer> customers) {
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    public Customer findUsingEnhancedForLoop(String name, List<Customer> customers) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    public Customer findUsingStream(String name, List<Customer> customers) {
        return customers.stream()
            .filter(customer -> customer.getName().equals(name))
            .findFirst()
            .orElse(null);
    }

    public Customer findUsingParallelStream(String name, List<Customer> customers) {
        return customers.parallelStream()
            .filter(customer -> customer.getName().equals(name))
            .findAny()
            .orElse(null);
    }

}