package com.careerdevs;

import java.util.Locale;

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        // Your code here
        str = str.toLowerCase();
        for(int i=0; i<=str.length()-1;i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
