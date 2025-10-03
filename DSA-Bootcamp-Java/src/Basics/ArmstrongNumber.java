package Basics;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = in.nextInt();

        int original = num;
        double sum = 0;

        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit,digits);
            num/= 10;
        }

        if(sum == original) {
            System.out.print(original + " is an armstrong number.");
        }else {
            System.out.print(original + " is not an armstrong number.");
        }
        in.close();
    }
}
