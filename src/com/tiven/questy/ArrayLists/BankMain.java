package com.tiven.questy.ArrayLists;

import java.util.Scanner;

public class BankMain {
    // Warto byloby dodac addtransaction do customera. Program działa poprawnie.
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        while (!quit) {
            System.out.println("Enter your choice: ");
            printInstructions();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 0:
                    printInstructions();
                    break;
                case 1:
                    createBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    beginTransation();
                    break;
                case 4:
                    showDetails();
                    break;
                case 5:
                    quit = true;
                    break;


            }


        }
    }

    private static void showDetails() {
        System.out.println("Enter the branch name: ");
        String name = scanner.nextLine();
        if (bank.branchExist(name)) {
            bank.showBranchDetails(bank.getBranch(name));
        } else System.out.println("Cannot find that branch.");

    }

    private static void beginTransation() {
        System.out.println("Enter the branch name: ");
        String name = scanner.nextLine();
        if (bank.branchExist(name)) {
            System.out.println("Enter the customer name: ");
            String customerName = scanner.nextLine();
            System.out.println("Enter transaction amount: ");
            double amount = scanner.nextDouble();
            // scanner.next();
            if (bank.addTransactionToCustomer(bank.getBranch(name).getCustomer(customerName), bank.getBranch(name), amount)) {
                System.out.println("Successfully added: " + amount + " to customer " + customerName.toUpperCase() + " on branch " + name.toUpperCase());
            } else System.out.println("Error adding transaction amount to that customer");

        } else
            System.out.println("Error branch not found.");
    }

    private static void addCustomer() {
        System.out.println("Enter the branch name: ");
        String name = scanner.nextLine();
        if (bank.branchExist(name)) {
            System.out.println("Enter the customer name: ");
            String customerName = scanner.nextLine();
            if (bank.addCustomerToBranch(new Customer(customerName), bank.getBranch(name))) {
                System.out.println("Successfully added customer " + customerName.toUpperCase() + " to branch " + name.toUpperCase());
            } else System.out.println("Error adding customer to that branch");

        } else
            System.out.println("Error branch not found.");
    }

    private static void createBranch() {
        System.out.println("Enter the branch name: ");
        String name = scanner.nextLine();
        if (bank.branchExist(name)) {
            System.out.println("That branch already exist.");
        }
        if (bank.addBranch(new Branch(name))) System.out.println("Successfully added new branch");
        else System.out.println("Error adding new branch");
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To create a new branch");
        System.out.println("\t 2 - To add customer");
        System.out.println("\t 3 - To add a transaction");
        System.out.println("\t 4 - To show branch details.");
        System.out.println("\t 5 - To quit the application.");

    }
}

