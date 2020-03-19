package com.tiven.questy.OOP;

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(12345L, 2.50, "Deafault Name", "Default address", "default number");
        System.out.println("Empty constructor called.");
    }

    public BankAccount(long accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(9999L, 183.32, customerName, email, phoneNumber);

    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double value) {
        this.balance += value;

    }

    public void withdraw(double value) {
        if (this.balance - value < 0) System.out.println(" Cant withdraw that many. You have: " + this.balance);
        else {
            this.balance -= value;
            System.out.println("Withdraw amount: " + value);
            System.out.println("You've got " + this.balance + " funds left");

        }
    }
}
