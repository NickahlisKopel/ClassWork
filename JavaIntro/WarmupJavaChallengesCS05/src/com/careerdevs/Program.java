package com.careerdevs;

import java.util.*;

//https://edabit.com/challenge/rzpucPyoyEtXPo2BG
public class Program {
    public static int[] arrayOfMultiples(int num, int length) {
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = num * (i + 1);
        }
        return arr;
    }
}
