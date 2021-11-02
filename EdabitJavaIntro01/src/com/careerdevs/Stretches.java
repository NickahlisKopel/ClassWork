package com.careerdevs;
import java.util.Arrays;
public class Stretches {
    public static int largestGap(int[] numbers) {
        Arrays.sort(numbers);
        int largest = 0;
        int gap = 0;
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                gap = numbers[j] - numbers[i];
                if (gap > largest){
                    largest = gap;
                    break;
                }else{
                    break;
                }
            }
        }
        return largest;
    }
}
