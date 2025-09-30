package Basics;

import java.util.Scanner;

public class ProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int num = in.nextInt();
        int product = 1;
        int sum = 0;

        while (num != 0) {
            int rem = num % 10;
            product = product * rem;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Product = " + product);
        System.out.println("Sum = " + sum);
        System.out.print("Result = " + (product - sum));

        in.close();
    }
}
