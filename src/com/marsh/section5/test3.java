package com.marsh.section5;

import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;

        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
            } else {
                break;
            }

            scanner.nextLine();
        }

        scanner.close();

    }

}
