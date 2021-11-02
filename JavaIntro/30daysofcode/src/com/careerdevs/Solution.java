package com.careerdevs;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void day3() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a Number: ");
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        String w = "Weird";
        String nw = "Not Weird";
        if ((N % 2) == 0) {
            if (N >= 2 && N <= 5) {
                System.out.println(nw);
            } else if (N >= 6 && N <= 20) {
                System.out.println(w);
            } else if (N > 20) {
                System.out.println(nw);
            }
        } else {
            System.out.println(w);
        }
    }

    public static void day0() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println("Input String: ");
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();

        scan.close();

        System.out.println("Hello, World.");
        System.out.println(inputString);

    }

    public static void day1() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        System.out.print("(hit enter after each one.)int,double,String: ");
        Scanner scan = new Scanner(System.in);

        int i2;
        double d2;
        String s2;

        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        scan.nextLine();
        s2 = scan.nextLine();

        System.out.println(i + i2);
        System.out.println(d + d2);
        System.out.println(s + s2);

        scan.close();
    }
            static class Person {
                private int age;

                public Person(int initialAge) {

                    if (initialAge > 0) {
                        age = initialAge;
                    } else {
                        System.out.println("Age is not valid, setting age to 0.");
                        age = 0;
                    }
                }

                public void amIOld() {
                    if (age < 13) {
                        System.out.println("You are young.");
                    } else if (age < 18) {
                        System.out.println("You are a teenager.");
                    } else {
                        System.out.println("You are old.");
                    }
                }

                public void yearPasses() {
                    age++;
                }
            }

            public static void day4() {
                System.out.println("(Press enter after each one.)Number of times to execute, ages: ");
                Scanner scan = new Scanner(System.in);
                int a = scan.nextInt();
                for (int i = 0; i < a; i++) {
                    int age = scan.nextInt();
                    Person p = new Person(age);
                    p.amIOld();
                    for (int j = 0; j < 3; j++) {
                        p.yearPasses();
                    }
                    p.amIOld();
                    System.out.println();
                }
                scan.close();
            }
    public static void day5() throws IOException {
        System.out.print("Enter a number: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
        }




