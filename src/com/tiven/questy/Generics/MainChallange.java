package com.tiven.questy.Generics;

/**
 * @author Michał Wesołowski
 * @version 1.0
 * Date: 22.04.2020
 * Time: 11:25
 * Class name: MainChallange
 * Description:
 */
public class MainChallange {
    //ArrayList<Team> teams;
    //Collections.sort(teams); <---- calls compareTo method to sort
    public static void main(String[] args) {

        League<Team<FootballPLayer>> teamLeague = new League<>("AFW");

        Team<FootballPLayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPLayer> melbourne = new Team<>("Melbourne");
        Team<FootballPLayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPLayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");

        teamLeague.addTeam(adelaideCrows);
        teamLeague.addTeam(melbourne);
        teamLeague.addTeam(hawthorn);
        teamLeague.addTeam(fremantle);

        //  teamLeague.addTeam(baseballPlayerTeam);

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
        System.out.println("--------------");
        teamLeague.showLeagueTable();

    }


}
