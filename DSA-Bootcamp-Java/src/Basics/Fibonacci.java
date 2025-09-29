package Basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many terms you want : ");
        int input = in.nextInt();

        int first = 0, second = 1;

        for (int i = 1; i <= input; i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
