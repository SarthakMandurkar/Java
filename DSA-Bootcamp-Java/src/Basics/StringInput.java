package Basics;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        String name = in.nextLine();

        System.out.println("Hello " + name + " !");
    }
}
