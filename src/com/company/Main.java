package com.company;

public class Main {

    public static void main(String[] args) {
        double areaOfCircle = calculateArea(3.14);
        double areaOfRectangle = calculateArea(12.12, 15.40);
        System.out.println(areaOfCircle);
        System.out.println(areaOfRectangle);
    }

    public static double calculateArea(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            return radius * radius * Math.PI;
        }
    }

    public static double calculateArea(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        } else {
            return x * y;
        }
    }
}
