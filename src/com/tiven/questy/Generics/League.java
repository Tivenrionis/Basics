package com.tiven.questy.Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Michał Wesołowski
 * @version 1.0
 * Date: 22.04.2020
 * Time: 11:27
 * Class name: League
 * Description:
 */
//K extends Team <--- no need to specify further types of Team --- > K refers to Team<K>
public class League<K extends Team> {
    private String name;
    private List<K> leagueTeams;

    public League(String name) {
        this.name = name;
        leagueTeams = new ArrayList<>();
    }

    public boolean addTeam(K team) {
        if (leagueTeams.contains(team)) {
            System.out.println("Already here " + team.getName());
            return false;
        } else {
            leagueTeams.add(team);
            return true;
        }
    }

    public void showLeagueTable() {
        Collections.sort(leagueTeams);
        for (K k : leagueTeams) {
            System.out.println(k.getName() + ": " + k.ranking());
        }
    }


}
