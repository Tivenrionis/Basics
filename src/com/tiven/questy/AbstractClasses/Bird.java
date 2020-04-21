package com.tiven.questy.AbstractClasses;

/**
 * @author Michał Wesołowski
 * @version 1.0
 * Date: 21.04.2020
 * Time: 22:28
 * Class name: Bird
 * Description:
 */
public abstract class Bird extends Animal implements Flying {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breath() {
        System.out.println("Bird: Breathe in, breath out, repeat.");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flapping wings.");
    }
}
