package com.tiven.questy.Generics;

/**
 * @author Michał Wesołowski
 * @version 1.0
 * Date: 22.04.2020
 * Time: 10:35
 * Class name: Player
 * Description:
 */
public abstract class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
