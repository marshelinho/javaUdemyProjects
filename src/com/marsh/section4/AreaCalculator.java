package com.marsh.section4;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class AreaCalculator {
    public static void main(String[] args) {

    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return (PI * sqrt(radius));
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        return (x * y);
    }
}
