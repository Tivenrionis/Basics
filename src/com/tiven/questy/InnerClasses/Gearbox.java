package com.tiven.questy.InnerClasses;

import java.util.ArrayList;
//OUTER CLASS
public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0; // gearNumber
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for (int i = 0; i < maxGears; i++) {
            addGear(i, i * 5.3);
        }
    }

    //INNER CLASS - class within a class  ... example ... Gear is related/ part of a GearBox that's why u want to put Gear as inner class for Gearbox
    //watch out for naming variables

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    private void addGear(int number, double ratio) {
        if (number > 0 && number <= maxGears) {
            this.gears.add(new Gear(number, ratio));
        }

    }

    public void changeGear(int newGear) {
        if (newGear >= 0 && newGear < this.gears.size() && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream!!");
            return 0.0;
        }
        return revs * (this.gears.get(currentGear).getRatio());
    }


    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {

            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public int getGearNumber() {
            return gearNumber;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }

}