package com.careerdevs;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Program.returnTrue());
        System.out.println(Challenge.convert(3));
        System.out.println(Program.giveMeSomething("something"));
        System.out.println(Challenge.lessThan100(10, 30));
        System.out.println(Program.countWords("This is four strings"));
        System.out.println(Challenge.checkEnding("The End", "End"));
        System.out.println(ReverseOrder.reverse("reverse"));
        System.out.println(Arrays.toString(Program.sortNumsAscending(new int[]{1, 2, 10, 50, 5})));
        System.out.println(Vowels.getCount("Everything is a dream."));
        System.out.println(Challenge.rev(5034));
        System.out.println(VideoLength.minutesToSeconds("4:50"));
        System.out.println(Challenge.differenceMaxMin(new int[]{10, 4, 1, 2, 8, 91}));
        System.out.println(Challenge.doubleLetters("letters"));
        System.out.println(Challenge.canCapture(new String[]{"A1", "B2"}));
        System.out.println(DisariumNumber.isDisarium(135));
        System.out.println(Stretches.largestGap(new int[] {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}));

    }
}
