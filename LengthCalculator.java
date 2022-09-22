package org.example;

import java.util.Scanner;

public class LengthCalculator {
    int x1;
    int x2;
    int y1;
    int y2;
    Scanner sc = new Scanner(System.in);
    double calculate() {
        System.out.println("Enter the x-coordinate of first point  ");
        x1 = sc.nextInt();
        System.out.println("Enter the y-coordinate of first point  ");
        y1 = sc.nextInt();
        System.out.println("Enter the x-coordinate of second point  ");
        x2 = sc.nextInt();
        System.out.println("Enter the y-coordinate of second point  ");
        y2 = sc.nextInt();
        System.out.println("Enter first Co-ordinate are (" + x1 + "," + y1 + ")");
        System.out.println("Enter Second Co-ordinate are (" + x2 + "," + y2 + ")");
        double length_of_line;
        double x = (x2 - x1);
        System.out.println(x);
        double y = (y2 - y1);
        System.out.println(y);
        x = x * x;
        y = y * y;
        double temp = x + y;
        length_of_line = Math.sqrt(temp);
        System.out.println("Length of line = "+length_of_line);
        return length_of_line;
    }
}
