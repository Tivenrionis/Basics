package com.tiven.questy.OOP;

public class VIPClass {
    private String name;
    private double creditLimit;
    private String email;

    public VIPClass() {
        this("Default Name", 200.0, "Default Email");
    }

    public VIPClass(String name, double creditLimit) {
        this(name, creditLimit, "Defafault Email");
    }

    public VIPClass(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
