package Basics;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of units consumed : ");
        int units = in.nextInt();
        float rate = 7.87F;

        double bill = units * rate;

        System.out.printf("Electricity Bill : %.2f%n",bill);
        in.close();
    }
}
