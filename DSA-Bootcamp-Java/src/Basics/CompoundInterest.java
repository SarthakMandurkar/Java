package Basics;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter principle amount : ");
        double principleAmount = in.nextDouble();

        System.out.print("Enter the Interest rate (%) : ");
        double rate = in.nextDouble();

        System.out.print("Enter the number of years : ");
        int years = in.nextInt();

        double amount = principleAmount * (Math.pow(1 + (rate / 100), years));
        double compoundInterest = amount - principleAmount;

        System.out.printf("Total Amount : %.2f\n", amount);
        System.out.printf("Compound interest = %.2f\n", compoundInterest);

        in.close();
    }
}
