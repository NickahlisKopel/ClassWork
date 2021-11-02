package com.careerdevs;

public class ReverseOrder {
    public static String reverse(final String str) {
        String output = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            output = output + str.charAt(i);
        }
        return output;
    }
}