package com.AE;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Angel on 1/1/17.
 */
public class League<T extends Team> {
    public String name;

    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeams(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already on this player.");
            return false;
        } else {
            teams.add(team);
            return true;
        }

    }

    public  int numTeams(){
        return teams.size();
    }

    public void showLeagueStandings(){
        Collections.sort(teams);
        for(T t : teams){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }





}