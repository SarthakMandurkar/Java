package Basics;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the selling price : ");
        double sellingPrice = in.nextDouble();

        System.out.print("Enter the Commission amount : ");
        double commissionAmount = in.nextDouble();

        double commissionPercentage = (commissionAmount / sellingPrice) * 100;
        System.out.println("Commission Percentage = " + commissionPercentage + "%");

        in.close();
    }
}
