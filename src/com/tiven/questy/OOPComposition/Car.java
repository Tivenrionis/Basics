package com.tiven.questy.OOPComposition;

public class Car extends Vehicle {
    private int doors;
    private int enginecapacity;

    public Car(String name, int doors, int enginecapacity) {
        super(name);
        this.doors = doors;
        this.enginecapacity = enginecapacity;
    }
}
