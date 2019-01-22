package com.marsh.section5;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        while (count < 11) {
            System.out.println("Enter " + count + "# number");
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt) {
                System.out.println("Invalid Number");
                break;
            }
            int number = scanner.nextInt();
            scanner.nextLine();
            sum += number;
            count++;
        }

        System.out.println(sum);
        scanner.close();


    }

}
