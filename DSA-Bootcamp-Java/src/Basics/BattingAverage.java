package Basics;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the total number of runs scored by the player : ");
        int runs = in.nextInt();

        System.out.print("Enter the total number of dismissals : ");
        int dismissal = in.nextInt();

        double battingAverage = (double) runs / dismissal;
        System.out.println("Batting average = " + battingAverage);

        in.close();
    }
}
