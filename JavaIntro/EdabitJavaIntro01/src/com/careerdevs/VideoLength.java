package com.careerdevs;

public class VideoLength {
    public static int minutesToSeconds(String tm) {
        String[] a = tm.split(":");
        int m = Integer.parseInt(a[0]);
        int s = Integer.parseInt(a[1]);
        int seconds = 0;
        if(s >= 60){
            return -1;
        }else{
            seconds += (m * 60) + s;
            return seconds;
        }

    }
}
