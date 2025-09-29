package Basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int sum = 0;

        System.out.println("Enter Number : ");
        while (true){
            num = in.nextInt();
            if(num == 0){
                break;
            }
            sum = sum + num;
        }
        System.out.println("Sum = " + sum);
    }
}
