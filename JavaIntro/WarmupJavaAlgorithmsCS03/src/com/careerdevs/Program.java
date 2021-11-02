package com.careerdevs;

import java.util.Arrays;

public class Program {
    public static String nameShuffle(String s) {
        String[] swap = s.split(" ");
        String together = swap[swap.length-1] + " " + swap[0];
        return together;
    }
    public static int[] sortNumsAscending(int[] nums) {
        if (nums.length != 0 && nums != null) {
            Arrays.sort(nums);
            return nums;
        }else{
            return new int[0];
        }
    }
}
