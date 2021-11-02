package com.careerdevs;

import java.util.Arrays;

public class Challenge {
    public static int differenceMaxMin(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }

    public static boolean doubleLetters(String word) {
        String[] split = word.split("");
        int count = 0;
        for (int i = 0; i < split.length; i++) {
            for (int j = i + 1; j < split.length;j++) {
                if (split[i].equals(split[j])) {
                    count++;

                } else {
                    break;
                }
            }
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }
}

