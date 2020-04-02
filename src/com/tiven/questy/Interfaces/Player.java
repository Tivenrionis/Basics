package com.tiven.questy.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable {
    private String username;
    private String profession;
    private int lvl;
    private double hp;

    public Player(String username, String profession, int lvl, double hp) {
        this.username = username;
        this.profession = profession;
        this.lvl = lvl;
        this.hp = hp;
    }

    public String getUsername() {
        return username;
    }

    public String getProfession() {
        return profession;
    }

    public int getLvl() {
        return lvl;
    }

    public double getHp() {
        return hp;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return String.format("[Username] %s\n[Profession] %s\n[Level] %s\n[HP] %s\n", this.username, this.profession, this.lvl, this.hp);
    }

    @Override
    public List<String> write() {
        List<String> info = new ArrayList<>();
        // info.add(this.toString());
        info.add(0, this.username);
        info.add(1, this.profession);
        info.add(2, String.valueOf(this.lvl));
        info.add(3, String.valueOf(this.hp));
        return info;
    }

    @Override
    public void read(List<String> values) {
        if (!values.isEmpty()) {
            this.username = values.get(0);
            this.profession = values.get(1);
            this.lvl = Integer.parseInt(values.get(2));
            this.hp = Double.parseDouble(values.get(3));
        } else System.out.println("List is empty");
    }
}
