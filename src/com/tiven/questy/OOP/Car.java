package com.tiven.questy.OOP;

// Access modifier
// public , private, protected
// fields - class/member variables
// key rule - encapsulation

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;   // STATE components

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("comodore")) {
            this.model = model;

        }else
        {
            this.model="Unknown";
        }
        //this.model = model;
    }

    public String getModel() {
        return this.model;
    }
}
