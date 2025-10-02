package Basics;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the original price of the product : ");
        double price = in.nextDouble();

        System.out.println("Enter discount rate in % : ");
        double discount = in.nextDouble();

        double discountPrice = (price * discount) / 100;
        double finalPrice = price - discountPrice;

        System.out.println("Discount amount = " + discountPrice);
        System.out.println("Final price after discount : " + finalPrice);

        in.close();
    }
}
