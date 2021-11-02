package com.careerdevs;
import java.util.Arrays;

public class Challenge {
    public static int convert(int minutes) {
        return minutes * 60;
    }

    public static boolean lessThan100(int a, int b) {
        return (a + b) < 100;
    }

    public static boolean checkEnding(String str1, String str2) {
        return str1.endsWith(str2);
    }

    public static String rev(int n) {
        String s = String.valueOf(n);
        String[] a = s.split("");
        String t = "";
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = a[i].replaceAll("-", "");
            t += a[i];
        }
        return t;
    }

    public static int differenceMaxMin(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1] - arr[0];
    }

    public static boolean doubleLetters(String word){
        String[] split = word.split("");
        int count = 0;
        for(int i = 0; i < split.length-1;i++){
            for(int j = i+1; j < split.length;j++){
                //System.out.println(split[i] + " " +split[j]);
                if(split[i].equals(split[j])){
                    count++;
                }else{
                    break;
                }

            }
        }
        if (count > 0){
            return true;
        }else{
            return false;
        }
  }

    public static boolean canCapture(String[] rooks) {
        String[] white = rooks[0].split("");
        String[] black = rooks[1].split("");

        if(white[0].equals(black[0]) || white[1].equals(black[1])){
            return true;
        }else{
            return false;
        }


    }





}