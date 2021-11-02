package com.careerdevs;
import java.util.Arrays;
public class Program {
    public static boolean returnTrue() {
        return true;
    }
    public static String giveMeSomething(String a) {
        return "something" + " " + a;
    }
    public static int countWords(String s) {
        String[] count = s.split(" ");
        return count.length;
    }
    //this comes up twice.
    public static int[] sortNumsAscending(int[] nums) {
        if (nums.length != 0 && nums != null) {
            Arrays.sort(nums);
            return nums;
        }else{
            return new int[0];
        }
    }


}