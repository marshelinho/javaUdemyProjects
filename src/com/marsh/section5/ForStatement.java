package com.marsh.section5;

public class ForStatement {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;

        int count = 0;

        while (number <= finishNumber) {
            if (isEvenNumber(number)) {
                count++;
                if (count == 5) {
                    break;
                }
            }
            number++;


            System.out.println("Even number = " + number);
        }


    }


    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }
}


