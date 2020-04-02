package com.tiven.questy.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Saveable {
    private String name;
    private double HP;
    private double DMG;

    public Monster(String name, double HP, double DMG) {
        this.name = name;
        this.HP = HP;
        this.DMG = DMG;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getDMG() {
        return DMG;
    }

    public void setDMG(double DMG) {
        this.DMG = DMG;
    }

    @Override
    public String toString() {
        return String.format("[Monster] %s\n[HP] %s\n[DMG] %s\n", this.name, this.HP, this.DMG);
    }

    @Override
    public List<String> write() {
        List<String> info = new ArrayList<>();
        // info.add(this.toString());
        info.add(0, this.name);
        info.add(1, String.valueOf(this.HP));
        info.add(2, String.valueOf(this.DMG));
        return info;
    }

    @Override
    public void read(List<String> values) {
        if (!values.isEmpty()) {
            this.name = values.get(0);
            this.HP = Double.parseDouble(values.get(1));
            this.DMG = Double.parseDouble(values.get(2));
        } else System.out.println("List is empty");
    }

}


