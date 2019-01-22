package com.marsh.section4;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {


        System.out.println(isCatPlaying(36, true));
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Number");
        }

        int years = (int) (minutes * 1.90259e-6);
        double remainder = (double) (minutes % 1.90259e-6);

        System.out.println(years);
        System.out.println(remainder);
    }

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if ((a == b) && (b == c)) {
            System.out.println("All numbers are equal");
        } else if ((a != b) && (b != c) && (a != c)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }

    public static boolean isCatPlaying(int temp, boolean summer) {
        if (summer) {
            if (temp >= 25 && temp <= 45) {
                return true;
            }
        }
        return (temp >= 25 && temp <= 35);
    }


}
