package com.tiven.questy.OOPMasterChallange;

public class Hamburger extends Burger {

    public Hamburger(String rollType, double price) {
        super("Hamburger", "Ham", rollType, price);
    }

    @Override
    public void setAdditions(Addition[] additions) {
        if (additions.length > 4) System.out.println("Cant add that many. Only 4 allowed.");
        else super.setAdditions(additions);
    }






}
