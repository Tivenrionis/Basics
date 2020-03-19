package com.tiven.questy.OOPChallanges;

public class Printer {
    private int tonerLevel;
    private final int tonerCapacity = 500;
    private int numberOfPages;
    private boolean isDuplex;

    public Printer() {
        this(100, 0, false);
    }

    public Printer(int numberOfPages, boolean isDuplex) {
        this(100, numberOfPages, isDuplex);

    }

    public Printer(int tonerLevel, int numberOfPages, boolean isDuplex) {
        if (tonerLevel <= this.tonerCapacity)
            this.tonerLevel = tonerLevel;
        else this.tonerLevel = this.tonerCapacity;
        this.numberOfPages = numberOfPages;
        this.isDuplex = isDuplex;
    }

    public void fillUp(int amount) {
        if (this.tonerLevel + amount <= this.tonerCapacity) {
            this.tonerLevel += amount;
            System.out.println("You've filled up by " + amount + " Your toner level is " + this.tonerLevel);
        } else System.out.println("Cannot fill up that much. You have " + this.tonerLevel + " left.");

    }

    public void print(int howManyPages) {
        for (int i = 0; i < howManyPages; i++) {
            if (isDuplex && this.tonerLevel >= 20) {
                this.numberOfPages += 1;
                this.tonerLevel -= 20;
                System.out.println("Printing double page, your toner level is now " + this.tonerLevel);
            } else if (!isDuplex && this.tonerLevel >= 15) {
                this.numberOfPages += 1;
                this.tonerLevel -= 15;
                System.out.println("Printing single page, your toner level is now " + this.tonerLevel);

            } else {
                System.out.println("Could not print that many cause of fill level, you've printed " + this.numberOfPages + " pages out of "+howManyPages);
                break;
            }
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
