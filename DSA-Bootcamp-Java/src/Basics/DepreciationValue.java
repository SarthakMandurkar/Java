package Basics;

import java.util.Scanner;

public class DepreciationValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the cost of asset : ");
        double cost = in.nextDouble();

        System.out.print("Enter the depreciation rate (% per year) : ");
        double rate = in.nextDouble();

        System.out.print("Enter the number of years : ");
        int years = in.nextInt();

        double value = cost * (Math.pow(1 - (rate / 100), years));
        System.out.println("Value after " + years + " years = " + value);

        in.close();
    }
}
