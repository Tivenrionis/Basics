package com.tiven.questy.Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterfaceChallange {
    public static void saveObject(Saveable object) {
        for (int i = 0; i < object.write().size(); i++) {
            System.out.println("Saving " + object.write().get(i) + " to storage device.");
        }
        System.out.println();

    }

    public static void loeadObject(Saveable object) {
        List<String> values = readValues();
        object.read(values);
        System.out.println();
    }

    public static void main(String[] args) {

        Player player = new Player("Tivenrionis", "Mage", 76, 2304.55);
        System.out.println(player);
        saveObject(player);

        player.setLvl(89);
        System.out.println(player);
        player.setHp(10532);
        saveObject(player);
        loeadObject(player);
        System.out.println(player);

        Saveable monster = new Monster("Behemoth", 10000, 245.56);
        System.out.println(monster);
        saveObject(monster);

        ((Monster) monster).setHP(5000);
        saveObject(monster);
        ((Monster) monster).setDMG(340);
        saveObject(monster);
        loeadObject(monster);
        System.out.println(monster);


    }

    public static List<String> readValues() {
        List<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
