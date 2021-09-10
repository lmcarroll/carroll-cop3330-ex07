/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.Scanner;

public class AreaOfARectangularRoom {
    public static void main(String[] args) {
        double FeetToMeters = 0.09290304;

        System.out.println("What is the length of the room in feet?");
        Scanner input = new Scanner(System.in);
        String lengthString = input.nextLine();
        int length = Integer.parseInt(lengthString);

        System.out.println("What is the width of the room in feet?");
        input = new Scanner(System.in);
        String widthString = input.nextLine();
        int width = Integer.parseInt(widthString);

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");

        int AreaInFeet = length * width;
        double AreaInMeters = AreaInFeet * FeetToMeters;

        System.out.println("The area is");
        System.out.println(AreaInFeet + " square feet");
        System.out.printf("%.3f square meters", AreaInMeters);
    }
}
