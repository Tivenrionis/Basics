package com.tiven.questy.OOPEncapsulation;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void looseHealt(int damage) {
        this.health -= damage;

        if (this.health <= 0) {
            System.out.println("Player knocked out");
        }

    }

    public int healthRemaining() {
        return this.health;

    }

}
