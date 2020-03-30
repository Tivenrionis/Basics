package com.tiven.questy.ArrayLists;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<>();
    }

    public void showBranchDetails(Branch branch) {
        if (branchExist(branch)) {
            System.out.println("Branch: " + branch.getName());
            for (Customer customer : branch.getCustomers()) {
                System.out.println("\t Customer: " + customer.getName() + " has " + customer.getTransactions().size() + " transactions");
                for (Double d : customer.getTransactions()) {
                    //System.out.println("\t\t Transaction: "+ d.doubleValue() ); //unboxing
                    System.out.println("\t\t Transaction: " + d); //unboxing
                }
            }

        }
    }

    public boolean addBranch(Branch branch) {
        if (branchExist(branch)) {
            return false;
        }
        this.branches.add(branch);
        return true;
    }

    public boolean addCustomerToBranch(Customer customer, Branch branch) {
        if (branchExist(branch)) {
            branch.addCustomer(customer);
            return true;
        }
        return false;


    }

    public boolean addTransactionToCustomer(Customer customer, Branch branch, Double amount) {
        if (branchExist(branch)) {
            branch.addTransaction(customer, amount);
            return true;
        }
        return false;

    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public Branch getBranch(String name) {
        for (Branch b : branches) {
            if (b.getName().equals(name)) return b;
        }
        return null;

    }

    public boolean branchExist(Branch branch) {
        for (Branch b : branches) {
            if (b.getName().equals(branch.getName())) return true;
        }
        return false;
    }

    public boolean branchExist(String branchName) {
        for (Branch b : branches) {
            if (b.getName().equals(branchName)) return true;
        }
        return false;
    }


}
