package com.tiven.questy.AbstractClasses;

/**
 * @author Michał Wesołowski
 * @version 1.0
 * Date: 21.04.2020
 * Time: 22:31
 * Class name: Parrot
 * Description:
 */
public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " " + getClass().getSimpleName() + " Flitting from branch to branch");
    }
}
