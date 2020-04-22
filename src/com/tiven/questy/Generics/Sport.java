package com.tiven.questy.Generics;

/**
 * @author Michał Wesołowski
 * @version 1.0
 * Date: 22.04.2020
 * Time: 11:32
 * Class name: Sport
 * Description:
 */
public abstract class Sport {
    String name;

    public Sport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
