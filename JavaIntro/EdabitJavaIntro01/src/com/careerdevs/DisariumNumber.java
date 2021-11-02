package com.careerdevs;

import java.util.Arrays;

public class DisariumNumber {
    public static boolean isDisarium(int n) {
        String[] num = String.valueOf(n).split("");
        System.out.println(Arrays.toString(num));
        int total = 0;
        for(int i = 0; i < num.length;i++){
            total += Math.pow(Integer.valueOf(num[i]),i + 1);
            System.out.println(total);
        }
        if(total == n){
            return true;
        }else {
            return false;
        }
    }
}
