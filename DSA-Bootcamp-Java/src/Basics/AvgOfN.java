package Basics;

import java.util.Scanner;

public class AvgOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter how many numbers you want : ");
        int n = in.nextInt();

        int sum = 0;
        System.out.println("Enter the numbers : ");

        for(int i = 1; i <= n; i++){
            int num = in.nextInt();
            sum = sum + num;
        }

        double avg = (double) sum / n;
        System.out.println("Average of " + n + " numbers is : " + avg);

        in.close();
    }
}


/*  if doing without taking n as input (we can also do it like this)

    int sum = 0, count = 0;
    System.out.println("Enter numbers (enter 0 to stop):");

    while (true) {
    int num = in.nextInt();

     if (num == 0) { // stop when 0 is entered
        break;
     }

     sum += num;
     count++;
   }

    if (count > 0) {
    double average = (double) sum / count;
            System.out.println("Average of " + count + " numbers is: " + average);
        } else {
            System.out.println("No numbers entered.");
        }
*/