package com.tiven.questy.OOPPolymorphism;

public class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet Earth.";
    }
}
