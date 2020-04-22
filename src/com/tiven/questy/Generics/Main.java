package com.tiven.questy.Generics;

import java.util.ArrayList;

/**
 * @author Michał Wesołowski
 * @version 1.0
 * Date: 22.04.2020
 * Time: 10:19
 * Class name: Main
 * Description:
 */
public class Main {
    public static void main(String[] args) {
//
//        ArrayList<Integer> items = new ArrayList<>();
//        items.add(1);
//        items.add(5);
//        items.add(4);                   //RAW TYPE ARRAY LIST ... RAW DATA ... YOU DONT KNOW WHAT IT IS
//        // items.add("Tiven");
//        items.add(2);
//        items.add(3);
//
//        printDoubled(items);
//
//

        FootballPLayer joe = new FootballPLayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPLayer> adelaideCrows = new Team<>("Adelaide Crows");

        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");
        baseballPlayerTeam.addPlayer(pat);

        Team<SoccerPlayer> broken = new Team<>("this wont work");
        broken.addPlayer(beckham);

        Team<FootballPLayer> melbourne = new Team<>("Melbourne");
        FootballPLayer banks = new FootballPLayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPLayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPLayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
       // adelaideCrows.matchResult(melbourne, 1, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(adelaideCrows));
        System.out.println(fremantle.compareTo(melbourne));

    }

    private static void printDoubled(ArrayList<Integer> n) {
        if (n != null) {
            for (Integer o : n) {
                System.out.println((Integer) o * 2);
            }
        }
    }
}
