package Basics;

import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of subjects : ");
        int subjects = in.nextInt();

        double sum = 0;
        for(int i = 1; i <= subjects; i++){
            System.out.print("Enter the grade point " + i + ": ");
            double gp = in.nextDouble();
            sum = sum + gp;
        }

        double cgpa = sum / subjects;
        System.out.printf("CGPA = %.2f\n ", cgpa);

        in.close();
    }
}
