package Basics;

import java.util.Scanner;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to count digits : ");
        int num = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int n = num;

        if (num < 0) {
            num = -num;
        }

        if (num == 0) {
            count = 1;
        } else {
            while (num > 0) {
                num = num/ 10;
                count++;
            }
        }

        System.out.println("Number of digits in " + n + " is : " + count);
        scanner.close();
    }
}
