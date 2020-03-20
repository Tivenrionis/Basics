package com.tiven.questy.OOPMasterChallange;

public class HealthyBurger extends Burger {

    public HealthyBurger( String meat, double price) {
        super("Healthy Burger", meat, "Brown rye bread roll", price);
    }

    @Override
    public void setAdditions(Addition[] additions) {
        if (additions.length > 6) System.out.println("Cant add that many. Only 4 allowed.");
        else super.setAdditions(additions);
    }
}
