package com.foxin.strategy_pattern;

import java.util.Random;

public class RPSGame {

    private String[] RPSValues = {"Rock", "Paper", "Scissors"};

    public String RPSGetValue(){
        Random rn = new Random();
        return RPSValues[rn.nextInt(3)];
    }

    public boolean assignWin(String s1, String s2) {
        return ((s1.equals("Rock") && s2.equals("Scissors")) || (s1.equals("Scissors") && s2.equals("Paper")) || (s1.equals("Paper") && s2.equals("Rock")));
    }

}
