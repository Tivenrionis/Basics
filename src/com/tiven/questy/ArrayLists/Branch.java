package com.tiven.questy.ArrayLists;

import java.util.ArrayList;

// Assuming that name is unique
public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }


    public boolean addCustomer(Customer customer) {
        if (exist(customer)) {
            return false;
        }
        this.customers.add(customer);
        // customer.getTransactions().add(Double.valueOf(0.0));
        customer.getTransactions().add(50.0);
        return true;
    }

    public boolean addTransaction(Customer customer, Double amount) {
        if (exist(customer)) {
            customer.getTransactions().add(amount);
            return true;
            //  customer.getTransactions().add(Double.valueOf(amount));
        }
        return false;

    }

    public Customer getCustomer(String name) {
        for (Customer c : customers) {
            if (c.getName().equals(name)) return c;
        }
        return null;

    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean exist(Customer customer) {
        for (Customer c : customers) {
            if (c.getName().equals(customer.getName())) return true;
        }
        return false;

    }

}
