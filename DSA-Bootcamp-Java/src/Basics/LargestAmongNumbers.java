package Basics;

import java.util.Scanner;

public class LargestAmongNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int max = Integer.MIN_VALUE;

        System.out.println("Enter Numbers ( Exit Press 0 ) : ");

        while(true){
            num = in.nextInt();
            if(num == 0){
                break;
            } else if (num > max) {
                max = num;
            }
        }

        if (max == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Largest number = " + max);
        }

        in.close();
    }
}
