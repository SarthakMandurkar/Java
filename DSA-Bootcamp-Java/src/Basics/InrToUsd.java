package Basics;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the amount in (INR) : ");
        double inr = in.nextDouble();

        double rate = 88.67;

        double usd = inr / rate;

        System.out.println("The amount in USD is : " + usd);

    }
}
