package Basics;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        double num = in.nextDouble();
        System.out.print("Enter the exponent : ");
        double exponent = in.nextDouble();

        double pow = Math.pow(num,exponent);
        System.out.println(num + " raised to the power " + exponent + " = " + pow);

        in.close();
    }
}
