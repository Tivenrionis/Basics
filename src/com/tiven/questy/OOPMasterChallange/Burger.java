package com.tiven.questy.OOPMasterChallange;

public class Burger {

    private String name;
    private String meat;
    private String rollType;
    private double price;
    private Addition[] additions;

    public Burger(String name, String meat, String rollType, double price) {
        this.name = name;
        this.meat = meat;
        this.rollType = rollType;
        this.price = price;
    }

    public void getAllAdditionsAndPrices() {
        if (additions != null) {
            double basePrice = this.getPrice();
            for (Addition i : additions) {
                basePrice -= i.getPrice();
            }
            System.out.println("Base price at " + basePrice);

            for (Addition i : additions) {
                System.out.println("Added " + i.getName() + " extra, for a price of " + i.getPrice());
            }
        } else System.out.println("No additions for that burger. Base price at "+ this.getPrice());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getRollType() {
        return rollType;
    }

    public void setRollType(String rollType) {
        this.rollType = rollType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Addition[] getAdditions() {
        return additions;
    }

    public void setAdditions(Addition[] additions) {
        this.additions = additions;
        for (Addition addition : additions) {
            this.price = this.price + addition.getPrice();
        }
    }
}
