package com.careerdevs;



//https://edabit.com/challenge/5LnycSd2xT4uwZCpi
public class Program {
    public static int countWords(String s) {
        String[] split = s.split(" ");
        System.out.println(split.length);
        return split.length;
    }
}
