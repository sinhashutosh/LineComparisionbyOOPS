package org.example;

public class LineComparisionMain {
    public static void main(String[] args) {
        double length_0f_line1;
        double length_0f_line2;
        LengthCalculator length1 = new LengthCalculator();
        System.out.println("Enter the Co-ordinate of first line ");
        length_0f_line1 = length1.calculate();
        System.out.println("**************************************************");
        System.out.println("Enter the Co-ordinate of second line");
        LengthCalculator length2 = new LengthCalculator();
        length_0f_line2 = length2.calculate();
        System.out.println("**************************************************");
        System.out.println("Method invoked to compare line");
        Compare isEqual = new Compare();
        isEqual.comparision(length_0f_line1, length_0f_line2);
    }
}
