package com.careerdevs;
//https://edabit.com/challenge/3S8XppR6Yf5mXPxij
//Rock beats scissors, paper beats rock, scissors beat paper.
public class Challenge {
    public static String rps(String s1, String s2) {
        if(s1.equals(s2)){
            return "TIE";
        }else if(s1.equals("rock") && s2.equals("scissors")){
            return "Player 1 wins";
        }else if(s1.equals("paper") && s2.equals("rock")){
            return "Player 1 wins";
        }else if(s1.equals("scissors") && s2.equals("paper")){
            return "Player 1 wins";
        }else if(s2.equals("rock") && s1.equals("scissors")){
            return "Player 2 wins";
        }else if(s2.equals("paper") && s1.equals("rock")){
            return "Player 2 wins";
        }else if(s2.equals("scissors") && s1.equals("paper")){
            return "Player 2 wins";
        }else{
            return "";
        }
    }
}
