package com.AE;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootballPlayer joe = new FootballPlayer("Joe");
        BasketballPlayer pat = new BasketballPlayer("Pat");
        FootballPlayer beckham = new FootballPlayer("Beckham");
        FootballPlayer yo = new FootballPlayer("yo");
        FootballPlayer hello = new FootballPlayer("hello");




       Team<BasketballPlayer> heat = new Team("Miami Heat");
        Team<BasketballPlayer> spurs = new Team("San Antonio Spurs");
        Team<BasketballPlayer> knicks = new Team("New York Knicks");

        Team<FootballPlayer> giants = new Team<>("New York Giants");
        Team<FootballPlayer> dolphins = new Team<>("Miami Dolphins");
        Team<FootballPlayer> cowboys = new Team<>("Dallas Cowboys");






        System.out.println(giants.getName() + " : " + giants.ranking());
        System.out.println(cowboys.getName() + " : " + cowboys.ranking());
        System.out.println(dolphins.getName() + " : " + dolphins.ranking());

        League<Team<BasketballPlayer>> nba = new League<>("NBA");
        League<Team<FootballPlayer>> nfl = new League<>("NFL");

        nba.addTeams(heat);
        nba.addTeams(spurs);
        nba.addTeams(knicks);

        nfl.addTeams(giants);
        nfl.addTeams(cowboys);
        nfl.addTeams(dolphins);

        System.out.println("NBA: " + nba.numTeams());
        System.out.println("NFL: " + nfl.numTeams());


        System.out.println(heat.getName() + " : " + heat.ranking());
        System.out.println(spurs.getName() + " : " + spurs.ranking());

        cowboys.matchResult(giants, 10, 3);
        giants.matchResult(cowboys, 10, 0);
        System.out.println(giants.getName() + " : " + giants.ranking());
        System.out.println(cowboys.getName() + " : " + cowboys.ranking());


        nba.showLeagueStandings();
        nfl.showLeagueStandings();


    }
}
