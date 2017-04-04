package com.AE;

import java.util.ArrayList;

/**
 * Created by Angel on 1/1/17.
 */
public class Team<T extends Player>  implements Comparable<Team<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;


    private ArrayList<T> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;

    }

    public boolean addPlayers(T player){
        if(players.contains(player)) {
            System.out.println(player.getName() + " is already on this player.");
            return false;
        }else {
            players.add(player);
            System.out.println(player.getName() + " picked for player " + this.name );
            return true;
        }
    }

    public int numPlayers(){
        return this.players.size();
    }

    public String getName() {
        return name;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if (ourScore > theirScore){
            won++;
            message = " beat ";
        }else if (ourScore < theirScore){
            lost++;
            message = " lost to ";

        }else {
            tied++;
            message = " drew with ";
        }
        played++;

        if(opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, ourScore,theirScore);
        }
    }


    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }






}
