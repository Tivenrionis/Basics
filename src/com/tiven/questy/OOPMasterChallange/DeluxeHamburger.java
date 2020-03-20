package com.tiven.questy.OOPMasterChallange;

public class DeluxeHamburger extends Burger {

    public DeluxeHamburger(String meat, String rollType, double price) {
        super("Deluxe Burger", meat, rollType, price);
        Addition[] withOrder = {new Addition("Cola", 0), new Addition("Chips", 0)};
        super.setAdditions(withOrder);
    }

    @Override
    public void setAdditions(Addition[] additions) {
        System.out.println("No additions allowed");
    }
}
