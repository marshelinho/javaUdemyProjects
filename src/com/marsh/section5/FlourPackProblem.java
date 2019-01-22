package com.marsh.section5;

public class FlourPackProblem {

    public static void main(String[] args) {

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        if (goal <= (5 * bigCount) + smallCount)
            goal %= 5;
        if (goal <= smallCount)
            return true;
        return false;

    }

    public static int getLargestPrime(int number) {
        if (number < 2)
            return -1;

        int i;

        for (i = 2; i <= 200; i++) {
            int count = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                while ((number % i) == 0) {
                    number /= i;
                }
            }
            if (number == 1) {
                break;
            }
        }
        return i;
    }

    public static void printSquareStar(int number) {
        if (number < 5){
            System.out.println("Invalid Value");
        }

    }
}

