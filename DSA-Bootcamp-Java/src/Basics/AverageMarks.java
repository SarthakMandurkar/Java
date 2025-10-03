package Basics;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of subjects : ");
        int subjects = in.nextInt();

        int sum = 0;

        for(int i = 1; i <= subjects; i++){
            System.out.print("Enter the marks of subject " + i + ": ");
            int marks = in.nextInt();
            sum = sum + marks;
        }

        double avg = (double) sum / subjects;

        System.out.println("Total Marks = " + sum);
        System.out.println("Average Marks = " + avg);

        in.close();
    }
}
