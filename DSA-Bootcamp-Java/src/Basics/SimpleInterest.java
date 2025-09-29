package Basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principle amount : ");
        double principle = in.nextInt();
        System.out.print("Enter the rate of interest : ");
        double rate = in.nextInt();
        System.out.print("Enter the time (duration) : ");
        double time = in.nextInt();

        double simpleInterest = (double) (principle * rate * time) / 100;

        System.out.println("Simple interest = " + simpleInterest);
    }
}
