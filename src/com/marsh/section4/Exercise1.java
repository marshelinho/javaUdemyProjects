package com.marsh.section4;

public class Exercise1 {

    public static void main(String[] args) {

        System.out.println(hasTeen(1,14,13));


    }

    public static boolean hasTeen(int first, int second, int third){
        if (19>=first && first>=13){
            return true;
        } else if (19>=second && second>=13){
            return true;
        } else if (19>=third && third>=13){
            return true;
        }

        return false;
    }


    public static boolean hasEqualSum(int first, int second, int third){
        if (first + second == third){
            return true;
        }
        return false;

    }


    public static boolean areEqualByThreeDecimalPlaces(double first, double second){
        first *=1000;
        second *=1000;

        double newFirst = first;
        double newSecond = second;

        if ((int)newFirst == (int)newSecond){
            return true;
        }
        return false;

    }



    public static String printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            return "Invalid Value";
        } else {
            return (kiloBytes + "KB = " + kiloBytes / 1000 + "MB and " + kiloBytes % 1000 + "KB");
        }
    }


    public static boolean wakeUp(boolean barking, int hourOfDay) {

        if (barking) {

            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            } else if (hourOfDay < 8 || hourOfDay > 22) {
                return true;
            }

        }
        return false;
    }


    public static boolean isLeapYear(int year) {
        if (year > 1 && year < 9999){
            if (year % 4 == 0 && year % 100 != 0){
                return true;
            } else if (year % 400 == 0){
                return true;
            } else{
                return false;
            }
        }
        return false;
    }


}
