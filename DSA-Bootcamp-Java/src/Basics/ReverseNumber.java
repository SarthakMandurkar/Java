package Basics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to reverse : ");
        int number = Integer.parseInt(scanner.nextLine());

        if (number < 10) {
            System.out.println("Invalid Input!");
        } else {
            int reversed = 0;
            int n = number;

            while (n > 0) {
                int digit = n % 10; // here we separate the last digit
                reversed = reversed * 10 + digit; // here we multiply and add the digit ex if you want to add 2 next to 4 so you would do 4 * 10 + 2=42;
                n = n / 10; // here you remove the last digit
            }

            System.out.println("Reversed Number = " + reversed);
        }
        scanner.close();
    }
}

