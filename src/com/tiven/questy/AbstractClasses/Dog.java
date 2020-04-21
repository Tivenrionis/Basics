package com.tiven.questy.AbstractClasses;

/**
 * @author Michał Wesołowski
 * @version 1.0
 * Date: 21.04.2020
 * Time: 22:25
 * Class name: Dog
 * Description:
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breath() {
        System.out.println("Breathe in, breath out, repeat.");

    }

}
