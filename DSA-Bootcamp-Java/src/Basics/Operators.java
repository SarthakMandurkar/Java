package Basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("Enter two number : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.print("Enter an operator (+, -, *, /) :");
        String operator = in.next();

        if(operator.equals("+")){
            System.out.println("Result = " +(num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println("Result = " +(num1 - num2));
        } else if (operator.equals("*")) {
            System.out.println("Result = " +(num1 * num2));
        } else if (operator.equals("/")) {
            System.out.println("Result = " +(num1 / num2));
        }else {
            System.out.println("Enter valid operator.");
        }
    }
}
