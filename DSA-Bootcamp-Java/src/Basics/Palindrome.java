package Basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int number = Integer.parseInt(scanner.nextLine());

        int original = number;
        int reversed = 0;

        if (number < 10) {
            System.out.println("Invalid");
        } else {
            while (number > 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number = number / 10;
            }

            if (original == reversed) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }
        }

        scanner.close();
    }
}
