package com.tiven.questy.LinkedList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // 4 bytes to store INT ...
        // 8 bytes for DOUBLE
        // what about STRINGS ???
        Customer customer = new Customer("Michal", 54.36);
        Customer another;
        another = customer;

        another.setBalance(12.50);
        System.out.println("Balance of customer " + customer.getName() + " is " + customer.getBalance());

        System.out.println(customer);

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(4);
        intList.add(3);
        intList.add(5);

        for (Integer i : intList) {
            System.out.println(intList.indexOf(i) + ": " + i);
        }

        intList.add(1, 2);
        System.out.println("---------------------------");

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.remove(1);
        System.out.println("---------------------------");
        for (Integer i : intList) {
            System.out.println(intList.indexOf(i) + ": " + i);
        }

    }
}
