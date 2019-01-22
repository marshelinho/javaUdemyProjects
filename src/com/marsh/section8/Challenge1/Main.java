package com.marsh.section8.Challenge1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = readIntegers();
        printIntegers(myArray);
        findMin(myArray);

    }

    public static int[] readIntegers(){
        System.out.println("How many integers in an array would you like?");
        int count = scanner.nextInt();
        System.out.println("Enter " + count + " integer values.");
        int[] values = new int[count];

        for (int i=0; i<values.length;i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printIntegers(int[] array){

        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void findMin(int[] array){
        Arrays.sort(array);
        System.out.println("Minimum value is " + array[0]);
    }

    public static void reversed( int[] array){

    }
}
