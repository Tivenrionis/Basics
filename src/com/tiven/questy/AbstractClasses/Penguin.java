package com.tiven.questy.AbstractClasses;

/**
 * @author Michał Wesołowski
 * @version 1.0
 * Date: 21.04.2020
 * Time: 22:35
 * Class name: Penguin
 * Description:
 */
public class Penguin extends Bird {
    @Override
    public void fly() {
        super.fly();
        System.out.println(getClass().getSimpleName() +" "+ getName()+ " is walking. I Cant fly.");
    }

    public Penguin(String name) {
        super(name);
    }
}
