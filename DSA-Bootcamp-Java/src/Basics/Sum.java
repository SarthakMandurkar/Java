package Basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num1, num2;
        System.out.println("Enter the first number : ");
        num1 = in.nextDouble();
        System.out.println("Enter the second number : ");
        num2 = in.nextDouble();

        double sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}
