package Basics;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the height : ");
        int h = in.nextInt();
        System.out.print("Enter the base : ");
        int b = in.nextInt();

        double area = (0.5 * b * h);

        System.out.println("Area of triangle  : " + area);
    }
}
