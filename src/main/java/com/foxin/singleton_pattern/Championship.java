package com.foxin.singleton_pattern;

import java.util.Random;

public class Championship {

    private Team champion = null;

    private Championship(){}

    private static Championship object = null;
    public static Championship getChampionship(){
        if (object == null){
            object = new Championship();
        }
            return object;
    }

    private Team match(Team team1, Team team2){
        Random random = new Random();
        if (random.nextBoolean()){
            System.out.println("Team " + team1.name + " won\n");
            return team1;
        }
        else{
            System.out.println("Team " + team2.name + " won\n");
            return team2;
        }
    }

    public void playOff(Team t1, Team t2, Team t3, Team t4){
        if (this.champion != null){
            return;
        }
        Team semi1 = match(t1,t4);
        Team semi2 = match(t2,t3);

        Team finals = match(semi1,semi2);
        this.champion = finals;
        System.out.println("Winner is " + finals.name);
    }

}
